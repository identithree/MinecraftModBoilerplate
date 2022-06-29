package dev.quinnlane.mod.meta

import org.quiltmc.loader.api.ModContainer
import org.quiltmc.loader.api.ModLicense

var MOD_ID: String? = null
var MOD_NAME: String? = null
var MOD_VERSION: String? = null
var MOD_DESCRIPTION: String? = null
var MOD_LICENSE: Collection<ModLicense>? = null

/**
 * Fills in [MOD_ID], [MOD_NAME], [MOD_VERSION], [MOD_DESCRIPTION], and [MOD_LICENSE] from the given mod container.
 *
 * @param mod The mod container to get the info from.
 */
fun registerInformation(mod: ModContainer) {
    MOD_ID = mod.metadata().id()
    MOD_NAME = mod.metadata().name()
    MOD_VERSION = mod.metadata().version().raw()
    MOD_DESCRIPTION = mod.metadata().description()
    MOD_LICENSE = mod.metadata().licenses()
}

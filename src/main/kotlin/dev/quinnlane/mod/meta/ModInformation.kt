package dev.quinnlane.mod.meta

import org.quiltmc.loader.api.ModLicense

class ModInformation {
    companion object {
        var MOD_NAME: String? = null
        var MOD_VERSION: String? = null
        var MOD_DESCRIPTION: String? = null
        var MOD_LICENSE: Collection<ModLicense>? = null
    }
}

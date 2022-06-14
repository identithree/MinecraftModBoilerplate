package dev.quinnlane.mod

import dev.quinnlane.mod.meta.ModInformation
import org.quiltmc.loader.api.ModContainer
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class Main: ModInitializer {
    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod name as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.
    companion object {
        val l: Logger = LoggerFactory.getLogger("Minecraft Mod Boilerplate")
    }

    override fun onInitialize(mod: ModContainer) {
        ModInformation.MOD_NAME = mod.metadata().name()
        ModInformation.MOD_VERSION = mod.metadata().version().raw()
        ModInformation.MOD_DESCRIPTION = mod.metadata().description()
        ModInformation.MOD_LICENSE = mod.metadata().licenses()

        l.info("${ModInformation.MOD_NAME} (Version ${ModInformation.MOD_VERSION}) has been initialized!")
    }
}

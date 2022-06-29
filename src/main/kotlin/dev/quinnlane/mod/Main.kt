package dev.quinnlane.mod

import dev.quinnlane.mod.meta.registerInformation
import dev.quinnlane.mod.meta.MOD_NAME
import dev.quinnlane.mod.meta.MOD_VERSION

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
        registerInformation(mod)
        l.info("${MOD_NAME} (Version ${MOD_VERSION}) has been initialized!")
    }
}

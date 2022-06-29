package dev.quinnlane.mod.mixin.meta

import dev.quinnlane.mod.meta.MOD_ID
import dev.quinnlane.mod.meta.MOD_NAME
import dev.quinnlane.mod.meta.MOD_VERSION

import net.minecraft.client.gui.hud.DebugHud

import org.quiltmc.loader.api.QuiltLoader
import org.spongepowered.asm.mixin.Mixin
import org.spongepowered.asm.mixin.injection.At
import org.spongepowered.asm.mixin.injection.Inject
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable

@Mixin(DebugHud::class)
class DevDisclaimerMixin {
    @Inject(method = ["getRightText"], at = [At("RETURN")])
    private fun appendInfo(cir: CallbackInfoReturnable<MutableList<String>>) {
        if (QuiltLoader.isDevelopmentEnvironment()) {
            val messages = cir.returnValue
            messages.add("")
            messages.add("§a[Quilt Development Environment]")
            messages.add("Mod: $MOD_NAME ($MOD_ID)")
            messages.add("Version: $MOD_VERSION")
            messages.add("§cWhat you see here may not be")
            messages.add("§crepresentative of the final build!")
            messages.add("")
        }
    }
}

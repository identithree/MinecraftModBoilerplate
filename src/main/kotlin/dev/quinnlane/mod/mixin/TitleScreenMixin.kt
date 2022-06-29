package dev.quinnlane.mod.mixin

import dev.quinnlane.mod.Main.Companion.l
import net.minecraft.client.gui.screen.TitleScreen
import org.spongepowered.asm.mixin.Mixin
import org.spongepowered.asm.mixin.injection.At
import org.spongepowered.asm.mixin.injection.Inject
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo

@Mixin(TitleScreen::class)
class TitleScreenMixin {
    @Inject(method = ["init"], at = [At("TAIL")])
    fun onInit(ci: CallbackInfo) {
        l.info("This line was printed by the TitleScreenMixin")
    }
}

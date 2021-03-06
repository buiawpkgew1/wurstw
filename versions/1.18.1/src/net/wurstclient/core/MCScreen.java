package net.wurstclient.core;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

public class MCScreen extends Screen {

    protected MCScreen(Text title) {
        super(title);
    }

    @Override
    public void onClose() {
        super.onClose();
    }

    public void close() {
        onClose();
    }

    public static void MCSetScreen(MinecraftClient MC, Screen screen) {
        MC.setScreen(screen);
    }
}

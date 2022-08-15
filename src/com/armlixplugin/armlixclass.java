package com.armlixplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class armlixclass extends JavaPlugin {
    @Override
    public void onEnable() {
        System.out.println("ArmlixPlugin is Started!Check our site for updates!");
        System.out.println("Our Website: https://site.ru/updates/");
        System.out.println("For Old Releases: https://site.ru/Releases/");
    }

    @Override
    public void onDisable() {
        System.out.println("ArmlixPlugin is shutting down...");
    }
}

package com.quillraven.quillyscastle.desktop;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.quillraven.quillyscastle.QuillysCastleGame;

public class DesktopLauncher {
    public static void main(String[] arg) {
	LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

	config.useGL30 = false;
	config.width = 1024;
	config.height = 768;
	config.fullscreen = false;
	config.vSyncEnabled = config.fullscreen;

	Gdx.app = new LwjglApplication(new QuillysCastleGame(), config);

	Gdx.app.setLogLevel(Application.LOG_DEBUG);
	// Gdx.app.setLogLevel(Application.LOG_INFO);
	// Gdx.app.setLogLevel(Application.LOG_ERROR);
	// Gdx.app.setLogLevel(Application.LOG_NONE);
    }
}

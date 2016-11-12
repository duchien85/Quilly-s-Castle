package com.quillraven.quillyscastle.desktop;

import com.badlogic.gdx.tools.texturepacker.TexturePacker.Settings;

public class TexturePacker {
	public static void main(String[] arg) {
		Settings settings = new Settings();
		settings.combineSubdirectories = true;
		settings.maxWidth = settings.maxHeight = 2048;

//		com.badlogic.gdx.tools.texturepacker.TexturePacker.process(settings, "tmp/ui/skins", "packed/ui/skins/", "uiskin");
//		com.badlogic.gdx.tools.texturepacker.TexturePacker.process(settings, "tmp/ui/icons", "../core/assets/skins/icons", "icons");
//		com.badlogic.gdx.tools.texturepacker.TexturePacker.process(settings, "tmp/characters", "packed/characters", "characters");
		com.badlogic.gdx.tools.texturepacker.TexturePacker.process(settings, "tmp/items", "packed/items", "items");
	}
}

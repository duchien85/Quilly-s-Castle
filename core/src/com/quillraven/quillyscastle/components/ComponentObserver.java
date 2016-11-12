package com.quillraven.quillyscastle.components;

public interface ComponentObserver {
	public static enum ComponentEvent {
		LOAD_CONVERSATION,
		SHOW_CONVERSATION,
		HIDE_CONVERSATION,
		LOAD_INVENTORY,
		INVENTORY_SLOT_UPDATED,
		GOLD_UPDATED,
		LOAD_STORE,
		NOT_ENOUGH_GOLD,
		NOT_ENOUGH_INVENTORY_SPACE
	}

	void onComponentEvent(ComponentEvent event, final Object... args);
}

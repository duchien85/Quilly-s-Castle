package com.quillraven.quillyscastle.conversation;

public interface ConversationGraphObserver {
    public static enum ConversationCommandEvent {
	LOAD_STORE_INVENTORY,
	EXIT_CONVERSATION
    }

    void onConversationEvent(ConversationCommandEvent event, final ConversationGraph graph);
}

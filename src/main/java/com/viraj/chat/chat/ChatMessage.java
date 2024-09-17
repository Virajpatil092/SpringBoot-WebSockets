package com.viraj.chat.chat;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ChatMessage {
    private String content;
    private String sender;
    private MessageType type;
}

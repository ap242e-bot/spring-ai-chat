package com.example.springaichat.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AiConfig {

    @Bean
    public ChatClient chatClient(ChatClient.Builder builder) {
        return builder
                .defaultSystem("You are a helpful AI assistant. Always respond in Thai when asked in Thai, and in English when asked in English. Be concise and helpful.")
                .build();
    }

}

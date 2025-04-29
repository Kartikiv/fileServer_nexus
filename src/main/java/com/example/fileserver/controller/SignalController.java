package com.example.fileserver.controller;
import com.example.fileserver.DTO.SignalMessage;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;

import org.springframework.stereotype.Controller;

@Controller
public class SignalController {

    private final SimpMessagingTemplate messagingTemplate;

    public SignalController(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

    @MessageMapping("/signal.send")
    public void sendSignal(@Payload SignalMessage signal) {
        System.out.println("📨 Signal received: " + signal);


        // Send to recipient's personal queue
        messagingTemplate.convertAndSendToUser(
                signal.getRecipient(),  // Username of receiver
                "/queue/signal",       // Destination path (client subscribes here)
                signal                 // Payload
        );
    }
}

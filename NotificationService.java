package com.ceas.service;

import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    /**
     * Sends an SMS notification to a specific phone number.
     * @param recipientNumber The phone number to notify (citizen or authority).
     * @param message The content of the alert.
     */
    public void sendSms(String recipientNumber, String message) {
        // --- REAL-WORLD INTEGRATION POINT ---
        // Here, you would use a dedicated library (e.g., TwilioRestClient)
        // to connect to an external SMS gateway API.
        
        System.out.println("--- SMS Sent ---");
        System.out.println("TO: " + recipientNumber);
        System.out.println("MESSAGE: " + message);
        System.out.println("----------------");
        // --- END REAL-WORLD INTEGRATION POINT ---
    }
}

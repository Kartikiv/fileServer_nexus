package com.example.fileserver.DTO;



public class SignalMessage {

    public SignalMessage() {
    }

    private String sender;

    public SignalMessage(int sdpMLineIndex, String sdpMid, String candidate, String sdp, String type, String recipient, String sender, String mode) {
        this.sdpMLineIndex = sdpMLineIndex;
        this.sdpMid = sdpMid;
        this.candidate = candidate;
        this.sdp = sdp;
        this.type = type;
        this.recipient = recipient;
        this.sender = sender;
        this.mode = mode;
    }

    private String recipient;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getSdp() {
        return sdp;
    }

    public void setSdp(String sdp) {
        this.sdp = sdp;
    }

    public String getCandidate() {
        return candidate;
    }

    public void setCandidate(String candidate) {
        this.candidate = candidate;
    }

    public String getSdpMid() {
        return sdpMid;
    }

    public void setSdpMid(String sdpMid) {
        this.sdpMid = sdpMid;
    }

    public int getSdpMLineIndex() {
        return sdpMLineIndex;
    }

    public void setSdpMLineIndex(int sdpMLineIndex) {
        this.sdpMLineIndex = sdpMLineIndex;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    private String mode;
    private String type; // "offer", "answer", "candidate"
    private String sdp; // for offer/answer
    private String candidate; // for ICE
    private String sdpMid;
    private int sdpMLineIndex;
}
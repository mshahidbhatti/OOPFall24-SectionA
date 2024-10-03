package week_5B.Lab;

import java.time.LocalDateTime;

public class Message {
    String sender;
    String receiver;
    String content;
    String messageId;
    boolean status;
    LocalDateTime timestamp;

    public Message(String sender, String receiver, String content, boolean status) {
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
        this.status = status;
        timestamp = LocalDateTime.now();
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Message{" +
                "sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                ", content='" + content + '\'' +
                ", messageId='" + messageId + '\'' +
                ", status=" + status +
                ", timestamp=" + timestamp +
                '}';
    }
}

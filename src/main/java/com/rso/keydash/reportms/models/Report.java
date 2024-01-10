package com.rso.keydash.reportms.models;

import java.time.Instant;

public class Report {
    private Integer id;

    private long typingSessionId;

    private String language;

    private Integer length;

    private Boolean punctuation;

    private Instant startTime;

    private Instant endTime;

    private Double wpm;

    private Double accuracy;

    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public long getTypingSessionId() {
        return typingSessionId;
    }

    public void setTypingSessionId(long typingSessionId) {
        this.typingSessionId = typingSessionId;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Boolean getPunctuation() {
        return punctuation;
    }

    public void setPunctuation(Boolean punctuation) {
        this.punctuation = punctuation;
    }

    public Instant getStartTime() {
        return startTime;
    }

    public void setStartTime(Instant startTime) {
        this.startTime = startTime;
    }

    public Instant getEndTime() {
        return endTime;
    }

    public void setEndTime(Instant endTime) {
        this.endTime = endTime;
    }

    public Double getWpm() {
        return wpm;
    }

    public void setWpm(Double wpm) {
        this.wpm = wpm;
    }

    public Double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(Double accuracy) {
        this.accuracy = accuracy;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

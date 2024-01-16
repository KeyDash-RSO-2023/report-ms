package com.rso.keydash.reportms.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
public class ReportEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "typing_session_id", nullable = false)
    private long typingSessionId;

    @Column(name = "user_id", nullable = false)
    private int userId;

    @Column(name = "language")
    private String language;

    @Column(name = "length")
    private Integer length;

    @Column(name = "punctuation")
    private Boolean punctuation;

    @Column (name = "start_time")
    private Instant startTime;

    @Column (name = "end_time")
    private Instant endTime;

    @Column (name = "wpm")
    private Double wpm;

    @Column (name = "accuracy")
    private Double accuracy;

    @Column (name = "status")
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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}

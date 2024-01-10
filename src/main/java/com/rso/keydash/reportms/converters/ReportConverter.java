package com.rso.keydash.reportms.converters;

import com.rso.keydash.reportms.entities.ReportEntity;
import com.rso.keydash.reportms.models.Report;
import com.rso.keydash.reportms.models.ReportInput;

public class ReportConverter {

    public static ReportEntity toEntity(ReportInput report) {
        ReportEntity entity = new ReportEntity();
        entity.setTypingSessionId(report.getTypingSessionId());
        entity.setLanguage(report.getLanguage());
        entity.setLength(report.getLength());
        entity.setPunctuation(report.getPunctuation());
        entity.setStartTime(report.getStartTime());
        entity.setEndTime(report.getEndTime());
        entity.setWpm(report.getWpm());
        entity.setAccuracy(report.getAccuracy());
        entity.setStatus(report.getStatus());
        return entity;
    }

    public static Report toModel(ReportEntity entity) {
        Report model = new Report();
        model.setId(entity.getId());
        model.setTypingSessionId(entity.getTypingSessionId());
        model.setLanguage(entity.getLanguage());
        model.setLength(entity.getLength());
        model.setPunctuation(entity.getPunctuation());
        model.setStartTime(entity.getStartTime());
        model.setEndTime(entity.getEndTime());
        model.setWpm(entity.getWpm());
        model.setAccuracy(entity.getAccuracy());
        model.setStatus(entity.getStatus());
        return model;
    }
}

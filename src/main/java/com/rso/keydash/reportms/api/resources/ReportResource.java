package com.rso.keydash.reportms.api.resources;

import com.rso.keydash.reportms.converters.ReportConverter;
import com.rso.keydash.reportms.entities.ReportEntity;
import com.rso.keydash.reportms.interfaces.ReportRepository;
import com.rso.keydash.reportms.models.Report;
import com.rso.keydash.reportms.models.ReportInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/reports")
public class ReportResource {

    @Autowired
    private ReportRepository reportRepository;

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

    @GetMapping
    public ResponseEntity<List<ReportEntity>> getReports() {

        List<ReportEntity> reports = reportRepository.findAll();
        return ResponseEntity.ok(reports);
    }

    @SchemaMapping(typeName = "Query", value = "report")
    public Report findById(@Argument Integer id) {
        ReportEntity report = reportRepository.findById(id).orElse(null);

        if (report == null) {
            return null;
        }

        return ReportConverter.toModel(report);
    }


    @SchemaMapping(typeName = "Query", value = "reports")
    public List<Report> findAll() {
        return ReportConverter.toModels(reportRepository.findAll());
    }

    @SchemaMapping(typeName = "Query", value = "reportsByUser")
    public List<Report> findByUserId(@Argument Integer userId) {
        return ReportConverter.toModels(reportRepository.findByUserId(userId));
    }

    @GetMapping("/{reportId}")
    public ResponseEntity<Report> getReport(@PathVariable Integer reportId) {
        ReportEntity report = reportRepository.findById(reportId).orElse(null);

        if (report == null) {
            return ResponseEntity.notFound().build();
        }

        Report reportDto = ReportConverter.toModel(report);

        return ResponseEntity.ok(reportDto);
    }

    @PostMapping
    public ResponseEntity<Report> createReport(@RequestBody ReportInput reportInput) {
        ReportEntity report = ReportConverter.toEntity(reportInput);

        report = reportRepository.save(report);
        Report reportDto = ReportConverter.toModel(report);

        return ResponseEntity.ok(reportDto);
    }

    @PutMapping("/{reportId}")
    public ResponseEntity<Report> updateReport(@PathVariable Integer reportId, @RequestBody ReportInput reportInput) {
        ReportEntity report = reportRepository.findById(reportId).orElse(null);

        if (report == null) {
            return ResponseEntity.notFound().build();
        }

        report = ReportConverter.toEntity(reportInput);
        report.setId(reportId);
        report = reportRepository.save(report);
        Report reportDto = ReportConverter.toModel(report);

        return ResponseEntity.ok(reportDto);
    }

    @DeleteMapping("/{reportId}")
    public ResponseEntity<Void> deleteReport(@PathVariable Integer reportId) {
        ReportEntity report = reportRepository.findById(reportId).orElse(null);

        if (report == null) {
            return ResponseEntity.notFound().build();
        }

        reportRepository.delete(report);

        return ResponseEntity.ok().build();
    }

    @GetMapping("/graphql")
    public ResponseEntity<Report> reportById(Integer id) {
        Report report = Report.getById(id);

        return ResponseEntity.ok(report);
    }
}

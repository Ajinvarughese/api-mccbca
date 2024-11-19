package com.MCC.BCA.controller;

import com.MCC.BCA.entity.YearBook;
import com.MCC.BCA.service.YearBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/yearbook")
public class YearBookController {

    private final YearBookService service;
    @Autowired
    public YearBookController(YearBookService service) {
        this.service = service;
    }

    @PostMapping("/create")
    public ResponseEntity<YearBook> createYearBook(@RequestBody YearBook yearBook) {
        return ResponseEntity.ok(service.createYearBook(yearBook));
    }
    @PatchMapping("/update")
    public ResponseEntity<List<YearBook>> updateYearBook(@RequestBody List<YearBook> yearBooks) {
        return ResponseEntity.ok(service.updateYearBook(yearBooks));
    }

    @GetMapping("/showAll")
    public ResponseEntity<List<YearBook>> showAllYearBook() {
        return ResponseEntity.ok(service.showAllYearBook());
    }
    @GetMapping("/admin/showAll")
    public ResponseEntity<List<YearBook>> showAllYearBookAdmin() {
        return ResponseEntity.ok(service.showAllYearBookAdmin());
    }
}





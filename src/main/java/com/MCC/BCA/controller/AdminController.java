package com.MCC.BCA.controller;

import com.MCC.BCA.dto.Admin;
import com.MCC.BCA.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/admin")
public class AdminController {
    private final AdminService service;

    @Autowired
    public AdminController(AdminService service) {
        this.service = service;
    }

    @PostMapping("/login")
    public ResponseEntity<Void> adminLogin(@RequestBody Admin admin) {
        service.adminLogin(admin);
        return ResponseEntity.ok().build();
    }
}

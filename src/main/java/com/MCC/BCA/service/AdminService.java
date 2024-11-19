package com.MCC.BCA.service;

import com.MCC.BCA.dto.Admin;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    public void adminLogin(Admin admin) {
        String userId = "ymMXAn";
        String password = "RSvBhxZG";
        if (!admin.getUserId().equals(userId) || !admin.getPassword().equals(password)) {
            throw new IllegalStateException("Password or username is incorrect!");
        }
    }
}

package com.MCC.BCA.service;

import com.MCC.BCA.entity.YearBook;
import com.MCC.BCA.repository.YearBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YearBookService {

    @Autowired
    YearBookRepository repository;
    public YearBook createYearBook(YearBook yearBook) {
        return repository.save(yearBook);
    }
    public List<YearBook> showAllYearBook() {
        return repository.findByStatus();
    }

    public List<YearBook> showAllYearBookAdmin() {
        return repository.findAll();
    }

    // Method to update YearBook entries based on the received list
    public List<YearBook> updateYearBook(List<YearBook> yearBooks) {
        for (YearBook updatedYearBook : yearBooks) {
            // Fetch the current YearBook from the DB by ID
            YearBook currentYearBook = repository.findById(updatedYearBook.getId())
                    .orElseThrow(() -> new RuntimeException("YearBook not found with id " + updatedYearBook.getId()));

            // If the status has changed, update it
            if (currentYearBook.getStatus() != updatedYearBook.getStatus()) {
                currentYearBook.setStatus(updatedYearBook.getStatus());
                repository.save(currentYearBook); // Save the updated YearBook
            }
        }
        return yearBooks;
    }
}

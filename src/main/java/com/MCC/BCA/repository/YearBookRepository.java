package com.MCC.BCA.repository;

import com.MCC.BCA.entity.YearBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface YearBookRepository extends JpaRepository<YearBook, Long> {
    @Query("SELECT y FROM YearBook y WHERE y.status = true")
    List<YearBook> findByStatus();

    /*
        TODO:
            - Update status of the yearbook after verified by admin`
     */
}

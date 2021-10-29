package com.example.sep3tier3.Dao;

import com.example.sep3tier3.Entities.Cases;
import org.springframework.data.repository.CrudRepository;

public interface CaseRepository extends CrudRepository<Cases,Long> {
}

package com.example.factu.repositories;
import org.springframework.data.repository.CrudRepository;
import com.example.factu.entities.Bill;

public interface BillRepository extends CrudRepository<Bill, Long> {
}

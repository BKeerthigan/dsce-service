package com.bkpro.dsce.dsceservice.repository;

import com.bkpro.dsce.dsceservice.model.ChecklistItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChecklistItemRepository extends JpaRepository<ChecklistItem,Long> {
    List<ChecklistItem> findByOperationTypeIgnoreCase(String operationType);

}

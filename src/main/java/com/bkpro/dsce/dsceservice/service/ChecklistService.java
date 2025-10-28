package com.bkpro.dsce.dsceservice.service;

import com.bkpro.dsce.dsceservice.controller.ChecklistController;
import com.bkpro.dsce.dsceservice.model.ChecklistItem;
import com.bkpro.dsce.dsceservice.repository.ChecklistItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChecklistService {
    private final ChecklistItemRepository Fsc;

    public ChecklistService(ChecklistItemRepository Fsc)
    {
        this.Fsc = Fsc;
    }

    public List<ChecklistItem> getAllList()
    {
       return Fsc.findAll();
    }



    public List<ChecklistItem> getListByOperationType(String operationType )
    {
        return Fsc.findByOperationTypeIgnoreCase(operationType);
    }
}

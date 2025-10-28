package com.bkpro.dsce.dsceservice.controller;

import com.bkpro.dsce.dsceservice.model.ChecklistItem;
import com.bkpro.dsce.dsceservice.service.ChecklistService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ChecklistController {

private final ChecklistService CheckServ;

    public ChecklistController(ChecklistService checkServ) {
        CheckServ = checkServ;
    }

    @GetMapping("/checklist")
    public List<ChecklistItem> getCheckListItems()
    {
    return CheckServ.getAllList();
    }


    @GetMapping("/checklistitem")
    public List<ChecklistItem> getListOperationType(@RequestParam(name ="operationType") String operationType)
    {
        return CheckServ.getListByOperationType(operationType);
    }

}

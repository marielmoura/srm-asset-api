package com.srmasset.customercrud.controller;

import com.srmasset.customercrud.business.CustomersBusiness;
import com.srmasset.customercrud.model.Risk;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/srmasset/risks")
public class RisksController {

    @GetMapping()
    public Risk[] getAll() {
        return Risk.values();
    }

}

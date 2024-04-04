package com.bikenest.bikerackserver.controller;

import com.bikenest.bikerackserver.model.Process;
import com.bikenest.bikerackserver.service.ProcessService;
import com.bikenest.bikerackserver.service.RackService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/process")
@CrossOrigin
public class ProcessController {

    private final ProcessService processService;

    public ProcessController(ProcessService processService) {
        this.processService = processService;
    }

    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public class ResourceNotFoundException extends RuntimeException {}

    @GetMapping("")
    public List<Process> getAllProcesss() {
        return processService.getAllProcesses();
    }

    @GetMapping("/{id}")
    public Optional<Process> getById(@PathVariable int id) throws ResourceNotFoundException {
        if (processService.getProcessById(id).isEmpty()) throw new ResourceNotFoundException();
        else return processService.getProcessById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public Process postProcess(@Valid @RequestBody Process p) {
        return processService.postProcess(p);
    }

    @PutMapping("/{id}")
    public Process putProcess(@PathVariable int id, @Valid @RequestBody Process p) throws Exception {
        if (processService.getProcessById(id).isEmpty()) throw new ResourceNotFoundException();
        else return processService.updateProcess(id, p);
    }

    @DeleteMapping("/{id}")
    public void deleteProcess(@PathVariable int id) {
        if (processService.getProcessById(id).isEmpty()) throw new ResourceNotFoundException();
        else processService.deleteProcessById(id);
    }
    
}

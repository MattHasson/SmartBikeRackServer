package com.bikenest.bikerackserver.controller;

import com.bikenest.bikerackserver.model.Process;
import com.bikenest.bikerackserver.service.ProcessService;
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
    public void postProcess(@Valid @RequestBody Process p) {
        processService.postProcess(p);
    }

    @PutMapping("/{id}")
    public void putProcess(@PathVariable int id, @Valid @RequestBody Process p) throws Exception {
        if (processService.getProcessById(id).isEmpty()) throw new ResourceNotFoundException();
        else processService.updateProcess(id, p);
    }

    @DeleteMapping("/{id}")
    public void deleteProcess(@PathVariable int id) {
        if (processService.getProcessById(id).isEmpty()) throw new ResourceNotFoundException();
        else processService.deleteProcessById(id);
    }
    
}

package com.bikenest.bikerackserver.service;

import com.bikenest.bikerackserver.model.Process;
import com.bikenest.bikerackserver.repository.ProcessRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProcessService {
    private final ProcessRepository processRepository;

    public ProcessService(ProcessRepository processRepository) {
        this.processRepository = processRepository;
    }

    public Process postProcess(Process process) {
        return processRepository.save(process);
    }

    public Optional<Process> getProcessById(int id) {
        return processRepository.findById(id);
    }

    public List<Process> getAllProcesses() {
        return processRepository.findAll();
    }

    public Process updateProcess(int id, Process process) {
        process.setId(id);
        return processRepository.save(process);
    }

    public void deleteProcessById(int id) {
        processRepository.deleteById(id);
    }
}

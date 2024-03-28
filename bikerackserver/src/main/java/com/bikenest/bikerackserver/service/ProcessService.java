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

    public void postProcess(Process process) {
        processRepository.save(process);
    }

    public Optional<Process> getProcessById(int id) {
        return processRepository.findById(id);
    }

    public List<Process> getAllProcesses() {
        return processRepository.findAll();
    }

    public void updateProcess(int id, Process process) {
        process.setId(id);
        processRepository.save(process);
    }

    public void deleteProcessById(int id) {
        processRepository.deleteById(id);
    }
}

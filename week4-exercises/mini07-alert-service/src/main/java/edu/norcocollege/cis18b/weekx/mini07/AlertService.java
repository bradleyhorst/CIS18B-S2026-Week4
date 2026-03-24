package edu.norcocollege.cis18b.weekx.mini07;

public class AlertService {

    private final AlertRepository repository;

    public AlertService(AlertRepository repository) {
        this.repository = repository;
    }

    public void process(Alert alert) throws AlertProcessingException {

        if (alert == null) {
            throw new AlertProcessingException("Alert cannot be null");
        }

        try {
            repository.save(alert);
        } catch (AlertStorageException e) {
            throw new AlertProcessingException("Failed to process alert", e);
        }
    }
}
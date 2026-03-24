package edu.norcocollege.cis18b.weekx.mini09;

public class LoggingAlertHandlerDecorator implements AlertHandler {

    private final AlertHandler wrapped;

    public LoggingAlertHandlerDecorator(AlertHandler wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void handle(Alert alert) {
        System.out.println("Logging alert before handling: " + alert.getMessage());

        wrapped.handle(alert);

        System.out.println("Logging alert after handling: " + alert.getMessage());
    }
}
package SFP;

import java.time.LocalDate;
import java.util.UUID;

public abstract class Transaction {
    private String id;
    private String type;
    private String label;
    private String description;
    private double amount;
    private LocalDate date;
    private LocalDate scheduleDate;
    private RecurrenceFrequency scheduleFrequency;

    public Transaction(String label, double amount, LocalDate date, String description, LocalDate scheduleDate, RecurrenceFrequency scheduleFrequency) {
        setLabel(label);
        setAmount(amount);
        setDate(date);
        setDescription(description);
        setScheduleDate(scheduleDate);
        setScheduleFrequency(scheduleFrequency);
    }

    public Transaction(String label, double amount, LocalDate date, LocalDate scheduleDate, RecurrenceFrequency scheduleFrequency) {
        setLabel(label);
        setAmount(amount);
        setDate(date);
        setScheduleDate(scheduleDate);
        setScheduleFrequency(scheduleFrequency);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDate getScheduleDate() {
        return scheduleDate;
    }

    public void setScheduleDate(LocalDate scheduleDate) {
        this.scheduleDate = scheduleDate;
    }

    public RecurrenceFrequency getScheduleFrequency() {
        return scheduleFrequency;
    }

    public void setScheduleFrequency(RecurrenceFrequency scheduleFrequency) {
        this.scheduleFrequency = scheduleFrequency;
    }

    public abstract boolean isValid();

    public abstract String generateID(UUID profileID, LocalDate date, String type);
}

/**
 * - id*: String
 * - type: String
 * - lable: String
 * - description: String
 * - amount: double
 * - date: LocalDate
 * - scheduleDate: LocalDate
 * - scheduleFrequency: enum;
 * # Transaction(type: String, lable: String, amount: double, date: LocalDate, description: String,  scheduleDate: LocalDate, scheduleFrequency: enum);
 * # Transaction(type: String, lable: String, amount: double, date: LocalDate,  scheduleDate: LocalDate, scheduleFrequency: enum);
 * # isValid(): boolean;
 * #generateID(profileID: UUID, date: LocalDate, type: String).
*id is made by 18 digits: YYYYDDDDDDXNNNNNNN, Y = profileID, D = date, X = type (0 = expenses  and 1 = income), N = serial number of the transaction**.
 */
package SFP;

public class Income extends Transaction {
    public Income(String label, double amount, LocalDate date, String description, LocalDate scheduleDate, RecurrenceFrequency scheduleFrequency) {
        super(label, amount, date, description, scheduleDate, scheduleFrequency);
        setType("Income");
    }

    public Income(String label, double amount, LocalDate date, LocalDate scheduleDate, RecurrenceFrequency scheduleFrequency) {
        super(label, amount, date, null, scheduleDate, scheduleFrequency);
        setType("Income");
    }
}

/**
 * + Income(lable: String, amount: double, date: LocalDate, description: String, scheduleDate: LocalDate, scheduleFrequency: enum);
 * + Income(lable: String, amount: double, date: LocalDate, scheduleDate: LocalDate, scheduleFrequency: enum).
 */
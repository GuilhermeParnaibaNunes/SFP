package SFP;

public class Expense extends Transaction{
    public Expense(String label, double amount, LocalDate date, String description, LocalDate scheduleDate, RecurrenceFrequency scheduleFrequency) {
        super(label, amount, date, description, scheduleDate, scheduleFrequency);
        setType("Expense");
    }

    public Expense(String label, double amount, LocalDate date, LocalDate scheduleDate, RecurrenceFrequency scheduleFrequency) {
        super(label, amount, date, null, scheduleDate, scheduleFrequency);
        setType("Expense");
    }
}

/**
 * + Expense(lable: String, amount: double, date: LocalDate, description: String, scheduleDate: LocalDate, scheduleFrequency: enum);
 * + Expense(lable: String, amount: double, date: LocalDate, scheduleDate: LocalDate, scheduleFrequency: enum).
 */
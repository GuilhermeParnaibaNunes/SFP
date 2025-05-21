package SFP;

public class Budget extends Transaction{
    public Budget(String label, double amount, LocalDate date, String description, LocalDate scheduleDate, RecurrenceFrequency scheduleFrequency) {
        super(label, amount, date, description, scheduleDate, scheduleFrequency);
        setType("Budget");
        
    public Budget(String label, double amount, LocalDate date, LocalDate scheduleDate, RecurrenceFrequency scheduleFrequency) {
        super(label, amount, date, null, scheduleDate, scheduleFrequency);
        setType("Budget");
        
    }
}

/**
 * + Budget(lable: String, amount: double, date: LocalDate, description: String, scheduleDate: LocalDate, scheduleFrequency: enum);
 * + Budget(lable: String, amount: double, date: LocalDate, scheduleDate: LocalDate, scheduleFrequency: enum).
 */
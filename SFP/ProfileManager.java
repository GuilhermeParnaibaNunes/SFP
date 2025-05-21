package SFP;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

public class ProfileManager {
    private List<Profile> profiles;
    private ScheduledExecutorService scheduler;

    public ProfileManager() {
        setProfiles(new ArrayList<>());
        setScheduler(java.util.concurrent.Executors.newScheduledThreadPool(1));
    }

    public List<Profile> getProfiles() {
        return profiles;
    }

    public void setProfiles(List<Profile> profiles) {
        this.profiles = profiles;
    }

    public ScheduledExecutorService getScheduler() {
        return scheduler;
    }

    public void setScheduler(ScheduledExecutorService scheduler) {
        this.scheduler = scheduler;
    }

    public void addProfile(Profile profile) {
        profiles.add(profile);
    }

    public void removeProfile(Profile profile) {
        profiles.remove(profile);
    }

    public void processRecurringTransactions() {
        // Implementation for processing recurring transactions
    }

    public void generateReports() {
        // Implementation for generating reports
    }

    public void scheduleAutoRefresh() {
        // Implementation for scheduling auto-refresh
    }
}

/**
 * - profile: List<Profile>;
 * - scheduler: ScheduledExecutorService;
 * + addProfile();
 * + removeProfile();
 * + processRecurringTransactions();
 * + generateReports();
 * + scheduleAutoRefresh().
 */
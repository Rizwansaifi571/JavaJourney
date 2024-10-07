class Time {
    private int hours;
    private int minutes;
    private int seconds;

    // Constructor to initialize time with hours, minutes, and seconds
    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        normalizeTime();
    }

    // Overloaded constructor to initialize time with only hours and minutes
    public Time(int hours, int minutes) {
        this(hours, minutes, 0); // Default seconds to 0
    }

    // Overloaded constructor to initialize time with only hours
    public Time(int hours) {
        this(hours, 0, 0); // Default minutes and seconds to 0
    }

    // Normalize time to ensure minutes and seconds are in proper ranges
    private void normalizeTime() {
        if (seconds >= 60) {
            minutes += seconds / 60;
            seconds %= 60;
        }
        if (minutes >= 60) {
            hours += minutes / 60;
            minutes %= 60;
        }
        if (hours < 0 || minutes < 0 || seconds < 0) {
            throw new IllegalArgumentException("Time cannot be negative");
        }
    }

    // Method to add two Time objects
    public Time add(Time other) {
        return new Time(this.hours + other.hours, this.minutes + other.minutes, this.seconds + other.seconds);
    }

    // Method to subtract another Time object from this Time object
    public Time subtract(Time other) {
        int totalSeconds1 = this.toSeconds();
        int totalSeconds2 = other.toSeconds();
        return new Time(0, 0, totalSeconds1 - totalSeconds2);
    }

    // Convert time to total seconds
    private int toSeconds() {
        return hours * 3600 + minutes * 60 + seconds;
    }

    // Method to compare two Time objects
    public int compare(Time other) {
        return Integer.compare(this.toSeconds(), other.toSeconds());
    }

    // Method to display time in HH:MM:SS format
    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}

public class TimeManagement {
    public static void main(String[] args) {
        Time time1 = new Time(2, 30, 45); // 2 hours, 30 minutes, 45 seconds
        Time time2 = new Time(1, 15, 30); // 1 hour, 15 minutes, 30 seconds

        System.out.println("Time 1: " + time1);
        System.out.println("Time 2: " + time2);

        // Adding time intervals
        Time addedTime = time1.add(time2);
        System.out.println("Added Time: " + addedTime);

        // Subtracting time intervals
        Time subtractedTime = time1.subtract(time2);
        System.out.println("Subtracted Time: " + subtractedTime);

        // Comparing time intervals
        int comparisonResult = time1.compare(time2);
        if (comparisonResult > 0) {
            System.out.println("Time 1 is greater than Time 2.");
        } else if (comparisonResult < 0) {
            System.out.println("Time 1 is less than Time 2.");
        } else {
            System.out.println("Time 1 is equal to Time 2.");
        }
    }
}

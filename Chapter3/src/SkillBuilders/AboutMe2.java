package SkillBuilders;

public class AboutMe2 {
    public static void main(String[] args) {

        // About Me Info
        String firstName = "Yemikael";
        String lastInitial = "B";
        String instructor = "Abdalla";
        String school = "Crescent High School";

        System.out.println("ABOUT ME");
        System.out.println("--------");
        System.out.println(firstName + " " + lastInitial + ".");
        System.out.println("Instructor: " + instructor);
        System.out.println("School: " + school);
        System.out.println();

        // Class Schedule Header
        System.out.println("CLASS SCHEDULE");
        System.out.println("--------------------------------------------------------------------------");
        System.out.printf("%-10s %-15s %15s %15s\n", "Course", "Days", "Start Time", "End Time");
        System.out.println("--------------------------------------------------------------------------");

        // Course A (Mon–Fri, 8:55–10:15)
        System.out.printf("%-10s %-15s %15s %15s\n", "A", "Mon–Fri", "8:55 AM", "10:15 AM");

        // Course B (Mon–Fri, 10:58–11:58)
        System.out.printf("%-10s %-15s %15s %15s\n", "B", "Mon–Fri", "10:58 AM", "11:58 AM");

        // Lunch Break (12:00–12:31)
        System.out.printf("%-10s %-15s %15s %15s\n", "Lunch", "Mon–Fri", "12:00 PM", "12:31 PM");

        // Course C (12:34–2:04)
        System.out.printf("%-10s %-15s %15s %15s\n", "C", "Mon–Fri", "12:34 PM", "2:04 PM");

        // Course D (2:07–3:37)
        System.out.printf("%-10s %-15s %15s %15s\n", "D", "Mon–Fri", "2:07 PM", "3:37 PM");
    }
}

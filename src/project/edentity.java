/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author Danyar Group
 */
import java.util.LinkedList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class edentity {
    Scanner i = new Scanner(System.in);
    private String fullname;
    private String username;
    private String birthday;
    private int phonenumber;
    private String email;
    private String blood;
    private String pass;
    LinkedList<String> bookingQueue = new LinkedList<>();
    String[][][] appointmentSlots = new String[3][8][2];
    LocalDate today = LocalDate.now();
    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd (EEEE)");
    
    // Constructor to initialize appointment slots
    public edentity() {
        // Initialize appointment slots
        for (int day = 0; day < appointmentSlots.length; day++) {
            for (int hour = 0; hour < appointmentSlots[day].length; hour++) {
                for (int slot = 0; slot < appointmentSlots[day][hour].length; slot++) {
                    appointmentSlots[day][hour][slot] = "Available";
                }
            }
        }
    }
    
    void displayAvailableSlots(String[][][] appointmentSlots, LocalDate today, DateTimeFormatter dateFormatter) {
        System.out.println("\nAvailable Time Slots:");
        
        for (int day = 0; day < appointmentSlots.length; day++) {
            LocalDate date = today.plusDays(day);
            System.out.println("\nDay " + (day + 1) + ": " + date.format(dateFormatter));
            
            boolean hasAvailableSlot = false;
            
            for (int hour = 0; hour < appointmentSlots[day].length; hour++) {
                for (int slot = 0; slot < appointmentSlots[day][hour].length; slot++) {
                    if (appointmentSlots[day][hour][slot].equals("Available")) {
                        // Calculate and format the time for this slot
                        LocalTime startTime = LocalTime.of(hour + 9, slot * 30);
                        LocalTime endTime = startTime.plusMinutes(30);
                        // Format and display the time
                        System.out.printf("  %s - %s: %s\n", 
                                startTime.format(DateTimeFormatter.ofPattern("HH:mm")),
                                endTime.format(DateTimeFormatter.ofPattern("HH:mm")),
                                appointmentSlots[day][hour][slot]);
                                
                        hasAvailableSlot = true;
                    }
                }
            }
            
            if (!hasAvailableSlot) {
                System.out.println("  No available slots for this day.");
            }
        }
    }
    
    // Book an appointment
    private static void bookAppointment(Scanner user, String[][][] appointmentSlots, 
                                       LinkedList<String> bookingQueue, LocalDate today, 
                                       DateTimeFormatter dateFormatter) {
        System.out.println("\nBook an Appointment:");
        
        // Get day selection
        System.out.println("Select a day (1-3):");
        for (int day = 0; day < appointmentSlots.length; day++) {
            LocalDate date = today.plusDays(day);
            System.out.println((day + 1) + ". " + date.format(dateFormatter));
        }
        
        System.out.print("Enter day number: ");
        int dayChoice = user.nextInt() - 1; // Adjust for zero-based indexing
        user.nextLine(); // Consume newline
        
        if (dayChoice < 0 || dayChoice >= appointmentSlots.length) {
            System.out.println("Invalid day selection. Please try again.");
            return;
        }
        
        // Show available times for the selected day
        System.out.println("\nAvailable times for " + today.plusDays(dayChoice).format(dateFormatter) + ":");
        
        int slotCounter = 1;
        int[][] slotMapping = new int[appointmentSlots[dayChoice].length * appointmentSlots[dayChoice][0].length][3];
        
        for (int hour = 0; hour < appointmentSlots[dayChoice].length; hour++) {
            for (int slot = 0; slot < appointmentSlots[dayChoice][hour].length; slot++) {
                if (appointmentSlots[dayChoice][hour][slot].equals("Available")) {
                    LocalTime startTime = LocalTime.of(hour + 9, slot * 30);
                    LocalTime endTime = startTime.plusMinutes(30);
                    
                    System.out.printf("%d. %s - %s\n", 
                            slotCounter, 
                            startTime.format(DateTimeFormatter.ofPattern("HH:mm")),
                            endTime.format(DateTimeFormatter.ofPattern("HH:mm")));
                    
                    // Store mapping of choice number to array indices
                    slotMapping[slotCounter-1][0] = dayChoice;
                    slotMapping[slotCounter-1][1] = hour;
                    slotMapping[slotCounter-1][2] = slot;
                    
                    slotCounter++;
                }
            }
        }
        
        if (slotCounter == 1) {
            System.out.println("No available slots for this day. Please choose another day.");
            return;
        }
        
        // Get time slot selection
        System.out.print("Enter slot number (1-" + (slotCounter-1) + "): ");
        int slotChoice = user.nextInt() - 1; // Adjust for zero-based indexing
        user.nextLine(); // Consume newline
        
        if (slotChoice < 0 || slotChoice >= slotCounter-1) {
            System.out.println("Invalid slot selection. Please try again.");
            return;
        }
        
        // Get customer details
        System.out.print("Enter your name: ");
        String name = user.nextLine();
        
        System.out.print("Enter your contact number: ");
        String contact = user.nextLine();
        
        // Book the appointment
        int selectedDay = slotMapping[slotChoice][0];
        int selectedHour = slotMapping[slotChoice][1];
        int selectedSlot = slotMapping[slotChoice][2];
        
        // Create booking record
        LocalDate bookingDate = today.plusDays(selectedDay);
        LocalTime startTime = LocalTime.of(selectedHour + 9, selectedSlot * 30);
        LocalTime endTime = startTime.plusMinutes(30);
        
        String bookingRecord = String.format("Date: %s, Time: %s-%s, Name: %s, Contact: %s",
                bookingDate.format(dateFormatter),
                startTime.format(DateTimeFormatter.ofPattern("HH:mm")),
                endTime.format(DateTimeFormatter.ofPattern("HH:mm")),
                name, contact);
        
        // Update appointment status and add to queue
        appointmentSlots[selectedDay][selectedHour][selectedSlot] = "Booked";
        bookingQueue.add(bookingRecord);
        
        // Confirmation message
        System.out.println("\nAppointment booked successfully!");
        System.out.println("Date: " + bookingDate.format(dateFormatter));
        System.out.println("Time: " + startTime.format(DateTimeFormatter.ofPattern("HH:mm")) + " - " + 
                endTime.format(DateTimeFormatter.ofPattern("HH:mm")));
        System.out.println("Name: " + name);
        System.out.println("Contact: " + contact);
    }
    
    // Cancel an appointment
    private static void cancelAppointment(Scanner user, String[][][] appointmentSlots, 
                                         LocalDate today, DateTimeFormatter dateFormatter) {
        System.out.println("\nCancel an Appointment:");
        
        // Get day selection
        System.out.println("Select a day (1-3):");
        for (int day = 0; day < appointmentSlots.length; day++) {
            LocalDate date = today.plusDays(day);
            System.out.println((day + 1) + ". " + date.format(dateFormatter));
        }
        
        System.out.print("Enter day number: ");
        int dayChoice = user.nextInt() - 1; // Adjust for zero-based indexing
        user.nextLine(); // Consume newline
        
        if (dayChoice < 0 || dayChoice >= appointmentSlots.length) {
            System.out.println("Invalid day selection. Please try again.");
            return;
        }
        
        // Show booked times for the selected day
        System.out.println("\nBooked appointments for " + today.plusDays(dayChoice).format(dateFormatter) + ":");
        
        int slotCounter = 1;
        int[][] slotMapping = new int[appointmentSlots[dayChoice].length * appointmentSlots[dayChoice][0].length][3];
        boolean hasBookedAppointments = false;
        
        for (int hour = 0; hour < appointmentSlots[dayChoice].length; hour++) {
            for (int slot = 0; slot < appointmentSlots[dayChoice][hour].length; slot++) {
                if (appointmentSlots[dayChoice][hour][slot].equals("Booked")) {
                    LocalTime startTime = LocalTime.of(hour + 9, slot * 30);
                    LocalTime endTime = startTime.plusMinutes(30);
                    
                    System.out.printf("%d. %s - %s\n", 
                            slotCounter, 
                            startTime.format(DateTimeFormatter.ofPattern("HH:mm")),
                            endTime.format(DateTimeFormatter.ofPattern("HH:mm")));
                    
                    // Store mapping of choice number to array indices
                    slotMapping[slotCounter-1][0] = dayChoice;
                    slotMapping[slotCounter-1][1] = hour;
                    slotMapping[slotCounter-1][2] = slot;
                    
                    slotCounter++;
                    hasBookedAppointments = true;
                }
            }
        }
        
        if (!hasBookedAppointments) {
            System.out.println("No booked appointments for this day.");
            return;
        }
        
        // Get time slot selection
        System.out.print("Enter slot number to cancel (1-" + (slotCounter-1) + "): ");
        int slotChoice = user.nextInt() - 1; // Adjust for zero-based indexing
        user.nextLine(); // Consume newline
        
        if (slotChoice < 0 || slotChoice >= slotCounter-1) {
            System.out.println("Invalid slot selection. Please try again.");
            return;
        }
        
        // Cancel the appointment
        int selectedDay = slotMapping[slotChoice][0];
        int selectedHour = slotMapping[slotChoice][1];
        int selectedSlot = slotMapping[slotChoice][2];
        
        appointmentSlots[selectedDay][selectedHour][selectedSlot] = "Available"; // Mark as available
        
        LocalTime startTime = LocalTime.of(selectedHour + 9, selectedSlot * 30);
        LocalTime endTime = startTime.plusMinutes(30);
        
        System.out.println("\nAppointment cancelled successfully!");
        System.out.println("Date: " + today.plusDays(selectedDay).format(dateFormatter));
        System.out.println("Time: " + startTime.format(DateTimeFormatter.ofPattern("HH:mm")) + " - " + 
                endTime.format(DateTimeFormatter.ofPattern("HH:mm")));
        
        // Note: We don't remove from the booking queue to maintain history
    }
    
    // Display the booking queue
    private static void displayBookingQueue(LinkedList<String> bookingQueue) {
        System.out.println("\nAll Booked Appointments:");
        
        if (bookingQueue.isEmpty()) {
            System.out.println("No appointments have been booked yet.");
            return;
        }
        
        int counter = 1;
        for (String booking : bookingQueue) {
            System.out.println(counter + ". " + booking);
            counter++;
        }
    }

    public void setname(String fullname) {
        this.fullname = fullname;
    }
    
    public String getname() {
        return fullname;
    }
    
    public void setusername(String username) {
        this.username = username;
    }
    
    public String getusername() {
        return username;
    }
    
    public void setbirth(String birthday) {
        this.birthday = birthday;
    }
    
    public String getbirth() {
        return birthday;
    }
    
    public void setnumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }
    
    public int getnumber() {
        return phonenumber;
    }
    
    public void setemail(String email) {
        this.email = email;
    }
    
    public String getemail() {
        return email;
    }
    
    public void setblood(String blood) {
        this.blood = blood;
    }
    
    public String getblood() {
        return blood;
    }
    
    public void input() {
        System.out.println("Full name: ");
        String name = i.next();
        setname(name);
        System.out.println("email: ");
        String email = i.next();
        setemail(email);
        System.out.println("Phone Number: ");
        int n = i.nextInt();
        setnumber(n);
    }
    
    public void output() {
        System.out.println("fullname: " + getname());
        System.out.println("email: " + getemail());
        System.out.println("phone number: " + getnumber());
    }
}
//ពៅ ផានីត, [3/28/2024 10:33 PM]
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class BookingHall {
    public static String[][] generateBook(int row, int rowPerSeat, String[][] bookings, char startChar) {
        char seatChar = startChar;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < rowPerSeat; j++) {
                bookings[i][j] = "[" + seatChar + "-" + j + "] No";
            }
            seatChar++;
        }
        return bookings;
    }

    public static void outputBook(int row, int rowPerSeat, String[][] bookings) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < rowPerSeat; j++) {
                System.out.print(bookings[i][j] + "    ");
            }
            System.out.println();
        }
    }

    public static String[][] booking(int row, int rowPerSeat, String[][] bookings, String booking) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < rowPerSeat; j++) {
                if (booking.contains(bookings[i][j].substring(0, bookings[i][j].length() - 3))) {
                    bookings[i][j] = bookings[i][j].replace("No", "Book");
                }
            }
        }
        return bookings;
    }
    
    public static void main(String[] args) {
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a");
        sdf.setTimeZone(TimeZone.getTimeZone("Asia/Phnom_Penh"));
        String date = sdf.format(now);
        System.out.println(date);
        
        char startChar = 'A';
        int row, rowPerSeat;
        String[][] bookings;
        String[] idUser, seatUser, dateUser;
        int n = 0;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        row = scan.nextInt();
        
        System.out.print("Enter number of seats per row: ");
        rowPerSeat = scan.nextInt();
        
        bookings = new String[row][rowPerSeat];
        idUser = new String[row * rowPerSeat];
        seatUser = new String[row * rowPerSeat];
        dateUser = new String[row * rowPerSeat];
        
        bookings = generateBook(row, rowPerSeat, bookings, startChar);
        
        String option;
        do {
            System.out.println("A. Booking");
            System.out.println("B. Output Booking");
            System.out.println("C. Output user Booking");
            System.out.println("F. Exit");
            System.out.print("Select Menu: ");
            option = scan.next();
            
            switch (option.toUpperCase()) {
                case "A":
                    System.out.print("Enter seat(s) to book (e.g., A-1 B-2): ");
                    scan.nextLine(); // Consume newline
                    String booking = scan.nextLine().trim();
                    String[] seatsToBook = booking.split("\\s+");
                    boolean allSeatsAvailable = true;
                    
                    for (String seat : seatsToBook) {
                        boolean seatBooked = false;
                        for (int i = 0; i < row; i++) {
                            for (int j = 0; j < rowPerSeat; j++) {
                                if (bookings[i][j].startsWith(seat)) {
                                    if (bookings[i][j].endsWith("Book")) {
                                        System.out.println(bookings[i][j] + " : Already booked");
                                        seatBooked = true;
                                        allSeatsAvailable = false;
                                        break;
                                    }
                                }
                            }
                            if (seatBooked) break;
                        }
                    }
                    
                    if (allSeatsAvailable) {
                        System.out.print("Enter user ID: ");
                        String userId = scan.next();

//ពៅ ផានីត, [3/28/2024 10:33 PM]
for (String seat : seatsToBook) {
                            bookings = booking(row, rowPerSeat, bookings, seat);
                            idUser[n] = userId;
                            seatUser[n] = seat;
                            dateUser[n] = date;
                            n++;
                        }
                    }
                    break;
                    
                case "B":
                    outputBook(row, rowPerSeat, bookings);
                    break;
                    
                case "C":
                    System.out.printf("%-25s%-25s%-25s\n","User ID","Seat","Date");
                    for (int i = 0; i < n; i++) {
                        System.out.printf("%-25s%-25s%-25s\n",idUser[i],seatUser[i],dateUser[i]);
                    }
                    break;
                    
                case "F":
                    System.out.println("Good Luck");
                    break;
                    
                default:
                    System.out.println("Invalid option, please try again.");
            }
        } while (!option.toUpperCase().equals("F"));
        
        scan.close();
    }
}
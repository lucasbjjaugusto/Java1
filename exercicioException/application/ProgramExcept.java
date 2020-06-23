package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Reservation;
import exceptions.domainException;

public class ProgramExcept {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			System.out.print("Room number: ");
			int roomNumber = sc.nextInt();
			System.out.print("Check-in date(dd/MM/yyyy): ");
			Date checkin = sdf.parse(sc.next());
			System.out.print("Check-out date(dd/MM/yyyy): ");
			Date checkout = sdf.parse(sc.next());

			Reservation reservation = new Reservation(roomNumber, checkin, checkout);
			System.out.println("Reservation:" + reservation);

			System.out.println();
			System.out.println("Enter the update dates:");
			System.out.print("Check-in date(dd/MM/yyyy): ");
			checkin = sdf.parse(sc.next());
			System.out.print("Check-out date(dd/MM/yyyy): ");
			checkout = sdf.parse(sc.next());

			reservation.updateDates(checkin, checkout);
			System.out.println("Reservation:" + reservation);
			
		} catch (ParseException e) {
			System.out.println("Invalid Date format");
		}
		catch (domainException e) {
			System.out.println("Error in reservation: " + e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}
		sc.close();
	}
}
package com.lti.model;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "reservation_details")
public class Reservation {
	
	@Id
	@SequenceGenerator(name = "r_id", sequenceName = "reservation_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "r_id")
	@Column(name = "RESERVATION_ID")
	private int reservation_id;

	@Column(name = "REGISTERED_EMAIL")
	private String registered_email;

	@Column(name = "UNREGISTERED_EMAIL")
	private String unregistered_email;

	@Column(name = "SEATS_BOOKED")
	private int seats_Booked;

	@Column(name = "JOURNEY_ID")
	private int journey_Id;

	@Column(name = "DEPARTURE_DATE")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date departure_Date;

	@Column(name = "RESERVATION_DATE")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date reservation_Date;

	public Reservation() {
		super();
	}

	public Reservation(int reservation_id, String registered_email, String unregistered_email, int seats_Booked, int journey_Id, Date departure_Date, Date reservation_Date) {
		super();
		this.registered_email = registered_email;
		this.unregistered_email = unregistered_email;
		this.seats_Booked = seats_Booked;
		this.journey_Id = journey_Id;
		this.departure_Date = departure_Date;
		this.reservation_Date = reservation_Date;
	}
	
	public int getReservation_id() {
		return reservation_id;
	}

	public void setReservation_id(int reservation_id) {
		this.reservation_id = reservation_id;
	}

	public String getRegistered_email() {
		return registered_email;
	}

	public void setRegistered_email(String registered_email) {
		this.registered_email = registered_email;
	}

	public String getUnregistered_email() {
		return unregistered_email;
	}
	
	public void setUnregistered_email(String unregistered_email) {
		this.unregistered_email = unregistered_email;
	}
	
	public int getSeats_Booked() {
		return seats_Booked;
	}

	public void setSeats_Booked(int seats_Booked) {
		this.seats_Booked = seats_Booked;
	}

	public int getJourney_Id() {
		return journey_Id;
	}

	public void setJourney_Id(int journey_Id) {
		this.journey_Id = journey_Id;
	}

	public Date getDeparture_Date() {
		return departure_Date;
	}

	public void setDeparture_Date(Date departure_Date) {
		this.departure_Date = departure_Date;
	}

	public Date getReservation_Date() {
		return reservation_Date;
	}

	public void setReservation_Date(Date reservation_Date) {
		this.reservation_Date = reservation_Date;
	}

	@Override
	public String toString() {
		return "Reservation [reservation_id=" + reservation_id + ", registered_email=" + registered_email
				+ ", unregistered_email=" + unregistered_email + ", seats_Booked=" + seats_Booked + ", journey_Id="
				+ journey_Id + ", departure_Date=" + departure_Date + ", reservation_Date=" + reservation_Date + "]";
	}
	
}

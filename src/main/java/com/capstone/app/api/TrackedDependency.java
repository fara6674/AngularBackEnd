package com.capstone.app.api;


import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;





/**
 * Created by Latif on 14/06/2017.
 */
@Entity
public class TrackedDependency {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Size(max =50)
    private String description;

/*    @NotNull
    private String startDate;
*/    
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="mm/dd/yyyy HH:mm:ss")
    private Date startDate;

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="mm/dd/yyyy HH:mm:ss")
    private Date endDate;


    @NotNull
    private int sprintNumber;

    private int duration;


    private String ticketNumber;

    public TrackedDependency() {
    }

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}


	public void setSprintNumber(int sprintNumber) {
		this.sprintNumber = sprintNumber;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}


	public void setTicketNumber(String ticketNumber) {
		this.ticketNumber = ticketNumber;
	}


	public Long getId() {
        return id;
    }

    public String getDescription() { return description; }



    public Date getEndDate() { return endDate; }

    public int getSprintNumber() { return sprintNumber; }

    public int getDuration() { return duration; }

    public String getTicketNumber() { return ticketNumber; }
}
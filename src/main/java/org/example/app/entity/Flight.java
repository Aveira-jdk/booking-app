package org.example.app.entity;

import java.time.LocalDateTime;

public class Flight {
    private Long id;
    private String flightNumber;
    private String airline;
    private String destination;
    private String departureCity;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private String gate;
    private String terminal;
    private String status;
    private String checkInCounter;
    private LocalDateTime boardingTime;

    public Flight(String flightNumber, String airline,
                  String destination, String departureCity, LocalDateTime departureTime,
                  LocalDateTime arrivalTime, String gate, String terminal,
                  String status, String checkInCounter, LocalDateTime boardingTime) {

        this.flightNumber = flightNumber;
        this.airline = airline;
        this.destination = destination;
        this.departureCity = departureCity;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.gate = gate;
        this.terminal = terminal;
        this.status = status;
        this.checkInCounter = checkInCounter;
        this.boardingTime = boardingTime;
    }

    public Flight(Long id, String flightNumber, String airline, String destination, String departureCity, LocalDateTime departureTime, LocalDateTime arrivalTime, String gate, String terminal, String status, String checkInCounter, LocalDateTime boardingTime) {
        this.id = id;
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.destination = destination;
        this.departureCity = departureCity;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.gate = gate;
        this.terminal = terminal;
        this.status = status;
        this.checkInCounter = checkInCounter;
        this.boardingTime = boardingTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getGate() {
        return gate;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCheckInCounter() {
        return checkInCounter;
    }

    public void setCheckInCounter(String checkInCounter) {
        this.checkInCounter = checkInCounter;
    }

    public LocalDateTime getBoardingTime() {
        return boardingTime;
    }

    public void setBoardingTime(LocalDateTime boardingTime) {
        this.boardingTime = boardingTime;
    }
    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", flightNumber='" + flightNumber + '\'' +
                ", airline='" + airline + '\'' +
                ", destination='" + destination + '\'' +
                ", departureCity='" + departureCity + '\'' +
                ", departureTime=" + departureTime +
                ", arrivalTime=" + arrivalTime +
                ", gate='" + gate + '\'' +
                ", terminal='" + terminal + '\'' +
                ", status='" + status + '\'' +
                ", checkInCounter='" + checkInCounter + '\'' +
                ", boardingTime=" + boardingTime +
                '}';
    }

}
    package com.shahriar;

    import java.text.DateFormat;
    import java.time.LocalDate;

    //instance Variables

    public class Singers {
    //Instance variables
    public String id;
    public String name;
    public String address;
    public LocalDate dateOfBirth;
    public int albumPubNumber;


    //Constructors

    public Singers() {
    }

    public Singers(String id) {
        this.id = id;
    }

    public Singers(String id, String name){
        this.id = id;
        this.name = name;
    }
    public Singers(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    public Singers(String id, String name, String address, LocalDate dateOfBirth) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }
    public Singers(String id, String name, String address, LocalDate dateOfBirth, int albumPubNumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.albumPubNumber = albumPubNumber;
    }

    //Setters & Getters
    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setAlbumPubNumber(int albumPubNumber) {
        this.albumPubNumber = albumPubNumber;
    }

    public int getAlbumPubNumber() {
        return this.albumPubNumber;
    }


    //Set ALL Method

    public void setALl (String id, String name, String address, LocalDate dateOfBirth, int albumPubNumber){
        this.id = id;
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.albumPubNumber = albumPubNumber;
    }

    //Get All Method

    @Override
    public String toString(){
        return ("Singer ID: " +this.id+ "\n" +
                "Name: " + this.name+ "\n" +
                "Address: "+this.address+ "\n"+
                "Date of Birth: " +this.dateOfBirth+ "\n" +
                "Number of Album published: "+this.albumPubNumber);

    }

    }

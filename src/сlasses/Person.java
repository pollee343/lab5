package сlasses;


import java.time.LocalDateTime;

public class Person implements Comparable<Person> {
    private long id;
    private String name;
    private Coordinates coordinates;
    private java.time.LocalDateTime creationDate;
    private Integer minimalPoint;
    private Difficulty difficulty;
    private Person author;
    private Country nationality;
    private Float weight;
    private CustomСolor eyeColor;
    private CustomСolor hairColor;


    public Person(Long id, String name, Coordinates coordinates,
                  java.time.LocalDateTime creationDate, Integer minimalPoint,
                  Difficulty difficulty, Person author, Country nationality,
                  Float weight, CustomСolor hairColor, CustomСolor eyeColor) {
        this.id = id;
        this.name = name;
        this.coordinates = coordinates;
        this.creationDate = creationDate;
        this.minimalPoint = minimalPoint;
        this.difficulty = difficulty;
        this.author = author;
        this.nationality = nationality;
        this.weight = weight;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public Integer getMinimalPoint() {
        return minimalPoint;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public Person getAuthor() {
        return author;
    }

    public Country getNationality() {
        return nationality;
    }

    public Float getWeight() {
        return weight;
    }

    public CustomСolor getEyeColor() {
        return eyeColor;
    }

    public CustomСolor getHairColor() {
        return hairColor;
    }


    @Override
    public int compareTo(Person o) {
        return 0;
    }
}


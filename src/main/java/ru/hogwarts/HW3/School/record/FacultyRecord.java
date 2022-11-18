package ru.hogwarts.HW3.School.record;

import javax.validation.constraints.NotBlank;

public class FacultyRecord {

    private Long id;

    @NotBlank(message = "У факультета должно быть название")
    private String name;
    @NotBlank(message = "У каждого факультета есть свой цвет")
    private String color;

    public FacultyRecord() {
    }

    public FacultyRecord(Long id, String name, String color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

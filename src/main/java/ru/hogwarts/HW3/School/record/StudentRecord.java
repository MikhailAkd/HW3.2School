package ru.hogwarts.HW3.School.record;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class StudentRecord {

    private Long id;
    @NotBlank(message = "У волшебника должно быть имя")
    private String name;
    @Min(value = 11, message = "Минимальный возраст юного волшебника - 11 лет")
    @Max(value = 20, message = "Максимальный возраст выпусника - 20 лет")
    private int age;

    public StudentRecord() {
    }

    public StudentRecord(Long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

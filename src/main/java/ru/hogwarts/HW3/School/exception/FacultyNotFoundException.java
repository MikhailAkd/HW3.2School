package ru.hogwarts.HW3.School.exception;

public class FacultyNotFoundException extends RuntimeException {
    private final long id;

    public FacultyNotFoundException(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}

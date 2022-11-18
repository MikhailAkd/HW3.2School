package ru.hogwarts.HW3.School.component;

import org.springframework.stereotype.Component;
import ru.hogwarts.HW3.School.model.Faculty;
import ru.hogwarts.HW3.School.model.Student;
import ru.hogwarts.HW3.School.record.FacultyRecord;
import ru.hogwarts.HW3.School.record.StudentRecord;

@Component
public class RecordMapper {

    public StudentRecord toRecord(Student student) {
        StudentRecord studentRecord = new StudentRecord();
        studentRecord.setId(student.getId());
        studentRecord.setName(student.getName());
        studentRecord.setAge(student.getAge());
        return studentRecord;
    }

    public FacultyRecord toRecord(Faculty faculty) {
        FacultyRecord facultyRecord = new FacultyRecord();
        facultyRecord.setId(facultyRecord.getId());
        facultyRecord.setName(facultyRecord.getName());
        facultyRecord.setColor(facultyRecord.getColor());
        return facultyRecord;
    }

    public Student toEntity(StudentRecord studentRecord) {
        Student student = new Student();
        student.setName(studentRecord.getName());
        student.setAge(studentRecord.getAge());
        return student;
    }

    public Faculty toEntity(FacultyRecord facultyRecord) {
        Faculty faculty = new Faculty();
        faculty.setName(facultyRecord.getName());
        faculty.setColor(facultyRecord.getColor());
        return faculty;
    }
}

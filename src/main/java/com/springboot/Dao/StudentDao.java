package com.springboot.Dao;
import com.springboot.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDao {

    public static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>() {
            {
                put(1, new Student(1, "Sahid", "CS"));
                put(2, new Student(2, "Alex", "Sos"));
                put(3, new Student(3, "Bruno", "Acc"));
                put(4, new Student(4, "Anna", "Math"));
            }
        };
    }

    public Collection<Student> getAllStudents(){
        return this.students.values();
    }

    public Student getStudentById(int id){
        return this.students.get(id);
    }

    public void deleteStudentById(int id) {
        students.remove(id);
    }
}

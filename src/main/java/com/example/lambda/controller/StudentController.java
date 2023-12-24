package com.example.lambda.controller;

import com.example.lambda.Students;
import com.example.lambda.controller.response.StudentResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    //Streams

    @GetMapping("/students")
    public List<StudentResponse> students() {
        List<Students> myStudents = new ArrayList<>();
        myStudents.add(new Students(25L, "dasun", "commerce"));
        myStudents.add(new Students(30L, "herath", "art"));
        myStudents.add(new Students(40L, "purna", "art"));
        myStudents.add(new Students(45L, "sasida", "maths"));
        myStudents.add(new Students(50L, "dilhan", "commerce"));
        myStudents.add(new Students(55L, "isuru", "commerce"));
        myStudents.add(new Students(60L, "lakshitha", "maths"));
        myStudents.add(new Students(65L, "chamara", "art"));
        myStudents.add(new Students(70L, "chandima", "maths"));
        myStudents.add(new Students(75L, "devni", "commerce"));

        //     ************* Stream method 1 without response class***************
//   List<Students> filteredStudents= myStudents.stream()
//           .filter(std -> std.getSubject().equals("commerce"))
//           .toList();


//     ************* Stream method 2 with response class***************
        List<StudentResponse> filteredStudents= myStudents.stream()
                .filter(std -> std.getSubject().equals("commerce"))
                .map(std1 ->StudentResponse.builder()
                        .id(std1.getId())
                        .name(std1.getName())
                        .build())
                .toList();

        return filteredStudents;

    }
}


//     ************* Normal method 1 without response class***************
//    List<Students> commerceStudents = new ArrayList<>();
//    List<Students> artStudents = new ArrayList<>();
//    List<Students> mathsStudents = new ArrayList<>();
//    for (Students student : myStudents) {
//        if ((student.getSubject()).equals("commerce")) {
//            commerceStudents.add(student);
//        }
//        else if((student.getSubject()).equals("art"){
//            artStudents.add(student);
//        } else if ((student.getSubject()).equals("maths") {
//            mathsStudents.add(student);
//        }else {
//            System.out.println("not available");
//        }
//    }
//
//     ************* Normal method 2 with response class***************
//        List<StudentResponse> filteredStudents = new ArrayList<>();
//        for (Students students : myStudents) {
//            if ((students.getSubject()).equals("maths")) {
//                StudentResponse studentResponse = new StudentResponse();
//                studentResponse.setId(students.getId());
//                studentResponse.setName(students.getName());
//                filteredStudents.add(studentResponse);
//            }
//
//        }
//        return filteredStudents;
//    }
//}






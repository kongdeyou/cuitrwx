package cn.cuitrwx.studentdataService.test;

import cn.cuitrwx.studentdataService.model.DataResponseVO;
import cn.cuitrwx.studentdataService.model.Studentdata;
import cn.cuitrwx.studentdataService.service.StudentDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class test {
    @Autowired
    private StudentDataService studentDataService;

    @GetMapping("/studentdata")
    DataResponseVO<Studentdata> getStudent(String id) {
        return studentDataService.getStudentData(id);
    }

    @PostMapping("/studentdata")
    DataResponseVO PostStudent(Studentdata studentdata) {

        return studentDataService.postStudentData(studentdata);
    }

    @DeleteMapping("/studentdata")
    DataResponseVO deleteStudent(String id) {

        return studentDataService.deleteStudentData(id);
    }

    @PutMapping("/studentdata")
    DataResponseVO putStudent(Studentdata studentdata) {

        return studentDataService.putStudentData(studentdata);
    }


}

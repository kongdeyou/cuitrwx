package cn.cuitrwx.studentdataService.service;

import cn.cuitrwx.studentdataService.model.DataResponseVO;
import cn.cuitrwx.studentdataService.model.Studentdata;

public interface StudentDataService {
    DataResponseVO<Studentdata> getStudentData(String id);

    DataResponseVO postStudentData(Studentdata studentdata);

    DataResponseVO putStudentData(Studentdata studentdata);

    DataResponseVO deleteStudentData(String id);
}

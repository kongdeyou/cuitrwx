package cn.cuitrwx.studentdataService.dao;

import cn.cuitrwx.studentdataService.model.Studentdata;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface userdao {
    Studentdata getStudentData(String id);

    void postStudentData(Studentdata data);

    void putsStudentData(Studentdata data);

    void deleteStudentData(String id);
}

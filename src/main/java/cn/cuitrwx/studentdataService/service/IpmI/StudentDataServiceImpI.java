package cn.cuitrwx.studentdataService.service.IpmI;

import cn.cuitrwx.studentdataService.dao.userdao;
import cn.cuitrwx.studentdataService.model.DataResponseVO;
import cn.cuitrwx.studentdataService.model.ErrorCode;
import cn.cuitrwx.studentdataService.model.Studentdata;
import cn.cuitrwx.studentdataService.mybatisutil.MybatisUtils;
import cn.cuitrwx.studentdataService.service.StudentDataService;
import org.springframework.stereotype.Service;

@Service
public class StudentDataServiceImpI implements StudentDataService {

    userdao dao = MybatisUtils.getSqlSession().getMapper(userdao.class);

    @Override
    public DataResponseVO<Studentdata> getStudentData(String id) {
        return new DataResponseVO<>(dao.getStudentData(id));
    }

    @Override
    public DataResponseVO postStudentData(Studentdata studentdata) {
        dao.postStudentData(studentdata);
        return new DataResponseVO<>(ErrorCode.FAILED, "testFailed");
    }

    @Override
    public DataResponseVO putStudentData(Studentdata studentdata) {
        dao.putsStudentData(studentdata);
        return new DataResponseVO<>(ErrorCode.FAILED, "testFailed");
    }

    @Override
    public DataResponseVO deleteStudentData(String id) {
        dao.deleteStudentData(id);
        return new DataResponseVO<>(ErrorCode.FAILED, "testFailed");
    }
}

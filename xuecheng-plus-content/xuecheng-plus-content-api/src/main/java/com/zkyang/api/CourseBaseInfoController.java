package com.zkyang.api;

import com.zkyang.model.PageParams;
import com.zkyang.model.PageResult;
import com.zkyang.model.dto.QueryCourseParamsDto;
import com.zkyang.model.po.CourseBase;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yzk
 * @version 1.0
 * @description TODO
 * @date 2023/2/10 23:52
 */

@Api(value = "课程信息编辑接口",tags = "课程信息编辑接口")
@RestController
public class CourseBaseInfoController {

    @ApiOperation("课程查询接口")
    @PostMapping("/course/list")
    public PageResult<CourseBase> list(PageParams pageParams, @RequestBody QueryCourseParamsDto queryCourseParams){
        CourseBase courseBase = new CourseBase();
        courseBase.setName("测试111");
        courseBase.setCreateDate(LocalDateTime.now());
        List<CourseBase> courseBases = new ArrayList<>();
        courseBases.add(courseBase);
        PageResult<CourseBase> pageResult = new PageResult<>(courseBases, 10, 1, 10);
        return pageResult;
    }

}

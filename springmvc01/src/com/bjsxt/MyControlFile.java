package com.bjsxt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author ZhangHaoyu
 * @description 文件的上传操作
 * @date 2020/3/24 20:50
 */
@RequestMapping("/filed")
@Controller
public class MyControlFile {


    @RequestMapping(value = "fileUpload")
    public String fileUpload(String name,MultipartFile fi){

        System.out.println(name);
        System.out.println(fi.getName()+"..."+fi.getContentType()+"..."+fi.getOriginalFilename()+"..."+fi.getSize());
        return "forward:/index.jsp";
    }
}

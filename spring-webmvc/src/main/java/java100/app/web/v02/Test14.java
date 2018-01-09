package java100.app.web.v02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/v02/test14")
public class Test14 {
    
    @RequestMapping
    public String fileupload(
            String name,
            String[] lengs) {
        System.out.println(name);
        for (String leng : lengs) {
            System.out.println(leng);
        }
        System.out.println("--------------------");
        return "/hello.jsp";
    }
   
}

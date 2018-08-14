package web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 简单控制器
 */
@Controller  //利用controller注解声明一个控制器
public class HelloController {

    @RequestMapping("/index")//利用RequestMapping配置url和方法之间的映射
    public String hello(){
        return "index";   //通过上面viewResult的Bean配置，返回值为index,说明我们的页面路径为/WEB-INF/classes/views/index.jsp
    }
}

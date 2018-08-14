import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * spring mvc配置
 */

@Configuration
@EnableWebMvc  //开启一些默认配置，如viewResolver或者MessageConverter等
@ComponentScan
public class MyMvcConfig {
    @Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        //路径为什么与我们的开发目录不一致？因为看到的页面是运行时而不是开发时的代码，运行时代码会将页面自动编译到这个目录下
        viewResolver.setPrefix("/WEB-INF/classes/views/");//target/classes/views/也行
        viewResolver.setSuffix(".jsp");
        viewResolver.setViewClass(JstlView.class);
        return viewResolver;
    }
}

package tim.securityApp;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    public void addViewContollers(ViewControllerRegistry vc){
        vc.addViewController("/home").setViewName("home");
        vc.addViewController("/").setViewName("home");
        vc.addViewController("/hello").setViewName("hello");
        vc.addViewController("/login").setViewName("login");

    }
}

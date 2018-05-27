package test.co;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.function.Consumer;

@Controller
public class TestController {

    @RequestMapping("/test")
    @ResponseBody
    public String test(){

        Consumer<String> a = p->{System.out.print("asdasd");};

        a.accept("asdasd");

        return "a";
    }

    @RequestMapping("/index")
    public String index(){


        return "index";
    }

    @RequestMapping("/test/main")
    public String managerMain(){

        System.out.print("asdasdas");

        return "managerMain";
    }

    @RequestMapping("/admin/main")
    @PreAuthorize("isAuthenticated()")
    public String adminMain(){

        System.out.print("ASdasd");
        System.out.print("A2323");
        System.out.print("AS344");
        System.out.print("A3424234");

        return "adminMain";
    }


}

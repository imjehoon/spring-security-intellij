package test.co;

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
    public String adminMain(){


        return "adminMain";
    }


}

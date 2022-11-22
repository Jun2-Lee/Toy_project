package bera31.Project.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;

@Controller
@ApiIgnore
@RequestMapping
public class SwaggerController {
    @GetMapping("/naong-api")
    public String showApi() {
        return "redirect:swagger-ui/index.html#";
    }
}

package org.project.waggle.controller.together;


import org.project.waggle.entity.together.togetherEntity;
import org.project.waggle.service.together.TogetherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/together")
public class TogetherController {

    private final TogetherService togetherService;
    @Autowired
    public TogetherController(TogetherService togetherService) {
        this.togetherService = togetherService;
    }

    @PostMapping("/")
    public String togetherMake(@RequestBody togetherEntity togetherEntity){
        System.out.println(togetherEntity.to_content);
        return null;
    }
}

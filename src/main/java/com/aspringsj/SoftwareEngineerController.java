package com.aspringsj;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {

    @GetMapping
    public List<SoftwareEngineer> getEngineers(){
        return List.of(
                new SoftwareEngineer(
                        "Sarboil",
                        1,
                        "js, AWS DevOps, Java, Python"
                ),
                new SoftwareEngineer(
                        "Kquixote",
                        2,
                        "js, Azure, Spring, Springboot, Python, Hadoop"
                )
        );
    }
}

package de.telran.form;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.telran.form.dto.AuthorDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/author")
@Slf4j
public class AuthorController {

    @PostMapping
    public String createNewPost(@RequestBody AuthorDto author){
        log.info(
                "Request received. First name = {}, Last name = {}",
                author.getFirstName(),
                author.getLastName()
        );
        return "New post created";
    }
}

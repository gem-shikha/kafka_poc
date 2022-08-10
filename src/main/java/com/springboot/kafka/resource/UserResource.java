package com.springboot.kafka.resource;

import com.springboot.kafka.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {
    @Autowired
    private KafkaTemplate<String, User> template;
    private static final String Topic = "kafka_poc";

    @GetMapping("/publisher/{msg}")
    public String publishMsg(@PathVariable String msg) {
        template.send(Topic, new User("Arun","Devups",30000L));
        return "Published Successfully!";
    }

}

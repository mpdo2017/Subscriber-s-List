package com.tts.SubscriberList.subscriber;

import org.springframework.stereotype.Controller;

@Controller
@GetMapping
public class SubscriberController {
    public String index(Subscriber subscriber) {
        return "subscriber/index";

        //Where we want to go when our application is started
    }
}

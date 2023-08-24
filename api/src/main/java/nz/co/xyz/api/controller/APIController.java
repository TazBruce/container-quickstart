package nz.co.xyz.api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class APIController {
    @GetMapping("/public/")
    public String publicEndpoint() {
        return "All good. You DO NOT need to be authenticated to call /api/public.";
    }

    @GetMapping("/private/")
    public String privateEndpoint() {
        return "All good. You can see this because you are Authenticated.";
    }

    @RequestMapping(value = "/private/", method = RequestMethod.OPTIONS)
    public String preflight() {
        return "";
    }
}
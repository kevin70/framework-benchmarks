package hello.web;

import java.util.Collections;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kevin Zou (kevinz@weghst.com)
 */
@RequestMapping("/json")
@RestController
public class JsonResource {

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Object get() {
        return Collections.singletonMap("message", "Hello, World!");
    }

}

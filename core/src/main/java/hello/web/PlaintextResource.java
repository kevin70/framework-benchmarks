package hello.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kevin Zou (kevinz@weghst.com)
 */
@RequestMapping("/plaintexts")
@RestController
public class PlaintextResource {

    @RequestMapping(method = RequestMethod.GET)
    public String get() {
        return "Hello, World!";
    }

}

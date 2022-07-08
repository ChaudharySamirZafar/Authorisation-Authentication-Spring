package codenemy.api.practiseController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("practise")
public class PractiseController {

    @GetMapping("/details")
    public Information getDetails(@RequestBody Information information){
        return information;
    }
}

package dream.diamond.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dream.diamond.sample.service.SampleService;

/**
 * Created by niuqinghua on 2015/7/24.
 */
@RestController
@RequestMapping(value = "/sample")
public class SampleController {

    @Autowired
    private SampleService sampleService;

    @RequestMapping("/test")
    public String test() {
        return sampleService.test();
    }

}

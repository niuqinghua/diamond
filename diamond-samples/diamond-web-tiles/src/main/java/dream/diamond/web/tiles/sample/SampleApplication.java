package dream.diamond.web.tiles.sample;

import dream.diamond.application.AbstractExternalServerApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by niuqinghua on 2015/7/24.
 */
@Configuration
@ComponentScan(value = {"dream.diamond"})
public class SampleApplication extends AbstractExternalServerApplication<SampleApplication> {

    private static final Class<SampleApplication> sampleApplicationClass = SampleApplication.class;

    @Override
    protected Class<SampleApplication> getApplicationType() {
        return sampleApplicationClass;
    }

    public static void main(String[] args) {
        SpringApplication.run(sampleApplicationClass, args);
    }

}

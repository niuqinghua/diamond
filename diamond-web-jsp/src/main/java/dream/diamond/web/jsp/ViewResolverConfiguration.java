package dream.diamond.web.jsp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by niuqinghua on 2015/7/21.
 */
public class ViewResolverConfiguration {

    @Value("${view.prefix:WEB-INF/jsp/}")
    private String prefix;

    @Value("${view.suffix:.jsp}")
    private String suffix;

    @Bean(name = "viewResolver")
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix(prefix);
        resolver.setSuffix(suffix);
        return resolver;
    }

}

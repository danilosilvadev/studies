package project;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.core.type.filter.RegexPatternTypeFilter;

import java.util.regex.Pattern;

/**
 * Created by sg-0036936 on 23/05/2017.
 */
@Configuration
//@Import(DataConfig.class)
@ComponentScan(basePackages={"project.controller"},
        excludeFilters={
                @ComponentScan.Filter(type= FilterType.CUSTOM /*, value= RootConfig.WebPackage.class*/)
        })
public class RootConfig {
    /*public static class WebPackage extends RegexPatternTypeFilter {
        public WebPackage() {
            super(Pattern.compile("project\\.controller"));
        }
    }*/
}
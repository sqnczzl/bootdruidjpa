package com.lanc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @Author: zzl
 * @Date: 2019/3/12 17:02
 * @Description:
 */
public class BootDruidJpaServletInitializer extends SpringBootServletInitializer {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(BootDruidJpaApplication.class);
    }
}


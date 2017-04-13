package com.beijing.ds;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;
/**
 * Created by zhou.zhao on 17-4-11.
 */

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({LefuDsConfiguration.class})
public @interface EnableLefuds {
}

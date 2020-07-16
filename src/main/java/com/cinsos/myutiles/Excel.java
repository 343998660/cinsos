package com.cinsos.myutiles;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME )
public @interface Excel {
    /**
     * 导出到Excel中的名字.
     */
    public String name() default "";
    /**
     * 导出时在excel中每个列的高度 单位为字符
     */
    public float height() default 14F;

    /**
     * 导出时在excel中每个列的宽 单位为字符
     */
    public double width() default 16;
    public String type() default "String";
}

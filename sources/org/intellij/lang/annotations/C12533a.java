package org.intellij.lang.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
/* renamed from: org.intellij.lang.annotations.a */
public @interface C12533a {

    /* renamed from: X3 */
    public static final String f30584X3 = "The method argument (if parameter was annotated) or this container (if instance method was annotated)";

    /* renamed from: Y3 */
    public static final String f30585Y3 = "this";

    /* renamed from: Z3 */
    public static final String f30586Z3 = "This container (if the parameter was annotated) or the return value (if instance method was annotated)";

    /* renamed from: a4 */
    public static final String f30587a4 = "The return value of this method";

    /* renamed from: b4 */
    public static final String f30588b4 = "this";

    String source() default "The method argument (if parameter was annotated) or this container (if instance method was annotated)";

    boolean sourceIsContainer() default false;

    String target() default "This container (if the parameter was annotated) or the return value (if instance method was annotated)";

    boolean targetIsContainer() default false;
}

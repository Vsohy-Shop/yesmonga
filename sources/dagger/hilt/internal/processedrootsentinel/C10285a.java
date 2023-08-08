package dagger.hilt.internal.processedrootsentinel;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
/* renamed from: dagger.hilt.internal.processedrootsentinel.a */
public @interface C10285a {
    String[] roots();
}

package javax.annotation.meta;

import java.lang.annotation.Annotation;
import javax.annotation.Nonnull;

public interface TypeQualifierValidator<A extends Annotation> {
    @Nonnull
    /* renamed from: a */
    When mo21827a(@Nonnull A a, Object obj);
}

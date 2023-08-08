package dagger.hilt;

import dagger.hilt.internal.C10273b;
import dagger.hilt.internal.C10274c;
import dagger.hilt.internal.C10280f;
import dagger.hilt.internal.C10281g;
import java.lang.annotation.Annotation;
import javax.annotation.Nonnull;

/* renamed from: dagger.hilt.c */
public final class C10263c {

    /* renamed from: a */
    public static final String f27956a = "dagger.hilt.android.EarlyEntryPoint";

    @Nonnull
    /* renamed from: a */
    public static <T> T m38503a(Object obj, Class<T> cls) {
        if (obj instanceof C10273b) {
            if (obj instanceof C10281g) {
                C10280f.m38508d(!m38504b(cls, f27956a), "Interface, %s, annotated with @EarlyEntryPoint should be called with EarlyEntryPoints.get() rather than EntryPoints.get()", cls.getCanonicalName());
            }
            return cls.cast(obj);
        } else if (obj instanceof C10274c) {
            return m38503a(((C10274c) obj).generatedComponent(), cls);
        } else {
            throw new IllegalStateException(String.format("Given component holder %s does not implement %s or %s", new Object[]{obj.getClass(), C10273b.class, C10274c.class}));
        }
    }

    /* renamed from: b */
    public static boolean m38504b(Class<?> cls, String str) {
        for (Annotation annotationType : cls.getAnnotations()) {
            if (annotationType.annotationType().getCanonicalName().contentEquals(str)) {
                return true;
            }
        }
        return false;
    }
}

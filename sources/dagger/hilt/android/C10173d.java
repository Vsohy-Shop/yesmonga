package dagger.hilt.android;

import android.app.Application;
import android.content.Context;
import dagger.hilt.C10263c;
import dagger.hilt.android.internal.C10184a;
import dagger.hilt.internal.C10274c;
import dagger.hilt.internal.C10276d;
import dagger.hilt.internal.C10280f;
import dagger.hilt.internal.C10283h;
import java.lang.annotation.Annotation;
import javax.annotation.Nonnull;

/* renamed from: dagger.hilt.android.d */
public final class C10173d {
    @Nonnull
    /* renamed from: a */
    public static <T> T m38389a(Context context, Class<T> cls) {
        Application a = C10184a.m38402a(context);
        C10280f.m38508d(a instanceof C10276d, "Expected application to implement GeneratedComponentManagerHolder. Check that you're passing in an application context that uses Hilt. Application class found: %s", a.getClass());
        C10274c<?> componentManager = ((C10276d) a).componentManager();
        if (!(componentManager instanceof C10283h)) {
            return C10263c.m38503a(a, cls);
        }
        C10280f.m38508d(m38390b(cls, C10165c.class), "%s should be called with EntryPoints.get() rather than EarlyEntryPoints.get()", cls.getCanonicalName());
        return cls.cast(((C10283h) componentManager).mo21710e0());
    }

    /* renamed from: b */
    public static boolean m38390b(Class<?> cls, Class<? extends Annotation> cls2) {
        for (Annotation annotationType : cls.getAnnotations()) {
            if (annotationType.annotationType().equals(cls2)) {
                return true;
            }
        }
        return false;
    }
}

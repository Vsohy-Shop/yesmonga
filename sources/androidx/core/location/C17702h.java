package androidx.core.location;

import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.annotation.C0379x;
import androidx.core.util.C18001r;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.core.location.h */
public final class C17702h {

    /* renamed from: a */
    public static final String f46061a = "mockLocation";

    /* renamed from: b */
    public static final String f46062b = "verticalAccuracy";

    /* renamed from: c */
    public static final String f46063c = "speedAccuracy";

    /* renamed from: d */
    public static final String f46064d = "bearingAccuracy";

    /* renamed from: e */
    public static final String f46065e = "androidx.core.location.extra.MSL_ALTITUDE";

    /* renamed from: f */
    public static final String f46066f = "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY";
    @C0363p0

    /* renamed from: g */
    public static Method f46067g;

    @C0376v0(17)
    /* renamed from: androidx.core.location.h$a */
    public static class C17703a {
        @C0373u
        /* renamed from: a */
        public static long m80973a(Location location) {
            return location.getElapsedRealtimeNanos();
        }
    }

    @C0376v0(18)
    /* renamed from: androidx.core.location.h$b */
    public static class C17704b {
        @C0373u
        /* renamed from: a */
        public static boolean m80974a(Location location) {
            return location.isFromMockProvider();
        }
    }

    @C0376v0(26)
    /* renamed from: androidx.core.location.h$c */
    public static class C17705c {
        @C0373u
        /* renamed from: a */
        public static float m80975a(Location location) {
            return location.getBearingAccuracyDegrees();
        }

        @C0373u
        /* renamed from: b */
        public static float m80976b(Location location) {
            return location.getSpeedAccuracyMetersPerSecond();
        }

        @C0373u
        /* renamed from: c */
        public static float m80977c(Location location) {
            return location.getVerticalAccuracyMeters();
        }

        @C0373u
        /* renamed from: d */
        public static boolean m80978d(Location location) {
            return location.hasBearingAccuracy();
        }

        @C0373u
        /* renamed from: e */
        public static boolean m80979e(Location location) {
            return location.hasSpeedAccuracy();
        }

        @C0373u
        /* renamed from: f */
        public static boolean m80980f(Location location) {
            return location.hasVerticalAccuracy();
        }

        @C0373u
        /* renamed from: g */
        public static void m80981g(Location location, float f) {
            location.setBearingAccuracyDegrees(f);
        }

        @C0373u
        /* renamed from: h */
        public static void m80982h(Location location, float f) {
            location.setSpeedAccuracyMetersPerSecond(f);
        }

        @C0373u
        /* renamed from: i */
        public static void m80983i(Location location, float f) {
            location.setVerticalAccuracyMeters(f);
        }
    }

    /* renamed from: a */
    public static boolean m80948a(@C0359n0 Location location, String str) {
        Bundle extras = location.getExtras();
        if (extras == null || !extras.containsKey(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static float m80949b(@C0359n0 Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C17705c.m80975a(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat(f46064d, 0.0f);
    }

    /* renamed from: c */
    public static long m80950c(@C0359n0 Location location) {
        return TimeUnit.NANOSECONDS.toMillis(C17703a.m80973a(location));
    }

    /* renamed from: d */
    public static long m80951d(@C0359n0 Location location) {
        return C17703a.m80973a(location);
    }

    @C0379x(from = 0.0d)
    /* renamed from: e */
    public static float m80952e(@C0359n0 Location location) {
        C18001r.m81778o(m80960m(location), "The Mean Sea Level altitude accuracy of the location is not set.");
        return m80954g(location).getFloat(f46066f);
    }

    /* renamed from: f */
    public static double m80953f(@C0359n0 Location location) {
        C18001r.m81778o(m80959l(location), "The Mean Sea Level altitude of the location is not set.");
        return m80954g(location).getDouble(f46065e);
    }

    /* renamed from: g */
    public static Bundle m80954g(@C0359n0 Location location) {
        Bundle extras = location.getExtras();
        if (extras != null) {
            return extras;
        }
        location.setExtras(new Bundle());
        return location.getExtras();
    }

    /* renamed from: h */
    public static Method m80955h() throws NoSuchMethodException {
        if (f46067g == null) {
            Method declaredMethod = Location.class.getDeclaredMethod("setIsFromMockProvider", new Class[]{Boolean.TYPE});
            f46067g = declaredMethod;
            declaredMethod.setAccessible(true);
        }
        return f46067g;
    }

    /* renamed from: i */
    public static float m80956i(@C0359n0 Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C17705c.m80976b(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat(f46063c, 0.0f);
    }

    /* renamed from: j */
    public static float m80957j(@C0359n0 Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C17705c.m80977c(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat("verticalAccuracy", 0.0f);
    }

    /* renamed from: k */
    public static boolean m80958k(@C0359n0 Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C17705c.m80978d(location);
        }
        return m80948a(location, f46064d);
    }

    /* renamed from: l */
    public static boolean m80959l(@C0359n0 Location location) {
        return m80948a(location, f46065e);
    }

    /* renamed from: m */
    public static boolean m80960m(@C0359n0 Location location) {
        return m80948a(location, f46066f);
    }

    /* renamed from: n */
    public static boolean m80961n(@C0359n0 Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C17705c.m80979e(location);
        }
        return m80948a(location, f46063c);
    }

    /* renamed from: o */
    public static boolean m80962o(@C0359n0 Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C17705c.m80980f(location);
        }
        return m80948a(location, "verticalAccuracy");
    }

    /* renamed from: p */
    public static boolean m80963p(@C0359n0 Location location) {
        return C17704b.m80974a(location);
    }

    /* renamed from: q */
    public static void m80964q(@C0359n0 Location location, String str) {
        Bundle extras = location.getExtras();
        if (extras != null) {
            extras.remove(str);
            if (extras.isEmpty()) {
                location.setExtras((Bundle) null);
            }
        }
    }

    /* renamed from: r */
    public static void m80965r(@C0359n0 Location location) {
        m80964q(location, f46065e);
    }

    /* renamed from: s */
    public static void m80966s(@C0359n0 Location location) {
        m80964q(location, f46066f);
    }

    /* renamed from: t */
    public static void m80967t(@C0359n0 Location location, float f) {
        if (Build.VERSION.SDK_INT >= 26) {
            C17705c.m80981g(location, f);
        } else {
            m80954g(location).putFloat(f46064d, f);
        }
    }

    /* renamed from: u */
    public static void m80968u(@C0359n0 Location location, boolean z) {
        try {
            m80955h().invoke(location, new Object[]{Boolean.valueOf(z)});
        } catch (NoSuchMethodException e) {
            NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
            noSuchMethodError.initCause(e);
            throw noSuchMethodError;
        } catch (IllegalAccessException e2) {
            IllegalAccessError illegalAccessError = new IllegalAccessError();
            illegalAccessError.initCause(e2);
            throw illegalAccessError;
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: v */
    public static void m80969v(@C0359n0 Location location, @C0379x(from = 0.0d) float f) {
        m80954g(location).putFloat(f46066f, f);
    }

    /* renamed from: w */
    public static void m80970w(@C0359n0 Location location, double d) {
        m80954g(location).putDouble(f46065e, d);
    }

    /* renamed from: x */
    public static void m80971x(@C0359n0 Location location, float f) {
        if (Build.VERSION.SDK_INT >= 26) {
            C17705c.m80982h(location, f);
        } else {
            m80954g(location).putFloat(f46063c, f);
        }
    }

    /* renamed from: y */
    public static void m80972y(@C0359n0 Location location, float f) {
        if (Build.VERSION.SDK_INT >= 26) {
            C17705c.m80983i(location, f);
        } else {
            m80954g(location).putFloat("verticalAccuracy", f);
        }
    }
}

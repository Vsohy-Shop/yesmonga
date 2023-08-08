package androidx.core.util;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import java.util.Objects;

/* renamed from: androidx.core.util.m */
public class C17992m {

    @C0376v0(19)
    /* renamed from: androidx.core.util.m$a */
    public static class C17993a {
        @C0373u
        /* renamed from: a */
        public static boolean m81746a(Object obj, Object obj2) {
            return Objects.equals(obj, obj2);
        }

        @C0373u
        /* renamed from: b */
        public static int m81747b(Object... objArr) {
            return Objects.hash(objArr);
        }
    }

    /* renamed from: a */
    public static boolean m81740a(@C0363p0 Object obj, @C0363p0 Object obj2) {
        return C17993a.m81746a(obj, obj2);
    }

    /* renamed from: b */
    public static int m81741b(@C0363p0 Object... objArr) {
        return C17993a.m81747b(objArr);
    }

    /* renamed from: c */
    public static int m81742c(@C0363p0 Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    @C0359n0
    /* renamed from: d */
    public static <T> T m81743d(@C0363p0 T t) {
        t.getClass();
        return t;
    }

    @C0359n0
    /* renamed from: e */
    public static <T> T m81744e(@C0363p0 T t, @C0359n0 String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    @C0363p0
    /* renamed from: f */
    public static String m81745f(@C0363p0 Object obj, @C0363p0 String str) {
        return obj != null ? obj.toString() : str;
    }
}

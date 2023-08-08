package androidx.core.p027os;

import android.os.Build;
import android.os.Trace;
import androidx.annotation.C0359n0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import java.lang.reflect.Method;

@Deprecated
/* renamed from: androidx.core.os.p0 */
public final class C17821p0 {

    /* renamed from: a */
    public static final String f46205a = "TraceCompat";

    /* renamed from: b */
    public static long f46206b;

    /* renamed from: c */
    public static Method f46207c;

    /* renamed from: d */
    public static Method f46208d;

    /* renamed from: e */
    public static Method f46209e;

    /* renamed from: f */
    public static Method f46210f;

    @C0376v0(18)
    /* renamed from: androidx.core.os.p0$a */
    public static class C17822a {
        @C0373u
        /* renamed from: a */
        public static void m81253a(String str) {
            Trace.beginSection(str);
        }

        @C0373u
        /* renamed from: b */
        public static void m81254b() {
            Trace.endSection();
        }
    }

    @C0376v0(29)
    /* renamed from: androidx.core.os.p0$b */
    public static class C17823b {
        @C0373u
        /* renamed from: a */
        public static void m81255a(String str, int i) {
            Trace.beginAsyncSection(str, i);
        }

        @C0373u
        /* renamed from: b */
        public static void m81256b(String str, int i) {
            Trace.endAsyncSection(str, i);
        }

        @C0373u
        /* renamed from: c */
        public static boolean m81257c() {
            return Trace.isEnabled();
        }

        @C0373u
        /* renamed from: d */
        public static void m81258d(String str, long j) {
            Trace.setCounter(str, j);
        }
    }

    static {
        Class<String> cls = String.class;
        Class<Trace> cls2 = Trace.class;
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f46206b = cls2.getField("TRACE_TAG_APP").getLong((Object) null);
                Class cls3 = Long.TYPE;
                f46207c = cls2.getMethod("isTagEnabled", new Class[]{cls3});
                Class cls4 = Integer.TYPE;
                f46208d = cls2.getMethod("asyncTraceBegin", new Class[]{cls3, cls, cls4});
                f46209e = cls2.getMethod("asyncTraceEnd", new Class[]{cls3, cls, cls4});
                f46210f = cls2.getMethod("traceCounter", new Class[]{cls3, cls, cls4});
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m81247a(@C0359n0 String str, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            C17823b.m81255a(str, i);
            return;
        }
        try {
            f46208d.invoke((Object) null, new Object[]{Long.valueOf(f46206b), str, Integer.valueOf(i)});
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public static void m81248b(@C0359n0 String str) {
        C17822a.m81253a(str);
    }

    /* renamed from: c */
    public static void m81249c(@C0359n0 String str, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            C17823b.m81256b(str, i);
            return;
        }
        try {
            f46209e.invoke((Object) null, new Object[]{Long.valueOf(f46206b), str, Integer.valueOf(i)});
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    public static void m81250d() {
        C17822a.m81254b();
    }

    /* renamed from: e */
    public static boolean m81251e() {
        if (Build.VERSION.SDK_INT >= 29) {
            return C17823b.m81257c();
        }
        try {
            return ((Boolean) f46207c.invoke((Object) null, new Object[]{Long.valueOf(f46206b)})).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: f */
    public static void m81252f(@C0359n0 String str, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            C17823b.m81258d(str, (long) i);
            return;
        }
        try {
            f46210f.invoke((Object) null, new Object[]{Long.valueOf(f46206b), str, Integer.valueOf(i)});
        } catch (Exception unused) {
        }
    }
}

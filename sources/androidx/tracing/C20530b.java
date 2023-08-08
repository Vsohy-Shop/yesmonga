package androidx.tracing;

import android.annotation.SuppressLint;
import android.os.Trace;
import androidx.annotation.C0359n0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.tracing.b */
public final class C20530b {

    /* renamed from: a */
    public static final String f52972a = "Trace";

    /* renamed from: b */
    public static long f52973b;

    /* renamed from: c */
    public static Method f52974c;

    /* renamed from: d */
    public static Method f52975d;

    /* renamed from: e */
    public static Method f52976e;

    /* renamed from: f */
    public static Method f52977f;

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static void m95650a(@C0359n0 String str, int i) {
        try {
            if (f52975d == null) {
                C20532d.m95663a(str, i);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        m95651b(str, i);
    }

    /* renamed from: b */
    public static void m95651b(@C0359n0 String str, int i) {
        try {
            if (f52975d == null) {
                f52975d = Trace.class.getMethod("asyncTraceBegin", new Class[]{Long.TYPE, String.class, Integer.TYPE});
            }
            f52975d.invoke((Object) null, new Object[]{Long.valueOf(f52973b), str, Integer.valueOf(i)});
        } catch (Exception e) {
            m95656g("asyncTraceBegin", e);
        }
    }

    /* renamed from: c */
    public static void m95652c(@C0359n0 String str) {
        C20531c.m95661a(str);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: d */
    public static void m95653d(@C0359n0 String str, int i) {
        try {
            if (f52976e == null) {
                C20532d.m95664b(str, i);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        m95654e(str, i);
    }

    /* renamed from: e */
    public static void m95654e(@C0359n0 String str, int i) {
        try {
            if (f52976e == null) {
                f52976e = Trace.class.getMethod("asyncTraceEnd", new Class[]{Long.TYPE, String.class, Integer.TYPE});
            }
            f52976e.invoke((Object) null, new Object[]{Long.valueOf(f52973b), str, Integer.valueOf(i)});
        } catch (Exception e) {
            m95656g("asyncTraceEnd", e);
        }
    }

    /* renamed from: f */
    public static void m95655f() {
        C20531c.m95662b();
    }

    /* renamed from: g */
    public static void m95656g(@C0359n0 String str, @C0359n0 Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to call ");
        sb.append(str);
        sb.append(" via reflection");
    }

    @SuppressLint({"NewApi"})
    /* renamed from: h */
    public static boolean m95657h() {
        try {
            if (f52974c == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return m95658i();
    }

    /* renamed from: i */
    public static boolean m95658i() {
        Class<Trace> cls = Trace.class;
        try {
            if (f52974c == null) {
                f52973b = cls.getField("TRACE_TAG_APP").getLong((Object) null);
                f52974c = cls.getMethod("isTagEnabled", new Class[]{Long.TYPE});
            }
            return ((Boolean) f52974c.invoke((Object) null, new Object[]{Long.valueOf(f52973b)})).booleanValue();
        } catch (Exception e) {
            m95656g("isTagEnabled", e);
            return false;
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: j */
    public static void m95659j(@C0359n0 String str, int i) {
        try {
            if (f52977f == null) {
                C20532d.m95665c(str, i);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        m95660k(str, i);
    }

    /* renamed from: k */
    public static void m95660k(@C0359n0 String str, int i) {
        try {
            if (f52977f == null) {
                f52977f = Trace.class.getMethod("traceCounter", new Class[]{Long.TYPE, String.class, Integer.TYPE});
            }
            f52977f.invoke((Object) null, new Object[]{Long.valueOf(f52973b), str, Integer.valueOf(i)});
        } catch (Exception e) {
            m95656g("traceCounter", e);
        }
    }
}

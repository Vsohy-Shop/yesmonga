package org.joda.time.p014tz;

/* renamed from: org.joda.time.tz.f */
public class C12731f {

    /* renamed from: a */
    public static ThreadLocal<Boolean> f31439a = new C12732a();

    /* renamed from: org.joda.time.tz.f$a */
    public static class C12732a extends ThreadLocal<Boolean> {
        /* renamed from: a */
        public Boolean initialValue() {
            return Boolean.FALSE;
        }
    }

    /* renamed from: a */
    public static void m54753a(boolean z) {
        f31439a.set(Boolean.valueOf(z));
    }

    /* renamed from: b */
    public static boolean m54754b() {
        return f31439a.get().booleanValue();
    }
}

package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.m9 */
public final class C42075m9 implements C42212ua {

    /* renamed from: a */
    public static final C42075m9 f106296a = new C42075m9();

    /* renamed from: c */
    public static C42075m9 m170560c() {
        return f106296a;
    }

    /* renamed from: a */
    public final C42195ta mo137154a(Class cls) {
        Class<C42177s9> cls2 = C42177s9.class;
        if (cls2.isAssignableFrom(cls)) {
            try {
                return (C42195ta) C42177s9.m170817l(cls.asSubclass(cls2)).mo136501A(3, (Object) null, (Object) null);
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
            }
        } else {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
    }

    /* renamed from: b */
    public final boolean mo137155b(Class cls) {
        return C42177s9.class.isAssignableFrom(cls);
    }
}

package com.contentsquare.android.sdk;

/* renamed from: com.contentsquare.android.sdk.i5 */
public enum C14416i5 {
    VOID(Void.class, Void.class, (Class<?>) null),
    INT(r1, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(C14719t0.class, C14719t0.class, C14719t0.f36442b),
    ENUM(r1, Integer.class, (Class<?>) null),
    MESSAGE(Object.class, Object.class, (Class<?>) null);
    

    /* renamed from: a */
    public final Class<?> f35633a;

    /* renamed from: b */
    public final Class<?> f35634b;

    /* renamed from: c */
    public final Object f35635c;

    /* access modifiers changed from: public */
    C14416i5(Class<?> cls, Class<?> cls2, Object obj) {
        this.f35633a = cls;
        this.f35634b = cls2;
        this.f35635c = obj;
    }

    /* renamed from: g */
    public Class<?> mo35520g() {
        return this.f35634b;
    }
}

package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

public enum zbyf {
    VOID(Void.class, Void.class, (Class<?>) null),
    INT(r13, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(zbwp.class, zbwp.class, zbwp.f71626a),
    ENUM(r13, Integer.class, (Class<?>) null),
    MESSAGE(Object.class, Object.class, (Class<?>) null);
    
    private final Class<?> zbl;
    private final Class<?> zbm;
    private final Object zbn;

    /* access modifiers changed from: public */
    zbyf(Class<?> cls, Class<?> cls2, Object obj) {
        this.zbl = cls;
        this.zbm = cls2;
        this.zbn = obj;
    }

    /* renamed from: g */
    public final Class<?> mo85005g() {
        return this.zbm;
    }
}

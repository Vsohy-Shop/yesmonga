package com.google.protobuf;

public enum JavaType {
    VOID(Void.class, Void.class, (Class<?>) null),
    INT(r13, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(ByteString.class, ByteString.class, ByteString.f82785d),
    ENUM(r13, Integer.class, (Class<?>) null),
    MESSAGE(Object.class, Object.class, (Class<?>) null);
    
    private final Class<?> boxedType;
    private final Object defaultDefault;
    private final Class<?> type;

    /* access modifiers changed from: public */
    JavaType(Class<?> cls, Class<?> cls2, Object obj) {
        this.type = cls;
        this.boxedType = cls2;
        this.defaultDefault = obj;
    }

    /* renamed from: g */
    public Class<?> mo100520g() {
        return this.boxedType;
    }

    /* renamed from: q */
    public Object mo100521q() {
        return this.defaultDefault;
    }

    /* renamed from: r */
    public Class<?> mo100522r() {
        return this.type;
    }

    /* renamed from: w */
    public boolean mo100523w(Class<?> cls) {
        return this.type.isAssignableFrom(cls);
    }
}

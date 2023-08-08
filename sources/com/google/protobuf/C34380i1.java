package com.google.protobuf;

/* renamed from: com.google.protobuf.i1 */
public final class C34380i1 {

    /* renamed from: a */
    public static final C34371g1 f83284a = m139305c();

    /* renamed from: b */
    public static final C34371g1 f83285b = new C34375h1();

    /* renamed from: a */
    public static C34371g1 m139303a() {
        return f83284a;
    }

    /* renamed from: b */
    public static C34371g1 m139304b() {
        return f83285b;
    }

    /* renamed from: c */
    public static C34371g1 m139305c() {
        try {
            return (C34371g1) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}

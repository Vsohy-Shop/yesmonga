package com.google.protobuf;

/* renamed from: com.google.protobuf.j0 */
public final class C34385j0 {

    /* renamed from: a */
    public static final C34374h0<?> f83296a = new C34378i0();

    /* renamed from: b */
    public static final C34374h0<?> f83297b = m139432c();

    /* renamed from: a */
    public static C34374h0<?> m139430a() {
        C34374h0<?> h0Var = f83297b;
        if (h0Var != null) {
            return h0Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    public static C34374h0<?> m139431b() {
        return f83296a;
    }

    /* renamed from: c */
    public static C34374h0<?> m139432c() {
        try {
            return (C34374h0) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}

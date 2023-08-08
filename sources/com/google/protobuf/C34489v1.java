package com.google.protobuf;

/* renamed from: com.google.protobuf.v1 */
public final class C34489v1 {

    /* renamed from: a */
    public static final C34463t1 f83547a = m140628c();

    /* renamed from: b */
    public static final C34463t1 f83548b = new C34468u1();

    /* renamed from: a */
    public static C34463t1 m140626a() {
        return f83547a;
    }

    /* renamed from: b */
    public static C34463t1 m140627b() {
        return f83548b;
    }

    /* renamed from: c */
    public static C34463t1 m140628c() {
        try {
            return (C34463t1) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}

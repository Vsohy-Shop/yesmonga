package com.contentsquare.android.sdk;

/* renamed from: com.contentsquare.android.sdk.t8 */
public final class C14741t8 {

    /* renamed from: a */
    public static final C14612p7 f36496a = m63556c();

    /* renamed from: b */
    public static final C14612p7 f36497b = new C14303e8();

    /* renamed from: a */
    public static C14612p7 m63554a() {
        return f36496a;
    }

    /* renamed from: b */
    public static C14612p7 m63555b() {
        return f36497b;
    }

    /* renamed from: c */
    public static C14612p7 m63556c() {
        try {
            return (C14612p7) Class.forName("com.contentsquare.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}

package com.contentsquare.android.sdk;

/* renamed from: com.contentsquare.android.sdk.p5 */
public final class C14610p5 {

    /* renamed from: a */
    public static final C14393h4 f36168a = m62926c();

    /* renamed from: b */
    public static final C14393h4 f36169b = new C14848x4();

    /* renamed from: a */
    public static C14393h4 m62924a() {
        return f36168a;
    }

    /* renamed from: b */
    public static C14393h4 m62925b() {
        return f36169b;
    }

    /* renamed from: c */
    public static C14393h4 m62926c() {
        try {
            return (C14393h4) Class.forName("com.contentsquare.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}

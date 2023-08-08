package com.contentsquare.android.sdk;

/* renamed from: com.contentsquare.android.sdk.v4 */
public final class C14791v4 {

    /* renamed from: a */
    public static final C14517m3<?> f36677a = new C14293e4();

    /* renamed from: b */
    public static final C14517m3<?> f36678b = m63758c();

    /* renamed from: a */
    public static C14517m3<?> m63756a() {
        C14517m3<?> m3Var = f36678b;
        if (m3Var != null) {
            return m3Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    public static C14517m3<?> m63757b() {
        return f36677a;
    }

    /* renamed from: c */
    public static C14517m3<?> m63758c() {
        try {
            return (C14517m3) Class.forName("com.contentsquare.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}

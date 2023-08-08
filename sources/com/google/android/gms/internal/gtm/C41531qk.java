package com.google.android.gms.internal.gtm;

/* renamed from: com.google.android.gms.internal.gtm.qk */
public final class C41531qk {

    /* renamed from: a */
    public static final C41507pk f104912a;

    /* renamed from: b */
    public static final C41507pk f104913b = new C41507pk();

    static {
        C41507pk pkVar;
        try {
            pkVar = (C41507pk) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            pkVar = null;
        }
        f104912a = pkVar;
    }

    /* renamed from: a */
    public static C41507pk m168270a() {
        return f104912a;
    }

    /* renamed from: b */
    public static C41507pk m168271b() {
        return f104913b;
    }
}

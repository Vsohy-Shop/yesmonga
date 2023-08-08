package com.google.android.gms.internal.gtm;

/* renamed from: com.google.android.gms.internal.gtm.zi */
public final class C41745zi {

    /* renamed from: a */
    public static final C41697xi<?> f105326a = new C41721yi();

    /* renamed from: b */
    public static final C41697xi<?> f105327b;

    static {
        C41697xi<?> xiVar;
        try {
            xiVar = (C41697xi) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            xiVar = null;
        }
        f105327b = xiVar;
    }

    /* renamed from: a */
    public static C41697xi<?> m168944a() {
        C41697xi<?> xiVar = f105327b;
        if (xiVar != null) {
            return xiVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    public static C41697xi<?> m168945b() {
        return f105326a;
    }
}

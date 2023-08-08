package com.google.android.gms.internal.gtm;

/* renamed from: com.google.android.gms.internal.gtm.bl */
public final class C41171bl {

    /* renamed from: a */
    public static final C41147al f104476a;

    /* renamed from: b */
    public static final C41147al f104477b = new C41147al();

    static {
        C41147al alVar;
        try {
            alVar = (C41147al) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            alVar = null;
        }
        f104476a = alVar;
    }

    /* renamed from: a */
    public static C41147al m167222a() {
        return f104476a;
    }

    /* renamed from: b */
    public static C41147al m167223b() {
        return f104477b;
    }
}

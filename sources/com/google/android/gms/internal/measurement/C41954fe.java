package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.fe */
public final class C41954fe implements C41936ee {

    /* renamed from: a */
    public static final C41983h7 f106132a;

    /* renamed from: b */
    public static final C41983h7 f106133b;

    /* renamed from: c */
    public static final C41983h7 f106134c;

    /* renamed from: d */
    public static final C41983h7 f106135d;

    static {
        C41911d7 a = new C41911d7(C42225v6.m170951a("com.google.android.gms.measurement")).mo136681a();
        f106132a = a.mo136686f("measurement.sdk.collection.enable_extend_user_property_size", true);
        f106133b = a.mo136686f("measurement.sdk.collection.last_deep_link_referrer2", true);
        f106134c = a.mo136686f("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        f106135d = a.mo136684d("measurement.id.sdk.collection.last_deep_link_referrer2", 0);
    }

    public final boolean zza() {
        return ((Boolean) f106134c.mo137007b()).booleanValue();
    }
}

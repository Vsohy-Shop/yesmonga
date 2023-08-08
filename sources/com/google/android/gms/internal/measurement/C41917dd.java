package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.dd */
public final class C41917dd implements C41899cd {

    /* renamed from: a */
    public static final C41983h7 f106081a;

    /* renamed from: b */
    public static final C41983h7 f106082b;

    /* renamed from: c */
    public static final C41983h7 f106083c;

    static {
        C41911d7 a = new C41911d7(C42225v6.m170951a("com.google.android.gms.measurement")).mo136682b().mo136681a();
        f106081a = a.mo136686f("measurement.collection.event_safelist", true);
        f106082b = a.mo136686f("measurement.service.store_null_safelist", true);
        f106083c = a.mo136686f("measurement.service.store_safelist", true);
    }

    /* renamed from: d */
    public final boolean mo136665d() {
        return ((Boolean) f106083c.mo137007b()).booleanValue();
    }

    public final boolean zza() {
        return true;
    }

    public final boolean zzb() {
        return ((Boolean) f106082b.mo137007b()).booleanValue();
    }
}

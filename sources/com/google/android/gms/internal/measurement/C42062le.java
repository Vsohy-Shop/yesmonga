package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.le */
public final class C42062le implements C42044ke {

    /* renamed from: a */
    public static final C41983h7 f106284a;

    /* renamed from: b */
    public static final C41983h7 f106285b;

    static {
        C41911d7 a = new C41911d7(C42225v6.m170951a("com.google.android.gms.measurement")).mo136682b().mo136681a();
        f106284a = a.mo136686f("measurement.collection.client.log_target_api_version.dev", false);
        f106285b = a.mo136686f("measurement.collection.service.log_target_api_version", false);
    }

    /* renamed from: d */
    public final boolean mo137091d() {
        return ((Boolean) f106285b.mo137007b()).booleanValue();
    }

    public final boolean zza() {
        return true;
    }

    public final boolean zzb() {
        return ((Boolean) f106284a.mo137007b()).booleanValue();
    }
}

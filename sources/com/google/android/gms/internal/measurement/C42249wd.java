package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.wd */
public final class C42249wd implements C42232vd {

    /* renamed from: a */
    public static final C41983h7 f106482a;

    /* renamed from: b */
    public static final C41983h7 f106483b;

    /* renamed from: c */
    public static final C41983h7 f106484c;

    /* renamed from: d */
    public static final C41983h7 f106485d;

    static {
        C41911d7 a = new C41911d7(C42225v6.m170951a("com.google.android.gms.measurement")).mo136682b().mo136681a();
        f106482a = a.mo136686f("measurement.client.global_params", true);
        f106483b = a.mo136686f("measurement.service.global_params_in_payload", true);
        f106484c = a.mo136686f("measurement.service.clear_global_params_on_uninstall", true);
        f106485d = a.mo136686f("measurement.service.global_params", true);
    }

    public final boolean zza() {
        return true;
    }

    public final boolean zzb() {
        return ((Boolean) f106484c.mo137007b()).booleanValue();
    }
}

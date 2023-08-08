package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ce */
public final class C41900ce implements C41882be {

    /* renamed from: a */
    public static final C41983h7 f106056a;

    /* renamed from: b */
    public static final C41983h7 f106057b;

    static {
        C41911d7 a = new C41911d7(C42225v6.m170951a("com.google.android.gms.measurement")).mo136682b().mo136681a();
        f106056a = a.mo136686f("measurement.item_scoped_custom_parameters.client", true);
        f106057b = a.mo136686f("measurement.item_scoped_custom_parameters.service", false);
    }

    /* renamed from: d */
    public final boolean mo136636d() {
        return ((Boolean) f106057b.mo137007b()).booleanValue();
    }

    public final boolean zza() {
        return true;
    }

    public final boolean zzb() {
        return ((Boolean) f106056a.mo137007b()).booleanValue();
    }
}

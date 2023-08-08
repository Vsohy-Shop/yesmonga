package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.hf */
public final class C41991hf implements C41973gf {

    /* renamed from: a */
    public static final C41983h7 f106195a;

    /* renamed from: b */
    public static final C41983h7 f106196b;

    /* renamed from: c */
    public static final C41983h7 f106197c;

    static {
        C41911d7 a = new C41911d7(C42225v6.m170951a("com.google.android.gms.measurement")).mo136682b().mo136681a();
        f106195a = a.mo136686f("measurement.collection.enable_session_stitching_token.client.dev", true);
        f106196b = a.mo136686f("measurement.collection.enable_session_stitching_token.first_open_fix", true);
        f106197c = a.mo136686f("measurement.session_stitching_token_enabled", false);
    }

    /* renamed from: d */
    public final boolean mo136885d() {
        return ((Boolean) f106196b.mo137007b()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo136886e() {
        return ((Boolean) f106197c.mo137007b()).booleanValue();
    }

    public final boolean zza() {
        return true;
    }

    public final boolean zzb() {
        return ((Boolean) f106195a.mo137007b()).booleanValue();
    }
}

package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.kf */
public final class C42045kf implements C42027jf {

    /* renamed from: a */
    public static final C41983h7 f106271a;

    /* renamed from: b */
    public static final C41983h7 f106272b;

    /* renamed from: c */
    public static final C41983h7 f106273c;

    /* renamed from: d */
    public static final C41983h7 f106274d;

    /* renamed from: e */
    public static final C41983h7 f106275e;

    static {
        C41911d7 a = new C41911d7(C42225v6.m170951a("com.google.android.gms.measurement")).mo136682b().mo136681a();
        f106271a = a.mo136686f("measurement.client.sessions.background_sessions_enabled", true);
        f106272b = a.mo136686f("measurement.client.sessions.enable_fix_background_engagement", false);
        f106273c = a.mo136686f("measurement.client.sessions.immediate_start_enabled_foreground", true);
        f106274d = a.mo136686f("measurement.client.sessions.remove_expired_session_properties_enabled", true);
        f106275e = a.mo136686f("measurement.client.sessions.session_id_enabled", true);
    }

    public final boolean zza() {
        return ((Boolean) f106272b.mo137007b()).booleanValue();
    }
}

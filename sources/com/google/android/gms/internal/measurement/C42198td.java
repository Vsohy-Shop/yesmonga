package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.td */
public final class C42198td implements C42181sd {

    /* renamed from: a */
    public static final C41983h7 f106431a;

    /* renamed from: b */
    public static final C41983h7 f106432b;

    /* renamed from: c */
    public static final C41983h7 f106433c;

    static {
        C41911d7 a = new C41911d7(C42225v6.m170951a("com.google.android.gms.measurement")).mo136681a();
        f106431a = a.mo136686f("measurement.client.sessions.check_on_reset_and_enable2", true);
        f106432b = a.mo136686f("measurement.client.sessions.check_on_startup", true);
        f106433c = a.mo136686f("measurement.client.sessions.start_session_before_view_screen", true);
    }

    public final boolean zza() {
        return true;
    }

    public final boolean zzb() {
        return ((Boolean) f106431a.mo137007b()).booleanValue();
    }
}

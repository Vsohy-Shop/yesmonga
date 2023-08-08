package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ie */
public final class C42008ie implements C41990he {

    /* renamed from: a */
    public static final C41983h7 f106222a;

    /* renamed from: b */
    public static final C41983h7 f106223b;

    /* renamed from: c */
    public static final C41983h7 f106224c;

    static {
        C41911d7 a = new C41911d7(C42225v6.m170951a("com.google.android.gms.measurement")).mo136681a();
        f106222a = a.mo136684d("measurement.id.lifecycle.app_in_background_parameter", 0);
        f106223b = a.mo136686f("measurement.lifecycle.app_backgrounded_tracking", true);
        f106224c = a.mo136686f("measurement.lifecycle.app_in_background_parameter", false);
    }

    public final boolean zza() {
        return ((Boolean) f106224c.mo137007b()).booleanValue();
    }
}

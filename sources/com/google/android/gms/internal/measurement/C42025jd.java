package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.jd */
public final class C42025jd implements C42007id {

    /* renamed from: a */
    public static final C41983h7 f106243a;

    /* renamed from: b */
    public static final C41983h7 f106244b;

    /* renamed from: c */
    public static final C41983h7 f106245c;

    /* renamed from: d */
    public static final C41983h7 f106246d;

    static {
        C41911d7 a = new C41911d7(C42225v6.m170951a("com.google.android.gms.measurement")).mo136681a();
        f106243a = a.mo136686f("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f106244b = a.mo136686f("measurement.audience.refresh_event_count_filters_timestamp", false);
        f106245c = a.mo136686f("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f106246d = a.mo136686f("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    /* renamed from: d */
    public final boolean mo137037d() {
        return ((Boolean) f106245c.mo137007b()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo137038e() {
        return ((Boolean) f106246d.mo137007b()).booleanValue();
    }

    public final boolean zza() {
        return true;
    }

    public final boolean zzb() {
        return ((Boolean) f106244b.mo137007b()).booleanValue();
    }
}

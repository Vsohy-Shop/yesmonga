package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.pe */
public final class C42131pe implements C42114oe {

    /* renamed from: a */
    public static final C41983h7 f106344a;

    /* renamed from: b */
    public static final C41983h7 f106345b;

    /* renamed from: c */
    public static final C41983h7 f106346c;

    /* renamed from: d */
    public static final C41983h7 f106347d;

    /* renamed from: e */
    public static final C41983h7 f106348e;

    static {
        C41911d7 a = new C41911d7(C42225v6.m170951a("com.google.android.gms.measurement")).mo136681a();
        f106344a = a.mo136686f("measurement.test.boolean_flag", false);
        f106345b = a.mo136683c("measurement.test.double_flag", -3.0d);
        f106346c = a.mo136684d("measurement.test.int_flag", -2);
        f106347d = a.mo136684d("measurement.test.long_flag", -1);
        f106348e = a.mo136685e("measurement.test.string_flag", "---");
    }

    /* renamed from: d */
    public final long mo137204d() {
        return ((Long) f106347d.mo137007b()).longValue();
    }

    /* renamed from: e */
    public final String mo137205e() {
        return (String) f106348e.mo137007b();
    }

    /* renamed from: f */
    public final boolean mo137206f() {
        return ((Boolean) f106344a.mo137007b()).booleanValue();
    }

    public final double zza() {
        return ((Double) f106345b.mo137007b()).doubleValue();
    }

    public final long zzb() {
        return ((Long) f106346c.mo137007b()).longValue();
    }
}

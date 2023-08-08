package com.google.android.gms.internal.measurement;

import android.net.Uri;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.internal.measurement.d7 */
public final class C41911d7 {

    /* renamed from: a */
    public final Uri f106070a;

    /* renamed from: b */
    public final String f106071b;

    /* renamed from: c */
    public final String f106072c;

    /* renamed from: d */
    public final boolean f106073d;

    /* renamed from: e */
    public final boolean f106074e;

    public C41911d7(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, @Nullable C42055l7 l7Var) {
        this.f106070a = uri;
        this.f106071b = "";
        this.f106072c = "";
        this.f106073d = z;
        this.f106074e = z3;
    }

    /* renamed from: a */
    public final C41911d7 mo136681a() {
        return new C41911d7((String) null, this.f106070a, this.f106071b, this.f106072c, this.f106073d, false, true, false, (C42055l7) null);
    }

    /* renamed from: b */
    public final C41911d7 mo136682b() {
        if (this.f106071b.isEmpty()) {
            return new C41911d7((String) null, this.f106070a, this.f106071b, this.f106072c, true, false, this.f106074e, false, (C42055l7) null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    /* renamed from: c */
    public final C41983h7 mo136683c(String str, double d) {
        return new C41875b7(this, "measurement.test.double_flag", Double.valueOf(-3.0d), true);
    }

    /* renamed from: d */
    public final C41983h7 mo136684d(String str, long j) {
        return new C42293z6(this, str, Long.valueOf(j), true);
    }

    /* renamed from: e */
    public final C41983h7 mo136685e(String str, String str2) {
        return new C41893c7(this, str, str2, true);
    }

    /* renamed from: f */
    public final C41983h7 mo136686f(String str, boolean z) {
        return new C41857a7(this, str, Boolean.valueOf(z), true);
    }

    public C41911d7(Uri uri) {
        this((String) null, uri, "", "", false, false, false, false, (C42055l7) null);
    }
}

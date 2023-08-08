package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.gb */
public final class C41969gb implements C42195ta {

    /* renamed from: a */
    public final C42246wa f106152a;

    /* renamed from: b */
    public final String f106153b;

    /* renamed from: c */
    public final Object[] f106154c;

    /* renamed from: d */
    public final int f106155d;

    public C41969gb(C42246wa waVar, String str, Object[] objArr) {
        this.f106152a = waVar;
        this.f106153b = str;
        this.f106154c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f106155d = charAt;
            return;
        }
        char c = charAt & 8191;
        int i = 1;
        int i2 = 13;
        while (true) {
            int i3 = i + 1;
            char charAt2 = str.charAt(i);
            if (charAt2 >= 55296) {
                c |= (charAt2 & 8191) << i2;
                i2 += 13;
                i = i3;
            } else {
                this.f106155d = c | (charAt2 << i2);
                return;
            }
        }
    }

    /* renamed from: a */
    public final String mo136879a() {
        return this.f106153b;
    }

    /* renamed from: b */
    public final Object[] mo136880b() {
        return this.f106154c;
    }

    /* renamed from: d */
    public final int mo136881d() {
        return (this.f106155d & 1) == 1 ? 1 : 2;
    }

    public final C42246wa zza() {
        return this.f106152a;
    }

    public final boolean zzb() {
        return (this.f106155d & 2) == 2;
    }
}

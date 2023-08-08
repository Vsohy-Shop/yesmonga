package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.measurement.internal.r */
public final class C30859r {

    /* renamed from: a */
    public final String f73885a;

    /* renamed from: b */
    public final String f73886b;

    /* renamed from: c */
    public final long f73887c;

    /* renamed from: d */
    public final long f73888d;

    /* renamed from: e */
    public final long f73889e;

    /* renamed from: f */
    public final long f73890f;

    /* renamed from: g */
    public final long f73891g;

    /* renamed from: h */
    public final Long f73892h;

    /* renamed from: i */
    public final Long f73893i;

    /* renamed from: j */
    public final Long f73894j;

    /* renamed from: k */
    public final Boolean f73895k;

    public C30859r(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        boolean z;
        boolean z2;
        boolean z3;
        long j6 = j;
        long j7 = j2;
        long j8 = j3;
        long j9 = j5;
        C40843u.m166198h(str);
        C40843u.m166198h(str2);
        boolean z4 = true;
        if (j6 >= 0) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166191a(z);
        if (j7 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C40843u.m166191a(z2);
        if (j8 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C40843u.m166191a(z3);
        C40843u.m166191a(j9 < 0 ? false : z4);
        this.f73885a = str;
        this.f73886b = str2;
        this.f73887c = j6;
        this.f73888d = j7;
        this.f73889e = j8;
        this.f73890f = j4;
        this.f73891g = j9;
        this.f73892h = l;
        this.f73893i = l2;
        this.f73894j = l3;
        this.f73895k = bool;
    }

    /* renamed from: a */
    public final C30859r mo87451a(Long l, Long l2, Boolean bool) {
        if (bool != null) {
            bool.booleanValue();
        }
        return new C30859r(this.f73885a, this.f73886b, this.f73887c, this.f73888d, this.f73889e, this.f73890f, this.f73891g, this.f73892h, l, l2, bool);
    }

    /* renamed from: b */
    public final C30859r mo87452b(long j, long j2) {
        return new C30859r(this.f73885a, this.f73886b, this.f73887c, this.f73888d, this.f73889e, this.f73890f, j, Long.valueOf(j2), this.f73893i, this.f73894j, this.f73895k);
    }

    /* renamed from: c */
    public final C30859r mo87453c(long j) {
        return new C30859r(this.f73885a, this.f73886b, this.f73887c, this.f73888d, this.f73889e, j, this.f73891g, this.f73892h, this.f73893i, this.f73894j, this.f73895k);
    }
}

package com.contentsquare.android.error;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.contentsquare.android.error.a */
public final class C14117a {

    /* renamed from: a */
    public final long f34914a;

    /* renamed from: b */
    public final String f34915b;

    /* renamed from: c */
    public final String f34916c;

    /* renamed from: d */
    public final int f34917d;

    /* renamed from: e */
    public final long f34918e;

    /* renamed from: f */
    public final long f34919f;

    public C14117a(long j, String str, String str2, int i, long j2, long j3) {
        Intrinsics.checkNotNullParameter(str, "httpMethod");
        Intrinsics.checkNotNullParameter(str2, "url");
        this.f34914a = j;
        this.f34915b = str;
        this.f34916c = str2;
        this.f34917d = i;
        this.f34918e = j2;
        this.f34919f = j3;
    }

    /* renamed from: h */
    public static /* synthetic */ C14117a m60651h(C14117a aVar, long j, String str, String str2, int i, long j2, long j3, int i2, Object obj) {
        C14117a aVar2 = aVar;
        return aVar.mo34367g((i2 & 1) != 0 ? aVar2.f34914a : j, (i2 & 2) != 0 ? aVar2.f34915b : str, (i2 & 4) != 0 ? aVar2.f34916c : str2, (i2 & 8) != 0 ? aVar2.f34917d : i, (i2 & 16) != 0 ? aVar2.f34918e : j2, (i2 & 32) != 0 ? aVar2.f34919f : j3);
    }

    /* renamed from: a */
    public final long mo34360a() {
        return this.f34914a;
    }

    /* renamed from: b */
    public final String mo34361b() {
        return this.f34915b;
    }

    /* renamed from: c */
    public final String mo34362c() {
        return this.f34916c;
    }

    /* renamed from: d */
    public final int mo34363d() {
        return this.f34917d;
    }

    /* renamed from: e */
    public final long mo34364e() {
        return this.f34918e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14117a)) {
            return false;
        }
        C14117a aVar = (C14117a) obj;
        return this.f34914a == aVar.f34914a && Intrinsics.areEqual((Object) this.f34915b, (Object) aVar.f34915b) && Intrinsics.areEqual((Object) this.f34916c, (Object) aVar.f34916c) && this.f34917d == aVar.f34917d && this.f34918e == aVar.f34918e && this.f34919f == aVar.f34919f;
    }

    /* renamed from: f */
    public final long mo34366f() {
        return this.f34919f;
    }

    /* renamed from: g */
    public final C14117a mo34367g(long j, String str, String str2, int i, long j2, long j3) {
        Intrinsics.checkNotNullParameter(str, "httpMethod");
        Intrinsics.checkNotNullParameter(str2, "url");
        return new C14117a(j, str, str2, i, j2, j3);
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.f34914a) * 31;
        String str = this.f34915b;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f34916c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((((hashCode2 + i) * 31) + Integer.hashCode(this.f34917d)) * 31) + Long.hashCode(this.f34918e)) * 31) + Long.hashCode(this.f34919f);
    }

    /* renamed from: i */
    public final String mo34369i() {
        return this.f34915b;
    }

    /* renamed from: j */
    public final long mo34370j() {
        return this.f34918e;
    }

    /* renamed from: k */
    public final long mo34371k() {
        return this.f34919f;
    }

    /* renamed from: l */
    public final int mo34372l() {
        return this.f34917d;
    }

    /* renamed from: m */
    public final long mo34373m() {
        return this.f34914a;
    }

    /* renamed from: n */
    public final String mo34374n() {
        return this.f34916c;
    }

    public String toString() {
        long j = this.f34914a;
        String str = this.f34915b;
        String str2 = this.f34916c;
        int i = this.f34917d;
        long j2 = this.f34918e;
        long j3 = this.f34919f;
        return "NetworkEvent(timestampMs=" + j + ", httpMethod=" + str + ", url=" + str2 + ", statusCode=" + i + ", requestTime=" + j2 + ", responseTime=" + j3 + ")";
    }
}

package com.carrefour.fid.android.domain.models;

import androidx.compose.runtime.internal.C8567o;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.domain.models.t */
public final class C38182t {

    /* renamed from: c */
    public static final int f96733c = 0;

    /* renamed from: a */
    public final int f96734a;

    /* renamed from: b */
    public final int f96735b;

    public C38182t(int i, int i2) {
        this.f96734a = i;
        this.f96735b = i2;
    }

    /* renamed from: d */
    public static /* synthetic */ C38182t m158350d(C38182t tVar, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = tVar.f96734a;
        }
        if ((i3 & 2) != 0) {
            i2 = tVar.f96735b;
        }
        return tVar.mo119561c(i, i2);
    }

    /* renamed from: a */
    public final int mo119559a() {
        return this.f96734a;
    }

    /* renamed from: b */
    public final int mo119560b() {
        return this.f96735b;
    }

    @C12579k
    /* renamed from: c */
    public final C38182t mo119561c(int i, int i2) {
        return new C38182t(i, i2);
    }

    /* renamed from: e */
    public final int mo119562e() {
        return this.f96734a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38182t)) {
            return false;
        }
        C38182t tVar = (C38182t) obj;
        return this.f96734a == tVar.f96734a && this.f96735b == tVar.f96735b;
    }

    /* renamed from: f */
    public final int mo119564f() {
        return this.f96735b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f96734a) * 31) + Integer.hashCode(this.f96735b);
    }

    @C12579k
    public String toString() {
        int i = this.f96734a;
        int i2 = this.f96735b;
        return "PageDomain(count=" + i + ", total=" + i2 + ")";
    }
}

package com.carrefour.fid.android.domain.models.delivery;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.delivery.e */
public final class C38020e {
    @C12579k

    /* renamed from: a */
    public final String f95834a;

    /* renamed from: b */
    public final int f95835b;

    public C38020e(@C12579k String str, int i) {
        Intrinsics.checkNotNullParameter(str, "gtin");
        this.f95834a = str;
        this.f95835b = i;
    }

    /* renamed from: d */
    public static /* synthetic */ C38020e m156730d(C38020e eVar, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = eVar.f95834a;
        }
        if ((i2 & 2) != 0) {
            i = eVar.f95835b;
        }
        return eVar.mo117647c(str, i);
    }

    @C12579k
    /* renamed from: a */
    public final String mo117645a() {
        return this.f95834a;
    }

    /* renamed from: b */
    public final int mo117646b() {
        return this.f95835b;
    }

    @C12579k
    /* renamed from: c */
    public final C38020e mo117647c(@C12579k String str, int i) {
        Intrinsics.checkNotNullParameter(str, "gtin");
        return new C38020e(str, i);
    }

    @C12579k
    /* renamed from: e */
    public final String mo117648e() {
        return this.f95834a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38020e)) {
            return false;
        }
        C38020e eVar = (C38020e) obj;
        return Intrinsics.areEqual((Object) this.f95834a, (Object) eVar.f95834a) && this.f95835b == eVar.f95835b;
    }

    /* renamed from: f */
    public final int mo117650f() {
        return this.f95835b;
    }

    public int hashCode() {
        return (this.f95834a.hashCode() * 31) + Integer.hashCode(this.f95835b);
    }

    @C12579k
    public String toString() {
        String str = this.f95834a;
        int i = this.f95835b;
        return "GtinWithQuantity(gtin=" + str + ", quantity=" + i + ")";
    }
}

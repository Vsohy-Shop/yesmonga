package com.carrefour.fid.android.domain.models.criteo;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.criteo.n */
public final class C38012n {
    @C12579k

    /* renamed from: a */
    public final String f95771a;

    /* renamed from: b */
    public final boolean f95772b;
    @C12580l

    /* renamed from: c */
    public final String f95773c;
    @C12580l

    /* renamed from: d */
    public final String f95774d;
    @C12580l

    /* renamed from: e */
    public final String f95775e;
    @C12580l

    /* renamed from: f */
    public final String f95776f;
    @C12580l

    /* renamed from: g */
    public final String f95777g;

    public C38012n(@C12579k String str, boolean z, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l String str6) {
        Intrinsics.checkNotNullParameter(str, "productId");
        this.f95771a = str;
        this.f95772b = z;
        this.f95773c = str2;
        this.f95774d = str3;
        this.f95775e = str4;
        this.f95776f = str5;
        this.f95777g = str6;
    }

    /* renamed from: i */
    public static /* synthetic */ C38012n m156627i(C38012n nVar, String str, boolean z, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nVar.f95771a;
        }
        if ((i & 2) != 0) {
            z = nVar.f95772b;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            str2 = nVar.f95773c;
        }
        String str7 = str2;
        if ((i & 8) != 0) {
            str3 = nVar.f95774d;
        }
        String str8 = str3;
        if ((i & 16) != 0) {
            str4 = nVar.f95775e;
        }
        String str9 = str4;
        if ((i & 32) != 0) {
            str5 = nVar.f95776f;
        }
        String str10 = str5;
        if ((i & 64) != 0) {
            str6 = nVar.f95777g;
        }
        return nVar.mo117552h(str, z2, str7, str8, str9, str10, str6);
    }

    @C12579k
    /* renamed from: a */
    public final String mo117544a() {
        return this.f95771a;
    }

    /* renamed from: b */
    public final boolean mo117545b() {
        return this.f95772b;
    }

    @C12580l
    /* renamed from: c */
    public final String mo117546c() {
        return this.f95773c;
    }

    @C12580l
    /* renamed from: d */
    public final String mo117547d() {
        return this.f95774d;
    }

    @C12580l
    /* renamed from: e */
    public final String mo117548e() {
        return this.f95775e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38012n)) {
            return false;
        }
        C38012n nVar = (C38012n) obj;
        return Intrinsics.areEqual((Object) this.f95771a, (Object) nVar.f95771a) && this.f95772b == nVar.f95772b && Intrinsics.areEqual((Object) this.f95773c, (Object) nVar.f95773c) && Intrinsics.areEqual((Object) this.f95774d, (Object) nVar.f95774d) && Intrinsics.areEqual((Object) this.f95775e, (Object) nVar.f95775e) && Intrinsics.areEqual((Object) this.f95776f, (Object) nVar.f95776f) && Intrinsics.areEqual((Object) this.f95777g, (Object) nVar.f95777g);
    }

    @C12580l
    /* renamed from: f */
    public final String mo117550f() {
        return this.f95776f;
    }

    @C12580l
    /* renamed from: g */
    public final String mo117551g() {
        return this.f95777g;
    }

    @C12579k
    /* renamed from: h */
    public final C38012n mo117552h(@C12579k String str, boolean z, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l String str6) {
        Intrinsics.checkNotNullParameter(str, "productId");
        return new C38012n(str, z, str2, str3, str4, str5, str6);
    }

    public int hashCode() {
        int hashCode = this.f95771a.hashCode() * 31;
        boolean z = this.f95772b;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        String str = this.f95773c;
        int i2 = 0;
        int hashCode2 = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f95774d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f95775e;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f95776f;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f95777g;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return hashCode5 + i2;
    }

    @C12580l
    /* renamed from: j */
    public final String mo117554j() {
        return this.f95776f;
    }

    @C12580l
    /* renamed from: k */
    public final String mo117555k() {
        return this.f95775e;
    }

    @C12580l
    /* renamed from: l */
    public final String mo117556l() {
        return this.f95773c;
    }

    @C12580l
    /* renamed from: m */
    public final String mo117557m() {
        return this.f95774d;
    }

    @C12580l
    /* renamed from: n */
    public final String mo117558n() {
        return this.f95777g;
    }

    @C12579k
    /* renamed from: o */
    public final String mo117559o() {
        return this.f95771a;
    }

    /* renamed from: p */
    public final boolean mo117560p() {
        return this.f95772b;
    }

    @C12579k
    public String toString() {
        String str = this.f95771a;
        boolean z = this.f95772b;
        String str2 = this.f95773c;
        String str3 = this.f95774d;
        String str4 = this.f95775e;
        String str5 = this.f95776f;
        String str6 = this.f95777g;
        return "CriteoProduct(productId=" + str + ", isSponsored=" + z + ", onLoadBeacon=" + str2 + ", onViewBeacon=" + str3 + ", onClickBeacon=" + str4 + ", onBasketChangeBeacon=" + str5 + ", onWishListBeacon=" + str6 + ")";
    }
}

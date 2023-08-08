package com.carrefour.fid.android.presentation.p035ui.coupons.overlay.coupondetails;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.overlay.coupondetails.g */
public final class C23952g {

    /* renamed from: h */
    public static final int f60120h = 0;
    @C12579k

    /* renamed from: a */
    public final String f60121a;
    @C12580l

    /* renamed from: b */
    public final String f60122b;
    @C12579k

    /* renamed from: c */
    public final String f60123c;
    @C12579k

    /* renamed from: d */
    public final String f60124d;
    @C12579k

    /* renamed from: e */
    public final String f60125e;
    @C12579k

    /* renamed from: f */
    public final String f60126f;
    @C12579k

    /* renamed from: g */
    public final String f60127g;

    public C23952g(@C12579k String str, @C12580l String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5, @C12579k String str6, @C12579k String str7) {
        Intrinsics.checkNotNullParameter(str, "couponUiTitle");
        Intrinsics.checkNotNullParameter(str3, "couponUiDescription");
        Intrinsics.checkNotNullParameter(str4, "couponUiDate");
        Intrinsics.checkNotNullParameter(str5, "couponUiDetailLongDescription");
        Intrinsics.checkNotNullParameter(str6, "couponUiDetailsNotice");
        Intrinsics.checkNotNullParameter(str7, "couponUiPartnerStores");
        this.f60121a = str;
        this.f60122b = str2;
        this.f60123c = str3;
        this.f60124d = str4;
        this.f60125e = str5;
        this.f60126f = str6;
        this.f60127g = str7;
    }

    /* renamed from: i */
    public static /* synthetic */ C23952g m105840i(C23952g gVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gVar.f60121a;
        }
        if ((i & 2) != 0) {
            str2 = gVar.f60122b;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = gVar.f60123c;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = gVar.f60124d;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = gVar.f60125e;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = gVar.f60126f;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = gVar.f60127g;
        }
        return gVar.mo70100h(str, str8, str9, str10, str11, str12, str7);
    }

    @C12579k
    /* renamed from: a */
    public final String mo70092a() {
        return this.f60121a;
    }

    @C12580l
    /* renamed from: b */
    public final String mo70093b() {
        return this.f60122b;
    }

    @C12579k
    /* renamed from: c */
    public final String mo70094c() {
        return this.f60123c;
    }

    @C12579k
    /* renamed from: d */
    public final String mo70095d() {
        return this.f60124d;
    }

    @C12579k
    /* renamed from: e */
    public final String mo70096e() {
        return this.f60125e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23952g)) {
            return false;
        }
        C23952g gVar = (C23952g) obj;
        return Intrinsics.areEqual((Object) this.f60121a, (Object) gVar.f60121a) && Intrinsics.areEqual((Object) this.f60122b, (Object) gVar.f60122b) && Intrinsics.areEqual((Object) this.f60123c, (Object) gVar.f60123c) && Intrinsics.areEqual((Object) this.f60124d, (Object) gVar.f60124d) && Intrinsics.areEqual((Object) this.f60125e, (Object) gVar.f60125e) && Intrinsics.areEqual((Object) this.f60126f, (Object) gVar.f60126f) && Intrinsics.areEqual((Object) this.f60127g, (Object) gVar.f60127g);
    }

    @C12579k
    /* renamed from: f */
    public final String mo70098f() {
        return this.f60126f;
    }

    @C12579k
    /* renamed from: g */
    public final String mo70099g() {
        return this.f60127g;
    }

    @C12579k
    /* renamed from: h */
    public final C23952g mo70100h(@C12579k String str, @C12580l String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5, @C12579k String str6, @C12579k String str7) {
        Intrinsics.checkNotNullParameter(str, "couponUiTitle");
        Intrinsics.checkNotNullParameter(str3, "couponUiDescription");
        Intrinsics.checkNotNullParameter(str4, "couponUiDate");
        Intrinsics.checkNotNullParameter(str5, "couponUiDetailLongDescription");
        Intrinsics.checkNotNullParameter(str6, "couponUiDetailsNotice");
        String str8 = str7;
        Intrinsics.checkNotNullParameter(str8, "couponUiPartnerStores");
        return new C23952g(str, str2, str3, str4, str5, str6, str8);
    }

    public int hashCode() {
        int hashCode = this.f60121a.hashCode() * 31;
        String str = this.f60122b;
        return ((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f60123c.hashCode()) * 31) + this.f60124d.hashCode()) * 31) + this.f60125e.hashCode()) * 31) + this.f60126f.hashCode()) * 31) + this.f60127g.hashCode();
    }

    @C12579k
    /* renamed from: j */
    public final String mo70102j() {
        return this.f60124d;
    }

    @C12579k
    /* renamed from: k */
    public final String mo70103k() {
        return this.f60123c;
    }

    @C12579k
    /* renamed from: l */
    public final String mo70104l() {
        return this.f60125e;
    }

    @C12579k
    /* renamed from: m */
    public final String mo70105m() {
        return this.f60126f;
    }

    @C12580l
    /* renamed from: n */
    public final String mo70106n() {
        return this.f60122b;
    }

    @C12579k
    /* renamed from: o */
    public final String mo70107o() {
        return this.f60127g;
    }

    @C12579k
    /* renamed from: p */
    public final String mo70108p() {
        return this.f60121a;
    }

    @C12579k
    public String toString() {
        String str = this.f60121a;
        String str2 = this.f60122b;
        String str3 = this.f60123c;
        String str4 = this.f60124d;
        String str5 = this.f60125e;
        String str6 = this.f60126f;
        String str7 = this.f60127g;
        return "CouponDetailsUi(couponUiTitle=" + str + ", couponUiImageUrl=" + str2 + ", couponUiDescription=" + str3 + ", couponUiDate=" + str4 + ", couponUiDetailLongDescription=" + str5 + ", couponUiDetailsNotice=" + str6 + ", couponUiPartnerStores=" + str7 + ")";
    }
}

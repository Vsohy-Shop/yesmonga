package com.carrefour.fid.android.domain.models.product.detail;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.product.detail.a */
public final class C38106a {
    @C12579k

    /* renamed from: a */
    public final C38110e f96373a;
    @C12579k

    /* renamed from: b */
    public final OfferDetail f96374b;

    /* renamed from: c */
    public final boolean f96375c;

    public C38106a(@C12579k C38110e eVar, @C12579k OfferDetail offerDetail, boolean z) {
        Intrinsics.checkNotNullParameter(eVar, "productDetailNal");
        Intrinsics.checkNotNullParameter(offerDetail, "currentOfferSelected");
        this.f96373a = eVar;
        this.f96374b = offerDetail;
        this.f96375c = z;
    }

    /* renamed from: e */
    public static /* synthetic */ C38106a m157576e(C38106a aVar, C38110e eVar, OfferDetail offerDetail, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            eVar = aVar.f96373a;
        }
        if ((i & 2) != 0) {
            offerDetail = aVar.f96374b;
        }
        if ((i & 4) != 0) {
            z = aVar.f96375c;
        }
        return aVar.mo118712d(eVar, offerDetail, z);
    }

    @C12579k
    /* renamed from: a */
    public final C38110e mo118709a() {
        return this.f96373a;
    }

    @C12579k
    /* renamed from: b */
    public final OfferDetail mo118710b() {
        return this.f96374b;
    }

    /* renamed from: c */
    public final boolean mo118711c() {
        return this.f96375c;
    }

    @C12579k
    /* renamed from: d */
    public final C38106a mo118712d(@C12579k C38110e eVar, @C12579k OfferDetail offerDetail, boolean z) {
        Intrinsics.checkNotNullParameter(eVar, "productDetailNal");
        Intrinsics.checkNotNullParameter(offerDetail, "currentOfferSelected");
        return new C38106a(eVar, offerDetail, z);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38106a)) {
            return false;
        }
        C38106a aVar = (C38106a) obj;
        return Intrinsics.areEqual((Object) this.f96373a, (Object) aVar.f96373a) && Intrinsics.areEqual((Object) this.f96374b, (Object) aVar.f96374b) && this.f96375c == aVar.f96375c;
    }

    @C12579k
    /* renamed from: f */
    public final OfferDetail mo118714f() {
        return this.f96374b;
    }

    /* renamed from: g */
    public final boolean mo118715g() {
        return this.f96375c;
    }

    @C12579k
    /* renamed from: h */
    public final C38110e mo118716h() {
        return this.f96373a;
    }

    public int hashCode() {
        int hashCode = ((this.f96373a.hashCode() * 31) + this.f96374b.hashCode()) * 31;
        boolean z = this.f96375c;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    @C12579k
    public String toString() {
        C38110e eVar = this.f96373a;
        OfferDetail offerDetail = this.f96374b;
        boolean z = this.f96375c;
        return "ProductAndOfferSelected(productDetailNal=" + eVar + ", currentOfferSelected=" + offerDetail + ", doesNotContainsALadOffer=" + z + ")";
    }
}

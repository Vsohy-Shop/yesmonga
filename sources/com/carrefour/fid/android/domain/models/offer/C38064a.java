package com.carrefour.fid.android.domain.models.offer;

import com.carrefour.fid.android.shared.constant.C28547h2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.offer.a */
public final class C38064a {
    @C12579k

    /* renamed from: a */
    public final Offer f96171a;

    /* renamed from: b */
    public final double f96172b;
    @C12579k

    /* renamed from: c */
    public final String f96173c;
    @C12579k

    /* renamed from: d */
    public final String f96174d;
    @C12579k

    /* renamed from: e */
    public final String f96175e;

    /* renamed from: f */
    public final double f96176f;

    public C38064a(@C12579k Offer offer, double d, @C12579k String str, @C12579k String str2, @C12579k String str3, double d2) {
        Intrinsics.checkNotNullParameter(offer, C28547h2.f69318f);
        Intrinsics.checkNotNullParameter(str, "productCdbase");
        Intrinsics.checkNotNullParameter(str2, "strategy");
        Intrinsics.checkNotNullParameter(str3, "mainNodeId");
        this.f96171a = offer;
        this.f96172b = d;
        this.f96173c = str;
        this.f96174d = str2;
        this.f96175e = str3;
        this.f96176f = d2;
    }

    /* renamed from: h */
    public static /* synthetic */ C38064a m157159h(C38064a aVar, Offer offer, double d, String str, String str2, String str3, double d2, int i, Object obj) {
        C38064a aVar2 = aVar;
        return aVar.mo118193g((i & 1) != 0 ? aVar2.f96171a : offer, (i & 2) != 0 ? aVar2.f96172b : d, (i & 4) != 0 ? aVar2.f96173c : str, (i & 8) != 0 ? aVar2.f96174d : str2, (i & 16) != 0 ? aVar2.f96175e : str3, (i & 32) != 0 ? aVar2.f96176f : d2);
    }

    @C12579k
    /* renamed from: a */
    public final Offer mo118186a() {
        return this.f96171a;
    }

    /* renamed from: b */
    public final double mo118187b() {
        return this.f96172b;
    }

    @C12579k
    /* renamed from: c */
    public final String mo118188c() {
        return this.f96173c;
    }

    @C12579k
    /* renamed from: d */
    public final String mo118189d() {
        return this.f96174d;
    }

    @C12579k
    /* renamed from: e */
    public final String mo118190e() {
        return this.f96175e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38064a)) {
            return false;
        }
        C38064a aVar = (C38064a) obj;
        return Intrinsics.areEqual((Object) this.f96171a, (Object) aVar.f96171a) && Double.compare(this.f96172b, aVar.f96172b) == 0 && Intrinsics.areEqual((Object) this.f96173c, (Object) aVar.f96173c) && Intrinsics.areEqual((Object) this.f96174d, (Object) aVar.f96174d) && Intrinsics.areEqual((Object) this.f96175e, (Object) aVar.f96175e) && Double.compare(this.f96176f, aVar.f96176f) == 0;
    }

    /* renamed from: f */
    public final double mo118192f() {
        return this.f96176f;
    }

    @C12579k
    /* renamed from: g */
    public final C38064a mo118193g(@C12579k Offer offer, double d, @C12579k String str, @C12579k String str2, @C12579k String str3, double d2) {
        Intrinsics.checkNotNullParameter(offer, C28547h2.f69318f);
        Intrinsics.checkNotNullParameter(str, "productCdbase");
        Intrinsics.checkNotNullParameter(str2, "strategy");
        String str4 = str3;
        Intrinsics.checkNotNullParameter(str4, "mainNodeId");
        return new C38064a(offer, d, str, str2, str4, d2);
    }

    public int hashCode() {
        return (((((((((this.f96171a.hashCode() * 31) + Double.hashCode(this.f96172b)) * 31) + this.f96173c.hashCode()) * 31) + this.f96174d.hashCode()) * 31) + this.f96175e.hashCode()) * 31) + Double.hashCode(this.f96176f);
    }

    @C12579k
    /* renamed from: i */
    public final String mo118195i() {
        return this.f96175e;
    }

    @C12579k
    /* renamed from: j */
    public final Offer mo118196j() {
        return this.f96171a;
    }

    @C12579k
    /* renamed from: k */
    public final String mo118197k() {
        return this.f96173c;
    }

    /* renamed from: l */
    public final double mo118198l() {
        return this.f96172b;
    }

    /* renamed from: m */
    public final double mo118199m() {
        return this.f96176f;
    }

    @C12579k
    /* renamed from: n */
    public final String mo118200n() {
        return this.f96174d;
    }

    @C12579k
    public String toString() {
        Offer offer = this.f96171a;
        double d = this.f96172b;
        String str = this.f96173c;
        String str2 = this.f96174d;
        String str3 = this.f96175e;
        double d2 = this.f96176f;
        return "ComplementaryProduct(offer=" + offer + ", score=" + d + ", productCdbase=" + str + ", strategy=" + str2 + ", mainNodeId=" + str3 + ", scoreMainNodeId=" + d2 + ")";
    }
}

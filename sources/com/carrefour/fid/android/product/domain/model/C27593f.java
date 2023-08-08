package com.carrefour.fid.android.product.domain.model;

import com.carrefour.fid.android.domain.models.offer.Offer;
import com.carrefour.fid.android.shared.constant.C28547h2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.product.domain.model.f */
public final class C27593f {
    @C12579k

    /* renamed from: a */
    public final Offer f67032a;

    /* renamed from: b */
    public final double f67033b;
    @C12579k

    /* renamed from: c */
    public final String f67034c;
    @C12579k

    /* renamed from: d */
    public final String f67035d;
    @C12579k

    /* renamed from: e */
    public final String f67036e;

    /* renamed from: f */
    public final double f67037f;

    public C27593f(@C12579k Offer offer, double d, @C12579k String str, @C12579k String str2, @C12579k String str3, double d2) {
        Intrinsics.checkNotNullParameter(offer, C28547h2.f69318f);
        Intrinsics.checkNotNullParameter(str, "productCdbase");
        Intrinsics.checkNotNullParameter(str2, "strategy");
        Intrinsics.checkNotNullParameter(str3, "mainNodeId");
        this.f67032a = offer;
        this.f67033b = d;
        this.f67034c = str;
        this.f67035d = str2;
        this.f67036e = str3;
        this.f67037f = d2;
    }

    /* renamed from: h */
    public static /* synthetic */ C27593f m116103h(C27593f fVar, Offer offer, double d, String str, String str2, String str3, double d2, int i, Object obj) {
        C27593f fVar2 = fVar;
        return fVar.mo80159g((i & 1) != 0 ? fVar2.f67032a : offer, (i & 2) != 0 ? fVar2.f67033b : d, (i & 4) != 0 ? fVar2.f67034c : str, (i & 8) != 0 ? fVar2.f67035d : str2, (i & 16) != 0 ? fVar2.f67036e : str3, (i & 32) != 0 ? fVar2.f67037f : d2);
    }

    @C12579k
    /* renamed from: a */
    public final Offer mo80152a() {
        return this.f67032a;
    }

    /* renamed from: b */
    public final double mo80153b() {
        return this.f67033b;
    }

    @C12579k
    /* renamed from: c */
    public final String mo80154c() {
        return this.f67034c;
    }

    @C12579k
    /* renamed from: d */
    public final String mo80155d() {
        return this.f67035d;
    }

    @C12579k
    /* renamed from: e */
    public final String mo80156e() {
        return this.f67036e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27593f)) {
            return false;
        }
        C27593f fVar = (C27593f) obj;
        return Intrinsics.areEqual((Object) this.f67032a, (Object) fVar.f67032a) && Double.compare(this.f67033b, fVar.f67033b) == 0 && Intrinsics.areEqual((Object) this.f67034c, (Object) fVar.f67034c) && Intrinsics.areEqual((Object) this.f67035d, (Object) fVar.f67035d) && Intrinsics.areEqual((Object) this.f67036e, (Object) fVar.f67036e) && Double.compare(this.f67037f, fVar.f67037f) == 0;
    }

    /* renamed from: f */
    public final double mo80158f() {
        return this.f67037f;
    }

    @C12579k
    /* renamed from: g */
    public final C27593f mo80159g(@C12579k Offer offer, double d, @C12579k String str, @C12579k String str2, @C12579k String str3, double d2) {
        Intrinsics.checkNotNullParameter(offer, C28547h2.f69318f);
        Intrinsics.checkNotNullParameter(str, "productCdbase");
        Intrinsics.checkNotNullParameter(str2, "strategy");
        String str4 = str3;
        Intrinsics.checkNotNullParameter(str4, "mainNodeId");
        return new C27593f(offer, d, str, str2, str4, d2);
    }

    public int hashCode() {
        return (((((((((this.f67032a.hashCode() * 31) + Double.hashCode(this.f67033b)) * 31) + this.f67034c.hashCode()) * 31) + this.f67035d.hashCode()) * 31) + this.f67036e.hashCode()) * 31) + Double.hashCode(this.f67037f);
    }

    @C12579k
    /* renamed from: i */
    public final String mo80161i() {
        return this.f67036e;
    }

    @C12579k
    /* renamed from: j */
    public final Offer mo80162j() {
        return this.f67032a;
    }

    @C12579k
    /* renamed from: k */
    public final String mo80163k() {
        return this.f67034c;
    }

    /* renamed from: l */
    public final double mo80164l() {
        return this.f67033b;
    }

    /* renamed from: m */
    public final double mo80165m() {
        return this.f67037f;
    }

    @C12579k
    /* renamed from: n */
    public final String mo80166n() {
        return this.f67035d;
    }

    @C12579k
    public String toString() {
        Offer offer = this.f67032a;
        double d = this.f67033b;
        String str = this.f67034c;
        String str2 = this.f67035d;
        String str3 = this.f67036e;
        double d2 = this.f67037f;
        return "ProductSuggestedDataSourceResult(offer=" + offer + ", score=" + d + ", productCdbase=" + str + ", strategy=" + str2 + ", mainNodeId=" + str3 + ", scoreMainNodeId=" + d2 + ")";
    }
}

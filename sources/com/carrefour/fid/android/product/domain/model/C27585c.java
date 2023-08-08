package com.carrefour.fid.android.product.domain.model;

import com.carrefour.fid.android.domain.models.offer.Offer;
import com.carrefour.fid.android.shared.constant.C28547h2;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.product.domain.model.c */
public final class C27585c {
    @C12579k

    /* renamed from: a */
    public final Offer f67006a;
    @C12579k

    /* renamed from: b */
    public final List<Offer> f67007b;

    public C27585c(@C12579k Offer offer, @C12579k List<Offer> list) {
        Intrinsics.checkNotNullParameter(offer, C28547h2.f69318f);
        Intrinsics.checkNotNullParameter(list, "mixedOffers");
        this.f67006a = offer;
        this.f67007b = list;
    }

    /* renamed from: d */
    public static /* synthetic */ C27585c m116047d(C27585c cVar, Offer offer, List<Offer> list, int i, Object obj) {
        if ((i & 1) != 0) {
            offer = cVar.f67006a;
        }
        if ((i & 2) != 0) {
            list = cVar.f67007b;
        }
        return cVar.mo80084c(offer, list);
    }

    @C12579k
    /* renamed from: a */
    public final Offer mo80082a() {
        return this.f67006a;
    }

    @C12579k
    /* renamed from: b */
    public final List<Offer> mo80083b() {
        return this.f67007b;
    }

    @C12579k
    /* renamed from: c */
    public final C27585c mo80084c(@C12579k Offer offer, @C12579k List<Offer> list) {
        Intrinsics.checkNotNullParameter(offer, C28547h2.f69318f);
        Intrinsics.checkNotNullParameter(list, "mixedOffers");
        return new C27585c(offer, list);
    }

    @C12579k
    /* renamed from: e */
    public final List<Offer> mo80085e() {
        return this.f67007b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27585c)) {
            return false;
        }
        C27585c cVar = (C27585c) obj;
        return Intrinsics.areEqual((Object) this.f67006a, (Object) cVar.f67006a) && Intrinsics.areEqual((Object) this.f67007b, (Object) cVar.f67007b);
    }

    @C12579k
    /* renamed from: f */
    public final Offer mo80087f() {
        return this.f67006a;
    }

    public int hashCode() {
        return (this.f67006a.hashCode() * 31) + this.f67007b.hashCode();
    }

    @C12579k
    public String toString() {
        Offer offer = this.f67006a;
        List<Offer> list = this.f67007b;
        return "ProductDataSourceResult(offer=" + offer + ", mixedOffers=" + list + ")";
    }
}

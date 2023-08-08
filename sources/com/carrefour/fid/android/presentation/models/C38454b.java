package com.carrefour.fid.android.presentation.models;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.offer.OfferDiscount;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.models.b */
public final class C38454b {

    /* renamed from: c */
    public static final int f97573c = 8;
    @C12579k

    /* renamed from: a */
    public final List<OfferProductModel> f97574a;
    @C12579k

    /* renamed from: b */
    public final OfferDiscount f97575b;

    public C38454b(@C12579k List<? extends OfferProductModel> list, @C12579k OfferDiscount offerDiscount) {
        Intrinsics.checkNotNullParameter(list, "offers");
        Intrinsics.checkNotNullParameter(offerDiscount, FirebaseAnalytics.C32532b.f78937Y);
        this.f97574a = list;
        this.f97575b = offerDiscount;
    }

    /* renamed from: d */
    public static /* synthetic */ C38454b m159514d(C38454b bVar, List<OfferProductModel> list, OfferDiscount offerDiscount, int i, Object obj) {
        if ((i & 1) != 0) {
            list = bVar.f97574a;
        }
        if ((i & 2) != 0) {
            offerDiscount = bVar.f97575b;
        }
        return bVar.mo121999c(list, offerDiscount);
    }

    @C12579k
    /* renamed from: a */
    public final List<OfferProductModel> mo121997a() {
        return this.f97574a;
    }

    @C12579k
    /* renamed from: b */
    public final OfferDiscount mo121998b() {
        return this.f97575b;
    }

    @C12579k
    /* renamed from: c */
    public final C38454b mo121999c(@C12579k List<? extends OfferProductModel> list, @C12579k OfferDiscount offerDiscount) {
        Intrinsics.checkNotNullParameter(list, "offers");
        Intrinsics.checkNotNullParameter(offerDiscount, FirebaseAnalytics.C32532b.f78937Y);
        return new C38454b(list, offerDiscount);
    }

    @C12579k
    /* renamed from: e */
    public final OfferDiscount mo122000e() {
        return this.f97575b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38454b)) {
            return false;
        }
        C38454b bVar = (C38454b) obj;
        return Intrinsics.areEqual((Object) this.f97574a, (Object) bVar.f97574a) && Intrinsics.areEqual((Object) this.f97575b, (Object) bVar.f97575b);
    }

    @C12579k
    /* renamed from: f */
    public final List<OfferProductModel> mo122002f() {
        return this.f97574a;
    }

    public int hashCode() {
        return (this.f97574a.hashCode() * 31) + this.f97575b.hashCode();
    }

    @C12579k
    public String toString() {
        List<OfferProductModel> list = this.f97574a;
        OfferDiscount offerDiscount = this.f97575b;
        return "BundleModel(offers=" + list + ", discount=" + offerDiscount + ")";
    }
}

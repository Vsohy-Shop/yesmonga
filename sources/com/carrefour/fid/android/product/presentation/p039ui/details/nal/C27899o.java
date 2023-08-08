package com.carrefour.fid.android.product.presentation.p039ui.details.nal;

import com.carrefour.fid.android.domain.models.product.detail.C38110e;
import com.carrefour.fid.android.domain.models.product.detail.OfferDetail;
import com.carrefour.fid.android.product.presentation.models.OfferAvailability;
import com.carrefour.fid.android.product.presentation.p039ui.details.views.C27934i;
import com.carrefour.fid.android.shared.constant.C28534f;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.o */
public final class C27899o {
    @C12579k

    /* renamed from: a */
    public final C38110e f67553a;
    @C12579k

    /* renamed from: b */
    public final OfferDetail f67554b;
    @C12579k

    /* renamed from: c */
    public final List<C27934i> f67555c;
    @C12579k

    /* renamed from: d */
    public final OfferAvailability f67556d;

    public C27899o(@C12579k C38110e eVar, @C12579k OfferDetail offerDetail, @C12579k List<C27934i> list, @C12579k OfferAvailability offerAvailability) {
        Intrinsics.checkNotNullParameter(eVar, "product");
        Intrinsics.checkNotNullParameter(offerDetail, "currentOfferSelected");
        Intrinsics.checkNotNullParameter(list, "deliveryChoices");
        Intrinsics.checkNotNullParameter(offerAvailability, C28534f.f69157h0);
        this.f67553a = eVar;
        this.f67554b = offerDetail;
        this.f67555c = list;
        this.f67556d = offerAvailability;
    }

    /* renamed from: f */
    public static /* synthetic */ C27899o m117053f(C27899o oVar, C38110e eVar, OfferDetail offerDetail, List<C27934i> list, OfferAvailability offerAvailability, int i, Object obj) {
        if ((i & 1) != 0) {
            eVar = oVar.f67553a;
        }
        if ((i & 2) != 0) {
            offerDetail = oVar.f67554b;
        }
        if ((i & 4) != 0) {
            list = oVar.f67555c;
        }
        if ((i & 8) != 0) {
            offerAvailability = oVar.f67556d;
        }
        return oVar.mo81085e(eVar, offerDetail, list, offerAvailability);
    }

    @C12579k
    /* renamed from: a */
    public final C38110e mo81081a() {
        return this.f67553a;
    }

    @C12579k
    /* renamed from: b */
    public final OfferDetail mo81082b() {
        return this.f67554b;
    }

    @C12579k
    /* renamed from: c */
    public final List<C27934i> mo81083c() {
        return this.f67555c;
    }

    @C12579k
    /* renamed from: d */
    public final OfferAvailability mo81084d() {
        return this.f67556d;
    }

    @C12579k
    /* renamed from: e */
    public final C27899o mo81085e(@C12579k C38110e eVar, @C12579k OfferDetail offerDetail, @C12579k List<C27934i> list, @C12579k OfferAvailability offerAvailability) {
        Intrinsics.checkNotNullParameter(eVar, "product");
        Intrinsics.checkNotNullParameter(offerDetail, "currentOfferSelected");
        Intrinsics.checkNotNullParameter(list, "deliveryChoices");
        Intrinsics.checkNotNullParameter(offerAvailability, C28534f.f69157h0);
        return new C27899o(eVar, offerDetail, list, offerAvailability);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27899o)) {
            return false;
        }
        C27899o oVar = (C27899o) obj;
        return Intrinsics.areEqual((Object) this.f67553a, (Object) oVar.f67553a) && Intrinsics.areEqual((Object) this.f67554b, (Object) oVar.f67554b) && Intrinsics.areEqual((Object) this.f67555c, (Object) oVar.f67555c) && this.f67556d == oVar.f67556d;
    }

    @C12579k
    /* renamed from: g */
    public final OfferAvailability mo81087g() {
        return this.f67556d;
    }

    @C12579k
    /* renamed from: h */
    public final OfferDetail mo81088h() {
        return this.f67554b;
    }

    public int hashCode() {
        return (((((this.f67553a.hashCode() * 31) + this.f67554b.hashCode()) * 31) + this.f67555c.hashCode()) * 31) + this.f67556d.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public final List<C27934i> mo81090i() {
        return this.f67555c;
    }

    @C12579k
    /* renamed from: j */
    public final C38110e mo81091j() {
        return this.f67553a;
    }

    @C12579k
    public String toString() {
        C38110e eVar = this.f67553a;
        OfferDetail offerDetail = this.f67554b;
        List<C27934i> list = this.f67555c;
        OfferAvailability offerAvailability = this.f67556d;
        return "ProductData(product=" + eVar + ", currentOfferSelected=" + offerDetail + ", deliveryChoices=" + list + ", availability=" + offerAvailability + ")";
    }
}

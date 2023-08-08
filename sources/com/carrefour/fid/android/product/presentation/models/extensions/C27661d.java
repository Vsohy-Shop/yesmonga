package com.carrefour.fid.android.product.presentation.models.extensions;

import com.carrefour.fid.android.domain.models.offer.Discount;
import com.carrefour.fid.android.domain.models.offer.PromoType;
import com.carrefour.fid.android.domain.models.product.plp.PlpOffer;
import com.carrefour.fid.android.product.presentation.mapper.C27641a;
import com.carrefour.fid.android.product.presentation.models.OfferAvailability;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.product.presentation.models.extensions.d */
public final class C27661d {
    @C12579k
    /* renamed from: a */
    public static final OfferAvailability m116374a(@C12579k PlpOffer plpOffer) {
        Intrinsics.checkNotNullParameter(plpOffer, "<this>");
        if (plpOffer.mo118795F()) {
            return OfferAvailability.Available;
        }
        if (plpOffer.mo118795F() || !plpOffer.mo118794E()) {
            return OfferAvailability.Unavailable;
        }
        return OfferAvailability.SoonAvailable;
    }

    @C12580l
    /* renamed from: b */
    public static final Discount m116375b(@C12579k PlpOffer plpOffer) {
        Intrinsics.checkNotNullParameter(plpOffer, "<this>");
        return (Discount) CollectionsKt___CollectionsKt.m40479B2(plpOffer.mo118816t());
    }

    /* renamed from: c */
    public static final double m116376c(@C12579k PlpOffer plpOffer) {
        PromoType promoType;
        Intrinsics.checkNotNullParameter(plpOffer, "<this>");
        Discount b = m116375b(plpOffer);
        if (b != null && (b.mo117953A() == PromoType.PF || b.mo117953A() == PromoType.RD || b.mo117953A() == PromoType.RI)) {
            return C27641a.m116297b(b.mo117980t());
        }
        if (b != null) {
            promoType = b.mo117953A();
        } else {
            promoType = null;
        }
        if (promoType == PromoType.BUNDLE) {
            return C27641a.m116297b(b.mo117980t());
        }
        if (plpOffer.mo118822y().mo118171l() > 0.0d) {
            return plpOffer.mo118822y().mo118171l();
        }
        if (plpOffer.mo118822y().mo118172m() > 0.0d) {
            return plpOffer.mo118822y().mo118172m();
        }
        return 0.0d;
    }

    /* renamed from: d */
    public static final boolean m116377d(@C12579k PlpOffer plpOffer) {
        Intrinsics.checkNotNullParameter(plpOffer, "<this>");
        return C11622t.equals(StringsKt__StringsKt.trim(plpOffer.mo118821x()).toString(), "france", true);
    }

    /* renamed from: e */
    public static final boolean m116378e(@C12579k PlpOffer plpOffer, int i) {
        Intrinsics.checkNotNullParameter(plpOffer, "<this>");
        if (plpOffer.mo118823z() < i + plpOffer.mo118791B()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static final int m116379f(@C12579k PlpOffer plpOffer, int i) {
        Intrinsics.checkNotNullParameter(plpOffer, "<this>");
        int B = i + plpOffer.mo118791B();
        if (B < plpOffer.mo118790A()) {
            return plpOffer.mo118790A();
        }
        return B;
    }

    /* renamed from: g */
    public static final int m116380g(@C12579k PlpOffer plpOffer, int i) {
        Intrinsics.checkNotNullParameter(plpOffer, "<this>");
        int B = i - plpOffer.mo118791B();
        if (B < plpOffer.mo118790A()) {
            return 0;
        }
        return B;
    }
}

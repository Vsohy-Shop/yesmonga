package com.carrefour.fid.android.product.presentation.viewmodel.details;

import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13796h;
import com.carrefour.fid.android.domain.models.product.detail.C38110e;
import com.carrefour.fid.android.domain.models.product.detail.OfferDetail;
import com.carrefour.fid.android.product.presentation.models.OfferAvailability;
import com.carrefour.fid.android.product.presentation.models.extensions.C27658b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.details.e */
public final class C28120e {

    /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.details.e$a */
    public /* synthetic */ class C28121a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OfferDetail.ChannelType.values().length];
            try {
                iArr[OfferDetail.ChannelType.HOME_DELIVERY_NAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @C12579k
    /* renamed from: a */
    public final C13796h mo81733a(@C12580l OfferDetail offerDetail) {
        OfferDetail.ChannelType channelType;
        int i;
        if (offerDetail != null) {
            channelType = offerDetail.mo118700s();
        } else {
            channelType = null;
        }
        if (channelType == null) {
            i = -1;
        } else {
            i = C28121a.$EnumSwitchMapping$0[channelType.ordinal()];
        }
        if (i == 1) {
            return C13796h.C13799c.f33601b;
        }
        return C13796h.C13798b.f33600b;
    }

    @C12579k
    /* renamed from: b */
    public final C13796h mo81734b(@C12579k C38110e eVar, @C12580l OfferDetail offerDetail) {
        Intrinsics.checkNotNullParameter(eVar, "product");
        OfferDetail.ChannelType channelType = null;
        if (eVar.mo118720b().size() > 1) {
            OfferAvailability a = C27658b.m116360a(eVar.mo118720b().get(0));
            OfferAvailability offerAvailability = OfferAvailability.Available;
            if (a == offerAvailability && C27658b.m116360a(eVar.mo118720b().get(1)) == offerAvailability) {
                return C13796h.C13801e.f33603b;
            }
            if (offerDetail != null) {
                channelType = offerDetail.mo118700s();
            }
            if (channelType == OfferDetail.ChannelType.HOME_DELIVERY_NAL) {
                return C13796h.C13799c.f33601b;
            }
            return C13796h.C13798b.f33600b;
        }
        if (eVar.mo118720b().size() == 1) {
            if (offerDetail != null) {
                channelType = offerDetail.mo118700s();
            }
            if (channelType == OfferDetail.ChannelType.HOME_DELIVERY_NAL) {
                return C13796h.C13799c.f33601b;
            }
        }
        return C13796h.C13798b.f33600b;
    }
}

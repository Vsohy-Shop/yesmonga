package com.carrefour.fid.android.core.constants;

import android.content.Context;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.domain.models.OfferDiscountDomain;
import com.carrefour.fid.android.domain.models.OfferPriceDomain;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.shared.constant.C28547h2;
import com.carrefour.fid.android.shared.extension.C28782t;
import com.carrefour.fid.android.shared.util.C28932h;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.core.constants.k */
public final class C36180k extends C36171d {

    /* renamed from: d */
    public static final int f89331d = 8;
    @C12579k

    /* renamed from: c */
    public final Context f89332c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36180k(@C12579k Context context) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f89332c = context;
    }

    @C12579k
    /* renamed from: a */
    public String mo108076a(@C12579k OfferProductModel offerProductModel) {
        Double d;
        Double d2;
        String str;
        Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
        OfferPriceDomain m0 = offerProductModel.mo121514m0();
        String str2 = null;
        if (m0 != null) {
            d = m0.mo116006k();
        } else {
            d = null;
        }
        OfferPriceDomain m02 = offerProductModel.mo121514m0();
        if (m02 != null) {
            d2 = m02.mo116007l();
        } else {
            d2 = null;
        }
        OfferDiscountDomain w = offerProductModel.mo121523w();
        if (w != null) {
            str2 = w.mo115950q();
        }
        if (d == null || d2 == null) {
            str = "";
        } else {
            str = this.f89332c.getString(R.string.pdp_label_discount_promo, new Object[]{C28782t.m119105b(Double.valueOf(d.doubleValue())), C28782t.m119105b(Double.valueOf(d2.doubleValue()))});
        }
        Intrinsics.checkNotNullExpressionValue(str, "if (salePrice != null &&…\n            \"\"\n        }");
        if (str2 == null) {
            return str;
        }
        Context context = this.f89332c;
        C28932h.C28933a aVar = C28932h.f70914a;
        return str + context.getString(R.string.pdp_label_discount_offer_available, new Object[]{aVar.mo84228S(aVar.mo84228S(str2))});
    }
}

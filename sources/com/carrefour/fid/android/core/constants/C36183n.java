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
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.core.constants.n */
public final class C36183n extends C36171d {

    /* renamed from: d */
    public static final int f89336d = 8;
    @C12579k

    /* renamed from: c */
    public final Context f89337c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36183n(@C12579k Context context) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f89337c = context;
    }

    @C12579k
    /* renamed from: a */
    public String mo108076a(@C12579k OfferProductModel offerProductModel) {
        Integer num;
        Double d;
        Double d2;
        boolean z;
        List<String> t;
        Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
        OfferDiscountDomain w = offerProductModel.mo121523w();
        String str = null;
        if (w != null) {
            num = w.mo115948o();
        } else {
            num = null;
        }
        OfferDiscountDomain w2 = offerProductModel.mo121523w();
        if (w2 != null) {
            d = w2.mo115951r();
        } else {
            d = null;
        }
        OfferPriceDomain m0 = offerProductModel.mo121514m0();
        if (m0 != null) {
            d2 = m0.mo116007l();
        } else {
            d2 = null;
        }
        OfferDiscountDomain w3 = offerProductModel.mo121523w();
        if (w3 == null || (t = w3.mo115953t()) == null) {
            z = false;
        } else {
            z = !t.isEmpty();
        }
        OfferDiscountDomain w4 = offerProductModel.mo121523w();
        if (w4 != null) {
            str = w4.mo115950q();
        }
        String str2 = new String();
        if (!(z || num == null || d == null || d2 == null)) {
            str2 = this.f89337c.getString(R.string.pdp_label_discount_ri, new Object[]{num.toString(), C28782t.m119105b(Double.valueOf((d2.doubleValue() * ((double) num.intValue())) - d.doubleValue())), C28782t.m119105b(Double.valueOf(d2.doubleValue() * ((double) num.intValue())))});
            Intrinsics.checkNotNullExpressionValue(str2, "context.getString(\n     …tAsEuros(),\n            )");
        }
        if (str == null) {
            return str2;
        }
        return str2 + this.f89337c.getString(R.string.pdp_label_discount_offer_available, new Object[]{C28932h.f70914a.mo84228S(str)});
    }
}

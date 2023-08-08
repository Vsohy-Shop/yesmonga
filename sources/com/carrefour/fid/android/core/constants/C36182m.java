package com.carrefour.fid.android.core.constants;

import android.content.Context;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.domain.models.OfferDiscountDomain;
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
/* renamed from: com.carrefour.fid.android.core.constants.m */
public final class C36182m extends C36171d {

    /* renamed from: d */
    public static final int f89334d = 8;
    @C12579k

    /* renamed from: c */
    public final Context f89335c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36182m(@C12579k Context context) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f89335c = context;
    }

    @C12579k
    /* renamed from: a */
    public String mo108076a(@C12579k OfferProductModel offerProductModel) {
        boolean z;
        Double d;
        List<String> t;
        Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
        OfferDiscountDomain w = offerProductModel.mo121523w();
        if (w == null || (t = w.mo115953t()) == null) {
            z = false;
        } else {
            z = !t.isEmpty();
        }
        OfferDiscountDomain w2 = offerProductModel.mo121523w();
        String str = null;
        if (w2 != null) {
            d = w2.mo115951r();
        } else {
            d = null;
        }
        OfferDiscountDomain w3 = offerProductModel.mo121523w();
        if (w3 != null) {
            str = w3.mo115950q();
        }
        String str2 = new String();
        if (!z && d != null) {
            str2 = this.f89335c.getString(R.string.pdp_label_discount_rd, new Object[]{C28782t.m119105b(Double.valueOf(d.doubleValue()))});
            Intrinsics.checkNotNullExpressionValue(str2, "context.getString(\n     …tAsEuros(),\n            )");
        }
        if (str == null) {
            return str2;
        }
        return str2 + this.f89335c.getString(R.string.pdp_label_discount_offer_available, new Object[]{C28932h.f70914a.mo84228S(str)});
    }
}

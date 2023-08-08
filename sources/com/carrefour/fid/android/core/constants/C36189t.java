package com.carrefour.fid.android.core.constants;

import android.content.Context;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.domain.models.OfferDiscountDomain;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.shared.constant.C28547h2;
import com.carrefour.fid.android.shared.util.C28932h;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.core.constants.t */
public final class C36189t extends C36171d {

    /* renamed from: d */
    public static final int f89365d = 8;
    @C12579k

    /* renamed from: c */
    public final Context f89366c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36189t(@C12579k Context context) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f89366c = context;
    }

    @C12579k
    /* renamed from: a */
    public String mo108076a(@C12579k OfferProductModel offerProductModel) {
        String str;
        String q;
        Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
        OfferDiscountDomain w = offerProductModel.mo121523w();
        if (w == null || (q = w.mo115950q()) == null) {
            str = null;
        } else {
            str = this.f89366c.getString(R.string.pdp_label_discount_ta, new Object[]{C28932h.f70914a.mo84228S(q)});
        }
        if (str == null) {
            return new String();
        }
        return str;
    }
}

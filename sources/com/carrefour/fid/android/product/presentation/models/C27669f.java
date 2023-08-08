package com.carrefour.fid.android.product.presentation.models;

import android.content.Context;
import com.carrefour.fid.android.domain.models.offer.C38067d;
import com.carrefour.fid.android.domain.models.offer.Discount;
import com.carrefour.fid.android.domain.models.offer.Offer;
import com.carrefour.fid.android.product.C27609f;
import com.carrefour.fid.android.product.presentation.mapper.C27641a;
import com.carrefour.fid.android.shared.constant.C28547h2;
import com.carrefour.fid.android.shared.util.C28932h;
import com.urbanairship.iam.events.C9175a;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.product.presentation.models.f */
public final class C27669f extends C27653d {
    @C12579k

    /* renamed from: b */
    public final Context f67185b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27669f(@C12579k Context context) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f67185b = context;
    }

    @C12579k
    /* renamed from: a */
    public String mo80351a(@C12579k Offer offer) {
        String str;
        Intrinsics.checkNotNullParameter(offer, C28547h2.f69318f);
        Discount T = offer.mo118011T();
        if (T == null) {
            return "";
        }
        if (T.mo117957E() && T.mo117955C()) {
            Context context = this.f67185b;
            int i = C27609f.C27627r.pdp_label_discount_promo;
            Object[] objArr = new Object[2];
            objArr[0] = C27641a.m116296a(T.mo117980t());
            C38067d v = T.mo117983v();
            if (v != null) {
                str = C27641a.m116296a(v.mo118204h());
            } else {
                str = null;
            }
            objArr[1] = str;
            String string = context.getString(i, objArr);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(\n     …?.format(),\n            )");
            return string;
        } else if (!T.mo117956D()) {
            return "";
        } else {
            Context context2 = this.f67185b;
            int i2 = C27609f.C27627r.pdp_label_discount_offer_available;
            C28932h.C28933a aVar = C28932h.f70914a;
            Date O0 = T.mo117982u().mo28744O0();
            Intrinsics.checkNotNullExpressionValue(O0, "discount.endDate.toDate()");
            String string2 = context2.getString(i2, new Object[]{aVar.mo84239i(O0)});
            return "" + string2;
        }
    }
}

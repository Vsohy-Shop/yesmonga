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

/* renamed from: com.carrefour.fid.android.product.presentation.models.h */
public final class C27677h extends C27653d {
    @C12579k

    /* renamed from: b */
    public final Context f67206b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27677h(@C12579k Context context) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f67206b = context;
    }

    @C12579k
    /* renamed from: a */
    public String mo80351a(@C12579k Offer offer) {
        String str;
        Intrinsics.checkNotNullParameter(offer, C28547h2.f69318f);
        Discount T = offer.mo118011T();
        String str2 = "";
        if (T == null) {
            return str2;
        }
        if (T.mo117955C()) {
            Context context = this.f67206b;
            int i = C27609f.C27627r.pdp_label_discount_rd;
            Object[] objArr = new Object[1];
            C38067d s = T.mo117979s();
            if (s != null) {
                str = C27641a.m116296a(s.mo118204h());
            } else {
                str = null;
            }
            objArr[0] = str;
            str2 = context.getString(i, objArr);
        }
        Intrinsics.checkNotNullExpressionValue(str2, "if (discount.hasDiscount…\n            \"\"\n        }");
        if (!T.mo117956D()) {
            return str2;
        }
        Context context2 = this.f67206b;
        int i2 = C27609f.C27627r.pdp_label_discount_offer_available;
        C28932h.C28933a aVar = C28932h.f70914a;
        Date O0 = T.mo117982u().mo28744O0();
        Intrinsics.checkNotNullExpressionValue(O0, "discount.endDate.toDate()");
        String string = context2.getString(i2, new Object[]{aVar.mo84239i(O0)});
        return str2 + string;
    }
}

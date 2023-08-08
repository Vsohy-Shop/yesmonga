package com.carrefour.fid.android.core.extension;

import android.content.Context;
import com.carrefour.fid.android.shared.domain.models.order.OrderType;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.core.extension.f */
public final class C36307f {
    @C12579k
    /* renamed from: a */
    public static final String m148958a(@C12579k OrderType orderType, @C12579k Context context) {
        String str;
        Intrinsics.checkNotNullParameter(orderType, "<this>");
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        if (orderType.mo83591b() > 0) {
            str = context.getString(orderType.mo83591b());
        } else {
            str = new String();
        }
        Intrinsics.checkNotNullExpressionValue(str, "if (stringResId > 0) {\n …)\n} else {\n    String()\n}");
        return str;
    }
}

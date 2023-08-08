package com.carrefour.fid.android.presentation.models.extension;

import android.content.Context;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.core.extension.C36306e;
import com.carrefour.fid.android.domain.models.CategoryLimitDomain;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.models.extension.c */
public final class C38464c {
    @C12579k
    /* renamed from: a */
    public static final String m159621a(@C12580l CategoryLimitDomain categoryLimitDomain, @C12579k Context context) {
        String str;
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        if (categoryLimitDomain == null) {
            str = context.getString(R.string.product_category_concerned);
        } else {
            str = categoryLimitDomain.mo115671f() + C36306e.f89637a + categoryLimitDomain.mo115673h() + categoryLimitDomain.mo115672g() + ")";
        }
        Intrinsics.checkNotNullExpressionValue(str, "if (this == null) {\n    …abel ($value$unit)\"\n    }");
        return context.getString(R.string.product_category_limit_exceeded) + " " + str;
    }
}

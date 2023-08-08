package com.carrefour.fid.android.product.presentation.models.extensions;

import android.content.Context;
import com.carrefour.fid.android.core.extension.C36306e;
import com.carrefour.fid.android.domain.models.offer.CategoryLimit;
import com.carrefour.fid.android.product.C27609f;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.product.presentation.models.extensions.a */
public final class C27657a {
    @C12579k
    /* renamed from: a */
    public static final String m116359a(@C12579k CategoryLimit categoryLimit, @C12579k Context context) {
        Intrinsics.checkNotNullParameter(categoryLimit, "<this>");
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        String string = context.getString(C27609f.C27627r.product_category_limit_exceeded);
        String f = categoryLimit.mo117943f();
        long h = categoryLimit.mo117945h();
        String g = categoryLimit.mo117944g();
        return string + " " + f + C36306e.f89637a + h + g + ")";
    }
}

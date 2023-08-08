package com.carrefour.fid.android.presentation.models.extension;

import android.net.Uri;
import com.carrefour.fid.android.presentation.models.CriteoProductModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.presentation.models.extension.f */
public final class C38470f {
    @C12579k
    /* renamed from: a */
    public static final String m159629a(@C12579k CriteoProductModel criteoProductModel, int i) {
        Intrinsics.checkNotNullParameter(criteoProductModel, "<this>");
        String uri = Uri.parse(criteoProductModel.mo121516n2()).buildUpon().appendQueryParameter("quantity", String.valueOf(i)).build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "parse(onBasketChangeBeac…ild()\n        .toString()");
        return uri;
    }
}

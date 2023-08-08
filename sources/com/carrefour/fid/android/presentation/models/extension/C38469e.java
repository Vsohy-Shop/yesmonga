package com.carrefour.fid.android.presentation.models.extension;

import com.carrefour.fid.android.core.p057io.CouponsThrowable;
import com.carrefour.fid.android.shared.p046io.NetworkException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.presentation.models.extension.e */
public final class C38469e {
    @C12579k
    /* renamed from: a */
    public static final CouponsThrowable m159628a(@C12579k Throwable th) {
        int i;
        Intrinsics.checkNotNullParameter(th, "<this>");
        if (th instanceof NetworkException) {
            i = null;
        } else {
            i = 0;
        }
        return new CouponsThrowable(i, th.getMessage());
    }
}

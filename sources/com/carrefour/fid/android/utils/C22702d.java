package com.carrefour.fid.android.utils;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.appcompat.app.C0475e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.utils.d */
public final class C22702d {
    @C12579k
    /* renamed from: a */
    public static final C0475e m102799a(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        while (context instanceof ContextWrapper) {
            if (context instanceof C0475e) {
                return (C0475e) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            Intrinsics.checkNotNullExpressionValue(context, "ctx.baseContext");
        }
        throw new IllegalStateException("Expected an activity context but instead found: " + context);
    }
}

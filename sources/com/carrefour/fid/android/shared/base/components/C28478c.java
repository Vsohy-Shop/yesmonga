package com.carrefour.fid.android.shared.base.components;

import android.view.View;
import android.view.ViewGroup;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.shared.base.components.c */
public final class C28478c {
    /* renamed from: a */
    public static final void m118385a(@C12579k ViewGroup viewGroup, @C12579k C11300l<? super View, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "action");
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(index)");
            lVar.invoke(childAt);
        }
    }
}

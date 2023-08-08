package com.carrefour.fid.android.shared.extension;

import androidx.annotation.C0349j;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12079p0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;

public final class AppBarLayoutKt {
    @C0349j
    /* renamed from: c */
    public static final AppBarLayout.C31119h m118733c(C12074o0 o0Var, C11300l<? super C28756g0, Boolean> lVar, C11300l<? super C28756g0, C11079d2> lVar2) {
        return new C28761j(o0Var, lVar, lVar2);
    }

    /* renamed from: d */
    public static final void m118734d(C12074o0 o0Var, C11300l lVar, C11300l lVar2, AppBarLayout appBarLayout, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(o0Var, "$scope");
        Intrinsics.checkNotNullParameter(lVar, "$handled");
        Intrinsics.checkNotNullParameter(lVar2, "$emitter");
        if (C12079p0.m48270k(o0Var)) {
            float totalScrollRange = 1.0f - (((float) (appBarLayout.getTotalScrollRange() + i)) / ((float) appBarLayout.getTotalScrollRange()));
            Intrinsics.checkNotNullExpressionValue(appBarLayout, "appBarLayout");
            if (Math.abs(i) >= appBarLayout.getTotalScrollRange() - 100) {
                z = true;
            } else {
                z = false;
            }
            C28756g0 g0Var = new C28756g0(appBarLayout, i, totalScrollRange, z, 20.0f - (10.0f * totalScrollRange));
            if (((Boolean) lVar.invoke(g0Var)).booleanValue()) {
                lVar2.invoke(g0Var);
            }
        }
    }

    @C12579k
    /* renamed from: e */
    public static final C11907e<C28756g0> m118735e(@C12579k AppBarLayout appBarLayout, @C12579k C11300l<? super C28756g0, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(appBarLayout, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "handled");
        return C11909g.m47500w(new AppBarLayoutKt$offsetChangedListener$1(lVar, appBarLayout, (C11045c<? super AppBarLayoutKt$offsetChangedListener$1>) null));
    }

    /* renamed from: f */
    public static /* synthetic */ C11907e m118736f(AppBarLayout appBarLayout, C11300l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            lVar = C28757h.f70418a;
        }
        return m118735e(appBarLayout, lVar);
    }
}

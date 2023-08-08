package com.carrefour.fid.android.shared.extension;

import android.os.Bundle;
import androidx.annotation.C0329d0;
import androidx.navigation.C19693b0;
import androidx.navigation.C19761k0;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.shared.extension.e0 */
public final class C28752e0 {
    /* renamed from: a */
    public static final void m119042a(@C12579k NavController navController, @C0329d0 int i, @C0329d0 int i2, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(navController, "<this>");
        NavDestination I = navController.mo58103I();
        boolean z = false;
        if (I != null && i == I.mo58238f0()) {
            z = true;
        }
        if (z) {
            navController.mo58130W(i2, bundle);
        }
    }

    /* renamed from: b */
    public static final void m119043b(@C12579k NavController navController, @C0329d0 int i, @C12579k C19693b0 b0Var) {
        Intrinsics.checkNotNullParameter(navController, "<this>");
        Intrinsics.checkNotNullParameter(b0Var, "action");
        NavDestination I = navController.mo58103I();
        boolean z = false;
        if (I != null && i == I.mo58238f0()) {
            z = true;
        }
        if (z) {
            navController.mo58142g0(b0Var);
        }
    }

    /* renamed from: c */
    public static final void m119044c(@C12579k NavController navController, @C12579k C19693b0 b0Var) {
        Intrinsics.checkNotNullParameter(navController, "<this>");
        Intrinsics.checkNotNullParameter(b0Var, "directions");
        try {
            Result.C10852a aVar = Result.f28060a;
            navController.mo58132X(b0Var.getActionId(), b0Var.getArguments(), (C19761k0) null);
            Result.m38702b(C11079d2.f28267a);
        } catch (Throwable th) {
            Result.C10852a aVar2 = Result.f28060a;
            Result.m38702b(C11661u0.m45734a(th));
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m119045d(NavController navController, int i, int i2, Bundle bundle, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            bundle = null;
        }
        m119042a(navController, i, i2, bundle);
    }
}

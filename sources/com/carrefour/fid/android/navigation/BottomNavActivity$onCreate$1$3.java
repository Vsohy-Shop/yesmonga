package com.carrefour.fid.android.navigation;

import androidx.navigation.NavController;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0005\u001a\u00020\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Lkotlin/d2;", "kotlin.jvm.PlatformType", "it", "invoke", "(Lkotlin/d2;)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class BottomNavActivity$onCreate$1$3 extends Lambda implements C11300l<C11079d2, C11079d2> {
    final /* synthetic */ BottomNavActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomNavActivity$onCreate$1$3(BottomNavActivity bottomNavActivity) {
        super(1);
        this.this$0 = bottomNavActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C11079d2) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(C11079d2 d2Var) {
        NavController g1 = this.this$0.f97030f1;
        if (g1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_navController");
            g1 = null;
        }
        g1.mo58152q0();
    }
}

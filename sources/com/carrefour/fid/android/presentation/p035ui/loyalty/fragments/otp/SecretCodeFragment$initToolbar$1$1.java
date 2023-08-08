package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp;

import android.view.View;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.presentation.components.toolbar.C38407a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/components/toolbar/a;", "Lkotlin/d2;", "a", "(Lcom/carrefour/fid/android/presentation/components/toolbar/a;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.SecretCodeFragment$initToolbar$1$1 */
public final class SecretCodeFragment$initToolbar$1$1 extends Lambda implements C11300l<C38407a, C11079d2> {
    final /* synthetic */ BottomNavActivity $this_apply;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SecretCodeFragment$initToolbar$1$1(BottomNavActivity bottomNavActivity) {
        super(1);
        this.$this_apply = bottomNavActivity;
    }

    /* renamed from: a */
    public final void mo71856a(@C12579k C38407a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "$this$setup");
        final BottomNavActivity bottomNavActivity = this.$this_apply;
        aVar.mo121302a(new C11300l<View, C11079d2>() {
            /* renamed from: a */
            public final void mo71857a(@C12579k View view) {
                Intrinsics.checkNotNullParameter(view, "it");
                bottomNavActivity.mo702Z().mo767f();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo71857a((View) obj);
                return C11079d2.f28267a;
            }
        });
        aVar.mo121310k(false);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo71856a((C38407a) obj);
        return C11079d2.f28267a;
    }
}

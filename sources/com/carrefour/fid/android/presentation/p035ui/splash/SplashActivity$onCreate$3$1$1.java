package com.carrefour.fid.android.presentation.p035ui.splash;

import com.carrefour.fid.android.presentation.models.C38525q;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/models/q;", "it", "Lkotlin/d2;", "a", "(Lcom/carrefour/fid/android/presentation/models/q;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.splash.SplashActivity$onCreate$3$1$1 */
public final class SplashActivity$onCreate$3$1$1 extends Lambda implements C11300l<C38525q, C11079d2> {
    final /* synthetic */ boolean $isConnected;
    final /* synthetic */ SplashActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SplashActivity$onCreate$3$1$1(SplashActivity splashActivity, boolean z) {
        super(1);
        this.this$0 = splashActivity;
        this.$isConnected = z;
    }

    /* renamed from: a */
    public final void mo74754a(@C12580l C38525q qVar) {
        this.this$0.mo74727j1(qVar, this.$isConnected);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo74754a((C38525q) obj);
        return C11079d2.f28267a;
    }
}

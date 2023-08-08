package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2;

import com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.C23617b;
import com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.C26191b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Screen$2$1$1 */
public final class NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Screen$2$1$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C11300l<C23617b, C11079d2> $actioner;
    final /* synthetic */ C26191b.C26192a $cardFid;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Screen$2$1$1(C26191b.C26192a aVar, C11300l<? super C23617b, C11079d2> lVar) {
        super(0);
        this.$cardFid = aVar;
        this.$actioner = lVar;
    }

    public final void invoke() {
        C26191b.C26192a aVar = this.$cardFid;
        boolean z = false;
        if (aVar != null && aVar.mo76149n()) {
            z = true;
        }
        if (z) {
            this.$actioner.invoke(C23617b.C23618a.C23621c.f59574a);
        } else {
            this.$actioner.invoke(C23617b.C23631g.f59596a);
        }
    }
}

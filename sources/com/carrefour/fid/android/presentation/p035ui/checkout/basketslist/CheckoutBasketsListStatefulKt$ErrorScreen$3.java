package com.carrefour.fid.android.presentation.p035ui.checkout.basketslist;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.presentation.p035ui.checkout.basketslist.analytics.C23456a;
import com.carrefour.fid.android.shared.type.C28892e;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.basketslist.CheckoutBasketsListStatefulKt$ErrorScreen$3 */
public final class CheckoutBasketsListStatefulKt$ErrorScreen$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C11300l<C23460b, C11079d2> $actioner;
    final /* synthetic */ C23456a $analytics;
    final /* synthetic */ C28892e.C28893a $errorState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutBasketsListStatefulKt$ErrorScreen$3(C28892e.C28893a aVar, C23456a aVar2, C11300l<? super C23460b, C11079d2> lVar, int i) {
        super(2);
        this.$errorState = aVar;
        this.$analytics = aVar2;
        this.$actioner = lVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        CheckoutBasketsListStatefulKt.m104519e(this.$errorState, this.$analytics, this.$actioner, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}

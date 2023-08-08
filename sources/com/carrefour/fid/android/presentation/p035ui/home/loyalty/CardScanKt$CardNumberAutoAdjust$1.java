package com.carrefour.fid.android.presentation.p035ui.home.loyalty;

import androidx.compose.foundation.layout.C2362h;
import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.home.loyalty.CardScanKt$CardNumberAutoAdjust$1 */
public final class CardScanKt$CardNumberAutoAdjust$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ String $card;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C2362h $this_CardNumberAutoAdjust;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardScanKt$CardNumberAutoAdjust$1(C2362h hVar, C8767m mVar, String str, int i) {
        super(2);
        this.$this_CardNumberAutoAdjust = hVar;
        this.$modifier = mVar;
        this.$card = str;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        CardScanKt.m106404a(this.$this_CardNumberAutoAdjust, this.$modifier, this.$card, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}

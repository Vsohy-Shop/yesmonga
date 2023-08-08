package com.carrefour.fid.android.presentation.p035ui.orders.online.view;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.view.OrdersOnlineItemComponentKt$TextStatusComponent$2 */
public final class OrdersOnlineItemComponentKt$TextStatusComponent$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ String $text;
    final /* synthetic */ TextStatusVariant $textStatusVariant;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrdersOnlineItemComponentKt$TextStatusComponent$2(C8767m mVar, String str, TextStatusVariant textStatusVariant, int i, int i2) {
        super(2);
        this.$modifier = mVar;
        this.$text = str;
        this.$textStatusVariant = textStatusVariant;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        OrdersOnlineItemComponentKt.m109372i(this.$modifier, this.$text, this.$textStatusVariant, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}

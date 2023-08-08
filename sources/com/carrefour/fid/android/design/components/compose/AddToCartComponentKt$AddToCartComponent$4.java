package com.carrefour.fid.android.design.components.compose;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class AddToCartComponentKt$AddToCartComponent$4 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $buttonBackgroundColor;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ boolean $isLoading;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C11289a<C11079d2> $onClick;
    final /* synthetic */ String $price;
    final /* synthetic */ long $priceBackgroundColor;
    final /* synthetic */ String $textButton;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddToCartComponentKt$AddToCartComponent$4(C8767m mVar, boolean z, long j, long j2, String str, String str2, boolean z2, C11289a<C11079d2> aVar, int i, int i2) {
        super(2);
        this.$modifier = mVar;
        this.$isLoading = z;
        this.$buttonBackgroundColor = j;
        this.$priceBackgroundColor = j2;
        this.$price = str;
        this.$textButton = str2;
        this.$enabled = z2;
        this.$onClick = aVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        AddToCartComponentKt.m151307c(this.$modifier, this.$isLoading, this.$buttonBackgroundColor, this.$priceBackgroundColor, this.$price, this.$textButton, this.$enabled, this.$onClick, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}

package com.carrefour.fid.android.design.components.compose;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class PriceComponentKt$SideBySideVariant$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $isVariableWeight;
    final /* synthetic */ boolean $isVariableWeightEnabled;
    final /* synthetic */ String $price;
    final /* synthetic */ long $priceColor;
    final /* synthetic */ long $priceSize;
    final /* synthetic */ String $subPrice;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PriceComponentKt$SideBySideVariant$2(String str, long j, long j2, String str2, boolean z, boolean z2, int i, int i2) {
        super(2);
        this.$price = str;
        this.$priceSize = j;
        this.$priceColor = j2;
        this.$subPrice = str2;
        this.$isVariableWeight = z;
        this.$isVariableWeightEnabled = z2;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        PriceComponentKt.m151581r(this.$price, this.$priceSize, this.$priceColor, this.$subPrice, this.$isVariableWeight, this.$isVariableWeightEnabled, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}

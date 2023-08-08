package com.carrefour.fid.android.product.presentation.p039ui.details.nal;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.DeliveryChoiceInfoScreenKt$DeliveryTypeComponent$1 */
public final class DeliveryChoiceInfoScreenKt$DeliveryTypeComponent$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ String $delay;
    final /* synthetic */ String $fees;
    final /* synthetic */ String $feesThreshold;
    final /* synthetic */ String $pickUpDelay;
    final /* synthetic */ String $title;
    final /* synthetic */ boolean $withFeesOffered;
    final /* synthetic */ boolean $withPickUpDelay;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeliveryChoiceInfoScreenKt$DeliveryTypeComponent$1(boolean z, boolean z2, String str, String str2, String str3, String str4, String str5, int i, int i2) {
        super(2);
        this.$withFeesOffered = z;
        this.$withPickUpDelay = z2;
        this.$pickUpDelay = str;
        this.$title = str2;
        this.$delay = str3;
        this.$fees = str4;
        this.$feesThreshold = str5;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        DeliveryChoiceInfoScreenKt.m116810d(this.$withFeesOffered, this.$withPickUpDelay, this.$pickUpDelay, this.$title, this.$delay, this.$fees, this.$feesThreshold, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}

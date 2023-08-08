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
public final class ButtonComponentKt$DsButton$4 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ ButtonColor $color;
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ boolean $isLoading;
    final /* synthetic */ Integer $leftIcon;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C11289a<C11079d2> $onClick;
    final /* synthetic */ Integer $rightIcon;
    final /* synthetic */ boolean $showShimmer;
    final /* synthetic */ ButtonSize $size;
    final /* synthetic */ String $text;
    final /* synthetic */ ButtonType $type;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ButtonComponentKt$DsButton$4(C8767m mVar, C11289a<C11079d2> aVar, ButtonSize buttonSize, ButtonType buttonType, ButtonColor buttonColor, boolean z, String str, boolean z2, boolean z3, Integer num, Integer num2, int i, int i2, int i3) {
        super(2);
        this.$modifier = mVar;
        this.$onClick = aVar;
        this.$size = buttonSize;
        this.$type = buttonType;
        this.$color = buttonColor;
        this.$showShimmer = z;
        this.$text = str;
        this.$isEnabled = z2;
        this.$isLoading = z3;
        this.$leftIcon = num;
        this.$rightIcon = num2;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        ButtonComponentKt.m151334a(this.$modifier, this.$onClick, this.$size, this.$type, this.$color, this.$showShimmer, this.$text, this.$isEnabled, this.$isLoading, this.$leftIcon, this.$rightIcon, oVar, C8590n1.m31123a(this.$$changed | 1), C8590n1.m31123a(this.$$changed1), this.$$default);
    }
}

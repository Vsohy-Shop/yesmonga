package com.carrefour.fid.android.design.components.compose;

import androidx.compose.foundation.layout.C2411u0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.res.C16015f;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.design.theme.C37475b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nButtonComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ButtonComponent.kt\ncom/carrefour/fid/android/design/components/compose/ButtonComponentKt$DsButton$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,370:1\n154#2:371\n154#2:372\n154#2:373\n154#2:374\n75#3:375\n*S KotlinDebug\n*F\n+ 1 ButtonComponent.kt\ncom/carrefour/fid/android/design/components/compose/ButtonComponentKt$DsButton$1\n*L\n194#1:371\n195#1:372\n208#1:373\n209#1:374\n215#1:375\n*E\n"})
public final class ButtonComponentKt$DsButton$1 extends Lambda implements C11305q<C2411u0, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ float $buttonHeight;
    final /* synthetic */ boolean $isLoading;
    final /* synthetic */ Integer $leftIcon;
    final /* synthetic */ Integer $rightIcon;
    final /* synthetic */ String $text;
    final /* synthetic */ C16361p0 $textStyle;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ButtonComponentKt$DsButton$1(boolean z, Integer num, int i, String str, C16361p0 p0Var, Integer num2, int i2, float f) {
        super(3);
        this.$isLoading = z;
        this.$leftIcon = num;
        this.$$dirty = i;
        this.$text = str;
        this.$textStyle = p0Var;
        this.$rightIcon = num2;
        this.$$dirty1 = i2;
        this.$buttonHeight = f;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C2411u0) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12579k C2411u0 u0Var, @C12580l C8592o oVar, int i) {
        int i2;
        C2411u0 u0Var2 = u0Var;
        C8592o oVar2 = oVar;
        int i3 = i;
        Intrinsics.checkNotNullParameter(u0Var2, "$this$Button");
        if ((i3 & 14) == 0) {
            i2 = (oVar2.mo15006n0(u0Var2) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i2 & 91) != 18 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(208990846, i3, -1, "com.carrefour.fid.android.design.components.compose.DsButton.<anonymous> (ButtonComponent.kt:186)");
            }
            if (!this.$isLoading) {
                oVar2.mo14918M(1983417550);
                oVar2.mo14918M(1983417568);
                Integer num = this.$leftIcon;
                if (num != null) {
                    IconKt.m13539b(C16015f.m71849d(num.intValue(), oVar2, (this.$$dirty >> 27) & 14), (String) null, SizeKt.m10087C(PaddingKt.m10028o(C8767m.f23478j, 0.0f, 0.0f, C16483g.m74435M((float) 8), 0.0f, 11, (Object) null), C16483g.m74435M((float) 30)), 0, oVar, 440, 8);
                }
                oVar.mo15002m0();
                TextKt.m14196c(this.$text, (C8767m) null, C37475b.f94185a.mo114231a0(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 1, 0, (C11300l<? super C16260h0, C11079d2>) null, this.$textStyle, oVar, (this.$$dirty >> 18) & 14, 3072, 57338);
                Integer num2 = this.$rightIcon;
                if (num2 != null) {
                    IconKt.m13539b(C16015f.m71849d(num2.intValue(), oVar, this.$$dirty1 & 14), (String) null, SizeKt.m10087C(PaddingKt.m10028o(C8767m.f23478j, C16483g.m74435M((float) 8), 0.0f, 0.0f, 0.0f, 14, (Object) null), C16483g.m74435M((float) 30)), 0, oVar, 440, 8);
                } else {
                    C8592o oVar3 = oVar;
                }
                oVar.mo15002m0();
            } else {
                oVar2.mo14918M(1983418416);
                ProgressIndicatorKt.m13705b(u0Var2.mo7845f(SizeKt.m10087C(C8767m.f23478j, C16483g.m74435M(this.$buttonHeight / ((float) 2))), C8734c.f23406a.mo17070q()), C37475b.f94185a.mo114231a0(), 0.0f, 0, 0, oVar, 0, 28);
                oVar.mo15002m0();
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}

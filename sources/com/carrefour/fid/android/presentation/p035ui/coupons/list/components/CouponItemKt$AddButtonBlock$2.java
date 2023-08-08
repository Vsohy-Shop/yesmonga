package com.carrefour.fid.android.presentation.p035ui.coupons.list.components;

import androidx.compose.foundation.layout.C2411u0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.TextKt;
import androidx.compose.material.icons.C3053a;
import androidx.compose.material.icons.filled.C3701rb;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.text.C16260h0;
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
import com.carrefour.fid.android.design.theme.C37477d;
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
@C11363r0({"SMAP\nCouponItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CouponItem.kt\ncom/carrefour/fid/android/presentation/ui/coupons/list/components/CouponItemKt$AddButtonBlock$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,461:1\n154#2:462\n154#2:463\n154#2:464\n*S KotlinDebug\n*F\n+ 1 CouponItem.kt\ncom/carrefour/fid/android/presentation/ui/coupons/list/components/CouponItemKt$AddButtonBlock$2\n*L\n323#1:462\n337#1:463\n338#1:464\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.components.CouponItemKt$AddButtonBlock$2 */
public final class CouponItemKt$AddButtonBlock$2 extends Lambda implements C11305q<C2411u0, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ boolean $isLoading;
    final /* synthetic */ boolean $isSelected;
    final /* synthetic */ String $text;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CouponItemKt$AddButtonBlock$2(boolean z, String str, boolean z2, int i) {
        super(3);
        this.$isLoading = z;
        this.$text = str;
        this.$isSelected = z2;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C2411u0) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12579k C2411u0 u0Var, @C12580l C8592o oVar, int i) {
        C8592o oVar2 = oVar;
        int i2 = i;
        Intrinsics.checkNotNullParameter(u0Var, "$this$TextButton");
        if ((i2 & 81) != 16 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(743099752, i2, -1, "com.carrefour.fid.android.presentation.ui.coupons.list.components.AddButtonBlock.<anonymous> (CouponItem.kt:318)");
            }
            if (this.$isLoading) {
                oVar2.mo14918M(1028280935);
                ProgressIndicatorKt.m13705b(SizeKt.m10087C(C8767m.f23478j, C16483g.m74435M((float) 22)), C37475b.f94185a.mo114218O(), 0.0f, 0, 0, oVar, 6, 28);
                oVar.mo15002m0();
            } else {
                oVar2.mo14918M(1028281094);
                TextKt.m14196c(this.$text, (C8767m) null, this.$isSelected ? C37475b.f94185a.mo114240h() : C37475b.f94185a.mo114218O(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153900l(C37477d.m153887N()), oVar, this.$$dirty & 14, 0, 65530);
                if (this.$isSelected) {
                    IconKt.m13540c(C3701rb.m15751a(C3053a.C3054a.f8153a), (String) null, PaddingKt.m10028o(SizeKt.m10087C(C8767m.f23478j, C16483g.m74435M((float) 25)), C16483g.m74435M((float) 5), 0.0f, 0.0f, 0.0f, 14, (Object) null), C37475b.f94185a.mo114240h(), oVar, 432, 0);
                }
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

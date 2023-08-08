package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.component;

import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.text.style.C16449r;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.constraintlayout.compose.C16591e;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.shared.extension.C28782t;
import com.google.android.material.badge.C31132a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nConstraintLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$2\n+ 2 TotalLoyaltyComponent.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step2/component/TotalLoyaltyComponentKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1524:1\n30#2,4:1525\n40#2,16:1536\n36#3:1529\n1114#4,6:1530\n*S KotlinDebug\n*F\n+ 1 TotalLoyaltyComponent.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step2/component/TotalLoyaltyComponentKt\n*L\n33#1:1529\n33#1:1530,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.TotalLoyaltyComponentKt$TotalLoyaltyComponent$$inlined$ConstraintLayout$2 */
public final class C23658x3a8ca409 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C11289a $onHelpersChanged;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ double $totalInEuros$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23658x3a8ca409(ConstraintLayoutScope constraintLayoutScope, int i, C11289a aVar, double d) {
        super(2);
        this.$scope = constraintLayoutScope;
        this.$onHelpersChanged = aVar;
        this.$totalInEuros$inlined = d;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    public final void invoke(@C12580l C8592o oVar, int i) {
        C8592o oVar2 = oVar;
        if (((i & 11) ^ 2) != 0 || !oVar.mo15011p()) {
            int G = this.$scope.mo48254G();
            this.$scope.mo48256J();
            ConstraintLayoutScope constraintLayoutScope = this.$scope;
            ConstraintLayoutScope.C16574a O = constraintLayoutScope.mo48332O();
            C16591e a = O.mo48336a();
            C16591e i2 = O.mo48344i();
            C8767m.C8768a aVar = C8767m.f23478j;
            oVar2.mo14918M(1157296644);
            boolean n0 = oVar2.mo15006n0(i2);
            Object N = oVar.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                N = new TotalLoyaltyComponentKt$TotalLoyaltyComponent$1$1$1(i2);
                oVar2.mo14893C(N);
            }
            oVar.mo15002m0();
            TextKt.m14196c(C16018i.m71858d(R.string.checkout_non_food_total_fid, oVar2, 0), constraintLayoutScope.mo48330M(aVar, a, (C11300l) N), 0, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, C16449r.f40760b.mo47727c(), false, 1, 0, (C11300l<? super C16260h0, C11079d2>) null, (C16361p0) null, oVar, 0, 3120, 120828);
            ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
            C8767m M = constraintLayoutScope2.mo48330M(aVar, i2, TotalLoyaltyComponentKt$TotalLoyaltyComponent$1$2.f59698f);
            C37475b bVar = C37475b.f94185a;
            long H = bVar.mo114211H();
            long G2 = bVar.mo114210G();
            String b = C28782t.m119105b(Double.valueOf(this.$totalInEuros$inlined));
            TotalLoyaltyComponentKt.m105069a(M, H, G2, C31132a.f74628J0 + b, oVar, 0, 0);
            if (this.$scope.mo48254G() != G) {
                this.$onHelpersChanged.invoke();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}

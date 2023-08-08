package com.carrefour.fid.android.service.presentation.p044ui.delivery.screen;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.C7933t0;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.constraintlayout.compose.C16591e;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.C37477d;
import com.carrefour.fid.android.service.C28330R;
import com.carrefour.fid.android.shared.extension.C28782t;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nConstraintLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$2\n+ 2 ItemDeliveryFeePrice.kt\ncom/carrefour/fid/android/service/presentation/ui/delivery/screen/ItemDeliveryFeePriceKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1524:1\n32#2,2:1525\n41#2,7:1534\n40#2,11:1541\n52#2:1555\n51#2:1556\n58#2:1565\n59#2:1567\n68#2,16:1576\n36#3:1527\n50#3:1557\n49#3:1558\n36#3:1569\n1114#4,6:1528\n1114#4,6:1559\n1114#4,6:1570\n76#5:1552\n1#6:1553\n154#7:1554\n154#7:1566\n154#7:1568\n*S KotlinDebug\n*F\n+ 1 ItemDeliveryFeePrice.kt\ncom/carrefour/fid/android/service/presentation/ui/delivery/screen/ItemDeliveryFeePriceKt\n*L\n33#1:1527\n52#1:1557\n52#1:1558\n59#1:1569\n33#1:1528,6\n52#1:1559,6\n59#1:1570,6\n50#1:1552\n50#1:1554\n58#1:1566\n59#1:1568\n*E\n"})
/* renamed from: com.carrefour.fid.android.service.presentation.ui.delivery.screen.ItemDeliveryFeePriceKt$ItemDeliveryFeePrice$$inlined$ConstraintLayout$2 */
public final class C28396x409fa5a9 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$dirty$inlined;
    final /* synthetic */ double $feePrice$inlined;
    final /* synthetic */ String $label$inlined;
    final /* synthetic */ C11289a $onHelpersChanged;
    final /* synthetic */ ConstraintLayoutScope $scope;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28396x409fa5a9(ConstraintLayoutScope constraintLayoutScope, int i, C11289a aVar, String str, int i2, double d) {
        super(2);
        this.$scope = constraintLayoutScope;
        this.$onHelpersChanged = aVar;
        this.$label$inlined = str;
        this.$$dirty$inlined = i2;
        this.$feePrice$inlined = d;
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
            C16591e j = O.mo48345j();
            C8767m.C8768a aVar = C8767m.f23478j;
            oVar2.mo14918M(1157296644);
            boolean n0 = oVar2.mo15006n0(i2);
            Object N = oVar.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                N = new C28397x89bffd8b(i2);
                oVar2.mo14893C(N);
            }
            oVar.mo15002m0();
            C8767m M = constraintLayoutScope.mo48330M(aVar, j, (C11300l) N);
            C8767m M2 = constraintLayoutScope.mo48330M(aVar, a, ItemDeliveryFeePriceKt$ItemDeliveryFeePrice$1$1.INSTANCE);
            C7933t0 t0Var = C7933t0.f19075a;
            int i3 = C7933t0.f19076b;
            C7933t0 t0Var2 = t0Var;
            int i4 = i3;
            C8767m.C8768a aVar2 = aVar;
            C16591e eVar = i2;
            ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
            int i5 = G;
            TextKt.m14196c(this.$label$inlined, M2, 0, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153890b(t0Var.mo11077c(oVar2, i3)), oVar, (this.$$dirty$inlined >> 3) & 14, 0, 65532);
            C8592o oVar3 = oVar;
            float g5 = ((C16479d) oVar3.mo15032w(CompositionLocalsKt.m71011i())).mo7425g5(C16483g.m74435M((float) 4));
            oVar3.mo14918M(511388516);
            C16591e eVar2 = a;
            C16591e eVar3 = j;
            boolean n02 = oVar3.mo15006n0(eVar2) | oVar3.mo15006n0(eVar3);
            Object N2 = oVar.mo14921N();
            if (n02 || N2 == C8592o.f23032a.mo16277a()) {
                N2 = new ItemDeliveryFeePriceKt$ItemDeliveryFeePrice$1$2$1(eVar2, eVar3);
                oVar3.mo14893C(N2);
            }
            oVar.mo15002m0();
            ConstraintLayoutScope constraintLayoutScope3 = constraintLayoutScope2;
            C8767m m = PaddingKt.m10026m(SizeKt.m10115o(constraintLayoutScope3.mo48330M(aVar2, eVar, (C11300l) N2), C16483g.m74435M((float) 5)), C16483g.m74435M((float) 8), 0.0f, 2, (Object) null);
            Float valueOf = Float.valueOf(g5);
            oVar3.mo14918M(1157296644);
            boolean n03 = oVar3.mo15006n0(valueOf);
            Object N3 = oVar.mo14921N();
            if (n03 || N3 == C8592o.f23032a.mo16277a()) {
                N3 = new ItemDeliveryFeePriceKt$ItemDeliveryFeePrice$1$3$1(g5);
                oVar3.mo14893C(N3);
            }
            oVar.mo15002m0();
            CanvasKt.m8873b(m, (C11300l) N3, oVar3, 0);
            if (this.$feePrice$inlined > 0.0d) {
                oVar3.mo14918M(308347798);
                String b = C28782t.m119105b(Double.valueOf(this.$feePrice$inlined));
                C16361p0 M3 = C37477d.m153886M(t0Var2.mo11077c(oVar3, i4));
                TextKt.m14196c(b, M, C37475b.f94185a.mo114205B(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, M3, oVar, 0, 0, 65528);
                oVar.mo15002m0();
            } else {
                C8592o oVar4 = oVar;
                oVar4.mo14918M(308348039);
                String d = C16018i.m71858d(C28330R.string.price_line_complimentary, oVar4, 0);
                C16361p0 M4 = C37477d.m153886M(t0Var2.mo11077c(oVar4, i4));
                TextKt.m14196c(d, M, C37475b.f94185a.mo114219P(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, M4, oVar, 0, 0, 65528);
                oVar.mo15002m0();
            }
            if (this.$scope.mo48254G() != i5) {
                this.$onHelpersChanged.invoke();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}

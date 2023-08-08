package com.carrefour.fid.android.service.presentation.p044ui.delivery.screen;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.C7933t0;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.painter.Painter;
import androidx.compose.p004ui.res.C16015f;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.text.style.C16449r;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.constraintlayout.compose.C16591e;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.C37477d;
import com.carrefour.fid.android.service.C28330R;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nConstraintLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$2\n+ 2 BlockAddress.kt\ncom/carrefour/fid/android/service/presentation/ui/delivery/screen/BlockAddressKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1524:1\n33#2,10:1525\n43#2,7:1536\n58#2,3:1550\n56#2,2:1553\n48#2:1555\n62#2:1556\n154#3:1535\n36#4:1543\n1114#5,6:1544\n*S KotlinDebug\n*F\n+ 1 BlockAddress.kt\ncom/carrefour/fid/android/service/presentation/ui/delivery/screen/BlockAddressKt\n*L\n42#1:1535\n49#1:1543\n49#1:1544,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.service.presentation.ui.delivery.screen.BlockAddressKt$BlockAddress$$inlined$ConstraintLayout$2 */
public final class BlockAddressKt$BlockAddress$$inlined$ConstraintLayout$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$dirty$inlined;
    final /* synthetic */ String $address$inlined;
    final /* synthetic */ C11289a $onHelpersChanged;
    final /* synthetic */ ConstraintLayoutScope $scope;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BlockAddressKt$BlockAddress$$inlined$ConstraintLayout$2(ConstraintLayoutScope constraintLayoutScope, int i, C11289a aVar, String str, int i2) {
        super(2);
        this.$scope = constraintLayoutScope;
        this.$onHelpersChanged = aVar;
        this.$address$inlined = str;
        this.$$dirty$inlined = i2;
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
            C8767m l = PaddingKt.m10025l(constraintLayoutScope.mo48330M(aVar, a, BlockAddressKt$BlockAddress$1$1.INSTANCE), C16483g.m74435M((float) 8), C16483g.m74435M((float) 16));
            Painter d = C16015f.m71849d(C28330R.C28332drawable.ds_ic_map_annotation, oVar2, 0);
            C37475b bVar = C37475b.f94185a;
            IconKt.m13539b(d, (String) null, l, bVar.mo114218O(), oVar, 56, 0);
            oVar2.mo14918M(1157296644);
            boolean n0 = oVar2.mo15006n0(a);
            Object N = oVar.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                N = new BlockAddressKt$BlockAddress$1$2$1(a);
                oVar2.mo14893C(N);
            }
            oVar.mo15002m0();
            C8767m M = constraintLayoutScope.mo48330M(aVar, i2, (C11300l) N);
            int c = C16449r.f40760b.mo47727c();
            TextKt.m14196c(this.$address$inlined, M, bVar.mo114257y(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, c, false, 1, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153892d(C7933t0.f19075a.mo11077c(oVar2, C7933t0.f19076b)), oVar, (this.$$dirty$inlined >> 3) & 14, 3120, 55288);
            if (this.$scope.mo48254G() != G) {
                this.$onHelpersChanged.invoke();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}

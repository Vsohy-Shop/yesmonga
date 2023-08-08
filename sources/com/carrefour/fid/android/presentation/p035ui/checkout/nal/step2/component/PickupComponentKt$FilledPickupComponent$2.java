package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.component;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C2428y0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.C7933t0;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.semantics.C16031g;
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
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.C37477d;
import com.carrefour.fid.android.domain.models.pickup.C38080a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nPickupComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PickupComponent.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step2/component/PickupComponentKt$FilledPickupComponent$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,113:1\n154#2:114\n154#2:115\n154#2:116\n*S KotlinDebug\n*F\n+ 1 PickupComponent.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step2/component/PickupComponentKt$FilledPickupComponent$2\n*L\n46#1:114\n52#1:115\n57#1:116\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.PickupComponentKt$FilledPickupComponent$2 */
public final class PickupComponentKt$FilledPickupComponent$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ C11289a<C11079d2> $onSeeOpenings;
    final /* synthetic */ C38080a $pickup;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PickupComponentKt$FilledPickupComponent$2(C38080a aVar, C11289a<C11079d2> aVar2) {
        super(2);
        this.$pickup = aVar;
        this.$onSeeOpenings = aVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        C8592o oVar2 = oVar;
        int i2 = i;
        if ((i2 & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(933770606, i2, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.FilledPickupComponent.<anonymous> (PickupComponent.kt:42)");
            }
            C8767m.C8768a aVar = C8767m.f23478j;
            float f = (float) 8;
            C8767m o = PaddingKt.m10028o(aVar, 0.0f, 0.0f, 0.0f, C16483g.m74435M(f), 7, (Object) null);
            String r = this.$pickup.mo118290r();
            C7933t0 t0Var = C7933t0.f19075a;
            int i3 = C7933t0.f19076b;
            C8767m.C8768a aVar2 = aVar;
            C8592o oVar3 = oVar;
            TextKt.m14196c(r, o, 0, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153890b(t0Var.mo11077c(oVar2, i3)), oVar3, 48, 0, 65532);
            C8767m o2 = PaddingKt.m10028o(aVar2, 0.0f, 0.0f, 0.0f, C16483g.m74435M(f), 7, (Object) null);
            String m = this.$pickup.mo118285m();
            String t = this.$pickup.mo118292t();
            String n = this.$pickup.mo118286n();
            int i4 = i3;
            C7933t0 t0Var2 = t0Var;
            TextKt.m14196c(m + ", " + t + " " + n, o2, 0, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153890b(t0Var2.mo11077c(oVar, i4)), oVar3, 48, 0, 65532);
            C8767m.C8768a aVar3 = aVar2;
            C8592o oVar4 = oVar;
            C2428y0.m10726a(SizeKt.m10115o(aVar3, C16483g.m74435M((float) 4)), oVar4, 6);
            TextKt.m14196c(C16018i.m71858d(R.string.pickup_map_see_openings_button, oVar4, 0), ClickableKt.m8878e(aVar3, false, (String) null, (C16031g) null, this.$onSeeOpenings, 7, (Object) null), C37475b.f94185a.mo114218O(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153896h(t0Var2.mo11077c(oVar4, i4)), oVar3, 0, 0, 65528);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}

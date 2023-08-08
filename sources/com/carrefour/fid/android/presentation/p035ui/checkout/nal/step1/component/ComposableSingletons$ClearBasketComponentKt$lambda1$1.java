package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.component;

import androidx.compose.foundation.layout.C2411u0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.C7933t0;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.painter.Painter;
import androidx.compose.p004ui.res.C16015f;
import androidx.compose.p004ui.res.C16018i;
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
import com.carrefour.fid.android.design.theme.C37477d;
import com.contentsquare.android.api.C14092c;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroidx/compose/foundation/layout/u0;", "Lkotlin/d2;", "invoke", "(Landroidx/compose/foundation/layout/u0;Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nClearBasketComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClearBasketComponent.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step1/component/ComposableSingletons$ClearBasketComponentKt$lambda-1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,66:1\n154#2:67\n154#2:68\n*S KotlinDebug\n*F\n+ 1 ClearBasketComponent.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step1/component/ComposableSingletons$ClearBasketComponentKt$lambda-1$1\n*L\n45#1:67\n49#1:68\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.component.ComposableSingletons$ClearBasketComponentKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$ClearBasketComponentKt$lambda1$1 extends Lambda implements C11305q<C2411u0, C8592o, Integer, C11079d2> {

    /* renamed from: f */
    public static final ComposableSingletons$ClearBasketComponentKt$lambda1$1 f59486f = new ComposableSingletons$ClearBasketComponentKt$lambda1$1();

    public ComposableSingletons$ClearBasketComponentKt$lambda1$1() {
        super(3);
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
        Intrinsics.checkNotNullParameter(u0Var, "$this$OutlinedButton");
        if ((i2 & 81) != 16 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1249850840, i2, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step1.component.ComposableSingletons$ClearBasketComponentKt.lambda-1.<anonymous> (ClearBasketComponent.kt:40)");
            }
            Painter d = C16015f.m71849d(R.drawable.ic_trash, oVar2, 0);
            String d2 = C16018i.m71858d(R.string.basket_clean_text, oVar2, 0);
            C8767m.C8768a aVar = C8767m.f23478j;
            IconKt.m13539b(d, d2, SizeKt.m10092H(SizeKt.m10115o(aVar, C16483g.m74435M((float) 15)), C16483g.m74435M((float) 12)), 0, oVar, C14092c.f34507C0, 8);
            TextKt.m14196c(C16018i.m71858d(R.string.basket_clean_text, oVar2, 0), PaddingKt.m10028o(aVar, C16483g.m74435M((float) 8), 0.0f, 0.0f, 0.0f, 14, (Object) null), 0, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153896h(C7933t0.f19075a.mo11077c(oVar2, C7933t0.f19076b)), oVar, 48, 0, 65532);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}

package com.carrefour.fid.android.presentation.viewmodels.order.refont.view;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.R;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.refont.view.ComposableSingletons$OrderHeaderComponentKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$OrderHeaderComponentKt$lambda1$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {

    /* renamed from: f */
    public static final ComposableSingletons$OrderHeaderComponentKt$lambda1$1 f65826f = new ComposableSingletons$OrderHeaderComponentKt$lambda1$1();

    public ComposableSingletons$OrderHeaderComponentKt$lambda1$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        if ((i & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-537404010, i, -1, "com.carrefour.fid.android.presentation.viewmodels.order.refont.view.ComposableSingletons$OrderHeaderComponentKt.lambda-1.<anonymous> (OrderHeaderComponent.kt:70)");
            }
            OrderHeaderComponentKt.m114484a((C8767m) null, new OrderHeaderModel(R.drawable.order_market_place, R.string.order_type_drive, "69006004", "lun. 11 juil. 15h00 - 15h30", true), oVar, 64, 1);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}

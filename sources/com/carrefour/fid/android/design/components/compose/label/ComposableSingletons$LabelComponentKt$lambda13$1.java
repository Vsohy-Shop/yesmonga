package com.carrefour.fid.android.design.components.compose.label;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.res.C16009b;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.design.components.C36896b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.design.components.compose.label.ComposableSingletons$LabelComponentKt$lambda-13$1  reason: invalid class name */
public final class ComposableSingletons$LabelComponentKt$lambda13$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {

    /* renamed from: f */
    public static final ComposableSingletons$LabelComponentKt$lambda13$1 f92460f = new ComposableSingletons$LabelComponentKt$lambda13$1();

    public ComposableSingletons$LabelComponentKt$lambda13$1() {
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
                ComposerKt.m29845w0(-1016207666, i, -1, "com.carrefour.fid.android.design.components.compose.label.ComposableSingletons$LabelComponentKt.lambda-13.<anonymous> (LabelComponent.kt:406)");
            }
            long a = C16009b.m71825a(C36896b.C36902f.ds_red_1, oVar, 0);
            C15240j2.C15241a aVar = C15240j2.f37547b;
            LabelComponentKt.m151838k(a, aVar.mo42852w(), aVar.mo42852w(), C36896b.C36904h.ds_ic_promotion_percentage, "Promo", (C8767m) null, oVar, 25008, 32);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}

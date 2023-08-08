package com.carrefour.fid.android.design.components.compose.label;

import androidx.compose.p004ui.C8767m;
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
import org.jsoup.parser.C12888a;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.design.components.compose.label.ComposableSingletons$LabelComponentKt$lambda-9$1  reason: invalid class name */
public final class ComposableSingletons$LabelComponentKt$lambda9$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {

    /* renamed from: f */
    public static final ComposableSingletons$LabelComponentKt$lambda9$1 f92473f = new ComposableSingletons$LabelComponentKt$lambda9$1();

    public ComposableSingletons$LabelComponentKt$lambda9$1() {
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
                ComposerKt.m29845w0(914331916, i, -1, "com.carrefour.fid.android.design.components.compose.label.ComposableSingletons$LabelComponentKt.lambda-9.<anonymous> (LabelComponent.kt:377)");
            }
            long a = C16009b.m71825a(C36896b.C36902f.ds_blue_light, oVar, 0);
            int i2 = C36896b.C36902f.ds_primary_dark;
            LabelComponentKt.m151828a(a, C16009b.m71825a(i2, oVar, 0), C16009b.m71825a(i2, oVar, 0), C36896b.C36904h.ds_ic_diagonal_card_fid, "Fidelité", (C8767m) null, oVar, C12888a.f31808q, 32);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}

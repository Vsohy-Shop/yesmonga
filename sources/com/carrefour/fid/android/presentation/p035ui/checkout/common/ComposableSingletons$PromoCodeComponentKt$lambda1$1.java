package com.carrefour.fid.android.presentation.p035ui.checkout.common;

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
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.R;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.common.ComposableSingletons$PromoCodeComponentKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$PromoCodeComponentKt$lambda1$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {

    /* renamed from: f */
    public static final ComposableSingletons$PromoCodeComponentKt$lambda1$1 f59391f = new ComposableSingletons$PromoCodeComponentKt$lambda1$1();

    public ComposableSingletons$PromoCodeComponentKt$lambda1$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        int i2 = i;
        if ((i2 & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1808406914, i2, -1, "com.carrefour.fid.android.presentation.ui.checkout.common.ComposableSingletons$PromoCodeComponentKt.lambda-1.<anonymous> (PromoCodeComponent.kt:121)");
            }
            TextKt.m14196c(C16018i.m71858d(R.string.checkout_step2_promo_code, oVar, 0), (C8767m) null, 0, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, C16449r.f40760b.mo47727c(), false, 1, 0, (C11300l<? super C16260h0, C11079d2>) null, (C16361p0) null, oVar, 0, 3120, 120830);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}

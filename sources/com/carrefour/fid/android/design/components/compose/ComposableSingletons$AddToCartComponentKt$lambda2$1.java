package com.carrefour.fid.android.design.components.compose;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.design.theme.C37475b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.design.components.compose.ComposableSingletons$AddToCartComponentKt$lambda-2$1  reason: invalid class name */
public final class ComposableSingletons$AddToCartComponentKt$lambda2$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {

    /* renamed from: f */
    public static final ComposableSingletons$AddToCartComponentKt$lambda2$1 f92136f = new ComposableSingletons$AddToCartComponentKt$lambda2$1();

    public ComposableSingletons$AddToCartComponentKt$lambda2$1() {
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
                ComposerKt.m29845w0(2052490741, i2, -1, "com.carrefour.fid.android.design.components.compose.ComposableSingletons$AddToCartComponentKt.lambda-2.<anonymous> (AddToCartComponent.kt:118)");
            }
            C8767m n = SizeKt.m10114n(C8767m.f23478j, 0.0f, 1, (Object) null);
            C37475b bVar = C37475b.f94185a;
            AddToCartComponentKt.m151307c(n, false, bVar.mo114218O(), bVar.mo114220Q(), "145,45€", (String) null, false, C369291.f92137f, oVar, 12607542, 96);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}

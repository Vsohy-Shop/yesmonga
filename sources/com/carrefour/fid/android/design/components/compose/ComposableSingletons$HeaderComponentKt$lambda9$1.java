package com.carrefour.fid.android.design.components.compose;

import androidx.compose.p004ui.text.C16361p0;
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
/* renamed from: com.carrefour.fid.android.design.components.compose.ComposableSingletons$HeaderComponentKt$lambda-9$1  reason: invalid class name */
public final class ComposableSingletons$HeaderComponentKt$lambda9$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {

    /* renamed from: f */
    public static final ComposableSingletons$HeaderComponentKt$lambda9$1 f92226f = new ComposableSingletons$HeaderComponentKt$lambda9$1();

    public ComposableSingletons$HeaderComponentKt$lambda9$1() {
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
                ComposerKt.m29845w0(-1994162894, i2, -1, "com.carrefour.fid.android.design.components.compose.ComposableSingletons$HeaderComponentKt.lambda-9.<anonymous> (HeaderComponent.kt:528)");
            }
            C37475b bVar = C37475b.f94185a;
            HeaderComponentKt.m151497b("Navigation Action Preview", (C16361p0) null, 0, bVar.mo114231a0(), bVar.mo114231a0(), "", C369441.f92227f, ComposableSingletons$HeaderComponentKt.f92189a.mo112081m(), oVar, 14352390, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}

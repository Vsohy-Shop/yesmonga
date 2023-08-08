package com.carrefour.fid.android.service.presentation.p044ui.delivery.screen;

import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.service.C28330R;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.service.presentation.ui.delivery.screen.ComposableSingletons$ExitDialogComponentKt$lambda-3$1  reason: invalid class name */
public final class ComposableSingletons$ExitDialogComponentKt$lambda3$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    public static final ComposableSingletons$ExitDialogComponentKt$lambda3$1 INSTANCE = new ComposableSingletons$ExitDialogComponentKt$lambda3$1();

    public ComposableSingletons$ExitDialogComponentKt$lambda3$1() {
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
                ComposerKt.m29845w0(1726891038, i2, -1, "com.carrefour.fid.android.service.presentation.ui.delivery.screen.ComposableSingletons$ExitDialogComponentKt.lambda-3.<anonymous> (ExitDialogComponent.kt:29)");
            }
            int a = C16432i.f40718b.mo47667a();
            C16209i0 c = C16209i0.f40292b.mo46947c();
            TextKt.m14196c(C16018i.m71858d(C28330R.string.general_external_link_popup_title, oVar, 0), SizeKt.m10114n(C8767m.f23478j, 0.0f, 1, (Object) null), C37475b.f94185a.mo114230a(), 0, (C16190e0) null, c, (C16242u) null, 0, (C16434j) null, C16432i.m74172g(a), 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, (C16361p0) null, oVar, 196656, 0, 130520);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}

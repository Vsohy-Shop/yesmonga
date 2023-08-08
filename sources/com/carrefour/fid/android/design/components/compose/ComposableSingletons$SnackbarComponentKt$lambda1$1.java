package com.carrefour.fid.android.design.components.compose;

import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8767m;
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
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/compose/foundation/layout/i0;", "paddingValues", "Lkotlin/d2;", "invoke", "(Landroidx/compose/foundation/layout/i0;Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.design.components.compose.ComposableSingletons$SnackbarComponentKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$SnackbarComponentKt$lambda1$1 extends Lambda implements C11305q<C2366i0, C8592o, Integer, C11079d2> {

    /* renamed from: f */
    public static final ComposableSingletons$SnackbarComponentKt$lambda1$1 f92286f = new ComposableSingletons$SnackbarComponentKt$lambda1$1();

    public ComposableSingletons$SnackbarComponentKt$lambda1$1() {
        super(3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C2366i0) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12579k C2366i0 i0Var, @C12580l C8592o oVar, int i) {
        int i2;
        C2366i0 i0Var2 = i0Var;
        int i3 = i;
        Intrinsics.checkNotNullParameter(i0Var2, "paddingValues");
        if ((i3 & 14) == 0) {
            i2 = (oVar.mo15006n0(i0Var2) ? 4 : 2) | i3;
        } else {
            C8592o oVar2 = oVar;
            i2 = i3;
        }
        if ((i2 & 91) != 18 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1354311135, i3, -1, "com.carrefour.fid.android.design.components.compose.ComposableSingletons$SnackbarComponentKt.lambda-1.<anonymous> (SnackbarComponent.kt:124)");
            }
            TextKt.m14196c("Pour voir la snackbar, passer en vue interactive", PaddingKt.m10023j(C8767m.f23478j, i0Var2), 0, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, (C16361p0) null, oVar, 6, 0, 131068);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}

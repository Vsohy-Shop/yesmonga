package androidx.compose.material;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/compose/material/SnackbarHostState;", "it", "Lkotlin/d2;", "a", "(Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/o;I)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.material.ComposableSingletons$BottomSheetScaffoldKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$BottomSheetScaffoldKt$lambda1$1 extends Lambda implements C11305q<SnackbarHostState, C8592o, Integer, C11079d2> {

    /* renamed from: f */
    public static final ComposableSingletons$BottomSheetScaffoldKt$lambda1$1 f7596f = new ComposableSingletons$BottomSheetScaffoldKt$lambda1$1();

    public ComposableSingletons$BottomSheetScaffoldKt$lambda1$1() {
        super(3);
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public final void mo10104a(@C12579k SnackbarHostState snackbarHostState, @C12580l C8592o oVar, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(snackbarHostState, "it");
        if ((i & 14) == 0) {
            if (oVar.mo15006n0(snackbarHostState)) {
                i2 = 4;
            } else {
                i2 = 2;
            }
            i |= i2;
        }
        if ((i & 91) != 18 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(895288908, i, -1, "androidx.compose.material.ComposableSingletons$BottomSheetScaffoldKt.lambda-1.<anonymous> (BottomSheetScaffold.kt:307)");
            }
            SnackbarHostKt.m13845b(snackbarHostState, (C8767m) null, (C11305q<? super C3052i1, ? super C8592o, ? super Integer, C11079d2>) null, oVar, i & 14, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo10104a((SnackbarHostState) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }
}

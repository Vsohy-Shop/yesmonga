package androidx.compose.material;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.bumptech.glide.gifdecoder.C22073d;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/compose/material/i1;", "it", "Lkotlin/d2;", "a", "(Landroidx/compose/material/i1;Landroidx/compose/runtime/o;I)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.material.ComposableSingletons$SnackbarHostKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$SnackbarHostKt$lambda1$1 extends Lambda implements C11305q<C3052i1, C8592o, Integer, C11079d2> {

    /* renamed from: f */
    public static final ComposableSingletons$SnackbarHostKt$lambda1$1 f7608f = new ComposableSingletons$SnackbarHostKt$lambda1$1();

    public ComposableSingletons$SnackbarHostKt$lambda1$1() {
        super(3);
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public final void mo10114a(@C12579k C3052i1 i1Var, @C12580l C8592o oVar, int i) {
        int i2;
        int i3;
        C3052i1 i1Var2 = i1Var;
        Intrinsics.checkNotNullParameter(i1Var2, "it");
        C8592o oVar2 = oVar;
        if ((i & 14) == 0) {
            if (oVar2.mo15006n0(i1Var2)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(996639038, i2, -1, "androidx.compose.material.ComposableSingletons$SnackbarHostKt.lambda-1.<anonymous> (SnackbarHost.kt:153)");
            }
            SnackbarKt.m13864d(i1Var, (C8767m) null, false, (C15218g4) null, 0, 0, 0, 0.0f, oVar, i2 & 14, C22073d.f56678l);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo10114a((C3052i1) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }
}

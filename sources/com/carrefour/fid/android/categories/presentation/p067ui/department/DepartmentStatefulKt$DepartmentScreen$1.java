package com.carrefour.fid.android.categories.presentation.p067ui.department;

import androidx.compose.material3.C8275r3;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.categories.presentation.ui.department.DepartmentStatefulKt$DepartmentScreen$1 */
public final class DepartmentStatefulKt$DepartmentScreen$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11300l<C39769a, C11079d2> $actioner;
    final /* synthetic */ C8275r3 $scrollBehavior;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DepartmentStatefulKt$DepartmentScreen$1(C8275r3 r3Var, C11300l<? super C39769a, C11079d2> lVar, int i) {
        super(2);
        this.$scrollBehavior = r3Var;
        this.$actioner = lVar;
        this.$$dirty = i;
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
                ComposerKt.m29845w0(974518447, i, -1, "com.carrefour.fid.android.categories.presentation.ui.department.DepartmentScreen.<anonymous> (DepartmentStateful.kt:146)");
            }
            DepartmentStatefulKt.m162262d(this.$scrollBehavior, this.$actioner, oVar, (this.$$dirty << 3) & 112);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}

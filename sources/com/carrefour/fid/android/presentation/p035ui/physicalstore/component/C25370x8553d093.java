package com.carrefour.fid.android.presentation.p035ui.physicalstore.component;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.design.components.widgets.C37396r1;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreInfoOpeningsComponentKt$PhysicalStoreInfoOpeningsPreview$1 */
public final class C25370x8553d093 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ C37396r1 $storeInfo;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25370x8553d093(C37396r1 r1Var) {
        super(2);
        this.$storeInfo = r1Var;
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
                ComposerKt.m29845w0(857374845, i, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreInfoOpeningsPreview.<anonymous> (PhysicalStoreInfoOpeningsComponent.kt:471)");
            }
            PhysicalStoreInfoOpeningsComponentKt.m109610g((C8767m) null, "", this.$storeInfo, C253711.f62513f, oVar, (C37396r1.f93965d << 6) | 3120, 1);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}

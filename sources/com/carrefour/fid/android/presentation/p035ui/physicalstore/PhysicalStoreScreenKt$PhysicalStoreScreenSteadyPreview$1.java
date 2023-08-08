package com.carrefour.fid.android.presentation.p035ui.physicalstore;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27101a;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27115b;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27116c;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27127e;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreScreenKt$PhysicalStoreScreenSteadyPreview$1 */
public final class PhysicalStoreScreenKt$PhysicalStoreScreenSteadyPreview$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ C11300l<C27101a, C11079d2> $actioner;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhysicalStoreScreenKt$PhysicalStoreScreenSteadyPreview$1(C11300l<? super C27101a, C11079d2> lVar) {
        super(2);
        this.$actioner = lVar;
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
                ComposerKt.m29845w0(115565965, i, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreScreenSteadyPreview.<anonymous> (PhysicalStoreScreen.kt:444)");
            }
            PhysicalStoreScreenKt.m109459b((C8767m) null, new C27127e(C27116c.C27120d.f65957a, (C27115b) null, 2, (DefaultConstructorMarker) null), this.$actioner, oVar, C22132b.f56831b, 1);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}

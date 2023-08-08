package com.carrefour.fid.android.presentation.p035ui.home.miniHubBlocks;

import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.cms.presentation.models.MiniHubBlocksModel;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.home.miniHubBlocks.MiniHubBlocksKt$TwoHubBlocksPreview$1 */
public final class MiniHubBlocksKt$TwoHubBlocksPreview$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ List<MiniHubBlocksModel> $miniHubBlocksModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MiniHubBlocksKt$TwoHubBlocksPreview$1(List<MiniHubBlocksModel> list) {
        super(2);
        this.$miniHubBlocksModel = list;
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
                ComposerKt.m29845w0(2057458951, i, -1, "com.carrefour.fid.android.presentation.ui.home.miniHubBlocks.TwoHubBlocksPreview.<anonymous> (MiniHubBlocks.kt:268)");
            }
            MiniHubBlocksKt.m106485j(this.$miniHubBlocksModel, C241821.f60480f, oVar, 56);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}

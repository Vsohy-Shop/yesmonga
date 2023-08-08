package androidx.compose.p004ui.graphics.vector;

import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$1 */
public final class VectorPainterKt$RenderVectorGroup$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ Map<String, C15376l> $configs;
    final /* synthetic */ C15381o $vectorNode;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VectorPainterKt$RenderVectorGroup$1(C15381o oVar, Map<String, ? extends C15376l> map) {
        super(2);
        this.$vectorNode = oVar;
        this.$configs = map;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.graphics.vector.VectorComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        if ((i & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1450046638, i, -1, "androidx.compose.ui.graphics.vector.RenderVectorGroup.<anonymous> (VectorPainter.kt:413)");
            }
            VectorPainterKt.m66822a((C15378m) this.$vectorNode, this.$configs, oVar, 64, 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}

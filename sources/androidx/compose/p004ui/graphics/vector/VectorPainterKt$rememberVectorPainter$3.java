package androidx.compose.p004ui.graphics.vector;

import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: androidx.compose.ui.graphics.vector.VectorPainterKt$rememberVectorPainter$3 */
public final class VectorPainterKt$rememberVectorPainter$3 extends Lambda implements C11306r<Float, Float, C8592o, Integer, C11079d2> {
    final /* synthetic */ C15340c $image;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VectorPainterKt$rememberVectorPainter$3(C15340c cVar) {
        super(4);
        this.$image = cVar;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.graphics.vector.VectorComposable")
    /* renamed from: a */
    public final void mo43136a(float f, float f2, @C12580l C8592o oVar, int i) {
        if ((i & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1873274766, i, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter.<anonymous> (VectorPainter.kt:167)");
            }
            VectorPainterKt.m66822a(this.$image.mo43174e(), (Map<String, ? extends C15376l>) null, oVar, 0, 2);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        mo43136a(((Number) obj).floatValue(), ((Number) obj2).floatValue(), (C8592o) obj3, ((Number) obj4).intValue());
        return C11079d2.f28267a;
    }
}

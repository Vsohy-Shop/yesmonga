package androidx.compose.p004ui.graphics.vector;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$2 */
public final class VectorPainterKt$RenderVectorGroup$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Map<String, C15376l> $configs;
    final /* synthetic */ C15378m $group;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VectorPainterKt$RenderVectorGroup$2(C15378m mVar, Map<String, ? extends C15376l> map, int i, int i2) {
        super(2);
        this.$group = mVar;
        this.$configs = map;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        VectorPainterKt.m66822a(this.$group, this.$configs, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}

package androidx.compose.foundation;

import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.painter.Painter;
import androidx.compose.p004ui.layout.C15541c;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ImageKt$Image$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C8734c $alignment;
    final /* synthetic */ float $alpha;
    final /* synthetic */ C15249k2 $colorFilter;
    final /* synthetic */ String $contentDescription;
    final /* synthetic */ C15541c $contentScale;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ Painter $painter;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImageKt$Image$3(Painter painter, String str, C8767m mVar, C8734c cVar, C15541c cVar2, float f, C15249k2 k2Var, int i, int i2) {
        super(2);
        this.$painter = painter;
        this.$contentDescription = str;
        this.$modifier = mVar;
        this.$alignment = cVar;
        this.$contentScale = cVar2;
        this.$alpha = f;
        this.$colorFilter = k2Var;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        ImageKt.m8967b(this.$painter, this.$contentDescription, this.$modifier, this.$alignment, this.$contentScale, this.$alpha, this.$colorFilter, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}

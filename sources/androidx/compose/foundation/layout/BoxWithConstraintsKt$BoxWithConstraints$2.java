package androidx.compose.foundation.layout;

import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class BoxWithConstraintsKt$BoxWithConstraints$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C11305q<C2365i, C8592o, Integer, C11079d2> $content;
    final /* synthetic */ C8734c $contentAlignment;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ boolean $propagateMinConstraints;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BoxWithConstraintsKt$BoxWithConstraints$2(C8767m mVar, C8734c cVar, boolean z, C11305q<? super C2365i, ? super C8592o, ? super Integer, C11079d2> qVar, int i, int i2) {
        super(2);
        this.$modifier = mVar;
        this.$contentAlignment = cVar;
        this.$propagateMinConstraints = z;
        this.$content = qVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        BoxWithConstraintsKt.m9860a(this.$modifier, this.$contentAlignment, this.$propagateMinConstraints, this.$content, oVar, this.$$changed | 1, this.$$default);
    }
}

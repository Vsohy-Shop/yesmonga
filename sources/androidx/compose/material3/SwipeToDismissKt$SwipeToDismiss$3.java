package androidx.compose.material3;

import androidx.compose.foundation.layout.C2411u0;
import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import java.util.Set;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SwipeToDismissKt$SwipeToDismiss$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C11305q<C2411u0, C8592o, Integer, C11079d2> $background;
    final /* synthetic */ Set<DismissDirection> $directions;
    final /* synthetic */ C11305q<C2411u0, C8592o, Integer, C11079d2> $dismissContent;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ DismissState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeToDismissKt$SwipeToDismiss$3(DismissState dismissState, C11305q<? super C2411u0, ? super C8592o, ? super Integer, C11079d2> qVar, C11305q<? super C2411u0, ? super C8592o, ? super Integer, C11079d2> qVar2, C8767m mVar, Set<? extends DismissDirection> set, int i, int i2) {
        super(2);
        this.$state = dismissState;
        this.$background = qVar;
        this.$dismissContent = qVar2;
        this.$modifier = mVar;
        this.$directions = set;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        SwipeToDismissKt.m26368a(this.$state, this.$background, this.$dismissContent, this.$modifier, this.$directions, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}

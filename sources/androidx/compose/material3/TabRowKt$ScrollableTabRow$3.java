package androidx.compose.material3;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class TabRowKt$ScrollableTabRow$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $containerColor;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $divider;
    final /* synthetic */ float $edgePadding;
    final /* synthetic */ C11305q<List<C8184c3>, C8592o, Integer, C11079d2> $indicator;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ int $selectedTabIndex;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $tabs;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TabRowKt$ScrollableTabRow$3(int i, C8767m mVar, long j, long j2, float f, C11305q<? super List<C8184c3>, ? super C8592o, ? super Integer, C11079d2> qVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, int i2, int i3) {
        super(2);
        this.$selectedTabIndex = i;
        this.$modifier = mVar;
        this.$containerColor = j;
        this.$contentColor = j2;
        this.$edgePadding = f;
        this.$indicator = qVar;
        this.$divider = pVar;
        this.$tabs = pVar2;
        this.$$changed = i2;
        this.$$default = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        TabRowKt.m26580a(this.$selectedTabIndex, this.$modifier, this.$containerColor, this.$contentColor, this.$edgePadding, this.$indicator, this.$divider, this.$tabs, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}

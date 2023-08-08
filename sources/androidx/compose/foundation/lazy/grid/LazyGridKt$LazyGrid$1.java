package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.C2195g;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class LazyGridKt$LazyGrid$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ C11300l<LazyGridScope, C11079d2> $content;
    final /* synthetic */ C2366i0 $contentPadding;
    final /* synthetic */ C2195g $flingBehavior;
    final /* synthetic */ Arrangement.C2269d $horizontalArrangement;
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ C11304p<C16479d, C16476b, List<Integer>> $slotSizesSums;
    final /* synthetic */ LazyGridState $state;
    final /* synthetic */ boolean $userScrollEnabled;
    final /* synthetic */ Arrangement.C2279l $verticalArrangement;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyGridKt$LazyGrid$1(C8767m mVar, LazyGridState lazyGridState, C11304p<? super C16479d, ? super C16476b, ? extends List<Integer>> pVar, C2366i0 i0Var, boolean z, boolean z2, C2195g gVar, boolean z3, Arrangement.C2279l lVar, Arrangement.C2269d dVar, C11300l<? super LazyGridScope, C11079d2> lVar2, int i, int i2, int i3) {
        super(2);
        this.$modifier = mVar;
        this.$state = lazyGridState;
        this.$slotSizesSums = pVar;
        this.$contentPadding = i0Var;
        this.$reverseLayout = z;
        this.$isVertical = z2;
        this.$flingBehavior = gVar;
        this.$userScrollEnabled = z3;
        this.$verticalArrangement = lVar;
        this.$horizontalArrangement = dVar;
        this.$content = lVar2;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        LazyGridKt.m11034a(this.$modifier, this.$state, this.$slotSizesSums, this.$contentPadding, this.$reverseLayout, this.$isVertical, this.$flingBehavior, this.$userScrollEnabled, this.$verticalArrangement, this.$horizontalArrangement, this.$content, oVar, C8590n1.m31123a(this.$$changed | 1), C8590n1.m31123a(this.$$changed1), this.$$default);
    }
}

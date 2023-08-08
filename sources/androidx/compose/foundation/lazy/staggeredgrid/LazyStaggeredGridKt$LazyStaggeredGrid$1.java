package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.C2195g;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class LazyStaggeredGridKt$LazyStaggeredGrid$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ C11300l<LazyStaggeredGridScope, C11079d2> $content;
    final /* synthetic */ C2366i0 $contentPadding;
    final /* synthetic */ float $crossAxisSpacing;
    final /* synthetic */ C2195g $flingBehavior;
    final /* synthetic */ float $mainAxisSpacing;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ Orientation $orientation;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ C11304p<C16479d, C16476b, int[]> $slotSizesSums;
    final /* synthetic */ LazyStaggeredGridState $state;
    final /* synthetic */ boolean $userScrollEnabled;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridKt$LazyStaggeredGrid$1(LazyStaggeredGridState lazyStaggeredGridState, Orientation orientation, C11304p<? super C16479d, ? super C16476b, int[]> pVar, C8767m mVar, C2366i0 i0Var, boolean z, C2195g gVar, boolean z2, float f, float f2, C11300l<? super LazyStaggeredGridScope, C11079d2> lVar, int i, int i2, int i3) {
        super(2);
        this.$state = lazyStaggeredGridState;
        this.$orientation = orientation;
        this.$slotSizesSums = pVar;
        this.$modifier = mVar;
        this.$contentPadding = i0Var;
        this.$reverseLayout = z;
        this.$flingBehavior = gVar;
        this.$userScrollEnabled = z2;
        this.$mainAxisSpacing = f;
        this.$crossAxisSpacing = f2;
        this.$content = lVar;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        LazyStaggeredGridKt.m11614a(this.$state, this.$orientation, this.$slotSizesSums, this.$modifier, this.$contentPadding, this.$reverseLayout, this.$flingBehavior, this.$userScrollEnabled, this.$mainAxisSpacing, this.$crossAxisSpacing, this.$content, oVar, C8590n1.m31123a(this.$$changed | 1), C8590n1.m31123a(this.$$changed1), this.$$default);
    }
}

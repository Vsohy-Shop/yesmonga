package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.input.nestedscroll.C15446a;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class PagerKt$Pager$5 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ int $beyondBoundsPageCount;
    final /* synthetic */ C2366i0 $contentPadding;
    final /* synthetic */ SnapFlingBehavior $flingBehavior;
    final /* synthetic */ C8734c.C8736b $horizontalAlignment;
    final /* synthetic */ C11300l<Integer, Object> $key;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ Orientation $orientation;
    final /* synthetic */ C11305q<Integer, C8592o, Integer, C11079d2> $pageContent;
    final /* synthetic */ int $pageCount;
    final /* synthetic */ C15446a $pageNestedScrollConnection;
    final /* synthetic */ C2651b $pageSize;
    final /* synthetic */ float $pageSpacing;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ PagerState $state;
    final /* synthetic */ boolean $userScrollEnabled;
    final /* synthetic */ C8734c.C8737c $verticalAlignment;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagerKt$Pager$5(C8767m mVar, PagerState pagerState, int i, C2651b bVar, float f, Orientation orientation, int i2, C8734c.C8737c cVar, C8734c.C8736b bVar2, C2366i0 i0Var, SnapFlingBehavior snapFlingBehavior, boolean z, boolean z2, C11300l<? super Integer, ? extends Object> lVar, C15446a aVar, C11305q<? super Integer, ? super C8592o, ? super Integer, C11079d2> qVar, int i3, int i4, int i5) {
        super(2);
        this.$modifier = mVar;
        this.$state = pagerState;
        this.$pageCount = i;
        this.$pageSize = bVar;
        this.$pageSpacing = f;
        this.$orientation = orientation;
        this.$beyondBoundsPageCount = i2;
        this.$verticalAlignment = cVar;
        this.$horizontalAlignment = bVar2;
        this.$contentPadding = i0Var;
        this.$flingBehavior = snapFlingBehavior;
        this.$userScrollEnabled = z;
        this.$reverseLayout = z2;
        this.$key = lVar;
        this.$pageNestedScrollConnection = aVar;
        this.$pageContent = qVar;
        this.$$changed = i3;
        this.$$changed1 = i4;
        this.$$default = i5;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        C8592o oVar2 = oVar;
        C8767m mVar = this.$modifier;
        C8767m mVar2 = mVar;
        PagerKt.m11898b(mVar2, this.$state, this.$pageCount, this.$pageSize, this.$pageSpacing, this.$orientation, this.$beyondBoundsPageCount, this.$verticalAlignment, this.$horizontalAlignment, this.$contentPadding, this.$flingBehavior, this.$userScrollEnabled, this.$reverseLayout, this.$key, this.$pageNestedScrollConnection, this.$pageContent, oVar2, C8590n1.m31123a(this.$$changed | 1), C8590n1.m31123a(this.$$changed1), this.$$default);
    }
}

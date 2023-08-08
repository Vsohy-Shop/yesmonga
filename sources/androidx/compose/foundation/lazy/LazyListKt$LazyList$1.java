package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.C2195g;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class LazyListKt$LazyList$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ int $beyondBoundsItemCount;
    final /* synthetic */ C11300l<LazyListScope, C11079d2> $content;
    final /* synthetic */ C2366i0 $contentPadding;
    final /* synthetic */ C2195g $flingBehavior;
    final /* synthetic */ C8734c.C8736b $horizontalAlignment;
    final /* synthetic */ Arrangement.C2269d $horizontalArrangement;
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ LazyListState $state;
    final /* synthetic */ boolean $userScrollEnabled;
    final /* synthetic */ C8734c.C8737c $verticalAlignment;
    final /* synthetic */ Arrangement.C2279l $verticalArrangement;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyListKt$LazyList$1(C8767m mVar, LazyListState lazyListState, C2366i0 i0Var, boolean z, boolean z2, C2195g gVar, boolean z3, int i, C8734c.C8736b bVar, Arrangement.C2279l lVar, C8734c.C8737c cVar, Arrangement.C2269d dVar, C11300l<? super LazyListScope, C11079d2> lVar2, int i2, int i3, int i4) {
        super(2);
        this.$modifier = mVar;
        this.$state = lazyListState;
        this.$contentPadding = i0Var;
        this.$reverseLayout = z;
        this.$isVertical = z2;
        this.$flingBehavior = gVar;
        this.$userScrollEnabled = z3;
        this.$beyondBoundsItemCount = i;
        this.$horizontalAlignment = bVar;
        this.$verticalArrangement = lVar;
        this.$verticalAlignment = cVar;
        this.$horizontalArrangement = dVar;
        this.$content = lVar2;
        this.$$changed = i2;
        this.$$changed1 = i3;
        this.$$default = i4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        C8767m mVar = this.$modifier;
        LazyListState lazyListState = this.$state;
        C2366i0 i0Var = this.$contentPadding;
        boolean z = this.$reverseLayout;
        boolean z2 = this.$isVertical;
        C2195g gVar = this.$flingBehavior;
        boolean z3 = this.$userScrollEnabled;
        int i2 = this.$beyondBoundsItemCount;
        C8734c.C8736b bVar = this.$horizontalAlignment;
        Arrangement.C2279l lVar = this.$verticalArrangement;
        C8734c.C8737c cVar = this.$verticalAlignment;
        Arrangement.C2269d dVar = this.$horizontalArrangement;
        C11300l<LazyListScope, C11079d2> lVar2 = this.$content;
        C8767m mVar2 = mVar;
        LazyListKt.m10800a(mVar2, lazyListState, i0Var, z, z2, gVar, z3, i2, bVar, lVar, cVar, dVar, lVar2, oVar, C8590n1.m31123a(this.$$changed | 1), C8590n1.m31123a(this.$$changed1), this.$$default);
    }
}

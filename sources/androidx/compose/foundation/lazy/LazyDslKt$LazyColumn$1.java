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
public final class LazyDslKt$LazyColumn$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C11300l<LazyListScope, C11079d2> $content;
    final /* synthetic */ C2366i0 $contentPadding;
    final /* synthetic */ C2195g $flingBehavior;
    final /* synthetic */ C8734c.C8736b $horizontalAlignment;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ LazyListState $state;
    final /* synthetic */ boolean $userScrollEnabled;
    final /* synthetic */ Arrangement.C2279l $verticalArrangement;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyDslKt$LazyColumn$1(C8767m mVar, LazyListState lazyListState, C2366i0 i0Var, boolean z, Arrangement.C2279l lVar, C8734c.C8736b bVar, C2195g gVar, boolean z2, C11300l<? super LazyListScope, C11079d2> lVar2, int i, int i2) {
        super(2);
        this.$modifier = mVar;
        this.$state = lazyListState;
        this.$contentPadding = i0Var;
        this.$reverseLayout = z;
        this.$verticalArrangement = lVar;
        this.$horizontalAlignment = bVar;
        this.$flingBehavior = gVar;
        this.$userScrollEnabled = z2;
        this.$content = lVar2;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        LazyDslKt.m10737b(this.$modifier, this.$state, this.$contentPadding, this.$reverseLayout, this.$verticalArrangement, this.$horizontalAlignment, this.$flingBehavior, this.$userScrollEnabled, this.$content, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}

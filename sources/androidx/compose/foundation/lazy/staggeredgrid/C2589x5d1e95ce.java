package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.C2252k;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.layout.C2552k;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.p004ui.unit.C16478c;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.C16496n;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nLazyStaggeredGridMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasurePolicy.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,157:1\n51#2:158\n51#2:159\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasurePolicy.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1\n*L\n90#1:158\n93#1:159\n*E\n"})
/* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1 */
public final class C2589x5d1e95ce extends Lambda implements C11304p<C2552k, C16476b, C2604l> {
    final /* synthetic */ C2366i0 $contentPadding;
    final /* synthetic */ float $crossAxisSpacing;
    final /* synthetic */ C2597f $itemProvider;
    final /* synthetic */ float $mainAxisSpacing;
    final /* synthetic */ Orientation $orientation;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ C11304p<C16479d, C16476b, int[]> $slotSizesSums;
    final /* synthetic */ LazyStaggeredGridState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2589x5d1e95ce(Orientation orientation, C11304p<? super C16479d, ? super C16476b, int[]> pVar, LazyStaggeredGridState lazyStaggeredGridState, C2597f fVar, C2366i0 i0Var, boolean z, float f, float f2) {
        super(2);
        this.$orientation = orientation;
        this.$slotSizesSums = pVar;
        this.$state = lazyStaggeredGridState;
        this.$itemProvider = fVar;
        this.$contentPadding = i0Var;
        this.$reverseLayout = z;
        this.$mainAxisSpacing = f;
        this.$crossAxisSpacing = f2;
    }

    @C12579k
    /* renamed from: a */
    public final C2604l mo8888a(@C12579k C2552k kVar, long j) {
        boolean z;
        int i;
        long j2;
        C2552k kVar2 = kVar;
        long j3 = j;
        Intrinsics.checkNotNullParameter(kVar2, "$this$null");
        C2252k.m9698a(j3, this.$orientation);
        int[] invoke = this.$slotSizesSums.invoke(kVar2, C16476b.m74348b(j));
        if (this.$orientation == Orientation.Vertical) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = z;
        this.$state.mo8914R(invoke);
        this.$state.mo8918V(z2);
        this.$state.mo8917U(this.$itemProvider.mo8863h());
        int n2 = kVar2.mo7429n2(LazyStaggeredGridMeasurePolicyKt.m11660e(this.$contentPadding, this.$orientation, this.$reverseLayout, kVar.getLayoutDirection()));
        int n22 = kVar2.mo7429n2(LazyStaggeredGridMeasurePolicyKt.m11659d(this.$contentPadding, this.$orientation, this.$reverseLayout, kVar.getLayoutDirection()));
        int n23 = kVar2.mo7429n2(LazyStaggeredGridMeasurePolicyKt.m11662g(this.$contentPadding, this.$orientation, kVar.getLayoutDirection()));
        if (z2) {
            i = C16476b.m74361o(j);
        } else {
            i = C16476b.m74362p(j);
        }
        int i2 = (i - n2) - n22;
        if (z2) {
            j2 = C16496n.m74593a(n23, n2);
        } else {
            j2 = C16496n.m74593a(n2, n23);
        }
        long j4 = j2;
        C2366i0 i0Var = this.$contentPadding;
        int n24 = kVar2.mo7429n2(C16483g.m74435M(PaddingKt.m10022i(i0Var, kVar.getLayoutDirection()) + PaddingKt.m10021h(i0Var, kVar.getLayoutDirection())));
        C2366i0 i0Var2 = this.$contentPadding;
        int n25 = kVar2.mo7429n2(C16483g.m74435M(i0Var2.mo8093d() + i0Var2.mo8090a()));
        long e = C16476b.m74351e(j, C16478c.m74382g(j3, n24), 0, C16478c.m74381f(j3, n25), 0, 10, (Object) null);
        int n26 = kVar2.mo7429n2(this.$mainAxisSpacing);
        int n27 = kVar2.mo7429n2(this.$crossAxisSpacing);
        C2604l p = LazyStaggeredGridMeasureKt.m11650p(kVar, this.$state, this.$itemProvider, invoke, e, z2, this.$reverseLayout, j4, i2, n26, n27, n2, n22);
        this.$state.mo8922o(p);
        return p;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo8888a((C2552k) obj, ((C16476b) obj2).mo47807x());
    }
}

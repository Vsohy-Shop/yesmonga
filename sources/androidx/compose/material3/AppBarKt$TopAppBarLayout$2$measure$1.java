package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.unit.C16476b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class AppBarKt$TopAppBarLayout$2$measure$1 extends Lambda implements C11300l<C15611w0.C15612a, C11079d2> {
    final /* synthetic */ C15611w0 $actionIconsPlaceable;
    final /* synthetic */ long $constraints;
    final /* synthetic */ int $layoutHeight;
    final /* synthetic */ C15611w0 $navigationIconPlaceable;
    final /* synthetic */ C15568h0 $this_Layout;
    final /* synthetic */ int $titleBaseline;
    final /* synthetic */ int $titleBottomPadding;
    final /* synthetic */ Arrangement.C2269d $titleHorizontalArrangement;
    final /* synthetic */ C15611w0 $titlePlaceable;
    final /* synthetic */ Arrangement.C2279l $titleVerticalArrangement;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBarKt$TopAppBarLayout$2$measure$1(C15611w0 w0Var, int i, C15611w0 w0Var2, Arrangement.C2269d dVar, long j, C15611w0 w0Var3, C15568h0 h0Var, Arrangement.C2279l lVar, int i2, int i3) {
        super(1);
        this.$navigationIconPlaceable = w0Var;
        this.$layoutHeight = i;
        this.$titlePlaceable = w0Var2;
        this.$titleHorizontalArrangement = dVar;
        this.$constraints = j;
        this.$actionIconsPlaceable = w0Var3;
        this.$this_Layout = h0Var;
        this.$titleVerticalArrangement = lVar;
        this.$titleBottomPadding = i2;
        this.$titleBaseline = i3;
    }

    /* renamed from: a */
    public final void mo11155a(@C12579k C15611w0.C15612a aVar) {
        int max;
        int i;
        int i2;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(aVar, "$this$layout");
        C15611w0 w0Var = this.$navigationIconPlaceable;
        C15611w0.C15612a.m69414v(aVar, w0Var, 0, (this.$layoutHeight - w0Var.mo44468G0()) / 2, 0.0f, 4, (Object) null);
        C15611w0 w0Var2 = this.$titlePlaceable;
        Arrangement.C2269d dVar = this.$titleHorizontalArrangement;
        Arrangement arrangement = Arrangement.f6010a;
        if (Intrinsics.areEqual((Object) dVar, (Object) arrangement.mo7625f())) {
            max = (C16476b.m74362p(this.$constraints) - this.$titlePlaceable.mo44471K0()) / 2;
        } else if (Intrinsics.areEqual((Object) dVar, (Object) arrangement.mo7626h())) {
            max = (C16476b.m74362p(this.$constraints) - this.$titlePlaceable.mo44471K0()) - this.$actionIconsPlaceable.mo44471K0();
        } else {
            max = Math.max(this.$this_Layout.mo7429n2(AppBarKt.f19163i), this.$navigationIconPlaceable.mo44471K0());
        }
        int i5 = max;
        Arrangement.C2279l lVar = this.$titleVerticalArrangement;
        if (Intrinsics.areEqual((Object) lVar, (Object) arrangement.mo7625f())) {
            i4 = (this.$layoutHeight - this.$titlePlaceable.mo44468G0()) / 2;
        } else if (Intrinsics.areEqual((Object) lVar, (Object) arrangement.mo7624d())) {
            if (this.$titleBottomPadding == 0) {
                i3 = this.$layoutHeight;
                i2 = this.$titlePlaceable.mo44468G0();
            } else {
                i3 = this.$layoutHeight - this.$titlePlaceable.mo44468G0();
                i2 = Math.max(0, (this.$titleBottomPadding - this.$titlePlaceable.mo44468G0()) + this.$titleBaseline);
            }
            i4 = i3 - i2;
        } else {
            i = 0;
            C15611w0.C15612a.m69414v(aVar, w0Var2, i5, i, 0.0f, 4, (Object) null);
            C15611w0.C15612a.m69414v(aVar, this.$actionIconsPlaceable, C16476b.m74362p(this.$constraints) - this.$actionIconsPlaceable.mo44471K0(), (this.$layoutHeight - this.$actionIconsPlaceable.mo44468G0()) / 2, 0.0f, 4, (Object) null);
        }
        i = i4;
        C15611w0.C15612a.m69414v(aVar, w0Var2, i5, i, 0.0f, 4, (Object) null);
        C15611w0.C15612a.m69414v(aVar, this.$actionIconsPlaceable, C16476b.m74362p(this.$constraints) - this.$actionIconsPlaceable.mo44471K0(), (this.$layoutHeight - this.$actionIconsPlaceable.mo44468G0()) / 2, 0.0f, 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo11155a((C15611w0.C15612a) obj);
        return C11079d2.f28267a;
    }
}

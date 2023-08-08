package androidx.compose.material3;

import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.p004ui.unit.C16478c;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.C16485h;
import androidx.compose.p004ui.util.C16515d;
import androidx.compose.runtime.C8578k2;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nSearchBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.kt\nandroidx/compose/material3/SearchBarKt$SearchBar$3$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,746:1\n154#2:747\n*S KotlinDebug\n*F\n+ 1 SearchBar.kt\nandroidx/compose/material3/SearchBarKt$SearchBar$3$1\n*L\n232#1:747\n*E\n"})
public final class SearchBarKt$SearchBar$3$1 extends Lambda implements C11305q<C15568h0, C15557e0, C16476b, C15564g0> {
    final /* synthetic */ C8578k2<Float> $animationProgress;
    final /* synthetic */ C8578k2<C16483g> $topPadding;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchBarKt$SearchBar$3$1(C8578k2<C16483g> k2Var, C8578k2<Float> k2Var2) {
        super(3);
        this.$topPadding = k2Var;
        this.$animationProgress = k2Var2;
    }

    @C12579k
    /* renamed from: a */
    public final C15564g0 mo11824a(@C12579k C15568h0 h0Var, @C12579k C15557e0 e0Var, long j) {
        C15557e0 e0Var2 = e0Var;
        Intrinsics.checkNotNullParameter(h0Var, "$this$layout");
        Intrinsics.checkNotNullParameter(e0Var, "measurable");
        final int n2 = h0Var.mo7429n2(C16485h.m74470I(this.$topPadding.getValue().mo47823t0(), C16483g.m74435M((float) 0), this.$animationProgress.getValue().floatValue()));
        int B = C11479u.m44313B(Math.max(C16476b.m74364r(j), h0Var.mo7429n2(SearchBarKt.m26102n())), Math.min(C16476b.m74362p(j), h0Var.mo7429n2(SearchBarKt.f19616e)));
        int B2 = C11479u.m44313B(Math.max(C16476b.m74363q(j), h0Var.mo7429n2(C8211h2.f20155a.mo12632e())), C16476b.m74361o(j));
        int p = C16476b.m74362p(j);
        int o = C16476b.m74361o(j);
        int b = C16515d.m74782b(B, p, this.$animationProgress.getValue().floatValue());
        int b2 = C16515d.m74782b(B2, o, this.$animationProgress.getValue().floatValue()) + n2;
        final C15611w0 t0 = e0Var.mo44324t0(C16478c.m74385j(C16476b.f40850b.mo47810c(b, b2), 0, -n2, 1, (Object) null));
        return C15568h0.m69206r2(h0Var, b, b2, (Map) null, new C11300l<C15611w0.C15612a, C11079d2>() {
            /* renamed from: a */
            public final void mo11825a(@C12579k C15611w0.C15612a aVar) {
                Intrinsics.checkNotNullParameter(aVar, "$this$layout");
                C15611w0.C15612a.m69414v(aVar, t0, 0, n2, 0.0f, 4, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo11825a((C15611w0.C15612a) obj);
                return C11079d2.f28267a;
            }
        }, 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo11824a((C15568h0) obj, (C15557e0) obj2, ((C16476b) obj3).mo47807x());
    }
}

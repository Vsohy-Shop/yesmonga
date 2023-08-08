package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.C2253k0;
import androidx.compose.foundation.C2254l;
import androidx.compose.foundation.C2257l0;
import androidx.compose.foundation.C2855v;
import androidx.compose.foundation.gestures.C2195g;
import androidx.compose.foundation.gestures.C2202m;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.layout.C2549h;
import androidx.compose.foundation.lazy.layout.C2552k;
import androidx.compose.foundation.lazy.layout.C2563q;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nLazyStaggeredGrid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGrid.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,122:1\n154#2:123\n154#2:124\n154#2:125\n76#3:126\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGrid.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridKt\n*L\n50#1:123\n58#1:124\n60#1:125\n89#1:126\n*E\n"})
public final class LazyStaggeredGridKt {
    @C8540g
    @C2855v
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m11614a(@C12579k LazyStaggeredGridState lazyStaggeredGridState, @C12579k Orientation orientation, @C12579k C11304p<? super C16479d, ? super C16476b, int[]> pVar, @C12580l C8767m mVar, @C12580l C2366i0 i0Var, boolean z, @C12580l C2195g gVar, boolean z2, float f, float f2, @C12579k C11300l<? super LazyStaggeredGridScope, C11079d2> lVar, @C12580l C8592o oVar, int i, int i2, int i3) {
        C2195g gVar2;
        int i4;
        LazyStaggeredGridState lazyStaggeredGridState2 = lazyStaggeredGridState;
        Orientation orientation2 = orientation;
        C11300l<? super LazyStaggeredGridScope, C11079d2> lVar2 = lVar;
        int i5 = i2;
        int i6 = i3;
        Intrinsics.checkNotNullParameter(lazyStaggeredGridState2, "state");
        Intrinsics.checkNotNullParameter(orientation2, "orientation");
        Intrinsics.checkNotNullParameter(pVar, "slotSizesSums");
        Intrinsics.checkNotNullParameter(lVar2, "content");
        C8592o o = oVar.mo15009o(1320541636);
        C8767m.C8768a aVar = (i6 & 8) != 0 ? C8767m.f23478j : mVar;
        C2366i0 a = (i6 & 16) != 0 ? PaddingKt.m10014a(C16483g.m74435M((float) 0)) : i0Var;
        boolean z3 = (i6 & 32) != 0 ? false : z;
        if ((i6 & 64) != 0) {
            gVar2 = C2202m.f5935a.mo7540a(o, 6);
            i4 = i & -3670017;
        } else {
            gVar2 = gVar;
            i4 = i;
        }
        boolean z4 = (i6 & 128) != 0 ? true : z2;
        float M = (i6 & 256) != 0 ? C16483g.m74435M((float) 0) : f;
        float M2 = (i6 & 512) != 0 ? C16483g.m74435M((float) 0) : f2;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1320541636, i4, i5, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGrid (LazyStaggeredGrid.kt:39)");
        }
        C2202m mVar2 = C2202m.f5935a;
        C2253k0 b = mVar2.mo7541b(o, 6);
        C2597f a2 = LazyStaggeredGridItemProviderKt.m11599a(lazyStaggeredGridState2, lVar2, o, ((i5 << 3) & 112) | 8);
        int i7 = i4 >> 6;
        int i8 = i4 >> 9;
        C2597f fVar = a2;
        int i9 = i4;
        boolean z5 = z3;
        C8767m mVar3 = aVar;
        C8592o oVar2 = o;
        C11304p<C2552k, C16476b, C2604l> f3 = LazyStaggeredGridMeasurePolicyKt.m11661f(lazyStaggeredGridState, a2, a, z3, orientation, M, M2, pVar, o, (i7 & 7168) | (i7 & 896) | 8 | ((i4 << 9) & 57344) | (i8 & 458752) | (i8 & 3670016) | ((i4 << 15) & 29360128));
        C2563q a3 = C2609q.m11835a(lazyStaggeredGridState2, z5, oVar2, ((i9 >> 12) & 112) | 8);
        m11615b(fVar, lazyStaggeredGridState2, oVar2, 64);
        C2253k0 k0Var = b;
        boolean z6 = z4;
        LazyLayoutKt.m11349a(fVar, LazyLayoutSemanticsKt.m11357a(ScrollableKt.m9385j(C2257l0.m9707a(C2254l.m9703a(mVar3.mo17224k3(lazyStaggeredGridState.mo8903F()), orientation2), k0Var), lazyStaggeredGridState, orientation, k0Var, z6, mVar2.mo7542c((LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p()), orientation2, z5), gVar2, lazyStaggeredGridState.mo8899B()), fVar, a3, orientation, z6, z5, oVar2, ((i9 << 6) & 7168) | (i8 & 57344) | (i9 & 458752)), lazyStaggeredGridState.mo8901D(), f3, oVar2, 0, 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            LazyStaggeredGridKt$LazyStaggeredGrid$1 lazyStaggeredGridKt$LazyStaggeredGrid$1 = r0;
            LazyStaggeredGridKt$LazyStaggeredGrid$1 lazyStaggeredGridKt$LazyStaggeredGrid$12 = new LazyStaggeredGridKt$LazyStaggeredGrid$1(lazyStaggeredGridState, orientation, pVar, mVar3, a, z5, gVar2, z4, M, M2, lVar, i, i2, i3);
            s.mo15202a(lazyStaggeredGridKt$LazyStaggeredGrid$1);
        }
    }

    @C8540g
    /* renamed from: b */
    public static final void m11615b(C2549h hVar, LazyStaggeredGridState lazyStaggeredGridState, C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(231106410);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(231106410, i, -1, "androidx.compose.foundation.lazy.staggeredgrid.ScrollPositionUpdater (LazyStaggeredGrid.kt:114)");
        }
        if (hVar.mo8288a() > 0) {
            lazyStaggeredGridState.mo8920X(hVar);
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new LazyStaggeredGridKt$ScrollPositionUpdater$1(hVar, lazyStaggeredGridState, i));
        }
    }
}

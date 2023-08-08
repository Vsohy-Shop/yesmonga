package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.C2855v;
import androidx.compose.foundation.lazy.layout.C2549h;
import androidx.compose.foundation.lazy.layout.C2550i;
import androidx.compose.foundation.lazy.layout.LazyNearestItemsRangeKt;
import androidx.compose.foundation.lazy.staggeredgrid.C2577x6d2c3253;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11466l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nLazyStaggeredGridItemProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridItemProvider.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProviderKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,73:1\n36#2:74\n1114#3,6:75\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridItemProvider.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProviderKt\n*L\n46#1:74\n46#1:75,6\n*E\n"})
public final class LazyStaggeredGridItemProviderKt {

    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$a */
    public static final class C2576a implements C2549h, C2597f {

        /* renamed from: a */
        public final /* synthetic */ C2549h f6802a;

        /* renamed from: b */
        public final /* synthetic */ C8578k2<C2577x6d2c3253.C25781> f6803b;

        public C2576a(C8578k2<C2577x6d2c3253.C25781> k2Var) {
            this.f6803b = k2Var;
            this.f6802a = C2550i.m11423a(k2Var);
        }

        /* renamed from: a */
        public int mo8288a() {
            return this.f6802a.mo8288a();
        }

        @C12580l
        /* renamed from: b */
        public Object mo8289b(int i) {
            return this.f6802a.mo8289b(i);
        }

        @C8540g
        /* renamed from: e */
        public void mo8291e(int i, @C12580l C8592o oVar, int i2) {
            oVar.mo14918M(-143578742);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-143578742, i2, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridItemProvider.<anonymous>.<no name provided>.Item (LazyStaggeredGridItemProvider.kt:-1)");
            }
            this.f6802a.mo8291e(i, oVar, i2 & 14);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
            oVar.mo15002m0();
        }

        @C12579k
        /* renamed from: f */
        public Map<Object, Integer> mo8292f() {
            return this.f6802a.mo8292f();
        }

        @C12579k
        /* renamed from: g */
        public Object mo8293g(int i) {
            return this.f6802a.mo8293g(i);
        }

        @C12579k
        /* renamed from: h */
        public C2611r mo8863h() {
            return this.f6803b.getValue().mo8863h();
        }
    }

    @C8540g
    @C2855v
    @C12579k
    /* renamed from: a */
    public static final C2597f m11599a(@C12579k LazyStaggeredGridState lazyStaggeredGridState, @C12579k C11300l<? super LazyStaggeredGridScope, C11079d2> lVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(lazyStaggeredGridState, "state");
        Intrinsics.checkNotNullParameter(lVar, "content");
        oVar.mo14918M(2039920307);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(2039920307, i, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridItemProvider (LazyStaggeredGridItemProvider.kt:35)");
        }
        C8578k2<T> t = C8415c2.m30251t(lVar, oVar, (i >> 3) & 14);
        C8578k2<C11466l> c = LazyNearestItemsRangeKt.m11365c(new C2581x4e564b57(lazyStaggeredGridState), C2582x4e564b58.f6806f, C2583x4e564b59.f6807f, oVar, 432);
        oVar.mo14918M(1157296644);
        boolean n0 = oVar.mo15006n0(lazyStaggeredGridState);
        Object N = oVar.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            N = new C2576a(C8415c2.m30235d(new C2577x6d2c3253(t, c, lazyStaggeredGridState)));
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        C2576a aVar = (C2576a) N;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return aVar;
    }
}

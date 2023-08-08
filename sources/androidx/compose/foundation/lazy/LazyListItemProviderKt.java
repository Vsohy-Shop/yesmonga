package androidx.compose.foundation.lazy;

import androidx.compose.foundation.C2855v;
import androidx.compose.foundation.lazy.layout.C2549h;
import androidx.compose.foundation.lazy.layout.C2550i;
import androidx.compose.foundation.lazy.layout.LazyNearestItemsRangeKt;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import java.util.List;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11466l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nLazyListItemProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListItemProvider.kt\nandroidx/compose/foundation/lazy/LazyListItemProviderKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,103:1\n36#2:104\n50#2:111\n49#2:112\n1114#3,6:105\n1114#3,6:113\n*S KotlinDebug\n*F\n+ 1 LazyListItemProvider.kt\nandroidx/compose/foundation/lazy/LazyListItemProviderKt\n*L\n46#1:104\n51#1:111\n51#1:112\n46#1:105,6\n51#1:113,6\n*E\n"})
public final class LazyListItemProviderKt {

    /* renamed from: a */
    public static final int f6402a = 30;

    /* renamed from: b */
    public static final int f6403b = 100;

    /* renamed from: androidx.compose.foundation.lazy.LazyListItemProviderKt$a */
    public static final class C2441a implements C2569n, C2549h {

        /* renamed from: a */
        public final /* synthetic */ C2549h f6404a;

        /* renamed from: b */
        public final /* synthetic */ C8578k2<LazyListItemProviderImpl> f6405b;

        public C2441a(C8578k2<LazyListItemProviderImpl> k2Var) {
            this.f6405b = k2Var;
            this.f6404a = C2550i.m11423a(k2Var);
        }

        /* renamed from: a */
        public int mo8288a() {
            return this.f6404a.mo8288a();
        }

        @C12580l
        /* renamed from: b */
        public Object mo8289b(int i) {
            return this.f6404a.mo8289b(i);
        }

        @C12579k
        /* renamed from: d */
        public LazyItemScopeImpl mo8290d() {
            return this.f6405b.getValue().mo8290d();
        }

        @C8540g
        /* renamed from: e */
        public void mo8291e(int i, @C12580l C8592o oVar, int i2) {
            oVar.mo14918M(-203667997);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-203667997, i2, -1, "androidx.compose.foundation.lazy.rememberLazyListItemProvider.<anonymous>.<no name provided>.Item (LazyListItemProvider.kt:-1)");
            }
            this.f6404a.mo8291e(i, oVar, i2 & 14);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
            oVar.mo15002m0();
        }

        @C12579k
        /* renamed from: f */
        public Map<Object, Integer> mo8292f() {
            return this.f6404a.mo8292f();
        }

        @C12579k
        /* renamed from: g */
        public Object mo8293g(int i) {
            return this.f6404a.mo8293g(i);
        }

        @C12579k
        /* renamed from: i */
        public List<Integer> mo8294i() {
            return this.f6405b.getValue().mo8294i();
        }
    }

    @C8540g
    @C2855v
    @C12579k
    /* renamed from: a */
    public static final C2569n m10791a(@C12579k LazyListState lazyListState, @C12579k C11300l<? super LazyListScope, C11079d2> lVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(lazyListState, "state");
        Intrinsics.checkNotNullParameter(lVar, "content");
        oVar.mo14918M(1939491467);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1939491467, i, -1, "androidx.compose.foundation.lazy.rememberLazyListItemProvider (LazyListItemProvider.kt:39)");
        }
        C8578k2<T> t = C8415c2.m30251t(lVar, oVar, (i >> 3) & 14);
        oVar.mo14918M(1157296644);
        boolean n0 = oVar.mo15006n0(lazyListState);
        Object N = oVar.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            N = new C2443xefb4e56c(lazyListState);
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        C8578k2<C11466l> c = LazyNearestItemsRangeKt.m11365c((C11289a) N, C2444x12e58ca0.f6406f, C2445x12e58ca1.f6407f, oVar, 432);
        oVar.mo14918M(511388516);
        boolean n02 = oVar.mo15006n0(c) | oVar.mo15006n0(lazyListState);
        Object N2 = oVar.mo14921N();
        if (n02 || N2 == C8592o.f23032a.mo16277a()) {
            N2 = new C2441a(C8415c2.m30235d(new C2442x3addb60b(t, c, new LazyItemScopeImpl(), lazyListState)));
            oVar.mo14893C(N2);
        }
        oVar.mo15002m0();
        C2441a aVar = (C2441a) N2;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return aVar;
    }
}

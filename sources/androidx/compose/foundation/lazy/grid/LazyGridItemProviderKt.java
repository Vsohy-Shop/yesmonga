package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.C2855v;
import androidx.compose.foundation.lazy.layout.C2549h;
import androidx.compose.foundation.lazy.layout.C2550i;
import androidx.compose.foundation.lazy.layout.LazyNearestItemsRangeKt;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11466l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nLazyGridItemProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridItemProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemProviderKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,120:1\n36#2:121\n36#2:128\n1114#3,6:122\n1114#3,6:129\n*S KotlinDebug\n*F\n+ 1 LazyGridItemProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemProviderKt\n*L\n47#1:121\n54#1:128\n47#1:122,6\n54#1:129,6\n*E\n"})
public final class LazyGridItemProviderKt {

    /* renamed from: a */
    public static final int f6499a = 90;

    /* renamed from: b */
    public static final int f6500b = 200;

    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridItemProviderKt$a */
    public static final class C2467a implements C2495j, C2549h {

        /* renamed from: a */
        public final /* synthetic */ C2549h f6501a;

        /* renamed from: b */
        public final /* synthetic */ C8578k2<C2495j> f6502b;

        public C2467a(C8578k2<? extends C2495j> k2Var) {
            this.f6502b = k2Var;
            this.f6501a = C2550i.m11423a(k2Var);
        }

        /* renamed from: a */
        public int mo8288a() {
            return this.f6501a.mo8288a();
        }

        @C12580l
        /* renamed from: b */
        public Object mo8289b(int i) {
            return this.f6501a.mo8289b(i);
        }

        /* renamed from: c */
        public boolean mo8447c() {
            return this.f6502b.getValue().mo8447c();
        }

        @C8540g
        /* renamed from: e */
        public void mo8291e(int i, @C12580l C8592o oVar, int i2) {
            oVar.mo14918M(125380152);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(125380152, i2, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridItemProvider.<anonymous>.<no name provided>.Item (LazyGridItemProvider.kt:-1)");
            }
            this.f6501a.mo8291e(i, oVar, i2 & 14);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
            oVar.mo15002m0();
        }

        @C12579k
        /* renamed from: f */
        public Map<Object, Integer> mo8292f() {
            return this.f6501a.mo8292f();
        }

        @C12579k
        /* renamed from: g */
        public Object mo8293g(int i) {
            return this.f6501a.mo8293g(i);
        }

        /* renamed from: j */
        public long mo8448j(@C12579k C2497l lVar, int i) {
            Intrinsics.checkNotNullParameter(lVar, "$this$getSpan");
            return this.f6502b.getValue().mo8448j(lVar, i);
        }

        @C12579k
        /* renamed from: k */
        public LazyGridSpanLayoutProvider mo8449k() {
            return this.f6502b.getValue().mo8449k();
        }
    }

    @C8540g
    @C2855v
    @C12579k
    /* renamed from: a */
    public static final C2495j m11022a(@C12579k LazyGridState lazyGridState, @C12579k C11300l<? super LazyGridScope, C11079d2> lVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(lazyGridState, "state");
        Intrinsics.checkNotNullParameter(lVar, "content");
        oVar.mo14918M(1831211759);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1831211759, i, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridItemProvider (LazyGridItemProvider.kt:40)");
        }
        C8578k2<T> t = C8415c2.m30251t(lVar, oVar, (i >> 3) & 14);
        oVar.mo14918M(1157296644);
        boolean n0 = oVar.mo15006n0(lazyGridState);
        Object N = oVar.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            N = new C2469xf96bda6c(lazyGridState);
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        C8578k2<C11466l> c = LazyNearestItemsRangeKt.m11365c((C11289a) N, C2470x97d5c1a0.f6503f, C2471x97d5c1a1.f6504f, oVar, 432);
        oVar.mo14918M(1157296644);
        boolean n02 = oVar.mo15006n0(c);
        Object N2 = oVar.mo14921N();
        if (n02 || N2 == C8592o.f23032a.mo16277a()) {
            N2 = new C2467a(C8415c2.m30235d(new C2468x9de1a10b(t, lazyGridState, c)));
            oVar.mo14893C(N2);
        }
        oVar.mo15002m0();
        C2467a aVar = (C2467a) N2;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return aVar;
    }
}

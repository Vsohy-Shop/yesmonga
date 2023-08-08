package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.animation.core.C1968g;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.lazy.layout.C2563q;
import androidx.compose.p004ui.semantics.C16024b;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nLazyStaggeredGridSemantics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridSemantics.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSemanticsKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,50:1\n50#2:51\n49#2:52\n1114#3,6:53\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridSemantics.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSemanticsKt\n*L\n32#1:51\n32#1:52\n32#1:53,6\n*E\n"})
/* renamed from: androidx.compose.foundation.lazy.staggeredgrid.q */
public final class C2609q {

    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.q$a */
    public static final class C2610a implements C2563q {

        /* renamed from: a */
        public final /* synthetic */ LazyStaggeredGridState f6929a;

        public C2610a(LazyStaggeredGridState lazyStaggeredGridState) {
            this.f6929a = lazyStaggeredGridState;
        }

        /* renamed from: a */
        public boolean mo8633a() {
            return this.f6929a.mo7249a();
        }

        @C12580l
        /* renamed from: b */
        public Object mo8634b(int i, @C12579k C11045c<? super C11079d2> cVar) {
            Object N = LazyStaggeredGridState.m11676N(this.f6929a, i, 0, cVar, 2, (Object) null);
            return N == C11063b.m42612h() ? N : C11079d2.f28267a;
        }

        @C12580l
        /* renamed from: c */
        public Object mo8635c(float f, @C12579k C11045c<? super C11079d2> cVar) {
            Object b = ScrollExtensionsKt.m9368b(this.f6929a, f, (C1968g) null, cVar, 2, (Object) null);
            return b == C11063b.m42612h() ? b : C11079d2.f28267a;
        }

        @C12579k
        /* renamed from: d */
        public C16024b mo8636d() {
            return new C16024b(-1, -1);
        }

        /* renamed from: e */
        public float mo8637e() {
            return ((float) this.f6929a.mo8927t()) + (((float) this.f6929a.mo8928u()) / 100000.0f);
        }
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public static final C2563q m11835a(@C12579k LazyStaggeredGridState lazyStaggeredGridState, boolean z, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(lazyStaggeredGridState, "state");
        oVar.mo14918M(1629354903);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1629354903, i, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberLazyStaggeredGridSemanticState (LazyStaggeredGridSemantics.kt:27)");
        }
        Boolean valueOf = Boolean.valueOf(z);
        oVar.mo14918M(511388516);
        boolean n0 = oVar.mo15006n0(valueOf) | oVar.mo15006n0(lazyStaggeredGridState);
        Object N = oVar.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            N = new C2610a(lazyStaggeredGridState);
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        C2610a aVar = (C2610a) N;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return aVar;
    }
}

package androidx.compose.foundation.lazy.grid;

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

@C11363r0({"SMAP\nLazySemantics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazySemantics.kt\nandroidx/compose/foundation/lazy/grid/LazySemanticsKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,52:1\n50#2:53\n49#2:54\n1114#3,6:55\n*S KotlinDebug\n*F\n+ 1 LazySemantics.kt\nandroidx/compose/foundation/lazy/grid/LazySemanticsKt\n*L\n32#1:53\n32#1:54\n32#1:55,6\n*E\n"})
/* renamed from: androidx.compose.foundation.lazy.grid.w */
public final class C2508w {

    /* renamed from: androidx.compose.foundation.lazy.grid.w$a */
    public static final class C2509a implements C2563q {

        /* renamed from: a */
        public final /* synthetic */ LazyGridState f6675a;

        public C2509a(LazyGridState lazyGridState) {
            this.f6675a = lazyGridState;
        }

        /* renamed from: a */
        public boolean mo8633a() {
            return this.f6675a.mo7249a();
        }

        @C12580l
        /* renamed from: b */
        public Object mo8634b(int i, @C12579k C11045c<? super C11079d2> cVar) {
            Object J = LazyGridState.m11081J(this.f6675a, i, 0, cVar, 2, (Object) null);
            return J == C11063b.m42612h() ? J : C11079d2.f28267a;
        }

        @C12580l
        /* renamed from: c */
        public Object mo8635c(float f, @C12579k C11045c<? super C11079d2> cVar) {
            Object b = ScrollExtensionsKt.m9368b(this.f6675a, f, (C1968g) null, cVar, 2, (Object) null);
            return b == C11063b.m42612h() ? b : C11079d2.f28267a;
        }

        @C12579k
        /* renamed from: d */
        public C16024b mo8636d() {
            return new C16024b(-1, -1);
        }

        /* renamed from: e */
        public float mo8637e() {
            return ((float) this.f6675a.mo8519q()) + (((float) this.f6675a.mo8520r()) / 100000.0f);
        }
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public static final C2563q m11270a(@C12579k LazyGridState lazyGridState, boolean z, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(lazyGridState, "state");
        oVar.mo14918M(-1247008005);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1247008005, i, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridSemanticState (LazySemantics.kt:27)");
        }
        Boolean valueOf = Boolean.valueOf(z);
        oVar.mo14918M(511388516);
        boolean n0 = oVar.mo15006n0(valueOf) | oVar.mo15006n0(lazyGridState);
        Object N = oVar.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            N = new C2509a(lazyGridState);
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        C2509a aVar = (C2509a) N;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return aVar;
    }
}

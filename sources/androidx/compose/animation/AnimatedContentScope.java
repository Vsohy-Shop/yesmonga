package androidx.compose.animation;

import androidx.appcompat.graphics.drawable.C0508a;
import androidx.compose.animation.core.C1956d0;
import androidx.compose.animation.core.C1972h;
import androidx.compose.animation.core.C1986l;
import androidx.compose.animation.core.C2002p1;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.draw.C8744d;
import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15605u0;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16494m;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.p004ui.unit.C16502r;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8585m0;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8567o;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.C11288f;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C2031i
@C8567o(parameters = 0)
@C11363r0({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentScope\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,780:1\n76#2:781\n102#2,2:782\n76#2:798\n102#2,2:799\n36#3:784\n36#3:791\n1057#4,6:785\n1057#4,6:792\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentScope\n*L\n478#1:781\n478#1:782,2\n493#1:798\n493#1:799,2\n493#1:784\n505#1:791\n493#1:785,6\n505#1:792,6\n*E\n"})
public final class AnimatedContentScope<S> implements Transition.C1927b<S> {

    /* renamed from: g */
    public static final int f5185g = 8;
    @C12579k

    /* renamed from: a */
    public final Transition<S> f5186a;
    @C12579k

    /* renamed from: b */
    public C8734c f5187b;
    @C12579k

    /* renamed from: c */
    public LayoutDirection f5188c;
    @C12579k

    /* renamed from: d */
    public final C8700z0 f5189d = C8539f2.m30981g(C16500q.m74651b(C16500q.f40900b.mo47897a()), (C8410b2) null, 2, (Object) null);
    @C12579k

    /* renamed from: e */
    public final Map<S, C8578k2<C16500q>> f5190e = new LinkedHashMap();
    @C12580l

    /* renamed from: f */
    public C8578k2<C16500q> f5191f;

    @C2031i
    public final class SizeModifier extends C2037m {
        @C12579k

        /* renamed from: a */
        public final Transition<S>.a<C16500q, C1986l> f5192a;
        @C12579k

        /* renamed from: b */
        public final C8578k2<C2041q> f5193b;

        /* renamed from: c */
        public final /* synthetic */ AnimatedContentScope<S> f5194c;

        public SizeModifier(@C12579k AnimatedContentScope animatedContentScope, @C12579k Transition<S>.a<C16500q, C1986l> aVar, C8578k2<? extends C2041q> k2Var) {
            Intrinsics.checkNotNullParameter(aVar, "sizeAnimation");
            Intrinsics.checkNotNullParameter(k2Var, "sizeTransform");
            this.f5194c = animatedContentScope;
            this.f5192a = aVar;
            this.f5193b = k2Var;
        }

        @C12579k
        /* renamed from: a */
        public final Transition<S>.a<C16500q, C1986l> mo6428a() {
            return this.f5192a;
        }

        @C12579k
        /* renamed from: b */
        public final C8578k2<C2041q> mo6429b() {
            return this.f5193b;
        }

        @C12579k
        /* renamed from: i */
        public C15564g0 mo6430i(@C12579k C15568h0 h0Var, @C12579k C15557e0 e0Var, long j) {
            Intrinsics.checkNotNullParameter(h0Var, "$this$measure");
            Intrinsics.checkNotNullParameter(e0Var, "measurable");
            C15611w0 t0 = e0Var.mo44324t0(j);
            C8578k2<C16500q> a = this.f5192a.mo6717a(new AnimatedContentScope$SizeModifier$measure$size$1(this.f5194c, this), new AnimatedContentScope$SizeModifier$measure$size$2(this.f5194c));
            this.f5194c.mo6422t(a);
            return C15568h0.m69206r2(h0Var, C16500q.m74662m(a.getValue().mo47895q()), C16500q.m74659j(a.getValue().mo47895q()), (Map) null, new AnimatedContentScope$SizeModifier$measure$1(t0, this.f5194c.mo6414l().mo17059a(C16502r.m74668a(t0.mo44471K0(), t0.mo44468G0()), a.getValue().mo47895q(), LayoutDirection.Ltr)), 4, (Object) null);
        }
    }

    /* renamed from: androidx.compose.animation.AnimatedContentScope$a */
    public static final class C1897a implements C15605u0 {

        /* renamed from: a */
        public boolean f5195a;

        public C1897a(boolean z) {
            this.f5195a = z;
        }

        /* renamed from: e */
        public static /* synthetic */ C1897a m7687e(C1897a aVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = aVar.f5195a;
            }
            return aVar.mo6433b(z);
        }

        @C12579k
        /* renamed from: N */
        public Object mo6431N(@C12579k C16479d dVar, @C12580l Object obj) {
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            return this;
        }

        /* renamed from: a */
        public final boolean mo6432a() {
            return this.f5195a;
        }

        @C12579k
        /* renamed from: b */
        public final C1897a mo6433b(boolean z) {
            return new C1897a(z);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1897a) && this.f5195a == ((C1897a) obj).f5195a;
        }

        /* renamed from: g */
        public final boolean mo6435g() {
            return this.f5195a;
        }

        public int hashCode() {
            boolean z = this.f5195a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        /* renamed from: l */
        public final void mo6437l(boolean z) {
            this.f5195a = z;
        }

        @C12579k
        public String toString() {
            return "ChildData(isTarget=" + this.f5195a + ')';
        }
    }

    @C11288f
    @C8585m0
    /* renamed from: androidx.compose.animation.AnimatedContentScope$b */
    public static final class C1898b {
        @C12579k

        /* renamed from: b */
        public static final C1899a f5196b = new C1899a((DefaultConstructorMarker) null);

        /* renamed from: c */
        public static final int f5197c = m7700h(0);

        /* renamed from: d */
        public static final int f5198d = m7700h(1);

        /* renamed from: e */
        public static final int f5199e = m7700h(2);

        /* renamed from: f */
        public static final int f5200f = m7700h(3);

        /* renamed from: g */
        public static final int f5201g = m7700h(4);

        /* renamed from: h */
        public static final int f5202h = m7700h(5);

        /* renamed from: a */
        public final int f5203a;

        /* renamed from: androidx.compose.animation.AnimatedContentScope$b$a */
        public static final class C1899a {
            public /* synthetic */ C1899a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final int mo6443a() {
                return C1898b.f5200f;
            }

            /* renamed from: b */
            public final int mo6444b() {
                return C1898b.f5202h;
            }

            /* renamed from: c */
            public final int mo6445c() {
                return C1898b.f5197c;
            }

            /* renamed from: d */
            public final int mo6446d() {
                return C1898b.f5198d;
            }

            /* renamed from: e */
            public final int mo6447e() {
                return C1898b.f5201g;
            }

            /* renamed from: f */
            public final int mo6448f() {
                return C1898b.f5199e;
            }

            public C1899a() {
            }
        }

        public /* synthetic */ C1898b(int i) {
            this.f5203a = i;
        }

        /* renamed from: g */
        public static final /* synthetic */ C1898b m7699g(int i) {
            return new C1898b(i);
        }

        /* renamed from: h */
        public static int m7700h(int i) {
            return i;
        }

        /* renamed from: i */
        public static boolean m7701i(int i, Object obj) {
            return (obj instanceof C1898b) && i == ((C1898b) obj).mo6441m();
        }

        /* renamed from: j */
        public static final boolean m7702j(int i, int i2) {
            return i == i2;
        }

        /* renamed from: k */
        public static int m7703k(int i) {
            return Integer.hashCode(i);
        }

        @C12579k
        /* renamed from: l */
        public static String m7704l(int i) {
            if (m7702j(i, f5197c)) {
                return "Left";
            }
            if (m7702j(i, f5198d)) {
                return "Right";
            }
            if (m7702j(i, f5199e)) {
                return "Up";
            }
            if (m7702j(i, f5200f)) {
                return "Down";
            }
            if (m7702j(i, f5201g)) {
                return "Start";
            }
            if (m7702j(i, f5202h)) {
                return "End";
            }
            return "Invalid";
        }

        public boolean equals(Object obj) {
            return m7701i(this.f5203a, obj);
        }

        public int hashCode() {
            return m7703k(this.f5203a);
        }

        /* renamed from: m */
        public final /* synthetic */ int mo6441m() {
            return this.f5203a;
        }

        @C12579k
        public String toString() {
            return m7704l(this.f5203a);
        }
    }

    public AnimatedContentScope(@C12579k Transition<S> transition, @C12579k C8734c cVar, @C12579k LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(transition, C0508a.f1295O0);
        Intrinsics.checkNotNullParameter(cVar, "contentAlignment");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        this.f5186a = transition;
        this.f5187b = cVar;
        this.f5188c = layoutDirection;
    }

    /* renamed from: A */
    public static /* synthetic */ C2028g m7658A(AnimatedContentScope animatedContentScope, int i, C1956d0 d0Var, C11300l lVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            d0Var = C1972h.m8390o(0.0f, 0.0f, C16494m.m74570b(C2002p1.m8577f(C16494m.f40890b)), 3, (Object) null);
        }
        if ((i2 & 4) != 0) {
            lVar = AnimatedContentScope$slideOutOfContainer$1.f5205f;
        }
        return animatedContentScope.mo6427z(i, d0Var, lVar);
    }

    /* renamed from: i */
    public static final boolean m7661i(C8700z0<Boolean> z0Var) {
        return z0Var.getValue().booleanValue();
    }

    /* renamed from: j */
    public static final void m7662j(C8700z0<Boolean> z0Var, boolean z) {
        z0Var.setValue(Boolean.valueOf(z));
    }

    /* renamed from: y */
    public static /* synthetic */ C2025e m7663y(AnimatedContentScope animatedContentScope, int i, C1956d0 d0Var, C11300l lVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            d0Var = C1972h.m8390o(0.0f, 0.0f, C16494m.m74570b(C2002p1.m8577f(C16494m.f40890b)), 3, (Object) null);
        }
        if ((i2 & 4) != 0) {
            lVar = AnimatedContentScope$slideIntoContainer$1.f5204f;
        }
        return animatedContentScope.mo6426x(i, d0Var, lVar);
    }

    @C2031i
    @C12579k
    /* renamed from: B */
    public final C2024d mo6408B(@C12579k C2024d dVar, @C12580l C2041q qVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.mo7020e(qVar);
        return dVar;
    }

    /* renamed from: a */
    public S mo6409a() {
        return this.f5186a.mo6704m().mo6409a();
    }

    /* renamed from: c */
    public S mo6410c() {
        return this.f5186a.mo6704m().mo6410c();
    }

    /* renamed from: g */
    public final long mo6411g(long j, long j2) {
        return this.f5187b.mo17059a(j, j2, LayoutDirection.Ltr);
    }

    @C8540g
    @C12579k
    /* renamed from: h */
    public final C8767m mo6412h(@C12579k C2024d dVar, @C12580l C8592o oVar, int i) {
        C8767m mVar;
        Intrinsics.checkNotNullParameter(dVar, "contentTransform");
        oVar.mo14918M(-1349251863);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1349251863, i, -1, "androidx.compose.animation.AnimatedContentScope.createSizeAnimationModifier (AnimatedContent.kt:489)");
        }
        oVar.mo14918M(1157296644);
        boolean n0 = oVar.mo15006n0(this);
        Object N = oVar.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            N = C8539f2.m30981g(Boolean.FALSE, (C8410b2) null, 2, (Object) null);
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        C8700z0 z0Var = (C8700z0) N;
        boolean z = false;
        C8578k2 t = C8415c2.m30251t(dVar.mo7017b(), oVar, 0);
        if (Intrinsics.areEqual((Object) this.f5186a.mo6700h(), (Object) this.f5186a.mo6706o())) {
            m7662j(z0Var, false);
        } else if (t.getValue() != null) {
            m7662j(z0Var, true);
        }
        if (m7661i(z0Var)) {
            Transition.C1925a<C16500q, C1986l> l = TransitionKt.m8193l(this.f5186a, VectorConvertersKt.m8223h(C16500q.f40900b), (String) null, oVar, 64, 2);
            oVar.mo14918M(1157296644);
            boolean n02 = oVar.mo15006n0(l);
            Object N2 = oVar.mo14921N();
            if (n02 || N2 == C8592o.f23032a.mo16277a()) {
                C2041q qVar = (C2041q) t.getValue();
                if (qVar != null && !qVar.mo7074e()) {
                    z = true;
                }
                C8767m mVar2 = C8767m.f23478j;
                if (!z) {
                    mVar2 = C8744d.m32515b(mVar2);
                }
                N2 = mVar2.mo17224k3(new SizeModifier(this, l, t));
                oVar.mo14893C(N2);
            }
            oVar.mo15002m0();
            mVar = (C8767m) N2;
        } else {
            this.f5191f = null;
            mVar = C8767m.f23478j;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return mVar;
    }

    @C12580l
    /* renamed from: k */
    public final C8578k2<C16500q> mo6413k() {
        return this.f5191f;
    }

    @C12579k
    /* renamed from: l */
    public final C8734c mo6414l() {
        return this.f5187b;
    }

    /* renamed from: m */
    public final long mo6415m() {
        C8578k2<C16500q> k2Var = this.f5191f;
        return k2Var != null ? k2Var.getValue().mo47895q() : mo6417o();
    }

    @C12579k
    /* renamed from: n */
    public final LayoutDirection mo6416n() {
        return this.f5188c;
    }

    /* renamed from: o */
    public final long mo6417o() {
        return ((C16500q) this.f5189d.getValue()).mo47895q();
    }

    @C12579k
    /* renamed from: p */
    public final Map<S, C8578k2<C16500q>> mo6418p() {
        return this.f5190e;
    }

    @C12579k
    /* renamed from: q */
    public final Transition<S> mo6419q() {
        return this.f5186a;
    }

    /* renamed from: r */
    public final boolean mo6420r(int i) {
        C1898b.C1899a aVar = C1898b.f5196b;
        if (C1898b.m7702j(i, aVar.mo6445c()) || ((C1898b.m7702j(i, aVar.mo6447e()) && this.f5188c == LayoutDirection.Ltr) || (C1898b.m7702j(i, aVar.mo6444b()) && this.f5188c == LayoutDirection.Rtl))) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public final boolean mo6421s(int i) {
        C1898b.C1899a aVar = C1898b.f5196b;
        if (C1898b.m7702j(i, aVar.mo6446d()) || ((C1898b.m7702j(i, aVar.mo6447e()) && this.f5188c == LayoutDirection.Rtl) || (C1898b.m7702j(i, aVar.mo6444b()) && this.f5188c == LayoutDirection.Ltr))) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public final void mo6422t(@C12580l C8578k2<C16500q> k2Var) {
        this.f5191f = k2Var;
    }

    /* renamed from: u */
    public final void mo6423u(@C12579k C8734c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f5187b = cVar;
    }

    /* renamed from: v */
    public final void mo6424v(@C12579k LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "<set-?>");
        this.f5188c = layoutDirection;
    }

    /* renamed from: w */
    public final void mo6425w(long j) {
        this.f5189d.setValue(C16500q.m74651b(j));
    }

    @C12579k
    /* renamed from: x */
    public final C2025e mo6426x(int i, @C12579k C1956d0<C16494m> d0Var, @C12579k C11300l<? super Integer, Integer> lVar) {
        Intrinsics.checkNotNullParameter(d0Var, "animationSpec");
        Intrinsics.checkNotNullParameter(lVar, "initialOffset");
        if (mo6420r(i)) {
            return EnterExitTransitionKt.m7808L(d0Var, new AnimatedContentScope$slideIntoContainer$2(lVar, this));
        }
        if (mo6421s(i)) {
            return EnterExitTransitionKt.m7808L(d0Var, new AnimatedContentScope$slideIntoContainer$3(lVar, this));
        }
        C1898b.C1899a aVar = C1898b.f5196b;
        if (C1898b.m7702j(i, aVar.mo6448f())) {
            return EnterExitTransitionKt.m7811O(d0Var, new AnimatedContentScope$slideIntoContainer$4(lVar, this));
        }
        if (C1898b.m7702j(i, aVar.mo6443a())) {
            return EnterExitTransitionKt.m7811O(d0Var, new AnimatedContentScope$slideIntoContainer$5(lVar, this));
        }
        return C2025e.f5662a.mo7027a();
    }

    @C12579k
    /* renamed from: z */
    public final C2028g mo6427z(int i, @C12579k C1956d0<C16494m> d0Var, @C12579k C11300l<? super Integer, Integer> lVar) {
        Intrinsics.checkNotNullParameter(d0Var, "animationSpec");
        Intrinsics.checkNotNullParameter(lVar, "targetOffset");
        if (mo6420r(i)) {
            return EnterExitTransitionKt.m7815S(d0Var, new AnimatedContentScope$slideOutOfContainer$2(this, lVar));
        }
        if (mo6421s(i)) {
            return EnterExitTransitionKt.m7815S(d0Var, new AnimatedContentScope$slideOutOfContainer$3(this, lVar));
        }
        C1898b.C1899a aVar = C1898b.f5196b;
        if (C1898b.m7702j(i, aVar.mo6448f())) {
            return EnterExitTransitionKt.m7817U(d0Var, new AnimatedContentScope$slideOutOfContainer$4(this, lVar));
        }
        if (C1898b.m7702j(i, aVar.mo6443a())) {
            return EnterExitTransitionKt.m7817U(d0Var, new AnimatedContentScope$slideOutOfContainer$5(this, lVar));
        }
        return C2028g.f5666a.mo7033a();
    }
}

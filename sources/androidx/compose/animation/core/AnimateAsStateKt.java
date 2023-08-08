package androidx.compose.animation.core;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.C16494m;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11324c0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11377x;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C11744g;
import kotlinx.coroutines.channels.C11748i;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.jsoup.parser.C12888a;

@C11363r0({"SMAP\nAnimateAsState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimateAsState.kt\nandroidx/compose/animation/core/AnimateAsStateKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,584:1\n36#2:585\n25#2:592\n25#2:599\n25#2:606\n25#2:613\n25#2:620\n1057#3,6:586\n1057#3,6:593\n1057#3,6:600\n1057#3,6:607\n1057#3,6:614\n1057#3,6:621\n76#4:627\n76#4:628\n*S KotlinDebug\n*F\n+ 1 AnimateAsState.kt\nandroidx/compose/animation/core/AnimateAsStateKt\n*L\n72#1:585\n394#1:592\n400#1:599\n401#1:606\n414#1:613\n573#1:620\n72#1:586,6\n394#1:593,6\n400#1:600,6\n401#1:607,6\n414#1:614,6\n573#1:621,6\n402#1:627\n403#1:628\n*E\n"})
public final class AnimateAsStateKt {
    @C12579k

    /* renamed from: a */
    public static final C2014v0<Float> f5291a = C1972h.m8390o(0.0f, 0.0f, (Object) null, 7, (Object) null);
    @C12579k

    /* renamed from: b */
    public static final C2014v0<C16483g> f5292b = C1972h.m8390o(0.0f, 0.0f, C16483g.m74451w(C2002p1.m8572a(C16483g.f40871b)), 3, (Object) null);
    @C12579k

    /* renamed from: c */
    public static final C2014v0<C15104m> f5293c = C1972h.m8390o(0.0f, 0.0f, C15104m.m65006c(C2002p1.m8575d(C15104m.f37280b)), 3, (Object) null);
    @C12579k

    /* renamed from: d */
    public static final C2014v0<C15094f> f5294d = C1972h.m8390o(0.0f, 0.0f, C15094f.m64868d(C2002p1.m8574c(C15094f.f37256b)), 3, (Object) null);
    @C12579k

    /* renamed from: e */
    public static final C2014v0<C15098i> f5295e = C1972h.m8390o(0.0f, 0.0f, C2002p1.m8579h(C15098i.f37261e), 3, (Object) null);
    @C12579k

    /* renamed from: f */
    public static final C2014v0<Integer> f5296f = C1972h.m8390o(0.0f, 0.0f, Integer.valueOf(C2002p1.m8573b(C11324c0.f28435a)), 3, (Object) null);
    @C12579k

    /* renamed from: g */
    public static final C2014v0<C16494m> f5297g = C1972h.m8390o(0.0f, 0.0f, C16494m.m74570b(C2002p1.m8577f(C16494m.f40890b)), 3, (Object) null);
    @C12579k

    /* renamed from: h */
    public static final C2014v0<C16500q> f5298h = C1972h.m8390o(0.0f, 0.0f, C16500q.m74651b(C2002p1.m8578g(C16500q.f40900b)), 3, (Object) null);

    @C8540g
    @C12579k
    /* renamed from: c */
    public static final C8578k2<C16483g> m7969c(float f, @C12580l C1968g<C16483g> gVar, @C12580l String str, @C12580l C11300l<? super C16483g, C11079d2> lVar, @C12580l C8592o oVar, int i, int i2) {
        C2014v0<C16483g> v0Var;
        String str2;
        C11300l<? super C16483g, C11079d2> lVar2;
        int i3 = i;
        oVar.mo14918M(-1407150062);
        if ((i2 & 2) != 0) {
            v0Var = f5292b;
        } else {
            v0Var = gVar;
        }
        if ((i2 & 4) != 0) {
            str2 = "DpAnimation";
        } else {
            str2 = str;
        }
        if ((i2 & 8) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1407150062, i3, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:108)");
        }
        int i4 = i3 << 6;
        C8578k2<C16483g> s = m7985s(C16483g.m74451w(f), VectorConvertersKt.m8220e(C16483g.f40871b), v0Var, (C16483g) null, str2, lVar2, oVar, (i3 & 14) | ((i3 << 3) & 896) | (57344 & i4) | (i4 & 458752), 8);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return s;
    }

    @C8540g
    @C11395k(level = DeprecationLevel.f28051c, message = "animate*AsState APIs now have a new label parameter added.")
    /* renamed from: d */
    public static final /* synthetic */ C8578k2 m7970d(float f, C1968g gVar, C11300l lVar, C8592o oVar, int i, int i2) {
        oVar.mo14918M(704104481);
        if ((i2 & 2) != 0) {
            gVar = f5292b;
        }
        C1968g gVar2 = gVar;
        if ((i2 & 4) != 0) {
            lVar = null;
        }
        C11300l lVar2 = lVar;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(704104481, i, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:458)");
        }
        C8578k2<C16483g> s = m7985s(C16483g.m74451w(f), VectorConvertersKt.m8220e(C16483g.f40871b), gVar2, (C16483g) null, (String) null, lVar2, oVar, (i & 14) | ((i << 3) & 896) | ((i << 9) & 458752), 24);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return s;
    }

    @C8540g
    @C12579k
    /* renamed from: e */
    public static final C8578k2<Float> m7971e(float f, @C12580l C1968g<Float> gVar, float f2, @C12580l String str, @C12580l C11300l<? super Float, C11079d2> lVar, @C12580l C8592o oVar, int i, int i2) {
        C1968g<Float> gVar2;
        float f3;
        String str2;
        C11300l<? super Float, C11079d2> lVar2;
        C8592o oVar2 = oVar;
        int i3 = i;
        oVar.mo14918M(668842840);
        if ((i2 & 2) != 0) {
            gVar2 = f5291a;
        } else {
            gVar2 = gVar;
        }
        if ((i2 & 4) != 0) {
            f3 = 0.01f;
        } else {
            f3 = f2;
        }
        if ((i2 & 8) != 0) {
            str2 = "FloatAnimation";
        } else {
            str2 = str;
        }
        if ((i2 & 16) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(668842840, i3, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:62)");
        }
        oVar.mo14918M(841393662);
        if (gVar2 == f5291a) {
            Float valueOf = Float.valueOf(f3);
            oVar.mo14918M(1157296644);
            boolean n0 = oVar.mo15006n0(valueOf);
            Object N = oVar.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                N = C1972h.m8390o(0.0f, 0.0f, Float.valueOf(f3), 3, (Object) null);
                oVar.mo14893C(N);
            }
            oVar.mo15002m0();
            gVar2 = (C1968g) N;
        }
        oVar.mo15002m0();
        int i4 = i3 & 14;
        int i5 = i3 << 3;
        C8578k2<Float> s = m7985s(Float.valueOf(f), VectorConvertersKt.m8224i(C11377x.f28521a), gVar2, Float.valueOf(f3), str2, lVar2, oVar, (i5 & 7168) | i4 | (57344 & i5) | (i5 & 458752), 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return s;
    }

    @C8540g
    @C11395k(level = DeprecationLevel.f28051c, message = "animate*AsState APIs now have a new label parameter added.")
    /* renamed from: f */
    public static final /* synthetic */ C8578k2 m7972f(float f, C1968g gVar, float f2, C11300l lVar, C8592o oVar, int i, int i2) {
        oVar.mo14918M(1091643291);
        if ((i2 & 2) != 0) {
            gVar = f5291a;
        }
        C1968g gVar2 = gVar;
        if ((i2 & 4) != 0) {
            f2 = 0.01f;
        }
        float f3 = f2;
        if ((i2 & 8) != 0) {
            lVar = null;
        }
        C11300l lVar2 = lVar;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1091643291, i, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:441)");
        }
        C8578k2<Float> e = m7971e(f, gVar2, f3, (String) null, lVar2, oVar, (i & 14) | (i & 112) | (i & 896) | ((i << 3) & 57344), 8);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return e;
    }

    @C8540g
    @C12579k
    /* renamed from: g */
    public static final C8578k2<Integer> m7973g(int i, @C12580l C1968g<Integer> gVar, @C12580l String str, @C12580l C11300l<? super Integer, C11079d2> lVar, @C12580l C8592o oVar, int i2, int i3) {
        C2014v0<Integer> v0Var;
        String str2;
        C11300l<? super Integer, C11079d2> lVar2;
        int i4 = i2;
        oVar.mo14918M(428074472);
        if ((i3 & 2) != 0) {
            v0Var = f5296f;
        } else {
            v0Var = gVar;
        }
        if ((i3 & 4) != 0) {
            str2 = "IntAnimation";
        } else {
            str2 = str;
        }
        if ((i3 & 8) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(428074472, i4, -1, "androidx.compose.animation.core.animateIntAsState (AnimateAsState.kt:268)");
        }
        int i5 = i4 << 6;
        C8578k2<Integer> s = m7985s(Integer.valueOf(i), VectorConvertersKt.m8225j(C11324c0.f28435a), v0Var, (Integer) null, str2, lVar2, oVar, (i4 & 14) | ((i4 << 3) & 896) | (57344 & i5) | (i5 & 458752), 8);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return s;
    }

    @C8540g
    @C11395k(level = DeprecationLevel.f28051c, message = "animate*AsState APIs now have a new label parameter added.")
    /* renamed from: h */
    public static final /* synthetic */ C8578k2 m7974h(int i, C1968g gVar, C11300l lVar, C8592o oVar, int i2, int i3) {
        oVar.mo14918M(-842612981);
        if ((i3 & 2) != 0) {
            gVar = f5296f;
        }
        C1968g gVar2 = gVar;
        if ((i3 & 4) != 0) {
            lVar = null;
        }
        C11300l lVar2 = lVar;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-842612981, i2, -1, "androidx.compose.animation.core.animateIntAsState (AnimateAsState.kt:524)");
        }
        C8578k2<Integer> s = m7985s(Integer.valueOf(i), VectorConvertersKt.m8225j(C11324c0.f28435a), gVar2, (Integer) null, (String) null, lVar2, oVar, (i2 & 14) | ((i2 << 3) & 896) | ((i2 << 9) & 458752), 24);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return s;
    }

    @C8540g
    @C11395k(level = DeprecationLevel.f28051c, message = "animate*AsState APIs now have a new label parameter added.")
    /* renamed from: i */
    public static final /* synthetic */ C8578k2 m7975i(long j, C1968g gVar, C11300l lVar, C8592o oVar, int i, int i2) {
        C2014v0<C16494m> v0Var;
        C11300l lVar2;
        int i3 = i;
        oVar.mo14918M(1010307371);
        if ((i2 & 2) != 0) {
            v0Var = f5297g;
        } else {
            v0Var = gVar;
        }
        if ((i2 & 4) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1010307371, i3, -1, "androidx.compose.animation.core.animateIntOffsetAsState (AnimateAsState.kt:539)");
        }
        C8578k2<C16494m> s = m7985s(C16494m.m74570b(j), VectorConvertersKt.m8222g(C16494m.f40890b), v0Var, (C16494m) null, (String) null, lVar2, oVar, (i3 & 14) | ((i3 << 3) & 896) | ((i3 << 9) & 458752), 24);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return s;
    }

    @C8540g
    @C12579k
    /* renamed from: j */
    public static final C8578k2<C16494m> m7976j(long j, @C12580l C1968g<C16494m> gVar, @C12580l String str, @C12580l C11300l<? super C16494m, C11079d2> lVar, @C12580l C8592o oVar, int i, int i2) {
        C2014v0<C16494m> v0Var;
        String str2;
        C11300l<? super C16494m, C11079d2> lVar2;
        int i3 = i;
        oVar.mo14918M(-696782904);
        if ((i2 & 2) != 0) {
            v0Var = f5297g;
        } else {
            v0Var = gVar;
        }
        if ((i2 & 4) != 0) {
            str2 = "IntOffsetAnimation";
        } else {
            str2 = str;
        }
        if ((i2 & 8) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-696782904, i3, -1, "androidx.compose.animation.core.animateIntOffsetAsState (AnimateAsState.kt:308)");
        }
        int i4 = i3 << 6;
        C8578k2<C16494m> s = m7985s(C16494m.m74570b(j), VectorConvertersKt.m8222g(C16494m.f40890b), v0Var, (C16494m) null, str2, lVar2, oVar, (i3 & 14) | ((i3 << 3) & 896) | (57344 & i4) | (i4 & 458752), 8);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return s;
    }

    @C8540g
    @C12579k
    /* renamed from: k */
    public static final C8578k2<C16500q> m7977k(long j, @C12580l C1968g<C16500q> gVar, @C12580l String str, @C12580l C11300l<? super C16500q, C11079d2> lVar, @C12580l C8592o oVar, int i, int i2) {
        C2014v0<C16500q> v0Var;
        String str2;
        C11300l<? super C16500q, C11079d2> lVar2;
        int i3 = i;
        oVar.mo14918M(582576328);
        if ((i2 & 2) != 0) {
            v0Var = f5298h;
        } else {
            v0Var = gVar;
        }
        if ((i2 & 4) != 0) {
            str2 = "IntSizeAnimation";
        } else {
            str2 = str;
        }
        if ((i2 & 8) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(582576328, i3, -1, "androidx.compose.animation.core.animateIntSizeAsState (AnimateAsState.kt:346)");
        }
        int i4 = i3 << 6;
        C8578k2<C16500q> s = m7985s(C16500q.m74651b(j), VectorConvertersKt.m8223h(C16500q.f40900b), v0Var, (C16500q) null, str2, lVar2, oVar, (i3 & 14) | ((i3 << 3) & 896) | (57344 & i4) | (i4 & 458752), 8);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return s;
    }

    @C8540g
    @C11395k(level = DeprecationLevel.f28051c, message = "animate*AsState APIs now have a new label parameter added.")
    /* renamed from: l */
    public static final /* synthetic */ C8578k2 m7978l(long j, C1968g gVar, C11300l lVar, C8592o oVar, int i, int i2) {
        C2014v0<C16500q> v0Var;
        C11300l lVar2;
        int i3 = i;
        oVar.mo14918M(-1749239765);
        if ((i2 & 2) != 0) {
            v0Var = f5298h;
        } else {
            v0Var = gVar;
        }
        if ((i2 & 4) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1749239765, i3, -1, "androidx.compose.animation.core.animateIntSizeAsState (AnimateAsState.kt:554)");
        }
        C8578k2<C16500q> s = m7985s(C16500q.m74651b(j), VectorConvertersKt.m8223h(C16500q.f40900b), v0Var, (C16500q) null, (String) null, lVar2, oVar, (i3 & 14) | ((i3 << 3) & 896) | ((i3 << 9) & 458752), 24);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return s;
    }

    @C8540g
    @C12579k
    /* renamed from: m */
    public static final C8578k2<C15094f> m7979m(long j, @C12580l C1968g<C15094f> gVar, @C12580l String str, @C12580l C11300l<? super C15094f, C11079d2> lVar, @C12580l C8592o oVar, int i, int i2) {
        C2014v0<C15094f> v0Var;
        String str2;
        C11300l<? super C15094f, C11079d2> lVar2;
        int i3 = i;
        oVar.mo14918M(357896800);
        if ((i2 & 2) != 0) {
            v0Var = f5294d;
        } else {
            v0Var = gVar;
        }
        if ((i2 & 4) != 0) {
            str2 = "OffsetAnimation";
        } else {
            str2 = str;
        }
        if ((i2 & 8) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(357896800, i3, -1, "androidx.compose.animation.core.animateOffsetAsState (AnimateAsState.kt:189)");
        }
        int i4 = i3 << 6;
        C8578k2<C15094f> s = m7985s(C15094f.m64868d(j), VectorConvertersKt.m8217b(C15094f.f37256b), v0Var, (C15094f) null, str2, lVar2, oVar, (i3 & 14) | ((i3 << 3) & 896) | (57344 & i4) | (i4 & 458752), 8);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return s;
    }

    @C8540g
    @C11395k(level = DeprecationLevel.f28051c, message = "animate*AsState APIs now have a new label parameter added.")
    /* renamed from: n */
    public static final /* synthetic */ C8578k2 m7980n(long j, C1968g gVar, C11300l lVar, C8592o oVar, int i, int i2) {
        C2014v0<C15094f> v0Var;
        C11300l lVar2;
        int i3 = i;
        oVar.mo14918M(-456513133);
        if ((i2 & 2) != 0) {
            v0Var = f5294d;
        } else {
            v0Var = gVar;
        }
        if ((i2 & 4) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-456513133, i3, -1, "androidx.compose.animation.core.animateOffsetAsState (AnimateAsState.kt:494)");
        }
        C8578k2<C15094f> s = m7985s(C15094f.m64868d(j), VectorConvertersKt.m8217b(C15094f.f37256b), v0Var, (C15094f) null, (String) null, lVar2, oVar, (i3 & 14) | ((i3 << 3) & 896) | ((i3 << 9) & 458752), 24);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return s;
    }

    @C8540g
    @C12579k
    /* renamed from: o */
    public static final C8578k2<C15098i> m7981o(@C12579k C15098i iVar, @C12580l C1968g<C15098i> gVar, @C12580l String str, @C12580l C11300l<? super C15098i, C11079d2> lVar, @C12580l C8592o oVar, int i, int i2) {
        C2014v0<C15098i> v0Var;
        String str2;
        C11300l<? super C15098i, C11079d2> lVar2;
        int i3 = i;
        C15098i iVar2 = iVar;
        Intrinsics.checkNotNullParameter(iVar, "targetValue");
        oVar.mo14918M(536062978);
        if ((i2 & 2) != 0) {
            v0Var = f5295e;
        } else {
            v0Var = gVar;
        }
        if ((i2 & 4) != 0) {
            str2 = "RectAnimation";
        } else {
            str2 = str;
        }
        if ((i2 & 8) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(536062978, i3, -1, "androidx.compose.animation.core.animateRectAsState (AnimateAsState.kt:230)");
        }
        int i4 = i3 << 6;
        C8578k2<C15098i> s = m7985s(iVar, VectorConvertersKt.m8218c(C15098i.f37261e), v0Var, (C15098i) null, str2, lVar2, oVar, (i3 & 14) | ((i3 << 3) & 896) | (57344 & i4) | (i4 & 458752), 8);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return s;
    }

    @C8540g
    @C11395k(level = DeprecationLevel.f28051c, message = "animate*AsState APIs now have a new label parameter added.")
    /* renamed from: p */
    public static final /* synthetic */ C8578k2 m7982p(C15098i iVar, C1968g gVar, C11300l lVar, C8592o oVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(iVar, "targetValue");
        oVar.mo14918M(-782613967);
        if ((i2 & 2) != 0) {
            gVar = f5295e;
        }
        C1968g gVar2 = gVar;
        if ((i2 & 4) != 0) {
            lVar = null;
        }
        C11300l lVar2 = lVar;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-782613967, i, -1, "androidx.compose.animation.core.animateRectAsState (AnimateAsState.kt:509)");
        }
        C8578k2<C15098i> s = m7985s(iVar, VectorConvertersKt.m8218c(C15098i.f37261e), gVar2, (C15098i) null, (String) null, lVar2, oVar, (i & 14) | ((i << 3) & 896) | ((i << 9) & 458752), 24);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return s;
    }

    @C8540g
    @C11395k(level = DeprecationLevel.f28051c, message = "animate*AsState APIs now have a new label parameter added.")
    /* renamed from: q */
    public static final /* synthetic */ C8578k2 m7983q(long j, C1968g gVar, C11300l lVar, C8592o oVar, int i, int i2) {
        C2014v0<C15104m> v0Var;
        C11300l lVar2;
        int i3 = i;
        oVar.mo14918M(875212471);
        if ((i2 & 2) != 0) {
            v0Var = f5293c;
        } else {
            v0Var = gVar;
        }
        if ((i2 & 4) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(875212471, i3, -1, "androidx.compose.animation.core.animateSizeAsState (AnimateAsState.kt:476)");
        }
        C8578k2<C15104m> s = m7985s(C15104m.m65006c(j), VectorConvertersKt.m8219d(C15104m.f37280b), v0Var, (C15104m) null, (String) null, lVar2, oVar, (i3 & 14) | ((i3 << 3) & 896) | ((i3 << 9) & 458752), 24);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return s;
    }

    @C8540g
    @C12579k
    /* renamed from: r */
    public static final C8578k2<C15104m> m7984r(long j, @C12580l C1968g<C15104m> gVar, @C12580l String str, @C12580l C11300l<? super C15104m, C11079d2> lVar, @C12580l C8592o oVar, int i, int i2) {
        C2014v0<C15104m> v0Var;
        String str2;
        C11300l<? super C15104m, C11079d2> lVar2;
        int i3 = i;
        oVar.mo14918M(1374633148);
        if ((i2 & 2) != 0) {
            v0Var = f5293c;
        } else {
            v0Var = gVar;
        }
        if ((i2 & 4) != 0) {
            str2 = "SizeAnimation";
        } else {
            str2 = str;
        }
        if ((i2 & 8) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1374633148, i3, -1, "androidx.compose.animation.core.animateSizeAsState (AnimateAsState.kt:149)");
        }
        int i4 = i3 << 6;
        C8578k2<C15104m> s = m7985s(C15104m.m65006c(j), VectorConvertersKt.m8219d(C15104m.f37280b), v0Var, (C15104m) null, str2, lVar2, oVar, (i3 & 14) | ((i3 << 3) & 896) | (57344 & i4) | (i4 & 458752), 8);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return s;
    }

    @C8540g
    @C12579k
    /* renamed from: s */
    public static final <T, V extends C1997o> C8578k2<T> m7985s(T t, @C12579k C1945a1<T, V> a1Var, @C12580l C1968g<T> gVar, @C12580l T t2, @C12580l String str, @C12580l C11300l<? super T, C11079d2> lVar, @C12580l C8592o oVar, int i, int i2) {
        C1968g<T> gVar2;
        T t3;
        String str2;
        C11300l<? super T, C11079d2> lVar2;
        T t4 = t;
        C1945a1<T, V> a1Var2 = a1Var;
        C8592o oVar2 = oVar;
        int i3 = i;
        Intrinsics.checkNotNullParameter(a1Var2, "typeConverter");
        oVar2.mo14918M(-1994373980);
        if ((i2 & 4) != 0) {
            oVar2.mo14918M(-492369756);
            Object N = oVar.mo14921N();
            if (N == C8592o.f23032a.mo16277a()) {
                N = C1972h.m8390o(0.0f, 0.0f, (Object) null, 7, (Object) null);
                oVar2.mo14893C(N);
            }
            oVar.mo15002m0();
            gVar2 = (C1968g) N;
        } else {
            gVar2 = gVar;
        }
        if ((i2 & 8) != 0) {
            t3 = null;
        } else {
            t3 = t2;
        }
        if ((i2 & 16) != 0) {
            str2 = "ValueAnimation";
        } else {
            str2 = str;
        }
        if ((i2 & 32) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1994373980, i3, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:390)");
        }
        oVar2.mo14918M(-492369756);
        Object N2 = oVar.mo14921N();
        C8592o.C8593a aVar = C8592o.f23032a;
        if (N2 == aVar.mo16277a()) {
            N2 = C8539f2.m30981g((Object) null, (C8410b2) null, 2, (Object) null);
            oVar2.mo14893C(N2);
        }
        oVar.mo15002m0();
        C8700z0 z0Var = (C8700z0) N2;
        oVar2.mo14918M(-492369756);
        Object N3 = oVar.mo14921N();
        if (N3 == aVar.mo16277a()) {
            N3 = new Animatable(t, a1Var2, t3, str2);
            oVar2.mo14893C(N3);
        }
        oVar.mo15002m0();
        Animatable animatable = (Animatable) N3;
        C8578k2<T> t5 = C8415c2.m30251t(lVar2, oVar2, (i3 >> 15) & 14);
        if (t3 != null && (gVar2 instanceof C2014v0)) {
            C2014v0 v0Var = (C2014v0) gVar2;
            if (!Intrinsics.areEqual(v0Var.mo6995j(), (Object) t3)) {
                gVar2 = C1972h.m8389n(v0Var.mo6992h(), v0Var.mo6994i(), t3);
            }
        }
        C8578k2<T> t6 = C8415c2.m30251t(gVar2, oVar2, 0);
        oVar2.mo14918M(-492369756);
        Object N4 = oVar.mo14921N();
        if (N4 == aVar.mo16277a()) {
            N4 = C11748i.m46625d(-1, (BufferOverflow) null, (C11300l) null, 6, (Object) null);
            oVar2.mo14893C(N4);
        }
        oVar.mo15002m0();
        C11744g gVar3 = (C11744g) N4;
        EffectsKt.m29899k(new AnimateAsStateKt$animateValueAsState$2(gVar3, t), oVar2, 0);
        EffectsKt.m29896h(gVar3, new AnimateAsStateKt$animateValueAsState$3(gVar3, animatable, t6, t5, (C11045c<? super AnimateAsStateKt$animateValueAsState$3>) null), oVar2, 72);
        C8578k2<T> k2Var = (C8578k2) z0Var.getValue();
        if (k2Var == null) {
            k2Var = animatable.mo6602j();
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return k2Var;
    }

    @C8540g
    @C11395k(level = DeprecationLevel.f28051c, message = "animate*AsState APIs now have a new label parameter added.")
    /* renamed from: t */
    public static final /* synthetic */ C8578k2 m7986t(Object obj, C1945a1 a1Var, C1968g gVar, Object obj2, C11300l lVar, C8592o oVar, int i, int i2) {
        C1968g gVar2;
        Object obj3;
        C11300l lVar2;
        C8592o oVar2 = oVar;
        int i3 = i;
        C1945a1 a1Var2 = a1Var;
        Intrinsics.checkNotNullParameter(a1Var, "typeConverter");
        oVar.mo14918M(-846382129);
        if ((i2 & 4) != 0) {
            oVar.mo14918M(-492369756);
            Object N = oVar.mo14921N();
            if (N == C8592o.f23032a.mo16277a()) {
                N = C1972h.m8390o(0.0f, 0.0f, (Object) null, 7, (Object) null);
                oVar.mo14893C(N);
            }
            oVar.mo15002m0();
            gVar2 = (C1968g) N;
        } else {
            gVar2 = gVar;
        }
        if ((i2 & 8) != 0) {
            obj3 = null;
        } else {
            obj3 = obj2;
        }
        if ((i2 & 16) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-846382129, i3, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:569)");
        }
        int i4 = i3 & 8;
        C8578k2 s = m7985s(obj, a1Var, gVar2, obj3, "ValueAnimation", lVar2, oVar, (i4 << 9) | i4 | C12888a.f31808q | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | ((i3 << 3) & 458752), 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return s;
    }

    /* renamed from: u */
    public static final <T> C11300l<T, C11079d2> m7987u(C8578k2<? extends C11300l<? super T, C11079d2>> k2Var) {
        return (C11300l) k2Var.getValue();
    }

    /* renamed from: v */
    public static final <T> C1968g<T> m7988v(C8578k2<? extends C1968g<T>> k2Var) {
        return (C1968g) k2Var.getValue();
    }
}

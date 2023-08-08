package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.Updater;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nAnimatedVisibility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,863:1\n775#1,4:898\n781#1,2:909\n779#1:912\n780#1:939\n785#1:944\n25#2:864\n36#2:872\n36#2:880\n50#2:890\n49#2:891\n36#2:902\n25#2:911\n460#2,13:926\n473#2,3:940\n36#2:945\n25#2:952\n460#2,16:972\n25#2:989\n1057#3,6:865\n1057#3,6:873\n1057#3,6:881\n1057#3,6:892\n1057#3,6:903\n1057#3,6:946\n1057#3,6:953\n1057#3,6:990\n1#4:871\n786#5:879\n787#5,3:887\n75#6:913\n76#6,11:915\n89#6:943\n75#6:959\n76#6,11:961\n89#6:988\n76#7:914\n76#7:960\n*S KotlinDebug\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityKt\n*L\n753#1:898,4\n753#1:909,2\n753#1:912\n753#1:939\n753#1:944\n710#1:864\n735#1:872\n740#1:880\n744#1:890\n744#1:891\n753#1:902\n753#1:911\n753#1:926,13\n753#1:940,3\n778#1:945\n782#1:952\n779#1:972,16\n847#1:989\n710#1:865,6\n735#1:873,6\n740#1:881,6\n744#1:892,6\n753#1:903,6\n778#1:946,6\n782#1:953,6\n847#1:990,6\n740#1:879\n740#1:887,3\n753#1:913\n753#1:915,11\n753#1:943\n779#1:959\n779#1:961,11\n779#1:988\n753#1:914\n779#1:960\n*E\n"})
public final class AnimatedVisibilityKt {
    @C2031i
    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    public static final void m7736a(Transition<EnterExitState> transition, C8767m mVar, C2025e eVar, C2028g gVar, C11305q<? super AnimatedVisibilityScope, ? super C8592o, ? super Integer, C11079d2> qVar, C8592o oVar, int i) {
        oVar.mo14918M(-1967270694);
        EnterExitState h = transition.mo6700h();
        EnterExitState enterExitState = EnterExitState.Visible;
        if (h == enterExitState || transition.mo6706o() == enterExitState) {
            int i2 = i & 14;
            oVar.mo14918M(1157296644);
            boolean n0 = oVar.mo15006n0(transition);
            Object N = oVar.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                N = new C1915c(transition);
                oVar.mo14893C(N);
            }
            oVar.mo15002m0();
            C1915c cVar = (C1915c) N;
            int i3 = i >> 3;
            C8767m k3 = mVar.mo17224k3(EnterExitTransitionKt.m7827g(transition, eVar, gVar, "Built-in", oVar, i2 | 3072 | (i3 & 112) | (i3 & 896)));
            oVar.mo14918M(-492369756);
            Object N2 = oVar.mo14921N();
            if (N2 == C8592o.f23032a.mo16277a()) {
                N2 = new AnimatedEnterExitMeasurePolicy(cVar);
                oVar.mo14893C(N2);
            }
            oVar.mo15002m0();
            C15560f0 f0Var = (C15560f0) N2;
            oVar.mo14918M(-1323940314);
            C16479d dVar = (C16479d) oVar.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) oVar.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) oVar.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(k3);
            if (!(oVar.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            oVar.mo14938T();
            if (oVar.mo14997l()) {
                oVar.mo14947W(a);
            } else {
                oVar.mo14888A();
            }
            oVar.mo14941U();
            C8592o b = Updater.m30180b(oVar);
            Updater.m30188j(b, f0Var, companion.mo44588d());
            Updater.m30188j(b, dVar, companion.mo44586b());
            Updater.m30188j(b, layoutDirection, companion.mo44587c());
            Updater.m30188j(b, c4Var, companion.mo44590f());
            oVar.mo14972e();
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar, 0);
            oVar.mo14918M(2058660585);
            qVar.invoke(cVar, oVar, Integer.valueOf(((i >> 9) & 112) | 8));
            oVar.mo15002m0();
            oVar.mo14896D();
            oVar.mo15002m0();
        }
        oVar.mo15002m0();
    }

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: b */
    public static final <T> void m7737b(Transition<T> transition, C11300l<? super T, Boolean> lVar, C8767m mVar, C2025e eVar, C2028g gVar, C11305q<? super AnimatedVisibilityScope, ? super C8592o, ? super Integer, C11079d2> qVar, C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Transition<T> transition2 = transition;
        C11300l<? super T, Boolean> lVar2 = lVar;
        C8767m mVar2 = mVar;
        C11305q<? super AnimatedVisibilityScope, ? super C8592o, ? super Integer, C11079d2> qVar2 = qVar;
        int i9 = i;
        C8592o o = oVar.mo15009o(808253933);
        if ((i9 & 14) == 0) {
            if (o.mo15006n0(transition2)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i9;
        } else {
            i2 = i9;
        }
        if ((i9 & 112) == 0) {
            if (o.mo15006n0(lVar2)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i9 & 896) == 0) {
            if (o.mo15006n0(mVar2)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i2 |= i6;
        }
        C2025e eVar2 = eVar;
        if ((i9 & 7168) == 0) {
            if (o.mo15006n0(eVar2)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        }
        C2028g gVar2 = gVar;
        if ((i9 & 57344) == 0) {
            if (o.mo15006n0(gVar2)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((458752 & i9) == 0) {
            if (o.mo15006n0(qVar2)) {
                i3 = 131072;
            } else {
                i3 = 65536;
            }
            i2 |= i3;
        }
        int i10 = i2;
        if ((374491 & i10) != 74898 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(808253933, i10, -1, "androidx.compose.animation.AnimatedEnterExitImpl (AnimatedVisibility.kt:726)");
            }
            int i11 = i10 & 14;
            o.mo14918M(1157296644);
            boolean n0 = o.mo15006n0(transition2);
            Object N = o.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                N = C8539f2.m30981g(lVar2.invoke(transition.mo6700h()), (C8410b2) null, 2, (Object) null);
                o.mo14893C(N);
            }
            o.mo15002m0();
            C8700z0 z0Var = (C8700z0) N;
            if (lVar2.invoke(transition.mo6706o()).booleanValue() || ((Boolean) z0Var.getValue()).booleanValue() || transition.mo6711t()) {
                int i12 = i11 | 48;
                o.mo14918M(1215497572);
                int i13 = i12 & 14;
                o.mo14918M(1157296644);
                boolean n02 = o.mo15006n0(transition2);
                T N2 = o.mo14921N();
                if (n02 || N2 == C8592o.f23032a.mo16277a()) {
                    N2 = transition.mo6700h();
                    o.mo14893C(N2);
                }
                o.mo15002m0();
                if (transition.mo6711t()) {
                    N2 = transition.mo6700h();
                }
                int i14 = (i12 >> 3) & 112;
                o.mo14918M(-1220581778);
                C8700z0 z0Var2 = z0Var;
                if (ComposerKt.m29813g0()) {
                    ComposerKt.m29845w0(-1220581778, i14, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:739)");
                }
                int i15 = i11 | (i10 & 112) | ((i14 << 6) & 896);
                EnterExitState l = m7747l(transition2, lVar2, N2, o, i15);
                if (ComposerKt.m29813g0()) {
                    ComposerKt.m29843v0();
                }
                o.mo15002m0();
                T o2 = transition.mo6706o();
                o.mo14918M(-1220581778);
                if (ComposerKt.m29813g0()) {
                    ComposerKt.m29845w0(-1220581778, i14, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:739)");
                }
                EnterExitState l2 = m7747l(transition2, lVar2, o2, o, i15);
                if (ComposerKt.m29813g0()) {
                    ComposerKt.m29843v0();
                }
                o.mo15002m0();
                C8700z0 z0Var3 = z0Var2;
                Transition<T> k = TransitionKt.m8192k(transition, l, l2, "EnterExitTransition", o, i13 | ((i12 << 6) & 7168));
                o.mo15002m0();
                o.mo14918M(511388516);
                boolean n03 = o.mo15006n0(k) | o.mo15006n0(z0Var3);
                Object N3 = o.mo14921N();
                if (n03 || N3 == C8592o.f23032a.mo16277a()) {
                    N3 = new AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1(k, z0Var3, (C11045c<? super AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1>) null);
                    o.mo14893C(N3);
                }
                o.mo15002m0();
                EffectsKt.m29896h(k, (C11304p) N3, o, 64);
                int i16 = i10 >> 3;
                int i17 = (i16 & 57344) | (i16 & 112) | (i16 & 896) | (i16 & 7168);
                o.mo14918M(-1967270694);
                T h = k.mo6700h();
                T t = EnterExitState.Visible;
                if (h == t || k.mo6706o() == t) {
                    int i18 = i17 & 14;
                    o.mo14918M(1157296644);
                    boolean n04 = o.mo15006n0(k);
                    Object N4 = o.mo14921N();
                    if (n04 || N4 == C8592o.f23032a.mo16277a()) {
                        N4 = new C1915c(k);
                        o.mo14893C(N4);
                    }
                    o.mo15002m0();
                    C1915c cVar = (C1915c) N4;
                    int i19 = i17 >> 3;
                    oVar2 = o;
                    C8767m k3 = mVar2.mo17224k3(EnterExitTransitionKt.m7827g(k, eVar, gVar, "Built-in", o, i18 | 3072 | (i19 & 112) | (i19 & 896)));
                    oVar2.mo14918M(-492369756);
                    Object N5 = oVar2.mo14921N();
                    if (N5 == C8592o.f23032a.mo16277a()) {
                        N5 = new AnimatedEnterExitMeasurePolicy(cVar);
                        oVar2.mo14893C(N5);
                    }
                    oVar2.mo15002m0();
                    C15560f0 f0Var = (C15560f0) N5;
                    oVar2.mo14918M(-1323940314);
                    C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
                    LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
                    C15863c4 c4Var = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
                    ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
                    C11289a<ComposeUiNode> a = companion.mo44585a();
                    C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(k3);
                    if (!(oVar2.mo15017r() instanceof C8428d)) {
                        ComposablesKt.m29519n();
                    }
                    oVar2.mo14938T();
                    if (oVar2.mo14997l()) {
                        oVar2.mo14947W(a);
                    } else {
                        oVar2.mo14888A();
                    }
                    oVar2.mo14941U();
                    C8592o b = Updater.m30180b(oVar2);
                    Updater.m30188j(b, f0Var, companion.mo44588d());
                    Updater.m30188j(b, dVar, companion.mo44586b());
                    Updater.m30188j(b, layoutDirection, companion.mo44587c());
                    Updater.m30188j(b, c4Var, companion.mo44590f());
                    oVar2.mo14972e();
                    f.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar2)), oVar2, 0);
                    oVar2.mo14918M(2058660585);
                    qVar2.invoke(cVar, oVar2, Integer.valueOf(((i17 >> 9) & 112) | 8));
                    oVar2.mo15002m0();
                    oVar2.mo14896D();
                    oVar2.mo15002m0();
                } else {
                    oVar2 = o;
                }
                oVar2.mo15002m0();
            } else {
                oVar2 = o;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new AnimatedVisibilityKt$AnimatedEnterExitImpl$2(transition, lVar, mVar, eVar, gVar, qVar, i));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[0[0]]")
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m7738c(@org.jetbrains.annotations.C12579k androidx.compose.animation.core.C1998o0<java.lang.Boolean> r24, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r25, @org.jetbrains.annotations.C12580l androidx.compose.animation.C2025e r26, @org.jetbrains.annotations.C12580l androidx.compose.animation.C2028g r27, @org.jetbrains.annotations.C12580l java.lang.String r28, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r29, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r30, int r31, int r32) {
        /*
            r1 = r24
            r10 = r29
            r11 = r31
            java.lang.String r0 = "visibleState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = -222898426(0xfffffffff2b6d706, float:-7.243036E30)
            r2 = r30
            androidx.compose.runtime.o r12 = r2.mo15009o(r0)
            r2 = r32 & 1
            if (r2 == 0) goto L_0x0020
            r2 = r11 | 6
            goto L_0x0030
        L_0x0020:
            r2 = r11 & 14
            if (r2 != 0) goto L_0x002f
            boolean r2 = r12.mo15006n0(r1)
            if (r2 == 0) goto L_0x002c
            r2 = 4
            goto L_0x002d
        L_0x002c:
            r2 = 2
        L_0x002d:
            r2 = r2 | r11
            goto L_0x0030
        L_0x002f:
            r2 = r11
        L_0x0030:
            r3 = r32 & 2
            if (r3 == 0) goto L_0x0037
            r2 = r2 | 48
            goto L_0x004a
        L_0x0037:
            r4 = r11 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x004a
            r4 = r25
            boolean r5 = r12.mo15006n0(r4)
            if (r5 == 0) goto L_0x0046
            r5 = 32
            goto L_0x0048
        L_0x0046:
            r5 = 16
        L_0x0048:
            r2 = r2 | r5
            goto L_0x004c
        L_0x004a:
            r4 = r25
        L_0x004c:
            r5 = r32 & 4
            if (r5 == 0) goto L_0x0053
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0066
        L_0x0053:
            r6 = r11 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0066
            r6 = r26
            boolean r7 = r12.mo15006n0(r6)
            if (r7 == 0) goto L_0x0062
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r2 = r2 | r7
            goto L_0x0068
        L_0x0066:
            r6 = r26
        L_0x0068:
            r7 = r32 & 8
            if (r7 == 0) goto L_0x006f
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x0082
        L_0x006f:
            r8 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0082
            r8 = r27
            boolean r9 = r12.mo15006n0(r8)
            if (r9 == 0) goto L_0x007e
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007e:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r2 = r2 | r9
            goto L_0x0084
        L_0x0082:
            r8 = r27
        L_0x0084:
            r9 = r32 & 16
            r13 = 57344(0xe000, float:8.0356E-41)
            if (r9 == 0) goto L_0x008e
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a1
        L_0x008e:
            r14 = r11 & r13
            if (r14 != 0) goto L_0x00a1
            r14 = r28
            boolean r15 = r12.mo15006n0(r14)
            if (r15 == 0) goto L_0x009d
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009f
        L_0x009d:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x009f:
            r2 = r2 | r15
            goto L_0x00a3
        L_0x00a1:
            r14 = r28
        L_0x00a3:
            r15 = r32 & 32
            r16 = 458752(0x70000, float:6.42848E-40)
            if (r15 == 0) goto L_0x00ad
            r15 = 196608(0x30000, float:2.75506E-40)
        L_0x00ab:
            r2 = r2 | r15
            goto L_0x00bd
        L_0x00ad:
            r15 = r11 & r16
            if (r15 != 0) goto L_0x00bd
            boolean r15 = r12.mo15006n0(r10)
            if (r15 == 0) goto L_0x00ba
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ab
        L_0x00ba:
            r15 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00ab
        L_0x00bd:
            r15 = 374491(0x5b6db, float:5.24774E-40)
            r15 = r15 & r2
            r13 = 74898(0x12492, float:1.04954E-40)
            if (r15 != r13) goto L_0x00d6
            boolean r13 = r12.mo15011p()
            if (r13 != 0) goto L_0x00cd
            goto L_0x00d6
        L_0x00cd:
            r12.mo14958a0()
            r2 = r4
            r3 = r6
            r4 = r8
            r5 = r14
            goto L_0x0169
        L_0x00d6:
            if (r3 == 0) goto L_0x00dc
            androidx.compose.ui.m$a r3 = androidx.compose.p004ui.C8767m.f23478j
            r13 = r3
            goto L_0x00dd
        L_0x00dc:
            r13 = r4
        L_0x00dd:
            r3 = 0
            r4 = 3
            r15 = 0
            if (r5 == 0) goto L_0x00fd
            androidx.compose.animation.e r5 = androidx.compose.animation.EnterExitTransitionKt.m7842v(r15, r3, r4, r15)
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 15
            r22 = 0
            androidx.compose.animation.e r6 = androidx.compose.animation.EnterExitTransitionKt.m7838r(r17, r18, r19, r20, r21, r22)
            androidx.compose.animation.e r5 = r5.mo7023c(r6)
            r17 = r5
            goto L_0x00ff
        L_0x00fd:
            r17 = r6
        L_0x00ff:
            if (r7 == 0) goto L_0x011b
            androidx.compose.animation.g r3 = androidx.compose.animation.EnterExitTransitionKt.m7844x(r15, r3, r4, r15)
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 15
            r23 = 0
            androidx.compose.animation.g r4 = androidx.compose.animation.EnterExitTransitionKt.m7803G(r18, r19, r20, r21, r22, r23)
            androidx.compose.animation.g r3 = r3.mo7029c(r4)
            r15 = r3
            goto L_0x011c
        L_0x011b:
            r15 = r8
        L_0x011c:
            if (r9 == 0) goto L_0x0121
            java.lang.String r3 = "AnimatedVisibility"
            r14 = r3
        L_0x0121:
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x012d
            r3 = -1
            java.lang.String r4 = "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r2, r3, r4)
        L_0x012d:
            int r0 = androidx.compose.animation.core.C1998o0.f5575d
            r3 = r2 & 14
            r0 = r0 | r3
            int r3 = r2 >> 9
            r3 = r3 & 112(0x70, float:1.57E-43)
            r0 = r0 | r3
            r3 = 0
            androidx.compose.animation.core.Transition r0 = androidx.compose.animation.core.TransitionKt.m8195n(r1, r14, r12, r0, r3)
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7 r3 = androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7.f5212f
            int r4 = r2 << 3
            r5 = r4 & 896(0x380, float:1.256E-42)
            r5 = r5 | 48
            r6 = r4 & 7168(0x1c00, float:1.0045E-41)
            r5 = r5 | r6
            r6 = 57344(0xe000, float:8.0356E-41)
            r4 = r4 & r6
            r4 = r4 | r5
            r2 = r2 & r16
            r9 = r4 | r2
            r2 = r0
            r4 = r13
            r5 = r17
            r6 = r15
            r7 = r29
            r8 = r12
            m7737b(r2, r3, r4, r5, r6, r7, r8, r9)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0164
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0164:
            r2 = r13
            r5 = r14
            r4 = r15
            r3 = r17
        L_0x0169:
            androidx.compose.runtime.t1 r9 = r12.mo15020s()
            if (r9 != 0) goto L_0x0170
            goto L_0x0181
        L_0x0170:
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8 r12 = new androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
            r0 = r12
            r1 = r24
            r6 = r29
            r7 = r31
            r8 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.mo15202a(r12)
        L_0x0181:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.m7738c(androidx.compose.animation.core.o0, androidx.compose.ui.m, androidx.compose.animation.e, androidx.compose.animation.g, java.lang.String, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    @androidx.compose.animation.C2031i
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[0[0]]")
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void m7739d(@org.jetbrains.annotations.C12579k androidx.compose.animation.core.Transition<T> r23, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super T, java.lang.Boolean> r24, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r25, @org.jetbrains.annotations.C12580l androidx.compose.animation.C2025e r26, @org.jetbrains.annotations.C12580l androidx.compose.animation.C2028g r27, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r28, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r29, int r30, int r31) {
        /*
            r8 = r23
            r9 = r24
            r10 = r28
            r11 = r30
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "visible"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 1031950689(0x3d825161, float:0.06363178)
            r1 = r29
            androidx.compose.runtime.o r12 = r1.mo15009o(r0)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r31 & r1
            if (r1 == 0) goto L_0x0029
            r1 = r11 | 6
            goto L_0x0039
        L_0x0029:
            r1 = r11 & 14
            if (r1 != 0) goto L_0x0038
            boolean r1 = r12.mo15006n0(r8)
            if (r1 == 0) goto L_0x0035
            r1 = 4
            goto L_0x0036
        L_0x0035:
            r1 = 2
        L_0x0036:
            r1 = r1 | r11
            goto L_0x0039
        L_0x0038:
            r1 = r11
        L_0x0039:
            r2 = r31 & 1
            if (r2 == 0) goto L_0x0040
            r1 = r1 | 48
            goto L_0x0050
        L_0x0040:
            r2 = r11 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0050
            boolean r2 = r12.mo15006n0(r9)
            if (r2 == 0) goto L_0x004d
            r2 = 32
            goto L_0x004f
        L_0x004d:
            r2 = 16
        L_0x004f:
            r1 = r1 | r2
        L_0x0050:
            r2 = r31 & 2
            if (r2 == 0) goto L_0x0057
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x006a
        L_0x0057:
            r3 = r11 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x006a
            r3 = r25
            boolean r4 = r12.mo15006n0(r3)
            if (r4 == 0) goto L_0x0066
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0068
        L_0x0066:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0068:
            r1 = r1 | r4
            goto L_0x006c
        L_0x006a:
            r3 = r25
        L_0x006c:
            r4 = r31 & 4
            if (r4 == 0) goto L_0x0073
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0086
        L_0x0073:
            r5 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x0086
            r5 = r26
            boolean r6 = r12.mo15006n0(r5)
            if (r6 == 0) goto L_0x0082
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0084
        L_0x0082:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x0084:
            r1 = r1 | r6
            goto L_0x0088
        L_0x0086:
            r5 = r26
        L_0x0088:
            r6 = r31 & 8
            r7 = 57344(0xe000, float:8.0356E-41)
            if (r6 == 0) goto L_0x0092
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a5
        L_0x0092:
            r13 = r11 & r7
            if (r13 != 0) goto L_0x00a5
            r13 = r27
            boolean r14 = r12.mo15006n0(r13)
            if (r14 == 0) goto L_0x00a1
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a3
        L_0x00a1:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x00a3:
            r1 = r1 | r14
            goto L_0x00a7
        L_0x00a5:
            r13 = r27
        L_0x00a7:
            r14 = r31 & 16
            r15 = 458752(0x70000, float:6.42848E-40)
            if (r14 == 0) goto L_0x00b1
            r14 = 196608(0x30000, float:2.75506E-40)
        L_0x00af:
            r1 = r1 | r14
            goto L_0x00c1
        L_0x00b1:
            r14 = r11 & r15
            if (r14 != 0) goto L_0x00c1
            boolean r14 = r12.mo15006n0(r10)
            if (r14 == 0) goto L_0x00be
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00af
        L_0x00be:
            r14 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00af
        L_0x00c1:
            r14 = 374491(0x5b6db, float:5.24774E-40)
            r14 = r14 & r1
            r15 = 74898(0x12492, float:1.04954E-40)
            if (r14 != r15) goto L_0x00d8
            boolean r14 = r12.mo15011p()
            if (r14 != 0) goto L_0x00d1
            goto L_0x00d8
        L_0x00d1:
            r12.mo14958a0()
            r4 = r5
            r5 = r13
            goto L_0x0156
        L_0x00d8:
            if (r2 == 0) goto L_0x00de
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            r14 = r2
            goto L_0x00df
        L_0x00de:
            r14 = r3
        L_0x00df:
            r2 = 3
            r3 = 0
            r15 = 0
            if (r4 == 0) goto L_0x00ff
            androidx.compose.animation.e r4 = androidx.compose.animation.EnterExitTransitionKt.m7842v(r15, r3, r2, r15)
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 15
            r21 = 0
            androidx.compose.animation.e r5 = androidx.compose.animation.EnterExitTransitionKt.m7838r(r16, r17, r18, r19, r20, r21)
            androidx.compose.animation.e r4 = r4.mo7023c(r5)
            r16 = r4
            goto L_0x0101
        L_0x00ff:
            r16 = r5
        L_0x0101:
            if (r6 == 0) goto L_0x011c
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 15
            r22 = 0
            androidx.compose.animation.g r4 = androidx.compose.animation.EnterExitTransitionKt.m7803G(r17, r18, r19, r20, r21, r22)
            androidx.compose.animation.g r2 = androidx.compose.animation.EnterExitTransitionKt.m7844x(r15, r3, r2, r15)
            androidx.compose.animation.g r2 = r4.mo7029c(r2)
            r13 = r2
        L_0x011c:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x0128
            r2 = -1
            java.lang.String r3 = "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r1, r2, r3)
        L_0x0128:
            r0 = r1 & 14
            r2 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            r2 = r1 & r7
            r0 = r0 | r2
            r2 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r2
            r7 = r0 | r1
            r0 = r23
            r1 = r24
            r2 = r14
            r3 = r16
            r4 = r13
            r5 = r28
            r6 = r12
            m7737b(r0, r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0152
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0152:
            r5 = r13
            r3 = r14
            r4 = r16
        L_0x0156:
            androidx.compose.runtime.t1 r12 = r12.mo15020s()
            if (r12 != 0) goto L_0x015d
            goto L_0x0170
        L_0x015d:
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$13 r13 = new androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$13
            r0 = r13
            r1 = r23
            r2 = r24
            r6 = r28
            r7 = r30
            r8 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r12.mo15202a(r13)
        L_0x0170:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.m7739d(androidx.compose.animation.core.Transition, kotlin.jvm.functions.l, androidx.compose.ui.m, androidx.compose.animation.e, androidx.compose.animation.g, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[0[0]]")
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m7740e(@org.jetbrains.annotations.C12579k androidx.compose.foundation.layout.C2373k r24, @org.jetbrains.annotations.C12579k androidx.compose.animation.core.C1998o0<java.lang.Boolean> r25, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r26, @org.jetbrains.annotations.C12580l androidx.compose.animation.C2025e r27, @org.jetbrains.annotations.C12580l androidx.compose.animation.C2028g r28, @org.jetbrains.annotations.C12580l java.lang.String r29, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r30, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r31, int r32, int r33) {
        /*
            r2 = r25
            r11 = r30
            r12 = r32
            java.lang.String r0 = "<this>"
            r1 = r24
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "visibleState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = -850656618(0xffffffffcd4c0296, float:-2.13920096E8)
            r3 = r31
            androidx.compose.runtime.o r13 = r3.mo15009o(r0)
            r3 = r33 & 1
            if (r3 == 0) goto L_0x0027
            r3 = r12 | 48
            goto L_0x0039
        L_0x0027:
            r3 = r12 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0038
            boolean r3 = r13.mo15006n0(r2)
            if (r3 == 0) goto L_0x0034
            r3 = 32
            goto L_0x0036
        L_0x0034:
            r3 = 16
        L_0x0036:
            r3 = r3 | r12
            goto L_0x0039
        L_0x0038:
            r3 = r12
        L_0x0039:
            r4 = r33 & 2
            if (r4 == 0) goto L_0x0040
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0053
        L_0x0040:
            r5 = r12 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0053
            r5 = r26
            boolean r6 = r13.mo15006n0(r5)
            if (r6 == 0) goto L_0x004f
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0051
        L_0x004f:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0051:
            r3 = r3 | r6
            goto L_0x0055
        L_0x0053:
            r5 = r26
        L_0x0055:
            r6 = r33 & 4
            if (r6 == 0) goto L_0x005c
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x006f
        L_0x005c:
            r7 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x006f
            r7 = r27
            boolean r8 = r13.mo15006n0(r7)
            if (r8 == 0) goto L_0x006b
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x006d
        L_0x006b:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x006d:
            r3 = r3 | r8
            goto L_0x0071
        L_0x006f:
            r7 = r27
        L_0x0071:
            r8 = r33 & 8
            r9 = 57344(0xe000, float:8.0356E-41)
            if (r8 == 0) goto L_0x007b
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x008e
        L_0x007b:
            r10 = r12 & r9
            if (r10 != 0) goto L_0x008e
            r10 = r28
            boolean r14 = r13.mo15006n0(r10)
            if (r14 == 0) goto L_0x008a
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008c
        L_0x008a:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x008c:
            r3 = r3 | r14
            goto L_0x0090
        L_0x008e:
            r10 = r28
        L_0x0090:
            r14 = r33 & 16
            r15 = 458752(0x70000, float:6.42848E-40)
            if (r14 == 0) goto L_0x009d
            r16 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r16
            r15 = r29
            goto L_0x00b0
        L_0x009d:
            r16 = r12 & r15
            r15 = r29
            if (r16 != 0) goto L_0x00b0
            boolean r16 = r13.mo15006n0(r15)
            if (r16 == 0) goto L_0x00ac
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ae
        L_0x00ac:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00ae:
            r3 = r3 | r16
        L_0x00b0:
            r16 = r33 & 32
            if (r16 == 0) goto L_0x00b9
            r16 = 1572864(0x180000, float:2.204052E-39)
        L_0x00b6:
            r3 = r3 | r16
            goto L_0x00cb
        L_0x00b9:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r12 & r16
            if (r16 != 0) goto L_0x00cb
            boolean r16 = r13.mo15006n0(r11)
            if (r16 == 0) goto L_0x00c8
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00b6
        L_0x00c8:
            r16 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00b6
        L_0x00cb:
            r16 = 2995921(0x2db6d1, float:4.19818E-39)
            r9 = r3 & r16
            r0 = 599184(0x92490, float:8.39636E-40)
            if (r9 != r0) goto L_0x00e5
            boolean r0 = r13.mo15011p()
            if (r0 != 0) goto L_0x00dc
            goto L_0x00e5
        L_0x00dc:
            r13.mo14958a0()
            r3 = r5
            r4 = r7
            r5 = r10
            r6 = r15
            goto L_0x0180
        L_0x00e5:
            if (r4 == 0) goto L_0x00ea
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x00eb
        L_0x00ea:
            r0 = r5
        L_0x00eb:
            r4 = 0
            r5 = 3
            r9 = 0
            if (r6 == 0) goto L_0x010b
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 15
            r22 = 0
            androidx.compose.animation.e r6 = androidx.compose.animation.EnterExitTransitionKt.m7840t(r17, r18, r19, r20, r21, r22)
            androidx.compose.animation.e r7 = androidx.compose.animation.EnterExitTransitionKt.m7842v(r9, r4, r5, r9)
            androidx.compose.animation.e r6 = r6.mo7023c(r7)
            r17 = r6
            goto L_0x010d
        L_0x010b:
            r17 = r7
        L_0x010d:
            if (r8 == 0) goto L_0x012a
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 15
            r23 = 0
            androidx.compose.animation.g r6 = androidx.compose.animation.EnterExitTransitionKt.m7805I(r18, r19, r20, r21, r22, r23)
            androidx.compose.animation.g r4 = androidx.compose.animation.EnterExitTransitionKt.m7844x(r9, r4, r5, r9)
            androidx.compose.animation.g r4 = r6.mo7029c(r4)
            r18 = r4
            goto L_0x012c
        L_0x012a:
            r18 = r10
        L_0x012c:
            if (r14 == 0) goto L_0x0131
            java.lang.String r4 = "AnimatedVisibility"
            r15 = r4
        L_0x0131:
            boolean r4 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r4 == 0) goto L_0x0140
            r4 = -1
            java.lang.String r5 = "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)"
            r6 = -850656618(0xffffffffcd4c0296, float:-2.13920096E8)
            androidx.compose.runtime.ComposerKt.m29845w0(r6, r3, r4, r5)
        L_0x0140:
            int r4 = androidx.compose.animation.core.C1998o0.f5575d
            int r5 = r3 >> 3
            r6 = r5 & 14
            r4 = r4 | r6
            int r6 = r3 >> 12
            r6 = r6 & 112(0x70, float:1.57E-43)
            r4 = r4 | r6
            r6 = 0
            androidx.compose.animation.core.Transition r4 = androidx.compose.animation.core.TransitionKt.m8195n(r2, r15, r13, r4, r6)
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11 r6 = androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11.f5209f
            r7 = r3 & 896(0x380, float:1.256E-42)
            r7 = r7 | 48
            r8 = r3 & 7168(0x1c00, float:1.0045E-41)
            r7 = r7 | r8
            r8 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r8
            r3 = r3 | r7
            r7 = 458752(0x70000, float:6.42848E-40)
            r5 = r5 & r7
            r10 = r3 | r5
            r3 = r4
            r4 = r6
            r5 = r0
            r6 = r17
            r7 = r18
            r8 = r30
            r9 = r13
            m7737b(r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x017a
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x017a:
            r3 = r0
            r6 = r15
            r4 = r17
            r5 = r18
        L_0x0180:
            androidx.compose.runtime.t1 r10 = r13.mo15020s()
            if (r10 != 0) goto L_0x0187
            goto L_0x019a
        L_0x0187:
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12 r13 = new androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12
            r0 = r13
            r1 = r24
            r2 = r25
            r7 = r30
            r8 = r32
            r9 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.mo15202a(r13)
        L_0x019a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.m7740e(androidx.compose.foundation.layout.k, androidx.compose.animation.core.o0, androidx.compose.ui.m, androidx.compose.animation.e, androidx.compose.animation.g, java.lang.String, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[0[0]]")
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m7741f(@org.jetbrains.annotations.C12579k androidx.compose.foundation.layout.C2373k r24, boolean r25, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r26, @org.jetbrains.annotations.C12580l androidx.compose.animation.C2025e r27, @org.jetbrains.annotations.C12580l androidx.compose.animation.C2028g r28, @org.jetbrains.annotations.C12580l java.lang.String r29, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r30, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r31, int r32, int r33) {
        /*
            r8 = r30
            r9 = r32
            java.lang.String r0 = "<this>"
            r10 = r24
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 1766503102(0x694ab2be, float:1.5315444E25)
            r1 = r31
            androidx.compose.runtime.o r11 = r1.mo15009o(r0)
            r1 = r33 & 1
            if (r1 == 0) goto L_0x0022
            r1 = r9 | 48
            r12 = r25
            goto L_0x0036
        L_0x0022:
            r1 = r9 & 112(0x70, float:1.57E-43)
            r12 = r25
            if (r1 != 0) goto L_0x0035
            boolean r1 = r11.mo14961b(r12)
            if (r1 == 0) goto L_0x0031
            r1 = 32
            goto L_0x0033
        L_0x0031:
            r1 = 16
        L_0x0033:
            r1 = r1 | r9
            goto L_0x0036
        L_0x0035:
            r1 = r9
        L_0x0036:
            r2 = r33 & 2
            if (r2 == 0) goto L_0x003d
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0050
        L_0x003d:
            r3 = r9 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x0050
            r3 = r26
            boolean r4 = r11.mo15006n0(r3)
            if (r4 == 0) goto L_0x004c
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x004e
        L_0x004c:
            r4 = 128(0x80, float:1.794E-43)
        L_0x004e:
            r1 = r1 | r4
            goto L_0x0052
        L_0x0050:
            r3 = r26
        L_0x0052:
            r4 = r33 & 4
            if (r4 == 0) goto L_0x0059
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x006c
        L_0x0059:
            r5 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x006c
            r5 = r27
            boolean r6 = r11.mo15006n0(r5)
            if (r6 == 0) goto L_0x0068
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x006a
        L_0x0068:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x006a:
            r1 = r1 | r6
            goto L_0x006e
        L_0x006c:
            r5 = r27
        L_0x006e:
            r6 = r33 & 8
            r7 = 57344(0xe000, float:8.0356E-41)
            if (r6 == 0) goto L_0x0078
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x008b
        L_0x0078:
            r13 = r9 & r7
            if (r13 != 0) goto L_0x008b
            r13 = r28
            boolean r14 = r11.mo15006n0(r13)
            if (r14 == 0) goto L_0x0087
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0089
        L_0x0087:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0089:
            r1 = r1 | r14
            goto L_0x008d
        L_0x008b:
            r13 = r28
        L_0x008d:
            r14 = r33 & 16
            r15 = 458752(0x70000, float:6.42848E-40)
            if (r14 == 0) goto L_0x009a
            r16 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r16
            r15 = r29
            goto L_0x00ad
        L_0x009a:
            r16 = r9 & r15
            r15 = r29
            if (r16 != 0) goto L_0x00ad
            boolean r16 = r11.mo15006n0(r15)
            if (r16 == 0) goto L_0x00a9
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ab
        L_0x00a9:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00ab:
            r1 = r1 | r16
        L_0x00ad:
            r16 = r33 & 32
            if (r16 == 0) goto L_0x00b6
            r16 = 1572864(0x180000, float:2.204052E-39)
        L_0x00b3:
            r1 = r1 | r16
            goto L_0x00c8
        L_0x00b6:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r9 & r16
            if (r16 != 0) goto L_0x00c8
            boolean r16 = r11.mo15006n0(r8)
            if (r16 == 0) goto L_0x00c5
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00b3
        L_0x00c5:
            r16 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00b3
        L_0x00c8:
            r16 = 2995921(0x2db6d1, float:4.19818E-39)
            r7 = r1 & r16
            r0 = 599184(0x92490, float:8.39636E-40)
            if (r7 != r0) goto L_0x00e1
            boolean r0 = r11.mo15011p()
            if (r0 != 0) goto L_0x00d9
            goto L_0x00e1
        L_0x00d9:
            r11.mo14958a0()
            r4 = r5
            r5 = r13
            r6 = r15
            goto L_0x0176
        L_0x00e1:
            if (r2 == 0) goto L_0x00e8
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            r17 = r0
            goto L_0x00ea
        L_0x00e8:
            r17 = r3
        L_0x00ea:
            r0 = 0
            r2 = 3
            r3 = 0
            if (r4 == 0) goto L_0x010a
            androidx.compose.animation.e r4 = androidx.compose.animation.EnterExitTransitionKt.m7842v(r3, r0, r2, r3)
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 15
            r23 = 0
            androidx.compose.animation.e r5 = androidx.compose.animation.EnterExitTransitionKt.m7840t(r18, r19, r20, r21, r22, r23)
            androidx.compose.animation.e r4 = r4.mo7023c(r5)
            r18 = r4
            goto L_0x010c
        L_0x010a:
            r18 = r5
        L_0x010c:
            if (r6 == 0) goto L_0x0122
            androidx.compose.animation.g r0 = androidx.compose.animation.EnterExitTransitionKt.m7844x(r3, r0, r2, r3)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 15
            r7 = 0
            androidx.compose.animation.g r2 = androidx.compose.animation.EnterExitTransitionKt.m7805I(r2, r3, r4, r5, r6, r7)
            androidx.compose.animation.g r0 = r0.mo7029c(r2)
            r13 = r0
        L_0x0122:
            if (r14 == 0) goto L_0x0127
            java.lang.String r0 = "AnimatedVisibility"
            r15 = r0
        L_0x0127:
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0136
            r0 = -1
            java.lang.String r2 = "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)"
            r3 = 1766503102(0x694ab2be, float:1.5315444E25)
            androidx.compose.runtime.ComposerKt.m29845w0(r3, r1, r0, r2)
        L_0x0136:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r25)
            int r2 = r1 >> 3
            r3 = r2 & 14
            int r4 = r1 >> 12
            r4 = r4 & 112(0x70, float:1.57E-43)
            r3 = r3 | r4
            r4 = 0
            androidx.compose.animation.core.Transition r0 = androidx.compose.animation.core.TransitionKt.m8196o(r0, r15, r11, r3, r4)
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5 r3 = androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5.f5211f
            r4 = r1 & 896(0x380, float:1.256E-42)
            r4 = r4 | 48
            r5 = r1 & 7168(0x1c00, float:1.0045E-41)
            r4 = r4 | r5
            r5 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r5
            r1 = r1 | r4
            r4 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r4
            r7 = r1 | r2
            r1 = r3
            r2 = r17
            r3 = r18
            r4 = r13
            r5 = r30
            r6 = r11
            m7737b(r0, r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0170
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0170:
            r5 = r13
            r6 = r15
            r3 = r17
            r4 = r18
        L_0x0176:
            androidx.compose.runtime.t1 r11 = r11.mo15020s()
            if (r11 != 0) goto L_0x017d
            goto L_0x0190
        L_0x017d:
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6 r13 = new androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
            r0 = r13
            r1 = r24
            r2 = r25
            r7 = r30
            r8 = r32
            r9 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r11.mo15202a(r13)
        L_0x0190:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.m7741f(androidx.compose.foundation.layout.k, boolean, androidx.compose.ui.m, androidx.compose.animation.e, androidx.compose.animation.g, java.lang.String, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[0[0]]")
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m7742g(@org.jetbrains.annotations.C12579k androidx.compose.foundation.layout.C2411u0 r24, @org.jetbrains.annotations.C12579k androidx.compose.animation.core.C1998o0<java.lang.Boolean> r25, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r26, @org.jetbrains.annotations.C12580l androidx.compose.animation.C2025e r27, @org.jetbrains.annotations.C12580l androidx.compose.animation.C2028g r28, @org.jetbrains.annotations.C12580l java.lang.String r29, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r30, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r31, int r32, int r33) {
        /*
            r2 = r25
            r11 = r30
            r12 = r32
            java.lang.String r0 = "<this>"
            r1 = r24
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "visibleState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = 836509870(0x31dc20ae, float:6.406558E-9)
            r3 = r31
            androidx.compose.runtime.o r13 = r3.mo15009o(r0)
            r3 = r33 & 1
            if (r3 == 0) goto L_0x0027
            r3 = r12 | 48
            goto L_0x0039
        L_0x0027:
            r3 = r12 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0038
            boolean r3 = r13.mo15006n0(r2)
            if (r3 == 0) goto L_0x0034
            r3 = 32
            goto L_0x0036
        L_0x0034:
            r3 = 16
        L_0x0036:
            r3 = r3 | r12
            goto L_0x0039
        L_0x0038:
            r3 = r12
        L_0x0039:
            r4 = r33 & 2
            if (r4 == 0) goto L_0x0040
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0053
        L_0x0040:
            r5 = r12 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0053
            r5 = r26
            boolean r6 = r13.mo15006n0(r5)
            if (r6 == 0) goto L_0x004f
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0051
        L_0x004f:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0051:
            r3 = r3 | r6
            goto L_0x0055
        L_0x0053:
            r5 = r26
        L_0x0055:
            r6 = r33 & 4
            if (r6 == 0) goto L_0x005c
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x006f
        L_0x005c:
            r7 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x006f
            r7 = r27
            boolean r8 = r13.mo15006n0(r7)
            if (r8 == 0) goto L_0x006b
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x006d
        L_0x006b:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x006d:
            r3 = r3 | r8
            goto L_0x0071
        L_0x006f:
            r7 = r27
        L_0x0071:
            r8 = r33 & 8
            r9 = 57344(0xe000, float:8.0356E-41)
            if (r8 == 0) goto L_0x007b
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x008e
        L_0x007b:
            r10 = r12 & r9
            if (r10 != 0) goto L_0x008e
            r10 = r28
            boolean r14 = r13.mo15006n0(r10)
            if (r14 == 0) goto L_0x008a
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008c
        L_0x008a:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x008c:
            r3 = r3 | r14
            goto L_0x0090
        L_0x008e:
            r10 = r28
        L_0x0090:
            r14 = r33 & 16
            r15 = 458752(0x70000, float:6.42848E-40)
            if (r14 == 0) goto L_0x009d
            r16 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r16
            r15 = r29
            goto L_0x00b0
        L_0x009d:
            r16 = r12 & r15
            r15 = r29
            if (r16 != 0) goto L_0x00b0
            boolean r16 = r13.mo15006n0(r15)
            if (r16 == 0) goto L_0x00ac
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ae
        L_0x00ac:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00ae:
            r3 = r3 | r16
        L_0x00b0:
            r16 = r33 & 32
            if (r16 == 0) goto L_0x00b9
            r16 = 1572864(0x180000, float:2.204052E-39)
        L_0x00b6:
            r3 = r3 | r16
            goto L_0x00cb
        L_0x00b9:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r12 & r16
            if (r16 != 0) goto L_0x00cb
            boolean r16 = r13.mo15006n0(r11)
            if (r16 == 0) goto L_0x00c8
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00b6
        L_0x00c8:
            r16 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00b6
        L_0x00cb:
            r16 = 2995921(0x2db6d1, float:4.19818E-39)
            r9 = r3 & r16
            r0 = 599184(0x92490, float:8.39636E-40)
            if (r9 != r0) goto L_0x00e5
            boolean r0 = r13.mo15011p()
            if (r0 != 0) goto L_0x00dc
            goto L_0x00e5
        L_0x00dc:
            r13.mo14958a0()
            r3 = r5
            r4 = r7
            r5 = r10
            r6 = r15
            goto L_0x0180
        L_0x00e5:
            if (r4 == 0) goto L_0x00ea
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x00eb
        L_0x00ea:
            r0 = r5
        L_0x00eb:
            r4 = 0
            r5 = 3
            r9 = 0
            if (r6 == 0) goto L_0x010b
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 15
            r22 = 0
            androidx.compose.animation.e r6 = androidx.compose.animation.EnterExitTransitionKt.m7836p(r17, r18, r19, r20, r21, r22)
            androidx.compose.animation.e r7 = androidx.compose.animation.EnterExitTransitionKt.m7842v(r9, r4, r5, r9)
            androidx.compose.animation.e r6 = r6.mo7023c(r7)
            r17 = r6
            goto L_0x010d
        L_0x010b:
            r17 = r7
        L_0x010d:
            if (r8 == 0) goto L_0x012a
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 15
            r23 = 0
            androidx.compose.animation.g r6 = androidx.compose.animation.EnterExitTransitionKt.m7801E(r18, r19, r20, r21, r22, r23)
            androidx.compose.animation.g r4 = androidx.compose.animation.EnterExitTransitionKt.m7844x(r9, r4, r5, r9)
            androidx.compose.animation.g r4 = r6.mo7029c(r4)
            r18 = r4
            goto L_0x012c
        L_0x012a:
            r18 = r10
        L_0x012c:
            if (r14 == 0) goto L_0x0131
            java.lang.String r4 = "AnimatedVisibility"
            r15 = r4
        L_0x0131:
            boolean r4 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r4 == 0) goto L_0x0140
            r4 = -1
            java.lang.String r5 = "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)"
            r6 = 836509870(0x31dc20ae, float:6.406558E-9)
            androidx.compose.runtime.ComposerKt.m29845w0(r6, r3, r4, r5)
        L_0x0140:
            int r4 = androidx.compose.animation.core.C1998o0.f5575d
            int r5 = r3 >> 3
            r6 = r5 & 14
            r4 = r4 | r6
            int r6 = r3 >> 12
            r6 = r6 & 112(0x70, float:1.57E-43)
            r4 = r4 | r6
            r6 = 0
            androidx.compose.animation.core.Transition r4 = androidx.compose.animation.core.TransitionKt.m8195n(r2, r15, r13, r4, r6)
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9 r6 = androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9.f5213f
            r7 = r3 & 896(0x380, float:1.256E-42)
            r7 = r7 | 48
            r8 = r3 & 7168(0x1c00, float:1.0045E-41)
            r7 = r7 | r8
            r8 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r8
            r3 = r3 | r7
            r7 = 458752(0x70000, float:6.42848E-40)
            r5 = r5 & r7
            r10 = r3 | r5
            r3 = r4
            r4 = r6
            r5 = r0
            r6 = r17
            r7 = r18
            r8 = r30
            r9 = r13
            m7737b(r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x017a
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x017a:
            r3 = r0
            r6 = r15
            r4 = r17
            r5 = r18
        L_0x0180:
            androidx.compose.runtime.t1 r10 = r13.mo15020s()
            if (r10 != 0) goto L_0x0187
            goto L_0x019a
        L_0x0187:
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$10 r13 = new androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$10
            r0 = r13
            r1 = r24
            r2 = r25
            r7 = r30
            r8 = r32
            r9 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.mo15202a(r13)
        L_0x019a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.m7742g(androidx.compose.foundation.layout.u0, androidx.compose.animation.core.o0, androidx.compose.ui.m, androidx.compose.animation.e, androidx.compose.animation.g, java.lang.String, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[0[0]]")
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m7743h(@org.jetbrains.annotations.C12579k androidx.compose.foundation.layout.C2411u0 r24, boolean r25, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r26, @org.jetbrains.annotations.C12580l androidx.compose.animation.C2025e r27, @org.jetbrains.annotations.C12580l androidx.compose.animation.C2028g r28, @org.jetbrains.annotations.C12580l java.lang.String r29, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r30, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r31, int r32, int r33) {
        /*
            r8 = r30
            r9 = r32
            java.lang.String r0 = "<this>"
            r10 = r24
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = -1741346906(0xffffffff983527a6, float:-2.341372E-24)
            r1 = r31
            androidx.compose.runtime.o r11 = r1.mo15009o(r0)
            r1 = r33 & 1
            if (r1 == 0) goto L_0x0022
            r1 = r9 | 48
            r12 = r25
            goto L_0x0036
        L_0x0022:
            r1 = r9 & 112(0x70, float:1.57E-43)
            r12 = r25
            if (r1 != 0) goto L_0x0035
            boolean r1 = r11.mo14961b(r12)
            if (r1 == 0) goto L_0x0031
            r1 = 32
            goto L_0x0033
        L_0x0031:
            r1 = 16
        L_0x0033:
            r1 = r1 | r9
            goto L_0x0036
        L_0x0035:
            r1 = r9
        L_0x0036:
            r2 = r33 & 2
            if (r2 == 0) goto L_0x003d
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0050
        L_0x003d:
            r3 = r9 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x0050
            r3 = r26
            boolean r4 = r11.mo15006n0(r3)
            if (r4 == 0) goto L_0x004c
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x004e
        L_0x004c:
            r4 = 128(0x80, float:1.794E-43)
        L_0x004e:
            r1 = r1 | r4
            goto L_0x0052
        L_0x0050:
            r3 = r26
        L_0x0052:
            r4 = r33 & 4
            if (r4 == 0) goto L_0x0059
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x006c
        L_0x0059:
            r5 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x006c
            r5 = r27
            boolean r6 = r11.mo15006n0(r5)
            if (r6 == 0) goto L_0x0068
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x006a
        L_0x0068:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x006a:
            r1 = r1 | r6
            goto L_0x006e
        L_0x006c:
            r5 = r27
        L_0x006e:
            r6 = r33 & 8
            r7 = 57344(0xe000, float:8.0356E-41)
            if (r6 == 0) goto L_0x0078
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x008b
        L_0x0078:
            r13 = r9 & r7
            if (r13 != 0) goto L_0x008b
            r13 = r28
            boolean r14 = r11.mo15006n0(r13)
            if (r14 == 0) goto L_0x0087
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0089
        L_0x0087:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0089:
            r1 = r1 | r14
            goto L_0x008d
        L_0x008b:
            r13 = r28
        L_0x008d:
            r14 = r33 & 16
            r15 = 458752(0x70000, float:6.42848E-40)
            if (r14 == 0) goto L_0x009a
            r16 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r16
            r15 = r29
            goto L_0x00ad
        L_0x009a:
            r16 = r9 & r15
            r15 = r29
            if (r16 != 0) goto L_0x00ad
            boolean r16 = r11.mo15006n0(r15)
            if (r16 == 0) goto L_0x00a9
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ab
        L_0x00a9:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00ab:
            r1 = r1 | r16
        L_0x00ad:
            r16 = r33 & 32
            if (r16 == 0) goto L_0x00b6
            r16 = 1572864(0x180000, float:2.204052E-39)
        L_0x00b3:
            r1 = r1 | r16
            goto L_0x00c8
        L_0x00b6:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r9 & r16
            if (r16 != 0) goto L_0x00c8
            boolean r16 = r11.mo15006n0(r8)
            if (r16 == 0) goto L_0x00c5
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00b3
        L_0x00c5:
            r16 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00b3
        L_0x00c8:
            r16 = 2995921(0x2db6d1, float:4.19818E-39)
            r7 = r1 & r16
            r0 = 599184(0x92490, float:8.39636E-40)
            if (r7 != r0) goto L_0x00e1
            boolean r0 = r11.mo15011p()
            if (r0 != 0) goto L_0x00d9
            goto L_0x00e1
        L_0x00d9:
            r11.mo14958a0()
            r4 = r5
            r5 = r13
            r6 = r15
            goto L_0x0176
        L_0x00e1:
            if (r2 == 0) goto L_0x00e8
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            r17 = r0
            goto L_0x00ea
        L_0x00e8:
            r17 = r3
        L_0x00ea:
            r0 = 0
            r2 = 3
            r3 = 0
            if (r4 == 0) goto L_0x010a
            androidx.compose.animation.e r4 = androidx.compose.animation.EnterExitTransitionKt.m7842v(r3, r0, r2, r3)
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 15
            r23 = 0
            androidx.compose.animation.e r5 = androidx.compose.animation.EnterExitTransitionKt.m7836p(r18, r19, r20, r21, r22, r23)
            androidx.compose.animation.e r4 = r4.mo7023c(r5)
            r18 = r4
            goto L_0x010c
        L_0x010a:
            r18 = r5
        L_0x010c:
            if (r6 == 0) goto L_0x0122
            androidx.compose.animation.g r0 = androidx.compose.animation.EnterExitTransitionKt.m7844x(r3, r0, r2, r3)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 15
            r7 = 0
            androidx.compose.animation.g r2 = androidx.compose.animation.EnterExitTransitionKt.m7801E(r2, r3, r4, r5, r6, r7)
            androidx.compose.animation.g r0 = r0.mo7029c(r2)
            r13 = r0
        L_0x0122:
            if (r14 == 0) goto L_0x0127
            java.lang.String r0 = "AnimatedVisibility"
            r15 = r0
        L_0x0127:
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0136
            r0 = -1
            java.lang.String r2 = "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)"
            r3 = -1741346906(0xffffffff983527a6, float:-2.341372E-24)
            androidx.compose.runtime.ComposerKt.m29845w0(r3, r1, r0, r2)
        L_0x0136:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r25)
            int r2 = r1 >> 3
            r3 = r2 & 14
            int r4 = r1 >> 12
            r4 = r4 & 112(0x70, float:1.57E-43)
            r3 = r3 | r4
            r4 = 0
            androidx.compose.animation.core.Transition r0 = androidx.compose.animation.core.TransitionKt.m8196o(r0, r15, r11, r3, r4)
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3 r3 = androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3.f5210f
            r4 = r1 & 896(0x380, float:1.256E-42)
            r4 = r4 | 48
            r5 = r1 & 7168(0x1c00, float:1.0045E-41)
            r4 = r4 | r5
            r5 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r5
            r1 = r1 | r4
            r4 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r4
            r7 = r1 | r2
            r1 = r3
            r2 = r17
            r3 = r18
            r4 = r13
            r5 = r30
            r6 = r11
            m7737b(r0, r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0170
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0170:
            r5 = r13
            r6 = r15
            r3 = r17
            r4 = r18
        L_0x0176:
            androidx.compose.runtime.t1 r11 = r11.mo15020s()
            if (r11 != 0) goto L_0x017d
            goto L_0x0190
        L_0x017d:
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$4 r13 = new androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$4
            r0 = r13
            r1 = r24
            r2 = r25
            r7 = r30
            r8 = r32
            r9 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r11.mo15202a(r13)
        L_0x0190:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.m7743h(androidx.compose.foundation.layout.u0, boolean, androidx.compose.ui.m, androidx.compose.animation.e, androidx.compose.animation.g, java.lang.String, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[0[0]]")
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m7744i(boolean r24, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r25, @org.jetbrains.annotations.C12580l androidx.compose.animation.C2025e r26, @org.jetbrains.annotations.C12580l androidx.compose.animation.C2028g r27, @org.jetbrains.annotations.C12580l java.lang.String r28, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r29, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r30, int r31, int r32) {
        /*
            r8 = r29
            r9 = r31
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 2088733774(0x7c7f8c4e, float:5.3075257E36)
            r1 = r30
            androidx.compose.runtime.o r10 = r1.mo15009o(r0)
            r1 = r32 & 1
            if (r1 == 0) goto L_0x001b
            r1 = r9 | 6
            r11 = r24
            goto L_0x002d
        L_0x001b:
            r1 = r9 & 14
            r11 = r24
            if (r1 != 0) goto L_0x002c
            boolean r1 = r10.mo14961b(r11)
            if (r1 == 0) goto L_0x0029
            r1 = 4
            goto L_0x002a
        L_0x0029:
            r1 = 2
        L_0x002a:
            r1 = r1 | r9
            goto L_0x002d
        L_0x002c:
            r1 = r9
        L_0x002d:
            r2 = r32 & 2
            if (r2 == 0) goto L_0x0034
            r1 = r1 | 48
            goto L_0x0047
        L_0x0034:
            r3 = r9 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0047
            r3 = r25
            boolean r4 = r10.mo15006n0(r3)
            if (r4 == 0) goto L_0x0043
            r4 = 32
            goto L_0x0045
        L_0x0043:
            r4 = 16
        L_0x0045:
            r1 = r1 | r4
            goto L_0x0049
        L_0x0047:
            r3 = r25
        L_0x0049:
            r4 = r32 & 4
            if (r4 == 0) goto L_0x0050
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0063
        L_0x0050:
            r5 = r9 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0063
            r5 = r26
            boolean r6 = r10.mo15006n0(r5)
            if (r6 == 0) goto L_0x005f
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r1 = r1 | r6
            goto L_0x0065
        L_0x0063:
            r5 = r26
        L_0x0065:
            r6 = r32 & 8
            if (r6 == 0) goto L_0x006c
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x007f
        L_0x006c:
            r7 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x007f
            r7 = r27
            boolean r12 = r10.mo15006n0(r7)
            if (r12 == 0) goto L_0x007b
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r1 = r1 | r12
            goto L_0x0081
        L_0x007f:
            r7 = r27
        L_0x0081:
            r12 = r32 & 16
            r13 = 57344(0xe000, float:8.0356E-41)
            if (r12 == 0) goto L_0x008b
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009e
        L_0x008b:
            r14 = r9 & r13
            if (r14 != 0) goto L_0x009e
            r14 = r28
            boolean r15 = r10.mo15006n0(r14)
            if (r15 == 0) goto L_0x009a
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x009a:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r1 = r1 | r15
            goto L_0x00a0
        L_0x009e:
            r14 = r28
        L_0x00a0:
            r15 = r32 & 32
            r16 = 458752(0x70000, float:6.42848E-40)
            if (r15 == 0) goto L_0x00aa
            r15 = 196608(0x30000, float:2.75506E-40)
        L_0x00a8:
            r1 = r1 | r15
            goto L_0x00ba
        L_0x00aa:
            r15 = r9 & r16
            if (r15 != 0) goto L_0x00ba
            boolean r15 = r10.mo15006n0(r8)
            if (r15 == 0) goto L_0x00b7
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a8
        L_0x00b7:
            r15 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00a8
        L_0x00ba:
            r15 = 374491(0x5b6db, float:5.24774E-40)
            r15 = r15 & r1
            r13 = 74898(0x12492, float:1.04954E-40)
            if (r15 != r13) goto L_0x00d3
            boolean r13 = r10.mo15011p()
            if (r13 != 0) goto L_0x00ca
            goto L_0x00d3
        L_0x00ca:
            r10.mo14958a0()
            r2 = r3
            r3 = r5
            r4 = r7
            r5 = r14
            goto L_0x0167
        L_0x00d3:
            if (r2 == 0) goto L_0x00d9
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            r13 = r2
            goto L_0x00da
        L_0x00d9:
            r13 = r3
        L_0x00da:
            r2 = 0
            r3 = 3
            r15 = 0
            if (r4 == 0) goto L_0x00fa
            androidx.compose.animation.e r4 = androidx.compose.animation.EnterExitTransitionKt.m7842v(r15, r2, r3, r15)
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 15
            r22 = 0
            androidx.compose.animation.e r5 = androidx.compose.animation.EnterExitTransitionKt.m7838r(r17, r18, r19, r20, r21, r22)
            androidx.compose.animation.e r4 = r4.mo7023c(r5)
            r17 = r4
            goto L_0x00fc
        L_0x00fa:
            r17 = r5
        L_0x00fc:
            if (r6 == 0) goto L_0x0118
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 15
            r23 = 0
            androidx.compose.animation.g r4 = androidx.compose.animation.EnterExitTransitionKt.m7803G(r18, r19, r20, r21, r22, r23)
            androidx.compose.animation.g r2 = androidx.compose.animation.EnterExitTransitionKt.m7844x(r15, r2, r3, r15)
            androidx.compose.animation.g r2 = r4.mo7029c(r2)
            r15 = r2
            goto L_0x0119
        L_0x0118:
            r15 = r7
        L_0x0119:
            if (r12 == 0) goto L_0x011e
            java.lang.String r2 = "AnimatedVisibility"
            r14 = r2
        L_0x011e:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x012a
            r2 = -1
            java.lang.String r3 = "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r1, r2, r3)
        L_0x012a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r24)
            r2 = r1 & 14
            int r3 = r1 >> 9
            r3 = r3 & 112(0x70, float:1.57E-43)
            r2 = r2 | r3
            r3 = 0
            androidx.compose.animation.core.Transition r0 = androidx.compose.animation.core.TransitionKt.m8196o(r0, r14, r10, r2, r3)
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1 r2 = androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1.f5208f
            int r3 = r1 << 3
            r4 = r3 & 896(0x380, float:1.256E-42)
            r4 = r4 | 48
            r5 = r3 & 7168(0x1c00, float:1.0045E-41)
            r4 = r4 | r5
            r5 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r5
            r3 = r3 | r4
            r1 = r1 & r16
            r7 = r3 | r1
            r1 = r2
            r2 = r13
            r3 = r17
            r4 = r15
            r5 = r29
            r6 = r10
            m7737b(r0, r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0162
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0162:
            r2 = r13
            r5 = r14
            r4 = r15
            r3 = r17
        L_0x0167:
            androidx.compose.runtime.t1 r10 = r10.mo15020s()
            if (r10 != 0) goto L_0x016e
            goto L_0x017f
        L_0x016e:
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2 r12 = new androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
            r0 = r12
            r1 = r24
            r6 = r29
            r7 = r31
            r8 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r10.mo15202a(r12)
        L_0x017f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.m7744i(boolean, androidx.compose.ui.m, androidx.compose.animation.e, androidx.compose.animation.g, java.lang.String, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    @androidx.compose.animation.C2031i
    @kotlin.C11395k(message = "AnimatedVisibility no longer accepts initiallyVisible as a parameter, please use AnimatedVisibility(MutableTransitionState, Modifier, ...) API instead", replaceWith = @kotlin.C11587t0(expression = "AnimatedVisibility(transitionState = remember { MutableTransitionState(initiallyVisible) }\n.apply { targetState = visible },\nmodifier = modifier,\nenter = enter,\nexit = exit) {\ncontent() \n}", imports = {"androidx.compose.animation.core.MutableTransitionState"}))
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[0[0]]")
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m7745j(boolean r17, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r18, @org.jetbrains.annotations.C12579k androidx.compose.animation.C2025e r19, @org.jetbrains.annotations.C12579k androidx.compose.animation.C2028g r20, boolean r21, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r22, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r23, int r24, int r25) {
        /*
            r9 = r19
            r10 = r20
            r11 = r22
            r12 = r24
            java.lang.String r0 = "enter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "exit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = 1121582420(0x42d9fd54, float:108.99478)
            r1 = r23
            androidx.compose.runtime.o r13 = r1.mo15009o(r0)
            r1 = r25 & 1
            if (r1 == 0) goto L_0x0029
            r1 = r12 | 6
            r14 = r17
            goto L_0x003b
        L_0x0029:
            r1 = r12 & 14
            r14 = r17
            if (r1 != 0) goto L_0x003a
            boolean r1 = r13.mo14961b(r14)
            if (r1 == 0) goto L_0x0037
            r1 = 4
            goto L_0x0038
        L_0x0037:
            r1 = 2
        L_0x0038:
            r1 = r1 | r12
            goto L_0x003b
        L_0x003a:
            r1 = r12
        L_0x003b:
            r2 = r25 & 2
            if (r2 == 0) goto L_0x0042
            r1 = r1 | 48
            goto L_0x0055
        L_0x0042:
            r3 = r12 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0055
            r3 = r18
            boolean r4 = r13.mo15006n0(r3)
            if (r4 == 0) goto L_0x0051
            r4 = 32
            goto L_0x0053
        L_0x0051:
            r4 = 16
        L_0x0053:
            r1 = r1 | r4
            goto L_0x0057
        L_0x0055:
            r3 = r18
        L_0x0057:
            r4 = r25 & 4
            if (r4 == 0) goto L_0x005e
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x006e
        L_0x005e:
            r4 = r12 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x006e
            boolean r4 = r13.mo15006n0(r9)
            if (r4 == 0) goto L_0x006b
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x006d
        L_0x006b:
            r4 = 128(0x80, float:1.794E-43)
        L_0x006d:
            r1 = r1 | r4
        L_0x006e:
            r4 = r25 & 8
            if (r4 == 0) goto L_0x0075
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0085
        L_0x0075:
            r4 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r4 != 0) goto L_0x0085
            boolean r4 = r13.mo15006n0(r10)
            if (r4 == 0) goto L_0x0082
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x0084
        L_0x0082:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x0084:
            r1 = r1 | r4
        L_0x0085:
            r4 = r25 & 16
            if (r4 == 0) goto L_0x008e
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            r15 = r21
            goto L_0x00a2
        L_0x008e:
            r4 = 57344(0xe000, float:8.0356E-41)
            r4 = r4 & r12
            r15 = r21
            if (r4 != 0) goto L_0x00a2
            boolean r4 = r13.mo14961b(r15)
            if (r4 == 0) goto L_0x009f
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a1
        L_0x009f:
            r4 = 8192(0x2000, float:1.14794E-41)
        L_0x00a1:
            r1 = r1 | r4
        L_0x00a2:
            r4 = r25 & 32
            r5 = 196608(0x30000, float:2.75506E-40)
            if (r4 == 0) goto L_0x00aa
            r1 = r1 | r5
            goto L_0x00bb
        L_0x00aa:
            r4 = 458752(0x70000, float:6.42848E-40)
            r4 = r4 & r12
            if (r4 != 0) goto L_0x00bb
            boolean r4 = r13.mo15006n0(r11)
            if (r4 == 0) goto L_0x00b8
            r4 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ba
        L_0x00b8:
            r4 = 65536(0x10000, float:9.18355E-41)
        L_0x00ba:
            r1 = r1 | r4
        L_0x00bb:
            r4 = 374491(0x5b6db, float:5.24774E-40)
            r4 = r4 & r1
            r6 = 74898(0x12492, float:1.04954E-40)
            if (r4 != r6) goto L_0x00d1
            boolean r4 = r13.mo15011p()
            if (r4 != 0) goto L_0x00cb
            goto L_0x00d1
        L_0x00cb:
            r13.mo14958a0()
            r2 = r3
            goto L_0x0143
        L_0x00d1:
            if (r2 == 0) goto L_0x00d8
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            r16 = r2
            goto L_0x00da
        L_0x00d8:
            r16 = r3
        L_0x00da:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x00e6
            r2 = -1
            java.lang.String r3 = "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:701)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r1, r2, r3)
        L_0x00e6:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r13.mo14918M(r0)
            java.lang.Object r0 = r13.mo14921N()
            androidx.compose.runtime.o$a r2 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r2 = r2.mo16277a()
            if (r0 != r2) goto L_0x0104
            androidx.compose.animation.core.o0 r0 = new androidx.compose.animation.core.o0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r21)
            r0.<init>(r2)
            r13.mo14893C(r0)
        L_0x0104:
            r13.mo15002m0()
            androidx.compose.animation.core.o0 r0 = (androidx.compose.animation.core.C1998o0) r0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r17)
            r0.mo6949g(r2)
            r4 = 0
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$16 r2 = new androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$16
            r2.<init>(r11, r1)
            r3 = 1996320812(0x76fd702c, float:2.5701684E33)
            r6 = 1
            androidx.compose.runtime.internal.a r6 = androidx.compose.runtime.internal.C8553b.m31048b(r13, r3, r6, r2)
            int r2 = androidx.compose.animation.core.C1998o0.f5575d
            r2 = r2 | r5
            r3 = r1 & 112(0x70, float:1.57E-43)
            r2 = r2 | r3
            r3 = r1 & 896(0x380, float:1.256E-42)
            r2 = r2 | r3
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r7 = r2 | r1
            r8 = 16
            r1 = r16
            r2 = r19
            r3 = r20
            r5 = r6
            r6 = r13
            m7738c(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0141
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0141:
            r2 = r16
        L_0x0143:
            androidx.compose.runtime.t1 r13 = r13.mo15020s()
            if (r13 != 0) goto L_0x014a
            goto L_0x0162
        L_0x014a:
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$17 r8 = new androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$17
            r0 = r8
            r1 = r17
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r24
            r9 = r8
            r8 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r13.mo15202a(r9)
        L_0x0162:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.m7745j(boolean, androidx.compose.ui.m, androidx.compose.animation.e, androidx.compose.animation.g, boolean, kotlin.jvm.functions.p, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    /* renamed from: l */
    public static final <T> EnterExitState m7747l(Transition<T> transition, C11300l<? super T, Boolean> lVar, T t, C8592o oVar, int i) {
        EnterExitState enterExitState;
        oVar.mo14918M(361571134);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(361571134, i, -1, "androidx.compose.animation.targetEnterExit (AnimatedVisibility.kt:830)");
        }
        oVar.mo14933R(-721837504, transition);
        if (!transition.mo6711t()) {
            oVar.mo14918M(-492369756);
            Object N = oVar.mo14921N();
            if (N == C8592o.f23032a.mo16277a()) {
                N = C8539f2.m30981g(Boolean.FALSE, (C8410b2) null, 2, (Object) null);
                oVar.mo14893C(N);
            }
            oVar.mo15002m0();
            C8700z0 z0Var = (C8700z0) N;
            if (lVar.invoke(transition.mo6700h()).booleanValue()) {
                z0Var.setValue(Boolean.TRUE);
            }
            if (lVar.invoke(t).booleanValue()) {
                enterExitState = EnterExitState.Visible;
            } else if (((Boolean) z0Var.getValue()).booleanValue()) {
                enterExitState = EnterExitState.PostExit;
            } else {
                enterExitState = EnterExitState.PreEnter;
            }
        } else if (lVar.invoke(t).booleanValue()) {
            enterExitState = EnterExitState.Visible;
        } else if (lVar.invoke(transition.mo6700h()).booleanValue()) {
            enterExitState = EnterExitState.PostExit;
        } else {
            enterExitState = EnterExitState.PreEnter;
        }
        oVar.mo14998l0();
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return enterExitState;
    }
}

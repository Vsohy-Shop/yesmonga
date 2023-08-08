package androidx.compose.animation;

import androidx.compose.animation.core.C1945a1;
import androidx.compose.animation.core.C1984k0;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.jsoup.parser.C12888a;

@C11363r0({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/TransitionKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n*L\n1#1,124:1\n36#2:125\n25#2:137\n1057#3,6:126\n1057#3,6:138\n857#4,5:132\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/TransitionKt\n*L\n70#1:125\n103#1:137\n70#1:126,6\n103#1:138,6\n74#1:132,5\n*E\n"})
public final class TransitionKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: androidx.compose.animation.core.a1} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[0[0][0]]")
    @org.jetbrains.annotations.C12579k
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S> androidx.compose.runtime.C8578k2<androidx.compose.p004ui.graphics.C15240j2> m7919a(@org.jetbrains.annotations.C12579k androidx.compose.animation.core.Transition<S> r8, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11305q<? super androidx.compose.animation.core.Transition.C1927b<S>, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, ? extends androidx.compose.animation.core.C1956d0<androidx.compose.p004ui.graphics.C15240j2>> r9, @org.jetbrains.annotations.C12580l java.lang.String r10, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super S, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, androidx.compose.p004ui.graphics.C15240j2> r11, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r12, int r13, int r14) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "targetValueByState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = -1939694975(0xffffffff8c629a81, float:-1.7456901E-31)
            r12.mo14918M(r0)
            r0 = r14 & 1
            if (r0 == 0) goto L_0x0016
            androidx.compose.animation.TransitionKt$animateColor$1 r9 = androidx.compose.animation.TransitionKt$animateColor$1.f5266f
        L_0x0016:
            r14 = r14 & 2
            if (r14 == 0) goto L_0x001c
            java.lang.String r10 = "ColorAnimation"
        L_0x001c:
            r5 = r10
            java.lang.Object r10 = r8.mo6706o()
            int r14 = r13 >> 6
            r14 = r14 & 112(0x70, float:1.57E-43)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.Object r10 = r11.invoke(r10, r12, r14)
            androidx.compose.ui.graphics.j2 r10 = (androidx.compose.p004ui.graphics.C15240j2) r10
            long r0 = r10.mo42833M()
            androidx.compose.ui.graphics.colorspace.c r10 = androidx.compose.p004ui.graphics.C15240j2.m66051E(r0)
            r14 = 1157296644(0x44faf204, float:2007.563)
            r12.mo14918M(r14)
            boolean r14 = r12.mo15006n0(r10)
            java.lang.Object r0 = r12.mo14921N()
            if (r14 != 0) goto L_0x004f
            androidx.compose.runtime.o$a r14 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r14 = r14.mo16277a()
            if (r0 != r14) goto L_0x005f
        L_0x004f:
            androidx.compose.ui.graphics.j2$a r14 = androidx.compose.p004ui.graphics.C15240j2.f37547b
            kotlin.jvm.functions.l r14 = androidx.compose.animation.ColorVectorConverterKt.m7783d(r14)
            java.lang.Object r10 = r14.invoke(r10)
            r0 = r10
            androidx.compose.animation.core.a1 r0 = (androidx.compose.animation.core.C1945a1) r0
            r12.mo14893C(r0)
        L_0x005f:
            r12.mo15002m0()
            r4 = r0
            androidx.compose.animation.core.a1 r4 = (androidx.compose.animation.core.C1945a1) r4
            r10 = r13 & 14
            r10 = r10 | 64
            int r13 = r13 << 3
            r14 = r13 & 896(0x380, float:1.256E-42)
            r10 = r10 | r14
            r14 = r13 & 7168(0x1c00, float:1.0045E-41)
            r10 = r10 | r14
            r14 = 57344(0xe000, float:8.0356E-41)
            r13 = r13 & r14
            r10 = r10 | r13
            r13 = -142660079(0xfffffffff77f2e11, float:-5.1756642E33)
            r12.mo14918M(r13)
            java.lang.Object r13 = r8.mo6700h()
            int r0 = r10 >> 9
            r0 = r0 & 112(0x70, float:1.57E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r11.invoke(r13, r12, r1)
            java.lang.Object r13 = r8.mo6706o()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r2 = r11.invoke(r13, r12, r0)
            androidx.compose.animation.core.Transition$b r11 = r8.mo6704m()
            int r13 = r10 >> 3
            r13 = r13 & 112(0x70, float:1.57E-43)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.Object r9 = r9.invoke(r11, r12, r13)
            r3 = r9
            androidx.compose.animation.core.d0 r3 = (androidx.compose.animation.core.C1956d0) r3
            r9 = r10 & 14
            int r11 = r10 << 9
            r11 = r11 & r14
            r9 = r9 | r11
            r11 = 458752(0x70000, float:6.42848E-40)
            int r10 = r10 << 6
            r10 = r10 & r11
            r7 = r9 | r10
            r0 = r8
            r6 = r12
            androidx.compose.runtime.k2 r8 = androidx.compose.animation.core.TransitionKt.m8194m(r0, r1, r2, r3, r4, r5, r6, r7)
            r12.mo15002m0()
            r12.mo15002m0()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.TransitionKt.m7919a(androidx.compose.animation.core.Transition, kotlin.jvm.functions.q, java.lang.String, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int):androidx.compose.runtime.k2");
    }

    @C8540g
    @C12579k
    /* renamed from: b */
    public static final C8578k2<C15240j2> m7920b(@C12579k InfiniteTransition infiniteTransition, long j, long j2, @C12579k C1984k0<C15240j2> k0Var, @C12580l String str, @C12580l C8592o oVar, int i, int i2) {
        String str2;
        C8592o oVar2 = oVar;
        int i3 = i;
        InfiniteTransition infiniteTransition2 = infiniteTransition;
        Intrinsics.checkNotNullParameter(infiniteTransition, "$this$animateColor");
        C1984k0<C15240j2> k0Var2 = k0Var;
        Intrinsics.checkNotNullParameter(k0Var, "animationSpec");
        oVar2.mo14918M(1901963533);
        if ((i2 & 8) != 0) {
            str2 = "ColorAnimation";
        } else {
            str2 = str;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1901963533, i3, -1, "androidx.compose.animation.animateColor (Transition.kt:96)");
        }
        oVar2.mo14918M(-492369756);
        Object N = oVar.mo14921N();
        if (N == C8592o.f23032a.mo16277a()) {
            N = ColorVectorConverterKt.m7783d(C15240j2.f37547b).invoke(C15240j2.m66051E(j2));
            oVar2.mo14893C(N);
        }
        oVar.mo15002m0();
        C15240j2 n = C15240j2.m66071n(j);
        C15240j2 n2 = C15240j2.m66071n(j2);
        int i4 = i3 << 3;
        int i5 = InfiniteTransition.f5305f | 4096 | (i3 & 14) | (i3 & 112) | (i3 & 896) | (C1984k0.f5527d << 12) | (57344 & i4) | (i4 & 458752);
        C8578k2<C15240j2> d = InfiniteTransitionKt.m8039d(infiniteTransition, n, n2, (C1945a1) N, k0Var, str2, oVar, i5, 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return d;
    }

    @C8540g
    @C11395k(level = DeprecationLevel.f28051c, message = "animateColor APIs now have a new label parameter added.")
    /* renamed from: c */
    public static final /* synthetic */ C8578k2 m7921c(InfiniteTransition infiniteTransition, long j, long j2, C1984k0 k0Var, C8592o oVar, int i) {
        int i2 = i;
        InfiniteTransition infiniteTransition2 = infiniteTransition;
        Intrinsics.checkNotNullParameter(infiniteTransition, "$this$animateColor");
        Intrinsics.checkNotNullParameter(k0Var, "animationSpec");
        oVar.mo14918M(1400583834);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1400583834, i2, -1, "androidx.compose.animation.animateColor (Transition.kt:113)");
        }
        C8578k2<C15240j2> b = m7920b(infiniteTransition, j, j2, k0Var, "ColorAnimation", oVar, InfiniteTransition.f5305f | C12888a.f31808q | (i2 & 14) | (i2 & 112) | (i2 & 896) | (C1984k0.f5527d << 9) | (i2 & 7168), 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return b;
    }
}

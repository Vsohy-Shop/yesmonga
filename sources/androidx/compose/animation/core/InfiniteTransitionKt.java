package androidx.compose.animation.core;

import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11377x;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nInfiniteTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransitionKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,364:1\n25#2:365\n25#2:372\n1057#3,6:366\n1057#3,6:373\n*S KotlinDebug\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransitionKt\n*L\n46#1:365\n263#1:372\n46#1:366,6\n263#1:373,6\n*E\n"})
public final class InfiniteTransitionKt {
    @C8540g
    @C11395k(level = DeprecationLevel.f28051c, message = "animateFloat APIs now have a new label parameter added.")
    /* renamed from: a */
    public static final /* synthetic */ C8578k2 m8036a(InfiniteTransition infiniteTransition, float f, float f2, C1984k0 k0Var, C8592o oVar, int i) {
        int i2 = i;
        InfiniteTransition infiniteTransition2 = infiniteTransition;
        Intrinsics.checkNotNullParameter(infiniteTransition, "<this>");
        C1984k0 k0Var2 = k0Var;
        Intrinsics.checkNotNullParameter(k0Var, "animationSpec");
        C8592o oVar2 = oVar;
        oVar.mo14918M(469472752);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(469472752, i2, -1, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:352)");
        }
        C8578k2<Float> b = m8037b(infiniteTransition, f, f2, k0Var, "FloatAnimation", oVar, (i2 & 112) | 24584 | (i2 & 896) | (i2 & 7168), 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return b;
    }

    @C8540g
    @C12579k
    /* renamed from: b */
    public static final C8578k2<Float> m8037b(@C12579k InfiniteTransition infiniteTransition, float f, float f2, @C12579k C1984k0<Float> k0Var, @C12580l String str, @C12580l C8592o oVar, int i, int i2) {
        String str2;
        int i3 = i;
        InfiniteTransition infiniteTransition2 = infiniteTransition;
        Intrinsics.checkNotNullParameter(infiniteTransition, "<this>");
        C1984k0<Float> k0Var2 = k0Var;
        Intrinsics.checkNotNullParameter(k0Var, "animationSpec");
        oVar.mo14918M(-644770905);
        if ((i2 & 8) != 0) {
            str2 = "FloatAnimation";
        } else {
            str2 = str;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-644770905, i3, -1, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:310)");
        }
        int i4 = i3 << 3;
        C8578k2<Float> d = m8039d(infiniteTransition, Float.valueOf(f), Float.valueOf(f2), VectorConvertersKt.m8224i(C11377x.f28521a), k0Var, str2, oVar, (i3 & 112) | 8 | (i3 & 896) | (57344 & i4) | (i4 & 458752), 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return d;
    }

    @C8540g
    @C11395k(level = DeprecationLevel.f28051c, message = "animateValue APIs now have a new label parameter added.")
    /* renamed from: c */
    public static final /* synthetic */ C8578k2 m8038c(InfiniteTransition infiniteTransition, Object obj, Object obj2, C1945a1 a1Var, C1984k0 k0Var, C8592o oVar, int i) {
        int i2 = i;
        InfiniteTransition infiniteTransition2 = infiniteTransition;
        Intrinsics.checkNotNullParameter(infiniteTransition, "<this>");
        C1945a1 a1Var2 = a1Var;
        Intrinsics.checkNotNullParameter(a1Var, "typeConverter");
        Intrinsics.checkNotNullParameter(k0Var, "animationSpec");
        oVar.mo14918M(-1695411770);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1695411770, i2, -1, "androidx.compose.animation.core.animateValue (InfiniteTransition.kt:332)");
        }
        int i3 = (i2 >> 3) & 8;
        InfiniteTransition infiniteTransition3 = infiniteTransition;
        Object obj3 = obj;
        Object obj4 = obj2;
        C1945a1 a1Var3 = a1Var;
        C1984k0 k0Var2 = k0Var;
        C8592o oVar2 = oVar;
        C8578k2 d = m8039d(infiniteTransition3, obj3, obj4, a1Var3, k0Var2, "ValueAnimation", oVar2, (i3 << 6) | (i3 << 3) | 196616 | (i2 & 112) | (i2 & 896) | (i2 & 7168) | (i2 & 57344), 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return d;
    }

    @C8540g
    @C12579k
    /* renamed from: d */
    public static final <T, V extends C1997o> C8578k2<T> m8039d(@C12579k InfiniteTransition infiniteTransition, T t, T t2, @C12579k C1945a1<T, V> a1Var, @C12579k C1984k0<T> k0Var, @C12580l String str, @C12580l C8592o oVar, int i, int i2) {
        String str2;
        InfiniteTransition infiniteTransition2 = infiniteTransition;
        C1984k0<T> k0Var2 = k0Var;
        C8592o oVar2 = oVar;
        Intrinsics.checkNotNullParameter(infiniteTransition, "<this>");
        C1945a1<T, V> a1Var2 = a1Var;
        Intrinsics.checkNotNullParameter(a1Var, "typeConverter");
        Intrinsics.checkNotNullParameter(k0Var, "animationSpec");
        oVar2.mo14918M(-1062847727);
        if ((i2 & 16) != 0) {
            str2 = "ValueAnimation";
        } else {
            str2 = str;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1062847727, i, -1, "androidx.compose.animation.core.animateValue (InfiniteTransition.kt:254)");
        }
        oVar2.mo14918M(-492369756);
        Object N = oVar.mo14921N();
        InfiniteTransition.C1918a aVar = N;
        if (N == C8592o.f23032a.mo16277a()) {
            InfiniteTransition.C1918a aVar2 = new InfiniteTransition.C1918a(infiniteTransition, t, t2, a1Var, k0Var, str2);
            oVar2.mo14893C(aVar2);
            aVar = aVar2;
        }
        oVar.mo15002m0();
        InfiniteTransition.C1918a aVar3 = (InfiniteTransition.C1918a) aVar;
        T t3 = t;
        T t4 = t2;
        EffectsKt.m29899k(new InfiniteTransitionKt$animateValue$1(t, aVar3, t2, k0Var), oVar2, 0);
        EffectsKt.m29891c(aVar3, new InfiniteTransitionKt$animateValue$2(infiniteTransition, aVar3), oVar2, 6);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return aVar3;
    }

    @C8540g
    @C11395k(level = DeprecationLevel.f28051c, message = "rememberInfiniteTransition APIs now have a new label parameter added.")
    /* renamed from: e */
    public static final /* synthetic */ InfiniteTransition m8040e(C8592o oVar, int i) {
        oVar.mo14918M(-840193660);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-840193660, i, -1, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:323)");
        }
        InfiniteTransition f = m8041f("InfiniteTransition", oVar, 6, 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return f;
    }

    @C8540g
    @C12579k
    /* renamed from: f */
    public static final InfiniteTransition m8041f(@C12580l String str, @C12580l C8592o oVar, int i, int i2) {
        oVar.mo14918M(1013651573);
        if ((i2 & 1) != 0) {
            str = "InfiniteTransition";
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1013651573, i, -1, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:44)");
        }
        oVar.mo14918M(-492369756);
        Object N = oVar.mo14921N();
        if (N == C8592o.f23032a.mo16277a()) {
            N = new InfiniteTransition(str);
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        InfiniteTransition infiniteTransition = (InfiniteTransition) N;
        infiniteTransition.mo6637m(oVar, 8);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return infiniteTransition;
    }
}

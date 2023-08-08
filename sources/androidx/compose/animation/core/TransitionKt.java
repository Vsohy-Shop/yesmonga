package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.C16494m;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import kotlin.C11532s0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11324c0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11377x;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1155:1\n857#1,5:1228\n857#1,5:1233\n857#1,5:1238\n857#1,5:1243\n857#1,5:1248\n857#1,5:1253\n857#1,5:1258\n857#1,5:1263\n25#2:1156\n36#2:1163\n36#2:1170\n36#2:1177\n36#2:1184\n36#2:1191\n36#2:1198\n50#2:1205\n49#2:1206\n36#2:1213\n50#2:1220\n49#2:1221\n1057#3,6:1157\n1057#3,6:1164\n1057#3,6:1171\n1057#3,6:1178\n1057#3,6:1185\n1057#3,6:1192\n1057#3,6:1199\n1057#3,6:1207\n1057#3,6:1214\n1057#3,6:1222\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n*L\n939#1:1228,5\n970#1:1233,5\n1001#1:1238,5\n1032#1:1243,5\n1063#1:1248,5\n1094#1:1253,5\n1124#1:1258,5\n1154#1:1263,5\n71#1:1156\n73#1:1163\n154#1:1170\n158#1:1177\n753#1:1184\n786#1:1191\n799#1:1198\n803#1:1205\n803#1:1206\n873#1:1213\n896#1:1220\n896#1:1221\n71#1:1157,6\n73#1:1164,6\n154#1:1171,6\n158#1:1178,6\n753#1:1185,6\n786#1:1192,6\n799#1:1199,6\n803#1:1207,6\n873#1:1214,6\n896#1:1222,6\n*E\n"})
public final class TransitionKt {

    /* renamed from: a */
    public static final int f5375a = 1;

    @C8540g
    @C8544h(scheme = "[0[0][0]]")
    @C12579k
    /* renamed from: a */
    public static final <S> C8578k2<C16483g> m8182a(@C12579k Transition<S> transition, @C12580l C11305q<? super Transition.C1927b<S>, ? super C8592o, ? super Integer, ? extends C1956d0<C16483g>> qVar, @C12580l String str, @C12579k C11305q<? super S, ? super C8592o, ? super Integer, C16483g> qVar2, @C12580l C8592o oVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(qVar2, "targetValueByState");
        oVar.mo14918M(184732935);
        if ((i2 & 1) != 0) {
            qVar = TransitionKt$animateDp$1.f5376f;
        }
        if ((i2 & 2) != 0) {
            str = "DpAnimation";
        }
        String str2 = str;
        C1945a1<C16483g, C1983k> e = VectorConvertersKt.m8220e(C16483g.f40871b);
        int i3 = i & 14;
        int i4 = i << 3;
        int i5 = i3 | (i4 & 896) | (i4 & 7168) | (i4 & 57344);
        oVar.mo14918M(-142660079);
        int i6 = (i5 >> 9) & 112;
        C8578k2<C16483g> m = m8194m(transition, qVar2.invoke(transition.mo6700h(), oVar, Integer.valueOf(i6)), qVar2.invoke(transition.mo6706o(), oVar, Integer.valueOf(i6)), (C1956d0) qVar.invoke(transition.mo6704m(), oVar, Integer.valueOf((i5 >> 3) & 112)), e, str2, oVar, (i5 & 14) | ((i5 << 9) & 57344) | ((i5 << 6) & 458752));
        oVar.mo15002m0();
        oVar.mo15002m0();
        return m;
    }

    @C8540g
    @C8544h(scheme = "[0[0][0]]")
    @C12579k
    /* renamed from: b */
    public static final <S> C8578k2<Float> m8183b(@C12579k Transition<S> transition, @C12580l C11305q<? super Transition.C1927b<S>, ? super C8592o, ? super Integer, ? extends C1956d0<Float>> qVar, @C12580l String str, @C12579k C11305q<? super S, ? super C8592o, ? super Integer, Float> qVar2, @C12580l C8592o oVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(qVar2, "targetValueByState");
        oVar.mo14918M(-1338768149);
        if ((i2 & 1) != 0) {
            qVar = TransitionKt$animateFloat$1.f5377f;
        }
        if ((i2 & 2) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        C1945a1<Float, C1983k> i3 = VectorConvertersKt.m8224i(C11377x.f28521a);
        int i4 = i & 14;
        int i5 = i << 3;
        int i6 = i4 | (i5 & 896) | (i5 & 7168) | (i5 & 57344);
        oVar.mo14918M(-142660079);
        int i7 = (i6 >> 9) & 112;
        C8578k2<Float> m = m8194m(transition, qVar2.invoke(transition.mo6700h(), oVar, Integer.valueOf(i7)), qVar2.invoke(transition.mo6706o(), oVar, Integer.valueOf(i7)), (C1956d0) qVar.invoke(transition.mo6704m(), oVar, Integer.valueOf((i6 >> 3) & 112)), i3, str2, oVar, (i6 & 14) | ((i6 << 9) & 57344) | ((i6 << 6) & 458752));
        oVar.mo15002m0();
        oVar.mo15002m0();
        return m;
    }

    @C8540g
    @C8544h(scheme = "[0[0][0]]")
    @C12579k
    /* renamed from: c */
    public static final <S> C8578k2<Integer> m8184c(@C12579k Transition<S> transition, @C12580l C11305q<? super Transition.C1927b<S>, ? super C8592o, ? super Integer, ? extends C1956d0<Integer>> qVar, @C12580l String str, @C12579k C11305q<? super S, ? super C8592o, ? super Integer, Integer> qVar2, @C12580l C8592o oVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(qVar2, "targetValueByState");
        oVar.mo14918M(1318902782);
        if ((i2 & 1) != 0) {
            qVar = TransitionKt$animateInt$1.f5378f;
        }
        if ((i2 & 2) != 0) {
            str = "IntAnimation";
        }
        String str2 = str;
        C1945a1<Integer, C1983k> j = VectorConvertersKt.m8225j(C11324c0.f28435a);
        int i3 = i & 14;
        int i4 = i << 3;
        int i5 = i3 | (i4 & 896) | (i4 & 7168) | (i4 & 57344);
        oVar.mo14918M(-142660079);
        int i6 = (i5 >> 9) & 112;
        C8578k2<Integer> m = m8194m(transition, qVar2.invoke(transition.mo6700h(), oVar, Integer.valueOf(i6)), qVar2.invoke(transition.mo6706o(), oVar, Integer.valueOf(i6)), (C1956d0) qVar.invoke(transition.mo6704m(), oVar, Integer.valueOf((i5 >> 3) & 112)), j, str2, oVar, (i5 & 14) | ((i5 << 9) & 57344) | ((i5 << 6) & 458752));
        oVar.mo15002m0();
        oVar.mo15002m0();
        return m;
    }

    @C8540g
    @C8544h(scheme = "[0[0][0]]")
    @C12579k
    /* renamed from: d */
    public static final <S> C8578k2<C16494m> m8185d(@C12579k Transition<S> transition, @C12580l C11305q<? super Transition.C1927b<S>, ? super C8592o, ? super Integer, ? extends C1956d0<C16494m>> qVar, @C12580l String str, @C12579k C11305q<? super S, ? super C8592o, ? super Integer, C16494m> qVar2, @C12580l C8592o oVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(qVar2, "targetValueByState");
        oVar.mo14918M(776131825);
        if ((i2 & 1) != 0) {
            qVar = TransitionKt$animateIntOffset$1.f5379f;
        }
        if ((i2 & 2) != 0) {
            str = "IntOffsetAnimation";
        }
        String str2 = str;
        C1945a1<C16494m, C1986l> g = VectorConvertersKt.m8222g(C16494m.f40890b);
        int i3 = i & 14;
        int i4 = i << 3;
        int i5 = i3 | (i4 & 896) | (i4 & 7168) | (i4 & 57344);
        oVar.mo14918M(-142660079);
        int i6 = (i5 >> 9) & 112;
        C8578k2<C16494m> m = m8194m(transition, qVar2.invoke(transition.mo6700h(), oVar, Integer.valueOf(i6)), qVar2.invoke(transition.mo6706o(), oVar, Integer.valueOf(i6)), (C1956d0) qVar.invoke(transition.mo6704m(), oVar, Integer.valueOf((i5 >> 3) & 112)), g, str2, oVar, (i5 & 14) | ((i5 << 9) & 57344) | ((i5 << 6) & 458752));
        oVar.mo15002m0();
        oVar.mo15002m0();
        return m;
    }

    @C8540g
    @C8544h(scheme = "[0[0][0]]")
    @C12579k
    /* renamed from: e */
    public static final <S> C8578k2<C16500q> m8186e(@C12579k Transition<S> transition, @C12580l C11305q<? super Transition.C1927b<S>, ? super C8592o, ? super Integer, ? extends C1956d0<C16500q>> qVar, @C12580l String str, @C12579k C11305q<? super S, ? super C8592o, ? super Integer, C16500q> qVar2, @C12580l C8592o oVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(qVar2, "targetValueByState");
        oVar.mo14918M(-2104123233);
        if ((i2 & 1) != 0) {
            qVar = TransitionKt$animateIntSize$1.f5380f;
        }
        if ((i2 & 2) != 0) {
            str = "IntSizeAnimation";
        }
        String str2 = str;
        C1945a1<C16500q, C1986l> h = VectorConvertersKt.m8223h(C16500q.f40900b);
        int i3 = i & 14;
        int i4 = i << 3;
        int i5 = i3 | (i4 & 896) | (i4 & 7168) | (i4 & 57344);
        oVar.mo14918M(-142660079);
        int i6 = (i5 >> 9) & 112;
        C8578k2<C16500q> m = m8194m(transition, qVar2.invoke(transition.mo6700h(), oVar, Integer.valueOf(i6)), qVar2.invoke(transition.mo6706o(), oVar, Integer.valueOf(i6)), (C1956d0) qVar.invoke(transition.mo6704m(), oVar, Integer.valueOf((i5 >> 3) & 112)), h, str2, oVar, (i5 & 14) | ((i5 << 9) & 57344) | ((i5 << 6) & 458752));
        oVar.mo15002m0();
        oVar.mo15002m0();
        return m;
    }

    @C8540g
    @C8544h(scheme = "[0[0][0]]")
    @C12579k
    /* renamed from: f */
    public static final <S> C8578k2<C15094f> m8187f(@C12579k Transition<S> transition, @C12580l C11305q<? super Transition.C1927b<S>, ? super C8592o, ? super Integer, ? extends C1956d0<C15094f>> qVar, @C12580l String str, @C12579k C11305q<? super S, ? super C8592o, ? super Integer, C15094f> qVar2, @C12580l C8592o oVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(qVar2, "targetValueByState");
        oVar.mo14918M(2078477582);
        if ((i2 & 1) != 0) {
            qVar = TransitionKt$animateOffset$1.f5381f;
        }
        if ((i2 & 2) != 0) {
            str = "OffsetAnimation";
        }
        String str2 = str;
        C1945a1<C15094f, C1986l> b = VectorConvertersKt.m8217b(C15094f.f37256b);
        int i3 = i & 14;
        int i4 = i << 3;
        int i5 = i3 | (i4 & 896) | (i4 & 7168) | (i4 & 57344);
        oVar.mo14918M(-142660079);
        int i6 = (i5 >> 9) & 112;
        C8578k2<C15094f> m = m8194m(transition, qVar2.invoke(transition.mo6700h(), oVar, Integer.valueOf(i6)), qVar2.invoke(transition.mo6706o(), oVar, Integer.valueOf(i6)), (C1956d0) qVar.invoke(transition.mo6704m(), oVar, Integer.valueOf((i5 >> 3) & 112)), b, str2, oVar, (i5 & 14) | ((i5 << 9) & 57344) | ((i5 << 6) & 458752));
        oVar.mo15002m0();
        oVar.mo15002m0();
        return m;
    }

    @C8540g
    @C8544h(scheme = "[0[0][0]]")
    @C12579k
    /* renamed from: g */
    public static final <S> C8578k2<C15098i> m8188g(@C12579k Transition<S> transition, @C12580l C11305q<? super Transition.C1927b<S>, ? super C8592o, ? super Integer, ? extends C1956d0<C15098i>> qVar, @C12580l String str, @C12579k C11305q<? super S, ? super C8592o, ? super Integer, C15098i> qVar2, @C12580l C8592o oVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(qVar2, "targetValueByState");
        oVar.mo14918M(1496278239);
        if ((i2 & 1) != 0) {
            qVar = TransitionKt$animateRect$1.f5382f;
        }
        if ((i2 & 2) != 0) {
            str = "RectAnimation";
        }
        String str2 = str;
        C1945a1<C15098i, C1994n> c = VectorConvertersKt.m8218c(C15098i.f37261e);
        int i3 = i & 14;
        int i4 = i << 3;
        int i5 = i3 | (i4 & 896) | (i4 & 7168) | (i4 & 57344);
        oVar.mo14918M(-142660079);
        int i6 = (i5 >> 9) & 112;
        C8578k2<C15098i> m = m8194m(transition, qVar2.invoke(transition.mo6700h(), oVar, Integer.valueOf(i6)), qVar2.invoke(transition.mo6706o(), oVar, Integer.valueOf(i6)), (C1956d0) qVar.invoke(transition.mo6704m(), oVar, Integer.valueOf((i5 >> 3) & 112)), c, str2, oVar, (i5 & 14) | ((i5 << 9) & 57344) | ((i5 << 6) & 458752));
        oVar.mo15002m0();
        oVar.mo15002m0();
        return m;
    }

    @C8540g
    @C8544h(scheme = "[0[0][0]]")
    @C12579k
    /* renamed from: h */
    public static final <S> C8578k2<C15104m> m8189h(@C12579k Transition<S> transition, @C12580l C11305q<? super Transition.C1927b<S>, ? super C8592o, ? super Integer, ? extends C1956d0<C15104m>> qVar, @C12580l String str, @C12579k C11305q<? super S, ? super C8592o, ? super Integer, C15104m> qVar2, @C12580l C8592o oVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(qVar2, "targetValueByState");
        oVar.mo14918M(-802210820);
        if ((i2 & 1) != 0) {
            qVar = TransitionKt$animateSize$1.f5383f;
        }
        if ((i2 & 2) != 0) {
            str = "SizeAnimation";
        }
        String str2 = str;
        C1945a1<C15104m, C1986l> d = VectorConvertersKt.m8219d(C15104m.f37280b);
        int i3 = i & 14;
        int i4 = i << 3;
        int i5 = i3 | (i4 & 896) | (i4 & 7168) | (i4 & 57344);
        oVar.mo14918M(-142660079);
        int i6 = (i5 >> 9) & 112;
        C8578k2<C15104m> m = m8194m(transition, qVar2.invoke(transition.mo6700h(), oVar, Integer.valueOf(i6)), qVar2.invoke(transition.mo6706o(), oVar, Integer.valueOf(i6)), (C1956d0) qVar.invoke(transition.mo6704m(), oVar, Integer.valueOf((i5 >> 3) & 112)), d, str2, oVar, (i5 & 14) | ((i5 << 9) & 57344) | ((i5 << 6) & 458752));
        oVar.mo15002m0();
        oVar.mo15002m0();
        return m;
    }

    @C8540g
    @C8544h(scheme = "[0[0][0]]")
    @C12579k
    /* renamed from: i */
    public static final <S, T, V extends C1997o> C8578k2<T> m8190i(@C12579k Transition<S> transition, @C12579k C1945a1<T, V> a1Var, @C12580l C11305q<? super Transition.C1927b<S>, ? super C8592o, ? super Integer, ? extends C1956d0<T>> qVar, @C12580l String str, @C12579k C11305q<? super S, ? super C8592o, ? super Integer, ? extends T> qVar2, @C12580l C8592o oVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(a1Var, "typeConverter");
        Intrinsics.checkNotNullParameter(qVar2, "targetValueByState");
        oVar.mo14918M(-142660079);
        if ((i2 & 2) != 0) {
            qVar = TransitionKt$animateValue$1.f5384f;
        }
        if ((i2 & 4) != 0) {
            str = "ValueAnimation";
        }
        int i3 = (i >> 9) & 112;
        Transition<S> transition2 = transition;
        C1945a1<T, V> a1Var2 = a1Var;
        C8578k2<T> m = m8194m(transition2, qVar2.invoke(transition.mo6700h(), oVar, Integer.valueOf(i3)), qVar2.invoke(transition.mo6706o(), oVar, Integer.valueOf(i3)), (C1956d0) qVar.invoke(transition.mo6704m(), oVar, Integer.valueOf((i >> 3) & 112)), a1Var2, str, oVar, (i & 14) | (57344 & (i << 9)) | ((i << 6) & 458752));
        oVar.mo15002m0();
        return m;
    }

    @C1952c0
    @C8540g
    @C8544h(scheme = "[0[0]]")
    @C12579k
    /* renamed from: j */
    public static final <S, T> Transition<T> m8191j(@C12579k Transition<S> transition, @C12580l String str, @C12579k C11305q<? super S, ? super C8592o, ? super Integer, ? extends T> qVar, @C12580l C8592o oVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(qVar, "transformToChildState");
        oVar.mo14918M(1215497572);
        if ((i2 & 1) != 0) {
            str = "ChildTransition";
        }
        String str2 = str;
        int i3 = i & 14;
        oVar.mo14918M(1157296644);
        boolean n0 = oVar.mo15006n0(transition);
        S N = oVar.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            N = transition.mo6700h();
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        if (transition.mo6711t()) {
            N = transition.mo6700h();
        }
        int i4 = (i >> 3) & 112;
        Transition<T> k = m8192k(transition, qVar.invoke(N, oVar, Integer.valueOf(i4)), qVar.invoke(transition.mo6706o(), oVar, Integer.valueOf(i4)), str2, oVar, i3 | ((i << 6) & 7168));
        oVar.mo15002m0();
        return k;
    }

    @C8540g
    @C12579k
    @C11532s0
    /* renamed from: k */
    public static final <S, T> Transition<T> m8192k(@C12579k Transition<S> transition, T t, T t2, @C12579k String str, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(str, "childLabel");
        oVar.mo14918M(-198307638);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-198307638, i, -1, "androidx.compose.animation.core.createChildTransitionInternal (Transition.kt:793)");
        }
        oVar.mo14918M(1157296644);
        boolean n0 = oVar.mo15006n0(transition);
        Object N = oVar.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            C1998o0 o0Var = new C1998o0(t);
            N = new Transition(o0Var, transition.mo6701i() + " > " + str);
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        Transition<T> transition2 = (Transition) N;
        oVar.mo14918M(511388516);
        boolean n02 = oVar.mo15006n0(transition) | oVar.mo15006n0(transition2);
        Object N2 = oVar.mo14921N();
        if (n02 || N2 == C8592o.f23032a.mo16277a()) {
            N2 = new TransitionKt$createChildTransitionInternal$1$1(transition, transition2);
            oVar.mo14893C(N2);
        }
        oVar.mo15002m0();
        EffectsKt.m29891c(transition2, (C11300l) N2, oVar, 0);
        if (transition.mo6711t()) {
            transition2.mo6686C(t, t2, transition.mo6702j());
        } else {
            transition2.mo6695L(t2, oVar, ((i >> 3) & 8) | ((i >> 6) & 14));
            transition2.mo6690G(false);
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return transition2;
    }

    @C1987l0
    @C8540g
    @C12579k
    /* renamed from: l */
    public static final <S, T, V extends C1997o> Transition<S>.a<T, V> m8193l(@C12579k Transition<S> transition, @C12579k C1945a1<T, V> a1Var, @C12580l String str, @C12580l C8592o oVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(a1Var, "typeConverter");
        oVar.mo14918M(-1714122528);
        if ((i2 & 2) != 0) {
            str = "DeferredAnimation";
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1714122528, i, -1, "androidx.compose.animation.core.createDeferredAnimation (Transition.kt:748)");
        }
        oVar.mo14918M(1157296644);
        boolean n0 = oVar.mo15006n0(transition);
        Object N = oVar.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            N = new Transition.C1925a(transition, a1Var, str);
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        Transition<S>.a<T, V> aVar = (Transition.C1925a) N;
        EffectsKt.m29891c(aVar, new TransitionKt$createDeferredAnimation$1(transition, aVar), oVar, 0);
        if (transition.mo6711t()) {
            aVar.mo6722f();
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return aVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: androidx.compose.animation.core.Transition$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: androidx.compose.animation.core.Transition$d} */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003c, code lost:
        if (r0 == androidx.compose.runtime.C8592o.f23032a.mo16277a()) goto L_0x003e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @org.jetbrains.annotations.C12579k
    @kotlin.C11532s0
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S, T, V extends androidx.compose.animation.core.C1997o> androidx.compose.runtime.C8578k2<T> m8194m(@org.jetbrains.annotations.C12579k androidx.compose.animation.core.Transition<S> r7, T r8, T r9, @org.jetbrains.annotations.C12579k androidx.compose.animation.core.C1956d0<T> r10, @org.jetbrains.annotations.C12579k androidx.compose.animation.core.C1945a1<T, V> r11, @org.jetbrains.annotations.C12579k java.lang.String r12, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r13, int r14) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "animationSpec"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "typeConverter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "label"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = -304821198(0xffffffffedd4cc32, float:-8.23221E27)
            r13.mo14918M(r0)
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x0026
            r1 = -1
            java.lang.String r2 = "androidx.compose.animation.core.createTransitionAnimation (Transition.kt:865)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r14, r1, r2)
        L_0x0026:
            r14 = 1157296644(0x44faf204, float:2007.563)
            r13.mo14918M(r14)
            boolean r14 = r13.mo15006n0(r7)
            java.lang.Object r0 = r13.mo14921N()
            if (r14 != 0) goto L_0x003e
            androidx.compose.runtime.o$a r14 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r14 = r14.mo16277a()
            if (r0 != r14) goto L_0x004f
        L_0x003e:
            androidx.compose.animation.core.Transition$d r0 = new androidx.compose.animation.core.Transition$d
            androidx.compose.animation.core.o r4 = androidx.compose.animation.core.C1980j.m8434i(r11, r9)
            r1 = r0
            r2 = r7
            r3 = r8
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            r13.mo14893C(r0)
        L_0x004f:
            r13.mo15002m0()
            androidx.compose.animation.core.Transition$d r0 = (androidx.compose.animation.core.Transition.C1930d) r0
            boolean r11 = r7.mo6711t()
            if (r11 == 0) goto L_0x005e
            r0.mo6732B(r8, r9, r10)
            goto L_0x0061
        L_0x005e:
            r0.mo6733C(r9, r10)
        L_0x0061:
            r8 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r13.mo14918M(r8)
            boolean r8 = r13.mo15006n0(r7)
            boolean r9 = r13.mo15006n0(r0)
            r8 = r8 | r9
            java.lang.Object r9 = r13.mo14921N()
            if (r8 != 0) goto L_0x007e
            androidx.compose.runtime.o$a r8 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r8 = r8.mo16277a()
            if (r9 != r8) goto L_0x0086
        L_0x007e:
            androidx.compose.animation.core.TransitionKt$createTransitionAnimation$1$1 r9 = new androidx.compose.animation.core.TransitionKt$createTransitionAnimation$1$1
            r9.<init>(r7, r0)
            r13.mo14893C(r9)
        L_0x0086:
            r13.mo15002m0()
            kotlin.jvm.functions.l r9 = (kotlin.jvm.functions.C11300l) r9
            r7 = 0
            androidx.compose.runtime.EffectsKt.m29891c(r0, r9, r13, r7)
            boolean r7 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r7 == 0) goto L_0x0098
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0098:
            r13.mo15002m0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.TransitionKt.m8194m(androidx.compose.animation.core.Transition, java.lang.Object, java.lang.Object, androidx.compose.animation.core.d0, androidx.compose.animation.core.a1, java.lang.String, androidx.compose.runtime.o, int):androidx.compose.runtime.k2");
    }

    @C8540g
    @C12579k
    /* renamed from: n */
    public static final <T> Transition<T> m8195n(@C12579k C1998o0<T> o0Var, @C12580l String str, @C12580l C8592o oVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(o0Var, "transitionState");
        oVar.mo14918M(882913843);
        if ((i2 & 2) != 0) {
            str = null;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(882913843, i, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:149)");
        }
        oVar.mo14918M(1157296644);
        boolean n0 = oVar.mo15006n0(o0Var);
        Object N = oVar.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            N = new Transition(o0Var, str);
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        Transition<T> transition = (Transition) N;
        transition.mo6698f(o0Var.mo6944b(), oVar, 0);
        oVar.mo14918M(1157296644);
        boolean n02 = oVar.mo15006n0(transition);
        Object N2 = oVar.mo14921N();
        if (n02 || N2 == C8592o.f23032a.mo16277a()) {
            N2 = new TransitionKt$updateTransition$2$1(transition);
            oVar.mo14893C(N2);
        }
        oVar.mo15002m0();
        EffectsKt.m29891c(transition, (C11300l) N2, oVar, 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return transition;
    }

    @C8540g
    @C12579k
    /* renamed from: o */
    public static final <T> Transition<T> m8196o(T t, @C12580l String str, @C12580l C8592o oVar, int i, int i2) {
        oVar.mo14918M(2029166765);
        if ((i2 & 2) != 0) {
            str = null;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(2029166765, i, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:66)");
        }
        oVar.mo14918M(-492369756);
        Object N = oVar.mo14921N();
        C8592o.C8593a aVar = C8592o.f23032a;
        if (N == aVar.mo16277a()) {
            N = new Transition(t, str);
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        Transition<T> transition = (Transition) N;
        transition.mo6698f(t, oVar, (i & 8) | 48 | (i & 14));
        oVar.mo14918M(1157296644);
        boolean n0 = oVar.mo15006n0(transition);
        Object N2 = oVar.mo14921N();
        if (n0 || N2 == aVar.mo16277a()) {
            N2 = new TransitionKt$updateTransition$1$1(transition);
            oVar.mo14893C(N2);
        }
        oVar.mo15002m0();
        EffectsKt.m29891c(transition, (C11300l) N2, oVar, 6);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return transition;
    }
}

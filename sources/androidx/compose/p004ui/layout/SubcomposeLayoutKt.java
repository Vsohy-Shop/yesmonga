package androidx.compose.p004ui.layout;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.C8782q;
import androidx.compose.p004ui.ComposedModifierKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8602q;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.Updater;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/SubcomposeLayoutKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,774:1\n25#2:775\n251#2,10:785\n36#2:795\n1114#3,6:776\n1114#3,6:796\n76#4:782\n76#4:783\n76#4:784\n*S KotlinDebug\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/SubcomposeLayoutKt\n*L\n76#1:775\n114#1:785,10\n132#1:795\n76#1:776,6\n132#1:796,6\n111#1:782\n112#1:783\n113#1:784\n*E\n"})
/* renamed from: androidx.compose.ui.layout.SubcomposeLayoutKt */
public final class SubcomposeLayoutKt {
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m69021a(@C12580l C8767m mVar, @C12579k C11304p<? super C15562f1, ? super C16476b, ? extends C15564g0> pVar, @C12580l C8592o oVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(pVar, "measurePolicy");
        C8592o o = oVar.mo15009o(-1298353104);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (o.mo15006n0(mVar)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (o.mo14927P(pVar)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 91) != 18 || !o.mo15011p()) {
            if (i6 != 0) {
                mVar = C8767m.f23478j;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1298353104, i3, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:70)");
            }
            o.mo14918M(-492369756);
            Object N = o.mo14921N();
            if (N == C8592o.f23032a.mo16277a()) {
                N = new SubcomposeLayoutState();
                o.mo14893C(N);
            }
            o.mo15002m0();
            int i7 = i3 << 3;
            m69022b((SubcomposeLayoutState) N, mVar, pVar, o, (i7 & 112) | 8 | (i7 & 896), 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new SubcomposeLayoutKt$SubcomposeLayout$2(mVar, pVar, i, i2));
        }
    }

    @C8540g
    @C8782q
    /* renamed from: b */
    public static final void m69022b(@C12579k SubcomposeLayoutState subcomposeLayoutState, @C12580l C8767m mVar, @C12579k C11304p<? super C15562f1, ? super C16476b, ? extends C15564g0> pVar, @C12580l C8592o oVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(subcomposeLayoutState, "state");
        Intrinsics.checkNotNullParameter(pVar, "measurePolicy");
        C8592o o = oVar.mo15009o(-511989831);
        if ((i2 & 2) != 0) {
            mVar = C8767m.f23478j;
        }
        C8767m mVar2 = mVar;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-511989831, i, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:103)");
        }
        C8602q u = ComposablesKt.m29526u(o, 0);
        C8767m k = ComposedModifierKt.m32288k(o, mVar2);
        C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
        LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
        C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
        C11289a<LayoutNode> a = LayoutNode.f38817e1.mo44724a();
        o.mo14918M(1886828752);
        if (!(o.mo15017r() instanceof C8428d)) {
            ComposablesKt.m29519n();
        }
        o.mo15026u();
        if (o.mo14997l()) {
            o.mo14947W(new SubcomposeLayoutKt$SubcomposeLayout$$inlined$ComposeNode$1(a));
        } else {
            o.mo14888A();
        }
        C8592o b = Updater.m30180b(o);
        Updater.m30188j(b, subcomposeLayoutState, subcomposeLayoutState.mo44347h());
        Updater.m30188j(b, u, subcomposeLayoutState.mo44345f());
        Updater.m30188j(b, pVar, subcomposeLayoutState.mo44346g());
        ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
        Updater.m30188j(b, dVar, companion.mo44586b());
        Updater.m30188j(b, layoutDirection, companion.mo44587c());
        Updater.m30188j(b, c4Var, companion.mo44590f());
        Updater.m30188j(b, k, companion.mo44589e());
        o.mo14896D();
        o.mo15002m0();
        o.mo14918M(-607848778);
        if (!o.mo15011p()) {
            EffectsKt.m29899k(new SubcomposeLayoutKt$SubcomposeLayout$4(subcomposeLayoutState), o, 0);
        }
        o.mo15002m0();
        C8578k2 t = C8415c2.m30251t(subcomposeLayoutState, o, 8);
        C11079d2 d2Var = C11079d2.f28267a;
        o.mo14918M(1157296644);
        boolean n0 = o.mo15006n0(t);
        Object N = o.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            N = new SubcomposeLayoutKt$SubcomposeLayout$5$1(t);
            o.mo14893C(N);
        }
        o.mo15002m0();
        EffectsKt.m29891c(d2Var, (C11300l) N, o, 6);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new SubcomposeLayoutKt$SubcomposeLayout$6(subcomposeLayoutState, mVar2, pVar, i, i2));
        }
    }

    @C12579k
    /* renamed from: c */
    public static final C15565g1 m69023c(int i) {
        return new C15559f(i);
    }
}

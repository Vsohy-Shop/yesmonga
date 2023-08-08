package androidx.compose.p004ui.layout;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.C8782q;
import androidx.compose.p004ui.ComposedModifierKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.C8553b;
import com.bumptech.glide.load.data.mediastore.C22132b;
import java.util.List;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.C11532s0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,316:1\n74#1:354\n75#1,11:356\n88#1:381\n76#2:317\n76#2:318\n76#2:319\n76#2:334\n76#2:335\n76#2:336\n76#2:355\n76#2:382\n76#2:383\n76#2:384\n456#3,14:320\n286#3,10:337\n36#3:347\n456#3,14:367\n365#3,11:385\n1114#4,6:348\n*S KotlinDebug\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n*L\n167#1:354\n167#1:356,11\n167#1:381\n74#1:317\n75#1:318\n76#1:319\n120#1:334\n121#1:335\n122#1:336\n167#1:355\n210#1:382\n211#1:383\n212#1:384\n77#1:320,14\n124#1:337,10\n170#1:347\n167#1:367,14\n214#1:385,11\n170#1:348,6\n*E\n"})
/* renamed from: androidx.compose.ui.layout.LayoutKt */
public final class LayoutKt {
    @C8540g
    @C8782q
    /* renamed from: a */
    public static final void m68903a(@C12580l C8767m mVar, @C12579k C15560f0 f0Var, @C12580l C8592o oVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(f0Var, "measurePolicy");
        oVar.mo14918M(544976794);
        if ((i2 & 1) != 0) {
            mVar = C8767m.f23478j;
        }
        C16479d dVar = (C16479d) oVar.mo15032w(CompositionLocalsKt.m71011i());
        LayoutDirection layoutDirection = (LayoutDirection) oVar.mo15032w(CompositionLocalsKt.m71018p());
        C15863c4 c4Var = (C15863c4) oVar.mo15032w(CompositionLocalsKt.m71025w());
        C8767m k = ComposedModifierKt.m32288k(oVar, mVar);
        ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
        C11289a<ComposeUiNode> a = companion.mo44585a();
        oVar.mo14918M(1405779621);
        if (!(oVar.mo15017r() instanceof C8428d)) {
            ComposablesKt.m29519n();
        }
        oVar.mo14938T();
        if (oVar.mo14997l()) {
            oVar.mo14947W(new LayoutKt$Layout$$inlined$ReusableComposeNode$1(a));
        } else {
            oVar.mo14888A();
        }
        C8592o b = Updater.m30180b(oVar);
        Updater.m30188j(b, f0Var, companion.mo44588d());
        Updater.m30188j(b, dVar, companion.mo44586b());
        Updater.m30188j(b, layoutDirection, companion.mo44587c());
        Updater.m30188j(b, c4Var, companion.mo44590f());
        Updater.m30188j(b, k, companion.mo44589e());
        oVar.mo14896D();
        oVar.mo15002m0();
        oVar.mo15002m0();
    }

    @C8540g
    @C8782q
    /* renamed from: b */
    public static final void m68904b(@C12579k List<? extends C11304p<? super C8592o, ? super Integer, C11079d2>> list, @C12580l C8767m mVar, @C12579k C15579k0 k0Var, @C12580l C8592o oVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(list, "contents");
        Intrinsics.checkNotNullParameter(k0Var, "measurePolicy");
        oVar.mo14918M(1399185516);
        if ((i2 & 2) != 0) {
            mVar = C8767m.f23478j;
        }
        C11304p<C8592o, Integer, C11079d2> e = m68907e(list);
        oVar.mo14918M(1157296644);
        boolean n0 = oVar.mo15006n0(k0Var);
        Object N = oVar.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            N = C15581l0.m69248a(k0Var);
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        C15560f0 f0Var = (C15560f0) N;
        int i3 = i & 112;
        oVar.mo14918M(-1323940314);
        C16479d dVar = (C16479d) oVar.mo15032w(CompositionLocalsKt.m71011i());
        LayoutDirection layoutDirection = (LayoutDirection) oVar.mo15032w(CompositionLocalsKt.m71018p());
        C15863c4 c4Var = (C15863c4) oVar.mo15032w(CompositionLocalsKt.m71025w());
        ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
        C11289a<ComposeUiNode> a = companion.mo44585a();
        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = m68908f(mVar);
        int i4 = ((i3 << 9) & 7168) | 6;
        if (!(oVar.mo15017r() instanceof C8428d)) {
            ComposablesKt.m29519n();
        }
        oVar.mo14938T();
        if (oVar.mo14997l()) {
            oVar.mo14947W(a);
        } else {
            oVar.mo14888A();
        }
        C8592o b = Updater.m30180b(oVar);
        Updater.m30188j(b, f0Var, companion.mo44588d());
        Updater.m30188j(b, dVar, companion.mo44586b());
        Updater.m30188j(b, layoutDirection, companion.mo44587c());
        Updater.m30188j(b, c4Var, companion.mo44590f());
        f.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar, Integer.valueOf((i4 >> 3) & 112));
        oVar.mo14918M(2058660585);
        e.invoke(oVar, Integer.valueOf((i4 >> 9) & 14));
        oVar.mo15002m0();
        oVar.mo14896D();
        oVar.mo15002m0();
        oVar.mo15002m0();
    }

    @C8540g
    @C8782q
    /* renamed from: c */
    public static final void m68905c(@C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar, @C12580l C8767m mVar, @C12579k C15560f0 f0Var, @C12580l C8592o oVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(pVar, "content");
        Intrinsics.checkNotNullParameter(f0Var, "measurePolicy");
        oVar.mo14918M(-1323940314);
        if ((i2 & 2) != 0) {
            mVar = C8767m.f23478j;
        }
        C16479d dVar = (C16479d) oVar.mo15032w(CompositionLocalsKt.m71011i());
        LayoutDirection layoutDirection = (LayoutDirection) oVar.mo15032w(CompositionLocalsKt.m71018p());
        C15863c4 c4Var = (C15863c4) oVar.mo15032w(CompositionLocalsKt.m71025w());
        ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
        C11289a<ComposeUiNode> a = companion.mo44585a();
        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = m68908f(mVar);
        int i3 = ((i << 9) & 7168) | 6;
        if (!(oVar.mo15017r() instanceof C8428d)) {
            ComposablesKt.m29519n();
        }
        oVar.mo14938T();
        if (oVar.mo14997l()) {
            oVar.mo14947W(a);
        } else {
            oVar.mo14888A();
        }
        C8592o b = Updater.m30180b(oVar);
        Updater.m30188j(b, f0Var, companion.mo44588d());
        Updater.m30188j(b, dVar, companion.mo44586b());
        Updater.m30188j(b, layoutDirection, companion.mo44587c());
        Updater.m30188j(b, c4Var, companion.mo44590f());
        f.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar, Integer.valueOf((i3 >> 3) & 112));
        oVar.mo14918M(2058660585);
        pVar.invoke(oVar, Integer.valueOf((i3 >> 9) & 14));
        oVar.mo15002m0();
        oVar.mo14896D();
        oVar.mo15002m0();
    }

    @C8782q
    @C11395k(message = "This API is unsafe for UI performance at scale - using it incorrectly will lead to exponential performance issues. This API should be avoided whenever possible.")
    @C8540g
    /* renamed from: d */
    public static final void m68906d(@C12580l C8767m mVar, @C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar, @C12579k C15560f0 f0Var, @C12580l C8592o oVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        Intrinsics.checkNotNullParameter(pVar, "content");
        Intrinsics.checkNotNullParameter(f0Var, "measurePolicy");
        C8592o o = oVar.mo15009o(1949933075);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (o.mo15006n0(mVar)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (o.mo14927P(pVar)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= C22132b.f56831b;
        } else if ((i & 896) == 0) {
            if (o.mo15006n0(f0Var)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 731) != 146 || !o.mo15011p()) {
            if (i7 != 0) {
                mVar = C8767m.f23478j;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1949933075, i3, -1, "androidx.compose.ui.layout.MultiMeasureLayout (Layout.kt:203)");
            }
            C8767m k = ComposedModifierKt.m32288k(o, mVar);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            C11289a<LayoutNode> a = LayoutNode.f38817e1.mo44724a();
            int i8 = ((i3 << 3) & 896) | 6;
            o.mo14918M(-692256719);
            if (!(o.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            o.mo14938T();
            if (o.mo14997l()) {
                o.mo14947W(a);
            } else {
                o.mo14888A();
            }
            C8592o b = Updater.m30180b(o);
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            Updater.m30188j(b, k, companion.mo44589e());
            Updater.m30188j(b, f0Var, companion.mo44588d());
            Updater.m30188j(b, dVar, companion.mo44586b());
            Updater.m30188j(b, layoutDirection, companion.mo44587c());
            Updater.m30188j(b, c4Var, companion.mo44590f());
            Updater.m30185g(b, LayoutKt$MultiMeasureLayout$1$1.f38624f);
            pVar.invoke(o, Integer.valueOf((i8 >> 6) & 14));
            o.mo14896D();
            o.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8767m mVar2 = mVar;
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new LayoutKt$MultiMeasureLayout$2(mVar2, pVar, f0Var, i, i2));
        }
    }

    @C12579k
    @C11532s0
    /* renamed from: e */
    public static final C11304p<C8592o, Integer, C11079d2> m68907e(@C12579k List<? extends C11304p<? super C8592o, ? super Integer, C11079d2>> list) {
        Intrinsics.checkNotNullParameter(list, "contents");
        return C8553b.m31049c(-1953651383, true, new LayoutKt$combineAsVirtualLayouts$1(list));
    }

    @C12579k
    @C11532s0
    /* renamed from: f */
    public static final C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> m68908f(@C12579k C8767m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "modifier");
        return C8553b.m31049c(-1586257396, true, new LayoutKt$materializerOf$1(mVar));
    }
}

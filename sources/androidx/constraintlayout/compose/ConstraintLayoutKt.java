package androidx.constraintlayout.compose;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C1946b;
import androidx.compose.animation.core.C1968g;
import androidx.compose.animation.core.C1972h;
import androidx.compose.animation.core.C2022z;
import androidx.compose.animation.core.C2023z0;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.draw.C8756n;
import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.C15594q;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.semantics.SemanticsModifierKt;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.C8553b;
import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.C16778b;
import java.util.EnumSet;
import java.util.List;
import kotlin.C11078d1;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.C11532s0;
import kotlin.C11587t0;
import kotlin.Pair;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C11744g;
import kotlinx.coroutines.channels.C11748i;
import org.intellij.lang.annotations.C12553d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class ConstraintLayoutKt {

    /* renamed from: a */
    public static final boolean f41138a = false;

    /* renamed from: androidx.constraintlayout.compose.ConstraintLayoutKt$a */
    public static final class C16569a {
    }

    @C12579k
    /* renamed from: A */
    public static final Dimension m75195A(@C12579k Dimension.C16578c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        C16627s sVar = (C16627s) cVar;
        sVar.mo48586h(androidx.constraintlayout.core.state.Dimension.f42473j);
        return sVar;
    }

    @C12579k
    /* renamed from: B */
    public static final Dimension.C16578c m75196B(@C12579k Dimension.C16576a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        C16627s sVar = (C16627s) aVar;
        sVar.mo48584f(androidx.constraintlayout.core.state.Dimension.f42473j);
        return sVar;
    }

    @C12579k
    /* renamed from: C */
    public static final Dimension m75197C(@C12579k Dimension.C16577b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        C16627s sVar = (C16627s) bVar;
        sVar.mo48584f(androidx.constraintlayout.core.state.Dimension.f42473j);
        return sVar;
    }

    @C8540g
    @C12579k
    @C11532s0
    /* renamed from: D */
    public static final C15560f0 m75198D(int i, @C12579k C8700z0<Long> z0Var, @C12579k C16602j jVar, @C12579k Measurer measurer, @C12580l C8592o oVar, int i2) {
        Intrinsics.checkNotNullParameter(z0Var, "needsUpdate");
        Intrinsics.checkNotNullParameter(jVar, "constraintSet");
        Intrinsics.checkNotNullParameter(measurer, "measurer");
        oVar.mo14918M(-441904452);
        Integer valueOf = Integer.valueOf(i);
        Long value = z0Var.getValue();
        oVar.mo14918M(-3686095);
        boolean n0 = oVar.mo15006n0(value) | oVar.mo15006n0(valueOf) | oVar.mo15006n0(jVar);
        Object N = oVar.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            measurer.mo48408x(jVar);
            N = new ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$2$1(measurer, jVar, i);
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        C15560f0 f0Var = (C15560f0) N;
        oVar.mo15002m0();
        return f0Var;
    }

    @C8540g
    @C12579k
    @C11532s0
    /* renamed from: E */
    public static final Pair<C15560f0, C11289a<C11079d2>> m75199E(int i, @C12579k ConstraintLayoutScope constraintLayoutScope, @C12579k C8700z0<Boolean> z0Var, @C12579k Measurer measurer, @C12580l C8592o oVar, int i2) {
        Intrinsics.checkNotNullParameter(constraintLayoutScope, "scope");
        Intrinsics.checkNotNullParameter(z0Var, "remeasureRequesterState");
        Intrinsics.checkNotNullParameter(measurer, "measurer");
        oVar.mo14918M(-441911751);
        oVar.mo14918M(-3687241);
        Object N = oVar.mo14921N();
        C8592o.C8593a aVar = C8592o.f23032a;
        if (N == aVar.mo16277a()) {
            N = new ConstraintSetForInlineDsl(constraintLayoutScope);
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        ConstraintSetForInlineDsl constraintSetForInlineDsl = (ConstraintSetForInlineDsl) N;
        Integer valueOf = Integer.valueOf(i);
        oVar.mo14918M(-3686930);
        boolean n0 = oVar.mo15006n0(valueOf);
        Object N2 = oVar.mo14921N();
        if (n0 || N2 == aVar.mo16277a()) {
            N2 = C11078d1.m42659a(new C16570xbd53fece(measurer, constraintSetForInlineDsl, i, z0Var), new C16572xe992e98a(z0Var, constraintSetForInlineDsl));
            oVar.mo14893C(N2);
        }
        oVar.mo15002m0();
        Pair<C15560f0, C11289a<C11079d2>> pair = (Pair) N2;
        oVar.mo15002m0();
        return pair;
    }

    /* renamed from: F */
    public static final String m75200F(ConstraintWidget constraintWidget) {
        return constraintWidget.mo49605y() + " width " + constraintWidget.mo49569m0() + " minWidth " + constraintWidget.mo49495Q() + " maxWidth " + constraintWidget.mo49489O() + " height " + constraintWidget.mo49456D() + " minHeight " + constraintWidget.mo49492P() + " maxHeight " + constraintWidget.mo49486N() + " HDB " + constraintWidget.mo49468H() + " VDB " + constraintWidget.mo49559j0() + " MCW " + constraintWidget.f42766w + " MCH " + constraintWidget.f42768x + " percentW " + constraintWidget.f42678B + " percentH " + constraintWidget.f42684E;
    }

    /* renamed from: G */
    public static final String m75201G(C16778b.C16779a aVar) {
        return "measure strategy is ";
    }

    @C8540g
    /* renamed from: a */
    public static final void m75202a(@C12580l C8767m mVar, int i, @C12579k C11305q<? super ConstraintLayoutScope, ? super C8592o, ? super Integer, C11079d2> qVar, @C12580l C8592o oVar, int i2, int i3) {
        Intrinsics.checkNotNullParameter(qVar, "content");
        oVar.mo14918M(-270267587);
        if ((i3 & 1) != 0) {
            mVar = C8767m.f23478j;
        }
        if ((i3 & 2) != 0) {
            i = 257;
        }
        int i4 = i;
        oVar.mo14918M(-3687241);
        Object N = oVar.mo14921N();
        C8592o.C8593a aVar = C8592o.f23032a;
        if (N == aVar.mo16277a()) {
            N = new Measurer();
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        Measurer measurer = (Measurer) N;
        oVar.mo14918M(-3687241);
        Object N2 = oVar.mo14921N();
        if (N2 == aVar.mo16277a()) {
            N2 = new ConstraintLayoutScope();
            oVar.mo14893C(N2);
        }
        oVar.mo15002m0();
        ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) N2;
        oVar.mo14918M(-3687241);
        Object N3 = oVar.mo14921N();
        if (N3 == aVar.mo16277a()) {
            N3 = C8539f2.m30981g(Boolean.FALSE, (C8410b2) null, 2, (Object) null);
            oVar.mo14893C(N3);
        }
        oVar.mo15002m0();
        Pair<C15560f0, C11289a<C11079d2>> E = m75199E(i4, constraintLayoutScope, (C8700z0) N3, measurer, oVar, ((i2 >> 3) & 14) | 4544);
        C8767m c = SemanticsModifierKt.m71868c(mVar, false, new ConstraintLayoutKt$ConstraintLayout$1(measurer), 1, (Object) null);
        C8767m mVar2 = c;
        LayoutKt.m68906d(mVar2, C8553b.m31048b(oVar, -819894182, true, new ConstraintLayoutKt$ConstraintLayout$2(constraintLayoutScope, qVar, i2, E.mo21847b())), E.mo21846a(), oVar, 48, 0);
        oVar.mo15002m0();
    }

    @C8540g
    /* renamed from: b */
    public static final void m75203b(@C12579k C16602j jVar, @C12580l C8767m mVar, int i, boolean z, @C12580l C1968g<Float> gVar, @C12580l C11289a<C11079d2> aVar, @C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar, @C12580l C8592o oVar, int i2, int i3) {
        C8767m mVar2;
        int i4;
        boolean z2;
        C2023z0 z0Var;
        C11289a<C11079d2> aVar2;
        C16592e0 e0Var;
        C16602j jVar2 = jVar;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar2 = pVar;
        C8592o oVar2 = oVar;
        int i5 = i2;
        Intrinsics.checkNotNullParameter(jVar2, "constraintSet");
        Intrinsics.checkNotNullParameter(pVar2, "content");
        oVar2.mo14918M(-270262697);
        if ((i3 & 2) != 0) {
            mVar2 = C8767m.f23478j;
        } else {
            mVar2 = mVar;
        }
        if ((i3 & 4) != 0) {
            i4 = 257;
        } else {
            i4 = i;
        }
        if ((i3 & 8) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        if ((i3 & 16) != 0) {
            z0Var = C1972h.m8392q(0, 0, (C2022z) null, 7, (Object) null);
        } else {
            z0Var = gVar;
        }
        if ((i3 & 32) != 0) {
            aVar2 = null;
        } else {
            aVar2 = aVar;
        }
        if (z2) {
            oVar2.mo14918M(-270262314);
            oVar2.mo14918M(-3687241);
            Object N = oVar.mo14921N();
            C8592o.C8593a aVar3 = C8592o.f23032a;
            if (N == aVar3.mo16277a()) {
                N = C8539f2.m30981g(jVar2, (C8410b2) null, 2, (Object) null);
                oVar2.mo14893C(N);
            }
            oVar.mo15002m0();
            C8700z0 z0Var2 = (C8700z0) N;
            oVar2.mo14918M(-3687241);
            Object N2 = oVar.mo14921N();
            if (N2 == aVar3.mo16277a()) {
                N2 = C8539f2.m30981g(jVar2, (C8410b2) null, 2, (Object) null);
                oVar2.mo14893C(N2);
            }
            oVar.mo15002m0();
            C8700z0 z0Var3 = (C8700z0) N2;
            oVar2.mo14918M(-3687241);
            Object N3 = oVar.mo14921N();
            if (N3 == aVar3.mo16277a()) {
                N3 = C1946b.m8288b(0.0f, 0.0f, 2, (Object) null);
                oVar2.mo14893C(N3);
            }
            oVar.mo15002m0();
            Animatable animatable = (Animatable) N3;
            oVar2.mo14918M(-3687241);
            Object N4 = oVar.mo14921N();
            if (N4 == aVar3.mo16277a()) {
                N4 = C11748i.m46625d(-1, (BufferOverflow) null, (C11300l) null, 6, (Object) null);
                oVar2.mo14893C(N4);
            }
            oVar.mo15002m0();
            C11744g gVar2 = (C11744g) N4;
            oVar2.mo14918M(-3687241);
            Object N5 = oVar.mo14921N();
            if (N5 == aVar3.mo16277a()) {
                N5 = C8539f2.m30981g(1, (C8410b2) null, 2, (Object) null);
                oVar2.mo14893C(N5);
            }
            oVar.mo15002m0();
            EffectsKt.m29899k(new ConstraintLayoutKt$ConstraintLayout$3(gVar2, jVar2), oVar2, 0);
            EffectsKt.m29896h(gVar2, new ConstraintLayoutKt$ConstraintLayout$4(gVar2, (C8700z0) N5, animatable, z0Var, aVar2, z0Var2, z0Var3, (C11045c<? super ConstraintLayoutKt$ConstraintLayout$4>) null), oVar2, 8);
            C16602j m = m75205d(z0Var2);
            C16602j o = m75207f(z0Var3);
            float floatValue = ((Number) animatable.mo6613u()).floatValue();
            int i6 = (i5 << 12) & 458752;
            oVar2.mo14918M(-1330873847);
            MotionLayoutDebugFlags motionLayoutDebugFlags = MotionLayoutDebugFlags.NONE;
            EnumSet of = EnumSet.of(motionLayoutDebugFlags);
            Intrinsics.checkNotNullExpressionValue(of, "of(MotionLayoutDebugFlags.NONE)");
            int i7 = i6 & 7168;
            int i8 = i6 << 3;
            int i9 = (i8 & 234881024) | i7 | (i6 & 14) | 229376 | (i6 & 112) | (i6 & 896) | (i8 & 3670016) | (i8 & 29360128);
            oVar2.mo14918M(-1330870962);
            int i10 = (i9 & 14) | 32768 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (i9 & 458752) | (i9 & 3670016) | (i9 & 29360128) | (i9 & 234881024);
            oVar2.mo14918M(-1401224268);
            oVar2.mo14918M(-3687241);
            Object N6 = oVar.mo14921N();
            if (N6 == aVar3.mo16277a()) {
                N6 = new MotionMeasurer();
                oVar2.mo14893C(N6);
            }
            oVar.mo15002m0();
            MotionMeasurer motionMeasurer = (MotionMeasurer) N6;
            oVar2.mo14918M(-3687241);
            Object N7 = oVar.mo14921N();
            if (N7 == aVar3.mo16277a()) {
                N7 = new C16596g0(motionMeasurer);
                oVar2.mo14893C(N7);
            }
            oVar.mo15002m0();
            C16596g0 g0Var = (C16596g0) N7;
            oVar2.mo14918M(-3687241);
            Object N8 = oVar.mo14921N();
            if (N8 == aVar3.mo16277a()) {
                N8 = C8539f2.m30981g(Float.valueOf(0.0f), (C8410b2) null, 2, (Object) null);
                oVar2.mo14893C(N8);
            }
            oVar.mo15002m0();
            C8700z0 z0Var4 = (C8700z0) N8;
            z0Var4.setValue(Float.valueOf(floatValue));
            int i11 = i10 << 9;
            MotionMeasurer motionMeasurer2 = motionMeasurer;
            C16596g0 g0Var2 = g0Var;
            MotionLayoutDebugFlags motionLayoutDebugFlags2 = motionLayoutDebugFlags;
            C16602j jVar3 = m;
            int i12 = i10;
            C15560f0 A = MotionLayoutKt.m75342A(257, of, 0, jVar3, o, (C16615n0) null, z0Var4, motionMeasurer2, oVar, ((i10 >> 21) & 14) | 18350528 | (i11 & 7168) | (57344 & i11) | (i11 & 458752));
            MotionMeasurer motionMeasurer3 = motionMeasurer2;
            motionMeasurer3.mo48389d((C16592e0) null);
            float m2 = motionMeasurer3.mo48397m();
            if (!of.contains(motionLayoutDebugFlags2) || !Float.isNaN(m2)) {
                C16596g0 g0Var3 = g0Var2;
                oVar2.mo14918M(-1401223142);
                if (!Float.isNaN(m2)) {
                    mVar2 = C8756n.m32558a(mVar2, motionMeasurer3.mo48397m());
                }
                oVar2.mo14918M(-1990474327);
                C8767m.C8768a aVar4 = C8767m.f23478j;
                C15560f0 k = BoxKt.m9849k(C8734c.f23406a.mo17061C(), false, oVar2, 0);
                oVar2.mo14918M(1376089335);
                C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
                LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
                ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
                C11289a<ComposeUiNode> a = companion.mo44585a();
                C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(aVar4);
                EnumSet enumSet = of;
                if (!(oVar.mo15017r() instanceof C8428d)) {
                    ComposablesKt.m29519n();
                }
                oVar.mo14938T();
                if (oVar.mo14997l()) {
                    oVar2.mo14947W(a);
                } else {
                    oVar.mo14888A();
                }
                oVar.mo14941U();
                C8592o b = Updater.m30180b(oVar);
                Updater.m30188j(b, k, companion.mo44588d());
                Updater.m30188j(b, dVar, companion.mo44586b());
                Updater.m30188j(b, layoutDirection, companion.mo44587c());
                oVar.mo14972e();
                f.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
                oVar2.mo14918M(2058660585);
                oVar2.mo14918M(-1253629305);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
                LayoutKt.m68906d(SemanticsModifierKt.m71868c(mVar2, false, new MotionLayoutKt$MotionLayoutCore$3$1(motionMeasurer3), 1, (Object) null), C8553b.m31048b(oVar2, -819900388, true, new ConstraintLayoutKt$ConstraintLayout$$inlined$MotionLayout$1(g0Var3, i12, pVar2, i5)), A, oVar, 48, 0);
                if (!Float.isNaN(m2)) {
                    oVar2.mo14918M(-922833881);
                    motionMeasurer3.mo48394i(boxScopeInstance, m2, oVar2, 518);
                    oVar.mo15002m0();
                } else {
                    oVar2.mo14918M(-922833807);
                    oVar.mo15002m0();
                }
                if (!enumSet.contains(motionLayoutDebugFlags2)) {
                    oVar2.mo14918M(-922833740);
                    motionMeasurer3.mo48427J(boxScopeInstance, oVar2, 70);
                    oVar.mo15002m0();
                } else {
                    oVar2.mo14918M(-922833689);
                    oVar.mo15002m0();
                }
                C11079d2 d2Var = C11079d2.f28267a;
                oVar.mo15002m0();
                oVar.mo15002m0();
                oVar.mo14896D();
                oVar.mo15002m0();
                oVar.mo15002m0();
                oVar.mo15002m0();
            } else {
                oVar2.mo14918M(-1401222327);
                LayoutKt.m68906d(SemanticsModifierKt.m71868c(mVar2, false, new MotionLayoutKt$MotionLayoutCore$4(motionMeasurer3), 1, (Object) null), C8553b.m31048b(oVar2, -819896774, true, new ConstraintLayoutKt$ConstraintLayout$$inlined$MotionLayout$2(g0Var2, i12, pVar2, i5)), A, oVar, 48, 0);
                oVar.mo15002m0();
            }
            oVar.mo15002m0();
            oVar.mo15002m0();
            oVar.mo15002m0();
            oVar.mo15002m0();
            C8592o oVar3 = oVar2;
        } else {
            oVar2.mo14918M(-270260906);
            oVar2.mo14918M(-3687241);
            Object N9 = oVar.mo14921N();
            C8592o.C8593a aVar5 = C8592o.f23032a;
            if (N9 == aVar5.mo16277a()) {
                N9 = C8539f2.m30981g(0L, (C8410b2) null, 2, (Object) null);
                oVar2.mo14893C(N9);
            }
            oVar.mo15002m0();
            C8700z0 z0Var5 = (C8700z0) N9;
            oVar2.mo14918M(-3687241);
            Object N10 = oVar.mo14921N();
            if (N10 == aVar5.mo16277a()) {
                N10 = new Measurer();
                oVar2.mo14893C(N10);
            }
            oVar.mo15002m0();
            Measurer measurer = (Measurer) N10;
            C8767m mVar3 = mVar2;
            C8592o oVar4 = oVar2;
            C15560f0 D = m75198D(i4, z0Var5, jVar, measurer, oVar, ((i5 >> 6) & 14) | 4144 | ((i5 << 6) & 896));
            if (jVar2 instanceof C16629u) {
                ((C16629u) jVar2).mo48597t(z0Var5);
            }
            if (jVar2 instanceof C16592e0) {
                e0Var = (C16592e0) jVar2;
            } else {
                e0Var = null;
            }
            measurer.mo48389d(e0Var);
            float m3 = measurer.mo48397m();
            if (!Float.isNaN(m3)) {
                oVar4.mo14918M(-270260292);
                C8767m a2 = C8756n.m32558a(mVar3, measurer.mo48397m());
                oVar4.mo14918M(-1990474327);
                C8767m.C8768a aVar6 = C8767m.f23478j;
                C15560f0 k2 = BoxKt.m9849k(C8734c.f23406a.mo17061C(), false, oVar4, 0);
                oVar4.mo14918M(1376089335);
                C16479d dVar2 = (C16479d) oVar4.mo15032w(CompositionLocalsKt.m71011i());
                LayoutDirection layoutDirection2 = (LayoutDirection) oVar4.mo15032w(CompositionLocalsKt.m71018p());
                ComposeUiNode.Companion companion2 = ComposeUiNode.f38797m;
                C11289a<ComposeUiNode> a3 = companion2.mo44585a();
                C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(aVar6);
                if (!(oVar.mo15017r() instanceof C8428d)) {
                    ComposablesKt.m29519n();
                }
                oVar.mo14938T();
                if (oVar.mo14997l()) {
                    oVar4.mo14947W(a3);
                } else {
                    oVar.mo14888A();
                }
                oVar.mo14941U();
                C8592o b2 = Updater.m30180b(oVar);
                Updater.m30188j(b2, k2, companion2.mo44588d());
                Updater.m30188j(b2, dVar2, companion2.mo44586b());
                Updater.m30188j(b2, layoutDirection2, companion2.mo44587c());
                oVar.mo14972e();
                f2.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar4, 0);
                oVar4.mo14918M(2058660585);
                oVar4.mo14918M(-1253629305);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f6046a;
                LayoutKt.m68906d(SemanticsModifierKt.m71868c(a2, false, new ConstraintLayoutKt$ConstraintLayout$6$1(measurer), 1, (Object) null), C8553b.m31048b(oVar4, -819900598, true, new ConstraintLayoutKt$ConstraintLayout$6$2(measurer, pVar2, i2)), D, oVar, 48, 0);
                measurer.mo48394i(boxScopeInstance2, m3, oVar4, 518);
                C11079d2 d2Var2 = C11079d2.f28267a;
                oVar.mo15002m0();
                oVar.mo15002m0();
                oVar.mo14896D();
                oVar.mo15002m0();
                oVar.mo15002m0();
                oVar.mo15002m0();
            } else {
                oVar4.mo14918M(-270259702);
                LayoutKt.m68906d(SemanticsModifierKt.m71868c(mVar3, false, new ConstraintLayoutKt$ConstraintLayout$7(measurer), 1, (Object) null), C8553b.m31048b(oVar4, -819901122, true, new ConstraintLayoutKt$ConstraintLayout$8(measurer, pVar2, i2)), D, oVar, 48, 0);
                oVar.mo15002m0();
            }
            oVar.mo15002m0();
        }
        oVar.mo15002m0();
    }

    /* renamed from: c */
    public static final void m75204c(C8700z0<C16602j> z0Var, C16602j jVar) {
        z0Var.setValue(jVar);
    }

    /* renamed from: d */
    public static final C16602j m75205d(C8700z0<C16602j> z0Var) {
        return z0Var.getValue();
    }

    /* renamed from: e */
    public static final void m75206e(C8700z0<C16602j> z0Var, C16602j jVar) {
        z0Var.setValue(jVar);
    }

    /* renamed from: f */
    public static final C16602j m75207f(C8700z0<C16602j> z0Var) {
        return z0Var.getValue();
    }

    @C12579k
    /* renamed from: g */
    public static final C16602j m75208g(@C12579k C16602j jVar, @C12579k @C12553d("json5") String str) {
        Intrinsics.checkNotNullParameter(jVar, "extendConstraintSet");
        Intrinsics.checkNotNullParameter(str, "jsonContent");
        return new C16588c0(str, (String) null, jVar, 2, (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: h */
    public static final C16602j m75209h(@C12579k C16602j jVar, @C12579k C11300l<? super C16612m, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(jVar, "extendConstraintSet");
        Intrinsics.checkNotNullParameter(lVar, "description");
        return new C16628t(lVar, jVar);
    }

    @C12579k
    /* renamed from: i */
    public static final C16602j m75210i(@C12579k @C12553d("json5") String str) {
        Intrinsics.checkNotNullParameter(str, "jsonContent");
        return new C16588c0(str, (String) null, (C16602j) null, 6, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: androidx.constraintlayout.compose.c0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: androidx.constraintlayout.compose.c0} */
    /* JADX WARNING: type inference failed for: r9v6 */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002c, code lost:
        if (r9 == androidx.compose.runtime.C8592o.f23032a.mo16277a()) goto L_0x002e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @android.annotation.SuppressLint({"ComposableNaming"})
    @org.jetbrains.annotations.C12579k
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.constraintlayout.compose.C16602j m75211j(@org.jetbrains.annotations.C12579k @org.intellij.lang.annotations.C12553d("json5") java.lang.String r6, @org.jetbrains.annotations.C12580l @org.intellij.lang.annotations.C12553d("json5") java.lang.String r7, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r8, int r9, int r10) {
        /*
            java.lang.String r9 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r9)
            r9 = 1704604894(0x659a34de, float:9.102746E22)
            r8.mo14918M(r9)
            r9 = r10 & 2
            if (r9 == 0) goto L_0x0010
            r7 = 0
        L_0x0010:
            r2 = r7
            r7 = -3686552(0xffffffffffc7bf68, float:NaN)
            r8.mo14918M(r7)
            boolean r7 = r8.mo15006n0(r6)
            boolean r9 = r8.mo15006n0(r2)
            r7 = r7 | r9
            java.lang.Object r9 = r8.mo14921N()
            if (r7 != 0) goto L_0x002e
            androidx.compose.runtime.o$a r7 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r7 = r7.mo16277a()
            if (r9 != r7) goto L_0x003b
        L_0x002e:
            androidx.constraintlayout.compose.c0 r9 = new androidx.constraintlayout.compose.c0
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r9
            r1 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            r8.mo14893C(r9)
        L_0x003b:
            r8.mo15002m0()
            androidx.constraintlayout.compose.c0 r9 = (androidx.constraintlayout.compose.C16588c0) r9
            r8.mo15002m0()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.ConstraintLayoutKt.m75211j(java.lang.String, java.lang.String, androidx.compose.runtime.o, int, int):androidx.constraintlayout.compose.j");
    }

    @C12579k
    /* renamed from: k */
    public static final C16602j m75212k(@C12579k C11300l<? super C16612m, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "description");
        return new C16628t(lVar, (C16602j) null, 2, (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: s */
    public static final Dimension.C16577b m75220s(@C12579k Dimension.C16576a aVar, float f) {
        Intrinsics.checkNotNullParameter(aVar, "$this$atLeast");
        C16627s sVar = (C16627s) aVar;
        sVar.mo48585g(C16483g.m74451w(f));
        return sVar;
    }

    @C12579k
    /* renamed from: t */
    public static final Dimension m75221t(@C12579k Dimension.C16578c cVar, float f) {
        Intrinsics.checkNotNullParameter(cVar, "$this$atLeast");
        C16627s sVar = (C16627s) cVar;
        sVar.mo48585g(C16483g.m74451w(f));
        return sVar;
    }

    @C11395k(message = "Unintended method name, use atLeast(dp) instead", replaceWith = @C11587t0(expression = "this.atLeast(dp)", imports = {"androidx.constraintlayout.compose.atLeast"}))
    @C12579k
    /* renamed from: u */
    public static final Dimension m75222u(@C12579k Dimension.C16578c cVar, float f) {
        Intrinsics.checkNotNullParameter(cVar, "$this$atLeastWrapContent");
        C16627s sVar = (C16627s) cVar;
        sVar.mo48585g(C16483g.m74451w(f));
        return sVar;
    }

    @C12579k
    /* renamed from: v */
    public static final Dimension.C16578c m75223v(@C12579k Dimension.C16576a aVar, float f) {
        Intrinsics.checkNotNullParameter(aVar, "$this$atMost");
        C16627s sVar = (C16627s) aVar;
        sVar.mo48583e(C16483g.m74451w(f));
        return sVar;
    }

    @C12579k
    /* renamed from: w */
    public static final Dimension m75224w(@C12579k Dimension.C16577b bVar, float f) {
        Intrinsics.checkNotNullParameter(bVar, "$this$atMost");
        C16627s sVar = (C16627s) bVar;
        sVar.mo48583e(C16483g.m74451w(f));
        return sVar;
    }

    /* renamed from: x */
    public static final void m75225x(@C12579k C16611l0 l0Var, @C12579k List<? extends C15557e0> list) {
        Intrinsics.checkNotNullParameter(l0Var, "state");
        Intrinsics.checkNotNullParameter(list, "measurables");
        int size = list.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                C15557e0 e0Var = (C15557e0) list.get(i);
                Object a = C15594q.m69317a(e0Var);
                if (a == null && (a = ConstraintLayoutTagKt.m75268a(e0Var)) == null) {
                    a = m75226y();
                }
                l0Var.mo49319q(a, e0Var);
                Object b = ConstraintLayoutTagKt.m75269b(e0Var);
                if (b != null && (b instanceof String) && (a instanceof String)) {
                    l0Var.mo49324w((String) a, (String) b);
                }
                if (i2 <= size) {
                    i = i2;
                } else {
                    return;
                }
            }
        }
    }

    @C12579k
    /* renamed from: y */
    public static final Object m75226y() {
        return new C16569a();
    }

    @C12579k
    /* renamed from: z */
    public static final Dimension.C16577b m75227z(@C12579k Dimension.C16576a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        C16627s sVar = (C16627s) aVar;
        sVar.mo48586h(androidx.constraintlayout.core.state.Dimension.f42473j);
        return sVar;
    }
}

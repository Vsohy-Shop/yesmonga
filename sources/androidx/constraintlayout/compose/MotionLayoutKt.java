package androidx.constraintlayout.compose;

import android.annotation.SuppressLint;
import androidx.appcompat.graphics.drawable.C0508a;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.draw.C8756n;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.semantics.SemanticsModifierKt;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.C8553b;
import androidx.constraintlayout.core.parser.C16738f;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.state.C16769n;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.util.EnumSet;
import kotlin.C11079d2;
import kotlin.C11532s0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import org.intellij.lang.annotations.C12553d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class MotionLayoutKt {

    /* renamed from: a */
    public static final boolean f41189a = false;

    /* renamed from: androidx.constraintlayout.compose.MotionLayoutKt$a */
    public static final class C16580a implements C16615n0 {

        /* renamed from: a */
        public final /* synthetic */ C16738f f41190a;

        public C16580a(C16738f fVar) {
            this.f41190a = fVar;
        }

        @C12579k
        /* renamed from: a */
        public String mo48417a() {
            String G0 = this.f41190a.mo49144G0("from");
            return G0 == null ? "start" : G0;
        }

        /* renamed from: b */
        public void mo48418b(@C12579k C16769n nVar, int i) {
            Intrinsics.checkNotNullParameter(nVar, C0508a.f1295O0);
            try {
                C16610l.m75553w(this.f41190a, nVar);
            } catch (CLParsingException e) {
                System.err.println(Intrinsics.stringPlus("Error parsing JSON ", e));
            }
        }

        @C12579k
        /* renamed from: c */
        public String mo48419c() {
            String G0 = this.f41190a.mo49144G0("to");
            return G0 == null ? "end" : G0;
        }
    }

    @C8540g
    @C12579k
    @C11532s0
    /* renamed from: A */
    public static final C15560f0 m75342A(int i, @C12579k EnumSet<MotionLayoutDebugFlags> enumSet, long j, @C12579k C16602j jVar, @C12579k C16602j jVar2, @C12580l C16615n0 n0Var, @C12579k C8700z0<Float> z0Var, @C12579k MotionMeasurer motionMeasurer, @C12580l C8592o oVar, int i2) {
        C16602j jVar3 = jVar2;
        C16615n0 n0Var2 = n0Var;
        MotionMeasurer motionMeasurer2 = motionMeasurer;
        C8592o oVar2 = oVar;
        Intrinsics.checkNotNullParameter(enumSet, C10108c.f27780E);
        Intrinsics.checkNotNullParameter(jVar, "constraintSetStart");
        Intrinsics.checkNotNullParameter(jVar3, "constraintSetEnd");
        Intrinsics.checkNotNullParameter(z0Var, "progress");
        Intrinsics.checkNotNullParameter(motionMeasurer2, "measurer");
        oVar2.mo14918M(-1875584384);
        int i3 = 0;
        Object[] objArr = {Integer.valueOf(i), enumSet, Long.valueOf(j), jVar, jVar3, n0Var2};
        oVar2.mo14918M(-3685570);
        boolean z = false;
        while (i3 < 6) {
            Object obj = objArr[i3];
            i3++;
            z |= oVar2.mo15006n0(obj);
        }
        Object N = oVar.mo14921N();
        if (z || N == C8592o.f23032a.mo16277a()) {
            motionMeasurer2.mo48436S(jVar, jVar3, n0Var2, z0Var.getValue().floatValue());
            MotionLayoutKt$rememberMotionLayoutMeasurePolicy$1$1 motionLayoutKt$rememberMotionLayoutMeasurePolicy$1$1 = new MotionLayoutKt$rememberMotionLayoutMeasurePolicy$1$1(motionMeasurer, jVar, jVar2, n0Var, i, z0Var);
            oVar2.mo14893C(motionLayoutKt$rememberMotionLayoutMeasurePolicy$1$1);
            N = motionLayoutKt$rememberMotionLayoutMeasurePolicy$1$1;
        }
        oVar.mo15002m0();
        C15560f0 f0Var = (C15560f0) N;
        oVar.mo15002m0();
        return f0Var;
    }

    @C8540g
    @C16631v
    /* renamed from: a */
    public static final void m75343a(@C12579k C16602j jVar, @C12579k C16602j jVar2, @C12580l C16615n0 n0Var, float f, @C12580l EnumSet<MotionLayoutDebugFlags> enumSet, @C12580l C8767m mVar, int i, @C12579k C11305q<? super C16596g0, ? super C8592o, ? super Integer, C11079d2> qVar, @C12580l C8592o oVar, int i2, int i3) {
        C16615n0 n0Var2;
        EnumSet<MotionLayoutDebugFlags> enumSet2;
        C8767m mVar2;
        int i4;
        C11305q<? super C16596g0, ? super C8592o, ? super Integer, C11079d2> qVar2 = qVar;
        C8592o oVar2 = oVar;
        int i5 = i2;
        Intrinsics.checkNotNullParameter(jVar, "start");
        Intrinsics.checkNotNullParameter(jVar2, "end");
        Intrinsics.checkNotNullParameter(qVar2, "content");
        oVar2.mo14918M(-1330873847);
        if ((i3 & 4) != 0) {
            n0Var2 = null;
        } else {
            n0Var2 = n0Var;
        }
        if ((i3 & 16) != 0) {
            EnumSet<MotionLayoutDebugFlags> of = EnumSet.of(MotionLayoutDebugFlags.NONE);
            Intrinsics.checkNotNullExpressionValue(of, "of(MotionLayoutDebugFlags.NONE)");
            enumSet2 = of;
        } else {
            enumSet2 = enumSet;
        }
        if ((i3 & 32) != 0) {
            mVar2 = C8767m.f23478j;
        } else {
            mVar2 = mVar;
        }
        if ((i3 & 64) != 0) {
            i4 = 257;
        } else {
            i4 = i;
        }
        int i6 = i5 << 3;
        int i7 = (i6 & 234881024) | (i5 & 14) | 229376 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i6 & 3670016) | (i6 & 29360128);
        oVar2.mo14918M(-1330870962);
        int i8 = (i7 & 14) | 32768 | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (i7 & 458752) | (3670016 & i7) | (i7 & 29360128) | (i7 & 234881024);
        oVar2.mo14918M(-1401224268);
        oVar2.mo14918M(-3687241);
        Object N = oVar.mo14921N();
        C8592o.C8593a aVar = C8592o.f23032a;
        if (N == aVar.mo16277a()) {
            N = new MotionMeasurer();
            oVar2.mo14893C(N);
        }
        oVar.mo15002m0();
        MotionMeasurer motionMeasurer = (MotionMeasurer) N;
        oVar2.mo14918M(-3687241);
        Object N2 = oVar.mo14921N();
        if (N2 == aVar.mo16277a()) {
            N2 = new C16596g0(motionMeasurer);
            oVar2.mo14893C(N2);
        }
        oVar.mo15002m0();
        C16596g0 g0Var = (C16596g0) N2;
        oVar2.mo14918M(-3687241);
        Object N3 = oVar.mo14921N();
        if (N3 == aVar.mo16277a()) {
            N3 = C8539f2.m30981g(Float.valueOf(0.0f), (C8410b2) null, 2, (Object) null);
            oVar2.mo14893C(N3);
        }
        oVar.mo15002m0();
        C8700z0 z0Var = (C8700z0) N3;
        z0Var.setValue(Float.valueOf(f));
        int i9 = i8 << 9;
        C16596g0 g0Var2 = g0Var;
        int i10 = i8;
        C15560f0 A = m75342A(i4, enumSet2, 0, jVar, jVar2, n0Var2, z0Var, motionMeasurer, oVar, ((i8 >> 21) & 14) | 18350528 | (i9 & 7168) | (57344 & i9) | (i9 & 458752));
        MotionMeasurer motionMeasurer2 = motionMeasurer;
        motionMeasurer2.mo48389d((C16592e0) null);
        float m = motionMeasurer2.mo48397m();
        MotionLayoutDebugFlags motionLayoutDebugFlags = MotionLayoutDebugFlags.NONE;
        if (!enumSet2.contains(motionLayoutDebugFlags) || !Float.isNaN(m)) {
            C16596g0 g0Var3 = g0Var2;
            int i11 = i10;
            oVar2.mo14918M(-1401223142);
            if (!Float.isNaN(m)) {
                mVar2 = C8756n.m32558a(mVar2, motionMeasurer2.mo48397m());
            }
            oVar2.mo14918M(-1990474327);
            C8767m.C8768a aVar2 = C8767m.f23478j;
            C15560f0 k = BoxKt.m9849k(C8734c.f23406a.mo17061C(), false, oVar2, 0);
            oVar2.mo14918M(1376089335);
            C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(aVar2);
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
            f2.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
            oVar2.mo14918M(2058660585);
            oVar2.mo14918M(-1253629305);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
            LayoutKt.m68906d(SemanticsModifierKt.m71868c(mVar2, false, new MotionLayoutKt$MotionLayoutCore$3$1(motionMeasurer2), 1, (Object) null), C8553b.m31048b(oVar2, -819900388, true, new MotionLayoutKt$MotionLayoutCore$3$2(qVar2, g0Var3, i11)), A, oVar, 48, 0);
            if (!Float.isNaN(m)) {
                oVar2.mo14918M(-922833881);
                motionMeasurer2.mo48394i(boxScopeInstance, m, oVar2, 518);
                oVar.mo15002m0();
            } else {
                oVar2.mo14918M(-922833807);
                oVar.mo15002m0();
            }
            if (!enumSet2.contains(motionLayoutDebugFlags)) {
                oVar2.mo14918M(-922833740);
                motionMeasurer2.mo48427J(boxScopeInstance, oVar2, 70);
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
            LayoutKt.m68906d(SemanticsModifierKt.m71868c(mVar2, false, new MotionLayoutKt$MotionLayoutCore$4(motionMeasurer2), 1, (Object) null), C8553b.m31048b(oVar2, -819896774, true, new MotionLayoutKt$MotionLayoutCore$5(qVar2, g0Var2, i10)), A, oVar, 48, 0);
            oVar.mo15002m0();
        }
        oVar.mo15002m0();
        oVar.mo15002m0();
        oVar.mo15002m0();
    }

    @C8540g
    @C16631v
    /* renamed from: b */
    public static final void m75344b(@C12579k C16602j jVar, @C12579k C16602j jVar2, @C12580l C16615n0 n0Var, float f, @C12580l EnumSet<MotionLayoutDebugFlags> enumSet, @C12580l C16592e0 e0Var, @C12580l C8767m mVar, int i, @C12579k C11305q<? super C16596g0, ? super C8592o, ? super Integer, C11079d2> qVar, @C12580l C8592o oVar, int i2, int i3) {
        C16615n0 n0Var2;
        EnumSet<MotionLayoutDebugFlags> enumSet2;
        C16592e0 e0Var2;
        C8767m.C8768a aVar;
        int i4;
        C8767m mVar2;
        C8592o oVar2 = oVar;
        int i5 = i2;
        int i6 = i3;
        Intrinsics.checkNotNullParameter(jVar, "start");
        Intrinsics.checkNotNullParameter(jVar2, "end");
        Intrinsics.checkNotNullParameter(qVar, "content");
        oVar2.mo14918M(-1330870962);
        if ((i6 & 4) != 0) {
            n0Var2 = null;
        } else {
            n0Var2 = n0Var;
        }
        if ((i6 & 16) != 0) {
            EnumSet<MotionLayoutDebugFlags> of = EnumSet.of(MotionLayoutDebugFlags.NONE);
            Intrinsics.checkNotNullExpressionValue(of, "of(MotionLayoutDebugFlags.NONE)");
            enumSet2 = of;
        } else {
            enumSet2 = enumSet;
        }
        if ((i6 & 32) != 0) {
            e0Var2 = null;
        } else {
            e0Var2 = e0Var;
        }
        if ((i6 & 64) != 0) {
            aVar = C8767m.f23478j;
        } else {
            aVar = mVar;
        }
        if ((i6 & 128) != 0) {
            i4 = 257;
        } else {
            i4 = i;
        }
        int i7 = (i5 & 14) | 32768 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 458752) | (3670016 & i5) | (29360128 & i5) | (i5 & 234881024);
        oVar2.mo14918M(-1401224268);
        oVar2.mo14918M(-3687241);
        Object N = oVar.mo14921N();
        C8592o.C8593a aVar2 = C8592o.f23032a;
        if (N == aVar2.mo16277a()) {
            N = new MotionMeasurer();
            oVar2.mo14893C(N);
        }
        oVar.mo15002m0();
        MotionMeasurer motionMeasurer = (MotionMeasurer) N;
        oVar2.mo14918M(-3687241);
        Object N2 = oVar.mo14921N();
        if (N2 == aVar2.mo16277a()) {
            N2 = new C16596g0(motionMeasurer);
            oVar2.mo14893C(N2);
        }
        oVar.mo15002m0();
        C16596g0 g0Var = (C16596g0) N2;
        oVar2.mo14918M(-3687241);
        Object N3 = oVar.mo14921N();
        if (N3 == aVar2.mo16277a()) {
            N3 = C8539f2.m30981g(Float.valueOf(0.0f), (C8410b2) null, 2, (Object) null);
            oVar2.mo14893C(N3);
        }
        oVar.mo15002m0();
        C8700z0 z0Var = (C8700z0) N3;
        z0Var.setValue(Float.valueOf(f));
        int i8 = i7 << 9;
        C16596g0 g0Var2 = g0Var;
        int i9 = i7;
        C8767m mVar3 = aVar;
        C15560f0 A = m75342A(i4, enumSet2, 0, jVar, jVar2, n0Var2, z0Var, motionMeasurer, oVar, ((i7 >> 21) & 14) | 18350528 | (i8 & 7168) | (57344 & i8) | (i8 & 458752));
        MotionMeasurer motionMeasurer2 = motionMeasurer;
        motionMeasurer2.mo48389d(e0Var2);
        float m = motionMeasurer2.mo48397m();
        MotionLayoutDebugFlags motionLayoutDebugFlags = MotionLayoutDebugFlags.NONE;
        if (!enumSet2.contains(motionLayoutDebugFlags) || !Float.isNaN(m)) {
            C11305q<? super C16596g0, ? super C8592o, ? super Integer, C11079d2> qVar2 = qVar;
            C16596g0 g0Var3 = g0Var2;
            int i10 = i9;
            oVar2.mo14918M(-1401223142);
            if (!Float.isNaN(m)) {
                mVar2 = C8756n.m32558a(mVar3, motionMeasurer2.mo48397m());
            } else {
                mVar2 = mVar3;
            }
            oVar2.mo14918M(-1990474327);
            C8767m.C8768a aVar3 = C8767m.f23478j;
            C15560f0 k = BoxKt.m9849k(C8734c.f23406a.mo17061C(), false, oVar2, 0);
            oVar2.mo14918M(1376089335);
            C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(aVar3);
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
            f2.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
            oVar2.mo14918M(2058660585);
            oVar2.mo14918M(-1253629305);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
            LayoutKt.m68906d(SemanticsModifierKt.m71868c(mVar2, false, new MotionLayoutKt$MotionLayoutCore$3$1(motionMeasurer2), 1, (Object) null), C8553b.m31048b(oVar2, -819900388, true, new MotionLayoutKt$MotionLayoutCore$3$2(qVar2, g0Var3, i10)), A, oVar, 48, 0);
            if (!Float.isNaN(m)) {
                oVar2.mo14918M(-922833881);
                motionMeasurer2.mo48394i(boxScopeInstance, m, oVar2, 518);
                oVar.mo15002m0();
            } else {
                oVar2.mo14918M(-922833807);
                oVar.mo15002m0();
            }
            if (!enumSet2.contains(motionLayoutDebugFlags)) {
                oVar2.mo14918M(-922833740);
                motionMeasurer2.mo48427J(boxScopeInstance, oVar2, 70);
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
            LayoutKt.m68906d(SemanticsModifierKt.m71868c(mVar3, false, new MotionLayoutKt$MotionLayoutCore$4(motionMeasurer2), 1, (Object) null), C8553b.m31048b(oVar2, -819896774, true, new MotionLayoutKt$MotionLayoutCore$5(qVar, g0Var2, i9)), A, oVar, 48, 0);
            oVar.mo15002m0();
        }
        oVar.mo15002m0();
        oVar.mo15002m0();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01a0, code lost:
        if (r7 != false) goto L_0x01a7;
     */
    @androidx.compose.runtime.C8540g
    @androidx.constraintlayout.compose.C16631v
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m75345c(@org.jetbrains.annotations.C12579k androidx.constraintlayout.compose.C16601i0 r22, float r23, @org.jetbrains.annotations.C12580l java.util.EnumSet<androidx.constraintlayout.compose.MotionLayoutDebugFlags> r24, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r25, int r26, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super androidx.constraintlayout.compose.C16596g0, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r27, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r28, int r29, int r30) {
        /*
            r0 = r22
            r1 = r23
            r2 = r27
            r14 = r28
            r3 = r29
            java.lang.String r4 = "motionScene"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r4)
            java.lang.String r4 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            r4 = -1330872956(0xffffffffb0ac7d84, float:-1.2550321E-9)
            r14.mo14918M(r4)
            r4 = r30 & 4
            if (r4 == 0) goto L_0x002a
            androidx.constraintlayout.compose.MotionLayoutDebugFlags r4 = androidx.constraintlayout.compose.MotionLayoutDebugFlags.NONE
            java.util.EnumSet r4 = java.util.EnumSet.of(r4)
            java.lang.String r5 = "of(MotionLayoutDebugFlags.NONE)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            goto L_0x002c
        L_0x002a:
            r4 = r24
        L_0x002c:
            r5 = r30 & 8
            if (r5 == 0) goto L_0x0034
            androidx.compose.ui.m$a r5 = androidx.compose.p004ui.C8767m.f23478j
            r15 = r5
            goto L_0x0036
        L_0x0034:
            r15 = r25
        L_0x0036:
            r5 = r30 & 16
            if (r5 == 0) goto L_0x003d
            r5 = 257(0x101, float:3.6E-43)
            goto L_0x003f
        L_0x003d:
            r5 = r26
        L_0x003f:
            r6 = r3 & 14
            r6 = r6 | 512(0x200, float:7.175E-43)
            r7 = r3 & 112(0x70, float:1.57E-43)
            r6 = r6 | r7
            r7 = r3 & 7168(0x1c00, float:1.0045E-41)
            r6 = r6 | r7
            r7 = 57344(0xe000, float:8.0356E-41)
            r8 = r3 & r7
            r6 = r6 | r8
            r8 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r8
            r3 = r3 | r6
            r6 = -1401226512(0xffffffffac7afaf0, float:-3.5666435E-12)
            r14.mo14918M(r6)
            r6 = -3687241(0xffffffffffc7bcb7, float:NaN)
            r14.mo14918M(r6)
            java.lang.Object r9 = r28.mo14921N()
            androidx.compose.runtime.o$a r10 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r11 = r10.mo16277a()
            r12 = 2
            r13 = 0
            if (r9 != r11) goto L_0x007a
            r16 = 0
            java.lang.Long r9 = java.lang.Long.valueOf(r16)
            androidx.compose.runtime.z0 r9 = androidx.compose.runtime.C8539f2.m30981g(r9, r13, r12, r13)
            r14.mo14893C(r9)
        L_0x007a:
            r28.mo15002m0()
            androidx.compose.runtime.z0 r9 = (androidx.compose.runtime.C8700z0) r9
            r0.mo48534t(r9)
            androidx.constraintlayout.compose.MotionLayoutDebugFlags r11 = r22.mo48532d()
            androidx.constraintlayout.compose.MotionLayoutDebugFlags r8 = androidx.constraintlayout.compose.MotionLayoutDebugFlags.UNKNOWN
            if (r11 == r8) goto L_0x0097
            androidx.constraintlayout.compose.MotionLayoutDebugFlags r4 = r22.mo48532d()
            java.util.EnumSet r4 = java.util.EnumSet.of(r4)
            java.lang.String r8 = "of(motionScene.getForcedDrawDebug())"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r8)
        L_0x0097:
            r11 = r4
            java.lang.Object r4 = r9.getValue()
            r8 = -3686552(0xffffffffffc7bf68, float:NaN)
            r14.mo14918M(r8)
            boolean r16 = r14.mo15006n0(r0)
            boolean r4 = r14.mo15006n0(r4)
            r4 = r16 | r4
            java.lang.Object r7 = r28.mo14921N()
            if (r4 != 0) goto L_0x00b8
            java.lang.Object r4 = r10.mo16277a()
            if (r7 != r4) goto L_0x00c1
        L_0x00b8:
            java.lang.String r4 = "default"
            java.lang.String r7 = r0.mo48469l(r4)
            r14.mo14893C(r7)
        L_0x00c1:
            r28.mo15002m0()
            java.lang.String r7 = (java.lang.String) r7
            r4 = 0
            if (r7 != 0) goto L_0x00d4
            r7 = -488322840(0xffffffffe2e4c8e8, float:-2.1101672E21)
            r14.mo14918M(r7)
            r28.mo15002m0()
            r12 = r13
            goto L_0x00e2
        L_0x00d4:
            r12 = -1401225671(0xffffffffac7afe39, float:-3.5668259E-12)
            r14.mo14918M(r12)
            androidx.constraintlayout.compose.n0 r7 = m75359q(r7, r14, r4)
            r28.mo15002m0()
            r12 = r7
        L_0x00e2:
            if (r12 != 0) goto L_0x00e7
            java.lang.String r7 = "start"
            goto L_0x00eb
        L_0x00e7:
            java.lang.String r7 = r12.mo48417a()
        L_0x00eb:
            if (r12 != 0) goto L_0x00f0
            java.lang.String r16 = "end"
            goto L_0x00f4
        L_0x00f0:
            java.lang.String r16 = r12.mo48419c()
        L_0x00f4:
            r13 = r16
            java.lang.Object r6 = r9.getValue()
            r14.mo14918M(r8)
            boolean r16 = r14.mo15006n0(r0)
            boolean r6 = r14.mo15006n0(r6)
            r6 = r16 | r6
            java.lang.Object r8 = r28.mo14921N()
            if (r6 != 0) goto L_0x0113
            java.lang.Object r6 = r10.mo16277a()
            if (r8 != r6) goto L_0x0121
        L_0x0113:
            java.lang.String r6 = r0.mo48470m(r7)
            if (r6 != 0) goto L_0x011d
            java.lang.String r6 = r0.mo48474r(r4)
        L_0x011d:
            r8 = r6
            r14.mo14893C(r8)
        L_0x0121:
            r28.mo15002m0()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r6 = r9.getValue()
            r7 = -3686552(0xffffffffffc7bf68, float:NaN)
            r14.mo14918M(r7)
            boolean r7 = r14.mo15006n0(r0)
            boolean r6 = r14.mo15006n0(r6)
            r6 = r6 | r7
            java.lang.Object r7 = r28.mo14921N()
            r9 = 1
            if (r6 != 0) goto L_0x0146
            java.lang.Object r6 = r10.mo16277a()
            if (r7 != r6) goto L_0x0154
        L_0x0146:
            java.lang.String r6 = r0.mo48470m(r13)
            if (r6 != 0) goto L_0x0150
            java.lang.String r6 = r0.mo48474r(r9)
        L_0x0150:
            r7 = r6
            r14.mo14893C(r7)
        L_0x0154:
            r28.mo15002m0()
            java.lang.String r7 = (java.lang.String) r7
            if (r8 == 0) goto L_0x03e3
            if (r7 != 0) goto L_0x015f
            goto L_0x03e3
        L_0x015f:
            androidx.constraintlayout.compose.j r8 = androidx.constraintlayout.compose.ConstraintLayoutKt.m75210i(r8)
            androidx.constraintlayout.compose.j r13 = androidx.constraintlayout.compose.ConstraintLayoutKt.m75210i(r7)
            r6 = -3687241(0xffffffffffc7bcb7, float:NaN)
            r14.mo14918M(r6)
            java.lang.Object r6 = r28.mo14921N()
            java.lang.Object r7 = r10.mo16277a()
            r16 = 0
            if (r6 != r7) goto L_0x0186
            java.lang.Float r6 = java.lang.Float.valueOf(r16)
            r4 = 0
            r7 = 2
            androidx.compose.runtime.z0 r6 = androidx.compose.runtime.C8539f2.m30981g(r6, r4, r7, r4)
            r14.mo14893C(r6)
        L_0x0186:
            r28.mo15002m0()
            androidx.compose.runtime.z0 r6 = (androidx.compose.runtime.C8700z0) r6
            float r4 = r22.mo48468e()
            boolean r7 = java.lang.Float.isNaN(r4)
            if (r7 != 0) goto L_0x01a3
            float r7 = m75354l(r6)
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 != 0) goto L_0x019f
            r7 = r9
            goto L_0x01a0
        L_0x019f:
            r7 = 0
        L_0x01a0:
            if (r7 == 0) goto L_0x01a3
            goto L_0x01a7
        L_0x01a3:
            r22.mo48471n()
            r4 = r1
        L_0x01a7:
            m75355m(r6, r1)
            boolean r1 = r0 instanceof androidx.constraintlayout.compose.C16592e0
            if (r1 == 0) goto L_0x01b1
            androidx.constraintlayout.compose.e0 r0 = (androidx.constraintlayout.compose.C16592e0) r0
            goto L_0x01b2
        L_0x01b1:
            r0 = 0
        L_0x01b2:
            int r1 = r3 << 9
            r3 = 3670016(0x380000, float:5.142788E-39)
            r3 = r3 & r1
            r6 = 32768(0x8000, float:4.5918E-41)
            r3 = r3 | r6
            r6 = 29360128(0x1c00000, float:7.052966E-38)
            r6 = r6 & r1
            r3 = r3 | r6
            r6 = 234881024(0xe000000, float:1.5777218E-30)
            r1 = r1 & r6
            r1 = r1 | r3
            r3 = -1401224268(0xffffffffac7b03b4, float:-3.56713E-12)
            r14.mo14918M(r3)
            r3 = -3687241(0xffffffffffc7bcb7, float:NaN)
            r14.mo14918M(r3)
            java.lang.Object r6 = r28.mo14921N()
            java.lang.Object r7 = r10.mo16277a()
            if (r6 != r7) goto L_0x01e1
            androidx.constraintlayout.compose.MotionMeasurer r6 = new androidx.constraintlayout.compose.MotionMeasurer
            r6.<init>()
            r14.mo14893C(r6)
        L_0x01e1:
            r28.mo15002m0()
            r7 = r6
            androidx.constraintlayout.compose.MotionMeasurer r7 = (androidx.constraintlayout.compose.MotionMeasurer) r7
            r14.mo14918M(r3)
            java.lang.Object r6 = r28.mo14921N()
            java.lang.Object r9 = r10.mo16277a()
            if (r6 != r9) goto L_0x01fc
            androidx.constraintlayout.compose.g0 r6 = new androidx.constraintlayout.compose.g0
            r6.<init>(r7)
            r14.mo14893C(r6)
        L_0x01fc:
            r28.mo15002m0()
            r9 = r6
            androidx.constraintlayout.compose.g0 r9 = (androidx.constraintlayout.compose.C16596g0) r9
            r14.mo14918M(r3)
            java.lang.Object r3 = r28.mo14921N()
            java.lang.Object r6 = r10.mo16277a()
            if (r3 != r6) goto L_0x021d
            java.lang.Float r3 = java.lang.Float.valueOf(r16)
            r6 = 2
            r10 = 0
            androidx.compose.runtime.z0 r3 = androidx.compose.runtime.C8539f2.m30981g(r3, r10, r6, r10)
            r14.mo14893C(r3)
            goto L_0x021e
        L_0x021d:
            r10 = 0
        L_0x021e:
            r28.mo15002m0()
            r6 = r3
            androidx.compose.runtime.z0 r6 = (androidx.compose.runtime.C8700z0) r6
            java.lang.Float r3 = java.lang.Float.valueOf(r4)
            r6.setValue(r3)
            r18 = 0
            int r3 = r1 >> 21
            r3 = r3 & 14
            r4 = 18350528(0x11801c0, float:2.7919246E-38)
            r3 = r3 | r4
            int r4 = r1 << 9
            r10 = r4 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | r10
            r10 = 57344(0xe000, float:8.0356E-41)
            r10 = r10 & r4
            r3 = r3 | r10
            r10 = 458752(0x70000, float:6.42848E-40)
            r4 = r4 & r10
            r16 = r3 | r4
            r3 = r5
            r10 = 0
            r4 = r11
            r17 = r6
            r5 = r18
            r18 = r7
            r7 = r8
            r8 = r13
            r13 = r9
            r9 = r12
            r12 = r10
            r19 = 0
            r10 = r17
            r20 = r11
            r11 = r18
            r12 = r28
            r22 = r1
            r21 = r13
            r1 = r19
            r13 = r16
            androidx.compose.ui.layout.f0 r3 = m75342A(r3, r4, r5, r7, r8, r9, r10, r11, r12, r13)
            r6 = r18
            r6.mo48389d(r0)
            float r0 = r6.mo48397m()
            androidx.constraintlayout.compose.MotionLayoutDebugFlags r4 = androidx.constraintlayout.compose.MotionLayoutDebugFlags.NONE
            r5 = r20
            boolean r7 = r5.contains(r4)
            if (r7 == 0) goto L_0x02ba
            boolean r7 = java.lang.Float.isNaN(r0)
            if (r7 != 0) goto L_0x0282
            goto L_0x02ba
        L_0x0282:
            r0 = -1401222327(0xffffffffac7b0b49, float:-3.567551E-12)
            r14.mo14918M(r0)
            androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$4 r0 = new androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$4
            r0.<init>(r6)
            r7 = 1
            r8 = 0
            androidx.compose.ui.m r0 = androidx.compose.p004ui.semantics.SemanticsModifierKt.m71868c(r15, r8, r0, r7, r1)
            androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$5 r1 = new androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$5
            r9 = r22
            r10 = r21
            r1.<init>(r2, r10, r9)
            r2 = -819896774(0xffffffffcf215e3a, float:-2.70730701E9)
            androidx.compose.runtime.internal.a r1 = androidx.compose.runtime.internal.C8553b.m31048b(r14, r2, r7, r1)
            r2 = 48
            r4 = 0
            r22 = r0
            r23 = r1
            r24 = r3
            r25 = r28
            r26 = r2
            r27 = r4
            androidx.compose.p004ui.layout.LayoutKt.m68906d(r22, r23, r24, r25, r26, r27)
            r28.mo15002m0()
            goto L_0x03dc
        L_0x02ba:
            r9 = r22
            r10 = r21
            r7 = 1
            r8 = 0
            r11 = -1401223142(0xffffffffac7b081a, float:-3.5673743E-12)
            r14.mo14918M(r11)
            boolean r11 = java.lang.Float.isNaN(r0)
            if (r11 != 0) goto L_0x02d4
            float r11 = r6.mo48397m()
            androidx.compose.ui.m r15 = androidx.compose.p004ui.draw.C8756n.m32558a(r15, r11)
        L_0x02d4:
            r11 = -1990474327(0xffffffff895bc5a9, float:-2.6454105E-33)
            r14.mo14918M(r11)
            androidx.compose.ui.m$a r11 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.ui.c$a r12 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c r12 = r12.mo17061C()
            androidx.compose.ui.layout.f0 r12 = androidx.compose.foundation.layout.BoxKt.m9849k(r12, r8, r14, r8)
            r13 = 1376089335(0x520574f7, float:1.43298249E11)
            r14.mo14918M(r13)
            androidx.compose.runtime.i1 r13 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r13 = r14.mo15032w(r13)
            androidx.compose.ui.unit.d r13 = (androidx.compose.p004ui.unit.C16479d) r13
            androidx.compose.runtime.i1 r1 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r1 = r14.mo15032w(r1)
            androidx.compose.ui.unit.LayoutDirection r1 = (androidx.compose.p004ui.unit.LayoutDirection) r1
            androidx.compose.ui.node.ComposeUiNode$Companion r16 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r7 = r16.mo44585a()
            kotlin.jvm.functions.q r11 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r11)
            androidx.compose.runtime.d r8 = r28.mo15017r()
            boolean r8 = r8 instanceof androidx.compose.runtime.C8428d
            if (r8 != 0) goto L_0x0315
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0315:
            r28.mo14938T()
            boolean r8 = r28.mo14997l()
            if (r8 == 0) goto L_0x0322
            r14.mo14947W(r7)
            goto L_0x0325
        L_0x0322:
            r28.mo14888A()
        L_0x0325:
            r28.mo14941U()
            androidx.compose.runtime.o r7 = androidx.compose.runtime.Updater.m30180b(r28)
            kotlin.jvm.functions.p r8 = r16.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r7, r12, r8)
            kotlin.jvm.functions.p r8 = r16.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r7, r13, r8)
            kotlin.jvm.functions.p r8 = r16.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r7, r1, r8)
            r28.mo14972e()
            androidx.compose.runtime.o r1 = androidx.compose.runtime.C8684u1.m31906b(r28)
            androidx.compose.runtime.u1 r1 = androidx.compose.runtime.C8684u1.m31905a(r1)
            r7 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r11.invoke(r1, r14, r8)
            r1 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r14.mo14918M(r1)
            r1 = -1253629305(0xffffffffb5472287, float:-7.418352E-7)
            r14.mo14918M(r1)
            androidx.compose.foundation.layout.BoxScopeInstance r1 = androidx.compose.foundation.layout.BoxScopeInstance.f6046a
            androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$3$1 r7 = new androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$3$1
            r7.<init>(r6)
            r8 = 1
            r11 = 0
            r12 = 0
            androidx.compose.ui.m r7 = androidx.compose.p004ui.semantics.SemanticsModifierKt.m71868c(r15, r11, r7, r8, r12)
            androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$3$2 r11 = new androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$3$2
            r11.<init>(r2, r10, r9)
            r2 = -819900388(0xffffffffcf21501c, float:-2.70638182E9)
            androidx.compose.runtime.internal.a r2 = androidx.compose.runtime.internal.C8553b.m31048b(r14, r2, r8, r11)
            r8 = 48
            r9 = 0
            r22 = r7
            r23 = r2
            r24 = r3
            r25 = r28
            r26 = r8
            r27 = r9
            androidx.compose.p004ui.layout.LayoutKt.m68906d(r22, r23, r24, r25, r26, r27)
            boolean r2 = java.lang.Float.isNaN(r0)
            if (r2 != 0) goto L_0x03a1
            r2 = -922833881(0xffffffffc8feac27, float:-521569.22)
            r14.mo14918M(r2)
            r2 = 518(0x206, float:7.26E-43)
            r6.mo48394i(r1, r0, r14, r2)
            r28.mo15002m0()
            goto L_0x03aa
        L_0x03a1:
            r0 = -922833807(0xffffffffc8feac71, float:-521571.53)
            r14.mo14918M(r0)
            r28.mo15002m0()
        L_0x03aa:
            boolean r0 = r5.contains(r4)
            if (r0 != 0) goto L_0x03bf
            r0 = -922833740(0xffffffffc8feacb4, float:-521573.62)
            r14.mo14918M(r0)
            r0 = 70
            r6.mo48427J(r1, r14, r0)
            r28.mo15002m0()
            goto L_0x03c8
        L_0x03bf:
            r0 = -922833689(0xffffffffc8feace7, float:-521575.22)
            r14.mo14918M(r0)
            r28.mo15002m0()
        L_0x03c8:
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            r28.mo15002m0()
            r28.mo15002m0()
            r28.mo14896D()
            r28.mo15002m0()
            r28.mo15002m0()
            r28.mo15002m0()
        L_0x03dc:
            r28.mo15002m0()
            r28.mo15002m0()
            goto L_0x03e6
        L_0x03e3:
            r28.mo15002m0()
        L_0x03e6:
            r28.mo15002m0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.MotionLayoutKt.m75345c(androidx.constraintlayout.compose.i0, float, java.util.EnumSet, androidx.compose.ui.m, int, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v1, resolved type: androidx.compose.runtime.z0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: androidx.compose.runtime.z0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: androidx.compose.ui.m$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: androidx.compose.animation.core.z0} */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02f5, code lost:
        if ((((java.lang.Number) r4.getValue()).floatValue() == ((java.lang.Number) r26.mo6613u()).floatValue()) != false) goto L_0x0305;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.constraintlayout.compose.C16631v
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m75346d(@org.jetbrains.annotations.C12579k androidx.constraintlayout.compose.C16601i0 r32, @org.jetbrains.annotations.C12580l java.lang.String r33, @org.jetbrains.annotations.C12580l androidx.compose.animation.core.C1968g<java.lang.Float> r34, @org.jetbrains.annotations.C12580l java.util.EnumSet<androidx.constraintlayout.compose.MotionLayoutDebugFlags> r35, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r36, int r37, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r38, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super androidx.constraintlayout.compose.C16596g0, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r39, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r40, int r41, int r42) {
        /*
            r0 = r32
            r1 = r39
            r13 = r40
            java.lang.String r2 = "motionScene"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            java.lang.String r2 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r2 = -1330871806(0xffffffffb0ac8202, float:-1.2551598E-9)
            r13.mo14918M(r2)
            r2 = r42 & 2
            r14 = 0
            if (r2 == 0) goto L_0x001d
            r2 = r14
            goto L_0x001f
        L_0x001d:
            r2 = r33
        L_0x001f:
            r3 = r42 & 4
            r15 = 0
            if (r3 == 0) goto L_0x002b
            r3 = 7
            androidx.compose.animation.core.z0 r3 = androidx.compose.animation.core.C1972h.m8392q(r15, r15, r14, r3, r14)
            r7 = r3
            goto L_0x002d
        L_0x002b:
            r7 = r34
        L_0x002d:
            r3 = r42 & 8
            if (r3 == 0) goto L_0x003d
            androidx.constraintlayout.compose.MotionLayoutDebugFlags r3 = androidx.constraintlayout.compose.MotionLayoutDebugFlags.NONE
            java.util.EnumSet r3 = java.util.EnumSet.of(r3)
            java.lang.String r4 = "of(MotionLayoutDebugFlags.NONE)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            goto L_0x003f
        L_0x003d:
            r3 = r35
        L_0x003f:
            r4 = r42 & 16
            if (r4 == 0) goto L_0x0047
            androidx.compose.ui.m$a r4 = androidx.compose.p004ui.C8767m.f23478j
            r12 = r4
            goto L_0x0049
        L_0x0047:
            r12 = r36
        L_0x0049:
            r4 = r42 & 32
            if (r4 == 0) goto L_0x0052
            r4 = 257(0x101, float:3.6E-43)
            r16 = r4
            goto L_0x0054
        L_0x0052:
            r16 = r37
        L_0x0054:
            r4 = r42 & 64
            if (r4 == 0) goto L_0x005a
            r8 = r14
            goto L_0x005c
        L_0x005a:
            r8 = r38
        L_0x005c:
            r4 = r41 & 14
            r4 = r4 | 4608(0x1200, float:6.457E-42)
            r5 = r41 & 112(0x70, float:1.57E-43)
            r4 = r4 | r5
            r17 = 57344(0xe000, float:8.0356E-41)
            r5 = r41 & r17
            r4 = r4 | r5
            r18 = 458752(0x70000, float:6.42848E-40)
            r5 = r41 & r18
            r4 = r4 | r5
            r19 = 3670016(0x380000, float:5.142788E-39)
            r5 = r41 & r19
            r4 = r4 | r5
            r20 = 29360128(0x1c00000, float:7.052966E-38)
            r5 = r41 & r20
            r21 = r4 | r5
            r4 = -1401230387(0xffffffffac7aebcd, float:-3.5658033E-12)
            r13.mo14918M(r4)
            r11 = -3687241(0xffffffffffc7bcb7, float:NaN)
            r13.mo14918M(r11)
            java.lang.Object r4 = r40.mo14921N()
            androidx.compose.runtime.o$a r22 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r5 = r22.mo16277a()
            r10 = 2
            if (r4 != r5) goto L_0x009f
            r4 = 0
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            androidx.compose.runtime.z0 r4 = androidx.compose.runtime.C8539f2.m30981g(r4, r14, r10, r14)
            r13.mo14893C(r4)
        L_0x009f:
            r40.mo15002m0()
            androidx.compose.runtime.z0 r4 = (androidx.compose.runtime.C8700z0) r4
            r0.mo48534t(r4)
            androidx.constraintlayout.compose.MotionLayoutDebugFlags r5 = r32.mo48532d()
            androidx.constraintlayout.compose.MotionLayoutDebugFlags r6 = androidx.constraintlayout.compose.MotionLayoutDebugFlags.UNKNOWN
            if (r5 == r6) goto L_0x00bc
            androidx.constraintlayout.compose.MotionLayoutDebugFlags r3 = r32.mo48532d()
            java.util.EnumSet r3 = java.util.EnumSet.of(r3)
            java.lang.String r5 = "of(motionScene.getForcedDrawDebug())"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r5)
        L_0x00bc:
            r9 = r3
            java.lang.Object r3 = r4.getValue()
            r23 = r21 & 14
            r5 = -3686552(0xffffffffffc7bf68, float:NaN)
            r13.mo14918M(r5)
            boolean r6 = r13.mo15006n0(r0)
            boolean r3 = r13.mo15006n0(r3)
            r3 = r3 | r6
            java.lang.Object r6 = r40.mo14921N()
            if (r3 != 0) goto L_0x00de
            java.lang.Object r3 = r22.mo16277a()
            if (r6 != r3) goto L_0x00e7
        L_0x00de:
            java.lang.String r3 = "default"
            java.lang.String r6 = r0.mo48469l(r3)
            r13.mo14893C(r6)
        L_0x00e7:
            r40.mo15002m0()
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L_0x00fa
            r3 = -488438718(0xffffffffe2e30442, float:-2.0938589E21)
            r13.mo14918M(r3)
            r40.mo15002m0()
            r24 = r14
            goto L_0x0109
        L_0x00fa:
            r3 = -1401229409(0xffffffffac7aef9f, float:-3.5660153E-12)
            r13.mo14918M(r3)
            androidx.constraintlayout.compose.n0 r3 = m75359q(r6, r13, r15)
            r40.mo15002m0()
            r24 = r3
        L_0x0109:
            if (r24 != 0) goto L_0x010e
            java.lang.String r3 = "start"
            goto L_0x0112
        L_0x010e:
            java.lang.String r3 = r24.mo48417a()
        L_0x0112:
            if (r24 != 0) goto L_0x0117
            java.lang.String r6 = "end"
            goto L_0x011b
        L_0x0117:
            java.lang.String r6 = r24.mo48419c()
        L_0x011b:
            java.lang.Object r11 = r4.getValue()
            r13.mo14918M(r5)
            boolean r25 = r13.mo15006n0(r0)
            boolean r11 = r13.mo15006n0(r11)
            r11 = r25 | r11
            java.lang.Object r10 = r40.mo14921N()
            if (r11 != 0) goto L_0x0138
            java.lang.Object r11 = r22.mo16277a()
            if (r10 != r11) goto L_0x0146
        L_0x0138:
            java.lang.String r3 = r0.mo48470m(r3)
            if (r3 != 0) goto L_0x0142
            java.lang.String r3 = r0.mo48474r(r15)
        L_0x0142:
            r10 = r3
            r13.mo14893C(r10)
        L_0x0146:
            r40.mo15002m0()
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r3 = r4.getValue()
            r13.mo14918M(r5)
            boolean r4 = r13.mo15006n0(r0)
            boolean r3 = r13.mo15006n0(r3)
            r3 = r3 | r4
            java.lang.Object r4 = r40.mo14921N()
            r11 = 1
            if (r3 != 0) goto L_0x0168
            java.lang.Object r3 = r22.mo16277a()
            if (r4 != r3) goto L_0x0176
        L_0x0168:
            java.lang.String r3 = r0.mo48470m(r6)
            if (r3 != 0) goto L_0x0172
            java.lang.String r3 = r0.mo48474r(r11)
        L_0x0172:
            r4 = r3
            r13.mo14893C(r4)
        L_0x0176:
            r40.mo15002m0()
            java.lang.String r4 = (java.lang.String) r4
            r13.mo14918M(r5)
            boolean r3 = r13.mo15006n0(r0)
            boolean r5 = r13.mo15006n0(r2)
            r3 = r3 | r5
            java.lang.Object r5 = r40.mo14921N()
            if (r3 != 0) goto L_0x0193
            java.lang.Object r3 = r22.mo16277a()
            if (r5 != r3) goto L_0x019f
        L_0x0193:
            if (r2 != 0) goto L_0x0197
            r5 = r14
            goto L_0x019c
        L_0x0197:
            java.lang.String r2 = r0.mo48470m(r2)
            r5 = r2
        L_0x019c:
            r13.mo14893C(r5)
        L_0x019f:
            r40.mo15002m0()
            java.lang.String r5 = (java.lang.String) r5
            if (r10 == 0) goto L_0x055a
            if (r4 != 0) goto L_0x01aa
            goto L_0x055a
        L_0x01aa:
            r2 = -3686930(0xffffffffffc7bdee, float:NaN)
            r13.mo14918M(r2)
            boolean r3 = r13.mo15006n0(r0)
            java.lang.Object r6 = r40.mo14921N()
            if (r3 != 0) goto L_0x01c0
            java.lang.Object r3 = r22.mo16277a()
            if (r6 != r3) goto L_0x01cd
        L_0x01c0:
            androidx.constraintlayout.compose.j r3 = androidx.constraintlayout.compose.ConstraintLayoutKt.m75210i(r10)
            r6 = 2
            androidx.compose.runtime.z0 r3 = androidx.compose.runtime.C8539f2.m30981g(r3, r14, r6, r14)
            r13.mo14893C(r3)
            r6 = r3
        L_0x01cd:
            r40.mo15002m0()
            r3 = r6
            androidx.compose.runtime.z0 r3 = (androidx.compose.runtime.C8700z0) r3
            r13.mo14918M(r2)
            boolean r6 = r13.mo15006n0(r0)
            java.lang.Object r10 = r40.mo14921N()
            if (r6 != 0) goto L_0x01e6
            java.lang.Object r6 = r22.mo16277a()
            if (r10 != r6) goto L_0x01f2
        L_0x01e6:
            androidx.constraintlayout.compose.j r4 = androidx.constraintlayout.compose.ConstraintLayoutKt.m75210i(r4)
            r6 = 2
            androidx.compose.runtime.z0 r10 = androidx.compose.runtime.C8539f2.m30981g(r4, r14, r6, r14)
            r13.mo14893C(r10)
        L_0x01f2:
            r40.mo15002m0()
            r25 = r10
            androidx.compose.runtime.z0 r25 = (androidx.compose.runtime.C8700z0) r25
            if (r5 != 0) goto L_0x01fd
            r4 = r14
            goto L_0x0201
        L_0x01fd:
            androidx.constraintlayout.compose.j r4 = androidx.constraintlayout.compose.ConstraintLayoutKt.m75210i(r5)
        L_0x0201:
            r5 = -3687241(0xffffffffffc7bcb7, float:NaN)
            r13.mo14918M(r5)
            java.lang.Object r5 = r40.mo14921N()
            java.lang.Object r6 = r22.mo16277a()
            r10 = 0
            if (r5 != r6) goto L_0x021a
            r6 = 2
            androidx.compose.animation.core.Animatable r5 = androidx.compose.animation.core.C1946b.m8288b(r10, r10, r6, r14)
            r13.mo14893C(r5)
        L_0x021a:
            r40.mo15002m0()
            r26 = r5
            androidx.compose.animation.core.Animatable r26 = (androidx.compose.animation.core.Animatable) r26
            r13.mo14918M(r2)
            boolean r2 = r13.mo15006n0(r0)
            java.lang.Object r5 = r40.mo14921N()
            if (r2 != 0) goto L_0x0237
            java.lang.Object r2 = r22.mo16277a()
            if (r5 != r2) goto L_0x0235
            goto L_0x0237
        L_0x0235:
            r6 = 2
            goto L_0x0241
        L_0x0237:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r6 = 2
            androidx.compose.runtime.z0 r5 = androidx.compose.runtime.C8539f2.m30981g(r2, r14, r6, r14)
            r13.mo14893C(r5)
        L_0x0241:
            r40.mo15002m0()
            r2 = r5
            androidx.compose.runtime.z0 r2 = (androidx.compose.runtime.C8700z0) r2
            r5 = -3687241(0xffffffffffc7bcb7, float:NaN)
            r13.mo14918M(r5)
            java.lang.Object r5 = r40.mo14921N()
            java.lang.Object r6 = r22.mo16277a()
            if (r5 != r6) goto L_0x0260
            r5 = -1
            r6 = 6
            kotlinx.coroutines.channels.g r5 = kotlinx.coroutines.channels.C11748i.m46625d(r5, r14, r14, r6, r14)
            r13.mo14893C(r5)
        L_0x0260:
            r40.mo15002m0()
            r6 = r5
            kotlinx.coroutines.channels.g r6 = (kotlinx.coroutines.channels.C11744g) r6
            if (r4 == 0) goto L_0x029e
            r5 = -1401228155(0xffffffffac7af485, float:-3.5662872E-12)
            r13.mo14918M(r5)
            androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$1 r5 = new androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$1
            r5.<init>(r6, r4)
            androidx.compose.runtime.EffectsKt.m29899k(r5, r13, r15)
            androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$2 r5 = new androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$2
            r27 = 0
            r4 = r5
            r15 = r5
            r28 = -3687241(0xffffffffffc7bcb7, float:NaN)
            r5 = r6
            r14 = r6
            r29 = 2
            r6 = r26
            r38 = r9
            r9 = r2
            r2 = r10
            r10 = r3
            r2 = r28
            r11 = r25
            r30 = r12
            r12 = r27
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r4 = r23 | 64
            androidx.compose.runtime.EffectsKt.m29895g(r0, r14, r15, r13, r4)
            r40.mo15002m0()
            goto L_0x02ae
        L_0x029e:
            r38 = r9
            r30 = r12
            r2 = -3687241(0xffffffffffc7bcb7, float:NaN)
            r4 = -1401227298(0xffffffffac7af7de, float:-3.566473E-12)
            r13.mo14918M(r4)
            r40.mo15002m0()
        L_0x02ae:
            r13.mo14918M(r2)
            java.lang.Object r4 = r40.mo14921N()
            java.lang.Object r5 = r22.mo16277a()
            if (r4 != r5) goto L_0x02ca
            r5 = 0
            java.lang.Float r4 = java.lang.Float.valueOf(r5)
            r5 = 0
            r6 = 2
            androidx.compose.runtime.z0 r4 = androidx.compose.runtime.C8539f2.m30981g(r4, r5, r6, r5)
            r13.mo14893C(r4)
            goto L_0x02cb
        L_0x02ca:
            r6 = 2
        L_0x02cb:
            r40.mo15002m0()
            androidx.compose.runtime.z0 r4 = (androidx.compose.runtime.C8700z0) r4
            float r5 = r32.mo48468e()
            boolean r7 = java.lang.Float.isNaN(r5)
            if (r7 != 0) goto L_0x02f8
            java.lang.Object r7 = r4.getValue()
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            java.lang.Object r8 = r26.mo6613u()
            java.lang.Number r8 = (java.lang.Number) r8
            float r8 = r8.floatValue()
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x02f4
            r11 = 1
            goto L_0x02f5
        L_0x02f4:
            r11 = 0
        L_0x02f5:
            if (r11 == 0) goto L_0x02f8
            goto L_0x0305
        L_0x02f8:
            r32.mo48471n()
            java.lang.Object r5 = r26.mo6613u()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
        L_0x0305:
            java.lang.Object r7 = r26.mo6613u()
            r4.setValue(r7)
            androidx.constraintlayout.compose.j r7 = m75356n(r3)
            androidx.constraintlayout.compose.j r8 = m75350h(r25)
            boolean r3 = r0 instanceof androidx.constraintlayout.compose.C16590d0
            if (r3 == 0) goto L_0x031b
            androidx.constraintlayout.compose.d0 r0 = (androidx.constraintlayout.compose.C16590d0) r0
            goto L_0x031c
        L_0x031b:
            r0 = 0
        L_0x031c:
            int r3 = r21 << 6
            r4 = r3 & r19
            r9 = 32768(0x8000, float:4.5918E-41)
            r4 = r4 | r9
            r3 = r3 & r20
            r3 = r3 | r4
            int r4 = r21 << 3
            r10 = 234881024(0xe000000, float:1.5777218E-30)
            r4 = r4 & r10
            r3 = r3 | r4
            r4 = -1330870962(0xffffffffb0ac854e, float:-1.2552535E-9)
            r13.mo14918M(r4)
            r4 = r3 & 14
            r4 = r4 | r9
            r9 = r3 & 112(0x70, float:1.57E-43)
            r4 = r4 | r9
            r9 = r3 & 896(0x380, float:1.256E-42)
            r4 = r4 | r9
            r9 = r3 & 7168(0x1c00, float:1.0045E-41)
            r4 = r4 | r9
            r9 = r3 & r18
            r4 = r4 | r9
            r9 = r3 & r19
            r4 = r4 | r9
            r9 = r3 & r20
            r4 = r4 | r9
            r3 = r3 & r10
            r14 = r4 | r3
            r3 = -1401224268(0xffffffffac7b03b4, float:-3.56713E-12)
            r13.mo14918M(r3)
            r13.mo14918M(r2)
            java.lang.Object r3 = r40.mo14921N()
            java.lang.Object r4 = r22.mo16277a()
            if (r3 != r4) goto L_0x0366
            androidx.constraintlayout.compose.MotionMeasurer r3 = new androidx.constraintlayout.compose.MotionMeasurer
            r3.<init>()
            r13.mo14893C(r3)
        L_0x0366:
            r40.mo15002m0()
            r15 = r3
            androidx.constraintlayout.compose.MotionMeasurer r15 = (androidx.constraintlayout.compose.MotionMeasurer) r15
            r13.mo14918M(r2)
            java.lang.Object r3 = r40.mo14921N()
            java.lang.Object r4 = r22.mo16277a()
            if (r3 != r4) goto L_0x0381
            androidx.constraintlayout.compose.g0 r3 = new androidx.constraintlayout.compose.g0
            r3.<init>(r15)
            r13.mo14893C(r3)
        L_0x0381:
            r40.mo15002m0()
            r12 = r3
            androidx.constraintlayout.compose.g0 r12 = (androidx.constraintlayout.compose.C16596g0) r12
            r13.mo14918M(r2)
            java.lang.Object r2 = r40.mo14921N()
            java.lang.Object r3 = r22.mo16277a()
            if (r2 != r3) goto L_0x03a1
            r3 = 0
            java.lang.Float r2 = java.lang.Float.valueOf(r3)
            r3 = 0
            androidx.compose.runtime.z0 r2 = androidx.compose.runtime.C8539f2.m30981g(r2, r3, r6, r3)
            r13.mo14893C(r2)
        L_0x03a1:
            r40.mo15002m0()
            r9 = r2
            androidx.compose.runtime.z0 r9 = (androidx.compose.runtime.C8700z0) r9
            java.lang.Float r2 = java.lang.Float.valueOf(r5)
            r9.setValue(r2)
            r4 = 0
            int r2 = r14 >> 21
            r2 = r2 & 14
            r3 = 18350528(0x11801c0, float:2.7919246E-38)
            r2 = r2 | r3
            int r3 = r14 << 9
            r6 = r3 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r6
            r6 = r3 & r17
            r2 = r2 | r6
            r3 = r3 & r18
            r17 = r2 | r3
            r2 = r16
            r3 = r38
            r6 = r7
            r7 = r8
            r8 = r24
            r10 = r15
            r11 = r40
            r31 = r12
            r12 = r17
            androidx.compose.ui.layout.f0 r2 = m75342A(r2, r3, r4, r6, r7, r8, r9, r10, r11, r12)
            r15.mo48389d(r0)
            float r0 = r15.mo48397m()
            androidx.constraintlayout.compose.MotionLayoutDebugFlags r3 = androidx.constraintlayout.compose.MotionLayoutDebugFlags.NONE
            r4 = r38
            boolean r5 = r4.contains(r3)
            if (r5 == 0) goto L_0x0428
            boolean r5 = java.lang.Float.isNaN(r0)
            if (r5 != 0) goto L_0x03ef
            goto L_0x0428
        L_0x03ef:
            r0 = -1401222327(0xffffffffac7b0b49, float:-3.567551E-12)
            r13.mo14918M(r0)
            androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$4 r0 = new androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$4
            r0.<init>(r15)
            r5 = r30
            r3 = 0
            r4 = 0
            r6 = 1
            androidx.compose.ui.m r0 = androidx.compose.p004ui.semantics.SemanticsModifierKt.m71868c(r5, r3, r0, r6, r4)
            androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$5 r3 = new androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$5
            r7 = r31
            r3.<init>(r1, r7, r14)
            r1 = -819896774(0xffffffffcf215e3a, float:-2.70730701E9)
            androidx.compose.runtime.internal.a r1 = androidx.compose.runtime.internal.C8553b.m31048b(r13, r1, r6, r3)
            r3 = 48
            r4 = 0
            r32 = r0
            r33 = r1
            r34 = r2
            r35 = r40
            r36 = r3
            r37 = r4
            androidx.compose.p004ui.layout.LayoutKt.m68906d(r32, r33, r34, r35, r36, r37)
            r40.mo15002m0()
            goto L_0x0550
        L_0x0428:
            r5 = r30
            r7 = r31
            r6 = 1
            r8 = -1401223142(0xffffffffac7b081a, float:-3.5673743E-12)
            r13.mo14918M(r8)
            boolean r8 = java.lang.Float.isNaN(r0)
            if (r8 != 0) goto L_0x0442
            float r8 = r15.mo48397m()
            androidx.compose.ui.m r12 = androidx.compose.p004ui.draw.C8756n.m32558a(r5, r8)
            goto L_0x0443
        L_0x0442:
            r12 = r5
        L_0x0443:
            r5 = -1990474327(0xffffffff895bc5a9, float:-2.6454105E-33)
            r13.mo14918M(r5)
            androidx.compose.ui.m$a r5 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.ui.c$a r8 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c r8 = r8.mo17061C()
            r9 = 0
            androidx.compose.ui.layout.f0 r8 = androidx.compose.foundation.layout.BoxKt.m9849k(r8, r9, r13, r9)
            r9 = 1376089335(0x520574f7, float:1.43298249E11)
            r13.mo14918M(r9)
            androidx.compose.runtime.i1 r9 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r9 = r13.mo15032w(r9)
            androidx.compose.ui.unit.d r9 = (androidx.compose.p004ui.unit.C16479d) r9
            androidx.compose.runtime.i1 r10 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r10 = r13.mo15032w(r10)
            androidx.compose.ui.unit.LayoutDirection r10 = (androidx.compose.p004ui.unit.LayoutDirection) r10
            androidx.compose.ui.node.ComposeUiNode$Companion r11 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r6 = r11.mo44585a()
            kotlin.jvm.functions.q r5 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r5)
            r38 = r3
            androidx.compose.runtime.d r3 = r40.mo15017r()
            boolean r3 = r3 instanceof androidx.compose.runtime.C8428d
            if (r3 != 0) goto L_0x0487
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0487:
            r40.mo14938T()
            boolean r3 = r40.mo14997l()
            if (r3 == 0) goto L_0x0494
            r13.mo14947W(r6)
            goto L_0x0497
        L_0x0494:
            r40.mo14888A()
        L_0x0497:
            r40.mo14941U()
            androidx.compose.runtime.o r3 = androidx.compose.runtime.Updater.m30180b(r40)
            kotlin.jvm.functions.p r6 = r11.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r3, r8, r6)
            kotlin.jvm.functions.p r6 = r11.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r3, r9, r6)
            kotlin.jvm.functions.p r6 = r11.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r3, r10, r6)
            r40.mo14972e()
            androidx.compose.runtime.o r3 = androidx.compose.runtime.C8684u1.m31906b(r40)
            androidx.compose.runtime.u1 r3 = androidx.compose.runtime.C8684u1.m31905a(r3)
            r6 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            r5.invoke(r3, r13, r8)
            r3 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r13.mo14918M(r3)
            r3 = -1253629305(0xffffffffb5472287, float:-7.418352E-7)
            r13.mo14918M(r3)
            androidx.compose.foundation.layout.BoxScopeInstance r3 = androidx.compose.foundation.layout.BoxScopeInstance.f6046a
            androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$3$1 r5 = new androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$3$1
            r5.<init>(r15)
            r6 = 1
            r8 = 0
            r9 = 0
            androidx.compose.ui.m r5 = androidx.compose.p004ui.semantics.SemanticsModifierKt.m71868c(r12, r8, r5, r6, r9)
            androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$3$2 r8 = new androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$3$2
            r8.<init>(r1, r7, r14)
            r1 = -819900388(0xffffffffcf21501c, float:-2.70638182E9)
            androidx.compose.runtime.internal.a r1 = androidx.compose.runtime.internal.C8553b.m31048b(r13, r1, r6, r8)
            r6 = 48
            r7 = 0
            r32 = r5
            r33 = r1
            r34 = r2
            r35 = r40
            r36 = r6
            r37 = r7
            androidx.compose.p004ui.layout.LayoutKt.m68906d(r32, r33, r34, r35, r36, r37)
            boolean r1 = java.lang.Float.isNaN(r0)
            if (r1 != 0) goto L_0x0513
            r1 = -922833881(0xffffffffc8feac27, float:-521569.22)
            r13.mo14918M(r1)
            r1 = 518(0x206, float:7.26E-43)
            r15.mo48394i(r3, r0, r13, r1)
            r40.mo15002m0()
            goto L_0x051c
        L_0x0513:
            r0 = -922833807(0xffffffffc8feac71, float:-521571.53)
            r13.mo14918M(r0)
            r40.mo15002m0()
        L_0x051c:
            r0 = r38
            boolean r0 = r4.contains(r0)
            if (r0 != 0) goto L_0x0533
            r0 = -922833740(0xffffffffc8feacb4, float:-521573.62)
            r13.mo14918M(r0)
            r0 = 70
            r15.mo48427J(r3, r13, r0)
            r40.mo15002m0()
            goto L_0x053c
        L_0x0533:
            r0 = -922833689(0xffffffffc8feace7, float:-521575.22)
            r13.mo14918M(r0)
            r40.mo15002m0()
        L_0x053c:
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            r40.mo15002m0()
            r40.mo15002m0()
            r40.mo14896D()
            r40.mo15002m0()
            r40.mo15002m0()
            r40.mo15002m0()
        L_0x0550:
            r40.mo15002m0()
            r40.mo15002m0()
            r40.mo15002m0()
            goto L_0x055d
        L_0x055a:
            r40.mo15002m0()
        L_0x055d:
            r40.mo15002m0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.MotionLayoutKt.m75346d(androidx.constraintlayout.compose.i0, java.lang.String, androidx.compose.animation.core.g, java.util.EnumSet, androidx.compose.ui.m, int, kotlin.jvm.functions.a, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C11532s0
    /* renamed from: e */
    public static final void m75347e(@C12579k C16602j jVar, @C12579k C16602j jVar2, @C12580l C16615n0 n0Var, float f, @C12580l EnumSet<MotionLayoutDebugFlags> enumSet, @C12580l C16592e0 e0Var, @C12580l C8767m mVar, int i, @C12579k C11305q<? super C16596g0, ? super C8592o, ? super Integer, C11079d2> qVar, @C12580l C8592o oVar, int i2, int i3) {
        C16615n0 n0Var2;
        EnumSet<MotionLayoutDebugFlags> enumSet2;
        C16592e0 e0Var2;
        C8767m.C8768a aVar;
        int i4;
        C8767m mVar2;
        C8592o oVar2 = oVar;
        int i5 = i2;
        int i6 = i3;
        Intrinsics.checkNotNullParameter(jVar, "start");
        Intrinsics.checkNotNullParameter(jVar2, "end");
        Intrinsics.checkNotNullParameter(qVar, "content");
        oVar2.mo14918M(-1401224268);
        if ((i6 & 4) != 0) {
            n0Var2 = null;
        } else {
            n0Var2 = n0Var;
        }
        if ((i6 & 16) != 0) {
            EnumSet<MotionLayoutDebugFlags> of = EnumSet.of(MotionLayoutDebugFlags.NONE);
            Intrinsics.checkNotNullExpressionValue(of, "of(MotionLayoutDebugFlags.NONE)");
            enumSet2 = of;
        } else {
            enumSet2 = enumSet;
        }
        if ((i6 & 32) != 0) {
            e0Var2 = null;
        } else {
            e0Var2 = e0Var;
        }
        if ((i6 & 64) != 0) {
            aVar = C8767m.f23478j;
        } else {
            aVar = mVar;
        }
        if ((i6 & 128) != 0) {
            i4 = 257;
        } else {
            i4 = i;
        }
        oVar2.mo14918M(-3687241);
        Object N = oVar.mo14921N();
        C8592o.C8593a aVar2 = C8592o.f23032a;
        if (N == aVar2.mo16277a()) {
            N = new MotionMeasurer();
            oVar2.mo14893C(N);
        }
        oVar.mo15002m0();
        MotionMeasurer motionMeasurer = (MotionMeasurer) N;
        oVar2.mo14918M(-3687241);
        Object N2 = oVar.mo14921N();
        if (N2 == aVar2.mo16277a()) {
            N2 = new C16596g0(motionMeasurer);
            oVar2.mo14893C(N2);
        }
        oVar.mo15002m0();
        C16596g0 g0Var = (C16596g0) N2;
        oVar2.mo14918M(-3687241);
        Object N3 = oVar.mo14921N();
        if (N3 == aVar2.mo16277a()) {
            N3 = C8539f2.m30981g(Float.valueOf(0.0f), (C8410b2) null, 2, (Object) null);
            oVar2.mo14893C(N3);
        }
        oVar.mo15002m0();
        C8700z0 z0Var = (C8700z0) N3;
        z0Var.setValue(Float.valueOf(f));
        int i7 = i5 << 9;
        C16596g0 g0Var2 = g0Var;
        C8767m mVar3 = aVar;
        C15560f0 A = m75342A(i4, enumSet2, 0, jVar, jVar2, n0Var2, z0Var, motionMeasurer, oVar, ((i5 >> 21) & 14) | 18350528 | (i7 & 7168) | (57344 & i7) | (i7 & 458752));
        MotionMeasurer motionMeasurer2 = motionMeasurer;
        motionMeasurer2.mo48389d(e0Var2);
        float m = motionMeasurer2.mo48397m();
        MotionLayoutDebugFlags motionLayoutDebugFlags = MotionLayoutDebugFlags.NONE;
        if (!enumSet2.contains(motionLayoutDebugFlags) || !Float.isNaN(m)) {
            C11305q<? super C16596g0, ? super C8592o, ? super Integer, C11079d2> qVar2 = qVar;
            C16596g0 g0Var3 = g0Var2;
            C8767m mVar4 = mVar3;
            oVar2.mo14918M(-1401223142);
            if (!Float.isNaN(m)) {
                mVar2 = C8756n.m32558a(mVar4, motionMeasurer2.mo48397m());
            } else {
                mVar2 = mVar4;
            }
            oVar2.mo14918M(-1990474327);
            C8767m.C8768a aVar3 = C8767m.f23478j;
            C15560f0 k = BoxKt.m9849k(C8734c.f23406a.mo17061C(), false, oVar2, 0);
            oVar2.mo14918M(1376089335);
            C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(aVar3);
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
            f2.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
            oVar2.mo14918M(2058660585);
            oVar2.mo14918M(-1253629305);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
            LayoutKt.m68906d(SemanticsModifierKt.m71868c(mVar2, false, new MotionLayoutKt$MotionLayoutCore$3$1(motionMeasurer2), 1, (Object) null), C8553b.m31048b(oVar2, -819900388, true, new MotionLayoutKt$MotionLayoutCore$3$2(qVar2, g0Var3, i5)), A, oVar, 48, 0);
            if (!Float.isNaN(m)) {
                oVar2.mo14918M(-922833881);
                motionMeasurer2.mo48394i(boxScopeInstance, m, oVar2, 518);
                oVar.mo15002m0();
            } else {
                oVar2.mo14918M(-922833807);
                oVar.mo15002m0();
            }
            if (!enumSet2.contains(motionLayoutDebugFlags)) {
                oVar2.mo14918M(-922833740);
                motionMeasurer2.mo48427J(boxScopeInstance, oVar2, 70);
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
            LayoutKt.m68906d(SemanticsModifierKt.m71868c(mVar3, false, new MotionLayoutKt$MotionLayoutCore$4(motionMeasurer2), 1, (Object) null), C8553b.m31048b(oVar2, -819896774, true, new MotionLayoutKt$MotionLayoutCore$5(qVar, g0Var2, i5)), A, oVar, 48, 0);
            oVar.mo15002m0();
        }
        oVar.mo15002m0();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x017f, code lost:
        if (r11 != false) goto L_0x0186;
     */
    @androidx.compose.runtime.C8540g
    @kotlin.C11532s0
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m75348f(@org.jetbrains.annotations.C12579k androidx.constraintlayout.compose.C16601i0 r22, float r23, @org.jetbrains.annotations.C12580l java.util.EnumSet<androidx.constraintlayout.compose.MotionLayoutDebugFlags> r24, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r25, int r26, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super androidx.constraintlayout.compose.C16596g0, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r27, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r28, int r29, int r30) {
        /*
            r0 = r22
            r1 = r23
            r2 = r27
            r14 = r28
            java.lang.String r3 = "motionScene"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            java.lang.String r3 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            r3 = -1401226512(0xffffffffac7afaf0, float:-3.5666435E-12)
            r14.mo14918M(r3)
            r3 = r30 & 4
            if (r3 == 0) goto L_0x0028
            androidx.constraintlayout.compose.MotionLayoutDebugFlags r3 = androidx.constraintlayout.compose.MotionLayoutDebugFlags.NONE
            java.util.EnumSet r3 = java.util.EnumSet.of(r3)
            java.lang.String r4 = "of(MotionLayoutDebugFlags.NONE)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            goto L_0x002a
        L_0x0028:
            r3 = r24
        L_0x002a:
            r4 = r30 & 8
            if (r4 == 0) goto L_0x0032
            androidx.compose.ui.m$a r4 = androidx.compose.p004ui.C8767m.f23478j
            r15 = r4
            goto L_0x0034
        L_0x0032:
            r15 = r25
        L_0x0034:
            r4 = r30 & 16
            if (r4 == 0) goto L_0x003b
            r4 = 257(0x101, float:3.6E-43)
            goto L_0x003d
        L_0x003b:
            r4 = r26
        L_0x003d:
            r5 = -3687241(0xffffffffffc7bcb7, float:NaN)
            r14.mo14918M(r5)
            java.lang.Object r6 = r28.mo14921N()
            androidx.compose.runtime.o$a r7 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r8 = r7.mo16277a()
            r9 = 2
            r13 = 0
            if (r6 != r8) goto L_0x005e
            r10 = 0
            java.lang.Long r6 = java.lang.Long.valueOf(r10)
            androidx.compose.runtime.z0 r6 = androidx.compose.runtime.C8539f2.m30981g(r6, r13, r9, r13)
            r14.mo14893C(r6)
        L_0x005e:
            r28.mo15002m0()
            androidx.compose.runtime.z0 r6 = (androidx.compose.runtime.C8700z0) r6
            r0.mo48534t(r6)
            androidx.constraintlayout.compose.MotionLayoutDebugFlags r8 = r22.mo48532d()
            androidx.constraintlayout.compose.MotionLayoutDebugFlags r10 = androidx.constraintlayout.compose.MotionLayoutDebugFlags.UNKNOWN
            if (r8 == r10) goto L_0x007b
            androidx.constraintlayout.compose.MotionLayoutDebugFlags r3 = r22.mo48532d()
            java.util.EnumSet r3 = java.util.EnumSet.of(r3)
            java.lang.String r8 = "of(motionScene.getForcedDrawDebug())"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r8)
        L_0x007b:
            r12 = r3
            java.lang.Object r3 = r6.getValue()
            r8 = -3686552(0xffffffffffc7bf68, float:NaN)
            r14.mo14918M(r8)
            boolean r10 = r14.mo15006n0(r0)
            boolean r3 = r14.mo15006n0(r3)
            r3 = r3 | r10
            java.lang.Object r10 = r28.mo14921N()
            if (r3 != 0) goto L_0x009b
            java.lang.Object r3 = r7.mo16277a()
            if (r10 != r3) goto L_0x00a4
        L_0x009b:
            java.lang.String r3 = "default"
            java.lang.String r10 = r0.mo48469l(r3)
            r14.mo14893C(r10)
        L_0x00a4:
            r28.mo15002m0()
            java.lang.String r10 = (java.lang.String) r10
            r11 = 0
            if (r10 != 0) goto L_0x00b7
            r3 = -488322840(0xffffffffe2e4c8e8, float:-2.1101672E21)
            r14.mo14918M(r3)
            r28.mo15002m0()
            r10 = r13
            goto L_0x00c5
        L_0x00b7:
            r3 = -1401225671(0xffffffffac7afe39, float:-3.5668259E-12)
            r14.mo14918M(r3)
            androidx.constraintlayout.compose.n0 r3 = m75359q(r10, r14, r11)
            r28.mo15002m0()
            r10 = r3
        L_0x00c5:
            if (r10 != 0) goto L_0x00ca
            java.lang.String r3 = "start"
            goto L_0x00ce
        L_0x00ca:
            java.lang.String r3 = r10.mo48417a()
        L_0x00ce:
            if (r10 != 0) goto L_0x00d3
            java.lang.String r16 = "end"
            goto L_0x00d7
        L_0x00d3:
            java.lang.String r16 = r10.mo48419c()
        L_0x00d7:
            r9 = r16
            java.lang.Object r13 = r6.getValue()
            r14.mo14918M(r8)
            boolean r16 = r14.mo15006n0(r0)
            boolean r13 = r14.mo15006n0(r13)
            r13 = r16 | r13
            java.lang.Object r5 = r28.mo14921N()
            if (r13 != 0) goto L_0x00f6
            java.lang.Object r13 = r7.mo16277a()
            if (r5 != r13) goto L_0x0104
        L_0x00f6:
            java.lang.String r3 = r0.mo48470m(r3)
            if (r3 != 0) goto L_0x0100
            java.lang.String r3 = r0.mo48474r(r11)
        L_0x0100:
            r5 = r3
            r14.mo14893C(r5)
        L_0x0104:
            r28.mo15002m0()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r3 = r6.getValue()
            r14.mo14918M(r8)
            boolean r6 = r14.mo15006n0(r0)
            boolean r3 = r14.mo15006n0(r3)
            r3 = r3 | r6
            java.lang.Object r6 = r28.mo14921N()
            r13 = 1
            if (r3 != 0) goto L_0x0126
            java.lang.Object r3 = r7.mo16277a()
            if (r6 != r3) goto L_0x0134
        L_0x0126:
            java.lang.String r3 = r0.mo48470m(r9)
            if (r3 != 0) goto L_0x0130
            java.lang.String r3 = r0.mo48474r(r13)
        L_0x0130:
            r6 = r3
            r14.mo14893C(r6)
        L_0x0134:
            r28.mo15002m0()
            java.lang.String r6 = (java.lang.String) r6
            if (r5 == 0) goto L_0x03c2
            if (r6 != 0) goto L_0x013f
            goto L_0x03c2
        L_0x013f:
            androidx.constraintlayout.compose.j r8 = androidx.constraintlayout.compose.ConstraintLayoutKt.m75210i(r5)
            androidx.constraintlayout.compose.j r9 = androidx.constraintlayout.compose.ConstraintLayoutKt.m75210i(r6)
            r3 = -3687241(0xffffffffffc7bcb7, float:NaN)
            r14.mo14918M(r3)
            java.lang.Object r3 = r28.mo14921N()
            java.lang.Object r5 = r7.mo16277a()
            r6 = 0
            if (r3 != r5) goto L_0x0165
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r5 = 2
            r11 = 0
            androidx.compose.runtime.z0 r3 = androidx.compose.runtime.C8539f2.m30981g(r3, r11, r5, r11)
            r14.mo14893C(r3)
        L_0x0165:
            r28.mo15002m0()
            androidx.compose.runtime.z0 r3 = (androidx.compose.runtime.C8700z0) r3
            float r5 = r22.mo48468e()
            boolean r11 = java.lang.Float.isNaN(r5)
            if (r11 != 0) goto L_0x0182
            float r11 = m75354l(r3)
            int r11 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r11 != 0) goto L_0x017e
            r11 = r13
            goto L_0x017f
        L_0x017e:
            r11 = 0
        L_0x017f:
            if (r11 == 0) goto L_0x0182
            goto L_0x0186
        L_0x0182:
            r22.mo48471n()
            r5 = r1
        L_0x0186:
            m75355m(r3, r1)
            boolean r1 = r0 instanceof androidx.constraintlayout.compose.C16592e0
            if (r1 == 0) goto L_0x0192
            r11 = r0
            androidx.constraintlayout.compose.e0 r11 = (androidx.constraintlayout.compose.C16592e0) r11
            r0 = r11
            goto L_0x0193
        L_0x0192:
            r0 = 0
        L_0x0193:
            int r1 = r29 << 9
            r3 = 3670016(0x380000, float:5.142788E-39)
            r3 = r3 & r1
            r11 = 32768(0x8000, float:4.5918E-41)
            r3 = r3 | r11
            r11 = 29360128(0x1c00000, float:7.052966E-38)
            r11 = r11 & r1
            r3 = r3 | r11
            r11 = 234881024(0xe000000, float:1.5777218E-30)
            r1 = r1 & r11
            r1 = r1 | r3
            r3 = -1401224268(0xffffffffac7b03b4, float:-3.56713E-12)
            r14.mo14918M(r3)
            r3 = -3687241(0xffffffffffc7bcb7, float:NaN)
            r14.mo14918M(r3)
            java.lang.Object r11 = r28.mo14921N()
            java.lang.Object r13 = r7.mo16277a()
            if (r11 != r13) goto L_0x01c2
            androidx.constraintlayout.compose.MotionMeasurer r11 = new androidx.constraintlayout.compose.MotionMeasurer
            r11.<init>()
            r14.mo14893C(r11)
        L_0x01c2:
            r28.mo15002m0()
            r13 = r11
            androidx.constraintlayout.compose.MotionMeasurer r13 = (androidx.constraintlayout.compose.MotionMeasurer) r13
            r14.mo14918M(r3)
            java.lang.Object r11 = r28.mo14921N()
            java.lang.Object r6 = r7.mo16277a()
            if (r11 != r6) goto L_0x01dd
            androidx.constraintlayout.compose.g0 r11 = new androidx.constraintlayout.compose.g0
            r11.<init>(r13)
            r14.mo14893C(r11)
        L_0x01dd:
            r28.mo15002m0()
            androidx.constraintlayout.compose.g0 r11 = (androidx.constraintlayout.compose.C16596g0) r11
            r14.mo14918M(r3)
            java.lang.Object r3 = r28.mo14921N()
            java.lang.Object r6 = r7.mo16277a()
            if (r3 != r6) goto L_0x01fe
            r6 = 0
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r6 = 2
            r7 = 0
            androidx.compose.runtime.z0 r3 = androidx.compose.runtime.C8539f2.m30981g(r3, r7, r6, r7)
            r14.mo14893C(r3)
            goto L_0x01ff
        L_0x01fe:
            r7 = 0
        L_0x01ff:
            r28.mo15002m0()
            r6 = r3
            androidx.compose.runtime.z0 r6 = (androidx.compose.runtime.C8700z0) r6
            java.lang.Float r3 = java.lang.Float.valueOf(r5)
            r6.setValue(r3)
            r16 = 0
            int r3 = r1 >> 21
            r3 = r3 & 14
            r5 = 18350528(0x11801c0, float:2.7919246E-38)
            r3 = r3 | r5
            int r5 = r1 << 9
            r7 = r5 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | r7
            r7 = 57344(0xe000, float:8.0356E-41)
            r7 = r7 & r5
            r3 = r3 | r7
            r7 = 458752(0x70000, float:6.42848E-40)
            r5 = r5 & r7
            r18 = r3 | r5
            r3 = r4
            r4 = r12
            r19 = r6
            r5 = r16
            r16 = 0
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r19
            r20 = r11
            r11 = r13
            r21 = r12
            r12 = r28
            r22 = r1
            r1 = r13
            r2 = 1
            r13 = r18
            androidx.compose.ui.layout.f0 r3 = m75342A(r3, r4, r5, r7, r8, r9, r10, r11, r12, r13)
            r1.mo48389d(r0)
            float r0 = r1.mo48397m()
            androidx.constraintlayout.compose.MotionLayoutDebugFlags r4 = androidx.constraintlayout.compose.MotionLayoutDebugFlags.NONE
            r5 = r21
            boolean r6 = r5.contains(r4)
            if (r6 == 0) goto L_0x0296
            boolean r6 = java.lang.Float.isNaN(r0)
            if (r6 != 0) goto L_0x025b
            goto L_0x0296
        L_0x025b:
            r0 = -1401222327(0xffffffffac7b0b49, float:-3.567551E-12)
            r14.mo14918M(r0)
            androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$4 r0 = new androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$4
            r0.<init>(r1)
            r6 = 0
            r7 = 0
            androidx.compose.ui.m r0 = androidx.compose.p004ui.semantics.SemanticsModifierKt.m71868c(r15, r6, r0, r2, r7)
            androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$5 r1 = new androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$5
            r8 = r22
            r9 = r2
            r11 = r20
            r2 = r27
            r1.<init>(r2, r11, r8)
            r2 = -819896774(0xffffffffcf215e3a, float:-2.70730701E9)
            androidx.compose.runtime.internal.a r1 = androidx.compose.runtime.internal.C8553b.m31048b(r14, r2, r9, r1)
            r2 = 48
            r4 = 0
            r22 = r0
            r23 = r1
            r24 = r3
            r25 = r28
            r26 = r2
            r27 = r4
            androidx.compose.p004ui.layout.LayoutKt.m68906d(r22, r23, r24, r25, r26, r27)
            r28.mo15002m0()
            goto L_0x03bb
        L_0x0296:
            r8 = r22
            r9 = r2
            r11 = r20
            r6 = 0
            r7 = 0
            r2 = r27
            r10 = -1401223142(0xffffffffac7b081a, float:-3.5673743E-12)
            r14.mo14918M(r10)
            boolean r10 = java.lang.Float.isNaN(r0)
            if (r10 != 0) goto L_0x02b3
            float r10 = r1.mo48397m()
            androidx.compose.ui.m r15 = androidx.compose.p004ui.draw.C8756n.m32558a(r15, r10)
        L_0x02b3:
            r10 = -1990474327(0xffffffff895bc5a9, float:-2.6454105E-33)
            r14.mo14918M(r10)
            androidx.compose.ui.m$a r10 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.ui.c$a r12 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c r12 = r12.mo17061C()
            androidx.compose.ui.layout.f0 r12 = androidx.compose.foundation.layout.BoxKt.m9849k(r12, r6, r14, r6)
            r13 = 1376089335(0x520574f7, float:1.43298249E11)
            r14.mo14918M(r13)
            androidx.compose.runtime.i1 r13 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r13 = r14.mo15032w(r13)
            androidx.compose.ui.unit.d r13 = (androidx.compose.p004ui.unit.C16479d) r13
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r7 = r14.mo15032w(r7)
            androidx.compose.ui.unit.LayoutDirection r7 = (androidx.compose.p004ui.unit.LayoutDirection) r7
            androidx.compose.ui.node.ComposeUiNode$Companion r16 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r9 = r16.mo44585a()
            kotlin.jvm.functions.q r10 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r10)
            androidx.compose.runtime.d r6 = r28.mo15017r()
            boolean r6 = r6 instanceof androidx.compose.runtime.C8428d
            if (r6 != 0) goto L_0x02f4
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x02f4:
            r28.mo14938T()
            boolean r6 = r28.mo14997l()
            if (r6 == 0) goto L_0x0301
            r14.mo14947W(r9)
            goto L_0x0304
        L_0x0301:
            r28.mo14888A()
        L_0x0304:
            r28.mo14941U()
            androidx.compose.runtime.o r6 = androidx.compose.runtime.Updater.m30180b(r28)
            kotlin.jvm.functions.p r9 = r16.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r6, r12, r9)
            kotlin.jvm.functions.p r9 = r16.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r6, r13, r9)
            kotlin.jvm.functions.p r9 = r16.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r6, r7, r9)
            r28.mo14972e()
            androidx.compose.runtime.o r6 = androidx.compose.runtime.C8684u1.m31906b(r28)
            androidx.compose.runtime.u1 r6 = androidx.compose.runtime.C8684u1.m31905a(r6)
            r7 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            r10.invoke(r6, r14, r9)
            r6 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r14.mo14918M(r6)
            r6 = -1253629305(0xffffffffb5472287, float:-7.418352E-7)
            r14.mo14918M(r6)
            androidx.compose.foundation.layout.BoxScopeInstance r6 = androidx.compose.foundation.layout.BoxScopeInstance.f6046a
            androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$3$1 r7 = new androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$3$1
            r7.<init>(r1)
            r9 = 1
            r10 = 0
            r12 = 0
            androidx.compose.ui.m r7 = androidx.compose.p004ui.semantics.SemanticsModifierKt.m71868c(r15, r10, r7, r9, r12)
            androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$3$2 r10 = new androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$3$2
            r10.<init>(r2, r11, r8)
            r2 = -819900388(0xffffffffcf21501c, float:-2.70638182E9)
            androidx.compose.runtime.internal.a r2 = androidx.compose.runtime.internal.C8553b.m31048b(r14, r2, r9, r10)
            r8 = 48
            r9 = 0
            r22 = r7
            r23 = r2
            r24 = r3
            r25 = r28
            r26 = r8
            r27 = r9
            androidx.compose.p004ui.layout.LayoutKt.m68906d(r22, r23, r24, r25, r26, r27)
            boolean r2 = java.lang.Float.isNaN(r0)
            if (r2 != 0) goto L_0x0380
            r2 = -922833881(0xffffffffc8feac27, float:-521569.22)
            r14.mo14918M(r2)
            r2 = 518(0x206, float:7.26E-43)
            r1.mo48394i(r6, r0, r14, r2)
            r28.mo15002m0()
            goto L_0x0389
        L_0x0380:
            r0 = -922833807(0xffffffffc8feac71, float:-521571.53)
            r14.mo14918M(r0)
            r28.mo15002m0()
        L_0x0389:
            boolean r0 = r5.contains(r4)
            if (r0 != 0) goto L_0x039e
            r0 = -922833740(0xffffffffc8feacb4, float:-521573.62)
            r14.mo14918M(r0)
            r0 = 70
            r1.mo48427J(r6, r14, r0)
            r28.mo15002m0()
            goto L_0x03a7
        L_0x039e:
            r0 = -922833689(0xffffffffc8feace7, float:-521575.22)
            r14.mo14918M(r0)
            r28.mo15002m0()
        L_0x03a7:
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            r28.mo15002m0()
            r28.mo15002m0()
            r28.mo14896D()
            r28.mo15002m0()
            r28.mo15002m0()
            r28.mo15002m0()
        L_0x03bb:
            r28.mo15002m0()
            r28.mo15002m0()
            return
        L_0x03c2:
            r28.mo15002m0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.MotionLayoutKt.m75348f(androidx.constraintlayout.compose.i0, float, java.util.EnumSet, androidx.compose.ui.m, int, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v1, resolved type: androidx.compose.runtime.z0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: androidx.compose.runtime.z0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: androidx.compose.ui.m$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: androidx.compose.animation.core.z0} */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02d2, code lost:
        if ((((java.lang.Number) r4.getValue()).floatValue() == ((java.lang.Number) r21.mo6613u()).floatValue()) != false) goto L_0x02e2;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @kotlin.C11532s0
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m75349g(@org.jetbrains.annotations.C12579k androidx.constraintlayout.compose.C16601i0 r27, @org.jetbrains.annotations.C12580l java.lang.String r28, @org.jetbrains.annotations.C12580l androidx.compose.animation.core.C1968g<java.lang.Float> r29, @org.jetbrains.annotations.C12580l java.util.EnumSet<androidx.constraintlayout.compose.MotionLayoutDebugFlags> r30, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r31, int r32, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r33, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super androidx.constraintlayout.compose.C16596g0, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r34, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r35, int r36, int r37) {
        /*
            r0 = r27
            r1 = r34
            r13 = r35
            java.lang.String r2 = "motionScene"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            java.lang.String r2 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r2 = -1401230387(0xffffffffac7aebcd, float:-3.5658033E-12)
            r13.mo14918M(r2)
            r2 = r37 & 2
            r14 = 0
            if (r2 == 0) goto L_0x001d
            r2 = r14
            goto L_0x001f
        L_0x001d:
            r2 = r28
        L_0x001f:
            r3 = r37 & 4
            r15 = 0
            if (r3 == 0) goto L_0x002b
            r3 = 7
            androidx.compose.animation.core.z0 r3 = androidx.compose.animation.core.C1972h.m8392q(r15, r15, r14, r3, r14)
            r7 = r3
            goto L_0x002d
        L_0x002b:
            r7 = r29
        L_0x002d:
            r3 = r37 & 8
            if (r3 == 0) goto L_0x003d
            androidx.constraintlayout.compose.MotionLayoutDebugFlags r3 = androidx.constraintlayout.compose.MotionLayoutDebugFlags.NONE
            java.util.EnumSet r3 = java.util.EnumSet.of(r3)
            java.lang.String r4 = "of(MotionLayoutDebugFlags.NONE)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            goto L_0x003f
        L_0x003d:
            r3 = r30
        L_0x003f:
            r4 = r37 & 16
            if (r4 == 0) goto L_0x0047
            androidx.compose.ui.m$a r4 = androidx.compose.p004ui.C8767m.f23478j
            r12 = r4
            goto L_0x0049
        L_0x0047:
            r12 = r31
        L_0x0049:
            r4 = r37 & 32
            if (r4 == 0) goto L_0x0052
            r4 = 257(0x101, float:3.6E-43)
            r16 = r4
            goto L_0x0054
        L_0x0052:
            r16 = r32
        L_0x0054:
            r4 = r37 & 64
            if (r4 == 0) goto L_0x005a
            r8 = r14
            goto L_0x005c
        L_0x005a:
            r8 = r33
        L_0x005c:
            r11 = -3687241(0xffffffffffc7bcb7, float:NaN)
            r13.mo14918M(r11)
            java.lang.Object r4 = r35.mo14921N()
            androidx.compose.runtime.o$a r17 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r5 = r17.mo16277a()
            r10 = 2
            if (r4 != r5) goto L_0x007c
            r4 = 0
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            androidx.compose.runtime.z0 r4 = androidx.compose.runtime.C8539f2.m30981g(r4, r14, r10, r14)
            r13.mo14893C(r4)
        L_0x007c:
            r35.mo15002m0()
            androidx.compose.runtime.z0 r4 = (androidx.compose.runtime.C8700z0) r4
            r0.mo48534t(r4)
            androidx.constraintlayout.compose.MotionLayoutDebugFlags r5 = r27.mo48532d()
            androidx.constraintlayout.compose.MotionLayoutDebugFlags r6 = androidx.constraintlayout.compose.MotionLayoutDebugFlags.UNKNOWN
            if (r5 == r6) goto L_0x0099
            androidx.constraintlayout.compose.MotionLayoutDebugFlags r3 = r27.mo48532d()
            java.util.EnumSet r3 = java.util.EnumSet.of(r3)
            java.lang.String r5 = "of(motionScene.getForcedDrawDebug())"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r5)
        L_0x0099:
            r9 = r3
            java.lang.Object r3 = r4.getValue()
            r18 = r36 & 14
            r5 = -3686552(0xffffffffffc7bf68, float:NaN)
            r13.mo14918M(r5)
            boolean r6 = r13.mo15006n0(r0)
            boolean r3 = r13.mo15006n0(r3)
            r3 = r3 | r6
            java.lang.Object r6 = r35.mo14921N()
            if (r3 != 0) goto L_0x00bb
            java.lang.Object r3 = r17.mo16277a()
            if (r6 != r3) goto L_0x00c4
        L_0x00bb:
            java.lang.String r3 = "default"
            java.lang.String r6 = r0.mo48469l(r3)
            r13.mo14893C(r6)
        L_0x00c4:
            r35.mo15002m0()
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L_0x00d7
            r3 = -488438718(0xffffffffe2e30442, float:-2.0938589E21)
            r13.mo14918M(r3)
            r35.mo15002m0()
            r19 = r14
            goto L_0x00e6
        L_0x00d7:
            r3 = -1401229409(0xffffffffac7aef9f, float:-3.5660153E-12)
            r13.mo14918M(r3)
            androidx.constraintlayout.compose.n0 r3 = m75359q(r6, r13, r15)
            r35.mo15002m0()
            r19 = r3
        L_0x00e6:
            if (r19 != 0) goto L_0x00eb
            java.lang.String r3 = "start"
            goto L_0x00ef
        L_0x00eb:
            java.lang.String r3 = r19.mo48417a()
        L_0x00ef:
            if (r19 != 0) goto L_0x00f4
            java.lang.String r6 = "end"
            goto L_0x00f8
        L_0x00f4:
            java.lang.String r6 = r19.mo48419c()
        L_0x00f8:
            java.lang.Object r11 = r4.getValue()
            r13.mo14918M(r5)
            boolean r20 = r13.mo15006n0(r0)
            boolean r11 = r13.mo15006n0(r11)
            r11 = r20 | r11
            java.lang.Object r10 = r35.mo14921N()
            if (r11 != 0) goto L_0x0115
            java.lang.Object r11 = r17.mo16277a()
            if (r10 != r11) goto L_0x0123
        L_0x0115:
            java.lang.String r3 = r0.mo48470m(r3)
            if (r3 != 0) goto L_0x011f
            java.lang.String r3 = r0.mo48474r(r15)
        L_0x011f:
            r10 = r3
            r13.mo14893C(r10)
        L_0x0123:
            r35.mo15002m0()
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r3 = r4.getValue()
            r13.mo14918M(r5)
            boolean r4 = r13.mo15006n0(r0)
            boolean r3 = r13.mo15006n0(r3)
            r3 = r3 | r4
            java.lang.Object r4 = r35.mo14921N()
            r11 = 1
            if (r3 != 0) goto L_0x0145
            java.lang.Object r3 = r17.mo16277a()
            if (r4 != r3) goto L_0x0153
        L_0x0145:
            java.lang.String r3 = r0.mo48470m(r6)
            if (r3 != 0) goto L_0x014f
            java.lang.String r3 = r0.mo48474r(r11)
        L_0x014f:
            r4 = r3
            r13.mo14893C(r4)
        L_0x0153:
            r35.mo15002m0()
            java.lang.String r4 = (java.lang.String) r4
            r13.mo14918M(r5)
            boolean r3 = r13.mo15006n0(r0)
            boolean r5 = r13.mo15006n0(r2)
            r3 = r3 | r5
            java.lang.Object r5 = r35.mo14921N()
            if (r3 != 0) goto L_0x0170
            java.lang.Object r3 = r17.mo16277a()
            if (r5 != r3) goto L_0x017c
        L_0x0170:
            if (r2 != 0) goto L_0x0174
            r5 = r14
            goto L_0x0179
        L_0x0174:
            java.lang.String r2 = r0.mo48470m(r2)
            r5 = r2
        L_0x0179:
            r13.mo14893C(r5)
        L_0x017c:
            r35.mo15002m0()
            java.lang.String r5 = (java.lang.String) r5
            if (r10 == 0) goto L_0x053c
            if (r4 != 0) goto L_0x0187
            goto L_0x053c
        L_0x0187:
            r2 = -3686930(0xffffffffffc7bdee, float:NaN)
            r13.mo14918M(r2)
            boolean r3 = r13.mo15006n0(r0)
            java.lang.Object r6 = r35.mo14921N()
            if (r3 != 0) goto L_0x019d
            java.lang.Object r3 = r17.mo16277a()
            if (r6 != r3) goto L_0x01aa
        L_0x019d:
            androidx.constraintlayout.compose.j r3 = androidx.constraintlayout.compose.ConstraintLayoutKt.m75210i(r10)
            r6 = 2
            androidx.compose.runtime.z0 r3 = androidx.compose.runtime.C8539f2.m30981g(r3, r14, r6, r14)
            r13.mo14893C(r3)
            r6 = r3
        L_0x01aa:
            r35.mo15002m0()
            r3 = r6
            androidx.compose.runtime.z0 r3 = (androidx.compose.runtime.C8700z0) r3
            r13.mo14918M(r2)
            boolean r6 = r13.mo15006n0(r0)
            java.lang.Object r10 = r35.mo14921N()
            if (r6 != 0) goto L_0x01c3
            java.lang.Object r6 = r17.mo16277a()
            if (r10 != r6) goto L_0x01cf
        L_0x01c3:
            androidx.constraintlayout.compose.j r4 = androidx.constraintlayout.compose.ConstraintLayoutKt.m75210i(r4)
            r6 = 2
            androidx.compose.runtime.z0 r10 = androidx.compose.runtime.C8539f2.m30981g(r4, r14, r6, r14)
            r13.mo14893C(r10)
        L_0x01cf:
            r35.mo15002m0()
            r20 = r10
            androidx.compose.runtime.z0 r20 = (androidx.compose.runtime.C8700z0) r20
            if (r5 != 0) goto L_0x01da
            r4 = r14
            goto L_0x01de
        L_0x01da:
            androidx.constraintlayout.compose.j r4 = androidx.constraintlayout.compose.ConstraintLayoutKt.m75210i(r5)
        L_0x01de:
            r5 = -3687241(0xffffffffffc7bcb7, float:NaN)
            r13.mo14918M(r5)
            java.lang.Object r5 = r35.mo14921N()
            java.lang.Object r6 = r17.mo16277a()
            r10 = 0
            if (r5 != r6) goto L_0x01f7
            r6 = 2
            androidx.compose.animation.core.Animatable r5 = androidx.compose.animation.core.C1946b.m8288b(r10, r10, r6, r14)
            r13.mo14893C(r5)
        L_0x01f7:
            r35.mo15002m0()
            r21 = r5
            androidx.compose.animation.core.Animatable r21 = (androidx.compose.animation.core.Animatable) r21
            r13.mo14918M(r2)
            boolean r2 = r13.mo15006n0(r0)
            java.lang.Object r5 = r35.mo14921N()
            if (r2 != 0) goto L_0x0214
            java.lang.Object r2 = r17.mo16277a()
            if (r5 != r2) goto L_0x0212
            goto L_0x0214
        L_0x0212:
            r6 = 2
            goto L_0x021e
        L_0x0214:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r6 = 2
            androidx.compose.runtime.z0 r5 = androidx.compose.runtime.C8539f2.m30981g(r2, r14, r6, r14)
            r13.mo14893C(r5)
        L_0x021e:
            r35.mo15002m0()
            r2 = r5
            androidx.compose.runtime.z0 r2 = (androidx.compose.runtime.C8700z0) r2
            r5 = -3687241(0xffffffffffc7bcb7, float:NaN)
            r13.mo14918M(r5)
            java.lang.Object r5 = r35.mo14921N()
            java.lang.Object r6 = r17.mo16277a()
            if (r5 != r6) goto L_0x023d
            r5 = -1
            r6 = 6
            kotlinx.coroutines.channels.g r5 = kotlinx.coroutines.channels.C11748i.m46625d(r5, r14, r14, r6, r14)
            r13.mo14893C(r5)
        L_0x023d:
            r35.mo15002m0()
            r6 = r5
            kotlinx.coroutines.channels.g r6 = (kotlinx.coroutines.channels.C11744g) r6
            if (r4 == 0) goto L_0x027b
            r5 = -1401228155(0xffffffffac7af485, float:-3.5662872E-12)
            r13.mo14918M(r5)
            androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$1 r5 = new androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$1
            r5.<init>(r6, r4)
            androidx.compose.runtime.EffectsKt.m29899k(r5, r13, r15)
            androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$2 r5 = new androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$2
            r22 = 0
            r4 = r5
            r15 = r5
            r23 = -3687241(0xffffffffffc7bcb7, float:NaN)
            r5 = r6
            r14 = r6
            r24 = 2
            r6 = r21
            r33 = r9
            r9 = r2
            r2 = r10
            r10 = r3
            r2 = r23
            r11 = r20
            r25 = r12
            r12 = r22
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r4 = r18 | 64
            androidx.compose.runtime.EffectsKt.m29895g(r0, r14, r15, r13, r4)
            r35.mo15002m0()
            goto L_0x028b
        L_0x027b:
            r33 = r9
            r25 = r12
            r2 = -3687241(0xffffffffffc7bcb7, float:NaN)
            r4 = -1401227298(0xffffffffac7af7de, float:-3.566473E-12)
            r13.mo14918M(r4)
            r35.mo15002m0()
        L_0x028b:
            r13.mo14918M(r2)
            java.lang.Object r4 = r35.mo14921N()
            java.lang.Object r5 = r17.mo16277a()
            if (r4 != r5) goto L_0x02a7
            r5 = 0
            java.lang.Float r4 = java.lang.Float.valueOf(r5)
            r5 = 0
            r6 = 2
            androidx.compose.runtime.z0 r4 = androidx.compose.runtime.C8539f2.m30981g(r4, r5, r6, r5)
            r13.mo14893C(r4)
            goto L_0x02a8
        L_0x02a7:
            r6 = 2
        L_0x02a8:
            r35.mo15002m0()
            androidx.compose.runtime.z0 r4 = (androidx.compose.runtime.C8700z0) r4
            float r5 = r27.mo48468e()
            boolean r7 = java.lang.Float.isNaN(r5)
            if (r7 != 0) goto L_0x02d5
            java.lang.Object r7 = r4.getValue()
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            java.lang.Object r8 = r21.mo6613u()
            java.lang.Number r8 = (java.lang.Number) r8
            float r8 = r8.floatValue()
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x02d1
            r11 = 1
            goto L_0x02d2
        L_0x02d1:
            r11 = 0
        L_0x02d2:
            if (r11 == 0) goto L_0x02d5
            goto L_0x02e2
        L_0x02d5:
            r27.mo48471n()
            java.lang.Object r5 = r21.mo6613u()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
        L_0x02e2:
            java.lang.Object r7 = r21.mo6613u()
            r4.setValue(r7)
            androidx.constraintlayout.compose.j r7 = m75356n(r3)
            androidx.constraintlayout.compose.j r8 = m75350h(r20)
            boolean r3 = r0 instanceof androidx.constraintlayout.compose.C16590d0
            if (r3 == 0) goto L_0x02f8
            androidx.constraintlayout.compose.d0 r0 = (androidx.constraintlayout.compose.C16590d0) r0
            goto L_0x02f9
        L_0x02f8:
            r0 = 0
        L_0x02f9:
            int r3 = r36 << 6
            r4 = 3670016(0x380000, float:5.142788E-39)
            r9 = r3 & r4
            r10 = 32768(0x8000, float:4.5918E-41)
            r9 = r9 | r10
            r11 = 29360128(0x1c00000, float:7.052966E-38)
            r3 = r3 & r11
            r3 = r3 | r9
            int r9 = r36 << 3
            r12 = 234881024(0xe000000, float:1.5777218E-30)
            r9 = r9 & r12
            r3 = r3 | r9
            r9 = -1330870962(0xffffffffb0ac854e, float:-1.2552535E-9)
            r13.mo14918M(r9)
            r9 = r3 & 14
            r9 = r9 | r10
            r10 = r3 & 112(0x70, float:1.57E-43)
            r9 = r9 | r10
            r10 = r3 & 896(0x380, float:1.256E-42)
            r9 = r9 | r10
            r10 = r3 & 7168(0x1c00, float:1.0045E-41)
            r9 = r9 | r10
            r10 = 458752(0x70000, float:6.42848E-40)
            r14 = r3 & r10
            r9 = r9 | r14
            r4 = r4 & r3
            r4 = r4 | r9
            r9 = r3 & r11
            r4 = r4 | r9
            r3 = r3 & r12
            r14 = r4 | r3
            r3 = -1401224268(0xffffffffac7b03b4, float:-3.56713E-12)
            r13.mo14918M(r3)
            r13.mo14918M(r2)
            java.lang.Object r3 = r35.mo14921N()
            java.lang.Object r4 = r17.mo16277a()
            if (r3 != r4) goto L_0x0347
            androidx.constraintlayout.compose.MotionMeasurer r3 = new androidx.constraintlayout.compose.MotionMeasurer
            r3.<init>()
            r13.mo14893C(r3)
        L_0x0347:
            r35.mo15002m0()
            r15 = r3
            androidx.constraintlayout.compose.MotionMeasurer r15 = (androidx.constraintlayout.compose.MotionMeasurer) r15
            r13.mo14918M(r2)
            java.lang.Object r3 = r35.mo14921N()
            java.lang.Object r4 = r17.mo16277a()
            if (r3 != r4) goto L_0x0362
            androidx.constraintlayout.compose.g0 r3 = new androidx.constraintlayout.compose.g0
            r3.<init>(r15)
            r13.mo14893C(r3)
        L_0x0362:
            r35.mo15002m0()
            r12 = r3
            androidx.constraintlayout.compose.g0 r12 = (androidx.constraintlayout.compose.C16596g0) r12
            r13.mo14918M(r2)
            java.lang.Object r2 = r35.mo14921N()
            java.lang.Object r3 = r17.mo16277a()
            if (r2 != r3) goto L_0x0382
            r3 = 0
            java.lang.Float r2 = java.lang.Float.valueOf(r3)
            r3 = 0
            androidx.compose.runtime.z0 r2 = androidx.compose.runtime.C8539f2.m30981g(r2, r3, r6, r3)
            r13.mo14893C(r2)
        L_0x0382:
            r35.mo15002m0()
            r9 = r2
            androidx.compose.runtime.z0 r9 = (androidx.compose.runtime.C8700z0) r9
            java.lang.Float r2 = java.lang.Float.valueOf(r5)
            r9.setValue(r2)
            r4 = 0
            int r2 = r14 >> 21
            r2 = r2 & 14
            r3 = 18350528(0x11801c0, float:2.7919246E-38)
            r2 = r2 | r3
            int r3 = r14 << 9
            r6 = r3 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r6
            r6 = 57344(0xe000, float:8.0356E-41)
            r6 = r6 & r3
            r2 = r2 | r6
            r3 = r3 & r10
            r17 = r2 | r3
            r2 = r16
            r3 = r33
            r6 = r7
            r7 = r8
            r8 = r19
            r10 = r15
            r11 = r35
            r26 = r12
            r12 = r17
            androidx.compose.ui.layout.f0 r2 = m75342A(r2, r3, r4, r6, r7, r8, r9, r10, r11, r12)
            r15.mo48389d(r0)
            float r0 = r15.mo48397m()
            androidx.constraintlayout.compose.MotionLayoutDebugFlags r3 = androidx.constraintlayout.compose.MotionLayoutDebugFlags.NONE
            r4 = r33
            boolean r5 = r4.contains(r3)
            if (r5 == 0) goto L_0x040a
            boolean r5 = java.lang.Float.isNaN(r0)
            if (r5 != 0) goto L_0x03d1
            goto L_0x040a
        L_0x03d1:
            r0 = -1401222327(0xffffffffac7b0b49, float:-3.567551E-12)
            r13.mo14918M(r0)
            androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$4 r0 = new androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$4
            r0.<init>(r15)
            r5 = r25
            r3 = 0
            r4 = 0
            r6 = 1
            androidx.compose.ui.m r0 = androidx.compose.p004ui.semantics.SemanticsModifierKt.m71868c(r5, r3, r0, r6, r4)
            androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$5 r3 = new androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$5
            r7 = r26
            r3.<init>(r1, r7, r14)
            r1 = -819896774(0xffffffffcf215e3a, float:-2.70730701E9)
            androidx.compose.runtime.internal.a r1 = androidx.compose.runtime.internal.C8553b.m31048b(r13, r1, r6, r3)
            r3 = 48
            r4 = 0
            r27 = r0
            r28 = r1
            r29 = r2
            r30 = r35
            r31 = r3
            r32 = r4
            androidx.compose.p004ui.layout.LayoutKt.m68906d(r27, r28, r29, r30, r31, r32)
            r35.mo15002m0()
            goto L_0x0532
        L_0x040a:
            r5 = r25
            r7 = r26
            r6 = 1
            r8 = -1401223142(0xffffffffac7b081a, float:-3.5673743E-12)
            r13.mo14918M(r8)
            boolean r8 = java.lang.Float.isNaN(r0)
            if (r8 != 0) goto L_0x0424
            float r8 = r15.mo48397m()
            androidx.compose.ui.m r12 = androidx.compose.p004ui.draw.C8756n.m32558a(r5, r8)
            goto L_0x0425
        L_0x0424:
            r12 = r5
        L_0x0425:
            r5 = -1990474327(0xffffffff895bc5a9, float:-2.6454105E-33)
            r13.mo14918M(r5)
            androidx.compose.ui.m$a r5 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.ui.c$a r8 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c r8 = r8.mo17061C()
            r9 = 0
            androidx.compose.ui.layout.f0 r8 = androidx.compose.foundation.layout.BoxKt.m9849k(r8, r9, r13, r9)
            r9 = 1376089335(0x520574f7, float:1.43298249E11)
            r13.mo14918M(r9)
            androidx.compose.runtime.i1 r9 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r9 = r13.mo15032w(r9)
            androidx.compose.ui.unit.d r9 = (androidx.compose.p004ui.unit.C16479d) r9
            androidx.compose.runtime.i1 r10 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r10 = r13.mo15032w(r10)
            androidx.compose.ui.unit.LayoutDirection r10 = (androidx.compose.p004ui.unit.LayoutDirection) r10
            androidx.compose.ui.node.ComposeUiNode$Companion r11 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r6 = r11.mo44585a()
            kotlin.jvm.functions.q r5 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r5)
            r33 = r3
            androidx.compose.runtime.d r3 = r35.mo15017r()
            boolean r3 = r3 instanceof androidx.compose.runtime.C8428d
            if (r3 != 0) goto L_0x0469
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0469:
            r35.mo14938T()
            boolean r3 = r35.mo14997l()
            if (r3 == 0) goto L_0x0476
            r13.mo14947W(r6)
            goto L_0x0479
        L_0x0476:
            r35.mo14888A()
        L_0x0479:
            r35.mo14941U()
            androidx.compose.runtime.o r3 = androidx.compose.runtime.Updater.m30180b(r35)
            kotlin.jvm.functions.p r6 = r11.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r3, r8, r6)
            kotlin.jvm.functions.p r6 = r11.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r3, r9, r6)
            kotlin.jvm.functions.p r6 = r11.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r3, r10, r6)
            r35.mo14972e()
            androidx.compose.runtime.o r3 = androidx.compose.runtime.C8684u1.m31906b(r35)
            androidx.compose.runtime.u1 r3 = androidx.compose.runtime.C8684u1.m31905a(r3)
            r6 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            r5.invoke(r3, r13, r8)
            r3 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r13.mo14918M(r3)
            r3 = -1253629305(0xffffffffb5472287, float:-7.418352E-7)
            r13.mo14918M(r3)
            androidx.compose.foundation.layout.BoxScopeInstance r3 = androidx.compose.foundation.layout.BoxScopeInstance.f6046a
            androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$3$1 r5 = new androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$3$1
            r5.<init>(r15)
            r6 = 1
            r8 = 0
            r9 = 0
            androidx.compose.ui.m r5 = androidx.compose.p004ui.semantics.SemanticsModifierKt.m71868c(r12, r8, r5, r6, r9)
            androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$3$2 r8 = new androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$3$2
            r8.<init>(r1, r7, r14)
            r1 = -819900388(0xffffffffcf21501c, float:-2.70638182E9)
            androidx.compose.runtime.internal.a r1 = androidx.compose.runtime.internal.C8553b.m31048b(r13, r1, r6, r8)
            r6 = 48
            r7 = 0
            r27 = r5
            r28 = r1
            r29 = r2
            r30 = r35
            r31 = r6
            r32 = r7
            androidx.compose.p004ui.layout.LayoutKt.m68906d(r27, r28, r29, r30, r31, r32)
            boolean r1 = java.lang.Float.isNaN(r0)
            if (r1 != 0) goto L_0x04f5
            r1 = -922833881(0xffffffffc8feac27, float:-521569.22)
            r13.mo14918M(r1)
            r1 = 518(0x206, float:7.26E-43)
            r15.mo48394i(r3, r0, r13, r1)
            r35.mo15002m0()
            goto L_0x04fe
        L_0x04f5:
            r0 = -922833807(0xffffffffc8feac71, float:-521571.53)
            r13.mo14918M(r0)
            r35.mo15002m0()
        L_0x04fe:
            r0 = r33
            boolean r0 = r4.contains(r0)
            if (r0 != 0) goto L_0x0515
            r0 = -922833740(0xffffffffc8feacb4, float:-521573.62)
            r13.mo14918M(r0)
            r0 = 70
            r15.mo48427J(r3, r13, r0)
            r35.mo15002m0()
            goto L_0x051e
        L_0x0515:
            r0 = -922833689(0xffffffffc8feace7, float:-521575.22)
            r13.mo14918M(r0)
            r35.mo15002m0()
        L_0x051e:
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            r35.mo15002m0()
            r35.mo15002m0()
            r35.mo14896D()
            r35.mo15002m0()
            r35.mo15002m0()
            r35.mo15002m0()
        L_0x0532:
            r35.mo15002m0()
            r35.mo15002m0()
            r35.mo15002m0()
            return
        L_0x053c:
            r35.mo15002m0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.MotionLayoutKt.m75349g(androidx.constraintlayout.compose.i0, java.lang.String, androidx.compose.animation.core.g, java.util.EnumSet, androidx.compose.ui.m, int, kotlin.jvm.functions.a, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int):void");
    }

    /* renamed from: h */
    public static final C16602j m75350h(C8700z0<C16602j> z0Var) {
        return z0Var.getValue();
    }

    /* renamed from: i */
    public static final void m75351i(C8700z0<C16602j> z0Var, C16602j jVar) {
        z0Var.setValue(jVar);
    }

    /* renamed from: j */
    public static final boolean m75352j(C8700z0<Boolean> z0Var) {
        return z0Var.getValue().booleanValue();
    }

    /* renamed from: k */
    public static final void m75353k(C8700z0<Boolean> z0Var, boolean z) {
        z0Var.setValue(Boolean.valueOf(z));
    }

    /* renamed from: l */
    public static final float m75354l(C8700z0<Float> z0Var) {
        return z0Var.getValue().floatValue();
    }

    /* renamed from: m */
    public static final void m75355m(C8700z0<Float> z0Var, float f) {
        z0Var.setValue(Float.valueOf(f));
    }

    /* renamed from: n */
    public static final C16602j m75356n(C8700z0<C16602j> z0Var) {
        return z0Var.getValue();
    }

    /* renamed from: o */
    public static final void m75357o(C8700z0<C16602j> z0Var, C16602j jVar) {
        z0Var.setValue(jVar);
    }

    @C8540g
    @SuppressLint({"ComposableNaming"})
    @C12579k
    /* renamed from: p */
    public static final C16601i0 m75358p(@C12579k @C12553d("json5") String str, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(str, "content");
        oVar.mo14918M(1405665503);
        oVar.mo14918M(-3686930);
        boolean n0 = oVar.mo15006n0(str);
        Object N = oVar.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            N = new C16590d0(str);
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        C16590d0 d0Var = (C16590d0) N;
        oVar.mo15002m0();
        return d0Var;
    }

    @C8540g
    @C12580l
    @SuppressLint({"ComposableNaming"})
    /* renamed from: q */
    public static final C16615n0 m75359q(@C12579k @C12553d("json5") String str, @C12580l C8592o oVar, int i) {
        C16738f fVar;
        C16580a aVar;
        Intrinsics.checkNotNullParameter(str, "content");
        oVar.mo14918M(811760201);
        oVar.mo14918M(-3686930);
        boolean n0 = oVar.mo15006n0(str);
        Object N = oVar.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            try {
                fVar = CLParser.m76375d(str);
            } catch (CLParsingException e) {
                System.err.println(Intrinsics.stringPlus("Error parsing JSON ", e));
                fVar = null;
            }
            if (fVar != null) {
                aVar = new C16580a(fVar);
            } else {
                aVar = null;
            }
            N = C8539f2.m30981g(aVar, (C8410b2) null, 2, (Object) null);
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        C16580a aVar2 = (C16580a) ((C8700z0) N).getValue();
        oVar.mo15002m0();
        return aVar2;
    }
}

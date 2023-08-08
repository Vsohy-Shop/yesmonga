package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.C2223i;
import androidx.compose.foundation.interaction.C2242f;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.draw.C8744d;
import androidx.compose.p004ui.draw.ShadowKt;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15321t3;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8550i1;
import androidx.compose.runtime.C8572j1;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.internal.C8553b;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSurface.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Surface.kt\nandroidx/compose/material3/SurfaceKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,491:1\n154#2:492\n154#2:493\n154#2:496\n154#2:497\n154#2:507\n154#2:508\n154#2:518\n154#2:519\n76#3:494\n76#3:505\n76#3:516\n76#3:527\n51#4:495\n51#4:506\n51#4:517\n51#4:528\n25#5:498\n25#5:509\n25#5:520\n1114#6,6:499\n1114#6,6:510\n1114#6,6:521\n*S KotlinDebug\n*F\n+ 1 Surface.kt\nandroidx/compose/material3/SurfaceKt\n*L\n105#1:492\n106#1:493\n209#1:496\n210#1:497\n318#1:507\n319#1:508\n428#1:518\n429#1:519\n110#1:494\n215#1:505\n324#1:516\n434#1:527\n110#1:495\n215#1:506\n324#1:517\n434#1:528\n212#1:498\n321#1:509\n431#1:520\n212#1:499,6\n321#1:510,6\n431#1:521,6\n*E\n"})
public final class SurfaceKt {
    @C12579k

    /* renamed from: a */
    public static final C8550i1<C16483g> f19741a = CompositionLocalKt.m29858d((C8410b2) null, SurfaceKt$LocalAbsoluteTonalElevation$1.f19742f, 1, (Object) null);

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    public static final void m26352a(@C12580l C8767m mVar, @C12580l C15218g4 g4Var, long j, long j2, float f, float f2, @C12580l C2223i iVar, @C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar, @C12580l C8592o oVar, int i, int i2) {
        C8767m mVar2;
        C15218g4 g4Var2;
        long j3;
        long j4;
        float f3;
        float f4;
        C2223i iVar2;
        C8592o oVar2 = oVar;
        int i3 = i;
        Intrinsics.checkNotNullParameter(pVar, "content");
        oVar2.mo14918M(-513881741);
        if ((i2 & 1) != 0) {
            mVar2 = C8767m.f23478j;
        } else {
            mVar2 = mVar;
        }
        if ((i2 & 2) != 0) {
            g4Var2 = C15321t3.m66567a();
        } else {
            g4Var2 = g4Var;
        }
        if ((i2 & 4) != 0) {
            j3 = C8215i1.f20180a.mo12652a(oVar2, 6).mo14802A();
        } else {
            j3 = j;
        }
        if ((i2 & 8) != 0) {
            j4 = ColorSchemeKt.m25516c(j3, oVar2, (i3 >> 6) & 14);
        } else {
            j4 = j2;
        }
        if ((i2 & 16) != 0) {
            f3 = C16483g.m74435M((float) 0);
        } else {
            f3 = f;
        }
        if ((i2 & 32) != 0) {
            f4 = C16483g.m74435M((float) 0);
        } else {
            f4 = f2;
        }
        if ((i2 & 64) != 0) {
            iVar2 = null;
        } else {
            iVar2 = iVar;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-513881741, i3, -1, "androidx.compose.material3.Surface (Surface.kt:99)");
        }
        C8550i1 i1Var = f19741a;
        float M = C16483g.m74435M(((C16483g) oVar2.mo15032w(i1Var)).mo47823t0() + f3);
        CompositionLocalKt.m29856b(new C8572j1[]{ContentColorKt.m25558a().mo16141f(C15240j2.m66071n(j4)), i1Var.mo16141f(C16483g.m74451w(M))}, C8553b.m31048b(oVar2, -70914509, true, new SurfaceKt$Surface$1(mVar2, g4Var2, j3, M, i, iVar2, f4, pVar)), oVar2, 56);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
    }

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: b */
    public static final void m26353b(boolean z, @C12579k C11289a<C11079d2> aVar, @C12580l C8767m mVar, boolean z2, @C12580l C15218g4 g4Var, long j, long j2, float f, float f2, @C12580l C2223i iVar, @C12580l C2243g gVar, @C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar, @C12580l C8592o oVar, int i, int i2, int i3) {
        C8767m mVar2;
        boolean z3;
        C15218g4 g4Var2;
        long j3;
        long j4;
        float f3;
        float f4;
        C2223i iVar2;
        C2243g gVar2;
        C8592o oVar2 = oVar;
        int i4 = i;
        int i5 = i3;
        Intrinsics.checkNotNullParameter(aVar, "onClick");
        Intrinsics.checkNotNullParameter(pVar, "content");
        oVar2.mo14918M(540296512);
        if ((i5 & 4) != 0) {
            mVar2 = C8767m.f23478j;
        } else {
            mVar2 = mVar;
        }
        if ((i5 & 8) != 0) {
            z3 = true;
        } else {
            z3 = z2;
        }
        if ((i5 & 16) != 0) {
            g4Var2 = C15321t3.m66567a();
        } else {
            g4Var2 = g4Var;
        }
        if ((i5 & 32) != 0) {
            j3 = C8215i1.f20180a.mo12652a(oVar2, 6).mo14802A();
        } else {
            j3 = j;
        }
        if ((i5 & 64) != 0) {
            j4 = ColorSchemeKt.m25516c(j3, oVar2, (i4 >> 15) & 14);
        } else {
            j4 = j2;
        }
        if ((i5 & 128) != 0) {
            f3 = C16483g.m74435M((float) 0);
        } else {
            f3 = f;
        }
        if ((i5 & 256) != 0) {
            f4 = C16483g.m74435M((float) 0);
        } else {
            f4 = f2;
        }
        if ((i5 & 512) != 0) {
            iVar2 = null;
        } else {
            iVar2 = iVar;
        }
        if ((i5 & 1024) != 0) {
            oVar2.mo14918M(-492369756);
            Object N = oVar.mo14921N();
            if (N == C8592o.f23032a.mo16277a()) {
                N = C2242f.m9684a();
                oVar2.mo14893C(N);
            }
            oVar.mo15002m0();
            gVar2 = (C2243g) N;
        } else {
            gVar2 = gVar;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(540296512, i4, i2, "androidx.compose.material3.Surface (Surface.kt:309)");
        } else {
            int i6 = i2;
        }
        C8550i1 i1Var = f19741a;
        float M = C16483g.m74435M(((C16483g) oVar2.mo15032w(i1Var)).mo47823t0() + f3);
        C8572j1[] j1VarArr = {ContentColorKt.m25558a().mo16141f(C15240j2.m66071n(j4)), i1Var.mo16141f(C16483g.m74451w(M))};
        SurfaceKt$Surface$5 surfaceKt$Surface$5 = new SurfaceKt$Surface$5(mVar2, g4Var2, j3, M, i, iVar2, f4, z, gVar2, z3, aVar, pVar, i2);
        C8572j1[] j1VarArr2 = j1VarArr;
        CompositionLocalKt.m29856b(j1VarArr2, C8553b.m31048b(oVar2, -1164547968, true, surfaceKt$Surface$5), oVar2, 56);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
    }

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: c */
    public static final void m26354c(boolean z, @C12579k C11300l<? super Boolean, C11079d2> lVar, @C12580l C8767m mVar, boolean z2, @C12580l C15218g4 g4Var, long j, long j2, float f, float f2, @C12580l C2223i iVar, @C12580l C2243g gVar, @C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar, @C12580l C8592o oVar, int i, int i2, int i3) {
        C8767m mVar2;
        boolean z3;
        C15218g4 g4Var2;
        long j3;
        long j4;
        float f3;
        float f4;
        C2223i iVar2;
        C2243g gVar2;
        C8592o oVar2 = oVar;
        int i4 = i;
        int i5 = i3;
        Intrinsics.checkNotNullParameter(lVar, "onCheckedChange");
        Intrinsics.checkNotNullParameter(pVar, "content");
        oVar2.mo14918M(-1877401889);
        if ((i5 & 4) != 0) {
            mVar2 = C8767m.f23478j;
        } else {
            mVar2 = mVar;
        }
        if ((i5 & 8) != 0) {
            z3 = true;
        } else {
            z3 = z2;
        }
        if ((i5 & 16) != 0) {
            g4Var2 = C15321t3.m66567a();
        } else {
            g4Var2 = g4Var;
        }
        if ((i5 & 32) != 0) {
            j3 = C8215i1.f20180a.mo12652a(oVar2, 6).mo14802A();
        } else {
            j3 = j;
        }
        if ((i5 & 64) != 0) {
            j4 = ColorSchemeKt.m25516c(j3, oVar2, (i4 >> 15) & 14);
        } else {
            j4 = j2;
        }
        if ((i5 & 128) != 0) {
            f3 = C16483g.m74435M((float) 0);
        } else {
            f3 = f;
        }
        if ((i5 & 256) != 0) {
            f4 = C16483g.m74435M((float) 0);
        } else {
            f4 = f2;
        }
        if ((i5 & 512) != 0) {
            iVar2 = null;
        } else {
            iVar2 = iVar;
        }
        if ((i5 & 1024) != 0) {
            oVar2.mo14918M(-492369756);
            Object N = oVar.mo14921N();
            if (N == C8592o.f23032a.mo16277a()) {
                N = C2242f.m9684a();
                oVar2.mo14893C(N);
            }
            oVar.mo15002m0();
            gVar2 = (C2243g) N;
        } else {
            gVar2 = gVar;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1877401889, i4, i2, "androidx.compose.material3.Surface (Surface.kt:419)");
        } else {
            int i6 = i2;
        }
        C8550i1 i1Var = f19741a;
        float M = C16483g.m74435M(((C16483g) oVar2.mo15032w(i1Var)).mo47823t0() + f3);
        C8572j1[] j1VarArr = {ContentColorKt.m25558a().mo16141f(C15240j2.m66071n(j4)), i1Var.mo16141f(C16483g.m74451w(M))};
        SurfaceKt$Surface$7 surfaceKt$Surface$7 = new SurfaceKt$Surface$7(mVar2, g4Var2, j3, M, i, iVar2, f4, z, gVar2, z3, lVar, pVar, i2);
        C8572j1[] j1VarArr2 = j1VarArr;
        CompositionLocalKt.m29856b(j1VarArr2, C8553b.m31048b(oVar2, 712720927, true, surfaceKt$Surface$7), oVar2, 56);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
    }

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: d */
    public static final void m26355d(@C12579k C11289a<C11079d2> aVar, @C12580l C8767m mVar, boolean z, @C12580l C15218g4 g4Var, long j, long j2, float f, float f2, @C12580l C2223i iVar, @C12580l C2243g gVar, @C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar, @C12580l C8592o oVar, int i, int i2, int i3) {
        C2243g gVar2;
        C8592o oVar2 = oVar;
        int i4 = i;
        int i5 = i3;
        Intrinsics.checkNotNullParameter(aVar, "onClick");
        Intrinsics.checkNotNullParameter(pVar, "content");
        oVar2.mo14918M(-789752804);
        C8767m mVar2 = (i5 & 2) != 0 ? C8767m.f23478j : mVar;
        boolean z2 = (i5 & 4) != 0 ? true : z;
        C15218g4 a = (i5 & 8) != 0 ? C15321t3.m66567a() : g4Var;
        long A = (i5 & 16) != 0 ? C8215i1.f20180a.mo12652a(oVar2, 6).mo14802A() : j;
        long c = (i5 & 32) != 0 ? ColorSchemeKt.m25516c(A, oVar2, (i4 >> 12) & 14) : j2;
        float M = (i5 & 64) != 0 ? C16483g.m74435M((float) 0) : f;
        float M2 = (i5 & 128) != 0 ? C16483g.m74435M((float) 0) : f2;
        C2223i iVar2 = (i5 & 256) != 0 ? null : iVar;
        if ((i5 & 512) != 0) {
            oVar2.mo14918M(-492369756);
            Object N = oVar.mo14921N();
            if (N == C8592o.f23032a.mo16277a()) {
                N = C2242f.m9684a();
                oVar2.mo14893C(N);
            }
            oVar.mo15002m0();
            gVar2 = (C2243g) N;
        } else {
            gVar2 = gVar;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-789752804, i4, i2, "androidx.compose.material3.Surface (Surface.kt:201)");
        } else {
            int i6 = i2;
        }
        C8550i1 i1Var = f19741a;
        float M3 = C16483g.m74435M(((C16483g) oVar2.mo15032w(i1Var)).mo47823t0() + M);
        SurfaceKt$Surface$3 surfaceKt$Surface$3 = r1;
        SurfaceKt$Surface$3 surfaceKt$Surface$32 = new SurfaceKt$Surface$3(mVar2, a, A, M3, i, iVar2, M2, gVar2, z2, aVar, pVar, i2);
        CompositionLocalKt.m29856b(new C8572j1[]{ContentColorKt.m25558a().mo16141f(C15240j2.m66071n(c)), i1Var.mo16141f(C16483g.m74451w(M3))}, C8553b.m31048b(oVar2, 1279702876, true, surfaceKt$Surface$3), oVar2, 56);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
    }

    @C12579k
    /* renamed from: g */
    public static final C8550i1<C16483g> m26358g() {
        return f19741a;
    }

    /* renamed from: h */
    public static final C8767m m26359h(C8767m mVar, C15218g4 g4Var, long j, C2223i iVar, float f) {
        C8767m mVar2;
        C8767m b = ShadowKt.m32495b(mVar, f, g4Var, false, 0, 0, 24, (Object) null);
        if (iVar != null) {
            mVar2 = BorderKt.m8850f(C8767m.f23478j, iVar, g4Var);
        } else {
            mVar2 = C8767m.f23478j;
        }
        return C8744d.m32514a(BackgroundKt.m8824c(b.mo17224k3(mVar2), j, g4Var), g4Var);
    }

    @C8540g
    /* renamed from: i */
    public static final long m26360i(long j, float f, C8592o oVar, int i) {
        oVar.mo14918M(-2079918090);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-2079918090, i, -1, "androidx.compose.material3.surfaceColorAtElevation (Surface.kt:475)");
        }
        C8215i1 i1Var = C8215i1.f20180a;
        if (C15240j2.m66082y(j, i1Var.mo12652a(oVar, 6).mo14802A())) {
            j = ColorSchemeKt.m25523j(i1Var.mo12652a(oVar, 6), f);
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return j;
    }
}

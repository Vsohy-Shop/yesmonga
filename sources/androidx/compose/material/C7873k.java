package androidx.compose.material;

import androidx.compose.foundation.C2223i;
import androidx.compose.foundation.interaction.C2242f;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Card.kt\nandroidx/compose/material/CardKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,212:1\n154#2:213\n154#2:214\n154#2:222\n25#3:215\n25#3:223\n1114#4,6:216\n1114#4,6:224\n76#5:230\n*S KotlinDebug\n*F\n+ 1 Card.kt\nandroidx/compose/material/CardKt\n*L\n65#1:213\n116#1:214\n187#1:222\n117#1:215\n188#1:223\n117#1:216,6\n188#1:224,6\n189#1:230\n*E\n"})
/* renamed from: androidx.compose.material.k */
public final class C7873k {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: androidx.compose.foundation.interaction.g} */
    /* JADX WARNING: Multi-variable type inference failed */
    @kotlin.C11395k(level = kotlin.DeprecationLevel.f28050b, message = "This API is deprecated with the introduction a newer Card function overload that accepts an onClick().", replaceWith = @kotlin.C11587t0(expression = "Card(onClick, modifier, enabled, shape, backgroundColor, contentColor, border, elevation, interactionSource, content)", imports = {}))
    @androidx.compose.material.C3044g0
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m25024a(@org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r23, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r24, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.graphics.C15218g4 r25, long r26, long r28, @org.jetbrains.annotations.C12580l androidx.compose.foundation.C2223i r30, float r31, @org.jetbrains.annotations.C12580l androidx.compose.foundation.interaction.C2243g r32, @org.jetbrains.annotations.C12580l androidx.compose.foundation.C2104a0 r33, boolean r34, @org.jetbrains.annotations.C12580l java.lang.String r35, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.semantics.C16031g r36, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r37, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r38, int r39, int r40, int r41) {
        /*
            r15 = r38
            r0 = r39
            r1 = r40
            r2 = r41
            java.lang.String r3 = "onClick"
            r4 = r23
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r3)
            java.lang.String r3 = "content"
            r14 = r37
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r3)
            r3 = 1353606722(0x50ae6642, float:2.34074972E10)
            r15.mo14918M(r3)
            r5 = r2 & 2
            if (r5 == 0) goto L_0x0023
            androidx.compose.ui.m$a r5 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x0025
        L_0x0023:
            r5 = r24
        L_0x0025:
            r6 = r2 & 4
            r7 = 6
            if (r6 == 0) goto L_0x0035
            androidx.compose.material.t0 r6 = androidx.compose.material.C7933t0.f19075a
            androidx.compose.material.f1 r6 = r6.mo11076b(r15, r7)
            androidx.compose.foundation.shape.e r6 = r6.mo10757d()
            goto L_0x0037
        L_0x0035:
            r6 = r25
        L_0x0037:
            r8 = r2 & 8
            if (r8 == 0) goto L_0x0046
            androidx.compose.material.t0 r8 = androidx.compose.material.C7933t0.f19075a
            androidx.compose.material.q r7 = r8.mo11075a(r15, r7)
            long r7 = r7.mo10975n()
            goto L_0x0048
        L_0x0046:
            r7 = r26
        L_0x0048:
            r9 = r2 & 16
            if (r9 == 0) goto L_0x0055
            int r9 = r0 >> 9
            r9 = r9 & 14
            long r9 = androidx.compose.material.ColorsKt.m13381b(r7, r15, r9)
            goto L_0x0057
        L_0x0055:
            r9 = r28
        L_0x0057:
            r11 = r2 & 32
            if (r11 == 0) goto L_0x005d
            r11 = 0
            goto L_0x005f
        L_0x005d:
            r11 = r30
        L_0x005f:
            r13 = r2 & 64
            r12 = 1
            if (r13 == 0) goto L_0x006a
            float r13 = (float) r12
            float r13 = androidx.compose.p004ui.unit.C16483g.m74435M(r13)
            goto L_0x006c
        L_0x006a:
            r13 = r31
        L_0x006c:
            r12 = r2 & 128(0x80, float:1.794E-43)
            if (r12 == 0) goto L_0x0091
            r12 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r15.mo14918M(r12)
            java.lang.Object r12 = r38.mo14921N()
            androidx.compose.runtime.o$a r16 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r3 = r16.mo16277a()
            if (r12 != r3) goto L_0x0089
            androidx.compose.foundation.interaction.g r12 = androidx.compose.foundation.interaction.C2242f.m9684a()
            r15.mo14893C(r12)
        L_0x0089:
            r38.mo15002m0()
            r3 = r12
            androidx.compose.foundation.interaction.g r3 = (androidx.compose.foundation.interaction.C2243g) r3
            r12 = r3
            goto L_0x0093
        L_0x0091:
            r12 = r32
        L_0x0093:
            r3 = r2 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x00a4
            androidx.compose.runtime.i1 r3 = androidx.compose.foundation.IndicationKt.m8972a()
            java.lang.Object r3 = r15.mo15032w(r3)
            androidx.compose.foundation.a0 r3 = (androidx.compose.foundation.C2104a0) r3
            r19 = r3
            goto L_0x00a6
        L_0x00a4:
            r19 = r33
        L_0x00a6:
            r3 = r2 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x00ad
            r20 = 1
            goto L_0x00af
        L_0x00ad:
            r20 = r34
        L_0x00af:
            r3 = r2 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x00b6
            r21 = 0
            goto L_0x00b8
        L_0x00b6:
            r21 = r35
        L_0x00b8:
            r2 = r2 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L_0x00bf
            r22 = 0
            goto L_0x00c1
        L_0x00bf:
            r22 = r36
        L_0x00c1:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x00cf
            java.lang.String r2 = "androidx.compose.material.Card (Card.kt:179)"
            r3 = 1353606722(0x50ae6642, float:2.34074972E10)
            androidx.compose.runtime.ComposerKt.m29845w0(r3, r0, r1, r2)
        L_0x00cf:
            r2 = r0 & 14
            r3 = r0 & 112(0x70, float:1.57E-43)
            r2 = r2 | r3
            r3 = r0 & 896(0x380, float:1.256E-42)
            r2 = r2 | r3
            r3 = r0 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r3
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r0
            r2 = r2 | r3
            r3 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r0
            r2 = r2 | r3
            r3 = 3670016(0x380000, float:5.142788E-39)
            r3 = r3 & r0
            r2 = r2 | r3
            r3 = 29360128(0x1c00000, float:7.052966E-38)
            r3 = r3 & r0
            r2 = r2 | r3
            r3 = 234881024(0xe000000, float:1.5777218E-30)
            r3 = r3 & r0
            r2 = r2 | r3
            r3 = 1879048192(0x70000000, float:1.58456325E29)
            r0 = r0 & r3
            r16 = r2 | r0
            r0 = r1 & 14
            r2 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r1 = r1 & 896(0x380, float:1.256E-42)
            r17 = r0 | r1
            r18 = 0
            r0 = r23
            r1 = r5
            r2 = r6
            r3 = r7
            r5 = r9
            r7 = r11
            r8 = r13
            r9 = r12
            r10 = r19
            r11 = r20
            r12 = r21
            r13 = r22
            r14 = r37
            r15 = r38
            androidx.compose.material.SurfaceKt.m13878a(r0, r1, r2, r3, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0120
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0120:
            r38.mo15002m0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.C7873k.m25024a(kotlin.jvm.functions.a, androidx.compose.ui.m, androidx.compose.ui.graphics.g4, long, long, androidx.compose.foundation.i, float, androidx.compose.foundation.interaction.g, androidx.compose.foundation.a0, boolean, java.lang.String, androidx.compose.ui.semantics.g, kotlin.jvm.functions.p, androidx.compose.runtime.o, int, int, int):void");
    }

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: b */
    public static final void m25025b(@C12580l C8767m mVar, @C12580l C15218g4 g4Var, long j, long j2, @C12580l C2223i iVar, float f, @C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar, @C12580l C8592o oVar, int i, int i2) {
        C8767m mVar2;
        C15218g4 g4Var2;
        long j3;
        long j4;
        C2223i iVar2;
        float f2;
        C8592o oVar2 = oVar;
        int i3 = i;
        Intrinsics.checkNotNullParameter(pVar, "content");
        oVar2.mo14918M(1956755640);
        if ((i2 & 1) != 0) {
            mVar2 = C8767m.f23478j;
        } else {
            mVar2 = mVar;
        }
        if ((i2 & 2) != 0) {
            g4Var2 = C7933t0.f19075a.mo11076b(oVar2, 6).mo10757d();
        } else {
            g4Var2 = g4Var;
        }
        if ((i2 & 4) != 0) {
            j3 = C7933t0.f19075a.mo11075a(oVar2, 6).mo10975n();
        } else {
            j3 = j;
        }
        if ((i2 & 8) != 0) {
            j4 = ColorsKt.m13381b(j3, oVar2, (i3 >> 6) & 14);
        } else {
            j4 = j2;
        }
        if ((i2 & 16) != 0) {
            iVar2 = null;
        } else {
            iVar2 = iVar;
        }
        if ((i2 & 32) != 0) {
            f2 = C16483g.m74435M((float) 1);
        } else {
            f2 = f;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1956755640, i3, -1, "androidx.compose.material.Card (Card.kt:58)");
        }
        SurfaceKt.m13879b(mVar2, g4Var2, j3, j4, iVar2, f2, pVar, oVar, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (i3 & 3670016), 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
    }

    @C3044g0
    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: c */
    public static final void m25026c(@C12579k C11289a<C11079d2> aVar, @C12580l C8767m mVar, boolean z, @C12580l C15218g4 g4Var, long j, long j2, @C12580l C2223i iVar, float f, @C12580l C2243g gVar, @C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar, @C12580l C8592o oVar, int i, int i2) {
        C8767m mVar2;
        boolean z2;
        C15218g4 g4Var2;
        long j3;
        long j4;
        C2223i iVar2;
        float f2;
        C2243g gVar2;
        C8592o oVar2 = oVar;
        int i3 = i;
        int i4 = i2;
        Intrinsics.checkNotNullParameter(aVar, "onClick");
        Intrinsics.checkNotNullParameter(pVar, "content");
        oVar2.mo14918M(778538979);
        if ((i4 & 2) != 0) {
            mVar2 = C8767m.f23478j;
        } else {
            mVar2 = mVar;
        }
        if ((i4 & 4) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        if ((i4 & 8) != 0) {
            g4Var2 = C7933t0.f19075a.mo11076b(oVar2, 6).mo10757d();
        } else {
            g4Var2 = g4Var;
        }
        if ((i4 & 16) != 0) {
            j3 = C7933t0.f19075a.mo11075a(oVar2, 6).mo10975n();
        } else {
            j3 = j;
        }
        if ((i4 & 32) != 0) {
            j4 = ColorsKt.m13381b(j3, oVar2, (i3 >> 12) & 14);
        } else {
            j4 = j2;
        }
        if ((i4 & 64) != 0) {
            iVar2 = null;
        } else {
            iVar2 = iVar;
        }
        if ((i4 & 128) != 0) {
            f2 = C16483g.m74435M((float) 1);
        } else {
            f2 = f;
        }
        if ((i4 & 256) != 0) {
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
            ComposerKt.m29845w0(778538979, i3, -1, "androidx.compose.material.Card (Card.kt:107)");
        }
        SurfaceKt.m13880c(aVar, mVar2, z2, g4Var2, j3, j4, iVar2, f2, gVar2, pVar, oVar, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (29360128 & i3) | (234881024 & i3) | (i3 & 1879048192), 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
    }
}

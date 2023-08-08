package androidx.compose.material3;

import androidx.compose.material3.tokens.C8342u0;
import androidx.compose.material3.tokens.C8350y0;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8547h2
@C8251n0
@C11363r0({"SMAP\nSheetDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SheetDefaults.kt\nandroidx/compose/material3/BottomSheetDefaults\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,410:1\n36#2:411\n1114#3,6:412\n154#4:418\n*S KotlinDebug\n*F\n+ 1 SheetDefaults.kt\nandroidx/compose/material3/BottomSheetDefaults\n*L\n319#1:411\n319#1:412,6\n301#1:418\n*E\n"})
public final class BottomSheetDefaults {
    @C12579k

    /* renamed from: a */
    public static final BottomSheetDefaults f19174a = new BottomSheetDefaults();

    /* renamed from: b */
    public static final float f19175b = C8350y0.f22345a.mo14660h();

    /* renamed from: c */
    public static final float f19176c = C16483g.m74435M((float) 56);

    /* renamed from: d */
    public static final int f19177d = 0;

    /* JADX WARNING: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01ae  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11170a(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r25, float r26, float r27, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.graphics.C15218g4 r28, long r29, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r31, int r32, int r33) {
        /*
            r24 = this;
            r8 = r32
            r0 = -1364277227(0xffffffffaeaec815, float:-7.9481456E-11)
            r1 = r31
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r2 = r33 & 1
            if (r2 == 0) goto L_0x0015
            r3 = r8 | 6
            r4 = r3
            r3 = r25
            goto L_0x0029
        L_0x0015:
            r3 = r8 & 14
            if (r3 != 0) goto L_0x0026
            r3 = r25
            boolean r4 = r1.mo15006n0(r3)
            if (r4 == 0) goto L_0x0023
            r4 = 4
            goto L_0x0024
        L_0x0023:
            r4 = 2
        L_0x0024:
            r4 = r4 | r8
            goto L_0x0029
        L_0x0026:
            r3 = r25
            r4 = r8
        L_0x0029:
            r5 = r33 & 2
            if (r5 == 0) goto L_0x0030
            r4 = r4 | 48
            goto L_0x0043
        L_0x0030:
            r6 = r8 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0043
            r6 = r26
            boolean r7 = r1.mo14968d(r6)
            if (r7 == 0) goto L_0x003f
            r7 = 32
            goto L_0x0041
        L_0x003f:
            r7 = 16
        L_0x0041:
            r4 = r4 | r7
            goto L_0x0045
        L_0x0043:
            r6 = r26
        L_0x0045:
            r7 = r33 & 4
            if (r7 == 0) goto L_0x004c
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x005f
        L_0x004c:
            r9 = r8 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x005f
            r9 = r27
            boolean r10 = r1.mo14968d(r9)
            if (r10 == 0) goto L_0x005b
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r10 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r4 = r4 | r10
            goto L_0x0061
        L_0x005f:
            r9 = r27
        L_0x0061:
            r10 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r10 != 0) goto L_0x007a
            r10 = r33 & 8
            if (r10 != 0) goto L_0x0074
            r10 = r28
            boolean r11 = r1.mo15006n0(r10)
            if (r11 == 0) goto L_0x0076
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0078
        L_0x0074:
            r10 = r28
        L_0x0076:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0078:
            r4 = r4 | r11
            goto L_0x007c
        L_0x007a:
            r10 = r28
        L_0x007c:
            r11 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r8
            if (r11 != 0) goto L_0x0097
            r11 = r33 & 16
            if (r11 != 0) goto L_0x0091
            r11 = r29
            boolean r13 = r1.mo14980g(r11)
            if (r13 == 0) goto L_0x0093
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0095
        L_0x0091:
            r11 = r29
        L_0x0093:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0095:
            r4 = r4 | r13
            goto L_0x0099
        L_0x0097:
            r11 = r29
        L_0x0099:
            r13 = 46811(0xb6db, float:6.5596E-41)
            r13 = r13 & r4
            r14 = 9362(0x2492, float:1.3119E-41)
            if (r13 != r14) goto L_0x00b2
            boolean r13 = r1.mo15011p()
            if (r13 != 0) goto L_0x00a8
            goto L_0x00b2
        L_0x00a8:
            r1.mo14958a0()
            r2 = r3
            r3 = r6
            r4 = r9
            r5 = r10
            r6 = r11
            goto L_0x01a7
        L_0x00b2:
            r1.mo14930Q()
            r13 = r8 & 1
            r14 = -57345(0xffffffffffff1fff, float:NaN)
            r15 = 6
            if (r13 == 0) goto L_0x00d9
            boolean r13 = r1.mo14977f0()
            if (r13 == 0) goto L_0x00c4
            goto L_0x00d9
        L_0x00c4:
            r1.mo14958a0()
            r2 = r33 & 8
            if (r2 == 0) goto L_0x00cd
            r4 = r4 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00cd:
            r2 = r33 & 16
            if (r2 == 0) goto L_0x00d2
            r4 = r4 & r14
        L_0x00d2:
            r2 = r3
        L_0x00d3:
            r5 = r4
            r3 = r9
            r4 = r10
            r22 = r11
            goto L_0x0123
        L_0x00d9:
            if (r2 == 0) goto L_0x00de
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x00df
        L_0x00de:
            r2 = r3
        L_0x00df:
            if (r5 == 0) goto L_0x00e8
            androidx.compose.material3.tokens.y0 r3 = androidx.compose.material3.tokens.C8350y0.f22345a
            float r3 = r3.mo14658f()
            r6 = r3
        L_0x00e8:
            if (r7 == 0) goto L_0x00f1
            androidx.compose.material3.tokens.y0 r3 = androidx.compose.material3.tokens.C8350y0.f22345a
            float r3 = r3.mo14657e()
            r9 = r3
        L_0x00f1:
            r3 = r33 & 8
            if (r3 == 0) goto L_0x0102
            androidx.compose.material3.i1 r3 = androidx.compose.material3.C8215i1.f20180a
            androidx.compose.material3.n2 r3 = r3.mo12653b(r1, r15)
            androidx.compose.foundation.shape.e r3 = r3.mo12873c()
            r4 = r4 & -7169(0xffffffffffffe3ff, float:NaN)
            r10 = r3
        L_0x0102:
            r3 = r33 & 16
            if (r3 == 0) goto L_0x00d3
            androidx.compose.material3.tokens.y0 r3 = androidx.compose.material3.tokens.C8350y0.f22345a
            androidx.compose.material3.tokens.ColorSchemeKeyTokens r3 = r3.mo14656d()
            long r16 = androidx.compose.material3.ColorSchemeKt.m25524k(r3, r1, r15)
            r18 = 1053609165(0x3ecccccd, float:0.4)
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 14
            r23 = 0
            long r11 = androidx.compose.p004ui.graphics.C15240j2.m66080w(r16, r18, r19, r20, r21, r22, r23)
            r4 = r4 & r14
            goto L_0x00d3
        L_0x0123:
            r1.mo14899E()
            boolean r7 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r7 == 0) goto L_0x0132
            r7 = -1
            java.lang.String r9 = "androidx.compose.material3.BottomSheetDefaults.DragHandle (SheetDefaults.kt:306)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r5, r7, r9)
        L_0x0132:
            androidx.compose.material3.t2$a r0 = androidx.compose.material3.C8284t2.f20507b
            int r0 = r0.mo13044c()
            java.lang.String r0 = androidx.compose.material3.C8357u2.m29348a(r0, r1, r15)
            r7 = 0
            float r9 = androidx.compose.material3.SheetDefaultsKt.f19640a
            r10 = 1
            r11 = 0
            androidx.compose.ui.m r7 = androidx.compose.foundation.layout.PaddingKt.m10026m(r2, r7, r9, r10, r11)
            r9 = 1157296644(0x44faf204, float:2007.563)
            r1.mo14918M(r9)
            boolean r9 = r1.mo15006n0(r0)
            java.lang.Object r12 = r1.mo14921N()
            if (r9 != 0) goto L_0x015f
            androidx.compose.runtime.o$a r9 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r9 = r9.mo16277a()
            if (r12 != r9) goto L_0x0167
        L_0x015f:
            androidx.compose.material3.BottomSheetDefaults$DragHandle$1$1 r12 = new androidx.compose.material3.BottomSheetDefaults$DragHandle$1$1
            r12.<init>(r0)
            r1.mo14893C(r12)
        L_0x0167:
            r1.mo15002m0()
            kotlin.jvm.functions.l r12 = (kotlin.jvm.functions.C11300l) r12
            r0 = 0
            androidx.compose.ui.m r9 = androidx.compose.p004ui.semantics.SemanticsModifierKt.m71868c(r7, r0, r12, r10, r11)
            r13 = 0
            r0 = 0
            r16 = 0
            r17 = 0
            androidx.compose.material3.BottomSheetDefaults$DragHandle$2 r7 = new androidx.compose.material3.BottomSheetDefaults$DragHandle$2
            r7.<init>(r6, r3)
            r11 = -1039573072(0xffffffffc2095fb0, float:-34.343445)
            androidx.compose.runtime.internal.a r18 = androidx.compose.runtime.internal.C8553b.m31048b(r1, r11, r10, r7)
            int r5 = r5 >> r15
            r7 = r5 & 112(0x70, float:1.57E-43)
            r10 = 12582912(0xc00000, float:1.7632415E-38)
            r7 = r7 | r10
            r5 = r5 & 896(0x380, float:1.256E-42)
            r20 = r7 | r5
            r21 = 120(0x78, float:1.68E-43)
            r10 = r4
            r11 = r22
            r15 = r0
            r19 = r1
            androidx.compose.material3.SurfaceKt.m26352a(r9, r10, r11, r13, r15, r16, r17, r18, r19, r20, r21)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x01a2
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01a2:
            r5 = r4
            r4 = r3
            r3 = r6
            r6 = r22
        L_0x01a7:
            androidx.compose.runtime.t1 r10 = r1.mo15020s()
            if (r10 != 0) goto L_0x01ae
            goto L_0x01bd
        L_0x01ae:
            androidx.compose.material3.BottomSheetDefaults$DragHandle$3 r11 = new androidx.compose.material3.BottomSheetDefaults$DragHandle$3
            r0 = r11
            r1 = r24
            r8 = r32
            r9 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r9)
            r10.mo15202a(r11)
        L_0x01bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.BottomSheetDefaults.mo11170a(androidx.compose.ui.m, float, float, androidx.compose.ui.graphics.g4, long, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C11314h(name = "getContainerColor")
    /* renamed from: b */
    public final long mo11171b(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(433375448);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(433375448, i, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ContainerColor> (SheetDefaults.kt:286)");
        }
        long k = ColorSchemeKt.m25524k(C8350y0.f22345a.mo14653a(), oVar, 6);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return k;
    }

    /* renamed from: c */
    public final float mo11172c() {
        return f19175b;
    }

    @C8540g
    @C11314h(name = "getExpandedShape")
    @C12579k
    /* renamed from: d */
    public final C15218g4 mo11173d(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(1683783414);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1683783414, i, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ExpandedShape> (SheetDefaults.kt:281)");
        }
        C15218g4 f = ShapesKt.m26127f(C8350y0.f22345a.mo14654b(), oVar, 6);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return f;
    }

    @C8540g
    @C11314h(name = "getHiddenShape")
    @C12579k
    /* renamed from: e */
    public final C15218g4 mo11174e(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(-1971658024);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1971658024, i, -1, "androidx.compose.material3.BottomSheetDefaults.<get-HiddenShape> (SheetDefaults.kt:276)");
        }
        C15218g4 f = ShapesKt.m26127f(C8350y0.f22345a.mo14659g(), oVar, 6);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return f;
    }

    @C8540g
    @C11314h(name = "getScrimColor")
    /* renamed from: f */
    public final long mo11175f(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(-2040719176);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-2040719176, i, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ScrimColor> (SheetDefaults.kt:294)");
        }
        long w = C15240j2.m66080w(ColorSchemeKt.m25524k(C8342u0.f22170a.mo14500a(), oVar, 6), 0.32f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return w;
    }

    /* renamed from: g */
    public final float mo11176g() {
        return f19176c;
    }
}

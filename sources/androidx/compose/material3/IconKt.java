package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.C8290b0;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.draw.C8754l;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.C15320t2;
import androidx.compose.p004ui.graphics.C15403w2;
import androidx.compose.p004ui.graphics.painter.C15292a;
import androidx.compose.p004ui.graphics.painter.Painter;
import androidx.compose.p004ui.layout.C15541c;
import androidx.compose.p004ui.semantics.SemanticsModifierKt;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nIcon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Icon.kt\nandroidx/compose/material3/IconKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,169:1\n76#2:170\n76#2:171\n76#2:179\n36#3:172\n36#3:180\n1114#4,6:173\n1114#4,6:181\n*S KotlinDebug\n*F\n+ 1 Icon.kt\nandroidx/compose/material3/IconKt\n*L\n65#1:170\n100#1:171\n136#1:179\n102#1:172\n141#1:180\n102#1:173,6\n141#1:181,6\n*E\n"})
public final class IconKt {
    @C12579k

    /* renamed from: a */
    public static final C8767m f19442a = SizeKt.m10087C(C8767m.f23478j, C8290b0.f20733a.mo13195b());

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m25823a(@C12579k C15403w2 w2Var, @C12580l String str, @C12580l C8767m mVar, long j, @C12580l C8592o oVar, int i, int i2) {
        C8767m.C8768a aVar;
        long j2;
        int i3;
        C15403w2 w2Var2 = w2Var;
        Intrinsics.checkNotNullParameter(w2Var2, "bitmap");
        C8592o o = oVar.mo15009o(-1092052280);
        if ((i2 & 4) != 0) {
            aVar = C8767m.f23478j;
        } else {
            aVar = mVar;
        }
        if ((i2 & 8) != 0) {
            j2 = ((C15240j2) o.mo15032w(ContentColorKt.m25558a())).mo42833M();
            i3 = i & -7169;
        } else {
            j2 = j;
            i3 = i;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1092052280, i3, -1, "androidx.compose.material3.Icon (Icon.kt:95)");
        }
        o.mo14918M(1157296644);
        boolean n0 = o.mo15006n0(w2Var2);
        Object N = o.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            C15292a aVar2 = new C15292a(w2Var, 0, 0, 6, (DefaultConstructorMarker) null);
            o.mo14893C(aVar2);
            N = aVar2;
        }
        o.mo15002m0();
        C8592o oVar2 = o;
        m25824b((C15292a) N, str, aVar, j2, o, (i3 & 112) | 8 | (i3 & 896) | (i3 & 7168), 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new IconKt$Icon$2(w2Var, str, aVar, j2, i, i2));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m25824b(@C12579k Painter painter, @C12580l String str, @C12580l C8767m mVar, long j, @C12580l C8592o oVar, int i, int i2) {
        C8767m.C8768a aVar;
        long j2;
        int i3;
        C15249k2 k2Var;
        C8767m mVar2;
        Painter painter2 = painter;
        String str2 = str;
        Intrinsics.checkNotNullParameter(painter2, "painter");
        C8592o o = oVar.mo15009o(-2142239481);
        if ((i2 & 4) != 0) {
            aVar = C8767m.f23478j;
        } else {
            aVar = mVar;
        }
        if ((i2 & 8) != 0) {
            i3 = i & -7169;
            j2 = ((C15240j2) o.mo15032w(ContentColorKt.m25558a())).mo42833M();
        } else {
            j2 = j;
            i3 = i;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-2142239481, i3, -1, "androidx.compose.material3.Icon (Icon.kt:131)");
        }
        if (C15240j2.m66082y(j2, C15240j2.f37547b.mo42851u())) {
            k2Var = null;
        } else {
            k2Var = C15249k2.C15250a.m66144d(C15249k2.f37569b, j2, 0, 2, (Object) null);
        }
        o.mo14918M(69356817);
        if (str2 != null) {
            C8767m.C8768a aVar2 = C8767m.f23478j;
            o.mo14918M(1157296644);
            boolean n0 = o.mo15006n0(str2);
            Object N = o.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                N = new IconKt$Icon$semantics$1$1(str2);
                o.mo14893C(N);
            }
            o.mo15002m0();
            mVar2 = SemanticsModifierKt.m71868c(aVar2, false, (C11300l) N, 1, (Object) null);
        } else {
            mVar2 = C8767m.f23478j;
        }
        o.mo15002m0();
        long j3 = j2;
        BoxKt.m9839a(C8754l.m32556b(m25826d(C15320t2.m66566j(aVar), painter2), painter, false, (C8734c) null, C15541c.f38696a.mo44373i(), 0.0f, k2Var, 22, (Object) null).mo17224k3(mVar2), o, 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new IconKt$Icon$3(painter, str, aVar, j3, i, i2));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m25825c(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.graphics.vector.C15340c r17, @org.jetbrains.annotations.C12580l java.lang.String r18, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r19, long r20, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r22, int r23, int r24) {
        /*
            r1 = r17
            r6 = r23
            java.lang.String r0 = "imageVector"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = -126890956(0xfffffffff86fcc34, float:-1.9454698E34)
            r2 = r22
            androidx.compose.runtime.o r2 = r2.mo15009o(r0)
            r3 = r24 & 1
            if (r3 == 0) goto L_0x0019
            r3 = r6 | 6
            goto L_0x0029
        L_0x0019:
            r3 = r6 & 14
            if (r3 != 0) goto L_0x0028
            boolean r3 = r2.mo15006n0(r1)
            if (r3 == 0) goto L_0x0025
            r3 = 4
            goto L_0x0026
        L_0x0025:
            r3 = 2
        L_0x0026:
            r3 = r3 | r6
            goto L_0x0029
        L_0x0028:
            r3 = r6
        L_0x0029:
            r4 = r24 & 2
            if (r4 == 0) goto L_0x0030
            r3 = r3 | 48
            goto L_0x0043
        L_0x0030:
            r4 = r6 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0043
            r4 = r18
            boolean r5 = r2.mo15006n0(r4)
            if (r5 == 0) goto L_0x003f
            r5 = 32
            goto L_0x0041
        L_0x003f:
            r5 = 16
        L_0x0041:
            r3 = r3 | r5
            goto L_0x0045
        L_0x0043:
            r4 = r18
        L_0x0045:
            r5 = r24 & 4
            if (r5 == 0) goto L_0x004c
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x005f
        L_0x004c:
            r7 = r6 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x005f
            r7 = r19
            boolean r8 = r2.mo15006n0(r7)
            if (r8 == 0) goto L_0x005b
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r3 = r3 | r8
            goto L_0x0061
        L_0x005f:
            r7 = r19
        L_0x0061:
            r8 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x007a
            r8 = r24 & 8
            if (r8 != 0) goto L_0x0074
            r8 = r20
            boolean r10 = r2.mo14980g(r8)
            if (r10 == 0) goto L_0x0076
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0078
        L_0x0074:
            r8 = r20
        L_0x0076:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0078:
            r3 = r3 | r10
            goto L_0x007c
        L_0x007a:
            r8 = r20
        L_0x007c:
            r10 = r3 & 5851(0x16db, float:8.199E-42)
            r11 = 1170(0x492, float:1.64E-42)
            if (r10 != r11) goto L_0x008f
            boolean r10 = r2.mo15011p()
            if (r10 != 0) goto L_0x0089
            goto L_0x008f
        L_0x0089:
            r2.mo14958a0()
            r3 = r7
            goto L_0x00fa
        L_0x008f:
            r2.mo14930Q()
            r10 = r6 & 1
            if (r10 == 0) goto L_0x00a8
            boolean r10 = r2.mo14977f0()
            if (r10 == 0) goto L_0x009d
            goto L_0x00a8
        L_0x009d:
            r2.mo14958a0()
            r5 = r24 & 8
            if (r5 == 0) goto L_0x00a6
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00a6:
            r5 = r7
            goto L_0x00c4
        L_0x00a8:
            if (r5 == 0) goto L_0x00ad
            androidx.compose.ui.m$a r5 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x00ae
        L_0x00ad:
            r5 = r7
        L_0x00ae:
            r7 = r24 & 8
            if (r7 == 0) goto L_0x00c4
            androidx.compose.runtime.i1 r7 = androidx.compose.material3.ContentColorKt.m25558a()
            java.lang.Object r7 = r2.mo15032w(r7)
            androidx.compose.ui.graphics.j2 r7 = (androidx.compose.p004ui.graphics.C15240j2) r7
            long r7 = r7.mo42833M()
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            r15 = r7
            goto L_0x00c5
        L_0x00c4:
            r15 = r8
        L_0x00c5:
            r2.mo14899E()
            boolean r7 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r7 == 0) goto L_0x00d4
            r7 = -1
            java.lang.String r8 = "androidx.compose.material3.Icon (Icon.kt:60)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r3, r7, r8)
        L_0x00d4:
            r0 = r3 & 14
            androidx.compose.ui.graphics.vector.VectorPainter r7 = androidx.compose.p004ui.graphics.vector.VectorPainterKt.m66824c(r1, r2, r0)
            int r0 = androidx.compose.p004ui.graphics.vector.VectorPainter.f37795Y
            r8 = r3 & 112(0x70, float:1.57E-43)
            r0 = r0 | r8
            r8 = r3 & 896(0x380, float:1.256E-42)
            r0 = r0 | r8
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r13 = r0 | r3
            r14 = 0
            r8 = r18
            r9 = r5
            r10 = r15
            r12 = r2
            m25824b(r7, r8, r9, r10, r12, r13, r14)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x00f8
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00f8:
            r3 = r5
            r8 = r15
        L_0x00fa:
            androidx.compose.runtime.t1 r10 = r2.mo15020s()
            if (r10 != 0) goto L_0x0101
            goto L_0x0113
        L_0x0101:
            androidx.compose.material3.IconKt$Icon$1 r11 = new androidx.compose.material3.IconKt$Icon$1
            r0 = r11
            r1 = r17
            r2 = r18
            r4 = r8
            r6 = r23
            r7 = r24
            r0.<init>(r1, r2, r3, r4, r6, r7)
            r10.mo15202a(r11)
        L_0x0113:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.IconKt.m25825c(androidx.compose.ui.graphics.vector.c, java.lang.String, androidx.compose.ui.m, long, androidx.compose.runtime.o, int, int):void");
    }

    /* renamed from: d */
    public static final C8767m m25826d(C8767m mVar, Painter painter) {
        C8767m mVar2;
        if (C15104m.m65014k(painter.mo42949l(), C15104m.f37280b.mo42316a()) || m25827e(painter.mo42949l())) {
            mVar2 = f19442a;
        } else {
            mVar2 = C8767m.f23478j;
        }
        return mVar.mo17224k3(mVar2);
    }

    /* renamed from: e */
    public static final boolean m25827e(long j) {
        return Float.isInfinite(C15104m.m65023t(j)) && Float.isInfinite(C15104m.m65016m(j));
    }
}

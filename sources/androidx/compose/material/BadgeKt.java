package androidx.compose.material;

import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.C16506u;
import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nBadge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Badge.kt\nandroidx/compose/material/BadgeKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,187:1\n74#2:188\n75#2,11:190\n75#2:217\n76#2,11:219\n89#2:247\n75#2:255\n76#2,11:257\n89#2:285\n88#2:290\n75#2:294\n76#2,11:296\n89#2:324\n76#3:189\n76#3:218\n76#3:256\n76#3:295\n456#4,11:201\n460#4,13:230\n473#4,3:244\n460#4,13:268\n473#4,3:282\n467#4,3:287\n460#4,13:307\n473#4,3:321\n68#5,5:212\n73#5:243\n77#5:248\n67#5,6:249\n73#5:281\n77#5:286\n92#6:291\n64#6:330\n64#6:332\n79#7,2:292\n81#7:320\n85#7:325\n154#8:326\n154#8:327\n154#8:328\n154#8:329\n154#8:331\n*S KotlinDebug\n*F\n+ 1 Badge.kt\nandroidx/compose/material/BadgeKt\n*L\n64#1:188\n64#1:190,11\n66#1:217\n66#1:219,11\n66#1:247\n71#1:255\n71#1:257,11\n71#1:285\n64#1:290\n140#1:294\n140#1:296,11\n140#1:324\n64#1:189\n66#1:218\n71#1:256\n140#1:295\n64#1:201,11\n66#1:230,13\n66#1:244,3\n71#1:268,13\n71#1:282,3\n64#1:287,3\n140#1:307,13\n140#1:321,3\n66#1:212,5\n66#1:243\n66#1:248\n71#1:249,6\n71#1:281\n71#1:286\n142#1:291\n182#1:330\n186#1:332\n140#1:292,2\n140#1:320\n140#1:325\n169#1:326\n172#1:327\n178#1:328\n182#1:329\n186#1:331\n*E\n"})
public final class BadgeKt {

    /* renamed from: a */
    public static final float f7523a;

    /* renamed from: b */
    public static final float f7524b = C16483g.m74435M((float) 8);

    /* renamed from: c */
    public static final long f7525c = C16506u.m74712m(10);

    /* renamed from: d */
    public static final float f7526d;

    /* renamed from: e */
    public static final float f7527e = C16483g.m74435M(-C16483g.m74435M((float) 6));

    /* renamed from: f */
    public static final float f7528f;

    static {
        float f = (float) 4;
        f7523a = C16483g.m74435M(f);
        f7526d = C16483g.m74435M(f);
        f7528f = C16483g.m74435M(-C16483g.m74435M(f));
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m13251a(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r16, long r17, long r19, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2411u0, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r21, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r22, int r23, int r24) {
        /*
            r7 = r23
            r0 = 1133484502(0x438f99d6, float:287.20184)
            r1 = r22
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r2 = r24 & 1
            r3 = 2
            if (r2 == 0) goto L_0x0016
            r4 = r7 | 6
            r5 = r4
            r4 = r16
            goto L_0x002a
        L_0x0016:
            r4 = r7 & 14
            if (r4 != 0) goto L_0x0027
            r4 = r16
            boolean r5 = r1.mo15006n0(r4)
            if (r5 == 0) goto L_0x0024
            r5 = 4
            goto L_0x0025
        L_0x0024:
            r5 = r3
        L_0x0025:
            r5 = r5 | r7
            goto L_0x002a
        L_0x0027:
            r4 = r16
            r5 = r7
        L_0x002a:
            r6 = r7 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0041
            r6 = r24 & 2
            r8 = r17
            if (r6 != 0) goto L_0x003d
            boolean r6 = r1.mo14980g(r8)
            if (r6 == 0) goto L_0x003d
            r6 = 32
            goto L_0x003f
        L_0x003d:
            r6 = 16
        L_0x003f:
            r5 = r5 | r6
            goto L_0x0043
        L_0x0041:
            r8 = r17
        L_0x0043:
            r6 = r7 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x005a
            r6 = r24 & 4
            r10 = r19
            if (r6 != 0) goto L_0x0056
            boolean r6 = r1.mo14980g(r10)
            if (r6 == 0) goto L_0x0056
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0058
        L_0x0056:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0058:
            r5 = r5 | r6
            goto L_0x005c
        L_0x005a:
            r10 = r19
        L_0x005c:
            r6 = r24 & 8
            if (r6 == 0) goto L_0x0063
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            goto L_0x0076
        L_0x0063:
            r12 = r7 & 7168(0x1c00, float:1.0045E-41)
            if (r12 != 0) goto L_0x0076
            r12 = r21
            boolean r13 = r1.mo14927P(r12)
            if (r13 == 0) goto L_0x0072
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x0074
        L_0x0072:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x0074:
            r5 = r5 | r13
            goto L_0x0078
        L_0x0076:
            r12 = r21
        L_0x0078:
            r13 = r5 & 5851(0x16db, float:8.199E-42)
            r14 = 1170(0x492, float:1.64E-42)
            if (r13 != r14) goto L_0x008c
            boolean r13 = r1.mo15011p()
            if (r13 != 0) goto L_0x0085
            goto L_0x008c
        L_0x0085:
            r1.mo14958a0()
        L_0x0088:
            r2 = r8
            r6 = r12
            goto L_0x01f4
        L_0x008c:
            r1.mo14930Q()
            r13 = r7 & 1
            r14 = 0
            r15 = 6
            if (r13 == 0) goto L_0x00ad
            boolean r13 = r1.mo14977f0()
            if (r13 == 0) goto L_0x009c
            goto L_0x00ad
        L_0x009c:
            r1.mo14958a0()
            r2 = r24 & 2
            if (r2 == 0) goto L_0x00a5
            r5 = r5 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00a5:
            r2 = r24 & 4
            if (r2 == 0) goto L_0x00ab
            r5 = r5 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00ab:
            r2 = r4
            goto L_0x00d5
        L_0x00ad:
            if (r2 == 0) goto L_0x00b2
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x00b3
        L_0x00b2:
            r2 = r4
        L_0x00b3:
            r4 = r24 & 2
            if (r4 == 0) goto L_0x00c3
            androidx.compose.material.t0 r4 = androidx.compose.material.C7933t0.f19075a
            androidx.compose.material.q r4 = r4.mo11075a(r1, r15)
            long r8 = r4.mo10965d()
            r5 = r5 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00c3:
            r4 = r24 & 4
            if (r4 == 0) goto L_0x00d2
            int r4 = r5 >> 3
            r4 = r4 & 14
            long r10 = androidx.compose.material.ColorsKt.m13381b(r8, r1, r4)
            r4 = r5 & -897(0xfffffffffffffc7f, float:NaN)
            r5 = r4
        L_0x00d2:
            if (r6 == 0) goto L_0x00d5
            r12 = r14
        L_0x00d5:
            r1.mo14899E()
            boolean r4 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r4 == 0) goto L_0x00e4
            r4 = -1
            java.lang.String r6 = "androidx.compose.material.Badge (Badge.kt:129)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r5, r4, r6)
        L_0x00e4:
            if (r12 == 0) goto L_0x00e9
            float r0 = f7524b
            goto L_0x00eb
        L_0x00e9:
            float r0 = f7523a
        L_0x00eb:
            androidx.compose.foundation.shape.n r4 = androidx.compose.foundation.shape.C2694o.m12166h(r0)
            float r6 = (float) r3
            float r0 = r0 * r6
            float r6 = androidx.compose.p004ui.unit.C16483g.m74435M(r0)
            float r0 = androidx.compose.p004ui.unit.C16483g.m74435M(r0)
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.SizeKt.m10107g(r2, r6, r0)
            androidx.compose.ui.m r0 = androidx.compose.foundation.BackgroundKt.m8824c(r0, r8, r4)
            androidx.compose.ui.m r0 = androidx.compose.p004ui.draw.C8744d.m32514a(r0, r4)
            float r4 = f7526d
            r6 = 0
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.PaddingKt.m10026m(r0, r4, r6, r3, r14)
            androidx.compose.ui.c$a r3 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$c r3 = r3.mo17070q()
            androidx.compose.foundation.layout.Arrangement r4 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$e r4 = r4.mo7625f()
            r6 = 693286680(0x2952b718, float:4.6788176E-14)
            r1.mo14918M(r6)
            r6 = 54
            androidx.compose.ui.layout.f0 r3 = androidx.compose.foundation.layout.RowKt.m10071d(r4, r3, r1, r6)
            r4 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.mo14918M(r4)
            androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r4 = r1.mo15032w(r4)
            androidx.compose.ui.unit.d r4 = (androidx.compose.p004ui.unit.C16479d) r4
            androidx.compose.runtime.i1 r6 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r6 = r1.mo15032w(r6)
            androidx.compose.ui.unit.LayoutDirection r6 = (androidx.compose.p004ui.unit.LayoutDirection) r6
            androidx.compose.runtime.i1 r13 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r13 = r1.mo15032w(r13)
            androidx.compose.ui.platform.c4 r13 = (androidx.compose.p004ui.platform.C15863c4) r13
            androidx.compose.ui.node.ComposeUiNode$Companion r14 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r15 = r14.mo44585a()
            kotlin.jvm.functions.q r0 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r0)
            r16 = r2
            androidx.compose.runtime.d r2 = r1.mo15017r()
            boolean r2 = r2 instanceof androidx.compose.runtime.C8428d
            if (r2 != 0) goto L_0x015f
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x015f:
            r1.mo14938T()
            boolean r2 = r1.mo14997l()
            if (r2 == 0) goto L_0x016c
            r1.mo14947W(r15)
            goto L_0x016f
        L_0x016c:
            r1.mo14888A()
        L_0x016f:
            r1.mo14941U()
            androidx.compose.runtime.o r2 = androidx.compose.runtime.Updater.m30180b(r1)
            kotlin.jvm.functions.p r15 = r14.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r2, r3, r15)
            kotlin.jvm.functions.p r3 = r14.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r2, r4, r3)
            kotlin.jvm.functions.p r3 = r14.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r2, r6, r3)
            kotlin.jvm.functions.p r3 = r14.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r2, r13, r3)
            r1.mo14972e()
            androidx.compose.runtime.o r2 = androidx.compose.runtime.C8684u1.m31906b(r1)
            androidx.compose.runtime.u1 r2 = androidx.compose.runtime.C8684u1.m31905a(r2)
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r0.invoke(r2, r1, r4)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.mo14918M(r0)
            androidx.compose.foundation.layout.RowScopeInstance r0 = androidx.compose.foundation.layout.RowScopeInstance.f6147a
            r2 = 521574215(0x1f169747, float:3.188887E-20)
            r1.mo14918M(r2)
            if (r12 == 0) goto L_0x01d8
            r2 = 1
            androidx.compose.runtime.j1[] r4 = new androidx.compose.runtime.C8572j1[r2]
            androidx.compose.runtime.i1 r6 = androidx.compose.material.ContentColorKt.m13406a()
            androidx.compose.ui.graphics.j2 r13 = androidx.compose.p004ui.graphics.C15240j2.m66071n(r10)
            androidx.compose.runtime.j1 r6 = r6.mo16141f(r13)
            r4[r3] = r6
            androidx.compose.material.BadgeKt$Badge$1$1 r3 = new androidx.compose.material.BadgeKt$Badge$1$1
            r6 = 6
            r3.<init>(r12, r0, r6, r5)
            r0 = 1784526485(0x6a5db695, float:6.7008706E25)
            androidx.compose.runtime.internal.a r0 = androidx.compose.runtime.internal.C8553b.m31048b(r1, r0, r2, r3)
            r2 = 56
            androidx.compose.runtime.CompositionLocalKt.m29856b(r4, r0, r1, r2)
        L_0x01d8:
            r1.mo15002m0()
            r1.mo15002m0()
            r1.mo14896D()
            r1.mo15002m0()
            r1.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x01f0
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01f0:
            r4 = r16
            goto L_0x0088
        L_0x01f4:
            androidx.compose.runtime.t1 r9 = r1.mo15020s()
            if (r9 != 0) goto L_0x01fb
            goto L_0x020a
        L_0x01fb:
            androidx.compose.material.BadgeKt$Badge$2 r12 = new androidx.compose.material.BadgeKt$Badge$2
            r0 = r12
            r1 = r4
            r4 = r10
            r7 = r23
            r8 = r24
            r0.<init>(r1, r2, r4, r6, r7, r8)
            r9.mo15202a(r12)
        L_0x020a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BadgeKt.m13251a(androidx.compose.ui.m, long, long, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x02ce  */
    /* JADX WARNING: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m13252b(@org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2362h, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r18, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r19, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2362h, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r20, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r21, int r22, int r23) {
        /*
            r1 = r18
            r3 = r20
            r4 = r22
            java.lang.String r0 = "badge"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r2 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            r2 = 859805272(0x333f9658, float:4.460739E-8)
            r5 = r21
            androidx.compose.runtime.o r5 = r5.mo15009o(r2)
            r6 = r23 & 1
            if (r6 == 0) goto L_0x0020
            r6 = r4 | 6
            goto L_0x0030
        L_0x0020:
            r6 = r4 & 14
            if (r6 != 0) goto L_0x002f
            boolean r6 = r5.mo14927P(r1)
            if (r6 == 0) goto L_0x002c
            r6 = 4
            goto L_0x002d
        L_0x002c:
            r6 = 2
        L_0x002d:
            r6 = r6 | r4
            goto L_0x0030
        L_0x002f:
            r6 = r4
        L_0x0030:
            r7 = r23 & 2
            if (r7 == 0) goto L_0x0037
            r6 = r6 | 48
            goto L_0x004a
        L_0x0037:
            r8 = r4 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x004a
            r8 = r19
            boolean r9 = r5.mo15006n0(r8)
            if (r9 == 0) goto L_0x0046
            r9 = 32
            goto L_0x0048
        L_0x0046:
            r9 = 16
        L_0x0048:
            r6 = r6 | r9
            goto L_0x004c
        L_0x004a:
            r8 = r19
        L_0x004c:
            r9 = r23 & 4
            if (r9 == 0) goto L_0x0053
            r6 = r6 | 384(0x180, float:5.38E-43)
            goto L_0x0063
        L_0x0053:
            r9 = r4 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x0063
            boolean r9 = r5.mo14927P(r3)
            if (r9 == 0) goto L_0x0060
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r6 = r6 | r9
        L_0x0063:
            r9 = r6 & 731(0x2db, float:1.024E-42)
            r10 = 146(0x92, float:2.05E-43)
            if (r9 != r10) goto L_0x0078
            boolean r9 = r5.mo15011p()
            if (r9 != 0) goto L_0x0070
            goto L_0x0078
        L_0x0070:
            r5.mo14958a0()
            r2 = r1
            r17 = r8
            goto L_0x02c7
        L_0x0078:
            if (r7 == 0) goto L_0x007d
            androidx.compose.ui.m$a r7 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x007e
        L_0x007d:
            r7 = r8
        L_0x007e:
            boolean r8 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r8 == 0) goto L_0x008a
            r8 = -1
            java.lang.String r9 = "androidx.compose.material.BadgedBox (Badge.kt:58)"
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r6, r8, r9)
        L_0x008a:
            androidx.compose.material.BadgeKt$BadgedBox$2 r2 = androidx.compose.material.BadgeKt$BadgedBox$2.f7529a
            r8 = r6 & 112(0x70, float:1.57E-43)
            r9 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r5.mo14918M(r9)
            androidx.compose.runtime.i1 r10 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r10 = r5.mo15032w(r10)
            androidx.compose.ui.unit.d r10 = (androidx.compose.p004ui.unit.C16479d) r10
            androidx.compose.runtime.i1 r11 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r11 = r5.mo15032w(r11)
            androidx.compose.ui.unit.LayoutDirection r11 = (androidx.compose.p004ui.unit.LayoutDirection) r11
            androidx.compose.runtime.i1 r12 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r12 = r5.mo15032w(r12)
            androidx.compose.ui.platform.c4 r12 = (androidx.compose.p004ui.platform.C15863c4) r12
            androidx.compose.ui.node.ComposeUiNode$Companion r13 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r14 = r13.mo44585a()
            kotlin.jvm.functions.q r15 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r7)
            int r8 = r8 << 9
            r8 = r8 & 7168(0x1c00, float:1.0045E-41)
            r8 = r8 | 6
            androidx.compose.runtime.d r9 = r5.mo15017r()
            boolean r9 = r9 instanceof androidx.compose.runtime.C8428d
            if (r9 != 0) goto L_0x00cd
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x00cd:
            r5.mo14938T()
            boolean r9 = r5.mo14997l()
            if (r9 == 0) goto L_0x00da
            r5.mo14947W(r14)
            goto L_0x00dd
        L_0x00da:
            r5.mo14888A()
        L_0x00dd:
            androidx.compose.runtime.o r9 = androidx.compose.runtime.Updater.m30180b(r5)
            kotlin.jvm.functions.p r14 = r13.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r9, r2, r14)
            kotlin.jvm.functions.p r2 = r13.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r9, r10, r2)
            kotlin.jvm.functions.p r2 = r13.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r9, r11, r2)
            kotlin.jvm.functions.p r2 = r13.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r9, r12, r2)
            androidx.compose.runtime.o r2 = androidx.compose.runtime.C8684u1.m31906b(r5)
            androidx.compose.runtime.u1 r2 = androidx.compose.runtime.C8684u1.m31905a(r2)
            int r8 = r8 >> 3
            r8 = r8 & 112(0x70, float:1.57E-43)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r15.invoke(r2, r5, r8)
            r2 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r5.mo14918M(r2)
            androidx.compose.ui.m$a r8 = androidx.compose.p004ui.C8767m.f23478j
            java.lang.String r9 = "anchor"
            androidx.compose.ui.m r9 = androidx.compose.p004ui.layout.C15594q.m69318b(r8, r9)
            androidx.compose.ui.c$a r10 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c r11 = r10.mo17066i()
            int r12 = r6 << 3
            r12 = r12 & 7168(0x1c00, float:1.0045E-41)
            r12 = r12 | 54
            r14 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r5.mo14918M(r14)
            int r15 = r12 >> 3
            r16 = r15 & 14
            r15 = r15 & 112(0x70, float:1.57E-43)
            r15 = r16 | r15
            r14 = 0
            androidx.compose.ui.layout.f0 r11 = androidx.compose.foundation.layout.BoxKt.m9849k(r11, r14, r5, r15)
            int r15 = r12 << 3
            r15 = r15 & 112(0x70, float:1.57E-43)
            r14 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r5.mo14918M(r14)
            androidx.compose.runtime.i1 r14 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r14 = r5.mo15032w(r14)
            androidx.compose.ui.unit.d r14 = (androidx.compose.p004ui.unit.C16479d) r14
            androidx.compose.runtime.i1 r2 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r2 = r5.mo15032w(r2)
            androidx.compose.ui.unit.LayoutDirection r2 = (androidx.compose.p004ui.unit.LayoutDirection) r2
            androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r4 = r5.mo15032w(r4)
            androidx.compose.ui.platform.c4 r4 = (androidx.compose.p004ui.platform.C15863c4) r4
            r17 = r7
            kotlin.jvm.functions.a r7 = r13.mo44585a()
            kotlin.jvm.functions.q r9 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r9)
            int r15 = r15 << 9
            r15 = r15 & 7168(0x1c00, float:1.0045E-41)
            r15 = r15 | 6
            androidx.compose.runtime.d r1 = r5.mo15017r()
            boolean r1 = r1 instanceof androidx.compose.runtime.C8428d
            if (r1 != 0) goto L_0x0180
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0180:
            r5.mo14938T()
            boolean r1 = r5.mo14997l()
            if (r1 == 0) goto L_0x018d
            r5.mo14947W(r7)
            goto L_0x0190
        L_0x018d:
            r5.mo14888A()
        L_0x0190:
            r5.mo14941U()
            androidx.compose.runtime.o r1 = androidx.compose.runtime.Updater.m30180b(r5)
            kotlin.jvm.functions.p r7 = r13.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r1, r11, r7)
            kotlin.jvm.functions.p r7 = r13.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r1, r14, r7)
            kotlin.jvm.functions.p r7 = r13.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r1, r2, r7)
            kotlin.jvm.functions.p r2 = r13.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r1, r4, r2)
            r5.mo14972e()
            androidx.compose.runtime.o r1 = androidx.compose.runtime.C8684u1.m31906b(r5)
            androidx.compose.runtime.u1 r1 = androidx.compose.runtime.C8684u1.m31905a(r1)
            int r2 = r15 >> 3
            r2 = r2 & 112(0x70, float:1.57E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r9.invoke(r1, r5, r2)
            r1 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r5.mo14918M(r1)
            androidx.compose.foundation.layout.BoxScopeInstance r1 = androidx.compose.foundation.layout.BoxScopeInstance.f6046a
            int r2 = r12 >> 6
            r2 = r2 & 112(0x70, float:1.57E-43)
            r2 = r2 | 6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.invoke(r1, r5, r2)
            r5.mo15002m0()
            r5.mo14896D()
            r5.mo15002m0()
            r5.mo15002m0()
            androidx.compose.ui.m r0 = androidx.compose.p004ui.layout.C15594q.m69318b(r8, r0)
            int r2 = r6 << 9
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | 6
            r4 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r5.mo14918M(r4)
            androidx.compose.ui.c r4 = r10.mo17061C()
            int r6 = r2 >> 3
            r7 = r6 & 14
            r6 = r6 & 112(0x70, float:1.57E-43)
            r6 = r6 | r7
            r7 = 0
            androidx.compose.ui.layout.f0 r4 = androidx.compose.foundation.layout.BoxKt.m9849k(r4, r7, r5, r6)
            int r6 = r2 << 3
            r6 = r6 & 112(0x70, float:1.57E-43)
            r7 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r5.mo14918M(r7)
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r7 = r5.mo15032w(r7)
            androidx.compose.ui.unit.d r7 = (androidx.compose.p004ui.unit.C16479d) r7
            androidx.compose.runtime.i1 r8 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r8 = r5.mo15032w(r8)
            androidx.compose.ui.unit.LayoutDirection r8 = (androidx.compose.p004ui.unit.LayoutDirection) r8
            androidx.compose.runtime.i1 r9 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r9 = r5.mo15032w(r9)
            androidx.compose.ui.platform.c4 r9 = (androidx.compose.p004ui.platform.C15863c4) r9
            kotlin.jvm.functions.a r10 = r13.mo44585a()
            kotlin.jvm.functions.q r0 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r0)
            int r6 = r6 << 9
            r6 = r6 & 7168(0x1c00, float:1.0045E-41)
            r6 = r6 | 6
            androidx.compose.runtime.d r11 = r5.mo15017r()
            boolean r11 = r11 instanceof androidx.compose.runtime.C8428d
            if (r11 != 0) goto L_0x024b
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x024b:
            r5.mo14938T()
            boolean r11 = r5.mo14997l()
            if (r11 == 0) goto L_0x0258
            r5.mo14947W(r10)
            goto L_0x025b
        L_0x0258:
            r5.mo14888A()
        L_0x025b:
            r5.mo14941U()
            androidx.compose.runtime.o r10 = androidx.compose.runtime.Updater.m30180b(r5)
            kotlin.jvm.functions.p r11 = r13.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r10, r4, r11)
            kotlin.jvm.functions.p r4 = r13.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r10, r7, r4)
            kotlin.jvm.functions.p r4 = r13.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r10, r8, r4)
            kotlin.jvm.functions.p r4 = r13.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r10, r9, r4)
            r5.mo14972e()
            androidx.compose.runtime.o r4 = androidx.compose.runtime.C8684u1.m31906b(r5)
            androidx.compose.runtime.u1 r4 = androidx.compose.runtime.C8684u1.m31905a(r4)
            int r6 = r6 >> 3
            r6 = r6 & 112(0x70, float:1.57E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r0.invoke(r4, r5, r6)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r5.mo14918M(r0)
            int r0 = r2 >> 6
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | 6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = r18
            r2.invoke(r1, r5, r0)
            r5.mo15002m0()
            r5.mo14896D()
            r5.mo15002m0()
            r5.mo15002m0()
            r5.mo15002m0()
            r5.mo14896D()
            r5.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x02c7
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x02c7:
            androidx.compose.runtime.t1 r6 = r5.mo15020s()
            if (r6 != 0) goto L_0x02ce
            goto L_0x02e1
        L_0x02ce:
            androidx.compose.material.BadgeKt$BadgedBox$3 r7 = new androidx.compose.material.BadgeKt$BadgedBox$3
            r0 = r7
            r1 = r18
            r2 = r17
            r3 = r20
            r4 = r22
            r5 = r23
            r0.<init>(r1, r2, r3, r4, r5)
            r6.mo15202a(r7)
        L_0x02e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BadgeKt.m13252b(kotlin.jvm.functions.q, androidx.compose.ui.m, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int):void");
    }

    /* renamed from: d */
    public static final float m13254d() {
        return f7528f;
    }

    /* renamed from: e */
    public static final float m13255e() {
        return f7523a;
    }

    /* renamed from: f */
    public static final float m13256f() {
        return f7527e;
    }

    /* renamed from: g */
    public static final float m13257g() {
        return f7526d;
    }

    /* renamed from: h */
    public static final float m13258h() {
        return f7524b;
    }
}

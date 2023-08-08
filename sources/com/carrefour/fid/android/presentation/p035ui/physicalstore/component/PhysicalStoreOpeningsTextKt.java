package com.carrefour.fid.android.presentation.p035ui.physicalstore.component;

import androidx.compose.foundation.ImageKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15205e4;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.layout.C15541c;
import androidx.compose.p004ui.res.C16015f;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.text.C16151c0;
import androidx.compose.p004ui.text.C16156d;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16194f0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.intl.C16342f;
import androidx.compose.p004ui.text.style.C16410a;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.text.style.C16439m;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.widgets.C37396r1;
import com.carrefour.fid.android.design.components.widgets.C37399s1;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.ThemeKt;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.C11079d2;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@C11363r0({"SMAP\nPhysicalStoreOpeningsText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhysicalStoreOpeningsText.kt\ncom/carrefour/fid/android/presentation/ui/physicalstore/component/PhysicalStoreOpeningsTextKt\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n*L\n1#1,126:1\n75#2,6:127\n81#2:159\n85#2:165\n75#3:133\n76#3,11:135\n89#3:164\n76#4:134\n460#5,13:146\n473#5,3:161\n154#6:160\n1098#7:166\n927#7,6:167\n1098#7:173\n927#7,6:174\n1098#7:180\n*S KotlinDebug\n*F\n+ 1 PhysicalStoreOpeningsText.kt\ncom/carrefour/fid/android/presentation/ui/physicalstore/component/PhysicalStoreOpeningsTextKt\n*L\n38#1:127,6\n38#1:159\n38#1:165\n38#1:133\n38#1:135,11\n38#1:164\n38#1:134\n38#1:146,13\n38#1:161,3\n39#1:160\n58#1:166\n59#1:167,6\n68#1:173\n69#1:174,6\n77#1:180\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreOpeningsTextKt */
public final class PhysicalStoreOpeningsTextKt {
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m109639a(C8767m mVar, C37396r1 r1Var, C8592o oVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        C8592o o = oVar.mo15009o(-1361436560);
        if ((i & 14) == 0) {
            if (o.mo15006n0(mVar)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (o.mo15006n0(r1Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i2 & 91) != 18 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1361436560, i2, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.component.GenerateDotImage (PhysicalStoreOpeningsText.kt:82)");
            }
            if (r1Var.mo113985h() == null && r1Var.mo113984g() == null) {
                if (ComposerKt.m29813g0()) {
                    ComposerKt.m29843v0();
                }
                C8678t1 s = o.mo15020s();
                if (s != null) {
                    s.mo15202a(new PhysicalStoreOpeningsTextKt$GenerateDotImage$1(mVar, r1Var, i));
                    return;
                }
                return;
            }
            if (Intrinsics.areEqual((Object) r1Var.mo113985h(), (Object) Boolean.TRUE)) {
                i3 = R.drawable.dot_green;
            } else {
                i3 = R.drawable.dot_red;
            }
            ImageKt.m8967b(C16015f.m71849d(i3, o, 0), (String) null, mVar, (C8734c) null, (C15541c) null, 0.0f, (C15249k2) null, o, ((i2 << 6) & 896) | 56, 120);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s2 = o.mo15020s();
        if (s2 != null) {
            s2.mo15202a(new PhysicalStoreOpeningsTextKt$GenerateDotImage$2(mVar, r1Var, i));
        }
    }

    @C8540g
    @C16464c(showBackground = true)
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m109640b(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(755105517);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(755105517, i, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreOpeningsClosedTextPreview (PhysicalStoreOpeningsText.kt:110)");
            }
            ThemeKt.m153788a(ComposableSingletons$PhysicalStoreOpeningsTextKt.f62465a.mo73965b(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new C25380x877ba740(i));
        }
    }

    @C8540g
    @C16464c(showBackground = true)
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    public static final void m109641c(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-1378271729);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1378271729, i, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreOpeningsOpenTextPreview (PhysicalStoreOpeningsText.kt:93)");
            }
            ThemeKt.m153788a(ComposableSingletons$PhysicalStoreOpeningsTextKt.f62465a.mo73964a(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new C25381x2a99d422(i));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m109642d(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r34, long r35, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.design.components.widgets.C37396r1 r37, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r38, int r39, int r40) {
        /*
            r4 = r37
            r5 = r39
            java.lang.String r0 = "storeInfo"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 1039422872(0x3df45598, float:0.11930388)
            r1 = r38
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r2 = r40 & 1
            if (r2 == 0) goto L_0x001c
            r3 = r5 | 6
            r6 = r3
            r3 = r34
            goto L_0x0030
        L_0x001c:
            r3 = r5 & 14
            if (r3 != 0) goto L_0x002d
            r3 = r34
            boolean r6 = r1.mo15006n0(r3)
            if (r6 == 0) goto L_0x002a
            r6 = 4
            goto L_0x002b
        L_0x002a:
            r6 = 2
        L_0x002b:
            r6 = r6 | r5
            goto L_0x0030
        L_0x002d:
            r3 = r34
            r6 = r5
        L_0x0030:
            r7 = r40 & 2
            if (r7 == 0) goto L_0x0037
            r6 = r6 | 48
            goto L_0x004a
        L_0x0037:
            r8 = r5 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x004a
            r8 = r35
            boolean r10 = r1.mo14980g(r8)
            if (r10 == 0) goto L_0x0046
            r10 = 32
            goto L_0x0048
        L_0x0046:
            r10 = 16
        L_0x0048:
            r6 = r6 | r10
            goto L_0x004c
        L_0x004a:
            r8 = r35
        L_0x004c:
            r10 = r40 & 4
            if (r10 == 0) goto L_0x0053
            r6 = r6 | 384(0x180, float:5.38E-43)
            goto L_0x0063
        L_0x0053:
            r10 = r5 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x0063
            boolean r10 = r1.mo15006n0(r4)
            if (r10 == 0) goto L_0x0060
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r6 = r6 | r10
        L_0x0063:
            r10 = r6
            r6 = r10 & 731(0x2db, float:1.024E-42)
            r11 = 146(0x92, float:2.05E-43)
            if (r6 != r11) goto L_0x0079
            boolean r6 = r1.mo15011p()
            if (r6 != 0) goto L_0x0071
            goto L_0x0079
        L_0x0071:
            r1.mo14958a0()
            r2 = r3
            r32 = r8
            goto L_0x01c7
        L_0x0079:
            if (r2 == 0) goto L_0x007e
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x007f
        L_0x007e:
            r2 = r3
        L_0x007f:
            if (r7 == 0) goto L_0x008a
            r3 = 12
            long r6 = androidx.compose.p004ui.unit.C16506u.m74712m(r3)
            r32 = r6
            goto L_0x008c
        L_0x008a:
            r32 = r8
        L_0x008c:
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x0098
            r3 = -1
            java.lang.String r6 = "com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreOpeningsText (PhysicalStoreOpeningsText.kt:32)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r10, r3, r6)
        L_0x0098:
            androidx.compose.ui.c$a r0 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$c r0 = r0.mo17070q()
            r3 = r10 & 14
            r3 = r3 | 384(0x180, float:5.38E-43)
            r6 = 693286680(0x2952b718, float:4.6788176E-14)
            r1.mo14918M(r6)
            androidx.compose.foundation.layout.Arrangement r6 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$d r6 = r6.mo7630p()
            int r7 = r3 >> 3
            r8 = r7 & 14
            r7 = r7 & 112(0x70, float:1.57E-43)
            r7 = r7 | r8
            androidx.compose.ui.layout.f0 r0 = androidx.compose.foundation.layout.RowKt.m10071d(r6, r0, r1, r7)
            int r3 = r3 << 3
            r3 = r3 & 112(0x70, float:1.57E-43)
            r6 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.mo14918M(r6)
            androidx.compose.runtime.i1 r6 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r6 = r1.mo15032w(r6)
            androidx.compose.ui.unit.d r6 = (androidx.compose.p004ui.unit.C16479d) r6
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r7 = r1.mo15032w(r7)
            androidx.compose.ui.unit.LayoutDirection r7 = (androidx.compose.p004ui.unit.LayoutDirection) r7
            androidx.compose.runtime.i1 r8 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r8 = r1.mo15032w(r8)
            androidx.compose.ui.platform.c4 r8 = (androidx.compose.p004ui.platform.C15863c4) r8
            androidx.compose.ui.node.ComposeUiNode$Companion r9 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r11 = r9.mo44585a()
            kotlin.jvm.functions.q r12 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r2)
            int r3 = r3 << 9
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | 6
            androidx.compose.runtime.d r13 = r1.mo15017r()
            boolean r13 = r13 instanceof androidx.compose.runtime.C8428d
            if (r13 != 0) goto L_0x00fc
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x00fc:
            r1.mo14938T()
            boolean r13 = r1.mo14997l()
            if (r13 == 0) goto L_0x0109
            r1.mo14947W(r11)
            goto L_0x010c
        L_0x0109:
            r1.mo14888A()
        L_0x010c:
            r1.mo14941U()
            androidx.compose.runtime.o r11 = androidx.compose.runtime.Updater.m30180b(r1)
            kotlin.jvm.functions.p r13 = r9.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r11, r0, r13)
            kotlin.jvm.functions.p r0 = r9.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r11, r6, r0)
            kotlin.jvm.functions.p r0 = r9.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r11, r7, r0)
            kotlin.jvm.functions.p r0 = r9.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r11, r8, r0)
            r1.mo14972e()
            androidx.compose.runtime.o r0 = androidx.compose.runtime.C8684u1.m31906b(r1)
            androidx.compose.runtime.u1 r0 = androidx.compose.runtime.C8684u1.m31905a(r0)
            int r3 = r3 >> 3
            r3 = r3 & 112(0x70, float:1.57E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12.invoke(r0, r1, r3)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.mo14918M(r0)
            androidx.compose.foundation.layout.RowScopeInstance r0 = androidx.compose.foundation.layout.RowScopeInstance.f6147a
            androidx.compose.ui.m$a r11 = androidx.compose.p004ui.C8767m.f23478j
            r7 = r11
            r12 = 0
            r13 = 0
            r0 = 8
            float r0 = (float) r0
            float r14 = androidx.compose.p004ui.unit.C16483g.m74435M(r0)
            r15 = 0
            r16 = 11
            r17 = 0
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.PaddingKt.m10028o(r11, r12, r13, r14, r15, r16, r17)
            int r3 = com.carrefour.fid.android.design.components.widgets.C37396r1.f93965d
            int r6 = r3 << 3
            r6 = r6 | 6
            int r8 = r10 >> 3
            r8 = r8 & 112(0x70, float:1.57E-43)
            r6 = r6 | r8
            m109639a(r0, r4, r1, r6)
            com.carrefour.fid.android.design.theme.b r0 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r8 = r0.mo114257y()
            androidx.compose.material.t0 r0 = androidx.compose.material.C7933t0.f19075a
            int r6 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.w1 r0 = r0.mo11077c(r1, r6)
            androidx.compose.ui.text.p0 r27 = com.carrefour.fid.android.design.theme.C37477d.m153892d(r0)
            int r0 = r10 >> 6
            r0 = r0 & 14
            r0 = r0 | r3
            androidx.compose.ui.text.d r6 = m109646h(r4, r1, r0)
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            int r0 = r10 << 6
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r29 = r0 | 48
            r30 = 0
            r31 = 131056(0x1fff0, float:1.83649E-40)
            r10 = r32
            r28 = r1
            androidx.compose.material.TextKt.m14197d(r6, r7, r8, r10, r12, r13, r14, r15, r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r1.mo15002m0()
            r1.mo14896D()
            r1.mo15002m0()
            r1.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x01c7
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01c7:
            androidx.compose.runtime.t1 r7 = r1.mo15020s()
            if (r7 != 0) goto L_0x01ce
            goto L_0x01e0
        L_0x01ce:
            com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreOpeningsTextKt$PhysicalStoreOpeningsText$2 r8 = new com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreOpeningsTextKt$PhysicalStoreOpeningsText$2
            r0 = r8
            r1 = r2
            r2 = r32
            r4 = r37
            r5 = r39
            r6 = r40
            r0.<init>(r1, r2, r4, r5, r6)
            r7.mo15202a(r8)
        L_0x01e0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.physicalstore.component.PhysicalStoreOpeningsTextKt.m109642d(androidx.compose.ui.m, long, com.carrefour.fid.android.design.components.widgets.r1, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX INFO: finally extract failed */
    @C8540g
    /* renamed from: h */
    public static final C16156d m109646h(C37396r1 r1Var, C8592o oVar, int i) {
        C16156d dVar;
        C8592o oVar2 = oVar;
        oVar2.mo14918M(1894299280);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1894299280, i, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.component.generateStoreInfoText (PhysicalStoreOpeningsText.kt:51)");
        }
        C37399s1 g = r1Var.mo113984g();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH'h'mm", Locale.FRANCE);
        if (Intrinsics.areEqual((Object) r1Var.mo113985h(), (Object) Boolean.TRUE) && g != null) {
            oVar2.mo14918M(1190356986);
            String format = simpleDateFormat.format(g.mo113992e());
            C16156d.C16157a aVar = new C16156d.C16157a(0, 1, (DefaultConstructorMarker) null);
            oVar2.mo14918M(1190357116);
            int r = aVar.mo46713r(new C16151c0(C37475b.f94185a.mo114251s(), 0, (C16209i0) null, (C16190e0) null, (C16194f0) null, (C16242u) null, (String) null, 0, (C16410a) null, (C16439m) null, (C16342f) null, 0, (C16434j) null, (C15205e4) null, 16382, (DefaultConstructorMarker) null));
            try {
                aVar.mo46707l(C16018i.m71858d(R.string.set_service_opened, oVar2, 0));
                C11079d2 d2Var = C11079d2.f28267a;
                aVar.mo46710o(r);
                oVar.mo15002m0();
                aVar.mo46707l(" ");
                Intrinsics.checkNotNullExpressionValue(format, "closingHour");
                aVar.mo46707l(C16018i.m71859e(R.string.set_service_close_at, new Object[]{format}, oVar2, 64));
                dVar = aVar.mo46716u();
                oVar.mo15002m0();
            } catch (Throwable th) {
                aVar.mo46710o(r);
                throw th;
            }
        } else if (!Intrinsics.areEqual((Object) r1Var.mo113985h(), (Object) Boolean.FALSE) || g == null) {
            oVar2.mo14918M(1190357917);
            C16156d.C16157a aVar2 = new C16156d.C16157a(0, 1, (DefaultConstructorMarker) null);
            aVar2.mo46707l(C16018i.m71858d(R.string.set_service_store_unavailable, oVar2, 0));
            dVar = aVar2.mo46716u();
            oVar.mo15002m0();
        } else {
            oVar2.mo14918M(1190357479);
            String format2 = simpleDateFormat.format(g.mo113994f());
            C16156d.C16157a aVar3 = new C16156d.C16157a(0, 1, (DefaultConstructorMarker) null);
            oVar2.mo14918M(1190357611);
            int r2 = aVar3.mo46713r(new C16151c0(C37475b.f94185a.mo114224U(), 0, (C16209i0) null, (C16190e0) null, (C16194f0) null, (C16242u) null, (String) null, 0, (C16410a) null, (C16439m) null, (C16342f) null, 0, (C16434j) null, (C15205e4) null, 16382, (DefaultConstructorMarker) null));
            try {
                aVar3.mo46707l(C16018i.m71858d(R.string.set_service_closed, oVar2, 0));
                C11079d2 d2Var2 = C11079d2.f28267a;
                aVar3.mo46710o(r2);
                oVar.mo15002m0();
                aVar3.mo46707l(" ");
                Intrinsics.checkNotNullExpressionValue(format2, "openingHour");
                aVar3.mo46707l(C16018i.m71859e(R.string.set_service_open_at, new Object[]{format2}, oVar2, 64));
                dVar = aVar3.mo46716u();
                oVar.mo15002m0();
            } catch (Throwable th2) {
                aVar3.mo46710o(r2);
                throw th2;
            }
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return dVar;
    }
}

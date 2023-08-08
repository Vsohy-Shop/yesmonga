package com.carrefour.fid.android.product.presentation.p039ui.details.views;

import android.content.ActivityNotFoundException;
import androidx.compose.p004ui.graphics.C15258l2;
import androidx.compose.p004ui.platform.C16007z3;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.design.theme.ThemeKt;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11457f;
import kotlin.ranges.C11478t;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nRepairability.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Repairability.kt\ncom/carrefour/fid/android/product/presentation/ui/details/views/RepairabilityKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 10 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,316:1\n154#2:317\n154#2:319\n154#2:353\n154#2:354\n154#2:355\n154#2:385\n154#2:386\n154#2:397\n154#2:402\n154#2:441\n154#2:507\n154#2:508\n154#2:509\n154#2:558\n154#2:559\n154#2:571\n76#3:318\n76#3:327\n76#3:359\n76#3:414\n76#3:449\n76#3:481\n76#3:523\n74#4,6:320\n80#4:352\n84#4:396\n73#4,7:406\n80#4:439\n84#4:577\n75#5:326\n76#5,11:328\n75#5:358\n76#5,11:360\n89#5:390\n89#5:395\n75#5:413\n76#5,11:415\n75#5:448\n76#5,11:450\n75#5:480\n76#5,11:482\n89#5:513\n75#5:522\n76#5,11:524\n89#5:564\n89#5:569\n89#5:576\n460#6,13:339\n460#6,13:371\n473#6,3:387\n473#6,3:392\n25#6:398\n460#6,13:426\n460#6,13:461\n460#6,13:493\n473#6,3:510\n460#6,13:535\n36#6:551\n473#6,3:561\n473#6,3:566\n473#6,3:573\n79#7,2:356\n81#7:384\n85#7:391\n75#7,6:442\n81#7:474\n85#7:570\n1114#8,3:399\n1117#8,3:403\n1114#8,6:552\n92#9:440\n92#9:549\n75#9:550\n75#9:560\n75#9:572\n68#10,5:475\n73#10:506\n77#10:514\n66#10,7:515\n73#10:548\n77#10:565\n*S KotlinDebug\n*F\n+ 1 Repairability.kt\ncom/carrefour/fid/android/product/presentation/ui/details/views/RepairabilityKt\n*L\n58#1:317\n74#1:319\n85#1:353\n86#1:354\n106#1:355\n118#1:385\n119#1:386\n142#1:397\n145#1:402\n155#1:441\n177#1:507\n178#1:508\n181#1:509\n202#1:558\n203#1:559\n214#1:571\n73#1:318\n74#1:327\n102#1:359\n150#1:414\n151#1:449\n159#1:481\n186#1:523\n74#1:320,6\n74#1:352\n74#1:396\n150#1:406,7\n150#1:439\n150#1:577\n74#1:326\n74#1:328,11\n102#1:358\n102#1:360,11\n102#1:390\n74#1:395\n150#1:413\n150#1:415,11\n151#1:448\n151#1:450,11\n159#1:480\n159#1:482,11\n159#1:513\n186#1:522\n186#1:524,11\n186#1:564\n151#1:569\n150#1:576\n74#1:339,13\n102#1:371,13\n102#1:387,3\n74#1:392,3\n145#1:398\n150#1:426,13\n151#1:461,13\n159#1:493,13\n159#1:510,3\n186#1:535,13\n195#1:551\n186#1:561,3\n151#1:566,3\n150#1:573,3\n102#1:356,2\n102#1:384\n102#1:391\n151#1:442,6\n151#1:474\n151#1:570\n145#1:399,3\n145#1:403,3\n195#1:552,6\n153#1:440\n190#1:549\n190#1:550\n204#1:560\n215#1:572\n159#1:475,5\n159#1:506\n159#1:514\n186#1:515,7\n186#1:548\n186#1:565\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.views.RepairabilityKt */
public final class RepairabilityKt {
    @C12579k

    /* renamed from: a */
    public static final String f67736a = "https://www.carrefour.fr/services/indice-de-reparabilite";
    @C12579k

    /* renamed from: b */
    public static final C11457f<Double> f67737b = C11478t.m44304d(0.0d, 1.9d);
    @C12579k

    /* renamed from: c */
    public static final C11457f<Double> f67738c = C11478t.m44304d(2.0d, 3.9d);
    @C12579k

    /* renamed from: d */
    public static final C11457f<Double> f67739d = C11478t.m44304d(4.0d, 5.9d);
    @C12579k

    /* renamed from: e */
    public static final C11457f<Double> f67740e = C11478t.m44304d(6.0d, 7.9d);
    @C12579k

    /* renamed from: f */
    public static final C11457f<Double> f67741f = C11478t.m44304d(8.0d, 10.0d);

    /* renamed from: g */
    public static final long f67742g = C15258l2.m66179d(4292418088L);

    /* renamed from: h */
    public static final long f67743h = C15258l2.m66179d(4294865947L);

    /* renamed from: i */
    public static final long f67744i = C15258l2.m66179d(4294953217L);

    /* renamed from: j */
    public static final long f67745j = C15258l2.m66179d(4288596992L);

    /* renamed from: k */
    public static final long f67746k = C15258l2.m66179d(4278228035L);

    /* renamed from: l */
    public static final char f67747l = ',';
    @C12579k

    /* renamed from: m */
    public static final String f67748m = "#.#";

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m117258a(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-154721210);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-154721210, i, -1, "com.carrefour.fid.android.product.presentation.ui.details.views.Big (Repairability.kt:291)");
            }
            ThemeKt.m153788a(ComposableSingletons$RepairabilityKt.f67664a.mo81230g(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new RepairabilityKt$Big$1(i));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x02da  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x02de  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x03bd  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x03c9  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x03cd  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0538  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0544  */
    /* JADX WARNING: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x023e  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0242  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02ce  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m117259b(long r40, androidx.compose.p004ui.C8767m r42, int r43, float r44, double r45, androidx.compose.runtime.C8592o r47, int r48, int r49) {
        /*
            r1 = r40
            r8 = r48
            r0 = -1116447141(0xffffffffbd745e5b, float:-0.059660297)
            r3 = r47
            androidx.compose.runtime.o r3 = r3.mo15009o(r0)
            r4 = r49 & 1
            r6 = 4
            if (r4 == 0) goto L_0x0015
            r4 = r8 | 6
            goto L_0x0025
        L_0x0015:
            r4 = r8 & 14
            if (r4 != 0) goto L_0x0024
            boolean r4 = r3.mo14980g(r1)
            if (r4 == 0) goto L_0x0021
            r4 = r6
            goto L_0x0022
        L_0x0021:
            r4 = 2
        L_0x0022:
            r4 = r4 | r8
            goto L_0x0025
        L_0x0024:
            r4 = r8
        L_0x0025:
            r7 = r49 & 2
            if (r7 == 0) goto L_0x002c
            r4 = r4 | 48
            goto L_0x003f
        L_0x002c:
            r9 = r8 & 112(0x70, float:1.57E-43)
            if (r9 != 0) goto L_0x003f
            r9 = r42
            boolean r10 = r3.mo15006n0(r9)
            if (r10 == 0) goto L_0x003b
            r10 = 32
            goto L_0x003d
        L_0x003b:
            r10 = 16
        L_0x003d:
            r4 = r4 | r10
            goto L_0x0041
        L_0x003f:
            r9 = r42
        L_0x0041:
            r10 = r8 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x005a
            r10 = r49 & 4
            if (r10 != 0) goto L_0x0054
            r10 = r43
            boolean r11 = r3.mo14976f(r10)
            if (r11 == 0) goto L_0x0056
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0058
        L_0x0054:
            r10 = r43
        L_0x0056:
            r11 = 128(0x80, float:1.794E-43)
        L_0x0058:
            r4 = r4 | r11
            goto L_0x005c
        L_0x005a:
            r10 = r43
        L_0x005c:
            r11 = r49 & 8
            if (r11 == 0) goto L_0x0063
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x0076
        L_0x0063:
            r12 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r12 != 0) goto L_0x0076
            r12 = r44
            boolean r13 = r3.mo14968d(r12)
            if (r13 == 0) goto L_0x0072
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x0074
        L_0x0072:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x0074:
            r4 = r4 | r13
            goto L_0x0078
        L_0x0076:
            r12 = r44
        L_0x0078:
            r13 = r49 & 16
            if (r13 == 0) goto L_0x0081
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            r14 = r45
            goto L_0x0095
        L_0x0081:
            r13 = 57344(0xe000, float:8.0356E-41)
            r13 = r13 & r8
            r14 = r45
            if (r13 != 0) goto L_0x0095
            boolean r13 = r3.mo14993k(r14)
            if (r13 == 0) goto L_0x0092
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0092:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r4 = r4 | r13
        L_0x0095:
            r13 = 46811(0xb6db, float:6.5596E-41)
            r13 = r13 & r4
            r5 = 9362(0x2492, float:1.3119E-41)
            if (r13 != r5) goto L_0x00ad
            boolean r5 = r3.mo15011p()
            if (r5 != 0) goto L_0x00a4
            goto L_0x00ad
        L_0x00a4:
            r3.mo14958a0()
            r36 = r9
            r4 = r10
            r5 = r12
            goto L_0x053d
        L_0x00ad:
            r3.mo14930Q()
            r5 = r8 & 1
            if (r5 == 0) goto L_0x00cc
            boolean r5 = r3.mo14977f0()
            if (r5 == 0) goto L_0x00bb
            goto L_0x00cc
        L_0x00bb:
            r3.mo14958a0()
            r5 = r49 & 4
            if (r5 == 0) goto L_0x00c4
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00c4:
            r5 = r10
            r7 = r12
        L_0x00c6:
            r39 = r9
            r9 = r4
            r4 = r39
            goto L_0x00e6
        L_0x00cc:
            if (r7 == 0) goto L_0x00d1
            androidx.compose.ui.m$a r5 = androidx.compose.p004ui.C8767m.f23478j
            r9 = r5
        L_0x00d1:
            r5 = r49 & 4
            if (r5 == 0) goto L_0x00da
            int r5 = com.carrefour.fid.android.product.C27609f.C27617h.ic_repairability
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
            r10 = r5
        L_0x00da:
            if (r11 == 0) goto L_0x00c4
            r5 = 30
            float r5 = (float) r5
            float r5 = androidx.compose.p004ui.unit.C16483g.m74435M(r5)
            r7 = r5
            r5 = r10
            goto L_0x00c6
        L_0x00e6:
            r3.mo14899E()
            boolean r10 = androidx.compose.runtime.ComposerKt.m29813g0()
            r11 = -1
            if (r10 == 0) goto L_0x00f5
            java.lang.String r10 = "com.carrefour.fid.android.product.presentation.ui.details.views.Repairability (Repairability.kt:137)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r9, r11, r10)
        L_0x00f5:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r3.mo14918M(r0)
            java.lang.Object r0 = r3.mo14921N()
            androidx.compose.runtime.o$a r19 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r10 = r19.mo16277a()
            if (r0 != r10) goto L_0x0113
            float r0 = (float) r6
            float r0 = androidx.compose.p004ui.unit.C16483g.m74435M(r0)
            androidx.compose.foundation.shape.n r0 = androidx.compose.foundation.shape.C2694o.m12166h(r0)
            r3.mo14893C(r0)
        L_0x0113:
            r3.mo15002m0()
            androidx.compose.foundation.shape.n r0 = (androidx.compose.foundation.shape.C2693n) r0
            int r10 = com.carrefour.fid.android.product.C27609f.C27627r.pdp_accessibility_repairability
            r13 = 1
            java.lang.Object[] r12 = new java.lang.Object[r13]
            java.lang.String r16 = m117276s(r45)
            r6 = 0
            r12[r6] = r16
            r11 = 64
            java.lang.String r12 = androidx.compose.p004ui.res.C16018i.m71859e(r10, r12, r3, r11)
            r10 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r3.mo14918M(r10)
            androidx.compose.ui.m$a r11 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.foundation.layout.Arrangement r10 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$l r13 = r10.mo7631r()
            androidx.compose.ui.c$a r34 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r8 = r34.mo17072u()
            androidx.compose.ui.layout.f0 r8 = androidx.compose.foundation.layout.ColumnKt.m9863b(r13, r8, r3, r6)
            r13 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r3.mo14918M(r13)
            androidx.compose.runtime.i1 r13 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r13 = r3.mo15032w(r13)
            androidx.compose.ui.unit.d r13 = (androidx.compose.p004ui.unit.C16479d) r13
            androidx.compose.runtime.i1 r6 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r6 = r3.mo15032w(r6)
            androidx.compose.ui.unit.LayoutDirection r6 = (androidx.compose.p004ui.unit.LayoutDirection) r6
            r16 = r12
            androidx.compose.runtime.i1 r12 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r12 = r3.mo15032w(r12)
            androidx.compose.ui.platform.c4 r12 = (androidx.compose.p004ui.platform.C15863c4) r12
            androidx.compose.ui.node.ComposeUiNode$Companion r26 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r14 = r26.mo44585a()
            kotlin.jvm.functions.q r15 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r11)
            r35 = r5
            androidx.compose.runtime.d r5 = r3.mo15017r()
            boolean r5 = r5 instanceof androidx.compose.runtime.C8428d
            if (r5 != 0) goto L_0x017f
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x017f:
            r3.mo14938T()
            boolean r5 = r3.mo14997l()
            if (r5 == 0) goto L_0x018c
            r3.mo14947W(r14)
            goto L_0x018f
        L_0x018c:
            r3.mo14888A()
        L_0x018f:
            r3.mo14941U()
            androidx.compose.runtime.o r5 = androidx.compose.runtime.Updater.m30180b(r3)
            kotlin.jvm.functions.p r14 = r26.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r5, r8, r14)
            kotlin.jvm.functions.p r8 = r26.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r5, r13, r8)
            kotlin.jvm.functions.p r8 = r26.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r5, r6, r8)
            kotlin.jvm.functions.p r6 = r26.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r5, r12, r6)
            r3.mo14972e()
            androidx.compose.runtime.o r5 = androidx.compose.runtime.C8684u1.m31906b(r3)
            androidx.compose.runtime.u1 r5 = androidx.compose.runtime.C8684u1.m31905a(r5)
            r6 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            r15.invoke(r5, r3, r8)
            r5 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r3.mo14918M(r5)
            androidx.compose.foundation.layout.ColumnScopeInstance r6 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            r8 = 2
            float r12 = (float) r8
            float r8 = r7 * r12
            float r8 = androidx.compose.p004ui.unit.C16483g.m74435M(r8)
            androidx.compose.ui.m r8 = androidx.compose.foundation.layout.SizeKt.m10089E(r4, r8, r7)
            r13 = 1
            float r15 = (float) r13
            float r14 = androidx.compose.p004ui.unit.C16483g.m74435M(r15)
            androidx.compose.foundation.i r14 = androidx.compose.foundation.C2250j.m9695a(r14, r1)
            androidx.compose.ui.m r8 = androidx.compose.foundation.BorderKt.m8850f(r8, r14, r0)
            r14 = 693286680(0x2952b718, float:4.6788176E-14)
            r3.mo14918M(r14)
            androidx.compose.foundation.layout.Arrangement$d r10 = r10.mo7630p()
            androidx.compose.ui.c$c r14 = r34.mo17073w()
            r13 = 0
            androidx.compose.ui.layout.f0 r10 = androidx.compose.foundation.layout.RowKt.m10071d(r10, r14, r3, r13)
            r13 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r3.mo14918M(r13)
            androidx.compose.runtime.i1 r13 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r13 = r3.mo15032w(r13)
            androidx.compose.ui.unit.d r13 = (androidx.compose.p004ui.unit.C16479d) r13
            androidx.compose.runtime.i1 r14 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r14 = r3.mo15032w(r14)
            androidx.compose.ui.unit.LayoutDirection r14 = (androidx.compose.p004ui.unit.LayoutDirection) r14
            androidx.compose.runtime.i1 r5 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r5 = r3.mo15032w(r5)
            androidx.compose.ui.platform.c4 r5 = (androidx.compose.p004ui.platform.C15863c4) r5
            r36 = r4
            kotlin.jvm.functions.a r4 = r26.mo44585a()
            kotlin.jvm.functions.q r8 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r8)
            r17 = r15
            androidx.compose.runtime.d r15 = r3.mo15017r()
            boolean r15 = r15 instanceof androidx.compose.runtime.C8428d
            if (r15 != 0) goto L_0x0235
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0235:
            r3.mo14938T()
            boolean r15 = r3.mo14997l()
            if (r15 == 0) goto L_0x0242
            r3.mo14947W(r4)
            goto L_0x0245
        L_0x0242:
            r3.mo14888A()
        L_0x0245:
            r3.mo14941U()
            androidx.compose.runtime.o r4 = androidx.compose.runtime.Updater.m30180b(r3)
            kotlin.jvm.functions.p r15 = r26.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r4, r10, r15)
            kotlin.jvm.functions.p r10 = r26.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r4, r13, r10)
            kotlin.jvm.functions.p r10 = r26.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r4, r14, r10)
            kotlin.jvm.functions.p r10 = r26.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r4, r5, r10)
            r3.mo14972e()
            androidx.compose.runtime.o r4 = androidx.compose.runtime.C8684u1.m31906b(r3)
            androidx.compose.runtime.u1 r4 = androidx.compose.runtime.C8684u1.m31905a(r4)
            r5 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)
            r8.invoke(r4, r3, r10)
            r4 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r3.mo14918M(r4)
            androidx.compose.foundation.layout.RowScopeInstance r20 = androidx.compose.foundation.layout.RowScopeInstance.f6147a
            androidx.compose.ui.c r4 = r34.mo17066i()
            androidx.compose.ui.m r8 = androidx.compose.foundation.layout.SizeKt.m10087C(r11, r7)
            androidx.compose.ui.m r0 = androidx.compose.foundation.BackgroundKt.m8824c(r8, r1, r0)
            r8 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r3.mo14918M(r8)
            r15 = 6
            androidx.compose.ui.layout.f0 r4 = androidx.compose.foundation.layout.BoxKt.m9849k(r4, r5, r3, r15)
            r5 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r3.mo14918M(r5)
            androidx.compose.runtime.i1 r10 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r10 = r3.mo15032w(r10)
            androidx.compose.ui.unit.d r10 = (androidx.compose.p004ui.unit.C16479d) r10
            androidx.compose.runtime.i1 r13 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r13 = r3.mo15032w(r13)
            androidx.compose.ui.unit.LayoutDirection r13 = (androidx.compose.p004ui.unit.LayoutDirection) r13
            androidx.compose.runtime.i1 r14 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r14 = r3.mo15032w(r14)
            androidx.compose.ui.platform.c4 r14 = (androidx.compose.p004ui.platform.C15863c4) r14
            kotlin.jvm.functions.a r5 = r26.mo44585a()
            kotlin.jvm.functions.q r0 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r0)
            androidx.compose.runtime.d r8 = r3.mo15017r()
            boolean r8 = r8 instanceof androidx.compose.runtime.C8428d
            if (r8 != 0) goto L_0x02d1
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x02d1:
            r3.mo14938T()
            boolean r8 = r3.mo14997l()
            if (r8 == 0) goto L_0x02de
            r3.mo14947W(r5)
            goto L_0x02e1
        L_0x02de:
            r3.mo14888A()
        L_0x02e1:
            r3.mo14941U()
            androidx.compose.runtime.o r5 = androidx.compose.runtime.Updater.m30180b(r3)
            kotlin.jvm.functions.p r8 = r26.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r5, r4, r8)
            kotlin.jvm.functions.p r4 = r26.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r5, r10, r4)
            kotlin.jvm.functions.p r4 = r26.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r5, r13, r4)
            kotlin.jvm.functions.p r4 = r26.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r5, r14, r4)
            r3.mo14972e()
            androidx.compose.runtime.o r4 = androidx.compose.runtime.C8684u1.m31906b(r3)
            androidx.compose.runtime.u1 r4 = androidx.compose.runtime.C8684u1.m31905a(r4)
            r5 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            r0.invoke(r4, r3, r8)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r3.mo14918M(r0)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.f6046a
            int r4 = r9 >> 6
            r4 = r4 & 14
            r5 = r35
            androidx.compose.ui.graphics.painter.Painter r9 = androidx.compose.p004ui.res.C16015f.m71849d(r5, r3, r4)
            r10 = 0
            r4 = -1
            float r4 = (float) r4
            float r8 = androidx.compose.p004ui.unit.C16483g.m74435M(r4)
            float r4 = androidx.compose.p004ui.unit.C16483g.m74435M(r4)
            androidx.compose.ui.m r4 = androidx.compose.foundation.layout.OffsetKt.m9999e(r11, r8, r4)
            androidx.compose.ui.m r4 = androidx.compose.foundation.layout.SizeKt.m10087C(r4, r7)
            float r8 = androidx.compose.p004ui.unit.C16483g.m74435M(r12)
            androidx.compose.ui.m r4 = androidx.compose.foundation.layout.PaddingKt.m10024k(r4, r8)
            r12 = 0
            r13 = 0
            r14 = 0
            r8 = 0
            r18 = 56
            r21 = 120(0x78, float:1.68E-43)
            r42 = r11
            r11 = r4
            r4 = r16
            r35 = r17
            r15 = r8
            r16 = r3
            r17 = r18
            r18 = r21
            androidx.compose.foundation.ImageKt.m8967b(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r3.mo15002m0()
            r3.mo14896D()
            r3.mo15002m0()
            r3.mo15002m0()
            r22 = 1065353216(0x3f800000, float:1.0)
            r23 = 0
            r24 = 2
            r25 = 0
            r21 = r42
            androidx.compose.ui.m r8 = androidx.compose.foundation.layout.C2411u0.m10660e(r20, r21, r22, r23, r24, r25)
            r9 = 0
            androidx.compose.foundation.layout.C2428y0.m10726a(r8, r3, r9)
            r8 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r3.mo14918M(r8)
            androidx.compose.ui.c r8 = r34.mo17061C()
            androidx.compose.ui.layout.f0 r8 = androidx.compose.foundation.layout.BoxKt.m9849k(r8, r9, r3, r9)
            r9 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r3.mo14918M(r9)
            androidx.compose.runtime.i1 r9 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r9 = r3.mo15032w(r9)
            androidx.compose.ui.unit.d r9 = (androidx.compose.p004ui.unit.C16479d) r9
            androidx.compose.runtime.i1 r10 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r10 = r3.mo15032w(r10)
            androidx.compose.ui.unit.LayoutDirection r10 = (androidx.compose.p004ui.unit.LayoutDirection) r10
            androidx.compose.runtime.i1 r11 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r11 = r3.mo15032w(r11)
            androidx.compose.ui.platform.c4 r11 = (androidx.compose.p004ui.platform.C15863c4) r11
            kotlin.jvm.functions.a r12 = r26.mo44585a()
            kotlin.jvm.functions.q r13 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r42)
            androidx.compose.runtime.d r14 = r3.mo15017r()
            boolean r14 = r14 instanceof androidx.compose.runtime.C8428d
            if (r14 != 0) goto L_0x03c0
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x03c0:
            r3.mo14938T()
            boolean r14 = r3.mo14997l()
            if (r14 == 0) goto L_0x03cd
            r3.mo14947W(r12)
            goto L_0x03d0
        L_0x03cd:
            r3.mo14888A()
        L_0x03d0:
            r3.mo14941U()
            androidx.compose.runtime.o r12 = androidx.compose.runtime.Updater.m30180b(r3)
            kotlin.jvm.functions.p r14 = r26.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r12, r8, r14)
            kotlin.jvm.functions.p r8 = r26.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r12, r9, r8)
            kotlin.jvm.functions.p r8 = r26.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r12, r10, r8)
            kotlin.jvm.functions.p r8 = r26.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r12, r11, r8)
            r3.mo14972e()
            androidx.compose.runtime.o r8 = androidx.compose.runtime.C8684u1.m31906b(r3)
            androidx.compose.runtime.u1 r8 = androidx.compose.runtime.C8684u1.m31905a(r8)
            r9 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r13.invoke(r8, r3, r10)
            r8 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r3.mo14918M(r8)
            androidx.compose.ui.text.style.i$a r8 = androidx.compose.p004ui.text.style.C16432i.f40718b
            int r8 = r8.mo47667a()
            androidx.compose.material.t0 r9 = androidx.compose.material.C7933t0.f19075a
            int r10 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.w1 r9 = r9.mo11077c(r3, r10)
            androidx.compose.ui.text.p0 r29 = com.carrefour.fid.android.design.theme.C37477d.m153897i(r9)
            r9 = 3
            float r13 = (float) r9
            float r9 = r7 * r13
            float r9 = androidx.compose.p004ui.unit.C16483g.m74435M(r9)
            r10 = 5
            float r10 = (float) r10
            float r9 = r9 / r10
            float r9 = androidx.compose.p004ui.unit.C16483g.m74435M(r9)
            long r37 = androidx.compose.p004ui.unit.C16506u.m74711l(r9)
            androidx.compose.ui.text.font.i0$a r9 = androidx.compose.p004ui.text.font.C16209i0.f40292b
            androidx.compose.ui.text.font.i0 r16 = r9.mo46947c()
            java.lang.String r9 = m117276s(r45)
            r14 = 0
            r15 = 0
            r11 = r42
            r10 = 1
            androidx.compose.ui.m r12 = androidx.compose.foundation.layout.SizeKt.m10112l(r11, r14, r10, r15)
            r14 = 1157296644(0x44faf204, float:2007.563)
            r3.mo14918M(r14)
            boolean r14 = r3.mo15006n0(r4)
            java.lang.Object r10 = r3.mo14921N()
            if (r14 != 0) goto L_0x045a
            java.lang.Object r14 = r19.mo16277a()
            if (r10 != r14) goto L_0x0462
        L_0x045a:
            com.carrefour.fid.android.product.presentation.ui.details.views.RepairabilityKt$Repairability$2$1$2$1$1 r10 = new com.carrefour.fid.android.product.presentation.ui.details.views.RepairabilityKt$Repairability$2$1$2$1$1
            r10.<init>(r4)
            r3.mo14893C(r10)
        L_0x0462:
            r3.mo15002m0()
            kotlin.jvm.functions.l r10 = (kotlin.jvm.functions.C11300l) r10
            r4 = 0
            r14 = 1
            androidx.compose.ui.m r10 = androidx.compose.p004ui.semantics.SemanticsModifierKt.m71868c(r12, r4, r10, r14, r15)
            r17 = 0
            r4 = r11
            r11 = r17
            r14 = 0
            r15 = r14
            r17 = 0
            r18 = 0
            r20 = 0
            androidx.compose.ui.text.style.i r21 = androidx.compose.p004ui.text.style.C16432i.m74172g(r8)
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r31 = 196608(0x30000, float:2.75506E-40)
            r32 = 0
            r33 = 64980(0xfdd4, float:9.1056E-41)
            r8 = r13
            r13 = r37
            r30 = r3
            androidx.compose.material.TextKt.m14196c(r9, r10, r11, r13, r15, r16, r17, r18, r20, r21, r22, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            int r9 = com.carrefour.fid.android.product.C27609f.C27617h.ic_mark
            r10 = 0
            androidx.compose.ui.graphics.painter.Painter r9 = androidx.compose.p004ui.res.C16015f.m71849d(r9, r3, r10)
            r10 = 0
            androidx.compose.ui.c r11 = r34.mo17064e()
            androidx.compose.ui.m r0 = r0.mo7701c(r4, r11)
            float r8 = androidx.compose.p004ui.unit.C16483g.m74435M(r8)
            r11 = 0
            r12 = 0
            r13 = 2
            androidx.compose.ui.m r14 = androidx.compose.foundation.layout.PaddingKt.m10026m(r0, r8, r11, r13, r12)
            r15 = 0
            r16 = 0
            r17 = 0
            float r18 = androidx.compose.p004ui.unit.C16483g.m74435M(r35)
            r19 = 7
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.PaddingKt.m10028o(r14, r15, r16, r17, r18, r19, r20)
            r8 = 4
            float r8 = (float) r8
            float r8 = r7 / r8
            float r8 = androidx.compose.p004ui.unit.C16483g.m74435M(r8)
            androidx.compose.ui.m r11 = androidx.compose.foundation.layout.SizeKt.m10087C(r0, r8)
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r17 = 56
            r18 = 120(0x78, float:1.68E-43)
            r16 = r3
            androidx.compose.foundation.ImageKt.m8967b(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r3.mo15002m0()
            r3.mo14896D()
            r3.mo15002m0()
            r3.mo15002m0()
            r3.mo15002m0()
            r3.mo14896D()
            r3.mo15002m0()
            r3.mo15002m0()
            int r0 = com.carrefour.fid.android.product.C27609f.C27617h.ic_repairability_text
            r8 = 0
            androidx.compose.ui.graphics.painter.Painter r9 = androidx.compose.p004ui.res.C16015f.m71849d(r0, r3, r8)
            r21 = 0
            float r22 = androidx.compose.p004ui.unit.C16483g.m74435M(r35)
            r23 = 0
            r24 = 0
            r25 = 13
            r26 = 0
            r20 = r4
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.PaddingKt.m10028o(r20, r21, r22, r23, r24, r25, r26)
            r4 = 6
            float r4 = (float) r4
            float r4 = r7 / r4
            float r4 = androidx.compose.p004ui.unit.C16483g.m74435M(r4)
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.SizeKt.m10115o(r0, r4)
            androidx.compose.ui.c$b r4 = r34.mo17068m()
            androidx.compose.ui.m r11 = r6.mo7714e(r0, r4)
            androidx.compose.foundation.ImageKt.m8967b(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r3.mo15002m0()
            r3.mo14896D()
            r3.mo15002m0()
            r3.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x053b
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x053b:
            r4 = r5
            r5 = r7
        L_0x053d:
            androidx.compose.runtime.t1 r10 = r3.mo15020s()
            if (r10 != 0) goto L_0x0544
            goto L_0x0557
        L_0x0544:
            com.carrefour.fid.android.product.presentation.ui.details.views.RepairabilityKt$Repairability$3 r11 = new com.carrefour.fid.android.product.presentation.ui.details.views.RepairabilityKt$Repairability$3
            r0 = r11
            r1 = r40
            r3 = r36
            r6 = r45
            r8 = r48
            r9 = r49
            r0.<init>(r1, r3, r4, r5, r6, r8, r9)
            r10.mo15202a(r11)
        L_0x0557:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.p039ui.details.views.RepairabilityKt.m117259b(long, androidx.compose.ui.m, int, float, double, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m117260c(double r15, float r17, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r18, int r19, int r20) {
        /*
            r0 = -1414092626(0xffffffffabb6a8ae, float:-1.2978696E-12)
            r1 = r18
            androidx.compose.runtime.o r11 = r1.mo15009o(r0)
            r1 = r20 & 1
            if (r1 == 0) goto L_0x0011
            r1 = r19 | 6
            r12 = r15
            goto L_0x0024
        L_0x0011:
            r1 = r19 & 14
            r12 = r15
            if (r1 != 0) goto L_0x0022
            boolean r1 = r11.mo14993k(r12)
            if (r1 == 0) goto L_0x001e
            r1 = 4
            goto L_0x001f
        L_0x001e:
            r1 = 2
        L_0x001f:
            r1 = r19 | r1
            goto L_0x0024
        L_0x0022:
            r1 = r19
        L_0x0024:
            r2 = r20 & 2
            if (r2 == 0) goto L_0x002b
            r1 = r1 | 48
            goto L_0x003e
        L_0x002b:
            r3 = r19 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x003e
            r3 = r17
            boolean r4 = r11.mo14968d(r3)
            if (r4 == 0) goto L_0x003a
            r4 = 32
            goto L_0x003c
        L_0x003a:
            r4 = 16
        L_0x003c:
            r1 = r1 | r4
            goto L_0x0040
        L_0x003e:
            r3 = r17
        L_0x0040:
            r4 = r1 & 91
            r5 = 18
            if (r4 != r5) goto L_0x0052
            boolean r4 = r11.mo15011p()
            if (r4 != 0) goto L_0x004d
            goto L_0x0052
        L_0x004d:
            r11.mo14958a0()
            goto L_0x016e
        L_0x0052:
            if (r2 == 0) goto L_0x005d
            r2 = 30
            float r2 = (float) r2
            float r2 = androidx.compose.p004ui.unit.C16483g.m74435M(r2)
            r14 = r2
            goto L_0x005e
        L_0x005d:
            r14 = r3
        L_0x005e:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x006a
            r2 = -1
            java.lang.String r3 = "com.carrefour.fid.android.product.presentation.ui.details.views.Repairability (Repairability.kt:57)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r1, r2, r3)
        L_0x006a:
            kotlin.ranges.f<java.lang.Double> r0 = f67737b
            java.lang.Double r2 = java.lang.Double.valueOf(r15)
            boolean r0 = r0.mo23006e(r2)
            r2 = 57344(0xe000, float:8.0356E-41)
            if (r0 == 0) goto L_0x009d
            r0 = 222346329(0xd40bc59, float:5.9391283E-31)
            r11.mo14918M(r0)
            long r3 = f67742g
            r0 = 0
            r5 = 0
            int r6 = r1 << 6
            r6 = r6 & 7168(0x1c00, float:1.0045E-41)
            r6 = r6 | 6
            int r1 = r1 << 12
            r1 = r1 & r2
            r9 = r6 | r1
            r10 = 6
            r1 = r3
            r3 = r0
            r4 = r5
            r5 = r14
            r6 = r15
            r8 = r11
            m117259b(r1, r3, r4, r5, r6, r8, r9, r10)
            r11.mo15002m0()
            goto L_0x0164
        L_0x009d:
            kotlin.ranges.f<java.lang.Double> r0 = f67738c
            java.lang.Double r3 = java.lang.Double.valueOf(r15)
            boolean r0 = r0.mo23006e(r3)
            if (r0 == 0) goto L_0x00cd
            r0 = 222346417(0xd40bcb1, float:5.9391697E-31)
            r11.mo14918M(r0)
            long r3 = f67743h
            r0 = 0
            r5 = 0
            int r6 = r1 << 6
            r6 = r6 & 7168(0x1c00, float:1.0045E-41)
            r6 = r6 | 6
            int r1 = r1 << 12
            r1 = r1 & r2
            r9 = r6 | r1
            r10 = 6
            r1 = r3
            r3 = r0
            r4 = r5
            r5 = r14
            r6 = r15
            r8 = r11
            m117259b(r1, r3, r4, r5, r6, r8, r9, r10)
            r11.mo15002m0()
            goto L_0x0164
        L_0x00cd:
            kotlin.ranges.f<java.lang.Double> r0 = f67739d
            java.lang.Double r3 = java.lang.Double.valueOf(r15)
            boolean r0 = r0.mo23006e(r3)
            if (r0 == 0) goto L_0x00fd
            r0 = 222346505(0xd40bd09, float:5.939211E-31)
            r11.mo14918M(r0)
            long r3 = f67744i
            r0 = 0
            r5 = 0
            int r6 = r1 << 6
            r6 = r6 & 7168(0x1c00, float:1.0045E-41)
            r6 = r6 | 6
            int r1 = r1 << 12
            r1 = r1 & r2
            r9 = r6 | r1
            r10 = 6
            r1 = r3
            r3 = r0
            r4 = r5
            r5 = r14
            r6 = r15
            r8 = r11
            m117259b(r1, r3, r4, r5, r6, r8, r9, r10)
            r11.mo15002m0()
            goto L_0x0164
        L_0x00fd:
            kotlin.ranges.f<java.lang.Double> r0 = f67740e
            java.lang.Double r3 = java.lang.Double.valueOf(r15)
            boolean r0 = r0.mo23006e(r3)
            if (r0 == 0) goto L_0x012c
            r0 = 222346593(0xd40bd61, float:5.9392524E-31)
            r11.mo14918M(r0)
            long r3 = f67745j
            r0 = 0
            r5 = 0
            int r6 = r1 << 6
            r6 = r6 & 7168(0x1c00, float:1.0045E-41)
            r6 = r6 | 6
            int r1 = r1 << 12
            r1 = r1 & r2
            r9 = r6 | r1
            r10 = 6
            r1 = r3
            r3 = r0
            r4 = r5
            r5 = r14
            r6 = r15
            r8 = r11
            m117259b(r1, r3, r4, r5, r6, r8, r9, r10)
            r11.mo15002m0()
            goto L_0x0164
        L_0x012c:
            kotlin.ranges.f<java.lang.Double> r0 = f67741f
            java.lang.Double r3 = java.lang.Double.valueOf(r15)
            boolean r0 = r0.mo23006e(r3)
            if (r0 == 0) goto L_0x015b
            r0 = 222346681(0xd40bdb9, float:5.939294E-31)
            r11.mo14918M(r0)
            long r3 = f67746k
            r0 = 0
            r5 = 0
            int r6 = r1 << 6
            r6 = r6 & 7168(0x1c00, float:1.0045E-41)
            r6 = r6 | 6
            int r1 = r1 << 12
            r1 = r1 & r2
            r9 = r6 | r1
            r10 = 6
            r1 = r3
            r3 = r0
            r4 = r5
            r5 = r14
            r6 = r15
            r8 = r11
            m117259b(r1, r3, r4, r5, r6, r8, r9, r10)
            r11.mo15002m0()
            goto L_0x0164
        L_0x015b:
            r0 = 222346752(0xd40be00, float:5.939327E-31)
            r11.mo14918M(r0)
            r11.mo15002m0()
        L_0x0164:
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x016d
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x016d:
            r3 = r14
        L_0x016e:
            androidx.compose.runtime.t1 r6 = r11.mo15020s()
            if (r6 != 0) goto L_0x0175
            goto L_0x0183
        L_0x0175:
            com.carrefour.fid.android.product.presentation.ui.details.views.RepairabilityKt$Repairability$1 r7 = new com.carrefour.fid.android.product.presentation.ui.details.views.RepairabilityKt$Repairability$1
            r0 = r7
            r1 = r15
            r4 = r19
            r5 = r20
            r0.<init>(r1, r3, r4, r5)
            r6.mo15202a(r7)
        L_0x0183:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.p039ui.details.views.RepairabilityKt.m117260c(double, float, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0380  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m117261d(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r41, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r42, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r43, int r44, int r45) {
        /*
            r0 = r44
            r1 = r45
            r2 = -1495662418(0xffffffffa6da00ae, float:-1.5126973E-15)
            r3 = r43
            androidx.compose.runtime.o r15 = r3.mo15009o(r2)
            r3 = r1 & 1
            if (r3 == 0) goto L_0x0017
            r4 = r0 | 6
            r5 = r4
            r4 = r41
            goto L_0x002b
        L_0x0017:
            r4 = r0 & 14
            if (r4 != 0) goto L_0x0028
            r4 = r41
            boolean r5 = r15.mo15006n0(r4)
            if (r5 == 0) goto L_0x0025
            r5 = 4
            goto L_0x0026
        L_0x0025:
            r5 = 2
        L_0x0026:
            r5 = r5 | r0
            goto L_0x002b
        L_0x0028:
            r4 = r41
            r5 = r0
        L_0x002b:
            r6 = r1 & 2
            r7 = 16
            if (r6 == 0) goto L_0x0034
            r5 = r5 | 48
            goto L_0x0046
        L_0x0034:
            r8 = r0 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x0046
            r8 = r42
            boolean r9 = r15.mo14927P(r8)
            if (r9 == 0) goto L_0x0043
            r9 = 32
            goto L_0x0044
        L_0x0043:
            r9 = r7
        L_0x0044:
            r5 = r5 | r9
            goto L_0x0048
        L_0x0046:
            r8 = r42
        L_0x0048:
            r14 = r5
            r5 = r14 & 91
            r9 = 18
            if (r5 != r9) goto L_0x005c
            boolean r5 = r15.mo15011p()
            if (r5 != 0) goto L_0x0056
            goto L_0x005c
        L_0x0056:
            r15.mo14958a0()
            r11 = r15
            goto L_0x0379
        L_0x005c:
            if (r3 == 0) goto L_0x0062
            androidx.compose.ui.m$a r3 = androidx.compose.p004ui.C8767m.f23478j
            r12 = r3
            goto L_0x0063
        L_0x0062:
            r12 = r4
        L_0x0063:
            if (r6 == 0) goto L_0x006a
            com.carrefour.fid.android.product.presentation.ui.details.views.RepairabilityKt$RepairabilityInfo$1 r3 = com.carrefour.fid.android.product.presentation.p039ui.details.views.RepairabilityKt$RepairabilityInfo$1.f67749f
            r28 = r3
            goto L_0x006c
        L_0x006a:
            r28 = r8
        L_0x006c:
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x0078
            r3 = -1
            java.lang.String r4 = "com.carrefour.fid.android.product.presentation.ui.details.views.RepairabilityInfo (Repairability.kt:68)"
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r14, r3, r4)
        L_0x0078:
            androidx.compose.runtime.i1 r2 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71024v()
            java.lang.Object r2 = r15.mo15032w(r2)
            androidx.compose.ui.platform.z3 r2 = (androidx.compose.p004ui.platform.C16007z3) r2
            float r13 = (float) r7
            float r3 = androidx.compose.p004ui.unit.C16483g.m74435M(r13)
            androidx.compose.ui.m r3 = androidx.compose.foundation.layout.PaddingKt.m10024k(r12, r3)
            r4 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r15.mo14918M(r4)
            androidx.compose.foundation.layout.Arrangement r29 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$l r4 = r29.mo7631r()
            androidx.compose.ui.c$a r30 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r5 = r30.mo17072u()
            r11 = 0
            androidx.compose.ui.layout.f0 r4 = androidx.compose.foundation.layout.ColumnKt.m9863b(r4, r5, r15, r11)
            r10 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r15.mo14918M(r10)
            androidx.compose.runtime.i1 r5 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r5 = r15.mo15032w(r5)
            androidx.compose.ui.unit.d r5 = (androidx.compose.p004ui.unit.C16479d) r5
            androidx.compose.runtime.i1 r6 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r6 = r15.mo15032w(r6)
            androidx.compose.ui.unit.LayoutDirection r6 = (androidx.compose.p004ui.unit.LayoutDirection) r6
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r7 = r15.mo15032w(r7)
            androidx.compose.ui.platform.c4 r7 = (androidx.compose.p004ui.platform.C15863c4) r7
            androidx.compose.ui.node.ComposeUiNode$Companion r31 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r8 = r31.mo44585a()
            kotlin.jvm.functions.q r3 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r3)
            androidx.compose.runtime.d r9 = r15.mo15017r()
            boolean r9 = r9 instanceof androidx.compose.runtime.C8428d
            if (r9 != 0) goto L_0x00db
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x00db:
            r15.mo14938T()
            boolean r9 = r15.mo14997l()
            if (r9 == 0) goto L_0x00e8
            r15.mo14947W(r8)
            goto L_0x00eb
        L_0x00e8:
            r15.mo14888A()
        L_0x00eb:
            r15.mo14941U()
            androidx.compose.runtime.o r8 = androidx.compose.runtime.Updater.m30180b(r15)
            kotlin.jvm.functions.p r9 = r31.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r8, r4, r9)
            kotlin.jvm.functions.p r4 = r31.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r8, r5, r4)
            kotlin.jvm.functions.p r4 = r31.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r8, r6, r4)
            kotlin.jvm.functions.p r4 = r31.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r8, r7, r4)
            r15.mo14972e()
            androidx.compose.runtime.o r4 = androidx.compose.runtime.C8684u1.m31906b(r15)
            androidx.compose.runtime.u1 r4 = androidx.compose.runtime.C8684u1.m31905a(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r11)
            r3.invoke(r4, r15, r5)
            r9 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r15.mo14918M(r9)
            androidx.compose.foundation.layout.ColumnScopeInstance r3 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            int r3 = com.carrefour.fid.android.product.C27609f.C27627r.pdp_repairability_info_title
            java.lang.String r3 = androidx.compose.p004ui.res.C16018i.m71858d(r3, r15, r11)
            androidx.compose.material.t0 r7 = androidx.compose.material.C7933t0.f19075a
            int r8 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.w1 r4 = r7.mo11077c(r15, r8)
            androidx.compose.ui.text.p0 r23 = r4.mo11098k()
            androidx.compose.ui.m$a r5 = androidx.compose.p004ui.C8767m.f23478j
            r4 = r5
            r16 = 0
            r41 = r5
            r5 = r16
            r32 = r7
            r33 = r8
            r7 = r16
            r16 = 0
            r9 = r16
            r10 = r16
            r11 = r16
            r16 = 0
            r36 = r12
            r35 = r13
            r12 = r16
            r16 = 0
            r37 = r14
            r14 = r16
            r42 = r15
            r15 = r16
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r25 = 48
            r26 = 0
            r27 = 65532(0xfffc, float:9.183E-41)
            r24 = r42
            androidx.compose.material.TextKt.m14196c(r3, r4, r5, r7, r9, r10, r11, r12, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            int r3 = com.carrefour.fid.android.product.C27609f.C27627r.pdp_repairability_info_text
            r15 = r42
            r14 = 0
            java.lang.String r3 = androidx.compose.p004ui.res.C16018i.m71858d(r3, r15, r14)
            r12 = r32
            r13 = r33
            androidx.compose.material.w1 r4 = r12.mo11077c(r15, r13)
            androidx.compose.ui.text.p0 r23 = com.carrefour.fid.android.design.theme.C37477d.m153892d(r4)
            r17 = 0
            r4 = 8
            float r4 = (float) r4
            float r18 = androidx.compose.p004ui.unit.C16483g.m74435M(r4)
            r19 = 0
            r20 = 0
            r21 = 13
            r16 = r41
            androidx.compose.ui.m r4 = androidx.compose.foundation.layout.PaddingKt.m10028o(r16, r17, r18, r19, r20, r21, r22)
            r5 = 0
            r6 = 0
            r7 = 0
            float r8 = androidx.compose.p004ui.unit.C16483g.m74435M(r35)
            r9 = 7
            r10 = 0
            androidx.compose.ui.m r4 = androidx.compose.foundation.layout.PaddingKt.m10028o(r4, r5, r6, r7, r8, r9, r10)
            r5 = 0
            r7 = 0
            r9 = 0
            r11 = 0
            r16 = 0
            r38 = r12
            r39 = r13
            r12 = r16
            r16 = 0
            r34 = r14
            r14 = r16
            r15 = r16
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            androidx.compose.material.TextKt.m14196c(r3, r4, r5, r7, r9, r10, r11, r12, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r15 = 0
            r14 = 1
            r13 = 0
            r12 = r36
            androidx.compose.ui.m r16 = androidx.compose.foundation.layout.SizeKt.m10114n(r12, r15, r14, r13)
            androidx.compose.material.i r3 = androidx.compose.material.C3049i.f8133a
            com.carrefour.fid.android.design.theme.b r32 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r4 = r32.mo114218O()
            r6 = 0
            r8 = 0
            r10 = 0
            int r17 = androidx.compose.material.C3049i.f8145m
            int r17 = r17 << 12
            r18 = 14
            r33 = r12
            r12 = r42
            r13 = r17
            r14 = r18
            androidx.compose.material.h r10 = r3.mo10775a(r4, r6, r8, r10, r12, r13, r14)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            com.carrefour.fid.android.product.presentation.ui.details.views.ComposableSingletons$RepairabilityKt r3 = com.carrefour.fid.android.product.presentation.p039ui.details.views.ComposableSingletons$RepairabilityKt.f67664a
            kotlin.jvm.functions.q r12 = r3.mo81224a()
            r14 = 3
            int r3 = r37 >> 3
            r3 = r3 & 14
            r4 = 805306368(0x30000000, float:4.656613E-10)
            r17 = r3 | r4
            r18 = 380(0x17c, float:5.32E-43)
            r3 = r28
            r4 = r16
            r13 = r42
            r14 = r17
            r0 = r15
            r15 = r18
            androidx.compose.material.ButtonKt.m13343a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            androidx.compose.foundation.layout.Arrangement$e r3 = r29.mo7625f()
            androidx.compose.ui.c$c r4 = r30.mo17070q()
            r5 = 0
            r6 = 1
            r15 = r41
            androidx.compose.ui.m r7 = androidx.compose.foundation.layout.SizeKt.m10114n(r15, r0, r6, r5)
            r8 = 0
            float r9 = androidx.compose.p004ui.unit.C16483g.m74435M(r35)
            r10 = 0
            r11 = 0
            r12 = 13
            r13 = 0
            androidx.compose.ui.m r16 = androidx.compose.foundation.layout.PaddingKt.m10028o(r7, r8, r9, r10, r11, r12, r13)
            r17 = 0
            r18 = 0
            r19 = 0
            com.carrefour.fid.android.product.presentation.ui.details.views.RepairabilityKt$RepairabilityInfo$2$1 r0 = new com.carrefour.fid.android.product.presentation.ui.details.views.RepairabilityKt$RepairabilityInfo$2$1
            r0.<init>(r2)
            r21 = 7
            r20 = r0
            androidx.compose.ui.m r0 = androidx.compose.foundation.ClickableKt.m8878e(r16, r17, r18, r19, r20, r21, r22)
            r2 = 693286680(0x2952b718, float:4.6788176E-14)
            r14 = r42
            r14.mo14918M(r2)
            r2 = 54
            androidx.compose.ui.layout.f0 r2 = androidx.compose.foundation.layout.RowKt.m10071d(r3, r4, r14, r2)
            r3 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r14.mo14918M(r3)
            androidx.compose.runtime.i1 r3 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r3 = r14.mo15032w(r3)
            androidx.compose.ui.unit.d r3 = (androidx.compose.p004ui.unit.C16479d) r3
            androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r4 = r14.mo15032w(r4)
            androidx.compose.ui.unit.LayoutDirection r4 = (androidx.compose.p004ui.unit.LayoutDirection) r4
            androidx.compose.runtime.i1 r5 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r5 = r14.mo15032w(r5)
            androidx.compose.ui.platform.c4 r5 = (androidx.compose.p004ui.platform.C15863c4) r5
            kotlin.jvm.functions.a r6 = r31.mo44585a()
            kotlin.jvm.functions.q r0 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r0)
            androidx.compose.runtime.d r7 = r14.mo15017r()
            boolean r7 = r7 instanceof androidx.compose.runtime.C8428d
            if (r7 != 0) goto L_0x0299
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0299:
            r14.mo14938T()
            boolean r7 = r14.mo14997l()
            if (r7 == 0) goto L_0x02a6
            r14.mo14947W(r6)
            goto L_0x02a9
        L_0x02a6:
            r14.mo14888A()
        L_0x02a9:
            r14.mo14941U()
            androidx.compose.runtime.o r6 = androidx.compose.runtime.Updater.m30180b(r14)
            kotlin.jvm.functions.p r7 = r31.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r6, r2, r7)
            kotlin.jvm.functions.p r2 = r31.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r6, r3, r2)
            kotlin.jvm.functions.p r2 = r31.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r6, r4, r2)
            kotlin.jvm.functions.p r2 = r31.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r6, r5, r2)
            r14.mo14972e()
            androidx.compose.runtime.o r2 = androidx.compose.runtime.C8684u1.m31906b(r14)
            androidx.compose.runtime.u1 r2 = androidx.compose.runtime.C8684u1.m31905a(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r34)
            r0.invoke(r2, r14, r3)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r14.mo14918M(r0)
            androidx.compose.foundation.layout.RowScopeInstance r0 = androidx.compose.foundation.layout.RowScopeInstance.f6147a
            int r0 = com.carrefour.fid.android.product.C27609f.C27627r.pdp_repairability_link
            r2 = r34
            java.lang.String r3 = androidx.compose.p004ui.res.C16018i.m71858d(r0, r14, r2)
            r0 = r38
            r4 = r39
            androidx.compose.material.w1 r0 = r0.mo11077c(r14, r4)
            androidx.compose.ui.text.p0 r23 = com.carrefour.fid.android.design.theme.C37477d.m153896h(r0)
            long r5 = r32.mo114218O()
            r4 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r0 = 0
            r42 = r14
            r14 = r0
            r40 = r15
            r15 = r0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r25 = 0
            r26 = 0
            r27 = 65530(0xfffa, float:9.1827E-41)
            r24 = r42
            androidx.compose.material.TextKt.m14196c(r3, r4, r5, r7, r9, r10, r11, r12, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            int r0 = com.carrefour.fid.android.product.C27609f.C27617h.ds_ic_straight_arrows_up_right
            r11 = r42
            androidx.compose.ui.graphics.painter.Painter r3 = androidx.compose.p004ui.res.C16015f.m71849d(r0, r11, r2)
            long r6 = r32.mo114218O()
            float r0 = androidx.compose.p004ui.unit.C16483g.m74435M(r35)
            r2 = r40
            androidx.compose.ui.m r12 = androidx.compose.foundation.layout.SizeKt.m10087C(r2, r0)
            r0 = 3
            float r0 = (float) r0
            float r13 = androidx.compose.p004ui.unit.C16483g.m74435M(r0)
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 14
            r18 = 0
            androidx.compose.ui.m r5 = androidx.compose.foundation.layout.PaddingKt.m10028o(r12, r13, r14, r15, r16, r17, r18)
            r9 = 440(0x1b8, float:6.17E-43)
            r10 = 0
            r8 = r11
            androidx.compose.material.IconKt.m13539b(r3, r4, r5, r6, r8, r9, r10)
            r11.mo15002m0()
            r11.mo14896D()
            r11.mo15002m0()
            r11.mo15002m0()
            r11.mo15002m0()
            r11.mo14896D()
            r11.mo15002m0()
            r11.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0375
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0375:
            r8 = r28
            r4 = r33
        L_0x0379:
            androidx.compose.runtime.t1 r0 = r11.mo15020s()
            if (r0 != 0) goto L_0x0380
            goto L_0x038a
        L_0x0380:
            com.carrefour.fid.android.product.presentation.ui.details.views.RepairabilityKt$RepairabilityInfo$3 r2 = new com.carrefour.fid.android.product.presentation.ui.details.views.RepairabilityKt$RepairabilityInfo$3
            r3 = r44
            r2.<init>(r4, r8, r3, r1)
            r0.mo15202a(r2)
        L_0x038a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.p039ui.details.views.RepairabilityKt.m117261d(androidx.compose.ui.m, kotlin.jvm.functions.a, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: e */
    public static final void m117262e(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1612466015);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1612466015, i, -1, "com.carrefour.fid.android.product.presentation.ui.details.views.RepairabilityInfoPreview (Repairability.kt:231)");
            }
            ThemeKt.m153788a(ComposableSingletons$RepairabilityKt.f67664a.mo81232i(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new RepairabilityKt$RepairabilityInfoPreview$1(i));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: f */
    public static final void m117263f(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-383693715);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-383693715, i, -1, "com.carrefour.fid.android.product.presentation.ui.details.views.RepairabilityPreview (Repairability.kt:241)");
            }
            ThemeKt.m153788a(ComposableSingletons$RepairabilityKt.f67664a.mo81234k(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new RepairabilityKt$RepairabilityPreview$1(i));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: g */
    public static final void m117264g(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(236547149);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(236547149, i, -1, "com.carrefour.fid.android.product.presentation.ui.details.views.RepairabilityPreview2 (Repairability.kt:251)");
            }
            ThemeKt.m153788a(ComposableSingletons$RepairabilityKt.f67664a.mo81236m(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new RepairabilityKt$RepairabilityPreview2$1(i));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: h */
    public static final void m117265h(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1037082702);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1037082702, i, -1, "com.carrefour.fid.android.product.presentation.ui.details.views.RepairabilityPreview3 (Repairability.kt:261)");
            }
            ThemeKt.m153788a(ComposableSingletons$RepairabilityKt.f67664a.mo81238o(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new RepairabilityKt$RepairabilityPreview3$1(i));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: i */
    public static final void m117266i(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1837618255);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1837618255, i, -1, "com.carrefour.fid.android.product.presentation.ui.details.views.RepairabilityPreview4 (Repairability.kt:271)");
            }
            ThemeKt.m153788a(ComposableSingletons$RepairabilityKt.f67664a.mo81226c(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new RepairabilityKt$RepairabilityPreview4$1(i));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: j */
    public static final void m117267j(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-1656813488);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1656813488, i, -1, "com.carrefour.fid.android.product.presentation.ui.details.views.RepairabilityPreview5 (Repairability.kt:281)");
            }
            ThemeKt.m153788a(ComposableSingletons$RepairabilityKt.f67664a.mo81228e(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new RepairabilityKt$RepairabilityPreview5$1(i));
        }
    }

    /* renamed from: s */
    public static final String m117276s(double d) {
        DecimalFormat decimalFormat = new DecimalFormat(f67748m);
        DecimalFormatSymbols instance = DecimalFormatSymbols.getInstance();
        instance.setDecimalSeparator(',');
        decimalFormat.setDecimalFormatSymbols(instance);
        String format = decimalFormat.format(d);
        Intrinsics.checkNotNullExpressionValue(format, "df.format(level)");
        return format;
    }

    /* renamed from: t */
    public static final void m117277t(@C12579k C16007z3 z3Var, @C12579k String str) {
        Intrinsics.checkNotNullParameter(z3Var, "uriHandler");
        Intrinsics.checkNotNullParameter(str, "locationLink");
        try {
            z3Var.mo45708a(str);
        } catch (ActivityNotFoundException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("link not valid : ");
            sb.append(str);
        }
    }
}

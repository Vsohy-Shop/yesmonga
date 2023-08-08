package com.carrefour.fid.android.presentation.p035ui.coupons.scanBarcode;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16015f;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.presentation.p035ui.coupons.scanBarcode.C23962a;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nModalBottomSheetScanContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheetScanContent.kt\ncom/carrefour/fid/android/presentation/ui/coupons/scanBarcode/ModalBottomSheetScanContentKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,249:1\n75#2,5:250\n80#2:281\n84#2:286\n74#2,6:288\n80#2:320\n84#2:334\n78#2,2:335\n80#2:363\n78#2,2:404\n80#2:432\n84#2:440\n84#2:492\n75#3:255\n76#3,11:257\n89#3:285\n75#3:294\n76#3,11:296\n89#3:333\n75#3:337\n76#3,11:339\n75#3:371\n76#3,11:373\n89#3:401\n75#3:406\n76#3,11:408\n89#3:439\n75#3:449\n76#3,11:451\n89#3:486\n89#3:491\n76#4:256\n76#4:295\n76#4:338\n76#4:372\n76#4:407\n76#4:450\n460#5,13:268\n473#5,3:282\n460#5,13:307\n36#5:323\n473#5,3:330\n460#5,13:350\n460#5,13:384\n473#5,3:398\n460#5,13:419\n473#5,3:436\n460#5,13:462\n36#5:476\n473#5,3:483\n473#5,3:488\n154#6:287\n154#6:321\n154#6:322\n154#6:364\n154#6:403\n154#6:433\n154#6:434\n154#6:435\n154#6:441\n154#6:442\n1114#7,6:324\n1114#7,6:477\n75#8,6:365\n81#8:397\n85#8:402\n75#8,6:443\n81#8:475\n85#8:487\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheetScanContent.kt\ncom/carrefour/fid/android/presentation/ui/coupons/scanBarcode/ModalBottomSheetScanContentKt\n*L\n48#1:250,5\n48#1:281\n48#1:286\n95#1:288,6\n95#1:320\n95#1:334\n137#1:335,2\n137#1:363\n159#1:404,2\n159#1:432\n159#1:440\n137#1:492\n48#1:255\n48#1:257,11\n48#1:285\n95#1:294\n95#1:296,11\n95#1:333\n137#1:337\n137#1:339,11\n144#1:371\n144#1:373,11\n144#1:401\n159#1:406\n159#1:408,11\n159#1:439\n206#1:449\n206#1:451,11\n206#1:486\n137#1:491\n48#1:256\n95#1:295\n137#1:338\n144#1:372\n159#1:407\n206#1:450\n48#1:268,13\n48#1:282,3\n95#1:307,13\n123#1:323\n95#1:330,3\n137#1:350,13\n144#1:384,13\n144#1:398,3\n159#1:419,13\n159#1:436,3\n206#1:462,13\n216#1:476\n206#1:483,3\n137#1:488,3\n99#1:287\n105#1:321\n106#1:322\n148#1:364\n164#1:403\n167#1:433\n190#1:434\n203#1:435\n210#1:441\n211#1:442\n123#1:324,6\n216#1:477,6\n144#1:365,6\n144#1:397\n144#1:402\n206#1:443,6\n206#1:475\n206#1:487\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.scanBarcode.ModalBottomSheetScanContentKt */
public final class ModalBottomSheetScanContentKt {
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m105860a(@C12579k C23962a aVar, @C12579k C11289a<C11079d2> aVar2, @C12580l C8592o oVar, int i) {
        int i2;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(aVar, "bottomSheetType");
        Intrinsics.checkNotNullParameter(aVar2, "hideBottomSheetAction");
        C8592o o = oVar.mo15009o(-544581888);
        if ((i & 14) == 0) {
            if (o.mo15006n0(aVar)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (o.mo14927P(aVar2)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) != 18 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-544581888, i2, -1, "com.carrefour.fid.android.presentation.ui.coupons.scanBarcode.ModalBottomSheetScan (ModalBottomSheetScanContent.kt:43)");
            }
            Arrangement.C2271e n = Arrangement.f6010a.mo7629n();
            C8767m n2 = SizeKt.m10114n(C8767m.f23478j, 0.0f, 1, (Object) null);
            C37475b bVar = C37475b.f94185a;
            C8767m d = BackgroundKt.m8825d(n2, bVar.mo114231a0(), (C15218g4) null, 2, (Object) null);
            o.mo14918M(-483455358);
            C15560f0 b = ColumnKt.m9863b(n, C8734c.f23406a.mo17072u(), o, 6);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(d);
            if (!(o.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            o.mo14938T();
            if (o.mo14997l()) {
                o.mo14947W(a);
            } else {
                o.mo14888A();
            }
            o.mo14941U();
            C8592o b2 = Updater.m30180b(o);
            Updater.m30188j(b2, b, companion.mo44588d());
            Updater.m30188j(b2, dVar, companion.mo44586b());
            Updater.m30188j(b2, layoutDirection, companion.mo44587c());
            Updater.m30188j(b2, c4Var, companion.mo44590f());
            o.mo14972e();
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
            if (Intrinsics.areEqual((Object) aVar, (Object) C23962a.C23963a.f60151b)) {
                o.mo14918M(378686391);
                m105861b(aVar2, o, (i2 >> 3) & 14);
                o.mo15002m0();
            } else if (Intrinsics.areEqual((Object) aVar, (Object) C23962a.C23965c.f60155b)) {
                o.mo14918M(378686519);
                int i5 = ((i2 << 9) & 57344) | 8;
                m105862c(C16015f.m71849d(R.drawable.ds_il_deleted_product_list, o, 0), C16018i.m71858d(R.string.coupons_scan_unknown_product_sheet_title, o, 0), C16018i.m71858d(R.string.coupons_scan_unknown_product_sheet_message, o, 0), 0, aVar2, o, i5, 8);
                o.mo15002m0();
            } else if (Intrinsics.areEqual((Object) aVar, (Object) C23962a.C23964b.f60153b)) {
                o.mo14918M(378687007);
                int i6 = ((i2 << 9) & 57344) | 8;
                m105862c(C16015f.m71849d(R.drawable.ds_il_deleted_product_list, o, 0), C16018i.m71858d(R.string.coupons_scan_unvalid_product_sheet_title, o, 0), C16018i.m71858d(R.string.coupons_scan_unvalid_product_sheet_message, o, 0), 0, aVar2, o, i6, 8);
                o.mo15002m0();
            } else if (Intrinsics.areEqual((Object) aVar, (Object) C23962a.C23966d.f60157b)) {
                o.mo14918M(378687493);
                m105862c(C16015f.m71849d(R.drawable.ds_il_products_validation, o, 0), C16018i.m71858d(R.string.coupons_scan_valid_product_sheet_title, o, 0), C16018i.m71858d(R.string.coupons_scan_valid_product_sheet_message, o, 0), bVar.mo114251s(), aVar2, o, ((i2 << 9) & 57344) | 8, 0);
                o.mo15002m0();
            } else {
                o.mo14918M(378687986);
                o.mo15002m0();
            }
            o.mo15002m0();
            o.mo14896D();
            o.mo15002m0();
            o.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new ModalBottomSheetScanContentKt$ModalBottomSheetScan$2(aVar, aVar2, i));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v34, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m105861b(kotlin.jvm.functions.C11289a<kotlin.C11079d2> r77, androidx.compose.runtime.C8592o r78, int r79) {
        /*
            r0 = r77
            r1 = r79
            r2 = 54575944(0x340c348, float:5.66479E-37)
            r3 = r78
            androidx.compose.runtime.o r15 = r3.mo15009o(r2)
            r3 = r1 & 14
            r4 = 2
            if (r3 != 0) goto L_0x001d
            boolean r3 = r15.mo14927P(r0)
            if (r3 == 0) goto L_0x001a
            r3 = 4
            goto L_0x001b
        L_0x001a:
            r3 = r4
        L_0x001b:
            r3 = r3 | r1
            goto L_0x001e
        L_0x001d:
            r3 = r1
        L_0x001e:
            r5 = r3 & 11
            if (r5 != r4) goto L_0x002f
            boolean r4 = r15.mo15011p()
            if (r4 != 0) goto L_0x0029
            goto L_0x002f
        L_0x0029:
            r15.mo14958a0()
            r2 = r15
            goto L_0x053f
        L_0x002f:
            boolean r4 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r4 == 0) goto L_0x003b
            r4 = -1
            java.lang.String r5 = "com.carrefour.fid.android.presentation.ui.coupons.scanBarcode.OnBoardingBottomSheet (ModalBottomSheetScanContent.kt:133)"
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r3, r4, r5)
        L_0x003b:
            androidx.compose.foundation.layout.Arrangement r2 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$e r3 = r2.mo7628l()
            androidx.compose.ui.c$a r29 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r4 = r29.mo17068m()
            androidx.compose.ui.m$a r14 = androidx.compose.p004ui.C8767m.f23478j
            r12 = 0
            r13 = 1
            r11 = 0
            androidx.compose.ui.m r5 = androidx.compose.foundation.layout.SizeKt.m10114n(r14, r12, r13, r11)
            r6 = 1065017672(0x3f7ae148, float:0.98)
            androidx.compose.ui.m r5 = androidx.compose.foundation.layout.SizeKt.m10109i(r5, r6)
            r10 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r15.mo14918M(r10)
            r9 = 54
            androidx.compose.ui.layout.f0 r3 = androidx.compose.foundation.layout.ColumnKt.m9863b(r3, r4, r15, r9)
            r7 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r15.mo14918M(r7)
            androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r4 = r15.mo15032w(r4)
            androidx.compose.ui.unit.d r4 = (androidx.compose.p004ui.unit.C16479d) r4
            androidx.compose.runtime.i1 r6 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r6 = r15.mo15032w(r6)
            androidx.compose.ui.unit.LayoutDirection r6 = (androidx.compose.p004ui.unit.LayoutDirection) r6
            androidx.compose.runtime.i1 r8 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r8 = r15.mo15032w(r8)
            androidx.compose.ui.platform.c4 r8 = (androidx.compose.p004ui.platform.C15863c4) r8
            androidx.compose.ui.node.ComposeUiNode$Companion r30 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r9 = r30.mo44585a()
            kotlin.jvm.functions.q r5 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r5)
            androidx.compose.runtime.d r10 = r15.mo15017r()
            boolean r10 = r10 instanceof androidx.compose.runtime.C8428d
            if (r10 != 0) goto L_0x009c
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x009c:
            r15.mo14938T()
            boolean r10 = r15.mo14997l()
            if (r10 == 0) goto L_0x00a9
            r15.mo14947W(r9)
            goto L_0x00ac
        L_0x00a9:
            r15.mo14888A()
        L_0x00ac:
            r15.mo14941U()
            androidx.compose.runtime.o r9 = androidx.compose.runtime.Updater.m30180b(r15)
            kotlin.jvm.functions.p r10 = r30.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r9, r3, r10)
            kotlin.jvm.functions.p r3 = r30.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r9, r4, r3)
            kotlin.jvm.functions.p r3 = r30.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r9, r6, r3)
            kotlin.jvm.functions.p r3 = r30.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r9, r8, r3)
            r15.mo14972e()
            androidx.compose.runtime.o r3 = androidx.compose.runtime.C8684u1.m31906b(r15)
            androidx.compose.runtime.u1 r3 = androidx.compose.runtime.C8684u1.m31905a(r3)
            r10 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r5.invoke(r3, r15, r4)
            r9 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r15.mo14918M(r9)
            androidx.compose.foundation.layout.ColumnScopeInstance r3 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            androidx.compose.ui.c$c r3 = r29.mo17070q()
            androidx.compose.ui.m r4 = androidx.compose.foundation.layout.SizeKt.m10114n(r14, r12, r13, r11)
            r5 = 56
            float r5 = (float) r5
            float r5 = androidx.compose.p004ui.unit.C16483g.m74435M(r5)
            androidx.compose.ui.m r17 = androidx.compose.foundation.layout.SizeKt.m10115o(r4, r5)
            com.carrefour.fid.android.design.theme.b r28 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r18 = r28.mo114208E()
            r20 = 0
            r21 = 2
            r22 = 0
            androidx.compose.ui.m r4 = androidx.compose.foundation.BackgroundKt.m8825d(r17, r18, r20, r21, r22)
            r8 = 693286680(0x2952b718, float:4.6788176E-14)
            r15.mo14918M(r8)
            androidx.compose.foundation.layout.Arrangement$d r5 = r2.mo7630p()
            r6 = 48
            androidx.compose.ui.layout.f0 r3 = androidx.compose.foundation.layout.RowKt.m10071d(r5, r3, r15, r6)
            r15.mo14918M(r7)
            androidx.compose.runtime.i1 r5 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r5 = r15.mo15032w(r5)
            androidx.compose.ui.unit.d r5 = (androidx.compose.p004ui.unit.C16479d) r5
            androidx.compose.runtime.i1 r6 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r6 = r15.mo15032w(r6)
            androidx.compose.ui.unit.LayoutDirection r6 = (androidx.compose.p004ui.unit.LayoutDirection) r6
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r7 = r15.mo15032w(r7)
            androidx.compose.ui.platform.c4 r7 = (androidx.compose.p004ui.platform.C15863c4) r7
            kotlin.jvm.functions.a r8 = r30.mo44585a()
            kotlin.jvm.functions.q r4 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r4)
            androidx.compose.runtime.d r11 = r15.mo15017r()
            boolean r11 = r11 instanceof androidx.compose.runtime.C8428d
            if (r11 != 0) goto L_0x0151
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0151:
            r15.mo14938T()
            boolean r11 = r15.mo14997l()
            if (r11 == 0) goto L_0x015e
            r15.mo14947W(r8)
            goto L_0x0161
        L_0x015e:
            r15.mo14888A()
        L_0x0161:
            r15.mo14941U()
            androidx.compose.runtime.o r8 = androidx.compose.runtime.Updater.m30180b(r15)
            kotlin.jvm.functions.p r11 = r30.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r8, r3, r11)
            kotlin.jvm.functions.p r3 = r30.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r8, r5, r3)
            kotlin.jvm.functions.p r3 = r30.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r8, r6, r3)
            kotlin.jvm.functions.p r3 = r30.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r8, r7, r3)
            r15.mo14972e()
            androidx.compose.runtime.o r3 = androidx.compose.runtime.C8684u1.m31906b(r15)
            androidx.compose.runtime.u1 r3 = androidx.compose.runtime.C8684u1.m31905a(r3)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            r4.invoke(r3, r15, r5)
            r15.mo14918M(r9)
            androidx.compose.foundation.layout.RowScopeInstance r3 = androidx.compose.foundation.layout.RowScopeInstance.f6147a
            r3 = 2131952489(0x7f130369, float:1.9541422E38)
            java.lang.String r3 = androidx.compose.p004ui.res.C16018i.m71858d(r3, r15, r10)
            androidx.compose.material.t0 r11 = androidx.compose.material.C7933t0.f19075a
            int r7 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.w1 r4 = r11.mo11077c(r15, r7)
            androidx.compose.ui.text.p0 r23 = com.carrefour.fid.android.design.theme.C37477d.m153885L(r4)
            long r5 = r28.mo114230a()
            r8 = 48
            androidx.compose.ui.text.style.i$a r31 = androidx.compose.p004ui.text.style.C16432i.f40718b
            int r17 = r31.mo47667a()
            r4 = 0
            androidx.compose.ui.m r20 = androidx.compose.foundation.layout.SizeKt.m10114n(r14, r12, r13, r4)
            r21 = r4
            r4 = r20
            r24 = 0
            r32 = r7
            r7 = r24
            r18 = 0
            r9 = r18
            r78 = r10
            r10 = r18
            r16 = 0
            r37 = r11
            r11 = r16
            r18 = 0
            r12 = r18
            r41 = r14
            r14 = r16
            androidx.compose.ui.text.style.i r16 = androidx.compose.p004ui.text.style.C16432i.m74172g(r17)
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
            r27 = 65016(0xfdf8, float:9.1107E-41)
            r24 = r42
            androidx.compose.material.TextKt.m14196c(r3, r4, r5, r7, r9, r10, r11, r12, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r42.mo15002m0()
            r42.mo14896D()
            r42.mo15002m0()
            r42.mo15002m0()
            androidx.compose.foundation.layout.Arrangement$e r3 = r2.mo7625f()
            androidx.compose.ui.c$b r4 = r29.mo17068m()
            r15 = r41
            r12 = 0
            r13 = 1
            r14 = 0
            androidx.compose.ui.m r5 = androidx.compose.foundation.layout.SizeKt.m10114n(r15, r12, r13, r14)
            r6 = 20
            float r11 = (float) r6
            float r6 = androidx.compose.p004ui.unit.C16483g.m74435M(r11)
            androidx.compose.ui.m r5 = androidx.compose.foundation.layout.PaddingKt.m10024k(r5, r6)
            r10 = r42
            r6 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r10.mo14918M(r6)
            r6 = 54
            androidx.compose.ui.layout.f0 r3 = androidx.compose.foundation.layout.ColumnKt.m9863b(r3, r4, r10, r6)
            r9 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r10.mo14918M(r9)
            androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r4 = r10.mo15032w(r4)
            androidx.compose.ui.unit.d r4 = (androidx.compose.p004ui.unit.C16479d) r4
            androidx.compose.runtime.i1 r6 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r6 = r10.mo15032w(r6)
            androidx.compose.ui.unit.LayoutDirection r6 = (androidx.compose.p004ui.unit.LayoutDirection) r6
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r7 = r10.mo15032w(r7)
            androidx.compose.ui.platform.c4 r7 = (androidx.compose.p004ui.platform.C15863c4) r7
            kotlin.jvm.functions.a r8 = r30.mo44585a()
            kotlin.jvm.functions.q r5 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r5)
            androidx.compose.runtime.d r9 = r10.mo15017r()
            boolean r9 = r9 instanceof androidx.compose.runtime.C8428d
            if (r9 != 0) goto L_0x026c
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x026c:
            r10.mo14938T()
            boolean r9 = r10.mo14997l()
            if (r9 == 0) goto L_0x0279
            r10.mo14947W(r8)
            goto L_0x027c
        L_0x0279:
            r10.mo14888A()
        L_0x027c:
            r10.mo14941U()
            androidx.compose.runtime.o r8 = androidx.compose.runtime.Updater.m30180b(r10)
            kotlin.jvm.functions.p r9 = r30.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r8, r3, r9)
            kotlin.jvm.functions.p r3 = r30.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r8, r4, r3)
            kotlin.jvm.functions.p r3 = r30.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r8, r6, r3)
            kotlin.jvm.functions.p r3 = r30.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r8, r7, r3)
            r10.mo14972e()
            androidx.compose.runtime.o r3 = androidx.compose.runtime.C8684u1.m31906b(r10)
            androidx.compose.runtime.u1 r3 = androidx.compose.runtime.C8684u1.m31905a(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r78)
            r5.invoke(r3, r10, r4)
            r9 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r10.mo14918M(r9)
            r3 = 0
            r4 = 50
            float r4 = (float) r4
            float r4 = androidx.compose.p004ui.unit.C16483g.m74435M(r4)
            androidx.compose.foundation.shape.n r4 = androidx.compose.foundation.shape.C2694o.m12166h(r4)
            long r5 = r28.mo114223T()
            r7 = 0
            r16 = 0
            r17 = 0
            com.carrefour.fid.android.presentation.ui.coupons.scanBarcode.ComposableSingletons$ModalBottomSheetScanContentKt r18 = com.carrefour.fid.android.presentation.p035ui.coupons.scanBarcode.ComposableSingletons$ModalBottomSheetScanContentKt.f60139a
            kotlin.jvm.functions.p r18 = r18.mo70116a()
            r19 = 1572864(0x180000, float:2.204052E-39)
            r20 = 57
            r9 = r16
            r42 = r10
            r10 = r17
            r33 = r11
            r11 = r18
            r12 = r42
            r13 = r19
            r1 = r14
            r14 = r20
            androidx.compose.material.C7873k.m25025b(r3, r4, r5, r7, r9, r10, r11, r12, r13, r14)
            r3 = 2131952487(0x7f130367, float:1.9541418E38)
            r12 = r78
            r14 = r42
            java.lang.String r3 = androidx.compose.p004ui.res.C16018i.m71858d(r3, r14, r12)
            r11 = r32
            r13 = r37
            androidx.compose.material.w1 r4 = r13.mo11077c(r14, r11)
            androidx.compose.ui.text.p0 r43 = r4.mo11094h()
            r44 = 0
            r46 = 0
            androidx.compose.ui.text.font.i0$a r4 = androidx.compose.p004ui.text.font.C16209i0.f40292b
            androidx.compose.ui.text.font.i0 r48 = r4.mo46947c()
            r49 = 0
            r50 = 0
            r51 = 0
            r52 = 0
            r53 = 0
            r55 = 0
            r56 = 0
            r57 = 0
            r58 = 0
            r60 = 0
            r61 = 0
            r62 = 0
            r63 = 0
            r64 = 0
            r66 = 0
            r67 = 0
            r68 = 0
            r69 = 0
            r70 = 0
            r71 = 4194299(0x3ffffb, float:5.877465E-39)
            r72 = 0
            androidx.compose.ui.text.p0 r23 = androidx.compose.p004ui.text.C16361p0.m73795c(r43, r44, r46, r48, r49, r50, r51, r52, r53, r55, r56, r57, r58, r60, r61, r62, r63, r64, r66, r67, r68, r69, r70, r71, r72)
            long r5 = r28.mo114230a()
            int r16 = r31.mo47667a()
            r9 = 0
            r10 = 1
            androidx.compose.ui.m r34 = androidx.compose.foundation.layout.SizeKt.m10114n(r15, r9, r10, r1)
            r35 = 0
            r4 = 8
            float r4 = (float) r4
            float r36 = androidx.compose.p004ui.unit.C16483g.m74435M(r4)
            r37 = 0
            r4 = 32
            float r7 = (float) r4
            float r38 = androidx.compose.p004ui.unit.C16483g.m74435M(r7)
            r39 = 5
            r40 = 0
            androidx.compose.ui.m r4 = androidx.compose.foundation.layout.PaddingKt.m10028o(r34, r35, r36, r37, r38, r39, r40)
            r17 = 0
            r32 = r7
            r7 = r17
            r17 = 0
            r9 = r17
            r10 = r17
            r73 = r11
            r11 = r17
            r17 = 0
            r1 = r12
            r74 = r13
            r12 = r17
            r17 = 0
            r14 = r17
            androidx.compose.ui.text.style.i r16 = androidx.compose.p004ui.text.style.C16432i.m74172g(r16)
            r75 = r15
            r15 = r16
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r25 = 48
            r26 = 0
            r27 = 65016(0xfdf8, float:9.1107E-41)
            r24 = r42
            androidx.compose.material.TextKt.m14196c(r3, r4, r5, r7, r9, r10, r11, r12, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r3 = 2131231341(0x7f08026d, float:1.807876E38)
            r15 = r42
            androidx.compose.ui.graphics.painter.Painter r3 = androidx.compose.p004ui.res.C16015f.m71849d(r3, r15, r1)
            r4 = 0
            r14 = r75
            r5 = 0
            r12 = 0
            r13 = 1
            androidx.compose.ui.m r6 = androidx.compose.foundation.layout.SizeKt.m10114n(r14, r12, r13, r5)
            r7 = 0
            androidx.compose.ui.layout.c$a r5 = androidx.compose.p004ui.layout.C15541c.f38696a
            androidx.compose.ui.layout.c r8 = r5.mo44373i()
            r9 = 0
            r10 = 0
            r11 = 25016(0x61b8, float:3.5055E-41)
            r16 = 104(0x68, float:1.46E-43)
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r15
            r12 = r16
            androidx.compose.foundation.ImageKt.m8967b(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r3 = 2131952486(0x7f130366, float:1.9541416E38)
            java.lang.String r3 = androidx.compose.p004ui.res.C16018i.m71858d(r3, r15, r1)
            androidx.compose.ui.text.d r3 = com.carrefour.fid.android.shared.extension.C28771o.m119089a(r3)
            r5 = r73
            r4 = r74
            androidx.compose.material.w1 r4 = r4.mo11077c(r15, r5)
            androidx.compose.ui.text.p0 r24 = com.carrefour.fid.android.design.theme.C37477d.m153889a(r4)
            long r5 = r28.mo114230a()
            int r16 = r31.mo47667a()
            r8 = 0
            float r9 = androidx.compose.p004ui.unit.C16483g.m74435M(r32)
            r10 = 0
            r11 = 0
            r12 = 13
            r4 = 0
            r7 = r14
            r1 = r13
            r13 = r4
            androidx.compose.ui.m r4 = androidx.compose.foundation.layout.PaddingKt.m10028o(r7, r8, r9, r10, r11, r12, r13)
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r17 = 0
            r76 = r14
            r14 = r17
            androidx.compose.ui.text.style.i r16 = androidx.compose.p004ui.text.style.C16432i.m74172g(r16)
            r15 = r16
            r16 = 0
            r23 = 0
            r26 = 48
            r27 = 0
            r28 = 130552(0x1fdf8, float:1.82942E-40)
            r25 = r42
            androidx.compose.material.TextKt.m14197d(r3, r4, r5, r7, r9, r10, r11, r12, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r42.mo15002m0()
            r42.mo14896D()
            r42.mo15002m0()
            r42.mo15002m0()
            androidx.compose.ui.c$c r3 = r29.mo17070q()
            r4 = r76
            r5 = 0
            r6 = 0
            androidx.compose.ui.m r7 = androidx.compose.foundation.layout.SizeKt.m10114n(r4, r6, r1, r5)
            r5 = 80
            float r5 = (float) r5
            float r5 = androidx.compose.p004ui.unit.C16483g.m74435M(r5)
            androidx.compose.ui.m r5 = androidx.compose.foundation.layout.SizeKt.m10115o(r7, r5)
            float r7 = androidx.compose.p004ui.unit.C16483g.m74435M(r33)
            androidx.compose.ui.m r5 = androidx.compose.foundation.layout.PaddingKt.m10024k(r5, r7)
            r15 = r42
            r7 = 693286680(0x2952b718, float:4.6788176E-14)
            r15.mo14918M(r7)
            androidx.compose.foundation.layout.Arrangement$d r2 = r2.mo7630p()
            r7 = 48
            androidx.compose.ui.layout.f0 r2 = androidx.compose.foundation.layout.RowKt.m10071d(r2, r3, r15, r7)
            r3 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r15.mo14918M(r3)
            androidx.compose.runtime.i1 r3 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r3 = r15.mo15032w(r3)
            androidx.compose.ui.unit.d r3 = (androidx.compose.p004ui.unit.C16479d) r3
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r7 = r15.mo15032w(r7)
            androidx.compose.ui.unit.LayoutDirection r7 = (androidx.compose.p004ui.unit.LayoutDirection) r7
            androidx.compose.runtime.i1 r8 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r8 = r15.mo15032w(r8)
            androidx.compose.ui.platform.c4 r8 = (androidx.compose.p004ui.platform.C15863c4) r8
            kotlin.jvm.functions.a r9 = r30.mo44585a()
            kotlin.jvm.functions.q r5 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r5)
            androidx.compose.runtime.d r10 = r15.mo15017r()
            boolean r10 = r10 instanceof androidx.compose.runtime.C8428d
            if (r10 != 0) goto L_0x0490
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0490:
            r15.mo14938T()
            boolean r10 = r15.mo14997l()
            if (r10 == 0) goto L_0x049d
            r15.mo14947W(r9)
            goto L_0x04a0
        L_0x049d:
            r15.mo14888A()
        L_0x04a0:
            r15.mo14941U()
            androidx.compose.runtime.o r9 = androidx.compose.runtime.Updater.m30180b(r15)
            kotlin.jvm.functions.p r10 = r30.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r9, r2, r10)
            kotlin.jvm.functions.p r2 = r30.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r9, r3, r2)
            kotlin.jvm.functions.p r2 = r30.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r9, r7, r2)
            kotlin.jvm.functions.p r2 = r30.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r9, r8, r2)
            r15.mo14972e()
            androidx.compose.runtime.o r2 = androidx.compose.runtime.C8684u1.m31906b(r15)
            androidx.compose.runtime.u1 r2 = androidx.compose.runtime.C8684u1.m31905a(r2)
            r3 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            r5.invoke(r2, r15, r7)
            r2 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r15.mo14918M(r2)
            r2 = 2131952485(0x7f130365, float:1.9541414E38)
            java.lang.String r9 = androidx.compose.p004ui.res.C16018i.m71858d(r2, r15, r3)
            r2 = 0
            androidx.compose.ui.m r3 = androidx.compose.foundation.layout.SizeKt.m10114n(r4, r6, r1, r2)
            r1 = 1157296644(0x44faf204, float:2007.563)
            r15.mo14918M(r1)
            boolean r1 = r15.mo15006n0(r0)
            java.lang.Object r2 = r15.mo14921N()
            if (r1 != 0) goto L_0x0500
            androidx.compose.runtime.o$a r1 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r1 = r1.mo16277a()
            if (r2 != r1) goto L_0x0508
        L_0x0500:
            com.carrefour.fid.android.presentation.ui.coupons.scanBarcode.ModalBottomSheetScanContentKt$OnBoardingBottomSheet$1$3$1$1 r2 = new com.carrefour.fid.android.presentation.ui.coupons.scanBarcode.ModalBottomSheetScanContentKt$OnBoardingBottomSheet$1$3$1$1
            r2.<init>(r0)
            r15.mo14893C(r2)
        L_0x0508:
            r15.mo15002m0()
            r4 = r2
            kotlin.jvm.functions.a r4 = (kotlin.jvm.functions.C11289a) r4
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 6
            r1 = 956(0x3bc, float:1.34E-42)
            r13 = r15
            r2 = r15
            r15 = r1
            com.carrefour.fid.android.design.components.compose.ButtonComponentKt.m151340g(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r2.mo15002m0()
            r2.mo14896D()
            r2.mo15002m0()
            r2.mo15002m0()
            r2.mo15002m0()
            r2.mo14896D()
            r2.mo15002m0()
            r2.mo15002m0()
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x053f
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x053f:
            androidx.compose.runtime.t1 r1 = r2.mo15020s()
            if (r1 != 0) goto L_0x0546
            goto L_0x0550
        L_0x0546:
            com.carrefour.fid.android.presentation.ui.coupons.scanBarcode.ModalBottomSheetScanContentKt$OnBoardingBottomSheet$2 r2 = new com.carrefour.fid.android.presentation.ui.coupons.scanBarcode.ModalBottomSheetScanContentKt$OnBoardingBottomSheet$2
            r3 = r79
            r2.<init>(r0, r3)
            r1.mo15202a(r2)
        L_0x0550:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.coupons.scanBarcode.ModalBottomSheetScanContentKt.m105861b(kotlin.jvm.functions.a, androidx.compose.runtime.o, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m105862c(androidx.compose.p004ui.graphics.painter.Painter r36, java.lang.String r37, java.lang.String r38, long r39, kotlin.jvm.functions.C11289a<kotlin.C11079d2> r41, androidx.compose.runtime.C8592o r42, int r43, int r44) {
        /*
            r6 = r41
            r0 = 1679077777(0x6414b191, float:1.0971653E22)
            r1 = r42
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r2 = r44 & 8
            if (r2 == 0) goto L_0x001c
            com.carrefour.fid.android.design.theme.b r2 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r2 = r2.mo114224U()
            r4 = r43
            r5 = r4 & -7169(0xffffffffffffe3ff, float:NaN)
            r32 = r2
            goto L_0x0021
        L_0x001c:
            r4 = r43
            r32 = r39
            r5 = r4
        L_0x0021:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x002d
            r2 = -1
            java.lang.String r3 = "com.carrefour.fid.android.presentation.ui.coupons.scanBarcode.ScanResultBottomSheet (ModalBottomSheetScanContent.kt:87)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r5, r2, r3)
        L_0x002d:
            androidx.compose.ui.c$a r0 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r0 = r0.mo17068m()
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            r3 = 0
            r15 = 1
            r14 = 0
            androidx.compose.ui.m r7 = androidx.compose.foundation.layout.SizeKt.m10114n(r2, r3, r15, r14)
            r8 = 0
            r9 = 29
            float r9 = (float) r9
            float r9 = androidx.compose.p004ui.unit.C16483g.m74435M(r9)
            r10 = 0
            com.carrefour.fid.android.design.theme.a r34 = com.carrefour.fid.android.design.theme.C37474a.f94133a
            float r11 = r34.mo114202y()
            r12 = 5
            r13 = 0
            androidx.compose.ui.m r7 = androidx.compose.foundation.layout.PaddingKt.m10028o(r7, r8, r9, r10, r11, r12, r13)
            float r8 = r34.mo114202y()
            r9 = 2
            androidx.compose.ui.m r7 = androidx.compose.foundation.layout.PaddingKt.m10026m(r7, r8, r3, r9, r14)
            r8 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r1.mo14918M(r8)
            androidx.compose.foundation.layout.Arrangement r8 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$l r8 = r8.mo7631r()
            r9 = 48
            androidx.compose.ui.layout.f0 r0 = androidx.compose.foundation.layout.ColumnKt.m9863b(r8, r0, r1, r9)
            r8 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.mo14918M(r8)
            androidx.compose.runtime.i1 r8 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r8 = r1.mo15032w(r8)
            androidx.compose.ui.unit.d r8 = (androidx.compose.p004ui.unit.C16479d) r8
            androidx.compose.runtime.i1 r9 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r9 = r1.mo15032w(r9)
            androidx.compose.ui.unit.LayoutDirection r9 = (androidx.compose.p004ui.unit.LayoutDirection) r9
            androidx.compose.runtime.i1 r10 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r10 = r1.mo15032w(r10)
            androidx.compose.ui.platform.c4 r10 = (androidx.compose.p004ui.platform.C15863c4) r10
            androidx.compose.ui.node.ComposeUiNode$Companion r11 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r12 = r11.mo44585a()
            kotlin.jvm.functions.q r7 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r7)
            androidx.compose.runtime.d r13 = r1.mo15017r()
            boolean r13 = r13 instanceof androidx.compose.runtime.C8428d
            if (r13 != 0) goto L_0x00a5
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x00a5:
            r1.mo14938T()
            boolean r13 = r1.mo14997l()
            if (r13 == 0) goto L_0x00b2
            r1.mo14947W(r12)
            goto L_0x00b5
        L_0x00b2:
            r1.mo14888A()
        L_0x00b5:
            r1.mo14941U()
            androidx.compose.runtime.o r12 = androidx.compose.runtime.Updater.m30180b(r1)
            kotlin.jvm.functions.p r13 = r11.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r12, r0, r13)
            kotlin.jvm.functions.p r0 = r11.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r12, r8, r0)
            kotlin.jvm.functions.p r0 = r11.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r12, r9, r0)
            kotlin.jvm.functions.p r0 = r11.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r12, r10, r0)
            r1.mo14972e()
            androidx.compose.runtime.o r0 = androidx.compose.runtime.C8684u1.m31906b(r1)
            androidx.compose.runtime.u1 r0 = androidx.compose.runtime.C8684u1.m31905a(r0)
            r13 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r13)
            r7.invoke(r0, r1, r8)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.mo14918M(r0)
            androidx.compose.foundation.layout.ColumnScopeInstance r0 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            r0 = 80
            float r0 = (float) r0
            float r7 = androidx.compose.p004ui.unit.C16483g.m74435M(r0)
            androidx.compose.ui.m r7 = androidx.compose.foundation.layout.SizeKt.m10092H(r2, r7)
            float r0 = androidx.compose.p004ui.unit.C16483g.m74435M(r0)
            androidx.compose.ui.m r9 = androidx.compose.foundation.layout.SizeKt.m10115o(r7, r0)
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r0 = 0
            r16 = 440(0x1b8, float:6.17E-43)
            r17 = 120(0x78, float:1.68E-43)
            r7 = r36
            r13 = r0
            r0 = r14
            r14 = r1
            r15 = r16
            r16 = r17
            androidx.compose.foundation.ImageKt.m8967b(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            float r7 = r34.mo114175A()
            r9 = 1
            androidx.compose.ui.m r8 = androidx.compose.foundation.layout.PaddingKt.m10026m(r2, r3, r7, r9, r0)
            androidx.compose.material.w1 r7 = com.carrefour.fid.android.design.theme.C37477d.m153887N()
            androidx.compose.ui.text.p0 r27 = r7.mo11096i()
            androidx.compose.ui.text.style.i$a r35 = androidx.compose.p004ui.text.style.C16432i.f40718b
            int r7 = r35.mo47667a()
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            androidx.compose.ui.text.style.i r19 = androidx.compose.p004ui.text.style.C16432i.m74172g(r7)
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            int r7 = r5 >> 3
            r10 = r7 & 14
            r7 = r7 & 896(0x380, float:1.256E-42)
            r29 = r10 | r7
            r30 = 0
            r31 = 65016(0xfdf8, float:9.1107E-41)
            r7 = r37
            r9 = r32
            r28 = r1
            androidx.compose.material.TextKt.m14196c(r7, r8, r9, r11, r13, r14, r15, r16, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            androidx.compose.material.w1 r7 = com.carrefour.fid.android.design.theme.C37477d.m153887N()
            androidx.compose.ui.text.p0 r27 = r7.mo11089d()
            com.carrefour.fid.android.design.theme.b r7 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r9 = r7.mo114257y()
            int r7 = r35.mo47667a()
            r8 = 0
            androidx.compose.ui.text.style.i r19 = androidx.compose.p004ui.text.style.C16432i.m74172g(r7)
            int r5 = r5 >> 6
            r29 = r5 & 14
            r31 = 65018(0xfdfa, float:9.111E-41)
            r7 = r38
            androidx.compose.material.TextKt.m14196c(r7, r8, r9, r11, r13, r14, r15, r16, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r5 = 1
            androidx.compose.ui.m r7 = androidx.compose.foundation.layout.SizeKt.m10114n(r2, r3, r5, r0)
            r8 = 0
            float r9 = r34.mo114200w()
            r10 = 0
            float r11 = r34.mo114175A()
            r12 = 5
            androidx.compose.ui.m r7 = androidx.compose.foundation.layout.PaddingKt.m10028o(r7, r8, r9, r10, r11, r12, r13)
            com.carrefour.fid.android.design.components.compose.ButtonType r9 = com.carrefour.fid.android.design.components.compose.ButtonType.Secondary
            r0 = 2131952481(0x7f130361, float:1.9541406E38)
            r2 = 0
            java.lang.String r13 = androidx.compose.p004ui.res.C16018i.m71858d(r0, r1, r2)
            r0 = 1157296644(0x44faf204, float:2007.563)
            r1.mo14918M(r0)
            boolean r0 = r1.mo15006n0(r6)
            java.lang.Object r2 = r1.mo14921N()
            if (r0 != 0) goto L_0x01ba
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r2 != r0) goto L_0x01c2
        L_0x01ba:
            com.carrefour.fid.android.presentation.ui.coupons.scanBarcode.ModalBottomSheetScanContentKt$ScanResultBottomSheet$1$1$1 r2 = new com.carrefour.fid.android.presentation.ui.coupons.scanBarcode.ModalBottomSheetScanContentKt$ScanResultBottomSheet$1$1$1
            r2.<init>(r6)
            r1.mo14893C(r2)
        L_0x01c2:
            r1.mo15002m0()
            r8 = r2
            kotlin.jvm.functions.a r8 = (kotlin.jvm.functions.C11289a) r8
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 384(0x180, float:5.38E-43)
            r19 = 952(0x3b8, float:1.334E-42)
            r17 = r1
            com.carrefour.fid.android.design.components.compose.ButtonComponentKt.m151340g(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r1.mo15002m0()
            r1.mo14896D()
            r1.mo15002m0()
            r1.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x01ed
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01ed:
            androidx.compose.runtime.t1 r9 = r1.mo15020s()
            if (r9 != 0) goto L_0x01f4
            goto L_0x020b
        L_0x01f4:
            com.carrefour.fid.android.presentation.ui.coupons.scanBarcode.ModalBottomSheetScanContentKt$ScanResultBottomSheet$2 r10 = new com.carrefour.fid.android.presentation.ui.coupons.scanBarcode.ModalBottomSheetScanContentKt$ScanResultBottomSheet$2
            r0 = r10
            r1 = r36
            r2 = r37
            r3 = r38
            r4 = r32
            r6 = r41
            r7 = r43
            r8 = r44
            r0.<init>(r1, r2, r3, r4, r6, r7, r8)
            r9.mo15202a(r10)
        L_0x020b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.coupons.scanBarcode.ModalBottomSheetScanContentKt.m105862c(androidx.compose.ui.graphics.painter.Painter, java.lang.String, java.lang.String, long, kotlin.jvm.functions.a, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: h */
    public static final void m105867h(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1102054126);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1102054126, i, -1, "com.carrefour.fid.android.presentation.ui.coupons.scanBarcode.previewModal (ModalBottomSheetScanContent.kt:223)");
            }
            ThemeKt.m153788a(ComposableSingletons$ModalBottomSheetScanContentKt.f60139a.mo70117b(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new ModalBottomSheetScanContentKt$previewModal$1(i));
        }
    }

    @C8540g
    @C16464c(backgroundColor = 4294967295L, showBackground = true)
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: i */
    public static final void m105868i(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(86461756);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(86461756, i, -1, "com.carrefour.fid.android.presentation.ui.coupons.scanBarcode.previewModalInfo (ModalBottomSheetScanContent.kt:243)");
            }
            ThemeKt.m153788a(ComposableSingletons$ModalBottomSheetScanContentKt.f60139a.mo70118c(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new ModalBottomSheetScanContentKt$previewModalInfo$1(i));
        }
    }
}

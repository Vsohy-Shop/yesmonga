package com.carrefour.fid.android.presentation.p035ui.home.myproducts;

import android.graphics.drawable.Drawable;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.gestures.C2195g;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2362h;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.C2428y0;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.C2694o;
import androidx.compose.material.C7933t0;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.draw.C8744d;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.layout.C15541c;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16009b;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.C8553b;
import com.bumptech.glide.C22090i;
import com.bumptech.glide.request.C22560g;
import com.bumptech.glide.request.C22561h;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.theme.C37474a;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.domain.models.product.Product;
import com.carrefour.fid.android.domain.models.product.ProductPicture;
import com.carrefour.fid.android.domain.models.service.models.StoreServiceType;
import com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel;
import com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a;
import com.skydoves.landscapist.C35314a;
import com.skydoves.landscapist.glide.C35325c;
import com.skydoves.landscapist.glide.C35326d;
import com.skydoves.landscapist.palette.BitmapPalette;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11079d2;
import kotlin.collections.C10976s;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nMyProducts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyProducts.kt\ncom/carrefour/fid/android/presentation/ui/home/myproducts/MyProductsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,251:1\n1549#2:252\n1620#2,3:253\n50#3:256\n49#3:257\n460#3,13:283\n473#3,3:298\n36#3:303\n460#3,13:329\n473#3,3:343\n36#3:348\n460#3,13:374\n460#3,13:407\n473#3,3:421\n473#3,3:428\n1114#4,6:258\n1114#4,6:304\n1114#4,6:349\n74#5,6:264\n80#5:296\n84#5:302\n74#5,6:310\n80#5:342\n84#5:347\n74#5,6:388\n80#5:420\n84#5:425\n75#6:270\n76#6,11:272\n89#6:301\n75#6:316\n76#6,11:318\n89#6:346\n75#6:361\n76#6,11:363\n75#6:394\n76#6,11:396\n89#6:424\n89#6:431\n76#7:271\n76#7:317\n76#7:362\n76#7:395\n154#8:297\n154#8:426\n154#8:427\n75#9,6:355\n81#9:387\n85#9:432\n*S KotlinDebug\n*F\n+ 1 MyProducts.kt\ncom/carrefour/fid/android/presentation/ui/home/myproducts/MyProductsKt\n*L\n73#1:252\n73#1:253,3\n74#1:256\n74#1:257\n89#1:283,13\n89#1:298,3\n120#1:303\n115#1:329,13\n115#1:343,3\n186#1:348\n181#1:374,13\n189#1:407,13\n189#1:421,3\n181#1:428,3\n74#1:258,6\n120#1:304,6\n186#1:349,6\n89#1:264,6\n89#1:296\n89#1:302\n115#1:310,6\n115#1:342\n115#1:347\n189#1:388,6\n189#1:420\n189#1:425\n89#1:270\n89#1:272,11\n89#1:301\n115#1:316\n115#1:318,11\n115#1:346\n181#1:361\n181#1:363,11\n189#1:394\n189#1:396,11\n189#1:424\n181#1:431\n89#1:271\n115#1:317\n181#1:362\n189#1:395\n100#1:297\n206#1:426\n210#1:427\n181#1:355,6\n181#1:387\n181#1:432\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.home.myproducts.MyProductsKt */
public final class MyProductsKt {
    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m106505a(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1413602047);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1413602047, i, -1, "com.carrefour.fid.android.presentation.ui.home.myproducts.FrequentPurchasesPreview (MyProducts.kt:218)");
            }
            LazyListState a = LazyListStateKt.m10895a(0, 0, o, 0, 3);
            List i2 = C10976s.m41417i();
            for (int i3 = 0; i3 < 5; i3++) {
                i2.add("testUrl");
            }
            ThemeKt.m153788a(C8553b.m31048b(o, 1290561282, true, new MyProductsKt$FrequentPurchasesPreview$1(a, C10976s.m41409a(i2))), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new MyProductsKt$FrequentPurchasesPreview$2(i));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m106506b(androidx.compose.foundation.lazy.LazyListState r33, java.util.List<java.lang.String> r34, kotlin.jvm.functions.C11300l<? super com.carrefour.fid.android.presentation.p035ui.home.myproducts.C24183a, kotlin.C11079d2> r35, androidx.compose.runtime.C8592o r36, int r37) {
        /*
            r0 = r33
            r1 = r34
            r2 = r35
            r3 = r37
            r4 = 803026303(0x2fdd357f, float:4.0237677E-10)
            r5 = r36
            androidx.compose.runtime.o r14 = r5.mo15009o(r4)
            boolean r5 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r5 == 0) goto L_0x001d
            r5 = -1
            java.lang.String r6 = "com.carrefour.fid.android.presentation.ui.home.myproducts.MyFrequentPurchases (MyProducts.kt:109)"
            androidx.compose.runtime.ComposerKt.m29845w0(r4, r3, r5, r6)
        L_0x001d:
            androidx.compose.ui.m$a r4 = androidx.compose.p004ui.C8767m.f23478j
            com.carrefour.fid.android.design.theme.a r30 = com.carrefour.fid.android.design.theme.C37474a.f94133a
            float r5 = r30.mo114189l()
            androidx.compose.foundation.shape.n r5 = androidx.compose.foundation.shape.C2694o.m12166h(r5)
            androidx.compose.ui.m r5 = androidx.compose.p004ui.draw.C8744d.m32514a(r4, r5)
            r6 = 1
            r7 = 0
            r8 = 0
            androidx.compose.ui.m r15 = androidx.compose.foundation.layout.SizeKt.m10114n(r5, r8, r6, r7)
            r5 = 2131099821(0x7f0600ad, float:1.7812006E38)
            r13 = 0
            long r16 = androidx.compose.p004ui.res.C16009b.m71825a(r5, r14, r13)
            r18 = 0
            r19 = 2
            r20 = 0
            androidx.compose.ui.m r5 = androidx.compose.foundation.BackgroundKt.m8825d(r15, r16, r18, r19, r20)
            r6 = 0
            r8 = 0
            r9 = 1157296644(0x44faf204, float:2007.563)
            r14.mo14918M(r9)
            boolean r9 = r14.mo15006n0(r2)
            java.lang.Object r10 = r14.mo14921N()
            if (r9 != 0) goto L_0x0060
            androidx.compose.runtime.o$a r9 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r9 = r9.mo16277a()
            if (r10 != r9) goto L_0x0068
        L_0x0060:
            com.carrefour.fid.android.presentation.ui.home.myproducts.MyProductsKt$MyFrequentPurchases$1$1 r10 = new com.carrefour.fid.android.presentation.ui.home.myproducts.MyProductsKt$MyFrequentPurchases$1$1
            r10.<init>(r2)
            r14.mo14893C(r10)
        L_0x0068:
            r14.mo15002m0()
            r9 = r10
            kotlin.jvm.functions.a r9 = (kotlin.jvm.functions.C11289a) r9
            r10 = 7
            r11 = 0
            androidx.compose.ui.m r5 = androidx.compose.foundation.ClickableKt.m8878e(r5, r6, r7, r8, r9, r10, r11)
            float r6 = r30.mo114200w()
            float r7 = r30.mo114202y()
            androidx.compose.ui.m r5 = androidx.compose.foundation.layout.PaddingKt.m10025l(r5, r6, r7)
            r6 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r14.mo14918M(r6)
            androidx.compose.foundation.layout.Arrangement r6 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$l r6 = r6.mo7631r()
            androidx.compose.ui.c$a r7 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r7 = r7.mo17072u()
            androidx.compose.ui.layout.f0 r6 = androidx.compose.foundation.layout.ColumnKt.m9863b(r6, r7, r14, r13)
            r7 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r14.mo14918M(r7)
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r7 = r14.mo15032w(r7)
            androidx.compose.ui.unit.d r7 = (androidx.compose.p004ui.unit.C16479d) r7
            androidx.compose.runtime.i1 r8 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r8 = r14.mo15032w(r8)
            androidx.compose.ui.unit.LayoutDirection r8 = (androidx.compose.p004ui.unit.LayoutDirection) r8
            androidx.compose.runtime.i1 r9 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r9 = r14.mo15032w(r9)
            androidx.compose.ui.platform.c4 r9 = (androidx.compose.p004ui.platform.C15863c4) r9
            androidx.compose.ui.node.ComposeUiNode$Companion r10 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r11 = r10.mo44585a()
            kotlin.jvm.functions.q r5 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r5)
            androidx.compose.runtime.d r12 = r14.mo15017r()
            boolean r12 = r12 instanceof androidx.compose.runtime.C8428d
            if (r12 != 0) goto L_0x00cf
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x00cf:
            r14.mo14938T()
            boolean r12 = r14.mo14997l()
            if (r12 == 0) goto L_0x00dc
            r14.mo14947W(r11)
            goto L_0x00df
        L_0x00dc:
            r14.mo14888A()
        L_0x00df:
            r14.mo14941U()
            androidx.compose.runtime.o r11 = androidx.compose.runtime.Updater.m30180b(r14)
            kotlin.jvm.functions.p r12 = r10.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r11, r6, r12)
            kotlin.jvm.functions.p r6 = r10.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r11, r7, r6)
            kotlin.jvm.functions.p r6 = r10.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r11, r8, r6)
            kotlin.jvm.functions.p r6 = r10.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r11, r9, r6)
            r14.mo14972e()
            androidx.compose.runtime.o r6 = androidx.compose.runtime.C8684u1.m31906b(r14)
            androidx.compose.runtime.u1 r6 = androidx.compose.runtime.C8684u1.m31905a(r6)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r13)
            r5.invoke(r6, r14, r7)
            r5 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r14.mo14918M(r5)
            androidx.compose.foundation.layout.ColumnScopeInstance r5 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            r5 = 2131953712(0x7f130830, float:1.9543903E38)
            java.lang.String r5 = androidx.compose.p004ui.res.C16018i.m71858d(r5, r14, r13)
            androidx.compose.material.t0 r15 = androidx.compose.material.C7933t0.f19075a
            int r12 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.w1 r6 = r15.mo11077c(r14, r12)
            androidx.compose.ui.text.p0 r25 = r6.mo11098k()
            r6 = 2131099826(0x7f0600b2, float:1.7812016E38)
            long r7 = androidx.compose.p004ui.res.C16009b.m71825a(r6, r14, r13)
            r6 = 0
            r9 = 0
            r11 = 0
            r16 = 0
            r31 = r12
            r12 = r16
            r13 = r16
            r16 = 0
            r36 = r14
            r32 = r15
            r14 = r16
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r27 = 0
            r28 = 0
            r29 = 65530(0xfffa, float:9.1827E-41)
            r26 = r36
            androidx.compose.material.TextKt.m14196c(r5, r6, r7, r9, r11, r12, r13, r14, r16, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            float r5 = r30.mo114176B()
            androidx.compose.ui.m r5 = androidx.compose.foundation.layout.SizeKt.m10115o(r4, r5)
            r14 = r36
            r15 = 0
            androidx.compose.foundation.layout.C2428y0.m10726a(r5, r14, r15)
            r5 = 2131953713(0x7f130831, float:1.9543905E38)
            java.lang.String r5 = androidx.compose.p004ui.res.C16018i.m71858d(r5, r14, r15)
            r7 = r31
            r6 = r32
            androidx.compose.material.w1 r6 = r6.mo11077c(r14, r7)
            androidx.compose.ui.text.p0 r25 = com.carrefour.fid.android.design.theme.C37477d.m153892d(r6)
            r6 = 2131099823(0x7f0600af, float:1.781201E38)
            long r7 = androidx.compose.p004ui.res.C16009b.m71825a(r6, r14, r15)
            r6 = 0
            r12 = 0
            r13 = 0
            r16 = 0
            r14 = r16
            r16 = 0
            r17 = 0
            androidx.compose.material.TextKt.m14196c(r5, r6, r7, r9, r11, r12, r13, r14, r16, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            float r5 = r30.mo114175A()
            androidx.compose.ui.m r4 = androidx.compose.foundation.layout.SizeKt.m10115o(r4, r5)
            r5 = r36
            r6 = 0
            androidx.compose.foundation.layout.C2428y0.m10726a(r4, r5, r6)
            r4 = r3 & 14
            r4 = r4 | 64
            m106511g(r0, r1, r5, r4)
            r5.mo15002m0()
            r5.mo14896D()
            r5.mo15002m0()
            r5.mo15002m0()
            boolean r4 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r4 == 0) goto L_0x01c6
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01c6:
            androidx.compose.runtime.t1 r4 = r5.mo15020s()
            if (r4 != 0) goto L_0x01cd
            goto L_0x01d5
        L_0x01cd:
            com.carrefour.fid.android.presentation.ui.home.myproducts.MyProductsKt$MyFrequentPurchases$3 r5 = new com.carrefour.fid.android.presentation.ui.home.myproducts.MyProductsKt$MyFrequentPurchases$3
            r5.<init>(r0, r1, r2, r3)
            r4.mo15202a(r5)
        L_0x01d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.home.myproducts.MyProductsKt.m106506b(androidx.compose.foundation.lazy.LazyListState, java.util.List, kotlin.jvm.functions.l, androidx.compose.runtime.o, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m106507c(kotlin.jvm.functions.C11300l<? super com.carrefour.fid.android.presentation.p035ui.home.myproducts.C24183a, kotlin.C11079d2> r31, androidx.compose.runtime.C8592o r32, int r33) {
        /*
            r0 = r31
            r1 = r33
            r2 = -215463755(0xfffffffff32848b5, float:-1.3332833E31)
            r3 = r32
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
            r13 = r15
            goto L_0x02bb
        L_0x002f:
            boolean r4 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r4 == 0) goto L_0x003b
            r4 = -1
            java.lang.String r5 = "com.carrefour.fid.android.presentation.ui.home.myproducts.MyLists (MyProducts.kt:177)"
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r3, r4, r5)
        L_0x003b:
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            com.carrefour.fid.android.design.theme.a r28 = com.carrefour.fid.android.design.theme.C37474a.f94133a
            float r3 = r28.mo114189l()
            androidx.compose.foundation.shape.n r3 = androidx.compose.foundation.shape.C2694o.m12166h(r3)
            androidx.compose.ui.m r3 = androidx.compose.p004ui.draw.C8744d.m32514a(r2, r3)
            r4 = 1
            r5 = 0
            r6 = 0
            androidx.compose.ui.m r7 = androidx.compose.foundation.layout.SizeKt.m10114n(r3, r6, r4, r5)
            r3 = 2131099821(0x7f0600ad, float:1.7812006E38)
            r14 = 0
            long r8 = androidx.compose.p004ui.res.C16009b.m71825a(r3, r15, r14)
            r10 = 0
            r11 = 2
            r12 = 0
            androidx.compose.ui.m r16 = androidx.compose.foundation.BackgroundKt.m8825d(r7, r8, r10, r11, r12)
            r17 = 0
            r18 = 0
            r19 = 0
            r3 = 1157296644(0x44faf204, float:2007.563)
            r15.mo14918M(r3)
            boolean r3 = r15.mo15006n0(r0)
            java.lang.Object r4 = r15.mo14921N()
            if (r3 != 0) goto L_0x007f
            androidx.compose.runtime.o$a r3 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r3 = r3.mo16277a()
            if (r4 != r3) goto L_0x0087
        L_0x007f:
            com.carrefour.fid.android.presentation.ui.home.myproducts.MyProductsKt$MyLists$1$1 r4 = new com.carrefour.fid.android.presentation.ui.home.myproducts.MyProductsKt$MyLists$1$1
            r4.<init>(r0)
            r15.mo14893C(r4)
        L_0x0087:
            r15.mo15002m0()
            r20 = r4
            kotlin.jvm.functions.a r20 = (kotlin.jvm.functions.C11289a) r20
            r21 = 7
            r22 = 0
            androidx.compose.ui.m r3 = androidx.compose.foundation.ClickableKt.m8878e(r16, r17, r18, r19, r20, r21, r22)
            float r4 = r28.mo114202y()
            float r5 = r28.mo114175A()
            androidx.compose.ui.m r3 = androidx.compose.foundation.layout.PaddingKt.m10025l(r3, r4, r5)
            r4 = 693286680(0x2952b718, float:4.6788176E-14)
            r15.mo14918M(r4)
            androidx.compose.foundation.layout.Arrangement r4 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$d r5 = r4.mo7630p()
            androidx.compose.ui.c$a r6 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$c r7 = r6.mo17073w()
            androidx.compose.ui.layout.f0 r5 = androidx.compose.foundation.layout.RowKt.m10071d(r5, r7, r15, r14)
            r7 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r15.mo14918M(r7)
            androidx.compose.runtime.i1 r8 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r8 = r15.mo15032w(r8)
            androidx.compose.ui.unit.d r8 = (androidx.compose.p004ui.unit.C16479d) r8
            androidx.compose.runtime.i1 r9 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r9 = r15.mo15032w(r9)
            androidx.compose.ui.unit.LayoutDirection r9 = (androidx.compose.p004ui.unit.LayoutDirection) r9
            androidx.compose.runtime.i1 r10 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r10 = r15.mo15032w(r10)
            androidx.compose.ui.platform.c4 r10 = (androidx.compose.p004ui.platform.C15863c4) r10
            androidx.compose.ui.node.ComposeUiNode$Companion r11 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r12 = r11.mo44585a()
            kotlin.jvm.functions.q r3 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r3)
            androidx.compose.runtime.d r13 = r15.mo15017r()
            boolean r13 = r13 instanceof androidx.compose.runtime.C8428d
            if (r13 != 0) goto L_0x00f1
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x00f1:
            r15.mo14938T()
            boolean r13 = r15.mo14997l()
            if (r13 == 0) goto L_0x00fe
            r15.mo14947W(r12)
            goto L_0x0101
        L_0x00fe:
            r15.mo14888A()
        L_0x0101:
            r15.mo14941U()
            androidx.compose.runtime.o r12 = androidx.compose.runtime.Updater.m30180b(r15)
            kotlin.jvm.functions.p r13 = r11.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r12, r5, r13)
            kotlin.jvm.functions.p r5 = r11.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r12, r8, r5)
            kotlin.jvm.functions.p r5 = r11.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r12, r9, r5)
            kotlin.jvm.functions.p r5 = r11.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r12, r10, r5)
            r15.mo14972e()
            androidx.compose.runtime.o r5 = androidx.compose.runtime.C8684u1.m31906b(r15)
            androidx.compose.runtime.u1 r5 = androidx.compose.runtime.C8684u1.m31905a(r5)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r14)
            r3.invoke(r5, r15, r8)
            r3 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r15.mo14918M(r3)
            androidx.compose.foundation.layout.RowScopeInstance r5 = androidx.compose.foundation.layout.RowScopeInstance.f6147a
            androidx.compose.ui.c$c r8 = r6.mo17070q()
            androidx.compose.ui.m r17 = r5.mo7845f(r2, r8)
            r18 = 1065353216(0x3f800000, float:1.0)
            r19 = 0
            r20 = 2
            r21 = 0
            r16 = r5
            androidx.compose.ui.m r5 = androidx.compose.foundation.layout.C2411u0.m10660e(r16, r17, r18, r19, r20, r21)
            r8 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r15.mo14918M(r8)
            androidx.compose.foundation.layout.Arrangement$l r4 = r4.mo7631r()
            androidx.compose.ui.c$b r6 = r6.mo17072u()
            androidx.compose.ui.layout.f0 r4 = androidx.compose.foundation.layout.ColumnKt.m9863b(r4, r6, r15, r14)
            r15.mo14918M(r7)
            androidx.compose.runtime.i1 r6 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r6 = r15.mo15032w(r6)
            androidx.compose.ui.unit.d r6 = (androidx.compose.p004ui.unit.C16479d) r6
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r7 = r15.mo15032w(r7)
            androidx.compose.ui.unit.LayoutDirection r7 = (androidx.compose.p004ui.unit.LayoutDirection) r7
            androidx.compose.runtime.i1 r8 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r8 = r15.mo15032w(r8)
            androidx.compose.ui.platform.c4 r8 = (androidx.compose.p004ui.platform.C15863c4) r8
            kotlin.jvm.functions.a r9 = r11.mo44585a()
            kotlin.jvm.functions.q r5 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r5)
            androidx.compose.runtime.d r10 = r15.mo15017r()
            boolean r10 = r10 instanceof androidx.compose.runtime.C8428d
            if (r10 != 0) goto L_0x019a
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x019a:
            r15.mo14938T()
            boolean r10 = r15.mo14997l()
            if (r10 == 0) goto L_0x01a7
            r15.mo14947W(r9)
            goto L_0x01aa
        L_0x01a7:
            r15.mo14888A()
        L_0x01aa:
            r15.mo14941U()
            androidx.compose.runtime.o r9 = androidx.compose.runtime.Updater.m30180b(r15)
            kotlin.jvm.functions.p r10 = r11.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r9, r4, r10)
            kotlin.jvm.functions.p r4 = r11.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r9, r6, r4)
            kotlin.jvm.functions.p r4 = r11.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r9, r7, r4)
            kotlin.jvm.functions.p r4 = r11.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r9, r8, r4)
            r15.mo14972e()
            androidx.compose.runtime.o r4 = androidx.compose.runtime.C8684u1.m31906b(r15)
            androidx.compose.runtime.u1 r4 = androidx.compose.runtime.C8684u1.m31905a(r4)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r14)
            r5.invoke(r4, r15, r6)
            r15.mo14918M(r3)
            androidx.compose.foundation.layout.ColumnScopeInstance r3 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            r3 = 2131953691(0x7f13081b, float:1.954386E38)
            java.lang.String r3 = androidx.compose.p004ui.res.C16018i.m71858d(r3, r15, r14)
            androidx.compose.material.t0 r12 = androidx.compose.material.C7933t0.f19075a
            int r13 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.w1 r4 = r12.mo11077c(r15, r13)
            androidx.compose.ui.text.p0 r23 = r4.mo11098k()
            r4 = 2131099826(0x7f0600b2, float:1.7812016E38)
            long r5 = androidx.compose.p004ui.res.C16009b.m71825a(r4, r15, r14)
            r4 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r16 = 0
            r29 = r12
            r30 = r13
            r12 = r16
            r16 = 0
            r14 = r16
            r32 = r15
            r15 = r16
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r25 = 0
            r26 = 0
            r27 = 65530(0xfffa, float:9.1827E-41)
            r24 = r32
            androidx.compose.material.TextKt.m14196c(r3, r4, r5, r7, r9, r10, r11, r12, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            float r3 = r28.mo114175A()
            androidx.compose.ui.m r3 = androidx.compose.foundation.layout.SizeKt.m10115o(r2, r3)
            r15 = r32
            r14 = 0
            androidx.compose.foundation.layout.C2428y0.m10726a(r3, r15, r14)
            r3 = 2131953690(0x7f13081a, float:1.9543858E38)
            java.lang.String r3 = androidx.compose.p004ui.res.C16018i.m71858d(r3, r15, r14)
            r4 = r29
            r5 = r30
            androidx.compose.material.w1 r4 = r4.mo11077c(r15, r5)
            androidx.compose.ui.text.p0 r23 = com.carrefour.fid.android.design.theme.C37477d.m153892d(r4)
            r4 = 2131099823(0x7f0600af, float:1.781201E38)
            long r5 = androidx.compose.p004ui.res.C16009b.m71825a(r4, r15, r14)
            r4 = 0
            r12 = 0
            r16 = 0
            r14 = r16
            r15 = r16
            r16 = 0
            androidx.compose.material.TextKt.m14196c(r3, r4, r5, r7, r9, r10, r11, r12, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r32.mo15002m0()
            r32.mo14896D()
            r32.mo15002m0()
            r32.mo15002m0()
            r3 = 12
            float r3 = (float) r3
            float r3 = androidx.compose.p004ui.unit.C16483g.m74435M(r3)
            androidx.compose.ui.m r3 = androidx.compose.foundation.layout.SizeKt.m10092H(r2, r3)
            r4 = 6
            r13 = r32
            androidx.compose.foundation.layout.C2428y0.m10726a(r3, r13, r4)
            float r3 = r28.mo114175A()
            androidx.compose.ui.m r2 = androidx.compose.foundation.layout.PaddingKt.m10024k(r2, r3)
            r3 = 72
            float r3 = (float) r3
            float r3 = androidx.compose.p004ui.unit.C16483g.m74435M(r3)
            androidx.compose.ui.m r5 = androidx.compose.foundation.layout.SizeKt.m10087C(r2, r3)
            r2 = 2131231209(0x7f0801e9, float:1.8078493E38)
            r3 = 0
            androidx.compose.ui.graphics.painter.Painter r3 = androidx.compose.p004ui.res.C16015f.m71849d(r2, r13, r3)
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r11 = 56
            r12 = 120(0x78, float:1.68E-43)
            r10 = r13
            androidx.compose.foundation.ImageKt.m8967b(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.mo15002m0()
            r13.mo14896D()
            r13.mo15002m0()
            r13.mo15002m0()
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x02bb
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x02bb:
            androidx.compose.runtime.t1 r2 = r13.mo15020s()
            if (r2 != 0) goto L_0x02c2
            goto L_0x02ca
        L_0x02c2:
            com.carrefour.fid.android.presentation.ui.home.myproducts.MyProductsKt$MyLists$3 r3 = new com.carrefour.fid.android.presentation.ui.home.myproducts.MyProductsKt$MyLists$3
            r3.<init>(r0, r1)
            r2.mo15202a(r3)
        L_0x02ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.home.myproducts.MyProductsKt.m106507c(kotlin.jvm.functions.l, androidx.compose.runtime.o, int):void");
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    public static final void m106508d(LazyListState lazyListState, List<String> list, C11300l<? super C24183a, C11079d2> lVar, C8592o oVar, int i) {
        LazyListState lazyListState2 = lazyListState;
        List<String> list2 = list;
        C11300l<? super C24183a, C11079d2> lVar2 = lVar;
        int i2 = i;
        C8592o o = oVar.mo15009o(-452132021);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-452132021, i2, -1, "com.carrefour.fid.android.presentation.ui.home.myproducts.MyProducts (MyProducts.kt:83)");
        }
        C8767m.C8768a aVar = C8767m.f23478j;
        C8767m d = BackgroundKt.m8825d(SizeKt.m10114n(aVar, 0.0f, 1, (Object) null), C15240j2.f37547b.mo42852w(), (C15218g4) null, 2, (Object) null);
        C37474a aVar2 = C37474a.f94133a;
        C8767m k = PaddingKt.m10024k(d, aVar2.mo114202y());
        o.mo14918M(-483455358);
        C15560f0 b = ColumnKt.m9863b(Arrangement.f6010a.mo7631r(), C8734c.f23406a.mo17072u(), o, 0);
        o.mo14918M(-1323940314);
        C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
        LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
        C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
        ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
        C11289a<ComposeUiNode> a = companion.mo44585a();
        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(k);
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
        C8592o oVar2 = o;
        TextKt.m14196c(C16018i.m71858d(R.string.home_my_products_title_card, o, 0), (C8767m) null, C16009b.m71825a(R.color.ds_grey_5, o, 0), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C7933t0.f19075a.mo11077c(o, C7933t0.f19076b).mo11097j(), oVar2, 0, 0, 65530);
        C8592o oVar3 = oVar2;
        C2428y0.m10726a(SizeKt.m10115o(aVar, C16483g.m74435M((float) 14)), oVar3, 6);
        oVar3.mo14918M(643976321);
        if (!list2.isEmpty()) {
            m106506b(lazyListState2, list2, lVar2, oVar3, (i2 & 14) | 64 | (i2 & 896));
            C2428y0.m10726a(SizeKt.m10115o(aVar, aVar2.mo114202y()), oVar3, 0);
        }
        oVar3.mo15002m0();
        m106507c(lVar2, oVar3, (i2 >> 6) & 14);
        oVar3.mo15002m0();
        oVar3.mo14896D();
        oVar3.mo15002m0();
        oVar3.mo15002m0();
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = oVar3.mo15020s();
        if (s != null) {
            s.mo15202a(new MyProductsKt$MyProducts$2(lazyListState2, list2, lVar2, i2));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: e */
    public static final void m106509e(@C12579k HomePageViewModel homePageViewModel, @C12579k C11289a<C11079d2> aVar, @C12579k C11289a<C11079d2> aVar2, @C12580l C8592o oVar, int i) {
        String str;
        HomePageViewModel homePageViewModel2 = homePageViewModel;
        C11289a<C11079d2> aVar3 = aVar;
        C11289a<C11079d2> aVar4 = aVar2;
        int i2 = i;
        Intrinsics.checkNotNullParameter(homePageViewModel2, "viewModel");
        Intrinsics.checkNotNullParameter(aVar3, "onMyFrequentPurchasesClick");
        Intrinsics.checkNotNullParameter(aVar4, "onMyListsClick");
        C8592o o = oVar.mo15009o(618144185);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(618144185, i2, -1, "com.carrefour.fid.android.presentation.ui.home.myproducts.MyProductsStateful (MyProducts.kt:57)");
        }
        C8578k2 a = C8415c2.m30232a(homePageViewModel.getUiState(), new C26406a.C26449c((C26406a.C26449c.C26476i) null, (StoreServiceType) null, false, (C26406a.C26449c.C26456c) null, (List) null, (List) null, (List) null, (C26406a.C26449c.C26469g) null, (C26406a.C26449c.C26472h) null, (C26406a.C26449c.C26460d) null, (C26406a.C26449c.C26453b) null, (C26406a.C26449c.C26466f) null, (C26406a.C26449c.C26463e) null, (List) null, (List) null, (List) null, 65535, (DefaultConstructorMarker) null), (CoroutineContext) null, o, 72, 2);
        if (((C26406a.C26449c) a.getValue()).mo76961L() instanceof C26406a.C26449c.C26476i.C26477a) {
            List E5 = CollectionsKt___CollectionsKt.m40497E5(((C26406a.C26449c) a.getValue()).mo76954E(), 5);
            LazyListState a2 = LazyListStateKt.m10895a(0, 0, o, 0, 3);
            Iterable<Product> iterable = E5;
            ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
            for (Product Q : iterable) {
                ProductPicture productPicture = (ProductPicture) CollectionsKt___CollectionsKt.m40479B2(Q.mo118416Q());
                if (productPicture == null || (str = productPicture.mo118573e()) == null) {
                    str = "";
                }
                arrayList.add(str);
            }
            o.mo14918M(511388516);
            boolean n0 = o.mo15006n0(aVar3) | o.mo15006n0(aVar4);
            Object N = o.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                N = new MyProductsKt$MyProductsStateful$2$1(aVar3, aVar4);
                o.mo14893C(N);
            }
            o.mo15002m0();
            m106508d(a2, arrayList, (C11300l) N, o, 64);
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new MyProductsKt$MyProductsStateful$3(homePageViewModel2, aVar3, aVar4, i2));
        }
    }

    @C8540g
    /* renamed from: f */
    public static final void m106510f(String str, C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        int i3;
        String str2 = str;
        int i4 = i;
        C8592o o = oVar.mo15009o(1391371630);
        if ((i4 & 14) == 0) {
            if (o.mo15006n0(str2)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i4;
        } else {
            i2 = i4;
        }
        if ((i2 & 11) != 2 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1391371630, i2, -1, "com.carrefour.fid.android.presentation.ui.home.myproducts.ProductItem (MyProducts.kt:154)");
            }
            C15541c i5 = C15541c.f38696a.mo44373i();
            C8767m.C8768a aVar = C8767m.f23478j;
            C37474a aVar2 = C37474a.f94133a;
            C8767m C = SizeKt.m10087C(BackgroundKt.m8825d(C8744d.m32514a(aVar, C2694o.m12166h(aVar2.mo114190m())), C15240j2.f37547b.mo42852w(), (C15218g4) null, 2, (Object) null), aVar2.mo114196s());
            ComposableSingletons$MyProductsKt composableSingletons$MyProductsKt = ComposableSingletons$MyProductsKt.f60481a;
            oVar2 = o;
            C35325c.m145645b(str, C, (C11304p<? super C8592o, ? super Integer, ? extends C22090i<Drawable>>) null, (C11304p<? super C8592o, ? super Integer, ? extends C22561h>) null, (C22560g<Drawable>) null, (C8734c) null, i5, (String) null, 0.0f, (C15249k2) null, (C35314a) null, (BitmapPalette) null, R.drawable.ds_ic_placeholder, composableSingletons$MyProductsKt.mo70761a(), (C11306r<? super C2362h, ? super C35326d.C35330d, ? super C8592o, ? super Integer, C11079d2>) null, composableSingletons$MyProductsKt.mo70762b(), oVar2, (i2 & 14) | 1572864, 199680, 20412);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new MyProductsKt$ProductItem$1(str, i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: g */
    public static final void m106511g(LazyListState lazyListState, List<String> list, C8592o oVar, int i) {
        List<String> list2 = list;
        int i2 = i;
        C8592o o = oVar.mo15009o(30403453);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(30403453, i2, -1, "com.carrefour.fid.android.presentation.ui.home.myproducts.ProductList (MyProducts.kt:139)");
        }
        LazyDslKt.m10739d((C8767m) null, lazyListState, (C2366i0) null, false, Arrangement.f6010a.mo7638z(C37474a.f94133a.mo114175A()), (C8734c.C8737c) null, (C2195g) null, false, new MyProductsKt$ProductList$1(list2), o, (i2 << 3) & 112, 237);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new MyProductsKt$ProductList$2(lazyListState, list2, i2));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: h */
    public static final void m106512h(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(312435123);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(312435123, i, -1, "com.carrefour.fid.android.presentation.ui.home.myproducts.WithoutFrequentPurchasesPreview (MyProducts.kt:238)");
            }
            ThemeKt.m153788a(C8553b.m31048b(o, 1122163792, true, new MyProductsKt$WithoutFrequentPurchasesPreview$1(LazyListStateKt.m10895a(0, 0, o, 0, 3))), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new MyProductsKt$WithoutFrequentPurchasesPreview$2(i));
        }
    }
}

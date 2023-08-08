package com.carrefour.fid.android.presentation.p035ui.coupons.overlay.coupondetails;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2362h;
import androidx.compose.foundation.layout.C2373k;
import androidx.compose.foundation.layout.C2428y0;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.C2694o;
import androidx.compose.material.C3036d1;
import androidx.compose.material.C3052i1;
import androidx.compose.material.C7933t0;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.SnackbarHostKt;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.draw.C8744d;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.layout.C15541c;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
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
import androidx.compose.runtime.C8690w;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.C8553b;
import androidx.lifecycle.C19499w;
import androidx.profileinstaller.C20022q;
import com.bumptech.glide.C22090i;
import com.bumptech.glide.request.C22560g;
import com.bumptech.glide.request.C22561h;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.C37477d;
import com.carrefour.fid.android.presentation.models.CouponModel;
import com.carrefour.fid.android.presentation.p035ui.coupons.overlay.coupondetails.analytics.C23943a;
import com.carrefour.fid.android.presentation.viewmodels.coupons.overlay.C26313d;
import com.carrefour.fid.android.presentation.viewmodels.coupons.overlay.OverlayCouponDetailsBottomSheetViewModel;
import com.carrefour.fid.android.shared.extension.DateExtensionsKt;
import com.carrefour.fid.android.shared.p046io.CouponErrors;
import com.carrefour.fid.android.shared.type.C28892e;
import com.carrefour.fid.android.shared.util.events.EventLifecycleObserverKt;
import com.skydoves.landscapist.C35314a;
import com.skydoves.landscapist.glide.C35325c;
import com.skydoves.landscapist.glide.C35326d;
import com.skydoves.landscapist.palette.BitmapPalette;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nCouponDetailsOverlayBottomSheetStateful.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CouponDetailsOverlayBottomSheetStateful.kt\ncom/carrefour/fid/android/presentation/ui/coupons/overlay/coupondetails/CouponDetailsOverlayBottomSheetStatefulKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 9 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 10 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,287:1\n76#2:288\n76#2:298\n76#2:344\n76#2:395\n76#2:435\n154#3:289\n154#3:290\n154#3:336\n154#3:370\n154#3:371\n154#3:379\n154#3:380\n154#3:386\n154#3:387\n154#3:421\n154#3:427\n154#3:466\n154#3:489\n67#4,6:291\n73#4:323\n77#4:335\n67#4,6:428\n73#4:460\n77#4:465\n75#5:297\n76#5,11:299\n89#5:334\n75#5:343\n76#5,11:345\n89#5:384\n75#5:394\n76#5,11:396\n89#5:425\n75#5:434\n76#5,11:436\n89#5:464\n460#6,13:310\n36#6:324\n473#6,3:331\n460#6,13:356\n36#6:372\n473#6,3:381\n460#6,13:407\n473#6,3:422\n460#6,13:447\n473#6,3:461\n25#6:471\n25#6:482\n1114#7,6:325\n1114#7,6:373\n1114#7,3:472\n1117#7,3:478\n1114#7,6:483\n74#8,6:337\n80#8:369\n84#8:385\n74#8,6:388\n80#8:420\n84#8:426\n474#9,4:467\n478#9,2:475\n482#9:481\n474#10:477\n*S KotlinDebug\n*F\n+ 1 CouponDetailsOverlayBottomSheetStateful.kt\ncom/carrefour/fid/android/presentation/ui/coupons/overlay/coupondetails/CouponDetailsOverlayBottomSheetStatefulKt\n*L\n76#1:288\n106#1:298\n133#1:344\n167#1:395\n220#1:435\n89#1:289\n110#1:290\n133#1:336\n140#1:370\n141#1:371\n151#1:379\n156#1:380\n170#1:386\n172#1:387\n179#1:421\n223#1:427\n243#1:466\n265#1:489\n106#1:291,6\n106#1:323\n106#1:335\n220#1:428,6\n220#1:460\n220#1:465\n106#1:297\n106#1:299,11\n106#1:334\n133#1:343\n133#1:345,11\n133#1:384\n167#1:394\n167#1:396,11\n167#1:425\n220#1:434\n220#1:436,11\n220#1:464\n106#1:310,13\n118#1:324\n106#1:331,3\n133#1:356,13\n143#1:372\n133#1:381,3\n167#1:407,13\n167#1:422,3\n220#1:447,13\n220#1:461,3\n250#1:471\n251#1:482\n118#1:325,6\n143#1:373,6\n250#1:472,3\n250#1:478,3\n251#1:483,6\n133#1:337,6\n133#1:369\n133#1:385\n167#1:388,6\n167#1:420\n167#1:426\n250#1:467,4\n250#1:475,2\n250#1:481\n250#1:477\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.overlay.coupondetails.CouponDetailsOverlayBottomSheetStatefulKt */
public final class CouponDetailsOverlayBottomSheetStatefulKt {
    /* JADX WARNING: Removed duplicated region for block: B:44:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01bb  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m105787a(com.carrefour.fid.android.shared.type.C28892e<kotlin.C11079d2> r18, kotlin.jvm.functions.C11300l<? super com.carrefour.fid.android.presentation.p035ui.coupons.overlay.coupondetails.C23939a, kotlin.C11079d2> r19, com.carrefour.fid.android.data.entities.coupons.CouponStatus r20, androidx.compose.runtime.C8592o r21, int r22) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r22
            r4 = 1947764706(0x741887e2, float:4.833894E31)
            r5 = r21
            androidx.compose.runtime.o r15 = r5.mo15009o(r4)
            r5 = r3 & 14
            if (r5 != 0) goto L_0x0020
            boolean r5 = r15.mo15006n0(r0)
            if (r5 == 0) goto L_0x001d
            r5 = 4
            goto L_0x001e
        L_0x001d:
            r5 = 2
        L_0x001e:
            r5 = r5 | r3
            goto L_0x0021
        L_0x0020:
            r5 = r3
        L_0x0021:
            r6 = r3 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0031
            boolean r6 = r15.mo14927P(r1)
            if (r6 == 0) goto L_0x002e
            r6 = 32
            goto L_0x0030
        L_0x002e:
            r6 = 16
        L_0x0030:
            r5 = r5 | r6
        L_0x0031:
            r6 = r3 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0041
            boolean r6 = r15.mo15006n0(r2)
            if (r6 == 0) goto L_0x003e
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0040
        L_0x003e:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0040:
            r5 = r5 | r6
        L_0x0041:
            r5 = r5 & 731(0x2db, float:1.024E-42)
            r6 = 146(0x92, float:2.05E-43)
            if (r5 != r6) goto L_0x0054
            boolean r5 = r15.mo15011p()
            if (r5 != 0) goto L_0x004e
            goto L_0x0054
        L_0x004e:
            r15.mo14958a0()
            r0 = r15
            goto L_0x01be
        L_0x0054:
            boolean r5 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r5 == 0) goto L_0x0060
            r5 = -1
            java.lang.String r6 = "com.carrefour.fid.android.presentation.ui.coupons.overlay.coupondetails.CouponButton (CouponDetailsOverlayBottomSheetStateful.kt:188)"
            androidx.compose.runtime.ComposerKt.m29845w0(r4, r3, r5, r6)
        L_0x0060:
            kotlin.jvm.internal.Ref$ObjectRef r4 = new kotlin.jvm.internal.Ref$ObjectRef
            r4.<init>()
            java.lang.String r5 = new java.lang.String
            r5.<init>()
            r4.element = r5
            boolean r5 = r0 instanceof com.carrefour.fid.android.shared.type.C28892e.C28893a
            r6 = 1
            r7 = 0
            if (r5 != 0) goto L_0x0097
            boolean r5 = r0 instanceof com.carrefour.fid.android.shared.type.C28892e.C28895c
            if (r5 == 0) goto L_0x0078
            r5 = r6
            goto L_0x007e
        L_0x0078:
            com.carrefour.fid.android.shared.type.e$d r5 = com.carrefour.fid.android.shared.type.C28892e.C28896d.f70785b
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r5)
        L_0x007e:
            if (r5 == 0) goto L_0x0087
            java.lang.String r5 = r20.getType()
            r4.element = r5
            goto L_0x0097
        L_0x0087:
            com.carrefour.fid.android.shared.type.e$b r5 = com.carrefour.fid.android.shared.type.C28892e.C28894b.f70781b
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x0097
            java.lang.String r5 = r20.getType()
            r4.element = r5
            r10 = r6
            goto L_0x0098
        L_0x0097:
            r10 = r7
        L_0x0098:
            com.carrefour.fid.android.data.entities.coupons.CouponStatus r5 = com.carrefour.fid.android.data.entities.coupons.CouponStatus.INBASKET
            if (r2 != r5) goto L_0x00ae
            r8 = 1156472806(0x44ee5fe6, float:1906.9968)
            r15.mo14918M(r8)
            r8 = 2131952453(0x7f130345, float:1.954135E38)
            java.lang.String r8 = androidx.compose.p004ui.res.C16018i.m71858d(r8, r15, r7)
            r15.mo15002m0()
        L_0x00ac:
            r11 = r8
            goto L_0x00dd
        L_0x00ae:
            r8 = 1156472881(0x44ee6031, float:1907.006)
            r15.mo14918M(r8)
            com.carrefour.fid.android.data.entities.coupons.CouponStatus r8 = com.carrefour.fid.android.data.entities.coupons.CouponStatus.LOADEDTOCARD
            if (r2 != r8) goto L_0x00c9
            r8 = 1156472932(0x44ee6064, float:1907.0122)
            r15.mo14918M(r8)
            r8 = 2131952459(0x7f13034b, float:1.9541361E38)
            java.lang.String r8 = androidx.compose.p004ui.res.C16018i.m71858d(r8, r15, r7)
            r15.mo15002m0()
            goto L_0x00d9
        L_0x00c9:
            r8 = 1156473010(0x44ee60b2, float:1907.0217)
            r15.mo14918M(r8)
            r8 = 2131952447(0x7f13033f, float:1.9541337E38)
            java.lang.String r8 = androidx.compose.p004ui.res.C16018i.m71858d(r8, r15, r7)
            r15.mo15002m0()
        L_0x00d9:
            r15.mo15002m0()
            goto L_0x00ac
        L_0x00dd:
            androidx.compose.ui.m$a r8 = androidx.compose.p004ui.C8767m.f23478j
            r9 = 0
            r12 = 0
            androidx.compose.ui.m r9 = androidx.compose.foundation.layout.SizeKt.m10114n(r8, r9, r6, r12)
            r12 = 8
            float r12 = (float) r12
            float r12 = androidx.compose.p004ui.unit.C16483g.m74435M(r12)
            androidx.compose.ui.m r9 = androidx.compose.foundation.layout.PaddingKt.m10024k(r9, r12)
            r12 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r15.mo14918M(r12)
            androidx.compose.ui.c$a r12 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c r13 = r12.mo17061C()
            androidx.compose.ui.layout.f0 r13 = androidx.compose.foundation.layout.BoxKt.m9849k(r13, r7, r15, r7)
            r14 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r15.mo14918M(r14)
            androidx.compose.runtime.i1 r14 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r14 = r15.mo15032w(r14)
            androidx.compose.ui.unit.d r14 = (androidx.compose.p004ui.unit.C16479d) r14
            androidx.compose.runtime.i1 r6 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r6 = r15.mo15032w(r6)
            androidx.compose.ui.unit.LayoutDirection r6 = (androidx.compose.p004ui.unit.LayoutDirection) r6
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r7 = r15.mo15032w(r7)
            androidx.compose.ui.platform.c4 r7 = (androidx.compose.p004ui.platform.C15863c4) r7
            androidx.compose.ui.node.ComposeUiNode$Companion r17 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r0 = r17.mo44585a()
            kotlin.jvm.functions.q r9 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r9)
            androidx.compose.runtime.d r3 = r15.mo15017r()
            boolean r3 = r3 instanceof androidx.compose.runtime.C8428d
            if (r3 != 0) goto L_0x0139
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0139:
            r15.mo14938T()
            boolean r3 = r15.mo14997l()
            if (r3 == 0) goto L_0x0146
            r15.mo14947W(r0)
            goto L_0x0149
        L_0x0146:
            r15.mo14888A()
        L_0x0149:
            r15.mo14941U()
            androidx.compose.runtime.o r0 = androidx.compose.runtime.Updater.m30180b(r15)
            kotlin.jvm.functions.p r3 = r17.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r0, r13, r3)
            kotlin.jvm.functions.p r3 = r17.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r0, r14, r3)
            kotlin.jvm.functions.p r3 = r17.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r0, r6, r3)
            kotlin.jvm.functions.p r3 = r17.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r0, r7, r3)
            r15.mo14972e()
            androidx.compose.runtime.o r0 = androidx.compose.runtime.C8684u1.m31906b(r15)
            androidx.compose.runtime.u1 r0 = androidx.compose.runtime.C8684u1.m31905a(r0)
            r3 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            r9.invoke(r0, r15, r6)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r15.mo14918M(r0)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.f6046a
            androidx.compose.ui.c r6 = r12.mo17066i()
            androidx.compose.ui.m r0 = r0.mo7701c(r8, r6)
            com.carrefour.fid.android.design.components.compose.ButtonType r7 = com.carrefour.fid.android.design.components.compose.ButtonType.Secondary
            com.carrefour.fid.android.design.components.compose.ButtonColor r8 = com.carrefour.fid.android.design.components.compose.ButtonColor.Accent
            if (r2 == r5) goto L_0x0197
            r14 = 1
            goto L_0x0198
        L_0x0197:
            r14 = r3
        L_0x0198:
            com.carrefour.fid.android.presentation.ui.coupons.overlay.coupondetails.CouponDetailsOverlayBottomSheetStatefulKt$CouponButton$1$1 r6 = new com.carrefour.fid.android.presentation.ui.coupons.overlay.coupondetails.CouponDetailsOverlayBottomSheetStatefulKt$CouponButton$1$1
            r6.<init>(r1, r4)
            r9 = 0
            r12 = 0
            r13 = 0
            r16 = 3456(0xd80, float:4.843E-42)
            r17 = 400(0x190, float:5.6E-43)
            r5 = r0
            r0 = r15
            com.carrefour.fid.android.design.components.compose.ButtonComponentKt.m151340g(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0.mo15002m0()
            r0.mo14896D()
            r0.mo15002m0()
            r0.mo15002m0()
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x01be
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01be:
            androidx.compose.runtime.t1 r0 = r0.mo15020s()
            if (r0 != 0) goto L_0x01c5
            goto L_0x01d1
        L_0x01c5:
            com.carrefour.fid.android.presentation.ui.coupons.overlay.coupondetails.CouponDetailsOverlayBottomSheetStatefulKt$CouponButton$2 r3 = new com.carrefour.fid.android.presentation.ui.coupons.overlay.coupondetails.CouponDetailsOverlayBottomSheetStatefulKt$CouponButton$2
            r4 = r18
            r5 = r22
            r3.<init>(r4, r1, r2, r5)
            r0.mo15202a(r3)
        L_0x01d1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.coupons.overlay.coupondetails.CouponDetailsOverlayBottomSheetStatefulKt.m105787a(com.carrefour.fid.android.shared.type.e, kotlin.jvm.functions.l, com.carrefour.fid.android.data.entities.coupons.CouponStatus, androidx.compose.runtime.o, int):void");
    }

    @SuppressLint({"UnusedMaterialScaffoldPaddingParameter"})
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m105788b(C28892e<C11079d2> eVar, CouponModel couponModel, C11300l<? super C23939a, C11079d2> lVar, C8592o oVar, int i) {
        C28892e<C11079d2> eVar2 = eVar;
        CouponModel couponModel2 = couponModel;
        C11300l<? super C23939a, C11079d2> lVar2 = lVar;
        int i2 = i;
        C8592o o = oVar.mo15009o(-530620032);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-530620032, i2, -1, "com.carrefour.fid.android.presentation.ui.coupons.overlay.coupondetails.CouponDetailOverlayScreen (CouponDetailsOverlayBottomSheetStateful.kt:83)");
        }
        C8592o oVar2 = o;
        C8592o oVar3 = oVar2;
        ScaffoldKt.m13747a(C8744d.m32514a(C8767m.f23478j, C2694o.m12166h(C16483g.m74435M((float) 16))), (C3036d1) null, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, (C11305q<? super SnackbarHostState, ? super C8592o, ? super Integer, C11079d2>) null, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, 0, false, (C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2>) null, false, (C15218g4) null, 0.0f, 0, 0, 0, 0, 0, C8553b.m31048b(oVar2, 191769858, true, new C23925x5d6bb6c3(eVar2, lVar2, i2, couponModel2)), oVar2, 0, 12582912, 131070);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = oVar3.mo15020s();
        if (s != null) {
            s.mo15202a(new C23932x5d6bb6c4(eVar2, couponModel2, lVar2, i2));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    public static final void m105789c(@C12579k OverlayCouponDetailsBottomSheetViewModel overlayCouponDetailsBottomSheetViewModel, @C12579k C23943a aVar, @C12579k C11289a<C11079d2> aVar2, @C12580l C8592o oVar, int i) {
        OverlayCouponDetailsBottomSheetViewModel overlayCouponDetailsBottomSheetViewModel2 = overlayCouponDetailsBottomSheetViewModel;
        C23943a aVar3 = aVar;
        C11289a<C11079d2> aVar4 = aVar2;
        int i2 = i;
        Intrinsics.checkNotNullParameter(overlayCouponDetailsBottomSheetViewModel2, "viewModel");
        Intrinsics.checkNotNullParameter(aVar3, "couponAnalytics");
        Intrinsics.checkNotNullParameter(aVar4, "onCloseBottomSheetClick");
        C8592o o = oVar.mo15009o(1384959883);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1384959883, i2, -1, "com.carrefour.fid.android.presentation.ui.coupons.overlay.coupondetails.CouponDetailsOverlayBottomSheetStateful (CouponDetailsOverlayBottomSheetStateful.kt:44)");
        }
        C8578k2<C26313d> b = C8415c2.m30233b(overlayCouponDetailsBottomSheetViewModel.mo76488h0(), (CoroutineContext) null, o, 8, 1);
        m105788b(b.getValue().mo76573e(), b.getValue().mo76575f(), new C23935xf69c54f7(aVar4, overlayCouponDetailsBottomSheetViewModel2, aVar3), o, C28892e.f70778a | 64);
        C8592o oVar2 = o;
        EventLifecycleObserverKt.m119612a((C19499w) o.mo15032w(AndroidCompositionLocals_androidKt.m70954i()), new C23933xcf728c8a(aVar3), (C11289a<C11079d2>) null, (C11289a<C11079d2>) null, (C11289a<C11079d2>) null, (C11289a<C11079d2>) null, (C11289a<C11079d2>) null, (C11289a<C11079d2>) null, o, 8, 252);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new C23934xcf728c8b(overlayCouponDetailsBottomSheetViewModel2, aVar3, aVar4, i2));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    public static final void m105790d(String str, String str2, C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        int i3;
        int i4;
        String str3 = str;
        String str4 = str2;
        int i5 = i;
        C8592o o = oVar.mo15009o(1569168915);
        if ((i5 & 14) == 0) {
            if (o.mo15006n0(str3)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i5;
        } else {
            i2 = i5;
        }
        if ((i5 & 112) == 0) {
            if (o.mo15006n0(str4)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i6 = i2;
        if ((i6 & 91) != 18 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1569168915, i6, -1, "com.carrefour.fid.android.presentation.ui.coupons.overlay.coupondetails.DetailCouponsDescriptionBody (CouponDetailsOverlayBottomSheetStateful.kt:165)");
            }
            C8767m.C8768a aVar = C8767m.f23478j;
            float f = (float) 16;
            C8767m o2 = PaddingKt.m10028o(SizeKt.m10114n(aVar, 0.0f, 1, (Object) null), 0.0f, 0.0f, C16483g.m74435M(f), 0.0f, 11, (Object) null);
            C37475b bVar = C37475b.f94185a;
            C8767m k = PaddingKt.m10024k(BackgroundKt.m8825d(o2, bVar.mo114234c(), (C15218g4) null, 2, (Object) null), C16483g.m74435M(f));
            o.mo14918M(-483455358);
            C15560f0 b = ColumnKt.m9863b(Arrangement.f6010a.mo7631r(), C8734c.f23406a.mo17072u(), o, 0);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(k);
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
            f2.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
            C7933t0 t0Var = C7933t0.f19075a;
            int i7 = C7933t0.f19076b;
            int i8 = i6;
            C8592o oVar3 = o;
            TextKt.m14196c(str, (C8767m) null, bVar.mo114245m(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153891c(t0Var.mo11077c(o, i7)), oVar3, i8 & 14, 0, 65530);
            C8592o oVar4 = oVar3;
            C2428y0.m10726a(SizeKt.m10115o(aVar, C16483g.m74435M((float) 8)), oVar4, 6);
            C16361p0 b3 = C37477d.m153890b(t0Var.mo11077c(oVar4, i7));
            long m = bVar.mo114245m();
            oVar2 = oVar4;
            TextKt.m14196c(str2, (C8767m) null, m, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, b3, oVar2, (i8 >> 3) & 14, 0, 65530);
            oVar2.mo15002m0();
            oVar2.mo14896D();
            oVar2.mo15002m0();
            oVar2.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new C23936xe03fe19f(str, str2, i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: e */
    public static final void m105791e(String str, C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        int i3;
        String str2 = str;
        int i4 = i;
        C8592o o = oVar.mo15009o(-1193469843);
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
                ComposerKt.m29845w0(-1193469843, i2, -1, "com.carrefour.fid.android.presentation.ui.coupons.overlay.coupondetails.DetailsCouponDescriptionOfTitle (CouponDetailsOverlayBottomSheetStateful.kt:261)");
            }
            C8592o oVar3 = o;
            String str3 = str2;
            oVar2 = oVar3;
            TextKt.m14196c(str, PaddingKt.m10028o(C8767m.f23478j, 0.0f, C16483g.m74435M((float) 16), 0.0f, 0.0f, 13, (Object) null), 0, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153906r(C7933t0.f19075a.mo11077c(oVar3, C7933t0.f19076b)), oVar3, (i2 & 14) | 48, 0, 65532);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new C23937x77cb2c4b(str, i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: f */
    public static final void m105792f(String str, C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        int i3;
        String str2 = str;
        int i4 = i;
        C8592o o = oVar.mo15009o(-1019458324);
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
                ComposerKt.m29845w0(-1019458324, i2, -1, "com.carrefour.fid.android.presentation.ui.coupons.overlay.coupondetails.DetailsCouponTitle (CouponDetailsOverlayBottomSheetStateful.kt:239)");
            }
            C8592o oVar3 = o;
            String str3 = str2;
            oVar2 = oVar3;
            TextKt.m14196c(str, PaddingKt.m10028o(C8767m.f23478j, 0.0f, C16483g.m74435M((float) 16), 0.0f, 0.0f, 13, (Object) null), 0, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153885L(C7933t0.f19075a.mo11077c(oVar3, C7933t0.f19076b)), oVar3, (i2 & 14) | 48, 0, 65532);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new CouponDetailsOverlayBottomSheetStatefulKt$DetailsCouponTitle$1(str, i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: g */
    public static final void m105793g(C28892e.C28893a aVar, C11300l<? super C23939a, C11079d2> lVar, C8592o oVar, int i) {
        int i2;
        int i3;
        C8592o o = oVar.mo15009o(-740221595);
        if ((i & 14) == 0) {
            if (o.mo15006n0(aVar)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-740221595, i, -1, "com.carrefour.fid.android.presentation.ui.coupons.overlay.coupondetails.HandleErrorMessage (CouponDetailsOverlayBottomSheetStateful.kt:270)");
            }
            if (aVar.mo84083d() instanceof CouponErrors.CouponsActivationStartsOn) {
                o.mo14918M(964182322);
                Throwable d = aVar.mo84083d();
                Intrinsics.checkNotNull(d, "null cannot be cast to non-null type com.carrefour.fid.android.shared.io.CouponErrors.CouponsActivationStartsOn");
                m105796j(C16018i.m71859e(R.string.coupons_validity_activate_on_txt, new Object[]{DateExtensionsKt.m118759e(((CouponErrors.CouponsActivationStartsOn) d).mo83790d())}, o, 64), o, 0);
                o.mo15002m0();
            } else {
                o.mo14918M(964182617);
                m105796j(C16018i.m71858d(R.string.coupons_loading_error_toast, o, 0), o, 0);
                o.mo15002m0();
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new CouponDetailsOverlayBottomSheetStatefulKt$HandleErrorMessage$1(aVar, lVar, i));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m105794h(kotlin.jvm.functions.C11300l<? super com.carrefour.fid.android.presentation.p035ui.coupons.overlay.coupondetails.C23939a, kotlin.C11079d2> r30, androidx.compose.runtime.C8592o r31, int r32) {
        /*
            r0 = r30
            r1 = r32
            r2 = 1464461939(0x5749ea73, float:2.22008789E14)
            r3 = r31
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
            r1 = r15
            goto L_0x0196
        L_0x002f:
            boolean r4 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r4 == 0) goto L_0x003b
            r4 = -1
            java.lang.String r5 = "com.carrefour.fid.android.presentation.ui.coupons.overlay.coupondetails.HandleHeader (CouponDetailsOverlayBottomSheetStateful.kt:104)"
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r3, r4, r5)
        L_0x003b:
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            r3 = 1
            r4 = 0
            r5 = 0
            androidx.compose.ui.m r6 = androidx.compose.foundation.layout.SizeKt.m10114n(r2, r5, r3, r4)
            com.carrefour.fid.android.design.theme.b r3 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r7 = r3.mo114206C()
            r9 = 0
            r10 = 2
            r11 = 0
            androidx.compose.ui.m r3 = androidx.compose.foundation.BackgroundKt.m8825d(r6, r7, r9, r10, r11)
            r4 = 10
            float r4 = (float) r4
            float r4 = androidx.compose.p004ui.unit.C16483g.m74435M(r4)
            androidx.compose.foundation.shape.n r4 = androidx.compose.foundation.shape.C2694o.m12166h(r4)
            androidx.compose.ui.m r3 = androidx.compose.p004ui.draw.C8744d.m32514a(r3, r4)
            r4 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r15.mo14918M(r4)
            androidx.compose.ui.c$a r28 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c r4 = r28.mo17061C()
            r5 = 0
            androidx.compose.ui.layout.f0 r4 = androidx.compose.foundation.layout.BoxKt.m9849k(r4, r5, r15, r5)
            r6 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r15.mo14918M(r6)
            androidx.compose.runtime.i1 r6 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r6 = r15.mo15032w(r6)
            androidx.compose.ui.unit.d r6 = (androidx.compose.p004ui.unit.C16479d) r6
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r7 = r15.mo15032w(r7)
            androidx.compose.ui.unit.LayoutDirection r7 = (androidx.compose.p004ui.unit.LayoutDirection) r7
            androidx.compose.runtime.i1 r8 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r8 = r15.mo15032w(r8)
            androidx.compose.ui.platform.c4 r8 = (androidx.compose.p004ui.platform.C15863c4) r8
            androidx.compose.ui.node.ComposeUiNode$Companion r9 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r10 = r9.mo44585a()
            kotlin.jvm.functions.q r3 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r3)
            androidx.compose.runtime.d r11 = r15.mo15017r()
            boolean r11 = r11 instanceof androidx.compose.runtime.C8428d
            if (r11 != 0) goto L_0x00aa
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x00aa:
            r15.mo14938T()
            boolean r11 = r15.mo14997l()
            if (r11 == 0) goto L_0x00b7
            r15.mo14947W(r10)
            goto L_0x00ba
        L_0x00b7:
            r15.mo14888A()
        L_0x00ba:
            r15.mo14941U()
            androidx.compose.runtime.o r10 = androidx.compose.runtime.Updater.m30180b(r15)
            kotlin.jvm.functions.p r11 = r9.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r10, r4, r11)
            kotlin.jvm.functions.p r4 = r9.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r10, r6, r4)
            kotlin.jvm.functions.p r4 = r9.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r10, r7, r4)
            kotlin.jvm.functions.p r4 = r9.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r10, r8, r4)
            r15.mo14972e()
            androidx.compose.runtime.o r4 = androidx.compose.runtime.C8684u1.m31906b(r15)
            androidx.compose.runtime.u1 r4 = androidx.compose.runtime.C8684u1.m31905a(r4)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r3.invoke(r4, r15, r6)
            r3 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r15.mo14918M(r3)
            androidx.compose.foundation.layout.BoxScopeInstance r14 = androidx.compose.foundation.layout.BoxScopeInstance.f6046a
            r3 = 2131952460(0x7f13034c, float:1.9541363E38)
            java.lang.String r3 = androidx.compose.p004ui.res.C16018i.m71858d(r3, r15, r5)
            androidx.compose.ui.c r4 = r28.mo17066i()
            androidx.compose.ui.m r4 = r14.mo7701c(r2, r4)
            r5 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r16 = 0
            r29 = r14
            r14 = r16
            r5 = r15
            r15 = r16
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            androidx.compose.material.t0 r6 = androidx.compose.material.C7933t0.f19075a
            int r7 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.w1 r6 = r6.mo11077c(r5, r7)
            androidx.compose.ui.text.p0 r23 = com.carrefour.fid.android.design.theme.C37477d.m153899k(r6)
            r25 = 0
            r26 = 0
            r27 = 65532(0xfffc, float:9.183E-41)
            r24 = r5
            r1 = r5
            r5 = 0
            r7 = 0
            androidx.compose.material.TextKt.m14196c(r3, r4, r5, r7, r9, r10, r11, r12, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r3 = 1157296644(0x44faf204, float:2007.563)
            r1.mo14918M(r3)
            boolean r3 = r1.mo15006n0(r0)
            java.lang.Object r4 = r1.mo14921N()
            if (r3 != 0) goto L_0x0159
            androidx.compose.runtime.o$a r3 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r3 = r3.mo16277a()
            if (r4 != r3) goto L_0x0161
        L_0x0159:
            com.carrefour.fid.android.presentation.ui.coupons.overlay.coupondetails.CouponDetailsOverlayBottomSheetStatefulKt$HandleHeader$1$1$1 r4 = new com.carrefour.fid.android.presentation.ui.coupons.overlay.coupondetails.CouponDetailsOverlayBottomSheetStatefulKt$HandleHeader$1$1$1
            r4.<init>(r0)
            r1.mo14893C(r4)
        L_0x0161:
            r1.mo15002m0()
            r3 = r4
            kotlin.jvm.functions.a r3 = (kotlin.jvm.functions.C11289a) r3
            androidx.compose.ui.c r4 = r28.mo17067k()
            r5 = r29
            androidx.compose.ui.m r4 = r5.mo7701c(r2, r4)
            r5 = 0
            r6 = 0
            com.carrefour.fid.android.presentation.ui.coupons.overlay.coupondetails.ComposableSingletons$CouponDetailsOverlayBottomSheetStatefulKt r2 = com.carrefour.fid.android.presentation.p035ui.coupons.overlay.coupondetails.ComposableSingletons$CouponDetailsOverlayBottomSheetStatefulKt.f60097a
            kotlin.jvm.functions.p r7 = r2.mo70039a()
            r9 = 24576(0x6000, float:3.4438E-41)
            r10 = 12
            r8 = r1
            androidx.compose.material.IconButtonKt.m13536a(r3, r4, r5, r6, r7, r8, r9, r10)
            r1.mo15002m0()
            r1.mo14896D()
            r1.mo15002m0()
            r1.mo15002m0()
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x0196
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0196:
            androidx.compose.runtime.t1 r1 = r1.mo15020s()
            if (r1 != 0) goto L_0x019d
            goto L_0x01a7
        L_0x019d:
            com.carrefour.fid.android.presentation.ui.coupons.overlay.coupondetails.CouponDetailsOverlayBottomSheetStatefulKt$HandleHeader$2 r2 = new com.carrefour.fid.android.presentation.ui.coupons.overlay.coupondetails.CouponDetailsOverlayBottomSheetStatefulKt$HandleHeader$2
            r3 = r32
            r2.<init>(r0, r3)
            r1.mo15202a(r2)
        L_0x01a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.coupons.overlay.coupondetails.CouponDetailsOverlayBottomSheetStatefulKt.m105794h(kotlin.jvm.functions.l, androidx.compose.runtime.o, int):void");
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: i */
    public static final void m105795i(C23952g gVar, C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        Object obj;
        int i3;
        C23952g gVar2 = gVar;
        int i4 = i;
        C8592o o = oVar.mo15009o(1164298102);
        if ((i4 & 14) == 0) {
            if (o.mo15006n0(gVar2)) {
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
                ComposerKt.m29845w0(1164298102, i2, -1, "com.carrefour.fid.android.presentation.ui.coupons.overlay.coupondetails.HeadingComponent (CouponDetailsOverlayBottomSheetStateful.kt:129)");
            }
            C8767m.C8768a aVar = C8767m.f23478j;
            float f = (float) 16;
            C8767m o2 = PaddingKt.m10028o(aVar, C16483g.m74435M(f), C16483g.m74435M(f), 0.0f, 0.0f, 12, (Object) null);
            o.mo14918M(-483455358);
            Arrangement.C2279l r = Arrangement.f6010a.mo7631r();
            C8734c.C8735a aVar2 = C8734c.f23406a;
            C15560f0 b = ColumnKt.m9863b(r, aVar2.mo17072u(), o, 0);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(o2);
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
            f2.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
            C8592o oVar3 = o;
            oVar2 = oVar3;
            TextKt.m14196c(gVar.mo70108p(), (C8767m) null, 0, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153899k(C7933t0.f19075a.mo11077c(oVar3, C7933t0.f19076b)), oVar3, 0, 0, 65534);
            C8767m e = columnScopeInstance.mo7714e(PaddingKt.m10028o(SizeKt.m10087C(aVar, C16483g.m74435M((float) 150)), 0.0f, C16483g.m74435M(f), 0.0f, 0.0f, 13, (Object) null), aVar2.mo17068m());
            oVar2.mo14918M(1157296644);
            boolean n0 = oVar2.mo15006n0(gVar2);
            Object N = oVar2.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                obj = new CouponDetailsOverlayBottomSheetStatefulKt$HeadingComponent$1$1$1(gVar2);
                oVar2.mo14893C(obj);
            } else {
                obj = N;
            }
            oVar2.mo15002m0();
            C35325c.m145645b(obj, e, (C11304p<? super C8592o, ? super Integer, ? extends C22090i<Drawable>>) null, (C11304p<? super C8592o, ? super Integer, ? extends C22561h>) null, (C22560g<Drawable>) null, (C8734c) null, (C15541c) null, (String) null, 0.0f, (C15249k2) null, (C35314a) null, (BitmapPalette) null, R.drawable.ic_coupon_placeholder, (C11306r<? super C2362h, ? super C35326d.C35328b, ? super C8592o, ? super Integer, C11079d2>) null, (C11306r<? super C2362h, ? super C35326d.C35330d, ? super C8592o, ? super Integer, C11079d2>) null, ComposableSingletons$CouponDetailsOverlayBottomSheetStatefulKt.f60097a.mo70040b(), oVar2, 0, C20022q.C20025c.f51280k, 28668);
            m105792f(gVar.mo70102j(), oVar2, 0);
            m105791e(gVar.mo70104l(), oVar2, 0);
            float f3 = (float) 24;
            C2428y0.m10726a(SizeKt.m10115o(aVar, C16483g.m74435M(f3)), oVar2, 6);
            m105790d(gVar.mo70103k(), gVar.mo70104l(), oVar2, 0);
            C2428y0.m10726a(SizeKt.m10115o(aVar, C16483g.m74435M(f3)), oVar2, 6);
            m105792f(C16018i.m71858d(R.string.coupons_offer_condition, oVar2, 0), oVar2, 0);
            m105791e(gVar.mo70105m(), oVar2, 0);
            m105792f(C16018i.m71858d(R.string.coupons_partner_store, oVar2, 0), oVar2, 0);
            m105791e(gVar.mo70107o(), oVar2, 0);
            oVar2.mo15002m0();
            oVar2.mo14896D();
            oVar2.mo15002m0();
            oVar2.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new CouponDetailsOverlayBottomSheetStatefulKt$HeadingComponent$2(gVar2, i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: j */
    public static final void m105796j(@C12579k String str, @C12580l C8592o oVar, int i) {
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(str, "textToShow");
        C8592o o = oVar.mo15009o(1330860065);
        if ((i & 14) == 0) {
            if (o.mo15006n0(str)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1330860065, i, -1, "com.carrefour.fid.android.presentation.ui.coupons.overlay.coupondetails.SnackBar (CouponDetailsOverlayBottomSheetStateful.kt:248)");
            }
            o.mo14918M(773894976);
            o.mo14918M(-492369756);
            Object N = o.mo14921N();
            C8592o.C8593a aVar = C8592o.f23032a;
            if (N == aVar.mo16277a()) {
                C8690w wVar = new C8690w(EffectsKt.m29901m(EmptyCoroutineContext.f28243a, o));
                o.mo14893C(wVar);
                N = wVar;
            }
            o.mo15002m0();
            C12074o0 a = ((C8690w) N).mo16831a();
            o.mo15002m0();
            o.mo14918M(-492369756);
            Object N2 = o.mo14921N();
            if (N2 == aVar.mo16277a()) {
                N2 = new SnackbarHostState();
                o.mo14893C(N2);
            }
            o.mo15002m0();
            SnackbarHostState snackbarHostState = (SnackbarHostState) N2;
            EffectsKt.m29896h(snackbarHostState, new CouponDetailsOverlayBottomSheetStatefulKt$SnackBar$1(a, snackbarHostState, str, (C11045c<? super CouponDetailsOverlayBottomSheetStatefulKt$SnackBar$1>) null), o, 70);
            SnackbarHostKt.m13845b(snackbarHostState, (C8767m) null, (C11305q<? super C3052i1, ? super C8592o, ? super Integer, C11079d2>) null, o, 6, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new CouponDetailsOverlayBottomSheetStatefulKt$SnackBar$2(str, i));
        }
    }
}

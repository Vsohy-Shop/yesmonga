package com.carrefour.fid.android.presentation.p035ui.coupons.scanBarcode;

import android.os.Bundle;
import androidx.compose.animation.core.C1968g;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.C2693n;
import androidx.compose.foundation.shape.C2694o;
import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8690w;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.C8553b;
import androidx.fragment.app.FragmentManager;
import androidx.hilt.navigation.compose.C19298a;
import androidx.lifecycle.C19395b1;
import androidx.lifecycle.C19476v0;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19502x0;
import androidx.lifecycle.viewmodel.compose.C19490c;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.carrefour.fid.android.presentation.analytics.C38366g;
import com.carrefour.fid.android.presentation.p035ui.coupons.scanBarcode.C23962a;
import com.carrefour.fid.android.presentation.p035ui.coupons.scanBarcode.C23970c;
import com.carrefour.fid.android.presentation.viewmodels.coupons.scanbarcode.ScanBarcodeViewModel;
import com.carrefour.fid.android.presentation.viewmodels.coupons.scanbarcode.state.C26330a;
import com.carrefour.fid.android.scan.core.constants.C28255a;
import com.urbanairship.push.notifications.C9527p;
import java.util.List;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nScanBarcodeStateful.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScanBarcodeStateful.kt\ncom/carrefour/fid/android/presentation/ui/coupons/scanBarcode/ScanBarcodeStatefulKt\n+ 2 HiltViewModel.kt\nandroidx/hilt/navigation/compose/HiltViewModelKt\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 8 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,172:1\n43#2,6:173\n45#3,3:179\n76#4:182\n25#5:183\n25#5:194\n50#5:205\n49#5:206\n36#5:214\n36#5:221\n1114#6,6:184\n1114#6,3:195\n1117#6,3:201\n1114#6,6:207\n1114#6,6:215\n1114#6,6:222\n474#7,4:190\n478#7,2:198\n482#7:204\n474#8:200\n154#9:213\n76#10:228\n102#10,2:229\n*S KotlinDebug\n*F\n+ 1 ScanBarcodeStateful.kt\ncom/carrefour/fid/android/presentation/ui/coupons/scanBarcode/ScanBarcodeStatefulKt\n*L\n49#1:173,6\n49#1:179,3\n51#1:182\n58#1:183\n67#1:194\n80#1:205\n80#1:206\n136#1:214\n169#1:221\n58#1:184,6\n67#1:195,3\n67#1:201,3\n80#1:207,6\n136#1:215,6\n169#1:222,6\n67#1:190,4\n67#1:198,2\n67#1:204\n67#1:200\n87#1:213\n58#1:228\n58#1:229,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.scanBarcode.ScanBarcodeStatefulKt */
public final class ScanBarcodeStatefulKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m105870b(kotlin.jvm.functions.C11300l<? super com.carrefour.fid.android.presentation.p035ui.coupons.scanBarcode.C23967b, kotlin.C11079d2> r18, androidx.compose.runtime.C8592o r19, int r20) {
        /*
            r0 = r18
            r1 = r20
            r2 = 1965134038(0x752190d6, float:2.0480894E32)
            r3 = r19
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
            if (r5 != r4) goto L_0x002e
            boolean r4 = r15.mo15011p()
            if (r4 != 0) goto L_0x0029
            goto L_0x002e
        L_0x0029:
            r15.mo14958a0()
            r2 = r15
            goto L_0x009b
        L_0x002e:
            boolean r4 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r4 == 0) goto L_0x003a
            r4 = -1
            java.lang.String r5 = "com.carrefour.fid.android.presentation.ui.coupons.scanBarcode.ScanBarcodeHeader (ScanBarcodeStateful.kt:128)"
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r3, r4, r5)
        L_0x003a:
            r2 = 2131952505(0x7f130379, float:1.9541455E38)
            r4 = 0
            java.lang.String r2 = androidx.compose.p004ui.res.C16018i.m71858d(r2, r15, r4)
            androidx.compose.material.w1 r4 = com.carrefour.fid.android.design.theme.C37477d.m153887N()
            androidx.compose.ui.text.p0 r4 = r4.mo11097j()
            r5 = 0
            r7 = 0
            r9 = 0
            r11 = 0
            r12 = 1157296644(0x44faf204, float:2007.563)
            r15.mo14918M(r12)
            boolean r12 = r15.mo15006n0(r0)
            java.lang.Object r13 = r15.mo14921N()
            if (r12 != 0) goto L_0x0069
            androidx.compose.runtime.o$a r12 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r12 = r12.mo16277a()
            if (r13 != r12) goto L_0x0071
        L_0x0069:
            com.carrefour.fid.android.presentation.ui.coupons.scanBarcode.ScanBarcodeStatefulKt$ScanBarcodeHeader$1$1 r13 = new com.carrefour.fid.android.presentation.ui.coupons.scanBarcode.ScanBarcodeStatefulKt$ScanBarcodeHeader$1$1
            r13.<init>(r0)
            r15.mo14893C(r13)
        L_0x0071:
            r15.mo15002m0()
            r12 = r13
            kotlin.jvm.functions.a r12 = (kotlin.jvm.functions.C11289a) r12
            com.carrefour.fid.android.presentation.ui.coupons.scanBarcode.ScanBarcodeStatefulKt$ScanBarcodeHeader$2 r13 = new com.carrefour.fid.android.presentation.ui.coupons.scanBarcode.ScanBarcodeStatefulKt$ScanBarcodeHeader$2
            r13.<init>(r0, r3)
            r3 = 546088355(0x208ca5a3, float:2.3826532E-19)
            r14 = 1
            androidx.compose.runtime.internal.a r13 = androidx.compose.runtime.internal.C8553b.m31048b(r15, r3, r14, r13)
            r16 = 12779520(0xc30000, float:1.7907922E-38)
            r17 = 28
            r3 = r2
            r14 = r15
            r2 = r15
            r15 = r16
            r16 = r17
            com.carrefour.fid.android.design.components.compose.HeaderComponentKt.m151503h(r3, r4, r5, r7, r9, r11, r12, r13, r14, r15, r16)
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x009b
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x009b:
            androidx.compose.runtime.t1 r2 = r2.mo15020s()
            if (r2 != 0) goto L_0x00a2
            goto L_0x00aa
        L_0x00a2:
            com.carrefour.fid.android.presentation.ui.coupons.scanBarcode.ScanBarcodeStatefulKt$ScanBarcodeHeader$3 r3 = new com.carrefour.fid.android.presentation.ui.coupons.scanBarcode.ScanBarcodeStatefulKt$ScanBarcodeHeader$3
            r3.<init>(r0, r1)
            r2.mo15202a(r3)
        L_0x00aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.coupons.scanBarcode.ScanBarcodeStatefulKt.m105870b(kotlin.jvm.functions.l, androidx.compose.runtime.o, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m105871c(androidx.lifecycle.C19499w r8, androidx.fragment.app.FragmentManager r9, kotlin.jvm.functions.C11300l<? super com.carrefour.fid.android.presentation.p035ui.coupons.scanBarcode.C23970c, kotlin.C11079d2> r10, androidx.compose.runtime.C8592o r11, int r12) {
        /*
            r0 = -600143827(0xffffffffdc3a882d, float:-2.1001629E17)
            androidx.compose.runtime.o r11 = r11.mo15009o(r0)
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x0013
            r1 = -1
            java.lang.String r2 = "com.carrefour.fid.android.presentation.ui.coupons.scanBarcode.ScanBarcodePreview (ScanBarcodeStateful.kt:149)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r12, r1, r2)
        L_0x0013:
            com.carrefour.fid.android.presentation.ui.coupons.scanBarcode.d r0 = new com.carrefour.fid.android.presentation.ui.coupons.scanBarcode.d
            r0.<init>(r10, r9)
            java.lang.String r1 = "SCANNER_REQUEST_KEY"
            r9.mo56861b(r1, r8, r0)
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            r1 = 1
            r2 = 0
            r3 = 0
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.SizeKt.m10112l(r0, r3, r1, r2)
            com.carrefour.fid.android.scan.presentation.ui.CouponsBarcodeScannerFragment$a r0 = com.carrefour.fid.android.scan.presentation.p042ui.CouponsBarcodeScannerFragment.f68447v
            com.carrefour.fid.android.scan.core.constants.ScanType r2 = com.carrefour.fid.android.scan.core.constants.ScanType.PRODUCT
            com.carrefour.fid.android.scan.presentation.ui.CouponsBarcodeScannerFragment r0 = r0.mo82254a(r2)
            java.lang.Class<com.carrefour.fid.android.scan.presentation.ui.CouponsBarcodeScannerFragment> r2 = com.carrefour.fid.android.scan.presentation.p042ui.CouponsBarcodeScannerFragment.class
            kotlin.reflect.d r2 = kotlin.jvm.internal.C11342l0.m43547d(r2)
            java.lang.String r2 = r2.toString()
            kotlin.jvm.functions.p r3 = com.carrefour.fid.android.shared.base.FragmentContainerKt.m118334d(r0, r2)
            r0 = 1157296644(0x44faf204, float:2007.563)
            r11.mo14918M(r0)
            boolean r0 = r11.mo15006n0(r10)
            java.lang.Object r2 = r11.mo14921N()
            if (r0 != 0) goto L_0x0054
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r2 != r0) goto L_0x005c
        L_0x0054:
            com.carrefour.fid.android.presentation.ui.coupons.scanBarcode.ScanBarcodeStatefulKt$ScanBarcodePreview$2$1 r2 = new com.carrefour.fid.android.presentation.ui.coupons.scanBarcode.ScanBarcodeStatefulKt$ScanBarcodePreview$2$1
            r2.<init>(r10)
            r11.mo14893C(r2)
        L_0x005c:
            r11.mo15002m0()
            r4 = r2
            kotlin.jvm.functions.a r4 = (kotlin.jvm.functions.C11289a) r4
            r6 = 70
            r7 = 0
            r2 = r9
            r5 = r11
            com.carrefour.fid.android.shared.base.FragmentContainerKt.m118331a(r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0073
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0073:
            androidx.compose.runtime.t1 r11 = r11.mo15020s()
            if (r11 != 0) goto L_0x007a
            goto L_0x0082
        L_0x007a:
            com.carrefour.fid.android.presentation.ui.coupons.scanBarcode.ScanBarcodeStatefulKt$ScanBarcodePreview$3 r0 = new com.carrefour.fid.android.presentation.ui.coupons.scanBarcode.ScanBarcodeStatefulKt$ScanBarcodePreview$3
            r0.<init>(r8, r9, r10, r12)
            r11.mo15202a(r0)
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.coupons.scanBarcode.ScanBarcodeStatefulKt.m105871c(androidx.lifecycle.w, androidx.fragment.app.FragmentManager, kotlin.jvm.functions.l, androidx.compose.runtime.o, int):void");
    }

    /* renamed from: d */
    public static final void m105872d(C11300l lVar, FragmentManager fragmentManager, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(lVar, "$actioner");
        Intrinsics.checkNotNullParameter(fragmentManager, "$fragmentManager");
        Intrinsics.checkNotNullParameter(str, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        lVar.invoke(new C23970c.C23972b(String.valueOf(bundle.getString(C28255a.f68403c))));
        fragmentManager.mo56865c(C28255a.f68402b);
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: e */
    public static final void m105873e(@C12580l ScanBarcodeViewModel scanBarcodeViewModel, @C12579k C38366g gVar, @C12580l C19499w wVar, @C12579k C11300l<? super Boolean, C11079d2> lVar, @C12579k FragmentManager fragmentManager, @C12579k List<String> list, @C12580l C8592o oVar, int i, int i2) {
        ScanBarcodeViewModel scanBarcodeViewModel2;
        int i3;
        C19499w wVar2;
        ModalBottomSheetValue modalBottomSheetValue;
        C23962a.C23963a aVar;
        C38366g gVar2 = gVar;
        C11300l<? super Boolean, C11079d2> lVar2 = lVar;
        Intrinsics.checkNotNullParameter(gVar2, "analytics");
        Intrinsics.checkNotNullParameter(lVar2, "onBackPressed");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(list, "couponArticles");
        C8592o o = oVar.mo15009o(-1801201943);
        if ((i2 & 1) != 0) {
            o.mo14918M(-550968255);
            C19395b1 a = LocalViewModelStoreOwner.f49869a.mo57681a(o, 8);
            if (a != null) {
                C19502x0.C19506b a2 = C19298a.m90444a(a, o, 8);
                o.mo14918M(564614654);
                C19476v0 f = C19490c.m90838f(ScanBarcodeViewModel.class, a, (String) null, a2, o, 4168, 0);
                o.mo15002m0();
                o.mo15002m0();
                i3 = i & -15;
                scanBarcodeViewModel2 = (ScanBarcodeViewModel) f;
            } else {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
        } else {
            scanBarcodeViewModel2 = scanBarcodeViewModel;
            i3 = i;
        }
        if ((i2 & 4) != 0) {
            i3 &= -897;
            wVar2 = (C19499w) o.mo15032w(AndroidCompositionLocals_androidKt.m70954i());
        } else {
            wVar2 = wVar;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1801201943, i3, -1, "com.carrefour.fid.android.presentation.ui.coupons.scanBarcode.ScanBarcodeStateful (ScanBarcodeStateful.kt:47)");
        }
        C8578k2<C26330a> b = C8415c2.m30233b(scanBarcodeViewModel2.mo76591g0(), (CoroutineContext) null, o, 8, 1);
        C8578k2<C23962a> b2 = C8415c2.m30233b(scanBarcodeViewModel2.mo76590f0(), (CoroutineContext) null, o, 8, 1);
        o.mo14918M(-492369756);
        Object N = o.mo14921N();
        C8592o.C8593a aVar2 = C8592o.f23032a;
        if (N == aVar2.mo16277a()) {
            N = C8539f2.m30981g(Boolean.FALSE, (C8410b2) null, 2, (Object) null);
            o.mo14893C(N);
        }
        o.mo15002m0();
        C8700z0 z0Var = (C8700z0) N;
        if (b.getValue().mo76603d()) {
            modalBottomSheetValue = ModalBottomSheetValue.Hidden;
        } else {
            modalBottomSheetValue = ModalBottomSheetValue.Expanded;
        }
        C8700z0 z0Var2 = z0Var;
        ModalBottomSheetState p = ModalBottomSheetKt.m13595p(modalBottomSheetValue, (C1968g<Float>) null, (C11300l<? super ModalBottomSheetValue, Boolean>) null, false, o, 0, 14);
        o.mo14918M(773894976);
        o.mo14918M(-492369756);
        Object N2 = o.mo14921N();
        if (N2 == aVar2.mo16277a()) {
            C8690w wVar3 = new C8690w(EffectsKt.m29901m(EmptyCoroutineContext.f28243a, o));
            o.mo14893C(wVar3);
            N2 = wVar3;
        }
        o.mo15002m0();
        C12074o0 a3 = ((C8690w) N2).mo16831a();
        o.mo15002m0();
        C23962a value = b2.getValue();
        C23962a.C23963a aVar3 = C23962a.C23963a.f60151b;
        if (!Intrinsics.areEqual((Object) value, (Object) aVar3)) {
            aVar = aVar3;
            C11723c2 unused = C12038j.m48061f(a3, (CoroutineContext) null, (CoroutineStart) null, new ScanBarcodeStatefulKt$ScanBarcodeStateful$1(p, (C11045c<? super ScanBarcodeStatefulKt$ScanBarcodeStateful$1>) null), 3, (Object) null);
            gVar2.mo121211l(b2.getValue());
        } else {
            aVar = aVar3;
        }
        o.mo14918M(1275131149);
        if (p.mo10285e() != ModalBottomSheetValue.Hidden && !Intrinsics.areEqual((Object) b2.getValue(), (Object) aVar) && !m105874f(z0Var2)) {
            C11079d2 d2Var = C11079d2.f28267a;
            o.mo14918M(511388516);
            boolean n0 = o.mo15006n0(lVar2) | o.mo15006n0(b2);
            Object N3 = o.mo14921N();
            if (n0 || N3 == aVar2.mo16277a()) {
                N3 = new ScanBarcodeStatefulKt$ScanBarcodeStateful$2$1(lVar2, b2);
                o.mo14893C(N3);
            }
            o.mo15002m0();
            EffectsKt.m29891c(d2Var, (C11300l) N3, o, 6);
        }
        o.mo15002m0();
        float f2 = (float) 16;
        float f3 = (float) 0;
        C2693n i4 = C2694o.m12167i(C16483g.m74435M(f2), C16483g.m74435M(f2), C16483g.m74435M(f3), C16483g.m74435M(f3));
        C8767m l = SizeKt.m10112l(C8767m.f23478j, 0.0f, 1, (Object) null);
        ScanBarcodeStatefulKt$ScanBarcodeStateful$4 scanBarcodeStatefulKt$ScanBarcodeStateful$4 = r0;
        ScanBarcodeStatefulKt$ScanBarcodeStateful$4 scanBarcodeStatefulKt$ScanBarcodeStateful$42 = new ScanBarcodeStatefulKt$ScanBarcodeStateful$4(wVar2, fragmentManager, lVar, scanBarcodeViewModel2, a3, p, gVar, list);
        C8592o oVar2 = o;
        ModalBottomSheetKt.m13582c(C8553b.m31048b(o, -1766220933, true, new ScanBarcodeStatefulKt$ScanBarcodeStateful$3(b2, a3, p, z0Var2)), l, p, i4, 0.0f, 0, 0, 0, C8553b.m31048b(o, -1274831357, true, scanBarcodeStatefulKt$ScanBarcodeStateful$4), oVar2, (ModalBottomSheetState.f7719e << 6) | 100663350, C9527p.f26031b);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new ScanBarcodeStatefulKt$ScanBarcodeStateful$5(scanBarcodeViewModel2, gVar, wVar2, lVar, fragmentManager, list, i, i2));
        }
    }

    /* renamed from: f */
    public static final boolean m105874f(C8700z0<Boolean> z0Var) {
        return z0Var.getValue().booleanValue();
    }

    /* renamed from: g */
    public static final void m105875g(C8700z0<Boolean> z0Var, boolean z) {
        z0Var.setValue(Boolean.valueOf(z));
    }
}

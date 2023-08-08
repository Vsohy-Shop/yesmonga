package com.carrefour.fid.android.presentation.p035ui.coupons.scanBarcode;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C19499w;
import com.carrefour.fid.android.presentation.analytics.C38366g;
import com.carrefour.fid.android.presentation.viewmodels.coupons.scanbarcode.ScanBarcodeViewModel;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nScanBarcodeStateful.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScanBarcodeStateful.kt\ncom/carrefour/fid/android/presentation/ui/coupons/scanBarcode/ScanBarcodeStatefulKt$ScanBarcodeStateful$4\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,172:1\n73#2,7:173\n80#2:206\n84#2:211\n75#3:180\n76#3,11:182\n89#3:210\n76#4:181\n460#5,13:193\n473#5,3:207\n*S KotlinDebug\n*F\n+ 1 ScanBarcodeStateful.kt\ncom/carrefour/fid/android/presentation/ui/coupons/scanBarcode/ScanBarcodeStatefulKt$ScanBarcodeStateful$4\n*L\n101#1:173,7\n101#1:206\n101#1:211\n101#1:180\n101#1:182,11\n101#1:210\n101#1:181\n101#1:193,13\n101#1:207,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.scanBarcode.ScanBarcodeStatefulKt$ScanBarcodeStateful$4 */
public final class ScanBarcodeStatefulKt$ScanBarcodeStateful$4 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ C38366g $analytics;
    final /* synthetic */ C12074o0 $coroutineScope;
    final /* synthetic */ List<String> $couponArticles;
    final /* synthetic */ FragmentManager $fragmentManager;
    final /* synthetic */ C19499w $lifecycleOwner;
    final /* synthetic */ C11300l<Boolean, C11079d2> $onBackPressed;
    final /* synthetic */ ModalBottomSheetState $sheetState;
    final /* synthetic */ ScanBarcodeViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScanBarcodeStatefulKt$ScanBarcodeStateful$4(C19499w wVar, FragmentManager fragmentManager, C11300l<? super Boolean, C11079d2> lVar, ScanBarcodeViewModel scanBarcodeViewModel, C12074o0 o0Var, ModalBottomSheetState modalBottomSheetState, C38366g gVar, List<String> list) {
        super(2);
        this.$lifecycleOwner = wVar;
        this.$fragmentManager = fragmentManager;
        this.$onBackPressed = lVar;
        this.$viewModel = scanBarcodeViewModel;
        this.$coroutineScope = o0Var;
        this.$sheetState = modalBottomSheetState;
        this.$analytics = gVar;
        this.$couponArticles = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        C8592o oVar2 = oVar;
        int i2 = i;
        if ((i2 & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1274831357, i2, -1, "com.carrefour.fid.android.presentation.ui.coupons.scanBarcode.ScanBarcodeStateful.<anonymous> (ScanBarcodeStateful.kt:99)");
            }
            C19499w wVar = this.$lifecycleOwner;
            FragmentManager fragmentManager = this.$fragmentManager;
            C11300l<Boolean, C11079d2> lVar = this.$onBackPressed;
            ScanBarcodeViewModel scanBarcodeViewModel = this.$viewModel;
            C12074o0 o0Var = this.$coroutineScope;
            ModalBottomSheetState modalBottomSheetState = this.$sheetState;
            C38366g gVar = this.$analytics;
            List<String> list = this.$couponArticles;
            oVar2.mo14918M(-483455358);
            C8767m.C8768a aVar = C8767m.f23478j;
            C15560f0 b = ColumnKt.m9863b(Arrangement.f6010a.mo7631r(), C8734c.f23406a.mo17072u(), oVar2, 0);
            oVar2.mo14918M(-1323940314);
            C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(aVar);
            if (!(oVar.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            oVar.mo14938T();
            if (oVar.mo14997l()) {
                oVar2.mo14947W(a);
            } else {
                oVar.mo14888A();
            }
            oVar.mo14941U();
            C8592o b2 = Updater.m30180b(oVar);
            Updater.m30188j(b2, b, companion.mo44588d());
            Updater.m30188j(b2, dVar, companion.mo44586b());
            Updater.m30188j(b2, layoutDirection, companion.mo44587c());
            Updater.m30188j(b2, c4Var, companion.mo44590f());
            oVar.mo14972e();
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
            oVar2.mo14918M(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
            ScanBarcodeStatefulKt.m105870b(new ScanBarcodeStatefulKt$ScanBarcodeStateful$4$1$1(lVar, scanBarcodeViewModel, o0Var, modalBottomSheetState), oVar2, 0);
            ScanBarcodeStatefulKt.m105871c(wVar, fragmentManager, new ScanBarcodeStatefulKt$ScanBarcodeStateful$4$1$2(gVar, scanBarcodeViewModel, list), oVar2, 72);
            oVar.mo15002m0();
            oVar.mo14896D();
            oVar.mo15002m0();
            oVar.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}

package com.carrefour.fid.android.presentation.p035ui.coupons.scanBarcode;

import com.carrefour.fid.android.presentation.analytics.C38366g;
import com.carrefour.fid.android.presentation.p035ui.coupons.scanBarcode.C23970c;
import com.carrefour.fid.android.presentation.viewmodels.coupons.scanbarcode.ScanBarcodeViewModel;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.scanBarcode.ScanBarcodeStatefulKt$ScanBarcodeStateful$4$1$2 */
public final class ScanBarcodeStatefulKt$ScanBarcodeStateful$4$1$2 extends Lambda implements C11300l<C23970c, C11079d2> {
    final /* synthetic */ C38366g $analytics;
    final /* synthetic */ List<String> $couponArticles;
    final /* synthetic */ ScanBarcodeViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScanBarcodeStatefulKt$ScanBarcodeStateful$4$1$2(C38366g gVar, ScanBarcodeViewModel scanBarcodeViewModel, List<String> list) {
        super(1);
        this.$analytics = gVar;
        this.$viewModel = scanBarcodeViewModel;
        this.$couponArticles = list;
    }

    /* renamed from: a */
    public final void mo70137a(@C12579k C23970c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "action");
        if (Intrinsics.areEqual((Object) cVar, (Object) C23970c.C23971a.f60163a)) {
            this.$analytics.mo121209j();
        } else if (cVar instanceof C23970c.C23972b) {
            this.$viewModel.mo76594j0(((C23970c.C23972b) cVar).mo70141d(), this.$couponArticles);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo70137a((C23970c) obj);
        return C11079d2.f28267a;
    }
}

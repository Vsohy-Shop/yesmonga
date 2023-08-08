package com.carrefour.fid.android.service.presentation.p044ui.drive.summary;

import com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveSummaryViewModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.summary.DriveSummaryScreenKt$DriveSummaryScreen$2 */
public final class DriveSummaryScreenKt$DriveSummaryScreen$2 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ DriveSummaryViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DriveSummaryScreenKt$DriveSummaryScreen$2(DriveSummaryViewModel driveSummaryViewModel) {
        super(0);
        this.$viewModel = driveSummaryViewModel;
    }

    public final void invoke() {
        this.$viewModel.getAnalytics().sendScreenView();
    }
}

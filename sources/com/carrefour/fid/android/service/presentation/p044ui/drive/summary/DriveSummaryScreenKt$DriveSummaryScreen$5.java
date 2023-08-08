package com.carrefour.fid.android.service.presentation.p044ui.drive.summary;

import androidx.compose.runtime.C8700z0;
import com.carrefour.fid.android.domain.models.service.models.DriveType;
import com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveSummaryViewModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.summary.DriveSummaryScreenKt$DriveSummaryScreen$5 */
public final class DriveSummaryScreenKt$DriveSummaryScreen$5 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C8700z0<DriveType> $selection$delegate;
    final /* synthetic */ DriveSummaryViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DriveSummaryScreenKt$DriveSummaryScreen$5(DriveSummaryViewModel driveSummaryViewModel, C8700z0<DriveType> z0Var) {
        super(0);
        this.$viewModel = driveSummaryViewModel;
        this.$selection$delegate = z0Var;
    }

    public final void invoke() {
        this.$viewModel.validate(DriveSummaryScreenKt.DriveSummaryScreen$lambda$3(this.$selection$delegate));
    }
}

package com.carrefour.fid.android.service.presentation.p044ui.drive.summary;

import androidx.compose.runtime.C8700z0;
import com.carrefour.fid.android.domain.models.service.models.DriveType;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.summary.DriveSummaryScreenKt$DriveSummaryPreview$1$1$1 */
public final class DriveSummaryScreenKt$DriveSummaryPreview$1$1$1 extends Lambda implements C11300l<DriveType, C11079d2> {
    final /* synthetic */ C8700z0<DriveType> $selection$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DriveSummaryScreenKt$DriveSummaryPreview$1$1$1(C8700z0<DriveType> z0Var) {
        super(1);
        this.$selection$delegate = z0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DriveType) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k DriveType driveType) {
        Intrinsics.checkNotNullParameter(driveType, "it");
        DriveSummaryScreenKt.DriveSummaryPreview$lambda$19(this.$selection$delegate, driveType);
    }
}

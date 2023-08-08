package com.carrefour.fid.android.service.presentation.p044ui.drive.summary;

import com.carrefour.fid.android.domain.models.service.models.DriveType;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.summary.DriveSummaryScreenKt$DriveTypeSelection$1$3$1$1 */
public final class DriveSummaryScreenKt$DriveTypeSelection$1$3$1$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ DriveType $driveType;
    final /* synthetic */ C11300l<DriveType, C11079d2> $onDriveTypeSelection;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DriveSummaryScreenKt$DriveTypeSelection$1$3$1$1(C11300l<? super DriveType, C11079d2> lVar, DriveType driveType) {
        super(0);
        this.$onDriveTypeSelection = lVar;
        this.$driveType = driveType;
    }

    public final void invoke() {
        this.$onDriveTypeSelection.invoke(this.$driveType);
    }
}

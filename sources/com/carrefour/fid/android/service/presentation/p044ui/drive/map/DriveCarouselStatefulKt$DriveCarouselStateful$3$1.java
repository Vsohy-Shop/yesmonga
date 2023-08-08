package com.carrefour.fid.android.service.presentation.p044ui.drive.map;

import androidx.compose.runtime.C8700z0;
import com.carrefour.fid.android.service.presentation.model.DrivePoint;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.map.DriveCarouselStatefulKt$DriveCarouselStateful$3$1 */
public final class DriveCarouselStatefulKt$DriveCarouselStateful$3$1 extends Lambda implements C11300l<DrivePoint, C11079d2> {
    final /* synthetic */ C8700z0<DrivePoint> $isShowingDriveDialog$delegate;
    final /* synthetic */ C11300l<DrivePoint, C11079d2> $onDriveSelected;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DriveCarouselStatefulKt$DriveCarouselStateful$3$1(C11300l<? super DrivePoint, C11079d2> lVar, C8700z0<DrivePoint> z0Var) {
        super(1);
        this.$onDriveSelected = lVar;
        this.$isShowingDriveDialog$delegate = z0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DrivePoint) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k DrivePoint drivePoint) {
        Intrinsics.checkNotNullParameter(drivePoint, "drive");
        if (DriveCarouselStatefulKt.isDriveCollaboratorReserved(drivePoint)) {
            DriveCarouselStatefulKt.DriveCarouselStateful$lambda$9(this.$isShowingDriveDialog$delegate, drivePoint);
        } else {
            this.$onDriveSelected.invoke(drivePoint);
        }
    }
}

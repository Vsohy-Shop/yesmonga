package com.carrefour.fid.android.service.presentation.p044ui.drive.map;

import com.carrefour.fid.android.service.presentation.model.DrivePoint;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.map.DriveCarouselStatefulKt$DriveCarouselStateful$4$1 */
public final class DriveCarouselStatefulKt$DriveCarouselStateful$4$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ DrivePoint $drive;
    final /* synthetic */ C11300l<DrivePoint, C11079d2> $onDriveSelected;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DriveCarouselStatefulKt$DriveCarouselStateful$4$1(C11300l<? super DrivePoint, C11079d2> lVar, DrivePoint drivePoint) {
        super(0);
        this.$onDriveSelected = lVar;
        this.$drive = drivePoint;
    }

    public final void invoke() {
        this.$onDriveSelected.invoke(this.$drive);
    }
}

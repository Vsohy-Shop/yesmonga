package com.carrefour.fid.android.service.presentation.p044ui.drive.summary;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.domain.models.service.models.DriveType;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.summary.DriveSummaryScreenKt$DriveSummary$4 */
public final class DriveSummaryScreenKt$DriveSummary$4 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ float $distanceMeters;
    final /* synthetic */ DrivePoint $drivePoint;
    final /* synthetic */ C11300l<DriveType, C11079d2> $onDriveTypeSelection;
    final /* synthetic */ C11289a<C11079d2> $onNavigationBack;
    final /* synthetic */ C11289a<C11079d2> $onValidate;
    final /* synthetic */ DriveType $selection;
    final /* synthetic */ boolean $validateEnabled;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DriveSummaryScreenKt$DriveSummary$4(C11289a<C11079d2> aVar, DrivePoint drivePoint, float f, DriveType driveType, boolean z, C11300l<? super DriveType, C11079d2> lVar, C11289a<C11079d2> aVar2, int i, int i2) {
        super(2);
        this.$onNavigationBack = aVar;
        this.$drivePoint = drivePoint;
        this.$distanceMeters = f;
        this.$selection = driveType;
        this.$validateEnabled = z;
        this.$onDriveTypeSelection = lVar;
        this.$onValidate = aVar2;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        DriveSummaryScreenKt.DriveSummary(this.$onNavigationBack, this.$drivePoint, this.$distanceMeters, this.$selection, this.$validateEnabled, this.$onDriveTypeSelection, this.$onValidate, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}

package com.carrefour.fid.android.service.presentation.p044ui.drive.map;

import android.location.Location;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.service.presentation.model.DrivePoint;
import com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.map.DriveCarouselStatefulKt$DriveCarouselStateful$5 */
public final class DriveCarouselStatefulKt$DriveCarouselStateful$5 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ List<DrivePoint> $drivePoints;
    final /* synthetic */ Location $lastLocation;
    final /* synthetic */ C11300l<DrivePoint, C11079d2> $onCurrentItemChanged;
    final /* synthetic */ C11300l<DrivePoint, C11079d2> $onDriveSelected;
    final /* synthetic */ DriveMapViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DriveCarouselStatefulKt$DriveCarouselStateful$5(DriveMapViewModel driveMapViewModel, List<DrivePoint> list, Location location, C11300l<? super DrivePoint, C11079d2> lVar, C11300l<? super DrivePoint, C11079d2> lVar2, int i, int i2) {
        super(2);
        this.$viewModel = driveMapViewModel;
        this.$drivePoints = list;
        this.$lastLocation = location;
        this.$onCurrentItemChanged = lVar;
        this.$onDriveSelected = lVar2;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        DriveCarouselStatefulKt.DriveCarouselStateful(this.$viewModel, this.$drivePoints, this.$lastLocation, this.$onCurrentItemChanged, this.$onDriveSelected, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}

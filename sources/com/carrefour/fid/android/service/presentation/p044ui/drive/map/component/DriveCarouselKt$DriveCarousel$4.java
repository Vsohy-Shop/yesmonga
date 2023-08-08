package com.carrefour.fid.android.service.presentation.p044ui.drive.map.component;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.service.presentation.model.DrivePoint;
import com.google.accompanist.pager.PagerState;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.map.component.DriveCarouselKt$DriveCarousel$4 */
public final class DriveCarouselKt$DriveCarousel$4 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Map<DrivePoint, Float> $distanceForDrive;
    final /* synthetic */ String $driveLoading;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C11300l<DrivePoint, C11079d2> $onDriveSelected;
    final /* synthetic */ PagerState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DriveCarouselKt$DriveCarousel$4(C8767m mVar, PagerState pagerState, Map<DrivePoint, Float> map, String str, C11300l<? super DrivePoint, C11079d2> lVar, int i, int i2) {
        super(2);
        this.$modifier = mVar;
        this.$state = pagerState;
        this.$distanceForDrive = map;
        this.$driveLoading = str;
        this.$onDriveSelected = lVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        DriveCarouselKt.m172910DriveCarouselu5N7ek(this.$modifier, this.$state, this.$distanceForDrive, this.$driveLoading, this.$onDriveSelected, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}

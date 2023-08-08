package com.carrefour.fid.android.service.presentation.p044ui.drive.map.component;

import com.carrefour.fid.android.service.presentation.model.DrivePoint;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.map.component.DriveCarouselKt$DriveCarousel$2 */
public final class DriveCarouselKt$DriveCarousel$2 extends Lambda implements C11300l<Integer, Object> {
    final /* synthetic */ List<DrivePoint> $driveList;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DriveCarouselKt$DriveCarousel$2(List<DrivePoint> list) {
        super(1);
        this.$driveList = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    @C12579k
    public final Object invoke(int i) {
        return this.$driveList.get(i).getStoreId();
    }
}

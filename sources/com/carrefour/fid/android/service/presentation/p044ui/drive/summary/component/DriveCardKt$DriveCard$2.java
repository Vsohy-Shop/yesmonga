package com.carrefour.fid.android.service.presentation.p044ui.drive.summary.component;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.domain.models.service.models.DriveType;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.summary.component.DriveCardKt$DriveCard$2 */
public final class DriveCardKt$DriveCard$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ String $address;
    final /* synthetic */ String $banner;
    final /* synthetic */ float $distanceInMeters;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ String $name;
    final /* synthetic */ DriveType $serviceType;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DriveCardKt$DriveCard$2(C8767m mVar, String str, String str2, String str3, DriveType driveType, float f, int i, int i2) {
        super(2);
        this.$modifier = mVar;
        this.$name = str;
        this.$banner = str2;
        this.$address = str3;
        this.$serviceType = driveType;
        this.$distanceInMeters = f;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        DriveCardKt.DriveCard(this.$modifier, this.$name, this.$banner, this.$address, this.$serviceType, this.$distanceInMeters, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}

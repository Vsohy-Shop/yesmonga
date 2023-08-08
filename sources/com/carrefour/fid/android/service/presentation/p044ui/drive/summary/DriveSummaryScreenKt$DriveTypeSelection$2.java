package com.carrefour.fid.android.service.presentation.p044ui.drive.summary;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.domain.models.service.models.DriveType;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.summary.DriveSummaryScreenKt$DriveTypeSelection$2 */
public final class DriveSummaryScreenKt$DriveTypeSelection$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ List<DriveType> $driveTypeList;
    final /* synthetic */ C11300l<DriveType, C11079d2> $onDriveTypeSelection;
    final /* synthetic */ DriveType $selection;
    final /* synthetic */ String $storeName;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DriveSummaryScreenKt$DriveTypeSelection$2(String str, List<? extends DriveType> list, DriveType driveType, C11300l<? super DriveType, C11079d2> lVar, int i) {
        super(2);
        this.$storeName = str;
        this.$driveTypeList = list;
        this.$selection = driveType;
        this.$onDriveTypeSelection = lVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        DriveSummaryScreenKt.DriveTypeSelection(this.$storeName, this.$driveTypeList, this.$selection, this.$onDriveTypeSelection, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}

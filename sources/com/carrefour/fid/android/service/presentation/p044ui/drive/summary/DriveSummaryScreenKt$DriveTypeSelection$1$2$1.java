package com.carrefour.fid.android.service.presentation.p044ui.drive.summary;

import androidx.compose.p004ui.semantics.C16044q;
import androidx.compose.p004ui.semantics.SemanticsPropertiesKt;
import com.carrefour.fid.android.domain.models.service.models.DriveType;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.summary.DriveSummaryScreenKt$DriveTypeSelection$1$2$1 */
public final class DriveSummaryScreenKt$DriveTypeSelection$1$2$1 extends Lambda implements C11300l<C16044q, C11079d2> {
    final /* synthetic */ DriveType $driveType;
    final /* synthetic */ String $label;
    final /* synthetic */ DriveType $selection;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DriveSummaryScreenKt$DriveTypeSelection$1$2$1(DriveType driveType, DriveType driveType2, String str) {
        super(1);
        this.$driveType = driveType;
        this.$selection = driveType2;
        this.$label = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C16044q) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k C16044q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "$this$clearAndSetSemantics");
        SemanticsPropertiesKt.m71983S0(qVar, this.$driveType == this.$selection);
        SemanticsPropertiesKt.m71959G0(qVar, this.$label);
    }
}

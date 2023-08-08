package com.carrefour.fid.android.service.presentation.p044ui.drive.summary;

import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8700z0;
import com.carrefour.fid.android.domain.models.service.models.DriveType;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nDriveSummaryScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DriveSummaryScreen.kt\ncom/carrefour/fid/android/service/presentation/ui/drive/summary/DriveSummaryScreenKt$DriveSummaryPreview$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,300:1\n36#2:301\n1114#3,6:302\n*S KotlinDebug\n*F\n+ 1 DriveSummaryScreen.kt\ncom/carrefour/fid/android/service/presentation/ui/drive/summary/DriveSummaryScreenKt$DriveSummaryPreview$1\n*L\n279#1:301\n279#1:302,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.summary.DriveSummaryScreenKt$DriveSummaryPreview$1 */
public final class DriveSummaryScreenKt$DriveSummaryPreview$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ List<DriveType> $driveTypes;
    final /* synthetic */ C8700z0<DriveType> $selection$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DriveSummaryScreenKt$DriveSummaryPreview$1(List<? extends DriveType> list, C8700z0<DriveType> z0Var) {
        super(2);
        this.$driveTypes = list;
        this.$selection$delegate = z0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: kotlin.jvm.functions.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(@org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r14, int r15) {
        /*
            r13 = this;
            r0 = r15 & 11
            r1 = 2
            if (r0 != r1) goto L_0x0010
            boolean r0 = r14.mo15011p()
            if (r0 != 0) goto L_0x000c
            goto L_0x0010
        L_0x000c:
            r14.mo14958a0()
            goto L_0x0072
        L_0x0010:
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x001f
            r0 = -1
            java.lang.String r1 = "com.carrefour.fid.android.service.presentation.ui.drive.summary.DriveSummaryPreview.<anonymous> (DriveSummaryScreen.kt:267)"
            r2 = -423535122(0xffffffffe6c15dee, float:-4.565747E23)
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r15, r0, r1)
        L_0x001f:
            r3 = 0
            com.carrefour.fid.android.service.presentation.ui.drive.summary.DrivePoint r4 = new com.carrefour.fid.android.service.presentation.ui.drive.summary.DrivePoint
            java.util.List<com.carrefour.fid.android.domain.models.service.models.DriveType> r15 = r13.$driveTypes
            java.lang.String r0 = "29 av de Paris\nVersailles"
            java.lang.String r1 = "Orleans"
            java.lang.String r2 = ""
            r4.<init>(r1, r2, r15, r0)
            r5 = 1168687104(0x45a8c000, float:5400.0)
            androidx.compose.runtime.z0<com.carrefour.fid.android.domain.models.service.models.DriveType> r15 = r13.$selection$delegate
            com.carrefour.fid.android.domain.models.service.models.DriveType r6 = com.carrefour.fid.android.service.presentation.p044ui.drive.summary.DriveSummaryScreenKt.DriveSummaryPreview$lambda$18(r15)
            r7 = 1
            androidx.compose.runtime.z0<com.carrefour.fid.android.domain.models.service.models.DriveType> r15 = r13.$selection$delegate
            r0 = 1157296644(0x44faf204, float:2007.563)
            r14.mo14918M(r0)
            boolean r0 = r14.mo15006n0(r15)
            java.lang.Object r1 = r14.mo14921N()
            if (r0 != 0) goto L_0x0051
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r1 != r0) goto L_0x0059
        L_0x0051:
            com.carrefour.fid.android.service.presentation.ui.drive.summary.DriveSummaryScreenKt$DriveSummaryPreview$1$1$1 r1 = new com.carrefour.fid.android.service.presentation.ui.drive.summary.DriveSummaryScreenKt$DriveSummaryPreview$1$1$1
            r1.<init>(r15)
            r14.mo14893C(r1)
        L_0x0059:
            r14.mo15002m0()
            r8 = r1
            kotlin.jvm.functions.l r8 = (kotlin.jvm.functions.C11300l) r8
            com.carrefour.fid.android.service.presentation.ui.drive.summary.DriveSummaryScreenKt$DriveSummaryPreview$1$2 r9 = com.carrefour.fid.android.service.presentation.p044ui.drive.summary.DriveSummaryScreenKt$DriveSummaryPreview$1.C284292.INSTANCE
            r11 = 1597888(0x1861c0, float:2.239118E-39)
            r12 = 1
            r10 = r14
            com.carrefour.fid.android.service.presentation.p044ui.drive.summary.DriveSummaryScreenKt.DriveSummary(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            boolean r14 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r14 == 0) goto L_0x0072
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0072:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.presentation.p044ui.drive.summary.DriveSummaryScreenKt$DriveSummaryPreview$1.invoke(androidx.compose.runtime.o, int):void");
    }
}

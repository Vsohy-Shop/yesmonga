package com.carrefour.fid.android.service.presentation.p044ui.drive.summary;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.C2373k;
import androidx.compose.foundation.layout.C2428y0;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.C2694o;
import androidx.compose.material.C7933t0;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.semantics.SemanticsModifierKt;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import com.carrefour.fid.android.design.components.compose.ButtonColor;
import com.carrefour.fid.android.design.components.compose.ButtonComponentKt;
import com.carrefour.fid.android.design.components.compose.ButtonType;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.C37477d;
import com.carrefour.fid.android.domain.models.service.models.DriveType;
import com.carrefour.fid.android.presentation.p035ui.orders.legacy.WithdrawalOrderDriveFragment;
import com.carrefour.fid.android.service.C28330R;
import com.carrefour.fid.android.service.presentation.p044ui.drive.summary.component.DriveCardKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nDriveSummaryScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DriveSummaryScreen.kt\ncom/carrefour/fid/android/service/presentation/ui/drive/summary/DriveSummaryScreenKt$DriveSummary$3\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,300:1\n74#2,6:301\n80#2:333\n84#2:342\n75#3:307\n76#3,11:309\n89#3:341\n76#4:308\n460#5,13:320\n473#5,3:338\n154#6:334\n154#6:335\n154#6:336\n154#6:337\n*S KotlinDebug\n*F\n+ 1 DriveSummaryScreen.kt\ncom/carrefour/fid/android/service/presentation/ui/drive/summary/DriveSummaryScreenKt$DriveSummary$3\n*L\n121#1:301,6\n121#1:333\n121#1:342\n121#1:307\n121#1:309,11\n121#1:341\n121#1:308\n121#1:320,13\n121#1:338,3\n133#1:334\n134#1:335\n146#1:336\n152#1:337\n*E\n"})
/* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.summary.DriveSummaryScreenKt$DriveSummary$3 */
public final class DriveSummaryScreenKt$DriveSummary$3 extends Lambda implements C11305q<C2366i0, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ float $distanceMeters;
    final /* synthetic */ DrivePoint $drivePoint;
    final /* synthetic */ C11300l<DriveType, C11079d2> $onDriveTypeSelection;
    final /* synthetic */ C11289a<C11079d2> $onValidate;
    final /* synthetic */ DriveType $selection;
    final /* synthetic */ boolean $validateEnabled;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DriveSummaryScreenKt$DriveSummary$3(DrivePoint drivePoint, DriveType driveType, C11300l<? super DriveType, C11079d2> lVar, int i, float f, C11289a<C11079d2> aVar, boolean z) {
        super(3);
        this.$drivePoint = drivePoint;
        this.$selection = driveType;
        this.$onDriveTypeSelection = lVar;
        this.$$dirty = i;
        this.$distanceMeters = f;
        this.$onValidate = aVar;
        this.$validateEnabled = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C2366i0) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12579k C2366i0 i0Var, @C12580l C8592o oVar, int i) {
        int i2;
        C11289a<C11079d2> aVar;
        boolean z;
        float f;
        C2366i0 i0Var2 = i0Var;
        C8592o oVar2 = oVar;
        int i3 = i;
        Intrinsics.checkNotNullParameter(i0Var2, "paddingValues");
        if ((i3 & 14) == 0) {
            i2 = (oVar2.mo15006n0(i0Var2) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i2 & 91) != 18 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(2043531770, i3, -1, "com.carrefour.fid.android.service.presentation.ui.drive.summary.DriveSummary.<anonymous> (DriveSummaryScreen.kt:119)");
            }
            C8767m.C8768a aVar2 = C8767m.f23478j;
            C8767m d = BackgroundKt.m8825d(SizeKt.m10112l(PaddingKt.m10023j(aVar2, i0Var2), 0.0f, 1, (Object) null), C15240j2.f37547b.mo42852w(), (C15218g4) null, 2, (Object) null);
            DrivePoint drivePoint = this.$drivePoint;
            DriveType driveType = this.$selection;
            C11300l<DriveType, C11079d2> lVar = this.$onDriveTypeSelection;
            int i4 = this.$$dirty;
            float f2 = this.$distanceMeters;
            C11289a<C11079d2> aVar3 = this.$onValidate;
            boolean z2 = this.$validateEnabled;
            oVar2.mo14918M(-483455358);
            C15560f0 b = ColumnKt.m9863b(Arrangement.f6010a.mo7631r(), C8734c.f23406a.mo17072u(), oVar2, 0);
            oVar2.mo14918M(-1323940314);
            C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f3 = LayoutKt.m68908f(d);
            if (!(oVar.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            oVar.mo14938T();
            if (oVar.mo14997l()) {
                oVar2.mo14947W(a);
            } else {
                oVar.mo14888A();
            }
            oVar.mo14941U();
            C8592o b2 = Updater.m30180b(oVar);
            Updater.m30188j(b2, b, companion.mo44588d());
            Updater.m30188j(b2, dVar, companion.mo44586b());
            Updater.m30188j(b2, layoutDirection, companion.mo44587c());
            Updater.m30188j(b2, c4Var, companion.mo44590f());
            oVar.mo14972e();
            f3.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
            oVar2.mo14918M(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
            oVar2.mo14918M(739884641);
            if (drivePoint.getDriveTypes().size() > 1) {
                z = z2;
                aVar = aVar3;
                f = f2;
                DriveSummaryScreenKt.DriveTypeSelection(drivePoint.getName(), drivePoint.getDriveTypes(), driveType, lVar, oVar, ((i4 >> 3) & 896) | 64 | ((i4 >> 6) & 7168));
            } else {
                z = z2;
                aVar = aVar3;
                f = f2;
            }
            oVar.mo15002m0();
            float f4 = (float) 16;
            int i5 = i4;
            DriveCardKt.DriveCard(SemanticsModifierKt.m71867b(BackgroundKt.m8824c(PaddingKt.m10024k(aVar2, C16483g.m74435M(f4)), C37475b.f94185a.mo114234c(), C2694o.m12166h(C16483g.m74435M((float) 8))), true, DriveSummaryScreenKt$DriveSummary$3$1$1.INSTANCE), drivePoint.getName(), drivePoint.getBanner(), drivePoint.getAddress(), driveType, f, oVar, ((i4 << 3) & 57344) | ((i4 << 9) & 458752), 0);
            C2428y0.m10726a(C2373k.m10461c(columnScopeInstance, aVar2, 1.0f, false, 2, (Object) null), oVar2, 0);
            TextKt.m14196c(C16018i.m71858d(C28330R.string.drive_summary_conditions, oVar2, 0), PaddingKt.m10026m(aVar2, C16483g.m74435M(f4), 0.0f, 2, (Object) null), 0, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153892d(C7933t0.f19075a.mo11077c(oVar2, C7933t0.f19076b)), oVar, 48, 0, 65532);
            ButtonComponentKt.m151339f(SizeKt.m10114n(PaddingKt.m10024k(aVar2, C16483g.m74435M(f4)), 0.0f, 1, (Object) null), aVar, (ButtonType) null, (ButtonColor) null, false, C16018i.m71858d(C28330R.string.delivery_service_start_shopping_button, oVar, 0), false, (Integer) null, z, oVar, ((i5 >> 15) & 112) | 6 | ((i5 << 12) & 234881024), WithdrawalOrderDriveFragment.f61322x);
            oVar.mo15002m0();
            oVar.mo14896D();
            oVar.mo15002m0();
            oVar.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}

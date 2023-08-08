package com.carrefour.fid.android.service.presentation.p044ui.drive.map.component;

import androidx.compose.foundation.layout.C2411u0;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.C7933t0;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.carrefour.fid.android.design.theme.C37477d;
import com.carrefour.fid.android.service.C28330R;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nDriveCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DriveCard.kt\ncom/carrefour/fid/android/service/presentation/ui/drive/map/component/DriveCardKt$DriveCard$2$3$3\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,211:1\n154#2:212\n154#2:213\n*S KotlinDebug\n*F\n+ 1 DriveCard.kt\ncom/carrefour/fid/android/service/presentation/ui/drive/map/component/DriveCardKt$DriveCard$2$3$3\n*L\n129#1:212\n130#1:213\n*E\n"})
/* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.map.component.DriveCardKt$DriveCard$2$3$3 */
public final class DriveCardKt$DriveCard$2$3$3 extends Lambda implements C11305q<C2411u0, C8592o, Integer, C11079d2> {
    final /* synthetic */ boolean $isLoading;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DriveCardKt$DriveCard$2$3$3(boolean z) {
        super(3);
        this.$isLoading = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C2411u0) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12579k C2411u0 u0Var, @C12580l C8592o oVar, int i) {
        C8592o oVar2 = oVar;
        int i2 = i;
        Intrinsics.checkNotNullParameter(u0Var, "$this$Button");
        if ((i2 & 81) != 16 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1959234832, i2, -1, "com.carrefour.fid.android.service.presentation.ui.drive.map.component.DriveCard.<anonymous>.<anonymous>.<anonymous> (DriveCard.kt:125)");
            }
            if (this.$isLoading) {
                oVar2.mo14918M(-191547654);
                ProgressIndicatorKt.m13705b(SizeKt.m10087C(C8767m.f23478j, C16483g.m74435M((float) 20)), 0, C16483g.m74435M((float) 3), 0, 0, oVar, 390, 26);
                oVar.mo15002m0();
            } else {
                oVar2.mo14918M(-191547459);
                TextKt.m14196c(C16018i.m71858d(C28330R.string.drive_map_select_button, oVar2, 0), (C8767m) null, C15240j2.f37547b.mo42852w(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153900l(C7933t0.f19075a.mo11077c(oVar2, C7933t0.f19076b)), oVar, C22132b.f56831b, 0, 65530);
                oVar.mo15002m0();
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}

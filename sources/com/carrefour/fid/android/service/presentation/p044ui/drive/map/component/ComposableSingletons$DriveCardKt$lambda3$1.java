package com.carrefour.fid.android.service.presentation.p044ui.drive.map.component;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.domain.models.service.models.DriveType;
import com.carrefour.fid.android.service.presentation.model.DrivePoint;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.C10927c1;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nDriveCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DriveCard.kt\ncom/carrefour/fid/android/service/presentation/ui/drive/map/component/ComposableSingletons$DriveCardKt$lambda-3$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,211:1\n154#2:212\n*S KotlinDebug\n*F\n+ 1 DriveCard.kt\ncom/carrefour/fid/android/service/presentation/ui/drive/map/component/ComposableSingletons$DriveCardKt$lambda-3$1\n*L\n196#1:212\n*E\n"})
/* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.map.component.ComposableSingletons$DriveCardKt$lambda-3$1  reason: invalid class name */
public final class ComposableSingletons$DriveCardKt$lambda3$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    public static final ComposableSingletons$DriveCardKt$lambda3$1 INSTANCE = new ComposableSingletons$DriveCardKt$lambda3$1();

    public ComposableSingletons$DriveCardKt$lambda3$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        int i2 = i;
        if ((i2 & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1590755268, i2, -1, "com.carrefour.fid.android.service.presentation.ui.drive.map.component.ComposableSingletons$DriveCardKt.lambda-3.<anonymous> (DriveCard.kt:193)");
            }
            DriveCardKt.DriveCard(SizeKt.m10089E(C8767m.f23478j, C16483g.m74435M((float) 330), C16483g.m74435M((float) 172)), new DrivePoint("Titre", 0.0d, 0.0d, "", "", C10927c1.m40883f(DriveType.DRIVE_PEDESTRIAN), "29 avenue de Paris", "", "78000", "Versailles"), 0.0f, true, (C11300l<? super DrivePoint, C11079d2>) null, oVar, 3526, 16);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}

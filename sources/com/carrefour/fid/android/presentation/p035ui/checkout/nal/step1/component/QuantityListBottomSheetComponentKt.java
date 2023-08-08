package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.component;

import androidx.compose.foundation.shape.C2693n;
import androidx.compose.foundation.shape.C2694o;
import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.domain.models.product.Product;
import com.contentsquare.android.api.C14092c;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nQuantityListBottomSheetComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuantityListBottomSheetComponent.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step1/component/QuantityListBottomSheetComponentKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,69:1\n154#2:70\n*S KotlinDebug\n*F\n+ 1 QuantityListBottomSheetComponent.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step1/component/QuantityListBottomSheetComponentKt\n*L\n45#1:70\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.component.QuantityListBottomSheetComponentKt */
public final class QuantityListBottomSheetComponentKt {
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m104771a(@C12579k ModalBottomSheetState modalBottomSheetState, @C12579k C23547a aVar, @C12579k C11304p<? super Product, ? super Integer, C11079d2> pVar, @C12580l C8592o oVar, int i) {
        ModalBottomSheetState modalBottomSheetState2 = modalBottomSheetState;
        C23547a aVar2 = aVar;
        C11304p<? super Product, ? super Integer, C11079d2> pVar2 = pVar;
        int i2 = i;
        Intrinsics.checkNotNullParameter(modalBottomSheetState2, "modalBottomSheetState");
        Intrinsics.checkNotNullParameter(aVar2, "bottomSheetData");
        Intrinsics.checkNotNullParameter(pVar2, "onNewQuantitySelected");
        C8592o o = oVar.mo15009o(-1985730169);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1985730169, i2, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step1.component.QuantityListBottomSheetComponent (QuantityListBottomSheetComponent.kt:37)");
        }
        float f = (float) 16;
        float f2 = (float) 0;
        C2693n i3 = C2694o.m12167i(C16483g.m74435M(f), C16483g.m74435M(f), C16483g.m74435M(f2), C16483g.m74435M(f2));
        C8592o oVar2 = o;
        ModalBottomSheetKt.m13582c(C8553b.m31048b(o, -1589838283, true, new C23542xfb465848(aVar2, pVar2)), (C8767m) null, modalBottomSheetState, i3, 0.0f, 0, 0, 0, ComposableSingletons$QuantityListBottomSheetComponentKt.f59498a.mo68972a(), oVar2, (ModalBottomSheetState.f7719e << 6) | 100663302 | ((i2 << 6) & 896), C14092c.f34607h0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new C23544xfb465849(modalBottomSheetState2, aVar, pVar, i));
        }
    }
}

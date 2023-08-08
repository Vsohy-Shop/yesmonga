package com.carrefour.fid.android.product.presentation.p039ui.details.views;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.domain.models.service.models.FacilityServiceId;
import com.carrefour.fid.android.product.C27609f;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nDeliveryChoiceComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeliveryChoiceComponent.kt\ncom/carrefour/fid/android/product/presentation/ui/details/views/ComposableSingletons$DeliveryChoiceComponentKt$lambda-1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,116:1\n154#2:117\n*S KotlinDebug\n*F\n+ 1 DeliveryChoiceComponent.kt\ncom/carrefour/fid/android/product/presentation/ui/details/views/ComposableSingletons$DeliveryChoiceComponentKt$lambda-1$1\n*L\n93#1:117\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.views.ComposableSingletons$DeliveryChoiceComponentKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$DeliveryChoiceComponentKt$lambda1$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {

    /* renamed from: f */
    public static final ComposableSingletons$DeliveryChoiceComponentKt$lambda1$1 f67600f = new ComposableSingletons$DeliveryChoiceComponentKt$lambda1$1();

    public ComposableSingletons$DeliveryChoiceComponentKt$lambda1$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        C8592o oVar2 = oVar;
        int i2 = i;
        if ((i2 & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(299869872, i2, -1, "com.carrefour.fid.android.product.presentation.ui.details.views.ComposableSingletons$DeliveryChoiceComponentKt.lambda-1.<anonymous> (DeliveryChoiceComponent.kt:88)");
            }
            C8767m o = PaddingKt.m10028o(SizeKt.m10114n(C8767m.f23478j, 0.0f, 1, (Object) null), 0.0f, 0.0f, 0.0f, C16483g.m74435M((float) 16), 7, (Object) null);
            int i3 = C27609f.C27627r.pdp_store_delivery;
            DeliveryChoiceComponentKt.m117173a(o, CollectionsKt__CollectionsKt.m40448L(new C27934i(C16018i.m71858d(i3, oVar2, 0), false, (String) null, false, false, false, FacilityServiceId.m157959c((String) null, 1, (DefaultConstructorMarker) null), (C27935j) null, 176, (DefaultConstructorMarker) null), new C27934i(C16018i.m71858d(i3, oVar2, 0), true, (String) null, true, false, false, FacilityServiceId.m157959c((String) null, 1, (DefaultConstructorMarker) null), (C27935j) null, 176, (DefaultConstructorMarker) null)), (C11300l<? super C27934i, C11079d2>) null, (C11300l<? super Boolean, C11079d2>) null, oVar, 6, 12);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}

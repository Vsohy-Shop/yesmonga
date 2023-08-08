package com.carrefour.fid.android.presentation.p035ui.physicalstore.component;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.core.type.LoyaltyCardType;
import com.carrefour.fid.android.data.entities.coupons.CouponStatus;
import com.carrefour.fid.android.domain.models.C37974c;
import com.carrefour.fid.android.domain.models.C38015d;
import com.carrefour.fid.android.domain.models.C38029f;
import com.carrefour.fid.android.domain.models.C38041k;
import com.carrefour.fid.android.domain.models.DiscountType;
import com.carrefour.fid.android.presentation.models.UserCardModel;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26487c;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26497f;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26501g;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26505h;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27115b;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.component.ComposableSingletons$PhysicalStoreLoyaltyComponentKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$PhysicalStoreLoyaltyComponentKt$lambda1$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {

    /* renamed from: f */
    public static final ComposableSingletons$PhysicalStoreLoyaltyComponentKt$lambda1$1 f62462f = new ComposableSingletons$PhysicalStoreLoyaltyComponentKt$lambda1$1();

    public ComposableSingletons$PhysicalStoreLoyaltyComponentKt$lambda1$1() {
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
                ComposerKt.m29845w0(1662856860, i2, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.component.ComposableSingletons$PhysicalStoreLoyaltyComponentKt.lambda-1.<anonymous> (PhysicalStoreLoyaltyComponent.kt:56)");
            }
            C26501g.C26502a aVar = new C26501g.C26502a(new UserCardModel(LoyaltyCardType.FID, "123456789"));
            C26497f.C26499b bVar = new C26497f.C26499b(20.0d);
            CouponStatus couponStatus = CouponStatus.UNKNOWN;
            PhysicalStoreLoyaltyComponentKt.m109629a((C8767m) null, new C27115b(aVar, bVar, new C26487c.C26489b(new C37974c(CollectionsKt__CollectionsKt.m40448L(new C38015d(0, (String) null, (String) null, (String) null, (Double) null, (DiscountType) null, (String) null, (String) null, 0, (String) null, (String) null, (List) null, (String) null, (String) null, couponStatus, (C38029f) null, (String) null, (List) null, (String) null, (C38041k) null, (String) null, (String) null, (String) null, 8372223, (DefaultConstructorMarker) null), new C38015d(0, (String) null, (String) null, (String) null, (Double) null, (DiscountType) null, (String) null, (String) null, 0, (String) null, (String) null, (List) null, (String) null, (String) null, couponStatus, (C38029f) null, (String) null, (List) null, (String) null, (C38041k) null, (String) null, (String) null, (String) null, 8372223, (DefaultConstructorMarker) null)), (List) null, (List) null, 6, (DefaultConstructorMarker) null)), new C26505h.C26506a("stiker", "url", "imageUrl")), (C11289a<C11079d2>) null, (C11289a<C11079d2>) null, (C11300l<? super Integer, C11079d2>) null, (C11289a<C11079d2>) null, (C11289a<C11079d2>) null, (C11289a<C11079d2>) null, (C11304p<? super String, ? super String, C11079d2>) null, oVar, 0, 509);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}

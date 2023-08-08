package com.carrefour.fid.android.presentation.p035ui.physicalstore;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.carrefour.fid.android.core.type.LoyaltyCardType;
import com.carrefour.fid.android.data.entities.coupons.CouponStatus;
import com.carrefour.fid.android.design.components.widgets.C37396r1;
import com.carrefour.fid.android.design.components.widgets.C37399s1;
import com.carrefour.fid.android.domain.models.C37974c;
import com.carrefour.fid.android.domain.models.C38015d;
import com.carrefour.fid.android.domain.models.C38029f;
import com.carrefour.fid.android.domain.models.C38041k;
import com.carrefour.fid.android.domain.models.DiscountType;
import com.carrefour.fid.android.domain.models.service.models.C38154g;
import com.carrefour.fid.android.domain.models.service.models.C38163l;
import com.carrefour.fid.android.domain.models.service.models.StoreAddress;
import com.carrefour.fid.android.presentation.models.UserCardModel;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26487c;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26497f;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26501g;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26505h;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27101a;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27115b;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27116c;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27127e;
import java.util.Date;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreScreenKt$PhysicalStoreScreenPreview$1 */
public final class PhysicalStoreScreenKt$PhysicalStoreScreenPreview$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ C11300l<C27101a, C11079d2> $actioner;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhysicalStoreScreenKt$PhysicalStoreScreenPreview$1(C11300l<? super C27101a, C11079d2> lVar) {
        super(2);
        this.$actioner = lVar;
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
                ComposerKt.m29845w0(933588543, i2, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreScreenPreview.<anonymous> (PhysicalStoreScreen.kt:391)");
            }
            Boolean bool = Boolean.TRUE;
            C37396r1 r1Var = new C37396r1("Express Pasteur Antony", bool, new C37399s1(new Date(), new Date()));
            Boolean bool2 = Boolean.FALSE;
            C27116c.C27119c cVar = new C27116c.C27119c(new C38163l((String) null, (String) null, (String) null, (String) null, (String) null, CollectionsKt__CollectionsKt.m40448L(bool2, bool2, bool, bool2, bool2, bool2, bool2), (String) null, (StoreAddress) null, (List) null, CollectionsKt__CollectionsKt.m40448L(new C38154g((String) null, "1", (String) null, "Lun. 18 avr. de 08:30 à 20:00", (List) null, 21, (DefaultConstructorMarker) null), new C38154g((String) null, "2", (String) null, "Dim. 1 mai", (List) null, 21, (DefaultConstructorMarker) null)), (List) null, (String) null, (String) null, (String) null, (String) null, false, false, (List) null, 261599, (DefaultConstructorMarker) null), r1Var);
            C26501g.C26502a aVar = new C26501g.C26502a(new UserCardModel(LoyaltyCardType.FID, "123456789"));
            C26497f.C26499b bVar = new C26497f.C26499b(20.0d);
            CouponStatus couponStatus = CouponStatus.UNKNOWN;
            PhysicalStoreScreenKt.m109459b((C8767m) null, new C27127e(cVar, new C27115b(aVar, bVar, new C26487c.C26489b(new C37974c(CollectionsKt__CollectionsKt.m40448L(new C38015d(0, (String) null, (String) null, (String) null, (Double) null, (DiscountType) null, (String) null, (String) null, 0, (String) null, (String) null, (List) null, (String) null, (String) null, couponStatus, (C38029f) null, (String) null, (List) null, (String) null, (C38041k) null, (String) null, (String) null, (String) null, 8372223, (DefaultConstructorMarker) null), new C38015d(0, (String) null, (String) null, (String) null, (Double) null, (DiscountType) null, (String) null, (String) null, 0, (String) null, (String) null, (List) null, (String) null, (String) null, couponStatus, (C38029f) null, (String) null, (List) null, (String) null, (C38041k) null, (String) null, (String) null, (String) null, 8372223, (DefaultConstructorMarker) null)), (List) null, (List) null, 6, (DefaultConstructorMarker) null)), new C26505h.C26506a("stiker", "url", "imageUrl"))), this.$actioner, oVar, C22132b.f56831b, 1);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}

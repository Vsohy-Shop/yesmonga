package com.carrefour.fid.android.domain.interactors.coupons;

import com.carrefour.fid.android.data.entities.coupons.CouponStatus;
import com.carrefour.fid.android.domain.interactors.service.C37816e;
import com.carrefour.fid.android.domain.models.C38015d;
import com.carrefour.fid.android.domain.models.C38029f;
import com.carrefour.fid.android.domain.models.C38041k;
import com.carrefour.fid.android.domain.models.DiscountType;
import com.carrefour.fid.android.domain.models.service.models.C38146a;
import com.carrefour.fid.android.domain.models.service.models.C38163l;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.domain.interactors.coupons.GetAvailableCouponsUseCase$updateWithFacilityDetails$stores$1", mo22502f = "GetAvailableCouponsUseCase.kt", mo22503i = {0}, mo22504l = {113}, mo22505m = "invokeSuspend", mo22506n = {"coupon"}, mo22507s = {"L$0"})
@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/d;", "coupon", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class GetAvailableCouponsUseCase$updateWithFacilityDetails$stores$1 extends SuspendLambda implements C11304p<C38015d, C11045c<? super C38015d>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GetAvailableCouponsUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetAvailableCouponsUseCase$updateWithFacilityDetails$stores$1(GetAvailableCouponsUseCase getAvailableCouponsUseCase, C11045c<? super GetAvailableCouponsUseCase$updateWithFacilityDetails$stores$1> cVar) {
        super(2, cVar);
        this.this$0 = getAvailableCouponsUseCase;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        GetAvailableCouponsUseCase$updateWithFacilityDetails$stores$1 getAvailableCouponsUseCase$updateWithFacilityDetails$stores$1 = new GetAvailableCouponsUseCase$updateWithFacilityDetails$stores$1(this.this$0, cVar);
        getAvailableCouponsUseCase$updateWithFacilityDetails$stores$1.L$0 = obj;
        return getAvailableCouponsUseCase$updateWithFacilityDetails$stores$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C38015d dVar, @C12580l C11045c<? super C38015d> cVar) {
        return ((GetAvailableCouponsUseCase$updateWithFacilityDetails$stores$1) create(dVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C38015d dVar;
        Object obj2;
        boolean z;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C38015d dVar2 = (C38015d) this.L$0;
            String T = dVar2.mo117594T();
            if (T == null || T.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return dVar2;
            }
            C37816e b = this.this$0.f94430c;
            C38146a a = C38146a.m158071a(C38146a.m158072b(dVar2.mo117594T()));
            this.L$0 = dVar2;
            this.label = 1;
            Object r3 = b.m172966invokegIAlus(a, this);
            if (r3 == h) {
                return h;
            }
            dVar = dVar2;
            obj2 = r3;
        } else if (i == 1) {
            C11661u0.m45747n(obj);
            obj2 = ((Result) obj).mo21858l();
            dVar = (C38015d) this.L$0;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (Result.m38709i(obj2)) {
            obj2 = null;
        }
        C38163l lVar = (C38163l) obj2;
        if (lVar == null) {
            return dVar;
        }
        C38041k kVar = r1;
        C38041k kVar2 = new C38041k(lVar.mo119361E(), lVar.mo119394x());
        return C38015d.m156658y(dVar, 0, (String) null, (String) null, (String) null, (Double) null, (DiscountType) null, (String) null, (String) null, 0, (String) null, (String) null, (List) null, (String) null, (String) null, (CouponStatus) null, (C38029f) null, (String) null, (List) null, (String) null, kVar, (String) null, (String) null, (String) null, 7864319, (Object) null);
    }
}

package com.carrefour.fid.android.checkout.data.api.datasources;

import com.carrefour.fid.android.checkout.data.api.datasources.extension.C39832b;
import com.carrefour.fid.android.checkout.data.api.entities.p069v2.request.SlotYieldServiceRequestBody;
import com.carrefour.fid.android.checkout.data.api.entities.p069v2.response.SlotDetailResponse;
import com.carrefour.fid.android.checkout.data.api.entities.p069v2.response.SlotListResponse;
import com.carrefour.fid.android.checkout.data.api.services.C39838b;
import com.carrefour.fid.android.domain.interactors.slot.C37859f;
import com.carrefour.fid.android.domain.models.slot.ServiceSlot;
import com.carrefour.fid.android.shared.data.entities.extension.C28639a;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.collections.C10978t;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;

@C11067d(mo22501c = "com.carrefour.fid.android.checkout.data.api.datasources.SlotDataSource$fetchSlotYield$2", mo22502f = "SlotDataSource.kt", mo22503i = {}, mo22504l = {111}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/Result;", "Lcom/carrefour/fid/android/domain/models/slot/ServiceSlot;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nSlotDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotDataSource.kt\ncom/carrefour/fid/android/checkout/data/api/datasources/SlotDataSource$fetchSlotYield$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,125:1\n1549#2:126\n1620#2,3:127\n*S KotlinDebug\n*F\n+ 1 SlotDataSource.kt\ncom/carrefour/fid/android/checkout/data/api/datasources/SlotDataSource$fetchSlotYield$2\n*L\n117#1:126\n117#1:127,3\n*E\n"})
public final class SlotDataSource$fetchSlotYield$2 extends SuspendLambda implements C11300l<C11045c<? super Result<? extends ServiceSlot>>, Object> {
    final /* synthetic */ C37859f.C37860a $params;
    int label;
    final /* synthetic */ SlotDataSource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SlotDataSource$fetchSlotYield$2(C37859f.C37860a aVar, SlotDataSource slotDataSource, C11045c<? super SlotDataSource$fetchSlotYield$2> cVar) {
        super(1, cVar);
        this.$params = aVar;
        this.this$0 = slotDataSource;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new SlotDataSource$fetchSlotYield$2(this.$params, this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        List<SlotDetailResponse> list;
        Object obj2;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            SlotYieldServiceRequestBody slotYieldServiceRequestBody = new SlotYieldServiceRequestBody(new SlotYieldServiceRequestBody.SlotYield(new SlotYieldServiceRequestBody.SlotYieldAddress(this.$params.mo115303m(), this.$params.mo115304n()), new SlotYieldServiceRequestBody.SlotYieldBasket(this.$params.mo115300j(), this.$params.mo115302l(), this.$params.mo115305o(), this.$params.mo115306p())));
            C39838b a = this.this$0.f101597a;
            String k = this.$params.mo115301k();
            this.label = 1;
            obj = a.mo131384c(k, slotYieldServiceRequestBody, this);
            if (obj == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C13091w wVar = (C13091w) obj;
        SlotListResponse slotListResponse = (SlotListResponse) wVar.mo30572a();
        if (slotListResponse != null) {
            list = slotListResponse.getSlotList();
        } else {
            list = null;
        }
        if (!wVar.mo30576g() || list == null) {
            Result.C10852a aVar = Result.f28060a;
            C37859f.C37860a aVar2 = this.$params;
            obj2 = Result.m38702b(C11661u0.m45734a(C28639a.m118565d(wVar, "Error while fetching slot yield for " + aVar2 + ".facilityServiceId")));
        } else {
            Result.C10852a aVar3 = Result.f28060a;
            Iterable<SlotDetailResponse> iterable = list;
            ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
            for (SlotDetailResponse a2 : iterable) {
                arrayList.add(C39832b.m162398a(a2));
            }
            obj2 = Result.m38702b(new ServiceSlot(arrayList, false));
        }
        return Result.m38701a(obj2);
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super Result<ServiceSlot>> cVar) {
        return ((SlotDataSource$fetchSlotYield$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}

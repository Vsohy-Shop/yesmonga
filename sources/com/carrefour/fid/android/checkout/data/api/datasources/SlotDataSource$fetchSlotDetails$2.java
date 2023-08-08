package com.carrefour.fid.android.checkout.data.api.datasources;

import com.carrefour.fid.android.checkout.data.api.datasources.extension.C39832b;
import com.carrefour.fid.android.checkout.data.api.entities.p069v2.response.SlotDetailResponse;
import com.carrefour.fid.android.checkout.data.api.entities.p069v2.response.SlotResponse;
import com.carrefour.fid.android.checkout.data.api.services.C39838b;
import com.carrefour.fid.android.domain.models.slot.Slot;
import com.carrefour.fid.android.shared.data.entities.extension.C28639a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;

@C11067d(mo22501c = "com.carrefour.fid.android.checkout.data.api.datasources.SlotDataSource$fetchSlotDetails$2", mo22502f = "SlotDataSource.kt", mo22503i = {}, mo22504l = {73}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/Result;", "Lcom/carrefour/fid/android/domain/models/slot/Slot;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SlotDataSource$fetchSlotDetails$2 extends SuspendLambda implements C11300l<C11045c<? super Result<? extends Slot>>, Object> {
    final /* synthetic */ String $facilityServiceId;
    final /* synthetic */ String $slotId;
    int label;
    final /* synthetic */ SlotDataSource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SlotDataSource$fetchSlotDetails$2(SlotDataSource slotDataSource, String str, String str2, C11045c<? super SlotDataSource$fetchSlotDetails$2> cVar) {
        super(1, cVar);
        this.this$0 = slotDataSource;
        this.$slotId = str;
        this.$facilityServiceId = str2;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new SlotDataSource$fetchSlotDetails$2(this.this$0, this.$slotId, this.$facilityServiceId, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        SlotDetailResponse slotDetailResponse;
        Object obj2;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C39838b a = this.this$0.f101597a;
            String str = this.$slotId;
            String str2 = this.$facilityServiceId;
            this.label = 1;
            obj = a.mo131387f(str, str2, this);
            if (obj == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C13091w wVar = (C13091w) obj;
        SlotResponse slotResponse = (SlotResponse) wVar.mo30572a();
        if (slotResponse != null) {
            slotDetailResponse = slotResponse.getSlotDetail();
        } else {
            slotDetailResponse = null;
        }
        if (!wVar.mo30576g() || slotDetailResponse == null) {
            Result.C10852a aVar = Result.f28060a;
            String str3 = this.$slotId;
            obj2 = Result.m38702b(C11661u0.m45734a(C28639a.m118565d(wVar, "Error while fetching slot detail for " + str3)));
        } else {
            Result.C10852a aVar2 = Result.f28060a;
            obj2 = Result.m38702b(C39832b.m162398a(slotDetailResponse));
        }
        return Result.m38701a(obj2);
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super Result<Slot>> cVar) {
        return ((SlotDataSource$fetchSlotDetails$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}

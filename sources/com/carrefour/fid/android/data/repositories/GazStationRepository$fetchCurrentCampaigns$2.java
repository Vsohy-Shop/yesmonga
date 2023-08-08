package com.carrefour.fid.android.data.repositories;

import com.carrefour.fid.android.core.extension.C36311i;
import com.carrefour.fid.android.data.entities.CurrentCampaignsResponse;
import com.carrefour.fid.android.data.provider.headers.C36579u;
import com.carrefour.fid.android.data.service.C36635n;
import java.util.HashMap;
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

@C11067d(mo22501c = "com.carrefour.fid.android.data.repositories.GazStationRepository$fetchCurrentCampaigns$2", mo22502f = "GazStationRepository.kt", mo22503i = {}, mo22504l = {28}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/Result;", "Lcom/carrefour/fid/android/data/entities/CurrentCampaignsResponse;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class GazStationRepository$fetchCurrentCampaigns$2 extends SuspendLambda implements C11300l<C11045c<? super Result<? extends CurrentCampaignsResponse>>, Object> {
    int label;
    final /* synthetic */ GazStationRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GazStationRepository$fetchCurrentCampaigns$2(GazStationRepository gazStationRepository, C11045c<? super GazStationRepository$fetchCurrentCampaigns$2> cVar) {
        super(1, cVar);
        this.this$0 = gazStationRepository;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new GazStationRepository$fetchCurrentCampaigns$2(this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C36635n b = this.this$0.f90381b;
            HashMap b2 = C36579u.m149940b(this.this$0.f90380a, (String) null, 1, (Object) null);
            this.label = 1;
            obj = b.mo111661a(b2, this);
            if (obj == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C13091w wVar = (C13091w) obj;
        if (wVar.mo30576g()) {
            Result.C10852a aVar = Result.f28060a;
            obj2 = Result.m38702b(wVar.mo30572a());
        } else {
            Result.C10852a aVar2 = Result.f28060a;
            obj2 = Result.m38702b(C11661u0.m45734a(C36311i.m148971g(wVar, "Error fetching current campaigns")));
        }
        return Result.m38701a(obj2);
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super Result<CurrentCampaignsResponse>> cVar) {
        return ((GazStationRepository$fetchCurrentCampaigns$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}

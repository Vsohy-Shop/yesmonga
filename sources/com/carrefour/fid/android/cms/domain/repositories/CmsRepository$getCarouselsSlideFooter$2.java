package com.carrefour.fid.android.cms.domain.repositories;

import com.carrefour.fid.android.cms.data.entities.BlocksResponse;
import com.carrefour.fid.android.cms.data.entities.CarouselsCmsResponse;
import com.carrefour.fid.android.cms.data.services.C40023a;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
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

@C11067d(mo22501c = "com.carrefour.fid.android.cms.domain.repositories.CmsRepository$getCarouselsSlideFooter$2", mo22502f = "CmsRepository.kt", mo22503i = {}, mo22504l = {30}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/Result;", "Lcom/carrefour/fid/android/cms/data/entities/CarouselsCmsResponse;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class CmsRepository$getCarouselsSlideFooter$2 extends SuspendLambda implements C11300l<C11045c<? super Result<? extends CarouselsCmsResponse>>, Object> {
    final /* synthetic */ String $metiRef;
    int label;
    final /* synthetic */ CmsRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CmsRepository$getCarouselsSlideFooter$2(CmsRepository cmsRepository, String str, C11045c<? super CmsRepository$getCarouselsSlideFooter$2> cVar) {
        super(1, cVar);
        this.this$0 = cmsRepository;
        this.$metiRef = str;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new CmsRepository$getCarouselsSlideFooter$2(this.this$0, this.$metiRef, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        List<BlocksResponse> list;
        Object h = C11063b.m42612h();
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C40023a access$getCmsApiService$p = this.this$0.cmsApiService;
            String str = this.$metiRef;
            HashMap<String, String> a = this.this$0.cmsHeaders.mo132259a();
            this.label = 1;
            obj = access$getCmsApiService$p.mo132269i(str, a, this);
            if (obj == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C13091w wVar = (C13091w) obj;
        if (wVar.mo30576g() && wVar.mo30572a() != null) {
            CarouselsCmsResponse carouselsCmsResponse = (CarouselsCmsResponse) wVar.mo30572a();
            if (carouselsCmsResponse != null) {
                list = carouselsCmsResponse.getBlocks();
            } else {
                list = null;
            }
            Collection collection = list;
            if (collection != null && !collection.isEmpty()) {
                z = false;
            }
            if (!z) {
                Result.C10852a aVar = Result.f28060a;
                obj2 = Result.m38702b(wVar.mo30572a());
                return Result.m38701a(obj2);
            }
        }
        Result.C10852a aVar2 = Result.f28060a;
        obj2 = Result.m38702b(C11661u0.m45734a(new Throwable("Error fetching cms carousels slider")));
        return Result.m38701a(obj2);
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super Result<CarouselsCmsResponse>> cVar) {
        return ((CmsRepository$getCarouselsSlideFooter$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}

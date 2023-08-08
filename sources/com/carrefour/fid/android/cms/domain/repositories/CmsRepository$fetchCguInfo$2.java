package com.carrefour.fid.android.cms.domain.repositories;

import com.carrefour.fid.android.cms.data.entities.CmsResponse;
import com.carrefour.fid.android.cms.data.entities.DataCmsResponse;
import com.carrefour.fid.android.cms.data.extension.C40019a;
import com.carrefour.fid.android.cms.data.services.C40023a;
import com.carrefour.fid.android.shared.p046io.C28793b;
import java.util.HashMap;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;

@C11067d(mo22501c = "com.carrefour.fid.android.cms.domain.repositories.CmsRepository$fetchCguInfo$2", mo22502f = "CmsRepository.kt", mo22503i = {}, mo22504l = {85}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/Result;", "", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class CmsRepository$fetchCguInfo$2 extends SuspendLambda implements C11300l<C11045c<? super Result<? extends String>>, Object> {
    int label;
    final /* synthetic */ CmsRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CmsRepository$fetchCguInfo$2(CmsRepository cmsRepository, C11045c<? super CmsRepository$fetchCguInfo$2> cVar) {
        super(1, cVar);
        this.this$0 = cmsRepository;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new CmsRepository$fetchCguInfo$2(this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        DataCmsResponse dataCmsResponse;
        List<DataCmsResponse> data;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C40023a access$getCmsApiService$p = this.this$0.cmsApiService;
            HashMap<String, String> a = this.this$0.cmsHeaders.mo132259a();
            this.label = 1;
            obj = access$getCmsApiService$p.mo132266f(a, this);
            if (obj == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        CmsRepository cmsRepository = this.this$0;
        C13091w wVar = (C13091w) obj;
        if (wVar.mo30576g()) {
            Result.C10852a aVar = Result.f28060a;
            CmsResponse cmsResponse = (CmsResponse) wVar.mo30572a();
            if (cmsResponse == null || (data = cmsResponse.getData()) == null) {
                dataCmsResponse = null;
            } else {
                dataCmsResponse = (DataCmsResponse) CollectionsKt___CollectionsKt.m40479B2(data);
            }
            obj2 = Result.m38702b(C40019a.m162992a(dataCmsResponse));
        } else {
            try {
                Result.C10852a aVar2 = Result.f28060a;
                obj2 = Result.m38702b(cmsRepository.readLoyaltyCGUJsonFromAsset());
            } catch (Exception unused) {
                Result.C10852a aVar3 = Result.f28060a;
                obj2 = Result.m38702b(C11661u0.m45734a(C28793b.m119158b(wVar, "Error when fetching loyalty cgu")));
            }
        }
        return Result.m38701a(obj2);
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super Result<String>> cVar) {
        return ((CmsRepository$fetchCguInfo$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}

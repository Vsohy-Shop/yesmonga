package com.carrefour.fid.android.cms.domain.repositories;

import com.carrefour.fid.android.cms.data.entities.DataPrimeCmsResponse;
import com.carrefour.fid.android.cms.data.entities.DataPrimeTypeCmsResponse;
import com.carrefour.fid.android.cms.data.entities.PrimeCmsResponse;
import com.carrefour.fid.android.cms.data.services.C40023a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;

@C11067d(mo22501c = "com.carrefour.fid.android.cms.domain.repositories.CmsRepository$fetchPrimesFid$2", mo22502f = "CmsRepository.kt", mo22503i = {}, mo22504l = {59}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/Result;", "", "Lcom/carrefour/fid/android/cms/data/entities/DataPrimeCmsResponse;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nCmsRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CmsRepository.kt\ncom/carrefour/fid/android/cms/domain/repositories/CmsRepository$fetchPrimesFid$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,152:1\n1549#2:153\n1620#2,3:154\n*S KotlinDebug\n*F\n+ 1 CmsRepository.kt\ncom/carrefour/fid/android/cms/domain/repositories/CmsRepository$fetchPrimesFid$2\n*L\n64#1:153\n64#1:154,3\n*E\n"})
public final class CmsRepository$fetchPrimesFid$2 extends SuspendLambda implements C11300l<C11045c<? super Result<? extends List<? extends DataPrimeCmsResponse>>>, Object> {
    int label;
    final /* synthetic */ CmsRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CmsRepository$fetchPrimesFid$2(CmsRepository cmsRepository, C11045c<? super CmsRepository$fetchPrimesFid$2> cVar) {
        super(1, cVar);
        this.this$0 = cmsRepository;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new CmsRepository$fetchPrimesFid$2(this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        List list;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C40023a access$getCmsApiService$p = this.this$0.cmsApiService;
            HashMap<String, String> a = this.this$0.cmsHeaders.mo132259a();
            this.label = 1;
            obj = access$getCmsApiService$p.mo132264d(a, this);
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
            PrimeCmsResponse primeCmsResponse = (PrimeCmsResponse) wVar.mo30572a();
            if (primeCmsResponse != null) {
                list = primeCmsResponse.getData();
            } else {
                list = null;
            }
            if (list == null) {
                list = CollectionsKt__CollectionsKt.m40441E();
            }
            Iterable<DataPrimeTypeCmsResponse> iterable = list;
            ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
            for (DataPrimeTypeCmsResponse prime : iterable) {
                arrayList.add(prime.getPrime());
            }
            obj2 = Result.m38702b(arrayList);
        } else {
            Result.C10852a aVar2 = Result.f28060a;
            obj2 = Result.m38702b(C11661u0.m45734a(new Throwable("Error fetching cms Primes fid")));
        }
        return Result.m38701a(obj2);
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super Result<? extends List<DataPrimeCmsResponse>>> cVar) {
        return ((CmsRepository$fetchPrimesFid$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}

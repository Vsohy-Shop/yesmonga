package com.carrefour.fid.android.service.domain.repositories;

import com.carrefour.fid.android.domain.models.service.models.C38163l;
import com.carrefour.fid.android.service.data.api.datasource.FacilityDataSource;
import com.carrefour.fid.android.shared.util.cache.C28907a;
import com.carrefour.fid.android.shared.util.cache.MemCache;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.time.C11636e;
import kotlin.time.C11639g;
import kotlin.time.DurationUnit;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository$getStoreByAnabelKey$2", mo22502f = "StoreFacilityRepository.kt", mo22503i = {0}, mo22504l = {88}, mo22505m = "invokeSuspend", mo22506n = {"key"}, mo22507s = {"L$0"})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/Result;", "Lcom/carrefour/fid/android/domain/models/service/models/l;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nStoreFacilityRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StoreFacilityRepository.kt\ncom/carrefour/fid/android/service/domain/repositories/StoreFacilityRepository$getStoreByAnabelKey$2\n+ 2 MemCache.kt\ncom/carrefour/fid/android/shared/util/cache/MemCache\n*L\n1#1,108:1\n43#2:109\n*S KotlinDebug\n*F\n+ 1 StoreFacilityRepository.kt\ncom/carrefour/fid/android/service/domain/repositories/StoreFacilityRepository$getStoreByAnabelKey$2\n*L\n86#1:109\n*E\n"})
public final class StoreFacilityRepository$getStoreByAnabelKey$2 extends SuspendLambda implements C11300l<C11045c<? super Result<? extends C38163l>>, Object> {
    final /* synthetic */ String $anabelKey;
    final /* synthetic */ Boolean $isMirror;
    Object L$0;
    int label;
    final /* synthetic */ StoreFacilityRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoreFacilityRepository$getStoreByAnabelKey$2(String str, Boolean bool, StoreFacilityRepository storeFacilityRepository, C11045c<? super StoreFacilityRepository$getStoreByAnabelKey$2> cVar) {
        super(1, cVar);
        this.$anabelKey = str;
        this.$isMirror = bool;
        this.this$0 = storeFacilityRepository;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new StoreFacilityRepository$getStoreByAnabelKey$2(this.$anabelKey, this.$isMirror, this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        String str;
        Object obj3;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            String str2 = this.$anabelKey + "-" + this.$isMirror;
            C28907a aVar = this.this$0.cache.mo84139e().get(str2);
            Object obj4 = null;
            if (aVar != null) {
                obj3 = aVar.mo84147a();
            } else {
                obj3 = null;
            }
            if (obj3 instanceof C38163l) {
                obj4 = obj3;
            }
            C38163l lVar = (C38163l) obj4;
            if (lVar == null) {
                FacilityDataSource access$getFacilityDataSource$p = this.this$0.facilityDataSource;
                String str3 = this.$anabelKey;
                Boolean bool = this.$isMirror;
                this.L$0 = str2;
                this.label = 1;
                Object r1 = access$getFacilityDataSource$p.m172827getStoreByAnabel0E7RQCE(str3, bool, this);
                if (r1 == h) {
                    return h;
                }
                str = str2;
                obj2 = r1;
            } else {
                Result.C10852a aVar2 = Result.f28060a;
                obj2 = Result.m38702b(lVar);
                return Result.m38701a(obj2);
            }
        } else if (i == 1) {
            str = (String) this.L$0;
            C11661u0.m45747n(obj);
            obj2 = ((Result) obj).mo21858l();
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        StoreFacilityRepository storeFacilityRepository = this.this$0;
        if (Result.m38710j(obj2)) {
            MemCache access$getCache$p = storeFacilityRepository.cache;
            C11636e.C11637a aVar3 = C11636e.f28954b;
            access$getCache$p.mo84142j(str, (C38163l) obj2, C11639g.m45638m0(5, DurationUnit.MINUTES));
        }
        return Result.m38701a(obj2);
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super Result<C38163l>> cVar) {
        return ((StoreFacilityRepository$getStoreByAnabelKey$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}

package com.carrefour.fid.android.service.domain.repositories;

import com.carrefour.fid.android.domain.models.service.models.C38166m;
import com.carrefour.fid.android.service.data.api.datasource.StoreFacilityDataSource;
import com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository;
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
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository$fetchStoreFacilitiesByCoordinates$2", mo22502f = "StoreFacilityRepository.kt", mo22503i = {0}, mo22504l = {54}, mo22505m = "invokeSuspend", mo22506n = {"key"}, mo22507s = {"L$0"})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/Result;", "Lcom/carrefour/fid/android/domain/models/service/models/m;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nStoreFacilityRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StoreFacilityRepository.kt\ncom/carrefour/fid/android/service/domain/repositories/StoreFacilityRepository$fetchStoreFacilitiesByCoordinates$2\n+ 2 MemCache.kt\ncom/carrefour/fid/android/shared/util/cache/MemCache\n*L\n1#1,108:1\n43#2:109\n*S KotlinDebug\n*F\n+ 1 StoreFacilityRepository.kt\ncom/carrefour/fid/android/service/domain/repositories/StoreFacilityRepository$fetchStoreFacilitiesByCoordinates$2\n*L\n52#1:109\n*E\n"})
public final class StoreFacilityRepository$fetchStoreFacilitiesByCoordinates$2 extends SuspendLambda implements C11300l<C11045c<? super Result<? extends C38166m>>, Object> {
    final /* synthetic */ double $latitude;
    final /* synthetic */ double $longitude;
    final /* synthetic */ int $page;
    final /* synthetic */ int $radius;
    final /* synthetic */ int $size;
    final /* synthetic */ boolean $withDriveServices;
    final /* synthetic */ boolean $withH1h3Services;
    final /* synthetic */ boolean $withLadServices;
    Object L$0;
    int label;
    final /* synthetic */ StoreFacilityRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoreFacilityRepository$fetchStoreFacilitiesByCoordinates$2(double d, double d2, int i, boolean z, boolean z2, boolean z3, int i2, int i3, StoreFacilityRepository storeFacilityRepository, C11045c<? super StoreFacilityRepository$fetchStoreFacilitiesByCoordinates$2> cVar) {
        super(1, cVar);
        this.$latitude = d;
        this.$longitude = d2;
        this.$radius = i;
        this.$withLadServices = z;
        this.$withH1h3Services = z2;
        this.$withDriveServices = z3;
        this.$size = i2;
        this.$page = i3;
        this.this$0 = storeFacilityRepository;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new StoreFacilityRepository$fetchStoreFacilitiesByCoordinates$2(this.$latitude, this.$longitude, this.$radius, this.$withLadServices, this.$withH1h3Services, this.$withDriveServices, this.$size, this.$page, this.this$0, cVar);
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
            String byCoordinatesKey = new StoreFacilityRepository.ByCoordinatesKey(this.$latitude, this.$longitude, this.$radius, this.$withLadServices, this.$withH1h3Services, this.$withDriveServices, this.$size, this.$page).toString();
            C28907a aVar = this.this$0.cache.mo84139e().get(byCoordinatesKey);
            Object obj4 = null;
            if (aVar != null) {
                obj3 = aVar.mo84147a();
            } else {
                obj3 = null;
            }
            if (obj3 instanceof C38166m) {
                obj4 = obj3;
            }
            C38166m mVar = (C38166m) obj4;
            if (mVar == null) {
                StoreFacilityDataSource access$getStoreFacilityDataSource$p = this.this$0.storeFacilityDataSource;
                double d = this.$latitude;
                double d2 = this.$longitude;
                int i2 = this.$radius;
                boolean z = this.$withLadServices;
                boolean z2 = this.$withH1h3Services;
                boolean z3 = this.$withDriveServices;
                int i3 = this.$size;
                int i4 = this.$page;
                this.L$0 = byCoordinatesKey;
                this.label = 1;
                obj2 = access$getStoreFacilityDataSource$p.m172831fetchStoreFacilitiesByCoordinatestZkwj4A(d, d2, i2, z, z2, z3, i3, i4, this);
                if (obj2 == h) {
                    return h;
                }
                str = byCoordinatesKey;
            } else {
                Result.C10852a aVar2 = Result.f28060a;
                obj2 = Result.m38702b(mVar);
                return Result.m38701a(obj2);
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
            obj2 = ((Result) obj).mo21858l();
            str = (String) this.L$0;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        StoreFacilityRepository storeFacilityRepository = this.this$0;
        if (Result.m38710j(obj2)) {
            MemCache.m119548k(storeFacilityRepository.cache, str, (C38166m) obj2, 0, 4, (Object) null);
        }
        return Result.m38701a(obj2);
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super Result<C38166m>> cVar) {
        return ((StoreFacilityRepository$fetchStoreFacilitiesByCoordinates$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}

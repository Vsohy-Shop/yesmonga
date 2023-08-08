package com.carrefour.fid.android.service.data.datastore;

import androidx.datastore.preferences.core.C18602a;
import androidx.datastore.preferences.core.MutablePreferences;
import com.carrefour.fid.android.domain.models.service.models.C38163l;
import com.carrefour.fid.android.domain.models.service.models.StoreService;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlinx.serialization.C12442r;
import kotlinx.serialization.json.C12341a;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.service.data.datastore.ServiceDataStore$setSelectedService$2", mo22502f = "ServiceDataStore.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo22516d2 = {"Landroidx/datastore/preferences/core/MutablePreferences;", "settings", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nServiceDataStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServiceDataStore.kt\ncom/carrefour/fid/android/service/data/datastore/ServiceDataStore$setSelectedService$2\n+ 2 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n+ 3 Serializers.kt\nkotlinx/serialization/SerializersKt__SerializersKt\n+ 4 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n*L\n1#1,79:1\n89#2:80\n89#2:83\n32#3:81\n32#3:84\n80#4:82\n80#4:85\n*S KotlinDebug\n*F\n+ 1 ServiceDataStore.kt\ncom/carrefour/fid/android/service/data/datastore/ServiceDataStore$setSelectedService$2\n*L\n36#1:80\n37#1:83\n36#1:81\n37#1:84\n36#1:82\n37#1:85\n*E\n"})
public final class ServiceDataStore$setSelectedService$2 extends SuspendLambda implements C11304p<MutablePreferences, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C38163l $store;
    final /* synthetic */ StoreService $storeService;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ServiceDataStore this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ServiceDataStore$setSelectedService$2(ServiceDataStore serviceDataStore, C38163l lVar, StoreService storeService, C11045c<? super ServiceDataStore$setSelectedService$2> cVar) {
        super(2, cVar);
        this.this$0 = serviceDataStore;
        this.$store = lVar;
        this.$storeService = storeService;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        ServiceDataStore$setSelectedService$2 serviceDataStore$setSelectedService$2 = new ServiceDataStore$setSelectedService$2(this.this$0, this.$store, this.$storeService, cVar);
        serviceDataStore$setSelectedService$2.L$0 = obj;
        return serviceDataStore$setSelectedService$2;
    }

    @C12580l
    public final Object invoke(@C12579k MutablePreferences mutablePreferences, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ServiceDataStore$setSelectedService$2) create(mutablePreferences, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
            C18602a.C18603a access$getStoreKey$p = this.this$0.storeKey;
            C12341a access$getJson$p = this.this$0.json;
            mutablePreferences.mo53706o(access$getStoreKey$p, access$getJson$p.mo25279d(C12442r.m50317h(access$getJson$p.mo25277a(), C11342l0.m43538A(C38163l.class)), this.$store));
            C18602a.C18603a access$getServiceKey$p = this.this$0.serviceKey;
            C12341a access$getJson$p2 = this.this$0.json;
            mutablePreferences.mo53706o(access$getServiceKey$p, access$getJson$p2.mo25279d(C12442r.m50317h(access$getJson$p2.mo25277a(), C11342l0.m43538A(StoreService.class)), this.$storeService));
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

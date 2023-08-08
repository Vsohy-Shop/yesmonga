package com.carrefour.fid.android.service.data.datastore;

import android.content.Context;
import androidx.datastore.core.C18570d;
import androidx.datastore.core.handlers.C18576b;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.datastore.preferences.core.C18602a;
import androidx.datastore.preferences.core.C18606c;
import androidx.datastore.preferences.core.PreferencesKt;
import com.carrefour.fid.android.domain.models.service.models.C38162k;
import com.carrefour.fid.android.domain.models.service.models.C38163l;
import com.carrefour.fid.android.domain.models.service.models.StoreService;
import com.carrefour.fid.android.service.domain.repositories.ServiceSelectionRepository;
import dagger.hilt.android.qualifiers.C10255b;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference2Impl;
import kotlin.properties.C11427e;
import kotlin.reflect.C11510n;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import kotlinx.serialization.json.C12341a;
import kotlinx.serialization.json.C12412q;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b#\u0010$J#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u0004\u0018\u00010\u0002H@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0004H@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\nJ\u0013\u0010\f\u001a\u00020\u0006H@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH\u0016R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R%\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013*\u00020\u00108BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138BX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\"\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/data/datastore/ServiceDataStore;", "Lcom/carrefour/fid/android/service/domain/repositories/ServiceSelectionRepository$ServicePersistence;", "Lcom/carrefour/fid/android/domain/models/service/models/l;", "store", "Lcom/carrefour/fid/android/domain/models/service/models/StoreService;", "storeService", "Lkotlin/d2;", "setSelectedService", "(Lcom/carrefour/fid/android/domain/models/service/models/l;Lcom/carrefour/fid/android/domain/models/service/models/StoreService;Lkotlin/coroutines/c;)Ljava/lang/Object;", "getStore", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "getStoreService", "clear", "Lkotlinx/coroutines/flow/e;", "Lcom/carrefour/fid/android/domain/models/service/models/k;", "getServiceSelectionFlow", "Landroid/content/Context;", "appContext", "Landroid/content/Context;", "Landroidx/datastore/core/d;", "Landroidx/datastore/preferences/core/a;", "dataStore$delegate", "Lkotlin/properties/e;", "getDataStore", "(Landroid/content/Context;)Landroidx/datastore/core/d;", "dataStore", "Landroidx/datastore/preferences/core/a$a;", "", "storeKey", "Landroidx/datastore/preferences/core/a$a;", "serviceKey", "Lkotlinx/serialization/json/a;", "json", "Lkotlinx/serialization/json/a;", "()Landroidx/datastore/core/d;", "<init>", "(Landroid/content/Context;)V", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nServiceDataStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServiceDataStore.kt\ncom/carrefour/fid/android/service/data/datastore/ServiceDataStore\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,79:1\n53#2:80\n55#2:84\n53#2:85\n55#2:89\n53#2:90\n55#2:94\n50#3:81\n55#3:83\n50#3:86\n55#3:88\n50#3:91\n55#3:93\n106#4:82\n106#4:87\n106#4:92\n*S KotlinDebug\n*F\n+ 1 ServiceDataStore.kt\ncom/carrefour/fid/android/service/data/datastore/ServiceDataStore\n*L\n42#1:80\n42#1:84\n50#1:85\n50#1:89\n64#1:90\n64#1:94\n42#1:81\n42#1:83\n50#1:86\n50#1:88\n64#1:91\n64#1:93\n42#1:82\n50#1:87\n64#1:92\n*E\n"})
public final class ServiceDataStore implements ServiceSelectionRepository.ServicePersistence {
    static final /* synthetic */ C11510n<Object>[] $$delegatedProperties = {C11342l0.m43565v(new PropertyReference2Impl(ServiceDataStore.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};
    @C12579k
    private final Context appContext;
    @C12579k
    private final C11427e dataStore$delegate = PreferenceDataStoreDelegateKt.m84092b("selected_store_service", (C18576b) null, (C11300l) null, (C12074o0) null, 14, (Object) null);
    /* access modifiers changed from: private */
    @C12579k
    public final C12341a json = C12412q.m50212b((C12341a) null, ServiceDataStore$json$1.INSTANCE, 1, (Object) null);
    /* access modifiers changed from: private */
    @C12579k
    public final C18602a.C18603a<String> serviceKey = C18606c.m84364f("selected_service_key");
    /* access modifiers changed from: private */
    @C12579k
    public final C18602a.C18603a<String> storeKey = C18606c.m84364f("selected_store_key");

    @Inject
    public ServiceDataStore(@C10255b @C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, "appContext");
        this.appContext = context;
    }

    private final C18570d<C18602a> getDataStore(Context context) {
        return (C18570d) this.dataStore$delegate.mo22938a(context, $$delegatedProperties[0]);
    }

    @C12580l
    public Object clear(@C12579k C11045c<? super C11079d2> cVar) {
        Object a = PreferencesKt.m84345a(getDataStore(), new ServiceDataStore$clear$2((C11045c<? super ServiceDataStore$clear$2>) null), cVar);
        return a == C11063b.m42612h() ? a : C11079d2.f28267a;
    }

    @C12579k
    public C11907e<C38162k> getServiceSelectionFlow() {
        return new ServiceDataStore$getServiceSelectionFlow$$inlined$map$1(getDataStore().getData(), this);
    }

    @C12580l
    public Object getStore(@C12579k C11045c<? super C38163l> cVar) {
        return C11909g.m47501w0(new ServiceDataStore$getStore$$inlined$map$1(getDataStore().getData(), this), cVar);
    }

    @C12580l
    public Object getStoreService(@C12579k C11045c<? super StoreService> cVar) {
        return C11909g.m47501w0(new ServiceDataStore$getStoreService$$inlined$map$1(getDataStore().getData(), this), cVar);
    }

    @C12580l
    public Object setSelectedService(@C12579k C38163l lVar, @C12579k StoreService storeService, @C12579k C11045c<? super C11079d2> cVar) {
        Object a = PreferencesKt.m84345a(getDataStore(), new ServiceDataStore$setSelectedService$2(this, lVar, storeService, (C11045c<? super ServiceDataStore$setSelectedService$2>) null), cVar);
        return a == C11063b.m42612h() ? a : C11079d2.f28267a;
    }

    private final C18570d<C18602a> getDataStore() {
        return getDataStore(this.appContext);
    }
}

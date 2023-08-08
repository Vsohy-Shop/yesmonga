package com.carrefour.fid.android.service.data.datastore;

import android.content.Context;
import androidx.datastore.core.C18570d;
import androidx.datastore.core.handlers.C18576b;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.datastore.preferences.core.C18602a;
import androidx.datastore.preferences.core.C18606c;
import androidx.datastore.preferences.core.PreferencesKt;
import com.carrefour.fid.android.domain.models.service.models.C38163l;
import com.carrefour.fid.android.service.domain.repositories.PhysicalStoreRepository;
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
import kotlinx.coroutines.flow.C11909g;
import kotlinx.serialization.json.C12341a;
import kotlinx.serialization.json.C12412q;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\r*\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u001b\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/data/datastore/PhysicalStoreDataStore;", "Lcom/carrefour/fid/android/service/domain/repositories/PhysicalStoreRepository$PhysicalStorePersistence;", "Lcom/carrefour/fid/android/domain/models/service/models/l;", "store", "Lkotlin/d2;", "setPhysicalStore", "(Lcom/carrefour/fid/android/domain/models/service/models/l;Lkotlin/coroutines/c;)Ljava/lang/Object;", "getPhysicalStore", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "clear", "Landroid/content/Context;", "appContext", "Landroid/content/Context;", "Landroidx/datastore/core/d;", "Landroidx/datastore/preferences/core/a;", "dataStore$delegate", "Lkotlin/properties/e;", "getDataStore", "(Landroid/content/Context;)Landroidx/datastore/core/d;", "dataStore", "Landroidx/datastore/preferences/core/a$a;", "", "storeKey", "Landroidx/datastore/preferences/core/a$a;", "Lkotlinx/serialization/json/a;", "json", "Lkotlinx/serialization/json/a;", "()Landroidx/datastore/core/d;", "<init>", "(Landroid/content/Context;)V", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nPhysicalStoreDataStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhysicalStoreDataStore.kt\ncom/carrefour/fid/android/service/data/datastore/PhysicalStoreDataStore\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,53:1\n53#2:54\n55#2:58\n50#3:55\n55#3:57\n106#4:56\n*S KotlinDebug\n*F\n+ 1 PhysicalStoreDataStore.kt\ncom/carrefour/fid/android/service/data/datastore/PhysicalStoreDataStore\n*L\n37#1:54\n37#1:58\n37#1:55\n37#1:57\n37#1:56\n*E\n"})
public final class PhysicalStoreDataStore implements PhysicalStoreRepository.PhysicalStorePersistence {
    static final /* synthetic */ C11510n<Object>[] $$delegatedProperties = {C11342l0.m43565v(new PropertyReference2Impl(PhysicalStoreDataStore.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};
    @C12579k
    private final Context appContext;
    @C12579k
    private final C11427e dataStore$delegate = PreferenceDataStoreDelegateKt.m84092b("physical_store_persistence", (C18576b) null, (C11300l) null, (C12074o0) null, 14, (Object) null);
    /* access modifiers changed from: private */
    @C12579k
    public final C12341a json = C12412q.m50212b((C12341a) null, PhysicalStoreDataStore$json$1.INSTANCE, 1, (Object) null);
    /* access modifiers changed from: private */
    @C12579k
    public final C18602a.C18603a<String> storeKey = C18606c.m84364f("selected_physical_store_key");

    @Inject
    public PhysicalStoreDataStore(@C10255b @C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, "appContext");
        this.appContext = context;
    }

    private final C18570d<C18602a> getDataStore(Context context) {
        return (C18570d) this.dataStore$delegate.mo22938a(context, $$delegatedProperties[0]);
    }

    @C12580l
    public Object clear(@C12579k C11045c<? super C11079d2> cVar) {
        Object a = PreferencesKt.m84345a(getDataStore(), new PhysicalStoreDataStore$clear$2((C11045c<? super PhysicalStoreDataStore$clear$2>) null), cVar);
        return a == C11063b.m42612h() ? a : C11079d2.f28267a;
    }

    @C12580l
    public Object getPhysicalStore(@C12579k C11045c<? super C38163l> cVar) {
        return C11909g.m47501w0(new PhysicalStoreDataStore$getPhysicalStore$$inlined$map$1(getDataStore().getData(), this), cVar);
    }

    @C12580l
    public Object setPhysicalStore(@C12579k C38163l lVar, @C12579k C11045c<? super C11079d2> cVar) {
        Object a = PreferencesKt.m84345a(getDataStore(), new PhysicalStoreDataStore$setPhysicalStore$2(this, lVar, (C11045c<? super PhysicalStoreDataStore$setPhysicalStore$2>) null), cVar);
        return a == C11063b.m42612h() ? a : C11079d2.f28267a;
    }

    private final C18570d<C18602a> getDataStore() {
        return getDataStore(this.appContext);
    }
}

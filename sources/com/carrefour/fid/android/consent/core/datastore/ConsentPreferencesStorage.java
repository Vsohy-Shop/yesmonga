package com.carrefour.fid.android.consent.core.datastore;

import android.content.Context;
import androidx.compose.runtime.internal.C8567o;
import androidx.datastore.core.C18570d;
import androidx.datastore.preferences.core.C18602a;
import androidx.datastore.preferences.core.PreferencesKt;
import com.urbanairship.iam.events.C9175a;
import dagger.hilt.android.qualifiers.C10255b;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0007H@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0004R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, mo22516d2 = {"Lcom/carrefour/fid/android/consent/core/datastore/ConsentPreferencesStorage;", "", "Lcom/carrefour/fid/android/consent/core/datastore/ConsentPreferences;", "getConsentPreferences", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "consentSkipDate", "Lkotlin/d2;", "setConsentSkipDate", "(JLkotlin/coroutines/c;)Ljava/lang/Object;", "clearAllConsentPrefs", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Landroidx/datastore/core/d;", "Landroidx/datastore/preferences/core/a;", "dataStore", "Landroidx/datastore/core/d;", "<init>", "(Landroid/content/Context;)V", "consent_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nConsentPreferencesStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConsentPreferencesStorage.kt\ncom/carrefour/fid/android/consent/core/datastore/ConsentPreferencesStorage\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,43:1\n53#2:44\n55#2:48\n50#3:45\n55#3:47\n106#4:46\n*S KotlinDebug\n*F\n+ 1 ConsentPreferencesStorage.kt\ncom/carrefour/fid/android/consent/core/datastore/ConsentPreferencesStorage\n*L\n26#1:44\n26#1:48\n26#1:45\n26#1:47\n26#1:46\n*E\n"})
public final class ConsentPreferencesStorage {
    public static final int $stable = 8;
    @C12579k
    private final Context context;
    @C12579k
    private final C18570d<C18602a> dataStore;

    @Inject
    public ConsentPreferencesStorage(@C10255b @C12579k Context context2) {
        Intrinsics.checkNotNullParameter(context2, C9175a.f24932Y);
        this.context = context2;
        this.dataStore = ConsentPreferencesStorageKt.getDataStore(context2);
    }

    @C12580l
    public final Object clearAllConsentPrefs(@C12579k C11045c<? super C11079d2> cVar) {
        Object a = PreferencesKt.m84345a(this.dataStore, new ConsentPreferencesStorage$clearAllConsentPrefs$2((C11045c<? super ConsentPreferencesStorage$clearAllConsentPrefs$2>) null), cVar);
        return a == C11063b.m42612h() ? a : C11079d2.f28267a;
    }

    @C12580l
    public final Object getConsentPreferences(@C12579k C11045c<? super ConsentPreferences> cVar) {
        return C11909g.m47495u0(new ConsentPreferencesStorage$getConsentPreferences$$inlined$map$1(this.dataStore.getData()), cVar);
    }

    @C12579k
    public final Context getContext() {
        return this.context;
    }

    @C12580l
    public final Object setConsentSkipDate(long j, @C12579k C11045c<? super C11079d2> cVar) {
        Object a = PreferencesKt.m84345a(this.dataStore, new ConsentPreferencesStorage$setConsentSkipDate$2(j, (C11045c<? super ConsentPreferencesStorage$setConsentSkipDate$2>) null), cVar);
        return a == C11063b.m42612h() ? a : C11079d2.f28267a;
    }
}

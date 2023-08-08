package com.carrefour.fid.android.various.data.datastore.datatsource;

import android.content.Context;
import androidx.datastore.core.C18570d;
import androidx.datastore.core.handlers.C18576b;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.datastore.preferences.core.C18602a;
import androidx.datastore.preferences.core.C18606c;
import androidx.datastore.preferences.core.PreferencesKt;
import com.carrefour.fid.android.various.domain.model.AppMessage;
import com.carrefour.fid.android.various.domain.model.AppMessageType;
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

@C11363r0({"SMAP\nAppMessageDataStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppMessageDataStore.kt\ncom/carrefour/fid/android/various/data/datastore/datatsource/AppMessageDataStore\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,82:1\n53#2:83\n55#2:87\n53#2:88\n55#2:92\n50#3:84\n55#3:86\n50#3:89\n55#3:91\n106#4:85\n106#4:90\n*S KotlinDebug\n*F\n+ 1 AppMessageDataStore.kt\ncom/carrefour/fid/android/various/data/datastore/datatsource/AppMessageDataStore\n*L\n42#1:83\n42#1:87\n50#1:88\n50#1:92\n42#1:84\n42#1:86\n50#1:89\n50#1:91\n42#1:85\n50#1:90\n*E\n"})
public final class AppMessageDataStore {

    /* renamed from: f */
    public static final /* synthetic */ C11510n<Object>[] f58278f = {C11342l0.m43565v(new PropertyReference2Impl(AppMessageDataStore.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};
    @C12579k

    /* renamed from: a */
    public final Context f58279a;
    @C12579k

    /* renamed from: b */
    public final C11427e f58280b = PreferenceDataStoreDelegateKt.m84092b(C22764a.f58293a, (C18576b) null, (C11300l) null, (C12074o0) null, 14, (Object) null);
    @C12579k

    /* renamed from: c */
    public final C18602a.C18603a<String> f58281c = C18606c.m84364f(C22764a.f58295c);
    @C12579k

    /* renamed from: d */
    public final C18602a.C18603a<String> f58282d = C18606c.m84364f(C22764a.f58294b);
    @C12579k

    /* renamed from: e */
    public final C12341a f58283e = C12412q.m50212b((C12341a) null, AppMessageDataStore$json$1.f58292f, 1, (Object) null);

    /* renamed from: com.carrefour.fid.android.various.data.datastore.datatsource.AppMessageDataStore$a */
    public /* synthetic */ class C22759a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.carrefour.fid.android.various.domain.model.AppMessageType[] r0 = com.carrefour.fid.android.various.domain.model.AppMessageType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.various.domain.model.AppMessageType r1 = com.carrefour.fid.android.various.domain.model.AppMessageType.BROADCAST     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.various.domain.model.AppMessageType r1 = com.carrefour.fid.android.various.domain.model.AppMessageType.VERSION     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.various.data.datastore.datatsource.AppMessageDataStore.C22759a.<clinit>():void");
        }
    }

    public AppMessageDataStore(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, "appContext");
        this.f58279a = context;
    }

    @C12580l
    /* renamed from: f */
    public final Object mo67157f(@C12579k C11045c<? super AppMessage> cVar) {
        return C11909g.m47501w0(new AppMessageDataStore$getAppBroadcastMessage$$inlined$map$1(mo67159h().getData(), this), cVar);
    }

    @C12580l
    /* renamed from: g */
    public final Object mo67158g(@C12579k C11045c<? super AppMessage> cVar) {
        return C11909g.m47501w0(new AppMessageDataStore$getAppVersionMessage$$inlined$map$1(mo67159h().getData(), this), cVar);
    }

    /* renamed from: h */
    public final C18570d<C18602a> mo67159h() {
        return mo67160i(this.f58279a);
    }

    /* renamed from: i */
    public final C18570d<C18602a> mo67160i(Context context) {
        return (C18570d) this.f58280b.mo22938a(context, f58278f[0]);
    }

    /* renamed from: j */
    public final Object mo67161j(AppMessage appMessage, C11045c<? super C11079d2> cVar) {
        boolean z;
        if (appMessage.getType() == AppMessageType.BROADCAST) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Object a = PreferencesKt.m84345a(mo67159h(), new AppMessageDataStore$saveAppBroadcastMessage$2(this, appMessage, (C11045c<? super AppMessageDataStore$saveAppBroadcastMessage$2>) null), cVar);
            if (a == C11063b.m42612h()) {
                return a;
            }
            return C11079d2.f28267a;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @C12580l
    /* renamed from: k */
    public final Object mo67162k(@C12579k AppMessage appMessage, @C12579k C11045c<? super C11079d2> cVar) {
        int i = C22759a.$EnumSwitchMapping$0[appMessage.getType().ordinal()];
        if (i == 1) {
            Object j = mo67161j(appMessage, cVar);
            if (j == C11063b.m42612h()) {
                return j;
            }
            return C11079d2.f28267a;
        } else if (i != 2) {
            return C11079d2.f28267a;
        } else {
            Object l = mo67163l(appMessage, cVar);
            if (l == C11063b.m42612h()) {
                return l;
            }
            return C11079d2.f28267a;
        }
    }

    /* renamed from: l */
    public final Object mo67163l(AppMessage appMessage, C11045c<? super C11079d2> cVar) {
        boolean z;
        if (appMessage.getType() == AppMessageType.VERSION) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Object a = PreferencesKt.m84345a(mo67159h(), new AppMessageDataStore$saveAppVersionMessage$2(this, appMessage, (C11045c<? super AppMessageDataStore$saveAppVersionMessage$2>) null), cVar);
            if (a == C11063b.m42612h()) {
                return a;
            }
            return C11079d2.f28267a;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}

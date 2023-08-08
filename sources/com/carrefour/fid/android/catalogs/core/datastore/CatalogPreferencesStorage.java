package com.carrefour.fid.android.catalogs.core.datastore;

import android.content.Context;
import androidx.compose.runtime.internal.C8567o;
import androidx.datastore.core.C18570d;
import androidx.datastore.preferences.core.C18602a;
import androidx.datastore.preferences.core.C18606c;
import androidx.datastore.preferences.core.PreferencesKt;
import com.urbanairship.iam.events.C9175a;
import dagger.hilt.android.qualifiers.C10255b;
import javax.inject.Inject;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nCatalogPreferencesStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CatalogPreferencesStorage.kt\ncom/carrefour/fid/android/catalogs/core/datastore/CatalogPreferencesStorage\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,45:1\n53#2:46\n55#2:50\n50#3:47\n55#3:49\n106#4:48\n*S KotlinDebug\n*F\n+ 1 CatalogPreferencesStorage.kt\ncom/carrefour/fid/android/catalogs/core/datastore/CatalogPreferencesStorage\n*L\n32#1:46\n32#1:50\n32#1:47\n32#1:49\n32#1:48\n*E\n"})
public final class CatalogPreferencesStorage {

    /* renamed from: c */
    public static final int f100721c = 8;
    @C12579k

    /* renamed from: a */
    public final Context f100722a;
    @C12579k

    /* renamed from: b */
    public final C18570d<C18602a> f100723b;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.catalogs.core.datastore.CatalogPreferencesStorage$a */
    public static final class C39387a {
        @C12579k

        /* renamed from: a */
        public static final C39387a f100724a = new C39387a();
        @C12579k

        /* renamed from: b */
        public static final C18602a.C18603a<Integer> f100725b = C18606c.m84362d(C39391b.f100733c);

        /* renamed from: c */
        public static final int f100726c = 8;

        @C12579k
        /* renamed from: a */
        public final C18602a.C18603a<Integer> mo130260a() {
            return f100725b;
        }
    }

    @Inject
    public CatalogPreferencesStorage(@C10255b @C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f100722a = context;
        this.f100723b = C39391b.m161423b(context);
    }

    @C12580l
    /* renamed from: a */
    public final Object mo130257a(@C12579k C11045c<? super C39390a> cVar) {
        return C11909g.m47495u0(new CatalogPreferencesStorage$getCatalogPreferences$$inlined$map$1(this.f100723b.getData()), cVar);
    }

    @C12579k
    /* renamed from: b */
    public final Context mo130258b() {
        return this.f100722a;
    }

    @C12580l
    /* renamed from: c */
    public final Object mo130259c(int i, @C12579k C11045c<? super C11079d2> cVar) {
        Object a = PreferencesKt.m84345a(this.f100723b, new CatalogPreferencesStorage$setCatalogLaunchedCount$2(i, (C11045c<? super CatalogPreferencesStorage$setCatalogLaunchedCount$2>) null), cVar);
        return a == C11063b.m42612h() ? a : C11079d2.f28267a;
    }
}

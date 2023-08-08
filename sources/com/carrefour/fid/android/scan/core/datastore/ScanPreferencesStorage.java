package com.carrefour.fid.android.scan.core.datastore;

import android.content.Context;
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

@C11363r0({"SMAP\nScanPreferences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScanPreferences.kt\ncom/carrefour/fid/android/scan/core/datastore/ScanPreferencesStorage\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,52:1\n53#2:53\n55#2:57\n50#3:54\n55#3:56\n106#4:55\n*S KotlinDebug\n*F\n+ 1 ScanPreferences.kt\ncom/carrefour/fid/android/scan/core/datastore/ScanPreferencesStorage\n*L\n37#1:53\n37#1:57\n37#1:54\n37#1:56\n37#1:55\n*E\n"})
public final class ScanPreferencesStorage {
    @C12579k

    /* renamed from: a */
    public final Context f68404a;
    @C12579k

    /* renamed from: b */
    public final C18570d<C18602a> f68405b;

    /* renamed from: com.carrefour.fid.android.scan.core.datastore.ScanPreferencesStorage$a */
    public static final class C28256a {
        @C12579k

        /* renamed from: a */
        public static final C28256a f68406a = new C28256a();
        @C12579k

        /* renamed from: b */
        public static final C18602a.C18603a<Boolean> f68407b = C18606c.m84359a(C28260b.f68414d);

        @C12579k
        /* renamed from: a */
        public final C18602a.C18603a<Boolean> mo82196a() {
            return f68407b;
        }
    }

    @Inject
    public ScanPreferencesStorage(@C10255b @C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f68404a = context;
        this.f68405b = C28260b.m118182b(context);
    }

    @C12579k
    /* renamed from: a */
    public final Context mo82193a() {
        return this.f68404a;
    }

    @C12580l
    /* renamed from: b */
    public final Object mo82194b(@C12579k C11045c<? super C28259a> cVar) {
        return C11909g.m47495u0(new ScanPreferencesStorage$getScanPreferences$$inlined$map$1(this.f68405b.getData()), cVar);
    }

    @C12580l
    /* renamed from: c */
    public final Object mo82195c(boolean z, @C12579k C11045c<? super C11079d2> cVar) {
        Object a = PreferencesKt.m84345a(this.f68405b, new ScanPreferencesStorage$updateScanTutorialVisibility$2(z, (C11045c<? super ScanPreferencesStorage$updateScanTutorialVisibility$2>) null), cVar);
        return a == C11063b.m42612h() ? a : C11079d2.f28267a;
    }
}

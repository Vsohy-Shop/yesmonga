package com.carrefour.fid.android.core.datastore;

import android.content.Context;
import androidx.compose.runtime.internal.C8567o;
import androidx.datastore.core.C18570d;
import androidx.datastore.preferences.core.C18602a;
import androidx.datastore.preferences.core.PreferencesKt;
import com.urbanairship.iam.events.C9175a;
import dagger.hilt.android.qualifiers.C10255b;
import java.util.Set;
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
@C11363r0({"SMAP\nAppPreferencesStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppPreferencesStorage.kt\ncom/carrefour/fid/android/core/datastore/AppPreferencesStorage\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,167:1\n53#2:168\n55#2:172\n50#3:169\n55#3:171\n106#4:170\n*S KotlinDebug\n*F\n+ 1 AppPreferencesStorage.kt\ncom/carrefour/fid/android/core/datastore/AppPreferencesStorage\n*L\n42#1:168\n42#1:172\n42#1:169\n42#1:171\n42#1:170\n*E\n"})
public final class AppPreferencesStorage {

    /* renamed from: c */
    public static final int f89367c = 8;
    @C12579k

    /* renamed from: a */
    public final Context f89368a;
    @C12579k

    /* renamed from: b */
    public final C18570d<C18602a> f89369b;

    @Inject
    public AppPreferencesStorage(@C10255b @C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f89368a = context;
        this.f89369b = C36194b.m148648b(context);
    }

    @C12580l
    /* renamed from: a */
    public final Object mo108078a(@C12579k String str, @C12579k C11045c<? super C11079d2> cVar) {
        Object a = PreferencesKt.m84345a(this.f89369b, new AppPreferencesStorage$addSearchSuggestion$2(str, (C11045c<? super AppPreferencesStorage$addSearchSuggestion$2>) null), cVar);
        return a == C11063b.m42612h() ? a : C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: b */
    public final Object mo108079b(@C12579k C11045c<? super C11079d2> cVar) {
        Object a = PreferencesKt.m84345a(this.f89369b, new AppPreferencesStorage$clearSearchSuggestion$2((C11045c<? super AppPreferencesStorage$clearSearchSuggestion$2>) null), cVar);
        return a == C11063b.m42612h() ? a : C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: c */
    public final Object mo108080c(@C12579k C11045c<? super C36193a> cVar) {
        return C11909g.m47495u0(new AppPreferencesStorage$getAppPreferences$$inlined$map$1(this.f89369b.getData()), cVar);
    }

    @C12579k
    /* renamed from: d */
    public final Context mo108081d() {
        return this.f89368a;
    }

    @C12580l
    /* renamed from: e */
    public final Object mo108082e(@C12579k C11045c<? super C11079d2> cVar) {
        Object a = PreferencesKt.m84345a(this.f89369b, new C36192xea35d910((C11045c<? super C36192xea35d910>) null), cVar);
        return a == C11063b.m42612h() ? a : C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: f */
    public final Object mo108083f(@C12579k C11045c<? super C11079d2> cVar) {
        Object a = PreferencesKt.m84345a(this.f89369b, new AppPreferencesStorage$setCatalogLaunched$2((C11045c<? super AppPreferencesStorage$setCatalogLaunched$2>) null), cVar);
        return a == C11063b.m42612h() ? a : C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: g */
    public final Object mo108084g(@C12579k C11045c<? super C11079d2> cVar) {
        Object a = PreferencesKt.m84345a(this.f89369b, new AppPreferencesStorage$setCouponScanProductBarCodeShown$2((C11045c<? super AppPreferencesStorage$setCouponScanProductBarCodeShown$2>) null), cVar);
        return a == C11063b.m42612h() ? a : C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: h */
    public final Object mo108085h(int i, @C12579k C11045c<? super C11079d2> cVar) {
        Object a = PreferencesKt.m84345a(this.f89369b, new AppPreferencesStorage$setLaunchCount$2(i, (C11045c<? super AppPreferencesStorage$setLaunchCount$2>) null), cVar);
        return a == C11063b.m42612h() ? a : C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: i */
    public final Object mo108086i(@C12579k C11045c<? super C11079d2> cVar) {
        Object a = PreferencesKt.m84345a(this.f89369b, new AppPreferencesStorage$setLaunched$2((C11045c<? super AppPreferencesStorage$setLaunched$2>) null), cVar);
        return a == C11063b.m42612h() ? a : C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: j */
    public final Object mo108087j(@C12579k C11045c<? super C11079d2> cVar) {
        Object a = PreferencesKt.m84345a(this.f89369b, new AppPreferencesStorage$setOnBoardingSplashShown$2((C11045c<? super AppPreferencesStorage$setOnBoardingSplashShown$2>) null), cVar);
        return a == C11063b.m42612h() ? a : C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: k */
    public final Object mo108088k(@C12579k C11045c<? super C11079d2> cVar) {
        Object a = PreferencesKt.m84345a(this.f89369b, new AppPreferencesStorage$setRatingDone$2((C11045c<? super AppPreferencesStorage$setRatingDone$2>) null), cVar);
        return a == C11063b.m42612h() ? a : C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: l */
    public final Object mo108089l(int i, @C12579k C11045c<? super C11079d2> cVar) {
        Object a = PreferencesKt.m84345a(this.f89369b, new AppPreferencesStorage$setRatingLaunchCount$2(i, (C11045c<? super AppPreferencesStorage$setRatingLaunchCount$2>) null), cVar);
        return a == C11063b.m42612h() ? a : C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: m */
    public final Object mo108090m(long j, @C12579k C11045c<? super C11079d2> cVar) {
        Object a = PreferencesKt.m84345a(this.f89369b, new AppPreferencesStorage$setSecurityAlertDisplayAt$2(j, (C11045c<? super AppPreferencesStorage$setSecurityAlertDisplayAt$2>) null), cVar);
        return a == C11063b.m42612h() ? a : C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: n */
    public final Object mo108091n(int i, @C12579k C11045c<? super C11079d2> cVar) {
        Object a = PreferencesKt.m84345a(this.f89369b, new AppPreferencesStorage$setSessionCount$2(i, (C11045c<? super AppPreferencesStorage$setSessionCount$2>) null), cVar);
        return a == C11063b.m42612h() ? a : C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: o */
    public final Object mo108092o(int i, @C12579k C11045c<? super C11079d2> cVar) {
        Object a = PreferencesKt.m84345a(this.f89369b, new AppPreferencesStorage$setStationsLaunchCount$2(i, (C11045c<? super AppPreferencesStorage$setStationsLaunchCount$2>) null), cVar);
        return a == C11063b.m42612h() ? a : C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: p */
    public final Object mo108093p(long j, @C12579k C11045c<? super C11079d2> cVar) {
        Object a = PreferencesKt.m84345a(this.f89369b, new AppPreferencesStorage$setStationsStartDate$2(j, (C11045c<? super AppPreferencesStorage$setStationsStartDate$2>) null), cVar);
        return a == C11063b.m42612h() ? a : C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: q */
    public final Object mo108094q(@C12579k Set<String> set, @C12579k C11045c<? super C11079d2> cVar) {
        Object a = PreferencesKt.m84345a(this.f89369b, new AppPreferencesStorage$updateCheckedList$2(set, (C11045c<? super AppPreferencesStorage$updateCheckedList$2>) null), cVar);
        return a == C11063b.m42612h() ? a : C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: r */
    public final Object mo108095r(@C12579k Set<String> set, @C12579k C11045c<? super C11079d2> cVar) {
        Object a = PreferencesKt.m84345a(this.f89369b, new AppPreferencesStorage$updateSearchList$2(set, (C11045c<? super AppPreferencesStorage$updateSearchList$2>) null), cVar);
        return a == C11063b.m42612h() ? a : C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: s */
    public final Object mo108096s(@C12579k Set<String> set, @C12579k C11045c<? super C11079d2> cVar) {
        Object a = PreferencesKt.m84345a(this.f89369b, new AppPreferencesStorage$updateUncheckedList$2(set, (C11045c<? super AppPreferencesStorage$updateUncheckedList$2>) null), cVar);
        return a == C11063b.m42612h() ? a : C11079d2.f28267a;
    }
}

package com.carrefour.fid.android.analytics.data.analytics;

import java.util.Map;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.analytics.data.analytics.FirebaseAnalyticsDispatcher$sendFirebaseScreenView$1", mo22502f = "FirebaseAnalyticsDispatcher.kt", mo22503i = {0, 1}, mo22504l = {104, 105}, mo22505m = "invokeSuspend", mo22506n = {"analyticsTags", "analyticsTags"}, mo22507s = {"L$0", "L$0"})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nFirebaseAnalyticsDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirebaseAnalyticsDispatcher.kt\ncom/carrefour/fid/android/analytics/data/analytics/FirebaseAnalyticsDispatcher$sendFirebaseScreenView$1\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,230:1\n215#2,2:231\n*S KotlinDebug\n*F\n+ 1 FirebaseAnalyticsDispatcher.kt\ncom/carrefour/fid/android/analytics/data/analytics/FirebaseAnalyticsDispatcher$sendFirebaseScreenView$1\n*L\n103#1:231,2\n*E\n"})
public final class FirebaseAnalyticsDispatcher$sendFirebaseScreenView$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ String $screenClass;
    final /* synthetic */ String $screenName;
    final /* synthetic */ Map<String, Object> $screenParameters;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ FirebaseAnalyticsDispatcher this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FirebaseAnalyticsDispatcher$sendFirebaseScreenView$1(String str, String str2, Map<String, ? extends Object> map, FirebaseAnalyticsDispatcher firebaseAnalyticsDispatcher, C11045c<? super FirebaseAnalyticsDispatcher$sendFirebaseScreenView$1> cVar) {
        super(2, cVar);
        this.$screenClass = str;
        this.$screenName = str2;
        this.$screenParameters = map;
        this.this$0 = firebaseAnalyticsDispatcher;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new FirebaseAnalyticsDispatcher$sendFirebaseScreenView$1(this.$screenClass, this.$screenName, this.$screenParameters, this.this$0, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b0  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r9.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0037
            if (r1 == r3) goto L_0x0027
            if (r1 != r2) goto L_0x001f
            java.lang.Object r0 = r9.L$2
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r9.L$1
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r2 = r9.L$0
            java.util.Map r2 = (java.util.Map) r2
            kotlin.C11661u0.m45747n(r10)
            goto L_0x00a1
        L_0x001f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0027:
            java.lang.Object r1 = r9.L$2
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r3 = r9.L$1
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object r4 = r9.L$0
            java.util.Map r4 = (java.util.Map) r4
            kotlin.C11661u0.m45747n(r10)
            goto L_0x0088
        L_0x0037:
            kotlin.C11661u0.m45747n(r10)
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            java.lang.String r1 = "screen_class"
            java.lang.String r4 = r9.$screenClass
            r10.put(r1, r4)
            java.lang.String r1 = "screen_name"
            java.lang.String r4 = r9.$screenName
            r10.put(r1, r4)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r9.$screenParameters
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0057:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0071
            java.lang.Object r4 = r1.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r4.getValue()
            r10.put(r5, r4)
            goto L_0x0057
        L_0x0071:
            com.carrefour.fid.android.analytics.data.analytics.FirebaseAnalyticsDispatcher r1 = r9.this$0
            r9.L$0 = r10
            r9.L$1 = r10
            java.lang.String r4 = "user_storeIDM"
            r9.L$2 = r4
            r9.label = r3
            java.lang.Object r1 = r1.mo32694s(r9)
            if (r1 != r0) goto L_0x0084
            return r0
        L_0x0084:
            r3 = r10
            r10 = r1
            r1 = r4
            r4 = r3
        L_0x0088:
            r3.put(r1, r10)
            com.carrefour.fid.android.analytics.data.analytics.FirebaseAnalyticsDispatcher r10 = r9.this$0
            r9.L$0 = r4
            r9.L$1 = r4
            java.lang.String r1 = "user_login"
            r9.L$2 = r1
            r9.label = r2
            java.lang.Object r10 = r10.mo32693r(r10, r9)
            if (r10 != r0) goto L_0x009e
            return r0
        L_0x009e:
            r0 = r1
            r1 = r4
            r2 = r1
        L_0x00a1:
            r1.put(r0, r10)
            com.carrefour.fid.android.analytics.data.analytics.FirebaseAnalyticsDispatcher r10 = r9.this$0
            android.content.Context r0 = r10.f33523e
            boolean r10 = r10.mo32689f(r0)
            if (r10 == 0) goto L_0x00d2
            com.carrefour.fid.android.shared.util.i r3 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            com.carrefour.fid.android.analytics.data.analytics.FirebaseAnalyticsDispatcher r10 = r9.this$0
            com.carrefour.fid.android.analytics.data.analytics.FirebaseEventKey r0 = com.carrefour.fid.android.analytics.data.analytics.FirebaseEventKey.SCREEN_VIEW
            java.lang.String r4 = r10.mo32692q(r2, r0)
            r5 = 0
            r6 = 0
            r7 = 6
            r8 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119709p(r3, r4, r5, r6, r7, r8)
            com.carrefour.fid.android.analytics.data.analytics.FirebaseAnalyticsDispatcher r10 = r9.this$0
            android.os.Bundle r10 = r10.mo32690n(r2)
            com.carrefour.fid.android.analytics.data.analytics.FirebaseAnalyticsDispatcher r0 = r9.this$0
            com.google.firebase.analytics.FirebaseAnalytics r0 = r0.f33519a
            java.lang.String r1 = "screen_view"
            r0.mo94632c(r1, r10)
        L_0x00d2:
            kotlin.d2 r10 = kotlin.C11079d2.f28267a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.analytics.data.analytics.FirebaseAnalyticsDispatcher$sendFirebaseScreenView$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((FirebaseAnalyticsDispatcher$sendFirebaseScreenView$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}

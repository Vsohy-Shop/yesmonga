package com.carrefour.fid.android.analytics.data.analytics;

import android.os.Bundle;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.analytics.data.analytics.FirebaseAnalyticsDispatcher$fireEvent$1", mo22502f = "FirebaseAnalyticsDispatcher.kt", mo22503i = {0}, mo22504l = {129, 136}, mo22505m = "invokeSuspend", mo22506n = {"$this$invokeSuspend_u24lambda_u240"}, mo22507s = {"L$2"})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class FirebaseAnalyticsDispatcher$fireEvent$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ String $customEventName;
    final /* synthetic */ FirebaseEventKey $event;
    final /* synthetic */ Bundle $parameters;
    final /* synthetic */ String $screenClass;
    final /* synthetic */ String $screenName;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ FirebaseAnalyticsDispatcher this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FirebaseAnalyticsDispatcher$fireEvent$1(Bundle bundle, FirebaseAnalyticsDispatcher firebaseAnalyticsDispatcher, String str, FirebaseEventKey firebaseEventKey, String str2, String str3, C11045c<? super FirebaseAnalyticsDispatcher$fireEvent$1> cVar) {
        super(2, cVar);
        this.$parameters = bundle;
        this.this$0 = firebaseAnalyticsDispatcher;
        this.$customEventName = str;
        this.$event = firebaseEventKey;
        this.$screenClass = str2;
        this.$screenName = str3;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new FirebaseAnalyticsDispatcher$fireEvent$1(this.$parameters, this.this$0, this.$customEventName, this.$event, this.$screenClass, this.$screenName, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00cd  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r8.label
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0044
            if (r1 == r4) goto L_0x002e
            if (r1 != r2) goto L_0x0026
            java.lang.Object r0 = r8.L$2
            android.os.Bundle r0 = (android.os.Bundle) r0
            java.lang.Object r1 = r8.L$1
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r8.L$0
            android.os.Bundle r2 = (android.os.Bundle) r2
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            goto L_0x00ae
        L_0x0026:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x002e:
            java.lang.Object r1 = r8.L$2
            android.os.Bundle r1 = (android.os.Bundle) r1
            java.lang.Object r5 = r8.L$1
            com.carrefour.fid.android.analytics.data.analytics.FirebaseAnalyticsDispatcher r5 = (com.carrefour.fid.android.analytics.data.analytics.FirebaseAnalyticsDispatcher) r5
            java.lang.Object r6 = r8.L$0
            android.os.Bundle r6 = (android.os.Bundle) r6
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            goto L_0x0071
        L_0x0044:
            kotlin.C11661u0.m45747n(r9)
            android.os.Bundle r6 = r8.$parameters
            java.lang.String r9 = r8.$screenClass
            java.lang.String r1 = r8.$screenName
            com.carrefour.fid.android.analytics.data.analytics.FirebaseAnalyticsDispatcher r5 = r8.this$0
            java.lang.String r7 = "screen_class"
            r6.putString(r7, r9)
            java.lang.String r9 = "screen_name"
            java.lang.String r1 = com.carrefour.fid.android.analytics.data.analytics.firebasemodels.FirebaseModelKt.m58699a(r1)
            r6.putString(r9, r1)
            com.carrefour.fid.android.domain.interactors.service.k r9 = r5.f33522d
            r8.L$0 = r6
            r8.L$1 = r5
            r8.L$2 = r6
            r8.label = r4
            java.lang.Object r9 = r9.m172965invokeIoAF18A(r8)
            if (r9 != r0) goto L_0x0070
            return r0
        L_0x0070:
            r1 = r6
        L_0x0071:
            boolean r7 = kotlin.Result.m38709i(r9)
            if (r7 == 0) goto L_0x0078
            r9 = r3
        L_0x0078:
            com.carrefour.fid.android.domain.models.service.models.k r9 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r9
            if (r9 == 0) goto L_0x008d
            com.carrefour.fid.android.domain.models.service.models.StoreService r9 = r9.mo119354f()
            if (r9 == 0) goto L_0x008d
            java.lang.String r9 = r9.mo119167K()
            if (r9 == 0) goto L_0x008d
            java.lang.String r9 = com.carrefour.fid.android.shared.extension.StringKt.m118908Q(r9)
            goto L_0x008e
        L_0x008d:
            r9 = r3
        L_0x008e:
            if (r9 != 0) goto L_0x0092
            java.lang.String r9 = ""
        L_0x0092:
            java.lang.String r7 = "user_storeIDM"
            r1.putString(r7, r9)
            com.carrefour.fid.android.domain.interactors.account.e r9 = r5.f33521c
            r8.L$0 = r6
            java.lang.String r5 = "user_login"
            r8.L$1 = r5
            r8.L$2 = r1
            r8.label = r2
            java.lang.Object r9 = r9.m172965invokeIoAF18A(r8)
            if (r9 != r0) goto L_0x00ac
            return r0
        L_0x00ac:
            r0 = r1
            r1 = r5
        L_0x00ae:
            boolean r2 = kotlin.Result.m38709i(r9)
            if (r2 == 0) goto L_0x00b5
            goto L_0x00b6
        L_0x00b5:
            r3 = r9
        L_0x00b6:
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r4)
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r9)
            r0.putInt(r1, r9)
            com.carrefour.fid.android.analytics.data.analytics.FirebaseAnalyticsDispatcher r9 = r8.this$0
            android.content.Context r0 = r9.f33523e
            boolean r9 = r9.mo32689f(r0)
            if (r9 == 0) goto L_0x0106
            java.lang.String r9 = r8.$customEventName
            if (r9 != 0) goto L_0x00d7
            com.carrefour.fid.android.analytics.data.analytics.FirebaseEventKey r9 = r8.$event
            java.lang.String r9 = r9.mo32699q()
        L_0x00d7:
            com.carrefour.fid.android.shared.util.i r0 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            android.os.Bundle r1 = r8.$parameters
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Fire analytics name="
            r2.append(r3)
            r2.append(r9)
            java.lang.String r3 = ": "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119709p(r0, r1, r2, r3, r4, r5)
            com.carrefour.fid.android.analytics.data.analytics.FirebaseAnalyticsDispatcher r0 = r8.this$0
            com.google.firebase.analytics.FirebaseAnalytics r0 = r0.f33519a
            android.os.Bundle r1 = r8.$parameters
            r0.mo94632c(r9, r1)
        L_0x0106:
            kotlin.d2 r9 = kotlin.C11079d2.f28267a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.analytics.data.analytics.FirebaseAnalyticsDispatcher$fireEvent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((FirebaseAnalyticsDispatcher$fireEvent$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}

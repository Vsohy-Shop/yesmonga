package com.carrefour.fid.android.utils.initializer;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.utils.initializer.AnalyticsInitializer$initPermanentData$1", mo22502f = "AnalyticsInitializer.kt", mo22503i = {}, mo22504l = {73, 75}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class AnalyticsInitializer$initPermanentData$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    int label;
    final /* synthetic */ AnalyticsInitializer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnalyticsInitializer$initPermanentData$1(AnalyticsInitializer analyticsInitializer, C11045c<? super AnalyticsInitializer$initPermanentData$1> cVar) {
        super(2, cVar);
        this.this$0 = analyticsInitializer;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new AnalyticsInitializer$initPermanentData$1(this.this$0, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0080  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0024
            if (r1 == r3) goto L_0x0020
            if (r1 != r2) goto L_0x0018
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.mo21858l()
            goto L_0x0075
        L_0x0018:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0020:
            kotlin.C11661u0.m45747n(r6)
            goto L_0x0066
        L_0x0024:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.utils.initializer.AnalyticsInitializer r6 = r5.this$0
            java.util.HashMap r6 = r6.f58167a
            com.carrefour.fid.android.utils.initializer.AnalyticsInitializer r1 = r5.this$0
            androidx.core.app.n4 r1 = r1.mo67091m()
            boolean r1 = r1.mo51601a()
            if (r1 == 0) goto L_0x003c
            java.lang.String r1 = "1"
            goto L_0x003e
        L_0x003c:
            java.lang.String r1 = "0"
        L_0x003e:
            java.lang.String r4 = "user_alertsCarrefour"
            r6.put(r4, r1)
            com.carrefour.fid.android.utils.initializer.AnalyticsInitializer r6 = r5.this$0
            java.util.HashMap r6 = r6.f58167a
            java.lang.String r1 = "apps_application_id"
            java.lang.String r4 = "com.carrefour.fid.android"
            r6.put(r1, r4)
            com.carrefour.fid.android.utils.initializer.AnalyticsInitializer r6 = r5.this$0
            java.util.HashMap r6 = r6.f58167a
            java.lang.String r1 = "apps_store_id"
            r6.put(r1, r4)
            com.carrefour.fid.android.utils.initializer.AnalyticsInitializer r6 = r5.this$0
            r5.label = r3
            java.lang.Object r6 = r6.mo67094p(r5)
            if (r6 != r0) goto L_0x0066
            return r0
        L_0x0066:
            com.carrefour.fid.android.utils.initializer.AnalyticsInitializer r6 = r5.this$0
            com.carrefour.fid.android.domain.interactors.service.physicalstore.c r6 = r6.mo67089k()
            r5.label = r2
            java.lang.Object r6 = r6.m172965invokeIoAF18A(r5)
            if (r6 != r0) goto L_0x0075
            return r0
        L_0x0075:
            boolean r0 = kotlin.Result.m38709i(r6)
            if (r0 == 0) goto L_0x007c
            r6 = 0
        L_0x007c:
            com.carrefour.fid.android.domain.models.service.models.l r6 = (com.carrefour.fid.android.domain.models.service.models.C38163l) r6
            if (r6 == 0) goto L_0x0085
            com.carrefour.fid.android.utils.initializer.AnalyticsInitializer r0 = r5.this$0
            r0.mo67093o(r6)
        L_0x0085:
            com.carrefour.fid.android.utils.initializer.AnalyticsInitializer r6 = r5.this$0
            com.carrefour.fid.android.analytics.data.analytics.a r6 = r6.mo67086g()
            com.carrefour.fid.android.utils.initializer.AnalyticsInitializer r0 = r5.this$0
            java.util.HashMap r0 = r0.f58167a
            r6.mo32708k(r0)
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.utils.initializer.AnalyticsInitializer$initPermanentData$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((AnalyticsInitializer$initPermanentData$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}

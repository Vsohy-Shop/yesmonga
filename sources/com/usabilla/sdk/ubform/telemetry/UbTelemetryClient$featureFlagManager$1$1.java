package com.usabilla.sdk.ubform.telemetry;

import com.usabilla.sdk.ubform.sdk.featurebilla.C9950a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.usabilla.sdk.ubform.telemetry.UbTelemetryClient$featureFlagManager$1$1", mo22502f = "UbTelemetryClient.kt", mo22503i = {}, mo22504l = {45, 51}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class UbTelemetryClient$featureFlagManager$1$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C9950a $manager;
    final /* synthetic */ C9950a $value;
    Object L$0;
    int label;
    final /* synthetic */ UbTelemetryClient this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UbTelemetryClient$featureFlagManager$1$1(UbTelemetryClient ubTelemetryClient, C9950a aVar, C9950a aVar2, C11045c<? super UbTelemetryClient$featureFlagManager$1$1> cVar) {
        super(2, cVar);
        this.this$0 = ubTelemetryClient;
        this.$manager = aVar;
        this.$value = aVar2;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new UbTelemetryClient$featureFlagManager$1$1(this.this$0, this.$manager, this.$value, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x008c A[LOOP:0: B:21:0x0086->B:23:0x008c, LOOP_END] */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r11.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0022
            if (r1 == r3) goto L_0x001a
            if (r1 != r2) goto L_0x0012
            kotlin.C11661u0.m45747n(r12)
            goto L_0x007a
        L_0x0012:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x001a:
            java.lang.Object r1 = r11.L$0
            com.usabilla.sdk.ubform.telemetry.UbTelemetryClient r1 = (com.usabilla.sdk.ubform.telemetry.UbTelemetryClient) r1
            kotlin.C11661u0.m45747n(r12)
            goto L_0x0044
        L_0x0022:
            kotlin.C11661u0.m45747n(r12)
            com.usabilla.sdk.ubform.telemetry.UbTelemetryClient r1 = r11.this$0
            com.usabilla.sdk.ubform.sdk.featurebilla.a r4 = r11.$manager
            com.usabilla.sdk.ubform.sdk.form.model.VariableName r5 = com.usabilla.sdk.ubform.sdk.form.model.VariableName.TELEMETRY
            com.usabilla.sdk.ubform.telemetry.TelemetryOption r12 = com.usabilla.sdk.ubform.telemetry.TelemetryOption.NO_TRACKING
            int r12 = r12.mo21522q()
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r12)
            r7 = 0
            r9 = 4
            r10 = 0
            r11.L$0 = r1
            r11.label = r3
            r8 = r11
            java.lang.Object r12 = com.usabilla.sdk.ubform.sdk.featurebilla.C9950a.C9951a.m37528a(r4, r5, r6, r7, r8, r9, r10)
            if (r12 != r0) goto L_0x0044
            return r0
        L_0x0044:
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            r1.mo21534o(r12)
            com.usabilla.sdk.ubform.telemetry.UbTelemetryClient r12 = r11.this$0
            int r12 = r12.mo21532m()
            if (r12 != 0) goto L_0x007a
            com.usabilla.sdk.ubform.telemetry.UbTelemetryClient r12 = r11.this$0
            java.util.ArrayList r12 = r12.mo21531l()
            r12.clear()
            com.usabilla.sdk.ubform.telemetry.UbTelemetryClient r12 = r11.this$0
            com.usabilla.sdk.ubform.db.telemetry.a r12 = r12.mo21523a()
            if (r12 != 0) goto L_0x0067
            goto L_0x007a
        L_0x0067:
            kotlinx.coroutines.flow.e r12 = r12.mo20047a()
            if (r12 != 0) goto L_0x006e
            goto L_0x007a
        L_0x006e:
            r1 = 0
            r11.L$0 = r1
            r11.label = r2
            java.lang.Object r12 = kotlinx.coroutines.flow.C11909g.m47503x(r12, r11)
            if (r12 != r0) goto L_0x007a
            return r0
        L_0x007a:
            com.usabilla.sdk.ubform.telemetry.UbTelemetryClient r12 = r11.this$0
            java.util.ArrayList r12 = r12.mo21531l()
            com.usabilla.sdk.ubform.telemetry.UbTelemetryClient r0 = r11.this$0
            java.util.Iterator r12 = r12.iterator()
        L_0x0086:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x009a
            java.lang.Object r1 = r12.next()
            com.usabilla.sdk.ubform.telemetry.e r1 = (com.usabilla.sdk.ubform.telemetry.C10110e) r1
            int r2 = r0.mo21532m()
            r1.mo21544f(r2)
            goto L_0x0086
        L_0x009a:
            com.usabilla.sdk.ubform.telemetry.UbTelemetryClient r12 = r11.this$0
            com.usabilla.sdk.ubform.sdk.featurebilla.a r0 = r11.$value
            r12.f27762g = r0
            kotlin.d2 r12 = kotlin.C11079d2.f28267a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usabilla.sdk.ubform.telemetry.UbTelemetryClient$featureFlagManager$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((UbTelemetryClient$featureFlagManager$1$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}

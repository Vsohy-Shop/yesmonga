package com.usabilla.sdk.ubform.telemetry;

import com.usabilla.sdk.ubform.p007db.telemetry.C9783a;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.collections.C10978t;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.json.JSONObject;

@C11067d(mo22501c = "com.usabilla.sdk.ubform.telemetry.UbTelemetryClient$storeLogInDb$1", mo22502f = "UbTelemetryClient.kt", mo22503i = {}, mo22504l = {91}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class UbTelemetryClient$storeLogInDb$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C9783a $dao;
    final /* synthetic */ List<JSONObject> $nonEmptyJsons;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UbTelemetryClient$storeLogInDb$1(C9783a aVar, List<? extends JSONObject> list, C11045c<? super UbTelemetryClient$storeLogInDb$1> cVar) {
        super(2, cVar);
        this.$dao = aVar;
        this.$nonEmptyJsons = list;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new UbTelemetryClient$storeLogInDb$1(this.$dao, this.$nonEmptyJsons, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C9783a aVar = this.$dao;
            Iterable<JSONObject> iterable = this.$nonEmptyJsons;
            ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
            for (JSONObject jSONObject : iterable) {
                String jSONObject2 = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "it.toString()");
                arrayList.add(jSONObject2);
            }
            C11907e<Integer> d = aVar.mo20050d(arrayList);
            this.label = 1;
            if (C11909g.m47503x(d, this) == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((UbTelemetryClient$storeLogInDb$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}

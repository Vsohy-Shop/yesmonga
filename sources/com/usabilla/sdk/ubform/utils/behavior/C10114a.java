package com.usabilla.sdk.ubform.utils.behavior;

import com.usabilla.sdk.ubform.bus.Bus;
import com.usabilla.sdk.ubform.bus.BusEvent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.json.JSONObject;

/* renamed from: com.usabilla.sdk.ubform.utils.behavior.a */
public final class C10114a {
    @C12579k

    /* renamed from: a */
    public final C10115b f27827a;
    @C12579k

    /* renamed from: b */
    public final JSONObject f27828b = new JSONObject();

    public C10114a(@C12579k C10115b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "section");
        this.f27827a = bVar;
    }

    @C12579k
    /* renamed from: a */
    public final C10114a mo21558a(@C12579k String str, @C12580l Object obj) {
        Intrinsics.checkNotNullParameter(str, "key");
        JSONObject jSONObject = this.f27828b;
        if (obj == null) {
            obj = JSONObject.NULL;
        }
        jSONObject.put(str, obj);
        return this;
    }

    /* renamed from: b */
    public final void mo21559b() {
        Bus.f26721a.mo19920c(BusEvent.CLIENT_BEHAVIOR, new JSONObject().put(this.f27827a.mo21560a(), this.f27828b));
    }
}

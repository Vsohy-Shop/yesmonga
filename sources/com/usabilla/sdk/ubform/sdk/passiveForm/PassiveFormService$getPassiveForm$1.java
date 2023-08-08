package com.usabilla.sdk.ubform.sdk.passiveForm;

import com.usabilla.sdk.ubform.net.http.C9873j;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.json.JSONObject;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/net/http/j;", "response", "Lorg/json/JSONObject;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class PassiveFormService$getPassiveForm$1 extends Lambda implements C11300l<C9873j, JSONObject> {

    /* renamed from: f */
    public static final PassiveFormService$getPassiveForm$1 f27714f = new PassiveFormService$getPassiveForm$1();

    public PassiveFormService$getPassiveForm$1() {
        super(1);
    }

    @C12579k
    /* renamed from: a */
    public final JSONObject invoke(@C12579k C9873j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "response");
        String body = jVar.getBody();
        Intrinsics.checkNotNull(body);
        return new JSONObject(body);
    }
}

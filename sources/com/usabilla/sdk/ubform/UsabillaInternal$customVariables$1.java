package com.usabilla.sdk.ubform;

import com.usabilla.sdk.ubform.telemetry.C10110e;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C11622t;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/telemetry/e;", "it", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class UsabillaInternal$customVariables$1 extends Lambda implements C11300l<C10110e, C11079d2> {
    final /* synthetic */ ConcurrentMap<String, Object> $value;
    final /* synthetic */ UsabillaInternal this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsabillaInternal$customVariables$1(ConcurrentMap<String, Object> concurrentMap, UsabillaInternal usabillaInternal) {
        super(1);
        this.$value = concurrentMap;
        this.this$0 = usabillaInternal;
    }

    /* renamed from: a */
    public final void mo19885a(@C12579k C10110e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "it");
        for (Map.Entry<String, Object> key : this.$value.entrySet()) {
            String str = (String) key.getKey();
            Intrinsics.checkNotNullExpressionValue(str, "key");
            if (StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) ".", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "$", false, 2, (Object) null) || C11622t.isBlank(str)) {
                Logger.f26647a.logError("Custom variable name should not be 'blank' or contain '.' or '$'");
            }
        }
        UsabillaInternal usabillaInternal = this.this$0;
        ConcurrentMap<String, Object> concurrentMap = this.$value;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : concurrentMap.entrySet()) {
            if (!C11622t.isBlank(next.getValue().toString())) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        usabillaInternal.f26664c = new ConcurrentHashMap(linkedHashMap);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo19885a((C10110e) obj);
        return C11079d2.f28267a;
    }
}

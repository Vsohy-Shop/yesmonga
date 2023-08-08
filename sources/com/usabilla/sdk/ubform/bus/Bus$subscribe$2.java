package com.usabilla.sdk.ubform.bus;

import com.usabilla.sdk.ubform.bus.C9744a;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/bus/a$a;", "it", "", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class Bus$subscribe$2 extends Lambda implements C11300l<C9744a.C9745a<?>, Boolean> {
    final /* synthetic */ BusEvent $event;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Bus$subscribe$2(BusEvent busEvent) {
        super(1);
        this.$event = busEvent;
    }

    /* renamed from: a */
    public final boolean mo19923a(@C12579k C9744a.C9745a<?> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "it");
        if (aVar.mo19927e() == this.$event) {
            return true;
        }
        return false;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(mo19923a((C9744a.C9745a) obj));
    }
}

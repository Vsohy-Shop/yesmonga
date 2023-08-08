package com.carrefour.fid.android.core.network;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.C12351e;
import kotlinx.serialization.modules.C12434e;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Lkotlinx/serialization/json/e;", "Lkotlin/d2;", "invoke", "(Lkotlinx/serialization/json/e;)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class RetrofitFactory$createKotlinxSerializationRetrofit$json$1 extends Lambda implements C11300l<C12351e, C11079d2> {
    final /* synthetic */ C12434e $module;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RetrofitFactory$createKotlinxSerializationRetrofit$json$1(C12434e eVar) {
        super(1);
        this.$module = eVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C12351e) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k C12351e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "$this$Json");
        eVar.mo25353x(true);
        eVar.mo25352w(true);
        eVar.mo25329A(this.$module);
    }
}

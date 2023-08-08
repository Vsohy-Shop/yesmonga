package com.usabilla.sdk.ubform;

import com.usabilla.sdk.ubform.sdk.form.model.UbInternalTheme;
import com.usabilla.sdk.ubform.telemetry.C10110e;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/telemetry/e;", "it", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class UsabillaInternal$theme$1 extends Lambda implements C11300l<C10110e, C11079d2> {
    final /* synthetic */ UbInternalTheme $value;
    final /* synthetic */ UsabillaInternal this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsabillaInternal$theme$1(UsabillaInternal usabillaInternal, UbInternalTheme ubInternalTheme) {
        super(1);
        this.this$0 = usabillaInternal;
        this.$value = ubInternalTheme;
    }

    /* renamed from: a */
    public final void mo19915a(@C12579k C10110e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "it");
        this.this$0.f26667f = this.$value;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo19915a((C10110e) obj);
        return C11079d2.f28267a;
    }
}

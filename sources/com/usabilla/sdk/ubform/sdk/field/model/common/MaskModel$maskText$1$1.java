package com.usabilla.sdk.ubform.sdk.field.model.common;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C11611k;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Lkotlin/text/k;", "it", "", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class MaskModel$maskText$1$1 extends Lambda implements C11300l<C11611k, CharSequence> {
    final /* synthetic */ MaskModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MaskModel$maskText$1$1(MaskModel maskModel) {
        super(1);
        this.this$0 = maskModel;
    }

    @C12579k
    /* renamed from: a */
    public final CharSequence invoke(@C12579k C11611k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "it");
        return C11622t.repeat(String.valueOf(this.this$0.f27493b), kVar.getValue().length());
    }
}

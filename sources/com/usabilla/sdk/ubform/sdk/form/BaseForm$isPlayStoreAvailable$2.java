package com.usabilla.sdk.ubform.sdk.form;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class BaseForm$isPlayStoreAvailable$2 extends Lambda implements C11289a<Boolean> {
    final /* synthetic */ BaseForm this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseForm$isPlayStoreAvailable$2(BaseForm baseForm) {
        super(0);
        this.this$0 = baseForm;
    }

    /* renamed from: a */
    public final boolean mo21154a() {
        return this.this$0.requireArguments().getBoolean(BaseForm.f27617w);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return Boolean.valueOf(mo21154a());
    }
}

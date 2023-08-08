package com.usabilla.sdk.ubform.sdk.field.presenter.common;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003\"\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u0000\"\u0004\b\u0001\u0010\u0002H\n"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/field/model/common/FieldModel;", "M", "V", "", "kotlin.jvm.PlatformType", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class FieldPresenter$fieldTitle$2 extends Lambda implements C11289a<String> {
    final /* synthetic */ FieldPresenter<M, V> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FieldPresenter$fieldTitle$2(FieldPresenter<M, V> fieldPresenter) {
        super(0);
        this.this$0 = fieldPresenter;
    }

    public final String invoke() {
        if (this.this$0.mo20826p().mo20979k()) {
            return Intrinsics.stringPlus(this.this$0.mo20826p().mo20977h(), this.this$0.f27504c);
        }
        return this.this$0.mo20826p().mo20977h();
    }
}

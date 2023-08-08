package com.usabilla.sdk.ubform.sdk.page.presenter;

import com.usabilla.sdk.ubform.sdk.field.model.common.FieldModel;
import com.usabilla.sdk.ubform.sdk.field.view.common.FieldType;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/field/model/common/FieldModel;", "field", "", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class PagePresenter$addNavigationPageButtons$1$textContinueButton$1 extends Lambda implements C11300l<FieldModel<?>, Boolean> {

    /* renamed from: f */
    public static final PagePresenter$addNavigationPageButtons$1$textContinueButton$1 f27676f = new PagePresenter$addNavigationPageButtons$1$textContinueButton$1();

    public PagePresenter$addNavigationPageButtons$1$textContinueButton$1() {
        super(1);
    }

    /* renamed from: a */
    public final boolean mo21430a(@C12579k FieldModel<?> fieldModel) {
        Intrinsics.checkNotNullParameter(fieldModel, "field");
        if (fieldModel.mo20972c() == FieldType.CONTINUE) {
            return true;
        }
        return false;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(mo21430a((FieldModel) obj));
    }
}

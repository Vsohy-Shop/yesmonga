package com.usabilla.sdk.ubform.sdk.field.presenter;

import com.usabilla.sdk.ubform.sdk.field.contract.C9961c;
import com.usabilla.sdk.ubform.sdk.field.model.HeaderModel;
import com.usabilla.sdk.ubform.sdk.field.presenter.common.FieldPresenter;
import com.usabilla.sdk.ubform.sdk.page.contract.C10061a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.usabilla.sdk.ubform.sdk.field.presenter.c */
public final class C10015c extends FieldPresenter<HeaderModel, String> implements C9961c.C9962a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10015c(@C12579k HeaderModel headerModel, @C12579k C10061a.C10062a aVar) {
        super(headerModel, aVar);
        Intrinsics.checkNotNullParameter(headerModel, "fieldModel");
        Intrinsics.checkNotNullParameter(aVar, "headerPresenter");
    }

    @C12579k
    /* renamed from: H */
    public String mo20821H() {
        Object d = ((HeaderModel) mo20826p()).mo20973d();
        Intrinsics.checkNotNullExpressionValue(d, "fieldModel.fieldValue");
        return (String) d;
    }

    /* renamed from: i0 */
    public void mo20824R(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "newValue");
    }
}

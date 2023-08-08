package com.usabilla.sdk.ubform.sdk.field.presenter;

import com.usabilla.sdk.ubform.sdk.field.contract.C9955a;
import com.usabilla.sdk.ubform.sdk.field.model.CheckboxModel;
import com.usabilla.sdk.ubform.sdk.field.model.common.Option;
import com.usabilla.sdk.ubform.sdk.field.presenter.common.FieldPresenter;
import com.usabilla.sdk.ubform.sdk.page.contract.C10061a;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.usabilla.sdk.ubform.sdk.field.presenter.a */
public final class C10013a extends FieldPresenter<CheckboxModel, List<? extends String>> implements C9955a.C9956a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10013a(@C12579k CheckboxModel checkboxModel, @C12579k C10061a.C10062a aVar) {
        super(checkboxModel, aVar);
        Intrinsics.checkNotNullParameter(checkboxModel, "fieldModel");
        Intrinsics.checkNotNullParameter(aVar, "pagePresenter");
    }

    @C12579k
    /* renamed from: d */
    public List<String> mo20816d() {
        Object d = ((CheckboxModel) mo20826p()).mo20973d();
        Intrinsics.checkNotNullExpressionValue(d, "fieldModel.fieldValue");
        return (List) d;
    }

    @C12579k
    public List<Option> getOptions() {
        List<Option> x = ((CheckboxModel) mo20826p()).mo20953x();
        Intrinsics.checkNotNullExpressionValue(x, "fieldModel.options");
        return x;
    }

    /* renamed from: i0 */
    public void mo20824R(@C12579k List<String> list) {
        Intrinsics.checkNotNullParameter(list, "newValue");
        ((CheckboxModel) mo20826p()).mo20983q(list);
        C10061a.C10062a g0 = mo21027g0();
        String e = ((CheckboxModel) mo20826p()).mo20974e();
        Intrinsics.checkNotNullExpressionValue(e, "fieldModel.id");
        g0.mo20735w(e, list);
    }
}

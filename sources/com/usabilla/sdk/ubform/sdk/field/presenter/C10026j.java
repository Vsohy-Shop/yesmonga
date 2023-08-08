package com.usabilla.sdk.ubform.sdk.field.presenter;

import com.usabilla.sdk.ubform.sdk.field.contract.C9989k;
import com.usabilla.sdk.ubform.sdk.field.model.TextBoxModel;
import com.usabilla.sdk.ubform.sdk.field.presenter.common.FieldPresenter;
import com.usabilla.sdk.ubform.sdk.page.contract.C10061a;
import kotlin.collections.C10976s;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.usabilla.sdk.ubform.sdk.field.presenter.j */
public final class C10026j extends FieldPresenter<TextBoxModel, String> implements C9989k.C9990a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10026j(@C12579k TextBoxModel textBoxModel, @C12579k C10061a.C10062a aVar) {
        super(textBoxModel, aVar);
        Intrinsics.checkNotNullParameter(textBoxModel, "fieldModel");
        Intrinsics.checkNotNullParameter(aVar, "pagePresenter");
    }

    @C12580l
    /* renamed from: f */
    public String mo20869f() {
        return ((TextBoxModel) mo20826p()).mo20936x();
    }

    /* renamed from: g */
    public boolean mo20870g() {
        return ((TextBoxModel) mo20826p()).mo20885j();
    }

    /* renamed from: i0 */
    public void mo20824R(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "newValue");
        ((TextBoxModel) mo20826p()).mo20983q(str);
        C10061a.C10062a g0 = mo21027g0();
        String e = ((TextBoxModel) mo20826p()).mo20974e();
        Intrinsics.checkNotNullExpressionValue(e, "fieldModel.id");
        g0.mo20735w(e, C10976s.m41419k(str));
    }

    @C12580l
    /* renamed from: t */
    public String mo20871t() {
        return (String) ((TextBoxModel) mo20826p()).mo20973d();
    }
}

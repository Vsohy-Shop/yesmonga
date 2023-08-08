package com.usabilla.sdk.ubform.sdk.field.presenter;

import com.usabilla.sdk.ubform.sdk.field.contract.C9958b;
import com.usabilla.sdk.ubform.sdk.field.model.EmailModel;
import com.usabilla.sdk.ubform.sdk.field.presenter.common.FieldPresenter;
import com.usabilla.sdk.ubform.sdk.page.contract.C10061a;
import kotlin.collections.C10976s;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.usabilla.sdk.ubform.sdk.field.presenter.b */
public final class C10014b extends FieldPresenter<EmailModel, String> implements C9958b.C9959a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10014b(@C12579k EmailModel emailModel, @C12579k C10061a.C10062a aVar) {
        super(emailModel, aVar);
        Intrinsics.checkNotNullParameter(emailModel, "fieldModel");
        Intrinsics.checkNotNullParameter(aVar, "pagePresenter");
    }

    @C12580l
    /* renamed from: F */
    public String mo20818F() {
        return (String) ((EmailModel) mo20826p()).mo20973d();
    }

    @C12580l
    /* renamed from: f */
    public String mo20819f() {
        return ((EmailModel) mo20826p()).mo20886x();
    }

    /* renamed from: g */
    public boolean mo20820g() {
        return ((EmailModel) mo20826p()).mo20885j();
    }

    /* renamed from: i0 */
    public void mo20824R(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "newValue");
        ((EmailModel) mo20826p()).mo20983q(str);
        C10061a.C10062a g0 = mo21027g0();
        String e = ((EmailModel) mo20826p()).mo20974e();
        Intrinsics.checkNotNullExpressionValue(e, "fieldModel.id");
        g0.mo20735w(e, C10976s.m41419k(str));
    }
}

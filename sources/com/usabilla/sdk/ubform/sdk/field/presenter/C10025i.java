package com.usabilla.sdk.ubform.sdk.field.presenter;

import com.usabilla.sdk.ubform.sdk.field.contract.C9986j;
import com.usabilla.sdk.ubform.sdk.field.model.StarModel;
import com.usabilla.sdk.ubform.sdk.field.presenter.common.FieldPresenter;
import com.usabilla.sdk.ubform.sdk.page.contract.C10061a;
import kotlin.collections.C10976s;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.usabilla.sdk.ubform.sdk.field.presenter.i */
public final class C10025i extends FieldPresenter<StarModel, Integer> implements C9986j.C9987a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10025i(@C12579k StarModel starModel, @C12579k C10061a.C10062a aVar) {
        super(starModel, aVar);
        Intrinsics.checkNotNullParameter(starModel, "fieldModel");
        Intrinsics.checkNotNullParameter(aVar, "pagePresenter");
    }

    /* renamed from: R */
    public /* bridge */ /* synthetic */ void mo20824R(Object obj) {
        mo21037i0(((Number) obj).intValue());
    }

    /* renamed from: d */
    public int mo20868d() {
        Object d = ((StarModel) mo20826p()).mo20973d();
        Intrinsics.checkNotNullExpressionValue(d, "fieldModel.fieldValue");
        return ((Number) d).intValue();
    }

    /* renamed from: i0 */
    public void mo21037i0(int i) {
        if (i < 1) {
            ((StarModel) mo20826p()).mo20983q(1);
            return;
        }
        ((StarModel) mo20826p()).mo20983q(Integer.valueOf(i));
        C10061a.C10062a g0 = mo21027g0();
        String e = ((StarModel) mo20826p()).mo20974e();
        Intrinsics.checkNotNullExpressionValue(e, "fieldModel.id");
        g0.mo20735w(e, C10976s.m41419k(String.valueOf(i)));
    }
}

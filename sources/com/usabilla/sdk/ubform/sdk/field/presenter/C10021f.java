package com.usabilla.sdk.ubform.sdk.field.presenter;

import com.usabilla.sdk.ubform.sdk.field.contract.C9977g;
import com.usabilla.sdk.ubform.sdk.field.model.RadioModel;
import com.usabilla.sdk.ubform.sdk.field.model.common.Option;
import com.usabilla.sdk.ubform.sdk.field.presenter.common.FieldPresenter;
import com.usabilla.sdk.ubform.sdk.page.contract.C10061a;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.usabilla.sdk.ubform.sdk.field.presenter.f */
public final class C10021f extends FieldPresenter<RadioModel, String> implements C9977g.C9978a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10021f(@C12579k RadioModel radioModel, @C12579k C10061a.C10062a aVar) {
        super(radioModel, aVar);
        Intrinsics.checkNotNullParameter(radioModel, "fieldModel");
        Intrinsics.checkNotNullParameter(aVar, "pagePresenter");
    }

    /* renamed from: D */
    public int mo20854D() {
        List<Option> x = ((RadioModel) mo20826p()).mo20953x();
        Intrinsics.checkNotNullExpressionValue(x, "fieldModel.options");
        int i = 0;
        for (Option b : x) {
            if (Intrinsics.areEqual((Object) b.mo21006b(), ((RadioModel) mo20826p()).mo20973d())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @C12579k
    public List<Option> getOptions() {
        List<Option> x = ((RadioModel) mo20826p()).mo20953x();
        Intrinsics.checkNotNullExpressionValue(x, "fieldModel.options");
        return x;
    }

    /* renamed from: i0 */
    public void mo20824R(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "value");
        ((RadioModel) mo20826p()).mo20983q(str);
        C10061a.C10062a g0 = mo21027g0();
        String e = ((RadioModel) mo20826p()).mo20974e();
        Intrinsics.checkNotNullExpressionValue(e, "fieldModel.id");
        g0.mo20735w(e, CollectionsKt__CollectionsKt.m40463r(str));
    }
}

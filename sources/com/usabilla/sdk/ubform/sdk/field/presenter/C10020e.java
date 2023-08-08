package com.usabilla.sdk.ubform.sdk.field.presenter;

import com.usabilla.sdk.ubform.sdk.field.contract.C9974f;
import com.usabilla.sdk.ubform.sdk.field.model.PickerModel;
import com.usabilla.sdk.ubform.sdk.field.model.common.Option;
import com.usabilla.sdk.ubform.sdk.field.presenter.common.FieldPresenter;
import com.usabilla.sdk.ubform.sdk.page.contract.C10061a;
import java.util.List;
import kotlin.collections.C10976s;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.usabilla.sdk.ubform.sdk.field.presenter.e */
public final class C10020e extends FieldPresenter<PickerModel, Integer> implements C9974f.C9975a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10020e(@C12579k PickerModel pickerModel, @C12579k C10061a.C10062a aVar) {
        super(pickerModel, aVar);
        Intrinsics.checkNotNullParameter(pickerModel, "fieldModel");
        Intrinsics.checkNotNullParameter(aVar, "pagePresenter");
    }

    @C12579k
    /* renamed from: M */
    public String mo20849M() {
        String B = ((PickerModel) mo20826p()).mo20907B();
        Intrinsics.checkNotNullExpressionValue(B, "fieldModel.emptyValue");
        return B;
    }

    /* renamed from: R */
    public /* bridge */ /* synthetic */ void mo20824R(Object obj) {
        mo21031i0(((Number) obj).intValue());
    }

    @C12579k
    /* renamed from: U */
    public String mo20850U() {
        String A = ((PickerModel) mo20826p()).mo20906A();
        if (A != null) {
            for (Option next : ((PickerModel) mo20826p()).mo20953x()) {
                if (Intrinsics.areEqual((Object) next.mo21006b(), (Object) A)) {
                    String a = next.mo21005a();
                    Intrinsics.checkNotNullExpressionValue(a, "option.title");
                    return a;
                }
            }
        }
        String B = ((PickerModel) mo20826p()).mo20907B();
        Intrinsics.checkNotNullExpressionValue(B, "fieldModel.emptyValue");
        return B;
    }

    /* renamed from: W */
    public int mo20851W() {
        Object d = ((PickerModel) mo20826p()).mo20973d();
        Intrinsics.checkNotNullExpressionValue(d, "fieldModel.fieldValue");
        return ((Number) d).intValue();
    }

    /* renamed from: b0 */
    public int mo20852b0() {
        String A = ((PickerModel) mo20826p()).mo20906A();
        List<Option> x = ((PickerModel) mo20826p()).mo20953x();
        int size = x.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (Intrinsics.areEqual((Object) x.get(i).mo21006b(), (Object) A)) {
                    return i2;
                }
                if (i2 > size) {
                    break;
                }
                i = i2;
            }
        }
        return 0;
    }

    @C12579k
    public List<Option> getOptions() {
        List<Option> x = ((PickerModel) mo20826p()).mo20953x();
        Intrinsics.checkNotNullExpressionValue(x, "fieldModel.options");
        return x;
    }

    /* renamed from: i0 */
    public void mo21031i0(int i) {
        String str;
        ((PickerModel) mo20826p()).mo20983q(Integer.valueOf(i));
        boolean z = false;
        if (1 <= i && i <= ((PickerModel) mo20826p()).mo20953x().size()) {
            z = true;
        }
        if (z) {
            str = ((PickerModel) mo20826p()).mo20953x().get(i - 1).mo21006b();
            Intrinsics.checkNotNullExpressionValue(str, "fieldModel.options[pickerIndex - 1].value");
        } else {
            str = "";
        }
        C10061a.C10062a g0 = mo21027g0();
        String e = ((PickerModel) mo20826p()).mo20974e();
        Intrinsics.checkNotNullExpressionValue(e, "fieldModel.id");
        g0.mo20735w(e, C10976s.m41419k(str));
    }
}

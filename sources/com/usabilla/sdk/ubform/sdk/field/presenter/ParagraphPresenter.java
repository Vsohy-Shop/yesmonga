package com.usabilla.sdk.ubform.sdk.field.presenter;

import com.android.volley.C21764n;
import com.usabilla.sdk.ubform.sdk.field.contract.C9971e;
import com.usabilla.sdk.ubform.sdk.field.model.ParagraphModel;
import com.usabilla.sdk.ubform.sdk.field.presenter.common.FieldPresenter;
import com.usabilla.sdk.ubform.sdk.page.contract.C10061a;
import kotlin.C10864b0;
import kotlin.C11677z;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class ParagraphPresenter extends FieldPresenter<ParagraphModel, String> implements C9971e.C9972a {
    @C12579k

    /* renamed from: f */
    public final C11677z f27500f = C10864b0.m38748c(ParagraphPresenter$requestQueue$2.f27501f);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ParagraphPresenter(@C12579k ParagraphModel paragraphModel, @C12579k C10061a.C10062a aVar) {
        super(paragraphModel, aVar);
        Intrinsics.checkNotNullParameter(paragraphModel, "fieldModel");
        Intrinsics.checkNotNullParameter(aVar, "pagePresenter");
    }

    /* renamed from: i0 */
    public void mo20824R(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "newValue");
    }

    /* renamed from: j0 */
    public final C21764n mo21018j0() {
        return (C21764n) this.f27500f.getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        if (r1 != false) goto L_0x0028;
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo20469u() {
        /*
            r5 = this;
            super.mo20469u()
            com.usabilla.sdk.ubform.sdk.field.view.common.FieldView r0 = r5.mo20825j()
            if (r0 == 0) goto L_0x006d
            com.usabilla.sdk.ubform.sdk.field.contract.e$b r0 = (com.usabilla.sdk.ubform.sdk.field.contract.C9971e.C9973b) r0
            com.usabilla.sdk.ubform.sdk.field.model.common.FieldModel r1 = r5.mo20826p()
            com.usabilla.sdk.ubform.sdk.field.model.ParagraphModel r1 = (com.usabilla.sdk.ubform.sdk.field.model.ParagraphModel) r1
            com.usabilla.sdk.ubform.sdk.field.view.common.FieldType r1 = r1.mo20972c()
            com.usabilla.sdk.ubform.sdk.field.view.common.FieldType r2 = com.usabilla.sdk.ubform.sdk.field.view.common.FieldType.PARAGRAPH
            if (r1 == r2) goto L_0x0028
            java.lang.String r1 = r5.mo20828s()
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0025
            r1 = 1
            goto L_0x0026
        L_0x0025:
            r1 = 0
        L_0x0026:
            if (r1 == 0) goto L_0x002b
        L_0x0028:
            r0.mo20845h()
        L_0x002b:
            com.usabilla.sdk.ubform.sdk.field.model.common.FieldModel r1 = r5.mo20826p()
            com.usabilla.sdk.ubform.sdk.field.model.ParagraphModel r1 = (com.usabilla.sdk.ubform.sdk.field.model.ParagraphModel) r1
            boolean r1 = r1.mo20901x()
            java.lang.String r2 = "fieldModel.fieldValue"
            if (r1 == 0) goto L_0x005a
            com.usabilla.sdk.ubform.sdk.field.model.common.FieldModel r1 = r5.mo20826p()
            com.usabilla.sdk.ubform.sdk.field.model.ParagraphModel r1 = (com.usabilla.sdk.ubform.sdk.field.model.ParagraphModel) r1
            java.lang.Object r1 = r1.mo20973d()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.String r1 = (java.lang.String) r1
            com.usabilla.sdk.ubform.utils.l r2 = new com.usabilla.sdk.ubform.utils.l
            com.android.volley.n r3 = r5.mo21018j0()
            com.usabilla.sdk.ubform.sdk.field.presenter.ParagraphPresenter$populateView$1 r4 = new com.usabilla.sdk.ubform.sdk.field.presenter.ParagraphPresenter$populateView$1
            r4.<init>(r0)
            r2.<init>(r3, r4)
            r0.setHtmlText(r1, r2)
            goto L_0x006c
        L_0x005a:
            com.usabilla.sdk.ubform.sdk.field.model.common.FieldModel r1 = r5.mo20826p()
            com.usabilla.sdk.ubform.sdk.field.model.ParagraphModel r1 = (com.usabilla.sdk.ubform.sdk.field.model.ParagraphModel) r1
            java.lang.Object r1 = r1.mo20973d()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.String r1 = (java.lang.String) r1
            r0.setParagraphText(r1)
        L_0x006c:
            return
        L_0x006d:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type com.usabilla.sdk.ubform.sdk.field.contract.ParagraphContract.View"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usabilla.sdk.ubform.sdk.field.presenter.ParagraphPresenter.mo20469u():void");
    }
}

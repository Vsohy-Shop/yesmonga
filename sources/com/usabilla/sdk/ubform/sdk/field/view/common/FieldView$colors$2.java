package com.usabilla.sdk.ubform.sdk.field.view.common;

import com.usabilla.sdk.ubform.sdk.form.model.UbColors;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0010\b\u0000\u0010\u0001*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0000H\n"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/field/presenter/common/FieldPresenter;", "P", "Lcom/usabilla/sdk/ubform/sdk/form/model/UbColors;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class FieldView$colors$2 extends Lambda implements C11289a<UbColors> {
    final /* synthetic */ FieldView<P> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FieldView$colors$2(FieldView<P> fieldView) {
        super(0);
        this.this$0 = fieldView;
    }

    @C12579k
    /* renamed from: a */
    public final UbColors invoke() {
        return this.this$0.getTheme$ubform_sdkRelease().getColors();
    }
}

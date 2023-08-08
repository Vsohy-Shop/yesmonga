package com.usabilla.sdk.ubform.sdk.field.view;

import com.usabilla.sdk.ubform.sdk.field.view.PickerView;
import com.usabilla.sdk.ubform.sdk.form.model.UbInternalTheme;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/field/view/PickerView$a;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class PickerView$dataAdapter$2 extends Lambda implements C11289a<PickerView.C10028a> {
    final /* synthetic */ PickerView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PickerView$dataAdapter$2(PickerView pickerView) {
        super(0);
        this.this$0 = pickerView;
    }

    @C12579k
    /* renamed from: a */
    public final PickerView.C10028a invoke() {
        UbInternalTheme theme$ubform_sdkRelease = this.this$0.getTheme$ubform_sdkRelease();
        Intrinsics.checkNotNullExpressionValue(theme$ubform_sdkRelease, C10108c.f27794S);
        return new PickerView.C10028a(theme$ubform_sdkRelease, this.this$0.getItems());
    }
}

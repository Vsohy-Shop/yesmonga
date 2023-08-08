package com.usabilla.sdk.ubform.sdk.field.view;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.widget.LinearLayout;
import com.usabilla.sdk.ubform.C9747c;
import com.usabilla.sdk.ubform.customViews.UbSpinner;
import com.usabilla.sdk.ubform.sdk.form.model.UbInternalTheme;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/customViews/UbSpinner;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class PickerView$spinner$2 extends Lambda implements C11289a<UbSpinner> {
    final /* synthetic */ Context $context;
    final /* synthetic */ PickerView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PickerView$spinner$2(Context context, PickerView pickerView) {
        super(0);
        this.$context = context;
        this.this$0 = pickerView;
    }

    @C12579k
    /* renamed from: a */
    public final UbSpinner invoke() {
        UbSpinner ubSpinner = new UbSpinner(this.$context, PickerView.m37832p(this.this$0));
        PickerView pickerView = this.this$0;
        Context context = this.$context;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int dimensionPixelOffset = ubSpinner.getResources().getDimensionPixelOffset(C9747c.C9754g.ub_element_picker_padding);
        ubSpinner.setPadding(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        C11079d2 d2Var = C11079d2.f28267a;
        ubSpinner.setLayoutParams(layoutParams);
        ubSpinner.setHint(PickerView.m37832p(pickerView).mo20850U());
        UbInternalTheme theme$ubform_sdkRelease = pickerView.getTheme$ubform_sdkRelease();
        Intrinsics.checkNotNullExpressionValue(theme$ubform_sdkRelease, C10108c.f27794S);
        ubSpinner.setBackground(pickerView.mo21058f(theme$ubform_sdkRelease, context));
        ubSpinner.setDropDownVerticalOffset(ubSpinner.getResources().getDimensionPixelOffset(C9747c.C9754g.ub_element_picker_dropdown_offset));
        ubSpinner.setTypeface(pickerView.getTheme$ubform_sdkRelease().getTypefaceRegular());
        ubSpinner.setDropDownBackgroundDrawable(new ColorDrawable(pickerView.getColors().getCard()));
        ubSpinner.setTextColor(pickerView.getColors().getText());
        ubSpinner.setHintTextColor(pickerView.getColors().getHint());
        ubSpinner.setAdapter(pickerView.getDataAdapter());
        return ubSpinner;
    }
}

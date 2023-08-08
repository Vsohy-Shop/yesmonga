package com.usabilla.sdk.ubform.sdk.field.view.common;

import android.content.Context;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.usabilla.sdk.ubform.C9747c;
import com.usabilla.sdk.ubform.sdk.form.model.UbInternalTheme;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import com.usabilla.sdk.ubform.utils.ext.ExtensionViewKt;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0012\b\u0000\u0010\u0002*\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/field/presenter/common/FieldPresenter;", "", "P", "Landroid/widget/EditText;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class FieldTextView$textBox$2 extends Lambda implements C11289a<EditText> {
    final /* synthetic */ Context $context;
    final /* synthetic */ FieldTextView<P> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FieldTextView$textBox$2(Context context, FieldTextView<P> fieldTextView) {
        super(0);
        this.$context = context;
        this.this$0 = fieldTextView;
    }

    @C12579k
    /* renamed from: a */
    public final EditText invoke() {
        EditText editText = new EditText(this.$context);
        Context context = this.$context;
        FieldTextView<P> fieldTextView = this.this$0;
        editText.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C9747c.C9754g.ub_element_text_area_text_padding);
        editText.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        editText.setHintTextColor(fieldTextView.getColors().getHint());
        editText.setTextColor(fieldTextView.getColors().getText());
        ExtensionViewKt.m38319c(editText, context, fieldTextView.getColors().getAccent());
        UbInternalTheme theme$ubform_sdkRelease = fieldTextView.getTheme$ubform_sdkRelease();
        Intrinsics.checkNotNullExpressionValue(theme$ubform_sdkRelease, C10108c.f27794S);
        editText.setBackground(fieldTextView.mo21058f(theme$ubform_sdkRelease, context));
        editText.setGravity(16);
        editText.setTextSize((float) fieldTextView.getTheme$ubform_sdkRelease().getFonts().getTextSize());
        editText.setTypeface(fieldTextView.getTheme$ubform_sdkRelease().getTypefaceRegular());
        return editText;
    }
}

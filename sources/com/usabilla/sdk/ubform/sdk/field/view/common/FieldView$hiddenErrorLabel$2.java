package com.usabilla.sdk.ubform.sdk.field.view.common;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.usabilla.sdk.ubform.C9747c;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0010\b\u0000\u0010\u0001*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0000H\n"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/field/presenter/common/FieldPresenter;", "P", "Landroid/widget/TextView;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class FieldView$hiddenErrorLabel$2 extends Lambda implements C11289a<TextView> {
    final /* synthetic */ Context $context;
    final /* synthetic */ FieldView<P> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FieldView$hiddenErrorLabel$2(Context context, FieldView<P> fieldView) {
        super(0);
        this.$context = context;
        this.this$0 = fieldView;
    }

    @C12579k
    /* renamed from: a */
    public final TextView invoke() {
        TextView textView = new TextView(this.$context);
        FieldView<P> fieldView = this.this$0;
        Context context = this.$context;
        LinearLayout.LayoutParams k = fieldView.getParametersMatchWrap();
        k.bottomMargin = context.getResources().getDimensionPixelSize(C9747c.C9754g.ub_form_padding);
        textView.setLayoutParams(k);
        textView.setTextSize((float) fieldView.getTheme$ubform_sdkRelease().getFonts().getMiniSize());
        textView.setTextColor(fieldView.getColors().getError());
        textView.setTypeface(fieldView.getTheme$ubform_sdkRelease().getTypefaceRegular());
        textView.setText(context.getResources().getString(C9747c.C9761n.ub_field_error));
        textView.setVisibility(8);
        return textView;
    }
}

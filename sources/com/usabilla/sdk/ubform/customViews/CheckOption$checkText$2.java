package com.usabilla.sdk.ubform.customViews;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.usabilla.sdk.ubform.C9747c;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Landroid/widget/TextView;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class CheckOption$checkText$2 extends Lambda implements C11289a<TextView> {
    final /* synthetic */ Context $context;
    final /* synthetic */ CheckOption this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckOption$checkText$2(Context context, CheckOption checkOption) {
        super(0);
        this.$context = context;
        this.this$0 = checkOption;
    }

    @C12579k
    /* renamed from: a */
    public final TextView invoke() {
        TextView textView = new TextView(this.$context);
        CheckOption checkOption = this.this$0;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        textView.setPadding(textView.getResources().getDimensionPixelSize(C9747c.C9754g.ub_element_checkbox_text_left_padding), 0, 0, 0);
        C11079d2 d2Var = C11079d2.f28267a;
        textView.setLayoutParams(layoutParams);
        textView.setTextSize(textView.getTextSize());
        textView.setOnClickListener(checkOption);
        return textView;
    }
}

package com.usabilla.sdk.ubform.sdk.field.view;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.usabilla.sdk.ubform.C9747c;
import com.usabilla.sdk.ubform.sdk.field.presenter.C10023h;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Landroid/widget/TextView;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class SliderView$resultLabel$2 extends Lambda implements C11289a<TextView> {
    final /* synthetic */ Context $context;
    final /* synthetic */ SliderView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderView$resultLabel$2(Context context, SliderView sliderView) {
        super(0);
        this.$context = context;
        this.this$0 = sliderView;
    }

    @C12579k
    /* renamed from: a */
    public final TextView invoke() {
        TextView textView = new TextView(this.$context);
        SliderView sliderView = this.this$0;
        Context context = this.$context;
        textView.setGravity(8388629);
        textView.setMaxLines(1);
        SliderView.m37870u(sliderView, textView, SliderView.m37865o(sliderView).mo20862G(), 0.0f, 4, (Object) null);
        textView.setTextSize((float) sliderView.getTheme$ubform_sdkRelease().getFonts().getTitleSize());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) textView.getPaint().measureText(C10023h.f27518z), context.getResources().getDimensionPixelSize(C9747c.C9754g.ub_element_slider_result_height));
        layoutParams.leftMargin = context.getResources().getDimensionPixelSize(C9747c.C9754g.ub_element_slider_result_left_margin);
        C11079d2 d2Var = C11079d2.f28267a;
        textView.setLayoutParams(layoutParams);
        return textView;
    }
}

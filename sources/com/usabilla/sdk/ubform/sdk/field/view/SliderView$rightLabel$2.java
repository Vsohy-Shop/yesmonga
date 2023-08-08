package com.usabilla.sdk.ubform.sdk.field.view;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Landroid/widget/TextView;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class SliderView$rightLabel$2 extends Lambda implements C11289a<TextView> {
    final /* synthetic */ Context $context;
    final /* synthetic */ SliderView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderView$rightLabel$2(Context context, SliderView sliderView) {
        super(0);
        this.$context = context;
        this.this$0 = sliderView;
    }

    @C12579k
    /* renamed from: a */
    public final TextView invoke() {
        TextView textView = new TextView(this.$context);
        SliderView sliderView = this.this$0;
        textView.setGravity(8388613);
        textView.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        sliderView.mo21092t(textView, SliderView.m37865o(sliderView).mo20866l(), 0.5f);
        return textView;
    }
}

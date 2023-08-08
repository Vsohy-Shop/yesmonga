package com.usabilla.sdk.ubform.sdk.field.view;

import android.content.Context;
import android.text.method.ScrollingMovementMethod;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Landroid/widget/TextView;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class ParagraphView$paragraph$2 extends Lambda implements C11289a<TextView> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ParagraphView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ParagraphView$paragraph$2(Context context, ParagraphView paragraphView) {
        super(0);
        this.$context = context;
        this.this$0 = paragraphView;
    }

    @C12579k
    /* renamed from: a */
    public final TextView invoke() {
        TextView textView = new TextView(this.$context);
        ParagraphView paragraphView = this.this$0;
        textView.setTypeface(paragraphView.getTheme$ubform_sdkRelease().getTypefaceRegular());
        textView.setTextSize((float) paragraphView.getTheme$ubform_sdkRelease().getFonts().getTextSize());
        textView.setLinkTextColor(paragraphView.getColors().getAccent());
        textView.setTextColor(paragraphView.getColors().getText());
        textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        textView.setMovementMethod(new ScrollingMovementMethod());
        return textView;
    }
}

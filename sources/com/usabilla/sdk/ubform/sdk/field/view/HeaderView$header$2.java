package com.usabilla.sdk.ubform.sdk.field.view;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Landroid/widget/TextView;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class HeaderView$header$2 extends Lambda implements C11289a<TextView> {
    final /* synthetic */ Context $context;
    final /* synthetic */ HeaderView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HeaderView$header$2(Context context, HeaderView headerView) {
        super(0);
        this.$context = context;
        this.this$0 = headerView;
    }

    @C12579k
    /* renamed from: a */
    public final TextView invoke() {
        TextView textView = new TextView(this.$context);
        HeaderView headerView = this.this$0;
        textView.setText(HeaderView.m37802o(headerView).mo20821H());
        textView.setTextSize((float) (((double) headerView.getTheme$ubform_sdkRelease().getFonts().getTitleSize()) * headerView.f27523F0));
        textView.setTypeface(headerView.getTheme$ubform_sdkRelease().getTypefaceRegular());
        textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        textView.setLinkTextColor(headerView.getColors().getAccent());
        textView.setTextColor(headerView.getColors().getTitle());
        return textView;
    }
}

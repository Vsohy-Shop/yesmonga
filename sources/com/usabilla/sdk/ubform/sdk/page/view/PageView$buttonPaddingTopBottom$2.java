package com.usabilla.sdk.ubform.sdk.page.view;

import android.content.Context;
import com.usabilla.sdk.ubform.C9747c;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/page/presenter/a;", "V", "", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class PageView$buttonPaddingTopBottom$2 extends Lambda implements C11289a<Integer> {
    final /* synthetic */ Context $context;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PageView$buttonPaddingTopBottom$2(Context context) {
        super(0);
        this.$context = context;
    }

    /* renamed from: a */
    public final int mo21458a() {
        return this.$context.getResources().getDimensionPixelSize(C9747c.C9754g.ub_page_buttons_padding_top_bottom);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return Integer.valueOf(mo21458a());
    }
}

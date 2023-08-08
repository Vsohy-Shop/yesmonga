package com.usabilla.sdk.ubform.sdk.field.view.common;

import android.content.Context;
import android.widget.LinearLayout;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0010\b\u0000\u0010\u0001*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0000H\n"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/field/presenter/common/FieldPresenter;", "P", "Landroid/widget/LinearLayout;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class FieldView$rootView$2 extends Lambda implements C11289a<LinearLayout> {
    final /* synthetic */ Context $context;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FieldView$rootView$2(Context context) {
        super(0);
        this.$context = context;
    }

    @C12579k
    /* renamed from: a */
    public final LinearLayout invoke() {
        LinearLayout linearLayout = new LinearLayout(this.$context);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        return linearLayout;
    }
}

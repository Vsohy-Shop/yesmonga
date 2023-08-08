package com.usabilla.sdk.ubform.sdk.field.view;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Landroid/widget/RadioGroup;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class RadioView$radioGroup$2 extends Lambda implements C11289a<RadioGroup> {
    final /* synthetic */ Context $context;
    final /* synthetic */ RadioView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RadioView$radioGroup$2(Context context, RadioView radioView) {
        super(0);
        this.$context = context;
        this.this$0 = radioView;
    }

    @C12579k
    /* renamed from: a */
    public final RadioGroup invoke() {
        RadioGroup radioGroup = new RadioGroup(this.$context);
        RadioView radioView = this.this$0;
        radioGroup.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        radioGroup.setOnCheckedChangeListener(radioView);
        return radioGroup;
    }
}

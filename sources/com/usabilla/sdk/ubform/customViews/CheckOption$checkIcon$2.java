package com.usabilla.sdk.ubform.customViews;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/customViews/CheckableImageView;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class CheckOption$checkIcon$2 extends Lambda implements C11289a<CheckableImageView> {
    final /* synthetic */ Context $context;
    final /* synthetic */ CheckOption this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckOption$checkIcon$2(Context context, CheckOption checkOption) {
        super(0);
        this.$context = context;
        this.this$0 = checkOption;
    }

    @C12579k
    /* renamed from: a */
    public final CheckableImageView invoke() {
        CheckableImageView checkableImageView = new CheckableImageView(this.$context, this.this$0);
        CheckOption checkOption = this.this$0;
        checkableImageView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        checkableImageView.setImageDrawable(checkOption.getBgUnchecked());
        checkableImageView.setOnClickListener(checkOption);
        checkableImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        return checkableImageView;
    }
}

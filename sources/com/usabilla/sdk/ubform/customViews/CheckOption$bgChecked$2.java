package com.usabilla.sdk.ubform.customViews;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.usabilla.sdk.ubform.C9747c;
import com.usabilla.sdk.ubform.utils.ext.C10133g;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Landroid/graphics/drawable/LayerDrawable;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class CheckOption$bgChecked$2 extends Lambda implements C11289a<LayerDrawable> {
    final /* synthetic */ Context $context;
    final /* synthetic */ CheckOption this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckOption$bgChecked$2(Context context, CheckOption checkOption) {
        super(0);
        this.$context = context;
        this.this$0 = checkOption;
    }

    @C12579k
    /* renamed from: a */
    public final LayerDrawable invoke() {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{C10133g.m38359u(this.$context, C9747c.C9755h.ub_checkbox_selected, this.this$0.f26742a, false, 4, (Object) null), this.this$0.getCheckMarkIcon()});
        CheckOption checkOption = this.this$0;
        layerDrawable.setLayerInset(1, checkOption.getCheckBoxPadding(), checkOption.getCheckBoxPadding(), checkOption.getCheckBoxPadding(), checkOption.getCheckBoxPadding());
        return layerDrawable;
    }
}

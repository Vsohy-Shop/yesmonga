package com.usabilla.sdk.ubform.customViews;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import androidx.core.content.C17318d;
import com.usabilla.sdk.ubform.C9747c;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Landroid/graphics/drawable/LayerDrawable;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class CheckOption$bgUnchecked$2 extends Lambda implements C11289a<LayerDrawable> {
    final /* synthetic */ Context $context;
    final /* synthetic */ CheckOption this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckOption$bgUnchecked$2(Context context, CheckOption checkOption) {
        super(0);
        this.$context = context;
        this.this$0 = checkOption;
    }

    @C12579k
    /* renamed from: a */
    public final LayerDrawable invoke() {
        Drawable i = C17318d.m79726i(this.$context, C9747c.C9755h.ub_checkbox_unselected);
        if (i != null) {
            LayerDrawable layerDrawable = (LayerDrawable) i;
            CheckOption checkOption = this.this$0;
            Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(C9747c.C9756i.checkbox_unselected_border);
            if (findDrawableByLayerId != null) {
                ((GradientDrawable) findDrawableByLayerId).setColor(checkOption.f26742a);
                Drawable findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(C9747c.C9756i.checkbox_unselected_filling);
                if (findDrawableByLayerId2 != null) {
                    ((GradientDrawable) findDrawableByLayerId2).setColor(checkOption.f26744c);
                    return layerDrawable;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
    }
}

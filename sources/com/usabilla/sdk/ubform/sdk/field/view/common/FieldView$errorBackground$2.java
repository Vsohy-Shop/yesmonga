package com.usabilla.sdk.ubform.sdk.field.view.common;

import android.graphics.drawable.GradientDrawable;
import com.usabilla.sdk.ubform.C9747c;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0010\b\u0000\u0010\u0001*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0000H\n"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/field/presenter/common/FieldPresenter;", "P", "Landroid/graphics/drawable/GradientDrawable;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class FieldView$errorBackground$2 extends Lambda implements C11289a<GradientDrawable> {
    final /* synthetic */ FieldView<P> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FieldView$errorBackground$2(FieldView<P> fieldView) {
        super(0);
        this.this$0 = fieldView;
    }

    @C12579k
    /* renamed from: a */
    public final GradientDrawable invoke() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        FieldView<P> fieldView = this.this$0;
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius((float) fieldView.getResources().getDimensionPixelSize(C9747c.C9754g.ub_card_radius));
        gradientDrawable.setStroke(fieldView.getResources().getDimensionPixelSize(C9747c.C9754g.ub_card_error_stroke_width), fieldView.getColors().getError());
        gradientDrawable.setColor(fieldView.getColors().getCard());
        return gradientDrawable;
    }
}

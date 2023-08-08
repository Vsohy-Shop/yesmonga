package com.usabilla.sdk.ubform.screenshot.annotation.paint;

import android.graphics.drawable.LayerDrawable;
import android.widget.ImageView;
import androidx.core.graphics.drawable.C17549d;
import com.usabilla.sdk.ubform.screenshot.annotation.paint.C9900a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"", "color", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class UbPaintMenu$inflateView$1$colorPicker$1$1 extends Lambda implements C11300l<Integer, C11079d2> {
    final /* synthetic */ LayerDrawable $markerActiveDrawable;
    final /* synthetic */ ImageView $markerButton;
    final /* synthetic */ LayerDrawable $pencilActiveDrawable;
    final /* synthetic */ ImageView $pencilButton;
    final /* synthetic */ UbPaintMenu this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UbPaintMenu$inflateView$1$colorPicker$1$1(UbPaintMenu ubPaintMenu, LayerDrawable layerDrawable, LayerDrawable layerDrawable2, ImageView imageView, ImageView imageView2) {
        super(1);
        this.this$0 = ubPaintMenu;
        this.$markerActiveDrawable = layerDrawable;
        this.$pencilActiveDrawable = layerDrawable2;
        this.$markerButton = imageView;
        this.$pencilButton = imageView2;
    }

    /* renamed from: a */
    public final void mo20497a(int i) {
        this.this$0.mo20392c().invoke(new C9900a.C9901a(i));
        C17549d.m80452n(this.$markerActiveDrawable.getDrawable(0), i);
        C17549d.m80452n(this.$pencilActiveDrawable.getDrawable(0), i);
        this.$markerButton.invalidate();
        this.$pencilButton.invalidate();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo20497a(((Number) obj).intValue());
        return C11079d2.f28267a;
    }
}

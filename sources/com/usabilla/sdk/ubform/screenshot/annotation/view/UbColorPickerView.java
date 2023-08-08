package com.usabilla.sdk.ubform.screenshot.annotation.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.C17318d;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.C9747c;
import com.usabilla.sdk.ubform.utils.ext.ExtensionViewKt;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.jvm.C11315i;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\b\b\u0002\u0010)\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b*\u0010+J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002J\"\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0002R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012R=\u0010\u001e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00040\u00158\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u00028BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020$8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010%¨\u0006,"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/screenshot/annotation/view/UbColorPickerView;", "Landroid/widget/LinearLayout;", "", "index", "Lkotlin/d2;", "f", "Landroid/content/Context;", "context", "colorResource", "Landroid/widget/ImageView;", "c", "fillingColor", "Landroid/graphics/drawable/Drawable;", "b", "selectedColor", "borderColor", "e", "a", "I", "textColor", "cardColor", "Lkotlin/Function1;", "Lkotlin/n0;", "name", "color", "Lkotlin/jvm/functions/l;", "getOnColorSelected", "()Lkotlin/jvm/functions/l;", "setOnColorSelected", "(Lkotlin/jvm/functions/l;)V", "onColorSelected", "d", "Lkotlin/z;", "getPadding", "()I", "padding", "", "[I", "colors", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;III)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public final class UbColorPickerView extends LinearLayout {

    /* renamed from: a */
    public final int f27200a;

    /* renamed from: b */
    public final int f27201b;
    @C12579k

    /* renamed from: c */
    public C11300l<? super Integer, C11079d2> f27202c;
    @C12579k

    /* renamed from: d */
    public final C11677z f27203d;
    @C12579k

    /* renamed from: e */
    public final int[] f27204e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public UbColorPickerView(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 0, 0, 30, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: d */
    public static final void m37212d(ImageView imageView, UbColorPickerView ubColorPickerView, int i, View view) {
        Intrinsics.checkNotNullParameter(imageView, "$this_apply");
        Intrinsics.checkNotNullParameter(ubColorPickerView, "this$0");
        imageView.setSelected(true);
        ExtensionViewKt.m38317a(ubColorPickerView, imageView);
        ubColorPickerView.getOnColorSelected().invoke(Integer.valueOf(i));
    }

    private final int getPadding() {
        return ((Number) this.f27203d.getValue()).intValue();
    }

    /* renamed from: b */
    public final Drawable mo20524b(int i) {
        Drawable e = mo20526e(i, this.f27200a, this.f27201b);
        Drawable e2 = mo20526e(i, 0, Color.argb(Math.round(((float) Color.alpha(this.f27200a)) * 0.5f), Color.red(this.f27200a), Color.green(this.f27200a), Color.blue(this.f27200a)));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842913}, e);
        stateListDrawable.addState(new int[]{-16842913}, e2);
        return stateListDrawable;
    }

    /* renamed from: c */
    public final ImageView mo20525c(Context context, int i) {
        ImageView imageView = new ImageView(context);
        int f = C17318d.m79723f(context, i);
        imageView.setImageDrawable(mo20524b(f));
        imageView.setOnClickListener(new C9906a(imageView, this, f));
        imageView.setPadding(getPadding(), getPadding(), getPadding(), getPadding());
        return imageView;
    }

    /* renamed from: e */
    public final Drawable mo20526e(int i, int i2, int i3) {
        Drawable i4 = C17318d.m79726i(getContext(), C9747c.C9755h.ub_color_picker_item);
        if (i4 != null) {
            LayerDrawable layerDrawable = (LayerDrawable) i4;
            Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(C9747c.C9756i.ub_color_picker_selected_border);
            if (findDrawableByLayerId != null) {
                GradientDrawable gradientDrawable = (GradientDrawable) findDrawableByLayerId;
                Drawable findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(C9747c.C9756i.ub_color_picker_border);
                if (findDrawableByLayerId2 != null) {
                    GradientDrawable gradientDrawable2 = (GradientDrawable) findDrawableByLayerId2;
                    Drawable findDrawableByLayerId3 = layerDrawable.findDrawableByLayerId(C9747c.C9756i.ub_color_picker_fill);
                    if (findDrawableByLayerId3 != null) {
                        ((GradientDrawable) findDrawableByLayerId3).setColor(i);
                        gradientDrawable.setColor(i2);
                        gradientDrawable2.setColor(i3);
                        return layerDrawable.mutate();
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                }
                throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
    }

    /* renamed from: f */
    public final void mo20527f(int i) {
        getChildAt(i).performClick();
    }

    @C12579k
    public final C11300l<Integer, C11079d2> getOnColorSelected() {
        return this.f27202c;
    }

    public final void setOnColorSelected(@C12579k C11300l<? super Integer, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<set-?>");
        this.f27202c = lVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public UbColorPickerView(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 0, 28, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public UbColorPickerView(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 0, 24, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public UbColorPickerView(@C12579k Context context, @C12580l AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, 0, 16, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UbColorPickerView(Context context, AttributeSet attributeSet, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i4 & 2) != 0 ? null : attributeSet, (i4 & 4) != 0 ? 0 : i, (i4 & 8) != 0 ? 0 : i2, (i4 & 16) != 0 ? 0 : i3);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public UbColorPickerView(@C12579k Context context, @C12580l AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f27200a = i2;
        this.f27201b = i3;
        this.f27202c = UbColorPickerView$onColorSelected$1.f27205f;
        this.f27203d = C10864b0.m38748c(new UbColorPickerView$padding$2(this));
        int[] iArr = {C9747c.C9753f.ub_color_picker_black, C9747c.C9753f.ub_color_picker_white, C9747c.C9753f.ub_color_picker_green, C9747c.C9753f.ub_color_picker_red};
        this.f27204e = iArr;
        setOrientation(0);
        setGravity(17);
        for (int c : iArr) {
            addView(mo20525c(context, c));
        }
    }
}

package com.usabilla.sdk.ubform.screenshot.annotation.paint;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.vectordrawable.graphics.drawable.C20729i;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.C9747c;
import com.usabilla.sdk.ubform.net.parser.C9874a;
import com.usabilla.sdk.ubform.screenshot.annotation.UbAnnotationMenu;
import com.usabilla.sdk.ubform.screenshot.annotation.paint.C9900a;
import com.usabilla.sdk.ubform.screenshot.annotation.view.UbColorPickerView;
import com.usabilla.sdk.ubform.sdk.form.model.UbColors;
import com.usabilla.sdk.ubform.utils.ext.C10133g;
import com.usabilla.sdk.ubform.utils.ext.ExtensionViewKt;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class UbPaintMenu implements UbAnnotationMenu<C9900a> {
    @C12579k

    /* renamed from: a */
    public final UbColors f27177a;
    @C12579k

    /* renamed from: b */
    public C11300l<? super C9900a, C11079d2> f27178b = UbPaintMenu$eventUpdates$1.f27180f;
    @C12579k

    /* renamed from: c */
    public final UbAnnotationMenu.Position f27179c = UbAnnotationMenu.Position.BOTTOM;

    public UbPaintMenu(@C12579k UbColors ubColors) {
        Intrinsics.checkNotNullParameter(ubColors, C9874a.f27063h);
        this.f27177a = ubColors;
    }

    /* renamed from: g */
    public static final void m37171g(UbPaintMenu ubPaintMenu, C9900a aVar, ImageView imageView, ViewGroup viewGroup, View view) {
        Intrinsics.checkNotNullParameter(ubPaintMenu, "this$0");
        Intrinsics.checkNotNullParameter(aVar, "$event");
        Intrinsics.checkNotNullParameter(imageView, "$this_apply");
        Intrinsics.checkNotNullParameter(viewGroup, "$parent");
        ubPaintMenu.mo20392c().invoke(aVar);
        imageView.setSelected(true);
        ExtensionViewKt.m38317a(viewGroup, imageView);
    }

    @C12579k
    /* renamed from: a */
    public View mo20390a(@C12579k Context context) {
        Context context2 = context;
        Intrinsics.checkNotNullParameter(context2, C9175a.f24932Y);
        LinearLayout linearLayout = new LinearLayout(context2);
        linearLayout.setGravity(17);
        LayerDrawable e = mo20492e(context2, C9747c.C9755h.ub_marker_color, C9747c.C9755h.ub_marker_outline);
        LayerDrawable e2 = mo20492e(context2, C9747c.C9755h.ub_pencil_color, C9747c.C9755h.ub_pencil_outline);
        Drawable h = mo20494h(context2, e, C9747c.C9755h.ub_marker_inactive);
        Drawable h2 = mo20494h(context2, e2, C9747c.C9755h.ub_pencil_inactive);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C9747c.C9754g.ub_marker_padding_sides);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(C9747c.C9754g.ub_pencil_padding_sides);
        int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(C9747c.C9754g.ub_marker_stroke_width);
        int dimensionPixelSize4 = context.getResources().getDimensionPixelSize(C9747c.C9754g.ub_pencil_stroke_width);
        ImageView f = mo20493f(linearLayout, h, dimensionPixelSize, new C9900a.C9902b((float) dimensionPixelSize3));
        ImageView f2 = mo20493f(linearLayout, h2, dimensionPixelSize2, new C9900a.C9902b((float) dimensionPixelSize4));
        linearLayout.addView(f);
        linearLayout.addView(f2);
        linearLayout.addView(mo20495i(context));
        UbColorPickerView ubColorPickerView = new UbColorPickerView(context, (AttributeSet) null, 0, this.f27177a.getText(), this.f27177a.getCard(), 6, (DefaultConstructorMarker) null);
        ubColorPickerView.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        UbColorPickerView ubColorPickerView2 = ubColorPickerView;
        ubColorPickerView2.setOnColorSelected(new UbPaintMenu$inflateView$1$colorPicker$1$1(this, e, e2, f, f2));
        linearLayout.addView(ubColorPickerView2);
        ubColorPickerView2.mo20527f(0);
        f.performClick();
        return linearLayout;
    }

    /* renamed from: b */
    public void mo20391b(@C12579k C11300l<? super C9900a, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<set-?>");
        this.f27178b = lVar;
    }

    @C12579k
    /* renamed from: c */
    public C11300l<C9900a, C11079d2> mo20392c() {
        return this.f27178b;
    }

    /* renamed from: e */
    public final LayerDrawable mo20492e(Context context, int i, int i2) {
        return new LayerDrawable(new Drawable[]{C20729i.m96219e(context.getResources(), i, context.getTheme()), C10133g.m38356r(context, i2, this.f27177a.getText(), true)});
    }

    /* renamed from: f */
    public final ImageView mo20493f(ViewGroup viewGroup, Drawable drawable, int i, C9900a aVar) {
        ImageView imageView = new ImageView(viewGroup.getContext());
        imageView.setImageDrawable(drawable);
        imageView.setOnClickListener(new C9903b(this, aVar, imageView, viewGroup));
        imageView.setPadding(i, 0, i, 0);
        return imageView;
    }

    @C12579k
    public UbAnnotationMenu.Position getPosition() {
        return this.f27179c;
    }

    /* renamed from: h */
    public final Drawable mo20494h(Context context, Drawable drawable, int i) {
        Drawable r = C10133g.m38356r(context, i, this.f27177a.getText(), true);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-16842913}, r);
        stateListDrawable.addState(new int[]{16842913}, drawable);
        return stateListDrawable;
    }

    /* renamed from: i */
    public final Space mo20495i(Context context) {
        Space space = new Space(context);
        space.setLayoutParams(new LinearLayout.LayoutParams(context.getResources().getDimensionPixelSize(C9747c.C9754g.ub_paint_space_width), 1));
        return space;
    }
}

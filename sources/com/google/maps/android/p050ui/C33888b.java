package com.google.maps.android.p050ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.content.C17318d;
import com.google.maps.android.C33802d;

/* renamed from: com.google.maps.android.ui.b */
public class C33888b extends Drawable {

    /* renamed from: a */
    public final Drawable f82234a;

    /* renamed from: b */
    public final Drawable f82235b;

    /* renamed from: c */
    public int f82236c = -1;

    public C33888b(Context context) {
        this.f82235b = C17318d.m79726i(context, C33802d.C33809g.amu_bubble_mask);
        this.f82234a = C17318d.m79726i(context, C33802d.C33809g.amu_bubble_shadow);
    }

    /* renamed from: a */
    public void mo98599a(int i) {
        this.f82236c = i;
    }

    public void draw(Canvas canvas) {
        this.f82235b.draw(canvas);
        canvas.drawColor(this.f82236c, PorterDuff.Mode.SRC_IN);
        this.f82234a.draw(canvas);
    }

    public int getOpacity() {
        return -3;
    }

    public boolean getPadding(Rect rect) {
        return this.f82235b.getPadding(rect);
    }

    public void setAlpha(int i) {
        throw new UnsupportedOperationException();
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        this.f82235b.setBounds(i, i2, i3, i4);
        this.f82234a.setBounds(i, i2, i3, i4);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        throw new UnsupportedOperationException();
    }

    public void setBounds(Rect rect) {
        this.f82235b.setBounds(rect);
        this.f82234a.setBounds(rect);
    }
}

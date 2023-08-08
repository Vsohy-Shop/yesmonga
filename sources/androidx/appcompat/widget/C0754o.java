package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.annotation.C0363p0;
import androidx.appcompat.C0387a;
import androidx.core.graphics.drawable.C17549d;
import androidx.core.view.C18196h2;

/* renamed from: androidx.appcompat.widget.o */
public class C0754o extends C0744m {

    /* renamed from: d */
    public final SeekBar f2466d;

    /* renamed from: e */
    public Drawable f2467e;

    /* renamed from: f */
    public ColorStateList f2468f = null;

    /* renamed from: g */
    public PorterDuff.Mode f2469g = null;

    /* renamed from: h */
    public boolean f2470h = false;

    /* renamed from: i */
    public boolean f2471i = false;

    public C0754o(SeekBar seekBar) {
        super(seekBar);
        this.f2466d = seekBar;
    }

    /* renamed from: c */
    public void mo3534c(AttributeSet attributeSet, int i) {
        super.mo3534c(attributeSet, i);
        Context context = this.f2466d.getContext();
        int[] iArr = C0387a.C0400m.AppCompatSeekBar;
        C0722h1 G = C0722h1.m3539G(context, attributeSet, iArr, i, 0);
        SeekBar seekBar = this.f2466d;
        C18196h2.m82658z1(seekBar, seekBar.getContext(), iArr, attributeSet, G.mo3454B(), i, 0);
        Drawable i2 = G.mo3467i(C0387a.C0400m.AppCompatSeekBar_android_thumb);
        if (i2 != null) {
            this.f2466d.setThumb(i2);
        }
        mo3551m(G.mo3466h(C0387a.C0400m.AppCompatSeekBar_tickMark));
        int i3 = C0387a.C0400m.AppCompatSeekBar_tickMarkTintMode;
        if (G.mo3455C(i3)) {
            this.f2469g = C0725i0.m3584e(G.mo3473o(i3, -1), this.f2469g);
            this.f2471i = true;
        }
        int i4 = C0387a.C0400m.AppCompatSeekBar_tickMarkTint;
        if (G.mo3455C(i4)) {
            this.f2468f = G.mo3462d(i4);
            this.f2470h = true;
        }
        G.mo3458I();
        mo3544f();
    }

    /* renamed from: f */
    public final void mo3544f() {
        Drawable drawable = this.f2467e;
        if (drawable == null) {
            return;
        }
        if (this.f2470h || this.f2471i) {
            Drawable r = C17549d.m80456r(drawable.mutate());
            this.f2467e = r;
            if (this.f2470h) {
                C17549d.m80453o(r, this.f2468f);
            }
            if (this.f2471i) {
                C17549d.m80454p(this.f2467e, this.f2469g);
            }
            if (this.f2467e.isStateful()) {
                this.f2467e.setState(this.f2466d.getDrawableState());
            }
        }
    }

    /* renamed from: g */
    public void mo3545g(Canvas canvas) {
        int i;
        if (this.f2467e != null) {
            int max = this.f2466d.getMax();
            int i2 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f2467e.getIntrinsicWidth();
                int intrinsicHeight = this.f2467e.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i = intrinsicWidth / 2;
                } else {
                    i = 1;
                }
                if (intrinsicHeight >= 0) {
                    i2 = intrinsicHeight / 2;
                }
                this.f2467e.setBounds(-i, -i2, i, i2);
                float width = ((float) ((this.f2466d.getWidth() - this.f2466d.getPaddingLeft()) - this.f2466d.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f2466d.getPaddingLeft(), (float) (this.f2466d.getHeight() / 2));
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f2467e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* renamed from: h */
    public void mo3546h() {
        Drawable drawable = this.f2467e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f2466d.getDrawableState())) {
            this.f2466d.invalidateDrawable(drawable);
        }
    }

    @C0363p0
    /* renamed from: i */
    public Drawable mo3547i() {
        return this.f2467e;
    }

    @C0363p0
    /* renamed from: j */
    public ColorStateList mo3548j() {
        return this.f2468f;
    }

    @C0363p0
    /* renamed from: k */
    public PorterDuff.Mode mo3549k() {
        return this.f2469g;
    }

    /* renamed from: l */
    public void mo3550l() {
        Drawable drawable = this.f2467e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* renamed from: m */
    public void mo3551m(@C0363p0 Drawable drawable) {
        Drawable drawable2 = this.f2467e;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f2467e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f2466d);
            C17549d.m80451m(drawable, C18196h2.m82553Z(this.f2466d));
            if (drawable.isStateful()) {
                drawable.setState(this.f2466d.getDrawableState());
            }
            mo3544f();
        }
        this.f2466d.invalidate();
    }

    /* renamed from: n */
    public void mo3552n(@C0363p0 ColorStateList colorStateList) {
        this.f2468f = colorStateList;
        this.f2470h = true;
        mo3544f();
    }

    /* renamed from: o */
    public void mo3553o(@C0363p0 PorterDuff.Mode mode) {
        this.f2469g = mode;
        this.f2471i = true;
        mo3544f();
    }
}

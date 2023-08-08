package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.core.view.C18196h2;
import androidx.core.view.C18414x1;
import androidx.core.view.C18436z4;
import com.google.android.material.C31076a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ScrimInsetsFrameLayout extends FrameLayout {
    @C0363p0

    /* renamed from: a */
    public Drawable f75773a;

    /* renamed from: b */
    public Rect f75774b;

    /* renamed from: c */
    public Rect f75775c;

    /* renamed from: d */
    public boolean f75776d;

    /* renamed from: e */
    public boolean f75777e;

    /* renamed from: com.google.android.material.internal.ScrimInsetsFrameLayout$a */
    public class C31384a implements C18414x1 {
        public C31384a() {
        }

        /* renamed from: a */
        public C18436z4 mo1193a(View view, @C0359n0 C18436z4 z4Var) {
            boolean z;
            ScrimInsetsFrameLayout scrimInsetsFrameLayout = ScrimInsetsFrameLayout.this;
            if (scrimInsetsFrameLayout.f75774b == null) {
                scrimInsetsFrameLayout.f75774b = new Rect();
            }
            ScrimInsetsFrameLayout.this.f75774b.set(z4Var.mo53147p(), z4Var.mo53149r(), z4Var.mo53148q(), z4Var.mo53146o());
            ScrimInsetsFrameLayout.this.mo89970a(z4Var);
            ScrimInsetsFrameLayout scrimInsetsFrameLayout2 = ScrimInsetsFrameLayout.this;
            if (!z4Var.mo53154w() || ScrimInsetsFrameLayout.this.f75773a == null) {
                z = true;
            } else {
                z = false;
            }
            scrimInsetsFrameLayout2.setWillNotDraw(z);
            C18196h2.m82610n1(ScrimInsetsFrameLayout.this);
            return z4Var.mo53132c();
        }
    }

    public ScrimInsetsFrameLayout(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public void mo89970a(C18436z4 z4Var) {
    }

    public void draw(@C0359n0 Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f75774b != null && this.f75773a != null) {
            int save = canvas.save();
            canvas.translate((float) getScrollX(), (float) getScrollY());
            if (this.f75776d) {
                this.f75775c.set(0, 0, width, this.f75774b.top);
                this.f75773a.setBounds(this.f75775c);
                this.f75773a.draw(canvas);
            }
            if (this.f75777e) {
                this.f75775c.set(0, height - this.f75774b.bottom, width, height);
                this.f75773a.setBounds(this.f75775c);
                this.f75773a.draw(canvas);
            }
            Rect rect = this.f75775c;
            Rect rect2 = this.f75774b;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.f75773a.setBounds(this.f75775c);
            this.f75773a.draw(canvas);
            Rect rect3 = this.f75775c;
            Rect rect4 = this.f75774b;
            rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
            this.f75773a.setBounds(this.f75775c);
            this.f75773a.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f75773a;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f75773a;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z) {
        this.f75777e = z;
    }

    public void setDrawTopInsetForeground(boolean z) {
        this.f75776d = z;
    }

    public void setScrimInsetForeground(@C0363p0 Drawable drawable) {
        this.f75773a = drawable;
    }

    public ScrimInsetsFrameLayout(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrimInsetsFrameLayout(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f75775c = new Rect();
        this.f75776d = true;
        this.f75777e = true;
        TypedArray j = C31422p.m126970j(context, attributeSet, C31076a.C31091o.ScrimInsetsFrameLayout, i, C31076a.C31090n.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.f75773a = j.getDrawable(C31076a.C31091o.ScrimInsetsFrameLayout_insetForeground);
        j.recycle();
        setWillNotDraw(true);
        C18196h2.m82559a2(this, new C31384a());
    }
}

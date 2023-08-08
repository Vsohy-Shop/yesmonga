package com.facebook.shimmer;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.facebook.shimmer.C14939b;
import com.facebook.shimmer.C14943c;

public class ShimmerFrameLayout extends FrameLayout {

    /* renamed from: a */
    public final Paint f37025a = new Paint();

    /* renamed from: b */
    public final C14949d f37026b = new C14949d();

    /* renamed from: c */
    public boolean f37027c = true;

    public ShimmerFrameLayout(Context context) {
        super(context);
        mo36990b(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public void mo36989a() {
        if (this.f37027c) {
            mo36997h();
            this.f37027c = false;
            invalidate();
        }
    }

    /* renamed from: b */
    public final void mo36990b(Context context, @C0363p0 AttributeSet attributeSet) {
        C14943c.C14945b bVar;
        setWillNotDraw(false);
        this.f37026b.setCallback(this);
        if (attributeSet == null) {
            mo36994e(new C14943c.C14944a().mo37009a());
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C14939b.C14942c.ShimmerFrameLayout, 0, 0);
        try {
            int i = C14939b.C14942c.ShimmerFrameLayout_shimmer_colored;
            if (!obtainStyledAttributes.hasValue(i) || !obtainStyledAttributes.getBoolean(i, false)) {
                bVar = new C14943c.C14944a();
            } else {
                bVar = new C14943c.C14946c();
            }
            mo36994e(bVar.mo37011d(obtainStyledAttributes).mo37009a());
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: c */
    public boolean mo36991c() {
        return this.f37026b.mo37034a();
    }

    /* renamed from: d */
    public boolean mo36992d() {
        return this.f37027c;
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f37027c) {
            this.f37026b.draw(canvas);
        }
    }

    /* renamed from: e */
    public ShimmerFrameLayout mo36994e(@C0363p0 C14943c cVar) {
        this.f37026b.mo37037d(cVar);
        if (cVar == null || !cVar.f37049o) {
            setLayerType(0, (Paint) null);
        } else {
            setLayerType(2, this.f37025a);
        }
        return this;
    }

    /* renamed from: f */
    public void mo36995f(boolean z) {
        if (!this.f37027c) {
            this.f37027c = true;
            if (z) {
                mo36996g();
            }
        }
    }

    /* renamed from: g */
    public void mo36996g() {
        this.f37026b.mo37039e();
    }

    /* renamed from: h */
    public void mo36997h() {
        this.f37026b.mo37040f();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f37026b.mo37035b();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo36997h();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f37026b.setBounds(0, 0, getWidth(), getHeight());
    }

    public boolean verifyDrawable(@C0359n0 Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f37026b;
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo36990b(context, attributeSet);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo36990b(context, attributeSet);
    }

    @TargetApi(21)
    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo36990b(context, attributeSet);
    }
}

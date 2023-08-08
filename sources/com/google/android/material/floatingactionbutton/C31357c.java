package com.google.android.material.floatingactionbutton;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.annotation.C0337f0;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0366r;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.C17586h0;
import com.google.android.material.shape.C31534o;
import com.google.android.material.shape.C31538p;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.google.android.material.floatingactionbutton.c */
public class C31357c extends Drawable {

    /* renamed from: q */
    public static final float f75626q = 1.3333f;

    /* renamed from: a */
    public final C31538p f75627a = C31538p.m127630k();
    @C0359n0

    /* renamed from: b */
    public final Paint f75628b;

    /* renamed from: c */
    public final Path f75629c = new Path();

    /* renamed from: d */
    public final Rect f75630d = new Rect();

    /* renamed from: e */
    public final RectF f75631e = new RectF();

    /* renamed from: f */
    public final RectF f75632f = new RectF();

    /* renamed from: g */
    public final C31359b f75633g = new C31359b();
    @C0366r

    /* renamed from: h */
    public float f75634h;
    @C0354l

    /* renamed from: i */
    public int f75635i;
    @C0354l

    /* renamed from: j */
    public int f75636j;
    @C0354l

    /* renamed from: k */
    public int f75637k;
    @C0354l

    /* renamed from: l */
    public int f75638l;
    @C0354l

    /* renamed from: m */
    public int f75639m;

    /* renamed from: n */
    public boolean f75640n = true;

    /* renamed from: o */
    public C31534o f75641o;
    @C0363p0

    /* renamed from: p */
    public ColorStateList f75642p;

    /* renamed from: com.google.android.material.floatingactionbutton.c$b */
    public class C31359b extends Drawable.ConstantState {
        public C31359b() {
        }

        public int getChangingConfigurations() {
            return 0;
        }

        @C0359n0
        public Drawable newDrawable() {
            return C31357c.this;
        }
    }

    public C31357c(C31534o oVar) {
        this.f75641o = oVar;
        Paint paint = new Paint(1);
        this.f75628b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @C0359n0
    /* renamed from: a */
    public final Shader mo89773a() {
        Rect rect = this.f75630d;
        copyBounds(rect);
        float height = this.f75634h / ((float) rect.height());
        return new LinearGradient(0.0f, (float) rect.top, 0.0f, (float) rect.bottom, new int[]{C17586h0.m80583t(this.f75635i, this.f75639m), C17586h0.m80583t(this.f75636j, this.f75639m), C17586h0.m80583t(C17586h0.m80563B(this.f75636j, 0), this.f75639m), C17586h0.m80583t(C17586h0.m80563B(this.f75638l, 0), this.f75639m), C17586h0.m80583t(this.f75638l, this.f75639m), C17586h0.m80583t(this.f75637k, this.f75639m)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP);
    }

    @C0359n0
    /* renamed from: b */
    public RectF mo89774b() {
        this.f75632f.set(getBounds());
        return this.f75632f;
    }

    /* renamed from: c */
    public C31534o mo89775c() {
        return this.f75641o;
    }

    /* renamed from: d */
    public void mo89776d(@C0363p0 ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f75639m = colorStateList.getColorForState(getState(), this.f75639m);
        }
        this.f75642p = colorStateList;
        this.f75640n = true;
        invalidateSelf();
    }

    public void draw(@C0359n0 Canvas canvas) {
        if (this.f75640n) {
            this.f75628b.setShader(mo89773a());
            this.f75640n = false;
        }
        float strokeWidth = this.f75628b.getStrokeWidth() / 2.0f;
        copyBounds(this.f75630d);
        this.f75631e.set(this.f75630d);
        float min = Math.min(this.f75641o.mo90818r().mo90693a(mo89774b()), this.f75631e.width() / 2.0f);
        if (this.f75641o.mo90821u(mo89774b())) {
            this.f75631e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f75631e, min, min, this.f75628b);
        }
    }

    /* renamed from: e */
    public void mo89778e(@C0366r float f) {
        if (this.f75634h != f) {
            this.f75634h = f;
            this.f75628b.setStrokeWidth(f * 1.3333f);
            this.f75640n = true;
            invalidateSelf();
        }
    }

    /* renamed from: f */
    public void mo89779f(@C0354l int i, @C0354l int i2, @C0354l int i3, @C0354l int i4) {
        this.f75635i = i;
        this.f75636j = i2;
        this.f75637k = i3;
        this.f75638l = i4;
    }

    /* renamed from: g */
    public void mo89780g(C31534o oVar) {
        this.f75641o = oVar;
        invalidateSelf();
    }

    @C0363p0
    public Drawable.ConstantState getConstantState() {
        return this.f75633g;
    }

    public int getOpacity() {
        return this.f75634h > 0.0f ? -3 : -2;
    }

    @TargetApi(21)
    public void getOutline(@C0359n0 Outline outline) {
        if (this.f75641o.mo90821u(mo89774b())) {
            outline.setRoundRect(getBounds(), this.f75641o.mo90818r().mo90693a(mo89774b()));
            return;
        }
        copyBounds(this.f75630d);
        this.f75631e.set(this.f75630d);
        this.f75627a.mo90859d(this.f75641o, 1.0f, this.f75631e, this.f75629c);
        if (this.f75629c.isConvex()) {
            outline.setConvexPath(this.f75629c);
        }
    }

    public boolean getPadding(@C0359n0 Rect rect) {
        if (!this.f75641o.mo90821u(mo89774b())) {
            return true;
        }
        int round = Math.round(this.f75634h);
        rect.set(round, round, round, round);
        return true;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.f75642p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    public void onBoundsChange(Rect rect) {
        this.f75640n = true;
    }

    public boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f75642p;
        if (!(colorStateList == null || (colorForState = colorStateList.getColorForState(iArr, this.f75639m)) == this.f75639m)) {
            this.f75640n = true;
            this.f75639m = colorForState;
        }
        if (this.f75640n) {
            invalidateSelf();
        }
        return this.f75640n;
    }

    public void setAlpha(@C0337f0(from = 0, mo995to = 255) int i) {
        this.f75628b.setAlpha(i);
        invalidateSelf();
    }

    public void setColorFilter(@C0363p0 ColorFilter colorFilter) {
        this.f75628b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}

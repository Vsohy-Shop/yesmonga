package com.google.android.material.imageview;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.C0358n;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0364q;
import androidx.annotation.C0366r;
import androidx.annotation.C0376v0;
import androidx.appcompat.content.res.C0507a;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.C31076a;
import com.google.android.material.shape.C31525j;
import com.google.android.material.shape.C31534o;
import com.google.android.material.shape.C31538p;
import com.google.android.material.shape.C31553s;

public class ShapeableImageView extends AppCompatImageView implements C31553s {

    /* renamed from: N0 */
    public static final int f75722N0 = C31076a.C31090n.Widget_MaterialComponents_ShapeableImageView;

    /* renamed from: O0 */
    public static final int f75723O0 = Integer.MIN_VALUE;
    @C0366r

    /* renamed from: E0 */
    public float f75724E0;

    /* renamed from: F0 */
    public Path f75725F0;
    @C0366r

    /* renamed from: G0 */
    public int f75726G0;
    @C0366r

    /* renamed from: H0 */
    public int f75727H0;
    @C0366r

    /* renamed from: I0 */
    public int f75728I0;
    @C0366r

    /* renamed from: J0 */
    public int f75729J0;
    @C0366r

    /* renamed from: K0 */
    public int f75730K0;
    @C0366r

    /* renamed from: L0 */
    public int f75731L0;

    /* renamed from: M0 */
    public boolean f75732M0;

    /* renamed from: d */
    public final C31538p f75733d;

    /* renamed from: e */
    public final RectF f75734e;

    /* renamed from: f */
    public final RectF f75735f;

    /* renamed from: g */
    public final Paint f75736g;

    /* renamed from: v */
    public final Paint f75737v;

    /* renamed from: w */
    public final Path f75738w;
    @C0363p0

    /* renamed from: x */
    public ColorStateList f75739x;
    @C0363p0

    /* renamed from: y */
    public C31525j f75740y;

    /* renamed from: z */
    public C31534o f75741z;

    @TargetApi(21)
    /* renamed from: com.google.android.material.imageview.ShapeableImageView$a */
    public class C31377a extends ViewOutlineProvider {

        /* renamed from: a */
        public final Rect f75742a = new Rect();

        public C31377a() {
        }

        public void getOutline(View view, Outline outline) {
            if (ShapeableImageView.this.f75741z != null) {
                if (ShapeableImageView.this.f75740y == null) {
                    C31525j unused = ShapeableImageView.this.f75740y = new C31525j(ShapeableImageView.this.f75741z);
                }
                ShapeableImageView.this.f75734e.round(this.f75742a);
                ShapeableImageView.this.f75740y.setBounds(this.f75742a);
                ShapeableImageView.this.f75740y.getOutline(outline);
            }
        }
    }

    public ShapeableImageView(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    /* renamed from: g */
    public final void mo89865g(Canvas canvas) {
        if (this.f75739x != null) {
            this.f75736g.setStrokeWidth(this.f75724E0);
            int colorForState = this.f75739x.getColorForState(getDrawableState(), this.f75739x.getDefaultColor());
            if (this.f75724E0 > 0.0f && colorForState != 0) {
                this.f75736g.setColor(colorForState);
                canvas.drawPath(this.f75738w, this.f75736g);
            }
        }
    }

    @C0366r
    public int getContentPaddingBottom() {
        return this.f75729J0;
    }

    @C0366r
    public final int getContentPaddingEnd() {
        int i = this.f75731L0;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        if (mo89881i()) {
            return this.f75726G0;
        }
        return this.f75728I0;
    }

    @C0366r
    public int getContentPaddingLeft() {
        int i;
        int i2;
        if (mo89880h()) {
            if (mo89881i() && (i2 = this.f75731L0) != Integer.MIN_VALUE) {
                return i2;
            }
            if (!mo89881i() && (i = this.f75730K0) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.f75726G0;
    }

    @C0366r
    public int getContentPaddingRight() {
        int i;
        int i2;
        if (mo89880h()) {
            if (mo89881i() && (i2 = this.f75730K0) != Integer.MIN_VALUE) {
                return i2;
            }
            if (!mo89881i() && (i = this.f75731L0) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.f75728I0;
    }

    @C0366r
    public final int getContentPaddingStart() {
        int i = this.f75730K0;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        if (mo89881i()) {
            return this.f75728I0;
        }
        return this.f75726G0;
    }

    @C0366r
    public int getContentPaddingTop() {
        return this.f75727H0;
    }

    @C0366r
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @C0366r
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @C0366r
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @C0366r
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @C0366r
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @C0366r
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    @C0359n0
    public C31534o getShapeAppearanceModel() {
        return this.f75741z;
    }

    @C0363p0
    public ColorStateList getStrokeColor() {
        return this.f75739x;
    }

    @C0366r
    public float getStrokeWidth() {
        return this.f75724E0;
    }

    /* renamed from: h */
    public final boolean mo89880h() {
        return (this.f75730K0 == Integer.MIN_VALUE && this.f75731L0 == Integer.MIN_VALUE) ? false : true;
    }

    /* renamed from: i */
    public final boolean mo89881i() {
        return getLayoutDirection() == 1;
    }

    /* renamed from: j */
    public final void mo89882j(int i, int i2) {
        this.f75734e.set((float) getPaddingLeft(), (float) getPaddingTop(), (float) (i - getPaddingRight()), (float) (i2 - getPaddingBottom()));
        this.f75733d.mo90859d(this.f75741z, 1.0f, this.f75734e, this.f75738w);
        this.f75725F0.rewind();
        this.f75725F0.addPath(this.f75738w);
        this.f75735f.set(0.0f, 0.0f, (float) i, (float) i2);
        this.f75725F0.addRect(this.f75735f, Path.Direction.CCW);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setLayerType(2, (Paint) null);
    }

    public void onDetachedFromWindow() {
        setLayerType(0, (Paint) null);
        super.onDetachedFromWindow();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f75725F0, this.f75737v);
        mo89865g(canvas);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.f75732M0 && isLayoutDirectionResolved()) {
            this.f75732M0 = true;
            if (isPaddingRelative() || mo89880h()) {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            } else {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            }
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        mo89882j(i, i2);
    }

    public void setContentPadding(@C0366r int i, @C0366r int i2, @C0366r int i3, @C0366r int i4) {
        this.f75730K0 = Integer.MIN_VALUE;
        this.f75731L0 = Integer.MIN_VALUE;
        super.setPadding((super.getPaddingLeft() - this.f75726G0) + i, (super.getPaddingTop() - this.f75727H0) + i2, (super.getPaddingRight() - this.f75728I0) + i3, (super.getPaddingBottom() - this.f75729J0) + i4);
        this.f75726G0 = i;
        this.f75727H0 = i2;
        this.f75728I0 = i3;
        this.f75729J0 = i4;
    }

    @C0376v0(17)
    public void setContentPaddingRelative(@C0366r int i, @C0366r int i2, @C0366r int i3, @C0366r int i4) {
        int i5;
        super.setPaddingRelative((super.getPaddingStart() - getContentPaddingStart()) + i, (super.getPaddingTop() - this.f75727H0) + i2, (super.getPaddingEnd() - getContentPaddingEnd()) + i3, (super.getPaddingBottom() - this.f75729J0) + i4);
        if (mo89881i()) {
            i5 = i3;
        } else {
            i5 = i;
        }
        this.f75726G0 = i5;
        this.f75727H0 = i2;
        if (!mo89881i()) {
            i = i3;
        }
        this.f75728I0 = i;
        this.f75729J0 = i4;
    }

    public void setPadding(@C0366r int i, @C0366r int i2, @C0366r int i3, @C0366r int i4) {
        super.setPadding(i + getContentPaddingLeft(), i2 + getContentPaddingTop(), i3 + getContentPaddingRight(), i4 + getContentPaddingBottom());
    }

    public void setPaddingRelative(@C0366r int i, @C0366r int i2, @C0366r int i3, @C0366r int i4) {
        super.setPaddingRelative(i + getContentPaddingStart(), i2 + getContentPaddingTop(), i3 + getContentPaddingEnd(), i4 + getContentPaddingBottom());
    }

    public void setShapeAppearanceModel(@C0359n0 C31534o oVar) {
        this.f75741z = oVar;
        C31525j jVar = this.f75740y;
        if (jVar != null) {
            jVar.setShapeAppearanceModel(oVar);
        }
        mo89882j(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(@C0363p0 ColorStateList colorStateList) {
        this.f75739x = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(@C0358n int i) {
        setStrokeColor(C0507a.m2345a(getContext(), i));
    }

    public void setStrokeWidth(@C0366r float f) {
        if (this.f75724E0 != f) {
            this.f75724E0 = f;
            invalidate();
        }
    }

    public void setStrokeWidthResource(@C0364q int i) {
        setStrokeWidth((float) getResources().getDimensionPixelSize(i));
    }

    public ShapeableImageView(Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ShapeableImageView(android.content.Context r7, @androidx.annotation.C0363p0 android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r0 = f75722N0
            android.content.Context r7 = com.google.android.material.theme.overlay.C31683a.m128455c(r7, r8, r9, r0)
            r6.<init>(r7, r8, r9)
            com.google.android.material.shape.p r7 = com.google.android.material.shape.C31538p.m127630k()
            r6.f75733d = r7
            android.graphics.Path r7 = new android.graphics.Path
            r7.<init>()
            r6.f75738w = r7
            r7 = 0
            r6.f75732M0 = r7
            android.content.Context r1 = r6.getContext()
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r6.f75737v = r2
            r3 = 1
            r2.setAntiAlias(r3)
            r4 = -1
            r2.setColor(r4)
            android.graphics.PorterDuffXfermode r4 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.DST_OUT
            r4.<init>(r5)
            r2.setXfermode(r4)
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r6.f75734e = r2
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r6.f75735f = r2
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            r6.f75725F0 = r2
            int[] r2 = com.google.android.material.C31076a.C31091o.ShapeableImageView
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r8, r2, r9, r0)
            int r4 = com.google.android.material.C31076a.C31091o.ShapeableImageView_strokeColor
            android.content.res.ColorStateList r4 = com.google.android.material.resources.C31500c.m127363a(r1, r2, r4)
            r6.f75739x = r4
            int r4 = com.google.android.material.C31076a.C31091o.ShapeableImageView_strokeWidth
            int r4 = r2.getDimensionPixelSize(r4, r7)
            float r4 = (float) r4
            r6.f75724E0 = r4
            int r4 = com.google.android.material.C31076a.C31091o.ShapeableImageView_contentPadding
            int r7 = r2.getDimensionPixelSize(r4, r7)
            r6.f75726G0 = r7
            r6.f75727H0 = r7
            r6.f75728I0 = r7
            r6.f75729J0 = r7
            int r4 = com.google.android.material.C31076a.C31091o.ShapeableImageView_contentPaddingLeft
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.f75726G0 = r4
            int r4 = com.google.android.material.C31076a.C31091o.ShapeableImageView_contentPaddingTop
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.f75727H0 = r4
            int r4 = com.google.android.material.C31076a.C31091o.ShapeableImageView_contentPaddingRight
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.f75728I0 = r4
            int r4 = com.google.android.material.C31076a.C31091o.ShapeableImageView_contentPaddingBottom
            int r7 = r2.getDimensionPixelSize(r4, r7)
            r6.f75729J0 = r7
            int r7 = com.google.android.material.C31076a.C31091o.ShapeableImageView_contentPaddingStart
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = r2.getDimensionPixelSize(r7, r4)
            r6.f75730K0 = r7
            int r7 = com.google.android.material.C31076a.C31091o.ShapeableImageView_contentPaddingEnd
            int r7 = r2.getDimensionPixelSize(r7, r4)
            r6.f75731L0 = r7
            r2.recycle()
            android.graphics.Paint r7 = new android.graphics.Paint
            r7.<init>()
            r6.f75736g = r7
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r7.setStyle(r2)
            r7.setAntiAlias(r3)
            com.google.android.material.shape.o$b r7 = com.google.android.material.shape.C31534o.m127565e(r1, r8, r9, r0)
            com.google.android.material.shape.o r7 = r7.mo90843m()
            r6.f75741z = r7
            com.google.android.material.imageview.ShapeableImageView$a r7 = new com.google.android.material.imageview.ShapeableImageView$a
            r7.<init>()
            r6.setOutlineProvider(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.imageview.ShapeableImageView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}

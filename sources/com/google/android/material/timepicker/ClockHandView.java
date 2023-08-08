package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.C0363p0;
import androidx.annotation.C0366r;
import androidx.annotation.C0372t0;
import androidx.annotation.C0379x;
import androidx.core.view.C18196h2;
import com.google.android.material.C31076a;
import java.util.ArrayList;
import java.util.List;

class ClockHandView extends View {

    /* renamed from: J0 */
    public static final int f77096J0 = 200;

    /* renamed from: E0 */
    public float f77097E0;

    /* renamed from: F0 */
    public boolean f77098F0;

    /* renamed from: G0 */
    public C31690c f77099G0;

    /* renamed from: H0 */
    public double f77100H0;

    /* renamed from: I0 */
    public int f77101I0;

    /* renamed from: a */
    public ValueAnimator f77102a;

    /* renamed from: b */
    public boolean f77103b;

    /* renamed from: c */
    public float f77104c;

    /* renamed from: d */
    public float f77105d;

    /* renamed from: e */
    public boolean f77106e;

    /* renamed from: f */
    public int f77107f;

    /* renamed from: g */
    public final List<C31691d> f77108g;

    /* renamed from: v */
    public final int f77109v;

    /* renamed from: w */
    public final float f77110w;

    /* renamed from: x */
    public final Paint f77111x;

    /* renamed from: y */
    public final RectF f77112y;
    @C0372t0

    /* renamed from: z */
    public final int f77113z;

    /* renamed from: com.google.android.material.timepicker.ClockHandView$a */
    public class C31688a implements ValueAnimator.AnimatorUpdateListener {
        public C31688a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ClockHandView.this.mo91888n(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
        }
    }

    /* renamed from: com.google.android.material.timepicker.ClockHandView$b */
    public class C31689b extends AnimatorListenerAdapter {
        public C31689b() {
        }

        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    /* renamed from: com.google.android.material.timepicker.ClockHandView$c */
    public interface C31690c {
        /* renamed from: d */
        void mo91895d(@C0379x(from = 0.0d, mo1016to = 360.0d) float f, boolean z);
    }

    /* renamed from: com.google.android.material.timepicker.ClockHandView$d */
    public interface C31691d {
        /* renamed from: g */
        void mo91871g(@C0379x(from = 0.0d, mo1016to = 360.0d) float f, boolean z);
    }

    public ClockHandView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: b */
    public void mo91876b(C31691d dVar) {
        this.f77108g.add(dVar);
    }

    /* renamed from: c */
    public final void mo91877c(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = (float) width;
        float f2 = (float) height;
        this.f77111x.setStrokeWidth(0.0f);
        canvas.drawCircle((((float) this.f77101I0) * ((float) Math.cos(this.f77100H0))) + f, (((float) this.f77101I0) * ((float) Math.sin(this.f77100H0))) + f2, (float) this.f77109v, this.f77111x);
        double sin = Math.sin(this.f77100H0);
        double cos = Math.cos(this.f77100H0);
        double d = (double) ((float) (this.f77101I0 - this.f77109v));
        float f3 = (float) (width + ((int) (cos * d)));
        float f4 = (float) (height + ((int) (d * sin)));
        this.f77111x.setStrokeWidth((float) this.f77113z);
        canvas.drawLine(f, f2, f3, f4, this.f77111x);
        canvas.drawCircle(f, f2, this.f77110w, this.f77111x);
    }

    /* renamed from: d */
    public RectF mo91878d() {
        return this.f77112y;
    }

    /* renamed from: e */
    public final int mo91879e(float f, float f2) {
        int degrees = ((int) Math.toDegrees(Math.atan2((double) (f2 - ((float) (getHeight() / 2))), (double) (f - ((float) (getWidth() / 2)))))) + 90;
        if (degrees < 0) {
            return degrees + 360;
        }
        return degrees;
    }

    @C0379x(from = 0.0d, mo1016to = 360.0d)
    /* renamed from: f */
    public float mo91880f() {
        return this.f77097E0;
    }

    /* renamed from: g */
    public int mo91881g() {
        return this.f77109v;
    }

    /* renamed from: h */
    public final Pair<Float, Float> mo91882h(float f) {
        float f2 = mo91880f();
        if (Math.abs(f2 - f) > 180.0f) {
            if (f2 > 180.0f && f < 180.0f) {
                f += 360.0f;
            }
            if (f2 < 180.0f && f > 180.0f) {
                f2 += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(f2), Float.valueOf(f));
    }

    /* renamed from: i */
    public final boolean mo91883i(float f, float f2, boolean z, boolean z2, boolean z3) {
        boolean z4;
        float e = (float) mo91879e(f, f2);
        boolean z5 = false;
        if (mo91880f() != e) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z2 && z4) {
            return true;
        }
        if (!z4 && !z) {
            return false;
        }
        if (z3 && this.f77103b) {
            z5 = true;
        }
        mo91887m(e, z5);
        return true;
    }

    /* renamed from: j */
    public void mo91884j(boolean z) {
        this.f77103b = z;
    }

    /* renamed from: k */
    public void mo91885k(@C0366r int i) {
        this.f77101I0 = i;
        invalidate();
    }

    /* renamed from: l */
    public void mo91886l(@C0379x(from = 0.0d, mo1016to = 360.0d) float f) {
        mo91887m(f, false);
    }

    /* renamed from: m */
    public void mo91887m(@C0379x(from = 0.0d, mo1016to = 360.0d) float f, boolean z) {
        ValueAnimator valueAnimator = this.f77102a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            mo91888n(f, false);
            return;
        }
        Pair<Float, Float> h = mo91882h(f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{((Float) h.first).floatValue(), ((Float) h.second).floatValue()});
        this.f77102a = ofFloat;
        ofFloat.setDuration(200);
        this.f77102a.addUpdateListener(new C31688a());
        this.f77102a.addListener(new C31689b());
        this.f77102a.start();
    }

    /* renamed from: n */
    public final void mo91888n(@C0379x(from = 0.0d, mo1016to = 360.0d) float f, boolean z) {
        float f2 = f % 360.0f;
        this.f77097E0 = f2;
        this.f77100H0 = Math.toRadians((double) (f2 - 90.0f));
        float width = ((float) (getWidth() / 2)) + (((float) this.f77101I0) * ((float) Math.cos(this.f77100H0)));
        float height = ((float) (getHeight() / 2)) + (((float) this.f77101I0) * ((float) Math.sin(this.f77100H0)));
        RectF rectF = this.f77112y;
        int i = this.f77109v;
        rectF.set(width - ((float) i), height - ((float) i), width + ((float) i), height + ((float) i));
        for (C31691d g : this.f77108g) {
            g.mo91871g(f2, z);
        }
        invalidate();
    }

    /* renamed from: o */
    public void mo91889o(C31690c cVar) {
        this.f77099G0 = cVar;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mo91877c(canvas);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        mo91886l(mo91880f());
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        C31690c cVar;
        boolean z4;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (actionMasked == 0) {
            this.f77104c = x;
            this.f77105d = y;
            this.f77106e = true;
            this.f77098F0 = false;
            z3 = false;
            z2 = false;
            z = true;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i = (int) (x - this.f77104c);
            int i2 = (int) (y - this.f77105d);
            if ((i * i) + (i2 * i2) > this.f77107f) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.f77106e = z4;
            boolean z5 = this.f77098F0;
            if (actionMasked == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            z = false;
            z2 = z5;
        } else {
            z3 = false;
            z2 = false;
            z = false;
        }
        boolean i3 = mo91883i(x, y, z2, z, z3) | this.f77098F0;
        this.f77098F0 = i3;
        if (i3 && z3 && (cVar = this.f77099G0) != null) {
            cVar.mo91895d((float) mo91879e(x, y), this.f77106e);
        }
        return true;
    }

    public ClockHandView(Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C31076a.C31079c.materialClockStyle);
    }

    public ClockHandView(Context context, @C0363p0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f77108g = new ArrayList();
        Paint paint = new Paint();
        this.f77111x = paint;
        this.f77112y = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C31076a.C31091o.ClockHandView, i, C31076a.C31090n.Widget_MaterialComponents_TimePicker_Clock);
        this.f77101I0 = obtainStyledAttributes.getDimensionPixelSize(C31076a.C31091o.ClockHandView_materialCircleRadius, 0);
        this.f77109v = obtainStyledAttributes.getDimensionPixelSize(C31076a.C31091o.ClockHandView_selectorSize, 0);
        Resources resources = getResources();
        this.f77113z = resources.getDimensionPixelSize(C31076a.C31082f.material_clock_hand_stroke_width);
        this.f77110w = (float) resources.getDimensionPixelSize(C31076a.C31082f.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(C31076a.C31091o.ClockHandView_clockHandColor, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        mo91886l(0.0f);
        this.f77107f = ViewConfiguration.get(context).getScaledTouchSlop();
        C18196h2.m82531R1(this, 2);
        obtainStyledAttributes.recycle();
    }
}

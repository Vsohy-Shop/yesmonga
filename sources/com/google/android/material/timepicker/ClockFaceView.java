package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.annotation.C0324b1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0379x;
import androidx.appcompat.content.res.C0507a;
import androidx.core.view.C18019a;
import androidx.core.view.C18196h2;
import androidx.core.view.accessibility.C18065l0;
import com.google.android.material.C31076a;
import com.google.android.material.resources.C31500c;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Arrays;

class ClockFaceView extends C31707d implements ClockHandView.C31691d {

    /* renamed from: K0 */
    public static final float f77077K0 = 0.001f;

    /* renamed from: L0 */
    public static final int f77078L0 = 12;

    /* renamed from: M0 */
    public static final String f77079M0 = "";

    /* renamed from: E0 */
    public final int f77080E0;

    /* renamed from: F0 */
    public final int f77081F0;

    /* renamed from: G0 */
    public final int f77082G0;

    /* renamed from: H0 */
    public String[] f77083H0;

    /* renamed from: I0 */
    public float f77084I0;

    /* renamed from: J0 */
    public final ColorStateList f77085J0;

    /* renamed from: e */
    public final ClockHandView f77086e;

    /* renamed from: f */
    public final Rect f77087f;

    /* renamed from: g */
    public final RectF f77088g;

    /* renamed from: v */
    public final SparseArray<TextView> f77089v;

    /* renamed from: w */
    public final C18019a f77090w;

    /* renamed from: x */
    public final int[] f77091x;

    /* renamed from: y */
    public final float[] f77092y;

    /* renamed from: z */
    public final int f77093z;

    /* renamed from: com.google.android.material.timepicker.ClockFaceView$a */
    public class C31686a implements ViewTreeObserver.OnPreDrawListener {
        public C31686a() {
        }

        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.mo91874w(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.f77086e.mo91881g()) - ClockFaceView.this.f77093z);
            return true;
        }
    }

    /* renamed from: com.google.android.material.timepicker.ClockFaceView$b */
    public class C31687b extends C18019a {
        public C31687b() {
        }

        /* renamed from: g */
        public void mo19938g(View view, @C0359n0 C18065l0 l0Var) {
            super.mo19938g(view, l0Var);
            int intValue = ((Integer) view.getTag(C31076a.C31084h.material_value_index)).intValue();
            if (intValue > 0) {
                l0Var.mo52578U1((View) ClockFaceView.this.f77089v.get(intValue - 1));
            }
            l0Var.mo52604c1(C18065l0.C18069d.m82106h(0, 1, intValue, 1, false, view.isSelected()));
            l0Var.mo52596a1(true);
            l0Var.mo52598b(C18065l0.C18066a.f46673j);
        }

        /* renamed from: j */
        public boolean mo19939j(View view, int i, Bundle bundle) {
            if (i != 16) {
                return super.mo19939j(view, i, bundle);
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            float x = view.getX() + (((float) view.getWidth()) / 2.0f);
            long j = uptimeMillis;
            float f = x;
            float height = (((float) view.getHeight()) / 2.0f) + view.getY();
            ClockFaceView.this.f77086e.onTouchEvent(MotionEvent.obtain(uptimeMillis, j, 0, f, height, 0));
            ClockFaceView.this.f77086e.onTouchEvent(MotionEvent.obtain(uptimeMillis, j, 1, f, height, 0));
            return true;
        }
    }

    public ClockFaceView(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: F */
    public static float m128469F(float f, float f2, float f3) {
        return Math.max(Math.max(f, f2), f3);
    }

    /* renamed from: D */
    public final void mo91867D() {
        RectF d = this.f77086e.mo91878d();
        for (int i = 0; i < this.f77089v.size(); i++) {
            TextView textView = this.f77089v.get(i);
            if (textView != null) {
                textView.getDrawingRect(this.f77087f);
                offsetDescendantRectToMyCoords(textView, this.f77087f);
                textView.setSelected(d.contains((float) this.f77087f.centerX(), (float) this.f77087f.centerY()));
                textView.getPaint().setShader(mo91868E(d, this.f77087f, textView));
                textView.invalidate();
            }
        }
    }

    @C0363p0
    /* renamed from: E */
    public final RadialGradient mo91868E(RectF rectF, Rect rect, TextView textView) {
        this.f77088g.set(rect);
        this.f77088g.offset((float) textView.getPaddingLeft(), (float) textView.getPaddingTop());
        if (!RectF.intersects(rectF, this.f77088g)) {
            return null;
        }
        return new RadialGradient(rectF.centerX() - this.f77088g.left, rectF.centerY() - this.f77088g.top, rectF.width() * 0.5f, this.f77091x, this.f77092y, Shader.TileMode.CLAMP);
    }

    /* renamed from: G */
    public final void mo91869G(@C0324b1 int i) {
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = this.f77089v.size();
        for (int i2 = 0; i2 < Math.max(this.f77083H0.length, size); i2++) {
            TextView textView = this.f77089v.get(i2);
            if (i2 >= this.f77083H0.length) {
                removeView(textView);
                this.f77089v.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(C31076a.C31087k.material_clockface_textview, this, false);
                    this.f77089v.put(i2, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.f77083H0[i2]);
                textView.setTag(C31076a.C31084h.material_value_index, Integer.valueOf(i2));
                C18196h2.m82474B1(textView, this.f77090w);
                textView.setTextColor(this.f77085J0);
                if (i != 0) {
                    textView.setContentDescription(getResources().getString(i, new Object[]{this.f77083H0[i2]}));
                }
            }
        }
    }

    /* renamed from: c */
    public void mo91870c(String[] strArr, @C0324b1 int i) {
        this.f77083H0 = strArr;
        mo91869G(i);
    }

    /* renamed from: g */
    public void mo91871g(float f, boolean z) {
        if (Math.abs(this.f77084I0 - f) > 0.001f) {
            this.f77084I0 = f;
            mo91867D();
        }
    }

    /* renamed from: h */
    public void mo91872h(@C0379x(from = 0.0d, mo1016to = 360.0d) float f) {
        this.f77086e.mo91886l(f);
        mo91867D();
    }

    public void onInitializeAccessibilityNodeInfo(@C0359n0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C18065l0.m81936c2(accessibilityNodeInfo).mo52600b1(C18065l0.C18068c.m82100f(1, this.f77083H0.length, false, 1));
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        mo91867D();
    }

    public void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int F = (int) (((float) this.f77082G0) / m128469F(((float) this.f77080E0) / ((float) displayMetrics.heightPixels), ((float) this.f77081F0) / ((float) displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(F, 1073741824);
        setMeasuredDimension(F, F);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    /* renamed from: w */
    public void mo91874w(int i) {
        if (i != mo91984v()) {
            super.mo91874w(i);
            this.f77086e.mo91885k(mo91984v());
        }
    }

    public ClockFaceView(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C31076a.C31079c.materialClockStyle);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f77087f = new Rect();
        this.f77088g = new RectF();
        this.f77089v = new SparseArray<>();
        this.f77092y = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C31076a.C31091o.ClockFaceView, i, C31076a.C31090n.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList a = C31500c.m127363a(context, obtainStyledAttributes, C31076a.C31091o.ClockFaceView_clockNumberTextColor);
        this.f77085J0 = a;
        LayoutInflater.from(context).inflate(C31076a.C31087k.material_clockface_view, this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(C31076a.C31084h.material_clock_hand);
        this.f77086e = clockHandView;
        this.f77093z = resources.getDimensionPixelSize(C31076a.C31082f.material_clock_hand_padding);
        int colorForState = a.getColorForState(new int[]{16842913}, a.getDefaultColor());
        this.f77091x = new int[]{colorForState, colorForState, a.getDefaultColor()};
        clockHandView.mo91876b(this);
        int defaultColor = C0507a.m2345a(context, C31076a.C31081e.material_timepicker_clockface).getDefaultColor();
        ColorStateList a2 = C31500c.m127363a(context, obtainStyledAttributes, C31076a.C31091o.ClockFaceView_clockFaceBackgroundColor);
        setBackgroundColor(a2 != null ? a2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new C31686a());
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f77090w = new C31687b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        mo91870c(strArr, 0);
        this.f77080E0 = resources.getDimensionPixelSize(C31076a.C31082f.material_time_picker_minimum_screen_height);
        this.f77081F0 = resources.getDimensionPixelSize(C31076a.C31082f.material_time_picker_minimum_screen_width);
        this.f77082G0 = resources.getDimensionPixelSize(C31076a.C31082f.material_clock_size);
    }
}

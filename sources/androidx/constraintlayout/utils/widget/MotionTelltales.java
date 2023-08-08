package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewParent;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C16944e;

public class MotionTelltales extends MockView {

    /* renamed from: K0 */
    public static final String f44154K0 = "MotionTelltales";

    /* renamed from: E0 */
    public MotionLayout f44155E0;

    /* renamed from: F0 */
    public float[] f44156F0 = new float[2];

    /* renamed from: G0 */
    public Matrix f44157G0 = new Matrix();

    /* renamed from: H0 */
    public int f44158H0 = 0;

    /* renamed from: I0 */
    public int f44159I0 = -65281;

    /* renamed from: J0 */
    public float f44160J0 = 0.25f;

    /* renamed from: z */
    public Paint f44161z = new Paint();

    public MotionTelltales(Context context) {
        super(context);
        m78198a(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private void m78198a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C16944e.C16957m.MotionTelltales);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C16944e.C16957m.MotionTelltales_telltales_tailColor) {
                    this.f44159I0 = obtainStyledAttributes.getColor(index, this.f44159I0);
                } else if (index == C16944e.C16957m.MotionTelltales_telltales_velocityMode) {
                    this.f44158H0 = obtainStyledAttributes.getInt(index, this.f44158H0);
                } else if (index == C16944e.C16957m.MotionTelltales_telltales_tailScale) {
                    this.f44160J0 = obtainStyledAttributes.getFloat(index, this.f44160J0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f44161z.setColor(this.f44159I0);
        this.f44161z.setStrokeWidth(5.0f);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getMatrix().invert(this.f44157G0);
        if (this.f44155E0 == null) {
            ViewParent parent = getParent();
            if (parent instanceof MotionLayout) {
                this.f44155E0 = (MotionLayout) parent;
                return;
            }
            return;
        }
        int width = getWidth();
        int height = getHeight();
        float[] fArr = {0.1f, 0.25f, 0.5f, 0.75f, 0.9f};
        for (int i = 0; i < 5; i++) {
            float f = fArr[i];
            for (int i2 = 0; i2 < 5; i2++) {
                float f2 = fArr[i2];
                this.f44155E0.mo50036s0(this, f2, f, this.f44156F0, this.f44158H0);
                this.f44157G0.mapVectors(this.f44156F0);
                float f3 = ((float) width) * f2;
                float f4 = ((float) height) * f;
                float[] fArr2 = this.f44156F0;
                float f5 = fArr2[0];
                float f6 = this.f44160J0;
                float f7 = f4 - (fArr2[1] * f6);
                this.f44157G0.mapVectors(fArr2);
                canvas.drawLine(f3, f4, f3 - (f5 * f6), f7, this.f44161z);
            }
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        postInvalidate();
    }

    public void setText(CharSequence charSequence) {
        this.f44087f = charSequence.toString();
        requestLayout();
    }

    public MotionTelltales(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m78198a(context, attributeSet);
    }

    public MotionTelltales(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m78198a(context, attributeSet);
    }
}

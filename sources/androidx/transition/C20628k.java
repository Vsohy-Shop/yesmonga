package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.transition.C20538b0;

/* renamed from: androidx.transition.k */
public class C20628k extends C20658p1 {

    /* renamed from: s1 */
    public static final TimeInterpolator f53206s1 = new DecelerateInterpolator();

    /* renamed from: t1 */
    public static final TimeInterpolator f53207t1 = new AccelerateInterpolator();

    /* renamed from: u1 */
    public static final String f53208u1 = "android:explode:screenBounds";

    /* renamed from: r1 */
    public int[] f53209r1 = new int[2];

    public C20628k() {
        mo61727R0(new C20625j());
    }

    /* renamed from: V0 */
    private void m95923V0(C20657p0 p0Var) {
        View view = p0Var.f53280b;
        view.getLocationOnScreen(this.f53209r1);
        int[] iArr = this.f53209r1;
        int i = iArr[0];
        int i2 = iArr[1];
        p0Var.f53279a.put(f53208u1, new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2));
    }

    /* renamed from: e1 */
    public static float m95924e1(float f, float f2) {
        return (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
    }

    /* renamed from: f1 */
    public static float m95925f1(View view, int i, int i2) {
        return m95924e1((float) Math.max(i, view.getWidth() - i), (float) Math.max(i2, view.getHeight() - i2));
    }

    @C0363p0
    /* renamed from: Z0 */
    public Animator mo61679Z0(ViewGroup viewGroup, View view, C20657p0 p0Var, C20657p0 p0Var2) {
        if (p0Var2 == null) {
            return null;
        }
        Rect rect = (Rect) p0Var2.f53279a.get(f53208u1);
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        mo61813g1(viewGroup, rect, this.f53209r1);
        int[] iArr = this.f53209r1;
        return C20668r0.m96120a(view, p0Var2, rect.left, rect.top, translationX + ((float) iArr[0]), translationY + ((float) iArr[1]), translationX, translationY, f53206s1, this);
    }

    @C0363p0
    /* renamed from: b1 */
    public Animator mo61680b1(ViewGroup viewGroup, View view, C20657p0 p0Var, C20657p0 p0Var2) {
        float f;
        float f2;
        if (p0Var == null) {
            return null;
        }
        Rect rect = (Rect) p0Var.f53279a.get(f53208u1);
        int i = rect.left;
        int i2 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) p0Var.f53280b.getTag(C20538b0.C20545g.transition_position);
        if (iArr != null) {
            int i3 = iArr[0];
            f2 = ((float) (i3 - rect.left)) + translationX;
            int i4 = iArr[1];
            f = ((float) (i4 - rect.top)) + translationY;
            rect.offsetTo(i3, i4);
        } else {
            f2 = translationX;
            f = translationY;
        }
        mo61813g1(viewGroup, rect, this.f53209r1);
        int[] iArr2 = this.f53209r1;
        return C20668r0.m96120a(view, p0Var, i, i2, translationX, translationY, f2 + ((float) iArr2[0]), f + ((float) iArr2[1]), f53207t1, this);
    }

    /* renamed from: g1 */
    public final void mo61813g1(View view, Rect rect, int[] iArr) {
        int i;
        int i2;
        View view2 = view;
        view2.getLocationOnScreen(this.f53209r1);
        int[] iArr2 = this.f53209r1;
        int i3 = iArr2[0];
        int i4 = iArr2[1];
        Rect R = mo61726R();
        if (R == null) {
            i2 = (view.getWidth() / 2) + i3 + Math.round(view.getTranslationX());
            i = (view.getHeight() / 2) + i4 + Math.round(view.getTranslationY());
        } else {
            int centerX = R.centerX();
            i = R.centerY();
            i2 = centerX;
        }
        float centerX2 = (float) (rect.centerX() - i2);
        float centerY = (float) (rect.centerY() - i);
        if (centerX2 == 0.0f && centerY == 0.0f) {
            centerX2 = ((float) (Math.random() * 2.0d)) - 1.0f;
            centerY = ((float) (Math.random() * 2.0d)) - 1.0f;
        }
        float e1 = m95924e1(centerX2, centerY);
        float f1 = m95925f1(view2, i2 - i3, i - i4);
        iArr[0] = Math.round((centerX2 / e1) * f1);
        iArr[1] = Math.round(f1 * (centerY / e1));
    }

    /* renamed from: m */
    public void mo61635m(@C0359n0 C20657p0 p0Var) {
        super.mo61635m(p0Var);
        m95923V0(p0Var);
    }

    /* renamed from: s */
    public void mo61636s(@C0359n0 C20657p0 p0Var) {
        super.mo61636s(p0Var);
        m95923V0(p0Var);
    }

    public C20628k(@C0359n0 Context context, @C0359n0 AttributeSet attributeSet) {
        super(context, attributeSet);
        mo61727R0(new C20625j());
    }
}

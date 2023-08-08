package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;

/* renamed from: androidx.transition.h */
public class C20605h extends C20606h0 {

    /* renamed from: k1 */
    public static final String f53105k1 = "android:changeScroll:x";

    /* renamed from: l1 */
    public static final String f53106l1 = "android:changeScroll:y";

    /* renamed from: m1 */
    public static final String[] f53107m1 = {f53105k1, f53106l1};

    public C20605h() {
    }

    /* renamed from: V0 */
    public final void mo61698V0(C20657p0 p0Var) {
        p0Var.f53279a.put(f53105k1, Integer.valueOf(p0Var.f53280b.getScrollX()));
        p0Var.f53279a.put(f53106l1, Integer.valueOf(p0Var.f53280b.getScrollY()));
    }

    @C0363p0
    /* renamed from: i0 */
    public String[] mo61634i0() {
        return f53107m1;
    }

    /* renamed from: m */
    public void mo61635m(@C0359n0 C20657p0 p0Var) {
        mo61698V0(p0Var);
    }

    /* renamed from: s */
    public void mo61636s(@C0359n0 C20657p0 p0Var) {
        mo61698V0(p0Var);
    }

    @C0363p0
    /* renamed from: x */
    public Animator mo61637x(@C0359n0 ViewGroup viewGroup, @C0363p0 C20657p0 p0Var, @C0363p0 C20657p0 p0Var2) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = null;
        if (p0Var == null || p0Var2 == null) {
            return null;
        }
        View view = p0Var2.f53280b;
        int intValue = ((Integer) p0Var.f53279a.get(f53105k1)).intValue();
        int intValue2 = ((Integer) p0Var2.f53279a.get(f53105k1)).intValue();
        int intValue3 = ((Integer) p0Var.f53279a.get(f53106l1)).intValue();
        int intValue4 = ((Integer) p0Var2.f53279a.get(f53106l1)).intValue();
        if (intValue != intValue2) {
            view.setScrollX(intValue);
            objectAnimator = ObjectAnimator.ofInt(view, "scrollX", new int[]{intValue, intValue2});
        } else {
            objectAnimator = null;
        }
        if (intValue3 != intValue4) {
            view.setScrollY(intValue3);
            objectAnimator2 = ObjectAnimator.ofInt(view, "scrollY", new int[]{intValue3, intValue4});
        }
        return C20653o0.m96057c(objectAnimator, objectAnimator2);
    }

    public C20605h(@C0359n0 Context context, @C0359n0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

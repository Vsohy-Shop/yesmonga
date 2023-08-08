package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;

/* renamed from: androidx.core.view.w1 */
public class C18400w1 {

    /* renamed from: a */
    public int f47076a;

    /* renamed from: b */
    public int f47077b;

    public C18400w1(@C0359n0 ViewGroup viewGroup) {
    }

    /* renamed from: a */
    public int mo53039a() {
        return this.f47076a | this.f47077b;
    }

    /* renamed from: b */
    public void mo53040b(@C0359n0 View view, @C0359n0 View view2, int i) {
        mo53041c(view, view2, i, 0);
    }

    /* renamed from: c */
    public void mo53041c(@C0359n0 View view, @C0359n0 View view2, int i, int i2) {
        if (i2 == 1) {
            this.f47077b = i;
        } else {
            this.f47076a = i;
        }
    }

    /* renamed from: d */
    public void mo53042d(@C0359n0 View view) {
        mo53043e(view, 0);
    }

    /* renamed from: e */
    public void mo53043e(@C0359n0 View view, int i) {
        if (i == 1) {
            this.f47077b = 0;
        } else {
            this.f47076a = 0;
        }
    }
}

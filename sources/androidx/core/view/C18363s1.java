package androidx.core.view;

import android.view.View;
import android.view.ViewParent;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;

/* renamed from: androidx.core.view.s1 */
public class C18363s1 {

    /* renamed from: a */
    public ViewParent f47054a;

    /* renamed from: b */
    public ViewParent f47055b;

    /* renamed from: c */
    public final View f47056c;

    /* renamed from: d */
    public boolean f47057d;

    /* renamed from: e */
    public int[] f47058e;

    public C18363s1(@C0359n0 View view) {
        this.f47056c = view;
    }

    /* renamed from: a */
    public boolean mo53009a(float f, float f2, boolean z) {
        ViewParent i;
        if (!mo53021m() || (i = mo53017i(0)) == null) {
            return false;
        }
        return C18386u3.m83183c(i, this.f47056c, f, f2, z);
    }

    /* renamed from: b */
    public boolean mo53010b(float f, float f2) {
        ViewParent i;
        if (!mo53021m() || (i = mo53017i(0)) == null) {
            return false;
        }
        return C18386u3.m83184d(i, this.f47056c, f, f2);
    }

    /* renamed from: c */
    public boolean mo53011c(int i, int i2, @C0363p0 int[] iArr, @C0363p0 int[] iArr2) {
        return mo53012d(i, i2, iArr, iArr2, 0);
    }

    /* renamed from: d */
    public boolean mo53012d(int i, int i2, @C0363p0 int[] iArr, @C0363p0 int[] iArr2, int i3) {
        ViewParent i4;
        int i5;
        int i6;
        if (!mo53021m() || (i4 = mo53017i(i3)) == null) {
            return false;
        }
        if (i != 0 || i2 != 0) {
            if (iArr2 != null) {
                this.f47056c.getLocationInWindow(iArr2);
                i6 = iArr2[0];
                i5 = iArr2[1];
            } else {
                i6 = 0;
                i5 = 0;
            }
            if (iArr == null) {
                iArr = mo53018j();
            }
            iArr[0] = 0;
            iArr[1] = 0;
            C18386u3.m83186f(i4, this.f47056c, i, i2, iArr, i3);
            if (iArr2 != null) {
                this.f47056c.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i6;
                iArr2[1] = iArr2[1] - i5;
            }
            if (iArr[0] == 0 && iArr[1] == 0) {
                return false;
            }
            return true;
        } else if (iArr2 == null) {
            return false;
        } else {
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
    }

    /* renamed from: e */
    public void mo53013e(int i, int i2, int i3, int i4, @C0363p0 int[] iArr, int i5, @C0363p0 int[] iArr2) {
        mo53016h(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: f */
    public boolean mo53014f(int i, int i2, int i3, int i4, @C0363p0 int[] iArr) {
        return mo53016h(i, i2, i3, i4, iArr, 0, (int[]) null);
    }

    /* renamed from: g */
    public boolean mo53015g(int i, int i2, int i3, int i4, @C0363p0 int[] iArr, int i5) {
        return mo53016h(i, i2, i3, i4, iArr, i5, (int[]) null);
    }

    /* renamed from: h */
    public final boolean mo53016h(int i, int i2, int i3, int i4, @C0363p0 int[] iArr, int i5, @C0363p0 int[] iArr2) {
        ViewParent i6;
        int i7;
        int i8;
        int[] iArr3;
        int[] iArr4 = iArr;
        if (!mo53021m() || (i6 = mo53017i(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
            return false;
        }
        if (iArr4 != null) {
            this.f47056c.getLocationInWindow(iArr4);
            i8 = iArr4[0];
            i7 = iArr4[1];
        } else {
            i8 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            int[] j = mo53018j();
            j[0] = 0;
            j[1] = 0;
            iArr3 = j;
        } else {
            iArr3 = iArr2;
        }
        C18386u3.m83189i(i6, this.f47056c, i, i2, i3, i4, i5, iArr3);
        if (iArr4 != null) {
            this.f47056c.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i8;
            iArr4[1] = iArr4[1] - i7;
        }
        return true;
    }

    /* renamed from: i */
    public final ViewParent mo53017i(int i) {
        if (i == 0) {
            return this.f47054a;
        }
        if (i != 1) {
            return null;
        }
        return this.f47055b;
    }

    /* renamed from: j */
    public final int[] mo53018j() {
        if (this.f47058e == null) {
            this.f47058e = new int[2];
        }
        return this.f47058e;
    }

    /* renamed from: k */
    public boolean mo53019k() {
        return mo53020l(0);
    }

    /* renamed from: l */
    public boolean mo53020l(int i) {
        return mo53017i(i) != null;
    }

    /* renamed from: m */
    public boolean mo53021m() {
        return this.f47057d;
    }

    /* renamed from: n */
    public void mo53022n() {
        C18196h2.m82495G2(this.f47056c);
    }

    /* renamed from: o */
    public void mo53023o(@C0359n0 View view) {
        C18196h2.m82495G2(this.f47056c);
    }

    /* renamed from: p */
    public void mo53024p(boolean z) {
        if (this.f47057d) {
            C18196h2.m82495G2(this.f47056c);
        }
        this.f47057d = z;
    }

    /* renamed from: q */
    public final void mo53025q(int i, ViewParent viewParent) {
        if (i == 0) {
            this.f47054a = viewParent;
        } else if (i == 1) {
            this.f47055b = viewParent;
        }
    }

    /* renamed from: r */
    public boolean mo53026r(int i) {
        return mo53027s(i, 0);
    }

    /* renamed from: s */
    public boolean mo53027s(int i, int i2) {
        if (mo53020l(i2)) {
            return true;
        }
        if (!mo53021m()) {
            return false;
        }
        View view = this.f47056c;
        for (ViewParent parent = this.f47056c.getParent(); parent != null; parent = parent.getParent()) {
            if (C18386u3.m83193m(parent, view, this.f47056c, i, i2)) {
                mo53025q(i2, parent);
                C18386u3.m83191k(parent, view, this.f47056c, i, i2);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    /* renamed from: t */
    public void mo53028t() {
        mo53029u(0);
    }

    /* renamed from: u */
    public void mo53029u(int i) {
        ViewParent i2 = mo53017i(i);
        if (i2 != null) {
            C18386u3.m83195o(i2, this.f47056c, i);
            mo53025q(i, (ViewParent) null);
        }
    }
}

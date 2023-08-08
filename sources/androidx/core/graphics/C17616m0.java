package androidx.core.graphics;

import android.graphics.Insets;
import android.graphics.Rect;
import androidx.annotation.C0359n0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: androidx.core.graphics.m0 */
public final class C17616m0 {
    @C0359n0

    /* renamed from: e */
    public static final C17616m0 f45994e = new C17616m0(0, 0, 0, 0);

    /* renamed from: a */
    public final int f45995a;

    /* renamed from: b */
    public final int f45996b;

    /* renamed from: c */
    public final int f45997c;

    /* renamed from: d */
    public final int f45998d;

    @C0376v0(29)
    /* renamed from: androidx.core.graphics.m0$a */
    public static class C17617a {
        @C0373u
        /* renamed from: a */
        public static Insets m80703a(int i, int i2, int i3, int i4) {
            return Insets.of(i, i2, i3, i4);
        }
    }

    public C17616m0(int i, int i2, int i3, int i4) {
        this.f45995a = i;
        this.f45996b = i2;
        this.f45997c = i3;
        this.f45998d = i4;
    }

    @C0359n0
    /* renamed from: a */
    public static C17616m0 m80694a(@C0359n0 C17616m0 m0Var, @C0359n0 C17616m0 m0Var2) {
        return m80697d(m0Var.f45995a + m0Var2.f45995a, m0Var.f45996b + m0Var2.f45996b, m0Var.f45997c + m0Var2.f45997c, m0Var.f45998d + m0Var2.f45998d);
    }

    @C0359n0
    /* renamed from: b */
    public static C17616m0 m80695b(@C0359n0 C17616m0 m0Var, @C0359n0 C17616m0 m0Var2) {
        return m80697d(Math.max(m0Var.f45995a, m0Var2.f45995a), Math.max(m0Var.f45996b, m0Var2.f45996b), Math.max(m0Var.f45997c, m0Var2.f45997c), Math.max(m0Var.f45998d, m0Var2.f45998d));
    }

    @C0359n0
    /* renamed from: c */
    public static C17616m0 m80696c(@C0359n0 C17616m0 m0Var, @C0359n0 C17616m0 m0Var2) {
        return m80697d(Math.min(m0Var.f45995a, m0Var2.f45995a), Math.min(m0Var.f45996b, m0Var2.f45996b), Math.min(m0Var.f45997c, m0Var2.f45997c), Math.min(m0Var.f45998d, m0Var2.f45998d));
    }

    @C0359n0
    /* renamed from: d */
    public static C17616m0 m80697d(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return f45994e;
        }
        return new C17616m0(i, i2, i3, i4);
    }

    @C0359n0
    /* renamed from: e */
    public static C17616m0 m80698e(@C0359n0 Rect rect) {
        return m80697d(rect.left, rect.top, rect.right, rect.bottom);
    }

    @C0359n0
    /* renamed from: f */
    public static C17616m0 m80699f(@C0359n0 C17616m0 m0Var, @C0359n0 C17616m0 m0Var2) {
        return m80697d(m0Var.f45995a - m0Var2.f45995a, m0Var.f45996b - m0Var2.f45996b, m0Var.f45997c - m0Var2.f45997c, m0Var.f45998d - m0Var2.f45998d);
    }

    @C0359n0
    @C0376v0(api = 29)
    /* renamed from: g */
    public static C17616m0 m80700g(@C0359n0 Insets insets) {
        return m80697d(insets.left, insets.top, insets.right, insets.bottom);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @C0359n0
    @C0376v0(api = 29)
    @Deprecated
    /* renamed from: i */
    public static C17616m0 m80701i(@C0359n0 Insets insets) {
        return m80700g(insets);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C17616m0.class != obj.getClass()) {
            return false;
        }
        C17616m0 m0Var = (C17616m0) obj;
        if (this.f45998d == m0Var.f45998d && this.f45995a == m0Var.f45995a && this.f45997c == m0Var.f45997c && this.f45996b == m0Var.f45996b) {
            return true;
        }
        return false;
    }

    @C0359n0
    @C0376v0(29)
    /* renamed from: h */
    public Insets mo52063h() {
        return C17617a.m80703a(this.f45995a, this.f45996b, this.f45997c, this.f45998d);
    }

    public int hashCode() {
        return (((((this.f45995a * 31) + this.f45996b) * 31) + this.f45997c) * 31) + this.f45998d;
    }

    @C0359n0
    public String toString() {
        return "Insets{left=" + this.f45995a + ", top=" + this.f45996b + ", right=" + this.f45997c + ", bottom=" + this.f45998d + C12361b.f30259j;
    }
}

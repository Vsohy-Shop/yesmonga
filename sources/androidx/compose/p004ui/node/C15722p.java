package androidx.compose.p004ui.node;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.node.p */
public final class C15722p {
    @C12579k

    /* renamed from: a */
    public int[] f39046a;

    /* renamed from: b */
    public int f39047b;

    public C15722p(int i) {
        this.f39046a = new int[i];
    }

    /* renamed from: a */
    public final boolean mo45171a(int i, int i2) {
        int[] iArr = this.f39046a;
        int i3 = iArr[i];
        int i4 = iArr[i2];
        if (i3 < i4) {
            return true;
        }
        if (i3 != i4 || iArr[i + 1] > iArr[i2 + 1]) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo45172b() {
        return this.f39047b != 0;
    }

    /* renamed from: c */
    public final int mo45173c(int i, int i2, int i3) {
        int i4 = i - i3;
        while (i < i2) {
            if (mo45171a(i, i2)) {
                i4 += i3;
                mo45179i(i4, i);
            }
            i += i3;
        }
        int i5 = i4 + i3;
        mo45179i(i5, i2);
        return i5;
    }

    /* renamed from: d */
    public final int mo45174d() {
        int[] iArr = this.f39046a;
        int i = this.f39047b - 1;
        this.f39047b = i;
        return iArr[i];
    }

    /* renamed from: e */
    public final void mo45175e(int i, int i2, int i3) {
        int i4 = this.f39047b;
        int i5 = i4 + 3;
        int[] iArr = this.f39046a;
        if (i5 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f39046a = copyOf;
        }
        int[] iArr2 = this.f39046a;
        iArr2[i4 + 0] = i + i3;
        iArr2[i4 + 1] = i2 + i3;
        iArr2[i4 + 2] = i3;
        this.f39047b = i5;
    }

    /* renamed from: f */
    public final void mo45176f(int i, int i2, int i3, int i4) {
        int i5 = this.f39047b;
        int i6 = i5 + 4;
        int[] iArr = this.f39046a;
        if (i6 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f39046a = copyOf;
        }
        int[] iArr2 = this.f39046a;
        iArr2[i5 + 0] = i;
        iArr2[i5 + 1] = i2;
        iArr2[i5 + 2] = i3;
        iArr2[i5 + 3] = i4;
        this.f39047b = i6;
    }

    /* renamed from: g */
    public final void mo45177g(int i, int i2, int i3) {
        if (i < i2) {
            int c = mo45173c(i, i2, i3);
            mo45177g(i, c - i3, i3);
            mo45177g(c + i3, i2, i3);
        }
    }

    /* renamed from: h */
    public final void mo45178h() {
        boolean z;
        int i = this.f39047b;
        if (i % 3 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalStateException("Check failed.".toString());
        } else if (i > 3) {
            mo45177g(0, i - 3, 3);
        }
    }

    /* renamed from: i */
    public final void mo45179i(int i, int i2) {
        int[] iArr = this.f39046a;
        C15728r0.m70512i(iArr, i, i2);
        C15728r0.m70512i(iArr, i + 1, i2 + 1);
        C15728r0.m70512i(iArr, i + 2, i2 + 2);
    }
}

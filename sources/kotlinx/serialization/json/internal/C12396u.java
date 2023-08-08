package kotlinx.serialization.json.internal;

import androidx.constraintlayout.core.motion.utils.C16717v;
import java.util.Arrays;
import kotlin.jvm.C11287e;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.serialization.json.internal.u */
public class C12396u {
    @C12579k
    @C11287e

    /* renamed from: a */
    public char[] f30332a;

    /* renamed from: b */
    public int f30333b;

    public C12396u(@C12579k char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "array");
        this.f30332a = cArr;
    }

    /* renamed from: a */
    public final void mo25535a(char c) {
        mo25540f(1);
        char[] cArr = this.f30332a;
        int i = this.f30333b;
        this.f30333b = i + 1;
        cArr[i] = c;
    }

    /* renamed from: b */
    public final void mo25536b(long j) {
        mo25537c(String.valueOf(j));
    }

    /* renamed from: c */
    public final void mo25537c(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, C16717v.C16719b.f42182e);
        int length = str.length();
        mo25540f(length);
        str.getChars(0, str.length(), this.f30332a, this.f30333b);
        this.f30333b += length;
    }

    /* renamed from: d */
    public final void mo25538d(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, C16717v.C16719b.f42182e);
        mo25540f(str.length() + 2);
        char[] cArr = this.f30332a;
        int i = this.f30333b;
        int i2 = i + 1;
        cArr[i] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i2);
        int i3 = length + i2;
        int i4 = i2;
        while (i4 < i3) {
            int i5 = i4 + 1;
            char c = cArr[i4];
            if (c >= C12382k0.m50081a().length || C12382k0.m50081a()[c] == 0) {
                i4 = i5;
            } else {
                mo25539e(i4 - i2, i4, str);
                return;
            }
        }
        cArr[i3] = '\"';
        this.f30333b = i3 + 1;
    }

    /* renamed from: e */
    public final void mo25539e(int i, int i2, String str) {
        int i3;
        int length = str.length();
        while (i < length) {
            int i4 = i + 1;
            int g = mo25541g(i2, 2);
            char charAt = str.charAt(i);
            if (charAt < C12382k0.m50081a().length) {
                byte b = C12382k0.m50081a()[charAt];
                if (b == 0) {
                    i3 = g + 1;
                    this.f30332a[g] = (char) charAt;
                } else {
                    if (b == 1) {
                        String str2 = C12382k0.m50083c()[charAt];
                        Intrinsics.checkNotNull(str2);
                        int g2 = mo25541g(g, str2.length());
                        str2.getChars(0, str2.length(), this.f30332a, g2);
                        i2 = g2 + str2.length();
                        this.f30333b = i2;
                    } else {
                        char[] cArr = this.f30332a;
                        cArr[g] = '\\';
                        cArr[g + 1] = (char) b;
                        i2 = g + 2;
                        this.f30333b = i2;
                    }
                    i = i4;
                }
            } else {
                i3 = g + 1;
                this.f30332a[g] = (char) charAt;
            }
            i = i4;
            i2 = i3;
        }
        int g3 = mo25541g(i2, 1);
        this.f30332a[g3] = '\"';
        this.f30333b = g3 + 1;
    }

    /* renamed from: f */
    public final void mo25540f(int i) {
        mo25541g(this.f30333b, i);
    }

    /* renamed from: g */
    public int mo25541g(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = this.f30332a;
        if (cArr.length <= i3) {
            char[] copyOf = Arrays.copyOf(cArr, C11479u.m44447u(i3, i * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f30332a = copyOf;
        }
        return i;
    }

    /* renamed from: h */
    public final int mo25542h() {
        return this.f30333b;
    }

    /* renamed from: i */
    public void mo25543i() {
        C12367e.f30287a.mo25491a(this.f30332a);
    }

    /* renamed from: j */
    public final void mo25544j(int i) {
        this.f30333b = i;
    }

    @C12579k
    public String toString() {
        return new String(this.f30332a, 0, this.f30333b);
    }

    public C12396u() {
        this(C12367e.f30287a.mo25492b());
    }
}

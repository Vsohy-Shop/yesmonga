package androidx.compose.foundation.pager;

import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.foundation.pager.e */
public final class C2657e implements C2655d {

    /* renamed from: b */
    public final int f7029b;

    public C2657e(int i) {
        this.f7029b = i;
    }

    /* renamed from: a */
    public int mo9115a(int i, int i2, float f, int i3, int i4) {
        int i5 = this.f7029b;
        return C11479u.m44334I(i2, i - i5, i + i5);
    }

    public boolean equals(@C12580l Object obj) {
        if (!(obj instanceof C2657e) || this.f7029b != ((C2657e) obj).f7029b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Integer.hashCode(this.f7029b);
    }
}

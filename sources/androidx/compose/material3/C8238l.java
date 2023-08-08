package androidx.compose.material3;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8251n0
/* renamed from: androidx.compose.material3.l */
public final class C8238l implements Comparable<C8238l> {

    /* renamed from: a */
    public final int f20280a;

    /* renamed from: b */
    public final int f20281b;

    /* renamed from: c */
    public final int f20282c;

    /* renamed from: d */
    public final long f20283d;

    public C8238l(int i, int i2, int i3, long j) {
        this.f20280a = i;
        this.f20281b = i2;
        this.f20282c = i3;
        this.f20283d = j;
    }

    /* renamed from: Q */
    public static /* synthetic */ String m27259Q(C8238l lVar, C8244m mVar, String str, Locale locale, int i, Object obj) {
        if ((i & 4) != 0) {
            locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        }
        return lVar.mo12760M(mVar, str, locale);
    }

    /* renamed from: z */
    public static /* synthetic */ C8238l m27260z(C8238l lVar, int i, int i2, int i3, long j, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = lVar.f20280a;
        }
        if ((i4 & 2) != 0) {
            i2 = lVar.f20281b;
        }
        int i5 = i2;
        if ((i4 & 4) != 0) {
            i3 = lVar.f20282c;
        }
        int i6 = i3;
        if ((i4 & 8) != 0) {
            j = lVar.f20283d;
        }
        return lVar.mo12774y(i, i5, i6, j);
    }

    @C12579k
    /* renamed from: M */
    public final String mo12760M(@C12579k C8244m mVar, @C12579k String str, @C12579k Locale locale) {
        Intrinsics.checkNotNullParameter(mVar, "calendarModel");
        Intrinsics.checkNotNullParameter(str, "skeleton");
        Intrinsics.checkNotNullParameter(locale, "locale");
        return mVar.mo12852n(this, str, locale);
    }

    /* renamed from: R1 */
    public final int mo12761R1() {
        return this.f20282c;
    }

    /* renamed from: W */
    public final int mo12762W() {
        return this.f20281b;
    }

    /* renamed from: X */
    public final long mo12763X() {
        return this.f20283d;
    }

    /* renamed from: b */
    public int compareTo(@C12579k C8238l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "other");
        return Intrinsics.compare(this.f20283d, lVar.f20283d);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8238l)) {
            return false;
        }
        C8238l lVar = (C8238l) obj;
        return this.f20280a == lVar.f20280a && this.f20281b == lVar.f20281b && this.f20282c == lVar.f20282c && this.f20283d == lVar.f20283d;
    }

    /* renamed from: g */
    public final int mo12767g() {
        return this.f20280a;
    }

    public final int getYear() {
        return this.f20280a;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f20280a) * 31) + Integer.hashCode(this.f20281b)) * 31) + Integer.hashCode(this.f20282c)) * 31) + Long.hashCode(this.f20283d);
    }

    /* renamed from: q */
    public final int mo12770q() {
        return this.f20281b;
    }

    /* renamed from: r */
    public final int mo12771r() {
        return this.f20282c;
    }

    @C12579k
    public String toString() {
        return "CalendarDate(year=" + this.f20280a + ", month=" + this.f20281b + ", dayOfMonth=" + this.f20282c + ", utcTimeMillis=" + this.f20283d + ')';
    }

    /* renamed from: w */
    public final long mo12773w() {
        return this.f20283d;
    }

    @C12579k
    /* renamed from: y */
    public final C8238l mo12774y(int i, int i2, int i3, long j) {
        return new C8238l(i, i2, i3, j);
    }
}

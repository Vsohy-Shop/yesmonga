package androidx.compose.material3;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11466l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8251n0
/* renamed from: androidx.compose.material3.q */
public final class C8266q {

    /* renamed from: a */
    public final int f20415a;

    /* renamed from: b */
    public final int f20416b;

    /* renamed from: c */
    public final int f20417c;

    /* renamed from: d */
    public final int f20418d;

    /* renamed from: e */
    public final long f20419e;

    /* renamed from: f */
    public final long f20420f;

    public C8266q(int i, int i2, int i3, int i4, long j) {
        this.f20415a = i;
        this.f20416b = i2;
        this.f20417c = i3;
        this.f20418d = i4;
        this.f20419e = j;
        this.f20420f = (j + (((long) i3) * 86400000)) - 1;
    }

    /* renamed from: g */
    public static /* synthetic */ C8266q m27457g(C8266q qVar, int i, int i2, int i3, int i4, long j, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = qVar.f20415a;
        }
        if ((i5 & 2) != 0) {
            i2 = qVar.f20416b;
        }
        int i6 = i2;
        if ((i5 & 4) != 0) {
            i3 = qVar.f20417c;
        }
        int i7 = i3;
        if ((i5 & 8) != 0) {
            i4 = qVar.f20418d;
        }
        int i8 = i4;
        if ((i5 & 16) != 0) {
            j = qVar.f20419e;
        }
        return qVar.mo12914f(i, i6, i7, i8, j);
    }

    /* renamed from: i */
    public static /* synthetic */ String m27458i(C8266q qVar, C8244m mVar, String str, Locale locale, int i, Object obj) {
        if ((i & 4) != 0) {
            locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        }
        return qVar.mo12915h(mVar, str, locale);
    }

    /* renamed from: a */
    public final int mo12908a() {
        return this.f20415a;
    }

    /* renamed from: b */
    public final int mo12909b() {
        return this.f20416b;
    }

    /* renamed from: c */
    public final int mo12910c() {
        return this.f20417c;
    }

    /* renamed from: d */
    public final int mo12911d() {
        return this.f20418d;
    }

    /* renamed from: e */
    public final long mo12912e() {
        return this.f20419e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8266q)) {
            return false;
        }
        C8266q qVar = (C8266q) obj;
        return this.f20415a == qVar.f20415a && this.f20416b == qVar.f20416b && this.f20417c == qVar.f20417c && this.f20418d == qVar.f20418d && this.f20419e == qVar.f20419e;
    }

    @C12579k
    /* renamed from: f */
    public final C8266q mo12914f(int i, int i2, int i3, int i4, long j) {
        return new C8266q(i, i2, i3, i4, j);
    }

    @C12579k
    /* renamed from: h */
    public final String mo12915h(@C12579k C8244m mVar, @C12579k String str, @C12579k Locale locale) {
        Intrinsics.checkNotNullParameter(mVar, "calendarModel");
        Intrinsics.checkNotNullParameter(str, "skeleton");
        Intrinsics.checkNotNullParameter(locale, "locale");
        return mVar.mo12851m(this, str, locale);
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.f20415a) * 31) + Integer.hashCode(this.f20416b)) * 31) + Integer.hashCode(this.f20417c)) * 31) + Integer.hashCode(this.f20418d)) * 31) + Long.hashCode(this.f20419e);
    }

    /* renamed from: j */
    public final int mo12917j() {
        return this.f20418d;
    }

    /* renamed from: k */
    public final long mo12918k() {
        return this.f20420f;
    }

    /* renamed from: l */
    public final int mo12919l() {
        return this.f20416b;
    }

    /* renamed from: m */
    public final int mo12920m() {
        return this.f20417c;
    }

    /* renamed from: n */
    public final long mo12921n() {
        return this.f20419e;
    }

    /* renamed from: o */
    public final int mo12922o() {
        return this.f20415a;
    }

    /* renamed from: p */
    public final int mo12923p(@C12579k C11466l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "years");
        return (((this.f20415a - lVar.mo23049r()) * 12) + this.f20416b) - 1;
    }

    @C12579k
    public String toString() {
        return "CalendarMonth(year=" + this.f20415a + ", month=" + this.f20416b + ", numberOfDays=" + this.f20417c + ", daysFromStartOfWeekToFirstOfMonth=" + this.f20418d + ", startUtcTimeMillis=" + this.f20419e + ')';
    }
}

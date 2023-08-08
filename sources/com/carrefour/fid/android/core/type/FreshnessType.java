package com.carrefour.fid.android.core.type;

import androidx.annotation.C0324b1;
import com.carrefour.fid.android.R;
import kotlin.C11076d0;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B%\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/type/FreshnessType;", "", "", "value", "Ljava/lang/String;", "w", "()Ljava/lang/String;", "", "periodRes", "I", "r", "()I", "labelRes", "q", "<init>", "(Ljava/lang/String;ILjava/lang/String;II)V", "a", "b", "c", "d", "e", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public enum FreshnessType {
    DAY("jour", R.string.day, R.string.day_plus),
    DAYS("days", R.string.days, R.string.day_plus),
    WEEKS("weeks", R.string.weeks, R.string.week_plus),
    MONTHS("months", R.string.months, R.string.month_plus),
    YEAR("years", R.string.years, R.string.year_plus);
    
    private final int labelRes;
    private final int periodRes;
    @C12579k
    private final String value;

    /* access modifiers changed from: public */
    FreshnessType(String str, @C0324b1 int i, @C0324b1 int i2) {
        this.value = str;
        this.periodRes = i;
        this.labelRes = i2;
    }

    /* renamed from: q */
    public final int mo108505q() {
        return this.labelRes;
    }

    /* renamed from: r */
    public final int mo108506r() {
        return this.periodRes;
    }

    @C12579k
    /* renamed from: w */
    public final String mo108507w() {
        return this.value;
    }
}

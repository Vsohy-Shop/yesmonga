package com.google.android.gms.common.stats;

import androidx.annotation.C0359n0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@C40473a
@Deprecated
public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {

    @C40473a
    /* renamed from: com.google.android.gms.common.stats.StatsEvent$a */
    public interface C40952a {
        @C40473a

        /* renamed from: a */
        public static final int f104178a = 7;
        @C40473a

        /* renamed from: b */
        public static final int f104179b = 8;
    }

    /* renamed from: M */
    public abstract int mo134745M();

    /* renamed from: Q */
    public abstract long mo134746Q();

    /* renamed from: W */
    public abstract long mo134747W();

    @C0359n0
    /* renamed from: X */
    public abstract String mo134748X();

    @C0359n0
    public final String toString() {
        long W = mo134747W();
        int M = mo134745M();
        long Q = mo134746Q();
        String X = mo134748X();
        return W + "\t" + M + "\t" + Q + X;
    }
}

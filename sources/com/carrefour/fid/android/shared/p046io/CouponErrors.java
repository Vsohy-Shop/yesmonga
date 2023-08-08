package com.carrefour.fid.android.shared.p046io;

import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, mo22516d2 = {"Lcom/carrefour/fid/android/shared/io/CouponErrors;", "", "()V", "CouponsActivationStartsOn", "shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.shared.io.CouponErrors */
public class CouponErrors extends Throwable {

    /* renamed from: a */
    public static final int f70471a = 0;

    @C11076d0(mo22515d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, mo22516d2 = {"Lcom/carrefour/fid/android/shared/io/CouponErrors$CouponsActivationStartsOn;", "Lcom/carrefour/fid/android/shared/io/CouponErrors;", "", "a", "date", "b", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.shared.io.CouponErrors$CouponsActivationStartsOn */
    public static final class CouponsActivationStartsOn extends CouponErrors {

        /* renamed from: b */
        public static final int f70472b = 0;
        @C12579k
        private final String date;

        public CouponsActivationStartsOn(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "date");
            this.date = str;
        }

        /* renamed from: c */
        public static /* synthetic */ CouponsActivationStartsOn m119127c(CouponsActivationStartsOn couponsActivationStartsOn, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = couponsActivationStartsOn.date;
            }
            return couponsActivationStartsOn.mo83789b(str);
        }

        @C12579k
        /* renamed from: a */
        public final String mo83788a() {
            return this.date;
        }

        @C12579k
        /* renamed from: b */
        public final CouponsActivationStartsOn mo83789b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "date");
            return new CouponsActivationStartsOn(str);
        }

        @C12579k
        /* renamed from: d */
        public final String mo83790d() {
            return this.date;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CouponsActivationStartsOn) && Intrinsics.areEqual((Object) this.date, (Object) ((CouponsActivationStartsOn) obj).date);
        }

        public int hashCode() {
            return this.date.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.date;
            return "CouponsActivationStartsOn(date=" + str + ")";
        }
    }
}

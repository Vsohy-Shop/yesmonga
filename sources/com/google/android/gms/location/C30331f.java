package com.google.android.gms.location;

import androidx.annotation.C0337f0;
import androidx.annotation.C0379x;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.common.util.C40985k;
import com.google.android.gms.internal.location.zzbe;

@C40974d0
/* renamed from: com.google.android.gms.location.f */
public interface C30331f {

    /* renamed from: P */
    public static final int f72780P = 1;

    /* renamed from: Q */
    public static final int f72781Q = 2;

    /* renamed from: R */
    public static final int f72782R = 4;

    /* renamed from: S */
    public static final long f72783S = -1;

    @C40974d0
    /* renamed from: com.google.android.gms.location.f$a */
    public static final class C30332a {

        /* renamed from: a */
        public String f72784a = null;
        @C30334c

        /* renamed from: b */
        public int f72785b = 0;

        /* renamed from: c */
        public long f72786c = Long.MIN_VALUE;

        /* renamed from: d */
        public short f72787d = -1;

        /* renamed from: e */
        public double f72788e;

        /* renamed from: f */
        public double f72789f;

        /* renamed from: g */
        public float f72790g;

        /* renamed from: h */
        public int f72791h = 0;

        /* renamed from: i */
        public int f72792i = -1;

        @RecentlyNonNull
        /* renamed from: a */
        public C30331f mo85691a() {
            String str = this.f72784a;
            if (str != null) {
                int i = this.f72785b;
                if (i == 0) {
                    throw new IllegalArgumentException("Transitions types not set.");
                } else if ((i & 4) == 0 || this.f72792i >= 0) {
                    long j = this.f72786c;
                    if (j == Long.MIN_VALUE) {
                        throw new IllegalArgumentException("Expiration not set.");
                    } else if (this.f72787d != -1) {
                        int i2 = this.f72791h;
                        if (i2 >= 0) {
                            return new zzbe(str, i, 1, this.f72788e, this.f72789f, this.f72790g, j, i2, this.f72792i);
                        }
                        throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
                    } else {
                        throw new IllegalArgumentException("Geofence region not set.");
                    }
                } else {
                    throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELLING.");
                }
            } else {
                throw new IllegalArgumentException("Request ID not set.");
            }
        }

        @RecentlyNonNull
        /* renamed from: b */
        public C30332a mo85692b(@C0379x(from = -90.0d, mo1016to = 90.0d) double d, @C0379x(from = -180.0d, mo1016to = 180.0d) double d2, @C0379x(from = 0.0d, fromInclusive = false) float f) {
            boolean z;
            boolean z2;
            boolean z3 = false;
            if (d < -90.0d || d > 90.0d) {
                z = false;
            } else {
                z = true;
            }
            StringBuilder sb = new StringBuilder(42);
            sb.append("Invalid latitude: ");
            sb.append(d);
            C40843u.m166192b(z, sb.toString());
            if (d2 < -180.0d || d2 > 180.0d) {
                z2 = false;
            } else {
                z2 = true;
            }
            StringBuilder sb2 = new StringBuilder(43);
            sb2.append("Invalid longitude: ");
            sb2.append(d2);
            C40843u.m166192b(z2, sb2.toString());
            if (f > 0.0f) {
                z3 = true;
            }
            StringBuilder sb3 = new StringBuilder(31);
            sb3.append("Invalid radius: ");
            sb3.append(f);
            C40843u.m166192b(z3, sb3.toString());
            this.f72787d = 1;
            this.f72788e = d;
            this.f72789f = d2;
            this.f72790g = f;
            return this;
        }

        @RecentlyNonNull
        /* renamed from: c */
        public C30332a mo85693c(long j) {
            if (j < 0) {
                this.f72786c = -1;
            } else {
                this.f72786c = C40985k.m166636d().mo134770c() + j;
            }
            return this;
        }

        @RecentlyNonNull
        /* renamed from: d */
        public C30332a mo85694d(int i) {
            this.f72792i = i;
            return this;
        }

        @RecentlyNonNull
        /* renamed from: e */
        public C30332a mo85695e(@C0337f0(from = 0) int i) {
            this.f72791h = i;
            return this;
        }

        @RecentlyNonNull
        /* renamed from: f */
        public C30332a mo85696f(@RecentlyNonNull String str) {
            this.f72784a = (String) C40843u.m166203m(str, "Request ID can't be set to null");
            return this;
        }

        @RecentlyNonNull
        /* renamed from: g */
        public C30332a mo85697g(@C30334c int i) {
            this.f72785b = i;
            return this;
        }
    }

    /* renamed from: com.google.android.gms.location.f$b */
    public @interface C30333b {
    }

    /* renamed from: com.google.android.gms.location.f$c */
    public @interface C30334c {
    }

    @RecentlyNonNull
    String getRequestId();
}

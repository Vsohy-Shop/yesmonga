package com.google.android.datatransport.cct.internal;

import androidx.annotation.C0363p0;
import com.google.android.datatransport.cct.internal.C40078k;
import java.util.Arrays;

/* renamed from: com.google.android.datatransport.cct.internal.f */
public final class C40067f extends C40078k {

    /* renamed from: a */
    public final long f102246a;

    /* renamed from: b */
    public final Integer f102247b;

    /* renamed from: c */
    public final long f102248c;

    /* renamed from: d */
    public final byte[] f102249d;

    /* renamed from: e */
    public final String f102250e;

    /* renamed from: f */
    public final long f102251f;

    /* renamed from: g */
    public final NetworkConnectionInfo f102252g;

    /* renamed from: com.google.android.datatransport.cct.internal.f$b */
    public static final class C40069b extends C40078k.C40079a {

        /* renamed from: a */
        public Long f102253a;

        /* renamed from: b */
        public Integer f102254b;

        /* renamed from: c */
        public Long f102255c;

        /* renamed from: d */
        public byte[] f102256d;

        /* renamed from: e */
        public String f102257e;

        /* renamed from: f */
        public Long f102258f;

        /* renamed from: g */
        public NetworkConnectionInfo f102259g;

        /* renamed from: a */
        public C40078k mo132631a() {
            String str = "";
            if (this.f102253a == null) {
                str = str + " eventTimeMs";
            }
            if (this.f102255c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f102258f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new C40067f(this.f102253a.longValue(), this.f102254b, this.f102255c.longValue(), this.f102256d, this.f102257e, this.f102258f.longValue(), this.f102259g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C40078k.C40079a mo132632b(@C0363p0 Integer num) {
            this.f102254b = num;
            return this;
        }

        /* renamed from: c */
        public C40078k.C40079a mo132633c(long j) {
            this.f102253a = Long.valueOf(j);
            return this;
        }

        /* renamed from: d */
        public C40078k.C40079a mo132634d(long j) {
            this.f102255c = Long.valueOf(j);
            return this;
        }

        /* renamed from: e */
        public C40078k.C40079a mo132635e(@C0363p0 NetworkConnectionInfo networkConnectionInfo) {
            this.f102259g = networkConnectionInfo;
            return this;
        }

        /* renamed from: f */
        public C40078k.C40079a mo132636f(@C0363p0 byte[] bArr) {
            this.f102256d = bArr;
            return this;
        }

        /* renamed from: g */
        public C40078k.C40079a mo132637g(@C0363p0 String str) {
            this.f102257e = str;
            return this;
        }

        /* renamed from: h */
        public C40078k.C40079a mo132638h(long j) {
            this.f102258f = Long.valueOf(j);
            return this;
        }
    }

    @C0363p0
    /* renamed from: b */
    public Integer mo132621b() {
        return this.f102247b;
    }

    /* renamed from: c */
    public long mo132622c() {
        return this.f102246a;
    }

    /* renamed from: d */
    public long mo132623d() {
        return this.f102248c;
    }

    @C0363p0
    /* renamed from: e */
    public NetworkConnectionInfo mo132624e() {
        return this.f102252g;
    }

    public boolean equals(Object obj) {
        Integer num;
        byte[] bArr;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C40078k)) {
            return false;
        }
        C40078k kVar = (C40078k) obj;
        if (this.f102246a == kVar.mo132622c() && ((num = this.f102247b) != null ? num.equals(kVar.mo132621b()) : kVar.mo132621b() == null) && this.f102248c == kVar.mo132623d()) {
            byte[] bArr2 = this.f102249d;
            if (kVar instanceof C40067f) {
                bArr = ((C40067f) kVar).f102249d;
            } else {
                bArr = kVar.mo132626f();
            }
            if (Arrays.equals(bArr2, bArr) && ((str = this.f102250e) != null ? str.equals(kVar.mo132627g()) : kVar.mo132627g() == null) && this.f102251f == kVar.mo132628h()) {
                NetworkConnectionInfo networkConnectionInfo = this.f102252g;
                if (networkConnectionInfo == null) {
                    if (kVar.mo132624e() == null) {
                        return true;
                    }
                } else if (networkConnectionInfo.equals(kVar.mo132624e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @C0363p0
    /* renamed from: f */
    public byte[] mo132626f() {
        return this.f102249d;
    }

    @C0363p0
    /* renamed from: g */
    public String mo132627g() {
        return this.f102250e;
    }

    /* renamed from: h */
    public long mo132628h() {
        return this.f102251f;
    }

    public int hashCode() {
        int i;
        int i2;
        long j = this.f102246a;
        int i3 = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f102247b;
        int i4 = 0;
        if (num == null) {
            i = 0;
        } else {
            i = num.hashCode();
        }
        long j2 = this.f102248c;
        int hashCode = (((((i3 ^ i) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f102249d)) * 1000003;
        String str = this.f102250e;
        if (str == null) {
            i2 = 0;
        } else {
            i2 = str.hashCode();
        }
        long j3 = this.f102251f;
        int i5 = (((hashCode ^ i2) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        NetworkConnectionInfo networkConnectionInfo = this.f102252g;
        if (networkConnectionInfo != null) {
            i4 = networkConnectionInfo.hashCode();
        }
        return i5 ^ i4;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f102246a + ", eventCode=" + this.f102247b + ", eventUptimeMs=" + this.f102248c + ", sourceExtension=" + Arrays.toString(this.f102249d) + ", sourceExtensionJsonProto3=" + this.f102250e + ", timezoneOffsetSeconds=" + this.f102251f + ", networkConnectionInfo=" + this.f102252g + "}";
    }

    public C40067f(long j, @C0363p0 Integer num, long j2, @C0363p0 byte[] bArr, @C0363p0 String str, long j3, @C0363p0 NetworkConnectionInfo networkConnectionInfo) {
        this.f102246a = j;
        this.f102247b = num;
        this.f102248c = j2;
        this.f102249d = bArr;
        this.f102250e = str;
        this.f102251f = j3;
        this.f102252g = networkConnectionInfo;
    }
}

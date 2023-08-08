package com.google.android.datatransport.cct.internal;

import androidx.annotation.C0363p0;
import com.google.android.datatransport.cct.internal.C40080l;
import com.google.firebase.encoders.annotations.C32995a;
import java.util.List;

/* renamed from: com.google.android.datatransport.cct.internal.g */
public final class C40070g extends C40080l {

    /* renamed from: a */
    public final long f102260a;

    /* renamed from: b */
    public final long f102261b;

    /* renamed from: c */
    public final ClientInfo f102262c;

    /* renamed from: d */
    public final Integer f102263d;

    /* renamed from: e */
    public final String f102264e;

    /* renamed from: f */
    public final List<C40078k> f102265f;

    /* renamed from: g */
    public final QosTier f102266g;

    /* renamed from: com.google.android.datatransport.cct.internal.g$b */
    public static final class C40072b extends C40080l.C40081a {

        /* renamed from: a */
        public Long f102267a;

        /* renamed from: b */
        public Long f102268b;

        /* renamed from: c */
        public ClientInfo f102269c;

        /* renamed from: d */
        public Integer f102270d;

        /* renamed from: e */
        public String f102271e;

        /* renamed from: f */
        public List<C40078k> f102272f;

        /* renamed from: g */
        public QosTier f102273g;

        /* renamed from: a */
        public C40080l mo132649a() {
            String str = "";
            if (this.f102267a == null) {
                str = str + " requestTimeMs";
            }
            if (this.f102268b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new C40070g(this.f102267a.longValue(), this.f102268b.longValue(), this.f102269c, this.f102270d, this.f102271e, this.f102272f, this.f102273g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C40080l.C40081a mo132650b(@C0363p0 ClientInfo clientInfo) {
            this.f102269c = clientInfo;
            return this;
        }

        /* renamed from: c */
        public C40080l.C40081a mo132651c(@C0363p0 List<C40078k> list) {
            this.f102272f = list;
            return this;
        }

        /* renamed from: d */
        public C40080l.C40081a mo132652d(@C0363p0 Integer num) {
            this.f102270d = num;
            return this;
        }

        /* renamed from: e */
        public C40080l.C40081a mo132653e(@C0363p0 String str) {
            this.f102271e = str;
            return this;
        }

        /* renamed from: f */
        public C40080l.C40081a mo132654f(@C0363p0 QosTier qosTier) {
            this.f102273g = qosTier;
            return this;
        }

        /* renamed from: g */
        public C40080l.C40081a mo132655g(long j) {
            this.f102267a = Long.valueOf(j);
            return this;
        }

        /* renamed from: h */
        public C40080l.C40081a mo132656h(long j) {
            this.f102268b = Long.valueOf(j);
            return this;
        }
    }

    @C0363p0
    /* renamed from: b */
    public ClientInfo mo132639b() {
        return this.f102262c;
    }

    @C0363p0
    @C32995a.C32996a(name = "logEvent")
    /* renamed from: c */
    public List<C40078k> mo132640c() {
        return this.f102265f;
    }

    @C0363p0
    /* renamed from: d */
    public Integer mo132641d() {
        return this.f102263d;
    }

    @C0363p0
    /* renamed from: e */
    public String mo132642e() {
        return this.f102264e;
    }

    public boolean equals(Object obj) {
        ClientInfo clientInfo;
        Integer num;
        String str;
        List<C40078k> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C40080l)) {
            return false;
        }
        C40080l lVar = (C40080l) obj;
        if (this.f102260a == lVar.mo132645g() && this.f102261b == lVar.mo132646h() && ((clientInfo = this.f102262c) != null ? clientInfo.equals(lVar.mo132639b()) : lVar.mo132639b() == null) && ((num = this.f102263d) != null ? num.equals(lVar.mo132641d()) : lVar.mo132641d() == null) && ((str = this.f102264e) != null ? str.equals(lVar.mo132642e()) : lVar.mo132642e() == null) && ((list = this.f102265f) != null ? list.equals(lVar.mo132640c()) : lVar.mo132640c() == null)) {
            QosTier qosTier = this.f102266g;
            if (qosTier == null) {
                if (lVar.mo132644f() == null) {
                    return true;
                }
            } else if (qosTier.equals(lVar.mo132644f())) {
                return true;
            }
        }
        return false;
    }

    @C0363p0
    /* renamed from: f */
    public QosTier mo132644f() {
        return this.f102266g;
    }

    /* renamed from: g */
    public long mo132645g() {
        return this.f102260a;
    }

    /* renamed from: h */
    public long mo132646h() {
        return this.f102261b;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        long j = this.f102260a;
        long j2 = this.f102261b;
        int i5 = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        ClientInfo clientInfo = this.f102262c;
        int i6 = 0;
        if (clientInfo == null) {
            i = 0;
        } else {
            i = clientInfo.hashCode();
        }
        int i7 = (i5 ^ i) * 1000003;
        Integer num = this.f102263d;
        if (num == null) {
            i2 = 0;
        } else {
            i2 = num.hashCode();
        }
        int i8 = (i7 ^ i2) * 1000003;
        String str = this.f102264e;
        if (str == null) {
            i3 = 0;
        } else {
            i3 = str.hashCode();
        }
        int i9 = (i8 ^ i3) * 1000003;
        List<C40078k> list = this.f102265f;
        if (list == null) {
            i4 = 0;
        } else {
            i4 = list.hashCode();
        }
        int i10 = (i9 ^ i4) * 1000003;
        QosTier qosTier = this.f102266g;
        if (qosTier != null) {
            i6 = qosTier.hashCode();
        }
        return i10 ^ i6;
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f102260a + ", requestUptimeMs=" + this.f102261b + ", clientInfo=" + this.f102262c + ", logSource=" + this.f102263d + ", logSourceName=" + this.f102264e + ", logEvents=" + this.f102265f + ", qosTier=" + this.f102266g + "}";
    }

    public C40070g(long j, long j2, @C0363p0 ClientInfo clientInfo, @C0363p0 Integer num, @C0363p0 String str, @C0363p0 List<C40078k> list, @C0363p0 QosTier qosTier) {
        this.f102260a = j;
        this.f102261b = j2;
        this.f102262c = clientInfo;
        this.f102263d = num;
        this.f102264e = str;
        this.f102265f = list;
        this.f102266g = qosTier;
    }
}

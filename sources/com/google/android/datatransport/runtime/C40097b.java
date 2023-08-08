package com.google.android.datatransport.runtime;

import androidx.annotation.C0363p0;
import com.google.android.datatransport.runtime.C40190j;
import java.util.Map;

/* renamed from: com.google.android.datatransport.runtime.b */
public final class C40097b extends C40190j {

    /* renamed from: a */
    public final String f102303a;

    /* renamed from: b */
    public final Integer f102304b;

    /* renamed from: c */
    public final C40189i f102305c;

    /* renamed from: d */
    public final long f102306d;

    /* renamed from: e */
    public final long f102307e;

    /* renamed from: f */
    public final Map<String, String> f102308f;

    /* renamed from: com.google.android.datatransport.runtime.b$b */
    public static final class C40099b extends C40190j.C40191a {

        /* renamed from: a */
        public String f102309a;

        /* renamed from: b */
        public Integer f102310b;

        /* renamed from: c */
        public C40189i f102311c;

        /* renamed from: d */
        public Long f102312d;

        /* renamed from: e */
        public Long f102313e;

        /* renamed from: f */
        public Map<String, String> f102314f;

        /* renamed from: d */
        public C40190j mo132686d() {
            String str = "";
            if (this.f102309a == null) {
                str = str + " transportName";
            }
            if (this.f102311c == null) {
                str = str + " encodedPayload";
            }
            if (this.f102312d == null) {
                str = str + " eventMillis";
            }
            if (this.f102313e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f102314f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new C40097b(this.f102309a, this.f102310b, this.f102311c, this.f102312d.longValue(), this.f102313e.longValue(), this.f102314f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: e */
        public Map<String, String> mo132687e() {
            Map<String, String> map = this.f102314f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        /* renamed from: f */
        public C40190j.C40191a mo132688f(Map<String, String> map) {
            if (map != null) {
                this.f102314f = map;
                return this;
            }
            throw new NullPointerException("Null autoMetadata");
        }

        /* renamed from: g */
        public C40190j.C40191a mo132689g(Integer num) {
            this.f102310b = num;
            return this;
        }

        /* renamed from: h */
        public C40190j.C40191a mo132690h(C40189i iVar) {
            if (iVar != null) {
                this.f102311c = iVar;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }

        /* renamed from: i */
        public C40190j.C40191a mo132691i(long j) {
            this.f102312d = Long.valueOf(j);
            return this;
        }

        /* renamed from: j */
        public C40190j.C40191a mo132692j(String str) {
            if (str != null) {
                this.f102309a = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }

        /* renamed from: k */
        public C40190j.C40191a mo132693k(long j) {
            this.f102313e = Long.valueOf(j);
            return this;
        }
    }

    /* renamed from: c */
    public Map<String, String> mo132677c() {
        return this.f102308f;
    }

    @C0363p0
    /* renamed from: d */
    public Integer mo132678d() {
        return this.f102304b;
    }

    /* renamed from: e */
    public C40189i mo132679e() {
        return this.f102305c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C40190j)) {
            return false;
        }
        C40190j jVar = (C40190j) obj;
        if (!this.f102303a.equals(jVar.mo132683l()) || ((num = this.f102304b) != null ? !num.equals(jVar.mo132678d()) : jVar.mo132678d() != null) || !this.f102305c.equals(jVar.mo132679e()) || this.f102306d != jVar.mo132681f() || this.f102307e != jVar.mo132684m() || !this.f102308f.equals(jVar.mo132677c())) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public long mo132681f() {
        return this.f102306d;
    }

    public int hashCode() {
        int i;
        int hashCode = (this.f102303a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f102304b;
        if (num == null) {
            i = 0;
        } else {
            i = num.hashCode();
        }
        long j = this.f102306d;
        long j2 = this.f102307e;
        return ((((((((hashCode ^ i) * 1000003) ^ this.f102305c.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f102308f.hashCode();
    }

    /* renamed from: l */
    public String mo132683l() {
        return this.f102303a;
    }

    /* renamed from: m */
    public long mo132684m() {
        return this.f102307e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f102303a + ", code=" + this.f102304b + ", encodedPayload=" + this.f102305c + ", eventMillis=" + this.f102306d + ", uptimeMillis=" + this.f102307e + ", autoMetadata=" + this.f102308f + "}";
    }

    public C40097b(String str, @C0363p0 Integer num, C40189i iVar, long j, long j2, Map<String, String> map) {
        this.f102303a = str;
        this.f102304b = num;
        this.f102305c = iVar;
        this.f102306d = j;
        this.f102307e = j2;
        this.f102308f = map;
    }
}

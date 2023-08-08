package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.scheduling.persistence.C40257e;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.a */
public final class C40247a extends C40257e {

    /* renamed from: g */
    public final long f102575g;

    /* renamed from: h */
    public final int f102576h;

    /* renamed from: i */
    public final int f102577i;

    /* renamed from: j */
    public final long f102578j;

    /* renamed from: k */
    public final int f102579k;

    /* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.a$b */
    public static final class C40249b extends C40257e.C40258a {

        /* renamed from: a */
        public Long f102580a;

        /* renamed from: b */
        public Integer f102581b;

        /* renamed from: c */
        public Integer f102582c;

        /* renamed from: d */
        public Long f102583d;

        /* renamed from: e */
        public Integer f102584e;

        /* renamed from: a */
        public C40257e mo132910a() {
            String str = "";
            if (this.f102580a == null) {
                str = str + " maxStorageSizeInBytes";
            }
            if (this.f102581b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f102582c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f102583d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f102584e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C40247a(this.f102580a.longValue(), this.f102581b.intValue(), this.f102582c.intValue(), this.f102583d.longValue(), this.f102584e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C40257e.C40258a mo132911b(int i) {
            this.f102582c = Integer.valueOf(i);
            return this;
        }

        /* renamed from: c */
        public C40257e.C40258a mo132912c(long j) {
            this.f102583d = Long.valueOf(j);
            return this;
        }

        /* renamed from: d */
        public C40257e.C40258a mo132913d(int i) {
            this.f102581b = Integer.valueOf(i);
            return this;
        }

        /* renamed from: e */
        public C40257e.C40258a mo132914e(int i) {
            this.f102584e = Integer.valueOf(i);
            return this;
        }

        /* renamed from: f */
        public C40257e.C40258a mo132915f(long j) {
            this.f102580a = Long.valueOf(j);
            return this;
        }
    }

    /* renamed from: b */
    public int mo132902b() {
        return this.f102577i;
    }

    /* renamed from: c */
    public long mo132903c() {
        return this.f102578j;
    }

    /* renamed from: d */
    public int mo132904d() {
        return this.f102576h;
    }

    /* renamed from: e */
    public int mo132905e() {
        return this.f102579k;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C40257e)) {
            return false;
        }
        C40257e eVar = (C40257e) obj;
        if (this.f102575g == eVar.mo132907f() && this.f102576h == eVar.mo132904d() && this.f102577i == eVar.mo132902b() && this.f102578j == eVar.mo132903c() && this.f102579k == eVar.mo132905e()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public long mo132907f() {
        return this.f102575g;
    }

    public int hashCode() {
        long j = this.f102575g;
        long j2 = this.f102578j;
        return ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f102576h) * 1000003) ^ this.f102577i) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f102579k;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f102575g + ", loadBatchSize=" + this.f102576h + ", criticalSectionEnterTimeoutMs=" + this.f102577i + ", eventCleanUpAge=" + this.f102578j + ", maxBlobByteSizePerRow=" + this.f102579k + "}";
    }

    public C40247a(long j, int i, int i2, long j2, int i3) {
        this.f102575g = j;
        this.f102576h = i;
        this.f102577i = i2;
        this.f102578j = j2;
        this.f102579k = i3;
    }
}

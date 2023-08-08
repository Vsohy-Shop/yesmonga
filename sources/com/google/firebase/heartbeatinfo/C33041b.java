package com.google.firebase.heartbeatinfo;

/* renamed from: com.google.firebase.heartbeatinfo.b */
public final class C33041b extends C33053m {

    /* renamed from: a */
    public final String f80168a;

    /* renamed from: b */
    public final long f80169b;

    public C33041b(String str, long j) {
        if (str != null) {
            this.f80168a = str;
            this.f80169b = j;
            return;
        }
        throw new NullPointerException("Null sdkName");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C33053m)) {
            return false;
        }
        C33053m mVar = (C33053m) obj;
        if (!this.f80168a.equals(mVar.mo95743q()) || this.f80169b != mVar.mo95742k()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.f80169b;
        return ((this.f80168a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    /* renamed from: k */
    public long mo95742k() {
        return this.f80169b;
    }

    /* renamed from: q */
    public String mo95743q() {
        return this.f80168a;
    }

    public String toString() {
        return "SdkHeartBeatResult{sdkName=" + this.f80168a + ", millis=" + this.f80169b + "}";
    }
}

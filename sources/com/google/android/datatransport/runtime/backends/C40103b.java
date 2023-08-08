package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.BackendResponse;

/* renamed from: com.google.android.datatransport.runtime.backends.b */
public final class C40103b extends BackendResponse {

    /* renamed from: a */
    public final BackendResponse.Status f102324a;

    /* renamed from: b */
    public final long f102325b;

    public C40103b(BackendResponse.Status status, long j) {
        if (status != null) {
            this.f102324a = status;
            this.f102325b = j;
            return;
        }
        throw new NullPointerException("Null status");
    }

    /* renamed from: b */
    public long mo132694b() {
        return this.f102325b;
    }

    /* renamed from: c */
    public BackendResponse.Status mo132695c() {
        return this.f102324a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BackendResponse)) {
            return false;
        }
        BackendResponse backendResponse = (BackendResponse) obj;
        if (!this.f102324a.equals(backendResponse.mo132695c()) || this.f102325b != backendResponse.mo132694b()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.f102325b;
        return ((this.f102324a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f102324a + ", nextRequestWaitMillis=" + this.f102325b + "}";
    }
}

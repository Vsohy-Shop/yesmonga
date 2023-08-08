package com.android.volley;

public class VolleyError extends Exception {
    public final C21762l networkResponse;
    private long networkTimeMs;

    public VolleyError() {
        this.networkResponse = null;
    }

    /* renamed from: a */
    public long mo64824a() {
        return this.networkTimeMs;
    }

    /* renamed from: b */
    public void mo64825b(long j) {
        this.networkTimeMs = j;
    }

    public VolleyError(C21762l lVar) {
        this.networkResponse = lVar;
    }

    public VolleyError(String str) {
        super(str);
        this.networkResponse = null;
    }

    public VolleyError(String str, Throwable th) {
        super(str, th);
        this.networkResponse = null;
    }

    public VolleyError(Throwable th) {
        super(th);
        this.networkResponse = null;
    }
}

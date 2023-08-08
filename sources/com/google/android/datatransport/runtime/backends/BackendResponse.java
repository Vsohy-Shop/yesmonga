package com.google.android.datatransport.runtime.backends;

import com.google.auto.value.C32455c;

@C32455c
public abstract class BackendResponse {

    public enum Status {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    /* renamed from: a */
    public static BackendResponse m163282a() {
        return new C40103b(Status.FATAL_ERROR, -1);
    }

    /* renamed from: d */
    public static BackendResponse m163283d() {
        return new C40103b(Status.INVALID_PAYLOAD, -1);
    }

    /* renamed from: e */
    public static BackendResponse m163284e(long j) {
        return new C40103b(Status.OK, j);
    }

    /* renamed from: f */
    public static BackendResponse m163285f() {
        return new C40103b(Status.TRANSIENT_ERROR, -1);
    }

    /* renamed from: b */
    public abstract long mo132694b();

    /* renamed from: c */
    public abstract Status mo132695c();
}

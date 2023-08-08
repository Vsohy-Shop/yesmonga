package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.proto.Protobuf;

/* renamed from: com.google.android.datatransport.runtime.firebase.transport.e */
public final class C40185e {

    /* renamed from: c */
    public static final C40185e f102443c = new C40186a().mo132826a();

    /* renamed from: a */
    public final long f102444a;

    /* renamed from: b */
    public final long f102445b;

    /* renamed from: com.google.android.datatransport.runtime.firebase.transport.e$a */
    public static final class C40186a {

        /* renamed from: a */
        public long f102446a = 0;

        /* renamed from: b */
        public long f102447b = 0;

        /* renamed from: a */
        public C40185e mo132826a() {
            return new C40185e(this.f102446a, this.f102447b);
        }

        /* renamed from: b */
        public C40186a mo132827b(long j) {
            this.f102447b = j;
            return this;
        }

        /* renamed from: c */
        public C40186a mo132828c(long j) {
            this.f102446a = j;
            return this;
        }
    }

    public C40185e(long j, long j2) {
        this.f102444a = j;
        this.f102445b = j2;
    }

    /* renamed from: a */
    public static C40185e m163450a() {
        return f102443c;
    }

    /* renamed from: d */
    public static C40186a m163451d() {
        return new C40186a();
    }

    @Protobuf(tag = 2)
    /* renamed from: b */
    public long mo132824b() {
        return this.f102445b;
    }

    @Protobuf(tag = 1)
    /* renamed from: c */
    public long mo132825c() {
        return this.f102444a;
    }
}

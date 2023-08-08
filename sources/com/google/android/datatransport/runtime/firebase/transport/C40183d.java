package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.proto.Protobuf;

/* renamed from: com.google.android.datatransport.runtime.firebase.transport.d */
public final class C40183d {

    /* renamed from: c */
    public static final C40183d f102438c = new C40184a().mo132821a();

    /* renamed from: a */
    public final long f102439a;

    /* renamed from: b */
    public final long f102440b;

    /* renamed from: com.google.android.datatransport.runtime.firebase.transport.d$a */
    public static final class C40184a {

        /* renamed from: a */
        public long f102441a = 0;

        /* renamed from: b */
        public long f102442b = 0;

        /* renamed from: a */
        public C40183d mo132821a() {
            return new C40183d(this.f102441a, this.f102442b);
        }

        /* renamed from: b */
        public C40184a mo132822b(long j) {
            this.f102441a = j;
            return this;
        }

        /* renamed from: c */
        public C40184a mo132823c(long j) {
            this.f102442b = j;
            return this;
        }
    }

    public C40183d(long j, long j2) {
        this.f102439a = j;
        this.f102440b = j2;
    }

    /* renamed from: b */
    public static C40183d m163443b() {
        return f102438c;
    }

    /* renamed from: d */
    public static C40184a m163444d() {
        return new C40184a();
    }

    @Protobuf(tag = 1)
    /* renamed from: a */
    public long mo132819a() {
        return this.f102439a;
    }

    @Protobuf(tag = 2)
    /* renamed from: c */
    public long mo132820c() {
        return this.f102440b;
    }
}

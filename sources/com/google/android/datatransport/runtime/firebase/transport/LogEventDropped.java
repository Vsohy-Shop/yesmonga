package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.proto.C33021c;
import com.google.firebase.encoders.proto.Protobuf;

public final class LogEventDropped {

    /* renamed from: c */
    public static final LogEventDropped f102408c = new C40176a().mo132792a();

    /* renamed from: a */
    public final long f102409a;

    /* renamed from: b */
    public final Reason f102410b;

    public enum Reason implements C33021c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);
        
        private final int number_;

        /* access modifiers changed from: public */
        Reason(int i) {
            this.number_ = i;
        }

        public int getNumber() {
            return this.number_;
        }
    }

    /* renamed from: com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$a */
    public static final class C40176a {

        /* renamed from: a */
        public long f102419a = 0;

        /* renamed from: b */
        public Reason f102420b = Reason.REASON_UNKNOWN;

        /* renamed from: a */
        public LogEventDropped mo132792a() {
            return new LogEventDropped(this.f102419a, this.f102420b);
        }

        /* renamed from: b */
        public C40176a mo132793b(long j) {
            this.f102419a = j;
            return this;
        }

        /* renamed from: c */
        public C40176a mo132794c(Reason reason) {
            this.f102420b = reason;
            return this;
        }
    }

    public LogEventDropped(long j, Reason reason) {
        this.f102409a = j;
        this.f102410b = reason;
    }

    /* renamed from: a */
    public static LogEventDropped m163406a() {
        return f102408c;
    }

    /* renamed from: d */
    public static C40176a m163407d() {
        return new C40176a();
    }

    @Protobuf(tag = 1)
    /* renamed from: b */
    public long mo132790b() {
        return this.f102409a;
    }

    @Protobuf(tag = 3)
    /* renamed from: c */
    public Reason mo132791c() {
        return this.f102410b;
    }
}

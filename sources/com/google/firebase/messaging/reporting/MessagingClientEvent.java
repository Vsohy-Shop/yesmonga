package com.google.firebase.messaging.reporting;

import com.google.firebase.encoders.proto.C33021c;
import com.google.firebase.encoders.proto.Protobuf;

public final class MessagingClientEvent {

    /* renamed from: p */
    public static final MessagingClientEvent f80780p = new C33226a().mo96171a();

    /* renamed from: a */
    public final long f80781a;

    /* renamed from: b */
    public final String f80782b;

    /* renamed from: c */
    public final String f80783c;

    /* renamed from: d */
    public final MessageType f80784d;

    /* renamed from: e */
    public final SDKPlatform f80785e;

    /* renamed from: f */
    public final String f80786f;

    /* renamed from: g */
    public final String f80787g;

    /* renamed from: h */
    public final int f80788h;

    /* renamed from: i */
    public final int f80789i;

    /* renamed from: j */
    public final String f80790j;

    /* renamed from: k */
    public final long f80791k;

    /* renamed from: l */
    public final C33225Event f80792l;

    /* renamed from: m */
    public final String f80793m;

    /* renamed from: n */
    public final long f80794n;

    /* renamed from: o */
    public final String f80795o;

    /* renamed from: com.google.firebase.messaging.reporting.MessagingClientEvent$Event */
    public enum C33225Event implements C33021c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);
        
        private final int number_;

        /* access modifiers changed from: public */
        C33225Event(int i) {
            this.number_ = i;
        }

        public int getNumber() {
            return this.number_;
        }
    }

    public enum MessageType implements C33021c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);
        
        private final int number_;

        /* access modifiers changed from: public */
        MessageType(int i) {
            this.number_ = i;
        }

        public int getNumber() {
            return this.number_;
        }
    }

    public enum SDKPlatform implements C33021c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);
        
        private final int number_;

        /* access modifiers changed from: public */
        SDKPlatform(int i) {
            this.number_ = i;
        }

        public int getNumber() {
            return this.number_;
        }
    }

    /* renamed from: com.google.firebase.messaging.reporting.MessagingClientEvent$a */
    public static final class C33226a {

        /* renamed from: a */
        public long f80810a = 0;

        /* renamed from: b */
        public String f80811b = "";

        /* renamed from: c */
        public String f80812c = "";

        /* renamed from: d */
        public MessageType f80813d = MessageType.UNKNOWN;

        /* renamed from: e */
        public SDKPlatform f80814e = SDKPlatform.UNKNOWN_OS;

        /* renamed from: f */
        public String f80815f = "";

        /* renamed from: g */
        public String f80816g = "";

        /* renamed from: h */
        public int f80817h = 0;

        /* renamed from: i */
        public int f80818i = 0;

        /* renamed from: j */
        public String f80819j = "";

        /* renamed from: k */
        public long f80820k = 0;

        /* renamed from: l */
        public C33225Event f80821l = C33225Event.UNKNOWN_EVENT;

        /* renamed from: m */
        public String f80822m = "";

        /* renamed from: n */
        public long f80823n = 0;

        /* renamed from: o */
        public String f80824o = "";

        /* renamed from: a */
        public MessagingClientEvent mo96171a() {
            return new MessagingClientEvent(this.f80810a, this.f80811b, this.f80812c, this.f80813d, this.f80814e, this.f80815f, this.f80816g, this.f80817h, this.f80818i, this.f80819j, this.f80820k, this.f80821l, this.f80822m, this.f80823n, this.f80824o);
        }

        /* renamed from: b */
        public C33226a mo96172b(String str) {
            this.f80822m = str;
            return this;
        }

        /* renamed from: c */
        public C33226a mo96173c(long j) {
            this.f80820k = j;
            return this;
        }

        /* renamed from: d */
        public C33226a mo96174d(long j) {
            this.f80823n = j;
            return this;
        }

        /* renamed from: e */
        public C33226a mo96175e(String str) {
            this.f80816g = str;
            return this;
        }

        /* renamed from: f */
        public C33226a mo96176f(String str) {
            this.f80824o = str;
            return this;
        }

        /* renamed from: g */
        public C33226a mo96177g(C33225Event event) {
            this.f80821l = event;
            return this;
        }

        /* renamed from: h */
        public C33226a mo96178h(String str) {
            this.f80812c = str;
            return this;
        }

        /* renamed from: i */
        public C33226a mo96179i(String str) {
            this.f80811b = str;
            return this;
        }

        /* renamed from: j */
        public C33226a mo96180j(MessageType messageType) {
            this.f80813d = messageType;
            return this;
        }

        /* renamed from: k */
        public C33226a mo96181k(String str) {
            this.f80815f = str;
            return this;
        }

        /* renamed from: l */
        public C33226a mo96182l(int i) {
            this.f80817h = i;
            return this;
        }

        /* renamed from: m */
        public C33226a mo96183m(long j) {
            this.f80810a = j;
            return this;
        }

        /* renamed from: n */
        public C33226a mo96184n(SDKPlatform sDKPlatform) {
            this.f80814e = sDKPlatform;
            return this;
        }

        /* renamed from: o */
        public C33226a mo96185o(String str) {
            this.f80819j = str;
            return this;
        }

        /* renamed from: p */
        public C33226a mo96186p(int i) {
            this.f80818i = i;
            return this;
        }
    }

    public MessagingClientEvent(long j, String str, String str2, MessageType messageType, SDKPlatform sDKPlatform, String str3, String str4, int i, int i2, String str5, long j2, C33225Event event, String str6, long j3, String str7) {
        this.f80781a = j;
        this.f80782b = str;
        this.f80783c = str2;
        this.f80784d = messageType;
        this.f80785e = sDKPlatform;
        this.f80786f = str3;
        this.f80787g = str4;
        this.f80788h = i;
        this.f80789i = i2;
        this.f80790j = str5;
        this.f80791k = j2;
        this.f80792l = event;
        this.f80793m = str6;
        this.f80794n = j3;
        this.f80795o = str7;
    }

    /* renamed from: f */
    public static MessagingClientEvent m134036f() {
        return f80780p;
    }

    /* renamed from: q */
    public static C33226a m134037q() {
        return new C33226a();
    }

    @Protobuf(tag = 13)
    /* renamed from: a */
    public String mo96156a() {
        return this.f80793m;
    }

    @Protobuf(tag = 11)
    /* renamed from: b */
    public long mo96157b() {
        return this.f80791k;
    }

    @Protobuf(tag = 14)
    /* renamed from: c */
    public long mo96158c() {
        return this.f80794n;
    }

    @Protobuf(tag = 7)
    /* renamed from: d */
    public String mo96159d() {
        return this.f80787g;
    }

    @Protobuf(tag = 15)
    /* renamed from: e */
    public String mo96160e() {
        return this.f80795o;
    }

    @Protobuf(tag = 12)
    /* renamed from: g */
    public C33225Event mo96161g() {
        return this.f80792l;
    }

    @Protobuf(tag = 3)
    /* renamed from: h */
    public String mo96162h() {
        return this.f80783c;
    }

    @Protobuf(tag = 2)
    /* renamed from: i */
    public String mo96163i() {
        return this.f80782b;
    }

    @Protobuf(tag = 4)
    /* renamed from: j */
    public MessageType mo96164j() {
        return this.f80784d;
    }

    @Protobuf(tag = 6)
    /* renamed from: k */
    public String mo96165k() {
        return this.f80786f;
    }

    @Protobuf(tag = 8)
    /* renamed from: l */
    public int mo96166l() {
        return this.f80788h;
    }

    @Protobuf(tag = 1)
    /* renamed from: m */
    public long mo96167m() {
        return this.f80781a;
    }

    @Protobuf(tag = 5)
    /* renamed from: n */
    public SDKPlatform mo96168n() {
        return this.f80785e;
    }

    @Protobuf(tag = 10)
    /* renamed from: o */
    public String mo96169o() {
        return this.f80790j;
    }

    @Protobuf(tag = 9)
    /* renamed from: p */
    public int mo96170p() {
        return this.f80789i;
    }
}

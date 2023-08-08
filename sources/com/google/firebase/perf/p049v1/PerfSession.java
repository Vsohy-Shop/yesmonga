package com.google.firebase.perf.p049v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.C34368g0;
import com.google.protobuf.C34448s;
import com.google.protobuf.C34471v0;
import com.google.protobuf.C34504y1;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.google.firebase.perf.v1.PerfSession */
public final class PerfSession extends GeneratedMessageLite<PerfSession, C33476c> implements C33497k {
    /* access modifiers changed from: private */
    public static final PerfSession DEFAULT_INSTANCE;
    private static volatile C34504y1<PerfSession> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private static final C34471v0.C34479h.C34480a<Integer, SessionVerbosity> sessionVerbosity_converter_ = new C33474a();
    private int bitField0_;
    private String sessionId_ = "";
    private C34471v0.C34478g sessionVerbosity_ = GeneratedMessageLite.emptyIntList();

    /* renamed from: com.google.firebase.perf.v1.PerfSession$a */
    public class C33474a implements C34471v0.C34479h.C34480a<Integer, SessionVerbosity> {
        /* renamed from: a */
        public SessionVerbosity convert(Integer num) {
            SessionVerbosity b = SessionVerbosity.m135018b(num.intValue());
            if (b == null) {
                return SessionVerbosity.SESSION_VERBOSITY_NONE;
            }
            return b;
        }
    }

    /* renamed from: com.google.firebase.perf.v1.PerfSession$b */
    public static /* synthetic */ class C33475b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f81483a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke[] r0 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f81483a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f81483a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f81483a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f81483a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f81483a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f81483a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f81483a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.p049v1.PerfSession.C33475b.<clinit>():void");
        }
    }

    /* renamed from: com.google.firebase.perf.v1.PerfSession$c */
    public static final class C33476c extends GeneratedMessageLite.C34263b<PerfSession, C33476c> implements C33497k {
        public /* synthetic */ C33476c(C33474a aVar) {
            this();
        }

        /* renamed from: P */
        public C33476c mo97176P(Iterable<? extends SessionVerbosity> iterable) {
            mo100457F();
            ((PerfSession) this.f83053b).addAllSessionVerbosity(iterable);
            return this;
        }

        /* renamed from: R */
        public C33476c mo97177R(SessionVerbosity sessionVerbosity) {
            mo100457F();
            ((PerfSession) this.f83053b).addSessionVerbosity(sessionVerbosity);
            return this;
        }

        /* renamed from: S */
        public C33476c mo97178S() {
            mo100457F();
            ((PerfSession) this.f83053b).clearSessionId();
            return this;
        }

        /* renamed from: T */
        public C33476c mo97179T() {
            mo100457F();
            ((PerfSession) this.f83053b).clearSessionVerbosity();
            return this;
        }

        /* renamed from: U */
        public C33476c mo97180U(String str) {
            mo100457F();
            ((PerfSession) this.f83053b).setSessionId(str);
            return this;
        }

        /* renamed from: V */
        public C33476c mo97181V(ByteString byteString) {
            mo100457F();
            ((PerfSession) this.f83053b).setSessionIdBytes(byteString);
            return this;
        }

        /* renamed from: Y */
        public C33476c mo97182Y(int i, SessionVerbosity sessionVerbosity) {
            mo100457F();
            ((PerfSession) this.f83053b).setSessionVerbosity(i, sessionVerbosity);
            return this;
        }

        public String getSessionId() {
            return ((PerfSession) this.f83053b).getSessionId();
        }

        public ByteString getSessionIdBytes() {
            return ((PerfSession) this.f83053b).getSessionIdBytes();
        }

        public SessionVerbosity getSessionVerbosity(int i) {
            return ((PerfSession) this.f83053b).getSessionVerbosity(i);
        }

        public int getSessionVerbosityCount() {
            return ((PerfSession) this.f83053b).getSessionVerbosityCount();
        }

        public List<SessionVerbosity> getSessionVerbosityList() {
            return ((PerfSession) this.f83053b).getSessionVerbosityList();
        }

        public boolean hasSessionId() {
            return ((PerfSession) this.f83053b).hasSessionId();
        }

        public C33476c() {
            super(PerfSession.DEFAULT_INSTANCE);
        }
    }

    static {
        PerfSession perfSession = new PerfSession();
        DEFAULT_INSTANCE = perfSession;
        GeneratedMessageLite.registerDefaultInstance(PerfSession.class, perfSession);
    }

    private PerfSession() {
    }

    /* access modifiers changed from: private */
    public void addAllSessionVerbosity(Iterable<? extends SessionVerbosity> iterable) {
        ensureSessionVerbosityIsMutable();
        for (SessionVerbosity number : iterable) {
            this.sessionVerbosity_.mo101605V(number.getNumber());
        }
    }

    /* access modifiers changed from: private */
    public void addSessionVerbosity(SessionVerbosity sessionVerbosity) {
        sessionVerbosity.getClass();
        ensureSessionVerbosityIsMutable();
        this.sessionVerbosity_.mo101605V(sessionVerbosity.getNumber());
    }

    /* access modifiers changed from: private */
    public void clearSessionId() {
        this.bitField0_ &= -2;
        this.sessionId_ = getDefaultInstance().getSessionId();
    }

    /* access modifiers changed from: private */
    public void clearSessionVerbosity() {
        this.sessionVerbosity_ = GeneratedMessageLite.emptyIntList();
    }

    private void ensureSessionVerbosityIsMutable() {
        C34471v0.C34478g gVar = this.sessionVerbosity_;
        if (!gVar.mo100971T()) {
            this.sessionVerbosity_ = GeneratedMessageLite.mutableCopy(gVar);
        }
    }

    public static PerfSession getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C33476c newBuilder() {
        return (C33476c) DEFAULT_INSTANCE.createBuilder();
    }

    public static PerfSession parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PerfSession) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PerfSession parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<PerfSession> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setSessionId(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    /* access modifiers changed from: private */
    public void setSessionIdBytes(ByteString byteString) {
        this.sessionId_ = byteString.mo99228S0();
        this.bitField0_ |= 1;
    }

    /* access modifiers changed from: private */
    public void setSessionVerbosity(int i, SessionVerbosity sessionVerbosity) {
        sessionVerbosity.getClass();
        ensureSessionVerbosityIsMutable();
        this.sessionVerbosity_.mo101613o(i, sessionVerbosity.getNumber());
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C33475b.f81483a[methodToInvoke.ordinal()]) {
            case 1:
                return new PerfSession();
            case 2:
                return new C33476c((C33474a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001e", new Object[]{"bitField0_", "sessionId_", "sessionVerbosity_", SessionVerbosity.m135020q()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<PerfSession> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (PerfSession.class) {
                        y1Var = PARSER;
                        if (y1Var == null) {
                            y1Var = new GeneratedMessageLite.C34264c<>(DEFAULT_INSTANCE);
                            PARSER = y1Var;
                        }
                    }
                }
                return y1Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public String getSessionId() {
        return this.sessionId_;
    }

    public ByteString getSessionIdBytes() {
        return ByteString.m137260e0(this.sessionId_);
    }

    public SessionVerbosity getSessionVerbosity(int i) {
        return sessionVerbosity_converter_.convert(Integer.valueOf(this.sessionVerbosity_.getInt(i)));
    }

    public int getSessionVerbosityCount() {
        return this.sessionVerbosity_.size();
    }

    public List<SessionVerbosity> getSessionVerbosityList() {
        return new C34471v0.C34479h(this.sessionVerbosity_, sessionVerbosity_converter_);
    }

    public boolean hasSessionId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static C33476c newBuilder(PerfSession perfSession) {
        return (C33476c) DEFAULT_INSTANCE.createBuilder(perfSession);
    }

    public static PerfSession parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (PerfSession) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static PerfSession parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static PerfSession parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PerfSession parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static PerfSession parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PerfSession parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static PerfSession parseFrom(InputStream inputStream) throws IOException {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PerfSession parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static PerfSession parseFrom(C34448s sVar) throws IOException {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static PerfSession parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}

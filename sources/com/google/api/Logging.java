package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.C34319a;
import com.google.protobuf.C34368g0;
import com.google.protobuf.C34417m1;
import com.google.protobuf.C34448s;
import com.google.protobuf.C34471v0;
import com.google.protobuf.C34504y1;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class Logging extends GeneratedMessageLite<Logging, C32316b> implements C32425p0 {
    public static final int CONSUMER_DESTINATIONS_FIELD_NUMBER = 2;
    /* access modifiers changed from: private */
    public static final Logging DEFAULT_INSTANCE;
    private static volatile C34504y1<Logging> PARSER = null;
    public static final int PRODUCER_DESTINATIONS_FIELD_NUMBER = 1;
    private C34471v0.C34488k<LoggingDestination> consumerDestinations_ = GeneratedMessageLite.emptyProtobufList();
    private C34471v0.C34488k<LoggingDestination> producerDestinations_ = GeneratedMessageLite.emptyProtobufList();

    public static final class LoggingDestination extends GeneratedMessageLite<LoggingDestination, C32314a> implements C32317c {
        /* access modifiers changed from: private */
        public static final LoggingDestination DEFAULT_INSTANCE;
        public static final int LOGS_FIELD_NUMBER = 1;
        public static final int MONITORED_RESOURCE_FIELD_NUMBER = 3;
        private static volatile C34504y1<LoggingDestination> PARSER;
        private C34471v0.C34488k<String> logs_ = GeneratedMessageLite.emptyProtobufList();
        private String monitoredResource_ = "";

        /* renamed from: com.google.api.Logging$LoggingDestination$a */
        public static final class C32314a extends GeneratedMessageLite.C34263b<LoggingDestination, C32314a> implements C32317c {
            public /* synthetic */ C32314a(C32315a aVar) {
                this();
            }

            /* renamed from: P */
            public C32314a mo93736P(Iterable<String> iterable) {
                mo100457F();
                ((LoggingDestination) this.f83053b).addAllLogs(iterable);
                return this;
            }

            /* renamed from: R */
            public C32314a mo93737R(String str) {
                mo100457F();
                ((LoggingDestination) this.f83053b).addLogs(str);
                return this;
            }

            /* renamed from: S */
            public C32314a mo93738S(ByteString byteString) {
                mo100457F();
                ((LoggingDestination) this.f83053b).addLogsBytes(byteString);
                return this;
            }

            /* renamed from: T */
            public C32314a mo93739T() {
                mo100457F();
                ((LoggingDestination) this.f83053b).clearLogs();
                return this;
            }

            /* renamed from: U */
            public C32314a mo93740U() {
                mo100457F();
                ((LoggingDestination) this.f83053b).clearMonitoredResource();
                return this;
            }

            /* renamed from: V */
            public C32314a mo93741V(int i, String str) {
                mo100457F();
                ((LoggingDestination) this.f83053b).setLogs(i, str);
                return this;
            }

            /* renamed from: Y */
            public C32314a mo93742Y(String str) {
                mo100457F();
                ((LoggingDestination) this.f83053b).setMonitoredResource(str);
                return this;
            }

            /* renamed from: Z */
            public C32314a mo93743Z(ByteString byteString) {
                mo100457F();
                ((LoggingDestination) this.f83053b).setMonitoredResourceBytes(byteString);
                return this;
            }

            public String getLogs(int i) {
                return ((LoggingDestination) this.f83053b).getLogs(i);
            }

            public ByteString getLogsBytes(int i) {
                return ((LoggingDestination) this.f83053b).getLogsBytes(i);
            }

            public int getLogsCount() {
                return ((LoggingDestination) this.f83053b).getLogsCount();
            }

            public List<String> getLogsList() {
                return Collections.unmodifiableList(((LoggingDestination) this.f83053b).getLogsList());
            }

            public String getMonitoredResource() {
                return ((LoggingDestination) this.f83053b).getMonitoredResource();
            }

            public ByteString getMonitoredResourceBytes() {
                return ((LoggingDestination) this.f83053b).getMonitoredResourceBytes();
            }

            public C32314a() {
                super(LoggingDestination.DEFAULT_INSTANCE);
            }
        }

        static {
            LoggingDestination loggingDestination = new LoggingDestination();
            DEFAULT_INSTANCE = loggingDestination;
            GeneratedMessageLite.registerDefaultInstance(LoggingDestination.class, loggingDestination);
        }

        private LoggingDestination() {
        }

        /* access modifiers changed from: private */
        public void addAllLogs(Iterable<String> iterable) {
            ensureLogsIsMutable();
            C34319a.addAll(iterable, this.logs_);
        }

        /* access modifiers changed from: private */
        public void addLogs(String str) {
            str.getClass();
            ensureLogsIsMutable();
            this.logs_.add(str);
        }

        /* access modifiers changed from: private */
        public void addLogsBytes(ByteString byteString) {
            C34319a.checkByteStringIsUtf8(byteString);
            ensureLogsIsMutable();
            this.logs_.add(byteString.mo99228S0());
        }

        /* access modifiers changed from: private */
        public void clearLogs() {
            this.logs_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearMonitoredResource() {
            this.monitoredResource_ = getDefaultInstance().getMonitoredResource();
        }

        private void ensureLogsIsMutable() {
            C34471v0.C34488k<String> kVar = this.logs_;
            if (!kVar.mo100971T()) {
                this.logs_ = GeneratedMessageLite.mutableCopy(kVar);
            }
        }

        public static LoggingDestination getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C32314a newBuilder() {
            return (C32314a) DEFAULT_INSTANCE.createBuilder();
        }

        public static LoggingDestination parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LoggingDestination) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LoggingDestination parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (LoggingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C34504y1<LoggingDestination> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setLogs(int i, String str) {
            str.getClass();
            ensureLogsIsMutable();
            this.logs_.set(i, str);
        }

        /* access modifiers changed from: private */
        public void setMonitoredResource(String str) {
            str.getClass();
            this.monitoredResource_ = str;
        }

        /* access modifiers changed from: private */
        public void setMonitoredResourceBytes(ByteString byteString) {
            C34319a.checkByteStringIsUtf8(byteString);
            this.monitoredResource_ = byteString.mo99228S0();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C32315a.f78708a[methodToInvoke.ordinal()]) {
                case 1:
                    return new LoggingDestination();
                case 2:
                    return new C32314a((C32315a) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0001\u0000\u0001Ț\u0003Ȉ", new Object[]{"logs_", "monitoredResource_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    C34504y1<LoggingDestination> y1Var = PARSER;
                    if (y1Var == null) {
                        synchronized (LoggingDestination.class) {
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

        public String getLogs(int i) {
            return this.logs_.get(i);
        }

        public ByteString getLogsBytes(int i) {
            return ByteString.m137260e0(this.logs_.get(i));
        }

        public int getLogsCount() {
            return this.logs_.size();
        }

        public List<String> getLogsList() {
            return this.logs_;
        }

        public String getMonitoredResource() {
            return this.monitoredResource_;
        }

        public ByteString getMonitoredResourceBytes() {
            return ByteString.m137260e0(this.monitoredResource_);
        }

        public static C32314a newBuilder(LoggingDestination loggingDestination) {
            return (C32314a) DEFAULT_INSTANCE.createBuilder(loggingDestination);
        }

        public static LoggingDestination parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (LoggingDestination) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static LoggingDestination parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (LoggingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
        }

        public static LoggingDestination parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LoggingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static LoggingDestination parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (LoggingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
        }

        public static LoggingDestination parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LoggingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LoggingDestination parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (LoggingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
        }

        public static LoggingDestination parseFrom(InputStream inputStream) throws IOException {
            return (LoggingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LoggingDestination parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (LoggingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static LoggingDestination parseFrom(C34448s sVar) throws IOException {
            return (LoggingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static LoggingDestination parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
            return (LoggingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
        }
    }

    /* renamed from: com.google.api.Logging$a */
    public static /* synthetic */ class C32315a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f78708a;

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
                f78708a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f78708a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f78708a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f78708a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f78708a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f78708a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f78708a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.Logging.C32315a.<clinit>():void");
        }
    }

    /* renamed from: com.google.api.Logging$b */
    public static final class C32316b extends GeneratedMessageLite.C34263b<Logging, C32316b> implements C32425p0 {
        public /* synthetic */ C32316b(C32315a aVar) {
            this();
        }

        /* renamed from: P */
        public C32316b mo93744P(Iterable<? extends LoggingDestination> iterable) {
            mo100457F();
            ((Logging) this.f83053b).addAllConsumerDestinations(iterable);
            return this;
        }

        /* renamed from: R */
        public C32316b mo93745R(Iterable<? extends LoggingDestination> iterable) {
            mo100457F();
            ((Logging) this.f83053b).addAllProducerDestinations(iterable);
            return this;
        }

        /* renamed from: S */
        public C32316b mo93746S(int i, LoggingDestination.C32314a aVar) {
            mo100457F();
            ((Logging) this.f83053b).addConsumerDestinations(i, (LoggingDestination) aVar.mo100473g());
            return this;
        }

        /* renamed from: T */
        public C32316b mo93747T(int i, LoggingDestination loggingDestination) {
            mo100457F();
            ((Logging) this.f83053b).addConsumerDestinations(i, loggingDestination);
            return this;
        }

        /* renamed from: U */
        public C32316b mo93748U(LoggingDestination.C32314a aVar) {
            mo100457F();
            ((Logging) this.f83053b).addConsumerDestinations((LoggingDestination) aVar.mo100473g());
            return this;
        }

        /* renamed from: V */
        public C32316b mo93749V(LoggingDestination loggingDestination) {
            mo100457F();
            ((Logging) this.f83053b).addConsumerDestinations(loggingDestination);
            return this;
        }

        /* renamed from: Y */
        public C32316b mo93750Y(int i, LoggingDestination.C32314a aVar) {
            mo100457F();
            ((Logging) this.f83053b).addProducerDestinations(i, (LoggingDestination) aVar.mo100473g());
            return this;
        }

        /* renamed from: Z */
        public C32316b mo93751Z(int i, LoggingDestination loggingDestination) {
            mo100457F();
            ((Logging) this.f83053b).addProducerDestinations(i, loggingDestination);
            return this;
        }

        /* renamed from: a0 */
        public C32316b mo93752a0(LoggingDestination.C32314a aVar) {
            mo100457F();
            ((Logging) this.f83053b).addProducerDestinations((LoggingDestination) aVar.mo100473g());
            return this;
        }

        /* renamed from: b0 */
        public C32316b mo93753b0(LoggingDestination loggingDestination) {
            mo100457F();
            ((Logging) this.f83053b).addProducerDestinations(loggingDestination);
            return this;
        }

        /* renamed from: c0 */
        public C32316b mo93754c0() {
            mo100457F();
            ((Logging) this.f83053b).clearConsumerDestinations();
            return this;
        }

        /* renamed from: d0 */
        public C32316b mo93755d0() {
            mo100457F();
            ((Logging) this.f83053b).clearProducerDestinations();
            return this;
        }

        /* renamed from: g0 */
        public C32316b mo93756g0(int i) {
            mo100457F();
            ((Logging) this.f83053b).removeConsumerDestinations(i);
            return this;
        }

        public LoggingDestination getConsumerDestinations(int i) {
            return ((Logging) this.f83053b).getConsumerDestinations(i);
        }

        public int getConsumerDestinationsCount() {
            return ((Logging) this.f83053b).getConsumerDestinationsCount();
        }

        public List<LoggingDestination> getConsumerDestinationsList() {
            return Collections.unmodifiableList(((Logging) this.f83053b).getConsumerDestinationsList());
        }

        public LoggingDestination getProducerDestinations(int i) {
            return ((Logging) this.f83053b).getProducerDestinations(i);
        }

        public int getProducerDestinationsCount() {
            return ((Logging) this.f83053b).getProducerDestinationsCount();
        }

        public List<LoggingDestination> getProducerDestinationsList() {
            return Collections.unmodifiableList(((Logging) this.f83053b).getProducerDestinationsList());
        }

        /* renamed from: h0 */
        public C32316b mo93757h0(int i) {
            mo100457F();
            ((Logging) this.f83053b).removeProducerDestinations(i);
            return this;
        }

        /* renamed from: i0 */
        public C32316b mo93758i0(int i, LoggingDestination.C32314a aVar) {
            mo100457F();
            ((Logging) this.f83053b).setConsumerDestinations(i, (LoggingDestination) aVar.mo100473g());
            return this;
        }

        /* renamed from: j0 */
        public C32316b mo93759j0(int i, LoggingDestination loggingDestination) {
            mo100457F();
            ((Logging) this.f83053b).setConsumerDestinations(i, loggingDestination);
            return this;
        }

        /* renamed from: k0 */
        public C32316b mo93760k0(int i, LoggingDestination.C32314a aVar) {
            mo100457F();
            ((Logging) this.f83053b).setProducerDestinations(i, (LoggingDestination) aVar.mo100473g());
            return this;
        }

        /* renamed from: l0 */
        public C32316b mo93761l0(int i, LoggingDestination loggingDestination) {
            mo100457F();
            ((Logging) this.f83053b).setProducerDestinations(i, loggingDestination);
            return this;
        }

        public C32316b() {
            super(Logging.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.api.Logging$c */
    public interface C32317c extends C34417m1 {
        String getLogs(int i);

        ByteString getLogsBytes(int i);

        int getLogsCount();

        List<String> getLogsList();

        String getMonitoredResource();

        ByteString getMonitoredResourceBytes();
    }

    static {
        Logging logging = new Logging();
        DEFAULT_INSTANCE = logging;
        GeneratedMessageLite.registerDefaultInstance(Logging.class, logging);
    }

    private Logging() {
    }

    /* access modifiers changed from: private */
    public void addAllConsumerDestinations(Iterable<? extends LoggingDestination> iterable) {
        ensureConsumerDestinationsIsMutable();
        C34319a.addAll(iterable, this.consumerDestinations_);
    }

    /* access modifiers changed from: private */
    public void addAllProducerDestinations(Iterable<? extends LoggingDestination> iterable) {
        ensureProducerDestinationsIsMutable();
        C34319a.addAll(iterable, this.producerDestinations_);
    }

    /* access modifiers changed from: private */
    public void addConsumerDestinations(LoggingDestination loggingDestination) {
        loggingDestination.getClass();
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.add(loggingDestination);
    }

    /* access modifiers changed from: private */
    public void addProducerDestinations(LoggingDestination loggingDestination) {
        loggingDestination.getClass();
        ensureProducerDestinationsIsMutable();
        this.producerDestinations_.add(loggingDestination);
    }

    /* access modifiers changed from: private */
    public void clearConsumerDestinations() {
        this.consumerDestinations_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void clearProducerDestinations() {
        this.producerDestinations_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureConsumerDestinationsIsMutable() {
        C34471v0.C34488k<LoggingDestination> kVar = this.consumerDestinations_;
        if (!kVar.mo100971T()) {
            this.consumerDestinations_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    private void ensureProducerDestinationsIsMutable() {
        C34471v0.C34488k<LoggingDestination> kVar = this.producerDestinations_;
        if (!kVar.mo100971T()) {
            this.producerDestinations_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    public static Logging getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C32316b newBuilder() {
        return (C32316b) DEFAULT_INSTANCE.createBuilder();
    }

    public static Logging parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Logging) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Logging parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Logging) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<Logging> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void removeConsumerDestinations(int i) {
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.remove(i);
    }

    /* access modifiers changed from: private */
    public void removeProducerDestinations(int i) {
        ensureProducerDestinationsIsMutable();
        this.producerDestinations_.remove(i);
    }

    /* access modifiers changed from: private */
    public void setConsumerDestinations(int i, LoggingDestination loggingDestination) {
        loggingDestination.getClass();
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.set(i, loggingDestination);
    }

    /* access modifiers changed from: private */
    public void setProducerDestinations(int i, LoggingDestination loggingDestination) {
        loggingDestination.getClass();
        ensureProducerDestinationsIsMutable();
        this.producerDestinations_.set(i, loggingDestination);
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C32315a.f78708a[methodToInvoke.ordinal()]) {
            case 1:
                return new Logging();
            case 2:
                return new C32316b((C32315a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"producerDestinations_", LoggingDestination.class, "consumerDestinations_", LoggingDestination.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<Logging> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (Logging.class) {
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

    public LoggingDestination getConsumerDestinations(int i) {
        return this.consumerDestinations_.get(i);
    }

    public int getConsumerDestinationsCount() {
        return this.consumerDestinations_.size();
    }

    public List<LoggingDestination> getConsumerDestinationsList() {
        return this.consumerDestinations_;
    }

    public C32317c getConsumerDestinationsOrBuilder(int i) {
        return this.consumerDestinations_.get(i);
    }

    public List<? extends C32317c> getConsumerDestinationsOrBuilderList() {
        return this.consumerDestinations_;
    }

    public LoggingDestination getProducerDestinations(int i) {
        return this.producerDestinations_.get(i);
    }

    public int getProducerDestinationsCount() {
        return this.producerDestinations_.size();
    }

    public List<LoggingDestination> getProducerDestinationsList() {
        return this.producerDestinations_;
    }

    public C32317c getProducerDestinationsOrBuilder(int i) {
        return this.producerDestinations_.get(i);
    }

    public List<? extends C32317c> getProducerDestinationsOrBuilderList() {
        return this.producerDestinations_;
    }

    public static C32316b newBuilder(Logging logging) {
        return (C32316b) DEFAULT_INSTANCE.createBuilder(logging);
    }

    public static Logging parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (Logging) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static Logging parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Logging) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static Logging parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Logging) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* access modifiers changed from: private */
    public void addConsumerDestinations(int i, LoggingDestination loggingDestination) {
        loggingDestination.getClass();
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.add(i, loggingDestination);
    }

    /* access modifiers changed from: private */
    public void addProducerDestinations(int i, LoggingDestination loggingDestination) {
        loggingDestination.getClass();
        ensureProducerDestinationsIsMutable();
        this.producerDestinations_.add(i, loggingDestination);
    }

    public static Logging parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Logging) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static Logging parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Logging) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Logging parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Logging) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static Logging parseFrom(InputStream inputStream) throws IOException {
        return (Logging) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Logging parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (Logging) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static Logging parseFrom(C34448s sVar) throws IOException {
        return (Logging) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static Logging parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (Logging) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}

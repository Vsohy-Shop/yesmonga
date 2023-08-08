package com.google.type;

import com.google.protobuf.ByteString;
import com.google.protobuf.C34368g0;
import com.google.protobuf.C34448s;
import com.google.protobuf.C34504y1;
import com.google.protobuf.Duration;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.type.TimeZone;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class DateTime extends GeneratedMessageLite<DateTime, C34587b> implements C34611f {
    public static final int DAY_FIELD_NUMBER = 3;
    /* access modifiers changed from: private */
    public static final DateTime DEFAULT_INSTANCE;
    public static final int HOURS_FIELD_NUMBER = 4;
    public static final int MINUTES_FIELD_NUMBER = 5;
    public static final int MONTH_FIELD_NUMBER = 2;
    public static final int NANOS_FIELD_NUMBER = 7;
    private static volatile C34504y1<DateTime> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 6;
    public static final int TIME_ZONE_FIELD_NUMBER = 9;
    public static final int UTC_OFFSET_FIELD_NUMBER = 8;
    public static final int YEAR_FIELD_NUMBER = 1;
    private int day_;
    private int hours_;
    private int minutes_;
    private int month_;
    private int nanos_;
    private int seconds_;
    private int timeOffsetCase_ = 0;
    private Object timeOffset_;
    private int year_;

    public enum TimeOffsetCase {
        UTC_OFFSET(8),
        TIME_ZONE(9),
        TIMEOFFSET_NOT_SET(0);
        
        private final int value;

        /* access modifiers changed from: public */
        TimeOffsetCase(int i) {
            this.value = i;
        }

        /* renamed from: b */
        public static TimeOffsetCase m141095b(int i) {
            if (i == 0) {
                return TIMEOFFSET_NOT_SET;
            }
            if (i == 8) {
                return UTC_OFFSET;
            }
            if (i != 9) {
                return null;
            }
            return TIME_ZONE;
        }

        @Deprecated
        /* renamed from: g */
        public static TimeOffsetCase m141096g(int i) {
            return m141095b(i);
        }

        public int getNumber() {
            return this.value;
        }
    }

    /* renamed from: com.google.type.DateTime$a */
    public static /* synthetic */ class C34586a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f83662a;

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
                f83662a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f83662a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f83662a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f83662a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f83662a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f83662a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f83662a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.type.DateTime.C34586a.<clinit>():void");
        }
    }

    /* renamed from: com.google.type.DateTime$b */
    public static final class C34587b extends GeneratedMessageLite.C34263b<DateTime, C34587b> implements C34611f {
        public /* synthetic */ C34587b(C34586a aVar) {
            this();
        }

        /* renamed from: P */
        public C34587b mo102246P() {
            mo100457F();
            ((DateTime) this.f83053b).clearDay();
            return this;
        }

        /* renamed from: R */
        public C34587b mo102247R() {
            mo100457F();
            ((DateTime) this.f83053b).clearHours();
            return this;
        }

        /* renamed from: S */
        public C34587b mo102248S() {
            mo100457F();
            ((DateTime) this.f83053b).clearMinutes();
            return this;
        }

        /* renamed from: T */
        public C34587b mo102249T() {
            mo100457F();
            ((DateTime) this.f83053b).clearMonth();
            return this;
        }

        /* renamed from: U */
        public C34587b mo102250U() {
            mo100457F();
            ((DateTime) this.f83053b).clearNanos();
            return this;
        }

        /* renamed from: V */
        public C34587b mo102251V() {
            mo100457F();
            ((DateTime) this.f83053b).clearSeconds();
            return this;
        }

        /* renamed from: Y */
        public C34587b mo102252Y() {
            mo100457F();
            ((DateTime) this.f83053b).clearTimeOffset();
            return this;
        }

        /* renamed from: Z */
        public C34587b mo102253Z() {
            mo100457F();
            ((DateTime) this.f83053b).clearTimeZone();
            return this;
        }

        /* renamed from: a0 */
        public C34587b mo102254a0() {
            mo100457F();
            ((DateTime) this.f83053b).clearUtcOffset();
            return this;
        }

        /* renamed from: b0 */
        public C34587b mo102255b0() {
            mo100457F();
            ((DateTime) this.f83053b).clearYear();
            return this;
        }

        /* renamed from: c0 */
        public C34587b mo102256c0(TimeZone timeZone) {
            mo100457F();
            ((DateTime) this.f83053b).mergeTimeZone(timeZone);
            return this;
        }

        /* renamed from: d0 */
        public C34587b mo102257d0(Duration duration) {
            mo100457F();
            ((DateTime) this.f83053b).mergeUtcOffset(duration);
            return this;
        }

        /* renamed from: g0 */
        public C34587b mo102258g0(int i) {
            mo100457F();
            ((DateTime) this.f83053b).setDay(i);
            return this;
        }

        public int getDay() {
            return ((DateTime) this.f83053b).getDay();
        }

        public int getHours() {
            return ((DateTime) this.f83053b).getHours();
        }

        public int getMinutes() {
            return ((DateTime) this.f83053b).getMinutes();
        }

        public int getMonth() {
            return ((DateTime) this.f83053b).getMonth();
        }

        public int getNanos() {
            return ((DateTime) this.f83053b).getNanos();
        }

        public int getSeconds() {
            return ((DateTime) this.f83053b).getSeconds();
        }

        public TimeOffsetCase getTimeOffsetCase() {
            return ((DateTime) this.f83053b).getTimeOffsetCase();
        }

        public TimeZone getTimeZone() {
            return ((DateTime) this.f83053b).getTimeZone();
        }

        public Duration getUtcOffset() {
            return ((DateTime) this.f83053b).getUtcOffset();
        }

        public int getYear() {
            return ((DateTime) this.f83053b).getYear();
        }

        /* renamed from: h0 */
        public C34587b mo102259h0(int i) {
            mo100457F();
            ((DateTime) this.f83053b).setHours(i);
            return this;
        }

        public boolean hasTimeZone() {
            return ((DateTime) this.f83053b).hasTimeZone();
        }

        public boolean hasUtcOffset() {
            return ((DateTime) this.f83053b).hasUtcOffset();
        }

        /* renamed from: i0 */
        public C34587b mo102260i0(int i) {
            mo100457F();
            ((DateTime) this.f83053b).setMinutes(i);
            return this;
        }

        /* renamed from: j0 */
        public C34587b mo102261j0(int i) {
            mo100457F();
            ((DateTime) this.f83053b).setMonth(i);
            return this;
        }

        /* renamed from: k0 */
        public C34587b mo102262k0(int i) {
            mo100457F();
            ((DateTime) this.f83053b).setNanos(i);
            return this;
        }

        /* renamed from: l0 */
        public C34587b mo102263l0(int i) {
            mo100457F();
            ((DateTime) this.f83053b).setSeconds(i);
            return this;
        }

        /* renamed from: m0 */
        public C34587b mo102264m0(TimeZone.C34605b bVar) {
            mo100457F();
            ((DateTime) this.f83053b).setTimeZone((TimeZone) bVar.mo100473g());
            return this;
        }

        /* renamed from: o0 */
        public C34587b mo102265o0(TimeZone timeZone) {
            mo100457F();
            ((DateTime) this.f83053b).setTimeZone(timeZone);
            return this;
        }

        /* renamed from: q0 */
        public C34587b mo102266q0(Duration.C34243b bVar) {
            mo100457F();
            ((DateTime) this.f83053b).setUtcOffset((Duration) bVar.mo100473g());
            return this;
        }

        /* renamed from: r0 */
        public C34587b mo102267r0(Duration duration) {
            mo100457F();
            ((DateTime) this.f83053b).setUtcOffset(duration);
            return this;
        }

        /* renamed from: s0 */
        public C34587b mo102268s0(int i) {
            mo100457F();
            ((DateTime) this.f83053b).setYear(i);
            return this;
        }

        public C34587b() {
            super(DateTime.DEFAULT_INSTANCE);
        }
    }

    static {
        DateTime dateTime = new DateTime();
        DEFAULT_INSTANCE = dateTime;
        GeneratedMessageLite.registerDefaultInstance(DateTime.class, dateTime);
    }

    private DateTime() {
    }

    /* access modifiers changed from: private */
    public void clearDay() {
        this.day_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearHours() {
        this.hours_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearMinutes() {
        this.minutes_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearMonth() {
        this.month_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearNanos() {
        this.nanos_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearSeconds() {
        this.seconds_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearTimeOffset() {
        this.timeOffsetCase_ = 0;
        this.timeOffset_ = null;
    }

    /* access modifiers changed from: private */
    public void clearTimeZone() {
        if (this.timeOffsetCase_ == 9) {
            this.timeOffsetCase_ = 0;
            this.timeOffset_ = null;
        }
    }

    /* access modifiers changed from: private */
    public void clearUtcOffset() {
        if (this.timeOffsetCase_ == 8) {
            this.timeOffsetCase_ = 0;
            this.timeOffset_ = null;
        }
    }

    /* access modifiers changed from: private */
    public void clearYear() {
        this.year_ = 0;
    }

    public static DateTime getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    public void mergeTimeZone(TimeZone timeZone) {
        timeZone.getClass();
        if (this.timeOffsetCase_ != 9 || this.timeOffset_ == TimeZone.getDefaultInstance()) {
            this.timeOffset_ = timeZone;
        } else {
            this.timeOffset_ = ((TimeZone.C34605b) TimeZone.newBuilder((TimeZone) this.timeOffset_).mo100463K(timeZone)).mo100467Q();
        }
        this.timeOffsetCase_ = 9;
    }

    /* access modifiers changed from: private */
    public void mergeUtcOffset(Duration duration) {
        duration.getClass();
        if (this.timeOffsetCase_ != 8 || this.timeOffset_ == Duration.getDefaultInstance()) {
            this.timeOffset_ = duration;
        } else {
            this.timeOffset_ = ((Duration.C34243b) Duration.newBuilder((Duration) this.timeOffset_).mo100463K(duration)).mo100467Q();
        }
        this.timeOffsetCase_ = 8;
    }

    public static C34587b newBuilder() {
        return (C34587b) DEFAULT_INSTANCE.createBuilder();
    }

    public static DateTime parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DateTime) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DateTime parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<DateTime> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setDay(int i) {
        this.day_ = i;
    }

    /* access modifiers changed from: private */
    public void setHours(int i) {
        this.hours_ = i;
    }

    /* access modifiers changed from: private */
    public void setMinutes(int i) {
        this.minutes_ = i;
    }

    /* access modifiers changed from: private */
    public void setMonth(int i) {
        this.month_ = i;
    }

    /* access modifiers changed from: private */
    public void setNanos(int i) {
        this.nanos_ = i;
    }

    /* access modifiers changed from: private */
    public void setSeconds(int i) {
        this.seconds_ = i;
    }

    /* access modifiers changed from: private */
    public void setTimeZone(TimeZone timeZone) {
        timeZone.getClass();
        this.timeOffset_ = timeZone;
        this.timeOffsetCase_ = 9;
    }

    /* access modifiers changed from: private */
    public void setUtcOffset(Duration duration) {
        duration.getClass();
        this.timeOffset_ = duration;
        this.timeOffsetCase_ = 8;
    }

    /* access modifiers changed from: private */
    public void setYear(int i) {
        this.year_ = i;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C34586a.f83662a[methodToInvoke.ordinal()]) {
            case 1:
                return new DateTime();
            case 2:
                return new C34587b((C34586a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004\u0006\u0004\u0007\u0004\b<\u0000\t<\u0000", new Object[]{"timeOffset_", "timeOffsetCase_", "year_", "month_", "day_", "hours_", "minutes_", "seconds_", "nanos_", Duration.class, TimeZone.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<DateTime> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (DateTime.class) {
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

    public int getDay() {
        return this.day_;
    }

    public int getHours() {
        return this.hours_;
    }

    public int getMinutes() {
        return this.minutes_;
    }

    public int getMonth() {
        return this.month_;
    }

    public int getNanos() {
        return this.nanos_;
    }

    public int getSeconds() {
        return this.seconds_;
    }

    public TimeOffsetCase getTimeOffsetCase() {
        return TimeOffsetCase.m141095b(this.timeOffsetCase_);
    }

    public TimeZone getTimeZone() {
        if (this.timeOffsetCase_ == 9) {
            return (TimeZone) this.timeOffset_;
        }
        return TimeZone.getDefaultInstance();
    }

    public Duration getUtcOffset() {
        if (this.timeOffsetCase_ == 8) {
            return (Duration) this.timeOffset_;
        }
        return Duration.getDefaultInstance();
    }

    public int getYear() {
        return this.year_;
    }

    public boolean hasTimeZone() {
        return this.timeOffsetCase_ == 9;
    }

    public boolean hasUtcOffset() {
        return this.timeOffsetCase_ == 8;
    }

    public static C34587b newBuilder(DateTime dateTime) {
        return (C34587b) DEFAULT_INSTANCE.createBuilder(dateTime);
    }

    public static DateTime parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (DateTime) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static DateTime parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (DateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static DateTime parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DateTime parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (DateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static DateTime parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DateTime parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (DateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static DateTime parseFrom(InputStream inputStream) throws IOException {
        return (DateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DateTime parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (DateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static DateTime parseFrom(C34448s sVar) throws IOException {
        return (DateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static DateTime parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (DateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}

package com.usabilla.sdk.ubform.telemetry;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.usabilla.sdk.ubform.telemetry.b */
public abstract class C10096b<T> {

    /* renamed from: com.usabilla.sdk.ubform.telemetry.b$a */
    public static abstract class C10097a<T extends Serializable> extends C10096b<T> {
        @C12579k

        /* renamed from: a */
        public final String f27771a;
        @C12579k

        /* renamed from: b */
        public final T f27772b;

        /* renamed from: com.usabilla.sdk.ubform.telemetry.b$a$a */
        public static final class C10098a extends C10097a<String> {
            public C10098a() {
                this((String) null, 1, (DefaultConstructorMarker) null);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C10098a(@C12579k String str) {
                super("id", str, (DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(str, "value");
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C10098a(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str);
            }
        }

        /* renamed from: com.usabilla.sdk.ubform.telemetry.b$a$b */
        public static final class C10099b extends C10097a<String> {
            public C10099b() {
                this((String) null, 1, (DefaultConstructorMarker) null);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C10099b(@C12579k String str) {
                super(C10108c.f27799b, str, (DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(str, "value");
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C10099b(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str);
            }
        }

        /* renamed from: com.usabilla.sdk.ubform.telemetry.b$a$c */
        public static final class C10100c extends C10097a<String> {
            public C10100c() {
                this((String) null, 1, (DefaultConstructorMarker) null);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C10100c(@C12579k String str) {
                super(C10108c.f27801d, str, (DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(str, "value");
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C10100c(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str);
            }
        }

        public /* synthetic */ C10097a(String str, Serializable serializable, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, serializable);
        }

        @C12579k
        /* renamed from: a */
        public final String mo21548a() {
            return this.f27771a;
        }

        @C12579k
        /* renamed from: b */
        public final T mo21549b() {
            return this.f27772b;
        }

        public C10097a(String str, T t) {
            super((DefaultConstructorMarker) null);
            this.f27771a = str;
            this.f27772b = t;
        }
    }

    /* renamed from: com.usabilla.sdk.ubform.telemetry.b$b */
    public static abstract class C10101b<T extends Serializable> extends C10096b<T> {
        @C12579k

        /* renamed from: a */
        public final String f27773a;
        @C12579k

        /* renamed from: b */
        public final T f27774b;
        @C12579k

        /* renamed from: c */
        public final TelemetryOption f27775c;

        /* renamed from: com.usabilla.sdk.ubform.telemetry.b$b$a */
        public static final class C10102a<T extends Serializable> extends C10101b<T> {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C10102a(@C12579k String str, @C12579k T t) {
                super(str, t, TelemetryOption.MEMORY, (DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(str, "key");
                Intrinsics.checkNotNullParameter(t, "value");
            }
        }

        /* renamed from: com.usabilla.sdk.ubform.telemetry.b$b$b */
        public static final class C10103b<T extends Serializable> extends C10101b<T> {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C10103b(@C12579k String str, @C12579k T t) {
                super(str, t, TelemetryOption.NO_TRACKING, (DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(str, "key");
                Intrinsics.checkNotNullParameter(t, "value");
            }
        }

        /* renamed from: com.usabilla.sdk.ubform.telemetry.b$b$c */
        public static final class C10104c<T extends Serializable> extends C10101b<T> {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C10104c(@C12579k String str, @C12579k T t) {
                super(str, t, TelemetryOption.METADATA, (DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(str, "key");
                Intrinsics.checkNotNullParameter(t, "value");
            }
        }

        /* renamed from: com.usabilla.sdk.ubform.telemetry.b$b$d */
        public static final class C10105d<T extends Serializable> extends C10101b<T> {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C10105d(@C12579k String str, @C12579k T t) {
                super(str, t, TelemetryOption.METHOD, (DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(str, "key");
                Intrinsics.checkNotNullParameter(t, "value");
            }
        }

        /* renamed from: com.usabilla.sdk.ubform.telemetry.b$b$e */
        public static final class C10106e<T extends Serializable> extends C10101b<T> {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C10106e(@C12579k String str, @C12579k T t) {
                super(str, t, TelemetryOption.NETWORK, (DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(str, "key");
                Intrinsics.checkNotNullParameter(t, "value");
            }
        }

        /* renamed from: com.usabilla.sdk.ubform.telemetry.b$b$f */
        public static final class C10107f<T extends Serializable> extends C10101b<T> {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C10107f(@C12579k String str, @C12579k T t) {
                super(str, t, TelemetryOption.PROPERTY, (DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(str, "key");
                Intrinsics.checkNotNullParameter(t, "value");
            }
        }

        public /* synthetic */ C10101b(String str, Serializable serializable, TelemetryOption telemetryOption, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, serializable, telemetryOption);
        }

        @C12579k
        /* renamed from: a */
        public final String mo21550a() {
            return this.f27773a;
        }

        @C12579k
        /* renamed from: b */
        public final TelemetryOption mo21551b() {
            return this.f27775c;
        }

        @C12579k
        /* renamed from: c */
        public final T mo21552c() {
            return this.f27774b;
        }

        public C10101b(String str, T t, TelemetryOption telemetryOption) {
            super((DefaultConstructorMarker) null);
            this.f27773a = str;
            this.f27774b = t;
            this.f27775c = telemetryOption;
        }
    }

    public /* synthetic */ C10096b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public C10096b() {
    }
}

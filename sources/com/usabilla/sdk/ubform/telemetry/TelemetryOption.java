package com.usabilla.sdk.ubform.telemetry;

import kotlin.C11076d0;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000e\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/telemetry/TelemetryOption;", "", "", "value", "I", "q", "()I", "<init>", "(Ljava/lang/String;II)V", "a", "b", "c", "d", "e", "f", "g", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public enum TelemetryOption {
    NO_TRACKING(0),
    METHOD(1),
    PROPERTY(2),
    NETWORK(4),
    MEMORY(8),
    METADATA(16),
    ALL(r0.value + r1.value + r2.value + r3.value + r4.value);
    
    private final int value;

    /* access modifiers changed from: public */
    TelemetryOption(int i) {
        this.value = i;
    }

    /* renamed from: q */
    public final int mo21522q() {
        return this.value;
    }
}

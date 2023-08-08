package com.google.firebase.perf.p049v1;

import com.google.protobuf.C34471v0;

/* renamed from: com.google.firebase.perf.v1.ApplicationProcessState */
public enum ApplicationProcessState implements C34471v0.C34474c {
    APPLICATION_PROCESS_STATE_UNKNOWN(0),
    FOREGROUND(1),
    BACKGROUND(2),
    FOREGROUND_BACKGROUND(3);
    

    /* renamed from: e */
    public static final int f81353e = 0;

    /* renamed from: f */
    public static final int f81354f = 1;

    /* renamed from: g */
    public static final int f81355g = 2;

    /* renamed from: v */
    public static final int f81356v = 3;

    /* renamed from: w */
    public static final C34471v0.C34475d<ApplicationProcessState> f81357w = null;
    private final int value;

    /* renamed from: com.google.firebase.perf.v1.ApplicationProcessState$a */
    public class C33451a implements C34471v0.C34475d<ApplicationProcessState> {
        /* renamed from: b */
        public ApplicationProcessState mo93187a(int i) {
            return ApplicationProcessState.m134870b(i);
        }
    }

    /* renamed from: com.google.firebase.perf.v1.ApplicationProcessState$b */
    public static final class C33452b implements C34471v0.C34476e {

        /* renamed from: a */
        public static final C34471v0.C34476e f81359a = null;

        static {
            f81359a = new C33452b();
        }

        /* renamed from: a */
        public boolean mo93189a(int i) {
            return ApplicationProcessState.m134870b(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        f81357w = new C33451a();
    }

    /* access modifiers changed from: public */
    ApplicationProcessState(int i) {
        this.value = i;
    }

    /* renamed from: b */
    public static ApplicationProcessState m134870b(int i) {
        if (i == 0) {
            return APPLICATION_PROCESS_STATE_UNKNOWN;
        }
        if (i == 1) {
            return FOREGROUND;
        }
        if (i == 2) {
            return BACKGROUND;
        }
        if (i != 3) {
            return null;
        }
        return FOREGROUND_BACKGROUND;
    }

    /* renamed from: g */
    public static C34471v0.C34475d<ApplicationProcessState> m134871g() {
        return f81357w;
    }

    /* renamed from: q */
    public static C34471v0.C34476e m134872q() {
        return C33452b.f81359a;
    }

    @Deprecated
    /* renamed from: r */
    public static ApplicationProcessState m134873r(int i) {
        return m134870b(i);
    }

    public final int getNumber() {
        return this.value;
    }
}

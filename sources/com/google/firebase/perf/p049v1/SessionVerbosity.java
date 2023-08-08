package com.google.firebase.perf.p049v1;

import com.google.protobuf.C34471v0;

/* renamed from: com.google.firebase.perf.v1.SessionVerbosity */
public enum SessionVerbosity implements C34471v0.C34474c {
    SESSION_VERBOSITY_NONE(0),
    GAUGES_AND_SYSTEM_EVENTS(1);
    

    /* renamed from: c */
    public static final int f81486c = 0;

    /* renamed from: d */
    public static final int f81487d = 1;

    /* renamed from: e */
    public static final C34471v0.C34475d<SessionVerbosity> f81488e = null;
    private final int value;

    /* renamed from: com.google.firebase.perf.v1.SessionVerbosity$a */
    public class C33477a implements C34471v0.C34475d<SessionVerbosity> {
        /* renamed from: b */
        public SessionVerbosity mo93187a(int i) {
            return SessionVerbosity.m135018b(i);
        }
    }

    /* renamed from: com.google.firebase.perf.v1.SessionVerbosity$b */
    public static final class C33478b implements C34471v0.C34476e {

        /* renamed from: a */
        public static final C34471v0.C34476e f81490a = null;

        static {
            f81490a = new C33478b();
        }

        /* renamed from: a */
        public boolean mo93189a(int i) {
            return SessionVerbosity.m135018b(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        f81488e = new C33477a();
    }

    /* access modifiers changed from: public */
    SessionVerbosity(int i) {
        this.value = i;
    }

    /* renamed from: b */
    public static SessionVerbosity m135018b(int i) {
        if (i == 0) {
            return SESSION_VERBOSITY_NONE;
        }
        if (i != 1) {
            return null;
        }
        return GAUGES_AND_SYSTEM_EVENTS;
    }

    /* renamed from: g */
    public static C34471v0.C34475d<SessionVerbosity> m135019g() {
        return f81488e;
    }

    /* renamed from: q */
    public static C34471v0.C34476e m135020q() {
        return C33478b.f81490a;
    }

    @Deprecated
    /* renamed from: r */
    public static SessionVerbosity m135021r(int i) {
        return m135018b(i);
    }

    public final int getNumber() {
        return this.value;
    }
}

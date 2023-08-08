package com.google.logging.type;

import com.google.protobuf.C34471v0;

public enum LogSeverity implements C34471v0.C34474c {
    DEFAULT(0),
    DEBUG(100),
    INFO(200),
    NOTICE(300),
    WARNING(400),
    ERROR(500),
    CRITICAL(600),
    ALERT(700),
    EMERGENCY(800),
    UNRECOGNIZED(-1);
    

    /* renamed from: E0 */
    public static final int f81846E0 = 500;

    /* renamed from: F0 */
    public static final int f81847F0 = 600;

    /* renamed from: G0 */
    public static final int f81848G0 = 700;

    /* renamed from: H0 */
    public static final int f81849H0 = 800;

    /* renamed from: I0 */
    public static final C34471v0.C34475d<LogSeverity> f81850I0 = null;

    /* renamed from: X */
    public static final int f81852X = 200;

    /* renamed from: Y */
    public static final int f81853Y = 300;

    /* renamed from: Z */
    public static final int f81854Z = 400;

    /* renamed from: y */
    public static final int f81865y = 0;

    /* renamed from: z */
    public static final int f81866z = 100;
    private final int value;

    /* renamed from: com.google.logging.type.LogSeverity$a */
    public class C33717a implements C34471v0.C34475d<LogSeverity> {
        /* renamed from: b */
        public LogSeverity mo93187a(int i) {
            return LogSeverity.m135597b(i);
        }
    }

    /* renamed from: com.google.logging.type.LogSeverity$b */
    public static final class C33718b implements C34471v0.C34476e {

        /* renamed from: a */
        public static final C34471v0.C34476e f81867a = null;

        static {
            f81867a = new C33718b();
        }

        /* renamed from: a */
        public boolean mo93189a(int i) {
            return LogSeverity.m135597b(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        f81850I0 = new C33717a();
    }

    /* access modifiers changed from: public */
    LogSeverity(int i) {
        this.value = i;
    }

    /* renamed from: b */
    public static LogSeverity m135597b(int i) {
        if (i == 0) {
            return DEFAULT;
        }
        if (i == 100) {
            return DEBUG;
        }
        if (i == 200) {
            return INFO;
        }
        if (i == 300) {
            return NOTICE;
        }
        if (i == 400) {
            return WARNING;
        }
        if (i == 500) {
            return ERROR;
        }
        if (i == 600) {
            return CRITICAL;
        }
        if (i == 700) {
            return ALERT;
        }
        if (i != 800) {
            return null;
        }
        return EMERGENCY;
    }

    /* renamed from: g */
    public static C34471v0.C34475d<LogSeverity> m135598g() {
        return f81850I0;
    }

    /* renamed from: q */
    public static C34471v0.C34476e m135599q() {
        return C33718b.f81867a;
    }

    @Deprecated
    /* renamed from: r */
    public static LogSeverity m135600r(int i) {
        return m135597b(i);
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

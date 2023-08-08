package com.contentsquare.android.sdk;

/* renamed from: com.contentsquare.android.sdk.sf */
public final class C14710sf {

    /* renamed from: a */
    public static final int f36404a = m63425b(1, 3);

    /* renamed from: b */
    public static final int f36405b = m63425b(1, 4);

    /* renamed from: c */
    public static final int f36406c = m63425b(2, 0);

    /* renamed from: d */
    public static final int f36407d = m63425b(3, 2);

    /* renamed from: com.contentsquare.android.sdk.sf$b */
    public enum C14712b {
        DOUBLE(C14717c.DOUBLE, 1),
        FLOAT(C14717c.FLOAT, 5),
        INT64(r5, 0),
        UINT64(r5, 0),
        INT32(r11, 0),
        FIXED64(r5, 1),
        FIXED32(r11, 5),
        BOOL(C14717c.BOOLEAN, 0),
        STRING(C14717c.STRING, 2) {
        },
        GROUP(r13, 3) {
        },
        MESSAGE(r13, 2) {
        },
        BYTES(C14717c.BYTE_STRING, 2) {
        },
        UINT32(r11, 0),
        ENUM(C14717c.ENUM, 0),
        SFIXED32(r11, 5),
        SFIXED64(r5, 1),
        SINT32(r11, 0),
        SINT64(r5, 0);
        

        /* renamed from: a */
        public final C14717c f36427a;

        /* renamed from: b */
        public final int f36428b;

        /* access modifiers changed from: public */
        C14712b(C14717c cVar, int i) {
            this.f36427a = cVar;
            this.f36428b = i;
        }

        /* renamed from: g */
        public C14717c mo36423g() {
            return this.f36427a;
        }
    }

    /* renamed from: com.contentsquare.android.sdk.sf$c */
    public enum C14717c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(C14719t0.f36442b),
        ENUM((String) null),
        MESSAGE((String) null);
        

        /* renamed from: a */
        public final Object f36439a;

        /* access modifiers changed from: public */
        C14717c(Object obj) {
            this.f36439a = obj;
        }
    }

    /* renamed from: a */
    public static int m63424a(int i) {
        return i >>> 3;
    }

    /* renamed from: b */
    public static int m63425b(int i, int i2) {
        return (i << 3) | i2;
    }

    /* renamed from: c */
    public static int m63426c(int i) {
        return i & 7;
    }
}

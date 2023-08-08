package com.contentsquare.android.sdk;

import java.lang.reflect.Type;

/* renamed from: com.contentsquare.android.sdk.u3 */
public enum C14762u3 {
    DOUBLE(0, r4, r8),
    FLOAT(1, r4, r10),
    INT64(2, r4, r5),
    UINT64(3, r4, r5),
    INT32(4, r4, r15),
    FIXED64(5, r4, r12),
    FIXED32(6, r4, r15),
    BOOL(7, r4, r19),
    STRING(8, r4, r21),
    MESSAGE(9, r4, r23),
    BYTES(10, r4, r25),
    UINT32(11, r4, r15),
    ENUM(12, r4, r28),
    SFIXED32(13, r4, r15),
    SFIXED64(14, r4, r12),
    SINT32(15, r4, r15),
    SINT64(16, r4, r12),
    GROUP(17, r4, r23),
    DOUBLE_LIST(18, r4, r8),
    FLOAT_LIST(19, r4, r10),
    INT64_LIST(20, r4, r5),
    UINT64_LIST(21, r4, r5),
    INT32_LIST(22, r4, r15),
    FIXED64_LIST(23, r4, r12),
    FIXED32_LIST(24, r4, r15),
    BOOL_LIST(25, r4, r19),
    STRING_LIST(26, r4, r21),
    MESSAGE_LIST(27, r4, r23),
    BYTES_LIST(28, r4, r25),
    UINT32_LIST(29, r4, r15),
    ENUM_LIST(30, r4, r28),
    SFIXED32_LIST(31, r4, r15),
    SFIXED64_LIST(32, r4, r12),
    SINT32_LIST(33, r4, r15),
    SINT64_LIST(34, r4, r12),
    DOUBLE_LIST_PACKED(35, r4, r8),
    FLOAT_LIST_PACKED(36, r4, r10),
    INT64_LIST_PACKED(37, r4, r5),
    UINT64_LIST_PACKED(38, r4, r5),
    INT32_LIST_PACKED(39, r4, r15),
    FIXED64_LIST_PACKED(40, r4, r12),
    FIXED32_LIST_PACKED(41, r4, r15),
    BOOL_LIST_PACKED(42, r4, r19),
    UINT32_LIST_PACKED(43, r4, r15),
    ENUM_LIST_PACKED(44, r4, r28),
    SFIXED32_LIST_PACKED(45, r4, r15),
    SFIXED64_LIST_PACKED(46, r4, r12),
    SINT32_LIST_PACKED(47, r4, r15),
    SINT64_LIST_PACKED(48, r4, r12),
    GROUP_LIST(49, r34, r23),
    MAP(50, C14764b.MAP, C14416i5.VOID);
    

    /* renamed from: t1 */
    public static final C14762u3[] f36582t1 = null;

    /* renamed from: u1 */
    public static final Type[] f36583u1 = null;

    /* renamed from: a */
    public final C14416i5 f36590a;

    /* renamed from: b */
    public final int f36591b;

    /* renamed from: c */
    public final C14764b f36592c;

    /* renamed from: d */
    public final Class<?> f36593d;

    /* renamed from: e */
    public final boolean f36594e;

    /* renamed from: com.contentsquare.android.sdk.u3$a */
    public static /* synthetic */ class C14763a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36595a = null;

        /* renamed from: b */
        public static final /* synthetic */ int[] f36596b = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        static {
            /*
                com.contentsquare.android.sdk.i5[] r0 = com.contentsquare.android.sdk.C14416i5.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f36596b = r0
                r1 = 1
                com.contentsquare.android.sdk.i5 r2 = com.contentsquare.android.sdk.C14416i5.BYTE_STRING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f36596b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.contentsquare.android.sdk.i5 r3 = com.contentsquare.android.sdk.C14416i5.MESSAGE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f36596b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.contentsquare.android.sdk.i5 r4 = com.contentsquare.android.sdk.C14416i5.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.contentsquare.android.sdk.u3$b[] r3 = com.contentsquare.android.sdk.C14762u3.C14764b.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f36595a = r3
                com.contentsquare.android.sdk.u3$b r4 = com.contentsquare.android.sdk.C14762u3.C14764b.MAP     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f36595a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.contentsquare.android.sdk.u3$b r3 = com.contentsquare.android.sdk.C14762u3.C14764b.VECTOR     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f36595a     // Catch:{ NoSuchFieldError -> 0x004d }
                com.contentsquare.android.sdk.u3$b r1 = com.contentsquare.android.sdk.C14762u3.C14764b.SCALAR     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.C14762u3.C14763a.<clinit>():void");
        }
    }

    /* renamed from: com.contentsquare.android.sdk.u3$b */
    public enum C14764b {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);
        

        /* renamed from: a */
        public final boolean f36602a;

        /* access modifiers changed from: public */
        C14764b(boolean z) {
            this.f36602a = z;
        }
    }

    /* access modifiers changed from: public */
    static {
        int i;
        f36583u1 = new Type[0];
        C14762u3[] values = values();
        f36582t1 = new C14762u3[values.length];
        for (C14762u3 u3Var : values) {
            f36582t1[u3Var.f36591b] = u3Var;
        }
    }

    /* access modifiers changed from: public */
    C14762u3(int i, C14764b bVar, C14416i5 i5Var) {
        int i2;
        this.f36591b = i;
        this.f36592c = bVar;
        this.f36590a = i5Var;
        int i3 = C14763a.f36595a[bVar.ordinal()];
        boolean z = true;
        this.f36593d = (i3 == 1 || i3 == 2) ? i5Var.mo35520g() : null;
        this.f36594e = (bVar != C14764b.SCALAR || (i2 = C14763a.f36596b[i5Var.ordinal()]) == 1 || i2 == 2 || i2 == 3) ? false : z;
    }

    /* renamed from: g */
    public int mo36550g() {
        return this.f36591b;
    }
}

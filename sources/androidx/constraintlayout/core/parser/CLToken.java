package androidx.constraintlayout.core.parser;

import com.carrefour.fid.android.airship.util.C13758b;

public class CLToken extends C16735c {

    /* renamed from: v */
    public int f42386v = 0;

    /* renamed from: w */
    public Type f42387w = Type.UNKNOWN;

    /* renamed from: x */
    public char[] f42388x = C13758b.f33436b.toCharArray();

    /* renamed from: y */
    public char[] f42389y = C13758b.f33438c.toCharArray();

    /* renamed from: z */
    public char[] f42390z = "null".toCharArray();

    public enum Type {
        UNKNOWN,
        TRUE,
        FALSE,
        NULL
    }

    /* renamed from: androidx.constraintlayout.core.parser.CLToken$a */
    public static /* synthetic */ class C16732a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f42396a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.constraintlayout.core.parser.CLToken$Type[] r0 = androidx.constraintlayout.core.parser.CLToken.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f42396a = r0
                androidx.constraintlayout.core.parser.CLToken$Type r1 = androidx.constraintlayout.core.parser.CLToken.Type.TRUE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f42396a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.core.parser.CLToken$Type r1 = androidx.constraintlayout.core.parser.CLToken.Type.FALSE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f42396a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.core.parser.CLToken$Type r1 = androidx.constraintlayout.core.parser.CLToken.Type.NULL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f42396a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.core.parser.CLToken$Type r1 = androidx.constraintlayout.core.parser.CLToken.Type.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.parser.CLToken.C16732a.<clinit>():void");
        }
    }

    public CLToken(char[] cArr) {
        super(cArr);
    }

    /* renamed from: j0 */
    public static C16735c m76380j0(char[] cArr) {
        return new CLToken(cArr);
    }

    /* renamed from: h0 */
    public String mo49133h0(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        mo49175e(sb, i);
        sb.append(mo49178h());
        return sb.toString();
    }

    /* renamed from: i0 */
    public String mo49134i0() {
        if (!CLParser.f42373d) {
            return mo49178h();
        }
        return "<" + mo49178h() + ">";
    }

    /* renamed from: k0 */
    public boolean mo49135k0() throws CLParsingException {
        Type type = this.f42387w;
        if (type == Type.TRUE) {
            return true;
        }
        if (type == Type.FALSE) {
            return false;
        }
        throw new CLParsingException("this token is not a boolean: <" + mo49178h() + ">", this);
    }

    /* renamed from: l0 */
    public Type mo49136l0() {
        return this.f42387w;
    }

    /* renamed from: m0 */
    public boolean mo49137m0() throws CLParsingException {
        if (this.f42387w == Type.NULL) {
            return true;
        }
        throw new CLParsingException("this token is not a null: <" + mo49178h() + ">", this);
    }

    /* renamed from: n0 */
    public boolean mo49138n0(char c, long j) {
        int i = C16732a.f42396a[this.f42387w.ordinal()];
        boolean z = false;
        if (i == 1) {
            char[] cArr = this.f42388x;
            int i2 = this.f42386v;
            if (cArr[i2] == c) {
                z = true;
            }
            if (z && i2 + 1 == cArr.length) {
                mo49174Y(j);
            }
        } else if (i == 2) {
            char[] cArr2 = this.f42389y;
            int i3 = this.f42386v;
            if (cArr2[i3] == c) {
                z = true;
            }
            if (z && i3 + 1 == cArr2.length) {
                mo49174Y(j);
            }
        } else if (i == 3) {
            char[] cArr3 = this.f42390z;
            int i4 = this.f42386v;
            if (cArr3[i4] == c) {
                z = true;
            }
            if (z && i4 + 1 == cArr3.length) {
                mo49174Y(j);
            }
        } else if (i == 4) {
            char[] cArr4 = this.f42388x;
            int i5 = this.f42386v;
            if (cArr4[i5] == c) {
                this.f42387w = Type.TRUE;
            } else if (this.f42389y[i5] == c) {
                this.f42387w = Type.FALSE;
            } else if (this.f42390z[i5] == c) {
                this.f42387w = Type.NULL;
            }
            z = true;
        }
        this.f42386v++;
        return z;
    }
}

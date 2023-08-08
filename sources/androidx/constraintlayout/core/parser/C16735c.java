package androidx.constraintlayout.core.parser;

import com.carrefour.fid.android.core.extension.C36306e;
import java.io.PrintStream;

/* renamed from: androidx.constraintlayout.core.parser.c */
public class C16735c {

    /* renamed from: f */
    public static int f42398f = 80;

    /* renamed from: g */
    public static int f42399g = 2;

    /* renamed from: a */
    public final char[] f42400a;

    /* renamed from: b */
    public long f42401b = -1;

    /* renamed from: c */
    public long f42402c = Long.MAX_VALUE;

    /* renamed from: d */
    public C16734b f42403d;

    /* renamed from: e */
    public int f42404e;

    public C16735c(char[] cArr) {
        this.f42400a = cArr;
    }

    /* renamed from: A */
    public long mo49168A() {
        return this.f42401b;
    }

    /* renamed from: H */
    public String mo49169H() {
        String cls = getClass().toString();
        return cls.substring(cls.lastIndexOf(46) + 1);
    }

    /* renamed from: M */
    public boolean mo49170M() {
        return this.f42402c != Long.MAX_VALUE;
    }

    /* renamed from: Q */
    public boolean mo49171Q() {
        return this.f42401b > -1;
    }

    /* renamed from: W */
    public boolean mo49172W() {
        return this.f42401b == -1;
    }

    /* renamed from: X */
    public void mo49173X(C16734b bVar) {
        this.f42403d = bVar;
    }

    /* renamed from: Y */
    public void mo49174Y(long j) {
        if (this.f42402c == Long.MAX_VALUE) {
            this.f42402c = j;
            if (CLParser.f42373d) {
                PrintStream printStream = System.out;
                printStream.println("closing " + hashCode() + " -> " + this);
            }
            C16734b bVar = this.f42403d;
            if (bVar != null) {
                bVar.mo49152j0(this);
            }
        }
    }

    /* renamed from: e */
    public void mo49175e(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(' ');
        }
    }

    /* renamed from: e0 */
    public void mo49176e0(int i) {
        this.f42404e = i;
    }

    /* renamed from: f0 */
    public void mo49177f0(long j) {
        this.f42401b = j;
    }

    /* renamed from: h */
    public String mo49178h() {
        String str = new String(this.f42400a);
        long j = this.f42402c;
        if (j != Long.MAX_VALUE) {
            long j2 = this.f42401b;
            if (j >= j2) {
                return str.substring((int) j2, ((int) j) + 1);
            }
        }
        long j3 = this.f42401b;
        return str.substring((int) j3, ((int) j3) + 1);
    }

    /* renamed from: h0 */
    public String mo49133h0(int i, int i2) {
        return "";
    }

    /* renamed from: i */
    public C16735c mo49179i() {
        return this.f42403d;
    }

    /* renamed from: i0 */
    public String mo49134i0() {
        return "";
    }

    /* renamed from: k */
    public String mo49180k() {
        if (!CLParser.f42373d) {
            return "";
        }
        return mo49169H() + " -> ";
    }

    /* renamed from: q */
    public long mo49181q() {
        return this.f42402c;
    }

    /* renamed from: r */
    public float mo49182r() {
        if (this instanceof C16737e) {
            return ((C16737e) this).mo49182r();
        }
        return Float.NaN;
    }

    public String toString() {
        long j = this.f42401b;
        long j2 = this.f42402c;
        if (j > j2 || j2 == Long.MAX_VALUE) {
            return getClass() + " (INVALID, " + this.f42401b + "-" + this.f42402c + ")";
        }
        String substring = new String(this.f42400a).substring((int) this.f42401b, ((int) this.f42402c) + 1);
        return mo49169H() + C36306e.f89637a + this.f42401b + " : " + this.f42402c + ") <<" + substring + ">>";
    }

    /* renamed from: w */
    public int mo49183w() {
        if (this instanceof C16737e) {
            return ((C16737e) this).mo49183w();
        }
        return 0;
    }

    /* renamed from: y */
    public int mo49184y() {
        return this.f42404e;
    }
}

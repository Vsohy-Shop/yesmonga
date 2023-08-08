package androidx.emoji2.text.flatbuffer;

import androidx.emoji2.text.flatbuffer.FlexBuffers;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

/* renamed from: androidx.emoji2.text.flatbuffer.j */
public class C19057j {

    /* renamed from: h */
    public static final int f48507h = 0;

    /* renamed from: i */
    public static final int f48508i = 1;

    /* renamed from: j */
    public static final int f48509j = 2;

    /* renamed from: k */
    public static final int f48510k = 3;

    /* renamed from: l */
    public static final int f48511l = 4;

    /* renamed from: m */
    public static final int f48512m = 7;

    /* renamed from: n */
    public static final int f48513n = 0;

    /* renamed from: o */
    public static final int f48514o = 1;

    /* renamed from: p */
    public static final int f48515p = 2;

    /* renamed from: q */
    public static final int f48516q = 3;

    /* renamed from: r */
    public static final /* synthetic */ boolean f48517r = false;

    /* renamed from: a */
    public final C19068q f48518a;

    /* renamed from: b */
    public final ArrayList<C19059b> f48519b;

    /* renamed from: c */
    public final HashMap<String, Integer> f48520c;

    /* renamed from: d */
    public final HashMap<String, Integer> f48521d;

    /* renamed from: e */
    public final int f48522e;

    /* renamed from: f */
    public boolean f48523f;

    /* renamed from: g */
    public Comparator<C19059b> f48524g;

    /* renamed from: androidx.emoji2.text.flatbuffer.j$a */
    public class C19058a implements Comparator<C19059b> {
        public C19058a() {
        }

        /* renamed from: a */
        public int compare(C19059b bVar, C19059b bVar2) {
            byte b;
            byte b2;
            int i = bVar.f48531e;
            int i2 = bVar2.f48531e;
            do {
                b = C19057j.this.f48518a.get(i);
                b2 = C19057j.this.f48518a.get(i2);
                if (b == 0) {
                    return b - b2;
                }
                i++;
                i2++;
            } while (b == b2);
            return b - b2;
        }
    }

    public C19057j(int i) {
        this((C19068q) new C19045a(i), 1);
    }

    /* renamed from: E */
    public static int m89154E(long j) {
        if (j <= ((long) FlexBuffers.C19042i.m89001a((byte) -1))) {
            return 0;
        }
        if (j <= ((long) FlexBuffers.C19042i.m89003c(-1))) {
            return 1;
        }
        if (j <= FlexBuffers.C19042i.m89002b(-1)) {
            return 2;
        }
        return 3;
    }

    /* renamed from: A */
    public final void mo56151A(String str, long j) {
        this.f48519b.add(C19059b.m89210w(mo56180u(str), j));
    }

    /* renamed from: B */
    public void mo56152B(BigInteger bigInteger) {
        mo56151A((String) null, bigInteger.longValue());
    }

    /* renamed from: C */
    public int mo56153C() {
        return this.f48519b.size();
    }

    /* renamed from: D */
    public int mo56154D() {
        return this.f48519b.size();
    }

    /* renamed from: F */
    public final void mo56155F(C19059b bVar, int i) {
        int i2 = bVar.f48527a;
        if (!(i2 == 0 || i2 == 1 || i2 == 2)) {
            if (i2 == 3) {
                mo56157H(bVar.f48529c, i);
                return;
            } else if (i2 != 26) {
                mo56159J(bVar.f48530d, i);
                return;
            }
        }
        mo56158I(bVar.f48530d, i);
    }

    /* renamed from: G */
    public final C19059b mo56156G(int i, byte[] bArr, int i2, boolean z) {
        int E = m89154E((long) bArr.length);
        mo56158I((long) bArr.length, mo56161b(E));
        int g = this.f48518a.mo56059g();
        this.f48518a.mo56073n(bArr, 0, bArr.length);
        if (z) {
            this.f48518a.mo56067i((byte) 0);
        }
        return C19059b.m89197f(i, g, i2, E);
    }

    /* renamed from: H */
    public final void mo56157H(double d, int i) {
        if (i == 4) {
            this.f48518a.mo56066h((float) d);
        } else if (i == 8) {
            this.f48518a.mo56054b(d);
        }
    }

    /* renamed from: I */
    public final void mo56158I(long j, int i) {
        if (i == 1) {
            this.f48518a.mo56067i((byte) ((int) j));
        } else if (i == 2) {
            this.f48518a.mo56068j((short) ((int) j));
        } else if (i == 4) {
            this.f48518a.mo56072m((int) j);
        } else if (i == 8) {
            this.f48518a.mo56075p(j);
        }
    }

    /* renamed from: J */
    public final void mo56159J(long j, int i) {
        mo56158I((long) ((int) (((long) this.f48518a.mo56059g()) - j)), i);
    }

    /* renamed from: K */
    public final C19059b mo56160K(int i, String str) {
        return mo56156G(i, str.getBytes(StandardCharsets.UTF_8), 5, true);
    }

    /* renamed from: b */
    public final int mo56161b(int i) {
        int i2 = 1 << i;
        int a = C19059b.m89207q(this.f48518a.mo56059g(), i2);
        while (true) {
            int i3 = a - 1;
            if (a == 0) {
                return i2;
            }
            this.f48518a.mo56067i((byte) 0);
            a = i3;
        }
    }

    /* renamed from: c */
    public final C19059b mo56162c(int i, int i2) {
        long j = (long) i2;
        int max = Math.max(0, m89154E(j));
        int i3 = i;
        while (i3 < this.f48519b.size()) {
            i3++;
            max = Math.max(max, C19059b.m89199i(4, 0, (long) this.f48519b.get(i3).f48531e, this.f48518a.mo56059g(), i3));
        }
        int b = mo56161b(max);
        mo56158I(j, b);
        int g = this.f48518a.mo56059g();
        while (i < this.f48519b.size()) {
            int i4 = this.f48519b.get(i).f48531e;
            mo56159J((long) this.f48519b.get(i).f48531e, b);
            i++;
        }
        return new C19059b(-1, FlexBuffers.m88948q(4, 0), max, (long) g);
    }

    /* renamed from: d */
    public final C19059b mo56163d(int i, int i2, int i3, boolean z, boolean z2, C19059b bVar) {
        int i4;
        int i5;
        C19059b bVar2 = bVar;
        int i6 = i3;
        long j = (long) i6;
        int max = Math.max(0, m89154E(j));
        if (bVar2 != null) {
            max = Math.max(max, bVar2.mo56188h(this.f48518a.mo56059g(), 0));
            i4 = 3;
        } else {
            i4 = 1;
        }
        int i7 = 4;
        int i8 = max;
        for (int i9 = i2; i9 < this.f48519b.size(); i9++) {
            i8 = Math.max(i8, this.f48519b.get(i9).mo56188h(this.f48518a.mo56059g(), i9 + i4));
            int i10 = i2;
            if (z && i9 == i10) {
                i7 = this.f48519b.get(i9).f48527a;
                if (!FlexBuffers.m88943l(i7)) {
                    throw new FlexBuffers.FlexBufferException("TypedVector does not support this element type");
                }
            }
        }
        int i11 = i2;
        int b = mo56161b(i8);
        if (bVar2 != null) {
            mo56159J(bVar2.f48530d, b);
            mo56158I(1 << bVar2.f48528b, b);
        }
        if (!z2) {
            mo56158I(j, b);
        }
        int g = this.f48518a.mo56059g();
        for (int i12 = i11; i12 < this.f48519b.size(); i12++) {
            mo56155F(this.f48519b.get(i12), b);
        }
        if (!z) {
            while (i11 < this.f48519b.size()) {
                this.f48518a.mo56067i(this.f48519b.get(i11).mo56190s(i8));
                i11++;
            }
        }
        if (bVar2 != null) {
            i5 = 9;
        } else if (z) {
            if (!z2) {
                i6 = 0;
            }
            i5 = FlexBuffers.m88948q(i7, i6);
        } else {
            i5 = 10;
        }
        return new C19059b(i, i5, i8, (long) g);
    }

    /* renamed from: e */
    public int mo56164e(String str, int i) {
        int u = mo56180u(str);
        ArrayList<C19059b> arrayList = this.f48519b;
        Collections.sort(arrayList.subList(i, arrayList.size()), this.f48524g);
        int i2 = i;
        C19059b d = mo56163d(u, i2, this.f48519b.size() - i, false, false, mo56162c(i, this.f48519b.size() - i));
        while (this.f48519b.size() > i) {
            ArrayList<C19059b> arrayList2 = this.f48519b;
            arrayList2.remove(arrayList2.size() - 1);
        }
        this.f48519b.add(d);
        return (int) d.f48530d;
    }

    /* renamed from: f */
    public int mo56165f(String str, int i, boolean z, boolean z2) {
        C19059b d = mo56163d(mo56180u(str), i, this.f48519b.size() - i, z, z2, (C19059b) null);
        while (this.f48519b.size() > i) {
            ArrayList<C19059b> arrayList = this.f48519b;
            arrayList.remove(arrayList.size() - 1);
        }
        this.f48519b.add(d);
        return (int) d.f48530d;
    }

    /* renamed from: g */
    public ByteBuffer mo56166g() {
        int b = mo56161b(this.f48519b.get(0).mo56188h(this.f48518a.mo56059g(), 0));
        mo56155F(this.f48519b.get(0), b);
        this.f48518a.mo56067i(this.f48519b.get(0).mo56189r());
        this.f48518a.mo56067i((byte) b);
        this.f48523f = true;
        return ByteBuffer.wrap(this.f48518a.mo56057e(), 0, this.f48518a.mo56059g());
    }

    /* renamed from: h */
    public C19068q mo56167h() {
        return this.f48518a;
    }

    /* renamed from: i */
    public int mo56168i(String str, byte[] bArr) {
        C19059b G = mo56156G(mo56180u(str), bArr, 25, false);
        this.f48519b.add(G);
        return (int) G.f48530d;
    }

    /* renamed from: j */
    public int mo56169j(byte[] bArr) {
        return mo56168i((String) null, bArr);
    }

    /* renamed from: k */
    public void mo56170k(String str, boolean z) {
        this.f48519b.add(C19059b.m89198g(mo56180u(str), z));
    }

    /* renamed from: l */
    public void mo56171l(boolean z) {
        mo56170k((String) null, z);
    }

    /* renamed from: m */
    public void mo56172m(double d) {
        mo56174o((String) null, d);
    }

    /* renamed from: n */
    public void mo56173n(float f) {
        mo56175p((String) null, f);
    }

    /* renamed from: o */
    public void mo56174o(String str, double d) {
        this.f48519b.add(C19059b.m89201k(mo56180u(str), d));
    }

    /* renamed from: p */
    public void mo56175p(String str, float f) {
        this.f48519b.add(C19059b.m89200j(mo56180u(str), f));
    }

    /* renamed from: q */
    public void mo56176q(int i) {
        mo56178s((String) null, i);
    }

    /* renamed from: r */
    public void mo56177r(long j) {
        mo56179t((String) null, j);
    }

    /* renamed from: s */
    public void mo56178s(String str, int i) {
        mo56179t(str, (long) i);
    }

    /* renamed from: t */
    public void mo56179t(String str, long j) {
        int u = mo56180u(str);
        if (-128 <= j && j <= 127) {
            this.f48519b.add(C19059b.m89205o(u, (int) j));
        } else if (-32768 <= j && j <= 32767) {
            this.f48519b.add(C19059b.m89202l(u, (int) j));
        } else if (-2147483648L > j || j > 2147483647L) {
            this.f48519b.add(C19059b.m89204n(u, j));
        } else {
            this.f48519b.add(C19059b.m89203m(u, (int) j));
        }
    }

    /* renamed from: u */
    public final int mo56180u(String str) {
        if (str == null) {
            return -1;
        }
        int g = this.f48518a.mo56059g();
        if ((this.f48522e & 1) != 0) {
            Integer num = this.f48520c.get(str);
            if (num != null) {
                return num.intValue();
            }
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            this.f48518a.mo56073n(bytes, 0, bytes.length);
            this.f48518a.mo56067i((byte) 0);
            this.f48520c.put(str, Integer.valueOf(g));
            return g;
        }
        byte[] bytes2 = str.getBytes(StandardCharsets.UTF_8);
        this.f48518a.mo56073n(bytes2, 0, bytes2.length);
        this.f48518a.mo56067i((byte) 0);
        this.f48520c.put(str, Integer.valueOf(g));
        return g;
    }

    /* renamed from: v */
    public int mo56181v(String str) {
        return mo56182w((String) null, str);
    }

    /* renamed from: w */
    public int mo56182w(String str, String str2) {
        int u = mo56180u(str);
        if ((this.f48522e & 2) != 0) {
            Integer num = this.f48521d.get(str2);
            if (num == null) {
                C19059b K = mo56160K(u, str2);
                this.f48521d.put(str2, Integer.valueOf((int) K.f48530d));
                this.f48519b.add(K);
                return (int) K.f48530d;
            }
            this.f48519b.add(C19059b.m89197f(u, num.intValue(), 5, m89154E((long) str2.length())));
            return num.intValue();
        }
        C19059b K2 = mo56160K(u, str2);
        this.f48519b.add(K2);
        return (int) K2.f48530d;
    }

    /* renamed from: x */
    public void mo56183x(int i) {
        mo56185z((String) null, (long) i);
    }

    /* renamed from: y */
    public void mo56184y(long j) {
        mo56185z((String) null, j);
    }

    /* renamed from: z */
    public final void mo56185z(String str, long j) {
        C19059b bVar;
        int u = mo56180u(str);
        int E = m89154E(j);
        if (E == 0) {
            bVar = C19059b.m89211x(u, (int) j);
        } else if (E == 1) {
            bVar = C19059b.m89208u(u, (int) j);
        } else if (E == 2) {
            bVar = C19059b.m89209v(u, (int) j);
        } else {
            bVar = C19059b.m89210w(u, j);
        }
        this.f48519b.add(bVar);
    }

    public C19057j() {
        this(256);
    }

    @Deprecated
    public C19057j(ByteBuffer byteBuffer, int i) {
        this((C19068q) new C19045a(byteBuffer.array()), i);
    }

    public C19057j(C19068q qVar, int i) {
        this.f48519b = new ArrayList<>();
        this.f48520c = new HashMap<>();
        this.f48521d = new HashMap<>();
        this.f48523f = false;
        this.f48524g = new C19058a();
        this.f48518a = qVar;
        this.f48522e = i;
    }

    /* renamed from: androidx.emoji2.text.flatbuffer.j$b */
    public static class C19059b {

        /* renamed from: f */
        public static final /* synthetic */ boolean f48526f = false;

        /* renamed from: a */
        public final int f48527a;

        /* renamed from: b */
        public final int f48528b;

        /* renamed from: c */
        public final double f48529c;

        /* renamed from: d */
        public long f48530d;

        /* renamed from: e */
        public int f48531e;

        public C19059b(int i, int i2, int i3, long j) {
            this.f48531e = i;
            this.f48527a = i2;
            this.f48528b = i3;
            this.f48530d = j;
            this.f48529c = Double.MIN_VALUE;
        }

        /* renamed from: f */
        public static C19059b m89197f(int i, int i2, int i3, int i4) {
            return new C19059b(i, i3, i4, (long) i2);
        }

        /* renamed from: g */
        public static C19059b m89198g(int i, boolean z) {
            return new C19059b(i, 26, 0, z ? 1 : 0);
        }

        /* renamed from: i */
        public static int m89199i(int i, int i2, long j, int i3, int i4) {
            if (FlexBuffers.m88941j(i)) {
                return i2;
            }
            for (int i5 = 1; i5 <= 32; i5 *= 2) {
                int E = C19057j.m89154E((long) ((int) (((long) ((m89207q(i3, i5) + i3) + (i4 * i5))) - j)));
                if ((1 << E) == ((long) i5)) {
                    return E;
                }
            }
            return 3;
        }

        /* renamed from: j */
        public static C19059b m89200j(int i, float f) {
            return new C19059b(i, 3, 2, (double) f);
        }

        /* renamed from: k */
        public static C19059b m89201k(int i, double d) {
            return new C19059b(i, 3, 3, d);
        }

        /* renamed from: l */
        public static C19059b m89202l(int i, int i2) {
            return new C19059b(i, 1, 1, (long) i2);
        }

        /* renamed from: m */
        public static C19059b m89203m(int i, int i2) {
            return new C19059b(i, 1, 2, (long) i2);
        }

        /* renamed from: n */
        public static C19059b m89204n(int i, long j) {
            return new C19059b(i, 1, 3, j);
        }

        /* renamed from: o */
        public static C19059b m89205o(int i, int i2) {
            return new C19059b(i, 1, 0, (long) i2);
        }

        /* renamed from: p */
        public static byte m89206p(int i, int i2) {
            return (byte) (i | (i2 << 2));
        }

        /* renamed from: q */
        public static int m89207q(int i, int i2) {
            return ((~i) + 1) & (i2 - 1);
        }

        /* renamed from: u */
        public static C19059b m89208u(int i, int i2) {
            return new C19059b(i, 2, 1, (long) i2);
        }

        /* renamed from: v */
        public static C19059b m89209v(int i, int i2) {
            return new C19059b(i, 2, 2, (long) i2);
        }

        /* renamed from: w */
        public static C19059b m89210w(int i, long j) {
            return new C19059b(i, 2, 3, j);
        }

        /* renamed from: x */
        public static C19059b m89211x(int i, int i2) {
            return new C19059b(i, 2, 0, (long) i2);
        }

        /* renamed from: h */
        public final int mo56188h(int i, int i2) {
            return m89199i(this.f48527a, this.f48528b, this.f48530d, i, i2);
        }

        /* renamed from: r */
        public final byte mo56189r() {
            return mo56190s(0);
        }

        /* renamed from: s */
        public final byte mo56190s(int i) {
            return m89206p(mo56191t(i), this.f48527a);
        }

        /* renamed from: t */
        public final int mo56191t(int i) {
            if (FlexBuffers.m88941j(this.f48527a)) {
                return Math.max(this.f48528b, i);
            }
            return this.f48528b;
        }

        public C19059b(int i, int i2, int i3, double d) {
            this.f48531e = i;
            this.f48527a = i2;
            this.f48528b = i3;
            this.f48529c = d;
            this.f48530d = Long.MIN_VALUE;
        }
    }

    public C19057j(ByteBuffer byteBuffer) {
        this(byteBuffer, 1);
    }
}

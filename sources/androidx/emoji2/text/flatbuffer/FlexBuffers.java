package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import kotlin.C11679z1;
import kotlinx.serialization.json.internal.C12361b;

public class FlexBuffers {

    /* renamed from: A */
    public static final int f48426A = 26;

    /* renamed from: B */
    public static final int f48427B = 36;

    /* renamed from: C */
    public static final C19067p f48428C = new C19045a(new byte[]{0}, 1);

    /* renamed from: D */
    public static final /* synthetic */ boolean f48429D = false;

    /* renamed from: a */
    public static final int f48430a = 0;

    /* renamed from: b */
    public static final int f48431b = 1;

    /* renamed from: c */
    public static final int f48432c = 2;

    /* renamed from: d */
    public static final int f48433d = 3;

    /* renamed from: e */
    public static final int f48434e = 4;

    /* renamed from: f */
    public static final int f48435f = 5;

    /* renamed from: g */
    public static final int f48436g = 6;

    /* renamed from: h */
    public static final int f48437h = 7;

    /* renamed from: i */
    public static final int f48438i = 8;

    /* renamed from: j */
    public static final int f48439j = 9;

    /* renamed from: k */
    public static final int f48440k = 10;

    /* renamed from: l */
    public static final int f48441l = 11;

    /* renamed from: m */
    public static final int f48442m = 12;

    /* renamed from: n */
    public static final int f48443n = 13;

    /* renamed from: o */
    public static final int f48444o = 14;

    /* renamed from: p */
    public static final int f48445p = 15;

    /* renamed from: q */
    public static final int f48446q = 16;

    /* renamed from: r */
    public static final int f48447r = 17;

    /* renamed from: s */
    public static final int f48448s = 18;

    /* renamed from: t */
    public static final int f48449t = 19;

    /* renamed from: u */
    public static final int f48450u = 20;

    /* renamed from: v */
    public static final int f48451v = 21;

    /* renamed from: w */
    public static final int f48452w = 22;

    /* renamed from: x */
    public static final int f48453x = 23;

    /* renamed from: y */
    public static final int f48454y = 24;

    /* renamed from: z */
    public static final int f48455z = 25;

    public static class FlexBufferException extends RuntimeException {
        public FlexBufferException(String str) {
            super(str);
        }
    }

    /* renamed from: androidx.emoji2.text.flatbuffer.FlexBuffers$a */
    public static class C19034a extends C19040g {

        /* renamed from: e */
        public static final C19034a f48456e = new C19034a(FlexBuffers.f48428C, 1, 1);

        /* renamed from: f */
        public static final /* synthetic */ boolean f48457f = false;

        public C19034a(C19067p pVar, int i, int i2) {
            super(pVar, i, i2);
        }

        /* renamed from: d */
        public static C19034a m88950d() {
            return f48456e;
        }

        /* renamed from: a */
        public StringBuilder mo56000a(StringBuilder sb) {
            sb.append('\"');
            sb.append(this.f48461a.mo56058f(this.f48462b, mo56001b()));
            sb.append('\"');
            return sb;
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ int mo56001b() {
            return super.mo56001b();
        }

        /* renamed from: c */
        public ByteBuffer mo56002c() {
            ByteBuffer wrap = ByteBuffer.wrap(this.f48461a.mo56057e());
            wrap.position(this.f48462b);
            wrap.limit(this.f48462b + mo56001b());
            return wrap.asReadOnlyBuffer().slice();
        }

        /* renamed from: e */
        public byte mo56003e(int i) {
            return this.f48461a.get(this.f48462b + i);
        }

        /* renamed from: f */
        public byte[] mo56004f() {
            int b = mo56001b();
            byte[] bArr = new byte[b];
            for (int i = 0; i < b; i++) {
                bArr[i] = this.f48461a.get(this.f48462b + i);
            }
            return bArr;
        }

        public String toString() {
            return this.f48461a.mo56058f(this.f48462b, mo56001b());
        }
    }

    /* renamed from: androidx.emoji2.text.flatbuffer.FlexBuffers$b */
    public static class C19035b extends C19038e {

        /* renamed from: d */
        public static final C19035b f48458d = new C19035b(FlexBuffers.f48428C, 0, 0);

        public C19035b(C19067p pVar, int i, int i2) {
            super(pVar, i, i2);
        }

        /* renamed from: d */
        public static C19035b m88957d() {
            return f48458d;
        }

        /* renamed from: a */
        public StringBuilder mo56000a(StringBuilder sb) {
            sb.append(toString());
            return sb;
        }

        /* renamed from: c */
        public int mo56006c(byte[] bArr) {
            byte b;
            byte b2;
            int i = this.f48462b;
            int i2 = 0;
            do {
                b = this.f48461a.get(i);
                b2 = bArr[i2];
                if (b == 0) {
                    return b - b2;
                }
                i++;
                i2++;
                if (i2 == bArr.length) {
                    return b - b2;
                }
            } while (b == b2);
            return b - b2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C19035b)) {
                return false;
            }
            C19035b bVar = (C19035b) obj;
            if (bVar.f48462b == this.f48462b && bVar.f48463c == this.f48463c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f48462b ^ this.f48463c;
        }

        public String toString() {
            int i = this.f48462b;
            while (this.f48461a.get(i) != 0) {
                i++;
            }
            int i2 = this.f48462b;
            return this.f48461a.mo56058f(i2, i - i2);
        }
    }

    /* renamed from: androidx.emoji2.text.flatbuffer.FlexBuffers$c */
    public static class C19036c {

        /* renamed from: a */
        public final C19041h f48459a;

        public C19036c(C19041h hVar) {
            this.f48459a = hVar;
        }

        /* renamed from: a */
        public C19035b mo56009a(int i) {
            if (i >= mo56010b()) {
                return C19035b.f48458d;
            }
            C19041h hVar = this.f48459a;
            C19041h hVar2 = this.f48459a;
            C19067p pVar = hVar2.f48461a;
            return new C19035b(pVar, FlexBuffers.m88940i(pVar, hVar.f48462b + (i * hVar.f48463c), hVar2.f48463c), 1);
        }

        /* renamed from: b */
        public int mo56010b() {
            return this.f48459a.mo56001b();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(C12361b.f30260k);
            for (int i = 0; i < this.f48459a.mo56001b(); i++) {
                this.f48459a.mo56043d(i).mo56042z(sb);
                if (i != this.f48459a.mo56001b() - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: androidx.emoji2.text.flatbuffer.FlexBuffers$d */
    public static class C19037d extends C19043j {

        /* renamed from: f */
        public static final C19037d f48460f = new C19037d(FlexBuffers.f48428C, 1, 1);

        public C19037d(C19067p pVar, int i, int i2) {
            super(pVar, i, i2);
        }

        /* renamed from: g */
        public static C19037d m88962g() {
            return f48460f;
        }

        /* renamed from: a */
        public StringBuilder mo56000a(StringBuilder sb) {
            sb.append("{ ");
            C19036c j = mo56015j();
            int b = mo56001b();
            C19043j k = mo56016k();
            for (int i = 0; i < b; i++) {
                sb.append('\"');
                sb.append(j.mo56009a(i).toString());
                sb.append("\" : ");
                sb.append(k.mo56043d(i).toString());
                if (i != b - 1) {
                    sb.append(", ");
                }
            }
            sb.append(" }");
            return sb;
        }

        /* renamed from: f */
        public final int mo56012f(C19036c cVar, byte[] bArr) {
            int b = cVar.mo56010b() - 1;
            int i = 0;
            while (i <= b) {
                int i2 = (i + b) >>> 1;
                int c = cVar.mo56009a(i2).mo56006c(bArr);
                if (c < 0) {
                    i = i2 + 1;
                } else if (c <= 0) {
                    return i2;
                } else {
                    b = i2 - 1;
                }
            }
            return -(i + 1);
        }

        /* renamed from: h */
        public C19039f mo56013h(String str) {
            return mo56014i(str.getBytes(StandardCharsets.UTF_8));
        }

        /* renamed from: i */
        public C19039f mo56014i(byte[] bArr) {
            C19036c j = mo56015j();
            int b = j.mo56010b();
            int f = mo56012f(j, bArr);
            if (f < 0 || f >= b) {
                return C19039f.f48464f;
            }
            return mo56043d(f);
        }

        /* renamed from: j */
        public C19036c mo56015j() {
            int i = this.f48462b - (this.f48463c * 3);
            C19067p pVar = this.f48461a;
            int c = FlexBuffers.m88940i(pVar, i, this.f48463c);
            C19067p pVar2 = this.f48461a;
            int i2 = this.f48463c;
            return new C19036c(new C19041h(pVar, c, FlexBuffers.m88945n(pVar2, i + i2, i2), 4));
        }

        /* renamed from: k */
        public C19043j mo56016k() {
            return new C19043j(this.f48461a, this.f48462b, this.f48463c);
        }
    }

    /* renamed from: androidx.emoji2.text.flatbuffer.FlexBuffers$e */
    public static abstract class C19038e {

        /* renamed from: a */
        public C19067p f48461a;

        /* renamed from: b */
        public int f48462b;

        /* renamed from: c */
        public int f48463c;

        public C19038e(C19067p pVar, int i, int i2) {
            this.f48461a = pVar;
            this.f48462b = i;
            this.f48463c = i2;
        }

        /* renamed from: a */
        public abstract StringBuilder mo56000a(StringBuilder sb);

        public String toString() {
            return mo56000a(new StringBuilder(128)).toString();
        }
    }

    /* renamed from: androidx.emoji2.text.flatbuffer.FlexBuffers$f */
    public static class C19039f {

        /* renamed from: f */
        public static final C19039f f48464f = new C19039f(FlexBuffers.f48428C, 0, 1, 0);

        /* renamed from: a */
        public C19067p f48465a;

        /* renamed from: b */
        public int f48466b;

        /* renamed from: c */
        public int f48467c;

        /* renamed from: d */
        public int f48468d;

        /* renamed from: e */
        public int f48469e;

        public C19039f(C19067p pVar, int i, int i2, int i3) {
            this(pVar, i, i2, 1 << (i3 & 3), i3 >> 2);
        }

        /* renamed from: b */
        public C19034a mo56017b() {
            if (!mo56028m() && !mo56038v()) {
                return C19034a.m88950d();
            }
            C19067p pVar = this.f48465a;
            return new C19034a(pVar, FlexBuffers.m88940i(pVar, this.f48466b, this.f48467c), this.f48468d);
        }

        /* renamed from: c */
        public boolean mo56018c() {
            if (mo56029n()) {
                if (this.f48465a.get(this.f48466b) != 0) {
                    return true;
                }
                return false;
            } else if (mo56025j() != 0) {
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: d */
        public double mo56019d() {
            int i = this.f48469e;
            if (i == 3) {
                return FlexBuffers.m88944m(this.f48465a, this.f48466b, this.f48467c);
            }
            if (i == 1) {
                return (double) FlexBuffers.m88945n(this.f48465a, this.f48466b, this.f48467c);
            }
            if (i != 2) {
                if (i == 5) {
                    return Double.parseDouble(mo56024i());
                }
                if (i == 6) {
                    C19067p pVar = this.f48465a;
                    return (double) FlexBuffers.m88945n(pVar, FlexBuffers.m88940i(pVar, this.f48466b, this.f48467c), this.f48468d);
                } else if (i == 7) {
                    C19067p pVar2 = this.f48465a;
                    return (double) FlexBuffers.m88947p(pVar2, FlexBuffers.m88940i(pVar2, this.f48466b, this.f48467c), this.f48468d);
                } else if (i == 8) {
                    C19067p pVar3 = this.f48465a;
                    return FlexBuffers.m88944m(pVar3, FlexBuffers.m88940i(pVar3, this.f48466b, this.f48467c), this.f48468d);
                } else if (i == 10) {
                    return (double) mo56026k().mo56001b();
                } else {
                    if (i != 26) {
                        return 0.0d;
                    }
                }
            }
            return (double) FlexBuffers.m88947p(this.f48465a, this.f48466b, this.f48467c);
        }

        /* renamed from: e */
        public int mo56020e() {
            int i = this.f48469e;
            if (i == 1) {
                return FlexBuffers.m88945n(this.f48465a, this.f48466b, this.f48467c);
            }
            if (i == 2) {
                return (int) FlexBuffers.m88947p(this.f48465a, this.f48466b, this.f48467c);
            }
            if (i == 3) {
                return (int) FlexBuffers.m88944m(this.f48465a, this.f48466b, this.f48467c);
            }
            if (i == 5) {
                return Integer.parseInt(mo56024i());
            }
            if (i == 6) {
                C19067p pVar = this.f48465a;
                return FlexBuffers.m88945n(pVar, FlexBuffers.m88940i(pVar, this.f48466b, this.f48467c), this.f48468d);
            } else if (i == 7) {
                C19067p pVar2 = this.f48465a;
                return (int) FlexBuffers.m88947p(pVar2, FlexBuffers.m88940i(pVar2, this.f48466b, this.f48467c), this.f48467c);
            } else if (i == 8) {
                C19067p pVar3 = this.f48465a;
                return (int) FlexBuffers.m88944m(pVar3, FlexBuffers.m88940i(pVar3, this.f48466b, this.f48467c), this.f48468d);
            } else if (i == 10) {
                return mo56026k().mo56001b();
            } else {
                if (i != 26) {
                    return 0;
                }
                return FlexBuffers.m88945n(this.f48465a, this.f48466b, this.f48467c);
            }
        }

        /* renamed from: f */
        public C19035b mo56021f() {
            if (!mo56033r()) {
                return C19035b.m88957d();
            }
            C19067p pVar = this.f48465a;
            return new C19035b(pVar, FlexBuffers.m88940i(pVar, this.f48466b, this.f48467c), this.f48468d);
        }

        /* renamed from: g */
        public long mo56022g() {
            int i = this.f48469e;
            if (i == 1) {
                return FlexBuffers.m88946o(this.f48465a, this.f48466b, this.f48467c);
            }
            if (i == 2) {
                return FlexBuffers.m88947p(this.f48465a, this.f48466b, this.f48467c);
            }
            if (i == 3) {
                return (long) FlexBuffers.m88944m(this.f48465a, this.f48466b, this.f48467c);
            }
            if (i == 5) {
                try {
                    return Long.parseLong(mo56024i());
                } catch (NumberFormatException unused) {
                    return 0;
                }
            } else if (i == 6) {
                C19067p pVar = this.f48465a;
                return FlexBuffers.m88946o(pVar, FlexBuffers.m88940i(pVar, this.f48466b, this.f48467c), this.f48468d);
            } else if (i == 7) {
                C19067p pVar2 = this.f48465a;
                return FlexBuffers.m88947p(pVar2, FlexBuffers.m88940i(pVar2, this.f48466b, this.f48467c), this.f48467c);
            } else if (i == 8) {
                C19067p pVar3 = this.f48465a;
                return (long) FlexBuffers.m88944m(pVar3, FlexBuffers.m88940i(pVar3, this.f48466b, this.f48467c), this.f48468d);
            } else if (i == 10) {
                return (long) mo56026k().mo56001b();
            } else {
                if (i != 26) {
                    return 0;
                }
                return (long) FlexBuffers.m88945n(this.f48465a, this.f48466b, this.f48467c);
            }
        }

        /* renamed from: h */
        public C19037d mo56023h() {
            if (!mo56034s()) {
                return C19037d.m88962g();
            }
            C19067p pVar = this.f48465a;
            return new C19037d(pVar, FlexBuffers.m88940i(pVar, this.f48466b, this.f48467c), this.f48468d);
        }

        /* renamed from: i */
        public String mo56024i() {
            if (mo56038v()) {
                int c = FlexBuffers.m88940i(this.f48465a, this.f48466b, this.f48467c);
                C19067p pVar = this.f48465a;
                int i = this.f48468d;
                return this.f48465a.mo56058f(c, (int) FlexBuffers.m88947p(pVar, c - i, i));
            } else if (!mo56033r()) {
                return "";
            } else {
                int c2 = FlexBuffers.m88940i(this.f48465a, this.f48466b, this.f48468d);
                int i2 = c2;
                while (this.f48465a.get(i2) != 0) {
                    i2++;
                }
                return this.f48465a.mo56058f(c2, i2 - c2);
            }
        }

        /* renamed from: j */
        public long mo56025j() {
            int i = this.f48469e;
            if (i == 2) {
                return FlexBuffers.m88947p(this.f48465a, this.f48466b, this.f48467c);
            }
            if (i == 1) {
                return FlexBuffers.m88946o(this.f48465a, this.f48466b, this.f48467c);
            }
            if (i == 3) {
                return (long) FlexBuffers.m88944m(this.f48465a, this.f48466b, this.f48467c);
            }
            if (i == 10) {
                return (long) mo56026k().mo56001b();
            }
            if (i == 26) {
                return (long) FlexBuffers.m88945n(this.f48465a, this.f48466b, this.f48467c);
            }
            if (i == 5) {
                return Long.parseLong(mo56024i());
            }
            if (i == 6) {
                C19067p pVar = this.f48465a;
                return FlexBuffers.m88946o(pVar, FlexBuffers.m88940i(pVar, this.f48466b, this.f48467c), this.f48468d);
            } else if (i == 7) {
                C19067p pVar2 = this.f48465a;
                return FlexBuffers.m88947p(pVar2, FlexBuffers.m88940i(pVar2, this.f48466b, this.f48467c), this.f48468d);
            } else if (i != 8) {
                return 0;
            } else {
                C19067p pVar3 = this.f48465a;
                return (long) FlexBuffers.m88944m(pVar3, FlexBuffers.m88940i(pVar3, this.f48466b, this.f48467c), this.f48467c);
            }
        }

        /* renamed from: k */
        public C19043j mo56026k() {
            if (mo56041y()) {
                C19067p pVar = this.f48465a;
                return new C19043j(pVar, FlexBuffers.m88940i(pVar, this.f48466b, this.f48467c), this.f48468d);
            }
            int i = this.f48469e;
            if (i == 15) {
                C19067p pVar2 = this.f48465a;
                return new C19041h(pVar2, FlexBuffers.m88940i(pVar2, this.f48466b, this.f48467c), this.f48468d, 4);
            } else if (!FlexBuffers.m88942k(i)) {
                return C19043j.m89004c();
            } else {
                C19067p pVar3 = this.f48465a;
                return new C19041h(pVar3, FlexBuffers.m88940i(pVar3, this.f48466b, this.f48467c), this.f48468d, FlexBuffers.m88949r(this.f48469e));
            }
        }

        /* renamed from: l */
        public int mo56027l() {
            return this.f48469e;
        }

        /* renamed from: m */
        public boolean mo56028m() {
            return this.f48469e == 25;
        }

        /* renamed from: n */
        public boolean mo56029n() {
            return this.f48469e == 26;
        }

        /* renamed from: o */
        public boolean mo56030o() {
            int i = this.f48469e;
            return i == 3 || i == 8;
        }

        /* renamed from: p */
        public boolean mo56031p() {
            int i = this.f48469e;
            return i == 1 || i == 6;
        }

        /* renamed from: q */
        public boolean mo56032q() {
            return mo56031p() || mo56040x();
        }

        /* renamed from: r */
        public boolean mo56033r() {
            return this.f48469e == 4;
        }

        /* renamed from: s */
        public boolean mo56034s() {
            return this.f48469e == 9;
        }

        /* renamed from: t */
        public boolean mo56035t() {
            return this.f48469e == 0;
        }

        public String toString() {
            return mo56042z(new StringBuilder(128)).toString();
        }

        /* renamed from: u */
        public boolean mo56037u() {
            return mo56032q() || mo56030o();
        }

        /* renamed from: v */
        public boolean mo56038v() {
            return this.f48469e == 5;
        }

        /* renamed from: w */
        public boolean mo56039w() {
            return FlexBuffers.m88942k(this.f48469e);
        }

        /* renamed from: x */
        public boolean mo56040x() {
            int i = this.f48469e;
            return i == 2 || i == 7;
        }

        /* renamed from: y */
        public boolean mo56041y() {
            int i = this.f48469e;
            return i == 10 || i == 9;
        }

        /* renamed from: z */
        public StringBuilder mo56042z(StringBuilder sb) {
            int i = this.f48469e;
            if (i != 36) {
                switch (i) {
                    case 0:
                        sb.append("null");
                        return sb;
                    case 1:
                    case 6:
                        sb.append(mo56022g());
                        return sb;
                    case 2:
                    case 7:
                        sb.append(mo56025j());
                        return sb;
                    case 3:
                    case 8:
                        sb.append(mo56019d());
                        return sb;
                    case 4:
                        C19035b f = mo56021f();
                        sb.append('\"');
                        StringBuilder a = f.mo56000a(sb);
                        a.append('\"');
                        return a;
                    case 5:
                        sb.append('\"');
                        sb.append(mo56024i());
                        sb.append('\"');
                        return sb;
                    case 9:
                        return mo56023h().mo56000a(sb);
                    case 10:
                        return mo56026k().mo56000a(sb);
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                        throw new FlexBufferException("not_implemented:" + this.f48469e);
                    case 25:
                        return mo56017b().mo56000a(sb);
                    case 26:
                        sb.append(mo56018c());
                        return sb;
                    default:
                        return sb;
                }
            }
            sb.append(mo56026k());
            return sb;
        }

        public C19039f(C19067p pVar, int i, int i2, int i3, int i4) {
            this.f48465a = pVar;
            this.f48466b = i;
            this.f48467c = i2;
            this.f48468d = i3;
            this.f48469e = i4;
        }
    }

    /* renamed from: androidx.emoji2.text.flatbuffer.FlexBuffers$g */
    public static abstract class C19040g extends C19038e {

        /* renamed from: d */
        public final int f48470d;

        public C19040g(C19067p pVar, int i, int i2) {
            super(pVar, i, i2);
            this.f48470d = FlexBuffers.m88945n(this.f48461a, i - i2, i2);
        }

        /* renamed from: b */
        public int mo56001b() {
            return this.f48470d;
        }
    }

    /* renamed from: androidx.emoji2.text.flatbuffer.FlexBuffers$h */
    public static class C19041h extends C19043j {

        /* renamed from: g */
        public static final C19041h f48471g = new C19041h(FlexBuffers.f48428C, 1, 1, 1);

        /* renamed from: f */
        public final int f48472f;

        public C19041h(C19067p pVar, int i, int i2, int i3) {
            super(pVar, i, i2);
            this.f48472f = i3;
        }

        /* renamed from: f */
        public static C19041h m88997f() {
            return f48471g;
        }

        /* renamed from: d */
        public C19039f mo56043d(int i) {
            if (i >= mo56001b()) {
                return C19039f.f48464f;
            }
            return new C19039f(this.f48461a, this.f48462b + (i * this.f48463c), this.f48463c, 1, this.f48472f);
        }

        /* renamed from: g */
        public int mo56044g() {
            return this.f48472f;
        }

        /* renamed from: h */
        public boolean mo56045h() {
            return this == f48471g;
        }
    }

    /* renamed from: androidx.emoji2.text.flatbuffer.FlexBuffers$i */
    public static class C19042i {
        /* renamed from: a */
        public static int m89001a(byte b) {
            return b & 255;
        }

        /* renamed from: b */
        public static long m89002b(int i) {
            return ((long) i) & 4294967295L;
        }

        /* renamed from: c */
        public static int m89003c(short s) {
            return s & C11679z1.f28988d;
        }
    }

    /* renamed from: androidx.emoji2.text.flatbuffer.FlexBuffers$j */
    public static class C19043j extends C19040g {

        /* renamed from: e */
        public static final C19043j f48473e = new C19043j(FlexBuffers.f48428C, 1, 1);

        public C19043j(C19067p pVar, int i, int i2) {
            super(pVar, i, i2);
        }

        /* renamed from: c */
        public static C19043j m89004c() {
            return f48473e;
        }

        /* renamed from: a */
        public StringBuilder mo56000a(StringBuilder sb) {
            sb.append("[ ");
            int b = mo56001b();
            for (int i = 0; i < b; i++) {
                mo56043d(i).mo56042z(sb);
                if (i != b - 1) {
                    sb.append(", ");
                }
            }
            sb.append(" ]");
            return sb;
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ int mo56001b() {
            return super.mo56001b();
        }

        /* renamed from: d */
        public C19039f mo56043d(int i) {
            long b = (long) mo56001b();
            long j = (long) i;
            if (j >= b) {
                return C19039f.f48464f;
            }
            int a = C19042i.m89001a(this.f48461a.get((int) (((long) this.f48462b) + (b * ((long) this.f48463c)) + j)));
            return new C19039f(this.f48461a, this.f48462b + (i * this.f48463c), this.f48463c, a);
        }

        /* renamed from: e */
        public boolean mo56046e() {
            return this == f48473e;
        }

        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }
    }

    /* renamed from: g */
    public static C19039f m88938g(C19067p pVar) {
        int limit = pVar.limit() - 1;
        byte b = pVar.get(limit);
        int i = limit - 1;
        return new C19039f(pVar, i - b, b, C19042i.m89001a(pVar.get(i)));
    }

    @Deprecated
    /* renamed from: h */
    public static C19039f m88939h(ByteBuffer byteBuffer) {
        return m88938g(byteBuffer.hasArray() ? new C19045a(byteBuffer.array(), byteBuffer.limit()) : new C19048d(byteBuffer));
    }

    /* renamed from: i */
    public static int m88940i(C19067p pVar, int i, int i2) {
        return (int) (((long) i) - m88947p(pVar, i, i2));
    }

    /* renamed from: j */
    public static boolean m88941j(int i) {
        return i <= 3 || i == 26;
    }

    /* renamed from: k */
    public static boolean m88942k(int i) {
        return (i >= 11 && i <= 15) || i == 36;
    }

    /* renamed from: l */
    public static boolean m88943l(int i) {
        return (i >= 1 && i <= 4) || i == 26;
    }

    /* renamed from: m */
    public static double m88944m(C19067p pVar, int i, int i2) {
        if (i2 == 4) {
            return (double) pVar.getFloat(i);
        }
        if (i2 != 8) {
            return -1.0d;
        }
        return pVar.getDouble(i);
    }

    /* renamed from: n */
    public static int m88945n(C19067p pVar, int i, int i2) {
        return (int) m88946o(pVar, i, i2);
    }

    /* renamed from: o */
    public static long m88946o(C19067p pVar, int i, int i2) {
        int i3;
        if (i2 == 1) {
            i3 = pVar.get(i);
        } else if (i2 == 2) {
            i3 = pVar.getShort(i);
        } else if (i2 == 4) {
            i3 = pVar.getInt(i);
        } else if (i2 != 8) {
            return -1;
        } else {
            return pVar.getLong(i);
        }
        return (long) i3;
    }

    /* renamed from: p */
    public static long m88947p(C19067p pVar, int i, int i2) {
        if (i2 == 1) {
            return (long) C19042i.m89001a(pVar.get(i));
        }
        if (i2 == 2) {
            return (long) C19042i.m89003c(pVar.getShort(i));
        }
        if (i2 == 4) {
            return C19042i.m89002b(pVar.getInt(i));
        }
        if (i2 != 8) {
            return -1;
        }
        return pVar.getLong(i);
    }

    /* renamed from: q */
    public static int m88948q(int i, int i2) {
        if (i2 == 0) {
            return (i - 1) + 11;
        }
        if (i2 == 2) {
            return (i - 1) + 16;
        }
        if (i2 == 3) {
            return (i - 1) + 19;
        }
        if (i2 != 4) {
            return 0;
        }
        return (i - 1) + 22;
    }

    /* renamed from: r */
    public static int m88949r(int i) {
        return (i - 11) + 1;
    }
}

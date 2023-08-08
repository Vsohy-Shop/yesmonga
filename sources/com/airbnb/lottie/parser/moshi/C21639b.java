package com.airbnb.lottie.parser.moshi;

import androidx.annotation.C0363p0;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.carrefour.fid.android.airship.util.C13758b;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import java.io.EOFException;
import java.io.IOException;
import okio.ByteString;
import okio.C12500m;
import okio.C12507o;

/* renamed from: com.airbnb.lottie.parser.moshi.b */
public final class C21639b extends JsonReader {

    /* renamed from: E0 */
    public static final ByteString f55989E0 = ByteString.m50362X("\"\\");

    /* renamed from: F0 */
    public static final ByteString f55990F0 = ByteString.m50362X("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: G0 */
    public static final ByteString f55991G0 = ByteString.m50362X("\n\r");

    /* renamed from: H0 */
    public static final ByteString f55992H0 = ByteString.m50362X("*/");

    /* renamed from: I0 */
    public static final int f55993I0 = 0;

    /* renamed from: J0 */
    public static final int f55994J0 = 1;

    /* renamed from: K0 */
    public static final int f55995K0 = 2;

    /* renamed from: L0 */
    public static final int f55996L0 = 3;

    /* renamed from: M0 */
    public static final int f55997M0 = 4;

    /* renamed from: N0 */
    public static final int f55998N0 = 5;

    /* renamed from: O0 */
    public static final int f55999O0 = 6;

    /* renamed from: P0 */
    public static final int f56000P0 = 7;

    /* renamed from: Q0 */
    public static final int f56001Q0 = 8;

    /* renamed from: R0 */
    public static final int f56002R0 = 9;

    /* renamed from: S0 */
    public static final int f56003S0 = 10;

    /* renamed from: T0 */
    public static final int f56004T0 = 11;

    /* renamed from: U0 */
    public static final int f56005U0 = 12;

    /* renamed from: V0 */
    public static final int f56006V0 = 13;

    /* renamed from: W0 */
    public static final int f56007W0 = 14;

    /* renamed from: X0 */
    public static final int f56008X0 = 15;

    /* renamed from: Y */
    public static final long f56009Y = -922337203685477580L;

    /* renamed from: Y0 */
    public static final int f56010Y0 = 16;

    /* renamed from: Z */
    public static final ByteString f56011Z = ByteString.m50362X("'\\");

    /* renamed from: Z0 */
    public static final int f56012Z0 = 17;

    /* renamed from: a1 */
    public static final int f56013a1 = 18;

    /* renamed from: b1 */
    public static final int f56014b1 = 0;

    /* renamed from: c1 */
    public static final int f56015c1 = 1;

    /* renamed from: d1 */
    public static final int f56016d1 = 2;

    /* renamed from: e1 */
    public static final int f56017e1 = 3;

    /* renamed from: f1 */
    public static final int f56018f1 = 4;

    /* renamed from: g1 */
    public static final int f56019g1 = 5;

    /* renamed from: h1 */
    public static final int f56020h1 = 6;

    /* renamed from: i1 */
    public static final int f56021i1 = 7;
    @C0363p0

    /* renamed from: X */
    public String f56022X;

    /* renamed from: v */
    public final C12507o f56023v;

    /* renamed from: w */
    public final C12500m f56024w;

    /* renamed from: x */
    public int f56025x = 0;

    /* renamed from: y */
    public long f56026y;

    /* renamed from: z */
    public int f56027z;

    public C21639b(C12507o oVar) {
        if (oVar != null) {
            this.f56023v = oVar;
            this.f56024w = oVar.mo27272H();
            mo64563p(6);
            return;
        }
        throw new NullPointerException("source == null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        r6.f56024w.skip((long) (r3 - 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        if (r1 != 47) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r6.f56023v.mo27269E1(2) != false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        mo64630v();
        r3 = r6.f56024w.mo27330D(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        if (r3 == 42) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        if (r3 == 47) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004e, code lost:
        r6.f56024w.readByte();
        r6.f56024w.readByte();
        mo64626K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
        r6.f56024w.readByte();
        r6.f56024w.readByte();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006a, code lost:
        if (mo64625J() == false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0073, code lost:
        throw mo64567u("Unterminated comment");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0076, code lost:
        if (r1 != 35) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0078, code lost:
        mo64630v();
        mo64626K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007f, code lost:
        return r1;
     */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo64618B(boolean r7) throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
        L_0x0001:
            r1 = r0
        L_0x0002:
            okio.o r2 = r6.f56023v
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.mo27269E1(r4)
            if (r2 == 0) goto L_0x0082
            okio.m r2 = r6.f56024w
            long r4 = (long) r1
            byte r1 = r2.mo27330D(r4)
            r2 = 10
            if (r1 == r2) goto L_0x0080
            r2 = 32
            if (r1 == r2) goto L_0x0080
            r2 = 13
            if (r1 == r2) goto L_0x0080
            r2 = 9
            if (r1 != r2) goto L_0x0025
            goto L_0x0080
        L_0x0025:
            okio.m r2 = r6.f56024w
            int r3 = r3 + -1
            long r3 = (long) r3
            r2.skip(r3)
            r2 = 47
            if (r1 != r2) goto L_0x0074
            okio.o r3 = r6.f56023v
            r4 = 2
            boolean r3 = r3.mo27269E1(r4)
            if (r3 != 0) goto L_0x003c
            return r1
        L_0x003c:
            r6.mo64630v()
            okio.m r3 = r6.f56024w
            r4 = 1
            byte r3 = r3.mo27330D(r4)
            r4 = 42
            if (r3 == r4) goto L_0x005c
            if (r3 == r2) goto L_0x004e
            return r1
        L_0x004e:
            okio.m r1 = r6.f56024w
            r1.readByte()
            okio.m r1 = r6.f56024w
            r1.readByte()
            r6.mo64626K()
            goto L_0x0001
        L_0x005c:
            okio.m r1 = r6.f56024w
            r1.readByte()
            okio.m r1 = r6.f56024w
            r1.readByte()
            boolean r1 = r6.mo64625J()
            if (r1 == 0) goto L_0x006d
            goto L_0x0001
        L_0x006d:
            java.lang.String r7 = "Unterminated comment"
            com.airbnb.lottie.parser.moshi.JsonEncodingException r7 = r6.mo64567u(r7)
            throw r7
        L_0x0074:
            r2 = 35
            if (r1 != r2) goto L_0x007f
            r6.mo64630v()
            r6.mo64626K()
            goto L_0x0001
        L_0x007f:
            return r1
        L_0x0080:
            r1 = r3
            goto L_0x0002
        L_0x0082:
            if (r7 != 0) goto L_0x0086
            r7 = -1
            return r7
        L_0x0086:
            java.io.EOFException r7 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.C21639b.mo64618B(boolean):int");
    }

    /* renamed from: C */
    public final String mo64619C(ByteString byteString) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long W0 = this.f56023v.mo27286W0(byteString);
            if (W0 == -1) {
                throw mo64567u("Unterminated string");
            } else if (this.f56024w.mo27330D(W0) == 92) {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(this.f56024w.mo27300n2(W0));
                this.f56024w.readByte();
                sb.append(mo64623G());
            } else if (sb == null) {
                String n2 = this.f56024w.mo27300n2(W0);
                this.f56024w.readByte();
                return n2;
            } else {
                sb.append(this.f56024w.mo27300n2(W0));
                this.f56024w.readByte();
                return sb.toString();
            }
        }
    }

    /* renamed from: D */
    public final String mo64620D() throws IOException {
        long W0 = this.f56023v.mo27286W0(f55990F0);
        if (W0 != -1) {
            return this.f56024w.mo27300n2(W0);
        }
        return this.f56024w.mo27268B3();
    }

    /* renamed from: E */
    public final int mo64621E() throws IOException {
        int i;
        String str;
        String str2;
        byte D = this.f56024w.mo27330D(0);
        if (D == 116 || D == 84) {
            str2 = C13758b.f33436b;
            str = "TRUE";
            i = 5;
        } else if (D == 102 || D == 70) {
            str2 = C13758b.f33438c;
            str = "FALSE";
            i = 6;
        } else if (D != 110 && D != 78) {
            return 0;
        } else {
            str2 = "null";
            str = "NULL";
            i = 7;
        }
        int length = str2.length();
        int i2 = 1;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (!this.f56023v.mo27269E1((long) i3)) {
                return 0;
            }
            byte D2 = this.f56024w.mo27330D((long) i2);
            if (D2 != str2.charAt(i2) && D2 != str.charAt(i2)) {
                return 0;
            }
            i2 = i3;
        }
        if (this.f56023v.mo27269E1((long) (length + 1)) && mo64634z(this.f56024w.mo27330D((long) length))) {
            return 0;
        }
        this.f56024w.skip((long) length);
        this.f56025x = i;
        return i;
    }

    /* renamed from: F */
    public final int mo64622F() throws IOException {
        byte D;
        char c;
        boolean z;
        boolean z2 = true;
        long j = 0;
        int i = 0;
        char c2 = 0;
        boolean z3 = false;
        boolean z4 = true;
        while (true) {
            int i2 = i + 1;
            if (!this.f56023v.mo27269E1((long) i2)) {
                break;
            }
            D = this.f56024w.mo27330D((long) i);
            if (D == 43) {
                c = 6;
                if (c2 != 5) {
                    return 0;
                }
            } else if (D != 69 && D != 101) {
                if (D == 45) {
                    c = 6;
                    if (c2 == 0) {
                        c2 = 1;
                        z3 = true;
                    } else if (c2 != 5) {
                        return 0;
                    }
                } else if (D != 46) {
                    if (D >= 48 && D <= 57) {
                        if (c2 == z2 || c2 == 0) {
                            j = (long) (-(D - 48));
                            c2 = 2;
                        } else if (c2 == 2) {
                            if (j == 0) {
                                return 0;
                            }
                            long j2 = (10 * j) - ((long) (D - 48));
                            int i3 = (j > -922337203685477580L ? 1 : (j == -922337203685477580L ? 0 : -1));
                            if (i3 > 0 || (i3 == 0 && j2 < j)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            z4 &= z;
                            j = j2;
                        } else if (c2 == 3) {
                            c2 = 4;
                        } else if (c2 == 5 || c2 == 6) {
                            c2 = 7;
                        }
                    }
                } else if (c2 != 2) {
                    return 0;
                } else {
                    c2 = 3;
                }
                i = i2;
                z2 = true;
            } else if (c2 != 2 && c2 != 4) {
                return 0;
            } else {
                c2 = 5;
                i = i2;
                z2 = true;
            }
            c2 = c;
            i = i2;
            z2 = true;
        }
        if (mo64634z(D)) {
            return 0;
        }
        if (c2 == 2 && z4 && ((j != Long.MIN_VALUE || z3) && (j != 0 || !z3))) {
            if (!z3) {
                j = -j;
            }
            this.f56026y = j;
            this.f56024w.skip((long) i);
            this.f56025x = 16;
            return 16;
        } else if (c2 != 2 && c2 != 4 && c2 != 7) {
            return 0;
        } else {
            this.f56027z = i;
            this.f56025x = 17;
            return 17;
        }
    }

    /* renamed from: G */
    public final char mo64623G() throws IOException {
        int i;
        int i2;
        if (this.f56023v.mo27269E1(1)) {
            byte readByte = this.f56024w.readByte();
            if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
                return (char) readByte;
            }
            if (readByte == 98) {
                return 8;
            }
            if (readByte == 102) {
                return 12;
            }
            if (readByte == 110) {
                return 10;
            }
            if (readByte == 114) {
                return 13;
            }
            if (readByte == 116) {
                return 9;
            }
            if (readByte != 117) {
                if (this.f55942e) {
                    return (char) readByte;
                }
                throw mo64567u("Invalid escape sequence: \\" + ((char) readByte));
            } else if (this.f56023v.mo27269E1(4)) {
                char c = 0;
                for (int i3 = 0; i3 < 4; i3++) {
                    byte D = this.f56024w.mo27330D((long) i3);
                    char c2 = (char) (c << 4);
                    if (D < 48 || D > 57) {
                        if (D >= 97 && D <= 102) {
                            i = D - 97;
                        } else if (D < 65 || D > 70) {
                            throw mo64567u("\\u" + this.f56024w.mo27300n2(4));
                        } else {
                            i = D + ByteSourceJsonBootstrapper.UTF8_BOM_3;
                        }
                        i2 = i + 10;
                    } else {
                        i2 = D - 48;
                    }
                    c = (char) (c2 + i2);
                }
                this.f56024w.skip(4);
                return c;
            } else {
                throw new EOFException("Unterminated escape sequence at path " + getPath());
            }
        } else {
            throw mo64567u("Unterminated escape sequence");
        }
    }

    /* renamed from: I */
    public final void mo64624I(ByteString byteString) throws IOException {
        while (true) {
            long W0 = this.f56023v.mo27286W0(byteString);
            if (W0 == -1) {
                throw mo64567u("Unterminated string");
            } else if (this.f56024w.mo27330D(W0) == 92) {
                this.f56024w.skip(W0 + 1);
                mo64623G();
            } else {
                this.f56024w.skip(W0 + 1);
                return;
            }
        }
    }

    /* renamed from: J */
    public final boolean mo64625J() throws IOException {
        boolean z;
        long j;
        C12507o oVar = this.f56023v;
        ByteString byteString = f55992H0;
        long J0 = oVar.mo27273J0(byteString);
        if (J0 != -1) {
            z = true;
        } else {
            z = false;
        }
        C12500m mVar = this.f56024w;
        if (z) {
            j = J0 + ((long) byteString.size());
        } else {
            j = mVar.mo27362c0();
        }
        mVar.skip(j);
        return z;
    }

    /* renamed from: K */
    public final void mo64626K() throws IOException {
        long j;
        long W0 = this.f56023v.mo27286W0(f55991G0);
        C12500m mVar = this.f56024w;
        if (W0 != -1) {
            j = W0 + 1;
        } else {
            j = mVar.mo27362c0();
        }
        mVar.skip(j);
    }

    /* renamed from: L */
    public final void mo64627L() throws IOException {
        long W0 = this.f56023v.mo27286W0(f55990F0);
        C12500m mVar = this.f56024w;
        if (W0 == -1) {
            W0 = mVar.mo27362c0();
        }
        mVar.skip(W0);
    }

    /* renamed from: b */
    public void mo64551b() throws IOException {
        int i = this.f56025x;
        if (i == 0) {
            i = mo64631w();
        }
        if (i == 3) {
            mo64563p(1);
            this.f55941d[this.f55938a - 1] = 0;
            this.f56025x = 0;
            return;
        }
        throw new JsonDataException("Expected BEGIN_ARRAY but was " + mo64562o() + " at path " + getPath());
    }

    /* renamed from: c */
    public void mo64552c() throws IOException {
        int i = this.f56025x;
        if (i == 0) {
            i = mo64631w();
        }
        if (i == 1) {
            mo64563p(3);
            this.f56025x = 0;
            return;
        }
        throw new JsonDataException("Expected BEGIN_OBJECT but was " + mo64562o() + " at path " + getPath());
    }

    public void close() throws IOException {
        this.f56025x = 0;
        this.f55939b[0] = 8;
        this.f55938a = 1;
        this.f56024w.mo27367f();
        this.f56023v.close();
    }

    /* renamed from: d */
    public void mo64553d() throws IOException {
        int i = this.f56025x;
        if (i == 0) {
            i = mo64631w();
        }
        if (i == 4) {
            int i2 = this.f55938a - 1;
            this.f55938a = i2;
            int[] iArr = this.f55941d;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f56025x = 0;
            return;
        }
        throw new JsonDataException("Expected END_ARRAY but was " + mo64562o() + " at path " + getPath());
    }

    /* renamed from: f */
    public void mo64554f() throws IOException {
        int i = this.f56025x;
        if (i == 0) {
            i = mo64631w();
        }
        if (i == 2) {
            int i2 = this.f55938a - 1;
            this.f55938a = i2;
            this.f55940c[i2] = null;
            int[] iArr = this.f55941d;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f56025x = 0;
            return;
        }
        throw new JsonDataException("Expected END_OBJECT but was " + mo64562o() + " at path " + getPath());
    }

    /* renamed from: g */
    public boolean mo64555g() throws IOException {
        int i = this.f56025x;
        if (i == 0) {
            i = mo64631w();
        }
        if (i == 2 || i == 4 || i == 18) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public boolean mo64557i() throws IOException {
        int i = this.f56025x;
        if (i == 0) {
            i = mo64631w();
        }
        if (i == 5) {
            this.f56025x = 0;
            int[] iArr = this.f55941d;
            int i2 = this.f55938a - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f56025x = 0;
            int[] iArr2 = this.f55941d;
            int i3 = this.f55938a - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new JsonDataException("Expected a boolean but was " + mo64562o() + " at path " + getPath());
        }
    }

    /* renamed from: j */
    public double mo64558j() throws IOException {
        int i = this.f56025x;
        if (i == 0) {
            i = mo64631w();
        }
        if (i == 16) {
            this.f56025x = 0;
            int[] iArr = this.f55941d;
            int i2 = this.f55938a - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.f56026y;
        }
        if (i == 17) {
            this.f56022X = this.f56024w.mo27300n2((long) this.f56027z);
        } else if (i == 9) {
            this.f56022X = mo64619C(f55989E0);
        } else if (i == 8) {
            this.f56022X = mo64619C(f56011Z);
        } else if (i == 10) {
            this.f56022X = mo64620D();
        } else if (i != 11) {
            throw new JsonDataException("Expected a double but was " + mo64562o() + " at path " + getPath());
        }
        this.f56025x = 11;
        try {
            double parseDouble = Double.parseDouble(this.f56022X);
            if (this.f55942e || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
                this.f56022X = null;
                this.f56025x = 0;
                int[] iArr2 = this.f55941d;
                int i3 = this.f55938a - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseDouble;
            }
            throw new JsonEncodingException("JSON forbids NaN and infinities: " + parseDouble + " at path " + getPath());
        } catch (NumberFormatException unused) {
            throw new JsonDataException("Expected a double but was " + this.f56022X + " at path " + getPath());
        }
    }

    /* renamed from: k */
    public int mo64559k() throws IOException {
        String str;
        int i = this.f56025x;
        if (i == 0) {
            i = mo64631w();
        }
        if (i == 16) {
            long j = this.f56026y;
            int i2 = (int) j;
            if (j == ((long) i2)) {
                this.f56025x = 0;
                int[] iArr = this.f55941d;
                int i3 = this.f55938a - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new JsonDataException("Expected an int but was " + this.f56026y + " at path " + getPath());
        }
        if (i == 17) {
            this.f56022X = this.f56024w.mo27300n2((long) this.f56027z);
        } else if (i == 9 || i == 8) {
            if (i == 9) {
                str = mo64619C(f55989E0);
            } else {
                str = mo64619C(f56011Z);
            }
            this.f56022X = str;
            try {
                int parseInt = Integer.parseInt(str);
                this.f56025x = 0;
                int[] iArr2 = this.f55941d;
                int i4 = this.f55938a - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            throw new JsonDataException("Expected an int but was " + mo64562o() + " at path " + getPath());
        }
        this.f56025x = 11;
        try {
            double parseDouble = Double.parseDouble(this.f56022X);
            int i5 = (int) parseDouble;
            if (((double) i5) == parseDouble) {
                this.f56022X = null;
                this.f56025x = 0;
                int[] iArr3 = this.f55941d;
                int i6 = this.f55938a - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            throw new JsonDataException("Expected an int but was " + this.f56022X + " at path " + getPath());
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected an int but was " + this.f56022X + " at path " + getPath());
        }
    }

    /* renamed from: l */
    public String mo64560l() throws IOException {
        String str;
        int i = this.f56025x;
        if (i == 0) {
            i = mo64631w();
        }
        if (i == 14) {
            str = mo64620D();
        } else if (i == 13) {
            str = mo64619C(f55989E0);
        } else if (i == 12) {
            str = mo64619C(f56011Z);
        } else if (i == 15) {
            str = this.f56022X;
        } else {
            throw new JsonDataException("Expected a name but was " + mo64562o() + " at path " + getPath());
        }
        this.f56025x = 0;
        this.f55940c[this.f55938a - 1] = str;
        return str;
    }

    /* renamed from: m */
    public String mo64561m() throws IOException {
        String str;
        int i = this.f56025x;
        if (i == 0) {
            i = mo64631w();
        }
        if (i == 10) {
            str = mo64620D();
        } else if (i == 9) {
            str = mo64619C(f55989E0);
        } else if (i == 8) {
            str = mo64619C(f56011Z);
        } else if (i == 11) {
            str = this.f56022X;
            this.f56022X = null;
        } else if (i == 16) {
            str = Long.toString(this.f56026y);
        } else if (i == 17) {
            str = this.f56024w.mo27300n2((long) this.f56027z);
        } else {
            throw new JsonDataException("Expected a string but was " + mo64562o() + " at path " + getPath());
        }
        this.f56025x = 0;
        int[] iArr = this.f55941d;
        int i2 = this.f55938a - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* renamed from: o */
    public JsonReader.Token mo64562o() throws IOException {
        int i = this.f56025x;
        if (i == 0) {
            i = mo64631w();
        }
        switch (i) {
            case 1:
                return JsonReader.Token.BEGIN_OBJECT;
            case 2:
                return JsonReader.Token.END_OBJECT;
            case 3:
                return JsonReader.Token.BEGIN_ARRAY;
            case 4:
                return JsonReader.Token.END_ARRAY;
            case 5:
            case 6:
                return JsonReader.Token.BOOLEAN;
            case 7:
                return JsonReader.Token.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonReader.Token.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return JsonReader.Token.NAME;
            case 16:
            case 17:
                return JsonReader.Token.NUMBER;
            case 18:
                return JsonReader.Token.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: q */
    public int mo64564q(JsonReader.C21628a aVar) throws IOException {
        int i = this.f56025x;
        if (i == 0) {
            i = mo64631w();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return mo64632x(this.f56022X, aVar);
        }
        int Y3 = this.f56023v.mo27289Y3(aVar.f55956b);
        if (Y3 != -1) {
            this.f56025x = 0;
            this.f55940c[this.f55938a - 1] = aVar.f55955a[Y3];
            return Y3;
        }
        String str = this.f55940c[this.f55938a - 1];
        String l = mo64560l();
        int x = mo64632x(l, aVar);
        if (x == -1) {
            this.f56025x = 15;
            this.f56022X = l;
            this.f55940c[this.f55938a - 1] = str;
        }
        return x;
    }

    /* renamed from: r */
    public void mo64565r() throws IOException {
        if (!this.f55943f) {
            int i = this.f56025x;
            if (i == 0) {
                i = mo64631w();
            }
            if (i == 14) {
                mo64627L();
            } else if (i == 13) {
                mo64624I(f55989E0);
            } else if (i == 12) {
                mo64624I(f56011Z);
            } else if (i != 15) {
                throw new JsonDataException("Expected a name but was " + mo64562o() + " at path " + getPath());
            }
            this.f56025x = 0;
            this.f55940c[this.f55938a - 1] = "null";
            return;
        }
        throw new JsonDataException("Cannot skip unexpected " + mo64562o() + " at " + getPath());
    }

    /* renamed from: s */
    public void mo64566s() throws IOException {
        if (!this.f55943f) {
            int i = 0;
            do {
                int i2 = this.f56025x;
                if (i2 == 0) {
                    i2 = mo64631w();
                }
                if (i2 == 3) {
                    mo64563p(1);
                } else if (i2 == 1) {
                    mo64563p(3);
                } else {
                    if (i2 == 4) {
                        i--;
                        if (i >= 0) {
                            this.f55938a--;
                        } else {
                            throw new JsonDataException("Expected a value but was " + mo64562o() + " at path " + getPath());
                        }
                    } else if (i2 == 2) {
                        i--;
                        if (i >= 0) {
                            this.f55938a--;
                        } else {
                            throw new JsonDataException("Expected a value but was " + mo64562o() + " at path " + getPath());
                        }
                    } else if (i2 == 14 || i2 == 10) {
                        mo64627L();
                    } else if (i2 == 9 || i2 == 13) {
                        mo64624I(f55989E0);
                    } else if (i2 == 8 || i2 == 12) {
                        mo64624I(f56011Z);
                    } else if (i2 == 17) {
                        this.f56024w.skip((long) this.f56027z);
                    } else if (i2 == 18) {
                        throw new JsonDataException("Expected a value but was " + mo64562o() + " at path " + getPath());
                    }
                    this.f56025x = 0;
                }
                i++;
                this.f56025x = 0;
            } while (i != 0);
            int[] iArr = this.f55941d;
            int i3 = this.f55938a;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.f55940c[i3 - 1] = "null";
            return;
        }
        throw new JsonDataException("Cannot skip unexpected " + mo64562o() + " at " + getPath());
    }

    public String toString() {
        return "JsonReader(" + this.f56023v + ")";
    }

    /* renamed from: v */
    public final void mo64630v() throws IOException {
        if (!this.f55942e) {
            throw mo64567u("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* renamed from: w */
    public final int mo64631w() throws IOException {
        int[] iArr = this.f55939b;
        int i = this.f55938a;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int B = mo64618B(true);
            this.f56024w.readByte();
            if (B != 44) {
                if (B == 59) {
                    mo64630v();
                } else if (B == 93) {
                    this.f56025x = 4;
                    return 4;
                } else {
                    throw mo64567u("Unterminated array");
                }
            }
        } else if (i2 == 3 || i2 == 5) {
            iArr[i - 1] = 4;
            if (i2 == 5) {
                int B2 = mo64618B(true);
                this.f56024w.readByte();
                if (B2 != 44) {
                    if (B2 == 59) {
                        mo64630v();
                    } else if (B2 == 125) {
                        this.f56025x = 2;
                        return 2;
                    } else {
                        throw mo64567u("Unterminated object");
                    }
                }
            }
            int B3 = mo64618B(true);
            if (B3 == 34) {
                this.f56024w.readByte();
                this.f56025x = 13;
                return 13;
            } else if (B3 == 39) {
                this.f56024w.readByte();
                mo64630v();
                this.f56025x = 12;
                return 12;
            } else if (B3 != 125) {
                mo64630v();
                if (mo64634z((char) B3)) {
                    this.f56025x = 14;
                    return 14;
                }
                throw mo64567u("Expected name");
            } else if (i2 != 5) {
                this.f56024w.readByte();
                this.f56025x = 2;
                return 2;
            } else {
                throw mo64567u("Expected name");
            }
        } else if (i2 == 4) {
            iArr[i - 1] = 5;
            int B4 = mo64618B(true);
            this.f56024w.readByte();
            if (B4 != 58) {
                if (B4 == 61) {
                    mo64630v();
                    if (this.f56023v.mo27269E1(1) && this.f56024w.mo27330D(0) == 62) {
                        this.f56024w.readByte();
                    }
                } else {
                    throw mo64567u("Expected ':'");
                }
            }
        } else if (i2 == 6) {
            iArr[i - 1] = 7;
        } else if (i2 == 7) {
            if (mo64618B(false) == -1) {
                this.f56025x = 18;
                return 18;
            }
            mo64630v();
        } else if (i2 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int B5 = mo64618B(true);
        if (B5 == 34) {
            this.f56024w.readByte();
            this.f56025x = 9;
            return 9;
        } else if (B5 != 39) {
            if (!(B5 == 44 || B5 == 59)) {
                if (B5 == 91) {
                    this.f56024w.readByte();
                    this.f56025x = 3;
                    return 3;
                } else if (B5 != 93) {
                    if (B5 != 123) {
                        int E = mo64621E();
                        if (E != 0) {
                            return E;
                        }
                        int F = mo64622F();
                        if (F != 0) {
                            return F;
                        }
                        if (mo64634z(this.f56024w.mo27330D(0))) {
                            mo64630v();
                            this.f56025x = 10;
                            return 10;
                        }
                        throw mo64567u("Expected value");
                    }
                    this.f56024w.readByte();
                    this.f56025x = 1;
                    return 1;
                } else if (i2 == 1) {
                    this.f56024w.readByte();
                    this.f56025x = 4;
                    return 4;
                }
            }
            if (i2 == 1 || i2 == 2) {
                mo64630v();
                this.f56025x = 7;
                return 7;
            }
            throw mo64567u("Unexpected value");
        } else {
            mo64630v();
            this.f56024w.readByte();
            this.f56025x = 8;
            return 8;
        }
    }

    /* renamed from: x */
    public final int mo64632x(String str, JsonReader.C21628a aVar) {
        int length = aVar.f55955a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(aVar.f55955a[i])) {
                this.f56025x = 0;
                this.f55940c[this.f55938a - 1] = str;
                return i;
            }
        }
        return -1;
    }

    /* renamed from: y */
    public final int mo64633y(String str, JsonReader.C21628a aVar) {
        int length = aVar.f55955a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(aVar.f55955a[i])) {
                this.f56025x = 0;
                int[] iArr = this.f55941d;
                int i2 = this.f55938a - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
        }
        return -1;
    }

    /* renamed from: z */
    public final boolean mo64634z(int i) throws IOException {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (!(i == 47 || i == 61)) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        mo64630v();
        return false;
    }
}

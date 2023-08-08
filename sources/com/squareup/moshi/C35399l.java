package com.squareup.moshi;

import com.carrefour.fid.android.airship.util.C13758b;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.squareup.moshi.JsonReader;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigDecimal;
import javax.annotation.Nullable;
import okio.ByteString;
import okio.C12500m;
import okio.C12507o;

/* renamed from: com.squareup.moshi.l */
public final class C35399l extends JsonReader {

    /* renamed from: E0 */
    public static final ByteString f86970E0 = ByteString.m50362X("'\\");

    /* renamed from: F0 */
    public static final ByteString f86971F0 = ByteString.m50362X("\"\\");

    /* renamed from: G0 */
    public static final ByteString f86972G0 = ByteString.m50362X("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: H0 */
    public static final ByteString f86973H0 = ByteString.m50362X("\n\r");

    /* renamed from: I0 */
    public static final ByteString f86974I0 = ByteString.m50362X("*/");

    /* renamed from: J0 */
    public static final int f86975J0 = 0;

    /* renamed from: K0 */
    public static final int f86976K0 = 1;

    /* renamed from: L0 */
    public static final int f86977L0 = 2;

    /* renamed from: M0 */
    public static final int f86978M0 = 3;

    /* renamed from: N0 */
    public static final int f86979N0 = 4;

    /* renamed from: O0 */
    public static final int f86980O0 = 5;

    /* renamed from: P0 */
    public static final int f86981P0 = 6;

    /* renamed from: Q0 */
    public static final int f86982Q0 = 7;

    /* renamed from: R0 */
    public static final int f86983R0 = 8;

    /* renamed from: S0 */
    public static final int f86984S0 = 9;

    /* renamed from: T0 */
    public static final int f86985T0 = 10;

    /* renamed from: U0 */
    public static final int f86986U0 = 11;

    /* renamed from: V0 */
    public static final int f86987V0 = 12;

    /* renamed from: W0 */
    public static final int f86988W0 = 13;

    /* renamed from: X0 */
    public static final int f86989X0 = 14;

    /* renamed from: Y0 */
    public static final int f86990Y0 = 15;

    /* renamed from: Z */
    public static final long f86991Z = -922337203685477580L;

    /* renamed from: Z0 */
    public static final int f86992Z0 = 16;

    /* renamed from: a1 */
    public static final int f86993a1 = 17;

    /* renamed from: b1 */
    public static final int f86994b1 = 18;

    /* renamed from: c1 */
    public static final int f86995c1 = 0;

    /* renamed from: d1 */
    public static final int f86996d1 = 1;

    /* renamed from: e1 */
    public static final int f86997e1 = 2;

    /* renamed from: f1 */
    public static final int f86998f1 = 3;

    /* renamed from: g1 */
    public static final int f86999g1 = 4;

    /* renamed from: h1 */
    public static final int f87000h1 = 5;

    /* renamed from: i1 */
    public static final int f87001i1 = 6;

    /* renamed from: j1 */
    public static final int f87002j1 = 7;
    @Nullable

    /* renamed from: X */
    public String f87003X;
    @Nullable

    /* renamed from: Y */
    public C35404o f87004Y;

    /* renamed from: v */
    public final C12507o f87005v;

    /* renamed from: w */
    public final C12500m f87006w;

    /* renamed from: x */
    public int f87007x = 0;

    /* renamed from: y */
    public long f87008y;

    /* renamed from: z */
    public int f87009z;

    public C35399l(C12507o oVar) {
        if (oVar != null) {
            this.f87005v = oVar;
            this.f87006w = oVar.mo27292e();
            mo105891v(6);
            return;
        }
        throw new NullPointerException("source == null");
    }

    /* renamed from: D */
    public void mo105867D() throws IOException {
        if (!this.f86851f) {
            int i = this.f87007x;
            if (i == 0) {
                i = mo106011K();
            }
            if (i == 14) {
                mo106024X();
            } else if (i == 13) {
                mo106021U(f86971F0);
            } else if (i == 12) {
                mo106021U(f86970E0);
            } else if (i != 15) {
                throw new JsonDataException("Expected a name but was " + mo105888s() + " at path " + getPath());
            }
            this.f87007x = 0;
            this.f86848c[this.f86846a - 1] = "null";
            return;
        }
        JsonReader.Token s = mo105888s();
        mo105884n();
        throw new JsonDataException("Cannot skip unexpected " + s + " at " + getPath());
    }

    /* renamed from: E */
    public void mo105868E() throws IOException {
        if (!this.f86851f) {
            int i = 0;
            do {
                int i2 = this.f87007x;
                if (i2 == 0) {
                    i2 = mo106011K();
                }
                if (i2 == 3) {
                    mo105891v(1);
                } else if (i2 == 1) {
                    mo105891v(3);
                } else {
                    if (i2 == 4) {
                        i--;
                        if (i >= 0) {
                            this.f86846a--;
                        } else {
                            throw new JsonDataException("Expected a value but was " + mo105888s() + " at path " + getPath());
                        }
                    } else if (i2 == 2) {
                        i--;
                        if (i >= 0) {
                            this.f86846a--;
                        } else {
                            throw new JsonDataException("Expected a value but was " + mo105888s() + " at path " + getPath());
                        }
                    } else if (i2 == 14 || i2 == 10) {
                        mo106024X();
                    } else if (i2 == 9 || i2 == 13) {
                        mo106021U(f86971F0);
                    } else if (i2 == 8 || i2 == 12) {
                        mo106021U(f86970E0);
                    } else if (i2 == 17) {
                        this.f87006w.skip((long) this.f87009z);
                    } else if (i2 == 18) {
                        throw new JsonDataException("Expected a value but was " + mo105888s() + " at path " + getPath());
                    }
                    this.f87007x = 0;
                }
                i++;
                this.f87007x = 0;
            } while (i != 0);
            int[] iArr = this.f86849d;
            int i3 = this.f86846a;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.f86848c[i3 - 1] = "null";
            return;
        }
        throw new JsonDataException("Cannot skip unexpected " + mo105888s() + " at " + getPath());
    }

    /* renamed from: J */
    public final void mo106010J() throws IOException {
        if (!this.f86850e) {
            throw mo105869F("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* renamed from: K */
    public final int mo106011K() throws IOException {
        int[] iArr = this.f86847b;
        int i = this.f86846a;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int O = mo106015O(true);
            this.f87006w.readByte();
            if (O != 44) {
                if (O == 59) {
                    mo106010J();
                } else if (O == 93) {
                    this.f87007x = 4;
                    return 4;
                } else {
                    throw mo105869F("Unterminated array");
                }
            }
        } else if (i2 == 3 || i2 == 5) {
            iArr[i - 1] = 4;
            if (i2 == 5) {
                int O2 = mo106015O(true);
                this.f87006w.readByte();
                if (O2 != 44) {
                    if (O2 == 59) {
                        mo106010J();
                    } else if (O2 == 125) {
                        this.f87007x = 2;
                        return 2;
                    } else {
                        throw mo105869F("Unterminated object");
                    }
                }
            }
            int O3 = mo106015O(true);
            if (O3 == 34) {
                this.f87006w.readByte();
                this.f87007x = 13;
                return 13;
            } else if (O3 == 39) {
                this.f87006w.readByte();
                mo106010J();
                this.f87007x = 12;
                return 12;
            } else if (O3 != 125) {
                mo106010J();
                if (mo106014N((char) O3)) {
                    this.f87007x = 14;
                    return 14;
                }
                throw mo105869F("Expected name");
            } else if (i2 != 5) {
                this.f87006w.readByte();
                this.f87007x = 2;
                return 2;
            } else {
                throw mo105869F("Expected name");
            }
        } else if (i2 == 4) {
            iArr[i - 1] = 5;
            int O4 = mo106015O(true);
            this.f87006w.readByte();
            if (O4 != 58) {
                if (O4 == 61) {
                    mo106010J();
                    if (this.f87005v.mo27269E1(1) && this.f87006w.mo27330D(0) == 62) {
                        this.f87006w.readByte();
                    }
                } else {
                    throw mo105869F("Expected ':'");
                }
            }
        } else if (i2 == 6) {
            iArr[i - 1] = 7;
        } else if (i2 == 7) {
            if (mo106015O(false) == -1) {
                this.f87007x = 18;
                return 18;
            }
            mo106010J();
        } else if (i2 == 9) {
            this.f87004Y.mo106060b();
            this.f87004Y = null;
            this.f86846a--;
            return mo106011K();
        } else if (i2 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int O5 = mo106015O(true);
        if (O5 == 34) {
            this.f87006w.readByte();
            this.f87007x = 9;
            return 9;
        } else if (O5 != 39) {
            if (!(O5 == 44 || O5 == 59)) {
                if (O5 == 91) {
                    this.f87006w.readByte();
                    this.f87007x = 3;
                    return 3;
                } else if (O5 != 93) {
                    if (O5 != 123) {
                        int R = mo106018R();
                        if (R != 0) {
                            return R;
                        }
                        int S = mo106019S();
                        if (S != 0) {
                            return S;
                        }
                        if (mo106014N(this.f87006w.mo27330D(0))) {
                            mo106010J();
                            this.f87007x = 10;
                            return 10;
                        }
                        throw mo105869F("Expected value");
                    }
                    this.f87006w.readByte();
                    this.f87007x = 1;
                    return 1;
                } else if (i2 == 1) {
                    this.f87006w.readByte();
                    this.f87007x = 4;
                    return 4;
                }
            }
            if (i2 == 1 || i2 == 2) {
                mo106010J();
                this.f87007x = 7;
                return 7;
            }
            throw mo105869F("Unexpected value");
        } else {
            mo106010J();
            this.f87006w.readByte();
            this.f87007x = 8;
            return 8;
        }
    }

    /* renamed from: L */
    public final int mo106012L(String str, JsonReader.C35351b bVar) {
        int length = bVar.f86865a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(bVar.f86865a[i])) {
                this.f87007x = 0;
                this.f86848c[this.f86846a - 1] = str;
                return i;
            }
        }
        return -1;
    }

    /* renamed from: M */
    public final int mo106013M(String str, JsonReader.C35351b bVar) {
        int length = bVar.f86865a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(bVar.f86865a[i])) {
                this.f87007x = 0;
                int[] iArr = this.f86849d;
                int i2 = this.f86846a - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
        }
        return -1;
    }

    /* renamed from: N */
    public final boolean mo106014N(int i) throws IOException {
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
        mo106010J();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        r6.f87006w.skip((long) (r3 - 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        if (r1 != 47) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r6.f87005v.mo27269E1(2) != false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        mo106010J();
        r3 = r6.f87006w.mo27330D(1);
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
        r6.f87006w.readByte();
        r6.f87006w.readByte();
        mo106023W();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
        r6.f87006w.readByte();
        r6.f87006w.readByte();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006a, code lost:
        if (mo106022V() == false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0073, code lost:
        throw mo105869F("Unterminated comment");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0076, code lost:
        if (r1 != 35) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0078, code lost:
        mo106010J();
        mo106023W();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007f, code lost:
        return r1;
     */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo106015O(boolean r7) throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
        L_0x0001:
            r1 = r0
        L_0x0002:
            okio.o r2 = r6.f87005v
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.mo27269E1(r4)
            if (r2 == 0) goto L_0x0082
            okio.m r2 = r6.f87006w
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
            okio.m r2 = r6.f87006w
            int r3 = r3 + -1
            long r3 = (long) r3
            r2.skip(r3)
            r2 = 47
            if (r1 != r2) goto L_0x0074
            okio.o r3 = r6.f87005v
            r4 = 2
            boolean r3 = r3.mo27269E1(r4)
            if (r3 != 0) goto L_0x003c
            return r1
        L_0x003c:
            r6.mo106010J()
            okio.m r3 = r6.f87006w
            r4 = 1
            byte r3 = r3.mo27330D(r4)
            r4 = 42
            if (r3 == r4) goto L_0x005c
            if (r3 == r2) goto L_0x004e
            return r1
        L_0x004e:
            okio.m r1 = r6.f87006w
            r1.readByte()
            okio.m r1 = r6.f87006w
            r1.readByte()
            r6.mo106023W()
            goto L_0x0001
        L_0x005c:
            okio.m r1 = r6.f87006w
            r1.readByte()
            okio.m r1 = r6.f87006w
            r1.readByte()
            boolean r1 = r6.mo106022V()
            if (r1 == 0) goto L_0x006d
            goto L_0x0001
        L_0x006d:
            java.lang.String r7 = "Unterminated comment"
            com.squareup.moshi.JsonEncodingException r7 = r6.mo105869F(r7)
            throw r7
        L_0x0074:
            r2 = 35
            if (r1 != r2) goto L_0x007f
            r6.mo106010J()
            r6.mo106023W()
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
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.C35399l.mo106015O(boolean):int");
    }

    /* renamed from: P */
    public final String mo106016P(ByteString byteString) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long W0 = this.f87005v.mo27286W0(byteString);
            if (W0 == -1) {
                throw mo105869F("Unterminated string");
            } else if (this.f87006w.mo27330D(W0) == 92) {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(this.f87006w.mo27300n2(W0));
                this.f87006w.readByte();
                sb.append(mo106020T());
            } else if (sb == null) {
                String n2 = this.f87006w.mo27300n2(W0);
                this.f87006w.readByte();
                return n2;
            } else {
                sb.append(this.f87006w.mo27300n2(W0));
                this.f87006w.readByte();
                return sb.toString();
            }
        }
    }

    /* renamed from: Q */
    public final String mo106017Q() throws IOException {
        long W0 = this.f87005v.mo27286W0(f86972G0);
        if (W0 != -1) {
            return this.f87006w.mo27300n2(W0);
        }
        return this.f87006w.mo27268B3();
    }

    /* renamed from: R */
    public final int mo106018R() throws IOException {
        int i;
        String str;
        String str2;
        byte D = this.f87006w.mo27330D(0);
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
            if (!this.f87005v.mo27269E1((long) i3)) {
                return 0;
            }
            byte D2 = this.f87006w.mo27330D((long) i2);
            if (D2 != str2.charAt(i2) && D2 != str.charAt(i2)) {
                return 0;
            }
            i2 = i3;
        }
        if (this.f87005v.mo27269E1((long) (length + 1)) && mo106014N(this.f87006w.mo27330D((long) length))) {
            return 0;
        }
        this.f87006w.skip((long) length);
        this.f87007x = i;
        return i;
    }

    /* renamed from: S */
    public final int mo106019S() throws IOException {
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
            if (!this.f87005v.mo27269E1((long) i2)) {
                break;
            }
            D = this.f87006w.mo27330D((long) i);
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
        if (mo106014N(D)) {
            return 0;
        }
        if (c2 == 2 && z4 && ((j != Long.MIN_VALUE || z3) && (j != 0 || !z3))) {
            if (!z3) {
                j = -j;
            }
            this.f87008y = j;
            this.f87006w.skip((long) i);
            this.f87007x = 16;
            return 16;
        } else if (c2 != 2 && c2 != 4 && c2 != 7) {
            return 0;
        } else {
            this.f87009z = i;
            this.f87007x = 17;
            return 17;
        }
    }

    /* renamed from: T */
    public final char mo106020T() throws IOException {
        int i;
        int i2;
        if (this.f87005v.mo27269E1(1)) {
            byte readByte = this.f87006w.readByte();
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
                if (this.f86850e) {
                    return (char) readByte;
                }
                throw mo105869F("Invalid escape sequence: \\" + ((char) readByte));
            } else if (this.f87005v.mo27269E1(4)) {
                char c = 0;
                for (int i3 = 0; i3 < 4; i3++) {
                    byte D = this.f87006w.mo27330D((long) i3);
                    char c2 = (char) (c << 4);
                    if (D < 48 || D > 57) {
                        if (D >= 97 && D <= 102) {
                            i = D - 97;
                        } else if (D < 65 || D > 70) {
                            throw mo105869F("\\u" + this.f87006w.mo27300n2(4));
                        } else {
                            i = D + ByteSourceJsonBootstrapper.UTF8_BOM_3;
                        }
                        i2 = i + 10;
                    } else {
                        i2 = D - 48;
                    }
                    c = (char) (c2 + i2);
                }
                this.f87006w.skip(4);
                return c;
            } else {
                throw new EOFException("Unterminated escape sequence at path " + getPath());
            }
        } else {
            throw mo105869F("Unterminated escape sequence");
        }
    }

    /* renamed from: U */
    public final void mo106021U(ByteString byteString) throws IOException {
        while (true) {
            long W0 = this.f87005v.mo27286W0(byteString);
            if (W0 == -1) {
                throw mo105869F("Unterminated string");
            } else if (this.f87006w.mo27330D(W0) == 92) {
                this.f87006w.skip(W0 + 1);
                mo106020T();
            } else {
                this.f87006w.skip(W0 + 1);
                return;
            }
        }
    }

    /* renamed from: V */
    public final boolean mo106022V() throws IOException {
        boolean z;
        long j;
        C12507o oVar = this.f87005v;
        ByteString byteString = f86974I0;
        long J0 = oVar.mo27273J0(byteString);
        if (J0 != -1) {
            z = true;
        } else {
            z = false;
        }
        C12500m mVar = this.f87006w;
        if (z) {
            j = J0 + ((long) byteString.size());
        } else {
            j = mVar.mo27362c0();
        }
        mVar.skip(j);
        return z;
    }

    /* renamed from: W */
    public final void mo106023W() throws IOException {
        long j;
        long W0 = this.f87005v.mo27286W0(f86973H0);
        C12500m mVar = this.f87006w;
        if (W0 != -1) {
            j = W0 + 1;
        } else {
            j = mVar.mo27362c0();
        }
        mVar.skip(j);
    }

    /* renamed from: X */
    public final void mo106024X() throws IOException {
        long W0 = this.f87005v.mo27286W0(f86972G0);
        C12500m mVar = this.f87006w;
        if (W0 == -1) {
            W0 = mVar.mo27362c0();
        }
        mVar.skip(W0);
    }

    /* renamed from: a */
    public void mo105872a() throws IOException {
        int i = this.f87007x;
        if (i == 0) {
            i = mo106011K();
        }
        if (i == 3) {
            mo105891v(1);
            this.f86849d[this.f86846a - 1] = 0;
            this.f87007x = 0;
            return;
        }
        throw new JsonDataException("Expected BEGIN_ARRAY but was " + mo105888s() + " at path " + getPath());
    }

    /* renamed from: b */
    public void mo105873b() throws IOException {
        int i = this.f87007x;
        if (i == 0) {
            i = mo106011K();
        }
        if (i == 1) {
            mo105891v(3);
            this.f87007x = 0;
            return;
        }
        throw new JsonDataException("Expected BEGIN_OBJECT but was " + mo105888s() + " at path " + getPath());
    }

    /* renamed from: c */
    public void mo105874c() throws IOException {
        int i = this.f87007x;
        if (i == 0) {
            i = mo106011K();
        }
        if (i == 4) {
            int i2 = this.f86846a - 1;
            this.f86846a = i2;
            int[] iArr = this.f86849d;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f87007x = 0;
            return;
        }
        throw new JsonDataException("Expected END_ARRAY but was " + mo105888s() + " at path " + getPath());
    }

    public void close() throws IOException {
        this.f87007x = 0;
        this.f86847b[0] = 8;
        this.f86846a = 1;
        this.f87006w.mo27367f();
        this.f87005v.close();
    }

    /* renamed from: d */
    public void mo105875d() throws IOException {
        int i = this.f87007x;
        if (i == 0) {
            i = mo106011K();
        }
        if (i == 2) {
            int i2 = this.f86846a - 1;
            this.f86846a = i2;
            this.f86848c[i2] = null;
            int[] iArr = this.f86849d;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f87007x = 0;
            return;
        }
        throw new JsonDataException("Expected END_OBJECT but was " + mo105888s() + " at path " + getPath());
    }

    /* renamed from: g */
    public boolean mo105877g() throws IOException {
        int i = this.f87007x;
        if (i == 0) {
            i = mo106011K();
        }
        if (i == 2 || i == 4 || i == 18) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public boolean mo105880j() throws IOException {
        int i = this.f87007x;
        if (i == 0) {
            i = mo106011K();
        }
        if (i == 5) {
            this.f87007x = 0;
            int[] iArr = this.f86849d;
            int i2 = this.f86846a - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f87007x = 0;
            int[] iArr2 = this.f86849d;
            int i3 = this.f86846a - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new JsonDataException("Expected a boolean but was " + mo105888s() + " at path " + getPath());
        }
    }

    /* renamed from: k */
    public double mo105881k() throws IOException {
        int i = this.f87007x;
        if (i == 0) {
            i = mo106011K();
        }
        if (i == 16) {
            this.f87007x = 0;
            int[] iArr = this.f86849d;
            int i2 = this.f86846a - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.f87008y;
        }
        if (i == 17) {
            this.f87003X = this.f87006w.mo27300n2((long) this.f87009z);
        } else if (i == 9) {
            this.f87003X = mo106016P(f86971F0);
        } else if (i == 8) {
            this.f87003X = mo106016P(f86970E0);
        } else if (i == 10) {
            this.f87003X = mo106017Q();
        } else if (i != 11) {
            throw new JsonDataException("Expected a double but was " + mo105888s() + " at path " + getPath());
        }
        this.f87007x = 11;
        try {
            double parseDouble = Double.parseDouble(this.f87003X);
            if (this.f86850e || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
                this.f87003X = null;
                this.f87007x = 0;
                int[] iArr2 = this.f86849d;
                int i3 = this.f86846a - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseDouble;
            }
            throw new JsonEncodingException("JSON forbids NaN and infinities: " + parseDouble + " at path " + getPath());
        } catch (NumberFormatException unused) {
            throw new JsonDataException("Expected a double but was " + this.f87003X + " at path " + getPath());
        }
    }

    /* renamed from: l */
    public int mo105882l() throws IOException {
        String str;
        int i = this.f87007x;
        if (i == 0) {
            i = mo106011K();
        }
        if (i == 16) {
            long j = this.f87008y;
            int i2 = (int) j;
            if (j == ((long) i2)) {
                this.f87007x = 0;
                int[] iArr = this.f86849d;
                int i3 = this.f86846a - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new JsonDataException("Expected an int but was " + this.f87008y + " at path " + getPath());
        }
        if (i == 17) {
            this.f87003X = this.f87006w.mo27300n2((long) this.f87009z);
        } else if (i == 9 || i == 8) {
            if (i == 9) {
                str = mo106016P(f86971F0);
            } else {
                str = mo106016P(f86970E0);
            }
            this.f87003X = str;
            try {
                int parseInt = Integer.parseInt(str);
                this.f87007x = 0;
                int[] iArr2 = this.f86849d;
                int i4 = this.f86846a - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            throw new JsonDataException("Expected an int but was " + mo105888s() + " at path " + getPath());
        }
        this.f87007x = 11;
        try {
            double parseDouble = Double.parseDouble(this.f87003X);
            int i5 = (int) parseDouble;
            if (((double) i5) == parseDouble) {
                this.f87003X = null;
                this.f87007x = 0;
                int[] iArr3 = this.f86849d;
                int i6 = this.f86846a - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            throw new JsonDataException("Expected an int but was " + this.f87003X + " at path " + getPath());
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected an int but was " + this.f87003X + " at path " + getPath());
        }
    }

    /* renamed from: m */
    public long mo105883m() throws IOException {
        String str;
        int i = this.f87007x;
        if (i == 0) {
            i = mo106011K();
        }
        if (i == 16) {
            this.f87007x = 0;
            int[] iArr = this.f86849d;
            int i2 = this.f86846a - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f87008y;
        }
        if (i == 17) {
            this.f87003X = this.f87006w.mo27300n2((long) this.f87009z);
        } else if (i == 9 || i == 8) {
            if (i == 9) {
                str = mo106016P(f86971F0);
            } else {
                str = mo106016P(f86970E0);
            }
            this.f87003X = str;
            try {
                long parseLong = Long.parseLong(str);
                this.f87007x = 0;
                int[] iArr2 = this.f86849d;
                int i3 = this.f86846a - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            throw new JsonDataException("Expected a long but was " + mo105888s() + " at path " + getPath());
        }
        this.f87007x = 11;
        try {
            long longValueExact = new BigDecimal(this.f87003X).longValueExact();
            this.f87003X = null;
            this.f87007x = 0;
            int[] iArr3 = this.f86849d;
            int i4 = this.f86846a - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return longValueExact;
        } catch (ArithmeticException | NumberFormatException unused2) {
            throw new JsonDataException("Expected a long but was " + this.f87003X + " at path " + getPath());
        }
    }

    /* renamed from: n */
    public String mo105884n() throws IOException {
        String str;
        int i = this.f87007x;
        if (i == 0) {
            i = mo106011K();
        }
        if (i == 14) {
            str = mo106017Q();
        } else if (i == 13) {
            str = mo106016P(f86971F0);
        } else if (i == 12) {
            str = mo106016P(f86970E0);
        } else if (i == 15) {
            str = this.f87003X;
            this.f87003X = null;
        } else {
            throw new JsonDataException("Expected a name but was " + mo105888s() + " at path " + getPath());
        }
        this.f87007x = 0;
        this.f86848c[this.f86846a - 1] = str;
        return str;
    }

    @Nullable
    /* renamed from: o */
    public <T> T mo105885o() throws IOException {
        int i = this.f87007x;
        if (i == 0) {
            i = mo106011K();
        }
        if (i == 7) {
            this.f87007x = 0;
            int[] iArr = this.f86849d;
            int i2 = this.f86846a - 1;
            iArr[i2] = iArr[i2] + 1;
            return null;
        }
        throw new JsonDataException("Expected null but was " + mo105888s() + " at path " + getPath());
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00bd  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public okio.C12507o mo105886p() throws java.io.IOException {
        /*
            r9 = this;
            int r0 = r9.f87007x
            if (r0 != 0) goto L_0x0008
            int r0 = r9.mo106011K()
        L_0x0008:
            okio.m r1 = new okio.m
            r1.<init>()
            okio.ByteString r2 = com.squareup.moshi.C35404o.f87020X
            r3 = 3
            r4 = 9
            r5 = 0
            r6 = 1
            if (r0 != r3) goto L_0x0020
            java.lang.String r0 = "["
            r1.mo27236l1(r0)
            okio.ByteString r2 = com.squareup.moshi.C35404o.f87021v
        L_0x001d:
            r0 = r6
            goto L_0x00b9
        L_0x0020:
            if (r0 != r6) goto L_0x002a
            java.lang.String r0 = "{"
            r1.mo27236l1(r0)
            okio.ByteString r2 = com.squareup.moshi.C35404o.f87021v
            goto L_0x001d
        L_0x002a:
            if (r0 != r4) goto L_0x0036
            java.lang.String r0 = "\""
            r1.mo27236l1(r0)
            okio.ByteString r2 = com.squareup.moshi.C35404o.f87023x
        L_0x0033:
            r0 = r5
            goto L_0x00b9
        L_0x0036:
            r3 = 8
            if (r0 != r3) goto L_0x0042
            java.lang.String r0 = "'"
            r1.mo27236l1(r0)
            okio.ByteString r2 = com.squareup.moshi.C35404o.f87022w
            goto L_0x0033
        L_0x0042:
            r3 = 17
            if (r0 == r3) goto L_0x00b0
            r3 = 16
            if (r0 == r3) goto L_0x00b0
            r3 = 10
            if (r0 != r3) goto L_0x004f
            goto L_0x00b0
        L_0x004f:
            r3 = 5
            if (r0 != r3) goto L_0x0058
            java.lang.String r0 = "true"
            r1.mo27236l1(r0)
            goto L_0x0033
        L_0x0058:
            r3 = 6
            if (r0 != r3) goto L_0x0061
            java.lang.String r0 = "false"
            r1.mo27236l1(r0)
            goto L_0x0033
        L_0x0061:
            r3 = 7
            if (r0 != r3) goto L_0x006a
            java.lang.String r0 = "null"
            r1.mo27236l1(r0)
            goto L_0x0033
        L_0x006a:
            r3 = 11
            if (r0 != r3) goto L_0x0089
            java.lang.String r0 = r9.mo105887q()
            com.squareup.moshi.q r3 = com.squareup.moshi.C35407q.m145929p(r1)
            r3.mo106030E(r0)     // Catch:{ all -> 0x007d }
            r3.close()
            goto L_0x0033
        L_0x007d:
            r0 = move-exception
            if (r3 == 0) goto L_0x0088
            r3.close()     // Catch:{ all -> 0x0084 }
            goto L_0x0088
        L_0x0084:
            r1 = move-exception
            r0.addSuppressed(r1)
        L_0x0088:
            throw r0
        L_0x0089:
            com.squareup.moshi.JsonDataException r0 = new com.squareup.moshi.JsonDataException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected a value but was "
            r1.append(r2)
            com.squareup.moshi.JsonReader$Token r2 = r9.mo105888s()
            r1.append(r2)
            java.lang.String r2 = " at path "
            r1.append(r2)
            java.lang.String r2 = r9.getPath()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x00b0:
            java.lang.String r0 = r9.mo105887q()
            r1.mo27236l1(r0)
            goto L_0x0033
        L_0x00b9:
            int r3 = r9.f87007x
            if (r3 == 0) goto L_0x00c9
            int[] r3 = r9.f86849d
            int r7 = r9.f86846a
            int r7 = r7 - r6
            r8 = r3[r7]
            int r8 = r8 + r6
            r3[r7] = r8
            r9.f87007x = r5
        L_0x00c9:
            com.squareup.moshi.o r3 = new com.squareup.moshi.o
            okio.o r5 = r9.f87005v
            r3.<init>(r5, r1, r2, r0)
            r9.f87004Y = r3
            r9.mo105891v(r4)
            com.squareup.moshi.o r0 = r9.f87004Y
            okio.o r0 = okio.C12465c0.m50481d(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.C35399l.mo105886p():okio.o");
    }

    /* renamed from: q */
    public String mo105887q() throws IOException {
        String str;
        int i = this.f87007x;
        if (i == 0) {
            i = mo106011K();
        }
        if (i == 10) {
            str = mo106017Q();
        } else if (i == 9) {
            str = mo106016P(f86971F0);
        } else if (i == 8) {
            str = mo106016P(f86970E0);
        } else if (i == 11) {
            str = this.f87003X;
            this.f87003X = null;
        } else if (i == 16) {
            str = Long.toString(this.f87008y);
        } else if (i == 17) {
            str = this.f87006w.mo27300n2((long) this.f87009z);
        } else {
            throw new JsonDataException("Expected a string but was " + mo105888s() + " at path " + getPath());
        }
        this.f87007x = 0;
        int[] iArr = this.f86849d;
        int i2 = this.f86846a - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* renamed from: s */
    public JsonReader.Token mo105888s() throws IOException {
        int i = this.f87007x;
        if (i == 0) {
            i = mo106011K();
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

    /* renamed from: t */
    public JsonReader mo105889t() {
        return new C35399l(this);
    }

    public String toString() {
        return "JsonReader(" + this.f87005v + ")";
    }

    /* renamed from: u */
    public void mo105890u() throws IOException {
        if (mo105877g()) {
            this.f87003X = mo105884n();
            this.f87007x = 11;
        }
    }

    /* renamed from: x */
    public int mo105893x(JsonReader.C35351b bVar) throws IOException {
        int i = this.f87007x;
        if (i == 0) {
            i = mo106011K();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return mo106012L(this.f87003X, bVar);
        }
        int Y3 = this.f87005v.mo27289Y3(bVar.f86866b);
        if (Y3 != -1) {
            this.f87007x = 0;
            this.f86848c[this.f86846a - 1] = bVar.f86865a[Y3];
            return Y3;
        }
        String str = this.f86848c[this.f86846a - 1];
        String n = mo105884n();
        int L = mo106012L(n, bVar);
        if (L == -1) {
            this.f87007x = 15;
            this.f87003X = n;
            this.f86848c[this.f86846a - 1] = str;
        }
        return L;
    }

    /* renamed from: y */
    public int mo105894y(JsonReader.C35351b bVar) throws IOException {
        int i = this.f87007x;
        if (i == 0) {
            i = mo106011K();
        }
        if (i < 8 || i > 11) {
            return -1;
        }
        if (i == 11) {
            return mo106013M(this.f87003X, bVar);
        }
        int Y3 = this.f87005v.mo27289Y3(bVar.f86866b);
        if (Y3 != -1) {
            this.f87007x = 0;
            int[] iArr = this.f86849d;
            int i2 = this.f86846a - 1;
            iArr[i2] = iArr[i2] + 1;
            return Y3;
        }
        String q = mo105887q();
        int M = mo106013M(q, bVar);
        if (M == -1) {
            this.f87007x = 11;
            this.f87003X = q;
            int[] iArr2 = this.f86849d;
            int i3 = this.f86846a - 1;
            iArr2[i3] = iArr2[i3] - 1;
        }
        return M;
    }

    public C35399l(C35399l lVar) {
        super(lVar);
        C12507o R3 = lVar.f87005v.mo27281R3();
        this.f87005v = R3;
        this.f87006w = R3.mo27292e();
        this.f87007x = lVar.f87007x;
        this.f87008y = lVar.f87008y;
        this.f87009z = lVar.f87009z;
        this.f87003X = lVar.f87003X;
        try {
            R3.mo27293f2(lVar.f87006w.mo27362c0());
        } catch (IOException unused) {
            throw new AssertionError();
        }
    }
}

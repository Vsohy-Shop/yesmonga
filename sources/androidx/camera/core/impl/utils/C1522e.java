package androidx.camera.core.impl.utils;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* renamed from: androidx.camera.core.impl.utils.e */
public final class C1522e {

    /* renamed from: e */
    public static final String f4345e = "ExifAttribute";

    /* renamed from: f */
    public static final long f4346f = -1;

    /* renamed from: g */
    public static final Charset f4347g = StandardCharsets.US_ASCII;

    /* renamed from: h */
    public static final int f4348h = 1;

    /* renamed from: i */
    public static final int f4349i = 2;

    /* renamed from: j */
    public static final int f4350j = 3;

    /* renamed from: k */
    public static final int f4351k = 4;

    /* renamed from: l */
    public static final int f4352l = 5;

    /* renamed from: m */
    public static final int f4353m = 6;

    /* renamed from: n */
    public static final int f4354n = 7;

    /* renamed from: o */
    public static final int f4355o = 8;

    /* renamed from: p */
    public static final int f4356p = 9;

    /* renamed from: q */
    public static final int f4357q = 10;

    /* renamed from: r */
    public static final int f4358r = 11;

    /* renamed from: s */
    public static final int f4359s = 12;

    /* renamed from: t */
    public static final String[] f4360t = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: u */
    public static final int[] f4361u = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: v */
    public static final byte[] f4362v = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: a */
    public final int f4363a;

    /* renamed from: b */
    public final int f4364b;

    /* renamed from: c */
    public final long f4365c;

    /* renamed from: d */
    public final byte[] f4366d;

    public C1522e(int i, int i2, byte[] bArr) {
        this(i, i2, -1, bArr);
    }

    @C0359n0
    /* renamed from: a */
    public static C1522e m6417a(@C0359n0 String str) {
        if (str.length() != 1 || str.charAt(0) < '0' || str.charAt(0) > '1') {
            byte[] bytes = str.getBytes(f4347g);
            return new C1522e(1, bytes.length, bytes);
        }
        return new C1522e(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
    }

    @C0359n0
    /* renamed from: b */
    public static C1522e m6418b(double d, @C0359n0 ByteOrder byteOrder) {
        return m6419c(new double[]{d}, byteOrder);
    }

    @C0359n0
    /* renamed from: c */
    public static C1522e m6419c(@C0359n0 double[] dArr, @C0359n0 ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[(f4361u[12] * dArr.length)]);
        wrap.order(byteOrder);
        for (double putDouble : dArr) {
            wrap.putDouble(putDouble);
        }
        return new C1522e(12, dArr.length, wrap.array());
    }

    @C0359n0
    /* renamed from: d */
    public static C1522e m6420d(int i, @C0359n0 ByteOrder byteOrder) {
        return m6421e(new int[]{i}, byteOrder);
    }

    @C0359n0
    /* renamed from: e */
    public static C1522e m6421e(@C0359n0 int[] iArr, @C0359n0 ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[(f4361u[9] * iArr.length)]);
        wrap.order(byteOrder);
        for (int putInt : iArr) {
            wrap.putInt(putInt);
        }
        return new C1522e(9, iArr.length, wrap.array());
    }

    @C0359n0
    /* renamed from: f */
    public static C1522e m6422f(@C0359n0 C1564h hVar, @C0359n0 ByteOrder byteOrder) {
        return m6423g(new C1564h[]{hVar}, byteOrder);
    }

    @C0359n0
    /* renamed from: g */
    public static C1522e m6423g(@C0359n0 C1564h[] hVarArr, @C0359n0 ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[(f4361u[10] * hVarArr.length)]);
        wrap.order(byteOrder);
        for (C1564h hVar : hVarArr) {
            wrap.putInt((int) hVar.mo5517b());
            wrap.putInt((int) hVar.mo5516a());
        }
        return new C1522e(10, hVarArr.length, wrap.array());
    }

    @C0359n0
    /* renamed from: h */
    public static C1522e m6424h(@C0359n0 String str) {
        byte[] bytes = (str + 0).getBytes(f4347g);
        return new C1522e(2, bytes.length, bytes);
    }

    @C0359n0
    /* renamed from: i */
    public static C1522e m6425i(long j, @C0359n0 ByteOrder byteOrder) {
        return m6426j(new long[]{j}, byteOrder);
    }

    @C0359n0
    /* renamed from: j */
    public static C1522e m6426j(@C0359n0 long[] jArr, @C0359n0 ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[(f4361u[4] * jArr.length)]);
        wrap.order(byteOrder);
        for (long j : jArr) {
            wrap.putInt((int) j);
        }
        return new C1522e(4, jArr.length, wrap.array());
    }

    @C0359n0
    /* renamed from: k */
    public static C1522e m6427k(@C0359n0 C1564h hVar, @C0359n0 ByteOrder byteOrder) {
        return m6428l(new C1564h[]{hVar}, byteOrder);
    }

    @C0359n0
    /* renamed from: l */
    public static C1522e m6428l(@C0359n0 C1564h[] hVarArr, @C0359n0 ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[(f4361u[5] * hVarArr.length)]);
        wrap.order(byteOrder);
        for (C1564h hVar : hVarArr) {
            wrap.putInt((int) hVar.mo5517b());
            wrap.putInt((int) hVar.mo5516a());
        }
        return new C1522e(5, hVarArr.length, wrap.array());
    }

    @C0359n0
    /* renamed from: m */
    public static C1522e m6429m(int i, @C0359n0 ByteOrder byteOrder) {
        return m6430n(new int[]{i}, byteOrder);
    }

    @C0359n0
    /* renamed from: n */
    public static C1522e m6430n(@C0359n0 int[] iArr, @C0359n0 ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[(f4361u[3] * iArr.length)]);
        wrap.order(byteOrder);
        for (int i : iArr) {
            wrap.putShort((short) i);
        }
        return new C1522e(3, iArr.length, wrap.array());
    }

    /* renamed from: o */
    public double mo5428o(@C0359n0 ByteOrder byteOrder) {
        Object r = mo5431r(byteOrder);
        if (r == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        } else if (r instanceof String) {
            return Double.parseDouble((String) r);
        } else {
            if (r instanceof long[]) {
                long[] jArr = (long[]) r;
                if (jArr.length == 1) {
                    return (double) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (r instanceof int[]) {
                int[] iArr = (int[]) r;
                if (iArr.length == 1) {
                    return (double) iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (r instanceof double[]) {
                double[] dArr = (double[]) r;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (r instanceof C1564h[]) {
                C1564h[] hVarArr = (C1564h[]) r;
                if (hVarArr.length == 1) {
                    return hVarArr[0].mo5518c();
                }
                throw new NumberFormatException("There are more than one component");
            } else {
                throw new NumberFormatException("Couldn't find a double value");
            }
        }
    }

    /* renamed from: p */
    public int mo5429p(@C0359n0 ByteOrder byteOrder) {
        Object r = mo5431r(byteOrder);
        if (r == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        } else if (r instanceof String) {
            return Integer.parseInt((String) r);
        } else {
            if (r instanceof long[]) {
                long[] jArr = (long[]) r;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (r instanceof int[]) {
                int[] iArr = (int[]) r;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else {
                throw new NumberFormatException("Couldn't find a integer value");
            }
        }
    }

    @C0363p0
    /* renamed from: q */
    public String mo5430q(@C0359n0 ByteOrder byteOrder) {
        Object r = mo5431r(byteOrder);
        if (r == null) {
            return null;
        }
        if (r instanceof String) {
            return (String) r;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (r instanceof long[]) {
            long[] jArr = (long[]) r;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        } else if (r instanceof int[]) {
            int[] iArr = (int[]) r;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        } else if (r instanceof double[]) {
            double[] dArr = (double[]) r;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        } else if (!(r instanceof C1564h[])) {
            return null;
        } else {
            C1564h[] hVarArr = (C1564h[]) r;
            while (i < hVarArr.length) {
                sb.append(hVarArr[i].mo5517b());
                sb.append('/');
                sb.append(hVarArr[i].mo5516a());
                i++;
                if (i != hVarArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:163:0x019b A[SYNTHETIC, Splitter:B:163:0x019b] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo5431r(java.nio.ByteOrder r11) {
        /*
            r10 = this;
            java.lang.String r0 = "IOException occurred while closing InputStream"
            java.lang.String r1 = "ExifAttribute"
            r2 = 0
            androidx.camera.core.impl.utils.a r3 = new androidx.camera.core.impl.utils.a     // Catch:{ IOException -> 0x0185, all -> 0x0183 }
            byte[] r4 = r10.f4366d     // Catch:{ IOException -> 0x0185, all -> 0x0183 }
            r3.<init>((byte[]) r4)     // Catch:{ IOException -> 0x0185, all -> 0x0183 }
            r3.mo5367f(r11)     // Catch:{ IOException -> 0x0181 }
            int r11 = r10.f4363a     // Catch:{ IOException -> 0x0181 }
            r4 = 0
            r5 = 1
            switch(r11) {
                case 1: goto L_0x0148;
                case 2: goto L_0x00fd;
                case 3: goto L_0x00e3;
                case 4: goto L_0x00c9;
                case 5: goto L_0x00a6;
                case 6: goto L_0x0148;
                case 7: goto L_0x00fd;
                case 8: goto L_0x008c;
                case 9: goto L_0x0072;
                case 10: goto L_0x004d;
                case 11: goto L_0x0032;
                case 12: goto L_0x0018;
                default: goto L_0x0016;
            }     // Catch:{ IOException -> 0x0181 }
        L_0x0016:
            goto L_0x0178
        L_0x0018:
            int r11 = r10.f4364b     // Catch:{ IOException -> 0x0181 }
            double[] r11 = new double[r11]     // Catch:{ IOException -> 0x0181 }
        L_0x001c:
            int r5 = r10.f4364b     // Catch:{ IOException -> 0x0181 }
            if (r4 >= r5) goto L_0x0029
            double r5 = r3.readDouble()     // Catch:{ IOException -> 0x0181 }
            r11[r4] = r5     // Catch:{ IOException -> 0x0181 }
            int r4 = r4 + 1
            goto L_0x001c
        L_0x0029:
            r3.close()     // Catch:{ IOException -> 0x002d }
            goto L_0x0031
        L_0x002d:
            r2 = move-exception
            androidx.camera.core.C1417i2.m5914d(r1, r0, r2)
        L_0x0031:
            return r11
        L_0x0032:
            int r11 = r10.f4364b     // Catch:{ IOException -> 0x0181 }
            double[] r11 = new double[r11]     // Catch:{ IOException -> 0x0181 }
        L_0x0036:
            int r5 = r10.f4364b     // Catch:{ IOException -> 0x0181 }
            if (r4 >= r5) goto L_0x0044
            float r5 = r3.readFloat()     // Catch:{ IOException -> 0x0181 }
            double r5 = (double) r5     // Catch:{ IOException -> 0x0181 }
            r11[r4] = r5     // Catch:{ IOException -> 0x0181 }
            int r4 = r4 + 1
            goto L_0x0036
        L_0x0044:
            r3.close()     // Catch:{ IOException -> 0x0048 }
            goto L_0x004c
        L_0x0048:
            r2 = move-exception
            androidx.camera.core.C1417i2.m5914d(r1, r0, r2)
        L_0x004c:
            return r11
        L_0x004d:
            int r11 = r10.f4364b     // Catch:{ IOException -> 0x0181 }
            androidx.camera.core.impl.utils.h[] r11 = new androidx.camera.core.impl.utils.C1564h[r11]     // Catch:{ IOException -> 0x0181 }
        L_0x0051:
            int r5 = r10.f4364b     // Catch:{ IOException -> 0x0181 }
            if (r4 >= r5) goto L_0x0069
            int r5 = r3.readInt()     // Catch:{ IOException -> 0x0181 }
            long r5 = (long) r5     // Catch:{ IOException -> 0x0181 }
            int r7 = r3.readInt()     // Catch:{ IOException -> 0x0181 }
            long r7 = (long) r7     // Catch:{ IOException -> 0x0181 }
            androidx.camera.core.impl.utils.h r9 = new androidx.camera.core.impl.utils.h     // Catch:{ IOException -> 0x0181 }
            r9.<init>(r5, r7)     // Catch:{ IOException -> 0x0181 }
            r11[r4] = r9     // Catch:{ IOException -> 0x0181 }
            int r4 = r4 + 1
            goto L_0x0051
        L_0x0069:
            r3.close()     // Catch:{ IOException -> 0x006d }
            goto L_0x0071
        L_0x006d:
            r2 = move-exception
            androidx.camera.core.C1417i2.m5914d(r1, r0, r2)
        L_0x0071:
            return r11
        L_0x0072:
            int r11 = r10.f4364b     // Catch:{ IOException -> 0x0181 }
            int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0181 }
        L_0x0076:
            int r5 = r10.f4364b     // Catch:{ IOException -> 0x0181 }
            if (r4 >= r5) goto L_0x0083
            int r5 = r3.readInt()     // Catch:{ IOException -> 0x0181 }
            r11[r4] = r5     // Catch:{ IOException -> 0x0181 }
            int r4 = r4 + 1
            goto L_0x0076
        L_0x0083:
            r3.close()     // Catch:{ IOException -> 0x0087 }
            goto L_0x008b
        L_0x0087:
            r2 = move-exception
            androidx.camera.core.C1417i2.m5914d(r1, r0, r2)
        L_0x008b:
            return r11
        L_0x008c:
            int r11 = r10.f4364b     // Catch:{ IOException -> 0x0181 }
            int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0181 }
        L_0x0090:
            int r5 = r10.f4364b     // Catch:{ IOException -> 0x0181 }
            if (r4 >= r5) goto L_0x009d
            short r5 = r3.readShort()     // Catch:{ IOException -> 0x0181 }
            r11[r4] = r5     // Catch:{ IOException -> 0x0181 }
            int r4 = r4 + 1
            goto L_0x0090
        L_0x009d:
            r3.close()     // Catch:{ IOException -> 0x00a1 }
            goto L_0x00a5
        L_0x00a1:
            r2 = move-exception
            androidx.camera.core.C1417i2.m5914d(r1, r0, r2)
        L_0x00a5:
            return r11
        L_0x00a6:
            int r11 = r10.f4364b     // Catch:{ IOException -> 0x0181 }
            androidx.camera.core.impl.utils.h[] r11 = new androidx.camera.core.impl.utils.C1564h[r11]     // Catch:{ IOException -> 0x0181 }
        L_0x00aa:
            int r5 = r10.f4364b     // Catch:{ IOException -> 0x0181 }
            if (r4 >= r5) goto L_0x00c0
            long r5 = r3.mo5365c()     // Catch:{ IOException -> 0x0181 }
            long r7 = r3.mo5365c()     // Catch:{ IOException -> 0x0181 }
            androidx.camera.core.impl.utils.h r9 = new androidx.camera.core.impl.utils.h     // Catch:{ IOException -> 0x0181 }
            r9.<init>(r5, r7)     // Catch:{ IOException -> 0x0181 }
            r11[r4] = r9     // Catch:{ IOException -> 0x0181 }
            int r4 = r4 + 1
            goto L_0x00aa
        L_0x00c0:
            r3.close()     // Catch:{ IOException -> 0x00c4 }
            goto L_0x00c8
        L_0x00c4:
            r2 = move-exception
            androidx.camera.core.C1417i2.m5914d(r1, r0, r2)
        L_0x00c8:
            return r11
        L_0x00c9:
            int r11 = r10.f4364b     // Catch:{ IOException -> 0x0181 }
            long[] r11 = new long[r11]     // Catch:{ IOException -> 0x0181 }
        L_0x00cd:
            int r5 = r10.f4364b     // Catch:{ IOException -> 0x0181 }
            if (r4 >= r5) goto L_0x00da
            long r5 = r3.mo5365c()     // Catch:{ IOException -> 0x0181 }
            r11[r4] = r5     // Catch:{ IOException -> 0x0181 }
            int r4 = r4 + 1
            goto L_0x00cd
        L_0x00da:
            r3.close()     // Catch:{ IOException -> 0x00de }
            goto L_0x00e2
        L_0x00de:
            r2 = move-exception
            androidx.camera.core.C1417i2.m5914d(r1, r0, r2)
        L_0x00e2:
            return r11
        L_0x00e3:
            int r11 = r10.f4364b     // Catch:{ IOException -> 0x0181 }
            int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0181 }
        L_0x00e7:
            int r5 = r10.f4364b     // Catch:{ IOException -> 0x0181 }
            if (r4 >= r5) goto L_0x00f4
            int r5 = r3.readUnsignedShort()     // Catch:{ IOException -> 0x0181 }
            r11[r4] = r5     // Catch:{ IOException -> 0x0181 }
            int r4 = r4 + 1
            goto L_0x00e7
        L_0x00f4:
            r3.close()     // Catch:{ IOException -> 0x00f8 }
            goto L_0x00fc
        L_0x00f8:
            r2 = move-exception
            androidx.camera.core.C1417i2.m5914d(r1, r0, r2)
        L_0x00fc:
            return r11
        L_0x00fd:
            int r11 = r10.f4364b     // Catch:{ IOException -> 0x0181 }
            byte[] r6 = f4362v     // Catch:{ IOException -> 0x0181 }
            int r6 = r6.length     // Catch:{ IOException -> 0x0181 }
            if (r11 < r6) goto L_0x011a
            r11 = r4
        L_0x0105:
            byte[] r6 = f4362v     // Catch:{ IOException -> 0x0181 }
            int r7 = r6.length     // Catch:{ IOException -> 0x0181 }
            if (r11 >= r7) goto L_0x0117
            byte[] r7 = r10.f4366d     // Catch:{ IOException -> 0x0181 }
            byte r7 = r7[r11]     // Catch:{ IOException -> 0x0181 }
            byte r8 = r6[r11]     // Catch:{ IOException -> 0x0181 }
            if (r7 == r8) goto L_0x0114
            r5 = r4
            goto L_0x0117
        L_0x0114:
            int r11 = r11 + 1
            goto L_0x0105
        L_0x0117:
            if (r5 == 0) goto L_0x011a
            int r4 = r6.length     // Catch:{ IOException -> 0x0181 }
        L_0x011a:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0181 }
            r11.<init>()     // Catch:{ IOException -> 0x0181 }
        L_0x011f:
            int r5 = r10.f4364b     // Catch:{ IOException -> 0x0181 }
            if (r4 >= r5) goto L_0x013b
            byte[] r5 = r10.f4366d     // Catch:{ IOException -> 0x0181 }
            byte r5 = r5[r4]     // Catch:{ IOException -> 0x0181 }
            if (r5 != 0) goto L_0x012a
            goto L_0x013b
        L_0x012a:
            r6 = 32
            if (r5 < r6) goto L_0x0133
            char r5 = (char) r5     // Catch:{ IOException -> 0x0181 }
            r11.append(r5)     // Catch:{ IOException -> 0x0181 }
            goto L_0x0138
        L_0x0133:
            r5 = 63
            r11.append(r5)     // Catch:{ IOException -> 0x0181 }
        L_0x0138:
            int r4 = r4 + 1
            goto L_0x011f
        L_0x013b:
            java.lang.String r11 = r11.toString()     // Catch:{ IOException -> 0x0181 }
            r3.close()     // Catch:{ IOException -> 0x0143 }
            goto L_0x0147
        L_0x0143:
            r2 = move-exception
            androidx.camera.core.C1417i2.m5914d(r1, r0, r2)
        L_0x0147:
            return r11
        L_0x0148:
            byte[] r11 = r10.f4366d     // Catch:{ IOException -> 0x0181 }
            int r6 = r11.length     // Catch:{ IOException -> 0x0181 }
            if (r6 != r5) goto L_0x0168
            byte r6 = r11[r4]     // Catch:{ IOException -> 0x0181 }
            if (r6 < 0) goto L_0x0168
            if (r6 > r5) goto L_0x0168
            java.lang.String r11 = new java.lang.String     // Catch:{ IOException -> 0x0181 }
            char[] r5 = new char[r5]     // Catch:{ IOException -> 0x0181 }
            int r6 = r6 + 48
            char r6 = (char) r6     // Catch:{ IOException -> 0x0181 }
            r5[r4] = r6     // Catch:{ IOException -> 0x0181 }
            r11.<init>(r5)     // Catch:{ IOException -> 0x0181 }
            r3.close()     // Catch:{ IOException -> 0x0163 }
            goto L_0x0167
        L_0x0163:
            r2 = move-exception
            androidx.camera.core.C1417i2.m5914d(r1, r0, r2)
        L_0x0167:
            return r11
        L_0x0168:
            java.lang.String r4 = new java.lang.String     // Catch:{ IOException -> 0x0181 }
            java.nio.charset.Charset r5 = f4347g     // Catch:{ IOException -> 0x0181 }
            r4.<init>(r11, r5)     // Catch:{ IOException -> 0x0181 }
            r3.close()     // Catch:{ IOException -> 0x0173 }
            goto L_0x0177
        L_0x0173:
            r11 = move-exception
            androidx.camera.core.C1417i2.m5914d(r1, r0, r11)
        L_0x0177:
            return r4
        L_0x0178:
            r3.close()     // Catch:{ IOException -> 0x017c }
            goto L_0x0180
        L_0x017c:
            r11 = move-exception
            androidx.camera.core.C1417i2.m5914d(r1, r0, r11)
        L_0x0180:
            return r2
        L_0x0181:
            r11 = move-exception
            goto L_0x0187
        L_0x0183:
            r11 = move-exception
            goto L_0x0199
        L_0x0185:
            r11 = move-exception
            r3 = r2
        L_0x0187:
            java.lang.String r4 = "IOException occurred during reading a value"
            androidx.camera.core.C1417i2.m5925o(r1, r4, r11)     // Catch:{ all -> 0x0197 }
            if (r3 == 0) goto L_0x0196
            r3.close()     // Catch:{ IOException -> 0x0192 }
            goto L_0x0196
        L_0x0192:
            r11 = move-exception
            androidx.camera.core.C1417i2.m5914d(r1, r0, r11)
        L_0x0196:
            return r2
        L_0x0197:
            r11 = move-exception
            r2 = r3
        L_0x0199:
            if (r2 == 0) goto L_0x01a3
            r2.close()     // Catch:{ IOException -> 0x019f }
            goto L_0x01a3
        L_0x019f:
            r2 = move-exception
            androidx.camera.core.C1417i2.m5914d(r1, r0, r2)
        L_0x01a3:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.utils.C1522e.mo5431r(java.nio.ByteOrder):java.lang.Object");
    }

    /* renamed from: s */
    public int mo5432s() {
        return f4361u[this.f4363a] * this.f4364b;
    }

    public String toString() {
        return "(" + f4360t[this.f4363a] + ", data length:" + this.f4366d.length + ")";
    }

    public C1522e(int i, int i2, long j, byte[] bArr) {
        this.f4363a = i;
        this.f4364b = i2;
        this.f4365c = j;
        this.f4366d = bArr;
    }
}

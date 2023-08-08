package okio.internal;

import java.io.EOFException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11600b;
import okio.ByteString;
import okio.C12465c0;
import okio.C12471f0;
import okio.C12476h0;
import okio.C12487j;
import okio.C12495k0;
import okio.C12500m;
import okio.C12506n0;
import okio.C12507o;
import okio.C12516r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: okio.internal.d */
public final class C12484d {
    @C12579k
    /* renamed from: A */
    public static final String m50691A(@C12579k C12495k0 k0Var, long j) {
        Intrinsics.checkNotNullParameter(k0Var, "$this$commonReadUtf8");
        k0Var.mo27293f2(j);
        return k0Var.f30450a.mo27300n2(j);
    }

    /* renamed from: B */
    public static final int m50692B(@C12579k C12495k0 k0Var) {
        Intrinsics.checkNotNullParameter(k0Var, "$this$commonReadUtf8CodePoint");
        k0Var.mo27293f2(1);
        byte D = k0Var.f30450a.mo27330D(0);
        if ((D & 224) == 192) {
            k0Var.mo27293f2(2);
        } else if ((D & 240) == 224) {
            k0Var.mo27293f2(3);
        } else if ((D & 248) == 240) {
            k0Var.mo27293f2(4);
        }
        return k0Var.f30450a.mo27298l3();
    }

    @C12580l
    /* renamed from: C */
    public static final String m50693C(@C12579k C12495k0 k0Var) {
        Intrinsics.checkNotNullParameter(k0Var, "$this$commonReadUtf8Line");
        long i2 = k0Var.mo27295i2((byte) 10);
        if (i2 != -1) {
            return C12481a.m50610i0(k0Var.f30450a, i2);
        }
        if (k0Var.f30450a.mo27362c0() != 0) {
            return k0Var.mo27300n2(k0Var.f30450a.mo27362c0());
        }
        return null;
    }

    @C12579k
    /* renamed from: D */
    public static final String m50694D(@C12579k C12495k0 k0Var, long j) {
        boolean z;
        long j2;
        Intrinsics.checkNotNullParameter(k0Var, "$this$commonReadUtf8LineStrict");
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (j == Long.MAX_VALUE) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = j + 1;
            }
            byte b = (byte) 10;
            long V0 = k0Var.mo27285V0(b, 0, j2);
            if (V0 != -1) {
                return C12481a.m50610i0(k0Var.f30450a, V0);
            }
            if (j2 < Long.MAX_VALUE && k0Var.mo27269E1(j2) && k0Var.f30450a.mo27330D(j2 - 1) == ((byte) 13) && k0Var.mo27269E1(1 + j2) && k0Var.f30450a.mo27330D(j2) == b) {
                return C12481a.m50610i0(k0Var.f30450a, j2);
            }
            C12500m mVar = new C12500m();
            C12500m mVar2 = k0Var.f30450a;
            mVar2.mo27383s(mVar, 0, Math.min((long) 32, mVar2.mo27362c0()));
            throw new EOFException("\\n not found: limit=" + Math.min(k0Var.f30450a.mo27362c0(), j) + " content=" + mVar.mo27301n3().mo27150t0() + "…");
        }
        throw new IllegalArgumentException(("limit < 0: " + j).toString());
    }

    /* renamed from: E */
    public static final boolean m50695E(@C12579k C12495k0 k0Var, long j) {
        boolean z;
        Intrinsics.checkNotNullParameter(k0Var, "$this$commonRequest");
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        } else if (!k0Var.f30451b) {
            while (k0Var.f30450a.mo27362c0() < j) {
                if (k0Var.f30452c.read(k0Var.f30450a, (long) 8192) == -1) {
                    return false;
                }
            }
            return true;
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    /* renamed from: F */
    public static final void m50696F(@C12579k C12495k0 k0Var, long j) {
        Intrinsics.checkNotNullParameter(k0Var, "$this$commonRequire");
        if (!k0Var.mo27269E1(j)) {
            throw new EOFException();
        }
    }

    /* renamed from: G */
    public static final int m50697G(@C12579k C12495k0 k0Var, @C12579k C12471f0 f0Var) {
        Intrinsics.checkNotNullParameter(k0Var, "$this$commonSelect");
        Intrinsics.checkNotNullParameter(f0Var, "options");
        if (!k0Var.f30451b) {
            do {
                int k0 = C12481a.m50614k0(k0Var.f30450a, f0Var, true);
                if (k0 != -2) {
                    if (k0 == -1) {
                        return -1;
                    }
                    k0Var.f30450a.skip((long) f0Var.mo27195q()[k0].size());
                    return k0;
                }
            } while (k0Var.f30452c.read(k0Var.f30450a, (long) 8192) != -1);
            return -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: H */
    public static final void m50698H(@C12579k C12495k0 k0Var, long j) {
        Intrinsics.checkNotNullParameter(k0Var, "$this$commonSkip");
        if (!k0Var.f30451b) {
            while (j > 0) {
                if (k0Var.f30450a.mo27362c0() == 0 && k0Var.f30452c.read(k0Var.f30450a, (long) 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, k0Var.f30450a.mo27362c0());
                k0Var.f30450a.skip(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @C12579k
    /* renamed from: I */
    public static final C12516r0 m50699I(@C12579k C12495k0 k0Var) {
        Intrinsics.checkNotNullParameter(k0Var, "$this$commonTimeout");
        return k0Var.f30452c.timeout();
    }

    @C12579k
    /* renamed from: J */
    public static final String m50700J(@C12579k C12495k0 k0Var) {
        Intrinsics.checkNotNullParameter(k0Var, "$this$commonToString");
        return "buffer(" + k0Var.f30452c + ')';
    }

    /* renamed from: a */
    public static final void m50701a(@C12579k C12495k0 k0Var) {
        Intrinsics.checkNotNullParameter(k0Var, "$this$commonClose");
        if (!k0Var.f30451b) {
            k0Var.f30451b = true;
            k0Var.f30452c.close();
            k0Var.f30450a.mo27367f();
        }
    }

    /* renamed from: b */
    public static final boolean m50702b(@C12579k C12495k0 k0Var) {
        Intrinsics.checkNotNullParameter(k0Var, "$this$commonExhausted");
        if (!(!k0Var.f30451b)) {
            throw new IllegalStateException("closed".toString());
        } else if (!k0Var.f30450a.mo27275J2() || k0Var.f30452c.read(k0Var.f30450a, (long) 8192) != -1) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: c */
    public static final long m50703c(@C12579k C12495k0 k0Var, byte b, long j, long j2) {
        Intrinsics.checkNotNullParameter(k0Var, "$this$commonIndexOf");
        boolean z = true;
        if (!k0Var.f30451b) {
            if (0 > j || j2 < j) {
                z = false;
            }
            if (z) {
                while (j < j2) {
                    long V0 = k0Var.f30450a.mo27285V0(b, j, j2);
                    if (V0 == -1) {
                        long c0 = k0Var.f30450a.mo27362c0();
                        if (c0 >= j2 || k0Var.f30452c.read(k0Var.f30450a, (long) 8192) == -1) {
                            break;
                        }
                        j = Math.max(j, c0);
                    } else {
                        return V0;
                    }
                }
                return -1;
            }
            throw new IllegalArgumentException(("fromIndex=" + j + " toIndex=" + j2).toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: d */
    public static final long m50704d(@C12579k C12495k0 k0Var, @C12579k ByteString byteString, long j) {
        Intrinsics.checkNotNullParameter(k0Var, "$this$commonIndexOf");
        Intrinsics.checkNotNullParameter(byteString, "bytes");
        if (!k0Var.f30451b) {
            while (true) {
                long m0 = k0Var.f30450a.mo27299m0(byteString, j);
                if (m0 != -1) {
                    return m0;
                }
                long c0 = k0Var.f30450a.mo27362c0();
                if (k0Var.f30452c.read(k0Var.f30450a, (long) 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, (c0 - ((long) byteString.size())) + 1);
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    /* renamed from: e */
    public static final long m50705e(@C12579k C12495k0 k0Var, @C12579k ByteString byteString, long j) {
        Intrinsics.checkNotNullParameter(k0Var, "$this$commonIndexOfElement");
        Intrinsics.checkNotNullParameter(byteString, "targetBytes");
        if (!k0Var.f30451b) {
            while (true) {
                long d2 = k0Var.f30450a.mo27291d2(byteString, j);
                if (d2 != -1) {
                    return d2;
                }
                long c0 = k0Var.f30450a.mo27362c0();
                if (k0Var.f30452c.read(k0Var.f30450a, (long) 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, c0);
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    @C12579k
    /* renamed from: f */
    public static final C12507o m50706f(@C12579k C12495k0 k0Var) {
        Intrinsics.checkNotNullParameter(k0Var, "$this$commonPeek");
        return C12465c0.m50481d(new C12476h0(k0Var));
    }

    /* renamed from: g */
    public static final boolean m50707g(@C12579k C12495k0 k0Var, long j, @C12579k ByteString byteString, int i, int i2) {
        Intrinsics.checkNotNullParameter(k0Var, "$this$commonRangeEquals");
        Intrinsics.checkNotNullParameter(byteString, "bytes");
        if (!(!k0Var.f30451b)) {
            throw new IllegalStateException("closed".toString());
        } else if (j < 0 || i < 0 || i2 < 0 || byteString.size() - i < i2) {
            return false;
        } else {
            for (int i3 = 0; i3 < i2; i3++) {
                long j2 = ((long) i3) + j;
                if (!k0Var.mo27269E1(1 + j2) || k0Var.f30450a.mo27330D(j2) != byteString.mo27126f0(i + i3)) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: h */
    public static final int m50708h(@C12579k C12495k0 k0Var, @C12579k byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(k0Var, "$this$commonRead");
        Intrinsics.checkNotNullParameter(bArr, "sink");
        long j = (long) i2;
        C12487j.m50748e((long) bArr.length, (long) i, j);
        if (k0Var.f30450a.mo27362c0() == 0 && k0Var.f30452c.read(k0Var.f30450a, (long) 8192) == -1) {
            return -1;
        }
        return k0Var.f30450a.read(bArr, i, (int) Math.min(j, k0Var.f30450a.mo27362c0()));
    }

    /* renamed from: i */
    public static final long m50709i(@C12579k C12495k0 k0Var, @C12579k C12500m mVar, long j) {
        boolean z;
        Intrinsics.checkNotNullParameter(k0Var, "$this$commonRead");
        Intrinsics.checkNotNullParameter(mVar, "sink");
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        } else if (!(!k0Var.f30451b)) {
            throw new IllegalStateException("closed".toString());
        } else if (k0Var.f30450a.mo27362c0() == 0 && k0Var.f30452c.read(k0Var.f30450a, (long) 8192) == -1) {
            return -1;
        } else {
            return k0Var.f30450a.read(mVar, Math.min(j, k0Var.f30450a.mo27362c0()));
        }
    }

    /* renamed from: j */
    public static final long m50710j(@C12579k C12495k0 k0Var, @C12579k C12506n0 n0Var) {
        Intrinsics.checkNotNullParameter(k0Var, "$this$commonReadAll");
        Intrinsics.checkNotNullParameter(n0Var, "sink");
        long j = 0;
        while (k0Var.f30452c.read(k0Var.f30450a, (long) 8192) != -1) {
            long j2 = k0Var.f30450a.mo27373j();
            if (j2 > 0) {
                j += j2;
                n0Var.write(k0Var.f30450a, j2);
            }
        }
        if (k0Var.f30450a.mo27362c0() <= 0) {
            return j;
        }
        long c0 = j + k0Var.f30450a.mo27362c0();
        C12500m mVar = k0Var.f30450a;
        n0Var.write(mVar, mVar.mo27362c0());
        return c0;
    }

    /* renamed from: k */
    public static final byte m50711k(@C12579k C12495k0 k0Var) {
        Intrinsics.checkNotNullParameter(k0Var, "$this$commonReadByte");
        k0Var.mo27293f2(1);
        return k0Var.f30450a.readByte();
    }

    @C12579k
    /* renamed from: l */
    public static final byte[] m50712l(@C12579k C12495k0 k0Var) {
        Intrinsics.checkNotNullParameter(k0Var, "$this$commonReadByteArray");
        k0Var.f30450a.mo27245x1(k0Var.f30452c);
        return k0Var.f30450a.mo27271G2();
    }

    @C12579k
    /* renamed from: m */
    public static final byte[] m50713m(@C12579k C12495k0 k0Var, long j) {
        Intrinsics.checkNotNullParameter(k0Var, "$this$commonReadByteArray");
        k0Var.mo27293f2(j);
        return k0Var.f30450a.mo27278O1(j);
    }

    @C12579k
    /* renamed from: n */
    public static final ByteString m50714n(@C12579k C12495k0 k0Var) {
        Intrinsics.checkNotNullParameter(k0Var, "$this$commonReadByteString");
        k0Var.f30450a.mo27245x1(k0Var.f30452c);
        return k0Var.f30450a.mo27301n3();
    }

    @C12579k
    /* renamed from: o */
    public static final ByteString m50715o(@C12579k C12495k0 k0Var, long j) {
        Intrinsics.checkNotNullParameter(k0Var, "$this$commonReadByteString");
        k0Var.mo27293f2(j);
        return k0Var.f30450a.mo27312t2(j);
    }

    /* renamed from: p */
    public static final long m50716p(@C12579k C12495k0 k0Var) {
        int i;
        Intrinsics.checkNotNullParameter(k0Var, "$this$commonReadDecimalLong");
        k0Var.mo27293f2(1);
        long j = 0;
        while (true) {
            long j2 = j + 1;
            if (!k0Var.mo27269E1(j2)) {
                break;
            }
            byte D = k0Var.f30450a.mo27330D(j);
            if ((D >= ((byte) 48) && D <= ((byte) 57)) || (j == 0 && D == ((byte) 45))) {
                j = j2;
            } else if (i == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Expected leading [0-9] or '-' character but was 0x");
                String num = Integer.toString(D, C11600b.m45172a(C11600b.m45172a(16)));
                Intrinsics.checkNotNullExpressionValue(num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
                sb.append(num);
                throw new NumberFormatException(sb.toString());
            }
        }
        return k0Var.f30450a.mo27279O2();
    }

    /* renamed from: q */
    public static final void m50717q(@C12579k C12495k0 k0Var, @C12579k C12500m mVar, long j) {
        Intrinsics.checkNotNullParameter(k0Var, "$this$commonReadFully");
        Intrinsics.checkNotNullParameter(mVar, "sink");
        try {
            k0Var.mo27293f2(j);
            k0Var.f30450a.mo27283T0(mVar, j);
        } catch (EOFException e) {
            mVar.mo27245x1(k0Var.f30450a);
            throw e;
        }
    }

    /* renamed from: r */
    public static final void m50718r(@C12579k C12495k0 k0Var, @C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(k0Var, "$this$commonReadFully");
        Intrinsics.checkNotNullParameter(bArr, "sink");
        try {
            k0Var.mo27293f2((long) bArr.length);
            k0Var.f30450a.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (k0Var.f30450a.mo27362c0() > 0) {
                C12500m mVar = k0Var.f30450a;
                int read = mVar.read(bArr, i, (int) mVar.mo27362c0());
                if (read != -1) {
                    i += read;
                } else {
                    throw new AssertionError();
                }
            }
            throw e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003f  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long m50719s(@org.jetbrains.annotations.C12579k okio.C12495k0 r5) {
        /*
            java.lang.String r0 = "$this$commonReadHexadecimalUnsignedLong"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 1
            r5.mo27293f2(r0)
            r0 = 0
        L_0x000b:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r5.mo27269E1(r2)
            if (r2 == 0) goto L_0x0069
            okio.m r2 = r5.f30450a
            long r3 = (long) r0
            byte r2 = r2.mo27330D(r3)
            r3 = 48
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x0025
            r3 = 57
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x003a
        L_0x0025:
            r3 = 97
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x002f
            r3 = 102(0x66, float:1.43E-43)
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x003a
        L_0x002f:
            r3 = 65
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x003c
            r3 = 70
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r0 = r1
            goto L_0x000b
        L_0x003c:
            if (r0 == 0) goto L_0x003f
            goto L_0x0069
        L_0x003f:
            java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            r0.append(r1)
            r1 = 16
            int r1 = kotlin.text.C11600b.m45172a(r1)
            int r1 = kotlin.text.C11600b.m45172a(r1)
            java.lang.String r1 = java.lang.Integer.toString(r2, r1)
            java.lang.String r2 = "java.lang.Integer.toStri…(this, checkRadix(radix))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L_0x0069:
            okio.m r5 = r5.f30450a
            long r0 = r5.mo27288X3()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.C12484d.m50719s(okio.k0):long");
    }

    /* renamed from: t */
    public static final int m50720t(@C12579k C12495k0 k0Var) {
        Intrinsics.checkNotNullParameter(k0Var, "$this$commonReadInt");
        k0Var.mo27293f2(4);
        return k0Var.f30450a.readInt();
    }

    /* renamed from: u */
    public static final int m50721u(@C12579k C12495k0 k0Var) {
        Intrinsics.checkNotNullParameter(k0Var, "$this$commonReadIntLe");
        k0Var.mo27293f2(4);
        return k0Var.f30450a.mo27314y3();
    }

    /* renamed from: v */
    public static final long m50722v(@C12579k C12495k0 k0Var) {
        Intrinsics.checkNotNullParameter(k0Var, "$this$commonReadLong");
        k0Var.mo27293f2(8);
        return k0Var.f30450a.readLong();
    }

    /* renamed from: w */
    public static final long m50723w(@C12579k C12495k0 k0Var) {
        Intrinsics.checkNotNullParameter(k0Var, "$this$commonReadLongLe");
        k0Var.mo27293f2(8);
        return k0Var.f30450a.mo27284U1();
    }

    /* renamed from: x */
    public static final short m50724x(@C12579k C12495k0 k0Var) {
        Intrinsics.checkNotNullParameter(k0Var, "$this$commonReadShort");
        k0Var.mo27293f2(2);
        return k0Var.f30450a.readShort();
    }

    /* renamed from: y */
    public static final short m50725y(@C12579k C12495k0 k0Var) {
        Intrinsics.checkNotNullParameter(k0Var, "$this$commonReadShortLe");
        k0Var.mo27293f2(2);
        return k0Var.f30450a.mo27280R1();
    }

    @C12579k
    /* renamed from: z */
    public static final String m50726z(@C12579k C12495k0 k0Var) {
        Intrinsics.checkNotNullParameter(k0Var, "$this$commonReadUtf8");
        k0Var.f30450a.mo27245x1(k0Var.f30452c);
        return k0Var.f30450a.mo27268B3();
    }
}

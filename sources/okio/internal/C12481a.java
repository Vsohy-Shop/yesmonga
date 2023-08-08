package okio.internal;

import androidx.constraintlayout.core.motion.utils.C16717v;
import androidx.exifinterface.media.C19135a;
import com.contentsquare.android.api.C14092c;
import com.google.android.material.slider.C31570c;
import com.urbanairship.push.notifications.C9527p;
import java.io.EOFException;
import kotlin.collections.C10956m;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11354n;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11626x;
import okhttp3.internal.connection.RealConnection;
import okio.ByteString;
import okio.C12471f0;
import okio.C12477i;
import okio.C12487j;
import okio.C12498l0;
import okio.C12500m;
import okio.C12504m0;
import okio.C12506n0;
import okio.C12510p0;
import okio.C12520s0;
import okio.SegmentedByteString;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.joda.time.DateTimeFieldType;

/* renamed from: okio.internal.a */
public final class C12481a {
    @C12579k

    /* renamed from: a */
    public static final byte[] f30437a = C12477i.m50546a("0123456789abcdef");

    /* renamed from: b */
    public static final int f30438b = 4096;

    /* renamed from: c */
    public static final long f30439c = -922337203685477580L;

    /* renamed from: d */
    public static final long f30440d = -7;

    /* renamed from: A */
    public static final void m50567A(@C12579k C12500m mVar, @C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(mVar, "$this$commonReadFully");
        Intrinsics.checkNotNullParameter(bArr, "sink");
        int i = 0;
        while (i < bArr.length) {
            int read = mVar.read(bArr, i, bArr.length - i);
            if (read != -1) {
                i += read;
            } else {
                throw new EOFException();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x009f A[EDGE_INSN: B:44:0x009f->B:28:0x009f ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x001f  */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long m50568B(@org.jetbrains.annotations.C12579k okio.C12500m r14) {
        /*
            java.lang.String r0 = "$this$commonReadHexadecimalUnsignedLong"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            long r0 = r14.mo27362c0()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x00bd
            r0 = 0
            r1 = r0
            r4 = r2
        L_0x0012:
            okio.l0 r6 = r14.f30464a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            byte[] r7 = r6.f30457a
            int r8 = r6.f30458b
            int r9 = r6.f30459c
        L_0x001d:
            if (r8 >= r9) goto L_0x009f
            byte r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x002e
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x002e
            int r11 = r10 - r11
            goto L_0x0048
        L_0x002e:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x003d
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x003d
        L_0x0038:
            int r11 = r10 - r11
            int r11 = r11 + 10
            goto L_0x0048
        L_0x003d:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0080
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0080
            goto L_0x0038
        L_0x0048:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L_0x0058
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L_0x001d
        L_0x0058:
            okio.m r14 = new okio.m
            r14.<init>()
            okio.m r14 = r14.mo27237m3(r4)
            okio.m r14 = r14.mo27225K2(r10)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Number too large: "
            r1.append(r2)
            java.lang.String r14 = r14.mo27268B3()
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            r0.<init>(r14)
            throw r0
        L_0x0080:
            if (r0 == 0) goto L_0x0084
            r1 = 1
            goto L_0x009f
        L_0x0084:
            java.lang.NumberFormatException r14 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            r0.append(r1)
            java.lang.String r1 = okio.C12487j.m50758o(r10)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
        L_0x009f:
            if (r8 != r9) goto L_0x00ab
            okio.l0 r7 = r6.mo27321b()
            r14.f30464a = r7
            okio.C12504m0.m50967d(r6)
            goto L_0x00ad
        L_0x00ab:
            r6.f30458b = r8
        L_0x00ad:
            if (r1 != 0) goto L_0x00b3
            okio.l0 r6 = r14.f30464a
            if (r6 != 0) goto L_0x0012
        L_0x00b3:
            long r1 = r14.mo27362c0()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.mo27354V(r1)
            return r4
        L_0x00bd:
            java.io.EOFException r14 = new java.io.EOFException
            r14.<init>()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.C12481a.m50568B(okio.m):long");
    }

    /* renamed from: C */
    public static final int m50569C(@C12579k C12500m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "$this$commonReadInt");
        if (mVar.mo27362c0() >= 4) {
            C12498l0 l0Var = mVar.f30464a;
            Intrinsics.checkNotNull(l0Var);
            int i = l0Var.f30458b;
            int i2 = l0Var.f30459c;
            if (((long) (i2 - i)) < 4) {
                return (mVar.readByte() & 255) | ((mVar.readByte() & 255) << 24) | ((mVar.readByte() & 255) << DateTimeFieldType.f30603E0) | ((mVar.readByte() & 255) << 8);
            }
            byte[] bArr = l0Var.f30457a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << DateTimeFieldType.f30603E0);
            int i5 = i4 + 1;
            byte b2 = b | ((bArr[i4] & 255) << 8);
            int i6 = i5 + 1;
            byte b3 = b2 | (bArr[i5] & 255);
            mVar.mo27354V(mVar.mo27362c0() - 4);
            if (i6 == i2) {
                mVar.f30464a = l0Var.mo27321b();
                C12504m0.m50967d(l0Var);
            } else {
                l0Var.f30458b = i6;
            }
            return b3;
        }
        throw new EOFException();
    }

    /* renamed from: D */
    public static final long m50570D(@C12579k C12500m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "$this$commonReadLong");
        if (mVar.mo27362c0() >= 8) {
            C12498l0 l0Var = mVar.f30464a;
            Intrinsics.checkNotNull(l0Var);
            int i = l0Var.f30458b;
            int i2 = l0Var.f30459c;
            if (((long) (i2 - i)) < 8) {
                return ((((long) mVar.readInt()) & 4294967295L) << 32) | (4294967295L & ((long) mVar.readInt()));
            }
            byte[] bArr = l0Var.f30457a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = i4 + 1;
            int i6 = i5 + 1;
            int i7 = i6 + 1;
            int i8 = i7 + 1;
            long j = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i3]) & 255) << 48) | ((((long) bArr[i4]) & 255) << 40) | ((((long) bArr[i5]) & 255) << 32) | ((((long) bArr[i6]) & 255) << 24) | ((((long) bArr[i7]) & 255) << 16);
            int i9 = i8 + 1;
            int i10 = i9 + 1;
            long j2 = j | ((((long) bArr[i8]) & 255) << 8) | (((long) bArr[i9]) & 255);
            mVar.mo27354V(mVar.mo27362c0() - 8);
            if (i10 == i2) {
                mVar.f30464a = l0Var.mo27321b();
                C12504m0.m50967d(l0Var);
            } else {
                l0Var.f30458b = i10;
            }
            return j2;
        }
        throw new EOFException();
    }

    /* renamed from: E */
    public static final short m50571E(@C12579k C12500m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "$this$commonReadShort");
        if (mVar.mo27362c0() >= 2) {
            C12498l0 l0Var = mVar.f30464a;
            Intrinsics.checkNotNull(l0Var);
            int i = l0Var.f30458b;
            int i2 = l0Var.f30459c;
            if (i2 - i < 2) {
                return (short) ((mVar.readByte() & 255) | ((mVar.readByte() & 255) << 8));
            }
            byte[] bArr = l0Var.f30457a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            mVar.mo27354V(mVar.mo27362c0() - 2);
            if (i4 == i2) {
                mVar.f30464a = l0Var.mo27321b();
                C12504m0.m50967d(l0Var);
            } else {
                l0Var.f30458b = i4;
            }
            return (short) b;
        }
        throw new EOFException();
    }

    @C12579k
    /* renamed from: F */
    public static final C12500m.C12501a m50572F(@C12579k C12500m mVar, @C12579k C12500m.C12501a aVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(mVar, "$this$commonReadUnsafe");
        Intrinsics.checkNotNullParameter(aVar, "unsafeCursor");
        if (aVar.f30466a == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            aVar.f30466a = mVar;
            aVar.f30467b = false;
            return aVar;
        }
        throw new IllegalStateException("already attached to a buffer".toString());
    }

    @C12579k
    /* renamed from: G */
    public static final String m50573G(@C12579k C12500m mVar, long j) {
        boolean z;
        Intrinsics.checkNotNullParameter(mVar, "$this$commonReadUtf8");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0 || j > ((long) Integer.MAX_VALUE)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        } else if (mVar.mo27362c0() < j) {
            throw new EOFException();
        } else if (i == 0) {
            return "";
        } else {
            C12498l0 l0Var = mVar.f30464a;
            Intrinsics.checkNotNull(l0Var);
            int i2 = l0Var.f30458b;
            if (((long) i2) + j > ((long) l0Var.f30459c)) {
                return C12486f.m50743c(mVar.mo27278O1(j), 0, 0, 3, (Object) null);
            }
            int i3 = (int) j;
            String b = C12486f.m50742b(l0Var.f30457a, i2, i2 + i3);
            l0Var.f30458b += i3;
            mVar.mo27354V(mVar.mo27362c0() - j);
            if (l0Var.f30458b == l0Var.f30459c) {
                mVar.f30464a = l0Var.mo27321b();
                C12504m0.m50967d(l0Var);
            }
            return b;
        }
    }

    /* renamed from: H */
    public static final int m50574H(@C12579k C12500m mVar) {
        byte b;
        int i;
        byte b2;
        Intrinsics.checkNotNullParameter(mVar, "$this$commonReadUtf8CodePoint");
        if (mVar.mo27362c0() != 0) {
            byte D = mVar.mo27330D(0);
            int i2 = 1;
            if ((D & C11354n.f28471b) == 0) {
                b2 = D & Byte.MAX_VALUE;
                b = 0;
                i = 1;
            } else if ((D & 224) == 192) {
                b2 = D & 31;
                i = 2;
                b = 128;
            } else if ((D & 240) == 224) {
                b2 = D & DateTimeFieldType.f30626Z;
                i = 3;
                b = 2048;
            } else if ((D & 248) == 240) {
                b2 = D & 7;
                i = 4;
                b = 65536;
            } else {
                mVar.skip(1);
                return C12520s0.f30504c;
            }
            long j = (long) i;
            if (mVar.mo27362c0() >= j) {
                while (i2 < i) {
                    long j2 = (long) i2;
                    byte D2 = mVar.mo27330D(j2);
                    if ((D2 & C19135a.f49026p7) == 128) {
                        b2 = (b2 << 6) | (D2 & C12520s0.f30502a);
                        i2++;
                    } else {
                        mVar.skip(j2);
                        return C12520s0.f30504c;
                    }
                }
                mVar.skip(j);
                if (b2 > 1114111) {
                    return C12520s0.f30504c;
                }
                if ((55296 <= b2 && 57343 >= b2) || b2 < b) {
                    return C12520s0.f30504c;
                }
                return b2;
            }
            throw new EOFException("size < " + i + ": " + mVar.mo27362c0() + " (to read code point prefixed 0x" + C12487j.m50758o(D) + ')');
        }
        throw new EOFException();
    }

    @C12580l
    /* renamed from: I */
    public static final String m50575I(@C12579k C12500m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "$this$commonReadUtf8Line");
        long i2 = mVar.mo27295i2((byte) 10);
        if (i2 != -1) {
            return m50610i0(mVar, i2);
        }
        if (mVar.mo27362c0() != 0) {
            return mVar.mo27300n2(mVar.mo27362c0());
        }
        return null;
    }

    @C12579k
    /* renamed from: J */
    public static final String m50576J(@C12579k C12500m mVar, long j) {
        boolean z;
        Intrinsics.checkNotNullParameter(mVar, "$this$commonReadUtf8LineStrict");
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            byte b = (byte) 10;
            long V0 = mVar.mo27285V0(b, 0, j2);
            if (V0 != -1) {
                return m50610i0(mVar, V0);
            }
            if (j2 < mVar.mo27362c0() && mVar.mo27330D(j2 - 1) == ((byte) 13) && mVar.mo27330D(j2) == b) {
                return m50610i0(mVar, j2);
            }
            C12500m mVar2 = new C12500m();
            mVar.mo27383s(mVar2, 0, Math.min((long) 32, mVar.mo27362c0()));
            throw new EOFException("\\n not found: limit=" + Math.min(mVar.mo27362c0(), j) + " content=" + mVar2.mo27301n3().mo27150t0() + C11626x.f28899F);
        }
        throw new IllegalArgumentException(("limit < 0: " + j).toString());
    }

    /* renamed from: K */
    public static final long m50577K(@C12579k C12500m.C12501a aVar, long j) {
        boolean z;
        C12500m.C12501a aVar2 = aVar;
        long j2 = j;
        Intrinsics.checkNotNullParameter(aVar2, "$this$commonResizeBuffer");
        C12500m mVar = aVar2.f30466a;
        if (mVar == null) {
            throw new IllegalStateException("not attached to a buffer".toString());
        } else if (aVar2.f30467b) {
            long c0 = mVar.mo27362c0();
            int i = (j2 > c0 ? 1 : (j2 == c0 ? 0 : -1));
            int i2 = 1;
            if (i <= 0) {
                if (j2 >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    long j3 = c0 - j2;
                    while (true) {
                        if (j3 <= 0) {
                            break;
                        }
                        C12498l0 l0Var = mVar.f30464a;
                        Intrinsics.checkNotNull(l0Var);
                        C12498l0 l0Var2 = l0Var.f30463g;
                        Intrinsics.checkNotNull(l0Var2);
                        int i3 = l0Var2.f30459c;
                        long j4 = (long) (i3 - l0Var2.f30458b);
                        if (j4 > j3) {
                            l0Var2.f30459c = i3 - ((int) j3);
                            break;
                        }
                        mVar.f30464a = l0Var2.mo27321b();
                        C12504m0.m50967d(l0Var2);
                        j3 -= j4;
                    }
                    aVar2.mo27396g((C12498l0) null);
                    aVar2.f30469d = j2;
                    aVar2.f30470e = null;
                    aVar2.f30471f = -1;
                    aVar2.f30472g = -1;
                } else {
                    throw new IllegalArgumentException(("newSize < 0: " + j2).toString());
                }
            } else if (i > 0) {
                long j5 = j2 - c0;
                boolean z2 = true;
                while (j5 > 0) {
                    C12498l0 q0 = mVar.mo27380q0(i2);
                    int min = (int) Math.min(j5, (long) (8192 - q0.f30459c));
                    q0.f30459c += min;
                    j5 -= (long) min;
                    if (z2) {
                        aVar2.mo27396g(q0);
                        aVar2.f30469d = c0;
                        aVar2.f30470e = q0.f30457a;
                        int i4 = q0.f30459c;
                        aVar2.f30471f = i4 - min;
                        aVar2.f30472g = i4;
                        z2 = false;
                    }
                    i2 = 1;
                }
            }
            mVar.mo27354V(j2);
            return c0;
        } else {
            throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
        }
    }

    /* renamed from: L */
    public static final int m50578L(@C12579k C12500m.C12501a aVar, long j) {
        C12498l0 l0Var;
        Intrinsics.checkNotNullParameter(aVar, "$this$commonSeek");
        C12500m mVar = aVar.f30466a;
        if (mVar == null) {
            throw new IllegalStateException("not attached to a buffer".toString());
        } else if (j < ((long) -1) || j > mVar.mo27362c0()) {
            throw new ArrayIndexOutOfBoundsException("offset=" + j + " > size=" + mVar.mo27362c0());
        } else if (j == -1 || j == mVar.mo27362c0()) {
            aVar.mo27396g((C12498l0) null);
            aVar.f30469d = j;
            aVar.f30470e = null;
            aVar.f30471f = -1;
            aVar.f30472g = -1;
            return -1;
        } else {
            long c0 = mVar.mo27362c0();
            C12498l0 l0Var2 = mVar.f30464a;
            long j2 = 0;
            if (aVar.mo27391b() != null) {
                long j3 = aVar.f30469d;
                int i = aVar.f30471f;
                C12498l0 b = aVar.mo27391b();
                Intrinsics.checkNotNull(b);
                long j4 = j3 - ((long) (i - b.f30458b));
                if (j4 > j) {
                    l0Var = l0Var2;
                    l0Var2 = aVar.mo27391b();
                    c0 = j4;
                } else {
                    l0Var = aVar.mo27391b();
                    j2 = j4;
                }
            } else {
                l0Var = l0Var2;
            }
            if (c0 - j > j - j2) {
                while (true) {
                    Intrinsics.checkNotNull(l0Var);
                    int i2 = l0Var.f30459c;
                    int i3 = l0Var.f30458b;
                    if (j < ((long) (i2 - i3)) + j2) {
                        break;
                    }
                    j2 += (long) (i2 - i3);
                    l0Var = l0Var.f30462f;
                }
            } else {
                while (c0 > j) {
                    Intrinsics.checkNotNull(l0Var2);
                    l0Var2 = l0Var2.f30463g;
                    Intrinsics.checkNotNull(l0Var2);
                    c0 -= (long) (l0Var2.f30459c - l0Var2.f30458b);
                }
                j2 = c0;
                l0Var = l0Var2;
            }
            if (aVar.f30467b) {
                Intrinsics.checkNotNull(l0Var);
                if (l0Var.f30460d) {
                    C12498l0 f = l0Var.mo27325f();
                    if (mVar.f30464a == l0Var) {
                        mVar.f30464a = f;
                    }
                    l0Var = l0Var.mo27322c(f);
                    C12498l0 l0Var3 = l0Var.f30463g;
                    Intrinsics.checkNotNull(l0Var3);
                    l0Var3.mo27321b();
                }
            }
            aVar.mo27396g(l0Var);
            aVar.f30469d = j;
            Intrinsics.checkNotNull(l0Var);
            aVar.f30470e = l0Var.f30457a;
            int i4 = l0Var.f30458b + ((int) (j - j2));
            aVar.f30471f = i4;
            int i5 = l0Var.f30459c;
            aVar.f30472g = i5;
            return i5 - i4;
        }
    }

    /* renamed from: M */
    public static final int m50579M(@C12579k C12500m mVar, @C12579k C12471f0 f0Var) {
        Intrinsics.checkNotNullParameter(mVar, "$this$commonSelect");
        Intrinsics.checkNotNullParameter(f0Var, "options");
        int l0 = m50616l0(mVar, f0Var, false, 2, (Object) null);
        if (l0 == -1) {
            return -1;
        }
        mVar.skip((long) f0Var.mo27195q()[l0].size());
        return l0;
    }

    /* renamed from: N */
    public static final void m50580N(@C12579k C12500m mVar, long j) {
        Intrinsics.checkNotNullParameter(mVar, "$this$commonSkip");
        while (j > 0) {
            C12498l0 l0Var = mVar.f30464a;
            if (l0Var != null) {
                int min = (int) Math.min(j, (long) (l0Var.f30459c - l0Var.f30458b));
                long j2 = (long) min;
                mVar.mo27354V(mVar.mo27362c0() - j2);
                j -= j2;
                int i = l0Var.f30458b + min;
                l0Var.f30458b = i;
                if (i == l0Var.f30459c) {
                    mVar.f30464a = l0Var.mo27321b();
                    C12504m0.m50967d(l0Var);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    @C12579k
    /* renamed from: O */
    public static final ByteString m50581O(@C12579k C12500m mVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(mVar, "$this$commonSnapshot");
        if (mVar.mo27362c0() <= ((long) Integer.MAX_VALUE)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return mVar.mo27368g0((int) mVar.mo27362c0());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + mVar.mo27362c0()).toString());
    }

    @C12579k
    /* renamed from: P */
    public static final ByteString m50582P(@C12579k C12500m mVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "$this$commonSnapshot");
        if (i == 0) {
            return ByteString.f30387c;
        }
        C12487j.m50748e(mVar.mo27362c0(), 0, (long) i);
        C12498l0 l0Var = mVar.f30464a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Intrinsics.checkNotNull(l0Var);
            int i5 = l0Var.f30459c;
            int i6 = l0Var.f30458b;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                l0Var = l0Var.f30462f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[(i4 * 2)];
        C12498l0 l0Var2 = mVar.f30464a;
        int i7 = 0;
        while (i2 < i) {
            Intrinsics.checkNotNull(l0Var2);
            bArr[i7] = l0Var2.f30457a;
            i2 += l0Var2.f30459c - l0Var2.f30458b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = l0Var2.f30458b;
            l0Var2.f30460d = true;
            i7++;
            l0Var2 = l0Var2.f30462f;
        }
        return new SegmentedByteString(bArr, iArr);
    }

    @C12579k
    /* renamed from: Q */
    public static final C12498l0 m50583Q(@C12579k C12500m mVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "$this$commonWritableSegment");
        boolean z = true;
        if (i < 1 || i > 8192) {
            z = false;
        }
        if (z) {
            C12498l0 l0Var = mVar.f30464a;
            if (l0Var == null) {
                C12498l0 e = C12504m0.m50968e();
                mVar.f30464a = e;
                e.f30463g = e;
                e.f30462f = e;
                return e;
            }
            Intrinsics.checkNotNull(l0Var);
            C12498l0 l0Var2 = l0Var.f30463g;
            Intrinsics.checkNotNull(l0Var2);
            if (l0Var2.f30459c + i > 8192 || !l0Var2.f30461e) {
                return l0Var2.mo27322c(C12504m0.m50968e());
            }
            return l0Var2;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    @C12579k
    /* renamed from: R */
    public static final C12500m m50584R(@C12579k C12500m mVar, @C12579k ByteString byteString, int i, int i2) {
        Intrinsics.checkNotNullParameter(mVar, "$this$commonWrite");
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.mo27154u2(mVar, i, i2);
        return mVar;
    }

    @C12579k
    /* renamed from: S */
    public static final C12500m m50585S(@C12579k C12500m mVar, @C12579k C12510p0 p0Var, long j) {
        Intrinsics.checkNotNullParameter(mVar, "$this$commonWrite");
        Intrinsics.checkNotNullParameter(p0Var, "source");
        while (j > 0) {
            long read = p0Var.read(mVar, j);
            if (read != -1) {
                j -= read;
            } else {
                throw new EOFException();
            }
        }
        return mVar;
    }

    @C12579k
    /* renamed from: T */
    public static final C12500m m50586T(@C12579k C12500m mVar, @C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(mVar, "$this$commonWrite");
        Intrinsics.checkNotNullParameter(bArr, "source");
        return mVar.mo27235k3(bArr, 0, bArr.length);
    }

    @C12579k
    /* renamed from: U */
    public static final C12500m m50587U(@C12579k C12500m mVar, @C12579k byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(mVar, "$this$commonWrite");
        Intrinsics.checkNotNullParameter(bArr, "source");
        long j = (long) i2;
        C12487j.m50748e((long) bArr.length, (long) i, j);
        int i3 = i2 + i;
        while (i < i3) {
            C12498l0 q0 = mVar.mo27380q0(1);
            int min = Math.min(i3 - i, 8192 - q0.f30459c);
            int i4 = i + min;
            C10956m.m41147W0(bArr, q0.f30457a, q0.f30459c, i, i4);
            q0.f30459c += min;
            i = i4;
        }
        mVar.mo27354V(mVar.mo27362c0() + j);
        return mVar;
    }

    /* renamed from: V */
    public static final void m50588V(@C12579k C12500m mVar, @C12579k C12500m mVar2, long j) {
        boolean z;
        C12498l0 l0Var;
        int i;
        Intrinsics.checkNotNullParameter(mVar, "$this$commonWrite");
        Intrinsics.checkNotNullParameter(mVar2, "source");
        if (mVar2 != mVar) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C12487j.m50748e(mVar2.mo27362c0(), 0, j);
            while (j > 0) {
                C12498l0 l0Var2 = mVar2.f30464a;
                Intrinsics.checkNotNull(l0Var2);
                int i2 = l0Var2.f30459c;
                C12498l0 l0Var3 = mVar2.f30464a;
                Intrinsics.checkNotNull(l0Var3);
                if (j < ((long) (i2 - l0Var3.f30458b))) {
                    C12498l0 l0Var4 = mVar.f30464a;
                    if (l0Var4 != null) {
                        Intrinsics.checkNotNull(l0Var4);
                        l0Var = l0Var4.f30463g;
                    } else {
                        l0Var = null;
                    }
                    if (l0Var != null && l0Var.f30461e) {
                        long j2 = ((long) l0Var.f30459c) + j;
                        if (l0Var.f30460d) {
                            i = 0;
                        } else {
                            i = l0Var.f30458b;
                        }
                        if (j2 - ((long) i) <= ((long) 8192)) {
                            C12498l0 l0Var5 = mVar2.f30464a;
                            Intrinsics.checkNotNull(l0Var5);
                            l0Var5.mo27326g(l0Var, (int) j);
                            mVar2.mo27354V(mVar2.mo27362c0() - j);
                            mVar.mo27354V(mVar.mo27362c0() + j);
                            return;
                        }
                    }
                    C12498l0 l0Var6 = mVar2.f30464a;
                    Intrinsics.checkNotNull(l0Var6);
                    mVar2.f30464a = l0Var6.mo27324e((int) j);
                }
                C12498l0 l0Var7 = mVar2.f30464a;
                Intrinsics.checkNotNull(l0Var7);
                long j3 = (long) (l0Var7.f30459c - l0Var7.f30458b);
                mVar2.f30464a = l0Var7.mo27321b();
                C12498l0 l0Var8 = mVar.f30464a;
                if (l0Var8 == null) {
                    mVar.f30464a = l0Var7;
                    l0Var7.f30463g = l0Var7;
                    l0Var7.f30462f = l0Var7;
                } else {
                    Intrinsics.checkNotNull(l0Var8);
                    C12498l0 l0Var9 = l0Var8.f30463g;
                    Intrinsics.checkNotNull(l0Var9);
                    l0Var9.mo27322c(l0Var7).mo27320a();
                }
                mVar2.mo27354V(mVar2.mo27362c0() - j3);
                mVar.mo27354V(mVar.mo27362c0() + j3);
                j -= j3;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    /* renamed from: W */
    public static /* synthetic */ C12500m m50589W(C12500m mVar, ByteString byteString, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = byteString.size();
        }
        Intrinsics.checkNotNullParameter(mVar, "$this$commonWrite");
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.mo27154u2(mVar, i, i2);
        return mVar;
    }

    /* renamed from: X */
    public static final long m50590X(@C12579k C12500m mVar, @C12579k C12510p0 p0Var) {
        Intrinsics.checkNotNullParameter(mVar, "$this$commonWriteAll");
        Intrinsics.checkNotNullParameter(p0Var, "source");
        long j = 0;
        while (true) {
            long read = p0Var.read(mVar, (long) 8192);
            if (read == -1) {
                return j;
            }
            j += read;
        }
    }

    @C12579k
    /* renamed from: Y */
    public static final C12500m m50591Y(@C12579k C12500m mVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "$this$commonWriteByte");
        C12498l0 q0 = mVar.mo27380q0(1);
        byte[] bArr = q0.f30457a;
        int i2 = q0.f30459c;
        q0.f30459c = i2 + 1;
        bArr[i2] = (byte) i;
        mVar.mo27354V(mVar.mo27362c0() + 1);
        return mVar;
    }

    @C12579k
    /* renamed from: Z */
    public static final C12500m m50592Z(@C12579k C12500m mVar, long j) {
        boolean z;
        Intrinsics.checkNotNullParameter(mVar, "$this$commonWriteDecimalLong");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i == 0) {
            return mVar.mo27225K2(48);
        }
        int i2 = 1;
        if (i < 0) {
            j = -j;
            if (j < 0) {
                return mVar.mo27236l1("-9223372036854775808");
            }
            z = true;
        } else {
            z = false;
        }
        if (j < 100000000) {
            if (j < 10000) {
                if (j < 100) {
                    if (j >= 10) {
                        i2 = 2;
                    }
                } else if (j < 1000) {
                    i2 = 3;
                } else {
                    i2 = 4;
                }
            } else if (j < 1000000) {
                if (j < 100000) {
                    i2 = 5;
                } else {
                    i2 = 6;
                }
            } else if (j < 10000000) {
                i2 = 7;
            } else {
                i2 = 8;
            }
        } else if (j < C31570c.f76591e) {
            if (j < RealConnection.IDLE_CONNECTION_HEALTHY_NS) {
                if (j < 1000000000) {
                    i2 = 9;
                } else {
                    i2 = 10;
                }
            } else if (j < 100000000000L) {
                i2 = 11;
            } else {
                i2 = 12;
            }
        } else if (j < 1000000000000000L) {
            if (j < 10000000000000L) {
                i2 = 13;
            } else if (j < 100000000000000L) {
                i2 = 14;
            } else {
                i2 = 15;
            }
        } else if (j < 100000000000000000L) {
            if (j < 10000000000000000L) {
                i2 = 16;
            } else {
                i2 = 17;
            }
        } else if (j < 1000000000000000000L) {
            i2 = 18;
        } else {
            i2 = 19;
        }
        if (z) {
            i2++;
        }
        C12498l0 q0 = mVar.mo27380q0(i2);
        byte[] bArr = q0.f30457a;
        int i3 = q0.f30459c + i2;
        while (j != 0) {
            long j2 = (long) 10;
            i3--;
            bArr[i3] = m50606g0()[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr[i3 - 1] = (byte) 45;
        }
        q0.f30459c += i2;
        mVar.mo27354V(mVar.mo27362c0() + ((long) i2));
        return mVar;
    }

    /* renamed from: a */
    public static final void m50593a(@C12579k C12500m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "$this$commonClear");
        mVar.skip(mVar.mo27362c0());
    }

    @C12579k
    /* renamed from: a0 */
    public static final C12500m m50594a0(@C12579k C12500m mVar, long j) {
        Intrinsics.checkNotNullParameter(mVar, "$this$commonWriteHexadecimalUnsignedLong");
        if (j == 0) {
            return mVar.mo27225K2(48);
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        C12498l0 q0 = mVar.mo27380q0(i);
        byte[] bArr = q0.f30457a;
        int i2 = q0.f30459c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = m50606g0()[(int) (15 & j)];
            j >>>= 4;
        }
        q0.f30459c += i;
        mVar.mo27354V(mVar.mo27362c0() + ((long) i));
        return mVar;
    }

    /* renamed from: b */
    public static final void m50595b(@C12579k C12500m.C12501a aVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(aVar, "$this$commonClose");
        if (aVar.f30466a != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            aVar.f30466a = null;
            aVar.mo27396g((C12498l0) null);
            aVar.f30469d = -1;
            aVar.f30470e = null;
            aVar.f30471f = -1;
            aVar.f30472g = -1;
            return;
        }
        throw new IllegalStateException("not attached to a buffer".toString());
    }

    @C12579k
    /* renamed from: b0 */
    public static final C12500m m50596b0(@C12579k C12500m mVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "$this$commonWriteInt");
        C12498l0 q0 = mVar.mo27380q0(4);
        byte[] bArr = q0.f30457a;
        int i2 = q0.f30459c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        q0.f30459c = i5 + 1;
        mVar.mo27354V(mVar.mo27362c0() + 4);
        return mVar;
    }

    /* renamed from: c */
    public static final long m50597c(@C12579k C12500m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "$this$commonCompleteSegmentByteCount");
        long c0 = mVar.mo27362c0();
        if (c0 == 0) {
            return 0;
        }
        C12498l0 l0Var = mVar.f30464a;
        Intrinsics.checkNotNull(l0Var);
        C12498l0 l0Var2 = l0Var.f30463g;
        Intrinsics.checkNotNull(l0Var2);
        int i = l0Var2.f30459c;
        if (i >= 8192 || !l0Var2.f30461e) {
            return c0;
        }
        return c0 - ((long) (i - l0Var2.f30458b));
    }

    @C12579k
    /* renamed from: c0 */
    public static final C12500m m50598c0(@C12579k C12500m mVar, long j) {
        Intrinsics.checkNotNullParameter(mVar, "$this$commonWriteLong");
        C12498l0 q0 = mVar.mo27380q0(8);
        byte[] bArr = q0.f30457a;
        int i = q0.f30459c;
        int i2 = i + 1;
        bArr[i] = (byte) ((int) ((j >>> 56) & 255));
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((int) ((j >>> 48) & 255));
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((int) ((j >>> 40) & 255));
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((int) ((j >>> 32) & 255));
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((int) ((j >>> 24) & 255));
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((int) ((j >>> 16) & 255));
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((int) ((j >>> 8) & 255));
        bArr[i8] = (byte) ((int) (j & 255));
        q0.f30459c = i8 + 1;
        mVar.mo27354V(mVar.mo27362c0() + 8);
        return mVar;
    }

    @C12579k
    /* renamed from: d */
    public static final C12500m m50599d(@C12579k C12500m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "$this$commonCopy");
        C12500m mVar2 = new C12500m();
        if (mVar.mo27362c0() == 0) {
            return mVar2;
        }
        C12498l0 l0Var = mVar.f30464a;
        Intrinsics.checkNotNull(l0Var);
        C12498l0 d = l0Var.mo27323d();
        mVar2.f30464a = d;
        d.f30463g = d;
        d.f30462f = d;
        for (C12498l0 l0Var2 = l0Var.f30462f; l0Var2 != l0Var; l0Var2 = l0Var2.f30462f) {
            C12498l0 l0Var3 = d.f30463g;
            Intrinsics.checkNotNull(l0Var3);
            Intrinsics.checkNotNull(l0Var2);
            l0Var3.mo27322c(l0Var2.mo27323d());
        }
        mVar2.mo27354V(mVar.mo27362c0());
        return mVar2;
    }

    @C12579k
    /* renamed from: d0 */
    public static final C12500m m50600d0(@C12579k C12500m mVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "$this$commonWriteShort");
        C12498l0 q0 = mVar.mo27380q0(2);
        byte[] bArr = q0.f30457a;
        int i2 = q0.f30459c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        q0.f30459c = i3 + 1;
        mVar.mo27354V(mVar.mo27362c0() + 2);
        return mVar;
    }

    @C12579k
    /* renamed from: e */
    public static final C12500m m50601e(@C12579k C12500m mVar, @C12579k C12500m mVar2, long j, long j2) {
        Intrinsics.checkNotNullParameter(mVar, "$this$commonCopyTo");
        Intrinsics.checkNotNullParameter(mVar2, "out");
        C12487j.m50748e(mVar.mo27362c0(), j, j2);
        if (j2 == 0) {
            return mVar;
        }
        mVar2.mo27354V(mVar2.mo27362c0() + j2);
        C12498l0 l0Var = mVar.f30464a;
        while (true) {
            Intrinsics.checkNotNull(l0Var);
            int i = l0Var.f30459c;
            int i2 = l0Var.f30458b;
            if (j < ((long) (i - i2))) {
                break;
            }
            j -= (long) (i - i2);
            l0Var = l0Var.f30462f;
        }
        while (j2 > 0) {
            Intrinsics.checkNotNull(l0Var);
            C12498l0 d = l0Var.mo27323d();
            int i3 = d.f30458b + ((int) j);
            d.f30458b = i3;
            d.f30459c = Math.min(i3 + ((int) j2), d.f30459c);
            C12498l0 l0Var2 = mVar2.f30464a;
            if (l0Var2 == null) {
                d.f30463g = d;
                d.f30462f = d;
                mVar2.f30464a = d;
            } else {
                Intrinsics.checkNotNull(l0Var2);
                C12498l0 l0Var3 = l0Var2.f30463g;
                Intrinsics.checkNotNull(l0Var3);
                l0Var3.mo27322c(d);
            }
            j2 -= (long) (d.f30459c - d.f30458b);
            l0Var = l0Var.f30462f;
            j = 0;
        }
        return mVar;
    }

    @C12579k
    /* renamed from: e0 */
    public static final C12500m m50602e0(@C12579k C12500m mVar, @C12579k String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(mVar, "$this$commonWriteUtf8");
        Intrinsics.checkNotNullParameter(str, C16717v.C16719b.f42182e);
        if (i >= 0) {
            if (i2 >= i) {
                if (i2 <= str.length()) {
                    while (i < i2) {
                        char charAt = str.charAt(i);
                        if (charAt < 128) {
                            C12498l0 q0 = mVar.mo27380q0(1);
                            byte[] bArr = q0.f30457a;
                            int i3 = q0.f30459c - i;
                            int min = Math.min(i2, 8192 - i3);
                            int i4 = i + 1;
                            bArr[i + i3] = (byte) charAt;
                            while (i4 < min) {
                                char charAt2 = str.charAt(i4);
                                if (charAt2 >= 128) {
                                    break;
                                }
                                bArr[i4 + i3] = (byte) charAt2;
                                i4++;
                            }
                            int i5 = q0.f30459c;
                            int i6 = (i3 + i4) - i5;
                            q0.f30459c = i5 + i6;
                            mVar.mo27354V(mVar.mo27362c0() + ((long) i6));
                            i = i4;
                        } else {
                            if (charAt < 2048) {
                                C12498l0 q02 = mVar.mo27380q0(2);
                                byte[] bArr2 = q02.f30457a;
                                int i7 = q02.f30459c;
                                bArr2[i7] = (byte) ((charAt >> 6) | C14092c.f34560U);
                                bArr2[i7 + 1] = (byte) ((charAt & '?') | 128);
                                q02.f30459c = i7 + 2;
                                mVar.mo27354V(mVar.mo27362c0() + 2);
                            } else if (charAt < 55296 || charAt > 57343) {
                                C12498l0 q03 = mVar.mo27380q0(3);
                                byte[] bArr3 = q03.f30457a;
                                int i8 = q03.f30459c;
                                bArr3[i8] = (byte) ((charAt >> 12) | 224);
                                bArr3[i8 + 1] = (byte) ((63 & (charAt >> 6)) | 128);
                                bArr3[i8 + 2] = (byte) ((charAt & '?') | 128);
                                q03.f30459c = i8 + 3;
                                mVar.mo27354V(mVar.mo27362c0() + 3);
                            } else {
                                int i9 = i + 1;
                                char charAt3 = i9 < i2 ? str.charAt(i9) : 0;
                                if (charAt > 56319 || 56320 > charAt3 || 57343 < charAt3) {
                                    mVar.mo27225K2(63);
                                    i = i9;
                                } else {
                                    int i10 = (((charAt & 1023) << 10) | (charAt3 & 1023)) + 0;
                                    C12498l0 q04 = mVar.mo27380q0(4);
                                    byte[] bArr4 = q04.f30457a;
                                    int i11 = q04.f30459c;
                                    bArr4[i11] = (byte) ((i10 >> 18) | C9527p.f26031b);
                                    bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                                    bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                                    bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                                    q04.f30459c = i11 + 4;
                                    mVar.mo27354V(mVar.mo27362c0() + 4);
                                    i += 2;
                                }
                            }
                            i++;
                        }
                    }
                    return mVar;
                }
                throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
            }
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
    }

    /* JADX WARNING: type inference failed for: r19v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m50603f(@org.jetbrains.annotations.C12579k okio.C12500m r18, @org.jetbrains.annotations.C12580l java.lang.Object r19) {
        /*
            r0 = r18
            r1 = r19
            java.lang.String r2 = "$this$commonEquals"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            r2 = 1
            if (r0 != r1) goto L_0x000d
            return r2
        L_0x000d:
            boolean r3 = r1 instanceof okio.C12500m
            r4 = 0
            if (r3 != 0) goto L_0x0013
            return r4
        L_0x0013:
            long r5 = r18.mo27362c0()
            okio.m r1 = (okio.C12500m) r1
            long r7 = r1.mo27362c0()
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0022
            return r4
        L_0x0022:
            long r5 = r18.mo27362c0()
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x002d
            return r2
        L_0x002d:
            okio.l0 r3 = r0.f30464a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            okio.l0 r1 = r1.f30464a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            int r5 = r3.f30458b
            int r6 = r1.f30458b
            r9 = r7
        L_0x003c:
            long r11 = r18.mo27362c0()
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x0083
            int r11 = r3.f30459c
            int r11 = r11 - r5
            int r12 = r1.f30459c
            int r12 = r12 - r6
            int r11 = java.lang.Math.min(r11, r12)
            long r11 = (long) r11
            r13 = r7
        L_0x0050:
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 >= 0) goto L_0x006b
            byte[] r15 = r3.f30457a
            int r16 = r5 + 1
            byte r5 = r15[r5]
            byte[] r15 = r1.f30457a
            int r17 = r6 + 1
            byte r6 = r15[r6]
            if (r5 == r6) goto L_0x0063
            return r4
        L_0x0063:
            r5 = 1
            long r13 = r13 + r5
            r5 = r16
            r6 = r17
            goto L_0x0050
        L_0x006b:
            int r13 = r3.f30459c
            if (r5 != r13) goto L_0x0076
            okio.l0 r3 = r3.f30462f
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            int r5 = r3.f30458b
        L_0x0076:
            int r13 = r1.f30459c
            if (r6 != r13) goto L_0x0081
            okio.l0 r1 = r1.f30462f
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            int r6 = r1.f30458b
        L_0x0081:
            long r9 = r9 + r11
            goto L_0x003c
        L_0x0083:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.C12481a.m50603f(okio.m, java.lang.Object):boolean");
    }

    @C12579k
    /* renamed from: f0 */
    public static final C12500m m50604f0(@C12579k C12500m mVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "$this$commonWriteUtf8CodePoint");
        if (i < 128) {
            mVar.mo27225K2(i);
        } else if (i < 2048) {
            C12498l0 q0 = mVar.mo27380q0(2);
            byte[] bArr = q0.f30457a;
            int i2 = q0.f30459c;
            bArr[i2] = (byte) ((i >> 6) | C14092c.f34560U);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            q0.f30459c = i2 + 2;
            mVar.mo27354V(mVar.mo27362c0() + 2);
        } else if (55296 <= i && 57343 >= i) {
            mVar.mo27225K2(63);
        } else if (i < 65536) {
            C12498l0 q02 = mVar.mo27380q0(3);
            byte[] bArr2 = q02.f30457a;
            int i3 = q02.f30459c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            q02.f30459c = i3 + 3;
            mVar.mo27354V(mVar.mo27362c0() + 3);
        } else if (i <= 1114111) {
            C12498l0 q03 = mVar.mo27380q0(4);
            byte[] bArr3 = q03.f30457a;
            int i4 = q03.f30459c;
            bArr3[i4] = (byte) ((i >> 18) | C9527p.f26031b);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i4 + 3] = (byte) ((i & 63) | 128);
            q03.f30459c = i4 + 4;
            mVar.mo27354V(mVar.mo27362c0() + 4);
        } else {
            throw new IllegalArgumentException("Unexpected code point: 0x" + C12487j.m50759p(i));
        }
        return mVar;
    }

    /* renamed from: g */
    public static final long m50605g(@C12579k C12500m.C12501a aVar, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(aVar, "$this$commonExpandBuffer");
        boolean z2 = true;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i > 8192) {
                z2 = false;
            }
            if (z2) {
                C12500m mVar = aVar.f30466a;
                if (mVar == null) {
                    throw new IllegalStateException("not attached to a buffer".toString());
                } else if (aVar.f30467b) {
                    long c0 = mVar.mo27362c0();
                    C12498l0 q0 = mVar.mo27380q0(i);
                    int i2 = 8192 - q0.f30459c;
                    q0.f30459c = 8192;
                    long j = (long) i2;
                    mVar.mo27354V(c0 + j);
                    aVar.mo27396g(q0);
                    aVar.f30469d = c0;
                    aVar.f30470e = q0.f30457a;
                    aVar.f30471f = 8192 - i2;
                    aVar.f30472g = 8192;
                    return j;
                } else {
                    throw new IllegalStateException("expandBuffer() only permitted for read/write buffers".toString());
                }
            } else {
                throw new IllegalArgumentException(("minByteCount > Segment.SIZE: " + i).toString());
            }
        } else {
            throw new IllegalArgumentException(("minByteCount <= 0: " + i).toString());
        }
    }

    @C12579k
    /* renamed from: g0 */
    public static final byte[] m50606g0() {
        return f30437a;
    }

    /* renamed from: h */
    public static final byte m50607h(@C12579k C12500m mVar, long j) {
        Intrinsics.checkNotNullParameter(mVar, "$this$commonGet");
        C12487j.m50748e(mVar.mo27362c0(), j, 1);
        C12498l0 l0Var = mVar.f30464a;
        if (l0Var == null) {
            Intrinsics.checkNotNull((Object) null);
            throw null;
        } else if (mVar.mo27362c0() - j < j) {
            long c0 = mVar.mo27362c0();
            while (c0 > j) {
                l0Var = l0Var.f30463g;
                Intrinsics.checkNotNull(l0Var);
                c0 -= (long) (l0Var.f30459c - l0Var.f30458b);
            }
            Intrinsics.checkNotNull(l0Var);
            return l0Var.f30457a[(int) ((((long) l0Var.f30458b) + j) - c0)];
        } else {
            long j2 = 0;
            while (true) {
                long j3 = ((long) (l0Var.f30459c - l0Var.f30458b)) + j2;
                if (j3 > j) {
                    Intrinsics.checkNotNull(l0Var);
                    return l0Var.f30457a[(int) ((((long) l0Var.f30458b) + j) - j2)];
                }
                l0Var = l0Var.f30462f;
                Intrinsics.checkNotNull(l0Var);
                j2 = j3;
            }
        }
    }

    /* renamed from: h0 */
    public static final boolean m50608h0(@C12579k C12498l0 l0Var, int i, @C12579k byte[] bArr, int i2, int i3) {
        Intrinsics.checkNotNullParameter(l0Var, "segment");
        Intrinsics.checkNotNullParameter(bArr, "bytes");
        int i4 = l0Var.f30459c;
        byte[] bArr2 = l0Var.f30457a;
        while (i2 < i3) {
            if (i == i4) {
                l0Var = l0Var.f30462f;
                Intrinsics.checkNotNull(l0Var);
                byte[] bArr3 = l0Var.f30457a;
                int i5 = l0Var.f30458b;
                bArr2 = bArr3;
                i = i5;
                i4 = l0Var.f30459c;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    /* renamed from: i */
    public static final int m50609i(@C12579k C12500m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "$this$commonHashCode");
        C12498l0 l0Var = mVar.f30464a;
        if (l0Var == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = l0Var.f30459c;
            for (int i3 = l0Var.f30458b; i3 < i2; i3++) {
                i = (i * 31) + l0Var.f30457a[i3];
            }
            l0Var = l0Var.f30462f;
            Intrinsics.checkNotNull(l0Var);
        } while (l0Var != mVar.f30464a);
        return i;
    }

    @C12579k
    /* renamed from: i0 */
    public static final String m50610i0(@C12579k C12500m mVar, long j) {
        Intrinsics.checkNotNullParameter(mVar, "$this$readUtf8Line");
        if (j > 0) {
            long j2 = j - 1;
            if (mVar.mo27330D(j2) == ((byte) 13)) {
                String n2 = mVar.mo27300n2(j2);
                mVar.skip(2);
                return n2;
            }
        }
        String n22 = mVar.mo27300n2(j);
        mVar.skip(1);
        return n22;
    }

    /* renamed from: j */
    public static final long m50611j(@C12579k C12500m mVar, byte b, long j, long j2) {
        boolean z;
        C12498l0 l0Var;
        long j3;
        int i;
        Intrinsics.checkNotNullParameter(mVar, "$this$commonIndexOf");
        long j4 = 0;
        if (0 <= j && j2 >= j) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (j2 > mVar.mo27362c0()) {
                j2 = mVar.mo27362c0();
            }
            if (j == j2 || (l0Var = mVar.f30464a) == null) {
                return -1;
            }
            if (mVar.mo27362c0() - j < j) {
                j3 = mVar.mo27362c0();
                while (j3 > j) {
                    l0Var = l0Var.f30463g;
                    Intrinsics.checkNotNull(l0Var);
                    j3 -= (long) (l0Var.f30459c - l0Var.f30458b);
                }
                while (j3 < j2) {
                    byte[] bArr = l0Var.f30457a;
                    int min = (int) Math.min((long) l0Var.f30459c, (((long) l0Var.f30458b) + j2) - j3);
                    i = (int) ((((long) l0Var.f30458b) + j) - j3);
                    while (i < min) {
                        if (bArr[i] != b) {
                            i++;
                        }
                    }
                    j3 += (long) (l0Var.f30459c - l0Var.f30458b);
                    l0Var = l0Var.f30462f;
                    Intrinsics.checkNotNull(l0Var);
                    j = j3;
                }
                return -1;
            }
            while (true) {
                long j5 = ((long) (l0Var.f30459c - l0Var.f30458b)) + j4;
                if (j5 > j) {
                    break;
                }
                l0Var = l0Var.f30462f;
                Intrinsics.checkNotNull(l0Var);
                j4 = j5;
            }
            while (j3 < j2) {
                byte[] bArr2 = l0Var.f30457a;
                int min2 = (int) Math.min((long) l0Var.f30459c, (((long) l0Var.f30458b) + j2) - j3);
                int i2 = (int) ((((long) l0Var.f30458b) + j) - j3);
                while (i < min2) {
                    if (bArr2[i] != b) {
                        i2 = i + 1;
                    }
                }
                j4 = j3 + ((long) (l0Var.f30459c - l0Var.f30458b));
                l0Var = l0Var.f30462f;
                Intrinsics.checkNotNull(l0Var);
                j = j4;
            }
            return -1;
            return ((long) (i - l0Var.f30458b)) + j3;
        }
        throw new IllegalArgumentException(("size=" + mVar.mo27362c0() + " fromIndex=" + j + " toIndex=" + j2).toString());
    }

    /* renamed from: j0 */
    public static final <T> T m50612j0(@C12579k C12500m mVar, long j, @C12579k C11304p<? super C12498l0, ? super Long, ? extends T> pVar) {
        Intrinsics.checkNotNullParameter(mVar, "$this$seek");
        Intrinsics.checkNotNullParameter(pVar, "lambda");
        C12498l0 l0Var = mVar.f30464a;
        if (l0Var == null) {
            return pVar.invoke(null, -1L);
        }
        if (mVar.mo27362c0() - j < j) {
            long c0 = mVar.mo27362c0();
            while (c0 > j) {
                l0Var = l0Var.f30463g;
                Intrinsics.checkNotNull(l0Var);
                c0 -= (long) (l0Var.f30459c - l0Var.f30458b);
            }
            return pVar.invoke(l0Var, Long.valueOf(c0));
        }
        long j2 = 0;
        while (true) {
            long j3 = ((long) (l0Var.f30459c - l0Var.f30458b)) + j2;
            if (j3 > j) {
                return pVar.invoke(l0Var, Long.valueOf(j2));
            }
            l0Var = l0Var.f30462f;
            Intrinsics.checkNotNull(l0Var);
            j2 = j3;
        }
    }

    /* renamed from: k */
    public static final long m50613k(@C12579k C12500m mVar, @C12579k ByteString byteString, long j) {
        boolean z;
        boolean z2;
        C12500m mVar2 = mVar;
        long j2 = j;
        Intrinsics.checkNotNullParameter(mVar2, "$this$commonIndexOf");
        Intrinsics.checkNotNullParameter(byteString, "bytes");
        boolean z3 = true;
        if (byteString.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            long j3 = 0;
            if (j2 >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                C12498l0 l0Var = mVar2.f30464a;
                if (l0Var == null) {
                    return -1;
                }
                if (mVar.mo27362c0() - j2 < j2) {
                    long c0 = mVar.mo27362c0();
                    while (c0 > j2) {
                        l0Var = l0Var.f30463g;
                        Intrinsics.checkNotNull(l0Var);
                        c0 -= (long) (l0Var.f30459c - l0Var.f30458b);
                    }
                    byte[] U0 = byteString.mo27115U0();
                    byte b = U0[0];
                    int size = byteString.size();
                    long c02 = (mVar.mo27362c0() - ((long) size)) + 1;
                    while (c0 < c02) {
                        byte[] bArr = l0Var.f30457a;
                        int min = (int) Math.min((long) l0Var.f30459c, (((long) l0Var.f30458b) + c02) - c0);
                        for (int i = (int) ((((long) l0Var.f30458b) + j2) - c0); i < min; i++) {
                            if (bArr[i] == b && m50608h0(l0Var, i + 1, U0, 1, size)) {
                                return ((long) (i - l0Var.f30458b)) + c0;
                            }
                        }
                        c0 += (long) (l0Var.f30459c - l0Var.f30458b);
                        l0Var = l0Var.f30462f;
                        Intrinsics.checkNotNull(l0Var);
                        j2 = c0;
                    }
                    return -1;
                }
                while (true) {
                    long j4 = ((long) (l0Var.f30459c - l0Var.f30458b)) + j3;
                    if (j4 > j2) {
                        break;
                    }
                    l0Var = l0Var.f30462f;
                    Intrinsics.checkNotNull(l0Var);
                    j3 = j4;
                    z3 = z3;
                }
                byte[] U02 = byteString.mo27115U0();
                byte b2 = U02[0];
                int size2 = byteString.size();
                long c03 = (mVar.mo27362c0() - ((long) size2)) + 1;
                while (j3 < c03) {
                    byte[] bArr2 = l0Var.f30457a;
                    long j5 = j3;
                    int min2 = (int) Math.min((long) l0Var.f30459c, (((long) l0Var.f30458b) + c03) - j3);
                    long j6 = ((long) l0Var.f30458b) + j2;
                    long j7 = j5;
                    for (int i2 = (int) (j6 - j7); i2 < min2; i2++) {
                        if (bArr2[i2] == b2) {
                            if (m50608h0(l0Var, i2 + 1, U02, 1, size2)) {
                                return ((long) (i2 - l0Var.f30458b)) + j7;
                            }
                        }
                    }
                    j3 = j7 + ((long) (l0Var.f30459c - l0Var.f30458b));
                    l0Var = l0Var.f30462f;
                    Intrinsics.checkNotNull(l0Var);
                    j2 = j3;
                }
                return -1;
            }
            throw new IllegalArgumentException(("fromIndex < 0: " + j2).toString());
        }
        throw new IllegalArgumentException("bytes is empty".toString());
    }

    /* renamed from: k0 */
    public static final int m50614k0(@C12579k C12500m mVar, @C12579k C12471f0 f0Var, boolean z) {
        int i;
        int i2;
        boolean z2;
        int i3;
        C12498l0 l0Var;
        int i4;
        C12500m mVar2 = mVar;
        Intrinsics.checkNotNullParameter(mVar2, "$this$selectPrefix");
        Intrinsics.checkNotNullParameter(f0Var, "options");
        C12498l0 l0Var2 = mVar2.f30464a;
        if (l0Var2 != null) {
            byte[] bArr = l0Var2.f30457a;
            int i5 = l0Var2.f30458b;
            int i6 = l0Var2.f30459c;
            int[] r = f0Var.mo27196r();
            C12498l0 l0Var3 = l0Var2;
            int i7 = -1;
            int i8 = 0;
            loop0:
            while (true) {
                int i9 = i8 + 1;
                int i10 = r[i8];
                int i11 = i9 + 1;
                int i12 = r[i9];
                if (i12 != -1) {
                    i7 = i12;
                }
                if (l0Var3 == null) {
                    break;
                }
                if (i10 < 0) {
                    int i13 = i11 + (i10 * -1);
                    while (true) {
                        int i14 = i5 + 1;
                        int i15 = i11 + 1;
                        if ((bArr[i5] & 255) != r[i11]) {
                            return i7;
                        }
                        if (i15 == i13) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (i14 == i6) {
                            Intrinsics.checkNotNull(l0Var3);
                            C12498l0 l0Var4 = l0Var3.f30462f;
                            Intrinsics.checkNotNull(l0Var4);
                            i4 = l0Var4.f30458b;
                            byte[] bArr2 = l0Var4.f30457a;
                            i3 = l0Var4.f30459c;
                            if (l0Var4 != l0Var2) {
                                byte[] bArr3 = bArr2;
                                l0Var = l0Var4;
                                bArr = bArr3;
                            } else if (!z2) {
                                break loop0;
                            } else {
                                bArr = bArr2;
                                l0Var = null;
                            }
                        } else {
                            C12498l0 l0Var5 = l0Var3;
                            i3 = i6;
                            i4 = i14;
                            l0Var = l0Var5;
                        }
                        if (z2) {
                            i2 = r[i15];
                            i = i4;
                            i6 = i3;
                            l0Var3 = l0Var;
                            break;
                        }
                        i5 = i4;
                        i6 = i3;
                        i11 = i15;
                        l0Var3 = l0Var;
                    }
                } else {
                    i = i5 + 1;
                    byte b = bArr[i5] & 255;
                    int i16 = i11 + i10;
                    while (i11 != i16) {
                        if (b == r[i11]) {
                            i2 = r[i11 + i10];
                            if (i == i6) {
                                l0Var3 = l0Var3.f30462f;
                                Intrinsics.checkNotNull(l0Var3);
                                i = l0Var3.f30458b;
                                bArr = l0Var3.f30457a;
                                i6 = l0Var3.f30459c;
                                if (l0Var3 == l0Var2) {
                                    l0Var3 = null;
                                }
                            }
                        } else {
                            i11++;
                        }
                    }
                    return i7;
                }
                if (i2 >= 0) {
                    return i2;
                }
                i8 = -i2;
                i5 = i;
            }
            if (z) {
                return -2;
            }
            return i7;
        } else if (z) {
            return -2;
        } else {
            return -1;
        }
    }

    /* renamed from: l */
    public static final long m50615l(@C12579k C12500m mVar, @C12579k ByteString byteString, long j) {
        boolean z;
        long j2;
        int i;
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(mVar, "$this$commonIndexOfElement");
        Intrinsics.checkNotNullParameter(byteString, "targetBytes");
        long j3 = 0;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C12498l0 l0Var = mVar.f30464a;
            if (l0Var == null) {
                return -1;
            }
            if (mVar.mo27362c0() - j < j) {
                j2 = mVar.mo27362c0();
                while (j2 > j) {
                    l0Var = l0Var.f30463g;
                    Intrinsics.checkNotNull(l0Var);
                    j2 -= (long) (l0Var.f30459c - l0Var.f30458b);
                }
                if (byteString.size() == 2) {
                    byte f0 = byteString.mo27126f0(0);
                    byte f02 = byteString.mo27126f0(1);
                    while (j2 < mVar.mo27362c0()) {
                        byte[] bArr = l0Var.f30457a;
                        i2 = (int) ((((long) l0Var.f30458b) + j) - j2);
                        int i4 = l0Var.f30459c;
                        while (i2 < i4) {
                            byte b = bArr[i2];
                            if (!(b == f0 || b == f02)) {
                                i2++;
                            }
                        }
                        j2 += (long) (l0Var.f30459c - l0Var.f30458b);
                        l0Var = l0Var.f30462f;
                        Intrinsics.checkNotNull(l0Var);
                        j = j2;
                    }
                } else {
                    byte[] U0 = byteString.mo27115U0();
                    while (j2 < mVar.mo27362c0()) {
                        byte[] bArr2 = l0Var.f30457a;
                        i = (int) ((((long) l0Var.f30458b) + j) - j2);
                        int i5 = l0Var.f30459c;
                        while (i < i5) {
                            byte b2 = bArr2[i];
                            for (byte b3 : U0) {
                                if (b2 == b3) {
                                    i3 = l0Var.f30458b;
                                    return ((long) (i2 - i3)) + j2;
                                }
                            }
                            i++;
                        }
                        j2 += (long) (l0Var.f30459c - l0Var.f30458b);
                        l0Var = l0Var.f30462f;
                        Intrinsics.checkNotNull(l0Var);
                        j = j2;
                    }
                }
                return -1;
            }
            while (true) {
                long j4 = ((long) (l0Var.f30459c - l0Var.f30458b)) + j3;
                if (j4 > j) {
                    break;
                }
                l0Var = l0Var.f30462f;
                Intrinsics.checkNotNull(l0Var);
                j3 = j4;
            }
            if (byteString.size() == 2) {
                byte f03 = byteString.mo27126f0(0);
                byte f04 = byteString.mo27126f0(1);
                while (j2 < mVar.mo27362c0()) {
                    byte[] bArr3 = l0Var.f30457a;
                    int i6 = (int) ((((long) l0Var.f30458b) + j) - j2);
                    int i7 = l0Var.f30459c;
                    while (i2 < i7) {
                        byte b4 = bArr3[i2];
                        if (!(b4 == f03 || b4 == f04)) {
                            i6 = i2 + 1;
                        }
                    }
                    j3 = j2 + ((long) (l0Var.f30459c - l0Var.f30458b));
                    l0Var = l0Var.f30462f;
                    Intrinsics.checkNotNull(l0Var);
                    j = j3;
                }
            } else {
                byte[] U02 = byteString.mo27115U0();
                while (j2 < mVar.mo27362c0()) {
                    byte[] bArr4 = l0Var.f30457a;
                    int i8 = (int) ((((long) l0Var.f30458b) + j) - j2);
                    int i9 = l0Var.f30459c;
                    while (i < i9) {
                        byte b5 = bArr4[i];
                        for (byte b6 : U02) {
                            if (b5 == b6) {
                                i3 = l0Var.f30458b;
                                return ((long) (i2 - i3)) + j2;
                            }
                        }
                        i8 = i + 1;
                    }
                    j3 = j2 + ((long) (l0Var.f30459c - l0Var.f30458b));
                    l0Var = l0Var.f30462f;
                    Intrinsics.checkNotNull(l0Var);
                    j = j3;
                }
            }
            return -1;
            i3 = l0Var.f30458b;
            return ((long) (i2 - i3)) + j2;
        }
        throw new IllegalArgumentException(("fromIndex < 0: " + j).toString());
    }

    /* renamed from: l0 */
    public static /* synthetic */ int m50616l0(C12500m mVar, C12471f0 f0Var, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m50614k0(mVar, f0Var, z);
    }

    /* renamed from: m */
    public static final int m50617m(@C12579k C12500m.C12501a aVar) {
        boolean z;
        long j;
        Intrinsics.checkNotNullParameter(aVar, "$this$commonNext");
        long j2 = aVar.f30469d;
        C12500m mVar = aVar.f30466a;
        Intrinsics.checkNotNull(mVar);
        if (j2 != mVar.mo27362c0()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            long j3 = aVar.f30469d;
            if (j3 == -1) {
                j = 0;
            } else {
                j = j3 + ((long) (aVar.f30472g - aVar.f30471f));
            }
            return aVar.mo27395f(j);
        }
        throw new IllegalStateException("no more bytes".toString());
    }

    /* renamed from: n */
    public static final boolean m50618n(@C12579k C12500m mVar, long j, @C12579k ByteString byteString, int i, int i2) {
        Intrinsics.checkNotNullParameter(mVar, "$this$commonRangeEquals");
        Intrinsics.checkNotNullParameter(byteString, "bytes");
        if (j < 0 || i < 0 || i2 < 0 || mVar.mo27362c0() - j < ((long) i2) || byteString.size() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (mVar.mo27330D(((long) i3) + j) != byteString.mo27126f0(i + i3)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: o */
    public static final int m50619o(@C12579k C12500m mVar, @C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(mVar, "$this$commonRead");
        Intrinsics.checkNotNullParameter(bArr, "sink");
        return mVar.read(bArr, 0, bArr.length);
    }

    /* renamed from: p */
    public static final int m50620p(@C12579k C12500m mVar, @C12579k byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(mVar, "$this$commonRead");
        Intrinsics.checkNotNullParameter(bArr, "sink");
        C12487j.m50748e((long) bArr.length, (long) i, (long) i2);
        C12498l0 l0Var = mVar.f30464a;
        if (l0Var == null) {
            return -1;
        }
        int min = Math.min(i2, l0Var.f30459c - l0Var.f30458b);
        byte[] bArr2 = l0Var.f30457a;
        int i3 = l0Var.f30458b;
        C10956m.m41147W0(bArr2, bArr, i, i3, i3 + min);
        l0Var.f30458b += min;
        mVar.mo27354V(mVar.mo27362c0() - ((long) min));
        if (l0Var.f30458b == l0Var.f30459c) {
            mVar.f30464a = l0Var.mo27321b();
            C12504m0.m50967d(l0Var);
        }
        return min;
    }

    /* renamed from: q */
    public static final long m50621q(@C12579k C12500m mVar, @C12579k C12500m mVar2, long j) {
        boolean z;
        Intrinsics.checkNotNullParameter(mVar, "$this$commonRead");
        Intrinsics.checkNotNullParameter(mVar2, "sink");
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        } else if (mVar.mo27362c0() == 0) {
            return -1;
        } else {
            if (j > mVar.mo27362c0()) {
                j = mVar.mo27362c0();
            }
            mVar2.write(mVar, j);
            return j;
        }
    }

    /* renamed from: r */
    public static final long m50622r(@C12579k C12500m mVar, @C12579k C12506n0 n0Var) {
        Intrinsics.checkNotNullParameter(mVar, "$this$commonReadAll");
        Intrinsics.checkNotNullParameter(n0Var, "sink");
        long c0 = mVar.mo27362c0();
        if (c0 > 0) {
            n0Var.write(mVar, c0);
        }
        return c0;
    }

    @C12579k
    /* renamed from: s */
    public static final C12500m.C12501a m50623s(@C12579k C12500m mVar, @C12579k C12500m.C12501a aVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(mVar, "$this$commonReadAndWriteUnsafe");
        Intrinsics.checkNotNullParameter(aVar, "unsafeCursor");
        if (aVar.f30466a == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            aVar.f30466a = mVar;
            aVar.f30467b = true;
            return aVar;
        }
        throw new IllegalStateException("already attached to a buffer".toString());
    }

    /* renamed from: t */
    public static final byte m50624t(@C12579k C12500m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "$this$commonReadByte");
        if (mVar.mo27362c0() != 0) {
            C12498l0 l0Var = mVar.f30464a;
            Intrinsics.checkNotNull(l0Var);
            int i = l0Var.f30458b;
            int i2 = l0Var.f30459c;
            int i3 = i + 1;
            byte b = l0Var.f30457a[i];
            mVar.mo27354V(mVar.mo27362c0() - 1);
            if (i3 == i2) {
                mVar.f30464a = l0Var.mo27321b();
                C12504m0.m50967d(l0Var);
            } else {
                l0Var.f30458b = i3;
            }
            return b;
        }
        throw new EOFException();
    }

    @C12579k
    /* renamed from: u */
    public static final byte[] m50625u(@C12579k C12500m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "$this$commonReadByteArray");
        return mVar.mo27278O1(mVar.mo27362c0());
    }

    @C12579k
    /* renamed from: v */
    public static final byte[] m50626v(@C12579k C12500m mVar, long j) {
        boolean z;
        Intrinsics.checkNotNullParameter(mVar, "$this$commonReadByteArray");
        if (j < 0 || j > ((long) Integer.MAX_VALUE)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        } else if (mVar.mo27362c0() >= j) {
            byte[] bArr = new byte[((int) j)];
            mVar.readFully(bArr);
            return bArr;
        } else {
            throw new EOFException();
        }
    }

    @C12579k
    /* renamed from: w */
    public static final ByteString m50627w(@C12579k C12500m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "$this$commonReadByteString");
        return mVar.mo27312t2(mVar.mo27362c0());
    }

    @C12579k
    /* renamed from: x */
    public static final ByteString m50628x(@C12579k C12500m mVar, long j) {
        boolean z;
        Intrinsics.checkNotNullParameter(mVar, "$this$commonReadByteString");
        if (j < 0 || j > ((long) Integer.MAX_VALUE)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        } else if (mVar.mo27362c0() < j) {
            throw new EOFException();
        } else if (j < ((long) 4096)) {
            return new ByteString(mVar.mo27278O1(j));
        } else {
            ByteString g0 = mVar.mo27368g0((int) j);
            mVar.skip(j);
            return g0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a4, code lost:
        if (r9 != r10) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a6, code lost:
        r15.f30464a = r7.mo27321b();
        okio.C12504m0.m50967d(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b0, code lost:
        r7.f30458b = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b2, code lost:
        if (r2 != false) goto L_0x00b8;
     */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long m50629y(@org.jetbrains.annotations.C12579k okio.C12500m r15) {
        /*
            java.lang.String r0 = "$this$commonReadDecimalLong"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            long r0 = r15.mo27362c0()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x00c6
            r0 = 0
            r4 = -7
            r1 = r0
            r5 = r4
            r3 = r2
            r2 = r1
        L_0x0016:
            okio.l0 r7 = r15.f30464a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            byte[] r8 = r7.f30457a
            int r9 = r7.f30458b
            int r10 = r7.f30459c
        L_0x0021:
            if (r9 >= r10) goto L_0x00a4
            byte r11 = r8[r9]
            r12 = 48
            byte r12 = (byte) r12
            if (r11 < r12) goto L_0x0074
            r13 = 57
            byte r13 = (byte) r13
            if (r11 > r13) goto L_0x0074
            int r12 = r12 - r11
            r13 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r13 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r13 < 0) goto L_0x0047
            if (r13 != 0) goto L_0x0041
            long r13 = (long) r12
            int r13 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r13 >= 0) goto L_0x0041
            goto L_0x0047
        L_0x0041:
            r13 = 10
            long r3 = r3 * r13
            long r11 = (long) r12
            long r3 = r3 + r11
            goto L_0x0080
        L_0x0047:
            okio.m r15 = new okio.m
            r15.<init>()
            okio.m r15 = r15.mo27233g2(r3)
            okio.m r15 = r15.mo27225K2(r11)
            if (r1 != 0) goto L_0x0059
            r15.readByte()
        L_0x0059:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Number too large: "
            r1.append(r2)
            java.lang.String r15 = r15.mo27268B3()
            r1.append(r15)
            java.lang.String r15 = r1.toString()
            r0.<init>(r15)
            throw r0
        L_0x0074:
            r12 = 45
            byte r12 = (byte) r12
            r13 = 1
            if (r11 != r12) goto L_0x0085
            if (r0 != 0) goto L_0x0085
            r11 = 1
            long r5 = r5 - r11
            r1 = r13
        L_0x0080:
            int r9 = r9 + 1
            int r0 = r0 + 1
            goto L_0x0021
        L_0x0085:
            if (r0 == 0) goto L_0x0089
            r2 = r13
            goto L_0x00a4
        L_0x0089:
            java.lang.NumberFormatException r15 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected leading [0-9] or '-' character but was 0x"
            r0.append(r1)
            java.lang.String r1 = okio.C12487j.m50758o(r11)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L_0x00a4:
            if (r9 != r10) goto L_0x00b0
            okio.l0 r8 = r7.mo27321b()
            r15.f30464a = r8
            okio.C12504m0.m50967d(r7)
            goto L_0x00b2
        L_0x00b0:
            r7.f30458b = r9
        L_0x00b2:
            if (r2 != 0) goto L_0x00b8
            okio.l0 r7 = r15.f30464a
            if (r7 != 0) goto L_0x0016
        L_0x00b8:
            long r5 = r15.mo27362c0()
            long r7 = (long) r0
            long r5 = r5 - r7
            r15.mo27354V(r5)
            if (r1 == 0) goto L_0x00c4
            goto L_0x00c5
        L_0x00c4:
            long r3 = -r3
        L_0x00c5:
            return r3
        L_0x00c6:
            java.io.EOFException r15 = new java.io.EOFException
            r15.<init>()
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.C12481a.m50629y(okio.m):long");
    }

    /* renamed from: z */
    public static final void m50630z(@C12579k C12500m mVar, @C12579k C12500m mVar2, long j) {
        Intrinsics.checkNotNullParameter(mVar, "$this$commonReadFully");
        Intrinsics.checkNotNullParameter(mVar2, "sink");
        if (mVar.mo27362c0() >= j) {
            mVar2.write(mVar, j);
        } else {
            mVar2.write(mVar, mVar.mo27362c0());
            throw new EOFException();
        }
    }
}

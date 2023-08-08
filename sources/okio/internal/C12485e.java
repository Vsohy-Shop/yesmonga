package okio.internal;

import kotlin.C11079d2;
import kotlin.collections.C10956m;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import okio.C12487j;
import okio.C12498l0;
import okio.C12500m;
import okio.SegmentedByteString;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: okio.internal.e */
public final class C12485e {
    /* renamed from: b */
    public static final int m50728b(@C12579k int[] iArr, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(iArr, "$this$binarySearch");
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i) {
                i2 = i5 + 1;
            } else if (i6 <= i) {
                return i5;
            } else {
                i4 = i5 - 1;
            }
        }
        return (-i2) - 1;
    }

    /* renamed from: c */
    public static final boolean m50729c(@C12579k SegmentedByteString segmentedByteString, @C12580l Object obj) {
        Intrinsics.checkNotNullParameter(segmentedByteString, "$this$commonEquals");
        if (obj == segmentedByteString) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == segmentedByteString.size() && segmentedByteString.mo27108H1(0, byteString, 0, segmentedByteString.size())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static final int m50730d(@C12579k SegmentedByteString segmentedByteString) {
        Intrinsics.checkNotNullParameter(segmentedByteString, "$this$commonGetSize");
        return segmentedByteString.mo27172v2()[segmentedByteString.mo27173w2().length - 1];
    }

    /* renamed from: e */
    public static final int m50731e(@C12579k SegmentedByteString segmentedByteString) {
        Intrinsics.checkNotNullParameter(segmentedByteString, "$this$commonHashCode");
        int n0 = segmentedByteString.mo27137n0();
        if (n0 != 0) {
            return n0;
        }
        int length = segmentedByteString.mo27173w2().length;
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        while (i < length) {
            int i4 = segmentedByteString.mo27172v2()[length + i];
            int i5 = segmentedByteString.mo27172v2()[i];
            byte[] bArr = segmentedByteString.mo27173w2()[i];
            int i6 = (i5 - i3) + i4;
            while (i4 < i6) {
                i2 = (i2 * 31) + bArr[i4];
                i4++;
            }
            i++;
            i3 = i5;
        }
        segmentedByteString.mo27114T1(i2);
        return i2;
    }

    /* renamed from: f */
    public static final byte m50732f(@C12579k SegmentedByteString segmentedByteString, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(segmentedByteString, "$this$commonInternalGet");
        C12487j.m50748e((long) segmentedByteString.mo27172v2()[segmentedByteString.mo27173w2().length - 1], (long) i, 1);
        int n = m50740n(segmentedByteString, i);
        if (n == 0) {
            i2 = 0;
        } else {
            i2 = segmentedByteString.mo27172v2()[n - 1];
        }
        return segmentedByteString.mo27173w2()[n][(i - i2) + segmentedByteString.mo27172v2()[segmentedByteString.mo27173w2().length + n]];
    }

    /* renamed from: g */
    public static final boolean m50733g(@C12579k SegmentedByteString segmentedByteString, int i, @C12579k ByteString byteString, int i2, int i3) {
        int i4;
        Intrinsics.checkNotNullParameter(segmentedByteString, "$this$commonRangeEquals");
        Intrinsics.checkNotNullParameter(byteString, "other");
        if (i < 0 || i > segmentedByteString.size() - i3) {
            return false;
        }
        int i5 = i3 + i;
        int n = m50740n(segmentedByteString, i);
        while (i < i5) {
            if (n == 0) {
                i4 = 0;
            } else {
                i4 = segmentedByteString.mo27172v2()[n - 1];
            }
            int i6 = segmentedByteString.mo27172v2()[segmentedByteString.mo27173w2().length + n];
            int min = Math.min(i5, (segmentedByteString.mo27172v2()[n] - i4) + i4) - i;
            if (!byteString.mo27111L1(i2, segmentedByteString.mo27173w2()[n], i6 + (i - i4), min)) {
                return false;
            }
            i2 += min;
            i += min;
            n++;
        }
        return true;
    }

    /* renamed from: h */
    public static final boolean m50734h(@C12579k SegmentedByteString segmentedByteString, int i, @C12579k byte[] bArr, int i2, int i3) {
        int i4;
        Intrinsics.checkNotNullParameter(segmentedByteString, "$this$commonRangeEquals");
        Intrinsics.checkNotNullParameter(bArr, "other");
        if (i < 0 || i > segmentedByteString.size() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i5 = i3 + i;
        int n = m50740n(segmentedByteString, i);
        while (i < i5) {
            if (n == 0) {
                i4 = 0;
            } else {
                i4 = segmentedByteString.mo27172v2()[n - 1];
            }
            int i6 = segmentedByteString.mo27172v2()[segmentedByteString.mo27173w2().length + n];
            int min = Math.min(i5, (segmentedByteString.mo27172v2()[n] - i4) + i4) - i;
            if (!C12487j.m50747d(segmentedByteString.mo27173w2()[n], i6 + (i - i4), bArr, i2, min)) {
                return false;
            }
            i2 += min;
            i += min;
            n++;
        }
        return true;
    }

    @C12579k
    /* renamed from: i */
    public static final ByteString m50735i(@C12579k SegmentedByteString segmentedByteString, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        Intrinsics.checkNotNullParameter(segmentedByteString, "$this$commonSubstring");
        int i3 = 0;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 <= segmentedByteString.size()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                int i4 = i2 - i;
                if (i4 >= 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    throw new IllegalArgumentException(("endIndex=" + i2 + " < beginIndex=" + i).toString());
                } else if (i == 0 && i2 == segmentedByteString.size()) {
                    return segmentedByteString;
                } else {
                    if (i == i2) {
                        return ByteString.f30387c;
                    }
                    int n = m50740n(segmentedByteString, i);
                    int n2 = m50740n(segmentedByteString, i2 - 1);
                    byte[][] bArr = (byte[][]) C10956m.m41088M1(segmentedByteString.mo27173w2(), n, n2 + 1);
                    int[] iArr = new int[(bArr.length * 2)];
                    if (n <= n2) {
                        int i5 = 0;
                        int i6 = n;
                        while (true) {
                            iArr[i5] = Math.min(segmentedByteString.mo27172v2()[i6] - i, i4);
                            int i7 = i5 + 1;
                            iArr[i5 + bArr.length] = segmentedByteString.mo27172v2()[segmentedByteString.mo27173w2().length + i6];
                            if (i6 == n2) {
                                break;
                            }
                            i6++;
                            i5 = i7;
                        }
                    }
                    if (n != 0) {
                        i3 = segmentedByteString.mo27172v2()[n - 1];
                    }
                    int length = bArr.length;
                    iArr[length] = iArr[length] + (i - i3);
                    return new SegmentedByteString(bArr, iArr);
                }
            } else {
                throw new IllegalArgumentException(("endIndex=" + i2 + " > length(" + segmentedByteString.size() + ')').toString());
            }
        } else {
            throw new IllegalArgumentException(("beginIndex=" + i + " < 0").toString());
        }
    }

    @C12579k
    /* renamed from: j */
    public static final byte[] m50736j(@C12579k SegmentedByteString segmentedByteString) {
        Intrinsics.checkNotNullParameter(segmentedByteString, "$this$commonToByteArray");
        byte[] bArr = new byte[segmentedByteString.size()];
        int length = segmentedByteString.mo27173w2().length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int i4 = segmentedByteString.mo27172v2()[length + i];
            int i5 = segmentedByteString.mo27172v2()[i];
            int i6 = i5 - i2;
            C10956m.m41147W0(segmentedByteString.mo27173w2()[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    /* renamed from: k */
    public static final void m50737k(@C12579k SegmentedByteString segmentedByteString, @C12579k C12500m mVar, int i, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(segmentedByteString, "$this$commonWrite");
        Intrinsics.checkNotNullParameter(mVar, "buffer");
        int i4 = i + i2;
        int n = m50740n(segmentedByteString, i);
        while (i < i4) {
            if (n == 0) {
                i3 = 0;
            } else {
                i3 = segmentedByteString.mo27172v2()[n - 1];
            }
            int i5 = segmentedByteString.mo27172v2()[segmentedByteString.mo27173w2().length + n];
            int min = Math.min(i4, (segmentedByteString.mo27172v2()[n] - i3) + i3) - i;
            int i6 = i5 + (i - i3);
            C12498l0 l0Var = new C12498l0(segmentedByteString.mo27173w2()[n], i6, i6 + min, true, false);
            C12498l0 l0Var2 = mVar.f30464a;
            if (l0Var2 == null) {
                l0Var.f30463g = l0Var;
                l0Var.f30462f = l0Var;
                mVar.f30464a = l0Var;
            } else {
                Intrinsics.checkNotNull(l0Var2);
                C12498l0 l0Var3 = l0Var2.f30463g;
                Intrinsics.checkNotNull(l0Var3);
                l0Var3.mo27322c(l0Var);
            }
            i += min;
            n++;
        }
        mVar.mo27354V(mVar.mo27362c0() + ((long) i2));
    }

    /* renamed from: l */
    public static final void m50738l(SegmentedByteString segmentedByteString, int i, int i2, C11305q<? super byte[], ? super Integer, ? super Integer, C11079d2> qVar) {
        int i3;
        int n = m50740n(segmentedByteString, i);
        while (i < i2) {
            if (n == 0) {
                i3 = 0;
            } else {
                i3 = segmentedByteString.mo27172v2()[n - 1];
            }
            int i4 = segmentedByteString.mo27172v2()[segmentedByteString.mo27173w2().length + n];
            int min = Math.min(i2, (segmentedByteString.mo27172v2()[n] - i3) + i3) - i;
            qVar.invoke(segmentedByteString.mo27173w2()[n], Integer.valueOf(i4 + (i - i3)), Integer.valueOf(min));
            i += min;
            n++;
        }
    }

    /* renamed from: m */
    public static final void m50739m(@C12579k SegmentedByteString segmentedByteString, @C12579k C11305q<? super byte[], ? super Integer, ? super Integer, C11079d2> qVar) {
        Intrinsics.checkNotNullParameter(segmentedByteString, "$this$forEachSegment");
        Intrinsics.checkNotNullParameter(qVar, "action");
        int length = segmentedByteString.mo27173w2().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = segmentedByteString.mo27172v2()[length + i];
            int i4 = segmentedByteString.mo27172v2()[i];
            qVar.invoke(segmentedByteString.mo27173w2()[i], Integer.valueOf(i3), Integer.valueOf(i4 - i2));
            i++;
            i2 = i4;
        }
    }

    /* renamed from: n */
    public static final int m50740n(@C12579k SegmentedByteString segmentedByteString, int i) {
        Intrinsics.checkNotNullParameter(segmentedByteString, "$this$segment");
        int b = m50728b(segmentedByteString.mo27172v2(), i + 1, 0, segmentedByteString.mo27173w2().length);
        if (b >= 0) {
            return b;
        }
        return ~b;
    }
}

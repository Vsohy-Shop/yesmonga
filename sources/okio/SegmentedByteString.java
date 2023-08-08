package okio;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.C11076d0;
import kotlin.collections.C10956m;
import kotlin.jvm.internal.Intrinsics;
import okio.internal.C12485e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u001d0:\u0012\u0006\u0010E\u001a\u00020@¢\u0006\u0004\bF\u0010GJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0001H\u0016J\b\u0010\u000b\u001a\u00020\u0001H\u0016J\u0017\u0010\r\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\u0018\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0013H\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0013H\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u001e\u001a\u00020\u001dH\u0016J\b\u0010 \u001a\u00020\u001fH\u0016J\u0010\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0016J'\u0010)\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u0013H\u0010¢\u0006\u0004\b)\u0010*J(\u0010.\u001a\u00020-2\u0006\u0010'\u001a\u00020\u00132\u0006\u0010+\u001a\u00020\u00012\u0006\u0010,\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u0013H\u0016J(\u0010/\u001a\u00020-2\u0006\u0010'\u001a\u00020\u00132\u0006\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u0013H\u0016J\u0018\u00101\u001a\u00020\u00132\u0006\u0010+\u001a\u00020\u001d2\u0006\u00100\u001a\u00020\u0013H\u0016J\u0018\u00102\u001a\u00020\u00132\u0006\u0010+\u001a\u00020\u001d2\u0006\u00100\u001a\u00020\u0013H\u0016J\u000f\u00103\u001a\u00020\u001dH\u0010¢\u0006\u0004\b3\u00104J\u0013\u00106\u001a\u00020-2\b\u0010+\u001a\u0004\u0018\u000105H\u0002J\b\u00107\u001a\u00020\u0013H\u0016J\b\u00108\u001a\u00020\u0006H\u0016J\b\u00109\u001a\u00020\u0001H\u0002R \u0010?\u001a\b\u0012\u0004\u0012\u00020\u001d0:8\u0000X\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010E\u001a\u00020@8\u0000X\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D¨\u0006H"}, mo22516d2 = {"Lokio/SegmentedByteString;", "Lokio/ByteString;", "Ljava/lang/Object;", "writeReplace", "Ljava/nio/charset/Charset;", "charset", "", "k2", "r", "t0", "p2", "q2", "algorithm", "Q", "(Ljava/lang/String;)Lokio/ByteString;", "key", "u0", "(Ljava/lang/String;Lokio/ByteString;)Lokio/ByteString;", "w", "", "beginIndex", "endIndex", "n2", "pos", "", "c1", "(I)B", "o0", "()I", "", "r2", "Ljava/nio/ByteBuffer;", "q", "Ljava/io/OutputStream;", "out", "Lkotlin/d2;", "t2", "Lokio/m;", "buffer", "offset", "byteCount", "u2", "(Lokio/m;II)V", "other", "otherOffset", "", "H1", "L1", "fromIndex", "N0", "q1", "U0", "()[B", "", "equals", "hashCode", "toString", "x2", "", "e", "[[B", "w2", "()[[B", "segments", "", "f", "[I", "v2", "()[I", "directory", "<init>", "([[B[I)V", "okio"}, mo22517k = 1, mo22518mv = {1, 4, 1})
public final class SegmentedByteString extends ByteString {
    @C12579k

    /* renamed from: e */
    public final transient byte[][] f30391e;
    @C12579k

    /* renamed from: f */
    public final transient int[] f30392f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SegmentedByteString(@C12579k byte[][] bArr, @C12579k int[] iArr) {
        super(ByteString.f30387c.mo27135m0());
        Intrinsics.checkNotNullParameter(bArr, "segments");
        Intrinsics.checkNotNullParameter(iArr, "directory");
        this.f30391e = bArr;
        this.f30392f = iArr;
    }

    private final Object writeReplace() {
        ByteString x2 = mo27174x2();
        if (x2 != null) {
            return x2;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
    }

    /* renamed from: H1 */
    public boolean mo27108H1(int i, @C12579k ByteString byteString, int i2, int i3) {
        int i4;
        Intrinsics.checkNotNullParameter(byteString, "other");
        if (i < 0 || i > size() - i3) {
            return false;
        }
        int i5 = i3 + i;
        int n = C12485e.m50740n(this, i);
        while (i < i5) {
            if (n == 0) {
                i4 = 0;
            } else {
                i4 = mo27172v2()[n - 1];
            }
            int i6 = mo27172v2()[mo27173w2().length + n];
            int min = Math.min(i5, (mo27172v2()[n] - i4) + i4) - i;
            if (!byteString.mo27111L1(i2, mo27173w2()[n], i6 + (i - i4), min)) {
                return false;
            }
            i2 += min;
            i += min;
            n++;
        }
        return true;
    }

    /* renamed from: L1 */
    public boolean mo27111L1(int i, @C12579k byte[] bArr, int i2, int i3) {
        int i4;
        Intrinsics.checkNotNullParameter(bArr, "other");
        if (i < 0 || i > size() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i5 = i3 + i;
        int n = C12485e.m50740n(this, i);
        while (i < i5) {
            if (n == 0) {
                i4 = 0;
            } else {
                i4 = mo27172v2()[n - 1];
            }
            int i6 = mo27172v2()[mo27173w2().length + n];
            int min = Math.min(i5, (mo27172v2()[n] - i4) + i4) - i;
            if (!C12487j.m50747d(mo27173w2()[n], i6 + (i - i4), bArr, i2, min)) {
                return false;
            }
            i2 += min;
            i += min;
            n++;
        }
        return true;
    }

    /* renamed from: N0 */
    public int mo27112N0(@C12579k byte[] bArr, int i) {
        Intrinsics.checkNotNullParameter(bArr, "other");
        return mo27174x2().mo27112N0(bArr, i);
    }

    @C12579k
    /* renamed from: Q */
    public ByteString mo27113Q(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "algorithm");
        MessageDigest instance = MessageDigest.getInstance(str);
        int length = mo27173w2().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = mo27172v2()[length + i];
            int i4 = mo27172v2()[i];
            instance.update(mo27173w2()[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] digest = instance.digest();
        Intrinsics.checkNotNullExpressionValue(digest, "digestBytes");
        return new ByteString(digest);
    }

    @C12579k
    /* renamed from: U0 */
    public byte[] mo27115U0() {
        return mo27147r2();
    }

    /* renamed from: c1 */
    public byte mo27120c1(int i) {
        int i2;
        C12487j.m50748e((long) mo27172v2()[mo27173w2().length - 1], (long) i, 1);
        int n = C12485e.m50740n(this, i);
        if (n == 0) {
            i2 = 0;
        } else {
            i2 = mo27172v2()[n - 1];
        }
        return mo27173w2()[n][(i - i2) + mo27172v2()[mo27173w2().length + n]];
    }

    public boolean equals(@C12580l Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == size() && mo27108H1(0, byteString, 0, size())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int n0 = mo27137n0();
        if (n0 != 0) {
            return n0;
        }
        int length = mo27173w2().length;
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        while (i < length) {
            int i4 = mo27172v2()[length + i];
            int i5 = mo27172v2()[i];
            byte[] bArr = mo27173w2()[i];
            int i6 = (i5 - i3) + i4;
            while (i4 < i6) {
                i2 = (i2 * 31) + bArr[i4];
                i4++;
            }
            i++;
            i3 = i5;
        }
        mo27114T1(i2);
        return i2;
    }

    @C12579k
    /* renamed from: k2 */
    public String mo27133k2(@C12579k Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return mo27174x2().mo27133k2(charset);
    }

    @C12579k
    /* renamed from: n2 */
    public ByteString mo27139n2(int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        int i3 = 0;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 <= size()) {
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
                } else if (i == 0 && i2 == size()) {
                    return this;
                } else {
                    if (i == i2) {
                        return ByteString.f30387c;
                    }
                    int n = C12485e.m50740n(this, i);
                    int n2 = C12485e.m50740n(this, i2 - 1);
                    byte[][] bArr = (byte[][]) C10956m.m41088M1(mo27173w2(), n, n2 + 1);
                    int[] iArr = new int[(bArr.length * 2)];
                    if (n <= n2) {
                        int i5 = 0;
                        int i6 = n;
                        while (true) {
                            iArr[i5] = Math.min(mo27172v2()[i6] - i, i4);
                            int i7 = i5 + 1;
                            iArr[i5 + bArr.length] = mo27172v2()[mo27173w2().length + i6];
                            if (i6 == n2) {
                                break;
                            }
                            i6++;
                            i5 = i7;
                        }
                    }
                    if (n != 0) {
                        i3 = mo27172v2()[n - 1];
                    }
                    int length = bArr.length;
                    iArr[length] = iArr[length] + (i - i3);
                    return new SegmentedByteString(bArr, iArr);
                }
            } else {
                throw new IllegalArgumentException(("endIndex=" + i2 + " > length(" + size() + ')').toString());
            }
        } else {
            throw new IllegalArgumentException(("beginIndex=" + i + " < 0").toString());
        }
    }

    /* renamed from: o0 */
    public int mo27140o0() {
        return mo27172v2()[mo27173w2().length - 1];
    }

    @C12579k
    /* renamed from: p2 */
    public ByteString mo27142p2() {
        return mo27174x2().mo27142p2();
    }

    @C12579k
    /* renamed from: q */
    public ByteBuffer mo27143q() {
        ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(mo27147r2()).asReadOnlyBuffer();
        Intrinsics.checkNotNullExpressionValue(asReadOnlyBuffer, "ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer()");
        return asReadOnlyBuffer;
    }

    /* renamed from: q1 */
    public int mo27144q1(@C12579k byte[] bArr, int i) {
        Intrinsics.checkNotNullParameter(bArr, "other");
        return mo27174x2().mo27144q1(bArr, i);
    }

    @C12579k
    /* renamed from: q2 */
    public ByteString mo27145q2() {
        return mo27174x2().mo27145q2();
    }

    @C12579k
    /* renamed from: r */
    public String mo27146r() {
        return mo27174x2().mo27146r();
    }

    @C12579k
    /* renamed from: r2 */
    public byte[] mo27147r2() {
        byte[] bArr = new byte[size()];
        int length = mo27173w2().length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int i4 = mo27172v2()[length + i];
            int i5 = mo27172v2()[i];
            int i6 = i5 - i2;
            C10956m.m41147W0(mo27173w2()[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @C12579k
    /* renamed from: t0 */
    public String mo27150t0() {
        return mo27174x2().mo27150t0();
    }

    /* renamed from: t2 */
    public void mo27151t2(@C12579k OutputStream outputStream) throws IOException {
        Intrinsics.checkNotNullParameter(outputStream, "out");
        int length = mo27173w2().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = mo27172v2()[length + i];
            int i4 = mo27172v2()[i];
            outputStream.write(mo27173w2()[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
    }

    @C12579k
    public String toString() {
        return mo27174x2().toString();
    }

    @C12579k
    /* renamed from: u0 */
    public ByteString mo27153u0(@C12579k String str, @C12579k ByteString byteString) {
        Intrinsics.checkNotNullParameter(str, "algorithm");
        Intrinsics.checkNotNullParameter(byteString, "key");
        try {
            Mac instance = Mac.getInstance(str);
            instance.init(new SecretKeySpec(byteString.mo27147r2(), str));
            int length = mo27173w2().length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = mo27172v2()[length + i];
                int i4 = mo27172v2()[i];
                instance.update(mo27173w2()[i], i3, i4 - i2);
                i++;
                i2 = i4;
            }
            byte[] doFinal = instance.doFinal();
            Intrinsics.checkNotNullExpressionValue(doFinal, "mac.doFinal()");
            return new ByteString(doFinal);
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: u2 */
    public void mo27154u2(@C12579k C12500m mVar, int i, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(mVar, "buffer");
        int i4 = i + i2;
        int n = C12485e.m50740n(this, i);
        while (i < i4) {
            if (n == 0) {
                i3 = 0;
            } else {
                i3 = mo27172v2()[n - 1];
            }
            int i5 = mo27172v2()[mo27173w2().length + n];
            int min = Math.min(i4, (mo27172v2()[n] - i3) + i3) - i;
            int i6 = i5 + (i - i3);
            C12498l0 l0Var = new C12498l0(mo27173w2()[n], i6, i6 + min, true, false);
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

    @C12579k
    /* renamed from: v2 */
    public final int[] mo27172v2() {
        return this.f30392f;
    }

    @C12579k
    /* renamed from: w */
    public String mo27155w() {
        return mo27174x2().mo27155w();
    }

    @C12579k
    /* renamed from: w2 */
    public final byte[][] mo27173w2() {
        return this.f30391e;
    }

    /* renamed from: x2 */
    public final ByteString mo27174x2() {
        return new ByteString(mo27147r2());
    }
}

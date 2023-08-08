package okio;

import androidx.constraintlayout.core.motion.utils.C16717v;
import androidx.exifinterface.media.C19135a;
import com.contentsquare.android.api.C14092c;
import com.google.android.material.slider.C31570c;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.urbanairship.push.notifications.C9527p;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.collections.C10956m;
import kotlin.jvm.C11287e;
import kotlin.jvm.C11314h;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.C11354n;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11602d;
import kotlin.text.C11626x;
import okhttp3.internal.connection.RealConnection;
import okio.internal.C12481a;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.joda.time.DateTimeFieldType;

/* renamed from: okio.m */
public final class C12500m implements C12507o, C12505n, Cloneable, ByteChannel {
    @C12580l
    @C11287e

    /* renamed from: a */
    public C12498l0 f30464a;

    /* renamed from: b */
    public long f30465b;

    /* renamed from: okio.m$a */
    public static final class C12501a implements Closeable {
        @C12580l
        @C11287e

        /* renamed from: a */
        public C12500m f30466a;
        @C11287e

        /* renamed from: b */
        public boolean f30467b;
        @C12580l

        /* renamed from: c */
        public C12498l0 f30468c;
        @C11287e

        /* renamed from: d */
        public long f30469d = -1;
        @C12580l
        @C11287e

        /* renamed from: e */
        public byte[] f30470e;
        @C11287e

        /* renamed from: f */
        public int f30471f = -1;
        @C11287e

        /* renamed from: g */
        public int f30472g = -1;

        /* renamed from: a */
        public final long mo27390a(int i) {
            boolean z;
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
                    C12500m mVar = this.f30466a;
                    if (mVar == null) {
                        throw new IllegalStateException("not attached to a buffer".toString());
                    } else if (this.f30467b) {
                        long c0 = mVar.mo27362c0();
                        C12498l0 q0 = mVar.mo27380q0(i);
                        int i2 = 8192 - q0.f30459c;
                        q0.f30459c = 8192;
                        long j = (long) i2;
                        mVar.mo27354V(c0 + j);
                        mo27396g(q0);
                        this.f30469d = c0;
                        this.f30470e = q0.f30457a;
                        this.f30471f = 8192 - i2;
                        this.f30472g = 8192;
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

        @C12580l
        /* renamed from: b */
        public final C12498l0 mo27391b() {
            return this.f30468c;
        }

        /* renamed from: c */
        public final int mo27392c() {
            boolean z;
            long j;
            long j2 = this.f30469d;
            C12500m mVar = this.f30466a;
            Intrinsics.checkNotNull(mVar);
            if (j2 != mVar.mo27362c0()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                long j3 = this.f30469d;
                if (j3 == -1) {
                    j = 0;
                } else {
                    j = j3 + ((long) (this.f30472g - this.f30471f));
                }
                return mo27395f(j);
            }
            throw new IllegalStateException("no more bytes".toString());
        }

        public void close() {
            boolean z;
            if (this.f30466a != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f30466a = null;
                mo27396g((C12498l0) null);
                this.f30469d = -1;
                this.f30470e = null;
                this.f30471f = -1;
                this.f30472g = -1;
                return;
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }

        /* renamed from: d */
        public final long mo27394d(long j) {
            boolean z;
            long j2 = j;
            C12500m mVar = this.f30466a;
            if (mVar == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            } else if (this.f30467b) {
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
                        mo27396g((C12498l0) null);
                        this.f30469d = j2;
                        this.f30470e = null;
                        this.f30471f = -1;
                        this.f30472g = -1;
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
                            mo27396g(q0);
                            this.f30469d = c0;
                            this.f30470e = q0.f30457a;
                            int i4 = q0.f30459c;
                            this.f30471f = i4 - min;
                            this.f30472g = i4;
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

        /* renamed from: f */
        public final int mo27395f(long j) {
            C12498l0 l0Var;
            C12500m mVar = this.f30466a;
            if (mVar == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            } else if (j < ((long) -1) || j > mVar.mo27362c0()) {
                throw new ArrayIndexOutOfBoundsException("offset=" + j + " > size=" + mVar.mo27362c0());
            } else if (j == -1 || j == mVar.mo27362c0()) {
                mo27396g((C12498l0) null);
                this.f30469d = j;
                this.f30470e = null;
                this.f30471f = -1;
                this.f30472g = -1;
                return -1;
            } else {
                long c0 = mVar.mo27362c0();
                C12498l0 l0Var2 = mVar.f30464a;
                long j2 = 0;
                if (mo27391b() != null) {
                    long j3 = this.f30469d;
                    int i = this.f30471f;
                    C12498l0 b = mo27391b();
                    Intrinsics.checkNotNull(b);
                    long j4 = j3 - ((long) (i - b.f30458b));
                    if (j4 > j) {
                        l0Var = l0Var2;
                        l0Var2 = mo27391b();
                        c0 = j4;
                    } else {
                        l0Var = mo27391b();
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
                if (this.f30467b) {
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
                mo27396g(l0Var);
                this.f30469d = j;
                Intrinsics.checkNotNull(l0Var);
                this.f30470e = l0Var.f30457a;
                int i4 = l0Var.f30458b + ((int) (j - j2));
                this.f30471f = i4;
                int i5 = l0Var.f30459c;
                this.f30472g = i5;
                return i5 - i4;
            }
        }

        /* renamed from: g */
        public final void mo27396g(@C12580l C12498l0 l0Var) {
            this.f30468c = l0Var;
        }
    }

    /* renamed from: okio.m$c */
    public static final class C12503c extends OutputStream {

        /* renamed from: a */
        public final /* synthetic */ C12500m f30474a;

        public C12503c(C12500m mVar) {
            this.f30474a = mVar;
        }

        public void close() {
        }

        public void flush() {
        }

        @C12579k
        public String toString() {
            return this.f30474a + ".outputStream()";
        }

        public void write(int i) {
            this.f30474a.mo27225K2(i);
        }

        public void write(@C12579k byte[] bArr, int i, int i2) {
            Intrinsics.checkNotNullParameter(bArr, "data");
            this.f30474a.mo27235k3(bArr, i, i2);
        }
    }

    /* renamed from: D1 */
    public static /* synthetic */ C12500m m50840D1(C12500m mVar, OutputStream outputStream, long j, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            j = mVar.f30465b;
        }
        return mVar.mo27328B1(outputStream, j);
    }

    /* renamed from: N */
    public static /* synthetic */ C12501a m50841N(C12500m mVar, C12501a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = new C12501a();
        }
        return mVar.mo27343L(aVar);
    }

    /* renamed from: U */
    public static /* synthetic */ C12501a m50842U(C12500m mVar, C12501a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = new C12501a();
        }
        return mVar.mo27352T(aVar);
    }

    /* renamed from: t */
    public static /* synthetic */ C12500m m50843t(C12500m mVar, OutputStream outputStream, long j, long j2, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = mVar.f30465b - j3;
        }
        return mVar.mo27377n(outputStream, j3, j2);
    }

    /* renamed from: u */
    public static /* synthetic */ C12500m m50844u(C12500m mVar, C12500m mVar2, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        return mVar.mo27379o(mVar2, j);
    }

    /* renamed from: v */
    public static /* synthetic */ C12500m m50845v(C12500m mVar, C12500m mVar2, long j, long j2, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        return mVar.mo27383s(mVar2, j, j2);
    }

    @C12579k
    /* renamed from: B */
    public C12500m mo27241u0() {
        return this;
    }

    @C12579k
    @C11315i
    /* renamed from: B1 */
    public final C12500m mo27328B1(@C12579k OutputStream outputStream, long j) throws IOException {
        Intrinsics.checkNotNullParameter(outputStream, "out");
        C12487j.m50748e(this.f30465b, 0, j);
        C12498l0 l0Var = this.f30464a;
        while (j > 0) {
            Intrinsics.checkNotNull(l0Var);
            int min = (int) Math.min(j, (long) (l0Var.f30459c - l0Var.f30458b));
            outputStream.write(l0Var.f30457a, l0Var.f30458b, min);
            int i = l0Var.f30458b + min;
            l0Var.f30458b = i;
            long j2 = (long) min;
            this.f30465b -= j2;
            j -= j2;
            if (i == l0Var.f30459c) {
                C12498l0 b = l0Var.mo27321b();
                this.f30464a = b;
                C12504m0.m50967d(l0Var);
                l0Var = b;
            }
        }
        return this;
    }

    @C12579k
    /* renamed from: B3 */
    public String mo27268B3() {
        return mo27270E3(this.f30465b, C11602d.f28868b);
    }

    @C12579k
    /* renamed from: C */
    public C12500m mo27229Y0() {
        return this;
    }

    @C11314h(name = "getByte")
    /* renamed from: D */
    public final byte mo27330D(long j) {
        C12487j.m50748e(mo27362c0(), j, 1);
        C12498l0 l0Var = this.f30464a;
        if (l0Var == null) {
            Intrinsics.checkNotNull((Object) null);
            throw null;
        } else if (mo27362c0() - j < j) {
            long c0 = mo27362c0();
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

    @C12579k
    /* renamed from: D0 */
    public C12500m mo27221B2(@C12579k ByteString byteString, int i, int i2) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.mo27154u2(this, i, i2);
        return this;
    }

    /* renamed from: E */
    public final ByteString mo27332E(String str, ByteString byteString) {
        try {
            Mac instance = Mac.getInstance(str);
            instance.init(new SecretKeySpec(byteString.mo27115U0(), str));
            C12498l0 l0Var = this.f30464a;
            if (l0Var != null) {
                byte[] bArr = l0Var.f30457a;
                int i = l0Var.f30458b;
                instance.update(bArr, i, l0Var.f30459c - i);
                C12498l0 l0Var2 = l0Var.f30462f;
                Intrinsics.checkNotNull(l0Var2);
                while (l0Var2 != l0Var) {
                    byte[] bArr2 = l0Var2.f30457a;
                    int i2 = l0Var2.f30458b;
                    instance.update(bArr2, i2, l0Var2.f30459c - i2);
                    l0Var2 = l0Var2.f30462f;
                    Intrinsics.checkNotNull(l0Var2);
                }
            }
            byte[] doFinal = instance.doFinal();
            Intrinsics.checkNotNullExpressionValue(doFinal, "mac.doFinal()");
            return new ByteString(doFinal);
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @C12579k
    /* renamed from: E0 */
    public C12500m mo27239s3(@C12579k C12510p0 p0Var, long j) throws IOException {
        Intrinsics.checkNotNullParameter(p0Var, "source");
        while (j > 0) {
            long read = p0Var.read(this, j);
            if (read != -1) {
                j -= read;
            } else {
                throw new EOFException();
            }
        }
        return this;
    }

    /* renamed from: E1 */
    public boolean mo27269E1(long j) {
        return this.f30465b >= j;
    }

    @C12579k
    /* renamed from: E3 */
    public String mo27270E3(long j, @C12579k Charset charset) throws EOFException {
        boolean z;
        Intrinsics.checkNotNullParameter(charset, "charset");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0 || j > ((long) Integer.MAX_VALUE)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        } else if (this.f30465b < j) {
            throw new EOFException();
        } else if (i == 0) {
            return "";
        } else {
            C12498l0 l0Var = this.f30464a;
            Intrinsics.checkNotNull(l0Var);
            int i2 = l0Var.f30458b;
            if (((long) i2) + j > ((long) l0Var.f30459c)) {
                return new String(mo27278O1(j), charset);
            }
            int i3 = (int) j;
            String str = new String(l0Var.f30457a, i2, i3, charset);
            int i4 = l0Var.f30458b + i3;
            l0Var.f30458b = i4;
            this.f30465b -= j;
            if (i4 == l0Var.f30459c) {
                this.f30464a = l0Var.mo27321b();
                C12504m0.m50967d(l0Var);
            }
            return str;
        }
    }

    @C12579k
    /* renamed from: F */
    public final ByteString mo27334F(@C12579k ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "key");
        return mo27332E("HmacSHA1", byteString);
    }

    @C12579k
    /* renamed from: F0 */
    public C12500m mo27226Q1(@C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "source");
        return mo27235k3(bArr, 0, bArr.length);
    }

    @C12579k
    /* renamed from: F1 */
    public C12500m mo27236l1(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, C16717v.C16719b.f42182e);
        return mo27242v1(str, 0, str.length());
    }

    @C12579k
    /* renamed from: G */
    public final ByteString mo27337G(@C12579k ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "key");
        return mo27332E("HmacSHA256", byteString);
    }

    @C12579k
    /* renamed from: G2 */
    public byte[] mo27271G2() {
        return mo27278O1(mo27362c0());
    }

    @C12579k
    /* renamed from: H */
    public C12500m mo27272H() {
        return this;
    }

    @C12579k
    /* renamed from: H0 */
    public C12500m mo27235k3(@C12579k byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "source");
        long j = (long) i2;
        C12487j.m50748e((long) bArr.length, (long) i, j);
        int i3 = i2 + i;
        while (i < i3) {
            C12498l0 q0 = mo27380q0(1);
            int min = Math.min(i3 - i, 8192 - q0.f30459c);
            int i4 = i + min;
            C10956m.m41147W0(bArr, q0.f30457a, q0.f30459c, i, i4);
            q0.f30459c += min;
            i = i4;
        }
        mo27354V(mo27362c0() + j);
        return this;
    }

    @C12579k
    /* renamed from: H1 */
    public C12500m mo27242v1(@C12579k String str, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        char c;
        Intrinsics.checkNotNullParameter(str, C16717v.C16719b.f42182e);
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 >= i) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i2 <= str.length()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    while (i < i2) {
                        char charAt = str.charAt(i);
                        if (charAt < 128) {
                            C12498l0 q0 = mo27380q0(1);
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
                            mo27354V(mo27362c0() + ((long) i6));
                            i = i4;
                        } else {
                            if (charAt < 2048) {
                                C12498l0 q02 = mo27380q0(2);
                                byte[] bArr2 = q02.f30457a;
                                int i7 = q02.f30459c;
                                bArr2[i7] = (byte) ((charAt >> 6) | C14092c.f34560U);
                                bArr2[i7 + 1] = (byte) ((charAt & '?') | 128);
                                q02.f30459c = i7 + 2;
                                mo27354V(mo27362c0() + 2);
                            } else if (charAt < 55296 || charAt > 57343) {
                                C12498l0 q03 = mo27380q0(3);
                                byte[] bArr3 = q03.f30457a;
                                int i8 = q03.f30459c;
                                bArr3[i8] = (byte) ((charAt >> 12) | 224);
                                bArr3[i8 + 1] = (byte) ((63 & (charAt >> 6)) | 128);
                                bArr3[i8 + 2] = (byte) ((charAt & '?') | 128);
                                q03.f30459c = i8 + 3;
                                mo27354V(mo27362c0() + 3);
                            } else {
                                int i9 = i + 1;
                                if (i9 < i2) {
                                    c = str.charAt(i9);
                                } else {
                                    c = 0;
                                }
                                if (charAt > 56319 || 56320 > c || 57343 < c) {
                                    mo27225K2(63);
                                    i = i9;
                                } else {
                                    int i10 = (((charAt & 1023) << 10) | (c & 1023)) + 0;
                                    C12498l0 q04 = mo27380q0(4);
                                    byte[] bArr4 = q04.f30457a;
                                    int i11 = q04.f30459c;
                                    bArr4[i11] = (byte) ((i10 >> 18) | C9527p.f26031b);
                                    bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                                    bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                                    bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                                    q04.f30459c = i11 + 4;
                                    mo27354V(mo27362c0() + 4);
                                    i += 2;
                                }
                            }
                            i++;
                        }
                    }
                    return this;
                }
                throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
            }
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
    }

    @C12579k
    /* renamed from: I */
    public final ByteString mo27340I(@C12579k ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "key");
        return mo27332E("HmacSHA512", byteString);
    }

    @C12579k
    /* renamed from: J */
    public final ByteString mo27341J() {
        return mo27387x("MD5");
    }

    /* renamed from: J0 */
    public long mo27273J0(@C12579k ByteString byteString) throws IOException {
        Intrinsics.checkNotNullParameter(byteString, "bytes");
        return mo27299m0(byteString, 0);
    }

    @C12579k
    /* renamed from: J1 */
    public String mo27274J1() throws EOFException {
        return mo27290b1(Long.MAX_VALUE);
    }

    /* renamed from: J2 */
    public boolean mo27275J2() {
        return this.f30465b == 0;
    }

    @C12579k
    @C11315i
    /* renamed from: K */
    public final C12501a mo27342K() {
        return m50841N(this, (C12501a) null, 1, (Object) null);
    }

    @C12579k
    @C11315i
    /* renamed from: L */
    public final C12501a mo27343L(@C12579k C12501a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "unsafeCursor");
        return C12481a.m50623s(this, aVar);
    }

    @C12579k
    /* renamed from: L0 */
    public C12500m mo27225K2(int i) {
        C12498l0 q0 = mo27380q0(1);
        byte[] bArr = q0.f30457a;
        int i2 = q0.f30459c;
        q0.f30459c = i2 + 1;
        bArr[i2] = (byte) i;
        mo27354V(mo27362c0() + 1);
        return this;
    }

    /* renamed from: M3 */
    public long mo27276M3(@C12579k C12506n0 n0Var) throws IOException {
        Intrinsics.checkNotNullParameter(n0Var, "sink");
        long c0 = mo27362c0();
        if (c0 > 0) {
            n0Var.write(this, c0);
        }
        return c0;
    }

    /* renamed from: N1 */
    public boolean mo27277N1(long j, @C12579k ByteString byteString, int i, int i2) {
        Intrinsics.checkNotNullParameter(byteString, "bytes");
        if (j < 0 || i < 0 || i2 < 0 || mo27362c0() - j < ((long) i2) || byteString.size() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (mo27330D(((long) i3) + j) != byteString.mo27126f0(i + i3)) {
                return false;
            }
        }
        return true;
    }

    @C12579k
    /* renamed from: O */
    public final C12500m mo27345O(@C12579k InputStream inputStream) throws IOException {
        Intrinsics.checkNotNullParameter(inputStream, "input");
        mo27349R(inputStream, Long.MAX_VALUE, true);
        return this;
    }

    @C12579k
    /* renamed from: O0 */
    public C12500m mo27233g2(long j) {
        boolean z;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i == 0) {
            return mo27225K2(48);
        }
        int i2 = 1;
        if (i < 0) {
            j = -j;
            if (j < 0) {
                return mo27236l1("-9223372036854775808");
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
        C12498l0 q0 = mo27380q0(i2);
        byte[] bArr = q0.f30457a;
        int i3 = q0.f30459c + i2;
        while (j != 0) {
            long j2 = (long) 10;
            i3--;
            bArr[i3] = C12481a.m50606g0()[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr[i3 - 1] = (byte) 45;
        }
        q0.f30459c += i2;
        mo27354V(mo27362c0() + ((long) i2));
        return this;
    }

    @C12579k
    /* renamed from: O1 */
    public byte[] mo27278O1(long j) throws EOFException {
        boolean z;
        if (j < 0 || j > ((long) Integer.MAX_VALUE)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        } else if (mo27362c0() >= j) {
            byte[] bArr = new byte[((int) j)];
            readFully(bArr);
            return bArr;
        } else {
            throw new EOFException();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        if (r1 != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        r0.readByte();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006e, code lost:
        throw new java.lang.NumberFormatException("Number too large: " + r0.mo27268B3());
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009f A[EDGE_INSN: B:47:0x009f->B:29:0x009f ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x001e  */
    /* renamed from: O2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo27279O2() throws java.io.EOFException {
        /*
            r15 = this;
            long r0 = r15.mo27362c0()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x00c1
            r0 = 0
            r4 = -7
            r1 = r0
            r5 = r4
            r3 = r2
            r2 = r1
        L_0x0011:
            okio.l0 r7 = r15.f30464a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            byte[] r8 = r7.f30457a
            int r9 = r7.f30458b
            int r10 = r7.f30459c
        L_0x001c:
            if (r9 >= r10) goto L_0x009f
            byte r11 = r8[r9]
            r12 = 48
            byte r12 = (byte) r12
            if (r11 < r12) goto L_0x006f
            r13 = 57
            byte r13 = (byte) r13
            if (r11 > r13) goto L_0x006f
            int r12 = r12 - r11
            r13 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r13 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r13 < 0) goto L_0x0042
            if (r13 != 0) goto L_0x003c
            long r13 = (long) r12
            int r13 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r13 >= 0) goto L_0x003c
            goto L_0x0042
        L_0x003c:
            r13 = 10
            long r3 = r3 * r13
            long r11 = (long) r12
            long r3 = r3 + r11
            goto L_0x007b
        L_0x0042:
            okio.m r0 = new okio.m
            r0.<init>()
            okio.m r0 = r0.mo27233g2(r3)
            okio.m r0 = r0.mo27225K2(r11)
            if (r1 != 0) goto L_0x0054
            r0.readByte()
        L_0x0054:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.mo27268B3()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x006f:
            r12 = 45
            byte r12 = (byte) r12
            r13 = 1
            if (r11 != r12) goto L_0x0080
            if (r0 != 0) goto L_0x0080
            r11 = 1
            long r5 = r5 - r11
            r1 = r13
        L_0x007b:
            int r9 = r9 + 1
            int r0 = r0 + 1
            goto L_0x001c
        L_0x0080:
            if (r0 == 0) goto L_0x0084
            r2 = r13
            goto L_0x009f
        L_0x0084:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9] or '-' character but was 0x"
            r1.append(r2)
            java.lang.String r2 = okio.C12487j.m50758o(r11)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x009f:
            if (r9 != r10) goto L_0x00ab
            okio.l0 r8 = r7.mo27321b()
            r15.f30464a = r8
            okio.C12504m0.m50967d(r7)
            goto L_0x00ad
        L_0x00ab:
            r7.f30458b = r9
        L_0x00ad:
            if (r2 != 0) goto L_0x00b3
            okio.l0 r7 = r15.f30464a
            if (r7 != 0) goto L_0x0011
        L_0x00b3:
            long r5 = r15.mo27362c0()
            long r7 = (long) r0
            long r5 = r5 - r7
            r15.mo27354V(r5)
            if (r1 == 0) goto L_0x00bf
            goto L_0x00c0
        L_0x00bf:
            long r3 = -r3
        L_0x00c0:
            return r3
        L_0x00c1:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.C12500m.mo27279O2():long");
    }

    @C12579k
    /* renamed from: P */
    public final C12500m mo27347P(@C12579k InputStream inputStream, long j) throws IOException {
        boolean z;
        Intrinsics.checkNotNullParameter(inputStream, "input");
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mo27349R(inputStream, j, false);
            return this;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
    }

    @C12579k
    /* renamed from: P1 */
    public C12500m mo27243w0(int i) {
        if (i < 128) {
            mo27225K2(i);
        } else if (i < 2048) {
            C12498l0 q0 = mo27380q0(2);
            byte[] bArr = q0.f30457a;
            int i2 = q0.f30459c;
            bArr[i2] = (byte) ((i >> 6) | C14092c.f34560U);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            q0.f30459c = i2 + 2;
            mo27354V(mo27362c0() + 2);
        } else if (55296 <= i && 57343 >= i) {
            mo27225K2(63);
        } else if (i < 65536) {
            C12498l0 q02 = mo27380q0(3);
            byte[] bArr2 = q02.f30457a;
            int i3 = q02.f30459c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            q02.f30459c = i3 + 3;
            mo27354V(mo27362c0() + 3);
        } else if (i <= 1114111) {
            C12498l0 q03 = mo27380q0(4);
            byte[] bArr3 = q03.f30457a;
            int i4 = q03.f30459c;
            bArr3[i4] = (byte) ((i >> 18) | C9527p.f26031b);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i4 + 3] = (byte) ((i & 63) | 128);
            q03.f30459c = i4 + 4;
            mo27354V(mo27362c0() + 4);
        } else {
            throw new IllegalArgumentException("Unexpected code point: 0x" + C12487j.m50759p(i));
        }
        return this;
    }

    /* renamed from: R */
    public final void mo27349R(InputStream inputStream, long j, boolean z) throws IOException {
        while (true) {
            if (j > 0 || z) {
                C12498l0 q0 = mo27380q0(1);
                int read = inputStream.read(q0.f30457a, q0.f30459c, (int) Math.min(j, (long) (8192 - q0.f30459c)));
                if (read == -1) {
                    if (q0.f30458b == q0.f30459c) {
                        this.f30464a = q0.mo27321b();
                        C12504m0.m50967d(q0);
                    }
                    if (!z) {
                        throw new EOFException();
                    }
                    return;
                }
                q0.f30459c += read;
                long j2 = (long) read;
                this.f30465b += j2;
                j -= j2;
            } else {
                return;
            }
        }
    }

    @C12579k
    /* renamed from: R0 */
    public C12500m mo27237m3(long j) {
        if (j == 0) {
            return mo27225K2(48);
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
        C12498l0 q0 = mo27380q0(i);
        byte[] bArr = q0.f30457a;
        int i2 = q0.f30459c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = C12481a.m50606g0()[(int) (15 & j)];
            j >>>= 4;
        }
        q0.f30459c += i;
        mo27354V(mo27362c0() + ((long) i));
        return this;
    }

    /* renamed from: R1 */
    public short mo27280R1() throws EOFException {
        return C12487j.m50754k(readShort());
    }

    @C12579k
    /* renamed from: R3 */
    public C12507o mo27281R3() {
        return C12465c0.m50481d(new C12476h0(this));
    }

    @C12579k
    @C11315i
    /* renamed from: S */
    public final C12501a mo27351S() {
        return m50842U(this, (C12501a) null, 1, (Object) null);
    }

    /* renamed from: S0 */
    public long mo27282S0(byte b, long j) {
        return mo27285V0(b, j, Long.MAX_VALUE);
    }

    @C12579k
    @C11315i
    /* renamed from: T */
    public final C12501a mo27352T(@C12579k C12501a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "unsafeCursor");
        return C12481a.m50572F(this, aVar);
    }

    /* renamed from: T0 */
    public void mo27283T0(@C12579k C12500m mVar, long j) throws EOFException {
        Intrinsics.checkNotNullParameter(mVar, "sink");
        if (mo27362c0() >= j) {
            mVar.write(this, j);
        } else {
            mVar.write(this, mo27362c0());
            throw new EOFException();
        }
    }

    @C12579k
    /* renamed from: U0 */
    public C12500m mo27246z0(int i) {
        C12498l0 q0 = mo27380q0(4);
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
        mo27354V(mo27362c0() + 4);
        return this;
    }

    /* renamed from: U1 */
    public long mo27284U1() throws EOFException {
        return C12487j.m50753j(readLong());
    }

    /* renamed from: V */
    public final void mo27354V(long j) {
        this.f30465b = j;
    }

    /* renamed from: V0 */
    public long mo27285V0(byte b, long j, long j2) {
        boolean z;
        C12498l0 l0Var;
        long j3;
        int i;
        long j4 = 0;
        if (0 <= j && j2 >= j) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (j2 > mo27362c0()) {
                j2 = mo27362c0();
            }
            if (j == j2 || (l0Var = this.f30464a) == null) {
                return -1;
            }
            if (mo27362c0() - j < j) {
                j3 = mo27362c0();
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
        throw new IllegalArgumentException(("size=" + mo27362c0() + " fromIndex=" + j + " toIndex=" + j2).toString());
    }

    /* renamed from: W0 */
    public long mo27286W0(@C12579k ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "targetBytes");
        return mo27291d2(byteString, 0);
    }

    @C12579k
    /* renamed from: W3 */
    public OutputStream mo27228W3() {
        return new C12503c(this);
    }

    @C12580l
    /* renamed from: X0 */
    public String mo27287X0() throws EOFException {
        long i2 = mo27295i2((byte) 10);
        if (i2 != -1) {
            return C12481a.m50610i0(this, i2);
        }
        if (mo27362c0() != 0) {
            return mo27300n2(mo27362c0());
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009a, code lost:
        if (r8 != r9) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009c, code lost:
        r14.f30464a = r6.mo27321b();
        okio.C12504m0.m50967d(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a6, code lost:
        r6.f30458b = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a8, code lost:
        if (r1 != false) goto L_0x00ae;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x007f A[SYNTHETIC] */
    /* renamed from: X3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo27288X3() throws java.io.EOFException {
        /*
            r14 = this;
            long r0 = r14.mo27362c0()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x00b8
            r0 = 0
            r1 = r0
            r4 = r2
        L_0x000d:
            okio.l0 r6 = r14.f30464a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            byte[] r7 = r6.f30457a
            int r8 = r6.f30458b
            int r9 = r6.f30459c
        L_0x0018:
            if (r8 >= r9) goto L_0x009a
            byte r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0029
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0029
            int r11 = r10 - r11
            goto L_0x0043
        L_0x0029:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0038
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0038
        L_0x0033:
            int r11 = r10 - r11
            int r11 = r11 + 10
            goto L_0x0043
        L_0x0038:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x007b
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x007b
            goto L_0x0033
        L_0x0043:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L_0x0053
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L_0x0018
        L_0x0053:
            okio.m r0 = new okio.m
            r0.<init>()
            okio.m r0 = r0.mo27237m3(r4)
            okio.m r0 = r0.mo27225K2(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.mo27268B3()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x007b:
            if (r0 == 0) goto L_0x007f
            r1 = 1
            goto L_0x009a
        L_0x007f:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = okio.C12487j.m50758o(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x009a:
            if (r8 != r9) goto L_0x00a6
            okio.l0 r7 = r6.mo27321b()
            r14.f30464a = r7
            okio.C12504m0.m50967d(r6)
            goto L_0x00a8
        L_0x00a6:
            r6.f30458b = r8
        L_0x00a8:
            if (r1 != 0) goto L_0x00ae
            okio.l0 r6 = r14.f30464a
            if (r6 != 0) goto L_0x000d
        L_0x00ae:
            long r1 = r14.mo27362c0()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.mo27354V(r1)
            return r4
        L_0x00b8:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.C12500m.mo27288X3():long");
    }

    /* renamed from: Y3 */
    public int mo27289Y3(@C12579k C12471f0 f0Var) {
        Intrinsics.checkNotNullParameter(f0Var, "options");
        int l0 = C12481a.m50616l0(this, f0Var, false, 2, (Object) null);
        if (l0 == -1) {
            return -1;
        }
        skip((long) f0Var.mo27195q()[l0].size());
        return l0;
    }

    @C12579k
    /* renamed from: Z */
    public final ByteString mo27355Z() {
        return mo27387x(CommonUtils.f79238a);
    }

    @C12579k
    /* renamed from: Z0 */
    public C12500m mo27224H2(int i) {
        return mo27246z0(C12487j.m50752i(i));
    }

    @C12579k
    /* renamed from: a0 */
    public final ByteString mo27357a0() {
        return mo27387x("SHA-256");
    }

    @C12579k
    /* renamed from: a1 */
    public C12500m mo27227T3(long j) {
        C12498l0 q0 = mo27380q0(8);
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
        mo27354V(mo27362c0() + 8);
        return this;
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to operator function", replaceWith = @C11587t0(expression = "this[index]", imports = {}))
    @C11314h(name = "-deprecated_getByte")
    /* renamed from: b */
    public final byte mo27359b(long j) {
        return mo27330D(j);
    }

    @C12579k
    /* renamed from: b0 */
    public final ByteString mo27360b0() {
        return mo27387x("SHA-512");
    }

    @C12579k
    /* renamed from: b1 */
    public String mo27290b1(long j) throws EOFException {
        boolean z;
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
            long V0 = mo27285V0(b, 0, j2);
            if (V0 != -1) {
                return C12481a.m50610i0(this, V0);
            }
            if (j2 < mo27362c0() && mo27330D(j2 - 1) == ((byte) 13) && mo27330D(j2) == b) {
                return C12481a.m50610i0(this, j2);
            }
            C12500m mVar = new C12500m();
            mo27383s(mVar, 0, Math.min((long) 32, mo27362c0()));
            throw new EOFException("\\n not found: limit=" + Math.min(mo27362c0(), j) + " content=" + mVar.mo27301n3().mo27150t0() + C11626x.f28899F);
        }
        throw new IllegalArgumentException(("limit < 0: " + j).toString());
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @C11587t0(expression = "size", imports = {}))
    @C11314h(name = "-deprecated_size")
    /* renamed from: c */
    public final long mo27361c() {
        return this.f30465b;
    }

    @C11314h(name = "size")
    /* renamed from: c0 */
    public final long mo27362c0() {
        return this.f30465b;
    }

    @C12579k
    /* renamed from: c1 */
    public C12500m mo27220B0(long j) {
        return mo27227T3(C12487j.m50753j(j));
    }

    public void close() {
    }

    @C12579k
    /* renamed from: d0 */
    public final ByteString mo27365d0() {
        boolean z;
        if (mo27362c0() <= ((long) Integer.MAX_VALUE)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return mo27368g0((int) mo27362c0());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + mo27362c0()).toString());
    }

    /* renamed from: d2 */
    public long mo27291d2(@C12579k ByteString byteString, long j) {
        boolean z;
        long j2;
        int i;
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(byteString, "targetBytes");
        long j3 = 0;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C12498l0 l0Var = this.f30464a;
            if (l0Var == null) {
                return -1;
            }
            if (mo27362c0() - j < j) {
                j2 = mo27362c0();
                while (j2 > j) {
                    l0Var = l0Var.f30463g;
                    Intrinsics.checkNotNull(l0Var);
                    j2 -= (long) (l0Var.f30459c - l0Var.f30458b);
                }
                if (byteString.size() == 2) {
                    byte f0 = byteString.mo27126f0(0);
                    byte f02 = byteString.mo27126f0(1);
                    while (j2 < mo27362c0()) {
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
                    return -1;
                }
                byte[] U0 = byteString.mo27115U0();
                while (j2 < mo27362c0()) {
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
                while (j2 < mo27362c0()) {
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
                return -1;
            }
            byte[] U02 = byteString.mo27115U0();
            while (j2 < mo27362c0()) {
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
            return -1;
            i3 = l0Var.f30458b;
            return ((long) (i2 - i3)) + j2;
        }
        throw new IllegalArgumentException(("fromIndex < 0: " + j).toString());
    }

    @C12579k
    /* renamed from: e */
    public C12500m mo27292e() {
        return this;
    }

    /* JADX WARNING: type inference failed for: r19v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(@org.jetbrains.annotations.C12580l java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            if (r0 != r1) goto L_0x0009
            goto L_0x0081
        L_0x0009:
            boolean r3 = r1 instanceof okio.C12500m
            r4 = 0
            if (r3 != 0) goto L_0x0011
        L_0x000e:
            r2 = r4
            goto L_0x0081
        L_0x0011:
            long r5 = r18.mo27362c0()
            okio.m r1 = (okio.C12500m) r1
            long r7 = r1.mo27362c0()
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0020
            goto L_0x000e
        L_0x0020:
            long r5 = r18.mo27362c0()
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x002b
            goto L_0x0081
        L_0x002b:
            okio.l0 r3 = r0.f30464a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            okio.l0 r1 = r1.f30464a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            int r5 = r3.f30458b
            int r6 = r1.f30458b
            r9 = r7
        L_0x003a:
            long r11 = r18.mo27362c0()
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x0081
            int r11 = r3.f30459c
            int r11 = r11 - r5
            int r12 = r1.f30459c
            int r12 = r12 - r6
            int r11 = java.lang.Math.min(r11, r12)
            long r11 = (long) r11
            r13 = r7
        L_0x004e:
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 >= 0) goto L_0x0069
            byte[] r15 = r3.f30457a
            int r16 = r5 + 1
            byte r5 = r15[r5]
            byte[] r15 = r1.f30457a
            int r17 = r6 + 1
            byte r6 = r15[r6]
            if (r5 == r6) goto L_0x0061
            goto L_0x000e
        L_0x0061:
            r5 = 1
            long r13 = r13 + r5
            r5 = r16
            r6 = r17
            goto L_0x004e
        L_0x0069:
            int r13 = r3.f30459c
            if (r5 != r13) goto L_0x0074
            okio.l0 r3 = r3.f30462f
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            int r5 = r3.f30458b
        L_0x0074:
            int r13 = r1.f30459c
            if (r6 != r13) goto L_0x007f
            okio.l0 r1 = r1.f30462f
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            int r6 = r1.f30458b
        L_0x007f:
            long r9 = r9 + r11
            goto L_0x003a
        L_0x0081:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.C12500m.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final void mo27367f() {
        skip(mo27362c0());
    }

    /* renamed from: f2 */
    public void mo27293f2(long j) throws EOFException {
        if (this.f30465b < j) {
            throw new EOFException();
        }
    }

    public void flush() {
    }

    @C12579k
    /* renamed from: g0 */
    public final ByteString mo27368g0(int i) {
        if (i == 0) {
            return ByteString.f30387c;
        }
        C12487j.m50748e(mo27362c0(), 0, (long) i);
        C12498l0 l0Var = this.f30464a;
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
        C12498l0 l0Var2 = this.f30464a;
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
    /* renamed from: g1 */
    public C12500m mo27247z2(int i) {
        C12498l0 q0 = mo27380q0(2);
        byte[] bArr = q0.f30457a;
        int i2 = q0.f30459c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        q0.f30459c = i3 + 1;
        mo27354V(mo27362c0() + 2);
        return this;
    }

    @C12579k
    /* renamed from: h0 */
    public InputStream mo27294h0() {
        return new C12502b(this);
    }

    public int hashCode() {
        C12498l0 l0Var = this.f30464a;
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
        } while (l0Var != this.f30464a);
        return i;
    }

    @C12579k
    /* renamed from: i */
    public C12500m clone() {
        return mo27374k();
    }

    /* renamed from: i2 */
    public long mo27295i2(byte b) {
        return mo27285V0(b, 0, Long.MAX_VALUE);
    }

    @C12579k
    /* renamed from: i3 */
    public String mo27296i3(@C12579k Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return mo27270E3(this.f30465b, charset);
    }

    public boolean isOpen() {
        return true;
    }

    /* renamed from: j */
    public final long mo27373j() {
        long c0 = mo27362c0();
        if (c0 == 0) {
            return 0;
        }
        C12498l0 l0Var = this.f30464a;
        Intrinsics.checkNotNull(l0Var);
        C12498l0 l0Var2 = l0Var.f30463g;
        Intrinsics.checkNotNull(l0Var2);
        int i = l0Var2.f30459c;
        if (i < 8192 && l0Var2.f30461e) {
            c0 -= (long) (i - l0Var2.f30458b);
        }
        return c0;
    }

    @C12579k
    /* renamed from: k */
    public final C12500m mo27374k() {
        C12500m mVar = new C12500m();
        if (mo27362c0() != 0) {
            C12498l0 l0Var = this.f30464a;
            Intrinsics.checkNotNull(l0Var);
            C12498l0 d = l0Var.mo27323d();
            mVar.f30464a = d;
            d.f30463g = d;
            d.f30462f = d;
            for (C12498l0 l0Var2 = l0Var.f30462f; l0Var2 != l0Var; l0Var2 = l0Var2.f30462f) {
                C12498l0 l0Var3 = d.f30463g;
                Intrinsics.checkNotNull(l0Var3);
                Intrinsics.checkNotNull(l0Var2);
                l0Var3.mo27322c(l0Var2.mo27323d());
            }
            mVar.mo27354V(mo27362c0());
        }
        return mVar;
    }

    @C12579k
    @C11315i
    /* renamed from: l */
    public final C12500m mo27375l(@C12579k OutputStream outputStream) throws IOException {
        return m50843t(this, outputStream, 0, 0, 6, (Object) null);
    }

    /* renamed from: l3 */
    public int mo27298l3() throws EOFException {
        byte b;
        int i;
        byte b2;
        if (mo27362c0() != 0) {
            byte D = mo27330D(0);
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
                skip(1);
                return C12520s0.f30504c;
            }
            long j = (long) i;
            if (mo27362c0() >= j) {
                while (i2 < i) {
                    long j2 = (long) i2;
                    byte D2 = mo27330D(j2);
                    if ((D2 & C19135a.f49026p7) == 128) {
                        b2 = (b2 << 6) | (D2 & C12520s0.f30502a);
                        i2++;
                    } else {
                        skip(j2);
                        return C12520s0.f30504c;
                    }
                }
                skip(j);
                if (b2 > 1114111) {
                    return C12520s0.f30504c;
                }
                if ((55296 <= b2 && 57343 >= b2) || b2 < b) {
                    return C12520s0.f30504c;
                }
                return b2;
            }
            throw new EOFException("size < " + i + ": " + mo27362c0() + " (to read code point prefixed 0x" + C12487j.m50758o(D) + ')');
        }
        throw new EOFException();
    }

    @C12579k
    @C11315i
    /* renamed from: m */
    public final C12500m mo27376m(@C12579k OutputStream outputStream, long j) throws IOException {
        return m50843t(this, outputStream, j, 0, 4, (Object) null);
    }

    /* renamed from: m0 */
    public long mo27299m0(@C12579k ByteString byteString, long j) throws IOException {
        boolean z;
        boolean z2;
        long j2 = j;
        Intrinsics.checkNotNullParameter(byteString, "bytes");
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
                C12498l0 l0Var = this.f30464a;
                if (l0Var != null) {
                    if (mo27362c0() - j2 < j2) {
                        long c0 = mo27362c0();
                        while (c0 > j2) {
                            l0Var = l0Var.f30463g;
                            Intrinsics.checkNotNull(l0Var);
                            c0 -= (long) (l0Var.f30459c - l0Var.f30458b);
                        }
                        byte[] U0 = byteString.mo27115U0();
                        byte b = U0[0];
                        int size = byteString.size();
                        long c02 = (mo27362c0() - ((long) size)) + 1;
                        while (c0 < c02) {
                            byte[] bArr = l0Var.f30457a;
                            long j4 = c0;
                            int min = (int) Math.min((long) l0Var.f30459c, (((long) l0Var.f30458b) + c02) - c0);
                            long j5 = ((long) l0Var.f30458b) + j2;
                            long j6 = j4;
                            for (int i = (int) (j5 - j6); i < min; i++) {
                                if (bArr[i] == b && C12481a.m50608h0(l0Var, i + 1, U0, 1, size)) {
                                    return ((long) (i - l0Var.f30458b)) + j6;
                                }
                            }
                            c0 = j6 + ((long) (l0Var.f30459c - l0Var.f30458b));
                            l0Var = l0Var.f30462f;
                            Intrinsics.checkNotNull(l0Var);
                            j2 = c0;
                        }
                    } else {
                        while (true) {
                            long j7 = ((long) (l0Var.f30459c - l0Var.f30458b)) + j3;
                            if (j7 > j2) {
                                break;
                            }
                            l0Var = l0Var.f30462f;
                            Intrinsics.checkNotNull(l0Var);
                            j3 = j7;
                        }
                        byte[] U02 = byteString.mo27115U0();
                        byte b2 = U02[0];
                        int size2 = byteString.size();
                        long c03 = (mo27362c0() - ((long) size2)) + 1;
                        while (j3 < c03) {
                            byte[] bArr2 = l0Var.f30457a;
                            long j8 = c03;
                            int min2 = (int) Math.min((long) l0Var.f30459c, (((long) l0Var.f30458b) + c03) - j3);
                            for (int i2 = (int) ((((long) l0Var.f30458b) + j2) - j3); i2 < min2; i2++) {
                                if (bArr2[i2] == b2) {
                                    if (C12481a.m50608h0(l0Var, i2 + 1, U02, 1, size2)) {
                                        return ((long) (i2 - l0Var.f30458b)) + j3;
                                    }
                                }
                            }
                            j3 += (long) (l0Var.f30459c - l0Var.f30458b);
                            l0Var = l0Var.f30462f;
                            Intrinsics.checkNotNull(l0Var);
                            j2 = j3;
                            c03 = j8;
                        }
                    }
                }
                return -1;
            }
            throw new IllegalArgumentException(("fromIndex < 0: " + j2).toString());
        }
        throw new IllegalArgumentException("bytes is empty".toString());
    }

    @C12579k
    @C11315i
    /* renamed from: n */
    public final C12500m mo27377n(@C12579k OutputStream outputStream, long j, long j2) throws IOException {
        Intrinsics.checkNotNullParameter(outputStream, "out");
        C12487j.m50748e(this.f30465b, j, j2);
        if (j2 == 0) {
            return this;
        }
        C12498l0 l0Var = this.f30464a;
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
            int i3 = (int) (((long) l0Var.f30458b) + j);
            int min = (int) Math.min((long) (l0Var.f30459c - i3), j2);
            outputStream.write(l0Var.f30457a, i3, min);
            j2 -= (long) min;
            l0Var = l0Var.f30462f;
            j = 0;
        }
        return this;
    }

    @C12579k
    /* renamed from: n1 */
    public C12500m mo27230Y2(int i) {
        return mo27247z2(C12487j.m50754k((short) i));
    }

    @C12579k
    /* renamed from: n2 */
    public String mo27300n2(long j) throws EOFException {
        return mo27270E3(j, C11602d.f28868b);
    }

    @C12579k
    /* renamed from: n3 */
    public ByteString mo27301n3() {
        return mo27312t2(mo27362c0());
    }

    @C12579k
    /* renamed from: o */
    public final C12500m mo27379o(@C12579k C12500m mVar, long j) {
        Intrinsics.checkNotNullParameter(mVar, "out");
        return mo27383s(mVar, j, this.f30465b - j);
    }

    /* renamed from: o1 */
    public boolean mo27302o1(long j, @C12579k ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "bytes");
        return mo27277N1(j, byteString, 0, byteString.size());
    }

    @C12579k
    /* renamed from: q0 */
    public final C12498l0 mo27380q0(int i) {
        boolean z = true;
        if (i < 1 || i > 8192) {
            z = false;
        }
        if (z) {
            C12498l0 l0Var = this.f30464a;
            if (l0Var == null) {
                C12498l0 e = C12504m0.m50968e();
                this.f30464a = e;
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
    /* renamed from: q1 */
    public C12500m mo27231b2(@C12579k String str, int i, int i2, @C12579k Charset charset) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(str, C16717v.C16719b.f42182e);
        Intrinsics.checkNotNullParameter(charset, "charset");
        boolean z3 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 >= i) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i2 > str.length()) {
                    z3 = false;
                }
                if (!z3) {
                    throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
                } else if (Intrinsics.areEqual((Object) charset, (Object) C11602d.f28868b)) {
                    return mo27242v1(str, i, i2);
                } else {
                    String substring = str.substring(i, i2);
                    Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    if (substring != null) {
                        byte[] bytes = substring.getBytes(charset);
                        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                        return mo27235k3(bytes, 0, bytes.length);
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            } else {
                throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
            }
        } else {
            throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
        }
    }

    public int read(@C12579k ByteBuffer byteBuffer) throws IOException {
        Intrinsics.checkNotNullParameter(byteBuffer, "sink");
        C12498l0 l0Var = this.f30464a;
        if (l0Var == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), l0Var.f30459c - l0Var.f30458b);
        byteBuffer.put(l0Var.f30457a, l0Var.f30458b, min);
        int i = l0Var.f30458b + min;
        l0Var.f30458b = i;
        this.f30465b -= (long) min;
        if (i == l0Var.f30459c) {
            this.f30464a = l0Var.mo27321b();
            C12504m0.m50967d(l0Var);
        }
        return min;
    }

    public byte readByte() throws EOFException {
        if (mo27362c0() != 0) {
            C12498l0 l0Var = this.f30464a;
            Intrinsics.checkNotNull(l0Var);
            int i = l0Var.f30458b;
            int i2 = l0Var.f30459c;
            int i3 = i + 1;
            byte b = l0Var.f30457a[i];
            mo27354V(mo27362c0() - 1);
            if (i3 == i2) {
                this.f30464a = l0Var.mo27321b();
                C12504m0.m50967d(l0Var);
            } else {
                l0Var.f30458b = i3;
            }
            return b;
        }
        throw new EOFException();
    }

    public void readFully(@C12579k byte[] bArr) throws EOFException {
        Intrinsics.checkNotNullParameter(bArr, "sink");
        int i = 0;
        while (i < bArr.length) {
            int read = read(bArr, i, bArr.length - i);
            if (read != -1) {
                i += read;
            } else {
                throw new EOFException();
            }
        }
    }

    public int readInt() throws EOFException {
        if (mo27362c0() >= 4) {
            C12498l0 l0Var = this.f30464a;
            Intrinsics.checkNotNull(l0Var);
            int i = l0Var.f30458b;
            int i2 = l0Var.f30459c;
            if (((long) (i2 - i)) < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << DateTimeFieldType.f30603E0) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = l0Var.f30457a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << DateTimeFieldType.f30603E0);
            int i5 = i4 + 1;
            byte b2 = b | ((bArr[i4] & 255) << 8);
            int i6 = i5 + 1;
            byte b3 = b2 | (bArr[i5] & 255);
            mo27354V(mo27362c0() - 4);
            if (i6 == i2) {
                this.f30464a = l0Var.mo27321b();
                C12504m0.m50967d(l0Var);
            } else {
                l0Var.f30458b = i6;
            }
            return b3;
        }
        throw new EOFException();
    }

    public long readLong() throws EOFException {
        if (mo27362c0() >= 8) {
            C12498l0 l0Var = this.f30464a;
            Intrinsics.checkNotNull(l0Var);
            int i = l0Var.f30458b;
            int i2 = l0Var.f30459c;
            if (((long) (i2 - i)) < 8) {
                return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
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
            mo27354V(mo27362c0() - 8);
            if (i10 == i2) {
                this.f30464a = l0Var.mo27321b();
                C12504m0.m50967d(l0Var);
            } else {
                l0Var.f30458b = i10;
            }
            return j2;
        }
        throw new EOFException();
    }

    public short readShort() throws EOFException {
        if (mo27362c0() >= 2) {
            C12498l0 l0Var = this.f30464a;
            Intrinsics.checkNotNull(l0Var);
            int i = l0Var.f30458b;
            int i2 = l0Var.f30459c;
            if (i2 - i < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = l0Var.f30457a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            mo27354V(mo27362c0() - 2);
            if (i4 == i2) {
                this.f30464a = l0Var.mo27321b();
                C12504m0.m50967d(l0Var);
            } else {
                l0Var.f30458b = i4;
            }
            return (short) b;
        }
        throw new EOFException();
    }

    @C12579k
    /* renamed from: s */
    public final C12500m mo27383s(@C12579k C12500m mVar, long j, long j2) {
        Intrinsics.checkNotNullParameter(mVar, "out");
        C12487j.m50748e(mo27362c0(), j, j2);
        if (j2 != 0) {
            mVar.mo27354V(mVar.mo27362c0() + j2);
            C12498l0 l0Var = this.f30464a;
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
                C12498l0 l0Var2 = mVar.f30464a;
                if (l0Var2 == null) {
                    d.f30463g = d;
                    d.f30462f = d;
                    mVar.f30464a = d;
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
        }
        return this;
    }

    public void skip(long j) throws EOFException {
        while (j > 0) {
            C12498l0 l0Var = this.f30464a;
            if (l0Var != null) {
                int min = (int) Math.min(j, (long) (l0Var.f30459c - l0Var.f30458b));
                long j2 = (long) min;
                mo27354V(mo27362c0() - j2);
                j -= j2;
                int i = l0Var.f30458b + min;
                l0Var.f30458b = i;
                if (i == l0Var.f30459c) {
                    this.f30464a = l0Var.mo27321b();
                    C12504m0.m50967d(l0Var);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    @C12579k
    /* renamed from: t2 */
    public ByteString mo27312t2(long j) throws EOFException {
        boolean z;
        if (j < 0 || j > ((long) Integer.MAX_VALUE)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        } else if (mo27362c0() < j) {
            throw new EOFException();
        } else if (j < ((long) 4096)) {
            return new ByteString(mo27278O1(j));
        } else {
            ByteString g0 = mo27368g0((int) j);
            skip(j);
            return g0;
        }
    }

    @C12579k
    public C12516r0 timeout() {
        return C12516r0.NONE;
    }

    @C12579k
    public String toString() {
        return mo27365d0().toString();
    }

    @C12579k
    /* renamed from: w1 */
    public C12500m mo27238o3(@C12579k String str, @C12579k Charset charset) {
        Intrinsics.checkNotNullParameter(str, C16717v.C16719b.f42182e);
        Intrinsics.checkNotNullParameter(charset, "charset");
        return mo27231b2(str, 0, str.length(), charset);
    }

    public int write(@C12579k ByteBuffer byteBuffer) throws IOException {
        Intrinsics.checkNotNullParameter(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            C12498l0 q0 = mo27380q0(1);
            int min = Math.min(i, 8192 - q0.f30459c);
            byteBuffer.get(q0.f30457a, q0.f30459c, min);
            i -= min;
            q0.f30459c += min;
        }
        this.f30465b += (long) remaining;
        return remaining;
    }

    /* renamed from: x */
    public final ByteString mo27387x(String str) {
        MessageDigest instance = MessageDigest.getInstance(str);
        C12498l0 l0Var = this.f30464a;
        if (l0Var != null) {
            byte[] bArr = l0Var.f30457a;
            int i = l0Var.f30458b;
            instance.update(bArr, i, l0Var.f30459c - i);
            C12498l0 l0Var2 = l0Var.f30462f;
            Intrinsics.checkNotNull(l0Var2);
            while (l0Var2 != l0Var) {
                byte[] bArr2 = l0Var2.f30457a;
                int i2 = l0Var2.f30458b;
                instance.update(bArr2, i2, l0Var2.f30459c - i2);
                l0Var2 = l0Var2.f30462f;
                Intrinsics.checkNotNull(l0Var2);
            }
        }
        byte[] digest = instance.digest();
        Intrinsics.checkNotNullExpressionValue(digest, "messageDigest.digest()");
        return new ByteString(digest);
    }

    @C12579k
    /* renamed from: x0 */
    public C12500m mo27222G3(@C12579k ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.mo27154u2(this, 0, byteString.size());
        return this;
    }

    /* renamed from: x1 */
    public long mo27245x1(@C12579k C12510p0 p0Var) throws IOException {
        Intrinsics.checkNotNullParameter(p0Var, "source");
        long j = 0;
        while (true) {
            long read = p0Var.read(this, (long) 8192);
            if (read == -1) {
                return j;
            }
            j += read;
        }
    }

    /* renamed from: y3 */
    public int mo27314y3() throws EOFException {
        return C12487j.m50752i(readInt());
    }

    @C12579k
    @C11315i
    /* renamed from: z1 */
    public final C12500m mo27389z1(@C12579k OutputStream outputStream) throws IOException {
        return m50840D1(this, outputStream, 0, 2, (Object) null);
    }

    /* renamed from: okio.m$b */
    public static final class C12502b extends InputStream {

        /* renamed from: a */
        public final /* synthetic */ C12500m f30473a;

        public C12502b(C12500m mVar) {
            this.f30473a = mVar;
        }

        public int available() {
            return (int) Math.min(this.f30473a.mo27362c0(), (long) Integer.MAX_VALUE);
        }

        public void close() {
        }

        public int read() {
            if (this.f30473a.mo27362c0() > 0) {
                return this.f30473a.readByte() & 255;
            }
            return -1;
        }

        @C12579k
        public String toString() {
            return this.f30473a + ".inputStream()";
        }

        public int read(@C12579k byte[] bArr, int i, int i2) {
            Intrinsics.checkNotNullParameter(bArr, "sink");
            return this.f30473a.read(bArr, i, i2);
        }
    }

    public void write(@C12579k C12500m mVar, long j) {
        C12498l0 l0Var;
        Intrinsics.checkNotNullParameter(mVar, "source");
        if (mVar != this) {
            C12487j.m50748e(mVar.mo27362c0(), 0, j);
            while (j > 0) {
                C12498l0 l0Var2 = mVar.f30464a;
                Intrinsics.checkNotNull(l0Var2);
                int i = l0Var2.f30459c;
                C12498l0 l0Var3 = mVar.f30464a;
                Intrinsics.checkNotNull(l0Var3);
                if (j < ((long) (i - l0Var3.f30458b))) {
                    C12498l0 l0Var4 = this.f30464a;
                    if (l0Var4 != null) {
                        Intrinsics.checkNotNull(l0Var4);
                        l0Var = l0Var4.f30463g;
                    } else {
                        l0Var = null;
                    }
                    if (l0Var != null && l0Var.f30461e) {
                        if ((((long) l0Var.f30459c) + j) - ((long) (l0Var.f30460d ? 0 : l0Var.f30458b)) <= ((long) 8192)) {
                            C12498l0 l0Var5 = mVar.f30464a;
                            Intrinsics.checkNotNull(l0Var5);
                            l0Var5.mo27326g(l0Var, (int) j);
                            mVar.mo27354V(mVar.mo27362c0() - j);
                            mo27354V(mo27362c0() + j);
                            return;
                        }
                    }
                    C12498l0 l0Var6 = mVar.f30464a;
                    Intrinsics.checkNotNull(l0Var6);
                    mVar.f30464a = l0Var6.mo27324e((int) j);
                }
                C12498l0 l0Var7 = mVar.f30464a;
                Intrinsics.checkNotNull(l0Var7);
                long j2 = (long) (l0Var7.f30459c - l0Var7.f30458b);
                mVar.f30464a = l0Var7.mo27321b();
                C12498l0 l0Var8 = this.f30464a;
                if (l0Var8 == null) {
                    this.f30464a = l0Var7;
                    l0Var7.f30463g = l0Var7;
                    l0Var7.f30462f = l0Var7;
                } else {
                    Intrinsics.checkNotNull(l0Var8);
                    C12498l0 l0Var9 = l0Var8.f30463g;
                    Intrinsics.checkNotNull(l0Var9);
                    l0Var9.mo27322c(l0Var7).mo27320a();
                }
                mVar.mo27354V(mVar.mo27362c0() - j2);
                mo27354V(mo27362c0() + j2);
                j -= j2;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    public int read(@C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "sink");
        return read(bArr, 0, bArr.length);
    }

    public int read(@C12579k byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "sink");
        C12487j.m50748e((long) bArr.length, (long) i, (long) i2);
        C12498l0 l0Var = this.f30464a;
        if (l0Var == null) {
            return -1;
        }
        int min = Math.min(i2, l0Var.f30459c - l0Var.f30458b);
        byte[] bArr2 = l0Var.f30457a;
        int i3 = l0Var.f30458b;
        C10956m.m41147W0(bArr2, bArr, i, i3, i3 + min);
        l0Var.f30458b += min;
        mo27354V(mo27362c0() - ((long) min));
        if (l0Var.f30458b != l0Var.f30459c) {
            return min;
        }
        this.f30464a = l0Var.mo27321b();
        C12504m0.m50967d(l0Var);
        return min;
    }

    public long read(@C12579k C12500m mVar, long j) {
        Intrinsics.checkNotNullParameter(mVar, "sink");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        } else if (mo27362c0() == 0) {
            return -1;
        } else {
            if (j > mo27362c0()) {
                j = mo27362c0();
            }
            mVar.write(this, j);
            return j;
        }
    }
}

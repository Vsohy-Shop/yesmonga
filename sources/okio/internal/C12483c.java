package okio.internal;

import androidx.constraintlayout.core.motion.utils.C16717v;
import java.io.EOFException;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import okio.C12488j0;
import okio.C12500m;
import okio.C12505n;
import okio.C12506n0;
import okio.C12510p0;
import okio.C12516r0;
import org.jetbrains.annotations.C12579k;

/* renamed from: okio.internal.c */
public final class C12483c {
    /* renamed from: a */
    public static final void m50666a(@C12579k C12488j0 j0Var) {
        Intrinsics.checkNotNullParameter(j0Var, "$this$commonClose");
        if (!j0Var.f30443b) {
            try {
                if (j0Var.f30442a.mo27362c0() > 0) {
                    C12506n0 n0Var = j0Var.f30444c;
                    C12500m mVar = j0Var.f30442a;
                    n0Var.write(mVar, mVar.mo27362c0());
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                j0Var.f30444c.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            j0Var.f30443b = true;
            if (th != null) {
                throw th;
            }
        }
    }

    @C12579k
    /* renamed from: b */
    public static final C12505n m50667b(@C12579k C12488j0 j0Var) {
        Intrinsics.checkNotNullParameter(j0Var, "$this$commonEmit");
        if (!j0Var.f30443b) {
            long c0 = j0Var.f30442a.mo27362c0();
            if (c0 > 0) {
                j0Var.f30444c.write(j0Var.f30442a, c0);
            }
            return j0Var;
        }
        throw new IllegalStateException("closed".toString());
    }

    @C12579k
    /* renamed from: c */
    public static final C12505n m50668c(@C12579k C12488j0 j0Var) {
        Intrinsics.checkNotNullParameter(j0Var, "$this$commonEmitCompleteSegments");
        if (!j0Var.f30443b) {
            long j = j0Var.f30442a.mo27373j();
            if (j > 0) {
                j0Var.f30444c.write(j0Var.f30442a, j);
            }
            return j0Var;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: d */
    public static final void m50669d(@C12579k C12488j0 j0Var) {
        Intrinsics.checkNotNullParameter(j0Var, "$this$commonFlush");
        if (!j0Var.f30443b) {
            if (j0Var.f30442a.mo27362c0() > 0) {
                C12506n0 n0Var = j0Var.f30444c;
                C12500m mVar = j0Var.f30442a;
                n0Var.write(mVar, mVar.mo27362c0());
            }
            j0Var.f30444c.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @C12579k
    /* renamed from: e */
    public static final C12516r0 m50670e(@C12579k C12488j0 j0Var) {
        Intrinsics.checkNotNullParameter(j0Var, "$this$commonTimeout");
        return j0Var.f30444c.timeout();
    }

    @C12579k
    /* renamed from: f */
    public static final String m50671f(@C12579k C12488j0 j0Var) {
        Intrinsics.checkNotNullParameter(j0Var, "$this$commonToString");
        return "buffer(" + j0Var.f30444c + ')';
    }

    @C12579k
    /* renamed from: g */
    public static final C12505n m50672g(@C12579k C12488j0 j0Var, @C12579k ByteString byteString) {
        Intrinsics.checkNotNullParameter(j0Var, "$this$commonWrite");
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        if (!j0Var.f30443b) {
            j0Var.f30442a.mo27222G3(byteString);
            return j0Var.mo27229Y0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @C12579k
    /* renamed from: h */
    public static final C12505n m50673h(@C12579k C12488j0 j0Var, @C12579k ByteString byteString, int i, int i2) {
        Intrinsics.checkNotNullParameter(j0Var, "$this$commonWrite");
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        if (!j0Var.f30443b) {
            j0Var.f30442a.mo27221B2(byteString, i, i2);
            return j0Var.mo27229Y0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @C12579k
    /* renamed from: i */
    public static final C12505n m50674i(@C12579k C12488j0 j0Var, @C12579k C12510p0 p0Var, long j) {
        Intrinsics.checkNotNullParameter(j0Var, "$this$commonWrite");
        Intrinsics.checkNotNullParameter(p0Var, "source");
        while (j > 0) {
            long read = p0Var.read(j0Var.f30442a, j);
            if (read != -1) {
                j -= read;
                j0Var.mo27229Y0();
            } else {
                throw new EOFException();
            }
        }
        return j0Var;
    }

    @C12579k
    /* renamed from: j */
    public static final C12505n m50675j(@C12579k C12488j0 j0Var, @C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(j0Var, "$this$commonWrite");
        Intrinsics.checkNotNullParameter(bArr, "source");
        if (!j0Var.f30443b) {
            j0Var.f30442a.mo27226Q1(bArr);
            return j0Var.mo27229Y0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @C12579k
    /* renamed from: k */
    public static final C12505n m50676k(@C12579k C12488j0 j0Var, @C12579k byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(j0Var, "$this$commonWrite");
        Intrinsics.checkNotNullParameter(bArr, "source");
        if (!j0Var.f30443b) {
            j0Var.f30442a.mo27235k3(bArr, i, i2);
            return j0Var.mo27229Y0();
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: l */
    public static final void m50677l(@C12579k C12488j0 j0Var, @C12579k C12500m mVar, long j) {
        Intrinsics.checkNotNullParameter(j0Var, "$this$commonWrite");
        Intrinsics.checkNotNullParameter(mVar, "source");
        if (!j0Var.f30443b) {
            j0Var.f30442a.write(mVar, j);
            j0Var.mo27229Y0();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: m */
    public static final long m50678m(@C12579k C12488j0 j0Var, @C12579k C12510p0 p0Var) {
        Intrinsics.checkNotNullParameter(j0Var, "$this$commonWriteAll");
        Intrinsics.checkNotNullParameter(p0Var, "source");
        long j = 0;
        while (true) {
            long read = p0Var.read(j0Var.f30442a, (long) 8192);
            if (read == -1) {
                return j;
            }
            j += read;
            j0Var.mo27229Y0();
        }
    }

    @C12579k
    /* renamed from: n */
    public static final C12505n m50679n(@C12579k C12488j0 j0Var, int i) {
        Intrinsics.checkNotNullParameter(j0Var, "$this$commonWriteByte");
        if (!j0Var.f30443b) {
            j0Var.f30442a.mo27225K2(i);
            return j0Var.mo27229Y0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @C12579k
    /* renamed from: o */
    public static final C12505n m50680o(@C12579k C12488j0 j0Var, long j) {
        Intrinsics.checkNotNullParameter(j0Var, "$this$commonWriteDecimalLong");
        if (!j0Var.f30443b) {
            j0Var.f30442a.mo27233g2(j);
            return j0Var.mo27229Y0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @C12579k
    /* renamed from: p */
    public static final C12505n m50681p(@C12579k C12488j0 j0Var, long j) {
        Intrinsics.checkNotNullParameter(j0Var, "$this$commonWriteHexadecimalUnsignedLong");
        if (!j0Var.f30443b) {
            j0Var.f30442a.mo27237m3(j);
            return j0Var.mo27229Y0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @C12579k
    /* renamed from: q */
    public static final C12505n m50682q(@C12579k C12488j0 j0Var, int i) {
        Intrinsics.checkNotNullParameter(j0Var, "$this$commonWriteInt");
        if (!j0Var.f30443b) {
            j0Var.f30442a.mo27246z0(i);
            return j0Var.mo27229Y0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @C12579k
    /* renamed from: r */
    public static final C12505n m50683r(@C12579k C12488j0 j0Var, int i) {
        Intrinsics.checkNotNullParameter(j0Var, "$this$commonWriteIntLe");
        if (!j0Var.f30443b) {
            j0Var.f30442a.mo27224H2(i);
            return j0Var.mo27229Y0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @C12579k
    /* renamed from: s */
    public static final C12505n m50684s(@C12579k C12488j0 j0Var, long j) {
        Intrinsics.checkNotNullParameter(j0Var, "$this$commonWriteLong");
        if (!j0Var.f30443b) {
            j0Var.f30442a.mo27227T3(j);
            return j0Var.mo27229Y0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @C12579k
    /* renamed from: t */
    public static final C12505n m50685t(@C12579k C12488j0 j0Var, long j) {
        Intrinsics.checkNotNullParameter(j0Var, "$this$commonWriteLongLe");
        if (!j0Var.f30443b) {
            j0Var.f30442a.mo27220B0(j);
            return j0Var.mo27229Y0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @C12579k
    /* renamed from: u */
    public static final C12505n m50686u(@C12579k C12488j0 j0Var, int i) {
        Intrinsics.checkNotNullParameter(j0Var, "$this$commonWriteShort");
        if (!j0Var.f30443b) {
            j0Var.f30442a.mo27247z2(i);
            return j0Var.mo27229Y0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @C12579k
    /* renamed from: v */
    public static final C12505n m50687v(@C12579k C12488j0 j0Var, int i) {
        Intrinsics.checkNotNullParameter(j0Var, "$this$commonWriteShortLe");
        if (!j0Var.f30443b) {
            j0Var.f30442a.mo27230Y2(i);
            return j0Var.mo27229Y0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @C12579k
    /* renamed from: w */
    public static final C12505n m50688w(@C12579k C12488j0 j0Var, @C12579k String str) {
        Intrinsics.checkNotNullParameter(j0Var, "$this$commonWriteUtf8");
        Intrinsics.checkNotNullParameter(str, C16717v.C16719b.f42182e);
        if (!j0Var.f30443b) {
            j0Var.f30442a.mo27236l1(str);
            return j0Var.mo27229Y0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @C12579k
    /* renamed from: x */
    public static final C12505n m50689x(@C12579k C12488j0 j0Var, @C12579k String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(j0Var, "$this$commonWriteUtf8");
        Intrinsics.checkNotNullParameter(str, C16717v.C16719b.f42182e);
        if (!j0Var.f30443b) {
            j0Var.f30442a.mo27242v1(str, i, i2);
            return j0Var.mo27229Y0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @C12579k
    /* renamed from: y */
    public static final C12505n m50690y(@C12579k C12488j0 j0Var, int i) {
        Intrinsics.checkNotNullParameter(j0Var, "$this$commonWriteUtf8CodePoint");
        if (!j0Var.f30443b) {
            j0Var.f30442a.mo27243w0(i);
            return j0Var.mo27229Y0();
        }
        throw new IllegalStateException("closed".toString());
    }
}

package okio;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.IOException;
import java.security.MessageDigest;
import javax.crypto.Mac;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.C11314h;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: okio.z */
public final class C12528z extends C12522u implements C12510p0 {
    @C12579k

    /* renamed from: c */
    public static final C12529a f30524c = new C12529a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final MessageDigest f30525a;

    /* renamed from: b */
    public final Mac f30526b;

    /* renamed from: okio.z$a */
    public static final class C12529a {
        public C12529a() {
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C12528z mo27470a(@C12579k C12510p0 p0Var, @C12579k ByteString byteString) {
            Intrinsics.checkNotNullParameter(p0Var, "source");
            Intrinsics.checkNotNullParameter(byteString, "key");
            return new C12528z(p0Var, byteString, "HmacSHA1");
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C12528z mo27471b(@C12579k C12510p0 p0Var, @C12579k ByteString byteString) {
            Intrinsics.checkNotNullParameter(p0Var, "source");
            Intrinsics.checkNotNullParameter(byteString, "key");
            return new C12528z(p0Var, byteString, "HmacSHA256");
        }

        @C12579k
        @C11384m
        /* renamed from: c */
        public final C12528z mo27472c(@C12579k C12510p0 p0Var, @C12579k ByteString byteString) {
            Intrinsics.checkNotNullParameter(p0Var, "source");
            Intrinsics.checkNotNullParameter(byteString, "key");
            return new C12528z(p0Var, byteString, "HmacSHA512");
        }

        @C12579k
        @C11384m
        /* renamed from: d */
        public final C12528z mo27473d(@C12579k C12510p0 p0Var) {
            Intrinsics.checkNotNullParameter(p0Var, "source");
            return new C12528z(p0Var, "MD5");
        }

        @C12579k
        @C11384m
        /* renamed from: e */
        public final C12528z mo27474e(@C12579k C12510p0 p0Var) {
            Intrinsics.checkNotNullParameter(p0Var, "source");
            return new C12528z(p0Var, CommonUtils.f79238a);
        }

        @C12579k
        @C11384m
        /* renamed from: f */
        public final C12528z mo27475f(@C12579k C12510p0 p0Var) {
            Intrinsics.checkNotNullParameter(p0Var, "source");
            return new C12528z(p0Var, "SHA-256");
        }

        @C12579k
        @C11384m
        /* renamed from: g */
        public final C12528z mo27476g(@C12579k C12510p0 p0Var) {
            Intrinsics.checkNotNullParameter(p0Var, "source");
            return new C12528z(p0Var, "SHA-512");
        }

        public /* synthetic */ C12529a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12528z(@C12579k C12510p0 p0Var, @C12579k MessageDigest messageDigest) {
        super(p0Var);
        Intrinsics.checkNotNullParameter(p0Var, "source");
        Intrinsics.checkNotNullParameter(messageDigest, "digest");
        this.f30525a = messageDigest;
        this.f30526b = null;
    }

    @C12579k
    @C11384m
    /* renamed from: c */
    public static final C12528z m51093c(@C12579k C12510p0 p0Var, @C12579k ByteString byteString) {
        return f30524c.mo27470a(p0Var, byteString);
    }

    @C12579k
    @C11384m
    /* renamed from: d */
    public static final C12528z m51094d(@C12579k C12510p0 p0Var, @C12579k ByteString byteString) {
        return f30524c.mo27471b(p0Var, byteString);
    }

    @C12579k
    @C11384m
    /* renamed from: f */
    public static final C12528z m51095f(@C12579k C12510p0 p0Var, @C12579k ByteString byteString) {
        return f30524c.mo27472c(p0Var, byteString);
    }

    @C12579k
    @C11384m
    /* renamed from: g */
    public static final C12528z m51096g(@C12579k C12510p0 p0Var) {
        return f30524c.mo27473d(p0Var);
    }

    @C12579k
    @C11384m
    /* renamed from: i */
    public static final C12528z m51097i(@C12579k C12510p0 p0Var) {
        return f30524c.mo27474e(p0Var);
    }

    @C12579k
    @C11384m
    /* renamed from: j */
    public static final C12528z m51098j(@C12579k C12510p0 p0Var) {
        return f30524c.mo27475f(p0Var);
    }

    @C12579k
    @C11384m
    /* renamed from: k */
    public static final C12528z m51099k(@C12579k C12510p0 p0Var) {
        return f30524c.mo27476g(p0Var);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @C11587t0(expression = "hash", imports = {}))
    @C11314h(name = "-deprecated_hash")
    @C12579k
    /* renamed from: a */
    public final ByteString mo27468a() {
        return mo27469b();
    }

    @C11314h(name = "hash")
    @C12579k
    /* renamed from: b */
    public final ByteString mo27469b() {
        byte[] bArr;
        MessageDigest messageDigest = this.f30525a;
        if (messageDigest != null) {
            bArr = messageDigest.digest();
        } else {
            Mac mac = this.f30526b;
            Intrinsics.checkNotNull(mac);
            bArr = mac.doFinal();
        }
        Intrinsics.checkNotNullExpressionValue(bArr, "result");
        return new ByteString(bArr);
    }

    public long read(@C12579k C12500m mVar, long j) throws IOException {
        Intrinsics.checkNotNullParameter(mVar, "sink");
        long read = super.read(mVar, j);
        if (read != -1) {
            long c0 = mVar.mo27362c0() - read;
            long c02 = mVar.mo27362c0();
            C12498l0 l0Var = mVar.f30464a;
            Intrinsics.checkNotNull(l0Var);
            while (c02 > c0) {
                l0Var = l0Var.f30463g;
                Intrinsics.checkNotNull(l0Var);
                c02 -= (long) (l0Var.f30459c - l0Var.f30458b);
            }
            while (c02 < mVar.mo27362c0()) {
                int i = (int) ((((long) l0Var.f30458b) + c0) - c02);
                MessageDigest messageDigest = this.f30525a;
                if (messageDigest != null) {
                    messageDigest.update(l0Var.f30457a, i, l0Var.f30459c - i);
                } else {
                    Mac mac = this.f30526b;
                    Intrinsics.checkNotNull(mac);
                    mac.update(l0Var.f30457a, i, l0Var.f30459c - i);
                }
                c02 += (long) (l0Var.f30459c - l0Var.f30458b);
                l0Var = l0Var.f30462f;
                Intrinsics.checkNotNull(l0Var);
                c0 = c02;
            }
        }
        return read;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C12528z(@org.jetbrains.annotations.C12579k okio.C12510p0 r2, @org.jetbrains.annotations.C12579k java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "algorithm"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r3)
            java.lang.String r0 = "MessageDigest.getInstance(algorithm)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
            r1.<init>((okio.C12510p0) r2, (java.security.MessageDigest) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.C12528z.<init>(okio.p0, java.lang.String):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12528z(@C12579k C12510p0 p0Var, @C12579k Mac mac) {
        super(p0Var);
        Intrinsics.checkNotNullParameter(p0Var, "source");
        Intrinsics.checkNotNullParameter(mac, "mac");
        this.f30526b = mac;
        this.f30525a = null;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C12528z(@org.jetbrains.annotations.C12579k okio.C12510p0 r3, @org.jetbrains.annotations.C12579k okio.ByteString r4, @org.jetbrains.annotations.C12579k java.lang.String r5) {
        /*
            r2 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "algorithm"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            javax.crypto.Mac r0 = javax.crypto.Mac.getInstance(r5)     // Catch:{ InvalidKeyException -> 0x002a }
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec     // Catch:{ InvalidKeyException -> 0x002a }
            byte[] r4 = r4.mo27147r2()     // Catch:{ InvalidKeyException -> 0x002a }
            r1.<init>(r4, r5)     // Catch:{ InvalidKeyException -> 0x002a }
            r0.init(r1)     // Catch:{ InvalidKeyException -> 0x002a }
            kotlin.d2 r4 = kotlin.C11079d2.f28267a     // Catch:{ InvalidKeyException -> 0x002a }
            java.lang.String r4 = "try {\n      Mac.getInsta…rgumentException(e)\n    }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            r2.<init>((okio.C12510p0) r3, (javax.crypto.Mac) r0)
            return
        L_0x002a:
            r3 = move-exception
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.C12528z.<init>(okio.p0, okio.ByteString, java.lang.String):void");
    }
}

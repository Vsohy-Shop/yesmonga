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

/* renamed from: okio.y */
public final class C12526y extends C12521t implements C12506n0 {
    @C12579k

    /* renamed from: c */
    public static final C12527a f30521c = new C12527a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final MessageDigest f30522a;

    /* renamed from: b */
    public final Mac f30523b;

    /* renamed from: okio.y$a */
    public static final class C12527a {
        public C12527a() {
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C12526y mo27461a(@C12579k C12506n0 n0Var, @C12579k ByteString byteString) {
            Intrinsics.checkNotNullParameter(n0Var, "sink");
            Intrinsics.checkNotNullParameter(byteString, "key");
            return new C12526y(n0Var, byteString, "HmacSHA1");
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C12526y mo27462b(@C12579k C12506n0 n0Var, @C12579k ByteString byteString) {
            Intrinsics.checkNotNullParameter(n0Var, "sink");
            Intrinsics.checkNotNullParameter(byteString, "key");
            return new C12526y(n0Var, byteString, "HmacSHA256");
        }

        @C12579k
        @C11384m
        /* renamed from: c */
        public final C12526y mo27463c(@C12579k C12506n0 n0Var, @C12579k ByteString byteString) {
            Intrinsics.checkNotNullParameter(n0Var, "sink");
            Intrinsics.checkNotNullParameter(byteString, "key");
            return new C12526y(n0Var, byteString, "HmacSHA512");
        }

        @C12579k
        @C11384m
        /* renamed from: d */
        public final C12526y mo27464d(@C12579k C12506n0 n0Var) {
            Intrinsics.checkNotNullParameter(n0Var, "sink");
            return new C12526y(n0Var, "MD5");
        }

        @C12579k
        @C11384m
        /* renamed from: e */
        public final C12526y mo27465e(@C12579k C12506n0 n0Var) {
            Intrinsics.checkNotNullParameter(n0Var, "sink");
            return new C12526y(n0Var, CommonUtils.f79238a);
        }

        @C12579k
        @C11384m
        /* renamed from: f */
        public final C12526y mo27466f(@C12579k C12506n0 n0Var) {
            Intrinsics.checkNotNullParameter(n0Var, "sink");
            return new C12526y(n0Var, "SHA-256");
        }

        @C12579k
        @C11384m
        /* renamed from: g */
        public final C12526y mo27467g(@C12579k C12506n0 n0Var) {
            Intrinsics.checkNotNullParameter(n0Var, "sink");
            return new C12526y(n0Var, "SHA-512");
        }

        public /* synthetic */ C12527a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12526y(@C12579k C12506n0 n0Var, @C12579k MessageDigest messageDigest) {
        super(n0Var);
        Intrinsics.checkNotNullParameter(n0Var, "sink");
        Intrinsics.checkNotNullParameter(messageDigest, "digest");
        this.f30522a = messageDigest;
        this.f30523b = null;
    }

    @C12579k
    @C11384m
    /* renamed from: c */
    public static final C12526y m51077c(@C12579k C12506n0 n0Var, @C12579k ByteString byteString) {
        return f30521c.mo27461a(n0Var, byteString);
    }

    @C12579k
    @C11384m
    /* renamed from: d */
    public static final C12526y m51078d(@C12579k C12506n0 n0Var, @C12579k ByteString byteString) {
        return f30521c.mo27462b(n0Var, byteString);
    }

    @C12579k
    @C11384m
    /* renamed from: f */
    public static final C12526y m51079f(@C12579k C12506n0 n0Var, @C12579k ByteString byteString) {
        return f30521c.mo27463c(n0Var, byteString);
    }

    @C12579k
    @C11384m
    /* renamed from: g */
    public static final C12526y m51080g(@C12579k C12506n0 n0Var) {
        return f30521c.mo27464d(n0Var);
    }

    @C12579k
    @C11384m
    /* renamed from: i */
    public static final C12526y m51081i(@C12579k C12506n0 n0Var) {
        return f30521c.mo27465e(n0Var);
    }

    @C12579k
    @C11384m
    /* renamed from: j */
    public static final C12526y m51082j(@C12579k C12506n0 n0Var) {
        return f30521c.mo27466f(n0Var);
    }

    @C12579k
    @C11384m
    /* renamed from: k */
    public static final C12526y m51083k(@C12579k C12506n0 n0Var) {
        return f30521c.mo27467g(n0Var);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @C11587t0(expression = "hash", imports = {}))
    @C11314h(name = "-deprecated_hash")
    @C12579k
    /* renamed from: a */
    public final ByteString mo27459a() {
        return mo27460b();
    }

    @C11314h(name = "hash")
    @C12579k
    /* renamed from: b */
    public final ByteString mo27460b() {
        byte[] bArr;
        MessageDigest messageDigest = this.f30522a;
        if (messageDigest != null) {
            bArr = messageDigest.digest();
        } else {
            Mac mac = this.f30523b;
            Intrinsics.checkNotNull(mac);
            bArr = mac.doFinal();
        }
        Intrinsics.checkNotNullExpressionValue(bArr, "result");
        return new ByteString(bArr);
    }

    public void write(@C12579k C12500m mVar, long j) throws IOException {
        Intrinsics.checkNotNullParameter(mVar, "source");
        C12487j.m50748e(mVar.mo27362c0(), 0, j);
        C12498l0 l0Var = mVar.f30464a;
        Intrinsics.checkNotNull(l0Var);
        long j2 = 0;
        while (j2 < j) {
            int min = (int) Math.min(j - j2, (long) (l0Var.f30459c - l0Var.f30458b));
            MessageDigest messageDigest = this.f30522a;
            if (messageDigest != null) {
                messageDigest.update(l0Var.f30457a, l0Var.f30458b, min);
            } else {
                Mac mac = this.f30523b;
                Intrinsics.checkNotNull(mac);
                mac.update(l0Var.f30457a, l0Var.f30458b, min);
            }
            j2 += (long) min;
            l0Var = l0Var.f30462f;
            Intrinsics.checkNotNull(l0Var);
        }
        super.write(mVar, j);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C12526y(@org.jetbrains.annotations.C12579k okio.C12506n0 r2, @org.jetbrains.annotations.C12579k java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "algorithm"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r3)
            java.lang.String r0 = "MessageDigest.getInstance(algorithm)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
            r1.<init>((okio.C12506n0) r2, (java.security.MessageDigest) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.C12526y.<init>(okio.n0, java.lang.String):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12526y(@C12579k C12506n0 n0Var, @C12579k Mac mac) {
        super(n0Var);
        Intrinsics.checkNotNullParameter(n0Var, "sink");
        Intrinsics.checkNotNullParameter(mac, "mac");
        this.f30523b = mac;
        this.f30522a = null;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C12526y(@org.jetbrains.annotations.C12579k okio.C12506n0 r3, @org.jetbrains.annotations.C12579k okio.ByteString r4, @org.jetbrains.annotations.C12579k java.lang.String r5) {
        /*
            r2 = this;
            java.lang.String r0 = "sink"
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
            r2.<init>((okio.C12506n0) r3, (javax.crypto.Mac) r0)
            return
        L_0x002a:
            r3 = move-exception
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.C12526y.<init>(okio.n0, okio.ByteString, java.lang.String):void");
    }
}

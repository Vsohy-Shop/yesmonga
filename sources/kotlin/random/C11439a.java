package kotlin.random;

import java.util.Random;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nPlatformRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformRandom.kt\nkotlin/random/AbstractPlatformRandom\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1#2:94\n*E\n"})
/* renamed from: kotlin.random.a */
public abstract class C11439a extends Random {
    /* renamed from: b */
    public int mo22976b(int i) {
        return C11443d.m44128j(mo22975r().nextInt(), i);
    }

    /* renamed from: c */
    public boolean mo22977c() {
        return mo22975r().nextBoolean();
    }

    @C12579k
    /* renamed from: e */
    public byte[] mo22979e(@C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "array");
        mo22975r().nextBytes(bArr);
        return bArr;
    }

    /* renamed from: h */
    public double mo22981h() {
        return mo22975r().nextDouble();
    }

    /* renamed from: k */
    public float mo22984k() {
        return mo22975r().nextFloat();
    }

    /* renamed from: l */
    public int mo22985l() {
        return mo22975r().nextInt();
    }

    /* renamed from: m */
    public int mo22986m(int i) {
        return mo22975r().nextInt(i);
    }

    /* renamed from: o */
    public long mo22988o() {
        return mo22975r().nextLong();
    }

    @C12579k
    /* renamed from: r */
    public abstract Random mo22975r();
}

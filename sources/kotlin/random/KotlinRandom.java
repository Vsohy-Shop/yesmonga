package kotlin.random;

import java.util.Random;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\tH\u0016R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, mo22516d2 = {"Lkotlin/random/KotlinRandom;", "Ljava/util/Random;", "", "bits", "next", "nextInt", "bound", "", "nextBoolean", "", "nextLong", "", "nextFloat", "", "nextDouble", "", "bytes", "Lkotlin/d2;", "nextBytes", "seed", "setSeed", "Lkotlin/random/Random;", "impl", "Lkotlin/random/Random;", "a", "()Lkotlin/random/Random;", "seedInitialized", "Z", "<init>", "(Lkotlin/random/Random;)V", "kotlin-stdlib"}, mo22517k = 1, mo22518mv = {1, 8, 0})
final class KotlinRandom extends Random {
    @C12579k

    /* renamed from: a */
    public static final C11436a f28562a = new C11436a((DefaultConstructorMarker) null);
    private static final long serialVersionUID = 0;
    @C12579k
    private final Random impl;
    private boolean seedInitialized;

    /* renamed from: kotlin.random.KotlinRandom$a */
    public static final class C11436a {
        public /* synthetic */ C11436a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C11436a() {
        }
    }

    public KotlinRandom(@C12579k Random random) {
        Intrinsics.checkNotNullParameter(random, "impl");
        this.impl = random;
    }

    @C12579k
    /* renamed from: a */
    public final Random mo22965a() {
        return this.impl;
    }

    public int next(int i) {
        return this.impl.mo22976b(i);
    }

    public boolean nextBoolean() {
        return this.impl.mo22977c();
    }

    public void nextBytes(@C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "bytes");
        this.impl.mo22979e(bArr);
    }

    public double nextDouble() {
        return this.impl.mo22981h();
    }

    public float nextFloat() {
        return this.impl.mo22984k();
    }

    public int nextInt() {
        return this.impl.mo22985l();
    }

    public long nextLong() {
        return this.impl.mo22988o();
    }

    public void setSeed(long j) {
        if (!this.seedInitialized) {
            this.seedInitialized = true;
            return;
        }
        throw new UnsupportedOperationException("Setting seed is not supported.");
    }

    public int nextInt(int i) {
        return this.impl.mo22986m(i);
    }
}

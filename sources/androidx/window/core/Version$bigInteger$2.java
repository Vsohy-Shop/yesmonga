package androidx.window.core;

import java.math.BigInteger;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Ljava/math/BigInteger;", "kotlin.jvm.PlatformType", "a", "()Ljava/math/BigInteger;"}, mo22517k = 3, mo22518mv = {1, 6, 0})
public final class Version$bigInteger$2 extends Lambda implements C11289a<BigInteger> {
    final /* synthetic */ Version this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Version$bigInteger$2(Version version) {
        super(0);
        this.this$0 = version;
    }

    /* renamed from: a */
    public final BigInteger invoke() {
        return BigInteger.valueOf((long) this.this$0.mo62748Q()).shiftLeft(32).or(BigInteger.valueOf((long) this.this$0.mo62749W())).shiftLeft(32).or(BigInteger.valueOf((long) this.this$0.mo62750X()));
    }
}

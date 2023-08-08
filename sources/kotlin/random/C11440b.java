package kotlin.random;

import java.util.Random;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.random.b */
public final class C11440b extends C11439a {
    @C12579k

    /* renamed from: c */
    public final C11441a f28573c = new C11441a();

    /* renamed from: kotlin.random.b$a */
    public static final class C11441a extends ThreadLocal<Random> {
        @C12579k
        /* renamed from: a */
        public Random initialValue() {
            return new Random();
        }
    }

    @C12579k
    /* renamed from: r */
    public Random mo22975r() {
        Object obj = this.f28573c.get();
        Intrinsics.checkNotNullExpressionValue(obj, "implStorage.get()");
        return (Random) obj;
    }
}

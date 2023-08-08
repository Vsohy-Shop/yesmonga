package kotlinx.serialization.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12247f;
import kotlinx.serialization.C12248g;
import org.jetbrains.annotations.C12579k;

@C12247f
/* renamed from: kotlinx.serialization.internal.y */
public interface C12327y<T> extends C12248g<T> {

    /* renamed from: kotlinx.serialization.internal.y$a */
    public static final class C12328a {
        @C12579k
        /* renamed from: a */
        public static <T> C12248g<?>[] m49635a(@C12579k C12327y<T> yVar) {
            Intrinsics.checkNotNullParameter(yVar, "this");
            return C12268e1.f30058a;
        }
    }

    @C12579k
    C12248g<?>[] childSerializers();

    @C12579k
    C12248g<?>[] typeParametersSerializers();
}

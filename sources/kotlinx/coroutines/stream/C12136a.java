package kotlinx.coroutines.stream;

import java.util.stream.Stream;
import kotlinx.coroutines.flow.C11907e;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.coroutines.stream.a */
public final class C12136a {
    @C12579k
    /* renamed from: a */
    public static final <T> C11907e<T> m48565a(@C12579k Stream<T> stream) {
        return new StreamFlow(stream);
    }
}

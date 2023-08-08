package kotlinx.coroutines.channels;

import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.channels.C11763t;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.coroutines.channels.r */
public interface C11760r<E> extends C12074o0, C11763t<E> {

    /* renamed from: kotlinx.coroutines.channels.r$a */
    public static final class C11761a {
        @C11395k(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @C11587t0(expression = "trySend(element).isSuccess", imports = {}))
        /* renamed from: a */
        public static <E> boolean m46763a(@C12579k C11760r<? super E> rVar, E e) {
            return C11763t.C11764a.m46774c(rVar, e);
        }
    }

    @C12579k
    /* renamed from: g */
    C11763t<E> mo23914g();
}

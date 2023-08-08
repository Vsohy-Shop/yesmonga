package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlinx.coroutines.C12092r2;
import kotlinx.coroutines.channels.C11763t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11395k(level = DeprecationLevel.WARNING, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
@C12092r2
/* renamed from: kotlinx.coroutines.channels.d */
public interface C11740d<E> extends C11763t<E> {

    /* renamed from: kotlinx.coroutines.channels.d$a */
    public static final class C11741a {
        /* renamed from: a */
        public static /* synthetic */ void m46573a(C11740d dVar, CancellationException cancellationException, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    cancellationException = null;
                }
                dVar.mo23910a(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        /* renamed from: b */
        public static /* synthetic */ boolean m46574b(C11740d dVar, Throwable th, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    th = null;
                }
                return dVar.mo23911c(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        @C11395k(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @C11587t0(expression = "trySend(element).isSuccess", imports = {}))
        /* renamed from: c */
        public static <E> boolean m46575c(@C12579k C11740d<E> dVar, E e) {
            return C11763t.C11764a.m46774c(dVar, e);
        }
    }

    @C12579k
    /* renamed from: A */
    ReceiveChannel<E> mo23749A();

    /* renamed from: a */
    void mo23910a(@C12580l CancellationException cancellationException);

    @C11395k(level = DeprecationLevel.HIDDEN, message = "Binary compatibility only")
    /* renamed from: c */
    /* synthetic */ boolean mo23911c(Throwable th);
}

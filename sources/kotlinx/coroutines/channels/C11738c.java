package kotlinx.coroutines.channels;

import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.coroutines.C11045c;
import kotlin.internal.C11112h;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12092r2;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.selects.C12126e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C12092r2
/* renamed from: kotlinx.coroutines.channels.c */
public interface C11738c<E> extends C12074o0, ReceiveChannel<E> {

    /* renamed from: kotlinx.coroutines.channels.c$a */
    public static final class C11739a {
        @C12579k
        /* renamed from: b */
        public static <E> C12126e<E> m46567b(@C12579k C11738c<E> cVar) {
            return ReceiveChannel.DefaultImpls.m46547d(cVar);
        }

        @C11395k(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @C11587t0(expression = "tryReceive().getOrNull()", imports = {}))
        @C12580l
        /* renamed from: c */
        public static <E> E m46568c(@C12579k C11738c<E> cVar) {
            return ReceiveChannel.DefaultImpls.m46551h(cVar);
        }

        @C11395k(level = DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @C11587t0(expression = "receiveCatching().getOrNull()", imports = {}))
        @C12580l
        @C11112h
        /* renamed from: d */
        public static <E> Object m46569d(@C12579k C11738c<E> cVar, @C12579k C11045c<? super E> cVar2) {
            return ReceiveChannel.DefaultImpls.m46552i(cVar, cVar2);
        }
    }

    @C12579k
    /* renamed from: g */
    C11744g<E> mo23909g();
}

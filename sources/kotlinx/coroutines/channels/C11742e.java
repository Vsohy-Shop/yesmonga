package kotlinx.coroutines.channels;

import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlinx.coroutines.C12092r2;
import kotlinx.coroutines.internal.C12009o0;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.coroutines.channels.e */
public final class C11742e {
    @C12579k

    /* renamed from: a */
    public static final C12009o0 f29152a = new C12009o0("NO_ELEMENT");

    @C11395k(level = DeprecationLevel.WARNING, message = "BroadcastChannel is deprecated in the favour of SharedFlow and StateFlow, and is no longer supported")
    @C12092r2
    @C12579k
    /* renamed from: a */
    public static final <E> C11740d<E> m46576a(int i) {
        if (i == -2) {
            return new BroadcastChannelImpl(C11744g.f29158x0.mo23915a());
        }
        if (i == -1) {
            return new C11756n();
        }
        if (i == 0) {
            throw new IllegalArgumentException("Unsupported 0 capacity for BroadcastChannel");
        } else if (i != Integer.MAX_VALUE) {
            return new BroadcastChannelImpl(i);
        } else {
            throw new IllegalArgumentException("Unsupported UNLIMITED capacity for BroadcastChannel");
        }
    }
}

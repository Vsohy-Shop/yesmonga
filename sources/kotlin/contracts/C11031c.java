package kotlin.contracts;

import kotlin.C11660u;
import kotlin.C11665v0;
import kotlin.internal.C11106b;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11665v0(version = "1.3")
@C11035f
@C11106b
/* renamed from: kotlin.contracts.c */
public interface C11031c {

    /* renamed from: kotlin.contracts.c$a */
    public static final class C11032a {
        /* renamed from: a */
        public static /* synthetic */ C11029a m42542a(C11031c cVar, C11660u uVar, InvocationKind invocationKind, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    invocationKind = InvocationKind.UNKNOWN;
                }
                return cVar.mo22472d(uVar, invocationKind);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: callsInPlace");
        }
    }

    @C11106b
    @C12579k
    /* renamed from: a */
    C11036g mo22469a();

    @C11106b
    @C12579k
    /* renamed from: b */
    C11036g mo22470b(@C12580l Object obj);

    @C11106b
    @C12579k
    /* renamed from: c */
    C11037h mo22471c();

    @C11106b
    @C12579k
    /* renamed from: d */
    <R> C11029a mo22472d(@C12579k C11660u<? extends R> uVar, @C12579k InvocationKind invocationKind);
}

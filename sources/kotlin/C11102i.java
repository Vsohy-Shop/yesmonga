package kotlin;

import kotlin.coroutines.C11045c;
import kotlin.coroutines.C11053g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11665v0(version = "1.7")
@C11053g
@C11097g2(markerClass = {C11429q.class})
/* renamed from: kotlin.i */
public abstract class C11102i<T, R> {
    public /* synthetic */ C11102i(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @C12580l
    /* renamed from: a */
    public abstract Object mo22532a(T t, @C12579k C11045c<? super R> cVar);

    @C12580l
    /* renamed from: b */
    public abstract <U, S> Object mo22533b(@C12579k C11094g<U, S> gVar, U u, @C12579k C11045c<? super S> cVar);

    @C11395k(level = DeprecationLevel.ERROR, message = "'invoke' should not be called from DeepRecursiveScope. Use 'callRecursive' to do recursion in the heap instead of the call stack.", replaceWith = @C11587t0(expression = "this.callRecursive(value)", imports = {}))
    @C12579k
    /* renamed from: e */
    public final Void mo22534e(@C12579k C11094g<?, ?> gVar, @C12580l Object obj) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        throw new UnsupportedOperationException("Should not be called from DeepRecursiveScope");
    }

    public C11102i() {
    }
}

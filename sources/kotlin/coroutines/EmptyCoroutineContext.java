package kotlin.coroutines;

import com.urbanairship.iam.events.C9175a;
import java.io.Serializable;
import kotlin.C11076d0;
import kotlin.C11665v0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J*\u0010\n\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f2\u0006\u0010\r\u001a\u00028\u00002\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0002J\u0014\u0010\u0014\u001a\u00020\u00012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016R\u0014\u0010\u001a\u001a\u00020\u00198\u0002XT¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, mo22516d2 = {"Lkotlin/coroutines/EmptyCoroutineContext;", "Lkotlin/coroutines/CoroutineContext;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "readResolve", "Lkotlin/coroutines/CoroutineContext$a;", "E", "Lkotlin/coroutines/CoroutineContext$b;", "key", "b", "(Lkotlin/coroutines/CoroutineContext$b;)Lkotlin/coroutines/CoroutineContext$a;", "R", "initial", "Lkotlin/Function2;", "operation", "l", "(Ljava/lang/Object;Lkotlin/jvm/functions/p;)Ljava/lang/Object;", "context", "Q", "f", "", "hashCode", "", "toString", "", "serialVersionUID", "J", "<init>", "()V", "kotlin-stdlib"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11665v0(version = "1.3")
public final class EmptyCoroutineContext implements CoroutineContext, Serializable {
    @C12579k

    /* renamed from: a */
    public static final EmptyCoroutineContext f28243a = new EmptyCoroutineContext();
    private static final long serialVersionUID = 0;

    private EmptyCoroutineContext() {
    }

    private final Object readResolve() {
        return f28243a;
    }

    @C12579k
    /* renamed from: Q */
    public CoroutineContext mo7443Q(@C12579k CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(coroutineContext, C9175a.f24932Y);
        return coroutineContext;
    }

    @C12580l
    /* renamed from: b */
    public <E extends CoroutineContext.C11040a> E mo7444b(@C12579k CoroutineContext.C11042b<E> bVar) {
        Intrinsics.checkNotNullParameter(bVar, "key");
        return null;
    }

    @C12579k
    /* renamed from: f */
    public CoroutineContext mo7445f(@C12579k CoroutineContext.C11042b<?> bVar) {
        Intrinsics.checkNotNullParameter(bVar, "key");
        return this;
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: l */
    public <R> R mo7446l(R r, @C12579k C11304p<? super R, ? super CoroutineContext.C11040a, ? extends R> pVar) {
        Intrinsics.checkNotNullParameter(pVar, "operation");
        return r;
    }

    @C12579k
    public String toString() {
        return "EmptyCoroutineContext";
    }
}

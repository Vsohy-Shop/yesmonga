package kotlinx.coroutines.debug.internal;

import kotlin.C11076d0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"", "R", "Lkotlinx/coroutines/debug/internal/DebugProbesImpl$a;", "owner", "a", "(Lkotlinx/coroutines/debug/internal/DebugProbesImpl$a;)Ljava/lang/Object;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nDebugProbesImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl$dumpCoroutinesInfoImpl$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,617:1\n1#2:618\n*E\n"})
public final class DebugProbesImpl$dumpCoroutinesInfoImpl$3 extends Lambda implements C11300l<DebugProbesImpl.C11778a<?>, R> {
    final /* synthetic */ C11304p<DebugProbesImpl.C11778a<?>, CoroutineContext, R> $create;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DebugProbesImpl$dumpCoroutinesInfoImpl$3(C11304p<? super DebugProbesImpl.C11778a<?>, ? super CoroutineContext, ? extends R> pVar) {
        super(1);
        this.$create = pVar;
    }

    @C12580l
    /* renamed from: a */
    public final R invoke(@C12579k DebugProbesImpl.C11778a<?> aVar) {
        CoroutineContext c;
        if (!DebugProbesImpl.f29218a.mo24039z(aVar) && (c = aVar.f29231b.mo23985c()) != null) {
            return this.$create.invoke(aVar, c);
        }
        return null;
    }
}

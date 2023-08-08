package kotlinx.coroutines.debug.internal;

import kotlin.C11076d0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo22516d2 = {"", "R", "Lkotlinx/coroutines/debug/internal/DebugProbesImpl$a;", "owner", "a", "(Lkotlinx/coroutines/debug/internal/DebugProbesImpl$a;)Ljava/lang/Object;", "kotlinx/coroutines/debug/internal/DebugProbesImpl$dumpCoroutinesInfoImpl$3"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nDebugProbesImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl$dumpCoroutinesInfoImpl$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n*L\n1#1,617:1\n1#2:618\n249#3:619\n*E\n"})
/* renamed from: kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpDebuggerInfo$$inlined$dumpCoroutinesInfoImpl$1 */
public final class C11784xee7de334 extends Lambda implements C11300l<DebugProbesImpl.C11778a<?>, DebuggerInfo> {
    public C11784xee7de334() {
        super(1);
    }

    @C12580l
    /* renamed from: a */
    public final DebuggerInfo invoke(@C12579k DebugProbesImpl.C11778a<?> aVar) {
        CoroutineContext c;
        if (!DebugProbesImpl.f29218a.mo24039z(aVar) && (c = aVar.f29231b.mo23985c()) != null) {
            return new DebuggerInfo(aVar.f29231b, c);
        }
        return null;
    }
}

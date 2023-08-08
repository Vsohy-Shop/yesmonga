package kotlinx.coroutines.channels;

import kotlin.C11079d2;
import kotlin.C11414o;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C12077o3;
import kotlinx.coroutines.channels.C11749j;
import kotlinx.coroutines.internal.C12009o0;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.selects.C12131j;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nConflatedBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConflatedBufferedChannel.kt\nkotlinx/coroutines/channels/ConflatedBufferedChannel\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n+ 3 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel\n+ 4 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannelKt\n+ 5 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$sendImpl$1\n*L\n1#1,119:1\n548#2,5:120\n514#2,6:125\n514#2,6:212\n548#2,5:218\n244#3:131\n269#3,10:132\n280#3,68:143\n3038#4:142\n269#5:211\n*S KotlinDebug\n*F\n+ 1 ConflatedBufferedChannel.kt\nkotlinx/coroutines/channels/ConflatedBufferedChannel\n*L\n41#1:120,5\n53#1:125,6\n106#1:212,6\n109#1:218,5\n80#1:131\n80#1:132,10\n80#1:143,68\n80#1:142\n80#1:211\n*E\n"})
/* renamed from: kotlinx.coroutines.channels.o */
public class C11757o<E> extends BufferedChannel<E> {

    /* renamed from: X */
    public final int f29178X;
    @C12579k

    /* renamed from: Y */
    public final BufferOverflow f29179Y;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11757o(int i, BufferOverflow bufferOverflow, C11300l lVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, bufferOverflow, (i2 & 4) != 0 ? null : lVar);
    }

    /* renamed from: K1 */
    public static /* synthetic */ <E> Object m46744K1(C11757o<E> oVar, E e, C11045c<? super C11079d2> cVar) {
        UndeliveredElementException d;
        Object O1 = oVar.mo23945O1(e, true);
        if (!(O1 instanceof C11749j.C11750a)) {
            return C11079d2.f28267a;
        }
        C11749j.m46635f(O1);
        C11300l<E, C11079d2> lVar = oVar.f29090b;
        if (lVar == null || (d = OnUndeliveredElementKt.m47765d(lVar, e, (UndeliveredElementException) null, 2, (Object) null)) == null) {
            throw oVar.mo23845q0();
        }
        C11414o.m43942a(d, oVar.mo23845q0());
        throw d;
    }

    /* renamed from: L1 */
    public static /* synthetic */ <E> Object m46745L1(C11757o<E> oVar, E e, C11045c<? super Boolean> cVar) {
        Object O1 = oVar.mo23945O1(e, true);
        if (O1 instanceof C11749j.C11752c) {
            return C11064a.m42615a(false);
        }
        C11079d2 d2Var = (C11079d2) O1;
        return C11064a.m42615a(true);
    }

    /* renamed from: C0 */
    public boolean mo23769C0() {
        return this.f29179Y == BufferOverflow.DROP_OLDEST;
    }

    @C12579k
    /* renamed from: L */
    public Object mo23751L(E e) {
        return mo23945O1(e, false);
    }

    /* renamed from: M1 */
    public final Object mo23943M1(E e, boolean z) {
        C11300l<E, C11079d2> lVar;
        UndeliveredElementException d;
        Object L = super.mo23751L(e);
        if (C11749j.m46642m(L) || C11749j.m46640k(L)) {
            return L;
        }
        if (!z || (lVar = this.f29090b) == null || (d = OnUndeliveredElementKt.m47765d(lVar, e, (UndeliveredElementException) null, 2, (Object) null)) == null) {
            return C11749j.f29170b.mo23927c(C11079d2.f28267a);
        }
        throw d;
    }

    /* renamed from: N1 */
    public final Object mo23944N1(E e) {
        C11754l lVar;
        C12077o3 o3Var;
        C12009o0 o0Var = BufferedChannelKt.f29121f;
        C11754l lVar2 = (C11754l) BufferedChannel.f29084v.get(this);
        while (true) {
            long andIncrement = BufferedChannel.f29080d.getAndIncrement(this);
            long j = andIncrement & BufferedChannelKt.f29113G;
            boolean m = mo23767B0(andIncrement);
            int i = BufferedChannelKt.f29117b;
            long j2 = j / ((long) i);
            int i2 = (int) (j % ((long) i));
            if (lVar2.f29607c != j2) {
                C11754l d = mo23822b0(j2, lVar2);
                if (d != null) {
                    lVar = d;
                } else if (m) {
                    return C11749j.f29170b.mo23925a(mo23845q0());
                }
            } else {
                lVar = lVar2;
            }
            int D = mo23776F1(lVar, i2, e, j, o0Var, m);
            if (D == 0) {
                lVar.mo24349b();
                return C11749j.f29170b.mo23927c(C11079d2.f28267a);
            } else if (D == 1) {
                return C11749j.f29170b.mo23927c(C11079d2.f28267a);
            } else {
                if (D != 2) {
                    if (D == 3) {
                        throw new IllegalStateException("unexpected".toString());
                    } else if (D != 4) {
                        if (D == 5) {
                            lVar.mo24349b();
                        }
                        lVar2 = lVar;
                    } else {
                        if (j < mo23843p0()) {
                            lVar.mo24349b();
                        }
                        return C11749j.f29170b.mo23925a(mo23845q0());
                    }
                } else if (m) {
                    lVar.mo24381r();
                    return C11749j.f29170b.mo23925a(mo23845q0());
                } else {
                    if (o0Var instanceof C12077o3) {
                        o3Var = (C12077o3) o0Var;
                    } else {
                        o3Var = null;
                    }
                    if (o3Var != null) {
                        mo23812W0(o3Var, lVar, i2);
                    }
                    mo23801R((lVar.f29607c * ((long) i)) + ((long) i2));
                    return C11749j.f29170b.mo23927c(C11079d2.f28267a);
                }
            }
        }
    }

    /* renamed from: O1 */
    public final Object mo23945O1(E e, boolean z) {
        if (this.f29179Y == BufferOverflow.DROP_LATEST) {
            return mo23943M1(e, z);
        }
        return mo23944N1(e);
    }

    @C12580l
    /* renamed from: h0 */
    public Object mo23757h0(E e, @C12579k C11045c<? super C11079d2> cVar) {
        return m46744K1(this, e, cVar);
    }

    /* renamed from: j1 */
    public void mo23759j1(@C12579k C12131j<?> jVar, @C12580l Object obj) {
        Object L = mo23751L(obj);
        if (!(L instanceof C11749j.C11752c)) {
            C11079d2 d2Var = (C11079d2) L;
            jVar.mo24707e(C11079d2.f28267a);
        } else if (L instanceof C11749j.C11750a) {
            C11749j.m46635f(L);
            jVar.mo24707e(BufferedChannelKt.m46421z());
        } else {
            throw new IllegalStateException("unreachable".toString());
        }
    }

    @C12580l
    /* renamed from: p1 */
    public Object mo23844p1(E e, @C12579k C11045c<? super Boolean> cVar) {
        return m46745L1(this, e, cVar);
    }

    /* renamed from: w1 */
    public boolean mo23855w1() {
        return false;
    }

    public C11757o(int i, @C12579k BufferOverflow bufferOverflow, @C12580l C11300l<? super E, C11079d2> lVar) {
        super(i, lVar);
        this.f29178X = i;
        this.f29179Y = bufferOverflow;
        boolean z = false;
        if (bufferOverflow != BufferOverflow.SUSPEND) {
            if (!(i >= 1 ? true : z)) {
                throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i + " was specified").toString());
            }
            return;
        }
        throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + C11342l0.m43547d(BufferedChannel.class).mo22848s() + " instead").toString());
    }
}

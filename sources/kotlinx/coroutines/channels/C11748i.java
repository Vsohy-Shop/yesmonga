package kotlinx.coroutines.channels;

import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlinx.coroutines.channels.C11749j;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.channels.i */
public final class C11748i {
    @C12579k
    /* renamed from: b */
    public static final <E> C11744g<E> m46623b(int i, @C12579k BufferOverflow bufferOverflow, @C12580l C11300l<? super E, C11079d2> lVar) {
        C11744g<E> oVar;
        if (i != -2) {
            boolean z = false;
            if (i == -1) {
                if (bufferOverflow == BufferOverflow.SUSPEND) {
                    z = true;
                }
                if (z) {
                    return new C11757o(1, BufferOverflow.DROP_OLDEST, lVar);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
            } else if (i != 0) {
                if (i == Integer.MAX_VALUE) {
                    return new BufferedChannel(Integer.MAX_VALUE, lVar);
                }
                if (bufferOverflow == BufferOverflow.SUSPEND) {
                    return new BufferedChannel(i, lVar);
                }
                return new C11757o(i, bufferOverflow, lVar);
            } else if (bufferOverflow == BufferOverflow.SUSPEND) {
                oVar = new BufferedChannel<>(0, lVar);
            } else {
                oVar = new C11757o<>(1, bufferOverflow, lVar);
            }
        } else if (bufferOverflow == BufferOverflow.SUSPEND) {
            oVar = new BufferedChannel<>(C11744g.f29158x0.mo23915a(), lVar);
        } else {
            oVar = new C11757o<>(1, bufferOverflow, lVar);
        }
        return oVar;
    }

    /* renamed from: c */
    public static /* synthetic */ C11744g m46624c(int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return m46625d(i, (BufferOverflow) null, (C11300l) null, 6, (Object) null);
    }

    /* renamed from: d */
    public static /* synthetic */ C11744g m46625d(int i, BufferOverflow bufferOverflow, C11300l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        if ((i2 & 4) != 0) {
            lVar = null;
        }
        return m46623b(i, bufferOverflow, lVar);
    }

    /* renamed from: e */
    public static final <T> T m46626e(@C12579k Object obj, @C12579k C11300l<? super Throwable, ? extends T> lVar) {
        return obj instanceof C11749j.C11752c ? lVar.invoke(C11749j.m46635f(obj)) : obj;
    }

    @C12579k
    /* renamed from: f */
    public static final <T> Object m46627f(@C12579k Object obj, @C12579k C11300l<? super Throwable, C11079d2> lVar) {
        if (obj instanceof C11749j.C11750a) {
            lVar.invoke(C11749j.m46635f(obj));
        }
        return obj;
    }

    @C12579k
    /* renamed from: g */
    public static final <T> Object m46628g(@C12579k Object obj, @C12579k C11300l<? super Throwable, C11079d2> lVar) {
        if (obj instanceof C11749j.C11752c) {
            lVar.invoke(C11749j.m46635f(obj));
        }
        return obj;
    }

    @C12579k
    /* renamed from: h */
    public static final <T> Object m46629h(@C12579k Object obj, @C12579k C11300l<? super T, C11079d2> lVar) {
        if (!(obj instanceof C11749j.C11752c)) {
            lVar.invoke(obj);
        }
        return obj;
    }
}

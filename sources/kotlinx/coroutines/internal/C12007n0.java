package kotlinx.coroutines.internal;

import _COROUTINE.C0000a;
import _COROUTINE.C0001b;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.C11078d1;
import kotlin.C11661u0;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.C11066c;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nStackTraceRecovery.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,214:1\n1735#2,6:215\n12744#2,2:223\n1627#2,6:227\n12744#2,2:233\n1627#2,6:236\n37#3,2:221\n26#4:225\n26#4:226\n1#5:235\n*S KotlinDebug\n*F\n+ 1 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n43#1:215,6\n131#1:223,2\n141#1:227,6\n171#1:233,2\n192#1:236,6\n106#1:221,2\n133#1:225\n135#1:226\n*E\n"})
/* renamed from: kotlinx.coroutines.internal.n0 */
public final class C12007n0 {
    @C12579k

    /* renamed from: a */
    public static final String f29612a = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
    @C12579k

    /* renamed from: b */
    public static final String f29613b = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
    @C12579k

    /* renamed from: c */
    public static final StackTraceElement f29614c = new C0000a().mo1a();

    /* renamed from: d */
    public static final String f29615d;

    /* renamed from: e */
    public static final String f29616e;

    static {
        Object obj;
        Object obj2;
        try {
            Result.C10852a aVar = Result.f28060a;
            obj = Result.m38702b(BaseContinuationImpl.class.getCanonicalName());
        } catch (Throwable th) {
            Result.C10852a aVar2 = Result.f28060a;
            obj = Result.m38702b(C11661u0.m45734a(th));
        }
        if (Result.m38705e(obj) != null) {
            obj = f29612a;
        }
        f29615d = (String) obj;
        try {
            Result.C10852a aVar3 = Result.f28060a;
            obj2 = Result.m38702b(C12007n0.class.getCanonicalName());
        } catch (Throwable th2) {
            Result.C10852a aVar4 = Result.f28060a;
            obj2 = Result.m38702b(C11661u0.m45734a(th2));
        }
        if (Result.m38705e(obj2) != null) {
            obj2 = f29613b;
        }
        f29616e = (String) obj2;
    }

    /* renamed from: a */
    public static /* synthetic */ void m47898a() {
    }

    /* renamed from: b */
    public static /* synthetic */ void m47899b() {
    }

    /* renamed from: d */
    public static final <E extends Throwable> Pair<E, StackTraceElement[]> m47901d(E e) {
        boolean z;
        Throwable cause = e.getCause();
        if (cause == null || !Intrinsics.areEqual((Object) cause.getClass(), (Object) e.getClass())) {
            return C11078d1.m42659a(e, new StackTraceElement[0]);
        }
        StackTraceElement[] stackTrace = e.getStackTrace();
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            } else if (m47907j(stackTrace[i])) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            return C11078d1.m42659a(cause, stackTrace);
        }
        return C11078d1.m42659a(e, new StackTraceElement[0]);
    }

    /* renamed from: e */
    public static final <E extends Throwable> E m47902e(E e, E e2, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(f29614c);
        StackTraceElement[] stackTrace = e.getStackTrace();
        int h = m47905h(stackTrace, f29615d);
        int i = 0;
        if (h == -1) {
            e2.setStackTrace((StackTraceElement[]) arrayDeque.toArray(new StackTraceElement[0]));
            return e2;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[(arrayDeque.size() + h)];
        for (int i2 = 0; i2 < h; i2++) {
            stackTraceElementArr[i2] = stackTrace[i2];
        }
        Iterator<StackTraceElement> it = arrayDeque.iterator();
        while (it.hasNext()) {
            stackTraceElementArr[i + h] = it.next();
            i++;
        }
        e2.setStackTrace(stackTraceElementArr);
        return e2;
    }

    /* renamed from: f */
    public static final ArrayDeque<StackTraceElement> m47903f(C11066c cVar) {
        ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<>();
        StackTraceElement stackTraceElement = cVar.getStackTraceElement();
        if (stackTraceElement != null) {
            arrayDeque.add(stackTraceElement);
        }
        while (true) {
            cVar = cVar.getCallerFrame();
            if (cVar == null) {
                return arrayDeque;
            }
            StackTraceElement stackTraceElement2 = cVar.getStackTraceElement();
            if (stackTraceElement2 != null) {
                arrayDeque.add(stackTraceElement2);
            }
        }
    }

    /* renamed from: g */
    public static final boolean m47904g(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        if (stackTraceElement.getLineNumber() != stackTraceElement2.getLineNumber() || !Intrinsics.areEqual((Object) stackTraceElement.getMethodName(), (Object) stackTraceElement2.getMethodName()) || !Intrinsics.areEqual((Object) stackTraceElement.getFileName(), (Object) stackTraceElement2.getFileName()) || !Intrinsics.areEqual((Object) stackTraceElement.getClassName(), (Object) stackTraceElement2.getClassName())) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static final int m47905h(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i = 0; i < length; i++) {
            if (Intrinsics.areEqual((Object) str, (Object) stackTraceElementArr[i].getClassName())) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: i */
    public static final void m47906i(@C12579k Throwable th, @C12579k Throwable th2) {
        th.initCause(th2);
    }

    /* renamed from: j */
    public static final boolean m47907j(@C12579k StackTraceElement stackTraceElement) {
        return C11622t.startsWith$default(stackTraceElement.getClassName(), C0001b.m4c(), false, 2, (Object) null);
    }

    /* renamed from: k */
    public static final void m47908k(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (m47907j(stackTraceElementArr[i])) {
                break;
            } else {
                i++;
            }
        }
        int i2 = i + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (i2 <= length2) {
            while (true) {
                if (m47904g(stackTraceElementArr[length2], arrayDeque.getLast())) {
                    arrayDeque.removeLast();
                }
                arrayDeque.addFirst(stackTraceElementArr[length2]);
                if (length2 != i2) {
                    length2--;
                } else {
                    return;
                }
            }
        }
    }

    @C12580l
    /* renamed from: l */
    public static final Object m47909l(@C12579k Throwable th, @C12579k C11045c<?> cVar) {
        throw th;
    }

    /* renamed from: m */
    public static final Object m47910m(Throwable th, C11045c<?> cVar) {
        throw th;
    }

    /* renamed from: n */
    public static final <E extends Throwable> E m47911n(E e, C11066c cVar) {
        Pair d = m47901d(e);
        E e2 = (Throwable) d.mo21846a();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) d.mo21847b();
        Throwable g = ExceptionsConstructorKt.m47730g(e2);
        if (g == null) {
            return e;
        }
        ArrayDeque f = m47903f(cVar);
        if (f.isEmpty()) {
            return e;
        }
        if (e2 != e) {
            m47908k(stackTraceElementArr, f);
        }
        return m47902e(e2, g, f);
    }

    @C12579k
    /* renamed from: o */
    public static final <E extends Throwable> E m47912o(@C12579k E e) {
        return e;
    }

    @C12579k
    /* renamed from: p */
    public static final <E extends Throwable> E m47913p(@C12579k E e, @C12579k C11045c<?> cVar) {
        return e;
    }

    /* renamed from: q */
    public static final <E extends Throwable> E m47914q(E e) {
        int i;
        StackTraceElement stackTraceElement;
        StackTraceElement[] stackTrace = e.getStackTrace();
        int length = stackTrace.length;
        int length2 = stackTrace.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i2 = length2 - 1;
                if (Intrinsics.areEqual((Object) f29616e, (Object) stackTrace[length2].getClassName())) {
                    break;
                } else if (i2 < 0) {
                    break;
                } else {
                    length2 = i2;
                }
            }
        }
        length2 = -1;
        int i3 = length2 + 1;
        int h = m47905h(stackTrace, f29615d);
        if (h == -1) {
            i = 0;
        } else {
            i = length - h;
        }
        int i4 = (length - length2) - i;
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            if (i5 == 0) {
                stackTraceElement = f29614c;
            } else {
                stackTraceElement = stackTrace[(i3 + i5) - 1];
            }
            stackTraceElementArr[i5] = stackTraceElement;
        }
        e.setStackTrace(stackTraceElementArr);
        return e;
    }

    @C12579k
    /* renamed from: r */
    public static final <E extends Throwable> E m47915r(@C12579k E e) {
        return e;
    }

    @C12579k
    /* renamed from: s */
    public static final <E extends Throwable> E m47916s(@C12579k E e) {
        E cause = e.getCause();
        if (cause != null && Intrinsics.areEqual((Object) cause.getClass(), (Object) e.getClass())) {
            StackTraceElement[] stackTrace = e.getStackTrace();
            int length = stackTrace.length;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (m47907j(stackTrace[i])) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                return cause;
            }
        }
        return e;
    }
}

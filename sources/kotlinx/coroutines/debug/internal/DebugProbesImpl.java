package kotlinx.coroutines.debug.internal;

import _COROUTINE.C0000a;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.C11078d1;
import kotlin.C11079d2;
import kotlin.C11532s0;
import kotlin.C11661u0;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.C10975r0;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.C11006g;
import kotlin.concurrent.C11024b;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.C11066c;
import kotlin.jvm.C11287e;
import kotlin.jvm.C11314h;
import kotlin.jvm.C11394v;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11370u0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.C11622t;
import kotlin.text.StringsKt__IndentKt;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C11804f2;
import kotlinx.coroutines.C12061m0;
import kotlinx.coroutines.C12067n0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.internal.C12001k0;
import kotlinx.coroutines.internal.C12007n0;
import kotlinx.serialization.json.internal.C12361b;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nDebugProbesImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,617:1\n147#1:635\n148#1,4:637\n153#1,5:642\n147#1:647\n148#1,4:649\n153#1,5:654\n1#2:618\n1#2:636\n1#2:648\n766#3:619\n857#3,2:620\n1208#3,2:622\n1238#3,4:624\n1855#3,2:662\n350#3,7:670\n1819#3,8:677\n603#4:628\n603#4:641\n603#4:653\n603#4:659\n1295#4,2:660\n37#5,2:629\n37#5,2:631\n37#5,2:633\n1627#6,6:664\n1735#6,6:685\n*S KotlinDebug\n*F\n+ 1 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n*L\n242#1:635\n242#1:637,4\n242#1:642,5\n249#1:647\n249#1:649,4\n249#1:654,5\n242#1:636\n249#1:648\n107#1:619\n107#1:620,2\n108#1:622,2\n108#1:624,4\n304#1:662,2\n413#1:670,7\n503#1:677,8\n151#1:628\n242#1:641\n249#1:653\n284#1:659\n285#1:660,2\n208#1:629,2\n209#1:631,2\n210#1:633,2\n352#1:664,6\n555#1:685,6\n*E\n"})
@C11532s0
public final class DebugProbesImpl {
    @C12579k

    /* renamed from: a */
    public static final DebugProbesImpl f29218a;
    @C12579k

    /* renamed from: b */
    public static final StackTraceElement f29219b = new C0000a().mo2b();
    @C12579k

    /* renamed from: c */
    public static final SimpleDateFormat f29220c = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    @C12580l

    /* renamed from: d */
    public static Thread f29221d;
    @C12579k

    /* renamed from: e */
    public static final ConcurrentWeakMap<C11778a<?>, Boolean> f29222e = new ConcurrentWeakMap<>(false, 1, (DefaultConstructorMarker) null);

    /* renamed from: f */
    public static boolean f29223f = true;

    /* renamed from: g */
    public static boolean f29224g = true;

    /* renamed from: h */
    public static boolean f29225h = true;
    @C12580l

    /* renamed from: i */
    public static final C11300l<Boolean, C11079d2> f29226i;
    @C12579k

    /* renamed from: j */
    public static final ConcurrentWeakMap<C11066c, DebugCoroutineInfoImpl> f29227j = new ConcurrentWeakMap<>(true);
    @C12579k

    /* renamed from: k */
    public static final C11779b f29228k = new C11779b((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: l */
    public static final C11780c f29229l = new C11780c((DefaultConstructorMarker) null);

    /* renamed from: kotlinx.coroutines.debug.internal.DebugProbesImpl$a */
    public static final class C11778a<T> implements C11045c<T>, C11066c {
        @C12579k
        @C11287e

        /* renamed from: a */
        public final C11045c<T> f29230a;
        @C12579k
        @C11287e

        /* renamed from: b */
        public final DebugCoroutineInfoImpl f29231b;

        public C11778a(@C12579k C11045c<? super T> cVar, @C12579k DebugCoroutineInfoImpl debugCoroutineInfoImpl) {
            this.f29230a = cVar;
            this.f29231b = debugCoroutineInfoImpl;
        }

        /* renamed from: a */
        public final C11793i mo24040a() {
            return this.f29231b.mo23986d();
        }

        @C12580l
        public C11066c getCallerFrame() {
            C11793i a = mo24040a();
            if (a != null) {
                return a.getCallerFrame();
            }
            return null;
        }

        @C12579k
        public CoroutineContext getContext() {
            return this.f29230a.getContext();
        }

        @C12580l
        public StackTraceElement getStackTraceElement() {
            C11793i a = mo24040a();
            if (a != null) {
                return a.getStackTraceElement();
            }
            return null;
        }

        public void resumeWith(@C12579k Object obj) {
            DebugProbesImpl.f29218a.mo24001F(this);
            this.f29230a.resumeWith(obj);
        }

        @C12579k
        public String toString() {
            return this.f29230a.toString();
        }
    }

    /* renamed from: kotlinx.coroutines.debug.internal.DebugProbesImpl$b */
    public static final class C11779b {
        @C12579k

        /* renamed from: a */
        public static final AtomicIntegerFieldUpdater f29232a = AtomicIntegerFieldUpdater.newUpdater(C11779b.class, "installations");
        @C11394v
        private volatile int installations;

        public C11779b() {
        }

        public /* synthetic */ C11779b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: kotlinx.coroutines.debug.internal.DebugProbesImpl$c */
    public static final class C11780c {
        @C12579k

        /* renamed from: a */
        public static final AtomicLongFieldUpdater f29233a = AtomicLongFieldUpdater.newUpdater(C11780c.class, "sequenceNumber");
        @C11394v
        private volatile long sequenceNumber;

        public C11780c() {
        }

        public /* synthetic */ C11780c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @C11363r0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n*L\n1#1,328:1\n151#2:329\n*E\n"})
    /* renamed from: kotlinx.coroutines.debug.internal.DebugProbesImpl$d */
    public static final class C11781d<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C11006g.m42424l(Long.valueOf(((C11778a) t).f29231b.f29215b), Long.valueOf(((C11778a) t2).f29231b.f29215b));
        }
    }

    @C11363r0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n*L\n1#1,328:1\n284#2:329\n*E\n"})
    /* renamed from: kotlinx.coroutines.debug.internal.DebugProbesImpl$e */
    public static final class C11782e<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C11006g.m42424l(Long.valueOf(((C11778a) t).f29231b.f29215b), Long.valueOf(((C11778a) t2).f29231b.f29215b));
        }
    }

    static {
        DebugProbesImpl debugProbesImpl = new DebugProbesImpl();
        f29218a = debugProbesImpl;
        f29226i = debugProbesImpl.mo24033t();
    }

    /* renamed from: s */
    public static /* synthetic */ void m46841s(C11723c2 c2Var) {
    }

    /* renamed from: A */
    public final boolean mo23996A() {
        return C11779b.f29232a.get(f29228k) > 0;
    }

    /* renamed from: B */
    public final boolean mo23997B(StackTraceElement stackTraceElement) {
        return C11622t.startsWith$default(stackTraceElement.getClassName(), "kotlinx.coroutines", false, 2, (Object) null);
    }

    /* renamed from: C */
    public final C11778a<?> mo23998C(C11045c<?> cVar) {
        C11066c cVar2 = cVar instanceof C11066c ? (C11066c) cVar : null;
        if (cVar2 != null) {
            return mo23999D(cVar2);
        }
        return null;
    }

    /* renamed from: D */
    public final C11778a<?> mo23999D(C11066c cVar) {
        while (!(cVar instanceof C11778a)) {
            cVar = cVar.getCallerFrame();
            if (cVar == null) {
                return null;
            }
        }
        return (C11778a) cVar;
    }

    /* renamed from: E */
    public final void mo24000E(PrintStream printStream, List<StackTraceElement> list) {
        for (StackTraceElement stackTraceElement : list) {
            printStream.print("\n\tat " + stackTraceElement);
        }
    }

    /* renamed from: F */
    public final void mo24001F(C11778a<?> aVar) {
        C11066c J;
        f29222e.remove(aVar);
        C11066c f = aVar.f29231b.mo23988f();
        if (f != null && (J = mo24005J(f)) != null) {
            f29227j.remove(J);
        }
    }

    @C12579k
    /* renamed from: G */
    public final <T> C11045c<T> mo24002G(@C12579k C11045c<? super T> cVar) {
        C11793i iVar;
        if (!mo23996A()) {
            return cVar;
        }
        if ((f29225h && cVar.getContext() == EmptyCoroutineContext.f28243a) || mo23998C(cVar) != null) {
            return cVar;
        }
        if (f29224g) {
            iVar = mo24012Q(mo24006K(new Exception()));
        } else {
            iVar = null;
        }
        return mo24019e(cVar, iVar);
    }

    /* renamed from: H */
    public final void mo24003H(@C12579k C11045c<?> cVar) {
        mo24016U(cVar, C11788d.f29252b);
    }

    /* renamed from: I */
    public final void mo24004I(@C12579k C11045c<?> cVar) {
        mo24016U(cVar, C11788d.f29253c);
    }

    /* renamed from: J */
    public final C11066c mo24005J(C11066c cVar) {
        do {
            cVar = cVar.getCallerFrame();
            if (cVar == null) {
                return null;
            }
        } while (cVar.getStackTraceElement() == null);
        return cVar;
    }

    /* renamed from: K */
    public final <T extends Throwable> List<StackTraceElement> mo24006K(T t) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        int length2 = stackTrace.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i2 = length2 - 1;
                if (Intrinsics.areEqual((Object) stackTrace[length2].getClassName(), (Object) "kotlin.coroutines.jvm.internal.DebugProbesKt")) {
                    i = length2;
                    break;
                } else if (i2 < 0) {
                    break;
                } else {
                    length2 = i2;
                }
            }
        }
        int i3 = i + 1;
        if (!f29223f) {
            int i4 = length - i3;
            ArrayList arrayList = new ArrayList(i4);
            for (int i5 = 0; i5 < i4; i5++) {
                arrayList.add(stackTrace[i5 + i3]);
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList((length - i3) + 1);
        while (i3 < length) {
            if (mo23997B(stackTrace[i3])) {
                arrayList2.add(stackTrace[i3]);
                int i6 = i3 + 1;
                while (i6 < length && mo23997B(stackTrace[i6])) {
                    i6++;
                }
                int i7 = i6 - 1;
                int i8 = i7;
                while (i8 > i3 && stackTrace[i8].getFileName() == null) {
                    i8--;
                }
                if (i8 > i3 && i8 < i7) {
                    arrayList2.add(stackTrace[i8]);
                }
                arrayList2.add(stackTrace[i7]);
                i3 = i6;
            } else {
                arrayList2.add(stackTrace[i3]);
                i3++;
            }
        }
        return arrayList2;
    }

    /* renamed from: L */
    public final void mo24007L(boolean z) {
        f29224g = z;
    }

    /* renamed from: M */
    public final void mo24008M(boolean z) {
        f29225h = z;
    }

    /* renamed from: N */
    public final void mo24009N(boolean z) {
        f29223f = z;
    }

    /* renamed from: O */
    public final void mo24010O() {
        f29221d = C11024b.m42519c(false, true, (ClassLoader) null, "Coroutines Debugger Cleaner", 0, DebugProbesImpl$startWeakRefCleanerThread$1.f29235f, 21, (Object) null);
    }

    /* renamed from: P */
    public final void mo24011P() {
        Thread thread = f29221d;
        if (thread != null) {
            f29221d = null;
            thread.interrupt();
            thread.join();
        }
    }

    /* renamed from: Q */
    public final C11793i mo24012Q(List<StackTraceElement> list) {
        C11793i iVar = null;
        if (!list.isEmpty()) {
            ListIterator<StackTraceElement> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                iVar = new C11793i(iVar, listIterator.previous());
            }
        }
        return new C11793i(iVar, f29219b);
    }

    /* renamed from: R */
    public final String mo24013R(Object obj) {
        return C11789e.m46917b(obj.toString());
    }

    /* renamed from: S */
    public final void mo24014S() {
        C11300l<Boolean, C11079d2> lVar;
        if (!mo23996A()) {
            throw new IllegalStateException("Agent was not installed".toString());
        } else if (C11779b.f29232a.decrementAndGet(f29228k) == 0) {
            mo24011P();
            f29222e.clear();
            f29227j.clear();
            if (!C11785a.f29236a.mo24056a() && (lVar = f29226i) != null) {
                lVar.invoke(Boolean.FALSE);
            }
        }
    }

    /* renamed from: T */
    public final void mo24015T(C11066c cVar, String str) {
        boolean z;
        C11066c cVar2;
        if (mo23996A()) {
            ConcurrentWeakMap<C11066c, DebugCoroutineInfoImpl> concurrentWeakMap = f29227j;
            DebugCoroutineInfoImpl remove = concurrentWeakMap.remove(cVar);
            if (remove != null) {
                z = false;
            } else {
                C11778a<?> D = mo23999D(cVar);
                if (D != null && (remove = D.f29231b) != null) {
                    C11066c f = remove.mo23988f();
                    if (f != null) {
                        cVar2 = mo24005J(f);
                    } else {
                        cVar2 = null;
                    }
                    if (cVar2 != null) {
                        concurrentWeakMap.remove(cVar2);
                    }
                    z = true;
                } else {
                    return;
                }
            }
            Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<*>");
            remove.mo23992j(str, (C11045c) cVar, z);
            C11066c J = mo24005J(cVar);
            if (J != null) {
                concurrentWeakMap.put(J, remove);
            }
        }
    }

    /* renamed from: U */
    public final void mo24016U(C11045c<?> cVar, String str) {
        C11066c cVar2;
        if (mo23996A()) {
            if (f29225h && cVar.getContext() == EmptyCoroutineContext.f28243a) {
                return;
            }
            if (Intrinsics.areEqual((Object) str, (Object) C11788d.f29252b)) {
                if (cVar instanceof C11066c) {
                    cVar2 = (C11066c) cVar;
                } else {
                    cVar2 = null;
                }
                if (cVar2 != null) {
                    mo24015T(cVar2, str);
                    return;
                }
                return;
            }
            C11778a<?> C = mo23998C(cVar);
            if (C != null) {
                mo24017V(C, cVar, str);
            }
        }
    }

    /* renamed from: V */
    public final void mo24017V(C11778a<?> aVar, C11045c<?> cVar, String str) {
        if (mo23996A()) {
            aVar.f29231b.mo23992j(str, cVar, true);
        }
    }

    /* renamed from: d */
    public final void mo24018d(C11723c2 c2Var, Map<C11723c2, DebugCoroutineInfoImpl> map, StringBuilder sb, String str) {
        DebugCoroutineInfoImpl debugCoroutineInfoImpl = map.get(c2Var);
        if (debugCoroutineInfoImpl != null) {
            String g = debugCoroutineInfoImpl.mo23989g();
            sb.append(str + mo24032r(c2Var) + ", continuation is " + g + " at line " + ((StackTraceElement) CollectionsKt___CollectionsKt.m40479B2(debugCoroutineInfoImpl.mo23990h())) + 10);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(9);
            str = sb2.toString();
        } else if (!(c2Var instanceof C12001k0)) {
            sb.append(str + mo24032r(c2Var) + 10);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(9);
            str = sb3.toString();
        }
        for (C11723c2 d : c2Var.mo23646r()) {
            mo24018d(d, map, sb, str);
        }
    }

    /* renamed from: e */
    public final <T> C11045c<T> mo24019e(C11045c<? super T> cVar, C11793i iVar) {
        if (!mo23996A()) {
            return cVar;
        }
        C11778a aVar = new C11778a(cVar, new DebugCoroutineInfoImpl(cVar.getContext(), iVar, C11780c.f29233a.incrementAndGet(f29229l)));
        ConcurrentWeakMap<C11778a<?>, Boolean> concurrentWeakMap = f29222e;
        concurrentWeakMap.put(aVar, Boolean.TRUE);
        if (!mo23996A()) {
            concurrentWeakMap.clear();
        }
        return aVar;
    }

    @C11314h(name = "dumpCoroutines")
    /* renamed from: f */
    public final void mo24020f(@C12579k PrintStream printStream) {
        synchronized (printStream) {
            f29218a.mo24024j(printStream);
            C11079d2 d2Var = C11079d2.f28267a;
        }
    }

    @C12579k
    /* renamed from: g */
    public final List<C11787c> mo24021g() {
        if (mo23996A()) {
            return SequencesKt___SequencesKt.m44731c3(SequencesKt___SequencesKt.m44781p1(SequencesKt___SequencesKt.m44659K2(CollectionsKt___CollectionsKt.m40700v1(mo24031q()), new C11781d()), new C11783x49f1cbae()));
        }
        throw new IllegalStateException("Debug probes are not installed".toString());
    }

    @C12579k
    /* renamed from: h */
    public final Object[] mo24022h() {
        String str;
        String str2;
        String V;
        List<C11787c> g = mo24021g();
        int size = g.size();
        ArrayList arrayList = new ArrayList(size);
        ArrayList arrayList2 = new ArrayList(size);
        ArrayList arrayList3 = new ArrayList(size);
        for (C11787c next : g) {
            CoroutineContext a = next.mo24058a();
            C12067n0 n0Var = (C12067n0) a.mo7444b(C12067n0.f29709c);
            Long l = null;
            if (n0Var == null || (V = n0Var.mo24524V()) == null) {
                str = null;
            } else {
                str = mo24013R(V);
            }
            CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) a.mo7444b(CoroutineDispatcher.f29001b);
            if (coroutineDispatcher != null) {
                str2 = mo24013R(coroutineDispatcher);
            } else {
                str2 = null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("\n                {\n                    \"name\": ");
            sb.append(str);
            sb.append(",\n                    \"id\": ");
            C12061m0 m0Var = (C12061m0) a.mo7444b(C12061m0.f29706c);
            if (m0Var != null) {
                l = Long.valueOf(m0Var.mo24511V());
            }
            sb.append(l);
            sb.append(",\n                    \"dispatcher\": ");
            sb.append(str2);
            sb.append(",\n                    \"sequenceNumber\": ");
            sb.append(next.mo24063f());
            sb.append(",\n                    \"state\": \"");
            sb.append(next.mo24064g());
            sb.append("\"\n                } \n                ");
            arrayList3.add(StringsKt__IndentKt.trimIndent(sb.toString()));
            arrayList2.add(next.mo24061d());
            arrayList.add(next.mo24062e());
        }
        return new Object[]{C12361b.f30260k + CollectionsKt___CollectionsKt.m40639h3(arrayList3, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C11300l) null, 63, (Object) null) + C12361b.f30261l, arrayList.toArray(new Thread[0]), arrayList2.toArray(new C11066c[0]), g.toArray(new C11787c[0])};
    }

    /* renamed from: i */
    public final <R> List<R> mo24023i(C11304p<? super C11778a<?>, ? super CoroutineContext, ? extends R> pVar) {
        if (mo23996A()) {
            return SequencesKt___SequencesKt.m44731c3(SequencesKt___SequencesKt.m44781p1(SequencesKt___SequencesKt.m44659K2(CollectionsKt___CollectionsKt.m40700v1(mo24031q()), new C11781d()), new DebugProbesImpl$dumpCoroutinesInfoImpl$3(pVar)));
        }
        throw new IllegalStateException("Debug probes are not installed".toString());
    }

    /* renamed from: j */
    public final void mo24024j(PrintStream printStream) {
        String str;
        if (mo23996A()) {
            printStream.print("Coroutines dump " + f29220c.format(Long.valueOf(System.currentTimeMillis())));
            for (C11778a aVar : SequencesKt___SequencesKt.m44659K2(SequencesKt___SequencesKt.m44780p0(CollectionsKt___CollectionsKt.m40700v1(mo24031q()), DebugProbesImpl$dumpCoroutinesSynchronized$2.f29234f), new C11782e())) {
                DebugCoroutineInfoImpl debugCoroutineInfoImpl = aVar.f29231b;
                List<StackTraceElement> h = debugCoroutineInfoImpl.mo23990h();
                DebugProbesImpl debugProbesImpl = f29218a;
                List<StackTraceElement> n = debugProbesImpl.mo24028n(debugCoroutineInfoImpl.mo23989g(), debugCoroutineInfoImpl.lastObservedThread, h);
                if (!Intrinsics.areEqual((Object) debugCoroutineInfoImpl.mo23989g(), (Object) C11788d.f29252b) || n != h) {
                    str = debugCoroutineInfoImpl.mo23989g();
                } else {
                    str = debugCoroutineInfoImpl.mo23989g() + " (Last suspension stacktrace, not an actual stacktrace)";
                }
                printStream.print("\n\nCoroutine " + aVar.f29230a + ", state: " + str);
                if (h.isEmpty()) {
                    printStream.print("\n\tat " + f29219b);
                    debugProbesImpl.mo24000E(printStream, debugCoroutineInfoImpl.mo23987e());
                } else {
                    debugProbesImpl.mo24000E(printStream, n);
                }
            }
            return;
        }
        throw new IllegalStateException("Debug probes are not installed".toString());
    }

    @C12579k
    /* renamed from: k */
    public final List<DebuggerInfo> mo24025k() {
        if (mo23996A()) {
            return SequencesKt___SequencesKt.m44731c3(SequencesKt___SequencesKt.m44781p1(SequencesKt___SequencesKt.m44659K2(CollectionsKt___CollectionsKt.m40700v1(mo24031q()), new C11781d()), new C11784xee7de334()));
        }
        throw new IllegalStateException("Debug probes are not installed".toString());
    }

    @C12579k
    /* renamed from: l */
    public final List<StackTraceElement> mo24026l(@C12579k C11787c cVar, @C12579k List<StackTraceElement> list) {
        return mo24028n(cVar.mo24064g(), cVar.mo24062e(), list);
    }

    @C12579k
    /* renamed from: m */
    public final String mo24027m(@C12579k C11787c cVar) {
        String str;
        List<StackTraceElement> l = mo24026l(cVar, cVar.mo24065h());
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement next : l) {
            StringBuilder sb = new StringBuilder();
            sb.append("\n                {\n                    \"declaringClass\": \"");
            sb.append(next.getClassName());
            sb.append("\",\n                    \"methodName\": \"");
            sb.append(next.getMethodName());
            sb.append("\",\n                    \"fileName\": ");
            String fileName = next.getFileName();
            if (fileName != null) {
                str = mo24013R(fileName);
            } else {
                str = null;
            }
            sb.append(str);
            sb.append(",\n                    \"lineNumber\": ");
            sb.append(next.getLineNumber());
            sb.append("\n                }\n                ");
            arrayList.add(StringsKt__IndentKt.trimIndent(sb.toString()));
        }
        return C12361b.f30260k + CollectionsKt___CollectionsKt.m40639h3(arrayList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C11300l) null, 63, (Object) null) + C12361b.f30261l;
    }

    /* renamed from: n */
    public final List<StackTraceElement> mo24028n(String str, Thread thread, List<StackTraceElement> list) {
        Object obj;
        boolean z;
        if (!Intrinsics.areEqual((Object) str, (Object) C11788d.f29252b) || thread == null) {
            return list;
        }
        try {
            Result.C10852a aVar = Result.f28060a;
            obj = Result.m38702b(thread.getStackTrace());
        } catch (Throwable th) {
            Result.C10852a aVar2 = Result.f28060a;
            obj = Result.m38702b(C11661u0.m45734a(th));
        }
        if (Result.m38709i(obj)) {
            obj = null;
        }
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) obj;
        if (stackTraceElementArr == null) {
            return list;
        }
        int length = stackTraceElementArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i];
            if (!Intrinsics.areEqual((Object) stackTraceElement.getClassName(), (Object) C12007n0.f29612a) || !Intrinsics.areEqual((Object) stackTraceElement.getMethodName(), (Object) "resumeWith") || !Intrinsics.areEqual((Object) stackTraceElement.getFileName(), (Object) "ContinuationImpl.kt")) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                break;
            }
            i++;
        }
        Pair<Integer, Integer> o = mo24029o(i, stackTraceElementArr, list);
        int intValue = o.mo21846a().intValue();
        int intValue2 = o.mo21847b().intValue();
        if (intValue == -1) {
            return list;
        }
        ArrayList arrayList = new ArrayList((((list.size() + i) - intValue) - 1) - intValue2);
        int i2 = i - intValue2;
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(stackTraceElementArr[i3]);
        }
        int size = list.size();
        for (int i4 = intValue + 1; i4 < size; i4++) {
            arrayList.add(list.get(i4));
        }
        return arrayList;
    }

    /* renamed from: o */
    public final Pair<Integer, Integer> mo24029o(int i, StackTraceElement[] stackTraceElementArr, List<StackTraceElement> list) {
        for (int i2 = 0; i2 < 3; i2++) {
            int p = f29218a.mo24030p((i - 1) - i2, stackTraceElementArr, list);
            if (p != -1) {
                return C11078d1.m42659a(Integer.valueOf(p), Integer.valueOf(i2));
            }
        }
        return C11078d1.m42659a(-1, 0);
    }

    /* renamed from: p */
    public final int mo24030p(int i, StackTraceElement[] stackTraceElementArr, List<StackTraceElement> list) {
        boolean z;
        StackTraceElement stackTraceElement = (StackTraceElement) ArraysKt___ArraysKt.m40121qf(stackTraceElementArr, i);
        if (stackTraceElement == null) {
            return -1;
        }
        int i2 = 0;
        for (StackTraceElement next : list) {
            if (!Intrinsics.areEqual((Object) next.getFileName(), (Object) stackTraceElement.getFileName()) || !Intrinsics.areEqual((Object) next.getClassName(), (Object) stackTraceElement.getClassName()) || !Intrinsics.areEqual((Object) next.getMethodName(), (Object) stackTraceElement.getMethodName())) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* renamed from: q */
    public final Set<C11778a<?>> mo24031q() {
        return f29222e.keySet();
    }

    /* renamed from: r */
    public final String mo24032r(C11723c2 c2Var) {
        return c2Var instanceof JobSupport ? ((JobSupport) c2Var).mo23598H1() : c2Var.toString();
    }

    /* renamed from: t */
    public final C11300l<Boolean, C11079d2> mo24033t() {
        Object obj;
        try {
            Result.C10852a aVar = Result.f28060a;
            Object newInstance = Class.forName("kotlinx.coroutines.debug.internal.ByteBuddyDynamicAttach").getConstructors()[0].newInstance(new Object[0]);
            Intrinsics.checkNotNull(newInstance, "null cannot be cast to non-null type kotlin.Function1<kotlin.Boolean, kotlin.Unit>");
            obj = Result.m38702b((C11300l) C11370u0.m43701q(newInstance, 1));
        } catch (Throwable th) {
            Result.C10852a aVar2 = Result.f28060a;
            obj = Result.m38702b(C11661u0.m45734a(th));
        }
        if (Result.m38709i(obj)) {
            obj = null;
        }
        return (C11300l) obj;
    }

    /* renamed from: u */
    public final boolean mo24034u() {
        return f29224g;
    }

    /* renamed from: v */
    public final boolean mo24035v() {
        return f29225h;
    }

    /* renamed from: w */
    public final boolean mo24036w() {
        return f29223f;
    }

    @C12579k
    /* renamed from: x */
    public final String mo24037x(@C12579k C11723c2 c2Var) {
        boolean z;
        if (mo23996A()) {
            ArrayList<C11778a> arrayList = new ArrayList<>();
            for (Object next : mo24031q()) {
                if (((C11778a) next).f29230a.getContext().mo7444b(C11723c2.f29067w0) != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(C11479u.m44447u(C10975r0.m41400j(C10978t.m41495Y(arrayList, 10)), 16));
            for (C11778a aVar : arrayList) {
                linkedHashMap.put(C11804f2.m46951B(aVar.f29230a.getContext()), aVar.f29231b);
            }
            StringBuilder sb = new StringBuilder();
            f29218a.mo24018d(c2Var, linkedHashMap, sb, "");
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        throw new IllegalStateException("Debug probes are not installed".toString());
    }

    /* renamed from: y */
    public final void mo24038y() {
        C11300l<Boolean, C11079d2> lVar;
        if (C11779b.f29232a.incrementAndGet(f29228k) <= 1) {
            mo24010O();
            if (!C11785a.f29236a.mo24056a() && (lVar = f29226i) != null) {
                lVar.invoke(Boolean.TRUE);
            }
        }
    }

    /* renamed from: z */
    public final boolean mo24039z(C11778a<?> aVar) {
        C11723c2 c2Var;
        CoroutineContext c = aVar.f29231b.mo23985c();
        if (c == null || (c2Var = (C11723c2) c.mo7444b(C11723c2.f29067w0)) == null || !c2Var.mo23636j()) {
            return false;
        }
        f29222e.remove(aVar);
        return true;
    }
}

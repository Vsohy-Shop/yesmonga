package androidx.compose.runtime;

import androidx.compose.runtime.collection.C8418c;
import androidx.compose.runtime.collection.C8423g;
import androidx.compose.runtime.internal.C8567o;
import androidx.compose.runtime.snapshots.C8635a0;
import androidx.compose.runtime.snapshots.C8638b0;
import androidx.compose.runtime.snapshots.C8646f;
import androidx.compose.runtime.snapshots.SnapshotKt;
import kotlin.C11079d2;
import kotlin.Pair;
import kotlin.jvm.C11314h;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nDerivedState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/DerivedSnapshotState\n+ 2 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 IdentityArrayMap.kt\nandroidx/compose/runtime/collection/IdentityArrayMap\n+ 6 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 7 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 8 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,346:1\n311#2:347\n312#2:349\n313#2,2:361\n316#2,2:368\n311#2:370\n312#2:372\n313#2,5:384\n1162#3:348\n1162#3:371\n460#4,11:350\n460#4,11:373\n146#5,5:363\n1686#6:389\n2180#6:391\n2180#6:392\n2180#6:393\n2180#6:395\n2180#6:396\n2180#6:397\n70#7:390\n26#8:394\n*S KotlinDebug\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/DerivedSnapshotState\n*L\n143#1:347\n143#1:349\n143#1:361,2\n143#1:368,2\n158#1:370\n158#1:372\n158#1:384,5\n143#1:348\n158#1:371\n143#1:350,11\n158#1:373,11\n146#1:363,5\n180#1:389\n222#1:391\n229#1:392\n235#1:393\n241#1:395\n252#1:396\n260#1:397\n180#1:390\n238#1:394\n*E\n"})
public final class DerivedSnapshotState<T> implements C8635a0, C8404a0<T> {
    @C12579k

    /* renamed from: a */
    public final C11289a<T> f22663a;
    @C12580l

    /* renamed from: b */
    public final C8410b2<T> f22664b;
    @C12579k

    /* renamed from: c */
    public C8387a<T> f22665c = new C8387a<>();

    @C8567o(parameters = 0)
    @C11363r0({"SMAP\nDerivedState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/DerivedSnapshotState$ResultRecord\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 7 IdentityArrayMap.kt\nandroidx/compose/runtime/collection/IdentityArrayMap\n*L\n1#1,346:1\n1686#2:347\n70#3:348\n311#4:349\n312#4:351\n313#4,2:363\n316#4,2:370\n1162#5:350\n460#6,11:352\n146#7,5:365\n*S KotlinDebug\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/DerivedSnapshotState$ResultRecord\n*L\n95#1:347\n95#1:348\n97#1:349\n97#1:351\n97#1:363,2\n97#1:370,2\n97#1:350\n97#1:352,11\n98#1:365,5\n*E\n"})
    /* renamed from: androidx.compose.runtime.DerivedSnapshotState$a */
    public static final class C8387a<T> extends C8638b0 {
        @C12579k

        /* renamed from: g */
        public static final C8388a f22666g = new C8388a((DefaultConstructorMarker) null);

        /* renamed from: h */
        public static final int f22667h = 8;
        @C12579k

        /* renamed from: i */
        public static final Object f22668i = new Object();
        @C12580l

        /* renamed from: d */
        public C8418c<C8635a0, Integer> f22669d;
        @C12580l

        /* renamed from: e */
        public Object f22670e = f22668i;

        /* renamed from: f */
        public int f22671f;

        /* renamed from: androidx.compose.runtime.DerivedSnapshotState$a$a */
        public static final class C8388a {
            public /* synthetic */ C8388a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @C12579k
            /* renamed from: a */
            public final Object mo15134a() {
                return C8387a.f22668i;
            }

            public C8388a() {
            }
        }

        /* renamed from: a */
        public void mo15124a(@C12579k C8638b0 b0Var) {
            Intrinsics.checkNotNullParameter(b0Var, "value");
            C8387a aVar = (C8387a) b0Var;
            this.f22669d = aVar.f22669d;
            this.f22670e = aVar.f22670e;
            this.f22671f = aVar.f22671f;
        }

        @C12579k
        /* renamed from: b */
        public C8638b0 mo15125b() {
            return new C8387a();
        }

        @C12580l
        /* renamed from: h */
        public final C8418c<C8635a0, Integer> mo15126h() {
            return this.f22669d;
        }

        @C12580l
        /* renamed from: i */
        public final Object mo15127i() {
            return this.f22670e;
        }

        /* renamed from: j */
        public final int mo15128j() {
            return this.f22671f;
        }

        /* renamed from: k */
        public final boolean mo15129k(@C12579k C8404a0<?> a0Var, @C12579k C8646f fVar) {
            Intrinsics.checkNotNullParameter(a0Var, "derivedState");
            Intrinsics.checkNotNullParameter(fVar, "snapshot");
            if (this.f22670e == f22668i || this.f22671f != mo15130l(a0Var, fVar)) {
                return false;
            }
            return true;
        }

        /* renamed from: l */
        public final int mo15130l(@C12579k C8404a0<?> a0Var, @C12579k C8646f fVar) {
            C8418c<C8635a0, Integer> cVar;
            C8638b0 b0Var;
            Intrinsics.checkNotNullParameter(a0Var, "derivedState");
            Intrinsics.checkNotNullParameter(fVar, "snapshot");
            synchronized (SnapshotKt.m31447E()) {
                cVar = this.f22669d;
            }
            int i = 7;
            if (cVar != null) {
                C8423g gVar = (C8423g) C8432d2.f22796b.mo16131a();
                int i2 = 0;
                if (gVar == null) {
                    gVar = new C8423g(new Pair[0], 0);
                }
                int h0 = gVar.mo15469h0();
                if (h0 > 0) {
                    Object[] d0 = gVar.mo15462d0();
                    int i3 = 0;
                    do {
                        ((C11300l) ((Pair) d0[i3]).mo21846a()).invoke(a0Var);
                        i3++;
                    } while (i3 < h0);
                }
                try {
                    int h = cVar.mo15364h();
                    for (int i4 = 0; i4 < h; i4++) {
                        Object obj = cVar.mo15363g()[i4];
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                        C8635a0 a0Var2 = (C8635a0) obj;
                        if (((Number) cVar.mo15365i()[i4]).intValue() == 1) {
                            if (a0Var2 instanceof DerivedSnapshotState) {
                                b0Var = ((DerivedSnapshotState) a0Var2).mo15118g(fVar);
                            } else {
                                b0Var = SnapshotKt.m31445C(a0Var2.mo15119i(), fVar);
                            }
                            i = (((i * 31) + C8407b.m30216b(b0Var)) * 31) + b0Var.mo16549d();
                        }
                    }
                    C11079d2 d2Var = C11079d2.f28267a;
                    int h02 = gVar.mo15469h0();
                    if (h02 > 0) {
                        Object[] d02 = gVar.mo15462d0();
                        do {
                            ((C11300l) ((Pair) d02[i2]).mo21847b()).invoke(a0Var);
                            i2++;
                        } while (i2 < h02);
                    }
                } catch (Throwable th) {
                    int h03 = gVar.mo15469h0();
                    if (h03 > 0) {
                        Object[] d03 = gVar.mo15462d0();
                        do {
                            ((C11300l) ((Pair) d03[i2]).mo21847b()).invoke(a0Var);
                            i2++;
                        } while (i2 < h03);
                    }
                    throw th;
                }
            }
            return i;
        }

        /* renamed from: m */
        public final void mo15131m(@C12580l C8418c<C8635a0, Integer> cVar) {
            this.f22669d = cVar;
        }

        /* renamed from: n */
        public final void mo15132n(@C12580l Object obj) {
            this.f22670e = obj;
        }

        /* renamed from: o */
        public final void mo15133o(int i) {
            this.f22671f = i;
        }
    }

    public DerivedSnapshotState(@C12579k C11289a<? extends T> aVar, @C12580l C8410b2<T> b2Var) {
        Intrinsics.checkNotNullParameter(aVar, "calculation");
        this.f22663a = aVar;
        this.f22664b = b2Var;
    }

    /* renamed from: n */
    public static /* synthetic */ void m29866n() {
    }

    @C12580l
    /* renamed from: a */
    public C8410b2<T> mo15114a() {
        return this.f22664b;
    }

    /* renamed from: c */
    public T mo15115c() {
        return mo15120k((C8387a) SnapshotKt.m31444B(this.f22665c), C8646f.f23196e.mo16622b(), false, this.f22663a).mo15127i();
    }

    /* renamed from: e */
    public void mo15116e(@C12579k C8638b0 b0Var) {
        Intrinsics.checkNotNullParameter(b0Var, "value");
        this.f22665c = (C8387a) b0Var;
    }

    @C12579k
    /* renamed from: f */
    public Object[] mo15117f() {
        Object[] g;
        C8418c<C8635a0, Integer> h = mo15120k((C8387a) SnapshotKt.m31444B(this.f22665c), C8646f.f23196e.mo16622b(), false, this.f22663a).mo15126h();
        if (h == null || (g = h.mo15363g()) == null) {
            return new Object[0];
        }
        return g;
    }

    @C12579k
    /* renamed from: g */
    public final C8638b0 mo15118g(@C12579k C8646f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "snapshot");
        return mo15120k((C8387a) SnapshotKt.m31445C(this.f22665c, fVar), fVar, false, this.f22663a);
    }

    public T getValue() {
        C8646f.C8647a aVar = C8646f.f23196e;
        C11300l<Object, C11079d2> j = aVar.mo16622b().mo16429j();
        if (j != null) {
            j.invoke(this);
        }
        return mo15120k((C8387a) SnapshotKt.m31444B(this.f22665c), aVar.mo16622b(), true, this.f22663a).mo15127i();
    }

    @C12579k
    /* renamed from: i */
    public C8638b0 mo15119i() {
        return this.f22665c;
    }

    /* renamed from: k */
    public final C8387a<T> mo15120k(C8387a<T> aVar, C8646f fVar, boolean z, C11289a<? extends T> aVar2) {
        int i;
        C8646f.C8647a aVar3;
        int i2;
        boolean z2 = true;
        int i3 = 0;
        if (aVar.mo15129k(this, fVar)) {
            if (z) {
                C8423g gVar = (C8423g) C8432d2.f22796b.mo16131a();
                if (gVar == null) {
                    gVar = new C8423g(new Pair[0], 0);
                }
                int h0 = gVar.mo15469h0();
                if (h0 > 0) {
                    Object[] d0 = gVar.mo15462d0();
                    int i4 = 0;
                    do {
                        ((C11300l) ((Pair) d0[i4]).mo21846a()).invoke(this);
                        i4++;
                    } while (i4 < h0);
                }
                try {
                    C8418c<C8635a0, Integer> h = aVar.mo15126h();
                    Integer num = (Integer) C8432d2.f22795a.mo16131a();
                    if (num != null) {
                        i2 = num.intValue();
                    } else {
                        i2 = 0;
                    }
                    if (h != null) {
                        int h2 = h.mo15364h();
                        for (int i5 = 0; i5 < h2; i5++) {
                            Object obj = h.mo15363g()[i5];
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                            C8635a0 a0Var = (C8635a0) obj;
                            C8432d2.f22795a.mo16132b(Integer.valueOf(((Number) h.mo15365i()[i5]).intValue() + i2));
                            C11300l<Object, C11079d2> j = fVar.mo16429j();
                            if (j != null) {
                                j.invoke(a0Var);
                            }
                        }
                    }
                    C8432d2.f22795a.mo16132b(Integer.valueOf(i2));
                    C11079d2 d2Var = C11079d2.f28267a;
                    int h02 = gVar.mo15469h0();
                    if (h02 > 0) {
                        Object[] d02 = gVar.mo15462d0();
                        do {
                            ((C11300l) ((Pair) d02[i3]).mo21847b()).invoke(this);
                            i3++;
                        } while (i3 < h02);
                    }
                } catch (Throwable th) {
                    int h03 = gVar.mo15469h0();
                    if (h03 > 0) {
                        Object[] d03 = gVar.mo15462d0();
                        do {
                            ((C11300l) ((Pair) d03[i3]).mo21847b()).invoke(this);
                            i3++;
                        } while (i3 < h03);
                    }
                    throw th;
                }
            }
            return aVar;
        }
        Integer num2 = (Integer) C8432d2.f22795a.mo16131a();
        if (num2 != null) {
            i = num2.intValue();
        } else {
            i = 0;
        }
        C8418c cVar = new C8418c(0, 1, (DefaultConstructorMarker) null);
        C8423g gVar2 = (C8423g) C8432d2.f22796b.mo16131a();
        if (gVar2 == null) {
            gVar2 = new C8423g(new Pair[0], 0);
        }
        int h04 = gVar2.mo15469h0();
        if (h04 > 0) {
            Object[] d04 = gVar2.mo15462d0();
            int i6 = 0;
            do {
                ((C11300l) ((Pair) d04[i6]).mo21846a()).invoke(this);
                i6++;
            } while (i6 < h04);
        }
        try {
            C8432d2.f22795a.mo16132b(Integer.valueOf(i + 1));
            Object e = C8646f.f23196e.mo16625e(new DerivedSnapshotState$currentRecord$result$1$result$1(this, cVar, i), (C11300l<Object, C11079d2>) null, aVar2);
            C8432d2.f22795a.mo16132b(Integer.valueOf(i));
            int h05 = gVar2.mo15469h0();
            if (h05 > 0) {
                Object[] d05 = gVar2.mo15462d0();
                int i7 = 0;
                do {
                    ((C11300l) ((Pair) d05[i7]).mo21847b()).invoke(this);
                    i7++;
                } while (i7 < h05);
            }
            synchronized (SnapshotKt.m31447E()) {
                aVar3 = C8646f.f23196e;
                C8646f b = aVar3.mo16622b();
                if (aVar.mo15127i() != C8387a.f22666g.mo15134a()) {
                    C8410b2 a = mo15114a();
                    if (a == null || !a.mo15330c(e, aVar.mo15127i())) {
                        z2 = false;
                    }
                    if (z2) {
                        aVar.mo15131m(cVar);
                        aVar.mo15133o(aVar.mo15130l(this, b));
                    }
                }
                aVar = (C8387a) SnapshotKt.m31455M(this.f22665c, this, b);
                aVar.mo15131m(cVar);
                aVar.mo15133o(aVar.mo15130l(this, b));
                aVar.mo15132n(e);
            }
            if (i == 0) {
                aVar3.mo16624d();
            }
            return aVar;
        } catch (Throwable th2) {
            int h06 = gVar2.mo15469h0();
            if (h06 > 0) {
                Object[] d06 = gVar2.mo15462d0();
                do {
                    ((C11300l) ((Pair) d06[i3]).mo21847b()).invoke(this);
                    i3++;
                } while (i3 < h06);
            }
            throw th2;
        }
    }

    /* renamed from: l */
    public final String mo15121l() {
        C8387a aVar = (C8387a) SnapshotKt.m31444B(this.f22665c);
        if (aVar.mo15129k(this, C8646f.f23196e.mo16622b())) {
            return String.valueOf(aVar.mo15127i());
        }
        return "<Not calculated>";
    }

    @C12580l
    @C11314h(name = "getDebuggerDisplayValue")
    /* renamed from: m */
    public final T mo15122m() {
        C8387a aVar = (C8387a) SnapshotKt.m31444B(this.f22665c);
        if (aVar.mo15129k(this, C8646f.f23196e.mo16622b())) {
            return aVar.mo15127i();
        }
        return null;
    }

    @C12579k
    public String toString() {
        C8387a aVar = (C8387a) SnapshotKt.m31444B(this.f22665c);
        return "DerivedState(value=" + mo15121l() + ")@" + hashCode();
    }
}

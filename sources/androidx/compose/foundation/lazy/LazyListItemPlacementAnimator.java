package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.C1956d0;
import androidx.compose.p004ui.unit.C16494m;
import androidx.compose.p004ui.unit.C16496n;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.collections.C10977s0;
import kotlin.collections.C10992w;
import kotlin.collections.C10994x;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.C11006g;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nLazyListItemPlacementAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/LazyListItemPlacementAnimator\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,350:1\n101#2,2:351\n33#2,6:353\n103#2:359\n33#2,4:360\n38#2:365\n33#2,6:368\n33#2,6:376\n101#2,2:383\n33#2,6:385\n103#2:391\n33#2,6:395\n33#2,6:403\n69#2,4:414\n74#2:420\n101#2,2:421\n33#2,4:423\n38#2:428\n103#2:429\n86#3:364\n86#3:409\n86#3:410\n79#3:411\n86#3:412\n79#3:413\n86#3:418\n79#3:419\n86#3:427\n1011#4,2:366\n1002#4,2:374\n1855#4:382\n1856#4:392\n1011#4,2:393\n1002#4,2:401\n*S KotlinDebug\n*F\n+ 1 LazyListItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/LazyListItemPlacementAnimator\n*L\n74#1:351,2\n74#1:353,6\n74#1:359\n93#1:360,4\n93#1:365\n124#1:368,6\n133#1:376,6\n148#1:383,2\n148#1:385,6\n148#1:391\n167#1:395,6\n178#1:403,6\n278#1:414,4\n278#1:420\n316#1:421,2\n316#1:423,4\n316#1:428\n316#1:429\n113#1:364\n208#1:409\n209#1:410\n251#1:411\n254#1:412\n272#1:413\n279#1:418\n284#1:419\n317#1:427\n123#1:366,2\n132#1:374,2\n141#1:382\n141#1:392\n166#1:393,2\n177#1:401,2\n*E\n"})
public final class LazyListItemPlacementAnimator {
    @C12579k

    /* renamed from: a */
    public final C12074o0 f6385a;

    /* renamed from: b */
    public final boolean f6386b;
    @C12579k

    /* renamed from: c */
    public final Map<Object, C2454d> f6387c = new LinkedHashMap();
    @C12579k

    /* renamed from: d */
    public Map<Object, Integer> f6388d = C10977s0.m41492z();

    /* renamed from: e */
    public int f6389e;
    @C12579k

    /* renamed from: f */
    public final LinkedHashSet<Object> f6390f = new LinkedHashSet<>();
    @C12579k

    /* renamed from: g */
    public final List<C2574r> f6391g = new ArrayList();
    @C12579k

    /* renamed from: h */
    public final List<C2574r> f6392h = new ArrayList();
    @C12579k

    /* renamed from: i */
    public final List<C2620u> f6393i = new ArrayList();
    @C12579k

    /* renamed from: j */
    public final List<C2620u> f6394j = new ArrayList();

    @C11363r0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 LazyListItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/LazyListItemPlacementAnimator\n*L\n1#1,328:1\n132#2:329\n*E\n"})
    /* renamed from: androidx.compose.foundation.lazy.LazyListItemPlacementAnimator$a */
    public static final class C2435a<T> implements Comparator {

        /* renamed from: a */
        public final /* synthetic */ Map f6395a;

        public C2435a(Map map) {
            this.f6395a = map;
        }

        public final int compare(T t, T t2) {
            return C11006g.m42424l((Integer) this.f6395a.get(((C2574r) t).getKey()), (Integer) this.f6395a.get(((C2574r) t2).getKey()));
        }
    }

    @C11363r0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 LazyListItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/LazyListItemPlacementAnimator\n*L\n1#1,328:1\n177#2:329\n*E\n"})
    /* renamed from: androidx.compose.foundation.lazy.LazyListItemPlacementAnimator$b */
    public static final class C2436b<T> implements Comparator {

        /* renamed from: a */
        public final /* synthetic */ LazyListItemPlacementAnimator f6396a;

        public C2436b(LazyListItemPlacementAnimator lazyListItemPlacementAnimator) {
            this.f6396a = lazyListItemPlacementAnimator;
        }

        public final int compare(T t, T t2) {
            return C11006g.m42424l((Integer) this.f6396a.f6388d.get(((C2620u) t).mo9029c()), (Integer) this.f6396a.f6388d.get(((C2620u) t2).mo9029c()));
        }
    }

    @C11363r0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 LazyListItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/LazyListItemPlacementAnimator\n*L\n1#1,328:1\n123#2:329\n*E\n"})
    /* renamed from: androidx.compose.foundation.lazy.LazyListItemPlacementAnimator$c */
    public static final class C2437c<T> implements Comparator {

        /* renamed from: a */
        public final /* synthetic */ Map f6397a;

        public C2437c(Map map) {
            this.f6397a = map;
        }

        public final int compare(T t, T t2) {
            return C11006g.m42424l((Integer) this.f6397a.get(((C2574r) t2).getKey()), (Integer) this.f6397a.get(((C2574r) t).getKey()));
        }
    }

    @C11363r0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 LazyListItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/LazyListItemPlacementAnimator\n*L\n1#1,328:1\n166#2:329\n*E\n"})
    /* renamed from: androidx.compose.foundation.lazy.LazyListItemPlacementAnimator$d */
    public static final class C2438d<T> implements Comparator {

        /* renamed from: a */
        public final /* synthetic */ LazyListItemPlacementAnimator f6398a;

        public C2438d(LazyListItemPlacementAnimator lazyListItemPlacementAnimator) {
            this.f6398a = lazyListItemPlacementAnimator;
        }

        public final int compare(T t, T t2) {
            return C11006g.m42424l((Integer) this.f6398a.f6388d.get(((C2620u) t2).mo9029c()), (Integer) this.f6398a.f6388d.get(((C2620u) t).mo9029c()));
        }
    }

    public LazyListItemPlacementAnimator(@C12579k C12074o0 o0Var, boolean z) {
        Intrinsics.checkNotNullParameter(o0Var, "scope");
        this.f6385a = o0Var;
        this.f6386b = z;
    }

    /* renamed from: c */
    public static /* synthetic */ C2454d m10774c(LazyListItemPlacementAnimator lazyListItemPlacementAnimator, C2574r rVar, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = lazyListItemPlacementAnimator.mo8276e(rVar.mo8828f(0));
        }
        return lazyListItemPlacementAnimator.mo8274b(rVar, i);
    }

    /* renamed from: b */
    public final C2454d mo8274b(C2574r rVar, int i) {
        long j;
        C2454d dVar = new C2454d();
        long f = rVar.mo8828f(0);
        if (this.f6386b) {
            j = C16494m.m74575g(f, 0, i, 1, (Object) null);
        } else {
            j = C16494m.m74575g(f, i, 0, 2, (Object) null);
        }
        int g = rVar.mo8829g();
        for (int i2 = 0; i2 < g; i2++) {
            long f2 = rVar.mo8828f(i2);
            long a = C16496n.m74593a(C16494m.m74581m(f2) - C16494m.m74581m(f), C16494m.m74583o(f2) - C16494m.m74583o(f));
            dVar.mo8381b().add(new C2624y(C16496n.m74593a(C16494m.m74581m(j) + C16494m.m74581m(a), C16494m.m74583o(j) + C16494m.m74583o(a)), rVar.mo8826d(i2), (DefaultConstructorMarker) null));
        }
        return dVar;
    }

    /* renamed from: d */
    public final long mo8275d(@C12579k Object obj, int i, int i2, int i3, long j) {
        Intrinsics.checkNotNullParameter(obj, "key");
        C2454d dVar = this.f6387c.get(obj);
        if (dVar == null) {
            return j;
        }
        C2624y yVar = dVar.mo8381b().get(i);
        long w = yVar.mo9036a().mo6613u().mo47856w();
        long a = dVar.mo8380a();
        long a2 = C16496n.m74593a(C16494m.m74581m(w) + C16494m.m74581m(a), C16494m.m74583o(w) + C16494m.m74583o(a));
        long d = yVar.mo9039d();
        long a3 = dVar.mo8380a();
        long a4 = C16496n.m74593a(C16494m.m74581m(d) + C16494m.m74581m(a3), C16494m.m74583o(d) + C16494m.m74583o(a3));
        if (yVar.mo9037b() && ((mo8276e(a4) <= i2 && mo8276e(a2) <= i2) || (mo8276e(a4) >= i3 && mo8276e(a2) >= i3))) {
            C11723c2 unused = C12038j.m48061f(this.f6385a, (CoroutineContext) null, (CoroutineStart) null, new LazyListItemPlacementAnimator$getAnimatedOffset$1(yVar, (C11045c<? super LazyListItemPlacementAnimator$getAnimatedOffset$1>) null), 3, (Object) null);
        }
        return a2;
    }

    /* renamed from: e */
    public final int mo8276e(long j) {
        return this.f6386b ? C16494m.m74583o(j) : C16494m.m74581m(j);
    }

    /* renamed from: f */
    public final boolean mo8277f(C2454d dVar, int i) {
        boolean z;
        List<C2624y> b = dVar.mo8381b();
        int size = b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C2624y yVar = b.get(i2);
            long d = yVar.mo9039d();
            long a = dVar.mo8380a();
            long a2 = C16496n.m74593a(C16494m.m74581m(d) + C16494m.m74581m(a), C16494m.m74583o(d) + C16494m.m74583o(a));
            if (mo8276e(a2) + yVar.mo9038c() <= 0 || mo8276e(a2) >= i) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public final void mo8278g(int i, int i2, int i3, @C12579k List<C2574r> list, @C12579k C2621v vVar) {
        boolean z;
        int i4;
        int i5;
        boolean z2;
        int i6;
        int i7;
        int i8 = i2;
        int i9 = i3;
        List<C2574r> list2 = list;
        C2621v vVar2 = vVar;
        Intrinsics.checkNotNullParameter(list2, "positionedItems");
        Intrinsics.checkNotNullParameter(vVar2, "itemProvider");
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z = false;
                break;
            } else if (list2.get(i10).mo8825c()) {
                z = true;
                break;
            } else {
                i10++;
            }
        }
        if (z || !this.f6387c.isEmpty()) {
            int i11 = this.f6389e;
            C2574r rVar = (C2574r) CollectionsKt___CollectionsKt.m40479B2(list);
            if (rVar != null) {
                i4 = rVar.getIndex();
            } else {
                i4 = 0;
            }
            this.f6389e = i4;
            Map<Object, Integer> map = this.f6388d;
            this.f6388d = vVar.mo9035c();
            if (this.f6386b) {
                i5 = i9;
            } else {
                i5 = i8;
            }
            long j = mo8281j(i);
            this.f6390f.addAll(this.f6387c.keySet());
            int size2 = list.size();
            int i12 = 0;
            while (i12 < size2) {
                C2574r rVar2 = list2.get(i12);
                this.f6390f.remove(rVar2.getKey());
                if (rVar2.mo8825c()) {
                    C2454d dVar = this.f6387c.get(rVar2.getKey());
                    if (dVar == null) {
                        Integer num = map.get(rVar2.getKey());
                        if (num == null || rVar2.getIndex() == num.intValue()) {
                            i7 = i11;
                            i6 = size2;
                            this.f6387c.put(rVar2.getKey(), m10774c(this, rVar2, 0, 2, (Object) null));
                        } else {
                            if (num.intValue() < i11) {
                                this.f6391g.add(rVar2);
                            } else {
                                this.f6392h.add(rVar2);
                            }
                            i7 = i11;
                            i6 = size2;
                        }
                    } else {
                        i7 = i11;
                        i6 = size2;
                        long a = dVar.mo8380a();
                        dVar.mo8382c(C16496n.m74593a(C16494m.m74581m(a) + C16494m.m74581m(j), C16494m.m74583o(a) + C16494m.m74583o(j)));
                        mo8280i(rVar2, dVar);
                    }
                } else {
                    i7 = i11;
                    i6 = size2;
                    this.f6387c.remove(rVar2.getKey());
                }
                i12++;
                size2 = i6;
                i11 = i7;
            }
            int i13 = 0;
            List<C2574r> list3 = this.f6391g;
            if (list3.size() > 1) {
                C10992w.m42338m0(list3, new C2437c(map));
            }
            List<C2574r> list4 = this.f6391g;
            int size3 = list4.size();
            int i14 = 0;
            for (int i15 = 0; i15 < size3; i15++) {
                C2574r rVar3 = list4.get(i15);
                int size4 = (0 - i14) - rVar3.getSize();
                i14 += rVar3.getSize();
                C2454d b = mo8274b(rVar3, size4);
                this.f6387c.put(rVar3.getKey(), b);
                mo8280i(rVar3, b);
            }
            List<C2574r> list5 = this.f6392h;
            if (list5.size() > 1) {
                C10992w.m42338m0(list5, new C2435a(map));
            }
            List<C2574r> list6 = this.f6392h;
            int size5 = list6.size();
            int i16 = 0;
            for (int i17 = 0; i17 < size5; i17++) {
                C2574r rVar4 = list6.get(i17);
                int i18 = i5 + i16;
                i16 += rVar4.getSize();
                C2454d b2 = mo8274b(rVar4, i18);
                this.f6387c.put(rVar4.getKey(), b2);
                mo8280i(rVar4, b2);
            }
            for (T next : this.f6390f) {
                C2454d dVar2 = (C2454d) C10977s0.m41443K(this.f6387c, next);
                Integer num2 = this.f6388d.get(next);
                List<C2624y> b3 = dVar2.mo8381b();
                int size6 = b3.size();
                int i19 = 0;
                while (true) {
                    if (i19 >= size6) {
                        z2 = false;
                        break;
                    } else if (b3.get(i19).mo9037b()) {
                        z2 = true;
                        break;
                    } else {
                        i19++;
                    }
                }
                if (dVar2.mo8381b().isEmpty() || num2 == null || ((!z2 && Intrinsics.areEqual((Object) num2, (Object) map.get(next))) || (!z2 && !mo8277f(dVar2, i5)))) {
                    this.f6387c.remove(next);
                } else {
                    C2620u a2 = vVar2.mo9033a(C2452b.m10906c(num2.intValue()));
                    if (num2.intValue() < this.f6389e) {
                        this.f6393i.add(a2);
                    } else {
                        this.f6394j.add(a2);
                    }
                }
            }
            List<C2620u> list7 = this.f6393i;
            if (list7.size() > 1) {
                C10992w.m42338m0(list7, new C2438d(this));
            }
            List<C2620u> list8 = this.f6393i;
            int size7 = list8.size();
            int i20 = 0;
            for (int i21 = 0; i21 < size7; i21++) {
                C2620u uVar = list8.get(i21);
                int d = (0 - i20) - uVar.mo9030d();
                i20 += uVar.mo9030d();
                C2574r f = uVar.mo9032f(d, i8, i9);
                list2.add(f);
                mo8280i(f, (C2454d) C10977s0.m41443K(this.f6387c, uVar.mo9029c()));
            }
            List<C2620u> list9 = this.f6394j;
            if (list9.size() > 1) {
                C10992w.m42338m0(list9, new C2436b(this));
            }
            List<C2620u> list10 = this.f6394j;
            int size8 = list10.size();
            for (int i22 = 0; i22 < size8; i22++) {
                C2620u uVar2 = list10.get(i22);
                int i23 = i5 + i13;
                i13 += uVar2.mo9030d();
                C2574r f2 = uVar2.mo9032f(i23, i8, i9);
                list2.add(f2);
                mo8280i(f2, (C2454d) C10977s0.m41443K(this.f6387c, uVar2.mo9029c()));
            }
            this.f6391g.clear();
            this.f6392h.clear();
            this.f6393i.clear();
            this.f6394j.clear();
            this.f6390f.clear();
            return;
        }
        mo8279h();
    }

    /* renamed from: h */
    public final void mo8279h() {
        this.f6387c.clear();
        this.f6388d = C10977s0.m41492z();
        this.f6389e = -1;
    }

    /* renamed from: i */
    public final void mo8280i(C2574r rVar, C2454d dVar) {
        C2574r rVar2 = rVar;
        while (dVar.mo8381b().size() > rVar.mo8829g()) {
            C10994x.m42351L0(dVar.mo8381b());
        }
        while (dVar.mo8381b().size() < rVar.mo8829g()) {
            int size = dVar.mo8381b().size();
            long f = rVar2.mo8828f(size);
            List<C2624y> b = dVar.mo8381b();
            long a = dVar.mo8380a();
            b.add(new C2624y(C16496n.m74593a(C16494m.m74581m(f) - C16494m.m74581m(a), C16494m.m74583o(f) - C16494m.m74583o(a)), rVar2.mo8826d(size), (DefaultConstructorMarker) null));
        }
        List<C2624y> b2 = dVar.mo8381b();
        int size2 = b2.size();
        for (int i = 0; i < size2; i++) {
            C2624y yVar = b2.get(i);
            long d = yVar.mo9039d();
            long a2 = dVar.mo8380a();
            long a3 = C16496n.m74593a(C16494m.m74581m(d) + C16494m.m74581m(a2), C16494m.m74583o(d) + C16494m.m74583o(a2));
            long f2 = rVar2.mo8828f(i);
            yVar.mo9041f(rVar2.mo8826d(i));
            C1956d0<C16494m> b3 = rVar2.mo8824b(i);
            if (!C16494m.m74578j(a3, f2)) {
                long a4 = dVar.mo8380a();
                yVar.mo9042g(C16496n.m74593a(C16494m.m74581m(f2) - C16494m.m74581m(a4), C16494m.m74583o(f2) - C16494m.m74583o(a4)));
                if (b3 != null) {
                    yVar.mo9040e(true);
                    C11723c2 unused = C12038j.m48061f(this.f6385a, (CoroutineContext) null, (CoroutineStart) null, new LazyListItemPlacementAnimator$startAnimationsIfNeeded$1$1(yVar, b3, (C11045c<? super LazyListItemPlacementAnimator$startAnimationsIfNeeded$1$1>) null), 3, (Object) null);
                }
            }
        }
    }

    /* renamed from: j */
    public final long mo8281j(int i) {
        boolean z = this.f6386b;
        int i2 = z ? 0 : i;
        if (!z) {
            i = 0;
        }
        return C16496n.m74593a(i2, i);
    }
}

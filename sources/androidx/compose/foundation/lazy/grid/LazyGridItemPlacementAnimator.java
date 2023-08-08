package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.C1956d0;
import androidx.compose.p004ui.unit.C16476b;
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

@C11363r0({"SMAP\nLazyGridItemPlacementAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,412:1\n101#2,2:413\n33#2,6:415\n103#2:421\n33#2,4:422\n38#2:427\n33#2,6:430\n33#2,6:438\n101#2,2:445\n33#2,6:447\n103#2:453\n33#2,6:457\n33#2,6:465\n69#2,4:474\n74#2:480\n101#2,2:481\n33#2,4:483\n38#2:488\n103#2:489\n86#3:426\n86#3:471\n86#3:472\n79#3:473\n86#3:478\n79#3:479\n86#3:487\n1011#4,2:428\n1002#4,2:436\n1855#4:444\n1856#4:454\n1011#4,2:455\n1002#4,2:463\n*S KotlinDebug\n*F\n+ 1 LazyGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator\n*L\n77#1:413,2\n77#1:415,6\n77#1:421\n96#1:422,4\n96#1:427\n131#1:430,6\n149#1:438,6\n171#1:445,2\n171#1:447,6\n171#1:453\n199#1:457,6\n227#1:465,6\n338#1:474,4\n338#1:480\n376#1:481,2\n376#1:483,4\n376#1:488\n376#1:489\n116#1:426\n272#1:471\n273#1:472\n332#1:473\n339#1:478\n344#1:479\n377#1:487\n128#1:428,2\n148#1:436,2\n164#1:444\n164#1:454\n198#1:455,2\n226#1:463,2\n*E\n"})
public final class LazyGridItemPlacementAnimator {
    @C12579k

    /* renamed from: a */
    public final C12074o0 f6481a;

    /* renamed from: b */
    public final boolean f6482b;
    @C12579k

    /* renamed from: c */
    public final Map<Object, C2490f> f6483c = new LinkedHashMap();
    @C12579k

    /* renamed from: d */
    public Map<Object, Integer> f6484d = C10977s0.m41492z();

    /* renamed from: e */
    public int f6485e;
    @C12579k

    /* renamed from: f */
    public final LinkedHashSet<Object> f6486f = new LinkedHashSet<>();
    @C12579k

    /* renamed from: g */
    public final List<C2502q> f6487g = new ArrayList();
    @C12579k

    /* renamed from: h */
    public final List<C2502q> f6488h = new ArrayList();
    @C12579k

    /* renamed from: i */
    public final List<C2500o> f6489i = new ArrayList();
    @C12579k

    /* renamed from: j */
    public final List<C2500o> f6490j = new ArrayList();

    @C11363r0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 LazyGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator\n*L\n1#1,328:1\n148#2:329\n*E\n"})
    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$a */
    public static final class C2461a<T> implements Comparator {

        /* renamed from: a */
        public final /* synthetic */ Map f6491a;

        public C2461a(Map map) {
            this.f6491a = map;
        }

        public final int compare(T t, T t2) {
            return C11006g.m42424l((Integer) this.f6491a.get(((C2502q) t).getKey()), (Integer) this.f6491a.get(((C2502q) t2).getKey()));
        }
    }

    @C11363r0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 LazyGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator\n*L\n1#1,328:1\n226#2:329\n*E\n"})
    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$b */
    public static final class C2462b<T> implements Comparator {

        /* renamed from: a */
        public final /* synthetic */ LazyGridItemPlacementAnimator f6492a;

        public C2462b(LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator) {
            this.f6492a = lazyGridItemPlacementAnimator;
        }

        public final int compare(T t, T t2) {
            return C11006g.m42424l((Integer) this.f6492a.f6484d.get(((C2500o) t).mo8597c()), (Integer) this.f6492a.f6484d.get(((C2500o) t2).mo8597c()));
        }
    }

    @C11363r0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 LazyGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator\n*L\n1#1,328:1\n128#2:329\n*E\n"})
    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$c */
    public static final class C2463c<T> implements Comparator {

        /* renamed from: a */
        public final /* synthetic */ Map f6493a;

        public C2463c(Map map) {
            this.f6493a = map;
        }

        public final int compare(T t, T t2) {
            return C11006g.m42424l((Integer) this.f6493a.get(((C2502q) t2).getKey()), (Integer) this.f6493a.get(((C2502q) t).getKey()));
        }
    }

    @C11363r0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 LazyGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator\n*L\n1#1,328:1\n198#2:329\n*E\n"})
    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$d */
    public static final class C2464d<T> implements Comparator {

        /* renamed from: a */
        public final /* synthetic */ LazyGridItemPlacementAnimator f6494a;

        public C2464d(LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator) {
            this.f6494a = lazyGridItemPlacementAnimator;
        }

        public final int compare(T t, T t2) {
            return C11006g.m42424l((Integer) this.f6494a.f6484d.get(((C2500o) t2).mo8597c()), (Integer) this.f6494a.f6484d.get(((C2500o) t).mo8597c()));
        }
    }

    public LazyGridItemPlacementAnimator(@C12579k C12074o0 o0Var, boolean z) {
        Intrinsics.checkNotNullParameter(o0Var, "scope");
        this.f6481a = o0Var;
        this.f6482b = z;
    }

    /* renamed from: c */
    public static /* synthetic */ C2490f m11003c(LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, C2502q qVar, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = lazyGridItemPlacementAnimator.mo8435f(qVar.mo8582b());
        }
        return lazyGridItemPlacementAnimator.mo8432b(qVar, i);
    }

    /* renamed from: b */
    public final C2490f mo8432b(C2502q qVar, int i) {
        long j;
        C2490f fVar = new C2490f(qVar.mo8612h(), qVar.mo8611g());
        if (this.f6482b) {
            j = C16494m.m74575g(qVar.mo8582b(), 0, i, 1, (Object) null);
        } else {
            j = C16494m.m74575g(qVar.mo8582b(), i, 0, 2, (Object) null);
        }
        int m = qVar.mo8617m();
        for (int i2 = 0; i2 < m; i2++) {
            fVar.mo8573d().add(new C2483a0(j, qVar.mo8615k(i2), (DefaultConstructorMarker) null));
        }
        return fVar;
    }

    /* renamed from: d */
    public final long mo8433d(@C12579k Object obj, int i, int i2, int i3, long j) {
        Intrinsics.checkNotNullParameter(obj, "key");
        C2490f fVar = this.f6483c.get(obj);
        if (fVar == null) {
            return j;
        }
        C2483a0 a0Var = fVar.mo8573d().get(i);
        long w = a0Var.mo8539a().mo6613u().mo47856w();
        long c = fVar.mo8572c();
        long a = C16496n.m74593a(C16494m.m74581m(w) + C16494m.m74581m(c), C16494m.m74583o(w) + C16494m.m74583o(c));
        long d = a0Var.mo8542d();
        long c2 = fVar.mo8572c();
        long a2 = C16496n.m74593a(C16494m.m74581m(d) + C16494m.m74581m(c2), C16494m.m74583o(d) + C16494m.m74583o(c2));
        if (a0Var.mo8540b() && ((mo8435f(a2) <= i2 && mo8435f(a) < i2) || (mo8435f(a2) >= i3 && mo8435f(a) > i3))) {
            C11723c2 unused = C12038j.m48061f(this.f6481a, (CoroutineContext) null, (CoroutineStart) null, new LazyGridItemPlacementAnimator$getAnimatedOffset$1(a0Var, (C11045c<? super LazyGridItemPlacementAnimator$getAnimatedOffset$1>) null), 3, (Object) null);
        }
        return a;
    }

    /* renamed from: e */
    public final int mo8434e(C2502q qVar) {
        return this.f6482b ? qVar.mo8583c() : qVar.mo8584d();
    }

    /* renamed from: f */
    public final int mo8435f(long j) {
        return this.f6482b ? C16494m.m74583o(j) : C16494m.m74581m(j);
    }

    /* renamed from: g */
    public final boolean mo8436g(C2490f fVar, int i) {
        boolean z;
        List<C2483a0> d = fVar.mo8573d();
        int size = d.size();
        for (int i2 = 0; i2 < size; i2++) {
            C2483a0 a0Var = d.get(i2);
            long d2 = a0Var.mo8542d();
            long c = fVar.mo8572c();
            long a = C16496n.m74593a(C16494m.m74581m(d2) + C16494m.m74581m(c), C16494m.m74583o(d2) + C16494m.m74583o(c));
            if (mo8435f(a) + a0Var.mo8541c() <= 0 || mo8435f(a) >= i) {
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

    /* renamed from: h */
    public final void mo8437h(int i, int i2, int i3, @C12579k List<C2502q> list, @C12579k C2506u uVar, @C12579k LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider) {
        boolean z;
        int i4;
        int i5;
        boolean z2;
        long j;
        int i6;
        List<C2502q> list2 = list;
        LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider2 = lazyGridSpanLayoutProvider;
        Intrinsics.checkNotNullParameter(list2, "positionedItems");
        Intrinsics.checkNotNullParameter(uVar, "itemProvider");
        Intrinsics.checkNotNullParameter(lazyGridSpanLayoutProvider2, "spanLayoutProvider");
        int size = list.size();
        int i7 = 0;
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                z = false;
                break;
            } else if (list2.get(i8).mo8613i()) {
                z = true;
                break;
            } else {
                i8++;
            }
        }
        if (z || !this.f6483c.isEmpty()) {
            int i9 = this.f6485e;
            C2502q qVar = (C2502q) CollectionsKt___CollectionsKt.m40479B2(list);
            if (qVar != null) {
                i4 = qVar.getIndex();
            } else {
                i4 = 0;
            }
            this.f6485e = i4;
            Map<Object, Integer> map = this.f6484d;
            this.f6484d = uVar.mo8628c();
            if (this.f6482b) {
                i5 = i3;
            } else {
                i5 = i2;
            }
            long k = mo8440k(i);
            this.f6486f.addAll(this.f6483c.keySet());
            int size2 = list.size();
            int i10 = 0;
            while (i10 < size2) {
                C2502q qVar2 = list2.get(i10);
                this.f6486f.remove(qVar2.getKey());
                if (qVar2.mo8613i()) {
                    C2490f fVar = this.f6483c.get(qVar2.getKey());
                    if (fVar == null) {
                        Integer num = map.get(qVar2.getKey());
                        if (num == null || qVar2.getIndex() == num.intValue()) {
                            i6 = i9;
                            this.f6483c.put(qVar2.getKey(), m11003c(this, qVar2, i7, 2, (Object) null));
                        } else {
                            if (num.intValue() < i9) {
                                this.f6487g.add(qVar2);
                            } else {
                                this.f6488h.add(qVar2);
                            }
                            i6 = i9;
                        }
                    } else {
                        i6 = i9;
                        long c = fVar.mo8572c();
                        fVar.mo8576g(C16496n.m74593a(C16494m.m74581m(c) + C16494m.m74581m(k), C16494m.m74583o(c) + C16494m.m74583o(k)));
                        fVar.mo8575f(qVar2.mo8612h());
                        fVar.mo8574e(qVar2.mo8611g());
                        mo8439j(qVar2, fVar);
                    }
                } else {
                    i6 = i9;
                    this.f6483c.remove(qVar2.getKey());
                }
                i10++;
                i9 = i6;
                i7 = 0;
            }
            List<C2502q> list3 = this.f6487g;
            if (list3.size() > 1) {
                C10992w.m42338m0(list3, new C2463c(map));
            }
            List<C2502q> list4 = this.f6487g;
            int size3 = list4.size();
            int i11 = -1;
            int i12 = -1;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (i13 < size3) {
                C2502q qVar3 = list4.get(i13);
                int e = mo8434e(qVar3);
                if (e == i11 || e != i12) {
                    i14 += i15;
                    i15 = qVar3.mo8614j();
                    i12 = e;
                } else {
                    i15 = Math.max(i15, qVar3.mo8614j());
                }
                C2490f b = mo8432b(qVar3, (0 - i14) - qVar3.mo8614j());
                this.f6483c.put(qVar3.getKey(), b);
                mo8439j(qVar3, b);
                i13++;
                i11 = -1;
            }
            List<C2502q> list5 = this.f6488h;
            if (list5.size() > 1) {
                C10992w.m42338m0(list5, new C2461a(map));
            }
            List<C2502q> list6 = this.f6488h;
            int size4 = list6.size();
            int i16 = -1;
            int i17 = 0;
            int i18 = 0;
            for (int i19 = 0; i19 < size4; i19++) {
                C2502q qVar4 = list6.get(i19);
                int e2 = mo8434e(qVar4);
                if (e2 == -1 || e2 != i16) {
                    i17 += i18;
                    i18 = qVar4.mo8614j();
                    i16 = e2;
                } else {
                    i18 = Math.max(i18, qVar4.mo8614j());
                }
                C2490f b2 = mo8432b(qVar4, i5 + i17);
                this.f6483c.put(qVar4.getKey(), b2);
                mo8439j(qVar4, b2);
            }
            for (T next : this.f6486f) {
                C2490f fVar2 = (C2490f) C10977s0.m41443K(this.f6483c, next);
                Integer num2 = this.f6484d.get(next);
                List<C2483a0> d = fVar2.mo8573d();
                int size5 = d.size();
                int i20 = 0;
                while (true) {
                    if (i20 >= size5) {
                        z2 = false;
                        break;
                    } else if (d.get(i20).mo8540b()) {
                        z2 = true;
                        break;
                    } else {
                        i20++;
                    }
                }
                if (fVar2.mo8573d().isEmpty() || num2 == null || ((!z2 && Intrinsics.areEqual((Object) num2, (Object) map.get(next))) || (!z2 && !mo8436g(fVar2, i5)))) {
                    this.f6483c.remove(next);
                } else {
                    int c2 = C2489e.m11167c(num2.intValue());
                    if (this.f6482b) {
                        j = C16476b.f40850b.mo47812e(fVar2.mo8571b());
                    } else {
                        j = C16476b.f40850b.mo47811d(fVar2.mo8571b());
                    }
                    C2500o b3 = C2506u.m11263b(uVar, c2, 0, j, 2, (Object) null);
                    if (num2.intValue() < this.f6485e) {
                        this.f6489i.add(b3);
                    } else {
                        this.f6490j.add(b3);
                    }
                }
            }
            List<C2500o> list7 = this.f6489i;
            if (list7.size() > 1) {
                C10992w.m42338m0(list7, new C2464d(this));
            }
            List<C2500o> list8 = this.f6489i;
            int size6 = list8.size();
            int i21 = 0;
            int i22 = 0;
            int i23 = -1;
            for (int i24 = 0; i24 < size6; i24++) {
                C2500o oVar = list8.get(i24);
                int d2 = lazyGridSpanLayoutProvider2.mo8479d(oVar.mo8596b());
                if (d2 == -1 || d2 != i23) {
                    i21 += i22;
                    i22 = oVar.mo8598d();
                    i23 = d2;
                } else {
                    i22 = Math.max(i22, oVar.mo8598d());
                }
                int d3 = (0 - i21) - oVar.mo8598d();
                C2490f fVar3 = (C2490f) C10977s0.m41443K(this.f6483c, oVar.mo8597c());
                C2502q h = oVar.mo8602h(d3, fVar3.mo8570a(), i2, i3, -1, -1);
                list2.add(h);
                mo8439j(h, fVar3);
            }
            List<C2500o> list9 = this.f6490j;
            if (list9.size() > 1) {
                C10992w.m42338m0(list9, new C2462b(this));
            }
            List<C2500o> list10 = this.f6490j;
            int size7 = list10.size();
            int i25 = -1;
            int i26 = 0;
            int i27 = 0;
            for (int i28 = 0; i28 < size7; i28++) {
                C2500o oVar2 = list10.get(i28);
                int d4 = lazyGridSpanLayoutProvider2.mo8479d(oVar2.mo8596b());
                if (d4 == -1 || d4 != i25) {
                    i27 += i26;
                    i26 = oVar2.mo8598d();
                    i25 = d4;
                } else {
                    i26 = Math.max(i26, oVar2.mo8598d());
                }
                C2490f fVar4 = (C2490f) C10977s0.m41443K(this.f6483c, oVar2.mo8597c());
                C2502q h2 = oVar2.mo8602h(i5 + i27, fVar4.mo8570a(), i2, i3, -1, -1);
                list2.add(h2);
                mo8439j(h2, fVar4);
            }
            this.f6487g.clear();
            this.f6488h.clear();
            this.f6489i.clear();
            this.f6490j.clear();
            this.f6486f.clear();
            return;
        }
        mo8438i();
    }

    /* renamed from: i */
    public final void mo8438i() {
        this.f6483c.clear();
        this.f6484d = C10977s0.m41492z();
        this.f6485e = -1;
    }

    /* renamed from: j */
    public final void mo8439j(C2502q qVar, C2490f fVar) {
        C2502q qVar2 = qVar;
        while (fVar.mo8573d().size() > qVar.mo8617m()) {
            C10994x.m42351L0(fVar.mo8573d());
        }
        while (fVar.mo8573d().size() < qVar.mo8617m()) {
            int size = fVar.mo8573d().size();
            long b = qVar.mo8582b();
            List<C2483a0> d = fVar.mo8573d();
            long c = fVar.mo8572c();
            d.add(new C2483a0(C16496n.m74593a(C16494m.m74581m(b) - C16494m.m74581m(c), C16494m.m74583o(b) - C16494m.m74583o(c)), qVar2.mo8615k(size), (DefaultConstructorMarker) null));
        }
        List<C2483a0> d2 = fVar.mo8573d();
        int size2 = d2.size();
        for (int i = 0; i < size2; i++) {
            C2483a0 a0Var = d2.get(i);
            long d3 = a0Var.mo8542d();
            long c2 = fVar.mo8572c();
            long a = C16496n.m74593a(C16494m.m74581m(d3) + C16494m.m74581m(c2), C16494m.m74583o(d3) + C16494m.m74583o(c2));
            long b2 = qVar.mo8582b();
            a0Var.mo8544f(qVar2.mo8615k(i));
            C1956d0<C16494m> f = qVar2.mo8610f(i);
            if (!C16494m.m74578j(a, b2)) {
                long c3 = fVar.mo8572c();
                a0Var.mo8545g(C16496n.m74593a(C16494m.m74581m(b2) - C16494m.m74581m(c3), C16494m.m74583o(b2) - C16494m.m74583o(c3)));
                if (f != null) {
                    a0Var.mo8543e(true);
                    C11723c2 unused = C12038j.m48061f(this.f6481a, (CoroutineContext) null, (CoroutineStart) null, new LazyGridItemPlacementAnimator$startAnimationsIfNeeded$1$1(a0Var, f, (C11045c<? super LazyGridItemPlacementAnimator$startAnimationsIfNeeded$1$1>) null), 3, (Object) null);
                }
            }
        }
    }

    /* renamed from: k */
    public final long mo8440k(int i) {
        boolean z = this.f6482b;
        int i2 = z ? 0 : i;
        if (!z) {
            i = 0;
        }
        return C16496n.m74593a(i2, i);
    }
}

package androidx.compose.runtime.snapshots;

import androidx.camera.view.C1814q;
import androidx.compose.runtime.C8404a0;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.collection.C8417b;
import androidx.compose.runtime.collection.C8418c;
import androidx.compose.runtime.collection.C8419d;
import androidx.compose.runtime.collection.C8421e;
import androidx.compose.runtime.collection.C8423g;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.constant.C28534f;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.KotlinNothingValueException;
import kotlin.collections.C10976s;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nSnapshotStateObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap\n*L\n1#1,549:1\n181#1,2:554\n183#1,2:567\n181#1,2:598\n183#1,2:611\n181#1,2:613\n183#1,2:626\n181#1,2:628\n183#1,2:641\n1182#2:550\n1161#2,2:551\n1#3:553\n460#4,11:556\n460#4,11:569\n460#4,11:600\n460#4,11:615\n460#4,11:630\n366#4,12:643\n728#4,2:655\n436#5,18:580\n*S KotlinDebug\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver\n*L\n65#1:554,2\n65#1:567,2\n269#1:598,2\n269#1:611,2\n279#1:613,2\n279#1:626,2\n311#1:628,2\n311#1:641,2\n173#1:550\n173#1:551,2\n65#1:556,11\n182#1:569,11\n269#1:600,11\n279#1:615,11\n311#1:630,11\n324#1:643,12\n327#1:655,2\n229#1:580,18\n*E\n"})
public final class SnapshotStateObserver {

    /* renamed from: j */
    public static final int f23142j = 8;
    @C12579k

    /* renamed from: a */
    public final C11300l<C11289a<C11079d2>, C11079d2> f23143a;
    @C12579k

    /* renamed from: b */
    public final AtomicReference<Object> f23144b = new AtomicReference<>((Object) null);

    /* renamed from: c */
    public boolean f23145c;
    @C12579k

    /* renamed from: d */
    public final C11304p<Set<? extends Object>, C8646f, C11079d2> f23146d = new SnapshotStateObserver$applyObserver$1(this);
    @C12579k

    /* renamed from: e */
    public final C11300l<Object, C11079d2> f23147e = new SnapshotStateObserver$readObserver$1(this);
    @C12579k

    /* renamed from: f */
    public final C8423g<ObservedScopeMap> f23148f = new C8423g<>(new ObservedScopeMap[16], 0);
    @C12580l

    /* renamed from: g */
    public C8642d f23149g;

    /* renamed from: h */
    public boolean f23150h;
    @C12580l

    /* renamed from: i */
    public ObservedScopeMap f23151i;

    @C11363r0({"SMAP\nSnapshotStateObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap\n+ 2 IdentityArrayIntMap.kt\nandroidx/compose/runtime/collection/IdentityArrayIntMap\n+ 3 IdentityArrayMap.kt\nandroidx/compose/runtime/collection/IdentityArrayMap\n+ 4 IdentityScopeMap.kt\nandroidx/compose/runtime/collection/IdentityScopeMap\n+ 5 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n*L\n1#1,549:1\n132#2,18:550\n159#2,4:568\n159#2,4:579\n118#3,7:572\n125#3,15:583\n89#4,3:598\n89#4,3:604\n93#4:612\n93#4:614\n89#4,3:615\n93#4:623\n105#5,3:601\n105#5,5:607\n109#5:613\n105#5,5:618\n105#5,5:624\n*S KotlinDebug\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap\n*L\n456#1:550,18\n470#1:568,4\n482#1:579,4\n479#1:572,7\n479#1:583,15\n517#1:598,3\n524#1:604,3\n524#1:612\n517#1:614\n532#1:615,3\n532#1:623\n517#1:601,3\n524#1:607,5\n517#1:613\n532#1:618,5\n544#1:624,5\n*E\n"})
    public static final class ObservedScopeMap {
        @C12579k

        /* renamed from: a */
        public final C11300l<Object, C11079d2> f23152a;
        @C12580l

        /* renamed from: b */
        public Object f23153b;
        @C12580l

        /* renamed from: c */
        public C8417b f23154c;

        /* renamed from: d */
        public int f23155d = -1;
        @C12579k

        /* renamed from: e */
        public final C8421e<Object> f23156e = new C8421e<>();
        @C12579k

        /* renamed from: f */
        public final C8418c<Object, C8417b> f23157f = new C8418c<>(0, 1, (DefaultConstructorMarker) null);
        @C12579k

        /* renamed from: g */
        public final C8419d<Object> f23158g = new C8419d<>();
        @C12579k

        /* renamed from: h */
        public final C11300l<C8578k2<?>, C11079d2> f23159h = new C8632x6befda94(this);
        @C12579k

        /* renamed from: i */
        public final C11300l<C8578k2<?>, C11079d2> f23160i = new C8633xa5f2bac8(this);

        /* renamed from: j */
        public int f23161j;
        @C12579k

        /* renamed from: k */
        public final C8421e<C8404a0<?>> f23162k = new C8421e<>();
        @C12579k

        /* renamed from: l */
        public final HashMap<C8404a0<?>, Object> f23163l = new HashMap<>();

        public ObservedScopeMap(@C12579k C11300l<Object, C11079d2> lVar) {
            Intrinsics.checkNotNullParameter(lVar, "onChanged");
            this.f23152a = lVar;
        }

        /* renamed from: k */
        public final void mo16512k() {
            this.f23156e.mo15406d();
            this.f23157f.mo15357a();
            this.f23162k.mo15406d();
            this.f23163l.clear();
        }

        /* renamed from: l */
        public final void mo16513l(Object obj) {
            boolean z;
            C8417b bVar = this.f23154c;
            if (bVar != null) {
                int i = bVar.mo15350i();
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    Object obj2 = bVar.mo15349g()[i3];
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Any");
                    int i4 = bVar.mo15351k()[i3];
                    if (i4 != this.f23155d) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        mo16522u(obj, obj2);
                    }
                    if (!z) {
                        if (i2 != i3) {
                            bVar.mo15349g()[i2] = obj2;
                            bVar.mo15351k()[i2] = i4;
                        }
                        i2++;
                    }
                }
                int i5 = bVar.mo15350i();
                for (int i6 = i2; i6 < i5; i6++) {
                    bVar.mo15349g()[i6] = null;
                }
                bVar.mo15355p(i2);
            }
        }

        /* renamed from: m */
        public final void mo16514m(@C12579k Object obj) {
            Intrinsics.checkNotNullParameter(obj, "scope");
            C8417b l = this.f23157f.mo15368l(obj);
            if (l != null) {
                int i = l.mo15350i();
                for (int i2 = 0; i2 < i; i2++) {
                    Object obj2 = l.mo15349g()[i2];
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Any");
                    int i3 = l.mo15351k()[i2];
                    mo16522u(obj, obj2);
                }
            }
        }

        @C12579k
        /* renamed from: n */
        public final C11300l<C8578k2<?>, C11079d2> mo16515n() {
            return this.f23159h;
        }

        @C12579k
        /* renamed from: o */
        public final C11300l<C8578k2<?>, C11079d2> mo16516o() {
            return this.f23160i;
        }

        @C12579k
        /* renamed from: p */
        public final C11300l<Object, C11079d2> mo16517p() {
            return this.f23152a;
        }

        /* renamed from: q */
        public final void mo16518q() {
            C8419d<Object> dVar = this.f23158g;
            C11300l<Object, C11079d2> lVar = this.f23152a;
            int size = dVar.size();
            for (int i = 0; i < size; i++) {
                lVar.invoke(dVar.get(i));
            }
            this.f23158g.clear();
        }

        /* renamed from: r */
        public final void mo16519r(@C12579k Object obj, @C12579k C11289a<C11079d2> aVar) {
            Intrinsics.checkNotNullParameter(obj, "scope");
            Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
            Object b = this.f23153b;
            C8417b c = this.f23154c;
            int d = this.f23155d;
            this.f23153b = obj;
            this.f23154c = (C8417b) this.f23157f.mo15362f(obj);
            if (this.f23155d == -1) {
                this.f23155d = SnapshotKt.m31446D().mo16599g();
            }
            aVar.invoke();
            Object b2 = this.f23153b;
            Intrinsics.checkNotNull(b2);
            mo16513l(b2);
            this.f23153b = b;
            this.f23154c = c;
            this.f23155d = d;
        }

        /* renamed from: s */
        public final boolean mo16520s(@C12579k Set<? extends Object> set) {
            C8421e<C8404a0<?>> eVar;
            int a;
            C8421e<Object> eVar2;
            int a2;
            Intrinsics.checkNotNullParameter(set, "changes");
            boolean z = false;
            for (Object next : set) {
                if (this.f23162k.mo15407e(next) && (a = eVar.mo15408f(next)) >= 0) {
                    C8419d b = (eVar = this.f23162k).mo15420v(a);
                    int size = b.size();
                    for (int i = 0; i < size; i++) {
                        C8404a0 a0Var = (C8404a0) b.get(i);
                        Intrinsics.checkNotNull(a0Var, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
                        Object obj = this.f23163l.get(a0Var);
                        C8410b2 a3 = a0Var.mo15114a();
                        if (a3 == null) {
                            a3 = C8415c2.m30254w();
                        }
                        if (!a3.mo15330c(a0Var.mo15115c(), obj) && (a2 = eVar2.mo15408f(a0Var)) >= 0) {
                            C8419d b2 = (eVar2 = this.f23156e).mo15420v(a2);
                            int size2 = b2.size();
                            int i2 = 0;
                            while (i2 < size2) {
                                this.f23158g.add(b2.get(i2));
                                i2++;
                                z = true;
                            }
                        }
                    }
                }
                C8421e<Object> eVar3 = this.f23156e;
                int a4 = eVar3.mo15408f(next);
                if (a4 >= 0) {
                    C8419d b3 = eVar3.mo15420v(a4);
                    int size3 = b3.size();
                    int i3 = 0;
                    while (i3 < size3) {
                        this.f23158g.add(b3.get(i3));
                        i3++;
                        z = true;
                    }
                }
            }
            return z;
        }

        /* renamed from: t */
        public final void mo16521t(@C12579k Object obj) {
            Intrinsics.checkNotNullParameter(obj, "value");
            if (this.f23161j <= 0) {
                Object obj2 = this.f23153b;
                Intrinsics.checkNotNull(obj2);
                C8417b bVar = this.f23154c;
                if (bVar == null) {
                    bVar = new C8417b();
                    this.f23154c = bVar;
                    this.f23157f.mo15371o(obj2, bVar);
                }
                int a = bVar.mo15343a(obj, this.f23155d);
                if ((obj instanceof C8404a0) && a != this.f23155d) {
                    C8404a0 a0Var = (C8404a0) obj;
                    for (Object obj3 : a0Var.mo15117f()) {
                        if (obj3 == null) {
                            break;
                        }
                        this.f23162k.mo15405c(obj3, obj);
                    }
                    this.f23163l.put(obj, a0Var.mo15115c());
                }
                if (a == -1) {
                    this.f23156e.mo15405c(obj, obj2);
                }
            }
        }

        /* renamed from: u */
        public final void mo16522u(Object obj, Object obj2) {
            this.f23156e.mo15416r(obj2, obj);
            if ((obj2 instanceof C8404a0) && !this.f23156e.mo15407e(obj2)) {
                this.f23162k.mo15417s(obj2);
                this.f23163l.remove(obj2);
            }
        }

        /* renamed from: v */
        public final void mo16523v(@C12579k C11300l<Object, Boolean> lVar) {
            Intrinsics.checkNotNullParameter(lVar, "predicate");
            C8418c<Object, C8417b> cVar = this.f23157f;
            int h = cVar.mo15364h();
            int i = 0;
            for (int i2 = 0; i2 < h; i2++) {
                Object obj = cVar.mo15363g()[i2];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                C8417b bVar = (C8417b) cVar.mo15365i()[i2];
                Boolean invoke = lVar.invoke(obj);
                if (invoke.booleanValue()) {
                    int i3 = bVar.mo15350i();
                    for (int i4 = 0; i4 < i3; i4++) {
                        Object obj2 = bVar.mo15349g()[i4];
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Any");
                        int i5 = bVar.mo15351k()[i4];
                        mo16522u(obj, obj2);
                    }
                }
                if (!invoke.booleanValue()) {
                    if (i != i2) {
                        cVar.mo15363g()[i] = obj;
                        cVar.mo15365i()[i] = cVar.mo15365i()[i2];
                    }
                    i++;
                }
            }
            if (cVar.mo15364h() > i) {
                int h2 = cVar.mo15364h();
                for (int i6 = i; i6 < h2; i6++) {
                    cVar.mo15363g()[i6] = null;
                    cVar.mo15365i()[i6] = null;
                }
                cVar.mo15373q(i);
            }
        }
    }

    public SnapshotStateObserver(@C12579k C11300l<? super C11289a<C11079d2>, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "onChangedExecutor");
        this.f23143a = lVar;
    }

    /* renamed from: j */
    public final void mo16497j(Set<? extends Object> set) {
        Object obj;
        Collection collection;
        do {
            obj = this.f23144b.get();
            if (obj == null) {
                collection = set;
            } else if (obj instanceof Set) {
                collection = CollectionsKt__CollectionsKt.m40448L((Set) obj, set);
            } else if (obj instanceof List) {
                collection = CollectionsKt___CollectionsKt.m40718y4((Collection) obj, C10976s.m41419k(set));
            } else {
                mo16507t();
                throw new KotlinNothingValueException();
            }
        } while (!C1814q.m7242a(this.f23144b, obj, collection));
    }

    /* renamed from: k */
    public final void mo16498k() {
        synchronized (this.f23148f) {
            C8423g<ObservedScopeMap> gVar = this.f23148f;
            int h0 = gVar.mo15469h0();
            if (h0 > 0) {
                Object[] d0 = gVar.mo15462d0();
                int i = 0;
                do {
                    ((ObservedScopeMap) d0[i]).mo16512k();
                    i++;
                } while (i < h0);
            }
            C11079d2 d2Var = C11079d2.f28267a;
        }
    }

    /* renamed from: l */
    public final void mo16499l(@C12579k Object obj) {
        Intrinsics.checkNotNullParameter(obj, "scope");
        synchronized (this.f23148f) {
            C8423g<ObservedScopeMap> gVar = this.f23148f;
            int h0 = gVar.mo15469h0();
            if (h0 > 0) {
                Object[] d0 = gVar.mo15462d0();
                int i = 0;
                do {
                    ((ObservedScopeMap) d0[i]).mo16514m(obj);
                    i++;
                } while (i < h0);
            }
            C11079d2 d2Var = C11079d2.f28267a;
        }
    }

    /* renamed from: m */
    public final void mo16500m(@C12579k C11300l<Object, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        synchronized (this.f23148f) {
            C8423g<ObservedScopeMap> gVar = this.f23148f;
            int h0 = gVar.mo15469h0();
            if (h0 > 0) {
                Object[] d0 = gVar.mo15462d0();
                int i = 0;
                do {
                    ((ObservedScopeMap) d0[i]).mo16523v(lVar);
                    i++;
                } while (i < h0);
            }
            C11079d2 d2Var = C11079d2.f28267a;
        }
    }

    /* renamed from: n */
    public final boolean mo16501n() {
        boolean z;
        synchronized (this.f23148f) {
            z = this.f23145c;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            Set<Object> s = mo16506s();
            if (s == null) {
                return z2;
            }
            synchronized (this.f23148f) {
                C8423g<ObservedScopeMap> gVar = this.f23148f;
                int h0 = gVar.mo15469h0();
                if (h0 > 0) {
                    Object[] d0 = gVar.mo15462d0();
                    int i = 0;
                    do {
                        if (!((ObservedScopeMap) d0[i]).mo16520s(s)) {
                            if (!z2) {
                                z2 = false;
                                i++;
                            }
                        }
                        z2 = true;
                        i++;
                    } while (i < h0);
                }
                C11079d2 d2Var = C11079d2.f28267a;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap mo16502o(kotlin.jvm.functions.C11300l<? super T, kotlin.C11079d2> r8) {
        /*
            r7 = this;
            androidx.compose.runtime.collection.g<androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap> r0 = r7.f23148f
            int r1 = r0.mo15469h0()
            r2 = 1
            if (r1 <= 0) goto L_0x0024
            java.lang.Object[] r0 = r0.mo15462d0()
            r3 = 0
            r4 = r3
        L_0x000f:
            r5 = r0[r4]
            r6 = r5
            androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap r6 = (androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap) r6
            kotlin.jvm.functions.l r6 = r6.mo16517p()
            if (r6 != r8) goto L_0x001c
            r6 = r2
            goto L_0x001d
        L_0x001c:
            r6 = r3
        L_0x001d:
            if (r6 == 0) goto L_0x0020
            goto L_0x0025
        L_0x0020:
            int r4 = r4 + 1
            if (r4 < r1) goto L_0x000f
        L_0x0024:
            r5 = 0
        L_0x0025:
            androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap r5 = (androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap) r5
            if (r5 != 0) goto L_0x003f
            androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap r0 = new androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8, r1)
            java.lang.Object r8 = kotlin.jvm.internal.C11370u0.m43701q(r8, r2)
            kotlin.jvm.functions.l r8 = (kotlin.jvm.functions.C11300l) r8
            r0.<init>(r8)
            androidx.compose.runtime.collection.g<androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap> r8 = r7.f23148f
            r8.mo15463e(r0)
            return r0
        L_0x003f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateObserver.mo16502o(kotlin.jvm.functions.l):androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap");
    }

    /* renamed from: p */
    public final void mo16503p(C11300l<? super ObservedScopeMap, C11079d2> lVar) {
        synchronized (this.f23148f) {
            try {
                C8423g<ObservedScopeMap> gVar = this.f23148f;
                int h0 = gVar.mo15469h0();
                if (h0 > 0) {
                    Object[] d0 = gVar.mo15462d0();
                    int i = 0;
                    do {
                        lVar.invoke(d0[i]);
                        i++;
                    } while (i < h0);
                }
                C11079d2 d2Var = C11079d2.f28267a;
                C11322b0.m43481d(1);
            } catch (Throwable th) {
                C11322b0.m43481d(1);
                C11322b0.m43480c(1);
                throw th;
            }
        }
        C11322b0.m43480c(1);
    }

    /* renamed from: q */
    public final void mo16504q(@C12579k Set<? extends Object> set, @C12579k C8646f fVar) {
        Intrinsics.checkNotNullParameter(set, "changes");
        Intrinsics.checkNotNullParameter(fVar, "snapshot");
        this.f23146d.invoke(set, fVar);
    }

    /* renamed from: r */
    public final <T> void mo16505r(@C12579k T t, @C12579k C11300l<? super T, C11079d2> lVar, @C12579k C11289a<C11079d2> aVar) {
        ObservedScopeMap o;
        Intrinsics.checkNotNullParameter(t, "scope");
        Intrinsics.checkNotNullParameter(lVar, "onValueChangedForScope");
        Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
        synchronized (this.f23148f) {
            o = mo16502o(lVar);
        }
        boolean z = this.f23150h;
        ObservedScopeMap observedScopeMap = this.f23151i;
        try {
            this.f23150h = false;
            this.f23151i = o;
            Object b = o.f23153b;
            C8417b c = o.f23154c;
            int d = o.f23155d;
            o.f23153b = t;
            o.f23154c = (C8417b) o.f23157f.mo15362f(t);
            if (o.f23155d == -1) {
                o.f23155d = SnapshotKt.m31446D().mo16599g();
            }
            C8415c2.m30244m(o.mo16515n(), o.mo16516o(), new SnapshotStateObserver$observeReads$1$1(this, aVar));
            Object b2 = o.f23153b;
            Intrinsics.checkNotNull(b2);
            o.mo16513l(b2);
            o.f23153b = b;
            o.f23154c = c;
            o.f23155d = d;
        } finally {
            this.f23151i = observedScopeMap;
            this.f23150h = z;
        }
    }

    /* renamed from: s */
    public final Set<Object> mo16506s() {
        Object obj;
        Object obj2;
        Set<Object> set;
        do {
            obj = this.f23144b.get();
            obj2 = null;
            if (obj == null) {
                return null;
            }
            if (obj instanceof Set) {
                set = (Set) obj;
            } else if (obj instanceof List) {
                List list = (List) obj;
                Set<Object> set2 = (Set) list.get(0);
                if (list.size() == 2) {
                    obj2 = list.get(1);
                } else if (list.size() > 2) {
                    obj2 = list.subList(1, list.size());
                }
                set = set2;
            } else {
                mo16507t();
                throw new KotlinNothingValueException();
            }
        } while (!C1814q.m7242a(this.f23144b, obj, obj2));
        return set;
    }

    /* renamed from: t */
    public final Void mo16507t() {
        ComposerKt.m29774A("Unexpected notification");
        throw new KotlinNothingValueException();
    }

    /* renamed from: u */
    public final void mo16508u() {
        this.f23143a.invoke(new SnapshotStateObserver$sendNotifications$1(this));
    }

    /* renamed from: v */
    public final void mo16509v() {
        this.f23149g = C8646f.f23196e.mo16627h(this.f23146d);
    }

    /* renamed from: w */
    public final void mo16510w() {
        C8642d dVar = this.f23149g;
        if (dVar != null) {
            dVar.mo16593g();
        }
    }

    @C11395k(message = "Replace with Snapshot.withoutReadObservation()", replaceWith = @C11587t0(expression = "Snapshot.withoutReadObservation(block)", imports = {"androidx.compose.runtime.snapshots.Snapshot"}))
    /* renamed from: x */
    public final void mo16511x(@C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
        boolean z = this.f23150h;
        this.f23150h = true;
        try {
            aVar.invoke();
        } finally {
            this.f23150h = z;
        }
    }
}

package androidx.compose.runtime;

import androidx.compose.runtime.C8575k0;
import androidx.compose.runtime.collection.C8418c;
import androidx.compose.runtime.collection.C8419d;
import androidx.compose.runtime.collection.C8422f;
import androidx.compose.runtime.external.kotlinx.collections.immutable.C8438a;
import androidx.compose.runtime.external.kotlinx.collections.immutable.C8452h;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.snapshots.C8634a;
import androidx.compose.runtime.snapshots.C8646f;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.tooling.C8679a;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.shared.constant.C28534f;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.C11078d1;
import kotlin.C11079d2;
import kotlin.C11532s0;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.collections.C10956m;
import kotlin.collections.C10992w;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.C11006g;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11370u0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 4 Trace.kt\nandroidx/compose/runtime/TraceKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Composer.kt\nandroidx/compose/runtime/GroupKind\n+ 7 BitwiseOperators.kt\nandroidx/compose/runtime/BitwiseOperatorsKt\n+ 8 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 9 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n+ 10 IdentityArrayMap.kt\nandroidx/compose/runtime/collection/IdentityArrayMap\n+ 11 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,4528:1\n3212#1,4:4567\n3222#1,6:4587\n3212#1,6:4593\n3229#1,2:4599\n3217#1:4605\n3212#1,6:4673\n1#2:4529\n146#3,8:4530\n146#3,8:4575\n146#3,4:4583\n151#3,3:4601\n162#3,8:4661\n146#3,4:4669\n151#3,3:4679\n46#4,5:4538\n46#4,3:4636\n50#4:4642\n4513#5,5:4543\n4513#5,5:4548\n309#5:4553\n4513#5,5:4557\n4513#5,5:4562\n4513#5,5:4616\n4513#5,5:4621\n4513#5,5:4626\n4513#5,5:4631\n4513#5,5:4646\n4513#5,5:4651\n4513#5,5:4656\n4513#5,5:4682\n4513#5,5:4687\n4513#5,5:4692\n4513#5,5:4697\n4443#6:4554\n4444#6:4555\n26#7:4556\n26#7:4702\n22#7:4703\n33#8,4:4571\n38#8:4604\n33#8,4:4606\n38#8:4615\n82#8,3:4704\n33#8,4:4707\n85#8,2:4711\n38#8:4713\n87#8:4714\n105#9,5:4610\n146#10,3:4639\n150#10:4643\n1002#11,2:4644\n1855#11,2:4715\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl\n*L\n3053#1:4567,4\n3166#1:4587,6\n3172#1:4593,6\n3166#1:4599,2\n3053#1:4605\n3770#1:4673,6\n1300#1:4530,8\n3081#1:4575,8\n3165#1:4583,4\n3165#1:4601,3\n3737#1:4661,8\n3768#1:4669,4\n3768#1:4679,3\n1540#1:4538,5\n3339#1:4636,3\n3339#1:4642\n1609#1:4543,5\n1636#1:4548,5\n1987#1:4553\n2770#1:4557,5\n2783#1:4562,5\n3297#1:4616,5\n3302#1:4621,5\n3318#1:4626,5\n3338#1:4631,5\n3405#1:4646,5\n3412#1:4651,5\n3549#1:4656,5\n3817#1:4682,5\n3833#1:4687,5\n3834#1:4692,5\n3862#1:4697,5\n2146#1:4554\n2170#1:4555\n2694#1:4556\n4057#1:4702\n4073#1:4703\n3055#1:4571,4\n3055#1:4604\n3248#1:4606,4\n3248#1:4615\n3641#1:4704,3\n3641#1:4707,4\n3641#1:4711,2\n3641#1:4713\n3641#1:4714\n3250#1:4610,5\n3343#1:4639,3\n3343#1:4643\n3347#1:4644,2\n3677#1:4715,2\n*E\n"})
public final class ComposerImpl implements C8592o {

    /* renamed from: A */
    public int f22568A = -1;

    /* renamed from: B */
    public int f22569B;
    @C12579k

    /* renamed from: C */
    public C8646f f22570C = SnapshotKt.m31446D();

    /* renamed from: D */
    public int f22571D;

    /* renamed from: E */
    public boolean f22572E = true;
    @C12579k

    /* renamed from: F */
    public final C8573j2<RecomposeScopeImpl> f22573F = new C8573j2<>();

    /* renamed from: G */
    public boolean f22574G;

    /* renamed from: H */
    public boolean f22575H;
    @C12579k

    /* renamed from: I */
    public C8689v1 f22576I;
    @C12579k

    /* renamed from: J */
    public C8692w1 f22577J;
    @C12579k

    /* renamed from: K */
    public C8701z1 f22578K;

    /* renamed from: L */
    public boolean f22579L;
    @C12580l

    /* renamed from: M */
    public C8452h<C8682u<Object>, ? extends C8578k2<? extends Object>> f22580M;
    @C12580l

    /* renamed from: N */
    public List<C11305q<C8428d<?>, C8701z1, C8608r1, C11079d2>> f22581N;
    @C12579k

    /* renamed from: O */
    public C8412c f22582O;
    @C12579k

    /* renamed from: P */
    public final List<C11305q<C8428d<?>, C8701z1, C8608r1, C11079d2>> f22583P;

    /* renamed from: Q */
    public boolean f22584Q;

    /* renamed from: R */
    public int f22585R;

    /* renamed from: S */
    public int f22586S;
    @C12579k

    /* renamed from: T */
    public C8573j2<Object> f22587T;

    /* renamed from: U */
    public int f22588U;

    /* renamed from: V */
    public boolean f22589V;

    /* renamed from: W */
    public boolean f22590W;
    @C12579k

    /* renamed from: X */
    public final C8589n0 f22591X;
    @C12579k

    /* renamed from: Y */
    public final C8573j2<C11305q<C8428d<?>, C8701z1, C8608r1, C11079d2>> f22592Y;

    /* renamed from: Z */
    public int f22593Z;

    /* renamed from: a0 */
    public int f22594a0;
    @C12579k

    /* renamed from: b */
    public final C8428d<?> f22595b;

    /* renamed from: b0 */
    public int f22596b0;
    @C12579k

    /* renamed from: c */
    public final C8602q f22597c;

    /* renamed from: c0 */
    public int f22598c0;
    @C12579k

    /* renamed from: d */
    public final C8692w1 f22599d;
    @C12579k

    /* renamed from: e */
    public final Set<C8616s1> f22600e;
    @C12579k

    /* renamed from: f */
    public List<C11305q<C8428d<?>, C8701z1, C8608r1, C11079d2>> f22601f;
    @C12579k

    /* renamed from: g */
    public List<C11305q<C8428d<?>, C8701z1, C8608r1, C11079d2>> f22602g;
    @C12579k

    /* renamed from: h */
    public final C8696y f22603h;
    @C12579k

    /* renamed from: i */
    public final C8573j2<Pending> f22604i = new C8573j2<>();
    @C12580l

    /* renamed from: j */
    public Pending f22605j;

    /* renamed from: k */
    public int f22606k;
    @C12579k

    /* renamed from: l */
    public C8589n0 f22607l = new C8589n0();

    /* renamed from: m */
    public int f22608m;
    @C12579k

    /* renamed from: n */
    public C8589n0 f22609n = new C8589n0();
    @C12580l

    /* renamed from: o */
    public int[] f22610o;
    @C12580l

    /* renamed from: p */
    public HashMap<Integer, Integer> f22611p;

    /* renamed from: q */
    public boolean f22612q;

    /* renamed from: r */
    public boolean f22613r;

    /* renamed from: s */
    public boolean f22614s;
    @C12579k

    /* renamed from: t */
    public final List<C8603q0> f22615t = new ArrayList();
    @C12579k

    /* renamed from: u */
    public final C8589n0 f22616u = new C8589n0();
    @C12579k

    /* renamed from: v */
    public C8452h<C8682u<Object>, ? extends C8578k2<? extends Object>> f22617v = C8438a.m30459C();
    @C12579k

    /* renamed from: w */
    public final C8422f<C8452h<C8682u<Object>, C8578k2<Object>>> f22618w = new C8422f<>(0, 1, (DefaultConstructorMarker) null);

    /* renamed from: x */
    public boolean f22619x;
    @C12579k

    /* renamed from: y */
    public final C8589n0 f22620y = new C8589n0();

    /* renamed from: z */
    public boolean f22621z;

    /* renamed from: androidx.compose.runtime.ComposerImpl$a */
    public static final class C8381a implements C8616s1 {
        @C12579k

        /* renamed from: a */
        public final C8382b f22622a;

        public C8381a(@C12579k C8382b bVar) {
            Intrinsics.checkNotNullParameter(bVar, "ref");
            this.f22622a = bVar;
        }

        @C12579k
        /* renamed from: a */
        public final C8382b mo15043a() {
            return this.f22622a;
        }

        /* renamed from: d */
        public void mo8797d() {
        }

        /* renamed from: e */
        public void mo8799e() {
            this.f22622a.mo15064t();
        }

        /* renamed from: g */
        public void mo8800g() {
            this.f22622a.mo15064t();
        }
    }

    @C11363r0({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$CompositionContextImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,4528:1\n1855#2,2:4529\n76#3:4531\n102#3,2:4532\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$CompositionContextImpl\n*L\n3948#1:4529,2\n3998#1:4531\n3998#1:4532,2\n*E\n"})
    /* renamed from: androidx.compose.runtime.ComposerImpl$b */
    public final class C8382b extends C8602q {

        /* renamed from: b */
        public final int f22623b;

        /* renamed from: c */
        public final boolean f22624c;
        @C12580l

        /* renamed from: d */
        public Set<Set<C8679a>> f22625d;
        @C12579k

        /* renamed from: e */
        public final Set<ComposerImpl> f22626e = new LinkedHashSet();
        @C12579k

        /* renamed from: f */
        public final C8700z0 f22627f = C8539f2.m30981g(C8438a.m30459C(), (C8410b2) null, 2, (Object) null);

        public C8382b(int i, boolean z) {
            this.f22623b = i;
            this.f22624c = z;
        }

        /* renamed from: x */
        public static /* synthetic */ void m29715x() {
        }

        /* renamed from: A */
        public final void mo15044A(@C12579k C8452h<C8682u<Object>, ? extends C8578k2<? extends Object>> hVar) {
            Intrinsics.checkNotNullParameter(hVar, "scope");
            mo15068y(hVar);
        }

        @C8544h(scheme = "[0[0]]")
        /* renamed from: a */
        public void mo15045a(@C12579k C8696y yVar, @C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar) {
            Intrinsics.checkNotNullParameter(yVar, "composition");
            Intrinsics.checkNotNullParameter(pVar, "content");
            ComposerImpl.this.f22597c.mo15045a(yVar, pVar);
        }

        /* renamed from: b */
        public void mo15046b(@C12579k C8697y0 y0Var) {
            Intrinsics.checkNotNullParameter(y0Var, "reference");
            ComposerImpl.this.f22597c.mo15046b(y0Var);
        }

        /* renamed from: c */
        public void mo15047c() {
            ComposerImpl composerImpl = ComposerImpl.this;
            composerImpl.f22569B = composerImpl.f22569B - 1;
        }

        /* renamed from: d */
        public boolean mo15048d() {
            return this.f22624c;
        }

        @C12579k
        /* renamed from: e */
        public C8452h<C8682u<Object>, C8578k2<Object>> mo15049e() {
            return mo15066v();
        }

        /* renamed from: f */
        public int mo15050f() {
            return this.f22623b;
        }

        @C12579k
        /* renamed from: g */
        public CoroutineContext mo15051g() {
            return ComposerImpl.this.f22597c.mo15051g();
        }

        @C12579k
        /* renamed from: h */
        public CoroutineContext mo15052h() {
            return C8676t.m31874j(ComposerImpl.this.mo14969d0());
        }

        /* renamed from: i */
        public void mo15053i(@C12579k C8697y0 y0Var) {
            Intrinsics.checkNotNullParameter(y0Var, "reference");
            ComposerImpl.this.f22597c.mo15053i(y0Var);
        }

        /* renamed from: j */
        public void mo15054j(@C12579k C8696y yVar) {
            Intrinsics.checkNotNullParameter(yVar, "composition");
            ComposerImpl.this.f22597c.mo15054j(ComposerImpl.this.mo14969d0());
            ComposerImpl.this.f22597c.mo15054j(yVar);
        }

        /* renamed from: k */
        public void mo15055k(@C12579k RecomposeScopeImpl recomposeScopeImpl) {
            Intrinsics.checkNotNullParameter(recomposeScopeImpl, "scope");
            ComposerImpl.this.f22597c.mo15055k(recomposeScopeImpl);
        }

        /* renamed from: l */
        public void mo15056l(@C12579k C8697y0 y0Var, @C12579k C8694x0 x0Var) {
            Intrinsics.checkNotNullParameter(y0Var, "reference");
            Intrinsics.checkNotNullParameter(x0Var, "data");
            ComposerImpl.this.f22597c.mo15056l(y0Var, x0Var);
        }

        @C12580l
        /* renamed from: m */
        public C8694x0 mo15057m(@C12579k C8697y0 y0Var) {
            Intrinsics.checkNotNullParameter(y0Var, "reference");
            return ComposerImpl.this.f22597c.mo15057m(y0Var);
        }

        /* renamed from: n */
        public void mo15058n(@C12579k Set<C8679a> set) {
            Intrinsics.checkNotNullParameter(set, "table");
            Set set2 = this.f22625d;
            if (set2 == null) {
                set2 = new HashSet();
                this.f22625d = set2;
            }
            set2.add(set);
        }

        /* renamed from: o */
        public void mo15059o(@C12579k C8592o oVar) {
            Intrinsics.checkNotNullParameter(oVar, "composer");
            super.mo15059o((ComposerImpl) oVar);
            this.f22626e.add(oVar);
        }

        /* renamed from: p */
        public void mo15060p(@C12579k C8696y yVar) {
            Intrinsics.checkNotNullParameter(yVar, "composition");
            ComposerImpl.this.f22597c.mo15060p(yVar);
        }

        /* renamed from: q */
        public void mo15061q() {
            ComposerImpl composerImpl = ComposerImpl.this;
            composerImpl.f22569B = composerImpl.f22569B + 1;
        }

        /* renamed from: r */
        public void mo15062r(@C12579k C8592o oVar) {
            Intrinsics.checkNotNullParameter(oVar, "composer");
            Set<Set<C8679a>> set = this.f22625d;
            if (set != null) {
                for (Set remove : set) {
                    remove.remove(((ComposerImpl) oVar).f22599d);
                }
            }
            C11370u0.m43685a(this.f22626e).remove(oVar);
        }

        /* renamed from: s */
        public void mo15063s(@C12579k C8696y yVar) {
            Intrinsics.checkNotNullParameter(yVar, "composition");
            ComposerImpl.this.f22597c.mo15063s(yVar);
        }

        /* renamed from: t */
        public final void mo15064t() {
            if (!this.f22626e.isEmpty()) {
                Set<Set<C8679a>> set = this.f22625d;
                if (set != null) {
                    for (ComposerImpl next : this.f22626e) {
                        for (Set<C8679a> remove : set) {
                            remove.remove(next.f22599d);
                        }
                    }
                }
                this.f22626e.clear();
            }
        }

        @C12579k
        /* renamed from: u */
        public final Set<ComposerImpl> mo15065u() {
            return this.f22626e;
        }

        /* renamed from: v */
        public final C8452h<C8682u<Object>, C8578k2<Object>> mo15066v() {
            return (C8452h) this.f22627f.getValue();
        }

        @C12580l
        /* renamed from: w */
        public final Set<Set<C8679a>> mo15067w() {
            return this.f22625d;
        }

        /* renamed from: y */
        public final void mo15068y(C8452h<C8682u<Object>, ? extends C8578k2<? extends Object>> hVar) {
            this.f22627f.setValue(hVar);
        }

        /* renamed from: z */
        public final void mo15069z(@C12580l Set<Set<C8679a>> set) {
            this.f22625d = set;
        }
    }

    @C11363r0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerImpl\n*L\n1#1,328:1\n3347#2:329\n*E\n"})
    /* renamed from: androidx.compose.runtime.ComposerImpl$c */
    public static final class C8383c<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C11006g.m42424l(Integer.valueOf(((C8603q0) t).mo16291b()), Integer.valueOf(((C8603q0) t2).mo16291b()));
        }
    }

    /* JADX INFO: finally extract failed */
    public ComposerImpl(@C12579k C8428d<?> dVar, @C12579k C8602q qVar, @C12579k C8692w1 w1Var, @C12579k Set<C8616s1> set, @C12579k List<C11305q<C8428d<?>, C8701z1, C8608r1, C11079d2>> list, @C12579k List<C11305q<C8428d<?>, C8701z1, C8608r1, C11079d2>> list2, @C12579k C8696y yVar) {
        Intrinsics.checkNotNullParameter(dVar, "applier");
        Intrinsics.checkNotNullParameter(qVar, "parentContext");
        Intrinsics.checkNotNullParameter(w1Var, "slotTable");
        Intrinsics.checkNotNullParameter(set, "abandonSet");
        Intrinsics.checkNotNullParameter(list, "changes");
        Intrinsics.checkNotNullParameter(list2, "lateChanges");
        Intrinsics.checkNotNullParameter(yVar, "composition");
        this.f22595b = dVar;
        this.f22597c = qVar;
        this.f22599d = w1Var;
        this.f22600e = set;
        this.f22601f = list;
        this.f22602g = list2;
        this.f22603h = yVar;
        C8689v1 F0 = w1Var.mo16836F0();
        F0.mo16808e();
        this.f22576I = F0;
        C8692w1 w1Var2 = new C8692w1();
        this.f22577J = w1Var2;
        C8701z1 G0 = w1Var2.mo16837G0();
        G0.mo16908I();
        this.f22578K = G0;
        C8689v1 F02 = this.f22577J.mo16836F0();
        try {
            C8412c a = F02.mo16802a(0);
            F02.mo16808e();
            this.f22582O = a;
            this.f22583P = new ArrayList();
            this.f22587T = new C8573j2<>();
            this.f22590W = true;
            this.f22591X = new C8589n0();
            this.f22592Y = new C8573j2<>();
            this.f22593Z = -1;
            this.f22594a0 = -1;
            this.f22596b0 = -1;
        } catch (Throwable th) {
            F02.mo16808e();
            throw th;
        }
    }

    /* renamed from: E1 */
    public static /* synthetic */ void m29532E1(ComposerImpl composerImpl, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        composerImpl.mo14897D1(z);
    }

    @C8595o0
    /* renamed from: F */
    public static /* synthetic */ void m29533F() {
    }

    /* renamed from: I1 */
    public static /* synthetic */ Object m29538I1(ComposerImpl composerImpl, C8696y yVar, C8696y yVar2, Integer num, List list, C11289a aVar, int i, Object obj) {
        C8696y yVar3;
        C8696y yVar4;
        Integer num2;
        if ((i & 1) != 0) {
            yVar3 = null;
        } else {
            yVar3 = yVar;
        }
        if ((i & 2) != 0) {
            yVar4 = null;
        } else {
            yVar4 = yVar2;
        }
        if ((i & 4) != 0) {
            num2 = null;
        } else {
            num2 = num;
        }
        if ((i & 8) != 0) {
            list = CollectionsKt__CollectionsKt.m40441E();
        }
        return composerImpl.mo14907H1(yVar3, yVar4, num2, list, aVar);
    }

    /* renamed from: Z1 */
    public static /* synthetic */ void m29539Z1(ComposerImpl composerImpl, boolean z, C11305q qVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        composerImpl.mo14955Y1(z, qVar);
    }

    @C8579l
    /* renamed from: b0 */
    public static /* synthetic */ void m29540b0() {
    }

    /* renamed from: g2 */
    public static final int m29541g2(ComposerImpl composerImpl, int i, boolean z, int i2) {
        boolean z2;
        int i3;
        C8381a aVar;
        ComposerImpl composerImpl2 = composerImpl;
        int i4 = i;
        int i5 = i2;
        int i6 = 1;
        if (composerImpl2.f22576I.mo16787L(i4)) {
            int H = composerImpl2.f22576I.mo16783H(i4);
            Object J = composerImpl2.f22576I.mo16785J(i4);
            if (H == 126665345 && (J instanceof C8691w0)) {
                C8691w0 w0Var = (C8691w0) J;
                Object G = composerImpl2.f22576I.mo16782G(i4, 0);
                C8412c a = composerImpl2.f22576I.mo16802a(i4);
                List e = ComposerKt.m29778E(composerImpl2.f22615t, i4, composerImpl2.f22576I.mo16786K(i4) + i4);
                ArrayList arrayList = new ArrayList(e.size());
                int size = e.size();
                for (int i7 = 0; i7 < size; i7++) {
                    C8603q0 q0Var = (C8603q0) e.get(i7);
                    arrayList.add(C11078d1.m42659a(q0Var.mo16292c(), q0Var.mo16290a()));
                }
                C8697y0 y0Var = new C8697y0(w0Var, G, composerImpl.mo14969d0(), composerImpl2.f22599d, a, arrayList, composerImpl.mo14936S0(i));
                composerImpl2.f22597c.mo15046b(y0Var);
                composerImpl.mo14949W1();
                composerImpl2.mo14914K1(new ComposerImpl$reportFreeMovableContent$reportGroup$1(composerImpl2, y0Var));
                if (!z) {
                    return composerImpl2.f22576I.mo16795T(i4);
                }
                composerImpl.mo14894C1();
                composerImpl.mo14901F1();
                composerImpl.mo14889A1();
                if (!composerImpl2.f22576I.mo16791P(i4)) {
                    i6 = composerImpl2.f22576I.mo16795T(i4);
                }
                if (i6 <= 0) {
                    return 0;
                }
                composerImpl2.mo14946V1(i5, i6);
                return 0;
            } else if (H != 206 || !Intrinsics.areEqual(J, ComposerKt.m29801a0())) {
                return composerImpl2.f22576I.mo16795T(i4);
            } else {
                Object G2 = composerImpl2.f22576I.mo16782G(i4, 0);
                if (G2 instanceof C8381a) {
                    aVar = (C8381a) G2;
                } else {
                    aVar = null;
                }
                if (aVar != null) {
                    for (ComposerImpl e2 : aVar.mo15043a().mo15065u()) {
                        e2.mo14975e2();
                    }
                }
                return composerImpl2.f22576I.mo16795T(i4);
            }
        } else if (!composerImpl2.f22576I.mo16809f(i4)) {
            return composerImpl2.f22576I.mo16795T(i4);
        } else {
            int K = composerImpl2.f22576I.mo16786K(i4) + i4;
            int i8 = 0;
            for (int i9 = i4 + 1; i9 < K; i9 += composerImpl2.f22576I.mo16786K(i9)) {
                boolean P = composerImpl2.f22576I.mo16791P(i9);
                if (P) {
                    composerImpl.mo14894C1();
                    composerImpl2.mo14923N1(composerImpl2.f22576I.mo16793R(i9));
                }
                if (P || z) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (P) {
                    i3 = 0;
                } else {
                    i3 = i5 + i8;
                }
                i8 += m29541g2(composerImpl2, i9, z2, i3);
                if (P) {
                    composerImpl.mo14894C1();
                    composerImpl.mo14960a2();
                }
            }
            return i8;
        }
    }

    @C8579l
    /* renamed from: h */
    public static /* synthetic */ void m29542h() {
    }

    @C8579l
    /* renamed from: h0 */
    public static /* synthetic */ void m29543h0() {
    }

    /* renamed from: o1 */
    public static final int m29544o1(C8701z1 z1Var) {
        int i;
        int Y = z1Var.mo16940Y();
        int Z = z1Var.mo16942Z();
        while (Z >= 0 && !z1Var.mo16984u0(Z)) {
            Z = z1Var.mo16911J0(Z);
        }
        int i2 = Z + 1;
        int i3 = 0;
        while (i2 < Y) {
            if (z1Var.mo16967m0(Y, i2)) {
                if (z1Var.mo16984u0(i2)) {
                    i3 = 0;
                }
                i2++;
            } else {
                if (z1Var.mo16984u0(i2)) {
                    i = 1;
                } else {
                    i = z1Var.mo16907H0(i2);
                }
                i3 += i;
                i2 += z1Var.mo16959i0(i2);
            }
        }
        return i3;
    }

    /* renamed from: p1 */
    public static final int m29545p1(C8701z1 z1Var, C8412c cVar, C8428d<Object> dVar) {
        boolean z;
        int D = z1Var.mo16898D(cVar);
        boolean z2 = true;
        if (z1Var.mo16940Y() < D) {
            z = true;
        } else {
            z = false;
        }
        ComposerKt.m29833q0(z);
        m29546q1(z1Var, dVar, D);
        int o1 = m29544o1(z1Var);
        while (z1Var.mo16940Y() < D) {
            if (z1Var.mo16965l0(D)) {
                if (z1Var.mo16981t0()) {
                    dVar.mo15323i(z1Var.mo16903F0(z1Var.mo16940Y()));
                    o1 = 0;
                }
                z1Var.mo16958h1();
            } else {
                o1 += z1Var.mo16945a1();
            }
        }
        if (z1Var.mo16940Y() != D) {
            z2 = false;
        }
        ComposerKt.m29833q0(z2);
        return o1;
    }

    /* renamed from: q1 */
    public static final void m29546q1(C8701z1 z1Var, C8428d<Object> dVar, int i) {
        while (!z1Var.mo16969n0(i)) {
            z1Var.mo16947b1();
            if (z1Var.mo16984u0(z1Var.mo16942Z())) {
                dVar.mo15324k();
            }
            z1Var.mo16926R();
        }
    }

    /* renamed from: A */
    public void mo14888A() {
        mo14895C2();
        if (!mo14997l()) {
            Object l1 = mo14999l1(this.f22576I);
            mo14923N1(l1);
            if (this.f22621z && (l1 instanceof C8584m)) {
                mo14917L1(ComposerImpl$useNode$2.f22630f);
                return;
            }
            return;
        }
        ComposerKt.m29774A("useNode() called while inserting".toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: A1 */
    public final void mo14889A1() {
        if (this.f22587T.mo16237d()) {
            mo14891B1(this.f22587T.mo16242i());
            this.f22587T.mo16234a();
        }
    }

    @C11532s0
    /* renamed from: A2 */
    public final void mo14890A2(@C12580l Object obj) {
        if (mo14997l()) {
            this.f22578K.mo16970n1(obj);
            if (obj instanceof C8616s1) {
                mo14914K1(new ComposerImpl$updateValue$1(obj));
                this.f22600e.add(obj);
                return;
            }
            return;
        }
        int v = this.f22576I.mo16826v() - 1;
        if (obj instanceof C8616s1) {
            this.f22600e.add(obj);
        }
        mo14955Y1(true, new ComposerImpl$updateValue$2(obj, v));
    }

    /* renamed from: B1 */
    public final void mo14891B1(Object[] objArr) {
        mo14914K1(new ComposerImpl$realizeDowns$1(objArr));
    }

    /* renamed from: B2 */
    public final int mo14892B2(int i) {
        int i2;
        Integer num;
        if (i < 0) {
            HashMap<Integer, Integer> hashMap = this.f22611p;
            if (hashMap == null || (num = hashMap.get(Integer.valueOf(i))) == null) {
                return 0;
            }
            return num.intValue();
        }
        int[] iArr = this.f22610o;
        if (iArr == null || (i2 = iArr[i]) < 0) {
            return this.f22576I.mo16795T(i);
        }
        return i2;
    }

    /* renamed from: C */
    public void mo14893C(@C12580l Object obj) {
        mo14890A2(obj);
    }

    /* renamed from: C1 */
    public final void mo14894C1() {
        int i = this.f22598c0;
        this.f22598c0 = 0;
        if (i > 0) {
            int i2 = this.f22593Z;
            if (i2 >= 0) {
                this.f22593Z = -1;
                mo14917L1(new ComposerImpl$realizeMovement$1(i2, i));
                return;
            }
            int i3 = this.f22594a0;
            this.f22594a0 = -1;
            int i4 = this.f22596b0;
            this.f22596b0 = -1;
            mo14917L1(new ComposerImpl$realizeMovement$2(i3, i4, i));
        }
    }

    /* renamed from: C2 */
    public final void mo14895C2() {
        if (this.f22614s) {
            this.f22614s = false;
        } else {
            ComposerKt.m29774A("A call to createNode(), emitNode() or useNode() expected was not expected".toString());
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: D */
    public void mo14896D() {
        mo14948W0(true);
    }

    /* renamed from: D1 */
    public final void mo14897D1(boolean z) {
        int i;
        boolean z2;
        if (z) {
            i = this.f22576I.mo16829y();
        } else {
            i = this.f22576I.mo16817n();
        }
        int i2 = i - this.f22588U;
        if (i2 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            ComposerKt.m29774A("Tried to seek backward".toString());
            throw new KotlinNothingValueException();
        } else if (i2 > 0) {
            mo14914K1(new ComposerImpl$realizeOperationLocation$2(i2));
            this.f22588U = i;
        }
    }

    /* renamed from: D2 */
    public final void mo14898D2() {
        if (!(!this.f22614s)) {
            ComposerKt.m29774A("A call to createNode(), emitNode() or useNode() expected".toString());
            throw new KotlinNothingValueException();
        }
    }

    @C8579l
    /* renamed from: E */
    public void mo14899E() {
        mo14951X0();
        RecomposeScopeImpl g1 = mo14982g1();
        if (g1 != null && g1.mo15215r()) {
            g1.mo15195B(true);
        }
    }

    /* renamed from: E2 */
    public final void mo14900E2() {
        this.f22577J.mo16845O0();
    }

    /* renamed from: F1 */
    public final void mo14901F1() {
        int i = this.f22586S;
        if (i > 0) {
            this.f22586S = 0;
            mo14914K1(new ComposerImpl$realizeUps$1(i));
        }
    }

    /* renamed from: F2 */
    public final <R> R mo14902F2(List<C11305q<C8428d<?>, C8701z1, C8608r1, C11079d2>> list, C11289a<? extends R> aVar) {
        List s0 = this.f22601f;
        try {
            this.f22601f = list;
            return aVar.invoke();
        } finally {
            C11322b0.m43481d(1);
            this.f22601f = s0;
            C11322b0.m43480c(1);
        }
    }

    @C8595o0
    /* renamed from: G */
    public void mo14903G(@C12579k C8691w0<?> w0Var, @C12580l Object obj) {
        Intrinsics.checkNotNullParameter(w0Var, "value");
        mo15021s1(w0Var, mo14934R0(), obj, false);
    }

    /* renamed from: G1 */
    public final boolean mo14904G1(@C12579k C8418c<RecomposeScopeImpl, C8419d<Object>> cVar) {
        Intrinsics.checkNotNullParameter(cVar, "invalidationsRequested");
        if (!this.f22601f.isEmpty()) {
            ComposerKt.m29774A("Expected applyChanges() to have been called".toString());
            throw new KotlinNothingValueException();
        } else if (!cVar.mo15367k() && !(!this.f22615t.isEmpty()) && !this.f22613r) {
            return false;
        } else {
            mo14942U0(cVar, (C11304p<? super C8592o, ? super Integer, C11079d2>) null);
            return !this.f22601f.isEmpty();
        }
    }

    /* renamed from: G2 */
    public final <R> R mo14905G2(C8689v1 v1Var, C11289a<? extends R> aVar) {
        C8689v1 y0 = this.f22576I;
        int[] v0 = this.f22610o;
        this.f22610o = null;
        try {
            this.f22576I = v1Var;
            return aVar.invoke();
        } finally {
            C11322b0.m43481d(1);
            this.f22576I = y0;
            this.f22610o = v0;
            C11322b0.m43480c(1);
        }
    }

    /* renamed from: H */
    public void mo14906H() {
        this.f22572E = false;
    }

    /* renamed from: H1 */
    public final <R> R mo14907H1(C8696y yVar, C8696y yVar2, Integer num, List<Pair<RecomposeScopeImpl, C8419d<Object>>> list, C11289a<? extends R> aVar) {
        R r;
        int i;
        C8696y yVar3 = yVar;
        boolean z = this.f22590W;
        boolean z2 = this.f22574G;
        int i2 = this.f22606k;
        try {
            this.f22590W = false;
            this.f22574G = true;
            this.f22606k = 0;
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Pair pair = list.get(i3);
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) pair.mo21846a();
                C8419d dVar = (C8419d) pair.mo21847b();
                if (dVar != null) {
                    int size2 = dVar.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        mo15019r2(recomposeScopeImpl, dVar.get(i4));
                    }
                } else {
                    mo15019r2(recomposeScopeImpl, (Object) null);
                }
            }
            if (yVar3 != null) {
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = -1;
                }
                r = yVar.mo16357e(yVar2, i, aVar);
                if (r == null) {
                }
                return r;
            }
            C11289a<? extends R> aVar2 = aVar;
            r = aVar.invoke();
            return r;
        } finally {
            this.f22590W = z;
            this.f22574G = z2;
            this.f22606k = i2;
        }
    }

    /* renamed from: I */
    public void mo14908I(@C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "effect");
        mo14914K1(new ComposerImpl$recordSideEffect$1(aVar));
    }

    /* renamed from: J */
    public void mo14909J() {
        this.f22612q = true;
    }

    /* renamed from: J0 */
    public final void mo14910J0() {
        RecomposeScopeImpl recomposeScopeImpl;
        boolean z;
        if (mo14997l()) {
            C8696y d0 = mo14969d0();
            Intrinsics.checkNotNull(d0, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            RecomposeScopeImpl recomposeScopeImpl2 = new RecomposeScopeImpl((C8613s) d0);
            this.f22573F.mo16241h(recomposeScopeImpl2);
            mo14890A2(recomposeScopeImpl2);
            recomposeScopeImpl2.mo15201H(this.f22571D);
            return;
        }
        C8603q0 s = ComposerKt.m29829o0(this.f22615t, this.f22576I.mo16829y());
        Object Q = this.f22576I.mo16792Q();
        if (Intrinsics.areEqual(Q, C8592o.f23032a.mo16277a())) {
            C8696y d02 = mo14969d0();
            Intrinsics.checkNotNull(d02, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            recomposeScopeImpl = new RecomposeScopeImpl((C8613s) d02);
            mo14890A2(recomposeScopeImpl);
        } else {
            Intrinsics.checkNotNull(Q, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
            recomposeScopeImpl = (RecomposeScopeImpl) Q;
        }
        if (s != null) {
            z = true;
        } else {
            z = false;
        }
        recomposeScopeImpl.mo15197D(z);
        this.f22573F.mo16241h(recomposeScopeImpl);
        recomposeScopeImpl.mo15201H(this.f22571D);
    }

    /* renamed from: J1 */
    public final void mo14911J1() {
        boolean z = this.f22574G;
        this.f22574G = true;
        int y = this.f22576I.mo16829y();
        int K = this.f22576I.mo16786K(y) + y;
        int i = this.f22606k;
        int i0 = mo14986i0();
        int i2 = this.f22608m;
        C8603q0 f = ComposerKt.m29781H(this.f22615t, this.f22576I.mo16817n(), K);
        boolean z2 = false;
        int i3 = y;
        while (f != null) {
            int b = f.mo16291b();
            C8603q0 unused = ComposerKt.m29829o0(this.f22615t, b);
            if (f.mo16293d()) {
                this.f22576I.mo16799X(b);
                int n = this.f22576I.mo16817n();
                mo14963b2(i3, n, y);
                this.f22606k = mo15035x1(b, n, y, i);
                this.f22585R = mo14928P0(this.f22576I.mo16797V(n), y, i0);
                this.f22580M = null;
                f.mo16292c().mo15204h(this);
                this.f22580M = null;
                this.f22576I.mo16800Y(y);
                i3 = n;
                z2 = true;
            } else {
                this.f22573F.mo16241h(f.mo16292c());
                f.mo16292c().mo15222y();
                this.f22573F.mo16240g();
            }
            f = ComposerKt.m29781H(this.f22615t, this.f22576I.mo16817n(), K);
        }
        if (z2) {
            mo14963b2(i3, y, y);
            this.f22576I.mo16803a0();
            int B2 = mo14892B2(y);
            this.f22606k = i + B2;
            this.f22608m = i2 + B2;
        } else {
            mo15000l2();
        }
        this.f22585R = i0;
        this.f22574G = z;
    }

    @C12580l
    /* renamed from: K */
    public C8586m1 mo14912K() {
        return mo14982g1();
    }

    @C8579l
    /* renamed from: K0 */
    public final <T> T mo14913K0(boolean z, @C12579k C11289a<? extends T> aVar) {
        Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
        T v1 = mo15030v1();
        if (v1 != C8592o.f23032a.mo16277a() && !z) {
            return v1;
        }
        T invoke = aVar.invoke();
        mo14890A2(invoke);
        return invoke;
    }

    /* renamed from: K1 */
    public final void mo14914K1(C11305q<? super C8428d<?>, ? super C8701z1, ? super C8608r1, C11079d2> qVar) {
        this.f22601f.add(qVar);
    }

    /* renamed from: L */
    public void mo14915L() {
        if (this.f22621z && this.f22576I.mo16829y() == this.f22568A) {
            this.f22568A = -1;
            this.f22621z = false;
        }
        mo14948W0(false);
    }

    /* renamed from: L0 */
    public final void mo14916L0() {
        this.f22618w.mo15425a();
    }

    /* renamed from: L1 */
    public final void mo14917L1(C11305q<? super C8428d<?>, ? super C8701z1, ? super C8608r1, C11079d2> qVar) {
        mo14901F1();
        mo14889A1();
        mo14914K1(qVar);
    }

    @C8579l
    /* renamed from: M */
    public void mo14918M(int i) {
        mo15004m2(i, (Object) null, C8575k0.f23011b.mo16249a(), (Object) null);
    }

    /* renamed from: M0 */
    public final void mo14919M0() {
        this.f22605j = null;
        this.f22606k = 0;
        this.f22608m = 0;
        this.f22588U = 0;
        this.f22585R = 0;
        this.f22614s = false;
        this.f22589V = false;
        this.f22591X.mo16266a();
        this.f22573F.mo16234a();
        mo14922N0();
    }

    /* renamed from: M1 */
    public final void mo14920M1() {
        mo14979f2(this.f22576I.mo16817n());
        mo14952X1(ComposerKt.f22632b);
        this.f22588U += this.f22576I.mo16823t();
    }

    @C12580l
    /* renamed from: N */
    public Object mo14921N() {
        return mo15030v1();
    }

    /* renamed from: N0 */
    public final void mo14922N0() {
        this.f22610o = null;
        this.f22611p = null;
    }

    /* renamed from: N1 */
    public final void mo14923N1(Object obj) {
        this.f22587T.mo16241h(obj);
    }

    @C12579k
    /* renamed from: O */
    public C8679a mo14924O() {
        return this.f22599d;
    }

    /* renamed from: O0 */
    public final void mo14925O0(@C12579k C8418c<RecomposeScopeImpl, C8419d<Object>> cVar, @C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(cVar, "invalidationsRequested");
        Intrinsics.checkNotNullParameter(pVar, "content");
        if (this.f22601f.isEmpty()) {
            mo14942U0(cVar, pVar);
        } else {
            ComposerKt.m29774A("Expected applyChanges() to have been called".toString());
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: O1 */
    public final void mo14926O1() {
        boolean z;
        int y = this.f22576I.mo16829y();
        if (this.f22591X.mo16273h(-1) <= y) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            ComposerKt.m29774A("Missed recording an endGroup".toString());
            throw new KotlinNothingValueException();
        } else if (this.f22591X.mo16273h(-1) == y) {
            this.f22591X.mo16274i();
            m29539Z1(this, false, ComposerKt.f22634d, 1, (Object) null);
        }
    }

    @C8579l
    /* renamed from: P */
    public boolean mo14927P(@C12580l Object obj) {
        if (mo15030v1() == obj) {
            return false;
        }
        mo14890A2(obj);
        return true;
    }

    /* renamed from: P0 */
    public final int mo14928P0(int i, int i2, int i3) {
        if (i == i2) {
            return i3;
        }
        int m1 = mo15003m1(this.f22576I, i);
        if (m1 == 126665345) {
            return m1;
        }
        return Integer.rotateLeft(mo14928P0(this.f22576I.mo16797V(i), i2, i3), 3) ^ m1;
    }

    /* renamed from: P1 */
    public final void mo14929P1() {
        if (this.f22589V) {
            m29539Z1(this, false, ComposerKt.f22634d, 1, (Object) null);
            this.f22589V = false;
        }
    }

    @C8579l
    /* renamed from: Q */
    public void mo14930Q() {
        mo15004m2(ComposerKt.f22639i, (Object) null, C8575k0.f23011b.mo16249a(), (Object) null);
    }

    /* renamed from: Q0 */
    public final void mo14931Q0() {
        ComposerKt.m29833q0(this.f22578K.mo16938X());
        C8692w1 w1Var = new C8692w1();
        this.f22577J = w1Var;
        C8701z1 G0 = w1Var.mo16837G0();
        G0.mo16908I();
        this.f22578K = G0;
    }

    /* renamed from: Q1 */
    public final void mo14932Q1(C11305q<? super C8428d<?>, ? super C8701z1, ? super C8608r1, C11079d2> qVar) {
        this.f22583P.add(qVar);
    }

    @C8579l
    /* renamed from: R */
    public void mo14933R(int i, @C12580l Object obj) {
        mo15004m2(i, obj, C8575k0.f23011b.mo16249a(), (Object) null);
    }

    /* renamed from: R0 */
    public final C8452h<C8682u<Object>, C8578k2<Object>> mo14934R0() {
        C8452h<C8682u<Object>, ? extends C8578k2<? extends Object>> hVar = this.f22580M;
        if (hVar != null) {
            return hVar;
        }
        return mo14936S0(this.f22576I.mo16829y());
    }

    /* renamed from: R1 */
    public final void mo14935R1(C8412c cVar) {
        if (this.f22583P.isEmpty()) {
            mo14952X1(new ComposerImpl$recordInsert$1(this.f22577J, cVar));
            return;
        }
        List T5 = CollectionsKt___CollectionsKt.m40572T5(this.f22583P);
        this.f22583P.clear();
        mo14901F1();
        mo14889A1();
        mo14952X1(new ComposerImpl$recordInsert$2(this.f22577J, cVar, T5));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: androidx.compose.runtime.external.kotlinx.collections.immutable.h<androidx.compose.runtime.u<java.lang.Object>, ? extends androidx.compose.runtime.k2<? extends java.lang.Object>>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: S0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.C8452h<androidx.compose.runtime.C8682u<java.lang.Object>, androidx.compose.runtime.C8578k2<java.lang.Object>> mo14936S0(int r6) {
        /*
            r5 = this;
            boolean r0 = r5.mo14997l()
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }"
            r2 = 202(0xca, float:2.83E-43)
            if (r0 == 0) goto L_0x0043
            boolean r0 = r5.f22579L
            if (r0 == 0) goto L_0x0043
            androidx.compose.runtime.z1 r0 = r5.f22578K
            int r0 = r0.mo16942Z()
        L_0x0014:
            if (r0 <= 0) goto L_0x0043
            androidx.compose.runtime.z1 r3 = r5.f22578K
            int r3 = r3.mo16955g0(r0)
            if (r3 != r2) goto L_0x003c
            androidx.compose.runtime.z1 r3 = r5.f22578K
            java.lang.Object r3 = r3.mo16957h0(r0)
            java.lang.Object r4 = androidx.compose.runtime.ComposerKt.m29782I()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r3 == 0) goto L_0x003c
            androidx.compose.runtime.z1 r6 = r5.f22578K
            java.lang.Object r6 = r6.mo16951e0(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6, r1)
            androidx.compose.runtime.external.kotlinx.collections.immutable.h r6 = (androidx.compose.runtime.external.kotlinx.collections.immutable.C8452h) r6
            r5.f22580M = r6
            return r6
        L_0x003c:
            androidx.compose.runtime.z1 r3 = r5.f22578K
            int r0 = r3.mo16911J0(r0)
            goto L_0x0014
        L_0x0043:
            androidx.compose.runtime.v1 r0 = r5.f22576I
            int r0 = r0.mo16776A()
            if (r0 <= 0) goto L_0x0085
        L_0x004b:
            if (r6 <= 0) goto L_0x0085
            androidx.compose.runtime.v1 r0 = r5.f22576I
            int r0 = r0.mo16783H(r6)
            if (r0 != r2) goto L_0x007e
            androidx.compose.runtime.v1 r0 = r5.f22576I
            java.lang.Object r0 = r0.mo16785J(r6)
            java.lang.Object r3 = androidx.compose.runtime.ComposerKt.m29782I()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r3)
            if (r0 == 0) goto L_0x007e
            androidx.compose.runtime.collection.f<androidx.compose.runtime.external.kotlinx.collections.immutable.h<androidx.compose.runtime.u<java.lang.Object>, androidx.compose.runtime.k2<java.lang.Object>>> r0 = r5.f22618w
            java.lang.Object r0 = r0.mo15427c(r6)
            androidx.compose.runtime.external.kotlinx.collections.immutable.h r0 = (androidx.compose.runtime.external.kotlinx.collections.immutable.C8452h) r0
            if (r0 != 0) goto L_0x007b
            androidx.compose.runtime.v1 r0 = r5.f22576I
            java.lang.Object r6 = r0.mo16779D(r6)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6, r1)
            r0 = r6
            androidx.compose.runtime.external.kotlinx.collections.immutable.h r0 = (androidx.compose.runtime.external.kotlinx.collections.immutable.C8452h) r0
        L_0x007b:
            r5.f22580M = r0
            return r0
        L_0x007e:
            androidx.compose.runtime.v1 r0 = r5.f22576I
            int r6 = r0.mo16797V(r6)
            goto L_0x004b
        L_0x0085:
            androidx.compose.runtime.external.kotlinx.collections.immutable.h<androidx.compose.runtime.u<java.lang.Object>, ? extends androidx.compose.runtime.k2<? extends java.lang.Object>> r6 = r5.f22617v
            r5.f22580M = r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.mo14936S0(int):androidx.compose.runtime.external.kotlinx.collections.immutable.h");
    }

    /* renamed from: S1 */
    public final void mo14937S1(C11305q<? super C8428d<?>, ? super C8701z1, ? super C8608r1, C11079d2> qVar) {
        this.f22592Y.mo16241h(qVar);
    }

    /* renamed from: T */
    public void mo14938T() {
        mo15004m2(125, (Object) null, C8575k0.f23011b.mo16251c(), (Object) null);
        this.f22614s = true;
    }

    /* renamed from: T0 */
    public final void mo14939T0() {
        C8601p2 p2Var = C8601p2.f23036a;
        Object a = p2Var.mo16288a("Compose:Composer.dispose");
        try {
            this.f22597c.mo15062r(this);
            this.f22573F.mo16234a();
            this.f22615t.clear();
            this.f22601f.clear();
            this.f22618w.mo15425a();
            mo15017r().clear();
            this.f22575H = true;
            C11079d2 d2Var = C11079d2.f28267a;
            p2Var.mo16289b(a);
        } catch (Throwable th) {
            C8601p2.f23036a.mo16289b(a);
            throw th;
        }
    }

    /* renamed from: T1 */
    public final void mo14940T1(int i, int i2, int i3) {
        if (i3 > 0) {
            int i4 = this.f22598c0;
            if (i4 > 0 && this.f22594a0 == i - i4 && this.f22596b0 == i2 - i4) {
                this.f22598c0 = i4 + i3;
                return;
            }
            mo14894C1();
            this.f22594a0 = i;
            this.f22596b0 = i2;
            this.f22598c0 = i3;
        }
    }

    /* renamed from: U */
    public void mo14941U() {
        this.f22621z = false;
    }

    /* renamed from: U0 */
    public final void mo14942U0(C8418c<RecomposeScopeImpl, C8419d<Object>> cVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar) {
        if (!this.f22574G) {
            Object a = C8601p2.f23036a.mo16288a("Compose:recompose");
            try {
                C8646f D = SnapshotKt.m31446D();
                this.f22570C = D;
                this.f22571D = D.mo16599g();
                this.f22618w.mo15425a();
                int h = cVar.mo15364h();
                int i = 0;
                while (i < h) {
                    Object obj = cVar.mo15363g()[i];
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                    C8419d dVar = (C8419d) cVar.mo15365i()[i];
                    RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj;
                    C8412c j = recomposeScopeImpl.mo15207j();
                    if (j != null) {
                        this.f22615t.add(new C8603q0(recomposeScopeImpl, j.mo15338a(), dVar));
                        i++;
                    } else {
                        C8601p2.f23036a.mo16289b(a);
                        return;
                    }
                }
                List<C8603q0> list = this.f22615t;
                if (list.size() > 1) {
                    C10992w.m42338m0(list, new C8383c());
                }
                this.f22606k = 0;
                this.f22574G = true;
                mo15016q2();
                Object v1 = mo15030v1();
                if (!(v1 == pVar || pVar == null)) {
                    mo14890A2(pVar);
                }
                C8415c2.m30244m(new ComposerImpl$doCompose$2$3(this), new ComposerImpl$doCompose$2$4(this), new ComposerImpl$doCompose$2$5(pVar, this, v1));
                mo14954Y0();
                this.f22574G = false;
                this.f22615t.clear();
                C11079d2 d2Var = C11079d2.f28267a;
                C8601p2.f23036a.mo16289b(a);
            } catch (Throwable th) {
                C8601p2.f23036a.mo16289b(a);
                throw th;
            }
        } else {
            ComposerKt.m29774A("Reentrant composition is not supported".toString());
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: U1 */
    public final void mo14943U1(int i) {
        this.f22588U = i - (this.f22576I.mo16817n() - this.f22588U);
    }

    /* renamed from: V */
    public void mo14944V(int i, @C12580l Object obj) {
        if (this.f22576I.mo16820q() == i && !Intrinsics.areEqual(this.f22576I.mo16818o(), obj) && this.f22568A < 0) {
            this.f22568A = this.f22576I.mo16817n();
            this.f22621z = true;
        }
        mo15004m2(i, (Object) null, C8575k0.f23011b.mo16249a(), obj);
    }

    /* renamed from: V0 */
    public final void mo14945V0(int i, int i2) {
        if (i > 0 && i != i2) {
            mo14945V0(this.f22576I.mo16797V(i), i2);
            if (this.f22576I.mo16791P(i)) {
                mo14923N1(mo15033w1(this.f22576I, i));
            }
        }
    }

    /* renamed from: V1 */
    public final void mo14946V1(int i, int i2) {
        boolean z;
        if (i2 > 0) {
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                ComposerKt.m29774A(("Invalid remove index " + i).toString());
                throw new KotlinNothingValueException();
            } else if (this.f22593Z == i) {
                this.f22598c0 += i2;
            } else {
                mo14894C1();
                this.f22593Z = i;
                this.f22598c0 = i2;
            }
        }
    }

    /* renamed from: W */
    public <T> void mo14947W(@C12579k C11289a<? extends T> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "factory");
        mo14895C2();
        if (mo14997l()) {
            int f = this.f22607l.mo16271f();
            C8701z1 z1Var = this.f22578K;
            C8412c B = z1Var.mo16895B(z1Var.mo16942Z());
            this.f22608m++;
            mo14932Q1(new ComposerImpl$createNode$2(aVar, B, f));
            mo14937S1(new ComposerImpl$createNode$3(B, f));
            return;
        }
        ComposerKt.m29774A("createNode() can only be called when inserting".toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: W0 */
    public final void mo14948W0(boolean z) {
        List<C8615s0> list;
        if (mo14997l()) {
            int Z = this.f22578K.mo16942Z();
            mo15031v2(this.f22578K.mo16955g0(Z), this.f22578K.mo16957h0(Z), this.f22578K.mo16951e0(Z));
        } else {
            int y = this.f22576I.mo16829y();
            mo15031v2(this.f22576I.mo16783H(y), this.f22576I.mo16785J(y), this.f22576I.mo16779D(y));
        }
        int i = this.f22608m;
        Pending pending = this.f22605j;
        int i2 = 0;
        if (pending != null && pending.mo15174b().size() > 0) {
            List<C8615s0> b = pending.mo15174b();
            List<C8615s0> f = pending.mo15178f();
            Set<T> n = C8634a.m31600n(f);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = f.size();
            int size2 = b.size();
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < size2) {
                C8615s0 s0Var = b.get(i3);
                if (!n.contains(s0Var)) {
                    mo14946V1(pending.mo15179g(s0Var) + pending.mo15177e(), s0Var.mo16381d());
                    pending.mo15186n(s0Var.mo16380c(), i2);
                    mo14943U1(s0Var.mo16380c());
                    this.f22576I.mo16799X(s0Var.mo16380c());
                    mo14920M1();
                    this.f22576I.mo16801Z();
                    ComposerKt.m29831p0(this.f22615t, s0Var.mo16380c(), s0Var.mo16380c() + this.f22576I.mo16786K(s0Var.mo16380c()));
                } else if (!linkedHashSet.contains(s0Var)) {
                    if (i4 < size) {
                        C8615s0 s0Var2 = f.get(i4);
                        if (s0Var2 != s0Var) {
                            int g = pending.mo15179g(s0Var2);
                            linkedHashSet.add(s0Var2);
                            if (g != i5) {
                                int o = pending.mo15187o(s0Var2);
                                list = f;
                                mo14940T1(pending.mo15177e() + g, i5 + pending.mo15177e(), o);
                                pending.mo15182j(g, i5, o);
                            } else {
                                list = f;
                            }
                        } else {
                            list = f;
                            i3++;
                        }
                        i4++;
                        i5 += pending.mo15187o(s0Var2);
                        f = list;
                    }
                    i2 = 0;
                }
                i3++;
                i2 = 0;
            }
            mo14894C1();
            if (b.size() > 0) {
                mo14943U1(this.f22576I.mo16819p());
                this.f22576I.mo16803a0();
            }
        }
        int i6 = this.f22606k;
        while (!this.f22576I.mo16789N()) {
            int n2 = this.f22576I.mo16817n();
            mo14920M1();
            mo14946V1(i6, this.f22576I.mo16801Z());
            ComposerKt.m29831p0(this.f22615t, n2, this.f22576I.mo16817n());
        }
        boolean l = mo14997l();
        if (l) {
            if (z) {
                mo14967c2();
                i = 1;
            }
            this.f22576I.mo16810g();
            int Z2 = this.f22578K.mo16942Z();
            this.f22578K.mo16926R();
            if (!this.f22576I.mo16827w()) {
                int r1 = mo15018r1(Z2);
                this.f22578K.mo16928S();
                this.f22578K.mo16908I();
                mo14935R1(this.f22582O);
                this.f22584Q = false;
                if (!this.f22599d.isEmpty()) {
                    mo15036x2(r1, 0);
                    mo15039y2(r1, i);
                }
            }
        } else {
            if (z) {
                mo14960a2();
            }
            mo14926O1();
            int y2 = this.f22576I.mo16829y();
            if (i != mo14892B2(y2)) {
                mo15039y2(y2, i);
            }
            if (z) {
                i = 1;
            }
            this.f22576I.mo16811h();
            mo14894C1();
        }
        mo14962b1(i, l);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r6.f22576I;
     */
    /* renamed from: W1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14949W1() {
        /*
            r6 = this;
            androidx.compose.runtime.v1 r0 = r6.f22576I
            int r0 = r0.mo16776A()
            if (r0 <= 0) goto L_0x003e
            androidx.compose.runtime.v1 r0 = r6.f22576I
            int r1 = r0.mo16829y()
            androidx.compose.runtime.n0 r2 = r6.f22591X
            r3 = -2
            int r2 = r2.mo16273h(r3)
            if (r2 == r1) goto L_0x003e
            boolean r2 = r6.f22589V
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 != 0) goto L_0x002b
            boolean r2 = r6.f22590W
            if (r2 == 0) goto L_0x002b
            kotlin.jvm.functions.q r2 = androidx.compose.runtime.ComposerKt.f22635e
            m29539Z1(r6, r4, r2, r5, r3)
            r6.f22589V = r5
        L_0x002b:
            if (r1 <= 0) goto L_0x003e
            androidx.compose.runtime.c r0 = r0.mo16802a(r1)
            androidx.compose.runtime.n0 r2 = r6.f22591X
            r2.mo16275j(r1)
            androidx.compose.runtime.ComposerImpl$recordSlotEditing$1 r1 = new androidx.compose.runtime.ComposerImpl$recordSlotEditing$1
            r1.<init>(r0)
            m29539Z1(r6, r4, r1, r5, r3)
        L_0x003e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.mo14949W1():void");
    }

    @C12580l
    /* renamed from: X */
    public Object mo14950X() {
        RecomposeScopeImpl g1 = mo14982g1();
        if (g1 != null) {
            return g1.mo15207j();
        }
        return null;
    }

    /* renamed from: X0 */
    public final void mo14951X0() {
        mo14948W0(false);
    }

    /* renamed from: X1 */
    public final void mo14952X1(C11305q<? super C8428d<?>, ? super C8701z1, ? super C8608r1, C11079d2> qVar) {
        m29532E1(this, false, 1, (Object) null);
        mo14949W1();
        mo14914K1(qVar);
    }

    @C8579l
    /* renamed from: Y */
    public void mo14953Y(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "sourceInformation");
        if (mo14997l() && this.f22572E) {
            this.f22578K.mo16971o0(str);
        }
    }

    /* renamed from: Y0 */
    public final void mo14954Y0() {
        mo14951X0();
        this.f22597c.mo15047c();
        mo14951X0();
        mo14929P1();
        mo14966c1();
        this.f22576I.mo16808e();
        this.f22613r = false;
    }

    /* renamed from: Y1 */
    public final void mo14955Y1(boolean z, C11305q<? super C8428d<?>, ? super C8701z1, ? super C8608r1, C11079d2> qVar) {
        mo14897D1(z);
        mo14914K1(qVar);
    }

    /* renamed from: Z0 */
    public final void mo14956Z0() {
        if (this.f22578K.mo16938X()) {
            C8701z1 G0 = this.f22577J.mo16837G0();
            this.f22578K = G0;
            G0.mo16947b1();
            this.f22579L = false;
            this.f22580M = null;
        }
    }

    /* renamed from: a */
    public int mo14957a() {
        return mo14997l() ? -this.f22578K.mo16942Z() : this.f22576I.mo16829y();
    }

    @C8579l
    /* renamed from: a0 */
    public void mo14958a0() {
        boolean z;
        if (this.f22608m == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            RecomposeScopeImpl g1 = mo14982g1();
            if (g1 != null) {
                g1.mo15223z();
            }
            if (this.f22615t.isEmpty()) {
                mo15000l2();
            } else {
                mo14911J1();
            }
        } else {
            ComposerKt.m29774A("No nodes can be emitted before calling skipAndEndGroup".toString());
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: a1 */
    public final void mo14959a1(boolean z, Pending pending) {
        this.f22604i.mo16241h(this.f22605j);
        this.f22605j = pending;
        this.f22607l.mo16275j(this.f22606k);
        if (z) {
            this.f22606k = 0;
        }
        this.f22609n.mo16275j(this.f22608m);
        this.f22608m = 0;
    }

    /* renamed from: a2 */
    public final void mo14960a2() {
        if (this.f22587T.mo16237d()) {
            this.f22587T.mo16240g();
        } else {
            this.f22586S++;
        }
    }

    @C8579l
    /* renamed from: b */
    public boolean mo14961b(boolean z) {
        Object v1 = mo15030v1();
        if ((v1 instanceof Boolean) && z == ((Boolean) v1).booleanValue()) {
            return false;
        }
        mo14890A2(Boolean.valueOf(z));
        return true;
    }

    /* renamed from: b1 */
    public final void mo14962b1(int i, boolean z) {
        Pending g = this.f22604i.mo16240g();
        if (g != null && !z) {
            g.mo15184l(g.mo15173a() + 1);
        }
        this.f22605j = g;
        this.f22606k = this.f22607l.mo16274i() + i;
        this.f22608m = this.f22609n.mo16274i() + i;
    }

    /* renamed from: b2 */
    public final void mo14963b2(int i, int i2, int i3) {
        C8689v1 v1Var = this.f22576I;
        int p = ComposerKt.m29819j0(v1Var, i, i2, i3);
        while (i > 0 && i != p) {
            if (v1Var.mo16791P(i)) {
                mo14960a2();
            }
            i = v1Var.mo16797V(i);
        }
        mo14945V0(i2, p);
    }

    @C8579l
    /* renamed from: c */
    public boolean mo14964c(short s) {
        Object v1 = mo15030v1();
        if ((v1 instanceof Short) && s == ((Number) v1).shortValue()) {
            return false;
        }
        mo14890A2(Short.valueOf(s));
        return true;
    }

    @C8579l
    /* renamed from: c0 */
    public void mo14965c0(int i, @C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "sourceInformation");
        if (this.f22572E) {
            mo15004m2(i, (Object) null, C8575k0.f23011b.mo16249a(), str);
        }
    }

    /* renamed from: c1 */
    public final void mo14966c1() {
        mo14901F1();
        if (!this.f22604i.mo16236c()) {
            ComposerKt.m29774A("Start/end imbalance".toString());
            throw new KotlinNothingValueException();
        } else if (this.f22591X.mo16269d()) {
            mo14919M0();
        } else {
            ComposerKt.m29774A("Missed recording an endGroup()".toString());
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: c2 */
    public final void mo14967c2() {
        this.f22583P.add(this.f22592Y.mo16240g());
    }

    @C8579l
    /* renamed from: d */
    public boolean mo14968d(float f) {
        boolean z;
        Object v1 = mo15030v1();
        if (v1 instanceof Float) {
            if (f == ((Number) v1).floatValue()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return false;
            }
        }
        mo14890A2(Float.valueOf(f));
        return true;
    }

    @C12579k
    /* renamed from: d0 */
    public C8696y mo14969d0() {
        return this.f22603h;
    }

    /* renamed from: d1 */
    public final boolean mo14970d1() {
        if (this.f22612q) {
            return false;
        }
        this.f22612q = true;
        this.f22613r = true;
        return true;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: d2 */
    public final void mo14971d2(C8697y0 y0Var, C8701z1 z1Var) {
        C8692w1 w1Var = new C8692w1();
        C8701z1 G0 = w1Var.mo16837G0();
        try {
            G0.mo16904G();
            G0.mo16962j1(MovableContentKt.f22686a, y0Var.mo16878c());
            C8701z1.m32164x0(G0, 0, 1, (Object) null);
            G0.mo16970n1(y0Var.mo16881f());
            z1Var.mo16901E0(y0Var.mo16876a(), 1, G0);
            G0.mo16945a1();
            G0.mo16926R();
            G0.mo16928S();
            C11079d2 d2Var = C11079d2.f28267a;
            G0.mo16908I();
            this.f22597c.mo15056l(y0Var, new C8694x0(w1Var));
        } catch (Throwable th) {
            G0.mo16908I();
            throw th;
        }
    }

    /* renamed from: e */
    public void mo14972e() {
        this.f22621z = this.f22568A >= 0;
    }

    @C8595o0
    /* renamed from: e0 */
    public void mo14973e0() {
        mo14951X0();
        mo14951X0();
        this.f22619x = ComposerKt.m29842v(this.f22620y.mo16274i());
        this.f22580M = null;
    }

    /* renamed from: e1 */
    public final boolean mo14974e1() {
        return this.f22569B > 0;
    }

    /* renamed from: e2 */
    public final void mo14975e2() {
        List s0;
        if (this.f22599d.mo16853i0()) {
            ArrayList arrayList = new ArrayList();
            this.f22581N = arrayList;
            C8689v1 F0 = this.f22599d.mo16836F0();
            try {
                this.f22576I = F0;
                s0 = this.f22601f;
                this.f22601f = arrayList;
                mo14979f2(0);
                mo14901F1();
                if (this.f22589V) {
                    mo14914K1(ComposerKt.f22633c);
                    mo14929P1();
                }
                C11079d2 d2Var = C11079d2.f28267a;
                this.f22601f = s0;
                F0.mo16808e();
            } catch (Throwable th) {
                F0.mo16808e();
                throw th;
            }
        }
    }

    @C8579l
    /* renamed from: f */
    public boolean mo14976f(int i) {
        Object v1 = mo15030v1();
        if ((v1 instanceof Integer) && i == ((Number) v1).intValue()) {
            return false;
        }
        mo14890A2(Integer.valueOf(i));
        return true;
    }

    /* renamed from: f0 */
    public boolean mo14977f0() {
        if (this.f22619x) {
            return true;
        }
        RecomposeScopeImpl g1 = mo14982g1();
        return g1 != null && g1.mo15211n();
    }

    /* renamed from: f1 */
    public final int mo14978f1() {
        return this.f22601f.size();
    }

    /* renamed from: f2 */
    public final void mo14979f2(int i) {
        m29541g2(this, i, false, 0);
        mo14894C1();
    }

    @C8579l
    /* renamed from: g */
    public boolean mo14980g(long j) {
        Object v1 = mo15030v1();
        if ((v1 instanceof Long) && j == ((Number) v1).longValue()) {
            return false;
        }
        mo14890A2(Long.valueOf(j));
        return true;
    }

    /* renamed from: g0 */
    public void mo14981g0(@C12579k C8586m1 m1Var) {
        RecomposeScopeImpl recomposeScopeImpl;
        Intrinsics.checkNotNullParameter(m1Var, "scope");
        if (m1Var instanceof RecomposeScopeImpl) {
            recomposeScopeImpl = (RecomposeScopeImpl) m1Var;
        } else {
            recomposeScopeImpl = null;
        }
        if (recomposeScopeImpl != null) {
            recomposeScopeImpl.mo15200G(true);
        }
    }

    @C12580l
    /* renamed from: g1 */
    public final RecomposeScopeImpl mo14982g1() {
        C8573j2<RecomposeScopeImpl> j2Var = this.f22573F;
        if (this.f22569B != 0 || !j2Var.mo16237d()) {
            return null;
        }
        return j2Var.mo16238e();
    }

    @C12580l
    /* renamed from: h1 */
    public final List<C11305q<C8428d<?>, C8701z1, C8608r1, C11079d2>> mo14983h1() {
        return this.f22581N;
    }

    /* renamed from: h2 */
    public final <T> T mo14984h2(C8682u<T> uVar, C8452h<C8682u<Object>, ? extends C8578k2<? extends Object>> hVar) {
        if (ComposerKt.m29776C(hVar, uVar)) {
            return ComposerKt.m29809e0(hVar, uVar);
        }
        return uVar.mo16769c().getValue();
    }

    @C8579l
    /* renamed from: i */
    public boolean mo14985i(byte b) {
        Object v1 = mo15030v1();
        if ((v1 instanceof Byte) && b == ((Number) v1).byteValue()) {
            return false;
        }
        mo14890A2(Byte.valueOf(b));
        return true;
    }

    /* renamed from: i0 */
    public int mo14986i0() {
        return this.f22585R;
    }

    /* renamed from: i1 */
    public final boolean mo14987i1() {
        return !this.f22615t.isEmpty();
    }

    /* renamed from: i2 */
    public final void mo14988i2(@C12580l List<C11305q<C8428d<?>, C8701z1, C8608r1, C11079d2>> list) {
        this.f22581N = list;
    }

    @C8579l
    /* renamed from: j */
    public boolean mo14989j(char c) {
        Object v1 = mo15030v1();
        if ((v1 instanceof Character) && c == ((Character) v1).charValue()) {
            return false;
        }
        mo14890A2(Character.valueOf(c));
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: androidx.compose.runtime.ComposerImpl$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* renamed from: j0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.compose.runtime.C8602q mo14990j0() {
        /*
            r4 = this;
            r0 = 206(0xce, float:2.89E-43)
            java.lang.Object r1 = androidx.compose.runtime.ComposerKt.m29801a0()
            r4.mo15010o2(r0, r1)
            boolean r0 = r4.mo14997l()
            r1 = 0
            if (r0 == 0) goto L_0x0017
            androidx.compose.runtime.z1 r0 = r4.f22578K
            r2 = 0
            r3 = 1
            androidx.compose.runtime.C8701z1.m32164x0(r0, r2, r3, r1)
        L_0x0017:
            java.lang.Object r0 = r4.mo15030v1()
            boolean r2 = r0 instanceof androidx.compose.runtime.ComposerImpl.C8381a
            if (r2 == 0) goto L_0x0022
            r1 = r0
            androidx.compose.runtime.ComposerImpl$a r1 = (androidx.compose.runtime.ComposerImpl.C8381a) r1
        L_0x0022:
            if (r1 != 0) goto L_0x0037
            androidx.compose.runtime.ComposerImpl$a r1 = new androidx.compose.runtime.ComposerImpl$a
            androidx.compose.runtime.ComposerImpl$b r0 = new androidx.compose.runtime.ComposerImpl$b
            int r2 = r4.mo14986i0()
            boolean r3 = r4.f22612q
            r0.<init>(r2, r3)
            r1.<init>(r0)
            r4.mo14890A2(r1)
        L_0x0037:
            androidx.compose.runtime.ComposerImpl$b r0 = r1.mo15043a()
            androidx.compose.runtime.external.kotlinx.collections.immutable.h r2 = r4.mo14934R0()
            r0.mo15044A(r2)
            r4.mo14951X0()
            androidx.compose.runtime.ComposerImpl$b r0 = r1.mo15043a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.mo14990j0():androidx.compose.runtime.q");
    }

    /* renamed from: j1 */
    public final boolean mo14991j1() {
        return !this.f22601f.isEmpty();
    }

    /* renamed from: j2 */
    public final void mo14992j2(@C12579k C8692w1 w1Var) {
        Intrinsics.checkNotNullParameter(w1Var, "<set-?>");
        this.f22577J = w1Var;
    }

    @C8579l
    /* renamed from: k */
    public boolean mo14993k(double d) {
        boolean z;
        Object v1 = mo15030v1();
        if (v1 instanceof Double) {
            if (d == ((Number) v1).doubleValue()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return false;
            }
        }
        mo14890A2(Double.valueOf(d));
        return true;
    }

    @C8579l
    /* renamed from: k0 */
    public void mo14994k0() {
        if (this.f22572E) {
            mo14948W0(false);
        }
    }

    @C12579k
    /* renamed from: k1 */
    public final C8692w1 mo14995k1() {
        return this.f22577J;
    }

    /* renamed from: k2 */
    public final void mo14996k2() {
        this.f22608m += this.f22576I.mo16801Z();
    }

    /* renamed from: l */
    public boolean mo14997l() {
        return this.f22584Q;
    }

    @C8579l
    /* renamed from: l0 */
    public void mo14998l0() {
        mo14951X0();
    }

    /* renamed from: l1 */
    public final Object mo14999l1(C8689v1 v1Var) {
        return v1Var.mo16793R(v1Var.mo16829y());
    }

    /* renamed from: l2 */
    public final void mo15000l2() {
        this.f22608m = this.f22576I.mo16830z();
        this.f22576I.mo16803a0();
    }

    @C8579l
    /* renamed from: m */
    public void mo15001m(boolean z) {
        boolean z2;
        if (this.f22608m == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            ComposerKt.m29774A("No nodes can be emitted before calling dactivateToEndGroup".toString());
            throw new KotlinNothingValueException();
        } else if (mo14997l()) {
        } else {
            if (!z) {
                mo15000l2();
                return;
            }
            int n = this.f22576I.mo16817n();
            int m = this.f22576I.mo16816m();
            for (int i = n; i < m; i++) {
                if (this.f22576I.mo16791P(i)) {
                    Object R = this.f22576I.mo16793R(i);
                    if (R instanceof C8584m) {
                        mo14914K1(new ComposerImpl$deactivateToEndGroup$2(R));
                    }
                }
                this.f22576I.mo16813j(i, new ComposerImpl$deactivateToEndGroup$3(this, i));
            }
            ComposerKt.m29831p0(this.f22615t, n, m);
            this.f22576I.mo16799X(n);
            this.f22576I.mo16803a0();
        }
    }

    @C8579l
    /* renamed from: m0 */
    public void mo15002m0() {
        mo14951X0();
    }

    /* renamed from: m1 */
    public final int mo15003m1(C8689v1 v1Var, int i) {
        Object D;
        if (v1Var.mo16788M(i)) {
            Object J = v1Var.mo16785J(i);
            if (J == null) {
                return 0;
            }
            if (J instanceof Enum) {
                return ((Enum) J).ordinal();
            }
            if (J instanceof C8691w0) {
                return MovableContentKt.f22686a;
            }
            return J.hashCode();
        }
        int H = v1Var.mo16783H(i);
        if (H == 207 && (D = v1Var.mo16779D(i)) != null && !Intrinsics.areEqual(D, C8592o.f23032a.mo16277a())) {
            H = D.hashCode();
        }
        return H;
    }

    /* renamed from: m2 */
    public final void mo15004m2(int i, Object obj, int i2, Object obj2) {
        boolean z;
        boolean z2;
        boolean z3;
        int i3 = i;
        Object obj3 = obj;
        int i4 = i2;
        Object obj4 = obj2;
        mo14898D2();
        mo15025t2(i, obj, obj4);
        C8575k0.C8576a aVar = C8575k0.f23011b;
        int i5 = 0;
        if (i4 != aVar.mo16249a()) {
            z = true;
        } else {
            z = false;
        }
        Pending pending = null;
        if (mo14997l()) {
            this.f22576I.mo16807d();
            int Y = this.f22578K.mo16940Y();
            if (z) {
                this.f22578K.mo16966l1(i, C8592o.f23032a.mo16277a());
            } else if (obj4 != null) {
                C8701z1 z1Var = this.f22578K;
                if (obj3 == null) {
                    obj3 = C8592o.f23032a.mo16277a();
                }
                z1Var.mo16956g1(i, obj3, obj4);
            } else {
                C8701z1 z1Var2 = this.f22578K;
                if (obj3 == null) {
                    obj3 = C8592o.f23032a.mo16277a();
                }
                z1Var2.mo16962j1(i, obj3);
            }
            Pending pending2 = this.f22605j;
            if (pending2 != null) {
                C8615s0 s0Var = new C8615s0(i, -1, mo15018r1(Y), -1, 0);
                pending2.mo15181i(s0Var, this.f22606k - pending2.mo15177e());
                pending2.mo15180h(s0Var);
            }
            mo14959a1(z, (Pending) null);
            return;
        }
        if (i4 != aVar.mo16250b()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 || !this.f22621z) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (this.f22605j == null) {
            int q = this.f22576I.mo16820q();
            if (z3 || q != i3 || !Intrinsics.areEqual(obj, this.f22576I.mo16822s())) {
                this.f22605j = new Pending(this.f22576I.mo16812i(), this.f22606k);
            } else {
                mo15013p2(z, obj4);
            }
        }
        Pending pending3 = this.f22605j;
        if (pending3 != null) {
            C8615s0 d = pending3.mo15176d(i, obj);
            if (z3 || d == null) {
                this.f22576I.mo16807d();
                this.f22584Q = true;
                this.f22580M = null;
                mo14956Z0();
                this.f22578K.mo16904G();
                int Y2 = this.f22578K.mo16940Y();
                if (z) {
                    this.f22578K.mo16966l1(i, C8592o.f23032a.mo16277a());
                } else if (obj4 != null) {
                    C8701z1 z1Var3 = this.f22578K;
                    if (obj3 == null) {
                        obj3 = C8592o.f23032a.mo16277a();
                    }
                    z1Var3.mo16956g1(i, obj3, obj4);
                } else {
                    C8701z1 z1Var4 = this.f22578K;
                    if (obj3 == null) {
                        obj3 = C8592o.f23032a.mo16277a();
                    }
                    z1Var4.mo16962j1(i, obj3);
                }
                this.f22582O = this.f22578K.mo16895B(Y2);
                C8615s0 s0Var2 = new C8615s0(i, -1, mo15018r1(Y2), -1, 0);
                pending3.mo15181i(s0Var2, this.f22606k - pending3.mo15177e());
                pending3.mo15180h(s0Var2);
                ArrayList arrayList = new ArrayList();
                if (!z) {
                    i5 = this.f22606k;
                }
                pending = new Pending(arrayList, i5);
            } else {
                pending3.mo15180h(d);
                int c = d.mo16380c();
                this.f22606k = pending3.mo15179g(d) + pending3.mo15177e();
                int m = pending3.mo15185m(d);
                int a = m - pending3.mo15173a();
                pending3.mo15183k(m, pending3.mo15173a());
                mo14943U1(c);
                this.f22576I.mo16799X(c);
                if (a > 0) {
                    mo14952X1(new ComposerImpl$start$2(a));
                }
                mo15013p2(z, obj4);
            }
        }
        mo14959a1(z, pending);
    }

    @C8579l
    /* renamed from: n */
    public void mo15005n() {
        if (this.f22615t.isEmpty()) {
            mo14996k2();
            return;
        }
        C8689v1 v1Var = this.f22576I;
        int q = v1Var.mo16820q();
        Object s = v1Var.mo16822s();
        Object o = v1Var.mo16818o();
        mo15025t2(q, s, o);
        mo15013p2(v1Var.mo16790O(), (Object) null);
        mo14911J1();
        v1Var.mo16811h();
        mo15031v2(q, s, o);
    }

    @C8579l
    /* renamed from: n0 */
    public boolean mo15006n0(@C12580l Object obj) {
        if (Intrinsics.areEqual(mo15030v1(), obj)) {
            return false;
        }
        mo14890A2(obj);
        return true;
    }

    /* renamed from: n1 */
    public final void mo15007n1(List<Pair<C8697y0, C8697y0>> list) {
        C8692w1 w1Var;
        C8412c cVar;
        C8689v1 y0;
        int[] v0;
        List list2;
        C8692w1 a;
        C8689v1 F0;
        List<C11305q<C8428d<?>, C8701z1, C8608r1, C11079d2>> list3 = this.f22602g;
        List s0 = this.f22601f;
        try {
            this.f22601f = list3;
            mo14914K1(ComposerKt.f22636f);
            int size = list.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Pair pair = list.get(i2);
                C8697y0 y0Var = (C8697y0) pair.mo21846a();
                C8697y0 y0Var2 = (C8697y0) pair.mo21847b();
                C8412c a2 = y0Var.mo16876a();
                int X = y0Var.mo16882g().mo16848X(a2);
                Ref.IntRef intRef = new Ref.IntRef();
                mo14901F1();
                mo14914K1(new ComposerImpl$insertMovableContentGuarded$1$1$1(intRef, a2));
                if (y0Var2 == null) {
                    if (Intrinsics.areEqual((Object) y0Var.mo16882g(), (Object) this.f22577J)) {
                        mo14931Q0();
                    }
                    F0 = y0Var.mo16882g().mo16836F0();
                    F0.mo16799X(X);
                    this.f22588U = X;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = arrayList;
                    m29538I1(this, (C8696y) null, (C8696y) null, (Integer) null, (List) null, new ComposerImpl$insertMovableContentGuarded$1$1$2$1(this, arrayList, F0, y0Var), 15, (Object) null);
                    if (!arrayList2.isEmpty()) {
                        mo14914K1(new ComposerImpl$insertMovableContentGuarded$1$1$2$2(intRef, arrayList2));
                    }
                    C11079d2 d2Var = C11079d2.f28267a;
                    F0.mo16808e();
                } else {
                    C8694x0 m = this.f22597c.mo15057m(y0Var2);
                    if (m == null || (w1Var = m.mo16870a()) == null) {
                        w1Var = y0Var2.mo16882g();
                    }
                    if (m == null || (a = m.mo16870a()) == null || (cVar = a.mo16852i(i)) == null) {
                        cVar = y0Var2.mo16876a();
                    }
                    List c = ComposerKt.m29848y(w1Var, cVar);
                    if (!c.isEmpty()) {
                        mo14914K1(new ComposerImpl$insertMovableContentGuarded$1$1$3(intRef, c));
                        if (Intrinsics.areEqual((Object) y0Var.mo16882g(), (Object) this.f22599d)) {
                            int X2 = this.f22599d.mo16848X(a2);
                            mo15036x2(X2, mo14892B2(X2) + c.size());
                        }
                    }
                    mo14914K1(new ComposerImpl$insertMovableContentGuarded$1$1$4(m, this, y0Var2, y0Var));
                    C8689v1 F02 = w1Var.mo16836F0();
                    try {
                        y0 = this.f22576I;
                        v0 = this.f22610o;
                        this.f22610o = null;
                        this.f22576I = F02;
                        int X3 = w1Var.mo16848X(cVar);
                        F02.mo16799X(X3);
                        this.f22588U = X3;
                        ArrayList arrayList3 = new ArrayList();
                        List s02 = this.f22601f;
                        try {
                            this.f22601f = arrayList3;
                            list2 = s02;
                            ArrayList arrayList4 = arrayList3;
                            try {
                                mo14907H1(y0Var2.mo16877b(), y0Var.mo16877b(), Integer.valueOf(F02.mo16817n()), y0Var2.mo16879d(), new ComposerImpl$insertMovableContentGuarded$1$1$5$1$1$1(this, y0Var));
                                C11079d2 d2Var2 = C11079d2.f28267a;
                                this.f22601f = list2;
                                if (!arrayList4.isEmpty()) {
                                    mo14914K1(new ComposerImpl$insertMovableContentGuarded$1$1$5$1$2(intRef, arrayList4));
                                }
                                this.f22576I = y0;
                                this.f22610o = v0;
                                F02.mo16808e();
                            } catch (Throwable th) {
                                th = th;
                                this.f22601f = list2;
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            list2 = s02;
                            this.f22601f = list2;
                            throw th;
                        }
                    } catch (Throwable th3) {
                        F02.mo16808e();
                        throw th3;
                    }
                }
                mo14914K1(ComposerKt.f22633c);
                i2++;
                i = 0;
            }
            mo14914K1(ComposerImpl$insertMovableContentGuarded$1$2.f22629f);
            this.f22588U = 0;
            C11079d2 d2Var3 = C11079d2.f28267a;
            this.f22601f = s0;
        } catch (Throwable th4) {
            this.f22601f = s0;
            throw th4;
        }
    }

    /* renamed from: n2 */
    public final void mo15008n2(int i) {
        mo15004m2(i, (Object) null, C8575k0.f23011b.mo16249a(), (Object) null);
    }

    @C8579l
    @C12579k
    /* renamed from: o */
    public C8592o mo15009o(int i) {
        mo15004m2(i, (Object) null, C8575k0.f23011b.mo16249a(), (Object) null);
        mo14910J0();
        return this;
    }

    /* renamed from: o2 */
    public final void mo15010o2(int i, Object obj) {
        mo15004m2(i, obj, C8575k0.f23011b.mo16249a(), (Object) null);
    }

    /* renamed from: p */
    public boolean mo15011p() {
        boolean z;
        if (mo14997l() || this.f22621z || this.f22619x) {
            return false;
        }
        RecomposeScopeImpl g1 = mo14982g1();
        if (g1 == null || g1.mo15212o()) {
            z = false;
        } else {
            z = true;
        }
        if (!z || this.f22613r) {
            return false;
        }
        return true;
    }

    @C8595o0
    /* renamed from: p0 */
    public void mo15012p0(@C12579k C8572j1<?>[] j1VarArr) {
        C8452h<C8682u<Object>, C8578k2<Object>> hVar;
        Intrinsics.checkNotNullParameter(j1VarArr, C19456p0.f49833g);
        C8452h<C8682u<Object>, C8578k2<Object>> R0 = mo14934R0();
        mo15010o2(ComposerKt.f22642l, ComposerKt.m29791R());
        mo15010o2(203, ComposerKt.m29797X());
        C8452h hVar2 = (C8452h) C8407b.m30218d(this, new ComposerImpl$startProviders$currentProviders$1(j1VarArr, R0));
        mo14951X0();
        boolean z = false;
        if (mo14997l()) {
            hVar = mo15042z2(R0, hVar2);
            this.f22579L = true;
        } else {
            Object F = this.f22576I.mo16781F(0);
            Intrinsics.checkNotNull(F, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
            C8452h<C8682u<Object>, C8578k2<Object>> hVar3 = (C8452h) F;
            Object F2 = this.f22576I.mo16781F(1);
            Intrinsics.checkNotNull(F2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
            C8452h hVar4 = (C8452h) F2;
            if (!mo15011p() || !Intrinsics.areEqual((Object) hVar4, (Object) hVar2)) {
                hVar = mo15042z2(R0, hVar2);
                z = !Intrinsics.areEqual((Object) hVar, (Object) hVar3);
            } else {
                mo14996k2();
                hVar = hVar3;
            }
        }
        if (z && !mo14997l()) {
            this.f22618w.mo15431g(this.f22576I.mo16817n(), hVar);
        }
        this.f22620y.mo16275j(ComposerKt.m29844w(this.f22619x));
        this.f22619x = z;
        this.f22580M = hVar;
        mo15004m2(ComposerKt.f22644n, ComposerKt.m29782I(), C8575k0.f23011b.mo16249a(), hVar);
    }

    /* renamed from: p2 */
    public final void mo15013p2(boolean z, Object obj) {
        if (z) {
            this.f22576I.mo16806c0();
            return;
        }
        if (!(obj == null || this.f22576I.mo16818o() == obj)) {
            m29539Z1(this, false, new ComposerImpl$startReaderGroup$1(obj), 1, (Object) null);
        }
        this.f22576I.mo16804b0();
    }

    @C8595o0
    /* renamed from: q */
    public void mo15014q(@C12579k List<Pair<C8697y0, C8697y0>> list) {
        Intrinsics.checkNotNullParameter(list, "references");
        try {
            mo15007n1(list);
            mo14919M0();
        } catch (Throwable th) {
            mo15015q0();
            throw th;
        }
    }

    /* renamed from: q0 */
    public final void mo15015q0() {
        mo14919M0();
        this.f22604i.mo16234a();
        this.f22607l.mo16266a();
        this.f22609n.mo16266a();
        this.f22616u.mo16266a();
        this.f22620y.mo16266a();
        this.f22618w.mo15425a();
        if (!this.f22576I.mo16815l()) {
            this.f22576I.mo16808e();
        }
        if (!this.f22578K.mo16938X()) {
            this.f22578K.mo16908I();
        }
        mo14931Q0();
        this.f22585R = 0;
        this.f22569B = 0;
        this.f22614s = false;
        this.f22584Q = false;
        this.f22621z = false;
        this.f22574G = false;
        this.f22613r = false;
    }

    /* renamed from: q2 */
    public final void mo15016q2() {
        this.f22576I = this.f22599d.mo16836F0();
        mo15008n2(100);
        this.f22597c.mo15061q();
        this.f22617v = this.f22597c.mo15049e();
        this.f22620y.mo16275j(ComposerKt.m29844w(this.f22619x));
        this.f22619x = mo15006n0(this.f22617v);
        this.f22580M = null;
        if (!this.f22612q) {
            this.f22612q = this.f22597c.mo15048d();
        }
        Set set = (Set) mo14984h2(InspectionTablesKt.m31883a(), this.f22617v);
        if (set != null) {
            set.add(this.f22599d);
            this.f22597c.mo15058n(set);
        }
        mo15008n2(this.f22597c.mo15050f());
    }

    @C12579k
    /* renamed from: r */
    public C8428d<?> mo15017r() {
        return this.f22595b;
    }

    /* renamed from: r1 */
    public final int mo15018r1(int i) {
        return -2 - i;
    }

    /* renamed from: r2 */
    public final boolean mo15019r2(@C12579k RecomposeScopeImpl recomposeScopeImpl, @C12580l Object obj) {
        Intrinsics.checkNotNullParameter(recomposeScopeImpl, "scope");
        C8412c j = recomposeScopeImpl.mo15207j();
        if (j == null) {
            return false;
        }
        int d = j.mo15341d(this.f22599d);
        if (!this.f22574G || d < this.f22576I.mo16817n()) {
            return false;
        }
        ComposerKt.m29811f0(this.f22615t, d, recomposeScopeImpl, obj);
        return true;
    }

    @C8579l
    @C12580l
    /* renamed from: s */
    public C8678t1 mo15020s() {
        RecomposeScopeImpl recomposeScopeImpl;
        C8412c cVar;
        C11300l<C8598p, C11079d2> i;
        RecomposeScopeImpl recomposeScopeImpl2 = null;
        if (this.f22573F.mo16237d()) {
            recomposeScopeImpl = this.f22573F.mo16240g();
        } else {
            recomposeScopeImpl = null;
        }
        if (recomposeScopeImpl != null) {
            recomposeScopeImpl.mo15197D(false);
        }
        if (!(recomposeScopeImpl == null || (i = recomposeScopeImpl.mo15205i(this.f22571D)) == null)) {
            mo14914K1(new ComposerImpl$endRestartGroup$1$1(i, this));
        }
        if (recomposeScopeImpl != null && !recomposeScopeImpl.mo15214q() && (recomposeScopeImpl.mo15215r() || this.f22612q)) {
            if (recomposeScopeImpl.mo15207j() == null) {
                if (mo14997l()) {
                    C8701z1 z1Var = this.f22578K;
                    cVar = z1Var.mo16895B(z1Var.mo16942Z());
                } else {
                    C8689v1 v1Var = this.f22576I;
                    cVar = v1Var.mo16802a(v1Var.mo16829y());
                }
                recomposeScopeImpl.mo15194A(cVar);
            }
            recomposeScopeImpl.mo15196C(false);
            recomposeScopeImpl2 = recomposeScopeImpl;
        }
        mo14948W0(false);
        return recomposeScopeImpl2;
    }

    /* renamed from: s1 */
    public final void mo15021s1(C8691w0<Object> w0Var, C8452h<C8682u<Object>, ? extends C8578k2<? extends Object>> hVar, Object obj, boolean z) {
        mo14933R(MovableContentKt.f22686a, w0Var);
        mo15006n0(obj);
        int i0 = mo14986i0();
        try {
            this.f22585R = MovableContentKt.f22686a;
            boolean z2 = false;
            if (mo14997l()) {
                C8701z1.m32164x0(this.f22578K, 0, 1, (Object) null);
            }
            if (!mo14997l()) {
                if (!Intrinsics.areEqual(this.f22576I.mo16818o(), (Object) hVar)) {
                    z2 = true;
                }
            }
            if (z2) {
                this.f22618w.mo15431g(this.f22576I.mo16817n(), hVar);
            }
            mo15004m2(ComposerKt.f22644n, ComposerKt.m29782I(), C8575k0.f23011b.mo16249a(), hVar);
            if (!mo14997l() || z) {
                boolean z3 = this.f22619x;
                this.f22619x = z2;
                C8407b.m30217c(this, C8553b.m31049c(694380496, true, new ComposerImpl$invokeMovableContentLambda$1(w0Var, obj)));
                this.f22619x = z3;
            } else {
                this.f22579L = true;
                this.f22580M = null;
                C8701z1 z1Var = this.f22578K;
                this.f22597c.mo15053i(new C8697y0(w0Var, obj, mo14969d0(), this.f22577J, z1Var.mo16895B(z1Var.mo16911J0(z1Var.mo16942Z())), CollectionsKt__CollectionsKt.m40441E(), mo14934R0()));
            }
        } finally {
            mo14951X0();
            this.f22585R = i0;
            mo14998l0();
        }
    }

    @C11532s0
    /* renamed from: s2 */
    public final void mo15022s2(@C12580l Object obj) {
        mo14890A2(obj);
    }

    @C8579l
    @C12579k
    /* renamed from: t */
    public Object mo15023t(@C12580l Object obj, @C12580l Object obj2) {
        Object i = ComposerKt.m29790Q(this.f22576I.mo16822s(), obj, obj2);
        return i == null ? new C8607r0(obj, obj2) : i;
    }

    /* renamed from: t1 */
    public final boolean mo15024t1() {
        return this.f22574G;
    }

    /* renamed from: t2 */
    public final void mo15025t2(int i, Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null || i != 207 || Intrinsics.areEqual(obj2, C8592o.f23032a.mo16277a())) {
                mo15028u2(i);
            } else {
                mo15028u2(obj2.hashCode());
            }
        } else if (obj instanceof Enum) {
            mo15028u2(((Enum) obj).ordinal());
        } else {
            mo15028u2(obj.hashCode());
        }
    }

    /* renamed from: u */
    public void mo15026u() {
        mo15004m2(125, (Object) null, C8575k0.f23011b.mo16250b(), (Object) null);
        this.f22614s = true;
    }

    /* renamed from: u1 */
    public final boolean mo15027u1() {
        return this.f22575H;
    }

    /* renamed from: u2 */
    public final void mo15028u2(int i) {
        this.f22585R = i ^ Integer.rotateLeft(mo14986i0(), 3);
    }

    /* renamed from: v */
    public <V, T> void mo15029v(V v, @C12579k C11304p<? super T, ? super V, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(pVar, C28534f.f69159i0);
        ComposerImpl$apply$operation$1 composerImpl$apply$operation$1 = new ComposerImpl$apply$operation$1(pVar, v);
        if (mo14997l()) {
            mo14932Q1(composerImpl$apply$operation$1);
        } else {
            mo14917L1(composerImpl$apply$operation$1);
        }
    }

    @C12580l
    @C11532s0
    /* renamed from: v1 */
    public final Object mo15030v1() {
        if (mo14997l()) {
            mo14898D2();
            return C8592o.f23032a.mo16277a();
        }
        Object Q = this.f22576I.mo16792Q();
        if (this.f22621z) {
            return C8592o.f23032a.mo16277a();
        }
        return Q;
    }

    /* renamed from: v2 */
    public final void mo15031v2(int i, Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null || i != 207 || Intrinsics.areEqual(obj2, C8592o.f23032a.mo16277a())) {
                mo15034w2(i);
            } else {
                mo15034w2(obj2.hashCode());
            }
        } else if (obj instanceof Enum) {
            mo15034w2(((Enum) obj).ordinal());
        } else {
            mo15034w2(obj.hashCode());
        }
    }

    @C8595o0
    /* renamed from: w */
    public <T> T mo15032w(@C12579k C8682u<T> uVar) {
        Intrinsics.checkNotNullParameter(uVar, "key");
        return mo14984h2(uVar, mo14934R0());
    }

    /* renamed from: w1 */
    public final Object mo15033w1(C8689v1 v1Var, int i) {
        return v1Var.mo16793R(i);
    }

    /* renamed from: w2 */
    public final void mo15034w2(int i) {
        this.f22585R = Integer.rotateRight(Integer.hashCode(i) ^ mo14986i0(), 3);
    }

    /* renamed from: x1 */
    public final int mo15035x1(int i, int i2, int i3, int i4) {
        int i5;
        int V = this.f22576I.mo16797V(i2);
        while (i5 != i3 && !this.f22576I.mo16791P(i5)) {
            V = this.f22576I.mo16797V(i5);
        }
        if (this.f22576I.mo16791P(i5)) {
            i4 = 0;
        }
        if (i5 == i2) {
            return i4;
        }
        int B2 = (mo14892B2(i5) - this.f22576I.mo16795T(i2)) + i4;
        loop1:
        while (i4 < B2 && i5 != i) {
            i5++;
            while (true) {
                if (i5 >= i) {
                    break loop1;
                }
                int K = this.f22576I.mo16786K(i5) + i5;
                if (i >= K) {
                    i4 += mo14892B2(i5);
                    i5 = K;
                }
            }
        }
        return i4;
    }

    /* renamed from: x2 */
    public final void mo15036x2(int i, int i2) {
        if (mo14892B2(i) == i2) {
            return;
        }
        if (i < 0) {
            HashMap<Integer, Integer> hashMap = this.f22611p;
            if (hashMap == null) {
                hashMap = new HashMap<>();
                this.f22611p = hashMap;
            }
            hashMap.put(Integer.valueOf(i), Integer.valueOf(i2));
            return;
        }
        int[] iArr = this.f22610o;
        if (iArr == null) {
            iArr = new int[this.f22576I.mo16776A()];
            C10956m.m41300u2(iArr, -1, 0, 0, 6, (Object) null);
            this.f22610o = iArr;
        }
        iArr[i] = i2;
    }

    /* renamed from: y */
    public void mo15037y(int i) {
        if (i < 0) {
            int i2 = -i;
            C8701z1 z1Var = this.f22578K;
            while (true) {
                int Z = z1Var.mo16942Z();
                if (Z > i2) {
                    mo14948W0(z1Var.mo16984u0(Z));
                } else {
                    return;
                }
            }
        } else {
            if (mo14997l()) {
                C8701z1 z1Var2 = this.f22578K;
                while (mo14997l()) {
                    mo14948W0(z1Var2.mo16984u0(z1Var2.mo16942Z()));
                }
            }
            C8689v1 v1Var = this.f22576I;
            while (true) {
                int y = v1Var.mo16829y();
                if (y > i) {
                    mo14948W0(v1Var.mo16791P(y));
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: y1 */
    public final int mo15038y1() {
        if (mo14997l()) {
            C8701z1 z1Var = this.f22578K;
            return z1Var.mo16955g0(z1Var.mo16942Z());
        }
        C8689v1 v1Var = this.f22576I;
        return v1Var.mo16783H(v1Var.mo16829y());
    }

    /* renamed from: y2 */
    public final void mo15039y2(int i, int i2) {
        int B2 = mo14892B2(i);
        if (B2 != i2) {
            int i3 = i2 - B2;
            int b = this.f22604i.mo16235b() - 1;
            while (i != -1) {
                int B22 = mo14892B2(i) + i3;
                mo15036x2(i, B22);
                int i4 = b;
                while (true) {
                    if (-1 < i4) {
                        Pending f = this.f22604i.mo16239f(i4);
                        if (f != null && f.mo15186n(i, B22)) {
                            b = i4 - 1;
                            break;
                        }
                        i4--;
                    } else {
                        break;
                    }
                }
                if (i < 0) {
                    i = this.f22576I.mo16829y();
                } else if (!this.f22576I.mo16791P(i)) {
                    i = this.f22576I.mo16797V(i);
                } else {
                    return;
                }
            }
        }
    }

    @C12579k
    /* renamed from: z */
    public CoroutineContext mo15040z() {
        return this.f22597c.mo15051g();
    }

    /* renamed from: z1 */
    public final void mo15041z1(@C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
        if (!this.f22574G) {
            this.f22574G = true;
            try {
                aVar.invoke();
            } finally {
                this.f22574G = false;
            }
        } else {
            ComposerKt.m29774A("Preparing a composition while composing is not supported".toString());
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: z2 */
    public final C8452h<C8682u<Object>, C8578k2<Object>> mo15042z2(C8452h<C8682u<Object>, ? extends C8578k2<? extends Object>> hVar, C8452h<C8682u<Object>, ? extends C8578k2<? extends Object>> hVar2) {
        C8452h.C8453a<C8682u<Object>, ? extends C8578k2<? extends Object>> builder = hVar.builder();
        builder.putAll(hVar2);
        C8452h<C8682u<Object>, ? extends C8578k2<? extends Object>> g = builder.mo15671g();
        mo15010o2(204, ComposerKt.m29794U());
        mo15006n0(g);
        mo15006n0(hVar2);
        mo14951X0();
        return g;
    }
}

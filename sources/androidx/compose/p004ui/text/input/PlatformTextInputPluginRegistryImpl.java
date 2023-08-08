package androidx.compose.p004ui.text.input;

import androidx.compose.p004ui.text.C16261i;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.internal.C8567o;
import androidx.compose.runtime.snapshots.C8667t;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C16261i
@C8567o(parameters = 0)
@C11363r0({"SMAP\nPlatformTextInputAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformTextInputAdapter.kt\nandroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,335:1\n1#2:336\n36#3:337\n25#3:348\n1057#4,6:338\n1057#4,3:349\n1060#4,3:355\n473#5,4:344\n477#5,2:352\n481#5:358\n473#6:354\n766#7:359\n857#7,2:360\n33#8,6:362\n*S KotlinDebug\n*F\n+ 1 PlatformTextInputAdapter.kt\nandroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl\n*L\n167#1:337\n172#1:348\n167#1:338,6\n172#1:349,3\n172#1:355,3\n172#1:344,4\n172#1:352,2\n172#1:358\n172#1:354\n241#1:359\n241#1:360,2\n242#1:362,6\n*E\n"})
/* renamed from: androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl */
public final class PlatformTextInputPluginRegistryImpl implements C16301k0 {

    /* renamed from: e */
    public static final int f40394e = 0;
    @C12579k

    /* renamed from: a */
    public final C11304p<C16299j0<?>, C16290f0, C16292g0> f40395a;
    @C12579k

    /* renamed from: b */
    public final C8667t<C16299j0<?>, C16266c<?>> f40396b = C8415c2.m30239h();

    /* renamed from: c */
    public boolean f40397c;
    @C12580l

    /* renamed from: d */
    public C16299j0<?> f40398d;

    @C16261i
    @C8567o(parameters = 0)
    @C11363r0({"SMAP\nPlatformTextInputAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformTextInputAdapter.kt\nandroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl$AdapterHandle\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,335:1\n1#2:336\n*E\n"})
    /* renamed from: androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl$a */
    public static final class C16264a<T extends C16292g0> {

        /* renamed from: d */
        public static final int f40399d = 8;
        @C12579k

        /* renamed from: a */
        public final T f40400a;
        @C12579k

        /* renamed from: b */
        public final C11289a<Boolean> f40401b;

        /* renamed from: c */
        public boolean f40402c;

        public C16264a(@C12579k T t, @C12579k C11289a<Boolean> aVar) {
            Intrinsics.checkNotNullParameter(t, "adapter");
            Intrinsics.checkNotNullParameter(aVar, "onDispose");
            this.f40400a = t;
            this.f40401b = aVar;
        }

        /* renamed from: a */
        public final boolean mo47096a() {
            if (!this.f40402c) {
                this.f40402c = true;
                return this.f40401b.invoke().booleanValue();
            }
            throw new IllegalStateException("AdapterHandle already disposed".toString());
        }

        @C12579k
        /* renamed from: b */
        public final T mo47097b() {
            return this.f40400a;
        }
    }

    /* renamed from: androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl$b */
    public final class C16265b implements C16290f0 {
        @C12579k

        /* renamed from: a */
        public final C16299j0<?> f40403a;

        /* renamed from: b */
        public final /* synthetic */ PlatformTextInputPluginRegistryImpl f40404b;

        public C16265b(@C12579k PlatformTextInputPluginRegistryImpl platformTextInputPluginRegistryImpl, C16299j0<?> j0Var) {
            Intrinsics.checkNotNullParameter(j0Var, "plugin");
            this.f40404b = platformTextInputPluginRegistryImpl;
            this.f40403a = j0Var;
        }

        /* renamed from: a */
        public void mo47098a() {
            this.f40404b.f40398d = this.f40403a;
        }

        /* renamed from: b */
        public void mo47099b() {
            if (Intrinsics.areEqual((Object) this.f40404b.f40398d, (Object) this.f40403a)) {
                this.f40404b.f40398d = null;
            }
        }
    }

    @C11363r0({"SMAP\nPlatformTextInputAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformTextInputAdapter.kt\nandroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl$AdapterWithRefCount\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,335:1\n76#2:336\n102#2,2:337\n*S KotlinDebug\n*F\n+ 1 PlatformTextInputAdapter.kt\nandroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl$AdapterWithRefCount\n*L\n291#1:336\n291#1:337,2\n*E\n"})
    /* renamed from: androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl$c */
    public final class C16266c<T extends C16292g0> {
        @C12579k

        /* renamed from: a */
        public final T f40405a;
        @C12579k

        /* renamed from: b */
        public final C8700z0 f40406b = C8539f2.m30981g(0, (C8410b2) null, 2, (Object) null);

        /* renamed from: c */
        public final /* synthetic */ PlatformTextInputPluginRegistryImpl f40407c;

        public C16266c(@C12579k PlatformTextInputPluginRegistryImpl platformTextInputPluginRegistryImpl, T t) {
            Intrinsics.checkNotNullParameter(t, "adapter");
            this.f40407c = platformTextInputPluginRegistryImpl;
            this.f40405a = t;
        }

        /* renamed from: a */
        public final boolean mo47100a() {
            boolean z;
            mo47105f(mo47102c() - 1);
            if (mo47102c() >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalStateException(("AdapterWithRefCount.decrementRefCount called too many times (refCount=" + mo47102c() + ')').toString());
            } else if (mo47102c() != 0) {
                return false;
            } else {
                this.f40407c.f40397c = true;
                return true;
            }
        }

        @C12579k
        /* renamed from: b */
        public final T mo47101b() {
            return this.f40405a;
        }

        /* renamed from: c */
        public final int mo47102c() {
            return ((Number) this.f40406b.getValue()).intValue();
        }

        /* renamed from: d */
        public final void mo47103d() {
            mo47105f(mo47102c() + 1);
        }

        /* renamed from: e */
        public final boolean mo47104e() {
            return mo47102c() == 0;
        }

        /* renamed from: f */
        public final void mo47105f(int i) {
            this.f40406b.setValue(Integer.valueOf(i));
        }
    }

    public PlatformTextInputPluginRegistryImpl(@C12579k C11304p<? super C16299j0<?>, ? super C16290f0, ? extends C16292g0> pVar) {
        Intrinsics.checkNotNullParameter(pVar, "factory");
        this.f40395a = pVar;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [androidx.compose.ui.text.input.j0, java.lang.Object, androidx.compose.ui.text.input.j0<T>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.compose.runtime.C8540g
    @org.jetbrains.annotations.C12579k
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T extends androidx.compose.p004ui.text.input.C16292g0> T mo47091a(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.text.input.C16299j0<T> r4, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r5, int r6) {
        /*
            r3 = this;
            java.lang.String r0 = "plugin"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = -845039128(0xffffffffcda1b9e8, float:-3.39164416E8)
            r5.mo14918M(r0)
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x0017
            r1 = -1
            java.lang.String r2 = "androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl.rememberAdapter (PlatformTextInputAdapter.kt:161)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r6, r1, r2)
        L_0x0017:
            r6 = 1157296644(0x44faf204, float:2007.563)
            r5.mo14918M(r6)
            boolean r6 = r5.mo15006n0(r4)
            java.lang.Object r0 = r5.mo14921N()
            if (r6 != 0) goto L_0x002f
            androidx.compose.runtime.o$a r6 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r6 = r6.mo16277a()
            if (r0 != r6) goto L_0x0036
        L_0x002f:
            androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl$a r0 = r3.mo47094h(r4)
            r5.mo14893C(r0)
        L_0x0036:
            r5.mo15002m0()
            androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl$a r0 = (androidx.compose.p004ui.text.input.PlatformTextInputPluginRegistryImpl.C16264a) r0
            r4 = 773894976(0x2e20b340, float:3.6538994E-11)
            r5.mo14918M(r4)
            r4 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r5.mo14918M(r4)
            java.lang.Object r4 = r5.mo14921N()
            androidx.compose.runtime.o$a r6 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r6 = r6.mo16277a()
            if (r4 != r6) goto L_0x0062
            kotlin.coroutines.EmptyCoroutineContext r4 = kotlin.coroutines.EmptyCoroutineContext.f28243a
            kotlinx.coroutines.o0 r4 = androidx.compose.runtime.EffectsKt.m29901m(r4, r5)
            androidx.compose.runtime.w r6 = new androidx.compose.runtime.w
            r6.<init>(r4)
            r5.mo14893C(r6)
            r4 = r6
        L_0x0062:
            r5.mo15002m0()
            androidx.compose.runtime.w r4 = (androidx.compose.runtime.C8690w) r4
            kotlinx.coroutines.o0 r4 = r4.mo16831a()
            r5.mo15002m0()
            androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl$rememberAdapter$1 r6 = new androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl$rememberAdapter$1
            r6.<init>(r0, r4, r3)
            r4 = 8
            androidx.compose.runtime.EffectsKt.m29891c(r0, r6, r5, r4)
            androidx.compose.ui.text.input.g0 r4 = r0.mo47097b()
            boolean r6 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r6 == 0) goto L_0x0085
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0085:
            r5.mo15002m0()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.text.input.PlatformTextInputPluginRegistryImpl.mo47091a(androidx.compose.ui.text.input.j0, androidx.compose.runtime.o, int):androidx.compose.ui.text.input.g0");
    }

    /* renamed from: f */
    public final void mo47092f() {
        if (this.f40397c) {
            this.f40397c = false;
            ArrayList arrayList = new ArrayList();
            for (Object next : this.f40396b.entrySet()) {
                if (((C16266c) ((Map.Entry) next).getValue()).mo47104e()) {
                    arrayList.add(next);
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                Map.Entry entry = (Map.Entry) arrayList.get(i);
                C16299j0 j0Var = (C16299j0) entry.getKey();
                C16266c cVar = (C16266c) entry.getValue();
                if (Intrinsics.areEqual((Object) this.f40398d, (Object) j0Var)) {
                    this.f40398d = null;
                }
                this.f40396b.remove(j0Var);
                C16296i0.m73428a(cVar.mo47101b());
            }
        }
    }

    @C12580l
    /* renamed from: g */
    public final C16292g0 mo47093g() {
        C16266c cVar = this.f40396b.get(this.f40398d);
        if (cVar != null) {
            return cVar.mo47101b();
        }
        return null;
    }

    @C16261i
    @C12579k
    /* renamed from: h */
    public final <T extends C16292g0> C16264a<T> mo47094h(@C12579k C16299j0<T> j0Var) {
        Intrinsics.checkNotNullParameter(j0Var, "plugin");
        C16266c<T> cVar = this.f40396b.get(j0Var);
        if (cVar == null) {
            cVar = mo47095i(j0Var);
        }
        cVar.mo47103d();
        return new C16264a<>(cVar.mo47101b(), new PlatformTextInputPluginRegistryImpl$getOrCreateAdapter$1(cVar));
    }

    /* renamed from: i */
    public final <T extends C16292g0> C16266c<T> mo47095i(C16299j0<T> j0Var) {
        C16292g0 invoke = this.f40395a.invoke(j0Var, new C16265b(this, j0Var));
        Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type T of androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl.instantiateAdapter");
        C16266c<T> cVar = new C16266c<>(this, invoke);
        this.f40396b.put(j0Var, cVar);
        return cVar;
    }
}

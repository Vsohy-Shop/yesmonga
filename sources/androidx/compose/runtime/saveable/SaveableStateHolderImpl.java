package androidx.compose.runtime.saveable;

import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8572j1;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.collections.C10977s0;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSaveableStateHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveableStateHolder.kt\nandroidx/compose/runtime/saveable/SaveableStateHolderImpl\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,142:1\n145#2,2:143\n25#2:145\n147#2,2:152\n1114#3,6:146\n1855#4,2:154\n1#5:156\n*S KotlinDebug\n*F\n+ 1 SaveableStateHolder.kt\nandroidx/compose/runtime/saveable/SaveableStateHolderImpl\n*L\n76#1:143,2\n77#1:145\n76#1:152,2\n77#1:146,6\n102#1:154,2\n*E\n"})
public final class SaveableStateHolderImpl implements C8623b {
    @C12579k

    /* renamed from: d */
    public static final C8619a f23088d = new C8619a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: e */
    public static final C8628e<SaveableStateHolderImpl, ?> f23089e = SaverKt.m31375a(SaveableStateHolderImpl$Companion$Saver$1.f23097f, SaveableStateHolderImpl$Companion$Saver$2.f23098f);
    @C12579k

    /* renamed from: a */
    public final Map<Object, Map<String, List<Object>>> f23090a;
    @C12579k

    /* renamed from: b */
    public final Map<Object, RegistryHolder> f23091b;
    @C12580l

    /* renamed from: c */
    public C8624c f23092c;

    public final class RegistryHolder {
        @C12579k

        /* renamed from: a */
        public final Object f23093a;

        /* renamed from: b */
        public boolean f23094b = true;
        @C12579k

        /* renamed from: c */
        public final C8624c f23095c;

        /* renamed from: d */
        public final /* synthetic */ SaveableStateHolderImpl f23096d;

        public RegistryHolder(@C12579k SaveableStateHolderImpl saveableStateHolderImpl, Object obj) {
            Intrinsics.checkNotNullParameter(obj, "key");
            this.f23096d = saveableStateHolderImpl;
            this.f23093a = obj;
            this.f23095c = SaveableStateRegistryKt.m31372a((Map) saveableStateHolderImpl.f23090a.get(obj), new SaveableStateHolderImpl$RegistryHolder$registry$1(saveableStateHolderImpl));
        }

        @C12579k
        /* renamed from: a */
        public final Object mo16393a() {
            return this.f23093a;
        }

        @C12579k
        /* renamed from: b */
        public final C8624c mo16394b() {
            return this.f23095c;
        }

        /* renamed from: c */
        public final boolean mo16395c() {
            return this.f23094b;
        }

        /* renamed from: d */
        public final void mo16396d(@C12579k Map<Object, Map<String, List<Object>>> map) {
            Intrinsics.checkNotNullParameter(map, "map");
            if (this.f23094b) {
                Map<String, List<Object>> e = this.f23095c.mo8712e();
                if (e.isEmpty()) {
                    map.remove(this.f23093a);
                } else {
                    map.put(this.f23093a, e);
                }
            }
        }

        /* renamed from: e */
        public final void mo16397e(boolean z) {
            this.f23094b = z;
        }
    }

    /* renamed from: androidx.compose.runtime.saveable.SaveableStateHolderImpl$a */
    public static final class C8619a {
        public /* synthetic */ C8619a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C8628e<SaveableStateHolderImpl, ?> mo16398a() {
            return SaveableStateHolderImpl.f23089e;
        }

        public C8619a() {
        }
    }

    public SaveableStateHolderImpl() {
        this((Map) null, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public void mo8710c(@C12579k Object obj) {
        Intrinsics.checkNotNullParameter(obj, "key");
        RegistryHolder registryHolder = this.f23091b.get(obj);
        if (registryHolder != null) {
            registryHolder.mo16397e(false);
        } else {
            this.f23090a.remove(obj);
        }
    }

    @C8540g
    /* renamed from: d */
    public void mo8711d(@C12579k Object obj, @C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar, @C12580l C8592o oVar, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(obj, "key");
        Intrinsics.checkNotNullParameter(pVar, "content");
        C8592o o = oVar.mo15009o(-1198538093);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1198538093, i, -1, "androidx.compose.runtime.saveable.SaveableStateHolderImpl.SaveableStateProvider (SaveableStateHolder.kt:74)");
        }
        o.mo14918M(444418301);
        o.mo14944V(ComposerKt.f22652v, obj);
        o.mo14918M(-492369756);
        Object N = o.mo14921N();
        if (N == C8592o.f23032a.mo16277a()) {
            C8624c g = mo16390g();
            if (g != null) {
                z = g.mo8708a(obj);
            } else {
                z = true;
            }
            if (z) {
                N = new RegistryHolder(this, obj);
                o.mo14893C(N);
            } else {
                throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
            }
        }
        o.mo15002m0();
        RegistryHolder registryHolder = (RegistryHolder) N;
        CompositionLocalKt.m29856b(new C8572j1[]{SaveableStateRegistryKt.m31373b().mo16141f(registryHolder.mo16394b())}, pVar, o, (i & 112) | 8);
        EffectsKt.m29891c(C11079d2.f28267a, new SaveableStateHolderImpl$SaveableStateProvider$1$1(this, obj, registryHolder), o, 6);
        o.mo14915L();
        o.mo15002m0();
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new SaveableStateHolderImpl$SaveableStateProvider$2(this, obj, pVar, i));
        }
    }

    @C12580l
    /* renamed from: g */
    public final C8624c mo16390g() {
        return this.f23092c;
    }

    /* renamed from: h */
    public final Map<Object, Map<String, List<Object>>> mo16391h() {
        Map<Object, Map<String, List<Object>>> J0 = C10977s0.m41442J0(this.f23090a);
        for (RegistryHolder d : this.f23091b.values()) {
            d.mo16396d(J0);
        }
        if (J0.isEmpty()) {
            return null;
        }
        return J0;
    }

    /* renamed from: i */
    public final void mo16392i(@C12580l C8624c cVar) {
        this.f23092c = cVar;
    }

    public SaveableStateHolderImpl(@C12579k Map<Object, Map<String, List<Object>>> map) {
        Intrinsics.checkNotNullParameter(map, "savedStates");
        this.f23090a = map;
        this.f23091b = new LinkedHashMap();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SaveableStateHolderImpl(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new LinkedHashMap() : map);
    }
}

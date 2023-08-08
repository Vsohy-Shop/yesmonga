package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.saveable.C8623b;
import androidx.compose.runtime.saveable.C8624c;
import androidx.compose.runtime.saveable.C8628e;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.runtime.saveable.SaverKt;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nLazySaveableStateHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolder\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,106:1\n76#2:107\n102#2,2:108\n1855#3,2:110\n*S KotlinDebug\n*F\n+ 1 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolder\n*L\n68#1:107\n68#1:108,2\n75#1:110,2\n*E\n"})
public final class LazySaveableStateHolder implements C8624c, C8623b {
    @C12579k

    /* renamed from: d */
    public static final Companion f6704d = new Companion((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: a */
    public final C8624c f6705a;
    @C12579k

    /* renamed from: b */
    public final C8700z0 f6706b;
    @C12579k

    /* renamed from: c */
    public final Set<Object> f6707c;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C8628e<LazySaveableStateHolder, Map<String, List<Object>>> mo8717a(@C12580l C8624c cVar) {
            return SaverKt.m31375a(LazySaveableStateHolder$Companion$saver$1.f6708f, new LazySaveableStateHolder$Companion$saver$2(cVar));
        }

        public Companion() {
        }
    }

    public LazySaveableStateHolder(@C12579k C8624c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "wrappedRegistry");
        this.f6705a = cVar;
        this.f6706b = C8539f2.m30981g((Object) null, (C8410b2) null, 2, (Object) null);
        this.f6707c = new LinkedHashSet();
    }

    /* renamed from: a */
    public boolean mo8708a(@C12579k Object obj) {
        Intrinsics.checkNotNullParameter(obj, "value");
        return this.f6705a.mo8708a(obj);
    }

    @C12579k
    /* renamed from: b */
    public C8624c.C8625a mo8709b(@C12579k String str, @C12579k C11289a<? extends Object> aVar) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(aVar, "valueProvider");
        return this.f6705a.mo8709b(str, aVar);
    }

    /* renamed from: c */
    public void mo8710c(@C12579k Object obj) {
        Intrinsics.checkNotNullParameter(obj, "key");
        C8623b h = mo8714h();
        if (h != null) {
            h.mo8710c(obj);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @C8540g
    /* renamed from: d */
    public void mo8711d(@C12579k Object obj, @C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(obj, "key");
        Intrinsics.checkNotNullParameter(pVar, "content");
        C8592o o = oVar.mo15009o(-697180401);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-697180401, i, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.SaveableStateProvider (LazySaveableStateHolder.kt:82)");
        }
        C8623b h = mo8714h();
        if (h != null) {
            h.mo8711d(obj, pVar, o, (i & 112) | 520);
            EffectsKt.m29891c(obj, new LazySaveableStateHolder$SaveableStateProvider$1(this, obj), o, 8);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
            C8678t1 s = o.mo15020s();
            if (s != null) {
                s.mo15202a(new LazySaveableStateHolder$SaveableStateProvider$2(this, obj, pVar, i));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @C12579k
    /* renamed from: e */
    public Map<String, List<Object>> mo8712e() {
        C8623b h = mo8714h();
        if (h != null) {
            for (Object c : this.f6707c) {
                h.mo8710c(c);
            }
        }
        return this.f6705a.mo8712e();
    }

    @C12580l
    /* renamed from: f */
    public Object mo8713f(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        return this.f6705a.mo8713f(str);
    }

    @C12580l
    /* renamed from: h */
    public final C8623b mo8714h() {
        return (C8623b) this.f6706b.getValue();
    }

    /* renamed from: i */
    public final void mo8715i(@C12580l C8623b bVar) {
        this.f6706b.setValue(bVar);
    }

    public LazySaveableStateHolder(@C12580l final C8624c cVar, @C12580l Map<String, ? extends List<? extends Object>> map) {
        this(SaveableStateRegistryKt.m31372a(map, new C11300l<Object, Boolean>() {
            @C12579k
            /* renamed from: a */
            public final Boolean invoke(@C12579k Object obj) {
                boolean z;
                Intrinsics.checkNotNullParameter(obj, "it");
                C8624c cVar = cVar;
                if (cVar != null) {
                    z = cVar.mo8708a(obj);
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }));
    }
}

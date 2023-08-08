package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.C2855v;
import androidx.compose.foundation.lazy.layout.C2539c;
import androidx.compose.foundation.lazy.layout.C2549h;
import androidx.compose.foundation.lazy.layout.C2550i;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11466l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C2855v
public final class LazyGridItemProviderImpl implements C2495j, C2549h {
    @C12579k

    /* renamed from: a */
    public final C2539c<C2491g> f6495a;

    /* renamed from: b */
    public final boolean f6496b;

    /* renamed from: c */
    public final /* synthetic */ C2549h f6497c;
    @C12579k

    /* renamed from: d */
    public final LazyGridSpanLayoutProvider f6498d = new LazyGridSpanLayoutProvider(this);

    public LazyGridItemProviderImpl(@C12579k C2539c<C2491g> cVar, boolean z, @C12579k final LazyGridState lazyGridState, @C12579k C11466l lVar) {
        Intrinsics.checkNotNullParameter(cVar, "intervals");
        Intrinsics.checkNotNullParameter(lazyGridState, "state");
        Intrinsics.checkNotNullParameter(lVar, "nearestItemsRange");
        this.f6495a = cVar;
        this.f6496b = z;
        this.f6497c = C2550i.m11424b(cVar, lVar, C8553b.m31049c(-1961468361, true, new C11306r<C2539c.C2540a<? extends C2491g>, Integer, C8592o, Integer, C11079d2>() {
            @C8540g
            /* renamed from: a */
            public final void mo8450a(@C12579k final C2539c.C2540a<C2491g> aVar, int i, @C12580l C8592o oVar, int i2) {
                int i3;
                Object obj;
                int i4;
                int i5;
                Intrinsics.checkNotNullParameter(aVar, "interval");
                if ((i2 & 14) == 0) {
                    if (oVar.mo15006n0(aVar)) {
                        i5 = 4;
                    } else {
                        i5 = 2;
                    }
                    i3 = i5 | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 112) == 0) {
                    if (oVar.mo14976f(i)) {
                        i4 = 32;
                    } else {
                        i4 = 16;
                    }
                    i3 |= i4;
                }
                if ((i3 & 731) != 146 || !oVar.mo15011p()) {
                    if (ComposerKt.m29813g0()) {
                        ComposerKt.m29845w0(-1961468361, i3, -1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.$$delegate_0.<anonymous> (LazyGridItemProvider.kt:89)");
                    }
                    final int b = i - aVar.mo8730b();
                    C11300l<Integer, Object> key = aVar.mo8731c().getKey();
                    if (key != null) {
                        obj = key.invoke(Integer.valueOf(b));
                    } else {
                        obj = null;
                    }
                    LazyLayoutPinnableItemKt.m11353a(obj, i, lazyGridState.mo8525w(), C8553b.m31048b(oVar, -269692885, true, new C11304p<C8592o, Integer, C11079d2>() {
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((C8592o) obj, ((Number) obj2).intValue());
                            return C11079d2.f28267a;
                        }

                        @C8540g
                        public final void invoke(@C12580l C8592o oVar, int i) {
                            if ((i & 11) != 2 || !oVar.mo15011p()) {
                                if (ComposerKt.m29813g0()) {
                                    ComposerKt.m29845w0(-269692885, i, -1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.$$delegate_0.<anonymous>.<anonymous> (LazyGridItemProvider.kt:95)");
                                }
                                aVar.mo8731c().mo8577a().invoke(LazyGridItemScopeImpl.f6505a, Integer.valueOf(b), oVar, 6);
                                if (ComposerKt.m29813g0()) {
                                    ComposerKt.m29843v0();
                                    return;
                                }
                                return;
                            }
                            oVar.mo14958a0();
                        }
                    }), oVar, (i3 & 112) | 3592);
                    if (ComposerKt.m29813g0()) {
                        ComposerKt.m29843v0();
                        return;
                    }
                    return;
                }
                oVar.mo14958a0();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                mo8450a((C2539c.C2540a) obj, ((Number) obj2).intValue(), (C8592o) obj3, ((Number) obj4).intValue());
                return C11079d2.f28267a;
            }
        }));
    }

    /* renamed from: a */
    public int mo8288a() {
        return this.f6497c.mo8288a();
    }

    @C12580l
    /* renamed from: b */
    public Object mo8289b(int i) {
        return this.f6497c.mo8289b(i);
    }

    /* renamed from: c */
    public boolean mo8447c() {
        return this.f6496b;
    }

    @C8540g
    /* renamed from: e */
    public void mo8291e(int i, @C12580l C8592o oVar, int i2) {
        int i3;
        C8592o o = oVar.mo15009o(1355196996);
        if ((i2 & 14) == 0) {
            i3 = (o.mo14976f(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= o.mo15006n0(this) ? 32 : 16;
        }
        if ((i3 & 91) != 18 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1355196996, i3, -1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.Item (LazyGridItemProvider.kt:-1)");
            }
            this.f6497c.mo8291e(i, o, i3 & 14);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new LazyGridItemProviderImpl$Item$1(this, i, i2));
        }
    }

    @C12579k
    /* renamed from: f */
    public Map<Object, Integer> mo8292f() {
        return this.f6497c.mo8292f();
    }

    @C12579k
    /* renamed from: g */
    public Object mo8293g(int i) {
        return this.f6497c.mo8293g(i);
    }

    /* renamed from: j */
    public long mo8448j(@C12579k C2497l lVar, int i) {
        Intrinsics.checkNotNullParameter(lVar, "$this$getSpan");
        C2539c.C2540a<C2491g> aVar = this.f6495a.get(i);
        return aVar.mo8731c().mo8578b().invoke(lVar, Integer.valueOf(i - aVar.mo8730b())).mo8563i();
    }

    @C12579k
    /* renamed from: k */
    public LazyGridSpanLayoutProvider mo8449k() {
        return this.f6498d;
    }
}

package androidx.compose.foundation.lazy;

import androidx.compose.foundation.C2855v;
import androidx.compose.foundation.lazy.layout.C2539c;
import androidx.compose.foundation.lazy.layout.C2549h;
import androidx.compose.foundation.lazy.layout.C2550i;
import androidx.compose.foundation.lazy.layout.C2555n;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import java.util.List;
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
public final class LazyListItemProviderImpl implements C2569n, C2549h {
    @C12579k

    /* renamed from: a */
    public final List<Integer> f6399a;
    @C12579k

    /* renamed from: b */
    public final LazyItemScopeImpl f6400b;

    /* renamed from: c */
    public final /* synthetic */ C2549h f6401c;

    public LazyListItemProviderImpl(@C12579k C2539c<C2516k> cVar, @C12579k C11466l lVar, @C12579k List<Integer> list, @C12579k final LazyItemScopeImpl lazyItemScopeImpl, @C12579k final LazyListState lazyListState) {
        Intrinsics.checkNotNullParameter(cVar, "intervals");
        Intrinsics.checkNotNullParameter(lVar, "nearestItemsRange");
        Intrinsics.checkNotNullParameter(list, "headerIndexes");
        Intrinsics.checkNotNullParameter(lazyItemScopeImpl, "itemScope");
        Intrinsics.checkNotNullParameter(lazyListState, "state");
        this.f6399a = list;
        this.f6400b = lazyItemScopeImpl;
        this.f6401c = C2550i.m11424b(cVar, lVar, C8553b.m31049c(2070454083, true, new C11306r<C2539c.C2540a<? extends C2516k>, Integer, C8592o, Integer, C11079d2>() {
            @C8540g
            /* renamed from: a */
            public final void mo8295a(@C12579k final C2539c.C2540a<C2516k> aVar, int i, @C12580l C8592o oVar, int i2) {
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
                        ComposerKt.m29845w0(2070454083, i3, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.$$delegate_0.<anonymous> (LazyListItemProvider.kt:81)");
                    }
                    final int b = i - aVar.mo8730b();
                    C11300l<Integer, Object> key = aVar.mo8731c().getKey();
                    if (key != null) {
                        obj = key.invoke(Integer.valueOf(b));
                    } else {
                        obj = null;
                    }
                    C2555n w = lazyListState.mo8345w();
                    final LazyItemScopeImpl lazyItemScopeImpl = lazyItemScopeImpl;
                    LazyLayoutPinnableItemKt.m11353a(obj, i, w, C8553b.m31048b(oVar, 1210565839, true, new C11304p<C8592o, Integer, C11079d2>() {
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((C8592o) obj, ((Number) obj2).intValue());
                            return C11079d2.f28267a;
                        }

                        @C8540g
                        public final void invoke(@C12580l C8592o oVar, int i) {
                            if ((i & 11) != 2 || !oVar.mo15011p()) {
                                if (ComposerKt.m29813g0()) {
                                    ComposerKt.m29845w0(1210565839, i, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.$$delegate_0.<anonymous>.<anonymous> (LazyListItemProvider.kt:87)");
                                }
                                aVar.mo8731c().mo8649a().invoke(lazyItemScopeImpl, Integer.valueOf(b), oVar, 0);
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
                mo8295a((C2539c.C2540a) obj, ((Number) obj2).intValue(), (C8592o) obj3, ((Number) obj4).intValue());
                return C11079d2.f28267a;
            }
        }));
    }

    /* renamed from: a */
    public int mo8288a() {
        return this.f6401c.mo8288a();
    }

    @C12580l
    /* renamed from: b */
    public Object mo8289b(int i) {
        return this.f6401c.mo8289b(i);
    }

    @C12579k
    /* renamed from: d */
    public LazyItemScopeImpl mo8290d() {
        return this.f6400b;
    }

    @C8540g
    /* renamed from: e */
    public void mo8291e(int i, @C12580l C8592o oVar, int i2) {
        int i3;
        C8592o o = oVar.mo15009o(-1645068522);
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
                ComposerKt.m29845w0(-1645068522, i3, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item (LazyListItemProvider.kt:-1)");
            }
            this.f6401c.mo8291e(i, o, i3 & 14);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new LazyListItemProviderImpl$Item$1(this, i, i2));
        }
    }

    @C12579k
    /* renamed from: f */
    public Map<Object, Integer> mo8292f() {
        return this.f6401c.mo8292f();
    }

    @C12579k
    /* renamed from: g */
    public Object mo8293g(int i) {
        return this.f6401c.mo8293g(i);
    }

    @C12579k
    /* renamed from: i */
    public List<Integer> mo8294i() {
        return this.f6399a;
    }
}

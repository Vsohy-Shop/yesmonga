package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.C2539c;
import androidx.compose.foundation.lazy.layout.C2549h;
import androidx.compose.foundation.lazy.layout.C2550i;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.C11466l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProvider$1$itemProviderState$1 */
public final class C2577x6d2c3253 extends Lambda implements C11289a<C25781> {
    final /* synthetic */ C8578k2<C11300l<LazyStaggeredGridScope, C11079d2>> $latestContent;
    final /* synthetic */ C8578k2<C11466l> $nearestItemsRangeState;
    final /* synthetic */ LazyStaggeredGridState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2577x6d2c3253(C8578k2<? extends C11300l<? super LazyStaggeredGridScope, C11079d2>> k2Var, C8578k2<C11466l> k2Var2, LazyStaggeredGridState lazyStaggeredGridState) {
        super(0);
        this.$latestContent = k2Var;
        this.$nearestItemsRangeState = k2Var2;
        this.$state = lazyStaggeredGridState;
    }

    @C12579k
    /* renamed from: a */
    public final C25781 invoke() {
        LazyStaggeredGridScopeImpl lazyStaggeredGridScopeImpl = new LazyStaggeredGridScopeImpl();
        this.$latestContent.getValue().invoke(lazyStaggeredGridScopeImpl);
        return new Object(lazyStaggeredGridScopeImpl, this.$nearestItemsRangeState, this.$state) {

            /* renamed from: a */
            public final /* synthetic */ C2549h f6804a;
            @C12579k

            /* renamed from: b */
            public final C2611r f6805b;

            {
                this.f6804a = C2550i.m11424b(r4.mo8893e(), r5.getValue(), C8553b.m31049c(-364721306, true, new C11306r<C2539c.C2540a<? extends C2595d>, Integer, C8592o, Integer, C11079d2>() {
                    @C8540g
                    /* renamed from: a */
                    public final void mo8865a(@C12579k final C2539c.C2540a<C2595d> aVar, int i, @C12580l C8592o oVar, int i2) {
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
                                ComposerKt.m29845w0(-364721306, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridItemProvider.<anonymous>.<anonymous>.<no name provided>.$$delegate_0.<anonymous> (LazyStaggeredGridItemProvider.kt:51)");
                            }
                            final int b = i - aVar.mo8730b();
                            C11300l<Integer, Object> key = aVar.mo8731c().getKey();
                            if (key != null) {
                                obj = key.invoke(Integer.valueOf(b));
                            } else {
                                obj = null;
                            }
                            LazyLayoutPinnableItemKt.m11353a(obj, i, r6.mo8900C(), C8553b.m31048b(oVar, 1181040114, true, new C11304p<C8592o, Integer, C11079d2>() {
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((C8592o) obj, ((Number) obj2).intValue());
                                    return C11079d2.f28267a;
                                }

                                @C8540g
                                public final void invoke(@C12580l C8592o oVar, int i) {
                                    if ((i & 11) != 2 || !oVar.mo15011p()) {
                                        if (ComposerKt.m29813g0()) {
                                            ComposerKt.m29845w0(1181040114, i, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridItemProvider.<anonymous>.<anonymous>.<no name provided>.$$delegate_0.<anonymous>.<anonymous> (LazyStaggeredGridItemProvider.kt:57)");
                                        }
                                        aVar.mo8731c().mo8950a().invoke(C2599h.f6865a, Integer.valueOf(b), oVar, 6);
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
                        mo8865a((C2539c.C2540a) obj, ((Number) obj2).intValue(), (C8592o) obj3, ((Number) obj4).intValue());
                        return C11079d2.f28267a;
                    }
                }));
                this.f6805b = new C2611r(r4.mo8893e());
            }

            /* renamed from: a */
            public int mo8288a() {
                return this.f6804a.mo8288a();
            }

            @C12580l
            /* renamed from: b */
            public Object mo8289b(int i) {
                return this.f6804a.mo8289b(i);
            }

            @C8540g
            /* renamed from: e */
            public void mo8291e(int i, @C12580l C8592o oVar, int i2) {
                oVar.mo14918M(1163616889);
                if (ComposerKt.m29813g0()) {
                    ComposerKt.m29845w0(1163616889, i2, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridItemProvider.<anonymous>.<anonymous>.<no name provided>.Item (LazyStaggeredGridItemProvider.kt:-1)");
                }
                this.f6804a.mo8291e(i, oVar, i2 & 14);
                if (ComposerKt.m29813g0()) {
                    ComposerKt.m29843v0();
                }
                oVar.mo15002m0();
            }

            @C12579k
            /* renamed from: f */
            public Map<Object, Integer> mo8292f() {
                return this.f6804a.mo8292f();
            }

            @C12579k
            /* renamed from: g */
            public Object mo8293g(int i) {
                return this.f6804a.mo8293g(i);
            }

            @C12579k
            /* renamed from: h */
            public C2611r mo8863h() {
                return this.f6805b;
            }
        };
    }
}

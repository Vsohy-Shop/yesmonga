package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.C2855v;
import androidx.compose.foundation.lazy.layout.C2539c;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import java.util.HashMap;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.collections.C10977s0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11466l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C2855v
@C11363r0({"SMAP\nLazyLayoutItemProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutItemProvider.kt\nandroidx/compose/foundation/lazy/layout/DefaultLazyLayoutItemsProvider\n*L\n1#1,231:1\n135#1,3:232\n135#1,3:235\n*S KotlinDebug\n*F\n+ 1 LazyLayoutItemProvider.kt\nandroidx/compose/foundation/lazy/layout/DefaultLazyLayoutItemsProvider\n*L\n122#1:232,3\n127#1:235,3\n*E\n"})
public final class DefaultLazyLayoutItemsProvider<IntervalContent extends LazyLayoutIntervalContent> implements C2549h {
    @C12579k

    /* renamed from: a */
    public final C11306r<C2539c.C2540a<? extends IntervalContent>, Integer, C8592o, Integer, C11079d2> f6684a;
    @C12579k

    /* renamed from: b */
    public final C2539c<IntervalContent> f6685b;
    @C12579k

    /* renamed from: c */
    public final Map<Object, Integer> f6686c;

    public DefaultLazyLayoutItemsProvider(@C12579k C11306r<? super C2539c.C2540a<? extends IntervalContent>, ? super Integer, ? super C8592o, ? super Integer, C11079d2> rVar, @C12579k C2539c<? extends IntervalContent> cVar, @C12579k C11466l lVar) {
        Intrinsics.checkNotNullParameter(rVar, "itemContentProvider");
        Intrinsics.checkNotNullParameter(cVar, "intervals");
        Intrinsics.checkNotNullParameter(lVar, "nearestItemsRange");
        this.f6684a = rVar;
        this.f6685b = cVar;
        this.f6686c = mo8666l(lVar, cVar);
    }

    /* renamed from: a */
    public int mo8288a() {
        return this.f6685b.getSize();
    }

    @C12580l
    /* renamed from: b */
    public Object mo8289b(int i) {
        C2539c.C2540a<IntervalContent> aVar = this.f6685b.get(i);
        return ((LazyLayoutIntervalContent) aVar.mo8731c()).getType().invoke(Integer.valueOf(i - aVar.mo8730b()));
    }

    @C8540g
    /* renamed from: e */
    public void mo8291e(int i, @C12580l C8592o oVar, int i2) {
        int i3;
        int i4;
        int i5;
        C8592o o = oVar.mo15009o(-1877726744);
        if ((i2 & 14) == 0) {
            if (o.mo14976f(i)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            if (o.mo15006n0(this)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 91) != 18 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1877726744, i3, -1, "androidx.compose.foundation.lazy.layout.DefaultLazyLayoutItemsProvider.Item (LazyLayoutItemProvider.kt:116)");
            }
            this.f6684a.invoke(this.f6685b.get(i), Integer.valueOf(i), o, Integer.valueOf((i3 << 3) & 112));
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new DefaultLazyLayoutItemsProvider$Item$1(this, i, i2));
        }
    }

    @C12579k
    /* renamed from: f */
    public Map<Object, Integer> mo8292f() {
        return this.f6686c;
    }

    @C12579k
    /* renamed from: g */
    public Object mo8293g(int i) {
        Object invoke;
        C2539c.C2540a<IntervalContent> aVar = this.f6685b.get(i);
        int b = i - aVar.mo8730b();
        C11300l<Integer, Object> key = ((LazyLayoutIntervalContent) aVar.mo8731c()).getKey();
        if (key == null || (invoke = key.invoke(Integer.valueOf(b))) == null) {
            return C2566s.m11508a(i);
        }
        return invoke;
    }

    @C2855v
    /* renamed from: l */
    public final Map<Object, Integer> mo8666l(C11466l lVar, C2539c<? extends LazyLayoutIntervalContent> cVar) {
        boolean z;
        int r = lVar.mo23049r();
        if (r >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int min = Math.min(lVar.mo23051w(), cVar.getSize() - 1);
            if (min < r) {
                return C10977s0.m41492z();
            }
            HashMap hashMap = new HashMap();
            cVar.mo8726b(r, min, new DefaultLazyLayoutItemsProvider$generateKeyToIndexMap$1$1(r, min, hashMap));
            return hashMap;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @C12579k
    /* renamed from: m */
    public final C2539c<IntervalContent> mo8667m() {
        return this.f6685b;
    }

    @C12579k
    /* renamed from: n */
    public final C11306r<C2539c.C2540a<? extends IntervalContent>, Integer, C8592o, Integer, C11079d2> mo8668n() {
        return this.f6684a;
    }

    /* renamed from: o */
    public final <T> T mo8669o(int i, C11304p<? super Integer, ? super IntervalContent, ? extends T> pVar) {
        C2539c.C2540a<IntervalContent> aVar = this.f6685b.get(i);
        return pVar.invoke(Integer.valueOf(i - aVar.mo8730b()), aVar.mo8731c());
    }
}

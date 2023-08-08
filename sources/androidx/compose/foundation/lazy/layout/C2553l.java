package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.C2855v;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.layout.C15531a;
import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15562f1;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.unit.C16489j;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8547h2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C2855v
@C11363r0({"SMAP\nLazyLayoutMeasureScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutMeasureScope.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n1#2:148\n*E\n"})
/* renamed from: androidx.compose.foundation.lazy.layout.l */
public final class C2553l implements C2552k, C15568h0 {
    @C12579k

    /* renamed from: a */
    public final LazyLayoutItemContentFactory f6729a;
    @C12579k

    /* renamed from: b */
    public final C15562f1 f6730b;
    @C12579k

    /* renamed from: c */
    public final HashMap<Integer, List<C15611w0>> f6731c = new HashMap<>();

    public C2553l(@C12579k LazyLayoutItemContentFactory lazyLayoutItemContentFactory, @C12579k C15562f1 f1Var) {
        Intrinsics.checkNotNullParameter(lazyLayoutItemContentFactory, "itemContentFactory");
        Intrinsics.checkNotNullParameter(f1Var, "subcomposeMeasureScope");
        this.f6729a = lazyLayoutItemContentFactory;
        this.f6730b = f1Var;
    }

    @C8547h2
    /* renamed from: C2 */
    public float mo7415C2(long j) {
        return this.f6730b.mo7415C2(j);
    }

    @C12579k
    /* renamed from: C3 */
    public C15564g0 mo8741C3(int i, int i2, @C12579k Map<C15531a, Integer> map, @C12579k C11300l<? super C15611w0.C15612a, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(map, "alignmentLines");
        Intrinsics.checkNotNullParameter(lVar, "placementBlock");
        return this.f6730b.mo8741C3(i, i2, map, lVar);
    }

    /* renamed from: L */
    public float mo7416L(int i) {
        return this.f6730b.mo7416L(i);
    }

    @C8547h2
    @C12579k
    /* renamed from: L4 */
    public C15098i mo7417L4(@C12579k C16489j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return this.f6730b.mo7417L4(jVar);
    }

    /* renamed from: M */
    public float mo7418M(float f) {
        return this.f6730b.mo7418M(f);
    }

    /* renamed from: R4 */
    public float mo7419R4() {
        return this.f6730b.mo7419R4();
    }

    /* renamed from: V */
    public long mo7420V(long j) {
        return this.f6730b.mo7420V(j);
    }

    @C8547h2
    /* renamed from: g5 */
    public float mo7425g5(float f) {
        return this.f6730b.mo7425g5(f);
    }

    public float getDensity() {
        return this.f6730b.getDensity();
    }

    @C12579k
    public LayoutDirection getLayoutDirection() {
        return this.f6730b.getLayoutDirection();
    }

    /* renamed from: m */
    public long mo7427m(float f) {
        return this.f6730b.mo7427m(f);
    }

    /* renamed from: n */
    public long mo7428n(long j) {
        return this.f6730b.mo7428n(j);
    }

    @C8547h2
    /* renamed from: n2 */
    public int mo7429n2(float f) {
        return this.f6730b.mo7429n2(f);
    }

    /* renamed from: q */
    public float mo7430q(long j) {
        return this.f6730b.mo7430q(j);
    }

    @C12579k
    /* renamed from: s1 */
    public List<C15611w0> mo8740s1(int i, long j) {
        List<C15611w0> list = this.f6731c.get(Integer.valueOf(i));
        if (list != null) {
            return list;
        }
        Object g = this.f6729a.mo8680d().invoke().mo8293g(i);
        List<C15557e0> k0 = this.f6730b.mo44296k0(g, this.f6729a.mo8678b(i, g));
        int size = k0.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(k0.get(i2).mo44324t0(j));
        }
        this.f6731c.put(Integer.valueOf(i), arrayList);
        return arrayList;
    }

    /* renamed from: t */
    public long mo7431t(int i) {
        return this.f6730b.mo7431t(i);
    }

    /* renamed from: u */
    public long mo7432u(float f) {
        return this.f6730b.mo7432u(f);
    }

    @C8547h2
    /* renamed from: u5 */
    public int mo7433u5(long j) {
        return this.f6730b.mo7433u5(j);
    }
}

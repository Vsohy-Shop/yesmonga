package androidx.compose.foundation.text.selection;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.layout.C15588o;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8700z0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.C11079d2;
import kotlin.collections.C10977s0;
import kotlin.collections.C10992w;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.functions.C11307s;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSelectionRegistrarImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionRegistrarImpl.kt\nandroidx/compose/foundation/text/selection/SelectionRegistrarImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,205:1\n76#2:206\n102#2,2:207\n*S KotlinDebug\n*F\n+ 1 SelectionRegistrarImpl.kt\nandroidx/compose/foundation/text/selection/SelectionRegistrarImpl\n*L\n99#1:206\n99#1:207,2\n*E\n"})
public final class SelectionRegistrarImpl implements C2837n {

    /* renamed from: c */
    public boolean f7382c;
    @C12579k

    /* renamed from: d */
    public final List<C2829h> f7383d = new ArrayList();
    @C12579k

    /* renamed from: e */
    public final Map<Long, C2829h> f7384e = new LinkedHashMap();
    @C12579k

    /* renamed from: f */
    public AtomicLong f7385f = new AtomicLong(1);
    @C12580l

    /* renamed from: g */
    public C11300l<? super Long, C11079d2> f7386g;
    @C12580l

    /* renamed from: h */
    public C11305q<? super C15588o, ? super C15094f, ? super SelectionAdjustment, C11079d2> f7387h;
    @C12580l

    /* renamed from: i */
    public C11300l<? super Long, C11079d2> f7388i;
    @C12580l

    /* renamed from: j */
    public C11307s<? super C15588o, ? super C15094f, ? super C15094f, ? super Boolean, ? super SelectionAdjustment, Boolean> f7389j;
    @C12580l

    /* renamed from: k */
    public C11289a<C11079d2> f7390k;
    @C12580l

    /* renamed from: l */
    public C11300l<? super Long, C11079d2> f7391l;
    @C12580l

    /* renamed from: m */
    public C11300l<? super Long, C11079d2> f7392m;
    @C12579k

    /* renamed from: n */
    public final C8700z0 f7393n = C8539f2.m30981g(C10977s0.m41492z(), (C8410b2) null, 2, (Object) null);

    /* renamed from: F */
    public static final int m12820F(C11304p pVar, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(pVar, "$tmp0");
        return ((Number) pVar.invoke(obj, obj2)).intValue();
    }

    /* renamed from: A */
    public final void mo9695A(@C12580l C11300l<? super Long, C11079d2> lVar) {
        this.f7388i = lVar;
    }

    /* renamed from: B */
    public final void mo9696B(@C12580l C11305q<? super C15588o, ? super C15094f, ? super SelectionAdjustment, C11079d2> qVar) {
        this.f7387h = qVar;
    }

    /* renamed from: C */
    public final void mo9697C(boolean z) {
        this.f7382c = z;
    }

    /* renamed from: D */
    public void mo9698D(@C12579k Map<Long, C2830i> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f7393n.setValue(map);
    }

    @C12579k
    /* renamed from: E */
    public final List<C2829h> mo9699E(@C12579k C15588o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "containerLayoutCoordinates");
        if (!this.f7382c) {
            C10992w.m42338m0(this.f7383d, new C2839o(new SelectionRegistrarImpl$sort$1(oVar)));
            this.f7382c = true;
        }
        return mo9718t();
    }

    /* renamed from: a */
    public long mo9700a() {
        long andIncrement = this.f7385f.getAndIncrement();
        while (andIncrement == 0) {
            andIncrement = this.f7385f.getAndIncrement();
        }
        return andIncrement;
    }

    /* renamed from: b */
    public void mo9701b(@C12579k C15588o oVar, long j, @C12579k SelectionAdjustment selectionAdjustment) {
        Intrinsics.checkNotNullParameter(oVar, "layoutCoordinates");
        Intrinsics.checkNotNullParameter(selectionAdjustment, "adjustment");
        C11305q<? super C15588o, ? super C15094f, ? super SelectionAdjustment, C11079d2> qVar = this.f7387h;
        if (qVar != null) {
            qVar.invoke(oVar, C15094f.m64868d(j), selectionAdjustment);
        }
    }

    @C12579k
    /* renamed from: c */
    public Map<Long, C2830i> mo9702c() {
        return (Map) this.f7393n.getValue();
    }

    /* renamed from: d */
    public void mo9703d(long j) {
        this.f7382c = false;
        C11300l<? super Long, C11079d2> lVar = this.f7386g;
        if (lVar != null) {
            lVar.invoke(Long.valueOf(j));
        }
    }

    /* renamed from: e */
    public void mo9704e(@C12579k C2829h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "selectable");
        if (this.f7384e.containsKey(Long.valueOf(hVar.mo9861h()))) {
            this.f7383d.remove(hVar);
            this.f7384e.remove(Long.valueOf(hVar.mo9861h()));
            C11300l<? super Long, C11079d2> lVar = this.f7392m;
            if (lVar != null) {
                lVar.invoke(Long.valueOf(hVar.mo9861h()));
            }
        }
    }

    /* renamed from: f */
    public boolean mo9705f(@C12579k C15588o oVar, long j, long j2, boolean z, @C12579k SelectionAdjustment selectionAdjustment) {
        Intrinsics.checkNotNullParameter(oVar, "layoutCoordinates");
        Intrinsics.checkNotNullParameter(selectionAdjustment, "adjustment");
        C11307s<? super C15588o, ? super C15094f, ? super C15094f, ? super Boolean, ? super SelectionAdjustment, Boolean> sVar = this.f7389j;
        if (sVar == null) {
            return true;
        }
        return sVar.mo7709v5(oVar, C15094f.m64868d(j), C15094f.m64868d(j2), Boolean.valueOf(z), selectionAdjustment).booleanValue();
    }

    /* renamed from: g */
    public void mo9706g(long j) {
        C11300l<? super Long, C11079d2> lVar = this.f7391l;
        if (lVar != null) {
            lVar.invoke(Long.valueOf(j));
        }
    }

    /* renamed from: h */
    public void mo9707h(long j) {
        C11300l<? super Long, C11079d2> lVar = this.f7388i;
        if (lVar != null) {
            lVar.invoke(Long.valueOf(j));
        }
    }

    /* renamed from: i */
    public void mo9708i() {
        C11289a<C11079d2> aVar = this.f7390k;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @C12579k
    /* renamed from: j */
    public C2829h mo9709j(@C12579k C2829h hVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(hVar, "selectable");
        if (hVar.mo9861h() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("The selectable contains an invalid id: " + hVar.mo9861h()).toString());
        } else if (!this.f7384e.containsKey(Long.valueOf(hVar.mo9861h()))) {
            this.f7384e.put(Long.valueOf(hVar.mo9861h()), hVar);
            this.f7383d.add(hVar);
            this.f7382c = false;
            return hVar;
        } else {
            throw new IllegalArgumentException(("Another selectable with the id: " + hVar + ".selectableId has already subscribed.").toString());
        }
    }

    @C12580l
    /* renamed from: l */
    public final C11300l<Long, C11079d2> mo9710l() {
        return this.f7392m;
    }

    @C12580l
    /* renamed from: m */
    public final C11300l<Long, C11079d2> mo9711m() {
        return this.f7386g;
    }

    @C12580l
    /* renamed from: n */
    public final C11300l<Long, C11079d2> mo9712n() {
        return this.f7391l;
    }

    @C12580l
    /* renamed from: o */
    public final C11307s<C15588o, C15094f, C15094f, Boolean, SelectionAdjustment, Boolean> mo9713o() {
        return this.f7389j;
    }

    @C12580l
    /* renamed from: p */
    public final C11289a<C11079d2> mo9714p() {
        return this.f7390k;
    }

    @C12580l
    /* renamed from: q */
    public final C11300l<Long, C11079d2> mo9715q() {
        return this.f7388i;
    }

    @C12580l
    /* renamed from: r */
    public final C11305q<C15588o, C15094f, SelectionAdjustment, C11079d2> mo9716r() {
        return this.f7387h;
    }

    @C12579k
    /* renamed from: s */
    public final Map<Long, C2829h> mo9717s() {
        return this.f7384e;
    }

    @C12579k
    /* renamed from: t */
    public final List<C2829h> mo9718t() {
        return this.f7383d;
    }

    /* renamed from: u */
    public final boolean mo9719u() {
        return this.f7382c;
    }

    /* renamed from: v */
    public final void mo9720v(@C12580l C11300l<? super Long, C11079d2> lVar) {
        this.f7392m = lVar;
    }

    /* renamed from: w */
    public final void mo9721w(@C12580l C11300l<? super Long, C11079d2> lVar) {
        this.f7386g = lVar;
    }

    /* renamed from: x */
    public final void mo9722x(@C12580l C11300l<? super Long, C11079d2> lVar) {
        this.f7391l = lVar;
    }

    /* renamed from: y */
    public final void mo9723y(@C12580l C11307s<? super C15588o, ? super C15094f, ? super C15094f, ? super Boolean, ? super SelectionAdjustment, Boolean> sVar) {
        this.f7389j = sVar;
    }

    /* renamed from: z */
    public final void mo9724z(@C12580l C11289a<C11079d2> aVar) {
        this.f7390k = aVar;
    }
}

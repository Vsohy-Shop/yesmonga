package androidx.activity.compose;

import androidx.activity.C0251r;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.C12579k;

public final class ReportDrawnComposition implements C11289a<C11079d2> {
    @C12579k

    /* renamed from: a */
    public final C0251r f718a;
    @C12579k

    /* renamed from: b */
    public final C11289a<Boolean> f719b;
    @C12579k

    /* renamed from: c */
    public final SnapshotStateObserver f720c;
    @C12579k

    /* renamed from: d */
    public final C11300l<C11289a<Boolean>, C11079d2> f721d = new ReportDrawnComposition$checkReporter$1(this);

    public ReportDrawnComposition(@C12579k C0251r rVar, @C12579k C11289a<Boolean> aVar) {
        Intrinsics.checkNotNullParameter(rVar, "fullyDrawnReporter");
        Intrinsics.checkNotNullParameter(aVar, "predicate");
        this.f718a = rVar;
        this.f719b = aVar;
        SnapshotStateObserver snapshotStateObserver = new SnapshotStateObserver(ReportDrawnComposition$snapshotStateObserver$1.f722f);
        snapshotStateObserver.mo16509v();
        this.f720c = snapshotStateObserver;
        rVar.mo847b(this);
        if (!rVar.mo850e()) {
            rVar.mo848c();
            mo805c(aVar);
        }
    }

    /* renamed from: b */
    public void mo804b() {
        this.f720c.mo16498k();
        this.f720c.mo16510w();
    }

    /* renamed from: c */
    public final void mo805c(C11289a<Boolean> aVar) {
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        this.f720c.mo16505r(aVar, this.f721d, new ReportDrawnComposition$observeReporter$1(booleanRef, aVar));
        if (booleanRef.element) {
            mo806d();
        }
    }

    /* renamed from: d */
    public final void mo806d() {
        this.f720c.mo16499l(this.f719b);
        if (!this.f718a.mo850e()) {
            this.f718a.mo853h();
        }
        mo804b();
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        mo804b();
        return C11079d2.f28267a;
    }
}

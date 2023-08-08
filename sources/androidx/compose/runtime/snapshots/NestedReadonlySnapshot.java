package androidx.compose.runtime.snapshots;

import androidx.constraintlayout.widget.C16934c;
import java.util.HashSet;
import kotlin.C11079d2;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class NestedReadonlySnapshot extends C8646f {
    @C12579k

    /* renamed from: g */
    public final C8646f f23116g;
    @C12580l

    /* renamed from: h */
    public final C11300l<Object, C11079d2> f23117h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NestedReadonlySnapshot(int i, @C12579k SnapshotIdSet snapshotIdSet, @C12580l C11300l<Object, C11079d2> lVar, @C12579k C8646f fVar) {
        super(i, snapshotIdSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(snapshotIdSet, "invalid");
        Intrinsics.checkNotNullParameter(fVar, C16934c.f44493V1);
        this.f23116g = fVar;
        fVar.mo16416q(this);
        if (lVar != null) {
            C11300l<Object, C11079d2> j = fVar.mo16429j();
            if (j != null) {
                lVar = new NestedReadonlySnapshot$readObserver$1$1$1(lVar, j);
            }
        } else {
            lVar = fVar.mo16429j();
        }
        this.f23117h = lVar;
    }

    @C12580l
    /* renamed from: G */
    public HashSet<C8635a0> mo16428i() {
        return null;
    }

    @C12579k
    /* renamed from: H */
    public final C8646f mo16423H() {
        return this.f23116g;
    }

    @C12579k
    /* renamed from: I */
    public Void mo16416q(@C12579k C8646f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "snapshot");
        C8669u.m31848b();
        throw new KotlinNothingValueException();
    }

    @C12579k
    /* renamed from: J */
    public Void mo16417r(@C12579k C8646f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "snapshot");
        C8669u.m31848b();
        throw new KotlinNothingValueException();
    }

    @C12579k
    /* renamed from: K */
    public Void mo16434t(@C12579k C8635a0 a0Var) {
        Intrinsics.checkNotNullParameter(a0Var, "state");
        Void unused = SnapshotKt.m31467Y();
        throw new KotlinNothingValueException();
    }

    @C12579k
    /* renamed from: L */
    public NestedReadonlySnapshot mo16410A(@C12580l C11300l<Object, C11079d2> lVar) {
        return new NestedReadonlySnapshot(mo16599g(), mo16600h(), lVar, this.f23116g);
    }

    /* renamed from: d */
    public void mo16415d() {
        if (!mo16615f()) {
            if (mo16599g() != this.f23116g.mo16599g()) {
                mo16613b();
            }
            this.f23116g.mo16417r(this);
            super.mo16415d();
        }
    }

    @C12580l
    /* renamed from: j */
    public C11300l<Object, C11079d2> mo16429j() {
        return this.f23117h;
    }

    /* renamed from: k */
    public boolean mo16430k() {
        return true;
    }

    @C12579k
    /* renamed from: l */
    public C8646f mo16431l() {
        return this.f23116g.mo16431l();
    }

    @C12580l
    /* renamed from: m */
    public C11300l<Object, C11079d2> mo16432m() {
        return null;
    }

    /* renamed from: n */
    public boolean mo16433n() {
        return false;
    }

    /* renamed from: s */
    public void mo16418s() {
    }
}

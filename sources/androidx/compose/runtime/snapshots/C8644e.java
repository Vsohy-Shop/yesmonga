package androidx.compose.runtime.snapshots;

import java.util.HashSet;
import kotlin.C11079d2;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.runtime.snapshots.e */
public final class C8644e extends C8646f {
    @C12580l

    /* renamed from: g */
    public final C11300l<Object, C11079d2> f23188g;

    /* renamed from: h */
    public int f23189h = 1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8644e(int i, @C12579k SnapshotIdSet snapshotIdSet, @C12580l C11300l<Object, C11079d2> lVar) {
        super(i, snapshotIdSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(snapshotIdSet, "invalid");
        this.f23188g = lVar;
    }

    @C12579k
    /* renamed from: A */
    public C8646f mo16410A(@C12580l C11300l<Object, C11079d2> lVar) {
        SnapshotKt.m31482g0(this);
        return new NestedReadonlySnapshot(mo16599g(), mo16600h(), lVar, this);
    }

    @C12580l
    /* renamed from: G */
    public HashSet<C8635a0> mo16428i() {
        return null;
    }

    /* renamed from: H */
    public void mo16604H(@C12580l HashSet<C8635a0> hashSet) {
        C8669u.m31848b();
        throw new KotlinNothingValueException();
    }

    /* renamed from: d */
    public void mo16415d() {
        if (!mo16615f()) {
            mo16417r(this);
            super.mo16415d();
        }
    }

    @C12580l
    /* renamed from: j */
    public C11300l<Object, C11079d2> mo16429j() {
        return this.f23188g;
    }

    /* renamed from: k */
    public boolean mo16430k() {
        return true;
    }

    @C12579k
    /* renamed from: l */
    public C8646f mo16431l() {
        return this;
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

    /* renamed from: q */
    public void mo16416q(@C12579k C8646f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "snapshot");
        this.f23189h++;
    }

    /* renamed from: r */
    public void mo16417r(@C12579k C8646f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "snapshot");
        int i = this.f23189h - 1;
        this.f23189h = i;
        if (i == 0) {
            mo16613b();
        }
    }

    /* renamed from: s */
    public void mo16418s() {
    }

    /* renamed from: t */
    public void mo16434t(@C12579k C8635a0 a0Var) {
        Intrinsics.checkNotNullParameter(a0Var, "state");
        Void unused = SnapshotKt.m31467Y();
        throw new KotlinNothingValueException();
    }
}

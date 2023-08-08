package androidx.compose.animation;

import androidx.compose.animation.core.C1956d0;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.runtime.C8585m0;
import com.urbanairship.iam.C9168d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
public final class ChangeSize {
    @C12579k

    /* renamed from: a */
    public final C8734c f5214a;
    @C12579k

    /* renamed from: b */
    public final C11300l<C16500q, C16500q> f5215b;
    @C12579k

    /* renamed from: c */
    public final C1956d0<C16500q> f5216c;

    /* renamed from: d */
    public final boolean f5217d;

    public ChangeSize(@C12579k C8734c cVar, @C12579k C11300l<? super C16500q, C16500q> lVar, @C12579k C1956d0<C16500q> d0Var, boolean z) {
        Intrinsics.checkNotNullParameter(cVar, C9168d0.f24891y);
        Intrinsics.checkNotNullParameter(lVar, C9168d0.f24889w);
        Intrinsics.checkNotNullParameter(d0Var, "animationSpec");
        this.f5214a = cVar;
        this.f5215b = lVar;
        this.f5216c = d0Var;
        this.f5217d = z;
    }

    /* renamed from: f */
    public static /* synthetic */ ChangeSize m7769f(ChangeSize changeSize, C8734c cVar, C11300l<C16500q, C16500q> lVar, C1956d0<C16500q> d0Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            cVar = changeSize.f5214a;
        }
        if ((i & 2) != 0) {
            lVar = changeSize.f5215b;
        }
        if ((i & 4) != 0) {
            d0Var = changeSize.f5216c;
        }
        if ((i & 8) != 0) {
            z = changeSize.f5217d;
        }
        return changeSize.mo6496e(cVar, lVar, d0Var, z);
    }

    @C12579k
    /* renamed from: a */
    public final C8734c mo6492a() {
        return this.f5214a;
    }

    @C12579k
    /* renamed from: b */
    public final C11300l<C16500q, C16500q> mo6493b() {
        return this.f5215b;
    }

    @C12579k
    /* renamed from: c */
    public final C1956d0<C16500q> mo6494c() {
        return this.f5216c;
    }

    /* renamed from: d */
    public final boolean mo6495d() {
        return this.f5217d;
    }

    @C12579k
    /* renamed from: e */
    public final ChangeSize mo6496e(@C12579k C8734c cVar, @C12579k C11300l<? super C16500q, C16500q> lVar, @C12579k C1956d0<C16500q> d0Var, boolean z) {
        Intrinsics.checkNotNullParameter(cVar, C9168d0.f24891y);
        Intrinsics.checkNotNullParameter(lVar, C9168d0.f24889w);
        Intrinsics.checkNotNullParameter(d0Var, "animationSpec");
        return new ChangeSize(cVar, lVar, d0Var, z);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangeSize)) {
            return false;
        }
        ChangeSize changeSize = (ChangeSize) obj;
        return Intrinsics.areEqual((Object) this.f5214a, (Object) changeSize.f5214a) && Intrinsics.areEqual((Object) this.f5215b, (Object) changeSize.f5215b) && Intrinsics.areEqual((Object) this.f5216c, (Object) changeSize.f5216c) && this.f5217d == changeSize.f5217d;
    }

    @C12579k
    /* renamed from: g */
    public final C8734c mo6498g() {
        return this.f5214a;
    }

    @C12579k
    /* renamed from: h */
    public final C1956d0<C16500q> mo6499h() {
        return this.f5216c;
    }

    public int hashCode() {
        int hashCode = ((((this.f5214a.hashCode() * 31) + this.f5215b.hashCode()) * 31) + this.f5216c.hashCode()) * 31;
        boolean z = this.f5217d;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    /* renamed from: i */
    public final boolean mo6501i() {
        return this.f5217d;
    }

    @C12579k
    /* renamed from: j */
    public final C11300l<C16500q, C16500q> mo6502j() {
        return this.f5215b;
    }

    @C12579k
    public String toString() {
        return "ChangeSize(alignment=" + this.f5214a + ", size=" + this.f5215b + ", animationSpec=" + this.f5216c + ", clip=" + this.f5217d + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChangeSize(C8734c cVar, C11300l lVar, C1956d0 d0Var, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, (i & 2) != 0 ? C19051.f5218f : lVar, d0Var, (i & 8) != 0 ? true : z);
    }
}

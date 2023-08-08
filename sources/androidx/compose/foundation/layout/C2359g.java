package androidx.compose.foundation.layout;

import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.layout.C15605u0;
import androidx.compose.p004ui.platform.C15983v0;
import androidx.compose.p004ui.platform.C15988w0;
import androidx.compose.p004ui.platform.InspectableValueKt;
import androidx.compose.p004ui.unit.C16479d;
import com.urbanairship.iam.C9168d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.foundation.layout.g */
public final class C2359g extends C15988w0 implements C15605u0 {
    @C12579k

    /* renamed from: d */
    public C8734c f6269d;

    /* renamed from: e */
    public boolean f6270e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2359g(C8734c cVar, boolean z, C11300l<C15983v0, C11079d2> lVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, (i & 2) != 0 ? false : z, (i & 4) != 0 ? InspectableValueKt.m71060b() : lVar);
    }

    public boolean equals(@C12580l Object obj) {
        C2359g gVar;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2359g) {
            gVar = (C2359g) obj;
        } else {
            gVar = null;
        }
        if (gVar == null) {
            return false;
        }
        if (!Intrinsics.areEqual((Object) this.f6269d, (Object) gVar.f6269d) || this.f6270e != gVar.f6270e) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f6269d.hashCode() * 31) + Boolean.hashCode(this.f6270e);
    }

    @C12579k
    /* renamed from: r */
    public final C8734c mo8061r() {
        return this.f6269d;
    }

    /* renamed from: s */
    public final boolean mo8062s() {
        return this.f6270e;
    }

    @C12579k
    /* renamed from: t */
    public C2359g mo6431N(@C12579k C16479d dVar, @C12580l Object obj) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return this;
    }

    @C12579k
    public String toString() {
        return "BoxChildData(alignment=" + this.f6269d + ", matchParentSize=" + this.f6270e + ')';
    }

    /* renamed from: u */
    public final void mo8065u(@C12579k C8734c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f6269d = cVar;
    }

    /* renamed from: v */
    public final void mo8066v(boolean z) {
        this.f6270e = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2359g(@C12579k C8734c cVar, boolean z, @C12579k C11300l<? super C15983v0, C11079d2> lVar) {
        super(lVar);
        Intrinsics.checkNotNullParameter(cVar, C9168d0.f24891y);
        Intrinsics.checkNotNullParameter(lVar, "inspectorInfo");
        this.f6269d = cVar;
        this.f6270e = z;
    }
}

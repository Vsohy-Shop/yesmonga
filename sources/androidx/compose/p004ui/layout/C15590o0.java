package androidx.compose.p004ui.layout;

import androidx.compose.p004ui.platform.C15983v0;
import androidx.compose.p004ui.platform.C15988w0;
import com.google.maps.android.data.geojson.C33834i;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.layout.o0 */
public final class C15590o0 extends C15988w0 implements C15586n0 {
    @C12579k

    /* renamed from: d */
    public final C11300l<C15588o, C11079d2> f38738d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15590o0(@C12579k C11300l<? super C15588o, C11079d2> lVar, @C12579k C11300l<? super C15983v0, C11079d2> lVar2) {
        super(lVar2);
        Intrinsics.checkNotNullParameter(lVar, C10108c.f27778C);
        Intrinsics.checkNotNullParameter(lVar2, "inspectorInfo");
        this.f38738d = lVar;
    }

    /* renamed from: O */
    public void mo8241O(@C12579k C15588o oVar) {
        Intrinsics.checkNotNullParameter(oVar, C33834i.f82018j);
        this.f38738d.invoke(oVar);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15590o0)) {
            return false;
        }
        return Intrinsics.areEqual((Object) this.f38738d, (Object) ((C15590o0) obj).f38738d);
    }

    public int hashCode() {
        return this.f38738d.hashCode();
    }

    @C12579k
    /* renamed from: r */
    public final C11300l<C15588o, C11079d2> mo44443r() {
        return this.f38738d;
    }
}

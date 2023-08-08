package androidx.compose.p004ui.layout;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.node.C15738v;
import com.google.maps.android.data.geojson.C33834i;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.layout.q0 */
public final class C15595q0 extends C8767m.C8772d implements C15738v {
    @C12579k

    /* renamed from: z */
    public C11300l<? super C15588o, C11079d2> f38739z;

    public C15595q0(@C12579k C11300l<? super C15588o, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, C10108c.f27778C);
        this.f38739z = lVar;
    }

    @C12579k
    /* renamed from: j0 */
    public final C11300l<C15588o, C11079d2> mo44444j0() {
        return this.f38739z;
    }

    /* renamed from: k0 */
    public final void mo44445k0(@C12579k C11300l<? super C15588o, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<set-?>");
        this.f38739z = lVar;
    }

    /* renamed from: p */
    public void mo44446p(@C12579k C15588o oVar) {
        Intrinsics.checkNotNullParameter(oVar, C33834i.f82018j);
        this.f38739z.invoke(oVar);
    }
}

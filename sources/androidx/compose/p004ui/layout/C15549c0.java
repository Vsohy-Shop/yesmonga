package androidx.compose.p004ui.layout;

import androidx.compose.p004ui.C8767m;
import com.google.maps.android.data.geojson.C33834i;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.layout.c0 */
public final class C15549c0 implements C8767m.C8770c {
    @C12579k

    /* renamed from: a */
    public final C11304p<C15617y, C15617y, C11079d2> f38705a;
    @C12579k

    /* renamed from: b */
    public final C11289a<C15617y> f38706b;

    public C15549c0(@C12579k C11304p<? super C15617y, ? super C15617y, C11079d2> pVar, @C12579k C11289a<? extends C15617y> aVar) {
        Intrinsics.checkNotNullParameter(pVar, C10108c.f27778C);
        Intrinsics.checkNotNullParameter(aVar, "rootCoordinates");
        this.f38705a = pVar;
        this.f38706b = aVar;
    }

    @C12579k
    /* renamed from: a */
    public final C11304p<C15617y, C15617y, C11079d2> mo44376a() {
        return this.f38705a;
    }

    @C12579k
    /* renamed from: b */
    public final C11289a<C15617y> mo44377b() {
        return this.f38706b;
    }

    /* renamed from: e */
    public final void mo44378e(@C12579k C15617y yVar) {
        Intrinsics.checkNotNullParameter(yVar, C33834i.f82018j);
        this.f38705a.invoke(this.f38706b.invoke(), yVar);
    }
}

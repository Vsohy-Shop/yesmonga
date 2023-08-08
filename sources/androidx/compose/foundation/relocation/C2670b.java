package androidx.compose.foundation.relocation;

import androidx.compose.p004ui.layout.C15588o;
import androidx.compose.p004ui.layout.C15592p0;
import androidx.compose.p004ui.modifier.C15627d;
import androidx.compose.p004ui.modifier.C15636k;
import com.google.maps.android.data.geojson.C33834i;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nBringIntoView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoView.kt\nandroidx/compose/foundation/relocation/BringIntoViewChildModifier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n1#2:99\n*E\n"})
/* renamed from: androidx.compose.foundation.relocation.b */
public abstract class C2670b implements C15627d, C15592p0 {
    @C12579k

    /* renamed from: a */
    public final C2671c f7038a;
    @C12580l

    /* renamed from: b */
    public C2671c f7039b;
    @C12580l

    /* renamed from: c */
    public C15588o f7040c;

    public C2670b(@C12579k C2671c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "defaultParent");
        this.f7038a = cVar;
    }

    /* renamed from: V3 */
    public void mo7151V3(@C12579k C15636k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "scope");
        this.f7039b = (C2671c) kVar.mo44518a(BringIntoViewKt.m12015a());
    }

    @C12580l
    /* renamed from: b */
    public final C15588o mo9143b() {
        C15588o oVar = this.f7040c;
        if (oVar == null || !oVar.mo44436k()) {
            return null;
        }
        return oVar;
    }

    @C12579k
    /* renamed from: e */
    public final C2671c mo9144e() {
        C2671c cVar = this.f7039b;
        return cVar == null ? this.f7038a : cVar;
    }

    /* renamed from: p */
    public void mo7338p(@C12579k C15588o oVar) {
        Intrinsics.checkNotNullParameter(oVar, C33834i.f82018j);
        this.f7040c = oVar;
    }
}

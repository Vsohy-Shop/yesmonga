package androidx.compose.foundation;

import androidx.compose.p004ui.layout.C15586n0;
import androidx.compose.p004ui.layout.C15588o;
import androidx.compose.p004ui.modifier.C15627d;
import androidx.compose.p004ui.modifier.C15636k;
import com.google.maps.android.data.geojson.C33834i;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nFocusedBounds.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusedBounds.kt\nandroidx/compose/foundation/FocusedBoundsModifier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n1#2:124\n*E\n"})
/* renamed from: androidx.compose.foundation.x */
public final class C2860x implements C15627d, C15586n0 {
    @C12580l

    /* renamed from: a */
    public C11300l<? super C15588o, C11079d2> f7488a;
    @C12580l

    /* renamed from: b */
    public C15588o f7489b;

    /* renamed from: O */
    public void mo8241O(@C12579k C15588o oVar) {
        Intrinsics.checkNotNullParameter(oVar, C33834i.f82018j);
        this.f7489b = oVar;
        if (oVar.mo44436k()) {
            mo9937a();
            return;
        }
        C11300l<? super C15588o, C11079d2> lVar = this.f7488a;
        if (lVar != null) {
            lVar.invoke(null);
        }
    }

    /* renamed from: V3 */
    public void mo7151V3(@C12579k C15636k kVar) {
        C11300l<? super C15588o, C11079d2> lVar;
        Intrinsics.checkNotNullParameter(kVar, "scope");
        C11300l<? super C15588o, C11079d2> lVar2 = (C11300l) kVar.mo44518a(FocusedBoundsKt.m8944a());
        if (lVar2 == null && (lVar = this.f7488a) != null) {
            lVar.invoke(null);
        }
        this.f7488a = lVar2;
    }

    /* renamed from: a */
    public final void mo9937a() {
        C11300l<? super C15588o, C11079d2> lVar;
        C15588o oVar = this.f7489b;
        if (oVar != null) {
            Intrinsics.checkNotNull(oVar);
            if (oVar.mo44436k() && (lVar = this.f7488a) != null) {
                lVar.invoke(this.f7489b);
            }
        }
    }
}

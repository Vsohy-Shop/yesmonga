package androidx.compose.foundation;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.C0376v0;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.layout.C15586n0;
import androidx.compose.p004ui.layout.C15588o;
import androidx.compose.p004ui.layout.C15591p;
import androidx.compose.runtime.collection.C8423g;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.google.maps.android.data.geojson.C33834i;
import java.util.List;
import kotlin.comparisons.C11016h;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.C11409d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C0376v0(29)
@C11363r0({"SMAP\nSystemGestureExclusion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SystemGestureExclusion.kt\nandroidx/compose/foundation/ExcludeFromSystemGestureModifier\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,162:1\n1182#2:163\n1161#2,2:164\n138#3:166\n728#3,2:168\n1#4:167\n*S KotlinDebug\n*F\n+ 1 SystemGestureExclusion.kt\nandroidx/compose/foundation/ExcludeFromSystemGestureModifier\n*L\n117#1:163\n117#1:164,2\n118#1:166\n123#1:168,2\n*E\n"})
/* renamed from: androidx.compose.foundation.t */
public final class C2695t implements C15586n0 {
    @C12579k

    /* renamed from: a */
    public final View f7058a;
    @C12580l

    /* renamed from: b */
    public final C11300l<C15588o, C15098i> f7059b;
    @C12580l

    /* renamed from: c */
    public Rect f7060c;

    public C2695t(@C12579k View view, @C12580l C11300l<? super C15588o, C15098i> lVar) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        this.f7058a = view;
        this.f7059b = lVar;
    }

    /* renamed from: O */
    public void mo8241O(@C12579k C15588o oVar) {
        Rect rect;
        Intrinsics.checkNotNullParameter(oVar, C33834i.f82018j);
        C11300l<C15588o, C15098i> lVar = this.f7059b;
        if (lVar == null) {
            C15098i b = C15591p.m69300b(oVar);
            rect = new Rect(C11409d.m43851L0(b.mo42279t()), C11409d.m43851L0(b.mo42249B()), C11409d.m43851L0(b.mo42283x()), C11409d.m43851L0(b.mo42271j()));
        } else {
            rect = mo9205a(oVar, lVar.invoke(oVar));
        }
        mo9211n(rect);
    }

    /* renamed from: a */
    public final Rect mo9205a(C15588o oVar, C15098i iVar) {
        C15588o oVar2 = oVar;
        C15588o b = mo9206b(oVar);
        long K = b.mo44430K(oVar2, iVar.mo42251E());
        long K2 = b.mo44430K(oVar2, iVar.mo42252F());
        long K3 = b.mo44430K(oVar2, iVar.mo42273m());
        long K4 = b.mo44430K(oVar2, iVar.mo42274n());
        return new Rect(C11409d.m43851L0(C11016h.m42468l0(C15094f.m64880p(K), C15094f.m64880p(K2), C15094f.m64880p(K3), C15094f.m64880p(K4))), C11409d.m43851L0(C11016h.m42468l0(C15094f.m64882r(K), C15094f.m64882r(K2), C15094f.m64882r(K3), C15094f.m64882r(K4))), C11409d.m43851L0(C11016h.m42447Q(C15094f.m64880p(K), C15094f.m64880p(K2), C15094f.m64880p(K3), C15094f.m64880p(K4))), C11409d.m43851L0(C11016h.m42447Q(C15094f.m64882r(K), C15094f.m64882r(K2), C15094f.m64882r(K3), C15094f.m64882r(K4))));
    }

    /* renamed from: b */
    public final C15588o mo9206b(C15588o oVar) {
        C15588o w0 = oVar.mo44438w0();
        while (true) {
            C15588o oVar2 = w0;
            C15588o oVar3 = oVar;
            oVar = oVar2;
            if (oVar == null) {
                return oVar3;
            }
            w0 = oVar.mo44438w0();
        }
    }

    @C12580l
    /* renamed from: e */
    public final C11300l<C15588o, C15098i> mo9207e() {
        return this.f7059b;
    }

    @C12580l
    /* renamed from: g */
    public final Rect mo9208g() {
        return this.f7060c;
    }

    @C12579k
    /* renamed from: l */
    public final View mo9209l() {
        return this.f7058a;
    }

    /* renamed from: m */
    public final void mo9210m() {
        mo9211n((Rect) null);
    }

    /* renamed from: n */
    public final void mo9211n(@C12580l Rect rect) {
        boolean z = false;
        C8423g gVar = new C8423g(new Rect[16], 0);
        List a = this.f7058a.getSystemGestureExclusionRects();
        Intrinsics.checkNotNullExpressionValue(a, "view.systemGestureExclusionRects");
        gVar.mo15468h(gVar.mo15469h0(), a);
        Rect rect2 = this.f7060c;
        if (rect2 != null) {
            gVar.mo15495z0(rect2);
        }
        if (rect != null && !rect.isEmpty()) {
            z = true;
        }
        if (z) {
            gVar.mo15463e(rect);
        }
        this.f7058a.setSystemGestureExclusionRects(gVar.mo15485s());
        this.f7060c = rect;
    }

    /* renamed from: o */
    public final void mo9212o(@C12580l Rect rect) {
        this.f7060c = rect;
    }
}

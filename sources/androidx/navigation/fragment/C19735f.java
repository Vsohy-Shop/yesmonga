package androidx.navigation.fragment;

import androidx.annotation.C0329d0;
import androidx.fragment.app.C19215c;
import androidx.navigation.C19695c0;
import com.carrefour.fid.android.product.presentation.p039ui.details.views.EnergyLabelKt;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11494d;

/* renamed from: androidx.navigation.fragment.f */
public final class C19735f {
    @C11395k(message = "Use routes to create your DialogFragmentDestination instead", replaceWith = @C11587t0(expression = "dialog<F>(route = id.toString())", imports = {}))
    /* renamed from: a */
    public static final /* synthetic */ <F extends C19215c> void m91823a(C19695c0 c0Var, @C0329d0 int i) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        Intrinsics.reifiedOperationMarker(4, EnergyLabelKt.f67711i);
        c0Var.mo58345m(new C19734e((C19731d) c0Var.mo58346n().mo58561e(C19731d.class), i, (C11494d<? extends C19215c>) C11342l0.m43547d(C19215c.class)));
    }

    @C11395k(message = "Use routes to create your DialogFragmentDestination instead", replaceWith = @C11587t0(expression = "dialog<F>(route = id.toString()) { builder.invoke() }", imports = {}))
    /* renamed from: b */
    public static final /* synthetic */ <F extends C19215c> void m91824b(C19695c0 c0Var, @C0329d0 int i, C11300l<? super C19734e, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "builder");
        Intrinsics.reifiedOperationMarker(4, EnergyLabelKt.f67711i);
        C19734e eVar = new C19734e((C19731d) c0Var.mo58346n().mo58561e(C19731d.class), i, (C11494d<? extends C19215c>) C11342l0.m43547d(C19215c.class));
        lVar.invoke(eVar);
        c0Var.mo58345m(eVar);
    }

    /* renamed from: c */
    public static final /* synthetic */ <F extends C19215c> void m91825c(C19695c0 c0Var, String str) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        Intrinsics.checkNotNullParameter(str, "route");
        Intrinsics.reifiedOperationMarker(4, EnergyLabelKt.f67711i);
        c0Var.mo58345m(new C19734e((C19731d) c0Var.mo58346n().mo58561e(C19731d.class), str, (C11494d<? extends C19215c>) C11342l0.m43547d(C19215c.class)));
    }

    /* renamed from: d */
    public static final /* synthetic */ <F extends C19215c> void m91826d(C19695c0 c0Var, String str, C11300l<? super C19734e, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        Intrinsics.checkNotNullParameter(str, "route");
        Intrinsics.checkNotNullParameter(lVar, "builder");
        Intrinsics.reifiedOperationMarker(4, EnergyLabelKt.f67711i);
        C19734e eVar = new C19734e((C19731d) c0Var.mo58346n().mo58561e(C19731d.class), str, (C11494d<? extends C19215c>) C11342l0.m43547d(C19215c.class));
        lVar.invoke(eVar);
        c0Var.mo58345m(eVar);
    }
}

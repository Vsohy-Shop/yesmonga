package androidx.navigation.fragment;

import androidx.annotation.C0329d0;
import androidx.fragment.app.Fragment;
import androidx.navigation.C19695c0;
import com.carrefour.fid.android.product.presentation.p039ui.details.views.EnergyLabelKt;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11494d;

/* renamed from: androidx.navigation.fragment.j */
public final class C19743j {
    @C11395k(message = "Use routes to create your FragmentDestination instead", replaceWith = @C11587t0(expression = "fragment<F>(route = id.toString())", imports = {}))
    /* renamed from: a */
    public static final /* synthetic */ <F extends Fragment> void m91845a(C19695c0 c0Var, @C0329d0 int i) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        Intrinsics.reifiedOperationMarker(4, EnergyLabelKt.f67711i);
        c0Var.mo58345m(new C19742i((C19737h) c0Var.mo58346n().mo58561e(C19737h.class), i, (C11494d<? extends Fragment>) C11342l0.m43547d(Fragment.class)));
    }

    @C11395k(message = "Use routes to create your FragmentDestination instead", replaceWith = @C11587t0(expression = "fragment<F>(route = id.toString()) { builder.invoke() }", imports = {}))
    /* renamed from: b */
    public static final /* synthetic */ <F extends Fragment> void m91846b(C19695c0 c0Var, @C0329d0 int i, C11300l<? super C19742i, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "builder");
        Intrinsics.reifiedOperationMarker(4, EnergyLabelKt.f67711i);
        C19742i iVar = new C19742i((C19737h) c0Var.mo58346n().mo58561e(C19737h.class), i, (C11494d<? extends Fragment>) C11342l0.m43547d(Fragment.class));
        lVar.invoke(iVar);
        c0Var.mo58345m(iVar);
    }

    /* renamed from: c */
    public static final /* synthetic */ <F extends Fragment> void m91847c(C19695c0 c0Var, String str) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        Intrinsics.checkNotNullParameter(str, "route");
        Intrinsics.reifiedOperationMarker(4, EnergyLabelKt.f67711i);
        c0Var.mo58345m(new C19742i((C19737h) c0Var.mo58346n().mo58561e(C19737h.class), str, (C11494d<? extends Fragment>) C11342l0.m43547d(Fragment.class)));
    }

    /* renamed from: d */
    public static final /* synthetic */ <F extends Fragment> void m91848d(C19695c0 c0Var, String str, C11300l<? super C19742i, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        Intrinsics.checkNotNullParameter(str, "route");
        Intrinsics.checkNotNullParameter(lVar, "builder");
        Intrinsics.reifiedOperationMarker(4, EnergyLabelKt.f67711i);
        C19742i iVar = new C19742i((C19737h) c0Var.mo58346n().mo58561e(C19737h.class), str, (C11494d<? extends Fragment>) C11342l0.m43547d(Fragment.class));
        lVar.invoke(iVar);
        c0Var.mo58345m(iVar);
    }
}

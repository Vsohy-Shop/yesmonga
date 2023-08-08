package androidx.hilt.navigation.compose;

import android.content.Context;
import androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.hilt.navigation.C19284a;
import androidx.lifecycle.C19395b1;
import androidx.lifecycle.C19476v0;
import androidx.lifecycle.C19502x0;
import androidx.lifecycle.viewmodel.compose.C19490c;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.navigation.NavBackStackEntry;
import kotlin.C11532s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.hilt.navigation.compose.a */
public final class C19298a {
    @C8540g
    @C12580l
    @C11532s0
    /* renamed from: a */
    public static final C19502x0.C19506b m90444a(@C12579k C19395b1 b1Var, @C12580l C8592o oVar, int i) {
        C19502x0.C19506b bVar;
        Intrinsics.checkNotNullParameter(b1Var, "viewModelStoreOwner");
        oVar.mo14918M(1770922558);
        if (b1Var instanceof NavBackStackEntry) {
            bVar = C19284a.m90443a((Context) oVar.mo15032w(AndroidCompositionLocals_androidKt.m70952g()), (NavBackStackEntry) b1Var);
        } else {
            bVar = null;
        }
        oVar.mo15002m0();
        return bVar;
    }

    @C8540g
    /* renamed from: b */
    public static final /* synthetic */ <VM extends C19476v0> VM m90445b(C19395b1 b1Var, C8592o oVar, int i, int i2) {
        oVar.mo14918M(-550968255);
        if ((i2 & 1) == 0 || (b1Var = LocalViewModelStoreOwner.f49869a.mo57681a(oVar, 8)) != null) {
            C19395b1 b1Var2 = b1Var;
            C19502x0.C19506b a = m90444a(b1Var2, oVar, 8);
            oVar.mo14918M(564614654);
            Intrinsics.reifiedOperationMarker(4, "VM");
            VM f = C19490c.m90838f(C19476v0.class, b1Var2, (String) null, a, oVar, 4168, 0);
            oVar.mo15002m0();
            oVar.mo15002m0();
            return f;
        }
        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
    }
}

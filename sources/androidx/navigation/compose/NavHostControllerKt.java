package androidx.navigation.compose;

import android.content.Context;
import androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.saveable.C8628e;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.navigation.C19754h0;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import java.util.Arrays;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class NavHostControllerKt {
    /* renamed from: a */
    public static final C8628e<C19754h0, ?> m91705a(Context context) {
        return SaverKt.m31375a(NavHostControllerKt$NavControllerSaver$1.f50504f, new NavHostControllerKt$NavControllerSaver$2(context));
    }

    /* renamed from: c */
    public static final C19754h0 m91707c(Context context) {
        C19754h0 h0Var = new C19754h0(context);
        h0Var.mo58113N().mo58559b(new C19710b());
        h0Var.mo58113N().mo58559b(new C19714d());
        return h0Var;
    }

    @C8540g
    @C12579k
    /* renamed from: d */
    public static final C8578k2<NavBackStackEntry> m91708d(@C12579k NavController navController, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(navController, "<this>");
        oVar.mo14918M(-120375203);
        C8578k2<NavBackStackEntry> a = C8415c2.m30232a(navController.mo58101H(), null, (CoroutineContext) null, oVar, 56, 2);
        oVar.mo15002m0();
        return a;
    }

    @C8540g
    @C12579k
    /* renamed from: e */
    public static final C19754h0 m91709e(@C12579k Navigator<? extends NavDestination>[] navigatorArr, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(navigatorArr, "navigators");
        oVar.mo14918M(-312215566);
        Context context = (Context) oVar.mo15032w(AndroidCompositionLocals_androidKt.m70952g());
        C19754h0 h0Var = (C19754h0) RememberSaveableKt.m31343d(Arrays.copyOf(navigatorArr, navigatorArr.length), m91705a(context), (String) null, new NavHostControllerKt$rememberNavController$1(context), oVar, 72, 4);
        for (Navigator<? extends NavDestination> b : navigatorArr) {
            h0Var.mo58113N().mo58559b(b);
        }
        oVar.mo15002m0();
        return h0Var;
    }
}

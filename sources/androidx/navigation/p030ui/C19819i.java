package androidx.navigation.p030ui;

import androidx.customview.widget.C18552c;
import androidx.navigation.NavController;
import androidx.navigation.p030ui.AppBarConfigurationKt;
import androidx.navigation.p030ui.C19812d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.navigation.ui.i */
public final class C19819i {
    /* renamed from: a */
    public static final boolean m92145a(@C12579k NavController navController, @C12580l C18552c cVar) {
        Intrinsics.checkNotNullParameter(navController, "<this>");
        return C19827p.m92170k(navController, new C19812d.C19813a(navController.mo58107K()).mo58608d(cVar).mo58607c(new AppBarConfigurationKt.C19808a(AppBarConfigurationKt$AppBarConfiguration$1.f50666f)).mo58605a());
    }

    /* renamed from: b */
    public static final boolean m92146b(@C12579k NavController navController, @C12579k C19812d dVar) {
        Intrinsics.checkNotNullParameter(navController, "<this>");
        Intrinsics.checkNotNullParameter(dVar, "appBarConfiguration");
        return C19827p.m92170k(navController, dVar);
    }
}

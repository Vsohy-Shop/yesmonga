package androidx.navigation.p030ui;

import androidx.appcompat.app.C0475e;
import androidx.customview.widget.C18552c;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.p030ui.AppBarConfigurationKt;
import androidx.navigation.p030ui.C19812d;
import com.usabilla.sdk.ubform.sdk.banner.BannerConfigurableFragment;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.navigation.ui.c */
public final class C19811c {
    /* renamed from: a */
    public static final void m92125a(@C12579k C0475e eVar, @C12579k NavController navController, @C12580l DrawerLayout drawerLayout) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(navController, "navController");
        C19827p.m92175p(eVar, navController, new C19812d.C19813a(navController.mo58107K()).mo58608d(drawerLayout).mo58607c(new AppBarConfigurationKt.C19808a(AppBarConfigurationKt$AppBarConfiguration$1.f50666f)).mo58605a());
    }

    /* renamed from: b */
    public static final void m92126b(@C12579k C0475e eVar, @C12579k NavController navController, @C12579k C19812d dVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(dVar, BannerConfigurableFragment.f27258E0);
        C19827p.m92175p(eVar, navController, dVar);
    }

    /* renamed from: c */
    public static /* synthetic */ void m92127c(C0475e eVar, NavController navController, C19812d dVar, int i, Object obj) {
        if ((i & 2) != 0) {
            dVar = new C19812d.C19813a(navController.mo58107K()).mo58608d((C18552c) null).mo58607c(new AppBarConfigurationKt.C19808a(AppBarConfigurationKt$AppBarConfiguration$1.f50666f)).mo58605a();
        }
        m92126b(eVar, navController, dVar);
    }
}

package androidx.navigation.p030ui;

import androidx.appcompat.widget.Toolbar;
import androidx.customview.widget.C18552c;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.p030ui.AppBarConfigurationKt;
import androidx.navigation.p030ui.C19812d;
import com.usabilla.sdk.ubform.sdk.banner.BannerConfigurableFragment;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.navigation.ui.t */
public final class C19839t {
    /* renamed from: a */
    public static final void m92191a(@C12579k Toolbar toolbar, @C12579k NavController navController, @C12580l DrawerLayout drawerLayout) {
        Intrinsics.checkNotNullParameter(toolbar, "<this>");
        Intrinsics.checkNotNullParameter(navController, "navController");
        C19827p.m92179t(toolbar, navController, new C19812d.C19813a(navController.mo58107K()).mo58608d(drawerLayout).mo58607c(new AppBarConfigurationKt.C19808a(AppBarConfigurationKt$AppBarConfiguration$1.f50666f)).mo58605a());
    }

    /* renamed from: b */
    public static final void m92192b(@C12579k Toolbar toolbar, @C12579k NavController navController, @C12579k C19812d dVar) {
        Intrinsics.checkNotNullParameter(toolbar, "<this>");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(dVar, BannerConfigurableFragment.f27258E0);
        C19827p.m92179t(toolbar, navController, dVar);
    }

    /* renamed from: c */
    public static /* synthetic */ void m92193c(Toolbar toolbar, NavController navController, C19812d dVar, int i, Object obj) {
        if ((i & 2) != 0) {
            dVar = new C19812d.C19813a(navController.mo58107K()).mo58608d((C18552c) null).mo58607c(new AppBarConfigurationKt.C19808a(AppBarConfigurationKt$AppBarConfiguration$1.f50666f)).mo58605a();
        }
        m92192b(toolbar, navController, dVar);
    }
}

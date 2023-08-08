package androidx.navigation.p030ui;

import androidx.appcompat.widget.Toolbar;
import androidx.customview.widget.C18552c;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.p030ui.AppBarConfigurationKt;
import androidx.navigation.p030ui.C19812d;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.usabilla.sdk.ubform.sdk.banner.BannerConfigurableFragment;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.navigation.ui.f */
public final class C19816f {
    /* renamed from: a */
    public static final void m92138a(@C12579k CollapsingToolbarLayout collapsingToolbarLayout, @C12579k Toolbar toolbar, @C12579k NavController navController, @C12580l DrawerLayout drawerLayout) {
        Intrinsics.checkNotNullParameter(collapsingToolbarLayout, "<this>");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(navController, "navController");
        C19827p.m92182w(collapsingToolbarLayout, toolbar, navController, new C19812d.C19813a(navController.mo58107K()).mo58608d(drawerLayout).mo58607c(new AppBarConfigurationKt.C19808a(AppBarConfigurationKt$AppBarConfiguration$1.f50666f)).mo58605a());
    }

    /* renamed from: b */
    public static final void m92139b(@C12579k CollapsingToolbarLayout collapsingToolbarLayout, @C12579k Toolbar toolbar, @C12579k NavController navController, @C12579k C19812d dVar) {
        Intrinsics.checkNotNullParameter(collapsingToolbarLayout, "<this>");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(dVar, BannerConfigurableFragment.f27258E0);
        C19827p.m92182w(collapsingToolbarLayout, toolbar, navController, dVar);
    }

    /* renamed from: c */
    public static /* synthetic */ void m92140c(CollapsingToolbarLayout collapsingToolbarLayout, Toolbar toolbar, NavController navController, C19812d dVar, int i, Object obj) {
        if ((i & 4) != 0) {
            dVar = new C19812d.C19813a(navController.mo58107K()).mo58608d((C18552c) null).mo58607c(new AppBarConfigurationKt.C19808a(AppBarConfigurationKt$AppBarConfiguration$1.f50666f)).mo58605a();
        }
        m92139b(collapsingToolbarLayout, toolbar, navController, dVar);
    }
}

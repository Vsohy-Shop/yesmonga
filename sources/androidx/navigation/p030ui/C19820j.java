package androidx.navigation.p030ui;

import android.view.MenuItem;
import androidx.navigation.NavController;
import com.google.android.material.navigation.NavigationView;

/* renamed from: androidx.navigation.ui.j */
public final /* synthetic */ class C19820j implements NavigationView.C31457c {

    /* renamed from: a */
    public final /* synthetic */ NavController f50683a;

    /* renamed from: b */
    public final /* synthetic */ boolean f50684b;

    /* renamed from: c */
    public final /* synthetic */ NavigationView f50685c;

    public /* synthetic */ C19820j(NavController navController, boolean z, NavigationView navigationView) {
        this.f50683a = navController;
        this.f50684b = z;
        this.f50685c = navigationView;
    }

    /* renamed from: a */
    public final boolean mo58609a(MenuItem menuItem) {
        return C19827p.m92157G(this.f50683a, this.f50684b, this.f50685c, menuItem);
    }
}

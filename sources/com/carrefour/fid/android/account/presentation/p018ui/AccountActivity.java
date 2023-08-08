package com.carrefour.fid.android.account.presentation.p018ui;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.Fragment;
import androidx.navigation.C19758j0;
import androidx.navigation.NavController;
import androidx.navigation.NavGraph;
import androidx.navigation.fragment.NavHostFragment;
import com.carrefour.fid.android.account.C13144b;
import com.carrefour.fid.android.account.databinding.C13214a;
import dagger.hilt.android.C10164b;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, mo22516d2 = {"Lcom/carrefour/fid/android/account/presentation/ui/AccountActivity;", "Landroidx/appcompat/app/e;", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onCreate", "onBackPressed", "Landroidx/navigation/NavController;", "X0", "Landroidx/navigation/NavController;", "navController", "Landroidx/navigation/NavGraph;", "Y0", "Landroidx/navigation/NavGraph;", "navGraph", "<init>", "()V", "account_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C10164b
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.account.presentation.ui.AccountActivity */
public final class AccountActivity extends C13480c {

    /* renamed from: Z0 */
    public static final int f32717Z0 = 8;
    @C12580l

    /* renamed from: X0 */
    public NavController f32718X0;
    @C12580l

    /* renamed from: Y0 */
    public NavGraph f32719Y0;

    public void onBackPressed() {
        NavController navController = this.f32718X0;
        boolean z = false;
        if (navController != null && navController.mo58156s0()) {
            z = true;
        }
        if (!z) {
            finish();
        }
    }

    public void onCreate(@C12580l Bundle bundle) {
        NavGraph navGraph;
        C19758j0 M;
        super.onCreate(bundle);
        setContentView((View) C13214a.m57264c(getLayoutInflater()).getRoot());
        Fragment r0 = mo57175g0().mo56900r0(C13144b.C13154j.nav_host_container);
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        NavController k = ((NavHostFragment) r0).mo58400k();
        this.f32718X0 = k;
        if (k == null || (M = k.mo58111M()) == null) {
            navGraph = null;
        } else {
            navGraph = M.mo58438b(C13144b.C13160p.account_module_graph);
        }
        this.f32719Y0 = navGraph;
        if (navGraph != null) {
            Bundle extras = getIntent().getExtras();
            boolean z = false;
            if (extras != null && extras.containsKey(C13318a.f32720a)) {
                z = true;
            }
            if (z) {
                navGraph.mo58283V0(C13144b.C13154j.createAccountFragment);
            }
            NavController navController = this.f32718X0;
            if (navController != null) {
                navController.mo58114N0(navGraph, getIntent().getExtras());
            }
        }
    }
}

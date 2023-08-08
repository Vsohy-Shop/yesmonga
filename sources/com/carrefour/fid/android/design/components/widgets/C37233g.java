package com.carrefour.fid.android.design.components.widgets;

import android.view.MenuItem;
import androidx.navigation.NavController;
import com.google.android.material.navigation.NavigationBarView;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;

/* renamed from: com.carrefour.fid.android.design.components.widgets.g */
public final /* synthetic */ class C37233g implements NavigationBarView.C31453d {

    /* renamed from: a */
    public final /* synthetic */ C11300l f93389a;

    /* renamed from: b */
    public final /* synthetic */ C11304p f93390b;

    /* renamed from: c */
    public final /* synthetic */ BottomNavigationComponent f93391c;

    /* renamed from: d */
    public final /* synthetic */ NavController f93392d;

    public /* synthetic */ C37233g(C11300l lVar, C11304p pVar, BottomNavigationComponent bottomNavigationComponent, NavController navController) {
        this.f93389a = lVar;
        this.f93390b = pVar;
        this.f93391c = bottomNavigationComponent;
        this.f93392d = navController;
    }

    /* renamed from: a */
    public final boolean mo58611a(MenuItem menuItem) {
        return BottomNavigationComponent.m152281q(this.f93389a, this.f93390b, this.f93391c, this.f93392d, menuItem);
    }
}

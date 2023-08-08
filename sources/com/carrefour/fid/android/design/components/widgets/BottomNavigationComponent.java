package com.carrefour.fid.android.design.components.widgets;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import androidx.annotation.C0329d0;
import androidx.compose.runtime.internal.C8567o;
import androidx.core.content.C17318d;
import androidx.navigation.C19761k0;
import androidx.navigation.NavController;
import androidx.navigation.p030ui.C19815e;
import androidx.navigation.p030ui.C19827p;
import com.carrefour.fid.android.design.components.C36896b;
import com.google.android.material.badge.C31132a;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.C11315i;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0011¢\u0006\u0004\b\u001a\u0010\u001bJm\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u000226\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u00042%\b\u0002\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fJ\u0018\u0010\u0014\u001a\u00020\n2\b\b\u0001\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011¨\u0006\u001c"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/BottomNavigationComponent;", "Lcom/google/android/material/bottomnavigation/BottomNavigationView;", "Landroidx/navigation/NavController;", "navController", "Lkotlin/Function2;", "Landroid/view/MenuItem;", "Lkotlin/n0;", "name", "currentItem", "destinationItem", "Lkotlin/d2;", "analytics", "Lkotlin/Function1;", "menuItem", "", "navigationHandler", "setup", "", "menuItemId", "count", "s", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class BottomNavigationComponent extends BottomNavigationView {

    /* renamed from: F0 */
    public static final int f93016F0 = 0;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public BottomNavigationComponent(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: q */
    public static final boolean m152281q(C11300l lVar, C11304p pVar, BottomNavigationComponent bottomNavigationComponent, NavController navController, MenuItem menuItem) {
        boolean z;
        Intrinsics.checkNotNullParameter(pVar, "$analytics");
        Intrinsics.checkNotNullParameter(bottomNavigationComponent, "this$0");
        Intrinsics.checkNotNullParameter(navController, "$navController");
        Intrinsics.checkNotNullParameter(menuItem, "item");
        if (lVar == null || ((Boolean) lVar.invoke(menuItem)).booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return false;
        }
        MenuItem findItem = bottomNavigationComponent.getMenu().findItem(bottomNavigationComponent.getSelectedItemId());
        Intrinsics.checkNotNullExpressionValue(findItem, "menu.findItem(selectedItemId)");
        pVar.invoke(findItem, menuItem);
        menuItem.setChecked(true);
        try {
            return C19827p.m92171l(menuItem, navController);
        } catch (Exception unused) {
            navController.mo58132X(menuItem.getItemId(), (Bundle) null, C19761k0.C19762a.m91893k(new C19761k0.C19762a(), menuItem.getItemId(), true, false, 4, (Object) null).mo58463a());
            return false;
        }
    }

    /* renamed from: r */
    public static final void m152282r(NavController navController, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(navController, "$navController");
        Intrinsics.checkNotNullParameter(menuItem, "item");
        navController.mo58132X(menuItem.getItemId(), (Bundle) null, C19761k0.C19762a.m91893k(new C19761k0.C19762a(), menuItem.getItemId(), true, false, 4, (Object) null).mo58463a());
    }

    public static /* synthetic */ void setup$default(BottomNavigationComponent bottomNavigationComponent, NavController navController, C11304p pVar, C11300l lVar, int i, Object obj) {
        if ((i & 4) != 0) {
            lVar = null;
        }
        bottomNavigationComponent.setup(navController, pVar, lVar);
    }

    /* renamed from: s */
    public final void mo112823s(@C0329d0 int i, int i2) {
        boolean z;
        C31132a f = mo90316f(i);
        f.mo88211M(C17318d.m79723f(getContext(), C36896b.C36902f.ds_red_1));
        f.mo88214P(C17318d.m79723f(getContext(), C36896b.C36902f.ds_grey_white));
        f.mo88222X(i2);
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        f.mo88231d0(z);
        f.mo88226a0((int) getResources().getDimension(C36896b.C36903g.ds_spacing_xxs));
    }

    public final void setup(@C12579k NavController navController, @C12579k C11304p<? super MenuItem, ? super MenuItem, C11079d2> pVar, @C12580l C11300l<? super MenuItem, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(pVar, "analytics");
        C19815e.m92137a(this, navController);
        setOnItemSelectedListener(new C37233g(lVar, pVar, this, navController));
        setOnItemReselectedListener(new C37236h(navController));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public BottomNavigationComponent(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BottomNavigationComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public BottomNavigationComponent(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }
}

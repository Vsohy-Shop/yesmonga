package com.carrefour.fid.android.navigation;

import android.os.Bundle;
import android.view.MenuItem;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.extensions.C13825a;
import com.carrefour.fid.android.shared.constant.C28539g;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroid/view/MenuItem;", "it", "", "a", "(Landroid/view/MenuItem;)Ljava/lang/Boolean;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class BottomNavActivity$setupBottomNavigationBar$3 extends Lambda implements C11300l<MenuItem, Boolean> {
    final /* synthetic */ BottomNavActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomNavActivity$setupBottomNavigationBar$3(BottomNavActivity bottomNavActivity) {
        super(1);
        this.this$0 = bottomNavActivity;
    }

    @C12579k
    /* renamed from: a */
    public final Boolean invoke(@C12579k MenuItem menuItem) {
        boolean z;
        Intrinsics.checkNotNullParameter(menuItem, "it");
        if (menuItem.getItemId() != R.id.orders_graph || this.this$0.mo121132i2()) {
            z = true;
        } else {
            C13825a.m58795x(this.this$0, false, R.anim.slide_in_up, R.anim.no_change, C28539g.f69234J, (Bundle) null, 16, (Object) null);
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

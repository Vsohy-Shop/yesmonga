package com.carrefour.fid.android.navigation;

import android.view.MenuItem;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.shared.constant.C28526d;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"Landroid/view/MenuItem;", "currentItem", "destinationItem", "Lkotlin/d2;", "a", "(Landroid/view/MenuItem;Landroid/view/MenuItem;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class BottomNavActivity$setupBottomNavigationBar$2 extends Lambda implements C11304p<MenuItem, MenuItem, C11079d2> {
    final /* synthetic */ BottomNavActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomNavActivity$setupBottomNavigationBar$2(BottomNavActivity bottomNavActivity) {
        super(2);
        this.this$0 = bottomNavActivity;
    }

    /* renamed from: b */
    public static final String m158760b(int i) {
        switch (i) {
            case R.id.basket_graph:
                return "basket";
            case R.id.departments_graph:
                return C28526d.f68822I2;
            case R.id.home_graph:
                return "accueil";
            case R.id.orders_graph:
                return C28526d.f68830K2;
            case R.id.physical_store_graph:
                return "magasin";
            default:
                return null;
        }
    }

    /* renamed from: a */
    public final void mo121176a(@C12579k MenuItem menuItem, @C12579k MenuItem menuItem2) {
        boolean z;
        Intrinsics.checkNotNullParameter(menuItem, "currentItem");
        Intrinsics.checkNotNullParameter(menuItem2, "destinationItem");
        String b = m158760b(menuItem.getItemId());
        String b2 = m158760b(menuItem2.getItemId());
        boolean z2 = false;
        if (b == null || b.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (b2 == null || b2.length() == 0) {
                z2 = true;
            }
            if (!z2) {
                this.this$0.mo121085B1().mo76841a(b, b2);
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        mo121176a((MenuItem) obj, (MenuItem) obj2);
        return C11079d2.f28267a;
    }
}

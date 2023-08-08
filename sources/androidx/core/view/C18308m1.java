package androidx.core.view;

import android.view.Menu;
import android.view.MenuItem;
import java.util.Iterator;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11348d;
import kotlin.sequences.C11559m;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.core.view.m1 */
public final class C18308m1 {

    /* renamed from: androidx.core.view.m1$a */
    public static final class C18309a implements C11559m<MenuItem> {

        /* renamed from: a */
        public final /* synthetic */ Menu f46963a;

        public C18309a(Menu menu) {
            this.f46963a = menu;
        }

        @C12579k
        public Iterator<MenuItem> iterator() {
            return C18308m1.m83003i(this.f46963a);
        }
    }

    /* renamed from: androidx.core.view.m1$b */
    public static final class C18310b implements Iterator<MenuItem>, C11348d {

        /* renamed from: a */
        public int f46964a;

        /* renamed from: b */
        public final /* synthetic */ Menu f46965b;

        public C18310b(Menu menu) {
            this.f46965b = menu;
        }

        @C12579k
        /* renamed from: b */
        public MenuItem next() {
            Menu menu = this.f46965b;
            int i = this.f46964a;
            this.f46964a = i + 1;
            MenuItem item = menu.getItem(i);
            if (item != null) {
                return item;
            }
            throw new IndexOutOfBoundsException();
        }

        public boolean hasNext() {
            return this.f46964a < this.f46965b.size();
        }

        public void remove() {
            C11079d2 d2Var;
            Menu menu = this.f46965b;
            int i = this.f46964a - 1;
            this.f46964a = i;
            MenuItem item = menu.getItem(i);
            if (item != null) {
                Intrinsics.checkNotNullExpressionValue(item, "getItem(index)");
                menu.removeItem(item.getItemId());
                d2Var = C11079d2.f28267a;
            } else {
                d2Var = null;
            }
            if (d2Var == null) {
                throw new IndexOutOfBoundsException();
            }
        }
    }

    /* renamed from: a */
    public static final boolean m82995a(@C12579k Menu menu, @C12579k MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menu, "<this>");
        Intrinsics.checkNotNullParameter(menuItem, "item");
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            if (Intrinsics.areEqual((Object) menu.getItem(i), (Object) menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static final void m82996b(@C12579k Menu menu, @C12579k C11300l<? super MenuItem, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(menu, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "action");
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = menu.getItem(i);
            Intrinsics.checkNotNullExpressionValue(item, "getItem(index)");
            lVar.invoke(item);
        }
    }

    /* renamed from: c */
    public static final void m82997c(@C12579k Menu menu, @C12579k C11304p<? super Integer, ? super MenuItem, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(menu, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "action");
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            Integer valueOf = Integer.valueOf(i);
            MenuItem item = menu.getItem(i);
            Intrinsics.checkNotNullExpressionValue(item, "getItem(index)");
            pVar.invoke(valueOf, item);
        }
    }

    @C12579k
    /* renamed from: d */
    public static final MenuItem m82998d(@C12579k Menu menu, int i) {
        Intrinsics.checkNotNullParameter(menu, "<this>");
        MenuItem item = menu.getItem(i);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(index)");
        return item;
    }

    @C12579k
    /* renamed from: e */
    public static final C11559m<MenuItem> m82999e(@C12579k Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "<this>");
        return new C18309a(menu);
    }

    /* renamed from: f */
    public static final int m83000f(@C12579k Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "<this>");
        return menu.size();
    }

    /* renamed from: g */
    public static final boolean m83001g(@C12579k Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "<this>");
        if (menu.size() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static final boolean m83002h(@C12579k Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "<this>");
        if (menu.size() != 0) {
            return true;
        }
        return false;
    }

    @C12579k
    /* renamed from: i */
    public static final Iterator<MenuItem> m83003i(@C12579k Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "<this>");
        return new C18310b(menu);
    }

    /* renamed from: j */
    public static final void m83004j(@C12579k Menu menu, @C12579k MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menu, "<this>");
        Intrinsics.checkNotNullParameter(menuItem, "item");
        menu.removeItem(menuItem.getItemId());
    }

    /* renamed from: k */
    public static final void m83005k(@C12579k Menu menu, int i) {
        C11079d2 d2Var;
        Intrinsics.checkNotNullParameter(menu, "<this>");
        MenuItem item = menu.getItem(i);
        if (item != null) {
            menu.removeItem(item.getItemId());
            d2Var = C11079d2.f28267a;
        } else {
            d2Var = null;
        }
        if (d2Var == null) {
            throw new IndexOutOfBoundsException();
        }
    }
}

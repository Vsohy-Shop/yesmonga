package androidx.navigation.p030ui;

import android.view.Menu;
import androidx.customview.widget.C18552c;
import androidx.navigation.NavGraph;
import androidx.navigation.p030ui.C19812d;
import java.util.Set;
import kotlin.C11660u;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11379z;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.navigation.ui.AppBarConfigurationKt */
public final class AppBarConfigurationKt {

    /* renamed from: androidx.navigation.ui.AppBarConfigurationKt$a */
    public static final class C19808a implements C19812d.C19814b, C11379z {

        /* renamed from: a */
        public final /* synthetic */ C11289a f50665a;

        public C19808a(C11289a aVar) {
            this.f50665a = aVar;
        }

        /* renamed from: a */
        public final /* synthetic */ boolean mo58595a() {
            return ((Boolean) this.f50665a.invoke()).booleanValue();
        }

        public final boolean equals(@C12580l Object obj) {
            if (!(obj instanceof C19812d.C19814b) || !(obj instanceof C11379z)) {
                return false;
            }
            return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((C11379z) obj).getFunctionDelegate());
        }

        @C12579k
        public final C11660u<?> getFunctionDelegate() {
            return this.f50665a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    @C12579k
    /* renamed from: a */
    public static final C19812d m92112a(@C12579k Menu menu, @C12580l C18552c cVar, @C12579k C11289a<Boolean> aVar) {
        Intrinsics.checkNotNullParameter(menu, "topLevelMenu");
        Intrinsics.checkNotNullParameter(aVar, "fallbackOnNavigateUpListener");
        return new C19812d.C19813a(menu).mo58608d(cVar).mo58607c(new C19808a(aVar)).mo58605a();
    }

    @C12579k
    /* renamed from: b */
    public static final C19812d m92113b(@C12579k NavGraph navGraph, @C12580l C18552c cVar, @C12579k C11289a<Boolean> aVar) {
        Intrinsics.checkNotNullParameter(navGraph, "navGraph");
        Intrinsics.checkNotNullParameter(aVar, "fallbackOnNavigateUpListener");
        return new C19812d.C19813a(navGraph).mo58608d(cVar).mo58607c(new C19808a(aVar)).mo58605a();
    }

    @C12579k
    /* renamed from: c */
    public static final C19812d m92114c(@C12579k Set<Integer> set, @C12580l C18552c cVar, @C12579k C11289a<Boolean> aVar) {
        Intrinsics.checkNotNullParameter(set, "topLevelDestinationIds");
        Intrinsics.checkNotNullParameter(aVar, "fallbackOnNavigateUpListener");
        return new C19812d.C19813a(set).mo58608d(cVar).mo58607c(new C19808a(aVar)).mo58605a();
    }

    /* renamed from: d */
    public static /* synthetic */ C19812d m92115d(Menu menu, C18552c cVar, C11289a aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            cVar = null;
        }
        if ((i & 4) != 0) {
            aVar = AppBarConfigurationKt$AppBarConfiguration$2.f50667f;
        }
        Intrinsics.checkNotNullParameter(menu, "topLevelMenu");
        Intrinsics.checkNotNullParameter(aVar, "fallbackOnNavigateUpListener");
        return new C19812d.C19813a(menu).mo58608d(cVar).mo58607c(new C19808a(aVar)).mo58605a();
    }

    /* renamed from: e */
    public static /* synthetic */ C19812d m92116e(NavGraph navGraph, C18552c cVar, C11289a aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            cVar = null;
        }
        if ((i & 4) != 0) {
            aVar = AppBarConfigurationKt$AppBarConfiguration$1.f50666f;
        }
        Intrinsics.checkNotNullParameter(navGraph, "navGraph");
        Intrinsics.checkNotNullParameter(aVar, "fallbackOnNavigateUpListener");
        return new C19812d.C19813a(navGraph).mo58608d(cVar).mo58607c(new C19808a(aVar)).mo58605a();
    }

    /* renamed from: f */
    public static /* synthetic */ C19812d m92117f(Set set, C18552c cVar, C11289a aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            cVar = null;
        }
        if ((i & 4) != 0) {
            aVar = AppBarConfigurationKt$AppBarConfiguration$3.f50668f;
        }
        Intrinsics.checkNotNullParameter(set, "topLevelDestinationIds");
        Intrinsics.checkNotNullParameter(aVar, "fallbackOnNavigateUpListener");
        return new C19812d.C19813a((Set<Integer>) set).mo58608d(cVar).mo58607c(new C19808a(aVar)).mo58605a();
    }
}

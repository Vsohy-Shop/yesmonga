package androidx.navigation;

import androidx.annotation.C0329d0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.urbanairship.analytics.location.C35560b;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C19691a0
/* renamed from: androidx.navigation.c0 */
public class C19695c0 extends C19853z<NavGraph> {
    @C12579k

    /* renamed from: h */
    public final C19795r0 f50490h;
    @C0329d0

    /* renamed from: i */
    public int f50491i;
    @C12580l

    /* renamed from: j */
    public String f50492j;
    @C12579k

    /* renamed from: k */
    public final List<NavDestination> f50493k = new ArrayList();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11395k(message = "Use routes to build your NavGraph instead", replaceWith = @C11587t0(expression = "NavGraphBuilder(provider, startDestination = startDestination.toString(), route = id.toString())", imports = {}))
    public C19695c0(@C12579k C19795r0 r0Var, @C0329d0 int i, @C0329d0 int i2) {
        super(r0Var.mo58561e(C19724f0.class), i);
        Intrinsics.checkNotNullParameter(r0Var, C35560b.f87807Z0);
        this.f50490h = r0Var;
        this.f50491i = i2;
    }

    /* renamed from: k */
    public final void mo58343k(@C12579k NavDestination navDestination) {
        Intrinsics.checkNotNullParameter(navDestination, FirebaseAnalytics.C32532b.f78977z);
        this.f50493k.add(navDestination);
    }

    @C12579k
    /* renamed from: l */
    public NavGraph mo58331c() {
        NavGraph navGraph = (NavGraph) super.mo58331c();
        navGraph.mo58271H0(this.f50493k);
        int i = this.f50491i;
        if (i != 0 || this.f50492j != null) {
            String str = this.f50492j;
            if (str != null) {
                Intrinsics.checkNotNull(str);
                navGraph.mo58284W0(str);
            } else {
                navGraph.mo58283V0(i);
            }
            return navGraph;
        } else if (mo58642i() != null) {
            throw new IllegalStateException("You must set a start destination route");
        } else {
            throw new IllegalStateException("You must set a start destination id");
        }
    }

    /* renamed from: m */
    public final <D extends NavDestination> void mo58345m(@C12579k C19853z<? extends D> zVar) {
        Intrinsics.checkNotNullParameter(zVar, "navDestination");
        this.f50493k.add(zVar.mo58331c());
    }

    @C12579k
    /* renamed from: n */
    public final C19795r0 mo58346n() {
        return this.f50490h;
    }

    /* renamed from: o */
    public final void mo58347o(@C12579k NavDestination navDestination) {
        Intrinsics.checkNotNullParameter(navDestination, "<this>");
        mo58343k(navDestination);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19695c0(@C12579k C19795r0 r0Var, @C12579k String str, @C12580l String str2) {
        super(r0Var.mo58561e(C19724f0.class), str2);
        Intrinsics.checkNotNullParameter(r0Var, C35560b.f87807Z0);
        Intrinsics.checkNotNullParameter(str, "startDestination");
        this.f50490h = r0Var;
        this.f50492j = str;
    }
}

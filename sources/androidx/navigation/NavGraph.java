package androidx.navigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.C0329d0;
import androidx.annotation.RestrictTo;
import androidx.collection.C1887m;
import androidx.collection.C1888n;
import androidx.navigation.NavDestination;
import androidx.navigation.common.C19696a;
import com.google.firebase.installations.local.C33093b;
import com.urbanairship.iam.events.C9175a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import kotlin.jvm.internal.markers.C11348d;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public class NavGraph extends NavDestination implements Iterable<NavDestination>, C11345a {
    @C12579k

    /* renamed from: E0 */
    public static final Companion f50458E0 = new Companion((DefaultConstructorMarker) null);

    /* renamed from: X */
    public int f50459X;
    @C12580l

    /* renamed from: Y */
    public String f50460Y;
    @C12580l

    /* renamed from: Z */
    public String f50461Z;
    @C12579k

    /* renamed from: z */
    public final C1887m<NavDestination> f50462z = new C1887m<>();

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final NavDestination mo58289a(@C12579k NavGraph navGraph) {
            Intrinsics.checkNotNullParameter(navGraph, "<this>");
            return (NavDestination) SequencesKt___SequencesKt.m44741f1(SequencesKt__SequencesKt.m44595l(navGraph.mo58273J0(navGraph.mo58280S0()), NavGraph$Companion$findStartDestination$1.f50466f));
        }

        public Companion() {
        }
    }

    /* renamed from: androidx.navigation.NavGraph$a */
    public static final class C19687a implements Iterator<NavDestination>, C11348d {

        /* renamed from: a */
        public int f50463a = -1;

        /* renamed from: b */
        public boolean f50464b;

        /* renamed from: c */
        public final /* synthetic */ NavGraph f50465c;

        public C19687a(NavGraph navGraph) {
            this.f50465c = navGraph;
        }

        @C12579k
        /* renamed from: b */
        public NavDestination next() {
            if (hasNext()) {
                this.f50464b = true;
                C1887m<NavDestination> O0 = this.f50465c.mo58277O0();
                int i = this.f50463a + 1;
                this.f50463a = i;
                NavDestination H = O0.mo6354H(i);
                Intrinsics.checkNotNullExpressionValue(H, "nodes.valueAt(++index)");
                return H;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return this.f50463a + 1 < this.f50465c.mo58277O0().mo6353G();
        }

        public void remove() {
            if (this.f50464b) {
                C1887m<NavDestination> O0 = this.f50465c.mo58277O0();
                O0.mo6354H(this.f50463a).mo58233A0((NavGraph) null);
                O0.mo6348B(this.f50463a);
                this.f50463a--;
                this.f50464b = false;
                return;
            }
            throw new IllegalStateException("You must call next() before you can remove an element".toString());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavGraph(@C12579k Navigator<? extends NavGraph> navigator) {
        super((Navigator<? extends NavDestination>) navigator);
        Intrinsics.checkNotNullParameter(navigator, "navGraphNavigator");
    }

    @C12579k
    @C11384m
    /* renamed from: N0 */
    public static final NavDestination m91588N0(@C12579k NavGraph navGraph) {
        return f50458E0.mo58289a(navGraph);
    }

    /* renamed from: F0 */
    public final void mo58269F0(@C12579k NavGraph navGraph) {
        Intrinsics.checkNotNullParameter(navGraph, "other");
        Iterator<NavDestination> it = navGraph.iterator();
        while (it.hasNext()) {
            it.remove();
            mo58270G0(it.next());
        }
    }

    /* renamed from: G0 */
    public final void mo58270G0(@C12579k NavDestination navDestination) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(navDestination, "node");
        int f0 = navDestination.mo58238f0();
        String l0 = navDestination.mo58244l0();
        boolean z3 = false;
        if (f0 == 0 && l0 == null) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.".toString());
        } else if (mo58244l0() == null || (!Intrinsics.areEqual((Object) l0, (Object) mo58244l0()))) {
            if (f0 != mo58238f0()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                NavDestination k = this.f50462z.mo6363k(f0);
                if (k != navDestination) {
                    if (navDestination.mo58243j0() == null) {
                        z3 = true;
                    }
                    if (z3) {
                        if (k != null) {
                            k.mo58233A0((NavGraph) null);
                        }
                        navDestination.mo58233A0(this);
                        this.f50462z.mo6369t(navDestination.mo58238f0(), navDestination);
                        return;
                    }
                    throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.".toString());
                }
                return;
            }
            throw new IllegalArgumentException(("Destination " + navDestination + " cannot have the same id as graph " + this).toString());
        } else {
            throw new IllegalArgumentException(("Destination " + navDestination + " cannot have the same route as graph " + this).toString());
        }
    }

    /* renamed from: H0 */
    public final void mo58271H0(@C12579k Collection<? extends NavDestination> collection) {
        Intrinsics.checkNotNullParameter(collection, "nodes");
        for (NavDestination navDestination : collection) {
            if (navDestination != null) {
                mo58270G0(navDestination);
            }
        }
    }

    /* renamed from: I0 */
    public final void mo58272I0(@C12579k NavDestination... navDestinationArr) {
        Intrinsics.checkNotNullParameter(navDestinationArr, "nodes");
        for (NavDestination G0 : navDestinationArr) {
            mo58270G0(G0);
        }
    }

    @C12580l
    /* renamed from: J0 */
    public final NavDestination mo58273J0(@C0329d0 int i) {
        return mo58274K0(i, true);
    }

    @C12580l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: K0 */
    public final NavDestination mo58274K0(@C0329d0 int i, boolean z) {
        NavDestination k = this.f50462z.mo6363k(i);
        if (k != null) {
            return k;
        }
        if (!z || mo58243j0() == null) {
            return null;
        }
        NavGraph j0 = mo58243j0();
        Intrinsics.checkNotNull(j0);
        return j0.mo58273J0(i);
    }

    @C12580l
    /* renamed from: L0 */
    public final NavDestination mo58275L0(@C12580l String str) {
        if (!(str == null || C11622t.isBlank(str))) {
            return mo58276M0(str, true);
        }
        return null;
    }

    @C12580l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: M0 */
    public final NavDestination mo58276M0(@C12579k String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "route");
        NavDestination k = this.f50462z.mo6363k(NavDestination.f50441x.mo58258a(str).hashCode());
        if (k != null) {
            return k;
        }
        if (!z || mo58243j0() == null) {
            return null;
        }
        NavGraph j0 = mo58243j0();
        Intrinsics.checkNotNull(j0);
        return j0.mo58275L0(str);
    }

    @C12579k
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: O0 */
    public final C1887m<NavDestination> mo58277O0() {
        return this.f50462z;
    }

    @C12579k
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: P0 */
    public final String mo58278P0() {
        if (this.f50460Y == null) {
            String str = this.f50461Z;
            if (str == null) {
                str = String.valueOf(this.f50459X);
            }
            this.f50460Y = str;
        }
        String str2 = this.f50460Y;
        Intrinsics.checkNotNull(str2);
        return str2;
    }

    @C0329d0
    @C11395k(message = "Use getStartDestinationId instead.", replaceWith = @C11587t0(expression = "startDestinationId", imports = {}))
    /* renamed from: R0 */
    public final int mo58279R0() {
        return mo58280S0();
    }

    @C0329d0
    /* renamed from: S0 */
    public final int mo58280S0() {
        return this.f50459X;
    }

    @C12580l
    /* renamed from: T0 */
    public final String mo58281T0() {
        return this.f50461Z;
    }

    /* renamed from: U0 */
    public final void mo58282U0(@C12579k NavDestination navDestination) {
        Intrinsics.checkNotNullParameter(navDestination, "node");
        int m = this.f50462z.mo6365m(navDestination.mo58238f0());
        if (m >= 0) {
            this.f50462z.mo6354H(m).mo58233A0((NavGraph) null);
            this.f50462z.mo6348B(m);
        }
    }

    /* renamed from: V0 */
    public final void mo58283V0(int i) {
        mo58285X0(i);
    }

    @C12579k
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: W */
    public String mo58237W() {
        return mo58238f0() != 0 ? super.mo58237W() : "the root navigation";
    }

    /* renamed from: W0 */
    public final void mo58284W0(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "startDestRoute");
        mo58286Y0(str);
    }

    /* renamed from: X0 */
    public final void mo58285X0(int i) {
        boolean z;
        if (i != mo58238f0()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.f50461Z != null) {
                mo58286Y0((String) null);
            }
            this.f50459X = i;
            this.f50460Y = null;
            return;
        }
        throw new IllegalArgumentException(("Start destination " + i + " cannot use the same id as the graph " + this).toString());
    }

    /* renamed from: Y0 */
    public final void mo58286Y0(String str) {
        int i;
        if (str == null) {
            i = 0;
        } else if (!(!Intrinsics.areEqual((Object) str, (Object) mo58244l0()))) {
            throw new IllegalArgumentException(("Start destination " + str + " cannot use the same route as the graph " + this).toString());
        } else if (!C11622t.isBlank(str)) {
            i = NavDestination.f50441x.mo58258a(str).hashCode();
        } else {
            throw new IllegalArgumentException("Cannot have an empty start destination route".toString());
        }
        this.f50459X = i;
        this.f50461Z = str;
    }

    public final void clear() {
        Iterator<NavDestination> it = iterator();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public boolean equals(@C12580l Object obj) {
        if (obj == null || !(obj instanceof NavGraph)) {
            return false;
        }
        List<T> d3 = SequencesKt___SequencesKt.m44735d3(SequencesKt__SequencesKt.m44588e(C1888n.m7625k(this.f50462z)));
        NavGraph navGraph = (NavGraph) obj;
        Iterator<T> k = C1888n.m7625k(navGraph.f50462z);
        while (k.hasNext()) {
            d3.remove((NavDestination) k.next());
        }
        if (!super.equals(obj) || this.f50462z.mo6353G() != navGraph.f50462z.mo6353G() || mo58280S0() != navGraph.mo58280S0() || !d3.isEmpty()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int S0 = mo58280S0();
        C1887m<NavDestination> mVar = this.f50462z;
        int G = mVar.mo6353G();
        for (int i = 0; i < G; i++) {
            S0 = (((S0 * 31) + mVar.mo6368s(i)) * 31) + mVar.mo6354H(i).hashCode();
        }
        return S0;
    }

    @C12579k
    public final Iterator<NavDestination> iterator() {
        return new C19687a(this);
    }

    @C12580l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: o0 */
    public NavDestination.C19686b mo58247o0(@C12579k C19848x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "navDeepLinkRequest");
        NavDestination.C19686b o0 = super.mo58247o0(xVar);
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            NavDestination.C19686b o02 = ((NavDestination) it.next()).mo58247o0(xVar);
            if (o02 != null) {
                arrayList.add(o02);
            }
        }
        return (NavDestination.C19686b) CollectionsKt___CollectionsKt.m40525K3(CollectionsKt__CollectionsKt.m40450N(o0, (NavDestination.C19686b) CollectionsKt___CollectionsKt.m40525K3(arrayList)));
    }

    /* renamed from: p0 */
    public void mo58054p0(@C12579k Context context, @C12579k AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(attributeSet, "attrs");
        super.mo58054p0(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C19696a.C19698b.NavGraphNavigator);
        Intrinsics.checkNotNullExpressionValue(obtainAttributes, "context.resources.obtain…vGraphNavigator\n        )");
        mo58285X0(obtainAttributes.getResourceId(C19696a.C19698b.NavGraphNavigator_startDestination, 0));
        this.f50460Y = NavDestination.f50441x.mo58259b(context, this.f50459X);
        C11079d2 d2Var = C11079d2.f28267a;
        obtainAttributes.recycle();
    }

    @C12579k
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        NavDestination L0 = mo58275L0(this.f50461Z);
        if (L0 == null) {
            L0 = mo58273J0(mo58280S0());
        }
        sb.append(" startDestination=");
        if (L0 == null) {
            String str = this.f50461Z;
            if (str != null) {
                sb.append(str);
            } else {
                String str2 = this.f50460Y;
                if (str2 != null) {
                    sb.append(str2);
                } else {
                    sb.append("0x" + Integer.toHexString(this.f50459X));
                }
            }
        } else {
            sb.append(C33093b.f80281i);
            sb.append(L0.toString());
            sb.append("}");
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }
}

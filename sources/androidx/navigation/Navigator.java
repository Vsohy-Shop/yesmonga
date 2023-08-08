package androidx.navigation;

import android.os.Bundle;
import androidx.annotation.C0346i;
import androidx.navigation.NavDestination;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.C33585u;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.ListIterator;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.C10861c;
import kotlin.annotation.C10862d;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public abstract class Navigator<D extends NavDestination> {
    @C12580l

    /* renamed from: a */
    public C19805t0 f50479a;

    /* renamed from: b */
    public boolean f50480b;

    /* renamed from: androidx.navigation.Navigator$a */
    public interface C19688a {
    }

    @C10862d(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS})
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @C10861c(AnnotationRetention.RUNTIME)
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.navigation.Navigator$b */
    public @interface C19689b {
        String value();
    }

    @C12579k
    /* renamed from: a */
    public abstract D mo58032a();

    @C12579k
    /* renamed from: b */
    public final C19805t0 mo58315b() {
        C19805t0 t0Var = this.f50479a;
        if (t0Var != null) {
            return t0Var;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached".toString());
    }

    /* renamed from: c */
    public final boolean mo58316c() {
        return this.f50480b;
    }

    @C12580l
    /* renamed from: d */
    public NavDestination mo58033d(@C12579k D d, @C12580l Bundle bundle, @C12580l C19761k0 k0Var, @C12580l C19688a aVar) {
        Intrinsics.checkNotNullParameter(d, FirebaseAnalytics.C32532b.f78977z);
        return d;
    }

    /* renamed from: e */
    public void mo58317e(@C12579k List<NavBackStackEntry> list, @C12580l C19761k0 k0Var, @C12580l C19688a aVar) {
        Intrinsics.checkNotNullParameter(list, C33585u.C33588c.f81747z3);
        for (NavBackStackEntry i : SequencesKt___SequencesKt.m44798v0(SequencesKt___SequencesKt.m44761k1(CollectionsKt___CollectionsKt.m40700v1(list), new Navigator$navigate$1(this, k0Var, aVar)))) {
            mo58315b().mo58173i(i);
        }
    }

    @C0346i
    /* renamed from: f */
    public void mo58318f(@C12579k C19805t0 t0Var) {
        Intrinsics.checkNotNullParameter(t0Var, "state");
        this.f50479a = t0Var;
        this.f50480b = true;
    }

    /* renamed from: g */
    public void mo58319g(@C12579k NavBackStackEntry navBackStackEntry) {
        Intrinsics.checkNotNullParameter(navBackStackEntry, "backStackEntry");
        NavDestination f = navBackStackEntry.mo58065f();
        if (!(f instanceof NavDestination)) {
            f = null;
        }
        if (f != null) {
            mo58033d(f, (Bundle) null, C19765l0.m91906a(Navigator$onLaunchSingleTop$1.f50481f), (C19688a) null);
            mo58315b().mo58592f(navBackStackEntry);
        }
    }

    /* renamed from: h */
    public void mo58320h(@C12579k Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "savedState");
    }

    @C12580l
    /* renamed from: i */
    public Bundle mo58321i() {
        return null;
    }

    /* renamed from: j */
    public void mo58322j(@C12579k NavBackStackEntry navBackStackEntry, boolean z) {
        Intrinsics.checkNotNullParameter(navBackStackEntry, "popUpTo");
        List value = mo58315b().mo58589b().getValue();
        if (value.contains(navBackStackEntry)) {
            ListIterator listIterator = value.listIterator(value.size());
            NavBackStackEntry navBackStackEntry2 = null;
            while (mo58034k()) {
                navBackStackEntry2 = (NavBackStackEntry) listIterator.previous();
                if (Intrinsics.areEqual((Object) navBackStackEntry2, (Object) navBackStackEntry)) {
                    break;
                }
            }
            if (navBackStackEntry2 != null) {
                mo58315b().mo58171g(navBackStackEntry2, z);
                return;
            }
            return;
        }
        throw new IllegalStateException(("popBackStack was called with " + navBackStackEntry + " which does not exist in back stack " + value).toString());
    }

    /* renamed from: k */
    public boolean mo58034k() {
        return true;
    }
}

package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.C0346i;
import androidx.fragment.app.C19215c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C19470t;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.Lifecycle;
import androidx.navigation.C19751g;
import androidx.navigation.C19761k0;
import androidx.navigation.C19795r0;
import androidx.navigation.C19805t0;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import androidx.navigation.fragment.C19746l;
import com.google.firebase.remoteconfig.C33585u;
import com.urbanairship.iam.events.C9175a;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@Navigator.C19689b("dialog")
@C11076d0(mo22515d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002()B\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b%\u0010&J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016J*\u0010\u0010\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0003H\u0002R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010#¨\u0006*"}, mo22516d2 = {"Landroidx/navigation/fragment/d;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/fragment/d$b;", "Landroidx/navigation/NavBackStackEntry;", "popUpTo", "", "savedState", "Lkotlin/d2;", "j", "n", "", "entries", "Landroidx/navigation/k0;", "navOptions", "Landroidx/navigation/Navigator$a;", "navigatorExtras", "e", "Landroidx/navigation/t0;", "state", "f", "entry", "o", "Landroid/content/Context;", "c", "Landroid/content/Context;", "context", "Landroidx/fragment/app/FragmentManager;", "d", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "", "", "Ljava/util/Set;", "restoredTagsAwaitingAttach", "Landroidx/lifecycle/t;", "Landroidx/lifecycle/t;", "observer", "<init>", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;)V", "g", "a", "b", "navigation-fragment_release"}, mo22517k = 1, mo22518mv = {1, 6, 0})
/* renamed from: androidx.navigation.fragment.d */
public final class C19731d extends Navigator<C19733b> {
    @C12579k

    /* renamed from: g */
    public static final C19732a f50549g = new C19732a((DefaultConstructorMarker) null);
    @Deprecated
    @C12579k

    /* renamed from: h */
    public static final String f50550h = "DialogFragmentNavigator";
    @C12579k

    /* renamed from: c */
    public final Context f50551c;
    @C12579k

    /* renamed from: d */
    public final FragmentManager f50552d;
    @C12579k

    /* renamed from: e */
    public final Set<String> f50553e = new LinkedHashSet();
    @C12579k

    /* renamed from: f */
    public final C19470t f50554f = new C19730c(this);

    /* renamed from: androidx.navigation.fragment.d$a */
    public static final class C19732a {
        public /* synthetic */ C19732a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C19732a() {
        }
    }

    @NavDestination.C19685a(C19215c.class)
    /* renamed from: androidx.navigation.fragment.d$b */
    public static class C19733b extends NavDestination implements C19751g {
        @C12580l

        /* renamed from: z */
        public String f50555z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19733b(@C12579k Navigator<? extends C19733b> navigator) {
            super((Navigator<? extends NavDestination>) navigator);
            Intrinsics.checkNotNullParameter(navigator, "fragmentNavigator");
        }

        @C12579k
        /* renamed from: F0 */
        public final String mo58415F0() {
            String str = this.f50555z;
            if (str == null) {
                throw new IllegalStateException("DialogFragment class was not set".toString());
            } else if (str != null) {
                return str;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        }

        @C12579k
        /* renamed from: G0 */
        public final C19733b mo58416G0(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "className");
            this.f50555z = str;
            return this;
        }

        public boolean equals(@C12580l Object obj) {
            if (obj == null || !(obj instanceof C19733b) || !super.equals(obj) || !Intrinsics.areEqual((Object) this.f50555z, (Object) ((C19733b) obj).f50555z)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            int hashCode = super.hashCode() * 31;
            String str = this.f50555z;
            if (str == null) {
                i = 0;
            } else {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        @C0346i
        /* renamed from: p0 */
        public void mo58054p0(@C12579k Context context, @C12579k AttributeSet attributeSet) {
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            Intrinsics.checkNotNullParameter(attributeSet, "attrs");
            super.mo58054p0(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C19746l.C19750d.DialogFragmentNavigator);
            Intrinsics.checkNotNullExpressionValue(obtainAttributes, "context.resources.obtain…ntNavigator\n            )");
            String string = obtainAttributes.getString(C19746l.C19750d.DialogFragmentNavigator_android_name);
            if (string != null) {
                mo58416G0(string);
            }
            obtainAttributes.recycle();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C19733b(@C12579k C19795r0 r0Var) {
            this((Navigator<? extends C19733b>) r0Var.mo58561e(C19731d.class));
            Intrinsics.checkNotNullParameter(r0Var, "navigatorProvider");
        }
    }

    public C19731d(@C12579k Context context, @C12579k FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.f50551c = context;
        this.f50552d = fragmentManager;
    }

    /* renamed from: p */
    public static final void m91810p(C19731d dVar, C19499w wVar, Lifecycle.C19372Event event) {
        Object obj;
        Intrinsics.checkNotNullParameter(dVar, "this$0");
        Intrinsics.checkNotNullParameter(wVar, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = false;
        if (event == Lifecycle.C19372Event.ON_CREATE) {
            C19215c cVar = (C19215c) wVar;
            Iterable value = dVar.mo58315b().mo58589b().getValue();
            if (!(value instanceof Collection) || !((Collection) value).isEmpty()) {
                Iterator it = value.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (Intrinsics.areEqual((Object) ((NavBackStackEntry) it.next()).mo58066g(), (Object) cVar.getTag())) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (!z) {
                cVar.dismiss();
            }
        } else if (event == Lifecycle.C19372Event.ON_STOP) {
            C19215c cVar2 = (C19215c) wVar;
            if (!cVar2.requireDialog().isShowing()) {
                List value2 = dVar.mo58315b().mo58589b().getValue();
                ListIterator listIterator = value2.listIterator(value2.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        obj = null;
                        break;
                    }
                    obj = listIterator.previous();
                    if (Intrinsics.areEqual((Object) ((NavBackStackEntry) obj).mo58066g(), (Object) cVar2.getTag())) {
                        break;
                    }
                }
                if (obj != null) {
                    NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
                    if (!Intrinsics.areEqual(CollectionsKt___CollectionsKt.m40677q3(value2), (Object) navBackStackEntry)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Dialog ");
                        sb.append(cVar2);
                        sb.append(" was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog");
                    }
                    dVar.mo58322j(navBackStackEntry, false);
                    return;
                }
                throw new IllegalStateException(("Dialog " + cVar2 + " has already been popped off of the Navigation back stack").toString());
            }
        }
    }

    /* renamed from: q */
    public static final void m91811q(C19731d dVar, FragmentManager fragmentManager, Fragment fragment) {
        Intrinsics.checkNotNullParameter(dVar, "this$0");
        Intrinsics.checkNotNullParameter(fragmentManager, "$noName_0");
        Intrinsics.checkNotNullParameter(fragment, "childFragment");
        if (dVar.f50553e.remove(fragment.getTag())) {
            fragment.getLifecycle().mo57464a(dVar.f50554f);
        }
    }

    /* renamed from: e */
    public void mo58317e(@C12579k List<NavBackStackEntry> list, @C12580l C19761k0 k0Var, @C12580l Navigator.C19688a aVar) {
        Intrinsics.checkNotNullParameter(list, C33585u.C33588c.f81747z3);
        if (!this.f50552d.mo56871d1()) {
            for (NavBackStackEntry o : list) {
                mo58414o(o);
            }
        }
    }

    /* renamed from: f */
    public void mo58318f(@C12579k C19805t0 t0Var) {
        Lifecycle lifecycle;
        Intrinsics.checkNotNullParameter(t0Var, "state");
        super.mo58318f(t0Var);
        for (NavBackStackEntry navBackStackEntry : t0Var.mo58589b().getValue()) {
            C19215c cVar = (C19215c) this.f50552d.mo56903s0(navBackStackEntry.mo58066g());
            C11079d2 d2Var = null;
            if (!(cVar == null || (lifecycle = cVar.getLifecycle()) == null)) {
                lifecycle.mo57464a(this.f50554f);
                d2Var = C11079d2.f28267a;
            }
            if (d2Var == null) {
                this.f50553e.add(navBackStackEntry.mo58066g());
            }
        }
        this.f50552d.mo56891o(new C19729b(this));
    }

    /* renamed from: j */
    public void mo58322j(@C12579k NavBackStackEntry navBackStackEntry, boolean z) {
        Intrinsics.checkNotNullParameter(navBackStackEntry, "popUpTo");
        if (!this.f50552d.mo56871d1()) {
            List value = mo58315b().mo58589b().getValue();
            for (NavBackStackEntry g : CollectionsKt___CollectionsKt.m40566S4(value.subList(value.indexOf(navBackStackEntry), value.size()))) {
                Fragment s0 = this.f50552d.mo56903s0(g.mo58066g());
                if (s0 != null) {
                    s0.getLifecycle().mo57467d(this.f50554f);
                    ((C19215c) s0).dismiss();
                }
            }
            mo58315b().mo58171g(navBackStackEntry, z);
        }
    }

    @C12579k
    /* renamed from: n */
    public C19733b mo58032a() {
        return new C19733b((Navigator<? extends C19733b>) this);
    }

    /* renamed from: o */
    public final void mo58414o(NavBackStackEntry navBackStackEntry) {
        C19733b bVar = (C19733b) navBackStackEntry.mo58065f();
        String F0 = bVar.mo58415F0();
        if (F0.charAt(0) == '.') {
            F0 = Intrinsics.stringPlus(this.f50551c.getPackageName(), F0);
        }
        Fragment a = this.f50552d.mo56801G0().mo56932a(this.f50551c.getClassLoader(), F0);
        Intrinsics.checkNotNullExpressionValue(a, "fragmentManager.fragment…ader, className\n        )");
        if (C19215c.class.isAssignableFrom(a.getClass())) {
            C19215c cVar = (C19215c) a;
            cVar.setArguments(navBackStackEntry.mo58062d());
            cVar.getLifecycle().mo57464a(this.f50554f);
            cVar.show(this.f50552d, navBackStackEntry.mo58066g());
            mo58315b().mo58173i(navBackStackEntry);
            return;
        }
        throw new IllegalArgumentException(("Dialog destination " + bVar.mo58415F0() + " is not an instance of DialogFragment").toString());
    }
}

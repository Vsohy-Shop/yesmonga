package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.C0346i;
import androidx.core.p027os.C17779d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.C19761k0;
import androidx.navigation.C19795r0;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import androidx.navigation.fragment.C19746l;
import com.google.firebase.remoteconfig.C33585u;
import com.urbanairship.iam.events.C9175a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C11076d0;
import kotlin.C11078d1;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.collections.C10977s0;
import kotlin.collections.C10994x;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@Navigator.C19689b("fragment")
@C11076d0(mo22515d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\t\b\u0017\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003-.\u001fB\u001f\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010%\u001a\u00020#¢\u0006\u0004\b*\u0010+J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016J*\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0017J*\u0010\u001a\u001a\u00020\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016J\n\u0010\u001b\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0010H\u0016J$\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020#8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010$R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000e0&8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006/"}, mo22516d2 = {"Landroidx/navigation/fragment/h;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/fragment/h$b;", "Landroidx/navigation/NavBackStackEntry;", "popUpTo", "", "savedState", "Lkotlin/d2;", "j", "l", "Landroid/content/Context;", "context", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "", "className", "Landroid/os/Bundle;", "args", "Landroidx/fragment/app/Fragment;", "m", "", "entries", "Landroidx/navigation/k0;", "navOptions", "Landroidx/navigation/Navigator$a;", "navigatorExtras", "e", "i", "h", "entry", "n", "c", "Landroid/content/Context;", "d", "Landroidx/fragment/app/FragmentManager;", "", "I", "containerId", "", "f", "Ljava/util/Set;", "savedIds", "<init>", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;I)V", "g", "a", "b", "navigation-fragment_release"}, mo22517k = 1, mo22518mv = {1, 6, 0})
/* renamed from: androidx.navigation.fragment.h */
public class C19737h extends Navigator<C19739b> {
    @C12579k

    /* renamed from: g */
    public static final C19738a f50557g = new C19738a((DefaultConstructorMarker) null);
    @Deprecated
    @C12579k

    /* renamed from: h */
    public static final String f50558h = "FragmentNavigator";
    @Deprecated
    @C12579k

    /* renamed from: i */
    public static final String f50559i = "androidx-nav-fragment:navigator:savedIds";
    @C12579k

    /* renamed from: c */
    public final Context f50560c;
    @C12579k

    /* renamed from: d */
    public final FragmentManager f50561d;

    /* renamed from: e */
    public final int f50562e;
    @C12579k

    /* renamed from: f */
    public final Set<String> f50563f = new LinkedHashSet();

    /* renamed from: androidx.navigation.fragment.h$a */
    public static final class C19738a {
        public /* synthetic */ C19738a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C19738a() {
        }
    }

    @NavDestination.C19685a(Fragment.class)
    /* renamed from: androidx.navigation.fragment.h$b */
    public static class C19739b extends NavDestination {
        @C12580l

        /* renamed from: z */
        public String f50564z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19739b(@C12579k Navigator<? extends C19739b> navigator) {
            super((Navigator<? extends NavDestination>) navigator);
            Intrinsics.checkNotNullParameter(navigator, "fragmentNavigator");
        }

        @C12579k
        /* renamed from: F0 */
        public final String mo58421F0() {
            String str = this.f50564z;
            if (str == null) {
                throw new IllegalStateException("Fragment class was not set".toString());
            } else if (str != null) {
                return str;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        }

        @C12579k
        /* renamed from: G0 */
        public final C19739b mo58422G0(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "className");
            this.f50564z = str;
            return this;
        }

        public boolean equals(@C12580l Object obj) {
            if (obj == null || !(obj instanceof C19739b) || !super.equals(obj) || !Intrinsics.areEqual((Object) this.f50564z, (Object) ((C19739b) obj).f50564z)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            int hashCode = super.hashCode() * 31;
            String str = this.f50564z;
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
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C19746l.C19750d.FragmentNavigator);
            Intrinsics.checkNotNullExpressionValue(obtainAttributes, "context.resources.obtain…leable.FragmentNavigator)");
            String string = obtainAttributes.getString(C19746l.C19750d.FragmentNavigator_android_name);
            if (string != null) {
                mo58422G0(string);
            }
            C11079d2 d2Var = C11079d2.f28267a;
            obtainAttributes.recycle();
        }

        @C12579k
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append(" class=");
            String str = this.f50564z;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
            return sb2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C19739b(@C12579k C19795r0 r0Var) {
            this((Navigator<? extends C19739b>) r0Var.mo58561e(C19737h.class));
            Intrinsics.checkNotNullParameter(r0Var, "navigatorProvider");
        }
    }

    /* renamed from: androidx.navigation.fragment.h$c */
    public static final class C19740c implements Navigator.C19688a {
        @C12579k

        /* renamed from: a */
        public final LinkedHashMap<View, String> f50565a;

        /* renamed from: androidx.navigation.fragment.h$c$a */
        public static final class C19741a {
            @C12579k

            /* renamed from: a */
            public final LinkedHashMap<View, String> f50566a = new LinkedHashMap<>();

            @C12579k
            /* renamed from: a */
            public final C19741a mo58424a(@C12579k View view, @C12579k String str) {
                Intrinsics.checkNotNullParameter(view, "sharedElement");
                Intrinsics.checkNotNullParameter(str, "name");
                this.f50566a.put(view, str);
                return this;
            }

            @C12579k
            /* renamed from: b */
            public final C19741a mo58425b(@C12579k Map<View, String> map) {
                Intrinsics.checkNotNullParameter(map, "sharedElements");
                for (Map.Entry next : map.entrySet()) {
                    mo58424a((View) next.getKey(), (String) next.getValue());
                }
                return this;
            }

            @C12579k
            /* renamed from: c */
            public final C19740c mo58426c() {
                return new C19740c(this.f50566a);
            }
        }

        public C19740c(@C12579k Map<View, String> map) {
            Intrinsics.checkNotNullParameter(map, "sharedElements");
            LinkedHashMap<View, String> linkedHashMap = new LinkedHashMap<>();
            this.f50565a = linkedHashMap;
            linkedHashMap.putAll(map);
        }

        @C12579k
        /* renamed from: a */
        public final Map<View, String> mo58423a() {
            return C10977s0.m41430D0(this.f50565a);
        }
    }

    public C19737h(@C12579k Context context, @C12579k FragmentManager fragmentManager, int i) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.f50560c = context;
        this.f50561d = fragmentManager;
        this.f50562e = i;
    }

    /* renamed from: e */
    public void mo58317e(@C12579k List<NavBackStackEntry> list, @C12580l C19761k0 k0Var, @C12580l Navigator.C19688a aVar) {
        Intrinsics.checkNotNullParameter(list, C33585u.C33588c.f81747z3);
        if (!this.f50561d.mo56871d1()) {
            for (NavBackStackEntry n : list) {
                mo58420n(n, k0Var, aVar);
            }
        }
    }

    /* renamed from: h */
    public void mo58320h(@C12579k Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "savedState");
        ArrayList<String> stringArrayList = bundle.getStringArrayList(f50559i);
        if (stringArrayList != null) {
            this.f50563f.clear();
            C10994x.m42360n0(this.f50563f, stringArrayList);
        }
    }

    @C12580l
    /* renamed from: i */
    public Bundle mo58321i() {
        if (this.f50563f.isEmpty()) {
            return null;
        }
        return C17779d.m81164b(C11078d1.m42659a(f50559i, new ArrayList(this.f50563f)));
    }

    /* renamed from: j */
    public void mo58322j(@C12579k NavBackStackEntry navBackStackEntry, boolean z) {
        Intrinsics.checkNotNullParameter(navBackStackEntry, "popUpTo");
        if (!this.f50561d.mo56871d1()) {
            if (z) {
                List value = mo58315b().mo58589b().getValue();
                NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) CollectionsKt___CollectionsKt.m40706w2(value);
                for (NavBackStackEntry navBackStackEntry3 : CollectionsKt___CollectionsKt.m40566S4(value.subList(value.indexOf(navBackStackEntry), value.size()))) {
                    if (Intrinsics.areEqual((Object) navBackStackEntry3, (Object) navBackStackEntry2)) {
                        Intrinsics.stringPlus("FragmentManager cannot save the state of the initial destination ", navBackStackEntry3);
                    } else {
                        this.f50561d.mo56833R1(navBackStackEntry3.mo58066g());
                        this.f50563f.add(navBackStackEntry3.mo58066g());
                    }
                }
            } else {
                this.f50561d.mo56910u1(navBackStackEntry.mo58066g(), 1);
            }
            mo58315b().mo58171g(navBackStackEntry, z);
        }
    }

    @C12579k
    /* renamed from: l */
    public C19739b mo58032a() {
        return new C19739b((Navigator<? extends C19739b>) this);
    }

    @C11395k(message = "Set a custom {@link androidx.fragment.app.FragmentFactory} via\n      {@link FragmentManager#setFragmentFactory(FragmentFactory)} to control\n      instantiation of Fragments.")
    @C12579k
    /* renamed from: m */
    public Fragment mo58419m(@C12579k Context context, @C12579k FragmentManager fragmentManager, @C12579k String str, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(str, "className");
        Fragment a = fragmentManager.mo56801G0().mo56932a(context.getClassLoader(), str);
        Intrinsics.checkNotNullExpressionValue(a, "fragmentManager.fragment…t.classLoader, className)");
        return a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo58420n(androidx.navigation.NavBackStackEntry r13, androidx.navigation.C19761k0 r14, androidx.navigation.Navigator.C19688a r15) {
        /*
            r12 = this;
            androidx.navigation.t0 r0 = r12.mo58315b()
            kotlinx.coroutines.flow.u r0 = r0.mo58589b()
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            boolean r1 = r0.isEmpty()
            r2 = 1
            r3 = 0
            if (r14 == 0) goto L_0x002c
            if (r1 != 0) goto L_0x002c
            boolean r4 = r14.mo58462k()
            if (r4 == 0) goto L_0x002c
            java.util.Set<java.lang.String> r4 = r12.f50563f
            java.lang.String r5 = r13.mo58066g()
            boolean r4 = r4.remove(r5)
            if (r4 == 0) goto L_0x002c
            r4 = r2
            goto L_0x002d
        L_0x002c:
            r4 = r3
        L_0x002d:
            if (r4 == 0) goto L_0x0040
            androidx.fragment.app.FragmentManager r14 = r12.f50561d
            java.lang.String r15 = r13.mo58066g()
            r14.mo56811J1(r15)
            androidx.navigation.t0 r14 = r12.mo58315b()
            r14.mo58173i(r13)
            return
        L_0x0040:
            androidx.navigation.NavDestination r4 = r13.mo58065f()
            androidx.navigation.fragment.h$b r4 = (androidx.navigation.fragment.C19737h.C19739b) r4
            android.os.Bundle r5 = r13.mo58062d()
            java.lang.String r6 = r4.mo58421F0()
            char r7 = r6.charAt(r3)
            r8 = 46
            if (r7 != r8) goto L_0x0060
            android.content.Context r7 = r12.f50560c
            java.lang.String r7 = r7.getPackageName()
            java.lang.String r6 = kotlin.jvm.internal.Intrinsics.stringPlus(r7, r6)
        L_0x0060:
            androidx.fragment.app.FragmentManager r7 = r12.f50561d
            androidx.fragment.app.l r7 = r7.mo56801G0()
            android.content.Context r8 = r12.f50560c
            java.lang.ClassLoader r8 = r8.getClassLoader()
            androidx.fragment.app.Fragment r6 = r7.mo56932a(r8, r6)
            java.lang.String r7 = "fragmentManager.fragment…t.classLoader, className)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            r6.setArguments(r5)
            androidx.fragment.app.FragmentManager r5 = r12.f50561d
            androidx.fragment.app.h0 r5 = r5.mo56909u()
            java.lang.String r7 = "fragmentManager.beginTransaction()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r7)
            r7 = -1
            if (r14 != 0) goto L_0x0088
            r8 = r7
            goto L_0x008c
        L_0x0088:
            int r8 = r14.mo58450a()
        L_0x008c:
            if (r14 != 0) goto L_0x0090
            r9 = r7
            goto L_0x0094
        L_0x0090:
            int r9 = r14.mo58451b()
        L_0x0094:
            if (r14 != 0) goto L_0x0098
            r10 = r7
            goto L_0x009c
        L_0x0098:
            int r10 = r14.mo58452c()
        L_0x009c:
            if (r14 != 0) goto L_0x00a0
            r11 = r7
            goto L_0x00a4
        L_0x00a0:
            int r11 = r14.mo58453d()
        L_0x00a4:
            if (r8 != r7) goto L_0x00ac
            if (r9 != r7) goto L_0x00ac
            if (r10 != r7) goto L_0x00ac
            if (r11 == r7) goto L_0x00bf
        L_0x00ac:
            if (r8 == r7) goto L_0x00af
            goto L_0x00b0
        L_0x00af:
            r8 = r3
        L_0x00b0:
            if (r9 == r7) goto L_0x00b3
            goto L_0x00b4
        L_0x00b3:
            r9 = r3
        L_0x00b4:
            if (r10 == r7) goto L_0x00b7
            goto L_0x00b8
        L_0x00b7:
            r10 = r3
        L_0x00b8:
            if (r11 == r7) goto L_0x00bb
            goto L_0x00bc
        L_0x00bb:
            r11 = r3
        L_0x00bc:
            r5.mo57212N(r8, r9, r10, r11)
        L_0x00bf:
            int r7 = r12.f50562e
            r5.mo57201C(r7, r6)
            r5.mo57040P(r6)
            int r4 = r4.mo58238f0()
            if (r14 == 0) goto L_0x00e7
            if (r1 != 0) goto L_0x00e7
            boolean r14 = r14.mo58460i()
            if (r14 == 0) goto L_0x00e7
            java.lang.Object r14 = kotlin.collections.CollectionsKt___CollectionsKt.m40653k3(r0)
            androidx.navigation.NavBackStackEntry r14 = (androidx.navigation.NavBackStackEntry) r14
            androidx.navigation.NavDestination r14 = r14.mo58065f()
            int r14 = r14.mo58238f0()
            if (r14 != r4) goto L_0x00e7
            r14 = r2
            goto L_0x00e8
        L_0x00e7:
            r14 = r3
        L_0x00e8:
            if (r1 == 0) goto L_0x00ec
        L_0x00ea:
            r3 = r2
            goto L_0x010d
        L_0x00ec:
            if (r14 == 0) goto L_0x0105
            int r14 = r0.size()
            if (r14 <= r2) goto L_0x010d
            androidx.fragment.app.FragmentManager r14 = r12.f50561d
            java.lang.String r0 = r13.mo58066g()
            r14.mo56910u1(r0, r2)
            java.lang.String r14 = r13.mo58066g()
            r5.mo57225o(r14)
            goto L_0x010d
        L_0x0105:
            java.lang.String r14 = r13.mo58066g()
            r5.mo57225o(r14)
            goto L_0x00ea
        L_0x010d:
            boolean r14 = r15 instanceof androidx.navigation.fragment.C19737h.C19740c
            if (r14 == 0) goto L_0x013b
            androidx.navigation.fragment.h$c r15 = (androidx.navigation.fragment.C19737h.C19740c) r15
            java.util.Map r14 = r15.mo58423a()
            java.util.Set r14 = r14.entrySet()
            java.util.Iterator r14 = r14.iterator()
        L_0x011f:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L_0x013b
            java.lang.Object r15 = r14.next()
            java.util.Map$Entry r15 = (java.util.Map.Entry) r15
            java.lang.Object r0 = r15.getKey()
            android.view.View r0 = (android.view.View) r0
            java.lang.Object r15 = r15.getValue()
            java.lang.String r15 = (java.lang.String) r15
            r5.mo57224n(r0, r15)
            goto L_0x011f
        L_0x013b:
            r5.mo57213Q(r2)
            r5.mo57052q()
            if (r3 == 0) goto L_0x014a
            androidx.navigation.t0 r14 = r12.mo58315b()
            r14.mo58173i(r13)
        L_0x014a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.fragment.C19737h.mo58420n(androidx.navigation.NavBackStackEntry, androidx.navigation.k0, androidx.navigation.Navigator$a):void");
    }
}

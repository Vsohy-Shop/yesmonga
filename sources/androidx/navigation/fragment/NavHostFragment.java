package androidx.navigation.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.annotation.C0346i;
import androidx.annotation.C0357m0;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.C19215c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.C19752g0;
import androidx.navigation.C19754h0;
import androidx.navigation.C19795r0;
import androidx.navigation.C19844w0;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.Navigator;
import androidx.navigation.fragment.C19737h;
import androidx.navigation.fragment.C19746l;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.jvm.C11315i;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u000f\b\u0016\u0018\u0000 :2\u00020\u00012\u00020\u0002:\u0001$B\u0007¢\u0006\u0004\b8\u00109J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0017J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0017J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0015J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0015J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0017J\u0010\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013H\u0015J&\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001a2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\"\u0010 \u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0017J\u0010\u0010\"\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0007H\u0017J\b\u0010#\u001a\u00020\u0005H\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010+\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00102\u001a\u00020\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00107\u001a\u00020,8BX\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u0006;"}, mo22516d2 = {"Landroidx/navigation/fragment/NavHostFragment;", "Landroidx/fragment/app/Fragment;", "Landroidx/navigation/g0;", "Landroid/content/Context;", "context", "Lkotlin/d2;", "onAttach", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroidx/navigation/h0;", "navHostController", "P0", "Landroidx/navigation/NavController;", "navController", "O0", "", "isPrimaryNavigationFragment", "onPrimaryNavigationFragmentChanged", "Landroidx/navigation/Navigator;", "Landroidx/navigation/fragment/h$b;", "L0", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "view", "onViewCreated", "Landroid/util/AttributeSet;", "attrs", "onInflate", "outState", "onSaveInstanceState", "onDestroyView", "a", "Landroidx/navigation/h0;", "b", "Ljava/lang/Boolean;", "isPrimaryBeforeOnCreate", "c", "Landroid/view/View;", "viewParent", "", "d", "I", "graphId", "e", "Z", "defaultNavHost", "k", "()Landroidx/navigation/NavController;", "N0", "()I", "containerId", "<init>", "()V", "f", "navigation-fragment_release"}, mo22517k = 1, mo22518mv = {1, 6, 0})
public class NavHostFragment extends Fragment implements C19752g0 {
    @C12579k

    /* renamed from: f */
    public static final C19725a f50531f = new C19725a((DefaultConstructorMarker) null);
    @C12579k
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: g */
    public static final String f50532g = "android-support-nav:fragment:graphId";
    @C12579k
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: v */
    public static final String f50533v = "android-support-nav:fragment:startDestinationArgs";
    @C12579k

    /* renamed from: w */
    public static final String f50534w = "android-support-nav:fragment:navControllerState";
    @C12579k

    /* renamed from: x */
    public static final String f50535x = "android-support-nav:fragment:defaultHost";
    @C12580l

    /* renamed from: a */
    public C19754h0 f50536a;
    @C12580l

    /* renamed from: b */
    public Boolean f50537b;
    @C12580l

    /* renamed from: c */
    public View f50538c;

    /* renamed from: d */
    public int f50539d;

    /* renamed from: e */
    public boolean f50540e;

    /* renamed from: androidx.navigation.fragment.NavHostFragment$a */
    public static final class C19725a {
        public /* synthetic */ C19725a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public static /* synthetic */ NavHostFragment m91792c(C19725a aVar, int i, Bundle bundle, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                bundle = null;
            }
            return aVar.mo58402b(i, bundle);
        }

        @C12579k
        @C11315i
        @C11384m
        /* renamed from: a */
        public final NavHostFragment mo58401a(@C0357m0 int i) {
            return m91792c(this, i, (Bundle) null, 2, (Object) null);
        }

        @C12579k
        @C11315i
        @C11384m
        /* renamed from: b */
        public final NavHostFragment mo58402b(@C0357m0 int i, @C12580l Bundle bundle) {
            Bundle bundle2;
            if (i != 0) {
                bundle2 = new Bundle();
                bundle2.putInt(NavHostFragment.f50532g, i);
            } else {
                bundle2 = null;
            }
            if (bundle != null) {
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                bundle2.putBundle(NavHostFragment.f50533v, bundle);
            }
            NavHostFragment navHostFragment = new NavHostFragment();
            if (bundle2 != null) {
                navHostFragment.setArguments(bundle2);
            }
            return navHostFragment;
        }

        @C12579k
        @C11384m
        /* renamed from: d */
        public final NavController mo58403d(@C12579k Fragment fragment) {
            C19215c cVar;
            Dialog dialog;
            Window window;
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.getParentFragment()) {
                if (fragment2 instanceof NavHostFragment) {
                    C19754h0 I0 = ((NavHostFragment) fragment2).f50536a;
                    if (I0 != null) {
                        return I0;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavController");
                }
                Fragment N0 = fragment2.getParentFragmentManager().mo56822N0();
                if (N0 instanceof NavHostFragment) {
                    C19754h0 I02 = ((NavHostFragment) N0).f50536a;
                    if (I02 != null) {
                        return I02;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavController");
                }
            }
            View view = fragment.getView();
            if (view != null) {
                return Navigation.m91648k(view);
            }
            View view2 = null;
            if (fragment instanceof C19215c) {
                cVar = (C19215c) fragment;
            } else {
                cVar = null;
            }
            if (!(cVar == null || (dialog = cVar.getDialog()) == null || (window = dialog.getWindow()) == null)) {
                view2 = window.getDecorView();
            }
            if (view2 != null) {
                return Navigation.m91648k(view2);
            }
            throw new IllegalStateException("Fragment " + fragment + " does not have a NavController set");
        }

        public C19725a() {
        }
    }

    @C12579k
    @C11315i
    @C11384m
    /* renamed from: J0 */
    public static final NavHostFragment m91784J0(@C0357m0 int i) {
        return f50531f.mo58401a(i);
    }

    @C12579k
    @C11315i
    @C11384m
    /* renamed from: K0 */
    public static final NavHostFragment m91785K0(@C0357m0 int i, @C12580l Bundle bundle) {
        return f50531f.mo58402b(i, bundle);
    }

    @C12579k
    @C11384m
    /* renamed from: M0 */
    public static final NavController m91786M0(@C12579k Fragment fragment) {
        return f50531f.mo58403d(fragment);
    }

    @C11395k(message = "Use {@link #onCreateNavController(NavController)}")
    @C12579k
    /* renamed from: L0 */
    public Navigator<? extends C19737h.C19739b> mo58396L0() {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
        return new C19737h(requireContext, childFragmentManager, mo58397N0());
    }

    /* renamed from: N0 */
    public final int mo58397N0() {
        int id = getId();
        if (id == 0 || id == -1) {
            return C19746l.C19749c.nav_host_fragment_container;
        }
        return id;
    }

    @C11395k(message = "Override {@link #onCreateNavHostController(NavHostController)} to gain\n      access to the full {@link NavHostController} that is created by this NavHostFragment.")
    @C0346i
    /* renamed from: O0 */
    public void mo58398O0(@C12579k NavController navController) {
        Intrinsics.checkNotNullParameter(navController, "navController");
        C19795r0 N = navController.mo58113N();
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
        N.mo58559b(new C19731d(requireContext, childFragmentManager));
        navController.mo58113N().mo58559b(mo58396L0());
    }

    @C0346i
    /* renamed from: P0 */
    public void mo58399P0(@C12579k C19754h0 h0Var) {
        Intrinsics.checkNotNullParameter(h0Var, "navHostController");
        mo58398O0(h0Var);
    }

    @C12579k
    /* renamed from: k */
    public final NavController mo58400k() {
        C19754h0 h0Var = this.f50536a;
        if (h0Var == null) {
            throw new IllegalStateException("NavController is not available before onCreate()".toString());
        } else if (h0Var != null) {
            return h0Var;
        } else {
            throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavHostController");
        }
    }

    @C0346i
    public void onAttach(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        super.onAttach(context);
        if (this.f50540e) {
            getParentFragmentManager().mo56909u().mo57040P(this).mo57052q();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00bf  */
    @androidx.annotation.C0346i
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(@org.jetbrains.annotations.C12580l android.os.Bundle r7) {
        /*
            r6 = this;
            android.content.Context r0 = r6.requireContext()
            java.lang.String r1 = "requireContext()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            androidx.navigation.h0 r1 = new androidx.navigation.h0
            r1.<init>(r0)
            r6.f50536a = r1
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            r1.mo58118P0(r6)
        L_0x0016:
            boolean r1 = r0 instanceof android.content.ContextWrapper
            if (r1 == 0) goto L_0x003e
            boolean r1 = r0 instanceof androidx.activity.C0213a0
            if (r1 == 0) goto L_0x0032
            androidx.navigation.h0 r1 = r6.f50536a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            androidx.activity.a0 r0 = (androidx.activity.C0213a0) r0
            androidx.activity.OnBackPressedDispatcher r0 = r0.mo702Z()
            java.lang.String r2 = "context as OnBackPressed…).onBackPressedDispatcher"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            r1.mo58122R0(r0)
            goto L_0x003e
        L_0x0032:
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            java.lang.String r1 = "context.baseContext"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            goto L_0x0016
        L_0x003e:
            androidx.navigation.h0 r0 = r6.f50536a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            java.lang.Boolean r1 = r6.f50537b
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x005b
            if (r1 == 0) goto L_0x0053
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x005b
            r1 = r2
            goto L_0x005c
        L_0x0053:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Boolean"
            r7.<init>(r0)
            throw r7
        L_0x005b:
            r1 = r3
        L_0x005c:
            r0.mo58164x(r1)
            r0 = 0
            r6.f50537b = r0
            androidx.navigation.h0 r1 = r6.f50536a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            androidx.lifecycle.a1 r4 = r6.getViewModelStore()
            java.lang.String r5 = "viewModelStore"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            r1.mo58124S0(r4)
            androidx.navigation.h0 r1 = r6.f50536a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            r6.mo58399P0(r1)
            java.lang.String r1 = "android-support-nav:fragment:graphId"
            if (r7 == 0) goto L_0x00a5
            java.lang.String r4 = "android-support-nav:fragment:navControllerState"
            android.os.Bundle r4 = r7.getBundle(r4)
            java.lang.String r5 = "android-support-nav:fragment:defaultHost"
            boolean r5 = r7.getBoolean(r5, r3)
            if (r5 == 0) goto L_0x009e
            r6.f50540e = r2
            androidx.fragment.app.FragmentManager r2 = r6.getParentFragmentManager()
            androidx.fragment.app.h0 r2 = r2.mo56909u()
            androidx.fragment.app.h0 r2 = r2.mo57040P(r6)
            r2.mo57052q()
        L_0x009e:
            int r2 = r7.getInt(r1)
            r6.f50539d = r2
            goto L_0x00a6
        L_0x00a5:
            r4 = r0
        L_0x00a6:
            if (r4 == 0) goto L_0x00b0
            androidx.navigation.h0 r2 = r6.f50536a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.mo58102H0(r4)
        L_0x00b0:
            int r2 = r6.f50539d
            if (r2 == 0) goto L_0x00bf
            androidx.navigation.h0 r0 = r6.f50536a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r1 = r6.f50539d
            r0.mo58108K0(r1)
            goto L_0x00dd
        L_0x00bf:
            android.os.Bundle r2 = r6.getArguments()
            if (r2 != 0) goto L_0x00c6
            goto L_0x00ca
        L_0x00c6:
            int r3 = r2.getInt(r1)
        L_0x00ca:
            if (r2 != 0) goto L_0x00cd
            goto L_0x00d3
        L_0x00cd:
            java.lang.String r0 = "android-support-nav:fragment:startDestinationArgs"
            android.os.Bundle r0 = r2.getBundle(r0)
        L_0x00d3:
            if (r3 == 0) goto L_0x00dd
            androidx.navigation.h0 r1 = r6.f50536a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            r1.mo58110L0(r3, r0)
        L_0x00dd:
            super.onCreate(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.fragment.NavHostFragment.onCreate(android.os.Bundle):void");
    }

    @C12580l
    public View onCreateView(@C12579k LayoutInflater layoutInflater, @C12580l ViewGroup viewGroup, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        Context context = layoutInflater.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "inflater.context");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        fragmentContainerView.setId(mo58397N0());
        return fragmentContainerView;
    }

    public void onDestroyView() {
        super.onDestroyView();
        View view = this.f50538c;
        if (view != null && Navigation.m91648k(view) == this.f50536a) {
            Navigation.m91649n(view, (NavController) null);
        }
        this.f50538c = null;
    }

    @C0346i
    public void onInflate(@C12579k Context context, @C12579k AttributeSet attributeSet, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(attributeSet, "attrs");
        super.onInflate(context, attributeSet, bundle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C19844w0.C19847c.NavHost);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…yleable.NavHost\n        )");
        int resourceId = obtainStyledAttributes.getResourceId(C19844w0.C19847c.NavHost_navGraph, 0);
        if (resourceId != 0) {
            this.f50539d = resourceId;
        }
        C11079d2 d2Var = C11079d2.f28267a;
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C19746l.C19750d.NavHostFragment);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes2, "context.obtainStyledAttr…tyleable.NavHostFragment)");
        if (obtainStyledAttributes2.getBoolean(C19746l.C19750d.NavHostFragment_defaultNavHost, false)) {
            this.f50540e = true;
        }
        obtainStyledAttributes2.recycle();
    }

    @C0346i
    public void onPrimaryNavigationFragmentChanged(boolean z) {
        C19754h0 h0Var = this.f50536a;
        if (h0Var == null) {
            this.f50537b = Boolean.valueOf(z);
        } else if (h0Var != null) {
            h0Var.mo58164x(z);
        }
    }

    @C0346i
    public void onSaveInstanceState(@C12579k Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "outState");
        super.onSaveInstanceState(bundle);
        C19754h0 h0Var = this.f50536a;
        Intrinsics.checkNotNull(h0Var);
        Bundle J0 = h0Var.mo58106J0();
        if (J0 != null) {
            bundle.putBundle(f50534w, J0);
        }
        if (this.f50540e) {
            bundle.putBoolean(f50535x, true);
        }
        int i = this.f50539d;
        if (i != 0) {
            bundle.putInt(f50532g, i);
        }
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        if (view instanceof ViewGroup) {
            Navigation.m91649n(view, this.f50536a);
            if (view.getParent() != null) {
                ViewParent parent = view.getParent();
                if (parent != null) {
                    View view2 = (View) parent;
                    this.f50538c = view2;
                    Intrinsics.checkNotNull(view2);
                    if (view2.getId() == getId()) {
                        View view3 = this.f50538c;
                        Intrinsics.checkNotNull(view3);
                        Navigation.m91649n(view3, this.f50536a);
                        return;
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            return;
        }
        throw new IllegalStateException(("created host view " + view + " is not a ViewGroup").toString());
    }
}

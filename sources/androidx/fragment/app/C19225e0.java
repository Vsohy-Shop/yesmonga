package androidx.fragment.app;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.view.C18196h2;
import androidx.fragment.C19144a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.SpecialEffectsController;
import androidx.lifecycle.C19395b1;

/* renamed from: androidx.fragment.app.e0 */
public class C19225e0 {

    /* renamed from: f */
    public static final String f49432f = "FragmentManager";

    /* renamed from: g */
    public static final String f49433g = "android:target_req_state";

    /* renamed from: h */
    public static final String f49434h = "android:target_state";

    /* renamed from: i */
    public static final String f49435i = "android:view_state";

    /* renamed from: j */
    public static final String f49436j = "android:view_registry_state";

    /* renamed from: k */
    public static final String f49437k = "android:user_visible_hint";

    /* renamed from: a */
    public final C19264q f49438a;

    /* renamed from: b */
    public final C19231g0 f49439b;
    @C0359n0

    /* renamed from: c */
    public final Fragment f49440c;

    /* renamed from: d */
    public boolean f49441d = false;

    /* renamed from: e */
    public int f49442e = -1;

    /* renamed from: androidx.fragment.app.e0$a */
    public class C19226a implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        public final /* synthetic */ View f49443a;

        public C19226a(View view) {
            this.f49443a = view;
        }

        public void onViewAttachedToWindow(View view) {
            this.f49443a.removeOnAttachStateChangeListener(this);
            C18196h2.m82642v1(this.f49443a);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: androidx.fragment.app.e0$b */
    public static /* synthetic */ class C19227b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f49445a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.lifecycle.Lifecycle$State[] r0 = androidx.lifecycle.Lifecycle.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f49445a = r0
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.RESUMED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f49445a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.STARTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f49445a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.CREATED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f49445a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C19225e0.C19227b.<clinit>():void");
        }
    }

    public C19225e0(@C0359n0 C19264q qVar, @C0359n0 C19231g0 g0Var, @C0359n0 Fragment fragment) {
        this.f49438a = qVar;
        this.f49439b = g0Var;
        this.f49440c = fragment;
    }

    /* renamed from: a */
    public void mo57118a() {
        if (FragmentManager.m89694W0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto ACTIVITY_CREATED: ");
            sb.append(this.f49440c);
        }
        Fragment fragment = this.f49440c;
        fragment.performActivityCreated(fragment.mSavedFragmentState);
        C19264q qVar = this.f49438a;
        Fragment fragment2 = this.f49440c;
        qVar.mo57349a(fragment2, fragment2.mSavedFragmentState, false);
    }

    /* renamed from: b */
    public void mo57119b() {
        int j = this.f49439b.mo57156j(this.f49440c);
        Fragment fragment = this.f49440c;
        fragment.mContainer.addView(fragment.mView, j);
    }

    /* renamed from: c */
    public void mo57120c() {
        if (FragmentManager.m89694W0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto ATTACHED: ");
            sb.append(this.f49440c);
        }
        Fragment fragment = this.f49440c;
        Fragment fragment2 = fragment.mTarget;
        C19225e0 e0Var = null;
        if (fragment2 != null) {
            C19225e0 o = this.f49439b.mo57161o(fragment2.mWho);
            if (o != null) {
                Fragment fragment3 = this.f49440c;
                fragment3.mTargetWho = fragment3.mTarget.mWho;
                fragment3.mTarget = null;
                e0Var = o;
            } else {
                throw new IllegalStateException("Fragment " + this.f49440c + " declared target fragment " + this.f49440c.mTarget + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (e0Var = this.f49439b.mo57161o(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f49440c + " declared target fragment " + this.f49440c.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (e0Var != null) {
            e0Var.mo57130m();
        }
        Fragment fragment4 = this.f49440c;
        fragment4.mHost = fragment4.mFragmentManager.mo56810J0();
        Fragment fragment5 = this.f49440c;
        fragment5.mParentFragment = fragment5.mFragmentManager.mo56819M0();
        this.f49438a.mo57355g(this.f49440c, false);
        this.f49440c.performAttach();
        this.f49438a.mo57350b(this.f49440c, false);
    }

    /* renamed from: d */
    public int mo57121d() {
        SpecialEffectsController.Operation.LifecycleImpact lifecycleImpact;
        Fragment fragment = this.f49440c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int i = this.f49442e;
        int i2 = C19227b.f49445a[fragment.mMaxState.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                i = Math.min(i, 5);
            } else if (i2 == 3) {
                i = Math.min(i, 1);
            } else if (i2 != 4) {
                i = Math.min(i, -1);
            } else {
                i = Math.min(i, 0);
            }
        }
        Fragment fragment2 = this.f49440c;
        if (fragment2.mFromLayout) {
            if (fragment2.mInLayout) {
                i = Math.max(this.f49442e, 2);
                View view = this.f49440c.mView;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.f49442e < 4 ? Math.min(i, fragment2.mState) : Math.min(i, 1);
            }
        }
        if (!this.f49440c.mAdded) {
            i = Math.min(i, 1);
        }
        Fragment fragment3 = this.f49440c;
        ViewGroup viewGroup = fragment3.mContainer;
        if (viewGroup != null) {
            lifecycleImpact = SpecialEffectsController.m89940n(viewGroup, fragment3.getParentFragmentManager()).mo57016l(this);
        } else {
            lifecycleImpact = null;
        }
        if (lifecycleImpact == SpecialEffectsController.Operation.LifecycleImpact.ADDING) {
            i = Math.min(i, 6);
        } else if (lifecycleImpact == SpecialEffectsController.Operation.LifecycleImpact.REMOVING) {
            i = Math.max(i, 3);
        } else {
            Fragment fragment4 = this.f49440c;
            if (fragment4.mRemoving) {
                if (fragment4.isInBackStack()) {
                    i = Math.min(i, 1);
                } else {
                    i = Math.min(i, -1);
                }
            }
        }
        Fragment fragment5 = this.f49440c;
        if (fragment5.mDeferStart && fragment5.mState < 5) {
            i = Math.min(i, 4);
        }
        if (FragmentManager.m89694W0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("computeExpectedState() of ");
            sb.append(i);
            sb.append(" for ");
            sb.append(this.f49440c);
        }
        return i;
    }

    /* renamed from: e */
    public void mo57122e() {
        if (FragmentManager.m89694W0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto CREATED: ");
            sb.append(this.f49440c);
        }
        Fragment fragment = this.f49440c;
        if (!fragment.mIsCreated) {
            this.f49438a.mo57356h(fragment, fragment.mSavedFragmentState, false);
            Fragment fragment2 = this.f49440c;
            fragment2.performCreate(fragment2.mSavedFragmentState);
            C19264q qVar = this.f49438a;
            Fragment fragment3 = this.f49440c;
            qVar.mo57351c(fragment3, fragment3.mSavedFragmentState, false);
            return;
        }
        fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
        this.f49440c.mState = 1;
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo57123f() {
        /*
            r6 = this;
            androidx.fragment.app.Fragment r0 = r6.f49440c
            boolean r0 = r0.mFromLayout
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.m89694W0(r0)
            if (r0 == 0) goto L_0x001d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto CREATE_VIEW: "
            r0.append(r1)
            androidx.fragment.app.Fragment r1 = r6.f49440c
            r0.append(r1)
        L_0x001d:
            androidx.fragment.app.Fragment r0 = r6.f49440c
            android.os.Bundle r1 = r0.mSavedFragmentState
            android.view.LayoutInflater r0 = r0.performGetLayoutInflater(r1)
            androidx.fragment.app.Fragment r1 = r6.f49440c
            android.view.ViewGroup r2 = r1.mContainer
            if (r2 == 0) goto L_0x002d
            goto L_0x00b7
        L_0x002d:
            int r2 = r1.mContainerId
            if (r2 == 0) goto L_0x00b6
            r3 = -1
            if (r2 == r3) goto L_0x0098
            androidx.fragment.app.FragmentManager r1 = r1.mFragmentManager
            androidx.fragment.app.j r1 = r1.mo56792D0()
            androidx.fragment.app.Fragment r2 = r6.f49440c
            int r2 = r2.mContainerId
            android.view.View r1 = r1.mo56759c(r2)
            r2 = r1
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 != 0) goto L_0x008e
            androidx.fragment.app.Fragment r1 = r6.f49440c
            boolean r3 = r1.mRestored
            if (r3 == 0) goto L_0x004e
            goto L_0x00b7
        L_0x004e:
            android.content.res.Resources r0 = r1.getResources()     // Catch:{ NotFoundException -> 0x005b }
            androidx.fragment.app.Fragment r1 = r6.f49440c     // Catch:{ NotFoundException -> 0x005b }
            int r1 = r1.mContainerId     // Catch:{ NotFoundException -> 0x005b }
            java.lang.String r0 = r0.getResourceName(r1)     // Catch:{ NotFoundException -> 0x005b }
            goto L_0x005d
        L_0x005b:
            java.lang.String r0 = "unknown"
        L_0x005d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "No view found for id 0x"
            r2.append(r3)
            androidx.fragment.app.Fragment r3 = r6.f49440c
            int r3 = r3.mContainerId
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r3 = " ("
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ") for fragment "
            r2.append(r0)
            androidx.fragment.app.Fragment r0 = r6.f49440c
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x008e:
            boolean r1 = r2 instanceof androidx.fragment.app.FragmentContainerView
            if (r1 != 0) goto L_0x00b7
            androidx.fragment.app.Fragment r1 = r6.f49440c
            androidx.fragment.app.strictmode.FragmentStrictMode.m90384r(r1, r2)
            goto L_0x00b7
        L_0x0098:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot create fragment "
            r1.append(r2)
            androidx.fragment.app.Fragment r2 = r6.f49440c
            r1.append(r2)
            java.lang.String r2 = " for a container view with no id"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00b6:
            r2 = 0
        L_0x00b7:
            androidx.fragment.app.Fragment r1 = r6.f49440c
            r1.mContainer = r2
            android.os.Bundle r3 = r1.mSavedFragmentState
            r1.performCreateView(r0, r2, r3)
            androidx.fragment.app.Fragment r0 = r6.f49440c
            android.view.View r0 = r0.mView
            r1 = 2
            if (r0 == 0) goto L_0x0163
            r3 = 0
            r0.setSaveFromParentEnabled(r3)
            androidx.fragment.app.Fragment r0 = r6.f49440c
            android.view.View r4 = r0.mView
            int r5 = androidx.fragment.C19144a.C19147c.fragment_container_view_tag
            r4.setTag(r5, r0)
            if (r2 == 0) goto L_0x00d9
            r6.mo57119b()
        L_0x00d9:
            androidx.fragment.app.Fragment r0 = r6.f49440c
            boolean r2 = r0.mHidden
            if (r2 == 0) goto L_0x00e6
            android.view.View r0 = r0.mView
            r2 = 8
            r0.setVisibility(r2)
        L_0x00e6:
            androidx.fragment.app.Fragment r0 = r6.f49440c
            android.view.View r0 = r0.mView
            boolean r0 = androidx.core.view.C18196h2.m82521O0(r0)
            if (r0 == 0) goto L_0x00f8
            androidx.fragment.app.Fragment r0 = r6.f49440c
            android.view.View r0 = r0.mView
            androidx.core.view.C18196h2.m82642v1(r0)
            goto L_0x0104
        L_0x00f8:
            androidx.fragment.app.Fragment r0 = r6.f49440c
            android.view.View r0 = r0.mView
            androidx.fragment.app.e0$a r2 = new androidx.fragment.app.e0$a
            r2.<init>(r0)
            r0.addOnAttachStateChangeListener(r2)
        L_0x0104:
            androidx.fragment.app.Fragment r0 = r6.f49440c
            r0.performViewCreated()
            androidx.fragment.app.q r0 = r6.f49438a
            androidx.fragment.app.Fragment r2 = r6.f49440c
            android.view.View r4 = r2.mView
            android.os.Bundle r5 = r2.mSavedFragmentState
            r0.mo57361m(r2, r4, r5, r3)
            androidx.fragment.app.Fragment r0 = r6.f49440c
            android.view.View r0 = r0.mView
            int r0 = r0.getVisibility()
            androidx.fragment.app.Fragment r2 = r6.f49440c
            android.view.View r2 = r2.mView
            float r2 = r2.getAlpha()
            androidx.fragment.app.Fragment r3 = r6.f49440c
            r3.setPostOnViewCreatedAlpha(r2)
            androidx.fragment.app.Fragment r2 = r6.f49440c
            android.view.ViewGroup r3 = r2.mContainer
            if (r3 == 0) goto L_0x0163
            if (r0 != 0) goto L_0x0163
            android.view.View r0 = r2.mView
            android.view.View r0 = r0.findFocus()
            if (r0 == 0) goto L_0x015b
            androidx.fragment.app.Fragment r2 = r6.f49440c
            r2.setFocusedView(r0)
            boolean r2 = androidx.fragment.app.FragmentManager.m89694W0(r1)
            if (r2 == 0) goto L_0x015b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "requestFocus: Saved focused view "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " for Fragment "
            r2.append(r0)
            androidx.fragment.app.Fragment r0 = r6.f49440c
            r2.append(r0)
        L_0x015b:
            androidx.fragment.app.Fragment r0 = r6.f49440c
            android.view.View r0 = r0.mView
            r2 = 0
            r0.setAlpha(r2)
        L_0x0163:
            androidx.fragment.app.Fragment r0 = r6.f49440c
            r0.mState = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C19225e0.mo57123f():void");
    }

    /* renamed from: g */
    public void mo57124g() {
        boolean z;
        boolean z2;
        Fragment f;
        if (FragmentManager.m89694W0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom CREATED: ");
            sb.append(this.f49440c);
        }
        Fragment fragment = this.f49440c;
        boolean z3 = true;
        if (!fragment.mRemoving || fragment.isInBackStack()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            Fragment fragment2 = this.f49440c;
            if (!fragment2.mBeingSaved) {
                this.f49439b.mo57146C(fragment2.mWho, (FragmentState) null);
            }
        }
        if (z || this.f49439b.mo57163q().mo57417q0(this.f49440c)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            C19253m<?> mVar = this.f49440c.mHost;
            if (mVar instanceof C19395b1) {
                z3 = this.f49439b.mo57163q().mo57413m0();
            } else if (mVar.mo57316k() instanceof Activity) {
                z3 = true ^ ((Activity) mVar.mo57316k()).isChangingConfigurations();
            }
            if ((z && !this.f49440c.mBeingSaved) || z3) {
                this.f49439b.mo57163q().mo57403d0(this.f49440c);
            }
            this.f49440c.performDestroy();
            this.f49438a.mo57352d(this.f49440c, false);
            for (C19225e0 next : this.f49439b.mo57158l()) {
                if (next != null) {
                    Fragment k = next.mo57128k();
                    if (this.f49440c.mWho.equals(k.mTargetWho)) {
                        k.mTarget = this.f49440c;
                        k.mTargetWho = null;
                    }
                }
            }
            Fragment fragment3 = this.f49440c;
            String str = fragment3.mTargetWho;
            if (str != null) {
                fragment3.mTarget = this.f49439b.mo57152f(str);
            }
            this.f49439b.mo57166t(this);
            return;
        }
        String str2 = this.f49440c.mTargetWho;
        if (!(str2 == null || (f = this.f49439b.mo57152f(str2)) == null || !f.mRetainInstance)) {
            this.f49440c.mTarget = f;
        }
        this.f49440c.mState = 0;
    }

    /* renamed from: h */
    public void mo57125h() {
        View view;
        if (FragmentManager.m89694W0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom CREATE_VIEW: ");
            sb.append(this.f49440c);
        }
        Fragment fragment = this.f49440c;
        ViewGroup viewGroup = fragment.mContainer;
        if (!(viewGroup == null || (view = fragment.mView) == null)) {
            viewGroup.removeView(view);
        }
        this.f49440c.performDestroyView();
        this.f49438a.mo57362n(this.f49440c, false);
        Fragment fragment2 = this.f49440c;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.mo57496r(null);
        this.f49440c.mInLayout = false;
    }

    /* renamed from: i */
    public void mo57126i() {
        if (FragmentManager.m89694W0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom ATTACHED: ");
            sb.append(this.f49440c);
        }
        this.f49440c.performDetach();
        boolean z = false;
        this.f49438a.mo57353e(this.f49440c, false);
        Fragment fragment = this.f49440c;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (fragment.mRemoving && !fragment.isInBackStack()) {
            z = true;
        }
        if (z || this.f49439b.mo57163q().mo57417q0(this.f49440c)) {
            if (FragmentManager.m89694W0(3)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("initState called for fragment: ");
                sb2.append(this.f49440c);
            }
            this.f49440c.initState();
        }
    }

    /* renamed from: j */
    public void mo57127j() {
        Fragment fragment = this.f49440c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.m89694W0(3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("moveto CREATE_VIEW: ");
                sb.append(this.f49440c);
            }
            Fragment fragment2 = this.f49440c;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(fragment2.mSavedFragmentState), (ViewGroup) null, this.f49440c.mSavedFragmentState);
            View view = this.f49440c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f49440c;
                fragment3.mView.setTag(C19144a.C19147c.fragment_container_view_tag, fragment3);
                Fragment fragment4 = this.f49440c;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.f49440c.performViewCreated();
                C19264q qVar = this.f49438a;
                Fragment fragment5 = this.f49440c;
                qVar.mo57361m(fragment5, fragment5.mView, fragment5.mSavedFragmentState, false);
                this.f49440c.mState = 2;
            }
        }
    }

    @C0359n0
    /* renamed from: k */
    public Fragment mo57128k() {
        return this.f49440c;
    }

    /* renamed from: l */
    public final boolean mo57129l(@C0359n0 View view) {
        if (view == this.f49440c.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f49440c.mView) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: m */
    public void mo57130m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (!this.f49441d) {
            try {
                this.f49441d = true;
                boolean z = false;
                while (true) {
                    int d = mo57121d();
                    Fragment fragment = this.f49440c;
                    int i = fragment.mState;
                    if (d != i) {
                        if (d <= i) {
                            switch (i - 1) {
                                case -1:
                                    mo57126i();
                                    break;
                                case 0:
                                    if (fragment.mBeingSaved && this.f49439b.mo57164r(fragment.mWho) == null) {
                                        mo57136s();
                                    }
                                    mo57124g();
                                    break;
                                case 1:
                                    mo57125h();
                                    this.f49440c.mState = 1;
                                    break;
                                case 2:
                                    fragment.mInLayout = false;
                                    fragment.mState = 2;
                                    break;
                                case 3:
                                    if (FragmentManager.m89694W0(3)) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("movefrom ACTIVITY_CREATED: ");
                                        sb.append(this.f49440c);
                                    }
                                    Fragment fragment2 = this.f49440c;
                                    if (fragment2.mBeingSaved) {
                                        mo57136s();
                                    } else if (fragment2.mView != null && fragment2.mSavedViewState == null) {
                                        mo57137t();
                                    }
                                    Fragment fragment3 = this.f49440c;
                                    if (!(fragment3.mView == null || (viewGroup2 = fragment3.mContainer) == null)) {
                                        SpecialEffectsController.m89940n(viewGroup2, fragment3.getParentFragmentManager()).mo57008d(this);
                                    }
                                    this.f49440c.mState = 3;
                                    break;
                                case 4:
                                    mo57140w();
                                    break;
                                case 5:
                                    fragment.mState = 5;
                                    break;
                                case 6:
                                    mo57131n();
                                    break;
                            }
                        } else {
                            switch (i + 1) {
                                case 0:
                                    mo57120c();
                                    break;
                                case 1:
                                    mo57122e();
                                    break;
                                case 2:
                                    mo57127j();
                                    mo57123f();
                                    break;
                                case 3:
                                    mo57118a();
                                    break;
                                case 4:
                                    if (!(fragment.mView == null || (viewGroup3 = fragment.mContainer) == null)) {
                                        SpecialEffectsController.m89940n(viewGroup3, fragment.getParentFragmentManager()).mo57006b(SpecialEffectsController.Operation.State.m89970g(this.f49440c.mView.getVisibility()), this);
                                    }
                                    this.f49440c.mState = 4;
                                    break;
                                case 5:
                                    mo57139v();
                                    break;
                                case 6:
                                    fragment.mState = 6;
                                    break;
                                case 7:
                                    mo57133p();
                                    break;
                            }
                        }
                        z = true;
                    } else {
                        if (!z && i == -1 && fragment.mRemoving && !fragment.isInBackStack() && !this.f49440c.mBeingSaved) {
                            if (FragmentManager.m89694W0(3)) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Cleaning up state of never attached fragment: ");
                                sb2.append(this.f49440c);
                            }
                            this.f49439b.mo57163q().mo57403d0(this.f49440c);
                            this.f49439b.mo57166t(this);
                            if (FragmentManager.m89694W0(3)) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("initState called for fragment: ");
                                sb3.append(this.f49440c);
                            }
                            this.f49440c.initState();
                        }
                        Fragment fragment4 = this.f49440c;
                        if (fragment4.mHiddenChanged) {
                            if (!(fragment4.mView == null || (viewGroup = fragment4.mContainer) == null)) {
                                SpecialEffectsController n = SpecialEffectsController.m89940n(viewGroup, fragment4.getParentFragmentManager());
                                if (this.f49440c.mHidden) {
                                    n.mo57007c(this);
                                } else {
                                    n.mo57009e(this);
                                }
                            }
                            Fragment fragment5 = this.f49440c;
                            FragmentManager fragmentManager = fragment5.mFragmentManager;
                            if (fragmentManager != null) {
                                fragmentManager.mo56841U0(fragment5);
                            }
                            Fragment fragment6 = this.f49440c;
                            fragment6.mHiddenChanged = false;
                            fragment6.onHiddenChanged(fragment6.mHidden);
                            this.f49440c.mChildFragmentManager.mo56829Q();
                        }
                        this.f49441d = false;
                        return;
                    }
                }
            } catch (Throwable th) {
                this.f49441d = false;
                throw th;
            }
        } else if (FragmentManager.m89694W0(2)) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Ignoring re-entrant call to moveToExpectedState() for ");
            sb4.append(mo57128k());
        }
    }

    /* renamed from: n */
    public void mo57131n() {
        if (FragmentManager.m89694W0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom RESUMED: ");
            sb.append(this.f49440c);
        }
        this.f49440c.performPause();
        this.f49438a.mo57354f(this.f49440c, false);
    }

    /* renamed from: o */
    public void mo57132o(@C0359n0 ClassLoader classLoader) {
        Bundle bundle = this.f49440c.mSavedFragmentState;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            Fragment fragment = this.f49440c;
            fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray(f49435i);
            Fragment fragment2 = this.f49440c;
            fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle(f49436j);
            Fragment fragment3 = this.f49440c;
            fragment3.mTargetWho = fragment3.mSavedFragmentState.getString(f49434h);
            Fragment fragment4 = this.f49440c;
            if (fragment4.mTargetWho != null) {
                fragment4.mTargetRequestCode = fragment4.mSavedFragmentState.getInt(f49433g, 0);
            }
            Fragment fragment5 = this.f49440c;
            Boolean bool = fragment5.mSavedUserVisibleHint;
            if (bool != null) {
                fragment5.mUserVisibleHint = bool.booleanValue();
                this.f49440c.mSavedUserVisibleHint = null;
            } else {
                fragment5.mUserVisibleHint = fragment5.mSavedFragmentState.getBoolean(f49437k, true);
            }
            Fragment fragment6 = this.f49440c;
            if (!fragment6.mUserVisibleHint) {
                fragment6.mDeferStart = true;
            }
        }
    }

    /* renamed from: p */
    public void mo57133p() {
        String str;
        if (FragmentManager.m89694W0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto RESUMED: ");
            sb.append(this.f49440c);
        }
        View focusedView = this.f49440c.getFocusedView();
        if (focusedView != null && mo57129l(focusedView)) {
            boolean requestFocus = focusedView.requestFocus();
            if (FragmentManager.m89694W0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("requestFocus: Restoring focused view ");
                sb2.append(focusedView);
                sb2.append(" ");
                if (requestFocus) {
                    str = "succeeded";
                } else {
                    str = "failed";
                }
                sb2.append(str);
                sb2.append(" on Fragment ");
                sb2.append(this.f49440c);
                sb2.append(" resulting in focused view ");
                sb2.append(this.f49440c.mView.findFocus());
            }
        }
        this.f49440c.setFocusedView((View) null);
        this.f49440c.performResume();
        this.f49438a.mo57357i(this.f49440c, false);
        Fragment fragment = this.f49440c;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    /* renamed from: q */
    public final Bundle mo57134q() {
        Bundle bundle = new Bundle();
        this.f49440c.performSaveInstanceState(bundle);
        this.f49438a.mo57358j(this.f49440c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f49440c.mView != null) {
            mo57137t();
        }
        if (this.f49440c.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray(f49435i, this.f49440c.mSavedViewState);
        }
        if (this.f49440c.mSavedViewRegistryState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle(f49436j, this.f49440c.mSavedViewRegistryState);
        }
        if (!this.f49440c.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean(f49437k, this.f49440c.mUserVisibleHint);
        }
        return bundle;
    }

    @C0363p0
    /* renamed from: r */
    public Fragment.SavedState mo57135r() {
        Bundle q;
        if (this.f49440c.mState <= -1 || (q = mo57134q()) == null) {
            return null;
        }
        return new Fragment.SavedState(q);
    }

    /* renamed from: s */
    public void mo57136s() {
        FragmentState fragmentState = new FragmentState(this.f49440c);
        Fragment fragment = this.f49440c;
        if (fragment.mState <= -1 || fragmentState.f49308X != null) {
            fragmentState.f49308X = fragment.mSavedFragmentState;
        } else {
            Bundle q = mo57134q();
            fragmentState.f49308X = q;
            if (this.f49440c.mTargetWho != null) {
                if (q == null) {
                    fragmentState.f49308X = new Bundle();
                }
                fragmentState.f49308X.putString(f49434h, this.f49440c.mTargetWho);
                int i = this.f49440c.mTargetRequestCode;
                if (i != 0) {
                    fragmentState.f49308X.putInt(f49433g, i);
                }
            }
        }
        this.f49439b.mo57146C(this.f49440c.mWho, fragmentState);
    }

    /* renamed from: t */
    public void mo57137t() {
        if (this.f49440c.mView != null) {
            if (FragmentManager.m89694W0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Saving view state for fragment ");
                sb.append(this.f49440c);
                sb.append(" with view ");
                sb.append(this.f49440c.mView);
            }
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f49440c.mView.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.f49440c.mSavedViewState = sparseArray;
            }
            Bundle bundle = new Bundle();
            this.f49440c.mViewLifecycleOwner.mo57324e(bundle);
            if (!bundle.isEmpty()) {
                this.f49440c.mSavedViewRegistryState = bundle;
            }
        }
    }

    /* renamed from: u */
    public void mo57138u(int i) {
        this.f49442e = i;
    }

    /* renamed from: v */
    public void mo57139v() {
        if (FragmentManager.m89694W0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto STARTED: ");
            sb.append(this.f49440c);
        }
        this.f49440c.performStart();
        this.f49438a.mo57359k(this.f49440c, false);
    }

    /* renamed from: w */
    public void mo57140w() {
        if (FragmentManager.m89694W0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom STARTED: ");
            sb.append(this.f49440c);
        }
        this.f49440c.performStop();
        this.f49438a.mo57360l(this.f49440c, false);
    }

    public C19225e0(@C0359n0 C19264q qVar, @C0359n0 C19231g0 g0Var, @C0359n0 ClassLoader classLoader, @C0359n0 C19250l lVar, @C0359n0 FragmentState fragmentState) {
        this.f49438a = qVar;
        this.f49439b = g0Var;
        Fragment a = fragmentState.mo56967a(lVar, classLoader);
        this.f49440c = a;
        if (FragmentManager.m89694W0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Instantiated fragment ");
            sb.append(a);
        }
    }

    public C19225e0(@C0359n0 C19264q qVar, @C0359n0 C19231g0 g0Var, @C0359n0 Fragment fragment, @C0359n0 FragmentState fragmentState) {
        this.f49438a = qVar;
        this.f49439b = g0Var;
        this.f49440c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        Bundle bundle = fragmentState.f49308X;
        if (bundle != null) {
            fragment.mSavedFragmentState = bundle;
        } else {
            fragment.mSavedFragmentState = new Bundle();
        }
    }
}

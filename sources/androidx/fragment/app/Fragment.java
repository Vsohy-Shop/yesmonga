package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.C0263a;
import androidx.activity.result.C0264b;
import androidx.activity.result.C0302g;
import androidx.activity.result.C0304i;
import androidx.activity.result.contract.C0266a;
import androidx.annotation.C0319a;
import androidx.annotation.C0324b1;
import androidx.annotation.C0341g1;
import androidx.annotation.C0346i;
import androidx.annotation.C0347i0;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0360o;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.arch.core.util.C0843a;
import androidx.core.app.C17052c6;
import androidx.core.app.C17125i;
import androidx.core.view.C18334p0;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.C19392a1;
import androidx.lifecycle.C19395b1;
import androidx.lifecycle.C19423g0;
import androidx.lifecycle.C19455p;
import androidx.lifecycle.C19463r0;
import androidx.lifecycle.C19470t;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19502x0;
import androidx.lifecycle.C19512y;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.lifecycle.viewmodel.C19477a;
import androidx.lifecycle.viewmodel.C19492e;
import androidx.loader.app.C19530a;
import androidx.savedstate.C20431c;
import androidx.savedstate.C20435d;
import androidx.savedstate.C20437e;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.bumptech.glide.load.engine.GlideException;
import com.carrefour.fid.android.core.extension.C36306e;
import com.google.firebase.installations.C33124s;
import com.google.firebase.installations.local.C33093b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, C19499w, C19395b1, C19455p, C20437e, C0264b {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    C19162j mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    @C0359n0
    FragmentManager mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    @C0347i0
    private int mContentLayoutId;
    C19502x0.C19506b mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    FragmentManager mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    C19253m<?> mHost;
    boolean mInLayout;
    boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    C19512y mLifecycleRegistry;
    Lifecycle.State mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<C19164l> mOnPreAttachedListeners;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    Runnable mPostponedDurationRunnable;
    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    private final C19164l mSavedStateAttachListener;
    C20435d mSavedStateRegistryController;
    @C0363p0
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mUserVisibleHint;
    View mView;
    @C0363p0
    C19254m0 mViewLifecycleOwner;
    C19423g0<C19499w> mViewLifecycleOwnerLiveData;
    @C0359n0
    String mWho;

    public static class InstantiationException extends RuntimeException {
        public InstantiationException(@C0359n0 String str, @C0363p0 Exception exc) {
            super(str, exc);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$a */
    public class C19153a extends C0302g<I> {

        /* renamed from: a */
        public final /* synthetic */ AtomicReference f49174a;

        /* renamed from: b */
        public final /* synthetic */ C0266a f49175b;

        public C19153a(AtomicReference atomicReference, C0266a aVar) {
            this.f49174a = atomicReference;
            this.f49175b = aVar;
        }

        @C0359n0
        /* renamed from: a */
        public C0266a<I, ?> mo820a() {
            return this.f49175b;
        }

        /* renamed from: c */
        public void mo821c(I i, @C0363p0 C17125i iVar) {
            C0302g gVar = (C0302g) this.f49174a.get();
            if (gVar != null) {
                gVar.mo821c(i, iVar);
                return;
            }
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }

        /* renamed from: d */
        public void mo822d() {
            C0302g gVar = (C0302g) this.f49174a.getAndSet((Object) null);
            if (gVar != null) {
                gVar.mo822d();
            }
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$b */
    public class C19154b implements Runnable {
        public C19154b() {
        }

        public void run() {
            Fragment.this.startPostponedEnterTransition();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$c */
    public class C19155c extends C19164l {
        public C19155c() {
            super((C19154b) null);
        }

        /* renamed from: a */
        public void mo56756a() {
            Fragment.this.mSavedStateRegistryController.mo61296c();
            SavedStateHandleSupport.m90591c(Fragment.this);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$d */
    public class C19156d implements Runnable {
        public C19156d() {
        }

        public void run() {
            Fragment.this.callStartTransitionListener(false);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$e */
    public class C19157e implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ SpecialEffectsController f49180a;

        public C19157e(SpecialEffectsController specialEffectsController) {
            this.f49180a = specialEffectsController;
        }

        public void run() {
            this.f49180a.mo57011g();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$f */
    public class C19158f extends C19240j {
        public C19158f() {
        }

        @C0363p0
        /* renamed from: c */
        public View mo56759c(int i) {
            View view = Fragment.this.mView;
            if (view != null) {
                return view.findViewById(i);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }

        /* renamed from: g */
        public boolean mo56760g() {
            return Fragment.this.mView != null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$g */
    public class C19159g implements C0843a<Void, ActivityResultRegistry> {
        public C19159g() {
        }

        /* renamed from: a */
        public ActivityResultRegistry apply(Void voidR) {
            Fragment fragment = Fragment.this;
            C19253m<?> mVar = fragment.mHost;
            if (mVar instanceof C0304i) {
                return ((C0304i) mVar).mo715i();
            }
            return fragment.requireActivity().mo715i();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$h */
    public class C19160h implements C0843a<Void, ActivityResultRegistry> {

        /* renamed from: a */
        public final /* synthetic */ ActivityResultRegistry f49184a;

        public C19160h(ActivityResultRegistry activityResultRegistry) {
            this.f49184a = activityResultRegistry;
        }

        /* renamed from: a */
        public ActivityResultRegistry apply(Void voidR) {
            return this.f49184a;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$i */
    public class C19161i extends C19164l {

        /* renamed from: a */
        public final /* synthetic */ C0843a f49186a;

        /* renamed from: b */
        public final /* synthetic */ AtomicReference f49187b;

        /* renamed from: c */
        public final /* synthetic */ C0266a f49188c;

        /* renamed from: d */
        public final /* synthetic */ C0263a f49189d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19161i(C0843a aVar, AtomicReference atomicReference, C0266a aVar2, C0263a aVar3) {
            super((C19154b) null);
            this.f49186a = aVar;
            this.f49187b = atomicReference;
            this.f49188c = aVar2;
            this.f49189d = aVar3;
        }

        /* renamed from: a */
        public void mo56756a() {
            this.f49187b.set(((ActivityResultRegistry) this.f49186a.apply(null)).mo880j(Fragment.this.generateActivityResultKey(), Fragment.this, this.f49188c, this.f49189d));
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$j */
    public static class C19162j {

        /* renamed from: a */
        public View f49191a;

        /* renamed from: b */
        public boolean f49192b;
        @C0319a

        /* renamed from: c */
        public int f49193c;
        @C0319a

        /* renamed from: d */
        public int f49194d;
        @C0319a

        /* renamed from: e */
        public int f49195e;
        @C0319a

        /* renamed from: f */
        public int f49196f;

        /* renamed from: g */
        public int f49197g;

        /* renamed from: h */
        public ArrayList<String> f49198h;

        /* renamed from: i */
        public ArrayList<String> f49199i;

        /* renamed from: j */
        public Object f49200j = null;

        /* renamed from: k */
        public Object f49201k;

        /* renamed from: l */
        public Object f49202l;

        /* renamed from: m */
        public Object f49203m;

        /* renamed from: n */
        public Object f49204n;

        /* renamed from: o */
        public Object f49205o;

        /* renamed from: p */
        public Boolean f49206p;

        /* renamed from: q */
        public Boolean f49207q;

        /* renamed from: r */
        public C17052c6 f49208r;

        /* renamed from: s */
        public C17052c6 f49209s;

        /* renamed from: t */
        public float f49210t;

        /* renamed from: u */
        public View f49211u;

        /* renamed from: v */
        public boolean f49212v;

        public C19162j() {
            Object obj = Fragment.USE_DEFAULT_TRANSITION;
            this.f49201k = obj;
            this.f49202l = null;
            this.f49203m = obj;
            this.f49204n = null;
            this.f49205o = obj;
            this.f49208r = null;
            this.f49209s = null;
            this.f49210t = 1.0f;
            this.f49211u = null;
        }
    }

    @C0376v0(19)
    /* renamed from: androidx.fragment.app.Fragment$k */
    public static class C19163k {
        /* renamed from: a */
        public static void m89688a(@C0359n0 View view) {
            view.cancelPendingInputEvents();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$l */
    public static abstract class C19164l {
        public C19164l() {
        }

        /* renamed from: a */
        public abstract void mo56756a();

        public /* synthetic */ C19164l(C19154b bVar) {
            this();
        }
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new C19278w();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new C19154b();
        this.mMaxState = Lifecycle.State.RESUMED;
        this.mViewLifecycleOwnerLiveData = new C19423g0<>();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        this.mSavedStateAttachListener = new C19155c();
        mo56588E0();
    }

    @C0359n0
    @Deprecated
    public static Fragment instantiate(@C0359n0 Context context, @C0359n0 String str) {
        return instantiate(context, str, (Bundle) null);
    }

    /* renamed from: B0 */
    public final C19162j mo56585B0() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new C19162j();
        }
        return this.mAnimationInfo;
    }

    /* renamed from: C0 */
    public final int mo56586C0() {
        Lifecycle.State state = this.mMaxState;
        if (state == Lifecycle.State.INITIALIZED || this.mParentFragment == null) {
            return state.ordinal();
        }
        return Math.min(state.ordinal(), this.mParentFragment.mo56586C0());
    }

    @C0363p0
    /* renamed from: D0 */
    public final Fragment mo56587D0(boolean z) {
        String str;
        if (z) {
            FragmentStrictMode.m90380m(this);
        }
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return fragmentManager.mo56892o0(str);
    }

    /* renamed from: E0 */
    public final void mo56588E0() {
        this.mLifecycleRegistry = new C19512y(this);
        this.mSavedStateRegistryController = C20435d.m95271a(this);
        this.mDefaultFactory = null;
        if (!this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            mo56590G0(this.mSavedStateAttachListener);
        }
    }

    @C0359n0
    /* renamed from: F0 */
    public final <I, O> C0302g<I> mo56589F0(@C0359n0 C0266a<I, O> aVar, @C0359n0 C0843a<Void, ActivityResultRegistry> aVar2, @C0359n0 C0263a<O> aVar3) {
        if (this.mState <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            mo56590G0(new C19161i(aVar2, atomicReference, aVar, aVar3));
            return new C19153a(atomicReference, aVar);
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    /* renamed from: G0 */
    public final void mo56590G0(@C0359n0 C19164l lVar) {
        if (this.mState >= 0) {
            lVar.mo56756a();
        } else {
            this.mOnPreAttachedListeners.add(lVar);
        }
    }

    /* renamed from: H0 */
    public final void mo56591H0() {
        if (FragmentManager.m89694W0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto RESTORE_VIEW_STATE: ");
            sb.append(this);
        }
        if (this.mView != null) {
            restoreViewState(this.mSavedFragmentState);
        }
        this.mSavedFragmentState = null;
    }

    public void callStartTransitionListener(boolean z) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        C19162j jVar = this.mAnimationInfo;
        if (jVar != null) {
            jVar.f49212v = false;
        }
        if (this.mView != null && (viewGroup = this.mContainer) != null && (fragmentManager = this.mFragmentManager) != null) {
            SpecialEffectsController n = SpecialEffectsController.m89940n(viewGroup, fragmentManager);
            n.mo57018p();
            if (z) {
                this.mHost.mo57317l().post(new C19157e(n));
            } else {
                n.mo57011g();
            }
        }
    }

    @C0359n0
    public C19240j createFragmentContainer() {
        return new C19158f();
    }

    public void dump(@C0359n0 String str, @C0363p0 FileDescriptor fileDescriptor, @C0359n0 PrintWriter printWriter, @C0363p0 String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment D0 = mo56587D0(false);
        if (D0 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(D0);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            C19530a.m90901d(this).mo57721b(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + C33124s.f80355c);
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.mo56873e0(str + GlideException.C22148a.f56917d, fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(@C0363p0 Object obj) {
        return super.equals(obj);
    }

    @C0363p0
    public Fragment findFragmentByWho(@C0359n0 String str) {
        if (str.equals(this.mWho)) {
            return this;
        }
        return this.mChildFragmentManager.mo56906t0(str);
    }

    @C0359n0
    public String generateActivityResultKey() {
        return FragmentManager.f49222W + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    @C0363p0
    public final C19232h getActivity() {
        C19253m<?> mVar = this.mHost;
        if (mVar == null) {
            return null;
        }
        return (C19232h) mVar.mo57315j();
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        C19162j jVar = this.mAnimationInfo;
        if (jVar == null || (bool = jVar.f49207q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        C19162j jVar = this.mAnimationInfo;
        if (jVar == null || (bool = jVar.f49206p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        C19162j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f49191a;
    }

    @C0363p0
    public final Bundle getArguments() {
        return this.mArguments;
    }

    @C0359n0
    public final FragmentManager getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    @C0363p0
    public Context getContext() {
        C19253m<?> mVar = this.mHost;
        if (mVar == null) {
            return null;
        }
        return mVar.mo57316k();
    }

    @C0359n0
    @C0346i
    public C19477a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            } else if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            } else {
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
        }
        if (application == null && FragmentManager.m89694W0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Could not find Application instance from Context ");
            sb.append(requireContext().getApplicationContext());
            sb.append(", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        C19492e eVar = new C19492e();
        if (application != null) {
            eVar.mo57690c(C19502x0.C19503a.f49893i, application);
        }
        eVar.mo57690c(SavedStateHandleSupport.f49731c, this);
        eVar.mo57690c(SavedStateHandleSupport.f49732d, this);
        if (getArguments() != null) {
            eVar.mo57690c(SavedStateHandleSupport.f49733e, getArguments());
        }
        return eVar;
    }

    @C0359n0
    public C19502x0.C19506b getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager != null) {
            if (this.mDefaultFactory == null) {
                Context applicationContext = requireContext().getApplicationContext();
                while (true) {
                    if (!(applicationContext instanceof ContextWrapper)) {
                        application = null;
                        break;
                    } else if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                        break;
                    } else {
                        applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                    }
                }
                if (application == null && FragmentManager.m89694W0(3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Could not find Application instance from Context ");
                    sb.append(requireContext().getApplicationContext());
                    sb.append(", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
                }
                this.mDefaultFactory = new C19463r0(application, this, getArguments());
            }
            return this.mDefaultFactory;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @C0319a
    public int getEnterAnim() {
        C19162j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f49193c;
    }

    @C0363p0
    public Object getEnterTransition() {
        C19162j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f49200j;
    }

    public C17052c6 getEnterTransitionCallback() {
        C19162j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f49208r;
    }

    @C0319a
    public int getExitAnim() {
        C19162j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f49194d;
    }

    @C0363p0
    public Object getExitTransition() {
        C19162j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f49202l;
    }

    public C17052c6 getExitTransitionCallback() {
        C19162j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f49209s;
    }

    public View getFocusedView() {
        C19162j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f49211u;
    }

    @C0363p0
    @Deprecated
    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    @C0363p0
    public final Object getHost() {
        C19253m<?> mVar = this.mHost;
        if (mVar == null) {
            return null;
        }
        return mVar.mo57195n();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    @C0359n0
    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater((Bundle) null) : layoutInflater;
    }

    @C0359n0
    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @C0359n0
    @Deprecated
    public C19530a getLoaderManager() {
        return C19530a.m90901d(this);
    }

    public int getNextTransition() {
        C19162j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f49197g;
    }

    @C0363p0
    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    @C0359n0
    public final FragmentManager getParentFragmentManager() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public boolean getPopDirection() {
        C19162j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return false;
        }
        return jVar.f49192b;
    }

    @C0319a
    public int getPopEnterAnim() {
        C19162j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f49195e;
    }

    @C0319a
    public int getPopExitAnim() {
        C19162j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f49196f;
    }

    public float getPostOnViewCreatedAlpha() {
        C19162j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 1.0f;
        }
        return jVar.f49210t;
    }

    @C0363p0
    public Object getReenterTransition() {
        C19162j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.f49203m;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getExitTransition();
        }
        return obj;
    }

    @C0359n0
    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        FragmentStrictMode.m90378k(this);
        return this.mRetainInstance;
    }

    @C0363p0
    public Object getReturnTransition() {
        C19162j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.f49201k;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getEnterTransition();
        }
        return obj;
    }

    @C0359n0
    public final C20431c getSavedStateRegistry() {
        return this.mSavedStateRegistryController.mo61295b();
    }

    @C0363p0
    public Object getSharedElementEnterTransition() {
        C19162j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f49204n;
    }

    @C0363p0
    public Object getSharedElementReturnTransition() {
        C19162j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.f49205o;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getSharedElementEnterTransition();
        }
        return obj;
    }

    @C0359n0
    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        C19162j jVar = this.mAnimationInfo;
        if (jVar == null || (arrayList = jVar.f49198h) == null) {
            return new ArrayList<>();
        }
        return arrayList;
    }

    @C0359n0
    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        C19162j jVar = this.mAnimationInfo;
        if (jVar == null || (arrayList = jVar.f49199i) == null) {
            return new ArrayList<>();
        }
        return arrayList;
    }

    @C0359n0
    public final String getString(@C0324b1 int i) {
        return getResources().getString(i);
    }

    @C0363p0
    public final String getTag() {
        return this.mTag;
    }

    @C0363p0
    @Deprecated
    public final Fragment getTargetFragment() {
        return mo56587D0(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        FragmentStrictMode.m90379l(this);
        return this.mTargetRequestCode;
    }

    @C0359n0
    public final CharSequence getText(@C0324b1 int i) {
        return getResources().getText(i);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    @C0363p0
    public View getView() {
        return this.mView;
    }

    @C0353k0
    @C0359n0
    public C19499w getViewLifecycleOwner() {
        C19254m0 m0Var = this.mViewLifecycleOwner;
        if (m0Var != null) {
            return m0Var;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    @C0359n0
    public LiveData<C19499w> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @C0359n0
    public C19392a1 getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        } else if (mo56586C0() != Lifecycle.State.INITIALIZED.ordinal()) {
            return this.mFragmentManager.mo56832R0(this);
        } else {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        mo56588E0();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new C19278w();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        FragmentManager fragmentManager;
        if (this.mHidden || ((fragmentManager = this.mFragmentManager) != null && fragmentManager.mo56855Z0(this.mParentFragment))) {
            return true;
        }
        return false;
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final boolean isMenuVisible() {
        FragmentManager fragmentManager;
        if (!this.mMenuVisible || ((fragmentManager = this.mFragmentManager) != null && !fragmentManager.mo56859a1(this.mParentFragment))) {
            return false;
        }
        return true;
    }

    public boolean isPostponed() {
        C19162j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return false;
        }
        return jVar.f49212v;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.mo56871d1();
    }

    public final boolean isVisible() {
        View view;
        if (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.mo56890n1();
    }

    @C0353k0
    @Deprecated
    @C0346i
    public void onActivityCreated(@C0363p0 Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i, int i2, @C0363p0 Intent intent) {
        if (FragmentManager.m89694W0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" received the following in onActivityResult(): requestCode: ");
            sb.append(i);
            sb.append(" resultCode: ");
            sb.append(i2);
            sb.append(" data: ");
            sb.append(intent);
        }
    }

    @C0353k0
    @C0346i
    public void onAttach(@C0359n0 Context context) {
        this.mCalled = true;
        C19253m<?> mVar = this.mHost;
        Activity j = mVar == null ? null : mVar.mo57315j();
        if (j != null) {
            this.mCalled = false;
            onAttach(j);
        }
    }

    @C0353k0
    @Deprecated
    public void onAttachFragment(@C0359n0 Fragment fragment) {
    }

    @C0346i
    public void onConfigurationChanged(@C0359n0 Configuration configuration) {
        this.mCalled = true;
    }

    @C0353k0
    public boolean onContextItemSelected(@C0359n0 MenuItem menuItem) {
        return false;
    }

    @C0353k0
    @C0346i
    public void onCreate(@C0363p0 Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        if (!this.mChildFragmentManager.mo56867c1(1)) {
            this.mChildFragmentManager.mo56809J();
        }
    }

    @C0363p0
    @C0353k0
    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    @C0363p0
    @C0353k0
    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    @C0353k0
    public void onCreateContextMenu(@C0359n0 ContextMenu contextMenu, @C0359n0 View view, @C0363p0 ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @C0353k0
    @Deprecated
    public void onCreateOptionsMenu(@C0359n0 Menu menu, @C0359n0 MenuInflater menuInflater) {
    }

    @C0363p0
    @C0353k0
    public View onCreateView(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, @C0363p0 Bundle bundle) {
        int i = this.mContentLayoutId;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    @C0353k0
    @C0346i
    public void onDestroy() {
        this.mCalled = true;
    }

    @C0353k0
    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    @C0353k0
    @C0346i
    public void onDestroyView() {
        this.mCalled = true;
    }

    @C0353k0
    @C0346i
    public void onDetach() {
        this.mCalled = true;
    }

    @C0359n0
    public LayoutInflater onGetLayoutInflater(@C0363p0 Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    @C0353k0
    public void onHiddenChanged(boolean z) {
    }

    @C0341g1
    @C0346i
    public void onInflate(@C0359n0 Context context, @C0359n0 AttributeSet attributeSet, @C0363p0 Bundle bundle) {
        this.mCalled = true;
        C19253m<?> mVar = this.mHost;
        Activity j = mVar == null ? null : mVar.mo57315j();
        if (j != null) {
            this.mCalled = false;
            onInflate(j, attributeSet, bundle);
        }
    }

    @C0353k0
    @C0346i
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    @C0353k0
    @Deprecated
    public boolean onOptionsItemSelected(@C0359n0 MenuItem menuItem) {
        return false;
    }

    @C0353k0
    @Deprecated
    public void onOptionsMenuClosed(@C0359n0 Menu menu) {
    }

    @C0353k0
    @C0346i
    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    @C0353k0
    @Deprecated
    public void onPrepareOptionsMenu(@C0359n0 Menu menu) {
    }

    @C0353k0
    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i, @C0359n0 String[] strArr, @C0359n0 int[] iArr) {
    }

    @C0353k0
    @C0346i
    public void onResume() {
        this.mCalled = true;
    }

    @C0353k0
    public void onSaveInstanceState(@C0359n0 Bundle bundle) {
    }

    @C0353k0
    @C0346i
    public void onStart() {
        this.mCalled = true;
    }

    @C0353k0
    @C0346i
    public void onStop() {
        this.mCalled = true;
    }

    @C0353k0
    public void onViewCreated(@C0359n0 View view, @C0363p0 Bundle bundle) {
    }

    @C0353k0
    @C0346i
    public void onViewStateRestored(@C0363p0 Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.mo56890n1();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            mo56591H0();
            this.mChildFragmentManager.mo56797F();
            return;
        }
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    public void performAttach() {
        Iterator<C19164l> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().mo56756a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.mo56902s(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.mo57316k());
        if (this.mCalled) {
            this.mFragmentManager.mo56826P(this);
            this.mChildFragmentManager.mo56800G();
            return;
        }
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onAttach()");
    }

    public void performConfigurationChanged(@C0359n0 Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public boolean performContextItemSelected(@C0359n0 MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.mo56806I(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.mo56890n1();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.mo57464a(new C19470t() {
            /* renamed from: i */
            public void mo750i(@C0359n0 C19499w wVar, @C0359n0 Lifecycle.C19372Event event) {
                View view;
                if (event == Lifecycle.C19372Event.ON_STOP && (view = Fragment.this.mView) != null) {
                    C19163k.m89688a(view);
                }
            }
        });
        this.mSavedStateRegistryController.mo61297d(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.mo57705l(Lifecycle.C19372Event.ON_CREATE);
            return;
        }
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onCreate()");
    }

    public boolean performCreateOptionsMenu(@C0359n0 Menu menu, @C0359n0 MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z = true;
        }
        return z | this.mChildFragmentManager.mo56812K(menu, menuInflater);
    }

    public void performCreateView(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, @C0363p0 Bundle bundle) {
        this.mChildFragmentManager.mo56890n1();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new C19254m0(this, getViewModelStore());
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        if (onCreateView != null) {
            this.mViewLifecycleOwner.mo57321b();
            ViewTreeLifecycleOwner.m90621b(this.mView, this.mViewLifecycleOwner);
            ViewTreeViewModelStoreOwner.m90625b(this.mView, this.mViewLifecycleOwner);
            ViewTreeSavedStateRegistryOwner.m95252b(this.mView, this.mViewLifecycleOwner);
            this.mViewLifecycleOwnerLiveData.mo57496r(this.mViewLifecycleOwner);
        } else if (!this.mViewLifecycleOwner.mo57322c()) {
            this.mViewLifecycleOwner = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    public void performDestroy() {
        this.mChildFragmentManager.mo56815L();
        this.mLifecycleRegistry.mo57705l(Lifecycle.C19372Event.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onDestroy()");
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.mo56818M();
        if (this.mView != null && this.mViewLifecycleOwner.getLifecycle().mo57465b().mo57474q(Lifecycle.State.CREATED)) {
            this.mViewLifecycleOwner.mo57320a(Lifecycle.C19372Event.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            C19530a.m90901d(this).mo57725h();
            this.mPerformedCreateView = false;
            return;
        }
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onDetach()");
        } else if (!this.mChildFragmentManager.mo56844V0()) {
            this.mChildFragmentManager.mo56815L();
            this.mChildFragmentManager = new C19278w();
        }
    }

    @C0359n0
    public LayoutInflater performGetLayoutInflater(@C0363p0 Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
    }

    public boolean performOptionsItemSelected(@C0359n0 MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (!this.mHasMenu || !this.mMenuVisible || !onOptionsItemSelected(menuItem)) {
            return this.mChildFragmentManager.mo56831R(menuItem);
        }
        return true;
    }

    public void performOptionsMenuClosed(@C0359n0 Menu menu) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible) {
                onOptionsMenuClosed(menu);
            }
            this.mChildFragmentManager.mo56834S(menu);
        }
    }

    public void performPause() {
        this.mChildFragmentManager.mo56840U();
        if (this.mView != null) {
            this.mViewLifecycleOwner.mo57320a(Lifecycle.C19372Event.ON_PAUSE);
        }
        this.mLifecycleRegistry.mo57705l(Lifecycle.C19372Event.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
    }

    public boolean performPrepareOptionsMenu(@C0359n0 Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z = true;
        }
        return z | this.mChildFragmentManager.mo56846W(menu);
    }

    public void performPrimaryNavigationFragmentChanged() {
        boolean b1 = this.mFragmentManager.mo56863b1(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != b1) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(b1);
            onPrimaryNavigationFragmentChanged(b1);
            this.mChildFragmentManager.mo56848X();
        }
    }

    public void performResume() {
        this.mChildFragmentManager.mo56890n1();
        this.mChildFragmentManager.mo56880j0(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (this.mCalled) {
            C19512y yVar = this.mLifecycleRegistry;
            Lifecycle.C19372Event event = Lifecycle.C19372Event.ON_RESUME;
            yVar.mo57705l(event);
            if (this.mView != null) {
                this.mViewLifecycleOwner.mo57320a(event);
            }
            this.mChildFragmentManager.mo56851Y();
            return;
        }
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onResume()");
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.mo61298e(bundle);
        Bundle Q1 = this.mChildFragmentManager.m89696e1();
        if (Q1 != null) {
            bundle.putParcelable(FragmentManager.f49218S, Q1);
        }
    }

    public void performStart() {
        this.mChildFragmentManager.mo56890n1();
        this.mChildFragmentManager.mo56880j0(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (this.mCalled) {
            C19512y yVar = this.mLifecycleRegistry;
            Lifecycle.C19372Event event = Lifecycle.C19372Event.ON_START;
            yVar.mo57705l(event);
            if (this.mView != null) {
                this.mViewLifecycleOwner.mo57320a(event);
            }
            this.mChildFragmentManager.mo56854Z();
            return;
        }
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onStart()");
    }

    public void performStop() {
        this.mChildFragmentManager.mo56862b0();
        if (this.mView != null) {
            this.mViewLifecycleOwner.mo57320a(Lifecycle.C19372Event.ON_STOP);
        }
        this.mLifecycleRegistry.mo57705l(Lifecycle.C19372Event.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    public void performViewCreated() {
        onViewCreated(this.mView, this.mSavedFragmentState);
        this.mChildFragmentManager.mo56866c0();
    }

    public void postponeEnterTransition() {
        mo56585B0().f49212v = true;
    }

    @C0353k0
    @C0359n0
    public final <I, O> C0302g<I> registerForActivityResult(@C0359n0 C0266a<I, O> aVar, @C0359n0 C0263a<O> aVar2) {
        return mo56589F0(aVar, new C19159g(), aVar2);
    }

    public void registerForContextMenu(@C0359n0 View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(@C0359n0 String[] strArr, int i) {
        if (this.mHost != null) {
            getParentFragmentManager().mo56881j1(this, strArr, i);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @C0359n0
    public final C19232h requireActivity() {
        C19232h activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @C0359n0
    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    @C0359n0
    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @C0359n0
    @Deprecated
    public final FragmentManager requireFragmentManager() {
        return getParentFragmentManager();
    }

    @C0359n0
    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a host.");
    }

    @C0359n0
    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException("Fragment " + this + " is not attached to any Fragment or host");
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    @C0359n0
    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public void restoreChildFragmentState(@C0363p0 Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable(FragmentManager.f49218S)) != null) {
            this.mChildFragmentManager.mo56820M1(parcelable);
            this.mChildFragmentManager.mo56809J();
        }
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.mo57323d(this.mSavedViewRegistryState);
            this.mSavedViewRegistryState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onViewStateRestored()");
        } else if (this.mView != null) {
            this.mViewLifecycleOwner.mo57320a(Lifecycle.C19372Event.ON_CREATE);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        mo56585B0().f49207q = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        mo56585B0().f49206p = Boolean.valueOf(z);
    }

    public void setAnimations(@C0319a int i, @C0319a int i2, @C0319a int i3, @C0319a int i4) {
        if (this.mAnimationInfo != null || i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
            mo56585B0().f49193c = i;
            mo56585B0().f49194d = i2;
            mo56585B0().f49195e = i3;
            mo56585B0().f49196f = i4;
        }
    }

    public void setArguments(@C0363p0 Bundle bundle) {
        if (this.mFragmentManager == null || !isStateSaved()) {
            this.mArguments = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    public void setEnterSharedElementCallback(@C0363p0 C17052c6 c6Var) {
        mo56585B0().f49208r = c6Var;
    }

    public void setEnterTransition(@C0363p0 Object obj) {
        mo56585B0().f49200j = obj;
    }

    public void setExitSharedElementCallback(@C0363p0 C17052c6 c6Var) {
        mo56585B0().f49209s = c6Var;
    }

    public void setExitTransition(@C0363p0 Object obj) {
        mo56585B0().f49202l = obj;
    }

    public void setFocusedView(View view) {
        mo56585B0().f49211u = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (isAdded() && !isHidden()) {
                this.mHost.mo57192D();
            }
        }
    }

    public void setInitialSavedState(@C0363p0 SavedState savedState) {
        Bundle bundle;
        if (this.mFragmentManager == null) {
            if (savedState == null || (bundle = savedState.f49173a) == null) {
                bundle = null;
            }
            this.mSavedFragmentState = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.mo57192D();
            }
        }
    }

    public void setNextTransition(int i) {
        if (this.mAnimationInfo != null || i != 0) {
            mo56585B0();
            this.mAnimationInfo.f49197g = i;
        }
    }

    public void setPopDirection(boolean z) {
        if (this.mAnimationInfo != null) {
            mo56585B0().f49192b = z;
        }
    }

    public void setPostOnViewCreatedAlpha(float f) {
        mo56585B0().f49210t = f;
    }

    public void setReenterTransition(@C0363p0 Object obj) {
        mo56585B0().f49203m = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z) {
        FragmentStrictMode.m90381o(this);
        this.mRetainInstance = z;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z) {
            fragmentManager.mo56897q(this);
        } else {
            fragmentManager.mo56802G1(this);
        }
    }

    public void setReturnTransition(@C0363p0 Object obj) {
        mo56585B0().f49201k = obj;
    }

    public void setSharedElementEnterTransition(@C0363p0 Object obj) {
        mo56585B0().f49204n = obj;
    }

    public void setSharedElementNames(@C0363p0 ArrayList<String> arrayList, @C0363p0 ArrayList<String> arrayList2) {
        mo56585B0();
        C19162j jVar = this.mAnimationInfo;
        jVar.f49198h = arrayList;
        jVar.f49199i = arrayList2;
    }

    public void setSharedElementReturnTransition(@C0363p0 Object obj) {
        mo56585B0().f49205o = obj;
    }

    @Deprecated
    public void setTargetFragment(@C0363p0 Fragment fragment, int i) {
        FragmentManager fragmentManager;
        if (fragment != null) {
            FragmentStrictMode.m90382p(this, fragment, i);
        }
        FragmentManager fragmentManager2 = this.mFragmentManager;
        if (fragment != null) {
            fragmentManager = fragment.mFragmentManager;
        } else {
            fragmentManager = null;
        }
        if (fragmentManager2 == null || fragmentManager == null || fragmentManager2 == fragmentManager) {
            Fragment fragment2 = fragment;
            while (fragment2 != null) {
                if (!fragment2.equals(this)) {
                    fragment2 = fragment2.mo56587D0(false);
                } else {
                    throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
                }
            }
            if (fragment == null) {
                this.mTargetWho = null;
                this.mTarget = null;
            } else if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
                this.mTargetWho = null;
                this.mTarget = fragment;
            } else {
                this.mTargetWho = fragment.mWho;
                this.mTarget = null;
            }
            this.mTargetRequestCode = i;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " must share the same FragmentManager to be set as a target fragment");
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        boolean z2;
        FragmentStrictMode.m90383q(this, z);
        if (!this.mUserVisibleHint && z && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            FragmentManager fragmentManager = this.mFragmentManager;
            fragmentManager.mo56898q1(fragmentManager.mo56791D(this));
        }
        this.mUserVisibleHint = z;
        if (this.mState >= 5 || z) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.mDeferStart = z2;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public boolean shouldShowRequestPermissionRationale(@C0359n0 String str) {
        C19253m<?> mVar = this.mHost;
        if (mVar != null) {
            return mVar.mo57200y(str);
        }
        return false;
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent) {
        startActivity(intent, (Bundle) null);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        startActivityForResult(intent, i, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, @C0363p0 Intent intent, int i2, int i3, int i4, @C0363p0 Bundle bundle) throws IntentSender.SendIntentException {
        if (this.mHost != null) {
            if (FragmentManager.m89694W0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Fragment ");
                sb.append(this);
                sb.append(" received the following in startIntentSenderForResult() requestCode: ");
                int i5 = i;
                sb.append(i);
                sb.append(" IntentSender: ");
                IntentSender intentSender2 = intentSender;
                sb.append(intentSender);
                sb.append(" fillInIntent: ");
                Intent intent2 = intent;
                sb.append(intent);
                sb.append(" options: ");
                sb.append(bundle);
            } else {
                IntentSender intentSender3 = intentSender;
                int i6 = i;
                Intent intent3 = intent;
                Bundle bundle2 = bundle;
            }
            getParentFragmentManager().mo56884l1(this, intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo != null && mo56585B0().f49212v) {
            if (this.mHost == null) {
                mo56585B0().f49212v = false;
            } else if (Looper.myLooper() != this.mHost.mo57317l().getLooper()) {
                this.mHost.mo57317l().postAtFrontOfQueue(new C19156d());
            } else {
                callStartTransitionListener(true);
            }
        }
    }

    @C0359n0
    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append(C33093b.f80281i);
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(C36306e.f89637a);
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    public void unregisterForContextMenu(@C0359n0 View view) {
        view.setOnCreateContextMenuListener((View.OnCreateContextMenuListener) null);
    }

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    public static class SavedState implements Parcelable {
        @C0359n0
        public static final Parcelable.Creator<SavedState> CREATOR = new C19152a();

        /* renamed from: a */
        public final Bundle f49173a;

        /* renamed from: androidx.fragment.app.Fragment$SavedState$a */
        public class C19152a implements Parcelable.ClassLoaderCreator<SavedState> {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Bundle bundle) {
            this.f49173a = bundle;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@C0359n0 Parcel parcel, int i) {
            parcel.writeBundle(this.f49173a);
        }

        public SavedState(@C0359n0 Parcel parcel, @C0363p0 ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f49173a = readBundle;
            if (classLoader != null && readBundle != null) {
                readBundle.setClassLoader(classLoader);
            }
        }
    }

    @C0359n0
    @Deprecated
    public static Fragment instantiate(@C0359n0 Context context, @C0359n0 String str, @C0363p0 Bundle bundle) {
        try {
            Fragment fragment = (Fragment) C19250l.m90284d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.setArguments(bundle);
            }
            return fragment;
        } catch (InstantiationException e) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (IllegalAccessException e2) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (NoSuchMethodException e3) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e3);
        } catch (InvocationTargetException e4) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e4);
        }
    }

    @C0359n0
    public final String getString(@C0324b1 int i, @C0363p0 Object... objArr) {
        return getResources().getString(i, objArr);
    }

    public final void postponeEnterTransition(long j, @C0359n0 TimeUnit timeUnit) {
        Handler handler;
        mo56585B0().f49212v = true;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            handler = fragmentManager.mo56810J0().mo57317l();
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.removeCallbacks(this.mPostponedDurationRunnable);
        handler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j));
    }

    @C0353k0
    @C0359n0
    public final <I, O> C0302g<I> registerForActivityResult(@C0359n0 C0266a<I, O> aVar, @C0359n0 ActivityResultRegistry activityResultRegistry, @C0359n0 C0263a<O> aVar2) {
        return mo56589F0(aVar, new C19160h(activityResultRegistry), aVar2);
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent, @C0363p0 Bundle bundle) {
        C19253m<?> mVar = this.mHost;
        if (mVar != null) {
            mVar.mo57313A(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, @C0363p0 Bundle bundle) {
        if (this.mHost != null) {
            getParentFragmentManager().mo56883k1(this, intent, i, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @C0359n0
    @Deprecated
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public LayoutInflater getLayoutInflater(@C0363p0 Bundle bundle) {
        C19253m<?> mVar = this.mHost;
        if (mVar != null) {
            LayoutInflater o = mVar.mo57196o();
            C18334p0.m83051d(o, this.mChildFragmentManager.mo56813K0());
            return o;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @C0353k0
    @Deprecated
    @C0346i
    public void onAttach(@C0359n0 Activity activity) {
        this.mCalled = true;
    }

    @C0341g1
    @Deprecated
    @C0346i
    public void onInflate(@C0359n0 Activity activity, @C0359n0 AttributeSet attributeSet, @C0363p0 Bundle bundle) {
        this.mCalled = true;
    }

    @C0360o
    public Fragment(@C0347i0 int i) {
        this();
        this.mContentLayoutId = i;
    }
}

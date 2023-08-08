package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.C0249p;
import androidx.annotation.C0327c1;
import androidx.annotation.C0347i0;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.C19426h0;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;

/* renamed from: androidx.fragment.app.c */
public class C19215c extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private static final String SAVED_BACK_STACK_ID = "android:backStackId";
    private static final String SAVED_CANCELABLE = "android:cancelable";
    private static final String SAVED_DIALOG_STATE_TAG = "android:savedDialogState";
    private static final String SAVED_INTERNAL_DIALOG_SHOWING = "android:dialogShowing";
    private static final String SAVED_SHOWS_DIALOG = "android:showsDialog";
    private static final String SAVED_STYLE = "android:style";
    private static final String SAVED_THEME = "android:theme";
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;
    private int mBackStackId = -1;
    private boolean mCancelable = true;
    private boolean mCreatingDialog;
    /* access modifiers changed from: private */
    @C0363p0
    public Dialog mDialog;
    private boolean mDialogCreated = false;
    private Runnable mDismissRunnable = new C19216a();
    private boolean mDismissed;
    private Handler mHandler;
    private C19426h0<C19499w> mObserver = new C19219d();
    private DialogInterface.OnCancelListener mOnCancelListener = new C19217b();
    /* access modifiers changed from: private */
    public DialogInterface.OnDismissListener mOnDismissListener = new C19218c();
    private boolean mShownByMe;
    /* access modifiers changed from: private */
    public boolean mShowsDialog = true;
    private int mStyle = 0;
    private int mTheme = 0;
    private boolean mViewDestroyed;

    /* renamed from: androidx.fragment.app.c$a */
    public class C19216a implements Runnable {
        public C19216a() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            C19215c.this.mOnDismissListener.onDismiss(C19215c.this.mDialog);
        }
    }

    /* renamed from: androidx.fragment.app.c$b */
    public class C19217b implements DialogInterface.OnCancelListener {
        public C19217b() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(@C0363p0 DialogInterface dialogInterface) {
            if (C19215c.this.mDialog != null) {
                C19215c cVar = C19215c.this;
                cVar.onCancel(cVar.mDialog);
            }
        }
    }

    /* renamed from: androidx.fragment.app.c$c */
    public class C19218c implements DialogInterface.OnDismissListener {
        public C19218c() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(@C0363p0 DialogInterface dialogInterface) {
            if (C19215c.this.mDialog != null) {
                C19215c cVar = C19215c.this;
                cVar.onDismiss(cVar.mDialog);
            }
        }
    }

    /* renamed from: androidx.fragment.app.c$d */
    public class C19219d implements C19426h0<C19499w> {
        public C19219d() {
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b */
        public void mo4590a(C19499w wVar) {
            if (wVar != null && C19215c.this.mShowsDialog) {
                View requireView = C19215c.this.requireView();
                if (requireView.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                } else if (C19215c.this.mDialog != null) {
                    if (FragmentManager.m89694W0(3)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("DialogFragment ");
                        sb.append(this);
                        sb.append(" setting the content view on ");
                        sb.append(C19215c.this.mDialog);
                    }
                    C19215c.this.mDialog.setContentView(requireView);
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.c$e */
    public class C19220e extends C19240j {

        /* renamed from: a */
        public final /* synthetic */ C19240j f49428a;

        public C19220e(C19240j jVar) {
            this.f49428a = jVar;
        }

        @C0363p0
        /* renamed from: c */
        public View mo56759c(int i) {
            if (this.f49428a.mo56760g()) {
                return this.f49428a.mo56759c(i);
            }
            return C19215c.this.onFindViewById(i);
        }

        /* renamed from: g */
        public boolean mo56760g() {
            return this.f49428a.mo56760g() || C19215c.this.onHasView();
        }
    }

    public C19215c() {
    }

    /* renamed from: I0 */
    public final void mo57095I0(boolean z, boolean z2, boolean z3) {
        if (!this.mDismissed) {
            this.mDismissed = true;
            this.mShownByMe = false;
            Dialog dialog = this.mDialog;
            if (dialog != null) {
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                this.mDialog.dismiss();
                if (!z2) {
                    if (Looper.myLooper() == this.mHandler.getLooper()) {
                        onDismiss(this.mDialog);
                    } else {
                        this.mHandler.post(this.mDismissRunnable);
                    }
                }
            }
            this.mViewDestroyed = true;
            if (this.mBackStackId >= 0) {
                if (z3) {
                    getParentFragmentManager().mo56915w1(this.mBackStackId, 1);
                } else {
                    getParentFragmentManager().mo56907t1(this.mBackStackId, 1, z);
                }
                this.mBackStackId = -1;
                return;
            }
            C19234h0 u = getParentFragmentManager().mo56909u();
            u.mo57213Q(true);
            u.mo57038B(this);
            if (z3) {
                u.mo57054s();
            } else if (z) {
                u.mo57053r();
            } else {
                u.mo57052q();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: J0 */
    public final void mo57096J0(@C0363p0 Bundle bundle) {
        if (this.mShowsDialog && !this.mDialogCreated) {
            try {
                this.mCreatingDialog = true;
                Dialog onCreateDialog = onCreateDialog(bundle);
                this.mDialog = onCreateDialog;
                if (this.mShowsDialog) {
                    setupDialog(onCreateDialog, this.mStyle);
                    Context context = getContext();
                    if (context instanceof Activity) {
                        this.mDialog.setOwnerActivity((Activity) context);
                    }
                    this.mDialog.setCancelable(this.mCancelable);
                    this.mDialog.setOnCancelListener(this.mOnCancelListener);
                    this.mDialog.setOnDismissListener(this.mOnDismissListener);
                    this.mDialogCreated = true;
                } else {
                    this.mDialog = null;
                }
                this.mCreatingDialog = false;
            } catch (Throwable th) {
                this.mCreatingDialog = false;
                throw th;
            }
        }
    }

    @C0359n0
    public C19240j createFragmentContainer() {
        return new C19220e(super.createFragmentContainer());
    }

    public void dismiss() {
        mo57095I0(false, false, false);
    }

    public void dismissAllowingStateLoss() {
        mo57095I0(true, false, false);
    }

    @C0353k0
    public void dismissNow() {
        mo57095I0(false, false, true);
    }

    @C0363p0
    public Dialog getDialog() {
        return this.mDialog;
    }

    public boolean getShowsDialog() {
        return this.mShowsDialog;
    }

    @C0327c1
    public int getTheme() {
        return this.mTheme;
    }

    public boolean isCancelable() {
        return this.mCancelable;
    }

    @C0353k0
    @Deprecated
    public void onActivityCreated(@C0363p0 Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @C0353k0
    public void onAttach(@C0359n0 Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().mo57492l(this.mObserver);
        if (!this.mShownByMe) {
            this.mDismissed = false;
        }
    }

    public void onCancel(@C0359n0 DialogInterface dialogInterface) {
    }

    @C0353k0
    public void onCreate(@C0363p0 Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        this.mHandler = new Handler();
        if (this.mContainerId == 0) {
            z = true;
        } else {
            z = false;
        }
        this.mShowsDialog = z;
        if (bundle != null) {
            this.mStyle = bundle.getInt(SAVED_STYLE, 0);
            this.mTheme = bundle.getInt(SAVED_THEME, 0);
            this.mCancelable = bundle.getBoolean(SAVED_CANCELABLE, true);
            this.mShowsDialog = bundle.getBoolean(SAVED_SHOWS_DIALOG, this.mShowsDialog);
            this.mBackStackId = bundle.getInt(SAVED_BACK_STACK_ID, -1);
        }
    }

    @C0353k0
    @C0359n0
    public Dialog onCreateDialog(@C0363p0 Bundle bundle) {
        if (FragmentManager.m89694W0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCreateDialog called for DialogFragment ");
            sb.append(this);
        }
        return new C0249p(requireContext(), getTheme());
    }

    @C0353k0
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = true;
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            this.mDialog.dismiss();
            if (!this.mDismissed) {
                onDismiss(this.mDialog);
            }
            this.mDialog = null;
            this.mDialogCreated = false;
        }
    }

    @C0353k0
    public void onDetach() {
        super.onDetach();
        if (!this.mShownByMe && !this.mDismissed) {
            this.mDismissed = true;
        }
        getViewLifecycleOwnerLiveData().mo57494p(this.mObserver);
    }

    public void onDismiss(@C0359n0 DialogInterface dialogInterface) {
        if (!this.mViewDestroyed) {
            if (FragmentManager.m89694W0(3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("onDismiss called for DialogFragment ");
                sb.append(this);
            }
            mo57095I0(true, true, false);
        }
    }

    @C0363p0
    public View onFindViewById(int i) {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @C0359n0
    public LayoutInflater onGetLayoutInflater(@C0363p0 Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (!this.mShowsDialog || this.mCreatingDialog) {
            if (FragmentManager.m89694W0(2)) {
                String str = "getting layout inflater for DialogFragment " + this;
                if (!this.mShowsDialog) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("mShowsDialog = false: ");
                    sb.append(str);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("mCreatingDialog = true: ");
                    sb2.append(str);
                }
            }
            return onGetLayoutInflater;
        }
        mo57096J0(bundle);
        if (FragmentManager.m89694W0(2)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("get layout inflater for DialogFragment ");
            sb3.append(this);
            sb3.append(" from dialog context");
        }
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            return onGetLayoutInflater.cloneInContext(dialog.getContext());
        }
        return onGetLayoutInflater;
    }

    public boolean onHasView() {
        return this.mDialogCreated;
    }

    @C0353k0
    public void onSaveInstanceState(@C0359n0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean(SAVED_INTERNAL_DIALOG_SHOWING, false);
            bundle.putBundle(SAVED_DIALOG_STATE_TAG, onSaveInstanceState);
        }
        int i = this.mStyle;
        if (i != 0) {
            bundle.putInt(SAVED_STYLE, i);
        }
        int i2 = this.mTheme;
        if (i2 != 0) {
            bundle.putInt(SAVED_THEME, i2);
        }
        boolean z = this.mCancelable;
        if (!z) {
            bundle.putBoolean(SAVED_CANCELABLE, z);
        }
        boolean z2 = this.mShowsDialog;
        if (!z2) {
            bundle.putBoolean(SAVED_SHOWS_DIALOG, z2);
        }
        int i3 = this.mBackStackId;
        if (i3 != -1) {
            bundle.putInt(SAVED_BACK_STACK_ID, i3);
        }
    }

    @C0353k0
    public void onStart() {
        super.onStart();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = false;
            dialog.show();
            View decorView = this.mDialog.getWindow().getDecorView();
            ViewTreeLifecycleOwner.m90621b(decorView, this);
            ViewTreeViewModelStoreOwner.m90625b(decorView, this);
            ViewTreeSavedStateRegistryOwner.m95252b(decorView, this);
        }
    }

    @C0353k0
    public void onStop() {
        super.onStop();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @C0353k0
    public void onViewStateRestored(@C0363p0 Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.mDialog != null && bundle != null && (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) != null) {
            this.mDialog.onRestoreInstanceState(bundle2);
        }
    }

    public void performCreateView(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, @C0363p0 Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView == null && this.mDialog != null && bundle != null && (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) != null) {
            this.mDialog.onRestoreInstanceState(bundle2);
        }
    }

    @C0359n0
    public final Dialog requireDialog() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void setCancelable(boolean z) {
        this.mCancelable = z;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    public void setShowsDialog(boolean z) {
        this.mShowsDialog = z;
    }

    public void setStyle(int i, @C0327c1 int i2) {
        if (FragmentManager.m89694W0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Setting style and theme for DialogFragment ");
            sb.append(this);
            sb.append(" to ");
            sb.append(i);
            sb.append(", ");
            sb.append(i2);
        }
        this.mStyle = i;
        if (i == 2 || i == 3) {
            this.mTheme = 16973913;
        }
        if (i2 != 0) {
            this.mTheme = i2;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setupDialog(@C0359n0 Dialog dialog, int i) {
        if (!(i == 1 || i == 2)) {
            if (i == 3) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.addFlags(24);
                }
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void show(@C0359n0 FragmentManager fragmentManager, @C0363p0 String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        C19234h0 u = fragmentManager.mo56909u();
        u.mo57213Q(true);
        u.mo57221k(this, str);
        u.mo57052q();
    }

    public void showNow(@C0359n0 FragmentManager fragmentManager, @C0363p0 String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        C19234h0 u = fragmentManager.mo56909u();
        u.mo57213Q(true);
        u.mo57221k(this, str);
        u.mo57054s();
    }

    public int show(@C0359n0 C19234h0 h0Var, @C0363p0 String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        h0Var.mo57221k(this, str);
        this.mViewDestroyed = false;
        int q = h0Var.mo57052q();
        this.mBackStackId = q;
        return q;
    }

    public C19215c(@C0347i0 int i) {
        super(i);
    }
}

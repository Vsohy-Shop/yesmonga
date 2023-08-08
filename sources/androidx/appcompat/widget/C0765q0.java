package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.C0327c1;
import androidx.annotation.C0336f;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0387a;
import androidx.appcompat.view.menu.C0590q;
import androidx.core.view.C18196h2;
import androidx.core.widget.C18492o;
import java.lang.reflect.Method;

/* renamed from: androidx.appcompat.widget.q0 */
public class C0765q0 implements C0590q {

    /* renamed from: V0 */
    public static final String f2484V0 = "ListPopupWindow";

    /* renamed from: W0 */
    public static final boolean f2485W0 = false;

    /* renamed from: X0 */
    public static final int f2486X0 = 250;

    /* renamed from: Y0 */
    public static Method f2487Y0 = null;

    /* renamed from: Z0 */
    public static Method f2488Z0 = null;

    /* renamed from: a1 */
    public static Method f2489a1 = null;

    /* renamed from: b1 */
    public static final int f2490b1 = 0;

    /* renamed from: c1 */
    public static final int f2491c1 = 1;

    /* renamed from: d1 */
    public static final int f2492d1 = -1;

    /* renamed from: e1 */
    public static final int f2493e1 = -2;

    /* renamed from: f1 */
    public static final int f2494f1 = 0;

    /* renamed from: g1 */
    public static final int f2495g1 = 1;

    /* renamed from: h1 */
    public static final int f2496h1 = 2;

    /* renamed from: E0 */
    public View f2497E0;

    /* renamed from: F0 */
    public int f2498F0;

    /* renamed from: G0 */
    public DataSetObserver f2499G0;

    /* renamed from: H0 */
    public View f2500H0;

    /* renamed from: I0 */
    public Drawable f2501I0;

    /* renamed from: J0 */
    public AdapterView.OnItemClickListener f2502J0;

    /* renamed from: K0 */
    public AdapterView.OnItemSelectedListener f2503K0;

    /* renamed from: L0 */
    public final C0775j f2504L0;

    /* renamed from: M0 */
    public final C0774i f2505M0;

    /* renamed from: N0 */
    public final C0773h f2506N0;

    /* renamed from: O0 */
    public final C0771f f2507O0;

    /* renamed from: P0 */
    public Runnable f2508P0;

    /* renamed from: Q0 */
    public final Handler f2509Q0;

    /* renamed from: R0 */
    public final Rect f2510R0;

    /* renamed from: S0 */
    public Rect f2511S0;

    /* renamed from: T0 */
    public boolean f2512T0;

    /* renamed from: U0 */
    public PopupWindow f2513U0;

    /* renamed from: X */
    public boolean f2514X;

    /* renamed from: Y */
    public boolean f2515Y;

    /* renamed from: Z */
    public int f2516Z;

    /* renamed from: a */
    public Context f2517a;

    /* renamed from: b */
    public ListAdapter f2518b;

    /* renamed from: c */
    public C0733k0 f2519c;

    /* renamed from: d */
    public int f2520d;

    /* renamed from: e */
    public int f2521e;

    /* renamed from: f */
    public int f2522f;

    /* renamed from: g */
    public int f2523g;

    /* renamed from: v */
    public int f2524v;

    /* renamed from: w */
    public boolean f2525w;

    /* renamed from: x */
    public boolean f2526x;

    /* renamed from: y */
    public boolean f2527y;

    /* renamed from: z */
    public int f2528z;

    /* renamed from: androidx.appcompat.widget.q0$a */
    public class C0766a extends C0760p0 {
        public C0766a(View view) {
            super(view);
        }

        /* renamed from: k */
        public C0765q0 mo1854b() {
            return C0765q0.this;
        }
    }

    /* renamed from: androidx.appcompat.widget.q0$b */
    public class C0767b implements Runnable {
        public C0767b() {
        }

        public void run() {
            View v = C0765q0.this.mo3615v();
            if (v != null && v.getWindowToken() != null) {
                C0765q0.this.mo1966a();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.q0$c */
    public class C0768c implements AdapterView.OnItemSelectedListener {
        public C0768c() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            C0733k0 k0Var;
            if (i != -1 && (k0Var = C0765q0.this.f2519c) != null) {
                k0Var.setListSelectionHidden(false);
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    @C0376v0(24)
    /* renamed from: androidx.appcompat.widget.q0$d */
    public static class C0769d {
        @C0373u
        /* renamed from: a */
        public static int m3785a(PopupWindow popupWindow, View view, int i, boolean z) {
            return popupWindow.getMaxAvailableHeight(view, i, z);
        }
    }

    @C0376v0(29)
    /* renamed from: androidx.appcompat.widget.q0$e */
    public static class C0770e {
        @C0373u
        /* renamed from: a */
        public static void m3786a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        @C0373u
        /* renamed from: b */
        public static void m3787b(PopupWindow popupWindow, boolean z) {
            popupWindow.setIsClippedToScreen(z);
        }
    }

    /* renamed from: androidx.appcompat.widget.q0$f */
    public class C0771f implements Runnable {
        public C0771f() {
        }

        public void run() {
            C0765q0.this.mo3613s();
        }
    }

    /* renamed from: androidx.appcompat.widget.q0$g */
    public class C0772g extends DataSetObserver {
        public C0772g() {
        }

        public void onChanged() {
            if (C0765q0.this.mo1967c()) {
                C0765q0.this.mo1966a();
            }
        }

        public void onInvalidated() {
            C0765q0.this.dismiss();
        }
    }

    /* renamed from: androidx.appcompat.widget.q0$h */
    public class C0773h implements AbsListView.OnScrollListener {
        public C0773h() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && !C0765q0.this.mo3575K() && C0765q0.this.f2513U0.getContentView() != null) {
                C0765q0 q0Var = C0765q0.this;
                q0Var.f2509Q0.removeCallbacks(q0Var.f2504L0);
                C0765q0.this.f2504L0.run();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.q0$i */
    public class C0774i implements View.OnTouchListener {
        public C0774i() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = C0765q0.this.f2513U0) != null && popupWindow.isShowing() && x >= 0 && x < C0765q0.this.f2513U0.getWidth() && y >= 0 && y < C0765q0.this.f2513U0.getHeight()) {
                C0765q0 q0Var = C0765q0.this;
                q0Var.f2509Q0.postDelayed(q0Var.f2504L0, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                C0765q0 q0Var2 = C0765q0.this;
                q0Var2.f2509Q0.removeCallbacks(q0Var2.f2504L0);
                return false;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.q0$j */
    public class C0775j implements Runnable {
        public C0775j() {
        }

        public void run() {
            C0733k0 k0Var = C0765q0.this.f2519c;
            if (k0Var != null && C18196h2.m82521O0(k0Var) && C0765q0.this.f2519c.getCount() > C0765q0.this.f2519c.getChildCount()) {
                int childCount = C0765q0.this.f2519c.getChildCount();
                C0765q0 q0Var = C0765q0.this;
                if (childCount <= q0Var.f2516Z) {
                    q0Var.f2513U0.setInputMethodMode(2);
                    C0765q0.this.mo1966a();
                }
            }
        }
    }

    static {
        Class<PopupWindow> cls = PopupWindow.class;
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f2487Y0 = cls.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
            }
            try {
                f2489a1 = cls.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
            }
        }
    }

    public C0765q0(@C0359n0 Context context) {
        this(context, (AttributeSet) null, C0387a.C0389b.listPopupWindowStyle);
    }

    /* renamed from: I */
    public static boolean m3723I(int i) {
        return i == 66 || i == 23;
    }

    /* renamed from: A */
    public final int mo3566A(View view, int i, boolean z) {
        return C0769d.m3785a(this.f2513U0, view, i, z);
    }

    /* renamed from: B */
    public int mo3567B() {
        return this.f2498F0;
    }

    @C0363p0
    /* renamed from: C */
    public Object mo3568C() {
        if (!mo1967c()) {
            return null;
        }
        return this.f2519c.getSelectedItem();
    }

    /* renamed from: D */
    public long mo3569D() {
        if (!mo1967c()) {
            return Long.MIN_VALUE;
        }
        return this.f2519c.getSelectedItemId();
    }

    /* renamed from: E */
    public int mo3570E() {
        if (!mo1967c()) {
            return -1;
        }
        return this.f2519c.getSelectedItemPosition();
    }

    @C0363p0
    /* renamed from: F */
    public View mo3571F() {
        if (!mo1967c()) {
            return null;
        }
        return this.f2519c.getSelectedView();
    }

    /* renamed from: G */
    public int mo3572G() {
        return this.f2513U0.getSoftInputMode();
    }

    /* renamed from: H */
    public int mo3573H() {
        return this.f2521e;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: J */
    public boolean mo3574J() {
        return this.f2514X;
    }

    /* renamed from: K */
    public boolean mo3575K() {
        return this.f2513U0.getInputMethodMode() == 2;
    }

    /* renamed from: L */
    public boolean mo3576L() {
        return this.f2512T0;
    }

    /* renamed from: M */
    public boolean mo3577M(int i, @C0359n0 KeyEvent keyEvent) {
        int i2;
        int i3;
        if (mo1967c() && i != 62 && (this.f2519c.getSelectedItemPosition() >= 0 || !m3723I(i))) {
            int selectedItemPosition = this.f2519c.getSelectedItemPosition();
            boolean z = !this.f2513U0.isAboveAnchor();
            ListAdapter listAdapter = this.f2518b;
            if (listAdapter != null) {
                boolean areAllItemsEnabled = listAdapter.areAllItemsEnabled();
                if (areAllItemsEnabled) {
                    i2 = 0;
                } else {
                    i2 = this.f2519c.mo2869d(0, true);
                }
                if (areAllItemsEnabled) {
                    i3 = listAdapter.getCount() - 1;
                } else {
                    i3 = this.f2519c.mo2869d(listAdapter.getCount() - 1, false);
                }
            } else {
                i2 = Integer.MAX_VALUE;
                i3 = Integer.MIN_VALUE;
            }
            if ((!z || i != 19 || selectedItemPosition > i2) && (z || i != 20 || selectedItemPosition < i3)) {
                this.f2519c.setListSelectionHidden(false);
                if (this.f2519c.onKeyDown(i, keyEvent)) {
                    this.f2513U0.setInputMethodMode(2);
                    this.f2519c.requestFocusFromTouch();
                    mo1966a();
                    if (i == 19 || i == 20 || i == 23 || i == 66) {
                        return true;
                    }
                } else if (!z || i != 20) {
                    if (!z && i == 19 && selectedItemPosition == i2) {
                        return true;
                    }
                    return false;
                } else if (selectedItemPosition == i3) {
                    return true;
                }
            } else {
                mo3613s();
                this.f2513U0.setInputMethodMode(1);
                mo1966a();
                return true;
            }
        }
        return false;
    }

    /* renamed from: N */
    public boolean mo3578N(int i, @C0359n0 KeyEvent keyEvent) {
        if (i != 4 || !mo1967c()) {
            return false;
        }
        View view = this.f2500H0;
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            KeyEvent.DispatcherState keyDispatcherState = view.getKeyDispatcherState();
            if (keyDispatcherState != null) {
                keyDispatcherState.startTracking(keyEvent, this);
            }
            return true;
        } else if (keyEvent.getAction() != 1) {
            return false;
        } else {
            KeyEvent.DispatcherState keyDispatcherState2 = view.getKeyDispatcherState();
            if (keyDispatcherState2 != null) {
                keyDispatcherState2.handleUpEvent(keyEvent);
            }
            if (!keyEvent.isTracking() || keyEvent.isCanceled()) {
                return false;
            }
            dismiss();
            return true;
        }
    }

    /* renamed from: O */
    public boolean mo3579O(int i, @C0359n0 KeyEvent keyEvent) {
        if (!mo1967c() || this.f2519c.getSelectedItemPosition() < 0) {
            return false;
        }
        boolean onKeyUp = this.f2519c.onKeyUp(i, keyEvent);
        if (onKeyUp && m3723I(i)) {
            dismiss();
        }
        return onKeyUp;
    }

    /* renamed from: P */
    public boolean mo3580P(int i) {
        if (!mo1967c()) {
            return false;
        }
        if (this.f2502J0 == null) {
            return true;
        }
        C0733k0 k0Var = this.f2519c;
        int i2 = i;
        this.f2502J0.onItemClick(k0Var, k0Var.getChildAt(i - k0Var.getFirstVisiblePosition()), i2, k0Var.getAdapter().getItemId(i));
        return true;
    }

    /* renamed from: Q */
    public void mo3581Q() {
        this.f2509Q0.post(this.f2508P0);
    }

    /* renamed from: R */
    public final void mo3582R() {
        View view = this.f2497E0;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f2497E0);
            }
        }
    }

    /* renamed from: S */
    public void mo3583S(@C0363p0 View view) {
        this.f2500H0 = view;
    }

    /* renamed from: T */
    public void mo3584T(@C0327c1 int i) {
        this.f2513U0.setAnimationStyle(i);
    }

    /* renamed from: U */
    public void mo3585U(int i) {
        Drawable background = this.f2513U0.getBackground();
        if (background != null) {
            background.getPadding(this.f2510R0);
            Rect rect = this.f2510R0;
            this.f2521e = rect.left + rect.right + i;
            return;
        }
        mo3610n0(i);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: V */
    public void mo3586V(boolean z) {
        this.f2514X = z;
    }

    /* renamed from: W */
    public void mo3587W(int i) {
        this.f2528z = i;
    }

    /* renamed from: X */
    public void mo3588X(@C0363p0 Rect rect) {
        this.f2511S0 = rect != null ? new Rect(rect) : null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: Y */
    public void mo3589Y(boolean z) {
        this.f2515Y = z;
    }

    /* renamed from: Z */
    public void mo3590Z(int i) {
        if (i >= 0 || -2 == i || -1 == i) {
            this.f2520d = i;
            return;
        }
        throw new IllegalArgumentException("Invalid height. Must be a positive value, MATCH_PARENT, or WRAP_CONTENT.");
    }

    /* renamed from: a */
    public void mo1966a() {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int r = mo3612r();
        boolean K = mo3575K();
        C18492o.m83694d(this.f2513U0, this.f2524v);
        boolean z2 = true;
        if (!this.f2513U0.isShowing()) {
            int i5 = this.f2521e;
            if (i5 == -1) {
                i5 = -1;
            } else if (i5 == -2) {
                i5 = mo3615v().getWidth();
            }
            int i6 = this.f2520d;
            if (i6 == -1) {
                r = -1;
            } else if (i6 != -2) {
                r = i6;
            }
            this.f2513U0.setWidth(i5);
            this.f2513U0.setHeight(r);
            mo3603i0(true);
            PopupWindow popupWindow = this.f2513U0;
            if (this.f2515Y || this.f2514X) {
                z = false;
            } else {
                z = true;
            }
            popupWindow.setOutsideTouchable(z);
            this.f2513U0.setTouchInterceptor(this.f2505M0);
            if (this.f2527y) {
                C18492o.m83693c(this.f2513U0, this.f2526x);
            }
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = f2489a1;
                if (method != null) {
                    try {
                        method.invoke(this.f2513U0, new Object[]{this.f2511S0});
                    } catch (Exception unused) {
                    }
                }
            } else {
                C0770e.m3786a(this.f2513U0, this.f2511S0);
            }
            C18492o.m83695e(this.f2513U0, mo3615v(), this.f2522f, this.f2523g, this.f2528z);
            this.f2519c.setSelection(-1);
            if (!this.f2512T0 || this.f2519c.isInTouchMode()) {
                mo3613s();
            }
            if (!this.f2512T0) {
                this.f2509Q0.post(this.f2507O0);
            }
        } else if (C18196h2.m82521O0(mo3615v())) {
            int i7 = this.f2521e;
            if (i7 == -1) {
                i7 = -1;
            } else if (i7 == -2) {
                i7 = mo3615v().getWidth();
            }
            int i8 = this.f2520d;
            if (i8 == -1) {
                if (!K) {
                    r = -1;
                }
                if (K) {
                    PopupWindow popupWindow2 = this.f2513U0;
                    if (this.f2521e == -1) {
                        i4 = -1;
                    } else {
                        i4 = 0;
                    }
                    popupWindow2.setWidth(i4);
                    this.f2513U0.setHeight(0);
                } else {
                    PopupWindow popupWindow3 = this.f2513U0;
                    if (this.f2521e == -1) {
                        i3 = -1;
                    } else {
                        i3 = 0;
                    }
                    popupWindow3.setWidth(i3);
                    this.f2513U0.setHeight(-1);
                }
            } else if (i8 != -2) {
                r = i8;
            }
            PopupWindow popupWindow4 = this.f2513U0;
            if (this.f2515Y || this.f2514X) {
                z2 = false;
            }
            popupWindow4.setOutsideTouchable(z2);
            PopupWindow popupWindow5 = this.f2513U0;
            View v = mo3615v();
            int i9 = this.f2522f;
            int i10 = this.f2523g;
            if (i7 < 0) {
                i = -1;
            } else {
                i = i7;
            }
            if (r < 0) {
                i2 = -1;
            } else {
                i2 = r;
            }
            popupWindow5.update(v, i9, i10, i, i2);
        }
    }

    /* renamed from: a0 */
    public void mo3591a0(int i) {
        this.f2513U0.setInputMethodMode(i);
    }

    /* renamed from: b */
    public void mo3592b(@C0363p0 Drawable drawable) {
        this.f2513U0.setBackgroundDrawable(drawable);
    }

    /* renamed from: b0 */
    public void mo3593b0(int i) {
        this.f2516Z = i;
    }

    /* renamed from: c */
    public boolean mo1967c() {
        return this.f2513U0.isShowing();
    }

    /* renamed from: c0 */
    public void mo3594c0(Drawable drawable) {
        this.f2501I0 = drawable;
    }

    /* renamed from: d */
    public int mo3595d() {
        return this.f2522f;
    }

    /* renamed from: d0 */
    public void mo3596d0(boolean z) {
        this.f2512T0 = z;
        this.f2513U0.setFocusable(z);
    }

    public void dismiss() {
        this.f2513U0.dismiss();
        mo3582R();
        this.f2513U0.setContentView((View) null);
        this.f2519c = null;
        this.f2509Q0.removeCallbacks(this.f2504L0);
    }

    /* renamed from: e0 */
    public void mo3597e0(@C0363p0 PopupWindow.OnDismissListener onDismissListener) {
        this.f2513U0.setOnDismissListener(onDismissListener);
    }

    /* renamed from: f */
    public void mo3598f(int i) {
        this.f2522f = i;
    }

    /* renamed from: f0 */
    public void mo3599f0(@C0363p0 AdapterView.OnItemClickListener onItemClickListener) {
        this.f2502J0 = onItemClickListener;
    }

    /* renamed from: g0 */
    public void mo3600g0(@C0363p0 AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f2503K0 = onItemSelectedListener;
    }

    @C0363p0
    /* renamed from: h */
    public Drawable mo3601h() {
        return this.f2513U0.getBackground();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: h0 */
    public void mo3602h0(boolean z) {
        this.f2527y = true;
        this.f2526x = z;
    }

    /* renamed from: i0 */
    public final void mo3603i0(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f2487Y0;
            if (method != null) {
                try {
                    method.invoke(this.f2513U0, new Object[]{Boolean.valueOf(z)});
                } catch (Exception unused) {
                }
            }
        } else {
            C0770e.m3787b(this.f2513U0, z);
        }
    }

    /* renamed from: j */
    public void mo3604j(int i) {
        this.f2523g = i;
        this.f2525w = true;
    }

    /* renamed from: j0 */
    public void mo3605j0(int i) {
        this.f2498F0 = i;
    }

    /* renamed from: k0 */
    public void mo3606k0(@C0363p0 View view) {
        boolean c = mo1967c();
        if (c) {
            mo3582R();
        }
        this.f2497E0 = view;
        if (c) {
            mo1966a();
        }
    }

    /* renamed from: l0 */
    public void mo3607l0(int i) {
        C0733k0 k0Var = this.f2519c;
        if (mo1967c() && k0Var != null) {
            k0Var.setListSelectionHidden(false);
            k0Var.setSelection(i);
            if (k0Var.getChoiceMode() != 0) {
                k0Var.setItemChecked(i, true);
            }
        }
    }

    /* renamed from: m */
    public int mo3608m() {
        if (!this.f2525w) {
            return 0;
        }
        return this.f2523g;
    }

    /* renamed from: m0 */
    public void mo3609m0(int i) {
        this.f2513U0.setSoftInputMode(i);
    }

    /* renamed from: n0 */
    public void mo3610n0(int i) {
        this.f2521e = i;
    }

    /* renamed from: o */
    public void mo2728o(@C0363p0 ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f2499G0;
        if (dataSetObserver == null) {
            this.f2499G0 = new C0772g();
        } else {
            ListAdapter listAdapter2 = this.f2518b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f2518b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f2499G0);
        }
        C0733k0 k0Var = this.f2519c;
        if (k0Var != null) {
            k0Var.setAdapter(this.f2518b);
        }
    }

    /* renamed from: o0 */
    public void mo3611o0(int i) {
        this.f2524v = i;
    }

    @C0363p0
    /* renamed from: q */
    public ListView mo1975q() {
        return this.f2519c;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: androidx.appcompat.widget.k0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: androidx.appcompat.widget.k0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: androidx.appcompat.widget.k0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo3612r() {
        /*
            r12 = this;
            androidx.appcompat.widget.k0 r0 = r12.f2519c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x00b5
            android.content.Context r0 = r12.f2517a
            androidx.appcompat.widget.q0$b r5 = new androidx.appcompat.widget.q0$b
            r5.<init>()
            r12.f2508P0 = r5
            boolean r5 = r12.f2512T0
            r5 = r5 ^ r3
            androidx.appcompat.widget.k0 r5 = r12.mo2868u(r0, r5)
            r12.f2519c = r5
            android.graphics.drawable.Drawable r6 = r12.f2501I0
            if (r6 == 0) goto L_0x0022
            r5.setSelector(r6)
        L_0x0022:
            androidx.appcompat.widget.k0 r5 = r12.f2519c
            android.widget.ListAdapter r6 = r12.f2518b
            r5.setAdapter(r6)
            androidx.appcompat.widget.k0 r5 = r12.f2519c
            android.widget.AdapterView$OnItemClickListener r6 = r12.f2502J0
            r5.setOnItemClickListener(r6)
            androidx.appcompat.widget.k0 r5 = r12.f2519c
            r5.setFocusable(r3)
            androidx.appcompat.widget.k0 r5 = r12.f2519c
            r5.setFocusableInTouchMode(r3)
            androidx.appcompat.widget.k0 r5 = r12.f2519c
            androidx.appcompat.widget.q0$c r6 = new androidx.appcompat.widget.q0$c
            r6.<init>()
            r5.setOnItemSelectedListener(r6)
            androidx.appcompat.widget.k0 r5 = r12.f2519c
            androidx.appcompat.widget.q0$h r6 = r12.f2506N0
            r5.setOnScrollListener(r6)
            android.widget.AdapterView$OnItemSelectedListener r5 = r12.f2503K0
            if (r5 == 0) goto L_0x0054
            androidx.appcompat.widget.k0 r6 = r12.f2519c
            r6.setOnItemSelectedListener(r5)
        L_0x0054:
            androidx.appcompat.widget.k0 r5 = r12.f2519c
            android.view.View r6 = r12.f2497E0
            if (r6 == 0) goto L_0x00ae
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r0)
            r7.setOrientation(r3)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r8 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r2, r4, r8)
            int r8 = r12.f2498F0
            if (r8 == 0) goto L_0x0086
            if (r8 == r3) goto L_0x007f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "Invalid hint position "
            r0.append(r5)
            int r5 = r12.f2498F0
            r0.append(r5)
            goto L_0x008c
        L_0x007f:
            r7.addView(r5, r0)
            r7.addView(r6)
            goto L_0x008c
        L_0x0086:
            r7.addView(r6)
            r7.addView(r5, r0)
        L_0x008c:
            int r0 = r12.f2521e
            if (r0 < 0) goto L_0x0092
            r5 = r1
            goto L_0x0094
        L_0x0092:
            r0 = r4
            r5 = r0
        L_0x0094:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r5)
            r6.measure(r0, r4)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r5 = r6.getMeasuredHeight()
            int r6 = r0.topMargin
            int r5 = r5 + r6
            int r0 = r0.bottomMargin
            int r5 = r5 + r0
            r0 = r5
            r5 = r7
            goto L_0x00af
        L_0x00ae:
            r0 = r4
        L_0x00af:
            android.widget.PopupWindow r6 = r12.f2513U0
            r6.setContentView(r5)
            goto L_0x00d3
        L_0x00b5:
            android.widget.PopupWindow r0 = r12.f2513U0
            android.view.View r0 = r0.getContentView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r0 = r12.f2497E0
            if (r0 == 0) goto L_0x00d2
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5
            int r0 = r0.getMeasuredHeight()
            int r6 = r5.topMargin
            int r0 = r0 + r6
            int r5 = r5.bottomMargin
            int r0 = r0 + r5
            goto L_0x00d3
        L_0x00d2:
            r0 = r4
        L_0x00d3:
            android.widget.PopupWindow r5 = r12.f2513U0
            android.graphics.drawable.Drawable r5 = r5.getBackground()
            if (r5 == 0) goto L_0x00ef
            android.graphics.Rect r6 = r12.f2510R0
            r5.getPadding(r6)
            android.graphics.Rect r5 = r12.f2510R0
            int r6 = r5.top
            int r5 = r5.bottom
            int r5 = r5 + r6
            boolean r7 = r12.f2525w
            if (r7 != 0) goto L_0x00f5
            int r6 = -r6
            r12.f2523g = r6
            goto L_0x00f5
        L_0x00ef:
            android.graphics.Rect r5 = r12.f2510R0
            r5.setEmpty()
            r5 = r4
        L_0x00f5:
            android.widget.PopupWindow r6 = r12.f2513U0
            int r6 = r6.getInputMethodMode()
            r7 = 2
            if (r6 != r7) goto L_0x00ff
            goto L_0x0100
        L_0x00ff:
            r3 = r4
        L_0x0100:
            android.view.View r4 = r12.mo3615v()
            int r6 = r12.f2523g
            int r3 = r12.mo3566A(r4, r6, r3)
            boolean r4 = r12.f2514X
            if (r4 != 0) goto L_0x0171
            int r4 = r12.f2520d
            if (r4 != r2) goto L_0x0113
            goto L_0x0171
        L_0x0113:
            int r4 = r12.f2521e
            r6 = -2
            if (r4 == r6) goto L_0x013a
            r1 = 1073741824(0x40000000, float:2.0)
            if (r4 == r2) goto L_0x0121
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r1)
            goto L_0x0152
        L_0x0121:
            android.content.Context r2 = r12.f2517a
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.f2510R0
            int r6 = r4.left
            int r4 = r4.right
            int r6 = r6 + r4
            int r2 = r2 - r6
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
            goto L_0x0152
        L_0x013a:
            android.content.Context r2 = r12.f2517a
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.f2510R0
            int r6 = r4.left
            int r4 = r4.right
            int r6 = r6 + r4
            int r2 = r2 - r6
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
        L_0x0152:
            r7 = r1
            androidx.appcompat.widget.k0 r6 = r12.f2519c
            r8 = 0
            r9 = -1
            int r10 = r3 - r0
            r11 = -1
            int r1 = r6.mo2870e(r7, r8, r9, r10, r11)
            if (r1 <= 0) goto L_0x016f
            androidx.appcompat.widget.k0 r2 = r12.f2519c
            int r2 = r2.getPaddingTop()
            androidx.appcompat.widget.k0 r3 = r12.f2519c
            int r3 = r3.getPaddingBottom()
            int r2 = r2 + r3
            int r5 = r5 + r2
            int r0 = r0 + r5
        L_0x016f:
            int r1 = r1 + r0
            return r1
        L_0x0171:
            int r3 = r3 + r5
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0765q0.mo3612r():int");
    }

    /* renamed from: s */
    public void mo3613s() {
        C0733k0 k0Var = this.f2519c;
        if (k0Var != null) {
            k0Var.setListSelectionHidden(true);
            k0Var.requestLayout();
        }
    }

    /* renamed from: t */
    public View.OnTouchListener mo3614t(View view) {
        return new C0766a(view);
    }

    @C0359n0
    /* renamed from: u */
    public C0733k0 mo2868u(Context context, boolean z) {
        return new C0733k0(context, z);
    }

    @C0363p0
    /* renamed from: v */
    public View mo3615v() {
        return this.f2500H0;
    }

    @C0327c1
    /* renamed from: w */
    public int mo3616w() {
        return this.f2513U0.getAnimationStyle();
    }

    @C0363p0
    /* renamed from: x */
    public Rect mo3617x() {
        if (this.f2511S0 != null) {
            return new Rect(this.f2511S0);
        }
        return null;
    }

    /* renamed from: y */
    public int mo3618y() {
        return this.f2520d;
    }

    /* renamed from: z */
    public int mo3619z() {
        return this.f2513U0.getInputMethodMode();
    }

    public C0765q0(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C0387a.C0389b.listPopupWindowStyle);
    }

    public C0765q0(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, @C0336f int i) {
        this(context, attributeSet, i, 0);
    }

    public C0765q0(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, @C0336f int i, @C0327c1 int i2) {
        this.f2520d = -2;
        this.f2521e = -2;
        this.f2524v = 1002;
        this.f2528z = 0;
        this.f2514X = false;
        this.f2515Y = false;
        this.f2516Z = Integer.MAX_VALUE;
        this.f2498F0 = 0;
        this.f2504L0 = new C0775j();
        this.f2505M0 = new C0774i();
        this.f2506N0 = new C0773h();
        this.f2507O0 = new C0771f();
        this.f2510R0 = new Rect();
        this.f2517a = context;
        this.f2509Q0 = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0387a.C0400m.ListPopupWindow, i, i2);
        this.f2522f = obtainStyledAttributes.getDimensionPixelOffset(C0387a.C0400m.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(C0387a.C0400m.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.f2523g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f2525w = true;
        }
        obtainStyledAttributes.recycle();
        C0741l lVar = new C0741l(context, attributeSet, i, i2);
        this.f2513U0 = lVar;
        lVar.setInputMethodMode(1);
    }
}

package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.C0329d0;
import androidx.annotation.C0341g1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0372t0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.annotation.C0379x;
import androidx.annotation.RestrictTo;
import androidx.collection.C1886l;
import androidx.core.C16986a;
import androidx.core.util.C18001r;
import androidx.core.view.C18019a;
import androidx.core.view.C18147d4;
import androidx.core.view.C18436z4;
import androidx.core.view.accessibility.C18065l0;
import androidx.core.view.accessibility.C18089u0;
import androidx.core.view.accessibility.C18098w0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: androidx.core.view.h2 */
public class C18196h2 {

    /* renamed from: A */
    public static final int f46801A = 1;

    /* renamed from: B */
    public static final int f46802B = 1;

    /* renamed from: C */
    public static final int f46803C = 2;

    /* renamed from: D */
    public static final int f46804D = 4;

    /* renamed from: E */
    public static final int f46805E = 8;

    /* renamed from: F */
    public static final int f46806F = 16;

    /* renamed from: G */
    public static final int f46807G = 32;

    /* renamed from: H */
    public static final AtomicInteger f46808H = new AtomicInteger(1);

    /* renamed from: I */
    public static Field f46809I = null;

    /* renamed from: J */
    public static boolean f46810J = false;

    /* renamed from: K */
    public static Field f46811K = null;

    /* renamed from: L */
    public static boolean f46812L = false;

    /* renamed from: M */
    public static Method f46813M = null;

    /* renamed from: N */
    public static Method f46814N = null;

    /* renamed from: O */
    public static boolean f46815O = false;

    /* renamed from: P */
    public static WeakHashMap<View, String> f46816P = null;

    /* renamed from: Q */
    public static WeakHashMap<View, C18402w3> f46817Q = null;

    /* renamed from: R */
    public static Method f46818R = null;

    /* renamed from: S */
    public static Field f46819S = null;

    /* renamed from: T */
    public static boolean f46820T = false;

    /* renamed from: U */
    public static ThreadLocal<Rect> f46821U = null;

    /* renamed from: V */
    public static final int[] f46822V = {C16986a.C16991e.accessibility_custom_action_0, C16986a.C16991e.accessibility_custom_action_1, C16986a.C16991e.accessibility_custom_action_2, C16986a.C16991e.accessibility_custom_action_3, C16986a.C16991e.accessibility_custom_action_4, C16986a.C16991e.accessibility_custom_action_5, C16986a.C16991e.accessibility_custom_action_6, C16986a.C16991e.accessibility_custom_action_7, C16986a.C16991e.accessibility_custom_action_8, C16986a.C16991e.accessibility_custom_action_9, C16986a.C16991e.accessibility_custom_action_10, C16986a.C16991e.accessibility_custom_action_11, C16986a.C16991e.accessibility_custom_action_12, C16986a.C16991e.accessibility_custom_action_13, C16986a.C16991e.accessibility_custom_action_14, C16986a.C16991e.accessibility_custom_action_15, C16986a.C16991e.accessibility_custom_action_16, C16986a.C16991e.accessibility_custom_action_17, C16986a.C16991e.accessibility_custom_action_18, C16986a.C16991e.accessibility_custom_action_19, C16986a.C16991e.accessibility_custom_action_20, C16986a.C16991e.accessibility_custom_action_21, C16986a.C16991e.accessibility_custom_action_22, C16986a.C16991e.accessibility_custom_action_23, C16986a.C16991e.accessibility_custom_action_24, C16986a.C16991e.accessibility_custom_action_25, C16986a.C16991e.accessibility_custom_action_26, C16986a.C16991e.accessibility_custom_action_27, C16986a.C16991e.accessibility_custom_action_28, C16986a.C16991e.accessibility_custom_action_29, C16986a.C16991e.accessibility_custom_action_30, C16986a.C16991e.accessibility_custom_action_31};

    /* renamed from: W */
    public static final C18433z1 f46823W = new C18180g2();

    /* renamed from: X */
    public static final C18204e f46824X = new C18204e();

    /* renamed from: a */
    public static final String f46825a = "ViewCompat";
    @Deprecated

    /* renamed from: b */
    public static final int f46826b = 0;
    @Deprecated

    /* renamed from: c */
    public static final int f46827c = 1;
    @Deprecated

    /* renamed from: d */
    public static final int f46828d = 2;

    /* renamed from: e */
    public static final int f46829e = 0;

    /* renamed from: f */
    public static final int f46830f = 1;

    /* renamed from: g */
    public static final int f46831g = 2;

    /* renamed from: h */
    public static final int f46832h = 4;

    /* renamed from: i */
    public static final int f46833i = 0;

    /* renamed from: j */
    public static final int f46834j = 1;

    /* renamed from: k */
    public static final int f46835k = 2;
    @Deprecated

    /* renamed from: l */
    public static final int f46836l = 0;
    @Deprecated

    /* renamed from: m */
    public static final int f46837m = 1;
    @Deprecated

    /* renamed from: n */
    public static final int f46838n = 2;

    /* renamed from: o */
    public static final int f46839o = 0;

    /* renamed from: p */
    public static final int f46840p = 1;

    /* renamed from: q */
    public static final int f46841q = 2;

    /* renamed from: r */
    public static final int f46842r = 3;
    @Deprecated

    /* renamed from: s */
    public static final int f46843s = 16777215;
    @Deprecated

    /* renamed from: t */
    public static final int f46844t = -16777216;
    @Deprecated

    /* renamed from: u */
    public static final int f46845u = 16;
    @Deprecated

    /* renamed from: v */
    public static final int f46846v = 16777216;

    /* renamed from: w */
    public static final int f46847w = 0;

    /* renamed from: x */
    public static final int f46848x = 1;

    /* renamed from: y */
    public static final int f46849y = 2;

    /* renamed from: z */
    public static final int f46850z = 0;

    /* renamed from: androidx.core.view.h2$a */
    public class C18197a extends C18205f<Boolean> {
        public C18197a(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        @C0376v0(28)
        /* renamed from: i */
        public Boolean mo52879d(@C0359n0 View view) {
            return Boolean.valueOf(C18217q.m82804d(view));
        }

        @C0376v0(28)
        /* renamed from: j */
        public void mo52880e(@C0359n0 View view, Boolean bool) {
            C18217q.m82809i(view, bool.booleanValue());
        }

        /* renamed from: k */
        public boolean mo52881h(Boolean bool, Boolean bool2) {
            return !mo52908a(bool, bool2);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.view.h2$a0 */
    public @interface C18198a0 {
    }

    /* renamed from: androidx.core.view.h2$b */
    public class C18199b extends C18205f<CharSequence> {
        public C18199b(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        @C0376v0(28)
        /* renamed from: i */
        public CharSequence mo52879d(View view) {
            return C18217q.m82802b(view);
        }

        @C0376v0(28)
        /* renamed from: j */
        public void mo52880e(View view, CharSequence charSequence) {
            C18217q.m82808h(view, charSequence);
        }

        /* renamed from: k */
        public boolean mo52881h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.view.h2$b0 */
    public @interface C18200b0 {
    }

    /* renamed from: androidx.core.view.h2$c */
    public class C18201c extends C18205f<CharSequence> {
        public C18201c(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        @C0376v0(30)
        /* renamed from: i */
        public CharSequence mo52879d(View view) {
            return C18219s.m82814a(view);
        }

        @C0376v0(30)
        /* renamed from: j */
        public void mo52880e(View view, CharSequence charSequence) {
            C18219s.m82816c(view, charSequence);
        }

        /* renamed from: k */
        public boolean mo52881h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: androidx.core.view.h2$c0 */
    public static class C18202c0 {

        /* renamed from: d */
        public static final ArrayList<WeakReference<View>> f46851d = new ArrayList<>();
        @C0363p0

        /* renamed from: a */
        public WeakHashMap<View, Boolean> f46852a = null;

        /* renamed from: b */
        public SparseArray<WeakReference<View>> f46853b = null;

        /* renamed from: c */
        public WeakReference<KeyEvent> f46854c = null;

        /* renamed from: a */
        public static C18202c0 m82678a(View view) {
            int i = C16986a.C16991e.tag_unhandled_key_event_manager;
            C18202c0 c0Var = (C18202c0) view.getTag(i);
            if (c0Var != null) {
                return c0Var;
            }
            C18202c0 c0Var2 = new C18202c0();
            view.setTag(i, c0Var2);
            return c0Var2;
        }

        /* renamed from: h */
        public static void m82679h(View view) {
            ArrayList<WeakReference<View>> arrayList = f46851d;
            synchronized (arrayList) {
                Iterator<WeakReference<View>> it = arrayList.iterator();
                while (it.hasNext()) {
                    if (it.next().get() == view) {
                        return;
                    }
                }
                f46851d.add(new WeakReference(view));
            }
        }

        /* renamed from: i */
        public static void m82680i(View view) {
            synchronized (f46851d) {
                int i = 0;
                while (true) {
                    ArrayList<WeakReference<View>> arrayList = f46851d;
                    if (i >= arrayList.size()) {
                        return;
                    }
                    if (arrayList.get(i).get() == view) {
                        arrayList.remove(i);
                        return;
                    }
                    i++;
                }
            }
        }

        /* renamed from: b */
        public boolean mo52891b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                mo52896g();
            }
            View c = mo52892c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c != null && !KeyEvent.isModifierKey(keyCode)) {
                    mo52893d().put(keyCode, new WeakReference(c));
                }
            }
            if (c != null) {
                return true;
            }
            return false;
        }

        @C0363p0
        /* renamed from: c */
        public final View mo52892c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f46852a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c = mo52892c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c != null) {
                            return c;
                        }
                    }
                }
                if (mo52894e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* renamed from: d */
        public final SparseArray<WeakReference<View>> mo52893d() {
            if (this.f46853b == null) {
                this.f46853b = new SparseArray<>();
            }
            return this.f46853b;
        }

        /* renamed from: e */
        public final boolean mo52894e(@C0359n0 View view, @C0359n0 KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(C16986a.C16991e.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((C18226z) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: f */
        public boolean mo52895f(KeyEvent keyEvent) {
            WeakReference weakReference;
            int indexOfKey;
            WeakReference<KeyEvent> weakReference2 = this.f46854c;
            if (weakReference2 != null && weakReference2.get() == keyEvent) {
                return false;
            }
            this.f46854c = new WeakReference<>(keyEvent);
            SparseArray<WeakReference<View>> d = mo52893d();
            if (keyEvent.getAction() != 1 || (indexOfKey = d.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReference = null;
            } else {
                weakReference = d.valueAt(indexOfKey);
                d.removeAt(indexOfKey);
            }
            if (weakReference == null) {
                weakReference = d.get(keyEvent.getKeyCode());
            }
            if (weakReference == null) {
                return false;
            }
            View view = (View) weakReference.get();
            if (view != null && C18196h2.m82521O0(view)) {
                mo52894e(view, keyEvent);
            }
            return true;
        }

        /* renamed from: g */
        public final void mo52896g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f46852a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f46851d;
            if (!arrayList.isEmpty()) {
                synchronized (arrayList) {
                    if (this.f46852a == null) {
                        this.f46852a = new WeakHashMap<>();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList<WeakReference<View>> arrayList2 = f46851d;
                        View view = (View) arrayList2.get(size).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f46852a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f46852a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: androidx.core.view.h2$d */
    public class C18203d extends C18205f<Boolean> {
        public C18203d(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        @C0376v0(28)
        /* renamed from: i */
        public Boolean mo52879d(View view) {
            return Boolean.valueOf(C18217q.m82803c(view));
        }

        @C0376v0(28)
        /* renamed from: j */
        public void mo52880e(View view, Boolean bool) {
            C18217q.m82807g(view, bool.booleanValue());
        }

        /* renamed from: k */
        public boolean mo52881h(Boolean bool, Boolean bool2) {
            return !mo52908a(bool, bool2);
        }
    }

    /* renamed from: androidx.core.view.h2$e */
    public static class C18204e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: a */
        public final WeakHashMap<View, Boolean> f46855a = new WeakHashMap<>();

        @C0376v0(19)
        /* renamed from: a */
        public void mo52900a(View view) {
            boolean z;
            WeakHashMap<View, Boolean> weakHashMap = this.f46855a;
            if (!view.isShown() || view.getWindowVisibility() != 0) {
                z = false;
            } else {
                z = true;
            }
            weakHashMap.put(view, Boolean.valueOf(z));
            view.addOnAttachStateChangeListener(this);
            if (C18210k.m82741b(view)) {
                mo52902c(view);
            }
        }

        @C0376v0(19)
        /* renamed from: b */
        public final void mo52901b(View view, boolean z) {
            boolean z2;
            int i;
            if (!view.isShown() || view.getWindowVisibility() != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z != z2) {
                if (z2) {
                    i = 16;
                } else {
                    i = 32;
                }
                C18196h2.m82570d1(view, i);
                this.f46855a.put(view, Boolean.valueOf(z2));
            }
        }

        @C0376v0(19)
        /* renamed from: c */
        public final void mo52902c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @C0376v0(19)
        /* renamed from: d */
        public void mo52903d(View view) {
            this.f46855a.remove(view);
            view.removeOnAttachStateChangeListener(this);
            mo52904e(view);
        }

        @C0376v0(19)
        /* renamed from: e */
        public final void mo52904e(View view) {
            C18207h.m82721o(view.getViewTreeObserver(), this);
        }

        @C0376v0(19)
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry next : this.f46855a.entrySet()) {
                    mo52901b((View) next.getKey(), ((Boolean) next.getValue()).booleanValue());
                }
            }
        }

        @C0376v0(19)
        public void onViewAttachedToWindow(View view) {
            mo52902c(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: androidx.core.view.h2$f */
    public static abstract class C18205f<T> {

        /* renamed from: a */
        public final int f46856a;

        /* renamed from: b */
        public final Class<T> f46857b;

        /* renamed from: c */
        public final int f46858c;

        /* renamed from: d */
        public final int f46859d;

        public C18205f(int i, Class<T> cls, int i2) {
            this(i, cls, 0, i2);
        }

        /* renamed from: a */
        public boolean mo52908a(Boolean bool, Boolean bool2) {
            boolean z;
            boolean z2;
            if (bool == null || !bool.booleanValue()) {
                z = false;
            } else {
                z = true;
            }
            if (bool2 == null || !bool2.booleanValue()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z == z2) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public final boolean mo52909b() {
            return true;
        }

        /* renamed from: c */
        public final boolean mo52910c() {
            return Build.VERSION.SDK_INT >= this.f46858c;
        }

        /* renamed from: d */
        public abstract T mo52879d(View view);

        /* renamed from: e */
        public abstract void mo52880e(View view, T t);

        /* renamed from: f */
        public T mo52911f(View view) {
            if (mo52910c()) {
                return mo52879d(view);
            }
            if (!mo52909b()) {
                return null;
            }
            T tag = view.getTag(this.f46856a);
            if (this.f46857b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        /* renamed from: g */
        public void mo52912g(View view, T t) {
            if (mo52910c()) {
                mo52880e(view, t);
            } else if (mo52909b() && mo52881h(mo52911f(view), t)) {
                C18196h2.m82476C(view);
                view.setTag(this.f46856a, t);
                C18196h2.m82570d1(view, this.f46859d);
            }
        }

        /* renamed from: h */
        public boolean mo52881h(T t, T t2) {
            return !t2.equals(t);
        }

        public C18205f(int i, Class<T> cls, int i2, int i3) {
            this.f46856a = i;
            this.f46857b = cls;
            this.f46859d = i2;
            this.f46858c = i3;
        }
    }

    @C0376v0(15)
    /* renamed from: androidx.core.view.h2$g */
    public static class C18206g {
        private C18206g() {
        }

        @C0373u
        /* renamed from: a */
        public static boolean m82706a(@C0359n0 View view) {
            return view.hasOnClickListeners();
        }
    }

    @C0376v0(16)
    /* renamed from: androidx.core.view.h2$h */
    public static class C18207h {
        private C18207h() {
        }

        @C0373u
        /* renamed from: a */
        public static AccessibilityNodeProvider m82707a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        @C0373u
        /* renamed from: b */
        public static boolean m82708b(View view) {
            return view.getFitsSystemWindows();
        }

        @C0373u
        /* renamed from: c */
        public static int m82709c(View view) {
            return view.getImportantForAccessibility();
        }

        @C0373u
        /* renamed from: d */
        public static int m82710d(View view) {
            return view.getMinimumHeight();
        }

        @C0373u
        /* renamed from: e */
        public static int m82711e(View view) {
            return view.getMinimumWidth();
        }

        @C0373u
        /* renamed from: f */
        public static ViewParent m82712f(View view) {
            return view.getParentForAccessibility();
        }

        @C0373u
        /* renamed from: g */
        public static int m82713g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        @C0373u
        /* renamed from: h */
        public static boolean m82714h(View view) {
            return view.hasOverlappingRendering();
        }

        @C0373u
        /* renamed from: i */
        public static boolean m82715i(View view) {
            return view.hasTransientState();
        }

        @C0373u
        /* renamed from: j */
        public static boolean m82716j(View view, int i, Bundle bundle) {
            return view.performAccessibilityAction(i, bundle);
        }

        @C0373u
        /* renamed from: k */
        public static void m82717k(View view) {
            view.postInvalidateOnAnimation();
        }

        @C0373u
        /* renamed from: l */
        public static void m82718l(View view, int i, int i2, int i3, int i4) {
            view.postInvalidateOnAnimation(i, i2, i3, i4);
        }

        @C0373u
        /* renamed from: m */
        public static void m82719m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        @C0373u
        /* renamed from: n */
        public static void m82720n(View view, Runnable runnable, long j) {
            view.postOnAnimationDelayed(runnable, j);
        }

        @C0373u
        /* renamed from: o */
        public static void m82721o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        @C0373u
        /* renamed from: p */
        public static void m82722p(View view) {
            view.requestFitSystemWindows();
        }

        @C0373u
        /* renamed from: q */
        public static void m82723q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        @C0373u
        /* renamed from: r */
        public static void m82724r(View view, boolean z) {
            view.setHasTransientState(z);
        }

        @C0373u
        /* renamed from: s */
        public static void m82725s(View view, int i) {
            view.setImportantForAccessibility(i);
        }
    }

    @C0376v0(17)
    /* renamed from: androidx.core.view.h2$i */
    public static class C18208i {
        private C18208i() {
        }

        @C0373u
        /* renamed from: a */
        public static int m82726a() {
            return View.generateViewId();
        }

        @C0373u
        /* renamed from: b */
        public static Display m82727b(@C0359n0 View view) {
            return view.getDisplay();
        }

        @C0373u
        /* renamed from: c */
        public static int m82728c(View view) {
            return view.getLabelFor();
        }

        @C0373u
        /* renamed from: d */
        public static int m82729d(View view) {
            return view.getLayoutDirection();
        }

        @C0373u
        /* renamed from: e */
        public static int m82730e(View view) {
            return view.getPaddingEnd();
        }

        @C0373u
        /* renamed from: f */
        public static int m82731f(View view) {
            return view.getPaddingStart();
        }

        @C0373u
        /* renamed from: g */
        public static boolean m82732g(View view) {
            return view.isPaddingRelative();
        }

        @C0373u
        /* renamed from: h */
        public static void m82733h(View view, int i) {
            view.setLabelFor(i);
        }

        @C0373u
        /* renamed from: i */
        public static void m82734i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        @C0373u
        /* renamed from: j */
        public static void m82735j(View view, int i) {
            view.setLayoutDirection(i);
        }

        @C0373u
        /* renamed from: k */
        public static void m82736k(View view, int i, int i2, int i3, int i4) {
            view.setPaddingRelative(i, i2, i3, i4);
        }
    }

    @C0376v0(18)
    /* renamed from: androidx.core.view.h2$j */
    public static class C18209j {
        private C18209j() {
        }

        @C0373u
        /* renamed from: a */
        public static Rect m82737a(@C0359n0 View view) {
            return view.getClipBounds();
        }

        @C0373u
        /* renamed from: b */
        public static boolean m82738b(@C0359n0 View view) {
            return view.isInLayout();
        }

        @C0373u
        /* renamed from: c */
        public static void m82739c(@C0359n0 View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    @C0376v0(19)
    /* renamed from: androidx.core.view.h2$k */
    public static class C18210k {
        private C18210k() {
        }

        @C0373u
        /* renamed from: a */
        public static int m82740a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        @C0373u
        /* renamed from: b */
        public static boolean m82741b(@C0359n0 View view) {
            return view.isAttachedToWindow();
        }

        @C0373u
        /* renamed from: c */
        public static boolean m82742c(@C0359n0 View view) {
            return view.isLaidOut();
        }

        @C0373u
        /* renamed from: d */
        public static boolean m82743d(@C0359n0 View view) {
            return view.isLayoutDirectionResolved();
        }

        @C0373u
        /* renamed from: e */
        public static void m82744e(ViewParent viewParent, View view, View view2, int i) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
        }

        @C0373u
        /* renamed from: f */
        public static void m82745f(View view, int i) {
            view.setAccessibilityLiveRegion(i);
        }

        @C0373u
        /* renamed from: g */
        public static void m82746g(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    @C0376v0(20)
    /* renamed from: androidx.core.view.h2$l */
    public static class C18211l {
        private C18211l() {
        }

        @C0373u
        /* renamed from: a */
        public static WindowInsets m82747a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        @C0373u
        /* renamed from: b */
        public static WindowInsets m82748b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        @C0373u
        /* renamed from: c */
        public static void m82749c(View view) {
            view.requestApplyInsets();
        }
    }

    @C0376v0(21)
    /* renamed from: androidx.core.view.h2$m */
    public static class C18212m {

        /* renamed from: androidx.core.view.h2$m$a */
        public class C18213a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a */
            public C18436z4 f46860a = null;

            /* renamed from: b */
            public final /* synthetic */ View f46861b;

            /* renamed from: c */
            public final /* synthetic */ C18414x1 f46862c;

            public C18213a(View view, C18414x1 x1Var) {
                this.f46861b = view;
                this.f46862c = x1Var;
            }

            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                C18436z4 L = C18436z4.m83375L(windowInsets, view);
                int i = Build.VERSION.SDK_INT;
                if (i < 30) {
                    C18212m.m82750a(windowInsets, this.f46861b);
                    if (L.equals(this.f46860a)) {
                        return this.f46862c.mo1193a(view, L).mo53129J();
                    }
                }
                this.f46860a = L;
                C18436z4 a = this.f46862c.mo1193a(view, L);
                if (i >= 30) {
                    return a.mo53129J();
                }
                C18196h2.m82642v1(view);
                return a.mo53129J();
            }
        }

        private C18212m() {
        }

        @C0373u
        /* renamed from: a */
        public static void m82750a(@C0359n0 WindowInsets windowInsets, @C0359n0 View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(C16986a.C16991e.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        @C0373u
        /* renamed from: b */
        public static C18436z4 m82751b(@C0359n0 View view, @C0359n0 C18436z4 z4Var, @C0359n0 Rect rect) {
            WindowInsets J = z4Var.mo53129J();
            if (J != null) {
                return C18436z4.m83375L(view.computeSystemWindowInsets(J, rect), view);
            }
            rect.setEmpty();
            return z4Var;
        }

        @C0373u
        /* renamed from: c */
        public static boolean m82752c(@C0359n0 View view, float f, float f2, boolean z) {
            return view.dispatchNestedFling(f, f2, z);
        }

        @C0373u
        /* renamed from: d */
        public static boolean m82753d(@C0359n0 View view, float f, float f2) {
            return view.dispatchNestedPreFling(f, f2);
        }

        @C0373u
        /* renamed from: e */
        public static boolean m82754e(View view, int i, int i2, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
        }

        @C0373u
        /* renamed from: f */
        public static boolean m82755f(View view, int i, int i2, int i3, int i4, int[] iArr) {
            return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
        }

        @C0373u
        /* renamed from: g */
        public static ColorStateList m82756g(View view) {
            return view.getBackgroundTintList();
        }

        @C0373u
        /* renamed from: h */
        public static PorterDuff.Mode m82757h(View view) {
            return view.getBackgroundTintMode();
        }

        @C0373u
        /* renamed from: i */
        public static float m82758i(View view) {
            return view.getElevation();
        }

        @C0363p0
        @C0373u
        /* renamed from: j */
        public static C18436z4 m82759j(@C0359n0 View view) {
            return C18436z4.C18437a.m83412a(view);
        }

        @C0373u
        /* renamed from: k */
        public static String m82760k(View view) {
            return view.getTransitionName();
        }

        @C0373u
        /* renamed from: l */
        public static float m82761l(View view) {
            return view.getTranslationZ();
        }

        @C0373u
        /* renamed from: m */
        public static float m82762m(@C0359n0 View view) {
            return view.getZ();
        }

        @C0373u
        /* renamed from: n */
        public static boolean m82763n(View view) {
            return view.hasNestedScrollingParent();
        }

        @C0373u
        /* renamed from: o */
        public static boolean m82764o(View view) {
            return view.isImportantForAccessibility();
        }

        @C0373u
        /* renamed from: p */
        public static boolean m82765p(View view) {
            return view.isNestedScrollingEnabled();
        }

        @C0373u
        /* renamed from: q */
        public static void m82766q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        @C0373u
        /* renamed from: r */
        public static void m82767r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        @C0373u
        /* renamed from: s */
        public static void m82768s(View view, float f) {
            view.setElevation(f);
        }

        @C0373u
        /* renamed from: t */
        public static void m82769t(View view, boolean z) {
            view.setNestedScrollingEnabled(z);
        }

        @C0373u
        /* renamed from: u */
        public static void m82770u(@C0359n0 View view, @C0363p0 C18414x1 x1Var) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(C16986a.C16991e.tag_on_apply_window_listener, x1Var);
            }
            if (x1Var == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(C16986a.C16991e.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new C18213a(view, x1Var));
            }
        }

        @C0373u
        /* renamed from: v */
        public static void m82771v(View view, String str) {
            view.setTransitionName(str);
        }

        @C0373u
        /* renamed from: w */
        public static void m82772w(View view, float f) {
            view.setTranslationZ(f);
        }

        @C0373u
        /* renamed from: x */
        public static void m82773x(@C0359n0 View view, float f) {
            view.setZ(f);
        }

        @C0373u
        /* renamed from: y */
        public static boolean m82774y(View view, int i) {
            return view.startNestedScroll(i);
        }

        @C0373u
        /* renamed from: z */
        public static void m82775z(View view) {
            view.stopNestedScroll();
        }
    }

    @C0376v0(23)
    /* renamed from: androidx.core.view.h2$n */
    public static class C18214n {
        private C18214n() {
        }

        @C0363p0
        /* renamed from: a */
        public static C18436z4 m82776a(@C0359n0 View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            C18436z4 K = C18436z4.m83374K(rootWindowInsets);
            K.mo53127H(K);
            K.mo53133d(view.getRootView());
            return K;
        }

        @C0373u
        /* renamed from: b */
        public static int m82777b(@C0359n0 View view) {
            return view.getScrollIndicators();
        }

        @C0373u
        /* renamed from: c */
        public static void m82778c(@C0359n0 View view, int i) {
            view.setScrollIndicators(i);
        }

        @C0373u
        /* renamed from: d */
        public static void m82779d(@C0359n0 View view, int i, int i2) {
            view.setScrollIndicators(i, i2);
        }
    }

    @C0376v0(24)
    /* renamed from: androidx.core.view.h2$o */
    public static class C18215o {
        private C18215o() {
        }

        @C0373u
        /* renamed from: a */
        public static void m82780a(@C0359n0 View view) {
            view.cancelDragAndDrop();
        }

        @C0373u
        /* renamed from: b */
        public static void m82781b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        @C0373u
        /* renamed from: c */
        public static void m82782c(View view) {
            view.dispatchStartTemporaryDetach();
        }

        @C0373u
        /* renamed from: d */
        public static void m82783d(@C0359n0 View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        @C0373u
        /* renamed from: e */
        public static boolean m82784e(@C0359n0 View view, @C0363p0 ClipData clipData, @C0359n0 View.DragShadowBuilder dragShadowBuilder, @C0363p0 Object obj, int i) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i);
        }

        @C0373u
        /* renamed from: f */
        public static void m82785f(@C0359n0 View view, @C0359n0 View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    @C0376v0(26)
    /* renamed from: androidx.core.view.h2$p */
    public static class C18216p {
        private C18216p() {
        }

        @C0373u
        /* renamed from: a */
        public static void m82786a(@C0359n0 View view, Collection<View> collection, int i) {
            view.addKeyboardNavigationClusters(collection, i);
        }

        @C0373u
        /* renamed from: b */
        public static int m82787b(View view) {
            return view.getImportantForAutofill();
        }

        @C0373u
        /* renamed from: c */
        public static int m82788c(@C0359n0 View view) {
            return view.getNextClusterForwardId();
        }

        @C0373u
        /* renamed from: d */
        public static boolean m82789d(@C0359n0 View view) {
            return view.hasExplicitFocusable();
        }

        @C0373u
        /* renamed from: e */
        public static boolean m82790e(@C0359n0 View view) {
            return view.isFocusedByDefault();
        }

        @C0373u
        /* renamed from: f */
        public static boolean m82791f(View view) {
            return view.isImportantForAutofill();
        }

        @C0373u
        /* renamed from: g */
        public static boolean m82792g(@C0359n0 View view) {
            return view.isKeyboardNavigationCluster();
        }

        @C0373u
        /* renamed from: h */
        public static View m82793h(@C0359n0 View view, View view2, int i) {
            return view.keyboardNavigationClusterSearch(view2, i);
        }

        @C0373u
        /* renamed from: i */
        public static boolean m82794i(@C0359n0 View view) {
            return view.restoreDefaultFocus();
        }

        @C0373u
        /* renamed from: j */
        public static void m82795j(@C0359n0 View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        @C0373u
        /* renamed from: k */
        public static void m82796k(@C0359n0 View view, boolean z) {
            view.setFocusedByDefault(z);
        }

        @C0373u
        /* renamed from: l */
        public static void m82797l(View view, int i) {
            view.setImportantForAutofill(i);
        }

        @C0373u
        /* renamed from: m */
        public static void m82798m(@C0359n0 View view, boolean z) {
            view.setKeyboardNavigationCluster(z);
        }

        @C0373u
        /* renamed from: n */
        public static void m82799n(View view, int i) {
            view.setNextClusterForwardId(i);
        }

        @C0373u
        /* renamed from: o */
        public static void m82800o(@C0359n0 View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    @C0376v0(28)
    /* renamed from: androidx.core.view.h2$q */
    public static class C18217q {
        private C18217q() {
        }

        @C0373u
        /* renamed from: a */
        public static void m82801a(@C0359n0 View view, @C0359n0 C18226z zVar) {
            int i = C16986a.C16991e.tag_unhandled_key_listeners;
            C1886l lVar = (C1886l) view.getTag(i);
            if (lVar == null) {
                lVar = new C1886l();
                view.setTag(i, lVar);
            }
            Objects.requireNonNull(zVar);
            C18173f3 f3Var = new C18173f3(zVar);
            lVar.put(zVar, f3Var);
            view.addOnUnhandledKeyEventListener(f3Var);
        }

        @C0373u
        /* renamed from: b */
        public static CharSequence m82802b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        @C0373u
        /* renamed from: c */
        public static boolean m82803c(View view) {
            return view.isAccessibilityHeading();
        }

        @C0373u
        /* renamed from: d */
        public static boolean m82804d(View view) {
            return view.isScreenReaderFocusable();
        }

        @C0373u
        /* renamed from: e */
        public static void m82805e(@C0359n0 View view, @C0359n0 C18226z zVar) {
            View.OnUnhandledKeyEventListener a;
            C1886l lVar = (C1886l) view.getTag(C16986a.C16991e.tag_unhandled_key_listeners);
            if (lVar != null && (a = C18126b3.m82293a(lVar.get(zVar))) != null) {
                view.removeOnUnhandledKeyEventListener(a);
            }
        }

        @C0373u
        /* renamed from: f */
        public static <T> T m82806f(View view, int i) {
            return view.requireViewById(i);
        }

        @C0373u
        /* renamed from: g */
        public static void m82807g(View view, boolean z) {
            view.setAccessibilityHeading(z);
        }

        @C0373u
        /* renamed from: h */
        public static void m82808h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        @C0373u
        /* renamed from: i */
        public static void m82809i(View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }
    }

    @C0376v0(29)
    /* renamed from: androidx.core.view.h2$r */
    public static class C18218r {
        private C18218r() {
        }

        @C0373u
        /* renamed from: a */
        public static View.AccessibilityDelegate m82810a(View view) {
            return view.getAccessibilityDelegate();
        }

        @C0373u
        /* renamed from: b */
        public static List<Rect> m82811b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        @C0373u
        /* renamed from: c */
        public static void m82812c(@C0359n0 View view, @C0359n0 Context context, @C0359n0 int[] iArr, @C0363p0 AttributeSet attributeSet, @C0359n0 TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }

        @C0373u
        /* renamed from: d */
        public static void m82813d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    @C0376v0(30)
    /* renamed from: androidx.core.view.h2$s */
    public static class C18219s {
        private C18219s() {
        }

        @C0373u
        /* renamed from: a */
        public static CharSequence m82814a(View view) {
            return view.getStateDescription();
        }

        @C0363p0
        /* renamed from: b */
        public static C18184g6 m82815b(@C0359n0 View view) {
            WindowInsetsController a = view.getWindowInsetsController();
            if (a != null) {
                return C18184g6.m82404l(a);
            }
            return null;
        }

        @C0373u
        /* renamed from: c */
        public static void m82816c(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    @C0376v0(31)
    /* renamed from: androidx.core.view.h2$t */
    public static final class C18220t {
        private C18220t() {
        }

        @C0363p0
        @C0373u
        /* renamed from: a */
        public static String[] m82817a(@C0359n0 View view) {
            return view.getReceiveContentMimeTypes();
        }

        @C0363p0
        @C0373u
        /* renamed from: b */
        public static C18274k m82818b(@C0359n0 View view, @C0359n0 C18274k kVar) {
            ContentInfo l = kVar.mo52939l();
            ContentInfo a = view.performReceiveContent(l);
            if (a == null) {
                return null;
            }
            if (a == l) {
                return kVar;
            }
            return C18274k.m82905m(a);
        }

        @C0373u
        /* renamed from: c */
        public static void m82819c(@C0359n0 View view, @C0363p0 String[] strArr, @C0363p0 C18424y1 y1Var) {
            if (y1Var == null) {
                view.setOnReceiveContentListener(strArr, (OnReceiveContentListener) null);
            } else {
                view.setOnReceiveContentListener(strArr, new C18225y(y1Var));
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.view.h2$u */
    public @interface C18221u {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.view.h2$v */
    public @interface C18222v {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.view.h2$w */
    public @interface C18223w {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.view.h2$x */
    public @interface C18224x {
    }

    @C0376v0(31)
    /* renamed from: androidx.core.view.h2$y */
    public static final class C18225y implements OnReceiveContentListener {
        @C0359n0

        /* renamed from: a */
        public final C18424y1 f46863a;

        public C18225y(@C0359n0 C18424y1 y1Var) {
            this.f46863a = y1Var;
        }

        @C0363p0
        public ContentInfo onReceiveContent(@C0359n0 View view, @C0359n0 ContentInfo contentInfo) {
            C18274k m = C18274k.m82905m(contentInfo);
            C18274k a = this.f46863a.mo53098a(view, m);
            if (a == null) {
                return null;
            }
            if (a == m) {
                return contentInfo;
            }
            return a.mo52939l();
        }
    }

    /* renamed from: androidx.core.view.h2$z */
    public interface C18226z {
        boolean onUnhandledKeyEvent(@C0359n0 View view, @C0359n0 KeyEvent keyEvent);
    }

    @C0341g1
    /* renamed from: A */
    public static boolean m82468A(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C18202c0.m82678a(view).mo52895f(keyEvent);
    }

    /* renamed from: A0 */
    public static float m82469A0(@C0359n0 View view) {
        return C18212m.m82761l(view);
    }

    /* renamed from: A1 */
    public static C18205f<Boolean> m82470A1() {
        return new C18197a(C16986a.C16991e.tag_screen_reader_focusable, Boolean.class, 28);
    }

    @Deprecated
    /* renamed from: A2 */
    public static void m82471A2(View view, float f) {
        view.setY(f);
    }

    /* renamed from: B */
    public static void m82472B(@C0359n0 View view) {
        m82476C(view);
    }

    @C0363p0
    @Deprecated
    /* renamed from: B0 */
    public static C18184g6 m82473B0(@C0359n0 View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C18219s.m82815b(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return C18026a4.m81878a(window, view);
                }
                return null;
            }
        }
        return null;
    }

    /* renamed from: B1 */
    public static void m82474B1(@C0359n0 View view, @C0363p0 C18019a aVar) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (aVar == null && (m82488F(view) instanceof C18019a.C18020a)) {
            aVar = new C18019a();
        }
        if (aVar == null) {
            accessibilityDelegate = null;
        } else {
            accessibilityDelegate = aVar.mo52490d();
        }
        view.setAccessibilityDelegate(accessibilityDelegate);
    }

    /* renamed from: B2 */
    public static void m82475B2(@C0359n0 View view, float f) {
        C18212m.m82773x(view, f);
    }

    /* renamed from: C */
    public static void m82476C(@C0359n0 View view) {
        C18019a E = m82484E(view);
        if (E == null) {
            E = new C18019a();
        }
        m82474B1(view, E);
    }

    @Deprecated
    /* renamed from: C0 */
    public static int m82477C0(@C0359n0 View view) {
        return C18207h.m82713g(view);
    }

    @C0341g1
    /* renamed from: C1 */
    public static void m82478C1(@C0359n0 View view, boolean z) {
        m82560b().mo52912g(view, Boolean.valueOf(z));
    }

    /* renamed from: C2 */
    public static boolean m82479C2(@C0359n0 View view, @C0363p0 ClipData clipData, @C0359n0 View.DragShadowBuilder dragShadowBuilder, @C0363p0 Object obj, int i) {
        return C18215o.m82784e(view, clipData, dragShadowBuilder, obj, i);
    }

    /* renamed from: D */
    public static int m82480D() {
        return C18208i.m82726a();
    }

    @Deprecated
    /* renamed from: D0 */
    public static float m82481D0(View view) {
        return view.getX();
    }

    /* renamed from: D1 */
    public static void m82482D1(@C0359n0 View view, int i) {
        C18210k.m82745f(view, i);
    }

    /* renamed from: D2 */
    public static boolean m82483D2(@C0359n0 View view, int i) {
        return C18212m.m82774y(view, i);
    }

    @C0363p0
    /* renamed from: E */
    public static C18019a m82484E(@C0359n0 View view) {
        View.AccessibilityDelegate F = m82488F(view);
        if (F == null) {
            return null;
        }
        if (F instanceof C18019a.C18020a) {
            return ((C18019a.C18020a) F).f46538a;
        }
        return new C18019a(F);
    }

    @Deprecated
    /* renamed from: E0 */
    public static float m82485E0(View view) {
        return view.getY();
    }

    @C0341g1
    /* renamed from: E1 */
    public static void m82486E1(@C0359n0 View view, @C0363p0 CharSequence charSequence) {
        m82598k1().mo52912g(view, charSequence);
        if (charSequence != null) {
            f46824X.mo52900a(view);
        } else {
            f46824X.mo52903d(view);
        }
    }

    /* renamed from: E2 */
    public static boolean m82487E2(@C0359n0 View view, int i, int i2) {
        if (view instanceof C18336p1) {
            return ((C18336p1) view).mo52993d(i, i2);
        }
        if (i2 == 0) {
            return m82483D2(view, i);
        }
        return false;
    }

    @C0363p0
    /* renamed from: F */
    public static View.AccessibilityDelegate m82488F(@C0359n0 View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C18218r.m82810a(view);
        }
        return m82492G(view);
    }

    /* renamed from: F0 */
    public static float m82489F0(@C0359n0 View view) {
        return C18212m.m82762m(view);
    }

    @Deprecated
    /* renamed from: F1 */
    public static void m82490F1(View view, boolean z) {
        view.setActivated(z);
    }

    /* renamed from: F2 */
    public static C18205f<CharSequence> m82491F2() {
        return new C18201c(C16986a.C16991e.tag_state_description, CharSequence.class, 64, 30);
    }

    @C0363p0
    /* renamed from: G */
    public static View.AccessibilityDelegate m82492G(@C0359n0 View view) {
        if (f46820T) {
            return null;
        }
        if (f46819S == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f46819S = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f46820T = true;
                return null;
            }
        }
        try {
            Object obj = f46819S.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f46820T = true;
            return null;
        }
    }

    /* renamed from: G0 */
    public static boolean m82493G0(@C0359n0 View view) {
        return m82488F(view) != null;
    }

    @Deprecated
    /* renamed from: G1 */
    public static void m82494G1(View view, @C0379x(from = 0.0d, mo1016to = 1.0d) float f) {
        view.setAlpha(f);
    }

    /* renamed from: G2 */
    public static void m82495G2(@C0359n0 View view) {
        C18212m.m82775z(view);
    }

    /* renamed from: H */
    public static int m82496H(@C0359n0 View view) {
        return C18210k.m82740a(view);
    }

    /* renamed from: H0 */
    public static boolean m82497H0(@C0359n0 View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C18216p.m82789d(view);
        }
        return view.hasFocusable();
    }

    /* renamed from: H1 */
    public static void m82498H1(@C0359n0 View view, @C0363p0 String... strArr) {
        if (Build.VERSION.SDK_INT >= 26) {
            C18216p.m82795j(view, strArr);
        }
    }

    /* renamed from: H2 */
    public static void m82499H2(@C0359n0 View view, int i) {
        if (view instanceof C18336p1) {
            ((C18336p1) view).mo52996g(i);
        } else if (i == 0) {
            m82495G2(view);
        }
    }

    @C0363p0
    /* renamed from: I */
    public static C18089u0 m82500I(@C0359n0 View view) {
        AccessibilityNodeProvider a = C18207h.m82707a(view);
        if (a != null) {
            return new C18089u0(a);
        }
        return null;
    }

    /* renamed from: I0 */
    public static boolean m82501I0(@C0359n0 View view) {
        return C18212m.m82763n(view);
    }

    /* renamed from: I1 */
    public static void m82502I1(@C0359n0 View view, @C0363p0 Drawable drawable) {
        C18207h.m82723q(view, drawable);
    }

    /* renamed from: I2 */
    public static void m82503I2(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    @C0363p0
    @C0341g1
    /* renamed from: J */
    public static CharSequence m82504J(@C0359n0 View view) {
        return m82598k1().mo52911f(view);
    }

    /* renamed from: J0 */
    public static boolean m82505J0(@C0359n0 View view, int i) {
        if (view instanceof C18336p1) {
            ((C18336p1) view).mo52992b(i);
            return false;
        } else if (i == 0) {
            return m82501I0(view);
        } else {
            return false;
        }
    }

    /* renamed from: J1 */
    public static void m82506J1(@C0359n0 View view, @C0363p0 ColorStateList colorStateList) {
        C18212m.m82766q(view, colorStateList);
    }

    /* renamed from: J2 */
    public static void m82507J2(@C0359n0 View view, @C0359n0 View.DragShadowBuilder dragShadowBuilder) {
        C18215o.m82785f(view, dragShadowBuilder);
    }

    /* renamed from: K */
    public static List<C18065l0.C18066a> m82508K(View view) {
        int i = C16986a.C16991e.tag_accessibility_actions;
        ArrayList arrayList = (ArrayList) view.getTag(i);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(i, arrayList2);
        return arrayList2;
    }

    /* renamed from: K0 */
    public static boolean m82509K0(@C0359n0 View view) {
        return C18206g.m82706a(view);
    }

    /* renamed from: K1 */
    public static void m82510K1(@C0359n0 View view, @C0363p0 PorterDuff.Mode mode) {
        C18212m.m82767r(view, mode);
    }

    @Deprecated
    /* renamed from: L */
    public static float m82511L(View view) {
        return view.getAlpha();
    }

    /* renamed from: L0 */
    public static boolean m82512L0(@C0359n0 View view) {
        return C18207h.m82714h(view);
    }

    @SuppressLint({"BanUncheckedReflection"})
    @Deprecated
    /* renamed from: L1 */
    public static void m82513L1(ViewGroup viewGroup, boolean z) {
        if (f46818R == null) {
            Class<ViewGroup> cls = ViewGroup.class;
            try {
                f46818R = cls.getDeclaredMethod("setChildrenDrawingOrderEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
            }
            f46818R.setAccessible(true);
        }
        try {
            f46818R.invoke(viewGroup, new Object[]{Boolean.valueOf(z)});
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
        }
    }

    /* renamed from: M */
    public static int m82514M(View view, @C0359n0 CharSequence charSequence) {
        boolean z;
        List<C18065l0.C18066a> K = m82508K(view);
        for (int i = 0; i < K.size(); i++) {
            if (TextUtils.equals(charSequence, K.get(i).mo52677c())) {
                return K.get(i).mo52676b();
            }
        }
        int i2 = -1;
        int i3 = 0;
        while (true) {
            int[] iArr = f46822V;
            if (i3 >= iArr.length || i2 != -1) {
                return i2;
            }
            int i4 = iArr[i3];
            boolean z2 = true;
            for (int i5 = 0; i5 < K.size(); i5++) {
                if (K.get(i5).mo52676b() != i4) {
                    z = true;
                } else {
                    z = false;
                }
                z2 &= z;
            }
            if (z2) {
                i2 = i4;
            }
            i3++;
        }
        return i2;
    }

    /* renamed from: M0 */
    public static boolean m82515M0(@C0359n0 View view) {
        return C18207h.m82715i(view);
    }

    /* renamed from: M1 */
    public static void m82516M1(@C0359n0 View view, @C0363p0 Rect rect) {
        C18209j.m82739c(view, rect);
    }

    @C0363p0
    /* renamed from: N */
    public static ColorStateList m82517N(@C0359n0 View view) {
        return C18212m.m82756g(view);
    }

    @C0341g1
    /* renamed from: N0 */
    public static boolean m82518N0(@C0359n0 View view) {
        Boolean f = m82560b().mo52911f(view);
        if (f == null || !f.booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: N1 */
    public static void m82519N1(@C0359n0 View view, float f) {
        C18212m.m82768s(view, f);
    }

    @C0363p0
    /* renamed from: O */
    public static PorterDuff.Mode m82520O(@C0359n0 View view) {
        return C18212m.m82757h(view);
    }

    /* renamed from: O0 */
    public static boolean m82521O0(@C0359n0 View view) {
        return C18210k.m82741b(view);
    }

    @Deprecated
    /* renamed from: O1 */
    public static void m82522O1(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    @C0363p0
    /* renamed from: P */
    public static Rect m82523P(@C0359n0 View view) {
        return C18209j.m82737a(view);
    }

    /* renamed from: P0 */
    public static boolean m82524P0(@C0359n0 View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C18216p.m82790e(view);
        }
        return false;
    }

    /* renamed from: P1 */
    public static void m82525P1(@C0359n0 View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            C18216p.m82796k(view, z);
        }
    }

    @C0363p0
    /* renamed from: Q */
    public static Display m82526Q(@C0359n0 View view) {
        return C18208i.m82727b(view);
    }

    /* renamed from: Q0 */
    public static boolean m82527Q0(@C0359n0 View view) {
        return C18212m.m82764o(view);
    }

    /* renamed from: Q1 */
    public static void m82528Q1(@C0359n0 View view, boolean z) {
        C18207h.m82724r(view, z);
    }

    /* renamed from: R */
    public static float m82529R(@C0359n0 View view) {
        return C18212m.m82758i(view);
    }

    /* renamed from: R0 */
    public static boolean m82530R0(@C0359n0 View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C18216p.m82791f(view);
        }
        return true;
    }

    @C0341g1
    /* renamed from: R1 */
    public static void m82531R1(@C0359n0 View view, int i) {
        C18207h.m82725s(view, i);
    }

    /* renamed from: S */
    public static Rect m82532S() {
        if (f46821U == null) {
            f46821U = new ThreadLocal<>();
        }
        Rect rect = f46821U.get();
        if (rect == null) {
            rect = new Rect();
            f46821U.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* renamed from: S0 */
    public static boolean m82533S0(@C0359n0 View view) {
        return C18209j.m82738b(view);
    }

    /* renamed from: S1 */
    public static void m82534S1(@C0359n0 View view, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            C18216p.m82797l(view, i);
        }
    }

    /* renamed from: T */
    public static C18433z1 m82535T(@C0359n0 View view) {
        if (view instanceof C18433z1) {
            return (C18433z1) view;
        }
        return f46823W;
    }

    /* renamed from: T0 */
    public static boolean m82536T0(@C0359n0 View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C18216p.m82792g(view);
        }
        return false;
    }

    /* renamed from: T1 */
    public static void m82537T1(@C0359n0 View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            C18216p.m82798m(view, z);
        }
    }

    /* renamed from: U */
    public static boolean m82538U(@C0359n0 View view) {
        return C18207h.m82708b(view);
    }

    /* renamed from: U0 */
    public static boolean m82539U0(@C0359n0 View view) {
        return C18210k.m82742c(view);
    }

    /* renamed from: U1 */
    public static void m82540U1(@C0359n0 View view, @C0329d0 int i) {
        C18208i.m82733h(view, i);
    }

    /* renamed from: V */
    public static int m82541V(@C0359n0 View view) {
        return C18207h.m82709c(view);
    }

    /* renamed from: V0 */
    public static boolean m82542V0(@C0359n0 View view) {
        return C18210k.m82743d(view);
    }

    /* renamed from: V1 */
    public static void m82543V1(@C0359n0 View view, @C0363p0 Paint paint) {
        C18208i.m82734i(view, paint);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: W */
    public static int m82544W(@C0359n0 View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C18216p.m82787b(view);
        }
        return 0;
    }

    /* renamed from: W0 */
    public static boolean m82545W0(@C0359n0 View view) {
        return C18212m.m82765p(view);
    }

    @Deprecated
    /* renamed from: W1 */
    public static void m82546W1(View view, int i, Paint paint) {
        view.setLayerType(i, paint);
    }

    /* renamed from: X */
    public static int m82547X(@C0359n0 View view) {
        return C18208i.m82728c(view);
    }

    @Deprecated
    /* renamed from: X0 */
    public static boolean m82548X0(View view) {
        return view.isOpaque();
    }

    /* renamed from: X1 */
    public static void m82549X1(@C0359n0 View view, int i) {
        C18208i.m82735j(view, i);
    }

    @Deprecated
    /* renamed from: Y */
    public static int m82550Y(View view) {
        return view.getLayerType();
    }

    /* renamed from: Y0 */
    public static boolean m82551Y0(@C0359n0 View view) {
        return C18208i.m82732g(view);
    }

    /* renamed from: Y1 */
    public static void m82552Y1(@C0359n0 View view, boolean z) {
        C18212m.m82769t(view, z);
    }

    /* renamed from: Z */
    public static int m82553Z(@C0359n0 View view) {
        return C18208i.m82729d(view);
    }

    @C0341g1
    /* renamed from: Z0 */
    public static boolean m82554Z0(@C0359n0 View view) {
        Boolean f = m82470A1().mo52911f(view);
        if (f == null || !f.booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: Z1 */
    public static void m82555Z1(@C0359n0 View view, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            C18216p.m82799n(view, i);
        }
    }

    @C0363p0
    @Deprecated
    /* renamed from: a0 */
    public static Matrix m82557a0(View view) {
        return view.getMatrix();
    }

    @Deprecated
    /* renamed from: a1 */
    public static void m82558a1(View view) {
        view.jumpDrawablesToCurrentState();
    }

    /* renamed from: a2 */
    public static void m82559a2(@C0359n0 View view, @C0363p0 C18414x1 x1Var) {
        C18212m.m82770u(view, x1Var);
    }

    /* renamed from: b */
    public static C18205f<Boolean> m82560b() {
        return new C18203d(C16986a.C16991e.tag_accessibility_heading, Boolean.class, 28);
    }

    @Deprecated
    /* renamed from: b0 */
    public static int m82561b0(View view) {
        return view.getMeasuredHeightAndState();
    }

    @C0363p0
    /* renamed from: b1 */
    public static View m82562b1(@C0359n0 View view, @C0363p0 View view2, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C18216p.m82793h(view, view2, i);
        }
        return null;
    }

    /* renamed from: b2 */
    public static void m82563b2(@C0359n0 View view, @C0363p0 String[] strArr, @C0363p0 C18424y1 y1Var) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 31) {
            C18220t.m82819c(view, strArr, y1Var);
            return;
        }
        if (strArr == null || strArr.length == 0) {
            strArr = null;
        }
        boolean z2 = false;
        if (y1Var != null) {
            if (strArr != null) {
                z = true;
            } else {
                z = false;
            }
            C18001r.m81765b(z, "When the listener is set, MIME types must also be set");
        }
        if (strArr != null) {
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (strArr[i].startsWith("*")) {
                    z2 = true;
                    break;
                } else {
                    i++;
                }
            }
            C18001r.m81765b(!z2, "A MIME type set here must not start with *: " + Arrays.toString(strArr));
        }
        view.setTag(C16986a.C16991e.tag_on_receive_content_mime_types, strArr);
        view.setTag(C16986a.C16991e.tag_on_receive_content_listener, y1Var);
    }

    /* renamed from: c */
    public static int m82564c(@C0359n0 View view, @C0359n0 CharSequence charSequence, @C0359n0 C18098w0 w0Var) {
        int M = m82514M(view, charSequence);
        if (M != -1) {
            m82568d(view, new C18065l0.C18066a(M, charSequence, w0Var));
        }
        return M;
    }

    @Deprecated
    /* renamed from: c0 */
    public static int m82565c0(View view) {
        return view.getMeasuredState();
    }

    /* renamed from: c1 */
    public static /* synthetic */ C18274k m82566c1(C18274k kVar) {
        return kVar;
    }

    @Deprecated
    /* renamed from: c2 */
    public static void m82567c2(View view, int i) {
        view.setOverScrollMode(i);
    }

    /* renamed from: d */
    public static void m82568d(@C0359n0 View view, @C0359n0 C18065l0.C18066a aVar) {
        m82476C(view);
        m82630s1(aVar.mo52676b(), view);
        m82508K(view).add(aVar);
        m82570d1(view, 0);
    }

    @Deprecated
    /* renamed from: d0 */
    public static int m82569d0(View view) {
        return view.getMeasuredWidthAndState();
    }

    @C0376v0(19)
    /* renamed from: d1 */
    public static void m82570d1(View view, int i) {
        boolean z;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            if (m82504J(view) == null || !view.isShown() || view.getWindowVisibility() != 0) {
                z = false;
            } else {
                z = true;
            }
            int i2 = 32;
            if (m82496H(view) != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (!z) {
                    i2 = 2048;
                }
                obtain.setEventType(i2);
                C18210k.m82746g(obtain, i);
                if (z) {
                    obtain.getText().add(m82504J(view));
                    m82651x2(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                C18210k.m82746g(obtain2, i);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(m82504J(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    C18210k.m82744e(view.getParent(), view, view, i);
                } catch (AbstractMethodError unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(view.getParent().getClass().getSimpleName());
                    sb.append(" does not fully implement ViewParent");
                }
            }
        }
    }

    /* renamed from: d2 */
    public static void m82571d2(@C0359n0 View view, @C0372t0 int i, @C0372t0 int i2, @C0372t0 int i3, @C0372t0 int i4) {
        C18208i.m82736k(view, i, i2, i3, i4);
    }

    /* renamed from: e */
    public static void m82572e(@C0359n0 View view, @C0359n0 Collection<View> collection, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            C18216p.m82786a(view, collection, i);
        }
    }

    /* renamed from: e0 */
    public static int m82573e0(@C0359n0 View view) {
        return C18207h.m82710d(view);
    }

    /* renamed from: e1 */
    public static void m82574e1(@C0359n0 View view, int i) {
        view.offsetLeftAndRight(i);
    }

    @Deprecated
    /* renamed from: e2 */
    public static void m82575e2(View view, float f) {
        view.setPivotX(f);
    }

    /* renamed from: f */
    public static void m82576f(@C0359n0 View view, @C0359n0 C18226z zVar) {
        if (Build.VERSION.SDK_INT >= 28) {
            C18217q.m82801a(view, zVar);
            return;
        }
        int i = C16986a.C16991e.tag_unhandled_key_listeners;
        ArrayList arrayList = (ArrayList) view.getTag(i);
        if (arrayList == null) {
            arrayList = new ArrayList();
            view.setTag(i, arrayList);
        }
        arrayList.add(zVar);
        if (arrayList.size() == 1) {
            C18202c0.m82679h(view);
        }
    }

    /* renamed from: f0 */
    public static int m82577f0(@C0359n0 View view) {
        return C18207h.m82711e(view);
    }

    /* renamed from: f1 */
    public static void m82578f1(@C0359n0 View view, int i) {
        view.offsetTopAndBottom(i);
    }

    @Deprecated
    /* renamed from: f2 */
    public static void m82579f2(View view, float f) {
        view.setPivotY(f);
    }

    @C0359n0
    /* renamed from: g */
    public static C18402w3 m82580g(@C0359n0 View view) {
        if (f46817Q == null) {
            f46817Q = new WeakHashMap<>();
        }
        C18402w3 w3Var = f46817Q.get(view);
        if (w3Var != null) {
            return w3Var;
        }
        C18402w3 w3Var2 = new C18402w3(view);
        f46817Q.put(view, w3Var2);
        return w3Var2;
    }

    /* renamed from: g0 */
    public static int m82581g0(@C0359n0 View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C18216p.m82788c(view);
        }
        return -1;
    }

    @C0359n0
    /* renamed from: g1 */
    public static C18436z4 m82582g1(@C0359n0 View view, @C0359n0 C18436z4 z4Var) {
        WindowInsets J = z4Var.mo53129J();
        if (J != null) {
            WindowInsets b = C18211l.m82748b(view, J);
            if (!b.equals(J)) {
                return C18436z4.m83375L(b, view);
            }
        }
        return z4Var;
    }

    /* renamed from: g2 */
    public static void m82583g2(@C0359n0 View view, @C0363p0 C18124b2 b2Var) {
        Object obj;
        if (b2Var != null) {
            obj = b2Var.mo52794b();
        } else {
            obj = null;
        }
        C18215o.m82783d(view, (PointerIcon) obj);
    }

    /* renamed from: h */
    public static void m82584h() {
        Class<View> cls = View.class;
        try {
            f46813M = cls.getDeclaredMethod("dispatchStartTemporaryDetach", new Class[0]);
            f46814N = cls.getDeclaredMethod("dispatchFinishTemporaryDetach", new Class[0]);
        } catch (NoSuchMethodException unused) {
        }
        f46815O = true;
    }

    @C0363p0
    /* renamed from: h0 */
    public static String[] m82585h0(@C0359n0 View view) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C18220t.m82817a(view);
        }
        return (String[]) view.getTag(C16986a.C16991e.tag_on_receive_content_mime_types);
    }

    @Deprecated
    /* renamed from: h1 */
    public static void m82586h1(View view, AccessibilityEvent accessibilityEvent) {
        view.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    @Deprecated
    /* renamed from: h2 */
    public static void m82587h2(View view, float f) {
        view.setRotation(f);
    }

    @Deprecated
    /* renamed from: i */
    public static boolean m82588i(View view, int i) {
        return view.canScrollHorizontally(i);
    }

    @Deprecated
    /* renamed from: i0 */
    public static int m82589i0(View view) {
        return view.getOverScrollMode();
    }

    /* renamed from: i1 */
    public static void m82590i1(@C0359n0 View view, @C0359n0 C18065l0 l0Var) {
        view.onInitializeAccessibilityNodeInfo(l0Var.mo52601b2());
    }

    @Deprecated
    /* renamed from: i2 */
    public static void m82591i2(View view, float f) {
        view.setRotationX(f);
    }

    @Deprecated
    /* renamed from: j */
    public static boolean m82592j(View view, int i) {
        return view.canScrollVertically(i);
    }

    @C0372t0
    /* renamed from: j0 */
    public static int m82593j0(@C0359n0 View view) {
        return C18208i.m82730e(view);
    }

    @Deprecated
    /* renamed from: j1 */
    public static void m82594j1(View view, AccessibilityEvent accessibilityEvent) {
        view.onPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Deprecated
    /* renamed from: j2 */
    public static void m82595j2(View view, float f) {
        view.setRotationY(f);
    }

    /* renamed from: k */
    public static void m82596k(@C0359n0 View view) {
        C18215o.m82780a(view);
    }

    @C0372t0
    /* renamed from: k0 */
    public static int m82597k0(@C0359n0 View view) {
        return C18208i.m82731f(view);
    }

    /* renamed from: k1 */
    public static C18205f<CharSequence> m82598k1() {
        return new C18199b(C16986a.C16991e.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    @Deprecated
    /* renamed from: k2 */
    public static void m82599k2(View view, boolean z) {
        view.setSaveFromParentEnabled(z);
    }

    @Deprecated
    /* renamed from: l */
    public static int m82600l(int i, int i2) {
        return View.combineMeasuredStates(i, i2);
    }

    @C0363p0
    /* renamed from: l0 */
    public static ViewParent m82601l0(@C0359n0 View view) {
        return C18207h.m82712f(view);
    }

    /* renamed from: l1 */
    public static boolean m82602l1(@C0359n0 View view, int i, @C0363p0 Bundle bundle) {
        return C18207h.m82716j(view, i, bundle);
    }

    @Deprecated
    /* renamed from: l2 */
    public static void m82603l2(View view, float f) {
        view.setScaleX(f);
    }

    /* renamed from: m */
    public static void m82604m(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            m82503I2(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m82503I2((View) parent);
            }
        }
    }

    @Deprecated
    /* renamed from: m0 */
    public static float m82605m0(View view) {
        return view.getPivotX();
    }

    @C0363p0
    /* renamed from: m1 */
    public static C18274k m82606m1(@C0359n0 View view, @C0359n0 C18274k kVar) {
        if (Log.isLoggable(f46825a, 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("performReceiveContent: ");
            sb.append(kVar);
            sb.append(", view=");
            sb.append(view.getClass().getSimpleName());
            sb.append("[");
            sb.append(view.getId());
            sb.append("]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return C18220t.m82818b(view, kVar);
        }
        C18424y1 y1Var = (C18424y1) view.getTag(C16986a.C16991e.tag_on_receive_content_listener);
        if (y1Var == null) {
            return m82535T(view).mo2618a(kVar);
        }
        C18274k a = y1Var.mo53098a(view, kVar);
        if (a == null) {
            return null;
        }
        return m82535T(view).mo2618a(a);
    }

    @Deprecated
    /* renamed from: m2 */
    public static void m82607m2(View view, float f) {
        view.setScaleY(f);
    }

    /* renamed from: n */
    public static void m82608n(View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            m82503I2(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m82503I2((View) parent);
            }
        }
    }

    @Deprecated
    /* renamed from: n0 */
    public static float m82609n0(View view) {
        return view.getPivotY();
    }

    /* renamed from: n1 */
    public static void m82610n1(@C0359n0 View view) {
        C18207h.m82717k(view);
    }

    @C0341g1
    /* renamed from: n2 */
    public static void m82611n2(@C0359n0 View view, boolean z) {
        m82470A1().mo52912g(view, Boolean.valueOf(z));
    }

    @C0359n0
    /* renamed from: o */
    public static C18436z4 m82612o(@C0359n0 View view, @C0359n0 C18436z4 z4Var, @C0359n0 Rect rect) {
        return C18212m.m82751b(view, z4Var, rect);
    }

    @C0363p0
    /* renamed from: o0 */
    public static C18436z4 m82613o0(@C0359n0 View view) {
        return C18214n.m82776a(view);
    }

    /* renamed from: o1 */
    public static void m82614o1(@C0359n0 View view, int i, int i2, int i3, int i4) {
        C18207h.m82718l(view, i, i2, i3, i4);
    }

    /* renamed from: o2 */
    public static void m82615o2(@C0359n0 View view, int i) {
        C18214n.m82778c(view, i);
    }

    @C0359n0
    /* renamed from: p */
    public static C18436z4 m82616p(@C0359n0 View view, @C0359n0 C18436z4 z4Var) {
        WindowInsets J = z4Var.mo53129J();
        if (J != null) {
            WindowInsets a = C18211l.m82747a(view, J);
            if (!a.equals(J)) {
                return C18436z4.m83375L(a, view);
            }
        }
        return z4Var;
    }

    @Deprecated
    /* renamed from: p0 */
    public static float m82617p0(View view) {
        return view.getRotation();
    }

    /* renamed from: p1 */
    public static void m82618p1(@C0359n0 View view, @C0359n0 Runnable runnable) {
        C18207h.m82719m(view, runnable);
    }

    /* renamed from: p2 */
    public static void m82619p2(@C0359n0 View view, int i, int i2) {
        C18214n.m82779d(view, i, i2);
    }

    /* renamed from: q */
    public static void m82620q(@C0359n0 View view) {
        C18215o.m82781b(view);
    }

    @Deprecated
    /* renamed from: q0 */
    public static float m82621q0(View view) {
        return view.getRotationX();
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: q1 */
    public static void m82622q1(@C0359n0 View view, @C0359n0 Runnable runnable, long j) {
        C18207h.m82720n(view, runnable, j);
    }

    @C0341g1
    /* renamed from: q2 */
    public static void m82623q2(@C0359n0 View view, @C0363p0 CharSequence charSequence) {
        m82491F2().mo52912g(view, charSequence);
    }

    /* renamed from: r */
    public static boolean m82624r(@C0359n0 View view, float f, float f2, boolean z) {
        return C18212m.m82752c(view, f, f2, z);
    }

    @Deprecated
    /* renamed from: r0 */
    public static float m82625r0(View view) {
        return view.getRotationY();
    }

    /* renamed from: r1 */
    public static void m82626r1(@C0359n0 View view, int i) {
        m82630s1(i, view);
        m82570d1(view, 0);
    }

    /* renamed from: r2 */
    public static void m82627r2(@C0359n0 View view, @C0359n0 List<Rect> list) {
        if (Build.VERSION.SDK_INT >= 29) {
            C18218r.m82813d(view, list);
        }
    }

    /* renamed from: s */
    public static boolean m82628s(@C0359n0 View view, float f, float f2) {
        return C18212m.m82753d(view, f, f2);
    }

    @Deprecated
    /* renamed from: s0 */
    public static float m82629s0(View view) {
        return view.getScaleX();
    }

    /* renamed from: s1 */
    public static void m82630s1(int i, View view) {
        List<C18065l0.C18066a> K = m82508K(view);
        for (int i2 = 0; i2 < K.size(); i2++) {
            if (K.get(i2).mo52676b() == i) {
                K.remove(i2);
                return;
            }
        }
    }

    /* renamed from: s2 */
    public static void m82631s2(@C0359n0 View view, @C0363p0 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            C18216p.m82800o(view, charSequence);
        }
    }

    /* renamed from: t */
    public static boolean m82632t(@C0359n0 View view, int i, int i2, @C0363p0 int[] iArr, @C0363p0 int[] iArr2) {
        return C18212m.m82754e(view, i, i2, iArr, iArr2);
    }

    @Deprecated
    /* renamed from: t0 */
    public static float m82633t0(View view) {
        return view.getScaleY();
    }

    /* renamed from: t1 */
    public static void m82634t1(@C0359n0 View view, @C0359n0 C18226z zVar) {
        if (Build.VERSION.SDK_INT >= 28) {
            C18217q.m82805e(view, zVar);
            return;
        }
        ArrayList arrayList = (ArrayList) view.getTag(C16986a.C16991e.tag_unhandled_key_listeners);
        if (arrayList != null) {
            arrayList.remove(zVar);
            if (arrayList.size() == 0) {
                C18202c0.m82680i(view);
            }
        }
    }

    /* renamed from: t2 */
    public static void m82635t2(@C0359n0 View view, @C0363p0 String str) {
        C18212m.m82771v(view, str);
    }

    /* renamed from: u */
    public static boolean m82636u(@C0359n0 View view, int i, int i2, @C0363p0 int[] iArr, @C0363p0 int[] iArr2, int i3) {
        if (view instanceof C18336p1) {
            return ((C18336p1) view).mo52995f(i, i2, iArr, iArr2, i3);
        }
        if (i3 == 0) {
            return m82632t(view, i, i2, iArr, iArr2);
        }
        return false;
    }

    /* renamed from: u0 */
    public static int m82637u0(@C0359n0 View view) {
        return C18214n.m82777b(view);
    }

    /* renamed from: u1 */
    public static void m82638u1(@C0359n0 View view, @C0359n0 C18065l0.C18066a aVar, @C0363p0 CharSequence charSequence, @C0363p0 C18098w0 w0Var) {
        if (w0Var == null && charSequence == null) {
            m82626r1(view, aVar.mo52676b());
        } else {
            m82568d(view, aVar.mo52675a(charSequence, w0Var));
        }
    }

    @Deprecated
    /* renamed from: u2 */
    public static void m82639u2(View view, float f) {
        view.setTranslationX(f);
    }

    /* renamed from: v */
    public static void m82640v(@C0359n0 View view, int i, int i2, int i3, int i4, @C0363p0 int[] iArr, int i5, @C0359n0 int[] iArr2) {
        View view2 = view;
        if (view2 instanceof C18346q1) {
            ((C18346q1) view2).mo52998a(i, i2, i3, i4, iArr, i5, iArr2);
        } else {
            m82648x(view, i, i2, i3, i4, iArr, i5);
        }
    }

    @C0363p0
    @C0341g1
    /* renamed from: v0 */
    public static CharSequence m82641v0(@C0359n0 View view) {
        return m82491F2().mo52911f(view);
    }

    /* renamed from: v1 */
    public static void m82642v1(@C0359n0 View view) {
        C18211l.m82749c(view);
    }

    @Deprecated
    /* renamed from: v2 */
    public static void m82643v2(View view, float f) {
        view.setTranslationY(f);
    }

    /* renamed from: w */
    public static boolean m82644w(@C0359n0 View view, int i, int i2, int i3, int i4, @C0363p0 int[] iArr) {
        return C18212m.m82755f(view, i, i2, i3, i4, iArr);
    }

    @C0359n0
    /* renamed from: w0 */
    public static List<Rect> m82645w0(@C0359n0 View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C18218r.m82811b(view);
        }
        return Collections.emptyList();
    }

    @C0359n0
    /* renamed from: w1 */
    public static <T extends View> T m82646w1(@C0359n0 View view, @C0329d0 int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (View) C18217q.m82806f(view, i);
        }
        T findViewById = view.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this View");
    }

    /* renamed from: w2 */
    public static void m82647w2(@C0359n0 View view, float f) {
        C18212m.m82772w(view, f);
    }

    /* renamed from: x */
    public static boolean m82648x(@C0359n0 View view, int i, int i2, int i3, int i4, @C0363p0 int[] iArr, int i5) {
        if (view instanceof C18336p1) {
            return ((C18336p1) view).mo52994e(i, i2, i3, i4, iArr, i5);
        }
        if (i5 == 0) {
            return m82644w(view, i, i2, i3, i4, iArr);
        }
        return false;
    }

    @C0363p0
    /* renamed from: x0 */
    public static String m82649x0(@C0359n0 View view) {
        return C18212m.m82760k(view);
    }

    @Deprecated
    /* renamed from: x1 */
    public static int m82650x1(int i, int i2, int i3) {
        return View.resolveSizeAndState(i, i2, i3);
    }

    /* renamed from: x2 */
    public static void m82651x2(View view) {
        if (m82541V(view) == 0) {
            m82531R1(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (m82541V((View) parent) == 4) {
                m82531R1(view, 2);
                return;
            }
        }
    }

    /* renamed from: y */
    public static void m82652y(@C0359n0 View view) {
        C18215o.m82782c(view);
    }

    @Deprecated
    /* renamed from: y0 */
    public static float m82653y0(View view) {
        return view.getTranslationX();
    }

    /* renamed from: y1 */
    public static boolean m82654y1(@C0359n0 View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C18216p.m82794i(view);
        }
        return view.requestFocus();
    }

    /* renamed from: y2 */
    public static void m82655y2(@C0359n0 View view, @C0363p0 C18147d4.C18149b bVar) {
        C18147d4.m82331h(view, bVar);
    }

    @C0341g1
    /* renamed from: z */
    public static boolean m82656z(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C18202c0.m82678a(view).mo52891b(view, keyEvent);
    }

    @Deprecated
    /* renamed from: z0 */
    public static float m82657z0(View view) {
        return view.getTranslationY();
    }

    /* renamed from: z1 */
    public static void m82658z1(@C0359n0 View view, @SuppressLint({"ContextFirst"}) @C0359n0 Context context, @C0359n0 int[] iArr, @C0363p0 AttributeSet attributeSet, @C0359n0 TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            C18218r.m82812c(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    @Deprecated
    /* renamed from: z2 */
    public static void m82659z2(View view, float f) {
        view.setX(f);
    }
}

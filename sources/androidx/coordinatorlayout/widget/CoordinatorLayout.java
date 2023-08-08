package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.annotation.C0329d0;
import androidx.annotation.C0336f;
import androidx.annotation.C0344h1;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0375v;
import androidx.annotation.C0379x;
import androidx.annotation.RestrictTo;
import androidx.coordinatorlayout.C16963a;
import androidx.core.content.C17318d;
import androidx.core.graphics.drawable.C17549d;
import androidx.core.util.C17992m;
import androidx.core.util.C17997q;
import androidx.core.view.C18196h2;
import androidx.core.view.C18306m0;
import androidx.core.view.C18373t1;
import androidx.core.view.C18384u1;
import androidx.core.view.C18400w1;
import androidx.core.view.C18414x1;
import androidx.core.view.C18436z4;
import androidx.customview.view.AbsSavedState;
import com.google.maps.android.heatmaps.C33876b;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoordinatorLayout extends ViewGroup implements C18373t1, C18384u1 {

    /* renamed from: M0 */
    public static final String f44861M0 = "CoordinatorLayout";

    /* renamed from: N0 */
    public static final String f44862N0;

    /* renamed from: O0 */
    public static final int f44863O0 = 0;

    /* renamed from: P0 */
    public static final int f44864P0 = 1;

    /* renamed from: Q0 */
    public static final Class<?>[] f44865Q0 = {Context.class, AttributeSet.class};

    /* renamed from: R0 */
    public static final ThreadLocal<Map<String, Constructor<C16977c>>> f44866R0 = new ThreadLocal<>();

    /* renamed from: S0 */
    public static final int f44867S0 = 0;

    /* renamed from: T0 */
    public static final int f44868T0 = 1;

    /* renamed from: U0 */
    public static final int f44869U0 = 2;

    /* renamed from: V0 */
    public static final Comparator<View> f44870V0 = new C16983i();

    /* renamed from: W0 */
    public static final C17997q.C17998a<Rect> f44871W0 = new C17997q.C18000c(12);

    /* renamed from: E0 */
    public C16982h f44872E0;

    /* renamed from: F0 */
    public boolean f44873F0;

    /* renamed from: G0 */
    public C18436z4 f44874G0;

    /* renamed from: H0 */
    public boolean f44875H0;

    /* renamed from: I0 */
    public Drawable f44876I0;

    /* renamed from: J0 */
    public ViewGroup.OnHierarchyChangeListener f44877J0;

    /* renamed from: K0 */
    public C18414x1 f44878K0;

    /* renamed from: L0 */
    public final C18400w1 f44879L0;

    /* renamed from: a */
    public final List<View> f44880a;

    /* renamed from: b */
    public final C16984a<View> f44881b;

    /* renamed from: c */
    public final List<View> f44882c;

    /* renamed from: d */
    public final List<View> f44883d;

    /* renamed from: e */
    public Paint f44884e;

    /* renamed from: f */
    public final int[] f44885f;

    /* renamed from: g */
    public final int[] f44886g;

    /* renamed from: v */
    public boolean f44887v;

    /* renamed from: w */
    public boolean f44888w;

    /* renamed from: x */
    public int[] f44889x;

    /* renamed from: y */
    public View f44890y;

    /* renamed from: z */
    public View f44891z;

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$a */
    public class C16975a implements C18414x1 {
        public C16975a() {
        }

        /* renamed from: a */
        public C18436z4 mo1193a(View view, C18436z4 z4Var) {
            return CoordinatorLayout.this.mo51021b0(z4Var);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$b */
    public interface C16976b {
        @C0359n0
        C16977c getBehavior();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$c */
    public static abstract class C16977c<V extends View> {
        public C16977c() {
        }

        /* renamed from: F */
        public static void m78614F(@C0359n0 View view, @C0363p0 Object obj) {
            ((C16981g) view.getLayoutParams()).f44912r = obj;
        }

        @C0363p0
        /* renamed from: e */
        public static Object m78615e(@C0359n0 View view) {
            return ((C16981g) view.getLayoutParams()).f44912r;
        }

        @Deprecated
        /* renamed from: A */
        public boolean mo51073A(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 V v, @C0359n0 View view, @C0359n0 View view2, int i) {
            return false;
        }

        /* renamed from: B */
        public boolean mo51074B(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 V v, @C0359n0 View view, @C0359n0 View view2, int i, int i2) {
            if (i2 == 0) {
                return mo51073A(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        @Deprecated
        /* renamed from: C */
        public void mo51075C(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 V v, @C0359n0 View view) {
        }

        /* renamed from: D */
        public void mo51076D(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 V v, @C0359n0 View view, int i) {
            if (i == 0) {
                mo51075C(coordinatorLayout, v, view);
            }
        }

        /* renamed from: E */
        public boolean mo51077E(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 V v, @C0359n0 MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: a */
        public boolean mo51078a(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 V v) {
            return mo51081d(coordinatorLayout, v) > 0.0f;
        }

        /* renamed from: b */
        public boolean mo51079b(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 V v, @C0359n0 Rect rect) {
            return false;
        }

        @C0354l
        /* renamed from: c */
        public int mo51080c(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 V v) {
            return -16777216;
        }

        @C0379x(from = 0.0d, mo1016to = 1.0d)
        /* renamed from: d */
        public float mo51081d(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 V v) {
            return 0.0f;
        }

        /* renamed from: f */
        public boolean mo51082f(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 V v, @C0359n0 View view) {
            return false;
        }

        @C0359n0
        /* renamed from: g */
        public C18436z4 mo51083g(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 V v, @C0359n0 C18436z4 z4Var) {
            return z4Var;
        }

        /* renamed from: h */
        public void mo51084h(@C0359n0 C16981g gVar) {
        }

        /* renamed from: i */
        public boolean mo51085i(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 V v, @C0359n0 View view) {
            return false;
        }

        /* renamed from: j */
        public void mo51086j(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 V v, @C0359n0 View view) {
        }

        /* renamed from: k */
        public void mo51087k() {
        }

        /* renamed from: l */
        public boolean mo51088l(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 V v, @C0359n0 MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: m */
        public boolean mo51089m(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 V v, int i) {
            return false;
        }

        /* renamed from: n */
        public boolean mo51090n(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 V v, int i, int i2, int i3, int i4) {
            return false;
        }

        /* renamed from: o */
        public boolean mo51091o(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 V v, @C0359n0 View view, float f, float f2, boolean z) {
            return false;
        }

        /* renamed from: p */
        public boolean mo51092p(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 V v, @C0359n0 View view, float f, float f2) {
            return false;
        }

        @Deprecated
        /* renamed from: q */
        public void mo51093q(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 V v, @C0359n0 View view, int i, int i2, @C0359n0 int[] iArr) {
        }

        /* renamed from: r */
        public void mo51094r(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 V v, @C0359n0 View view, int i, int i2, @C0359n0 int[] iArr, int i3) {
            if (i3 == 0) {
                mo51093q(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        @Deprecated
        /* renamed from: s */
        public void mo51095s(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 V v, @C0359n0 View view, int i, int i2, int i3, int i4) {
        }

        @Deprecated
        /* renamed from: t */
        public void mo51096t(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 V v, @C0359n0 View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                mo51095s(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        /* renamed from: u */
        public void mo51097u(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 V v, @C0359n0 View view, int i, int i2, int i3, int i4, int i5, @C0359n0 int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            mo51096t(coordinatorLayout, v, view, i, i2, i3, i4, i5);
        }

        @Deprecated
        /* renamed from: v */
        public void mo51098v(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 V v, @C0359n0 View view, @C0359n0 View view2, int i) {
        }

        /* renamed from: w */
        public void mo51099w(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 V v, @C0359n0 View view, @C0359n0 View view2, int i, int i2) {
            if (i2 == 0) {
                mo51098v(coordinatorLayout, v, view, view2, i);
            }
        }

        /* renamed from: x */
        public boolean mo51100x(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 V v, @C0359n0 Rect rect, boolean z) {
            return false;
        }

        /* renamed from: y */
        public void mo51101y(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 V v, @C0359n0 Parcelable parcelable) {
        }

        @C0363p0
        /* renamed from: z */
        public Parcelable mo51102z(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public C16977c(Context context, AttributeSet attributeSet) {
        }
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$d */
    public @interface C16978d {
        Class<? extends C16977c> value();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$e */
    public @interface C16979e {
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$f */
    public class C16980f implements ViewGroup.OnHierarchyChangeListener {
        public C16980f() {
        }

        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f44877J0;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.mo51011M(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f44877J0;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h */
    public class C16982h implements ViewTreeObserver.OnPreDrawListener {
        public C16982h() {
        }

        public boolean onPreDraw() {
            CoordinatorLayout.this.mo51011M(0);
            return true;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$i */
    public static class C16983i implements Comparator<View> {
        /* renamed from: a */
        public int compare(View view, View view2) {
            float F0 = C18196h2.m82489F0(view);
            float F02 = C18196h2.m82489F0(view2);
            if (F0 > F02) {
                return -1;
            }
            if (F0 < F02) {
                return 1;
            }
            return 0;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.coordinatorlayout.widget.CoordinatorLayout> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.class
            java.lang.Package r0 = r0.getPackage()
            if (r0 == 0) goto L_0x000d
            java.lang.String r0 = r0.getName()
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            f44862N0 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$i r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$i
            r0.<init>()
            f44870V0 = r0
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            r1 = 1
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r0[r1] = r2
            f44865Q0 = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            f44866R0 = r0
            androidx.core.util.q$c r0 = new androidx.core.util.q$c
            r1 = 12
            r0.<init>(r1)
            f44871W0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.<clinit>():void");
    }

    public CoordinatorLayout(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: P */
    public static C16977c m78559P(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f44862N0;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<C16977c>>> threadLocal = f44866R0;
            Map map = threadLocal.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f44865Q0);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (C16977c) constructor.newInstance(new Object[]{context, attributeSet});
        } catch (Exception e) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e);
        }
    }

    /* renamed from: T */
    public static void m78560T(@C0359n0 Rect rect) {
        rect.setEmpty();
        f44871W0.mo52468a(rect);
    }

    /* renamed from: W */
    public static int m78561W(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    /* renamed from: X */
    public static int m78562X(int i) {
        if ((i & 7) == 0) {
            i |= C18306m0.f46960b;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    /* renamed from: Y */
    public static int m78563Y(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    @C0359n0
    /* renamed from: e */
    public static Rect m78564e() {
        Rect b = f44871W0.mo52469b();
        if (b == null) {
            return new Rect();
        }
        return b;
    }

    /* renamed from: g */
    public static int m78565g(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* renamed from: A */
    public final void mo50999A(View view, int i, Rect rect, Rect rect2, C16981g gVar, int i2, int i3) {
        int i4;
        int i5;
        int d = C18306m0.m82991d(m78561W(gVar.f44897c), i);
        int d2 = C18306m0.m82991d(m78562X(gVar.f44898d), i);
        int i6 = d & 7;
        int i7 = d & 112;
        int i8 = d2 & 7;
        int i9 = d2 & 112;
        if (i8 == 1) {
            i4 = rect.left + (rect.width() / 2);
        } else if (i8 != 5) {
            i4 = rect.left;
        } else {
            i4 = rect.right;
        }
        if (i9 == 16) {
            i5 = rect.top + (rect.height() / 2);
        } else if (i9 != 80) {
            i5 = rect.top;
        } else {
            i5 = rect.bottom;
        }
        if (i6 == 1) {
            i4 -= i2 / 2;
        } else if (i6 != 5) {
            i4 -= i2;
        }
        if (i7 == 16) {
            i5 -= i3 / 2;
        } else if (i7 != 80) {
            i5 -= i3;
        }
        rect2.set(i4, i5, i2 + i4, i3 + i5);
    }

    /* renamed from: B */
    public final int mo51000B(int i) {
        int[] iArr = this.f44889x;
        if (iArr == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i);
            return 0;
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Keyline index ");
            sb2.append(i);
            sb2.append(" out of range for ");
            sb2.append(this);
            return 0;
        }
    }

    /* renamed from: C */
    public void mo51001C(View view, Rect rect) {
        rect.set(((C16981g) view.getLayoutParams()).mo51113h());
    }

    /* renamed from: D */
    public C16981g mo51002D(View view) {
        C16981g gVar = (C16981g) view.getLayoutParams();
        if (!gVar.f44896b) {
            if (view instanceof C16976b) {
                gVar.mo51122q(((C16976b) view).getBehavior());
                gVar.f44896b = true;
            } else {
                C16978d dVar = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (C16978d) cls.getAnnotation(C16978d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        gVar.mo51122q((C16977c) dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception unused) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Default behavior class ");
                        sb.append(dVar.value().getName());
                        sb.append(" could not be instantiated. Did you forget a default constructor?");
                    }
                }
                gVar.f44896b = true;
            }
        }
        return gVar;
    }

    /* renamed from: E */
    public final void mo51003E(List<View> list) {
        int i;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            if (isChildrenDrawingOrderEnabled) {
                i = getChildDrawingOrder(childCount, i2);
            } else {
                i = i2;
            }
            list.add(getChildAt(i));
        }
        Comparator<View> comparator = f44870V0;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    /* renamed from: F */
    public final boolean mo51004F(View view) {
        return this.f44881b.mo51140j(view);
    }

    /* renamed from: G */
    public boolean mo51005G(@C0359n0 View view, int i, int i2) {
        Rect e = m78564e();
        mo51064y(view, e);
        try {
            return e.contains(i, i2);
        } finally {
            m78560T(e);
        }
    }

    /* renamed from: H */
    public final void mo51006H(View view, int i) {
        C16981g gVar = (C16981g) view.getLayoutParams();
        Rect e = m78564e();
        e.set(getPaddingLeft() + gVar.leftMargin, getPaddingTop() + gVar.topMargin, (getWidth() - getPaddingRight()) - gVar.rightMargin, (getHeight() - getPaddingBottom()) - gVar.bottomMargin);
        if (this.f44874G0 != null && C18196h2.m82538U(this) && !C18196h2.m82538U(view)) {
            e.left += this.f44874G0.mo53147p();
            e.top += this.f44874G0.mo53149r();
            e.right -= this.f44874G0.mo53148q();
            e.bottom -= this.f44874G0.mo53146o();
        }
        Rect e2 = m78564e();
        C18306m0.m82989b(m78562X(gVar.f44897c), view.getMeasuredWidth(), view.getMeasuredHeight(), e, e2, i);
        view.layout(e2.left, e2.top, e2.right, e2.bottom);
        m78560T(e);
        m78560T(e2);
    }

    /* renamed from: I */
    public final void mo51007I(View view, View view2, int i) {
        Rect e = m78564e();
        Rect e2 = m78564e();
        try {
            mo51064y(view2, e);
            mo51065z(view, i, e, e2);
            view.layout(e2.left, e2.top, e2.right, e2.bottom);
        } finally {
            m78560T(e);
            m78560T(e2);
        }
    }

    /* renamed from: J */
    public final void mo51008J(View view, int i, int i2) {
        C16981g gVar = (C16981g) view.getLayoutParams();
        int d = C18306m0.m82991d(m78563Y(gVar.f44897c), i2);
        int i3 = d & 7;
        int i4 = d & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int B = mo51000B(i) - measuredWidth;
        if (i3 == 1) {
            B += measuredWidth / 2;
        } else if (i3 == 5) {
            B += measuredWidth;
        }
        int i5 = 0;
        if (i4 == 16) {
            i5 = 0 + (measuredHeight / 2);
        } else if (i4 == 80) {
            i5 = measuredHeight + 0;
        }
        int max = Math.max(getPaddingLeft() + gVar.leftMargin, Math.min(B, ((width - getPaddingRight()) - measuredWidth) - gVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + gVar.topMargin, Math.min(i5, ((height - getPaddingBottom()) - measuredHeight) - gVar.bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    /* renamed from: K */
    public final void mo51009K(View view, Rect rect, int i) {
        boolean z;
        boolean z2;
        int width;
        int i2;
        int i3;
        int i4;
        int height;
        int i5;
        int i6;
        int i7;
        if (C18196h2.m82539U0(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            C16981g gVar = (C16981g) view.getLayoutParams();
            C16977c f = gVar.mo51111f();
            Rect e = m78564e();
            Rect e2 = m78564e();
            e2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (f == null || !f.mo51079b(this, view, e)) {
                e.set(e2);
            } else if (!e2.contains(e)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + e.toShortString() + " | Bounds:" + e2.toShortString());
            }
            m78560T(e2);
            if (e.isEmpty()) {
                m78560T(e);
                return;
            }
            int d = C18306m0.m82991d(gVar.f44902h, i);
            boolean z3 = true;
            if ((d & 48) != 48 || (i6 = (e.top - gVar.topMargin) - gVar.f44904j) >= (i7 = rect.top)) {
                z = false;
            } else {
                mo51020a0(view, i7 - i6);
                z = true;
            }
            if ((d & 80) == 80 && (height = ((getHeight() - e.bottom) - gVar.bottomMargin) + gVar.f44904j) < (i5 = rect.bottom)) {
                mo51020a0(view, height - i5);
                z = true;
            }
            if (!z) {
                mo51020a0(view, 0);
            }
            if ((d & 3) != 3 || (i3 = (e.left - gVar.leftMargin) - gVar.f44903i) >= (i4 = rect.left)) {
                z2 = false;
            } else {
                mo51019Z(view, i4 - i3);
                z2 = true;
            }
            if ((d & 5) != 5 || (width = ((getWidth() - e.right) - gVar.rightMargin) + gVar.f44903i) >= (i2 = rect.right)) {
                z3 = z2;
            } else {
                mo51019Z(view, width - i2);
            }
            if (!z3) {
                mo51019Z(view, 0);
            }
            m78560T(e);
        }
    }

    /* renamed from: L */
    public void mo51010L(View view, int i) {
        C16977c f;
        View view2 = view;
        C16981g gVar = (C16981g) view.getLayoutParams();
        if (gVar.f44905k != null) {
            Rect e = m78564e();
            Rect e2 = m78564e();
            Rect e3 = m78564e();
            mo51064y(gVar.f44905k, e);
            boolean z = false;
            mo51060v(view2, false, e2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i2 = measuredHeight;
            mo50999A(view, i, e, e3, gVar, measuredWidth, measuredHeight);
            if (!(e3.left == e2.left && e3.top == e2.top)) {
                z = true;
            }
            mo51035h(gVar, e3, measuredWidth, i2);
            int i3 = e3.left - e2.left;
            int i4 = e3.top - e2.top;
            if (i3 != 0) {
                C18196h2.m82574e1(view2, i3);
            }
            if (i4 != 0) {
                C18196h2.m82578f1(view2, i4);
            }
            if (z && (f = gVar.mo51111f()) != null) {
                f.mo51085i(this, view2, gVar.f44905k);
            }
            m78560T(e);
            m78560T(e2);
            m78560T(e3);
        }
    }

    /* renamed from: M */
    public final void mo51011M(int i) {
        boolean z;
        int i2 = i;
        int Z = C18196h2.m82553Z(this);
        int size = this.f44880a.size();
        Rect e = m78564e();
        Rect e2 = m78564e();
        Rect e3 = m78564e();
        for (int i3 = 0; i3 < size; i3++) {
            View view = this.f44880a.get(i3);
            C16981g gVar = (C16981g) view.getLayoutParams();
            if (i2 != 0 || view.getVisibility() != 8) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (gVar.f44906l == this.f44880a.get(i4)) {
                        mo51010L(view, Z);
                    }
                }
                mo51060v(view, true, e2);
                if (gVar.f44901g != 0 && !e2.isEmpty()) {
                    int d = C18306m0.m82991d(gVar.f44901g, Z);
                    int i5 = d & 112;
                    if (i5 == 48) {
                        e.top = Math.max(e.top, e2.bottom);
                    } else if (i5 == 80) {
                        e.bottom = Math.max(e.bottom, getHeight() - e2.top);
                    }
                    int i6 = d & 7;
                    if (i6 == 3) {
                        e.left = Math.max(e.left, e2.right);
                    } else if (i6 == 5) {
                        e.right = Math.max(e.right, getWidth() - e2.left);
                    }
                }
                if (gVar.f44902h != 0 && view.getVisibility() == 0) {
                    mo51009K(view, e, Z);
                }
                if (i2 != 2) {
                    mo51001C(view, e3);
                    if (!e3.equals(e2)) {
                        mo51016S(view, e2);
                    }
                }
                for (int i7 = i3 + 1; i7 < size; i7++) {
                    View view2 = this.f44880a.get(i7);
                    C16981g gVar2 = (C16981g) view2.getLayoutParams();
                    C16977c f = gVar2.mo51111f();
                    if (f != null && f.mo51082f(this, view2, view)) {
                        if (i2 != 0 || !gVar2.mo51112g()) {
                            if (i2 != 2) {
                                z = f.mo51085i(this, view2, view);
                            } else {
                                f.mo51086j(this, view2, view);
                                z = true;
                            }
                            if (i2 == 1) {
                                gVar2.mo51123r(z);
                            }
                        } else {
                            gVar2.mo51117l();
                        }
                    }
                }
            }
        }
        m78560T(e);
        m78560T(e2);
        m78560T(e3);
    }

    /* renamed from: N */
    public void mo51012N(@C0359n0 View view, int i) {
        C16981g gVar = (C16981g) view.getLayoutParams();
        if (!gVar.mo51106a()) {
            View view2 = gVar.f44905k;
            if (view2 != null) {
                mo51007I(view, view2, i);
                return;
            }
            int i2 = gVar.f44899e;
            if (i2 >= 0) {
                mo51008J(view, i2, i);
            } else {
                mo51006H(view, i);
            }
        } else {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
    }

    /* renamed from: O */
    public void mo51013O(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* renamed from: Q */
    public final boolean mo51014Q(MotionEvent motionEvent, int i) {
        MotionEvent motionEvent2 = motionEvent;
        int i2 = i;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f44882c;
        mo51003E(list);
        int size = list.size();
        MotionEvent motionEvent3 = null;
        boolean z = false;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = list.get(i3);
            C16981g gVar = (C16981g) view.getLayoutParams();
            C16977c f = gVar.mo51111f();
            if ((!z && !z2) || actionMasked == 0) {
                if (!z && f != null) {
                    if (i2 == 0) {
                        z = f.mo51088l(this, view, motionEvent2);
                    } else if (i2 == 1) {
                        z = f.mo51077E(this, view, motionEvent2);
                    }
                    if (z) {
                        this.f44890y = view;
                    }
                }
                boolean c = gVar.mo51108c();
                boolean j = gVar.mo51115j(this, view);
                if (!j || c) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (j && !z2) {
                    break;
                }
            } else if (f != null) {
                if (motionEvent3 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i2 == 0) {
                    f.mo51088l(this, view, motionEvent3);
                } else if (i2 == 1) {
                    f.mo51077E(this, view, motionEvent3);
                }
            }
        }
        list.clear();
        return z;
    }

    /* renamed from: R */
    public final void mo51015R() {
        this.f44880a.clear();
        this.f44881b.mo51133c();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C16981g D = mo51002D(childAt);
            D.mo51109d(this, childAt);
            this.f44881b.mo51132b(childAt);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i2 != i) {
                    View childAt2 = getChildAt(i2);
                    if (D.mo51107b(this, childAt, childAt2)) {
                        if (!this.f44881b.mo51134d(childAt2)) {
                            this.f44881b.mo51132b(childAt2);
                        }
                        this.f44881b.mo51131a(childAt2, childAt);
                    }
                }
            }
        }
        this.f44880a.addAll(this.f44881b.mo51139i());
        Collections.reverse(this.f44880a);
    }

    /* renamed from: S */
    public void mo51016S(View view, Rect rect) {
        ((C16981g) view.getLayoutParams()).mo51124s(rect);
    }

    /* renamed from: U */
    public void mo51017U() {
        if (this.f44888w && this.f44872E0 != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f44872E0);
        }
        this.f44873F0 = false;
    }

    /* renamed from: V */
    public final void mo51018V(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C16977c f = ((C16981g) childAt.getLayoutParams()).mo51111f();
            if (f != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    f.mo51088l(this, childAt, obtain);
                } else {
                    f.mo51077E(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C16981g) getChildAt(i2).getLayoutParams()).mo51119n();
        }
        this.f44890y = null;
        this.f44887v = false;
    }

    /* renamed from: Z */
    public final void mo51019Z(View view, int i) {
        C16981g gVar = (C16981g) view.getLayoutParams();
        int i2 = gVar.f44903i;
        if (i2 != i) {
            C18196h2.m82574e1(view, i - i2);
            gVar.f44903i = i;
        }
    }

    /* renamed from: a0 */
    public final void mo51020a0(View view, int i) {
        C16981g gVar = (C16981g) view.getLayoutParams();
        int i2 = gVar.f44904j;
        if (i2 != i) {
            C18196h2.m82578f1(view, i - i2);
            gVar.f44904j = i;
        }
    }

    /* renamed from: b0 */
    public final C18436z4 mo51021b0(C18436z4 z4Var) {
        boolean z;
        if (C17992m.m81740a(this.f44874G0, z4Var)) {
            return z4Var;
        }
        this.f44874G0 = z4Var;
        boolean z2 = true;
        if (z4Var == null || z4Var.mo53149r() <= 0) {
            z = false;
        } else {
            z = true;
        }
        this.f44875H0 = z;
        if (z || getBackground() != null) {
            z2 = false;
        }
        setWillNotDraw(z2);
        C18436z4 i = mo51036i(z4Var);
        requestLayout();
        return i;
    }

    /* renamed from: c0 */
    public final void mo51022c0() {
        if (C18196h2.m82538U(this)) {
            if (this.f44878K0 == null) {
                this.f44878K0 = new C16975a();
            }
            C18196h2.m82559a2(this, this.f44878K0);
            setSystemUiVisibility(C33876b.f82189s);
            return;
        }
        C18196h2.m82559a2(this, (C18414x1) null);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C16981g) && super.checkLayoutParams(layoutParams);
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        C16981g gVar = (C16981g) view.getLayoutParams();
        C16977c cVar = gVar.f44895a;
        if (cVar != null) {
            float d = cVar.mo51081d(this, view);
            if (d > 0.0f) {
                if (this.f44884e == null) {
                    this.f44884e = new Paint();
                }
                this.f44884e.setColor(gVar.f44895a.mo51080c(this, view));
                this.f44884e.setAlpha(m78565g(Math.round(d * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.f44884e);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f44876I0;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* renamed from: f */
    public void mo51026f() {
        if (this.f44888w) {
            if (this.f44872E0 == null) {
                this.f44872E0 = new C16982h();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f44872E0);
        }
        this.f44873F0 = true;
    }

    @C0344h1
    public final List<View> getDependencySortedChildren() {
        mo51015R();
        return Collections.unmodifiableList(this.f44880a);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final C18436z4 getLastWindowInsets() {
        return this.f44874G0;
    }

    public int getNestedScrollAxes() {
        return this.f44879L0.mo53039a();
    }

    @C0363p0
    public Drawable getStatusBarBackground() {
        return this.f44876I0;
    }

    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    /* renamed from: h */
    public final void mo51035h(C16981g gVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + gVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - gVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + gVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - gVar.bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    /* renamed from: i */
    public final C18436z4 mo51036i(C18436z4 z4Var) {
        C16977c f;
        if (z4Var.mo53120A()) {
            return z4Var;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (C18196h2.m82538U(childAt) && (f = ((C16981g) childAt.getLayoutParams()).mo51111f()) != null) {
                z4Var = f.mo51083g(this, childAt, z4Var);
                if (z4Var.mo53120A()) {
                    break;
                }
            }
        }
        return z4Var;
    }

    /* renamed from: j */
    public void mo51037j(@C0359n0 View view) {
        List g = this.f44881b.mo51137g(view);
        if (g != null && !g.isEmpty()) {
            for (int i = 0; i < g.size(); i++) {
                View view2 = (View) g.get(i);
                C16977c f = ((C16981g) view2.getLayoutParams()).mo51111f();
                if (f != null) {
                    f.mo51085i(this, view2, view);
                }
            }
        }
    }

    /* renamed from: k */
    public boolean mo51038k(@C0359n0 View view, @C0359n0 View view2) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (view.getVisibility() != 0 || view2.getVisibility() != 0) {
            return false;
        }
        Rect e = m78564e();
        if (view.getParent() != this) {
            z = true;
        } else {
            z = false;
        }
        mo51060v(view, z, e);
        Rect e2 = m78564e();
        if (view2.getParent() != this) {
            z2 = true;
        } else {
            z2 = false;
        }
        mo51060v(view2, z2, e2);
        try {
            if (e.left <= e2.right && e.top <= e2.bottom && e.right >= e2.left && e.bottom >= e2.top) {
                z3 = true;
            }
            return z3;
        } finally {
            m78560T(e);
            m78560T(e2);
        }
    }

    /* renamed from: l */
    public void mo51039l() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (mo51004F(getChildAt(i))) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z == this.f44873F0) {
            return;
        }
        if (z) {
            mo51026f();
        } else {
            mo51017U();
        }
    }

    /* renamed from: m */
    public void mo2389m(View view, View view2, int i, int i2) {
        C16977c f;
        this.f44879L0.mo53041c(view, view2, i, i2);
        this.f44891z = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C16981g gVar = (C16981g) childAt.getLayoutParams();
            if (gVar.mo51116k(i2) && (f = gVar.mo51111f()) != null) {
                f.mo51099w(this, childAt, view, view2, i, i2);
            }
        }
    }

    /* renamed from: n */
    public void mo2390n(View view, int i) {
        this.f44879L0.mo53043e(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C16981g gVar = (C16981g) childAt.getLayoutParams();
            if (gVar.mo51116k(i)) {
                C16977c f = gVar.mo51111f();
                if (f != null) {
                    f.mo51076D(this, childAt, view, i);
                }
                gVar.mo51118m(i);
                gVar.mo51117l();
            }
        }
        this.f44891z = null;
    }

    /* renamed from: o */
    public void mo2391o(View view, int i, int i2, int[] iArr, int i3) {
        C16977c f;
        int i4;
        int i5;
        int childCount = getChildCount();
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() == 8) {
                int i9 = i3;
            } else {
                C16981g gVar = (C16981g) childAt.getLayoutParams();
                if (gVar.mo51116k(i3) && (f = gVar.mo51111f()) != null) {
                    int[] iArr2 = this.f44885f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f.mo51094r(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.f44885f;
                    if (i > 0) {
                        i4 = Math.max(i6, iArr3[0]);
                    } else {
                        i4 = Math.min(i6, iArr3[0]);
                    }
                    i6 = i4;
                    int[] iArr4 = this.f44885f;
                    if (i2 > 0) {
                        i5 = Math.max(i7, iArr4[1]);
                    } else {
                        i5 = Math.min(i7, iArr4[1]);
                    }
                    i7 = i5;
                    z = true;
                }
            }
        }
        iArr[0] = i6;
        iArr[1] = i7;
        if (z) {
            mo51011M(1);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo51018V(false);
        if (this.f44873F0) {
            if (this.f44872E0 == null) {
                this.f44872E0 = new C16982h();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f44872E0);
        }
        if (this.f44874G0 == null && C18196h2.m82538U(this)) {
            C18196h2.m82642v1(this);
        }
        this.f44888w = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo51018V(false);
        if (this.f44873F0 && this.f44872E0 != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f44872E0);
        }
        View view = this.f44891z;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f44888w = false;
    }

    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (this.f44875H0 && this.f44876I0 != null) {
            C18436z4 z4Var = this.f44874G0;
            if (z4Var != null) {
                i = z4Var.mo53149r();
            } else {
                i = 0;
            }
            if (i > 0) {
                this.f44876I0.setBounds(0, 0, getWidth(), i);
                this.f44876I0.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            mo51018V(true);
        }
        boolean Q = mo51014Q(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            mo51018V(true);
        }
        return Q;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C16977c f;
        int Z = C18196h2.m82553Z(this);
        int size = this.f44880a.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.f44880a.get(i5);
            if (view.getVisibility() != 8 && ((f = ((C16981g) view.getLayoutParams()).mo51111f()) == null || !f.mo51089m(this, view, Z))) {
                mo51012N(view, Z);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011a, code lost:
        if (r0.mo51090n(r30, r20, r11, r21, r23, 0) == false) goto L_0x012a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r7 = r30
            r30.mo51015R()
            r30.mo51039l()
            int r8 = r30.getPaddingLeft()
            int r0 = r30.getPaddingTop()
            int r9 = r30.getPaddingRight()
            int r1 = r30.getPaddingBottom()
            int r10 = androidx.core.view.C18196h2.m82553Z(r30)
            r2 = 1
            if (r10 != r2) goto L_0x0021
            r12 = r2
            goto L_0x0022
        L_0x0021:
            r12 = 0
        L_0x0022:
            int r13 = android.view.View.MeasureSpec.getMode(r31)
            int r14 = android.view.View.MeasureSpec.getSize(r31)
            int r15 = android.view.View.MeasureSpec.getMode(r32)
            int r16 = android.view.View.MeasureSpec.getSize(r32)
            int r17 = r8 + r9
            int r18 = r0 + r1
            int r0 = r30.getSuggestedMinimumWidth()
            int r1 = r30.getSuggestedMinimumHeight()
            androidx.core.view.z4 r3 = r7.f44874G0
            if (r3 == 0) goto L_0x004b
            boolean r3 = androidx.core.view.C18196h2.m82538U(r30)
            if (r3 == 0) goto L_0x004b
            r19 = r2
            goto L_0x004d
        L_0x004b:
            r19 = 0
        L_0x004d:
            java.util.List<android.view.View> r2 = r7.f44880a
            int r6 = r2.size()
            r5 = r0
            r4 = r1
            r2 = 0
            r3 = 0
        L_0x0057:
            if (r3 >= r6) goto L_0x016f
            java.util.List<android.view.View> r0 = r7.f44880a
            java.lang.Object r0 = r0.get(r3)
            r20 = r0
            android.view.View r20 = (android.view.View) r20
            int r0 = r20.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x0073
            r22 = r3
            r29 = r6
            r28 = r8
            goto L_0x0167
        L_0x0073:
            android.view.ViewGroup$LayoutParams r0 = r20.getLayoutParams()
            r1 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C16981g) r1
            int r0 = r1.f44899e
            if (r0 < 0) goto L_0x00ba
            if (r13 == 0) goto L_0x00ba
            int r0 = r7.mo51000B(r0)
            int r11 = r1.f44897c
            int r11 = m78563Y(r11)
            int r11 = androidx.core.view.C18306m0.m82991d(r11, r10)
            r11 = r11 & 7
            r22 = r2
            r2 = 3
            if (r11 != r2) goto L_0x0097
            if (r12 == 0) goto L_0x009c
        L_0x0097:
            r2 = 5
            if (r11 != r2) goto L_0x00a8
            if (r12 == 0) goto L_0x00a8
        L_0x009c:
            int r2 = r14 - r9
            int r2 = r2 - r0
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            r11 = r0
            r21 = r2
            goto L_0x00bf
        L_0x00a8:
            if (r11 != r2) goto L_0x00ac
            if (r12 == 0) goto L_0x00b1
        L_0x00ac:
            r2 = 3
            if (r11 != r2) goto L_0x00bc
            if (r12 == 0) goto L_0x00bc
        L_0x00b1:
            int r0 = r0 - r8
            r11 = 0
            int r0 = java.lang.Math.max(r11, r0)
            r21 = r0
            goto L_0x00bf
        L_0x00ba:
            r22 = r2
        L_0x00bc:
            r11 = 0
            r21 = r11
        L_0x00bf:
            if (r19 == 0) goto L_0x00f1
            boolean r0 = androidx.core.view.C18196h2.m82538U(r20)
            if (r0 != 0) goto L_0x00f1
            androidx.core.view.z4 r0 = r7.f44874G0
            int r0 = r0.mo53147p()
            androidx.core.view.z4 r2 = r7.f44874G0
            int r2 = r2.mo53148q()
            int r0 = r0 + r2
            androidx.core.view.z4 r2 = r7.f44874G0
            int r2 = r2.mo53149r()
            androidx.core.view.z4 r11 = r7.f44874G0
            int r11 = r11.mo53146o()
            int r2 = r2 + r11
            int r0 = r14 - r0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13)
            int r2 = r16 - r2
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15)
            r11 = r0
            r23 = r2
            goto L_0x00f5
        L_0x00f1:
            r11 = r31
            r23 = r32
        L_0x00f5:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r1.mo51111f()
            if (r0 == 0) goto L_0x011d
            r24 = 0
            r2 = r1
            r1 = r30
            r26 = r2
            r25 = r22
            r2 = r20
            r22 = r3
            r3 = r11
            r27 = r4
            r4 = r21
            r28 = r8
            r8 = r5
            r5 = r23
            r29 = r6
            r6 = r24
            boolean r0 = r0.mo51090n(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x0137
            goto L_0x012a
        L_0x011d:
            r26 = r1
            r27 = r4
            r29 = r6
            r28 = r8
            r25 = r22
            r22 = r3
            r8 = r5
        L_0x012a:
            r5 = 0
            r0 = r30
            r1 = r20
            r2 = r11
            r3 = r21
            r4 = r23
            r0.mo51013O(r1, r2, r3, r4, r5)
        L_0x0137:
            int r0 = r20.getMeasuredWidth()
            int r0 = r17 + r0
            r1 = r26
            int r2 = r1.leftMargin
            int r0 = r0 + r2
            int r2 = r1.rightMargin
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r8, r0)
            int r2 = r20.getMeasuredHeight()
            int r2 = r18 + r2
            int r3 = r1.topMargin
            int r2 = r2 + r3
            int r1 = r1.bottomMargin
            int r2 = r2 + r1
            r1 = r27
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r20.getMeasuredState()
            r11 = r25
            int r2 = android.view.View.combineMeasuredStates(r11, r2)
            r5 = r0
            r4 = r1
        L_0x0167:
            int r3 = r22 + 1
            r8 = r28
            r6 = r29
            goto L_0x0057
        L_0x016f:
            r11 = r2
            r1 = r4
            r8 = r5
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r11
            r2 = r31
            int r0 = android.view.View.resolveSizeAndState(r8, r2, r0)
            int r2 = r11 << 16
            r3 = r32
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r2)
            r7.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        C16977c f3;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C16981g gVar = (C16981g) childAt.getLayoutParams();
                if (gVar.mo51116k(0) && (f3 = gVar.mo51111f()) != null) {
                    z2 |= f3.mo51091o(this, childAt, view, f, f2, z);
                }
            }
        }
        if (z2) {
            mo51011M(1);
        }
        return z2;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        C16977c f3;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C16981g gVar = (C16981g) childAt.getLayoutParams();
                if (gVar.mo51116k(0) && (f3 = gVar.mo51111f()) != null) {
                    z |= f3.mo51092p(this, childAt, view, f, f2);
                }
            }
        }
        return z;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo2391o(view, i, i2, iArr, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo2408r(view, i, i2, i3, i4, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo2389m(view, view2, i, 0);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo53419a());
        SparseArray<Parcelable> sparseArray = savedState.f44892c;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            C16977c f = mo51002D(childAt).mo51111f();
            if (!(id == -1 || f == null || (parcelable2 = sparseArray.get(id)) == null)) {
                f.mo51101y(this, childAt, parcelable2);
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        Parcelable z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            C16977c f = ((C16981g) childAt.getLayoutParams()).mo51111f();
            if (!(id == -1 || f == null || (z = f.mo51102z(this, childAt)) == null)) {
                sparseArray.append(id, z);
            }
        }
        savedState.f44892c = sparseArray;
        return savedState;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo2409s(view, view2, i, 0);
    }

    public void onStopNestedScroll(View view) {
        mo2390n(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f44890y
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0015
            boolean r3 = r0.mo51014Q(r1, r4)
            if (r3 == 0) goto L_0x002b
            goto L_0x0016
        L_0x0015:
            r3 = r5
        L_0x0016:
            android.view.View r6 = r0.f44890y
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C16981g) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.mo51111f()
            if (r6 == 0) goto L_0x002b
            android.view.View r7 = r0.f44890y
            boolean r6 = r6.mo51077E(r0, r7, r1)
            goto L_0x002c
        L_0x002b:
            r6 = r5
        L_0x002c:
            android.view.View r7 = r0.f44890y
            r8 = 0
            if (r7 != 0) goto L_0x0037
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x004a
        L_0x0037:
            if (r3 == 0) goto L_0x004a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x004a:
            if (r8 == 0) goto L_0x004f
            r8.recycle()
        L_0x004f:
            if (r2 == r4) goto L_0x0054
            r1 = 3
            if (r2 != r1) goto L_0x0057
        L_0x0054:
            r0.mo51018V(r5)
        L_0x0057:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public C16981g generateDefaultLayoutParams() {
        return new C16981g(-2, -2);
    }

    /* renamed from: q */
    public void mo2407q(@C0359n0 View view, int i, int i2, int i3, int i4, int i5, @C0359n0 int[] iArr) {
        C16977c f;
        int i6;
        boolean z;
        int i7;
        int childCount = getChildCount();
        boolean z2 = false;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C16981g gVar = (C16981g) childAt.getLayoutParams();
                if (gVar.mo51116k(i5) && (f = gVar.mo51111f()) != null) {
                    int[] iArr2 = this.f44885f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f.mo51097u(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.f44885f;
                    if (i3 > 0) {
                        i6 = Math.max(i8, iArr3[0]);
                    } else {
                        i6 = Math.min(i8, iArr3[0]);
                    }
                    i8 = i6;
                    if (i4 > 0) {
                        z = true;
                        i7 = Math.max(i9, this.f44885f[1]);
                    } else {
                        z = true;
                        i7 = Math.min(i9, this.f44885f[1]);
                    }
                    i9 = i7;
                    z2 = z;
                }
            }
        }
        iArr[0] = iArr[0] + i8;
        iArr[1] = iArr[1] + i9;
        if (z2) {
            mo51011M(1);
        }
    }

    /* renamed from: r */
    public void mo2408r(View view, int i, int i2, int i3, int i4, int i5) {
        mo2407q(view, i, i2, i3, i4, 0, this.f44886g);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        C16977c f = ((C16981g) view.getLayoutParams()).mo51111f();
        if (f == null || !f.mo51100x(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.f44887v) {
            mo51018V(false);
            this.f44887v = true;
        }
    }

    /* renamed from: s */
    public boolean mo2409s(View view, View view2, int i, int i2) {
        int i3 = i2;
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C16981g gVar = (C16981g) childAt.getLayoutParams();
                C16977c f = gVar.mo51111f();
                if (f != null) {
                    boolean B = f.mo51074B(this, childAt, view, view2, i, i2);
                    z |= B;
                    gVar.mo51125t(i3, B);
                } else {
                    gVar.mo51125t(i3, false);
                }
            }
        }
        return z;
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        mo51022c0();
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f44877J0 = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(@C0363p0 Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.f44876I0;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f44876I0 = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f44876I0.setState(getDrawableState());
                }
                C17549d.m80451m(this.f44876I0, C18196h2.m82553Z(this));
                Drawable drawable4 = this.f44876I0;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable4.setVisible(z, false);
                this.f44876I0.setCallback(this);
            }
            C18196h2.m82610n1(this);
        }
    }

    public void setStatusBarBackgroundColor(@C0354l int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(@C0375v int i) {
        setStatusBarBackground(i != 0 ? C17318d.m79726i(getContext(), i) : null);
    }

    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.f44876I0;
        if (drawable != null && drawable.isVisible() != z) {
            this.f44876I0.setVisible(z, false);
        }
    }

    /* renamed from: t */
    public C16981g generateLayoutParams(AttributeSet attributeSet) {
        return new C16981g(getContext(), attributeSet);
    }

    /* renamed from: u */
    public C16981g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C16981g) {
            return new C16981g((C16981g) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C16981g((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C16981g(layoutParams);
    }

    /* renamed from: v */
    public void mo51060v(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            mo51064y(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f44876I0;
    }

    @C0359n0
    /* renamed from: w */
    public List<View> mo51062w(@C0359n0 View view) {
        List<View> h = this.f44881b.mo51138h(view);
        this.f44883d.clear();
        if (h != null) {
            this.f44883d.addAll(h);
        }
        return this.f44883d;
    }

    @C0359n0
    /* renamed from: x */
    public List<View> mo51063x(@C0359n0 View view) {
        List g = this.f44881b.mo51137g(view);
        this.f44883d.clear();
        if (g != null) {
            this.f44883d.addAll(g);
        }
        return this.f44883d;
    }

    /* renamed from: y */
    public void mo51064y(View view, Rect rect) {
        C16985b.m78681a(this, view, rect);
    }

    /* renamed from: z */
    public void mo51065z(View view, int i, Rect rect, Rect rect2) {
        C16981g gVar = (C16981g) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        mo50999A(view, i, rect, rect2, gVar, measuredWidth, measuredHeight);
        mo51035h(gVar, rect2, measuredWidth, measuredHeight);
    }

    public CoordinatorLayout(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C16963a.C16964a.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, @C0336f int i) {
        super(context, attributeSet, i);
        TypedArray typedArray;
        this.f44880a = new ArrayList();
        this.f44881b = new C16984a<>();
        this.f44882c = new ArrayList();
        this.f44883d = new ArrayList();
        this.f44885f = new int[2];
        this.f44886g = new int[2];
        this.f44879L0 = new C18400w1(this);
        if (i == 0) {
            typedArray = context.obtainStyledAttributes(attributeSet, C16963a.C16973j.CoordinatorLayout, 0, C16963a.C16972i.Widget_Support_CoordinatorLayout);
        } else {
            typedArray = context.obtainStyledAttributes(attributeSet, C16963a.C16973j.CoordinatorLayout, i, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (i == 0) {
                saveAttributeDataForStyleable(context, C16963a.C16973j.CoordinatorLayout, attributeSet, typedArray, 0, C16963a.C16972i.Widget_Support_CoordinatorLayout);
            } else {
                saveAttributeDataForStyleable(context, C16963a.C16973j.CoordinatorLayout, attributeSet, typedArray, i, 0);
            }
        }
        int resourceId = typedArray.getResourceId(C16963a.C16973j.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f44889x = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f44889x.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr = this.f44889x;
                iArr[i2] = (int) (((float) iArr[i2]) * f);
            }
        }
        this.f44876I0 = typedArray.getDrawable(C16963a.C16973j.CoordinatorLayout_statusBarBackground);
        typedArray.recycle();
        mo51022c0();
        super.setOnHierarchyChangeListener(new C16980f());
        if (C18196h2.m82541V(this) == 0) {
            C18196h2.m82531R1(this, 1);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C16974a();

        /* renamed from: c */
        public SparseArray<Parcelable> f44892c;

        /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState$a */
        public static class C16974a implements Parcelable.ClassLoaderCreator<SavedState> {
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

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f44892c = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f44892c.append(iArr[i], readParcelableArray[i]);
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            int i2;
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.f44892c;
            if (sparseArray != null) {
                i2 = sparseArray.size();
            } else {
                i2 = 0;
            }
            parcel.writeInt(i2);
            int[] iArr = new int[i2];
            Parcelable[] parcelableArr = new Parcelable[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                iArr[i3] = this.f44892c.keyAt(i3);
                parcelableArr[i3] = this.f44892c.valueAt(i3);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$g */
    public static class C16981g extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public C16977c f44895a;

        /* renamed from: b */
        public boolean f44896b = false;

        /* renamed from: c */
        public int f44897c = 0;

        /* renamed from: d */
        public int f44898d = 0;

        /* renamed from: e */
        public int f44899e = -1;

        /* renamed from: f */
        public int f44900f = -1;

        /* renamed from: g */
        public int f44901g = 0;

        /* renamed from: h */
        public int f44902h = 0;

        /* renamed from: i */
        public int f44903i;

        /* renamed from: j */
        public int f44904j;

        /* renamed from: k */
        public View f44905k;

        /* renamed from: l */
        public View f44906l;

        /* renamed from: m */
        public boolean f44907m;

        /* renamed from: n */
        public boolean f44908n;

        /* renamed from: o */
        public boolean f44909o;

        /* renamed from: p */
        public boolean f44910p;

        /* renamed from: q */
        public final Rect f44911q = new Rect();

        /* renamed from: r */
        public Object f44912r;

        public C16981g(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public boolean mo51106a() {
            return this.f44905k == null && this.f44900f != -1;
        }

        /* renamed from: b */
        public boolean mo51107b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            C16977c cVar;
            if (view2 == this.f44906l || mo51126u(view2, C18196h2.m82553Z(coordinatorLayout)) || ((cVar = this.f44895a) != null && cVar.mo51082f(coordinatorLayout, view, view2))) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public boolean mo51108c() {
            if (this.f44895a == null) {
                this.f44907m = false;
            }
            return this.f44907m;
        }

        /* renamed from: d */
        public View mo51109d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f44900f == -1) {
                this.f44906l = null;
                this.f44905k = null;
                return null;
            }
            if (this.f44905k == null || !mo51127v(view, coordinatorLayout)) {
                mo51120o(view, coordinatorLayout);
            }
            return this.f44905k;
        }

        @C0329d0
        /* renamed from: e */
        public int mo51110e() {
            return this.f44900f;
        }

        @C0363p0
        /* renamed from: f */
        public C16977c mo51111f() {
            return this.f44895a;
        }

        /* renamed from: g */
        public boolean mo51112g() {
            return this.f44910p;
        }

        /* renamed from: h */
        public Rect mo51113h() {
            return this.f44911q;
        }

        /* renamed from: i */
        public void mo51114i() {
            this.f44906l = null;
            this.f44905k = null;
        }

        /* renamed from: j */
        public boolean mo51115j(CoordinatorLayout coordinatorLayout, View view) {
            boolean z;
            boolean z2 = this.f44907m;
            if (z2) {
                return true;
            }
            C16977c cVar = this.f44895a;
            if (cVar != null) {
                z = cVar.mo51078a(coordinatorLayout, view);
            } else {
                z = false;
            }
            boolean z3 = z | z2;
            this.f44907m = z3;
            return z3;
        }

        /* renamed from: k */
        public boolean mo51116k(int i) {
            if (i == 0) {
                return this.f44908n;
            }
            if (i != 1) {
                return false;
            }
            return this.f44909o;
        }

        /* renamed from: l */
        public void mo51117l() {
            this.f44910p = false;
        }

        /* renamed from: m */
        public void mo51118m(int i) {
            mo51125t(i, false);
        }

        /* renamed from: n */
        public void mo51119n() {
            this.f44907m = false;
        }

        /* renamed from: o */
        public final void mo51120o(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f44900f);
            this.f44905k = findViewById;
            if (findViewById != null) {
                if (findViewById != coordinatorLayout) {
                    ViewParent parent = findViewById.getParent();
                    while (parent != coordinatorLayout && parent != null) {
                        if (parent != view) {
                            if (parent instanceof View) {
                                findViewById = (View) parent;
                            }
                            parent = parent.getParent();
                        } else if (coordinatorLayout.isInEditMode()) {
                            this.f44906l = null;
                            this.f44905k = null;
                            return;
                        } else {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.f44906l = findViewById;
                } else if (coordinatorLayout.isInEditMode()) {
                    this.f44906l = null;
                    this.f44905k = null;
                } else {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (coordinatorLayout.isInEditMode()) {
                this.f44906l = null;
                this.f44905k = null;
            } else {
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f44900f) + " to anchor view " + view);
            }
        }

        /* renamed from: p */
        public void mo51121p(@C0329d0 int i) {
            mo51114i();
            this.f44900f = i;
        }

        /* renamed from: q */
        public void mo51122q(@C0363p0 C16977c cVar) {
            C16977c cVar2 = this.f44895a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.mo51087k();
                }
                this.f44895a = cVar;
                this.f44912r = null;
                this.f44896b = true;
                if (cVar != null) {
                    cVar.mo51084h(this);
                }
            }
        }

        /* renamed from: r */
        public void mo51123r(boolean z) {
            this.f44910p = z;
        }

        /* renamed from: s */
        public void mo51124s(Rect rect) {
            this.f44911q.set(rect);
        }

        /* renamed from: t */
        public void mo51125t(int i, boolean z) {
            if (i == 0) {
                this.f44908n = z;
            } else if (i == 1) {
                this.f44909o = z;
            }
        }

        /* renamed from: u */
        public final boolean mo51126u(View view, int i) {
            int d = C18306m0.m82991d(((C16981g) view.getLayoutParams()).f44901g, i);
            if (d == 0 || (C18306m0.m82991d(this.f44902h, i) & d) != d) {
                return false;
            }
            return true;
        }

        /* renamed from: v */
        public final boolean mo51127v(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f44905k.getId() != this.f44900f) {
                return false;
            }
            View view2 = this.f44905k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f44906l = null;
                    this.f44905k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
            this.f44906l = view2;
            return true;
        }

        public C16981g(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C16963a.C16973j.CoordinatorLayout_Layout);
            this.f44897c = obtainStyledAttributes.getInteger(C16963a.C16973j.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f44900f = obtainStyledAttributes.getResourceId(C16963a.C16973j.CoordinatorLayout_Layout_layout_anchor, -1);
            this.f44898d = obtainStyledAttributes.getInteger(C16963a.C16973j.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.f44899e = obtainStyledAttributes.getInteger(C16963a.C16973j.CoordinatorLayout_Layout_layout_keyline, -1);
            this.f44901g = obtainStyledAttributes.getInt(C16963a.C16973j.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.f44902h = obtainStyledAttributes.getInt(C16963a.C16973j.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            int i = C16963a.C16973j.CoordinatorLayout_Layout_layout_behavior;
            boolean hasValue = obtainStyledAttributes.hasValue(i);
            this.f44896b = hasValue;
            if (hasValue) {
                this.f44895a = CoordinatorLayout.m78559P(context, attributeSet, obtainStyledAttributes.getString(i));
            }
            obtainStyledAttributes.recycle();
            C16977c cVar = this.f44895a;
            if (cVar != null) {
                cVar.mo51084h(this);
            }
        }

        public C16981g(C16981g gVar) {
            super(gVar);
        }

        public C16981g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C16981g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}

package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.C0324b1;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0372t0;
import androidx.annotation.C0379x;
import androidx.annotation.RestrictTo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.C17616m0;
import androidx.core.math.C17760a;
import androidx.core.view.C18196h2;
import androidx.core.view.C18436z4;
import androidx.core.view.accessibility.C18065l0;
import androidx.core.view.accessibility.C18098w0;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.C18553d;
import com.google.android.material.C31076a;
import com.google.android.material.internal.C31432x;
import com.google.android.material.resources.C31500c;
import com.google.android.material.shape.C31525j;
import com.google.android.material.shape.C31534o;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.C16977c<V> {

    /* renamed from: d0 */
    public static final int f74768d0 = 1;

    /* renamed from: e0 */
    public static final int f74769e0 = 2;

    /* renamed from: f0 */
    public static final int f74770f0 = 3;

    /* renamed from: g0 */
    public static final int f74771g0 = 4;

    /* renamed from: h0 */
    public static final int f74772h0 = 5;

    /* renamed from: i0 */
    public static final int f74773i0 = 6;

    /* renamed from: j0 */
    public static final int f74774j0 = -1;

    /* renamed from: k0 */
    public static final int f74775k0 = 1;

    /* renamed from: l0 */
    public static final int f74776l0 = 2;

    /* renamed from: m0 */
    public static final int f74777m0 = 4;

    /* renamed from: n0 */
    public static final int f74778n0 = 8;

    /* renamed from: o0 */
    public static final int f74779o0 = -1;

    /* renamed from: p0 */
    public static final int f74780p0 = 0;

    /* renamed from: q0 */
    public static final String f74781q0 = "BottomSheetBehavior";

    /* renamed from: r0 */
    public static final int f74782r0 = 500;

    /* renamed from: s0 */
    public static final float f74783s0 = 0.5f;

    /* renamed from: t0 */
    public static final float f74784t0 = 0.1f;

    /* renamed from: u0 */
    public static final int f74785u0 = 500;

    /* renamed from: v0 */
    public static final int f74786v0 = -1;

    /* renamed from: w0 */
    public static final int f74787w0 = C31076a.C31090n.Widget_Design_BottomSheet_Modal;
    @C0363p0

    /* renamed from: A */
    public ValueAnimator f74788A;

    /* renamed from: B */
    public int f74789B;

    /* renamed from: C */
    public int f74790C;

    /* renamed from: D */
    public int f74791D;

    /* renamed from: E */
    public float f74792E = 0.5f;

    /* renamed from: F */
    public int f74793F;

    /* renamed from: G */
    public float f74794G = -1.0f;

    /* renamed from: H */
    public boolean f74795H;

    /* renamed from: I */
    public boolean f74796I;

    /* renamed from: J */
    public boolean f74797J = true;

    /* renamed from: K */
    public int f74798K = 4;

    /* renamed from: L */
    public int f74799L = 4;
    @C0363p0

    /* renamed from: M */
    public C18553d f74800M;

    /* renamed from: N */
    public boolean f74801N;

    /* renamed from: O */
    public int f74802O;

    /* renamed from: P */
    public boolean f74803P;

    /* renamed from: Q */
    public int f74804Q;

    /* renamed from: R */
    public int f74805R;

    /* renamed from: S */
    public int f74806S;
    @C0363p0

    /* renamed from: T */
    public WeakReference<V> f74807T;
    @C0363p0

    /* renamed from: U */
    public WeakReference<View> f74808U;
    @C0359n0

    /* renamed from: V */
    public final ArrayList<C31172f> f74809V = new ArrayList<>();
    @C0363p0

    /* renamed from: W */
    public VelocityTracker f74810W;

    /* renamed from: X */
    public int f74811X;

    /* renamed from: Y */
    public int f74812Y;

    /* renamed from: Z */
    public boolean f74813Z;

    /* renamed from: a */
    public int f74814a = 0;
    @C0363p0

    /* renamed from: a0 */
    public Map<View, Integer> f74815a0;

    /* renamed from: b */
    public boolean f74816b = true;

    /* renamed from: b0 */
    public int f74817b0 = -1;

    /* renamed from: c */
    public boolean f74818c = false;

    /* renamed from: c0 */
    public final C18553d.C18556c f74819c0 = new C31170d();

    /* renamed from: d */
    public float f74820d;

    /* renamed from: e */
    public int f74821e;

    /* renamed from: f */
    public boolean f74822f;

    /* renamed from: g */
    public int f74823g;

    /* renamed from: h */
    public int f74824h;

    /* renamed from: i */
    public C31525j f74825i;
    @C0363p0

    /* renamed from: j */
    public ColorStateList f74826j;

    /* renamed from: k */
    public int f74827k = -1;

    /* renamed from: l */
    public int f74828l = -1;

    /* renamed from: m */
    public int f74829m;

    /* renamed from: n */
    public boolean f74830n;

    /* renamed from: o */
    public boolean f74831o;

    /* renamed from: p */
    public boolean f74832p;

    /* renamed from: q */
    public boolean f74833q;

    /* renamed from: r */
    public boolean f74834r;

    /* renamed from: s */
    public boolean f74835s;

    /* renamed from: t */
    public boolean f74836t;

    /* renamed from: u */
    public boolean f74837u;

    /* renamed from: v */
    public int f74838v;

    /* renamed from: w */
    public int f74839w;

    /* renamed from: x */
    public C31534o f74840x;

    /* renamed from: y */
    public boolean f74841y;

    /* renamed from: z */
    public final BottomSheetBehavior<V>.j f74842z = new C31176j(this, (C31167a) null);

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C31166a();

        /* renamed from: c */
        public final int f74843c;

        /* renamed from: d */
        public int f74844d;

        /* renamed from: e */
        public boolean f74845e;

        /* renamed from: f */
        public boolean f74846f;

        /* renamed from: g */
        public boolean f74847g;

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$SavedState$a */
        public class C31166a implements Parcelable.ClassLoaderCreator<SavedState> {
            @C0363p0
            /* renamed from: a */
            public SavedState createFromParcel(@C0359n0 Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            @C0359n0
            /* renamed from: b */
            public SavedState createFromParcel(@C0359n0 Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @C0359n0
            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(@C0359n0 Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        public void writeToParcel(@C0359n0 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f74843c);
            parcel.writeInt(this.f74844d);
            parcel.writeInt(this.f74845e ? 1 : 0);
            parcel.writeInt(this.f74846f ? 1 : 0);
            parcel.writeInt(this.f74847g ? 1 : 0);
        }

        public SavedState(@C0359n0 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f74843c = parcel.readInt();
            this.f74844d = parcel.readInt();
            boolean z = false;
            this.f74845e = parcel.readInt() == 1;
            this.f74846f = parcel.readInt() == 1;
            this.f74847g = parcel.readInt() == 1 ? true : z;
        }

        public SavedState(Parcelable parcelable, @C0359n0 BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f74843c = bottomSheetBehavior.f74798K;
            this.f74844d = bottomSheetBehavior.f74821e;
            this.f74845e = bottomSheetBehavior.f74816b;
            this.f74846f = bottomSheetBehavior.f74795H;
            this.f74847g = bottomSheetBehavior.f74796I;
        }

        @Deprecated
        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.f74843c = i;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$a */
    public class C31167a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ View f74848a;

        /* renamed from: b */
        public final /* synthetic */ int f74849b;

        public C31167a(View view, int i) {
            this.f74848a = view;
            this.f74849b = i;
        }

        public void run() {
            BottomSheetBehavior.this.mo88436f1(this.f74848a, this.f74849b, false);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$b */
    public class C31168b implements ValueAnimator.AnimatorUpdateListener {
        public C31168b() {
        }

        public void onAnimationUpdate(@C0359n0 ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f74825i != null) {
                BottomSheetBehavior.this.f74825i.mo90780p0(floatValue);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$c */
    public class C31169c implements C31432x.C31437e {

        /* renamed from: a */
        public final /* synthetic */ boolean f74852a;

        public C31169c(boolean z) {
            this.f74852a = z;
        }

        /* renamed from: a */
        public C18436z4 mo88352a(View view, C18436z4 z4Var, C31432x.C31438f fVar) {
            boolean z;
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            C17616m0 f = z4Var.mo53136f(C18436z4.C18449m.m83510i());
            C17616m0 f2 = z4Var.mo53136f(C18436z4.C18449m.m83507f());
            int unused = BottomSheetBehavior.this.f74839w = f.f45996b;
            boolean k = C31432x.m127016k(view);
            int paddingBottom = view.getPaddingBottom();
            int paddingLeft = view.getPaddingLeft();
            int paddingRight = view.getPaddingRight();
            if (BottomSheetBehavior.this.f74831o) {
                int unused2 = BottomSheetBehavior.this.f74838v = z4Var.mo53146o();
                paddingBottom = fVar.f75984d + BottomSheetBehavior.this.f74838v;
            }
            if (BottomSheetBehavior.this.f74832p) {
                if (k) {
                    i5 = fVar.f75983c;
                } else {
                    i5 = fVar.f75981a;
                }
                paddingLeft = i5 + f.f45995a;
            }
            if (BottomSheetBehavior.this.f74833q) {
                if (k) {
                    i4 = fVar.f75981a;
                } else {
                    i4 = fVar.f75983c;
                }
                paddingRight = i4 + f.f45997c;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            boolean z2 = true;
            if (!BottomSheetBehavior.this.f74835s || marginLayoutParams.leftMargin == (i3 = f.f45995a)) {
                z = false;
            } else {
                marginLayoutParams.leftMargin = i3;
                z = true;
            }
            if (BottomSheetBehavior.this.f74836t && marginLayoutParams.rightMargin != (i2 = f.f45997c)) {
                marginLayoutParams.rightMargin = i2;
                z = true;
            }
            if (!BottomSheetBehavior.this.f74837u || marginLayoutParams.topMargin == (i = f.f45996b)) {
                z2 = z;
            } else {
                marginLayoutParams.topMargin = i;
            }
            if (z2) {
                view.setLayoutParams(marginLayoutParams);
            }
            view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
            if (this.f74852a) {
                int unused3 = BottomSheetBehavior.this.f74829m = f2.f45998d;
            }
            if (BottomSheetBehavior.this.f74831o || this.f74852a) {
                BottomSheetBehavior.this.mo88443j1(false);
            }
            return z4Var;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$d */
    public class C31170d extends C18553d.C18556c {

        /* renamed from: a */
        public long f74854a;

        public C31170d() {
        }

        /* renamed from: a */
        public int mo18293a(@C0359n0 View view, int i, int i2) {
            return view.getLeft();
        }

        /* renamed from: b */
        public int mo18294b(@C0359n0 View view, int i, int i2) {
            int i3;
            int k0 = BottomSheetBehavior.this.mo88444k0();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.f74795H) {
                i3 = bottomSheetBehavior.f74806S;
            } else {
                i3 = bottomSheetBehavior.f74793F;
            }
            return C17760a.m81102e(i, k0, i3);
        }

        /* renamed from: e */
        public int mo53527e(@C0359n0 View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.f74795H) {
                return bottomSheetBehavior.f74806S;
            }
            return bottomSheetBehavior.f74793F;
        }

        /* renamed from: j */
        public void mo18296j(int i) {
            if (i == 1 && BottomSheetBehavior.this.f74797J) {
                BottomSheetBehavior.this.mo88420X0(1);
            }
        }

        /* renamed from: k */
        public void mo18297k(@C0359n0 View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.mo88437g0(i2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x003b, code lost:
            if (r9 > r7.f74855b.f74791D) goto L_0x0124;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x008b, code lost:
            if (java.lang.Math.abs(r8.getTop() - r7.f74855b.mo88444k0()) < java.lang.Math.abs(r8.getTop() - r7.f74855b.f74791D)) goto L_0x0010;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c9, code lost:
            if (r7.f74855b.mo88432d1() == false) goto L_0x0124;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00eb, code lost:
            if (java.lang.Math.abs(r9 - r7.f74855b.f74790C) < java.lang.Math.abs(r9 - r7.f74855b.f74793F)) goto L_0x0010;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x0107, code lost:
            if (r7.f74855b.mo88432d1() != false) goto L_0x00a7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x0121, code lost:
            if (r7.f74855b.mo88432d1() == false) goto L_0x0124;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0034, code lost:
            if (r10.mo88426a1(r0, (((float) r9) * 100.0f) / ((float) r10.f74806S)) != false) goto L_0x0010;
         */
        /* renamed from: l */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo18298l(@androidx.annotation.C0359n0 android.view.View r8, float r9, float r10) {
            /*
                r7 = this;
                r0 = 0
                int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                r2 = 6
                r3 = 3
                r4 = 4
                if (r1 >= 0) goto L_0x003f
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r9.f74816b
                if (r9 == 0) goto L_0x0013
            L_0x0010:
                r2 = r3
                goto L_0x0124
            L_0x0013:
                int r9 = r8.getTop()
                long r0 = java.lang.System.currentTimeMillis()
                long r5 = r7.f74854a
                long r0 = r0 - r5
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r10 = r10.mo88432d1()
                if (r10 == 0) goto L_0x0037
                float r9 = (float) r9
                r10 = 1120403456(0x42c80000, float:100.0)
                float r9 = r9 * r10
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r2 = r10.f74806S
                float r2 = (float) r2
                float r9 = r9 / r2
                boolean r9 = r10.mo88426a1(r0, r9)
                if (r9 == 0) goto L_0x00a7
                goto L_0x0010
            L_0x0037:
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r10 = r10.f74791D
                if (r9 <= r10) goto L_0x0010
                goto L_0x0124
            L_0x003f:
                com.google.android.material.bottomsheet.BottomSheetBehavior r1 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r5 = r1.f74795H
                if (r5 == 0) goto L_0x008e
                boolean r1 = r1.mo88430c1(r8, r10)
                if (r1 == 0) goto L_0x008e
                float r9 = java.lang.Math.abs(r9)
                float r0 = java.lang.Math.abs(r10)
                int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r9 >= 0) goto L_0x005d
                r9 = 1140457472(0x43fa0000, float:500.0)
                int r9 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
                if (r9 > 0) goto L_0x0063
            L_0x005d:
                boolean r9 = r7.mo88468n(r8)
                if (r9 == 0) goto L_0x0066
            L_0x0063:
                r2 = 5
                goto L_0x0124
            L_0x0066:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r9.f74816b
                if (r9 == 0) goto L_0x006f
                goto L_0x0010
            L_0x006f:
                int r9 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r10 = r10.mo88444k0()
                int r9 = r9 - r10
                int r9 = java.lang.Math.abs(r9)
                int r10 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f74791D
                int r10 = r10 - r0
                int r10 = java.lang.Math.abs(r10)
                if (r9 >= r10) goto L_0x0124
                goto L_0x0010
            L_0x008e:
                int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r0 == 0) goto L_0x00cc
                float r9 = java.lang.Math.abs(r9)
                float r10 = java.lang.Math.abs(r10)
                int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
                if (r9 <= 0) goto L_0x009f
                goto L_0x00cc
            L_0x009f:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r9.f74816b
                if (r9 == 0) goto L_0x00aa
            L_0x00a7:
                r2 = r4
                goto L_0x0124
            L_0x00aa:
                int r9 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r10 = r10.f74791D
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f74793F
                int r9 = r9 - r0
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto L_0x00a7
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r9.mo88432d1()
                if (r9 == 0) goto L_0x0124
                goto L_0x00a7
            L_0x00cc:
                int r9 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r10 = r10.f74816b
                if (r10 == 0) goto L_0x00ef
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r10 = r10.f74790C
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f74793F
                int r9 = r9 - r0
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto L_0x00a7
                goto L_0x0010
            L_0x00ef:
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r10.f74791D
                if (r9 >= r0) goto L_0x010a
                int r10 = r10.f74793F
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                if (r9 >= r10) goto L_0x0101
                goto L_0x0010
            L_0x0101:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r9.mo88432d1()
                if (r9 == 0) goto L_0x0124
                goto L_0x00a7
            L_0x010a:
                int r10 = r9 - r0
                int r10 = java.lang.Math.abs(r10)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f74793F
                int r9 = r9 - r0
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto L_0x00a7
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r9.mo88432d1()
                if (r9 == 0) goto L_0x0124
                goto L_0x00a7
            L_0x0124:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r10 = r9.mo88434e1()
                r9.mo88436f1(r8, r2, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C31170d.mo18298l(android.view.View, float, float):void");
        }

        /* renamed from: m */
        public boolean mo18299m(@C0359n0 View view, int i) {
            View view2;
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.f74798K;
            if (i2 == 1 || bottomSheetBehavior.f74813Z) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.f74811X == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.f74808U;
                if (weakReference != null) {
                    view2 = weakReference.get();
                } else {
                    view2 = null;
                }
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f74854a = System.currentTimeMillis();
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.f74807T;
            if (weakReference2 == null || weakReference2.get() != view) {
                return false;
            }
            return true;
        }

        /* renamed from: n */
        public final boolean mo88468n(@C0359n0 View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.f74806S + bottomSheetBehavior.mo88444k0()) / 2;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$e */
    public class C31171e implements C18098w0 {

        /* renamed from: a */
        public final /* synthetic */ int f74856a;

        public C31171e(int i) {
            this.f74856a = i;
        }

        /* renamed from: a */
        public boolean mo19056a(@C0359n0 View view, @C0363p0 C18098w0.C18099a aVar) {
            BottomSheetBehavior.this.mo88418W0(this.f74856a);
            return true;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$f */
    public static abstract class C31172f {
        /* renamed from: a */
        public void mo88469a(@C0359n0 View view) {
        }

        /* renamed from: b */
        public abstract void mo68139b(@C0359n0 View view, float f);

        /* renamed from: c */
        public abstract void mo68140c(@C0359n0 View view, int i);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$g */
    public @interface C31173g {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$h */
    public @interface C31174h {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$i */
    public @interface C31175i {
    }

    public BottomSheetBehavior() {
    }

    @C0359n0
    /* renamed from: i0 */
    public static <V extends View> BottomSheetBehavior<V> m125237i0(@C0359n0 V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.C16981g) {
            CoordinatorLayout.C16977c f = ((CoordinatorLayout.C16981g) layoutParams).mo51111f();
            if (f instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) f;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    /* renamed from: A0 */
    public boolean mo88396A0() {
        return this.f74795H;
    }

    /* renamed from: B */
    public boolean mo51074B(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 V v, @C0359n0 View view, @C0359n0 View view2, int i, int i2) {
        this.f74802O = 0;
        this.f74803P = false;
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: B0 */
    public final boolean mo88397B0(V v) {
        ViewParent parent = v.getParent();
        if (parent == null || !parent.isLayoutRequested() || !C18196h2.m82521O0(v)) {
            return false;
        }
        return true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: C0 */
    public boolean mo88398C0() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        if (r4.getTop() <= r2.f74791D) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0065, code lost:
        if (java.lang.Math.abs(r3 - r2.f74790C) < java.lang.Math.abs(r3 - r2.f74793F)) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007b, code lost:
        if (mo88432d1() != false) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008b, code lost:
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.f74793F)) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a7, code lost:
        if (java.lang.Math.abs(r3 - r2.f74791D) < java.lang.Math.abs(r3 - r2.f74793F)) goto L_0x00a9;
     */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo51076D(@androidx.annotation.C0359n0 androidx.coordinatorlayout.widget.CoordinatorLayout r3, @androidx.annotation.C0359n0 V r4, @androidx.annotation.C0359n0 android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.mo88444k0()
            r0 = 3
            if (r3 != r6) goto L_0x000f
            r2.mo88420X0(r0)
            return
        L_0x000f:
            boolean r3 = r2.mo88398C0()
            if (r3 == 0) goto L_0x0024
            java.lang.ref.WeakReference<android.view.View> r3 = r2.f74808U
            if (r3 == 0) goto L_0x0023
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L_0x0023
            boolean r3 = r2.f74803P
            if (r3 != 0) goto L_0x0024
        L_0x0023:
            return
        L_0x0024:
            int r3 = r2.f74802O
            r5 = 6
            if (r3 <= 0) goto L_0x0039
            boolean r3 = r2.f74816b
            if (r3 == 0) goto L_0x002f
            goto L_0x00aa
        L_0x002f:
            int r3 = r4.getTop()
            int r6 = r2.f74791D
            if (r3 <= r6) goto L_0x00aa
            goto L_0x00a9
        L_0x0039:
            boolean r3 = r2.f74795H
            if (r3 == 0) goto L_0x0049
            float r3 = r2.mo88456w0()
            boolean r3 = r2.mo88430c1(r4, r3)
            if (r3 == 0) goto L_0x0049
            r0 = 5
            goto L_0x00aa
        L_0x0049:
            int r3 = r2.f74802O
            r6 = 4
            if (r3 != 0) goto L_0x008e
            int r3 = r4.getTop()
            boolean r1 = r2.f74816b
            if (r1 == 0) goto L_0x0068
            int r5 = r2.f74790C
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.f74793F
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L_0x0092
            goto L_0x00aa
        L_0x0068:
            int r1 = r2.f74791D
            if (r3 >= r1) goto L_0x007e
            int r1 = r2.f74793F
            int r1 = r3 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r3 >= r1) goto L_0x0077
            goto L_0x00aa
        L_0x0077:
            boolean r3 = r2.mo88432d1()
            if (r3 == 0) goto L_0x00a9
            goto L_0x0092
        L_0x007e:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f74793F
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L_0x0092
            goto L_0x00a9
        L_0x008e:
            boolean r3 = r2.f74816b
            if (r3 == 0) goto L_0x0094
        L_0x0092:
            r0 = r6
            goto L_0x00aa
        L_0x0094:
            int r3 = r4.getTop()
            int r0 = r2.f74791D
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f74793F
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L_0x0092
        L_0x00a9:
            r0 = r5
        L_0x00aa:
            r3 = 0
            r2.mo88436f1(r4, r0, r3)
            r2.f74803P = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo51076D(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    /* renamed from: D0 */
    public void mo88399D0(@C0359n0 C31172f fVar) {
        this.f74809V.remove(fVar);
    }

    /* renamed from: E */
    public boolean mo51077E(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 V v, @C0359n0 MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f74798K == 1 && actionMasked == 0) {
            return true;
        }
        if (mo88428b1()) {
            this.f74800M.mo53486M(motionEvent);
        }
        if (actionMasked == 0) {
            mo88401F0();
        }
        if (this.f74810W == null) {
            this.f74810W = VelocityTracker.obtain();
        }
        this.f74810W.addMovement(motionEvent);
        if (mo88428b1() && actionMasked == 2 && !this.f74801N && Math.abs(((float) this.f74812Y) - motionEvent.getY()) > ((float) this.f74800M.mo53478E())) {
            this.f74800M.mo53502d(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f74801N;
    }

    /* renamed from: E0 */
    public final void mo88400E0(V v, C18065l0.C18066a aVar, int i) {
        C18196h2.m82638u1(v, aVar, (CharSequence) null, mo88429c0(i));
    }

    /* renamed from: F0 */
    public final void mo88401F0() {
        this.f74811X = -1;
        VelocityTracker velocityTracker = this.f74810W;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f74810W = null;
        }
    }

    /* renamed from: G0 */
    public final void mo88402G0(@C0359n0 SavedState savedState) {
        int i = this.f74814a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f74821e = savedState.f74844d;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f74816b = savedState.f74845e;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f74795H = savedState.f74846f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f74796I = savedState.f74847g;
            }
        }
    }

    /* renamed from: H0 */
    public final void mo88403H0(V v, Runnable runnable) {
        if (mo88397B0(v)) {
            v.post(runnable);
        } else {
            runnable.run();
        }
    }

    @Deprecated
    /* renamed from: I0 */
    public void mo88404I0(C31172f fVar) {
        this.f74809V.clear();
        if (fVar != null) {
            this.f74809V.add(fVar);
        }
    }

    /* renamed from: J0 */
    public void mo88405J0(boolean z) {
        this.f74797J = z;
    }

    /* renamed from: K0 */
    public void mo88406K0(int i) {
        if (i >= 0) {
            this.f74789B = i;
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    /* renamed from: L0 */
    public void mo88407L0(boolean z) {
        int i;
        if (this.f74816b != z) {
            this.f74816b = z;
            if (this.f74807T != null) {
                mo88423Z();
            }
            if (!this.f74816b || this.f74798K != 6) {
                i = this.f74798K;
            } else {
                i = 3;
            }
            mo88420X0(i);
            mo88438g1();
        }
    }

    /* renamed from: M0 */
    public void mo88408M0(boolean z) {
        this.f74830n = z;
    }

    /* renamed from: N0 */
    public void mo88409N0(@C0379x(from = 0.0d, fromInclusive = false, mo1016to = 1.0d, toInclusive = false) float f) {
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f74792E = f;
        if (this.f74807T != null) {
            mo88425a0();
        }
    }

    /* renamed from: O0 */
    public void mo88410O0(boolean z) {
        if (this.f74795H != z) {
            this.f74795H = z;
            if (!z && this.f74798K == 5) {
                mo88418W0(4);
            }
            mo88438g1();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: P0 */
    public void mo88411P0(boolean z) {
        this.f74795H = z;
    }

    /* renamed from: Q0 */
    public void mo88412Q0(@C0372t0 int i) {
        this.f74828l = i;
    }

    /* renamed from: R0 */
    public void mo88413R0(@C0372t0 int i) {
        this.f74827k = i;
    }

    /* renamed from: S0 */
    public void mo88414S0(int i) {
        mo88415T0(i, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* renamed from: T0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo88415T0(int r4, boolean r5) {
        /*
            r3 = this;
            r0 = -1
            r1 = 1
            r2 = 0
            if (r4 != r0) goto L_0x000c
            boolean r4 = r3.f74822f
            if (r4 != 0) goto L_0x0015
            r3.f74822f = r1
            goto L_0x001f
        L_0x000c:
            boolean r0 = r3.f74822f
            if (r0 != 0) goto L_0x0017
            int r0 = r3.f74821e
            if (r0 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r1 = r2
            goto L_0x001f
        L_0x0017:
            r3.f74822f = r2
            int r4 = java.lang.Math.max(r2, r4)
            r3.f74821e = r4
        L_0x001f:
            if (r1 == 0) goto L_0x0024
            r3.mo88443j1(r5)
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo88415T0(int, boolean):void");
    }

    /* renamed from: U0 */
    public void mo88416U0(int i) {
        this.f74814a = i;
    }

    /* renamed from: V0 */
    public void mo88417V0(boolean z) {
        this.f74796I = z;
    }

    /* renamed from: W0 */
    public void mo88418W0(int i) {
        String str;
        int i2;
        if (i == 1 || i == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("STATE_");
            if (i == 1) {
                str = "DRAGGING";
            } else {
                str = "SETTLING";
            }
            sb.append(str);
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        } else if (this.f74795H || i != 5) {
            if (i != 6 || !this.f74816b || mo88455v0(i) > this.f74790C) {
                i2 = i;
            } else {
                i2 = 3;
            }
            WeakReference<V> weakReference = this.f74807T;
            if (weakReference == null || weakReference.get() == null) {
                mo88420X0(i);
                return;
            }
            View view = (View) this.f74807T.get();
            mo88403H0(view, new C31167a(view, i2));
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot set state: ");
            sb2.append(i);
        }
    }

    /* renamed from: X */
    public final int mo88419X(V v, @C0324b1 int i, int i2) {
        return C18196h2.m82564c(v, v.getResources().getString(i), mo88429c0(i2));
    }

    /* renamed from: X0 */
    public void mo88420X0(int i) {
        View view;
        if (this.f74798K != i) {
            this.f74798K = i;
            if (i == 4 || i == 3 || i == 6 || (this.f74795H && i == 5)) {
                this.f74799L = i;
            }
            WeakReference<V> weakReference = this.f74807T;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                if (i == 3) {
                    mo88441i1(true);
                } else if (i == 6 || i == 5 || i == 4) {
                    mo88441i1(false);
                }
                mo88440h1(i);
                for (int i2 = 0; i2 < this.f74809V.size(); i2++) {
                    this.f74809V.get(i2).mo68140c(view, i);
                }
                mo88438g1();
            }
        }
    }

    /* renamed from: Y */
    public void mo88421Y(@C0359n0 C31172f fVar) {
        if (!this.f74809V.contains(fVar)) {
            this.f74809V.add(fVar);
        }
    }

    /* renamed from: Y0 */
    public void mo88422Y0(boolean z) {
        this.f74818c = z;
    }

    /* renamed from: Z */
    public final void mo88423Z() {
        int b0 = mo88427b0();
        if (this.f74816b) {
            this.f74793F = Math.max(this.f74806S - b0, this.f74790C);
        } else {
            this.f74793F = this.f74806S - b0;
        }
    }

    /* renamed from: Z0 */
    public final void mo88424Z0(@C0359n0 View view) {
        boolean z;
        if (Build.VERSION.SDK_INT < 29 || mo88459z0() || this.f74822f) {
            z = false;
        } else {
            z = true;
        }
        if (this.f74831o || this.f74832p || this.f74833q || this.f74835s || this.f74836t || this.f74837u || z) {
            C31432x.m127009d(view, new C31169c(z));
        }
    }

    /* renamed from: a0 */
    public final void mo88425a0() {
        this.f74791D = (int) (((float) this.f74806S) * (1.0f - this.f74792E));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: a1 */
    public boolean mo88426a1(long j, @C0379x(from = 0.0d, mo1016to = 100.0d) float f) {
        return false;
    }

    /* renamed from: b0 */
    public final int mo88427b0() {
        int i;
        if (this.f74822f) {
            return Math.min(Math.max(this.f74823g, this.f74806S - ((this.f74805R * 9) / 16)), this.f74804Q) + this.f74838v;
        }
        if (this.f74830n || this.f74831o || (i = this.f74829m) <= 0) {
            return this.f74821e + this.f74838v;
        }
        return Math.max(this.f74821e, i + this.f74824h);
    }

    /* renamed from: b1 */
    public final boolean mo88428b1() {
        return this.f74800M != null && (this.f74797J || this.f74798K == 1);
    }

    /* renamed from: c0 */
    public final C18098w0 mo88429c0(int i) {
        return new C31171e(i);
    }

    /* renamed from: c1 */
    public boolean mo88430c1(@C0359n0 View view, float f) {
        if (this.f74796I) {
            return true;
        }
        if (view.getTop() < this.f74793F) {
            return false;
        }
        if (Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f74793F)) / ((float) mo88427b0()) > 0.5f) {
            return true;
        }
        return false;
    }

    /* renamed from: d0 */
    public final void mo88431d0(@C0359n0 Context context) {
        if (this.f74840x != null) {
            C31525j jVar = new C31525j(this.f74840x);
            this.f74825i = jVar;
            jVar.mo90750Z(context);
            ColorStateList colorStateList = this.f74826j;
            if (colorStateList != null) {
                this.f74825i.mo90777o0(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(16842801, typedValue, true);
            this.f74825i.setTint(typedValue.data);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: d1 */
    public boolean mo88432d1() {
        return false;
    }

    /* renamed from: e0 */
    public final void mo88433e0() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f74788A = ofFloat;
        ofFloat.setDuration(500);
        this.f74788A.addUpdateListener(new C31168b());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: e1 */
    public boolean mo88434e1() {
        return true;
    }

    @C0344h1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: f0 */
    public void mo88435f0() {
        this.f74788A = null;
    }

    /* renamed from: f1 */
    public final void mo88436f1(View view, int i, boolean z) {
        boolean z2;
        int v0 = mo88455v0(i);
        C18553d dVar = this.f74800M;
        if (dVar == null || (!z ? !dVar.mo53497X(view, view.getLeft(), v0) : !dVar.mo53495V(view.getLeft(), v0))) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            mo88420X0(2);
            mo88440h1(i);
            this.f74842z.mo88470c(i);
            return;
        }
        mo88420X0(i);
    }

    /* renamed from: g0 */
    public void mo88437g0(int i) {
        float f;
        float f2;
        View view = (View) this.f74807T.get();
        if (view != null && !this.f74809V.isEmpty()) {
            int i2 = this.f74793F;
            if (i > i2 || i2 == mo88444k0()) {
                int i3 = this.f74793F;
                f = (float) (i3 - i);
                f2 = (float) (this.f74806S - i3);
            } else {
                int i4 = this.f74793F;
                f = (float) (i4 - i);
                f2 = (float) (i4 - mo88444k0());
            }
            float f3 = f / f2;
            for (int i5 = 0; i5 < this.f74809V.size(); i5++) {
                this.f74809V.get(i5).mo68139b(view, f3);
            }
        }
    }

    /* renamed from: g1 */
    public final void mo88438g1() {
        View view;
        WeakReference<V> weakReference = this.f74807T;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            C18196h2.m82626r1(view, 524288);
            C18196h2.m82626r1(view, 262144);
            C18196h2.m82626r1(view, 1048576);
            int i = this.f74817b0;
            if (i != -1) {
                C18196h2.m82626r1(view, i);
            }
            int i2 = 6;
            if (!this.f74816b && this.f74798K != 6) {
                this.f74817b0 = mo88419X(view, C31076a.C31089m.bottomsheet_action_expand_halfway, 6);
            }
            if (this.f74795H && this.f74798K != 5) {
                mo88400E0(view, C18065l0.C18066a.f46689z, 5);
            }
            int i3 = this.f74798K;
            if (i3 == 3) {
                if (this.f74816b) {
                    i2 = 4;
                }
                mo88400E0(view, C18065l0.C18066a.f46688y, i2);
            } else if (i3 == 4) {
                if (this.f74816b) {
                    i2 = 3;
                }
                mo88400E0(view, C18065l0.C18066a.f46687x, i2);
            } else if (i3 == 6) {
                mo88400E0(view, C18065l0.C18066a.f46688y, 4);
                mo88400E0(view, C18065l0.C18066a.f46687x, 3);
            }
        }
    }

    /* renamed from: h */
    public void mo51084h(@C0359n0 CoordinatorLayout.C16981g gVar) {
        super.mo51084h(gVar);
        this.f74807T = null;
        this.f74800M = null;
    }

    @C0363p0
    @C0344h1
    /* renamed from: h0 */
    public View mo88439h0(View view) {
        if (C18196h2.m82545W0(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View h0 = mo88439h0(viewGroup.getChildAt(i));
            if (h0 != null) {
                return h0;
            }
        }
        return null;
    }

    /* renamed from: h1 */
    public final void mo88440h1(int i) {
        boolean z;
        ValueAnimator valueAnimator;
        float f;
        if (i != 2) {
            if (i == 3) {
                z = true;
            } else {
                z = false;
            }
            if (this.f74841y != z) {
                this.f74841y = z;
                if (this.f74825i != null && (valueAnimator = this.f74788A) != null) {
                    if (valueAnimator.isRunning()) {
                        this.f74788A.reverse();
                        return;
                    }
                    if (z) {
                        f = 0.0f;
                    } else {
                        f = 1.0f;
                    }
                    this.f74788A.setFloatValues(new float[]{1.0f - f, f});
                    this.f74788A.start();
                }
            }
        }
    }

    /* renamed from: i1 */
    public final void mo88441i1(boolean z) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.f74807T;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z) {
                    if (this.f74815a0 == null) {
                        this.f74815a0 = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i = 0; i < childCount; i++) {
                    V childAt = coordinatorLayout.getChildAt(i);
                    if (childAt != this.f74807T.get()) {
                        if (z) {
                            this.f74815a0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            if (this.f74818c) {
                                C18196h2.m82531R1(childAt, 4);
                            }
                        } else if (this.f74818c && (map = this.f74815a0) != null && map.containsKey(childAt)) {
                            C18196h2.m82531R1(childAt, this.f74815a0.get(childAt).intValue());
                        }
                    }
                }
                if (!z) {
                    this.f74815a0 = null;
                } else if (this.f74818c) {
                    ((View) this.f74807T.get()).sendAccessibilityEvent(8);
                }
            }
        }
    }

    /* renamed from: j0 */
    public final int mo88442j0(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    /* renamed from: j1 */
    public final void mo88443j1(boolean z) {
        View view;
        if (this.f74807T != null) {
            mo88423Z();
            if (this.f74798K == 4 && (view = (View) this.f74807T.get()) != null) {
                if (z) {
                    mo88418W0(4);
                } else {
                    view.requestLayout();
                }
            }
        }
    }

    /* renamed from: k */
    public void mo51087k() {
        super.mo51087k();
        this.f74807T = null;
        this.f74800M = null;
    }

    /* renamed from: k0 */
    public int mo88444k0() {
        int i;
        if (this.f74816b) {
            return this.f74790C;
        }
        int i2 = this.f74789B;
        if (this.f74834r) {
            i = 0;
        } else {
            i = this.f74839w;
        }
        return Math.max(i2, i);
    }

    /* renamed from: l */
    public boolean mo51088l(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 V v, @C0359n0 MotionEvent motionEvent) {
        C18553d dVar;
        boolean z;
        View view;
        if (!v.isShown() || !this.f74797J) {
            this.f74801N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            mo88401F0();
        }
        if (this.f74810W == null) {
            this.f74810W = VelocityTracker.obtain();
        }
        this.f74810W.addMovement(motionEvent);
        View view2 = null;
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.f74812Y = (int) motionEvent.getY();
            if (this.f74798K != 2) {
                WeakReference<View> weakReference = this.f74808U;
                if (weakReference != null) {
                    view = weakReference.get();
                } else {
                    view = null;
                }
                if (view != null && coordinatorLayout.mo51005G(view, x, this.f74812Y)) {
                    this.f74811X = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f74813Z = true;
                }
            }
            if (this.f74811X != -1 || coordinatorLayout.mo51005G(v, x, this.f74812Y)) {
                z = false;
            } else {
                z = true;
            }
            this.f74801N = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f74813Z = false;
            this.f74811X = -1;
            if (this.f74801N) {
                this.f74801N = false;
                return false;
            }
        }
        if (!this.f74801N && (dVar = this.f74800M) != null && dVar.mo53496W(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.f74808U;
        if (weakReference2 != null) {
            view2 = weakReference2.get();
        }
        if (actionMasked != 2 || view2 == null || this.f74801N || this.f74798K == 1 || coordinatorLayout.mo51005G(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f74800M == null || Math.abs(((float) this.f74812Y) - motionEvent.getY()) <= ((float) this.f74800M.mo53478E())) {
            return false;
        }
        return true;
    }

    @C0379x(from = 0.0d, mo1016to = 1.0d)
    /* renamed from: l0 */
    public float mo88445l0() {
        return this.f74792E;
    }

    /* renamed from: m */
    public boolean mo51089m(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 V v, int i) {
        boolean z;
        float f;
        if (C18196h2.m82538U(coordinatorLayout) && !C18196h2.m82538U(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.f74807T == null) {
            this.f74823g = coordinatorLayout.getResources().getDimensionPixelSize(C31076a.C31082f.design_bottom_sheet_peek_height_min);
            mo88424Z0(v);
            this.f74807T = new WeakReference<>(v);
            C31525j jVar = this.f74825i;
            if (jVar != null) {
                C18196h2.m82502I1(v, jVar);
                C31525j jVar2 = this.f74825i;
                float f2 = this.f74794G;
                if (f2 == -1.0f) {
                    f2 = C18196h2.m82529R(v);
                }
                jVar2.mo90775n0(f2);
                if (this.f74798K == 3) {
                    z = true;
                } else {
                    z = false;
                }
                this.f74841y = z;
                C31525j jVar3 = this.f74825i;
                if (z) {
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                jVar3.mo90780p0(f);
            } else {
                ColorStateList colorStateList = this.f74826j;
                if (colorStateList != null) {
                    C18196h2.m82506J1(v, colorStateList);
                }
            }
            mo88438g1();
            if (C18196h2.m82541V(v) == 0) {
                C18196h2.m82531R1(v, 1);
            }
        }
        if (this.f74800M == null) {
            this.f74800M = C18553d.m83926q(coordinatorLayout, this.f74819c0);
        }
        int top = v.getTop();
        coordinatorLayout.mo51012N(v, i);
        this.f74805R = coordinatorLayout.getWidth();
        this.f74806S = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.f74804Q = height;
        int i2 = this.f74806S;
        int i3 = i2 - height;
        int i4 = this.f74839w;
        if (i3 < i4) {
            if (this.f74834r) {
                this.f74804Q = i2;
            } else {
                this.f74804Q = i2 - i4;
            }
        }
        this.f74790C = Math.max(0, i2 - this.f74804Q);
        mo88425a0();
        mo88423Z();
        int i5 = this.f74798K;
        if (i5 == 3) {
            C18196h2.m82578f1(v, mo88444k0());
        } else if (i5 == 6) {
            C18196h2.m82578f1(v, this.f74791D);
        } else if (this.f74795H && i5 == 5) {
            C18196h2.m82578f1(v, this.f74806S);
        } else if (i5 == 4) {
            C18196h2.m82578f1(v, this.f74793F);
        } else if (i5 == 1 || i5 == 2) {
            C18196h2.m82578f1(v, top - v.getTop());
        }
        this.f74808U = new WeakReference<>(mo88439h0(v));
        for (int i6 = 0; i6 < this.f74809V.size(); i6++) {
            this.f74809V.get(i6).mo88469a(v);
        }
        return true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: m0 */
    public int mo88446m0() {
        return this.f74799L;
    }

    /* renamed from: n */
    public boolean mo51090n(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 V v, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        v.measure(mo88442j0(i, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.f74827k, marginLayoutParams.width), mo88442j0(i3, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, this.f74828l, marginLayoutParams.height));
        return true;
    }

    /* renamed from: n0 */
    public C31525j mo88447n0() {
        return this.f74825i;
    }

    @C0372t0
    /* renamed from: o0 */
    public int mo88448o0() {
        return this.f74828l;
    }

    /* renamed from: p */
    public boolean mo51092p(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 V v, @C0359n0 View view, float f, float f2) {
        WeakReference<View> weakReference;
        if (!mo88398C0() || (weakReference = this.f74808U) == null || view != weakReference.get()) {
            return false;
        }
        if (this.f74798K != 3 || super.mo51092p(coordinatorLayout, v, view, f, f2)) {
            return true;
        }
        return false;
    }

    @C0372t0
    /* renamed from: p0 */
    public int mo88449p0() {
        return this.f74827k;
    }

    /* renamed from: q0 */
    public int mo88450q0() {
        if (this.f74822f) {
            return -1;
        }
        return this.f74821e;
    }

    /* renamed from: r */
    public void mo51094r(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 V v, @C0359n0 View view, int i, int i2, @C0359n0 int[] iArr, int i3) {
        View view2;
        if (i3 != 1) {
            WeakReference<View> weakReference = this.f74808U;
            if (weakReference != null) {
                view2 = weakReference.get();
            } else {
                view2 = null;
            }
            if (!mo88398C0() || view == view2) {
                int top = v.getTop();
                int i4 = top - i2;
                if (i2 > 0) {
                    if (i4 < mo88444k0()) {
                        int k0 = top - mo88444k0();
                        iArr[1] = k0;
                        C18196h2.m82578f1(v, -k0);
                        mo88420X0(3);
                    } else if (this.f74797J) {
                        iArr[1] = i2;
                        C18196h2.m82578f1(v, -i2);
                        mo88420X0(1);
                    } else {
                        return;
                    }
                } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                    int i5 = this.f74793F;
                    if (i4 > i5 && !this.f74795H) {
                        int i6 = top - i5;
                        iArr[1] = i6;
                        C18196h2.m82578f1(v, -i6);
                        mo88420X0(4);
                    } else if (this.f74797J) {
                        iArr[1] = i2;
                        C18196h2.m82578f1(v, -i2);
                        mo88420X0(1);
                    } else {
                        return;
                    }
                }
                mo88437g0(v.getTop());
                this.f74802O = i2;
                this.f74803P = true;
            }
        }
    }

    @C0344h1
    /* renamed from: r0 */
    public int mo88451r0() {
        return this.f74823g;
    }

    /* renamed from: s0 */
    public int mo88452s0() {
        return this.f74814a;
    }

    /* renamed from: t0 */
    public boolean mo88453t0() {
        return this.f74796I;
    }

    /* renamed from: u */
    public void mo51097u(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 V v, @C0359n0 View view, int i, int i2, int i3, int i4, int i5, @C0359n0 int[] iArr) {
    }

    /* renamed from: u0 */
    public int mo88454u0() {
        return this.f74798K;
    }

    /* renamed from: v0 */
    public final int mo88455v0(int i) {
        if (i == 3) {
            return mo88444k0();
        }
        if (i == 4) {
            return this.f74793F;
        }
        if (i == 5) {
            return this.f74806S;
        }
        if (i == 6) {
            return this.f74791D;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i);
    }

    /* renamed from: w0 */
    public final float mo88456w0() {
        VelocityTracker velocityTracker = this.f74810W;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f74820d);
        return this.f74810W.getYVelocity(this.f74811X);
    }

    /* renamed from: x0 */
    public boolean mo88457x0() {
        return this.f74797J;
    }

    /* renamed from: y */
    public void mo51101y(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 V v, @C0359n0 Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.mo51101y(coordinatorLayout, v, savedState.mo53419a());
        mo88402G0(savedState);
        int i = savedState.f74843c;
        if (i == 1 || i == 2) {
            this.f74798K = 4;
            this.f74799L = 4;
            return;
        }
        this.f74798K = i;
        this.f74799L = i;
    }

    /* renamed from: y0 */
    public boolean mo88458y0() {
        return this.f74816b;
    }

    @C0359n0
    /* renamed from: z */
    public Parcelable mo51102z(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 V v) {
        return new SavedState(super.mo51102z(coordinatorLayout, v), (BottomSheetBehavior<?>) this);
    }

    /* renamed from: z0 */
    public boolean mo88459z0() {
        return this.f74830n;
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$j */
    public class C31176j {

        /* renamed from: a */
        public int f74858a;

        /* renamed from: b */
        public boolean f74859b;

        /* renamed from: c */
        public final Runnable f74860c;

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$j$a */
        public class C31177a implements Runnable {
            public C31177a() {
            }

            public void run() {
                boolean unused = C31176j.this.f74859b = false;
                C18553d dVar = BottomSheetBehavior.this.f74800M;
                if (dVar == null || !dVar.mo53513o(true)) {
                    C31176j jVar = C31176j.this;
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    if (bottomSheetBehavior.f74798K == 2) {
                        bottomSheetBehavior.mo88420X0(jVar.f74858a);
                        return;
                    }
                    return;
                }
                C31176j jVar2 = C31176j.this;
                jVar2.mo88470c(jVar2.f74858a);
            }
        }

        public C31176j() {
            this.f74860c = new C31177a();
        }

        /* renamed from: c */
        public void mo88470c(int i) {
            WeakReference<V> weakReference = BottomSheetBehavior.this.f74807T;
            if (weakReference != null && weakReference.get() != null) {
                this.f74858a = i;
                if (!this.f74859b) {
                    C18196h2.m82618p1((View) BottomSheetBehavior.this.f74807T.get(), this.f74860c);
                    this.f74859b = true;
                }
            }
        }

        public /* synthetic */ C31176j(BottomSheetBehavior bottomSheetBehavior, C31167a aVar) {
            this();
        }
    }

    public BottomSheetBehavior(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        this.f74824h = context.getResources().getDimensionPixelSize(C31076a.C31082f.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C31076a.C31091o.BottomSheetBehavior_Layout);
        int i2 = C31076a.C31091o.BottomSheetBehavior_Layout_backgroundTint;
        if (obtainStyledAttributes.hasValue(i2)) {
            this.f74826j = C31500c.m127363a(context, obtainStyledAttributes, i2);
        }
        if (obtainStyledAttributes.hasValue(C31076a.C31091o.BottomSheetBehavior_Layout_shapeAppearance)) {
            this.f74840x = C31534o.m127565e(context, attributeSet, C31076a.C31079c.bottomSheetStyle, f74787w0).mo90843m();
        }
        mo88431d0(context);
        mo88433e0();
        this.f74794G = obtainStyledAttributes.getDimension(C31076a.C31091o.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        int i3 = C31076a.C31091o.BottomSheetBehavior_Layout_android_maxWidth;
        if (obtainStyledAttributes.hasValue(i3)) {
            mo88413R0(obtainStyledAttributes.getDimensionPixelSize(i3, -1));
        }
        int i4 = C31076a.C31091o.BottomSheetBehavior_Layout_android_maxHeight;
        if (obtainStyledAttributes.hasValue(i4)) {
            mo88412Q0(obtainStyledAttributes.getDimensionPixelSize(i4, -1));
        }
        int i5 = C31076a.C31091o.BottomSheetBehavior_Layout_behavior_peekHeight;
        TypedValue peekValue = obtainStyledAttributes.peekValue(i5);
        if (peekValue == null || (i = peekValue.data) != -1) {
            mo88414S0(obtainStyledAttributes.getDimensionPixelSize(i5, -1));
        } else {
            mo88414S0(i);
        }
        mo88410O0(obtainStyledAttributes.getBoolean(C31076a.C31091o.BottomSheetBehavior_Layout_behavior_hideable, false));
        mo88408M0(obtainStyledAttributes.getBoolean(C31076a.C31091o.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false));
        mo88407L0(obtainStyledAttributes.getBoolean(C31076a.C31091o.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        mo88417V0(obtainStyledAttributes.getBoolean(C31076a.C31091o.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        mo88405J0(obtainStyledAttributes.getBoolean(C31076a.C31091o.BottomSheetBehavior_Layout_behavior_draggable, true));
        mo88416U0(obtainStyledAttributes.getInt(C31076a.C31091o.BottomSheetBehavior_Layout_behavior_saveFlags, 0));
        mo88409N0(obtainStyledAttributes.getFloat(C31076a.C31091o.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f));
        int i6 = C31076a.C31091o.BottomSheetBehavior_Layout_behavior_expandedOffset;
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(i6);
        if (peekValue2 == null || peekValue2.type != 16) {
            mo88406K0(obtainStyledAttributes.getDimensionPixelOffset(i6, 0));
        } else {
            mo88406K0(peekValue2.data);
        }
        this.f74831o = obtainStyledAttributes.getBoolean(C31076a.C31091o.BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets, false);
        this.f74832p = obtainStyledAttributes.getBoolean(C31076a.C31091o.BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets, false);
        this.f74833q = obtainStyledAttributes.getBoolean(C31076a.C31091o.BottomSheetBehavior_Layout_paddingRightSystemWindowInsets, false);
        this.f74834r = obtainStyledAttributes.getBoolean(C31076a.C31091o.BottomSheetBehavior_Layout_paddingTopSystemWindowInsets, true);
        this.f74835s = obtainStyledAttributes.getBoolean(C31076a.C31091o.BottomSheetBehavior_Layout_marginLeftSystemWindowInsets, false);
        this.f74836t = obtainStyledAttributes.getBoolean(C31076a.C31091o.BottomSheetBehavior_Layout_marginRightSystemWindowInsets, false);
        this.f74837u = obtainStyledAttributes.getBoolean(C31076a.C31091o.BottomSheetBehavior_Layout_marginTopSystemWindowInsets, false);
        obtainStyledAttributes.recycle();
        this.f74820d = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}

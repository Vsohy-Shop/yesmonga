package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.annotation.C0344h1;
import androidx.annotation.C0346i;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0372t0;
import androidx.annotation.RestrictTo;
import androidx.core.p027os.C17821p0;
import androidx.core.util.C18001r;
import androidx.core.view.C18019a;
import androidx.core.view.C18145d2;
import androidx.core.view.C18196h2;
import androidx.core.view.C18327o1;
import androidx.core.view.C18336p1;
import androidx.core.view.C18338p3;
import androidx.core.view.C18346q1;
import androidx.core.view.C18363s1;
import androidx.core.view.accessibility.C18035b;
import androidx.core.view.accessibility.C18065l0;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.C20030a;
import androidx.recyclerview.widget.C20099a;
import androidx.recyclerview.widget.C20102a0;
import androidx.recyclerview.widget.C20128g;
import androidx.recyclerview.widget.C20167j0;
import androidx.recyclerview.widget.C20172k0;
import androidx.recyclerview.widget.C20186m;
import com.contentsquare.android.api.C14092c;
import com.google.firebase.installations.local.C33093b;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlinx.serialization.json.internal.C12361b;

public class RecyclerView extends ViewGroup implements C18145d2, C18336p1, C18346q1 {

    /* renamed from: A2 */
    public static final Interpolator f51382A2 = new C20056c();

    /* renamed from: R1 */
    public static final String f51383R1 = "RecyclerView";

    /* renamed from: S1 */
    public static final boolean f51384S1 = false;

    /* renamed from: T1 */
    public static final boolean f51385T1 = false;

    /* renamed from: U1 */
    public static final int[] f51386U1 = {16843830};

    /* renamed from: V1 */
    public static final boolean f51387V1 = false;

    /* renamed from: W1 */
    public static final boolean f51388W1 = true;

    /* renamed from: X1 */
    public static final boolean f51389X1 = true;

    /* renamed from: Y1 */
    public static final boolean f51390Y1 = true;

    /* renamed from: Z1 */
    public static final boolean f51391Z1 = false;

    /* renamed from: a2 */
    public static final boolean f51392a2 = false;

    /* renamed from: b2 */
    public static final boolean f51393b2 = false;

    /* renamed from: c2 */
    public static final int f51394c2 = 0;

    /* renamed from: d2 */
    public static final int f51395d2 = 1;

    /* renamed from: e2 */
    public static final int f51396e2 = 1;

    /* renamed from: f2 */
    public static final int f51397f2 = -1;

    /* renamed from: g2 */
    public static final long f51398g2 = -1;

    /* renamed from: h2 */
    public static final int f51399h2 = -1;

    /* renamed from: i2 */
    public static final int f51400i2 = 0;

    /* renamed from: j2 */
    public static final int f51401j2 = 1;

    /* renamed from: k2 */
    public static final int f51402k2 = Integer.MIN_VALUE;

    /* renamed from: l2 */
    public static final int f51403l2 = 2000;

    /* renamed from: m2 */
    public static final String f51404m2 = "RV Scroll";

    /* renamed from: n2 */
    public static final String f51405n2 = "RV OnLayout";

    /* renamed from: o2 */
    public static final String f51406o2 = "RV FullInvalidate";

    /* renamed from: p2 */
    public static final String f51407p2 = "RV PartialInvalidate";

    /* renamed from: q2 */
    public static final String f51408q2 = "RV OnBindView";

    /* renamed from: r2 */
    public static final String f51409r2 = "RV Prefetch";

    /* renamed from: s2 */
    public static final String f51410s2 = "RV Nested Prefetch";

    /* renamed from: t2 */
    public static final String f51411t2 = "RV CreateView";

    /* renamed from: u2 */
    public static final Class<?>[] f51412u2;

    /* renamed from: v2 */
    public static final int f51413v2 = -1;

    /* renamed from: w2 */
    public static final int f51414w2 = 0;

    /* renamed from: x2 */
    public static final int f51415x2 = 1;

    /* renamed from: y2 */
    public static final int f51416y2 = 2;

    /* renamed from: z2 */
    public static final long f51417z2 = Long.MAX_VALUE;

    /* renamed from: A1 */
    public boolean f51418A1;

    /* renamed from: B1 */
    public boolean f51419B1;

    /* renamed from: C1 */
    public C20069l.C20072c f51420C1;

    /* renamed from: D1 */
    public boolean f51421D1;
    @C0344h1

    /* renamed from: E0 */
    public C20076o f51422E0;

    /* renamed from: E1 */
    public C20102a0 f51423E1;

    /* renamed from: F0 */
    public C20090x f51424F0;

    /* renamed from: F1 */
    public C20066j f51425F1;

    /* renamed from: G0 */
    public final List<C20090x> f51426G0;

    /* renamed from: G1 */
    public final int[] f51427G1;

    /* renamed from: H0 */
    public final ArrayList<C20075n> f51428H0;

    /* renamed from: H1 */
    public C18363s1 f51429H1;

    /* renamed from: I0 */
    public final ArrayList<C20084s> f51430I0;

    /* renamed from: I1 */
    public final int[] f51431I1;

    /* renamed from: J0 */
    public C20084s f51432J0;

    /* renamed from: J1 */
    public final int[] f51433J1;

    /* renamed from: K0 */
    public boolean f51434K0;

    /* renamed from: K1 */
    public final int[] f51435K1;

    /* renamed from: L0 */
    public boolean f51436L0;
    @C0344h1

    /* renamed from: L1 */
    public final List<C20061e0> f51437L1;

    /* renamed from: M0 */
    public boolean f51438M0;

    /* renamed from: M1 */
    public Runnable f51439M1;
    @C0344h1

    /* renamed from: N0 */
    public boolean f51440N0;

    /* renamed from: N1 */
    public boolean f51441N1;

    /* renamed from: O0 */
    public int f51442O0;

    /* renamed from: O1 */
    public int f51443O1;

    /* renamed from: P0 */
    public boolean f51444P0;

    /* renamed from: P1 */
    public int f51445P1;

    /* renamed from: Q0 */
    public boolean f51446Q0;

    /* renamed from: Q1 */
    public final C20172k0.C20174b f51447Q1;

    /* renamed from: R0 */
    public boolean f51448R0;

    /* renamed from: S0 */
    public int f51449S0;

    /* renamed from: T0 */
    public boolean f51450T0;

    /* renamed from: U0 */
    public final AccessibilityManager f51451U0;

    /* renamed from: V0 */
    public List<C20082q> f51452V0;

    /* renamed from: W0 */
    public boolean f51453W0;

    /* renamed from: X0 */
    public boolean f51454X0;

    /* renamed from: Y0 */
    public int f51455Y0;

    /* renamed from: Z0 */
    public int f51456Z0;

    /* renamed from: a */
    public final C20091y f51457a;
    @C0359n0

    /* renamed from: a1 */
    public C20067k f51458a1;

    /* renamed from: b */
    public final C20089w f51459b;

    /* renamed from: b1 */
    public EdgeEffect f51460b1;

    /* renamed from: c */
    public SavedState f51461c;

    /* renamed from: c1 */
    public EdgeEffect f51462c1;

    /* renamed from: d */
    public C20099a f51463d;

    /* renamed from: d1 */
    public EdgeEffect f51464d1;

    /* renamed from: e */
    public C20128g f51465e;

    /* renamed from: e1 */
    public EdgeEffect f51466e1;

    /* renamed from: f */
    public final C20172k0 f51467f;

    /* renamed from: f1 */
    public C20069l f51468f1;

    /* renamed from: g */
    public boolean f51469g;

    /* renamed from: g1 */
    public int f51470g1;

    /* renamed from: h1 */
    public int f51471h1;

    /* renamed from: i1 */
    public VelocityTracker f51472i1;

    /* renamed from: j1 */
    public int f51473j1;

    /* renamed from: k1 */
    public int f51474k1;

    /* renamed from: l1 */
    public int f51475l1;

    /* renamed from: m1 */
    public int f51476m1;

    /* renamed from: n1 */
    public int f51477n1;

    /* renamed from: o1 */
    public C20083r f51478o1;

    /* renamed from: p1 */
    public final int f51479p1;

    /* renamed from: q1 */
    public final int f51480q1;

    /* renamed from: r1 */
    public float f51481r1;

    /* renamed from: s1 */
    public float f51482s1;

    /* renamed from: t1 */
    public boolean f51483t1;

    /* renamed from: u1 */
    public final C20059d0 f51484u1;

    /* renamed from: v */
    public final Runnable f51485v;

    /* renamed from: v1 */
    public C20186m f51486v1;

    /* renamed from: w */
    public final Rect f51487w;

    /* renamed from: w1 */
    public C20186m.C20188b f51488w1;

    /* renamed from: x */
    public final Rect f51489x;

    /* renamed from: x1 */
    public final C20055b0 f51490x1;

    /* renamed from: y */
    public final RectF f51491y;

    /* renamed from: y1 */
    public C20085t f51492y1;

    /* renamed from: z */
    public Adapter f51493z;

    /* renamed from: z1 */
    public List<C20085t> f51494z1;

    public static abstract class Adapter<VH extends C20061e0> {
        private boolean mHasStableIds = false;
        private final C20064h mObservable = new C20064h();
        private StateRestorationPolicy mStateRestorationPolicy = StateRestorationPolicy.ALLOW;

        public enum StateRestorationPolicy {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public final void bindViewHolder(@C0359n0 VH vh, int i) {
            boolean z;
            if (vh.mBindingAdapter == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                vh.mPosition = i;
                if (hasStableIds()) {
                    vh.mItemId = getItemId(i);
                }
                vh.setFlags(1, 519);
                C17821p0.m81248b(RecyclerView.f51408q2);
            }
            vh.mBindingAdapter = this;
            onBindViewHolder(vh, i, vh.getUnmodifiedPayloads());
            if (z) {
                vh.clearPayload();
                ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
                if (layoutParams instanceof C20081p) {
                    ((C20081p) layoutParams).f51596c = true;
                }
                C17821p0.m81250d();
            }
        }

        public boolean canRestoreState() {
            int i = C20063g.f51548a[this.mStateRestorationPolicy.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i != 2) {
                return true;
            }
            if (getItemCount() > 0) {
                return true;
            }
            return false;
        }

        @C0359n0
        public final VH createViewHolder(@C0359n0 ViewGroup viewGroup, int i) {
            try {
                C17821p0.m81248b(RecyclerView.f51411t2);
                VH onCreateViewHolder = onCreateViewHolder(viewGroup, i);
                if (onCreateViewHolder.itemView.getParent() == null) {
                    onCreateViewHolder.mItemViewType = i;
                    return onCreateViewHolder;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                C17821p0.m81250d();
            }
        }

        public int findRelativeAdapterPositionIn(@C0359n0 Adapter<? extends C20061e0> adapter, @C0359n0 C20061e0 e0Var, int i) {
            if (adapter == this) {
                return i;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i) {
            return -1;
        }

        public int getItemViewType(int i) {
            return 0;
        }

        @C0359n0
        public final StateRestorationPolicy getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.mo59819a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.mo59820b();
        }

        public final void notifyItemChanged(int i) {
            this.mObservable.mo59822d(i, 1);
        }

        public final void notifyItemInserted(int i) {
            this.mObservable.mo59824f(i, 1);
        }

        public final void notifyItemMoved(int i, int i2) {
            this.mObservable.mo59821c(i, i2);
        }

        public final void notifyItemRangeChanged(int i, int i2) {
            this.mObservable.mo59822d(i, i2);
        }

        public final void notifyItemRangeInserted(int i, int i2) {
            this.mObservable.mo59824f(i, i2);
        }

        public final void notifyItemRangeRemoved(int i, int i2) {
            this.mObservable.mo59825g(i, i2);
        }

        public final void notifyItemRemoved(int i) {
            this.mObservable.mo59825g(i, 1);
        }

        public void onAttachedToRecyclerView(@C0359n0 RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(@C0359n0 VH vh, int i);

        public void onBindViewHolder(@C0359n0 VH vh, int i, @C0359n0 List<Object> list) {
            onBindViewHolder(vh, i);
        }

        @C0359n0
        public abstract VH onCreateViewHolder(@C0359n0 ViewGroup viewGroup, int i);

        public void onDetachedFromRecyclerView(@C0359n0 RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(@C0359n0 VH vh) {
            return false;
        }

        public void onViewAttachedToWindow(@C0359n0 VH vh) {
        }

        public void onViewDetachedFromWindow(@C0359n0 VH vh) {
        }

        public void onViewRecycled(@C0359n0 VH vh) {
        }

        public void registerAdapterDataObserver(@C0359n0 C20065i iVar) {
            this.mObservable.registerObserver(iVar);
        }

        public void setHasStableIds(boolean z) {
            if (!hasObservers()) {
                this.mHasStableIds = z;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public void setStateRestorationPolicy(@C0359n0 StateRestorationPolicy stateRestorationPolicy) {
            this.mStateRestorationPolicy = stateRestorationPolicy;
            this.mObservable.mo59826h();
        }

        public void unregisterAdapterDataObserver(@C0359n0 C20065i iVar) {
            this.mObservable.unregisterObserver(iVar);
        }

        public final void notifyItemChanged(int i, @C0363p0 Object obj) {
            this.mObservable.mo59823e(i, 1, obj);
        }

        public final void notifyItemRangeChanged(int i, int i2, @C0363p0 Object obj) {
            this.mObservable.mo59823e(i, i2, obj);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a */
    public class C20050a implements Runnable {
        public C20050a() {
        }

        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f51440N0 && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.f51434K0) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.f51446Q0) {
                    recyclerView2.f51444P0 = true;
                } else {
                    recyclerView2.mo59474F();
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a0 */
    public static abstract class C20051a0 {

        /* renamed from: a */
        public int f51501a = -1;

        /* renamed from: b */
        public RecyclerView f51502b;

        /* renamed from: c */
        public C20076o f51503c;

        /* renamed from: d */
        public boolean f51504d;

        /* renamed from: e */
        public boolean f51505e;

        /* renamed from: f */
        public View f51506f;

        /* renamed from: g */
        public final C20052a f51507g = new C20052a(0, 0);

        /* renamed from: h */
        public boolean f51508h;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$a0$a */
        public static class C20052a {

            /* renamed from: h */
            public static final int f51509h = Integer.MIN_VALUE;

            /* renamed from: a */
            public int f51510a;

            /* renamed from: b */
            public int f51511b;

            /* renamed from: c */
            public int f51512c;

            /* renamed from: d */
            public int f51513d;

            /* renamed from: e */
            public Interpolator f51514e;

            /* renamed from: f */
            public boolean f51515f;

            /* renamed from: g */
            public int f51516g;

            public C20052a(@C0372t0 int i, @C0372t0 int i2) {
                this(i, i2, Integer.MIN_VALUE, (Interpolator) null);
            }

            /* renamed from: a */
            public int mo59712a() {
                return this.f51512c;
            }

            @C0372t0
            /* renamed from: b */
            public int mo59713b() {
                return this.f51510a;
            }

            @C0372t0
            /* renamed from: c */
            public int mo59714c() {
                return this.f51511b;
            }

            @C0363p0
            /* renamed from: d */
            public Interpolator mo59715d() {
                return this.f51514e;
            }

            /* renamed from: e */
            public boolean mo59716e() {
                return this.f51513d >= 0;
            }

            /* renamed from: f */
            public void mo59717f(int i) {
                this.f51513d = i;
            }

            /* renamed from: g */
            public void mo59718g(RecyclerView recyclerView) {
                int i = this.f51513d;
                if (i >= 0) {
                    this.f51513d = -1;
                    recyclerView.mo59508Q0(i);
                    this.f51515f = false;
                } else if (this.f51515f) {
                    mo59724m();
                    recyclerView.f51484u1.mo59752e(this.f51510a, this.f51511b, this.f51512c, this.f51514e);
                    this.f51516g++;
                    this.f51515f = false;
                } else {
                    this.f51516g = 0;
                }
            }

            /* renamed from: h */
            public void mo59719h(int i) {
                this.f51515f = true;
                this.f51512c = i;
            }

            /* renamed from: i */
            public void mo59720i(@C0372t0 int i) {
                this.f51515f = true;
                this.f51510a = i;
            }

            /* renamed from: j */
            public void mo59721j(@C0372t0 int i) {
                this.f51515f = true;
                this.f51511b = i;
            }

            /* renamed from: k */
            public void mo59722k(@C0363p0 Interpolator interpolator) {
                this.f51515f = true;
                this.f51514e = interpolator;
            }

            /* renamed from: l */
            public void mo59723l(@C0372t0 int i, @C0372t0 int i2, int i3, @C0363p0 Interpolator interpolator) {
                this.f51510a = i;
                this.f51511b = i2;
                this.f51512c = i3;
                this.f51514e = interpolator;
                this.f51515f = true;
            }

            /* renamed from: m */
            public final void mo59724m() {
                if (this.f51514e != null && this.f51512c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else if (this.f51512c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            public C20052a(@C0372t0 int i, @C0372t0 int i2, int i3) {
                this(i, i2, i3, (Interpolator) null);
            }

            public C20052a(@C0372t0 int i, @C0372t0 int i2, int i3, @C0363p0 Interpolator interpolator) {
                this.f51513d = -1;
                this.f51515f = false;
                this.f51516g = 0;
                this.f51510a = i;
                this.f51511b = i2;
                this.f51512c = i3;
                this.f51514e = interpolator;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$a0$b */
        public interface C20053b {
            @C0363p0
            /* renamed from: a */
            PointF mo59393a(int i);
        }

        @C0363p0
        /* renamed from: a */
        public PointF mo59693a(int i) {
            C20076o e = mo59697e();
            if (e instanceof C20053b) {
                return ((C20053b) e).mo59393a(i);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
            sb.append(C20053b.class.getCanonicalName());
            return null;
        }

        /* renamed from: b */
        public View mo59694b(int i) {
            return this.f51502b.f51422E0.mo59384R(i);
        }

        /* renamed from: c */
        public int mo59695c() {
            return this.f51502b.f51422E0.mo59922Y();
        }

        /* renamed from: d */
        public int mo59696d(View view) {
            return this.f51502b.mo59614r0(view);
        }

        @C0363p0
        /* renamed from: e */
        public C20076o mo59697e() {
            return this.f51503c;
        }

        /* renamed from: f */
        public int mo59698f() {
            return this.f51501a;
        }

        @Deprecated
        /* renamed from: g */
        public void mo59699g(int i) {
            this.f51502b.mo59479G1(i);
        }

        /* renamed from: h */
        public boolean mo59700h() {
            return this.f51504d;
        }

        /* renamed from: i */
        public boolean mo59701i() {
            return this.f51505e;
        }

        /* renamed from: j */
        public void mo59702j(@C0359n0 PointF pointF) {
            float f = pointF.x;
            float f2 = pointF.y;
            float sqrt = (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        /* renamed from: k */
        public void mo59703k(int i, int i2) {
            PointF a;
            RecyclerView recyclerView = this.f51502b;
            if (this.f51501a == -1 || recyclerView == null) {
                mo59711s();
            }
            if (this.f51504d && this.f51506f == null && this.f51503c != null && (a = mo59693a(this.f51501a)) != null) {
                float f = a.x;
                if (!(f == 0.0f && a.y == 0.0f)) {
                    recyclerView.mo59476F1((int) Math.signum(f), (int) Math.signum(a.y), (int[]) null);
                }
            }
            this.f51504d = false;
            View view = this.f51506f;
            if (view != null) {
                if (mo59696d(view) == this.f51501a) {
                    mo59708p(this.f51506f, recyclerView.f51490x1, this.f51507g);
                    this.f51507g.mo59718g(recyclerView);
                    mo59711s();
                } else {
                    this.f51506f = null;
                }
            }
            if (this.f51505e) {
                mo59705m(i, i2, recyclerView.f51490x1, this.f51507g);
                boolean e = this.f51507g.mo59716e();
                this.f51507g.mo59718g(recyclerView);
                if (e && this.f51505e) {
                    this.f51504d = true;
                    recyclerView.f51484u1.mo59751d();
                }
            }
        }

        /* renamed from: l */
        public void mo59704l(View view) {
            if (mo59696d(view) == mo59698f()) {
                this.f51506f = view;
            }
        }

        /* renamed from: m */
        public abstract void mo59705m(@C0372t0 int i, @C0372t0 int i2, @C0359n0 C20055b0 b0Var, @C0359n0 C20052a aVar);

        /* renamed from: n */
        public abstract void mo59706n();

        /* renamed from: o */
        public abstract void mo59707o();

        /* renamed from: p */
        public abstract void mo59708p(@C0359n0 View view, @C0359n0 C20055b0 b0Var, @C0359n0 C20052a aVar);

        /* renamed from: q */
        public void mo59709q(int i) {
            this.f51501a = i;
        }

        /* renamed from: r */
        public void mo59710r(RecyclerView recyclerView, C20076o oVar) {
            recyclerView.f51484u1.mo59753f();
            if (this.f51508h) {
                StringBuilder sb = new StringBuilder();
                sb.append("An instance of ");
                sb.append(getClass().getSimpleName());
                sb.append(" was started more than once. Each instance of");
                sb.append(getClass().getSimpleName());
                sb.append(" is intended to only be used once. You should create a new instance for each use.");
            }
            this.f51502b = recyclerView;
            this.f51503c = oVar;
            int i = this.f51501a;
            if (i != -1) {
                recyclerView.f51490x1.f51521a = i;
                this.f51505e = true;
                this.f51504d = true;
                this.f51506f = mo59694b(mo59698f());
                mo59706n();
                this.f51502b.f51484u1.mo59751d();
                this.f51508h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        /* renamed from: s */
        public final void mo59711s() {
            if (this.f51505e) {
                this.f51505e = false;
                mo59707o();
                this.f51502b.f51490x1.f51521a = -1;
                this.f51506f = null;
                this.f51501a = -1;
                this.f51504d = false;
                this.f51503c.mo59983y1(this);
                this.f51503c = null;
                this.f51502b = null;
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b */
    public class C20054b implements Runnable {
        public C20054b() {
        }

        public void run() {
            C20069l lVar = RecyclerView.this.f51468f1;
            if (lVar != null) {
                lVar.mo59855x();
            }
            RecyclerView.this.f51421D1 = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b0 */
    public static class C20055b0 {

        /* renamed from: r */
        public static final int f51518r = 1;

        /* renamed from: s */
        public static final int f51519s = 2;

        /* renamed from: t */
        public static final int f51520t = 4;

        /* renamed from: a */
        public int f51521a = -1;

        /* renamed from: b */
        public SparseArray<Object> f51522b;

        /* renamed from: c */
        public int f51523c = 0;

        /* renamed from: d */
        public int f51524d = 0;

        /* renamed from: e */
        public int f51525e = 1;

        /* renamed from: f */
        public int f51526f = 0;

        /* renamed from: g */
        public boolean f51527g = false;

        /* renamed from: h */
        public boolean f51528h = false;

        /* renamed from: i */
        public boolean f51529i = false;

        /* renamed from: j */
        public boolean f51530j = false;

        /* renamed from: k */
        public boolean f51531k = false;

        /* renamed from: l */
        public boolean f51532l = false;

        /* renamed from: m */
        public int f51533m;

        /* renamed from: n */
        public long f51534n;

        /* renamed from: o */
        public int f51535o;

        /* renamed from: p */
        public int f51536p;

        /* renamed from: q */
        public int f51537q;

        /* renamed from: a */
        public void mo59726a(int i) {
            if ((this.f51525e & i) == 0) {
                throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f51525e));
            }
        }

        /* renamed from: b */
        public boolean mo59727b() {
            return this.f51527g;
        }

        /* renamed from: c */
        public <T> T mo59728c(int i) {
            SparseArray<Object> sparseArray = this.f51522b;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i);
        }

        /* renamed from: d */
        public int mo59729d() {
            if (this.f51528h) {
                return this.f51523c - this.f51524d;
            }
            return this.f51526f;
        }

        /* renamed from: e */
        public int mo59730e() {
            return this.f51536p;
        }

        /* renamed from: f */
        public int mo59731f() {
            return this.f51537q;
        }

        /* renamed from: g */
        public int mo59732g() {
            return this.f51521a;
        }

        /* renamed from: h */
        public boolean mo59733h() {
            return this.f51521a != -1;
        }

        /* renamed from: i */
        public boolean mo59734i() {
            return this.f51530j;
        }

        /* renamed from: j */
        public boolean mo59735j() {
            return this.f51528h;
        }

        /* renamed from: k */
        public void mo59736k(Adapter adapter) {
            this.f51525e = 1;
            this.f51526f = adapter.getItemCount();
            this.f51528h = false;
            this.f51529i = false;
            this.f51530j = false;
        }

        /* renamed from: l */
        public void mo59737l(int i, Object obj) {
            if (this.f51522b == null) {
                this.f51522b = new SparseArray<>();
            }
            this.f51522b.put(i, obj);
        }

        /* renamed from: m */
        public void mo59738m(int i) {
            SparseArray<Object> sparseArray = this.f51522b;
            if (sparseArray != null) {
                sparseArray.remove(i);
            }
        }

        /* renamed from: n */
        public boolean mo59739n() {
            return this.f51532l;
        }

        /* renamed from: o */
        public boolean mo59740o() {
            return this.f51531k;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f51521a + ", mData=" + this.f51522b + ", mItemCount=" + this.f51526f + ", mIsMeasuring=" + this.f51530j + ", mPreviousLayoutItemCount=" + this.f51523c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f51524d + ", mStructureChanged=" + this.f51527g + ", mInPreLayout=" + this.f51528h + ", mRunSimpleAnimations=" + this.f51531k + ", mRunPredictiveAnimations=" + this.f51532l + C12361b.f30259j;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c */
    public class C20056c implements Interpolator {
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c0 */
    public static abstract class C20057c0 {
        @C0363p0
        /* renamed from: a */
        public abstract View mo59743a(@C0359n0 C20089w wVar, int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d */
    public class C20058d implements C20172k0.C20174b {
        public C20058d() {
        }

        /* renamed from: a */
        public void mo59744a(C20061e0 e0Var, C20069l.C20073d dVar, C20069l.C20073d dVar2) {
            RecyclerView.this.mo59647t(e0Var, dVar, dVar2);
        }

        /* renamed from: b */
        public void mo59745b(C20061e0 e0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f51422E0.mo59879G1(e0Var.itemView, recyclerView.f51459b);
        }

        /* renamed from: c */
        public void mo59746c(C20061e0 e0Var, @C0359n0 C20069l.C20073d dVar, @C0363p0 C20069l.C20073d dVar2) {
            RecyclerView.this.f51459b.mo60030K(e0Var);
            RecyclerView.this.mo59652v(e0Var, dVar, dVar2);
        }

        /* renamed from: d */
        public void mo59747d(C20061e0 e0Var, @C0359n0 C20069l.C20073d dVar, @C0359n0 C20069l.C20073d dVar2) {
            e0Var.setIsRecyclable(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f51453W0) {
                if (recyclerView.f51468f1.mo59834b(e0Var, e0Var, dVar, dVar2)) {
                    RecyclerView.this.mo59577i1();
                }
            } else if (recyclerView.f51468f1.mo59836d(e0Var, dVar, dVar2)) {
                RecyclerView.this.mo59577i1();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d0 */
    public class C20059d0 implements Runnable {

        /* renamed from: a */
        public int f51539a;

        /* renamed from: b */
        public int f51540b;

        /* renamed from: c */
        public OverScroller f51541c;

        /* renamed from: d */
        public Interpolator f51542d;

        /* renamed from: e */
        public boolean f51543e = false;

        /* renamed from: f */
        public boolean f51544f = false;

        public C20059d0() {
            Interpolator interpolator = RecyclerView.f51382A2;
            this.f51542d = interpolator;
            this.f51541c = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        /* renamed from: a */
        public final int mo59748a(int i, int i2) {
            boolean z;
            int i3;
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            if (abs > abs2) {
                z = true;
            } else {
                z = false;
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (z) {
                i3 = recyclerView.getWidth();
            } else {
                i3 = recyclerView.getHeight();
            }
            if (!z) {
                abs = abs2;
            }
            return Math.min((int) (((((float) abs) / ((float) i3)) + 1.0f) * 300.0f), 2000);
        }

        /* renamed from: b */
        public void mo59749b(int i, int i2) {
            RecyclerView.this.setScrollState(2);
            this.f51540b = 0;
            this.f51539a = 0;
            Interpolator interpolator = this.f51542d;
            Interpolator interpolator2 = RecyclerView.f51382A2;
            if (interpolator != interpolator2) {
                this.f51542d = interpolator2;
                this.f51541c = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f51541c.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            mo59751d();
        }

        /* renamed from: c */
        public final void mo59750c() {
            RecyclerView.this.removeCallbacks(this);
            C18196h2.m82618p1(RecyclerView.this, this);
        }

        /* renamed from: d */
        public void mo59751d() {
            if (this.f51543e) {
                this.f51544f = true;
            } else {
                mo59750c();
            }
        }

        /* renamed from: e */
        public void mo59752e(int i, int i2, int i3, @C0363p0 Interpolator interpolator) {
            if (i3 == Integer.MIN_VALUE) {
                i3 = mo59748a(i, i2);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.f51382A2;
            }
            if (this.f51542d != interpolator) {
                this.f51542d = interpolator;
                this.f51541c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f51540b = 0;
            this.f51539a = 0;
            RecyclerView.this.setScrollState(2);
            this.f51541c.startScroll(0, 0, i, i2, i4);
            mo59751d();
        }

        /* renamed from: f */
        public void mo59753f() {
            RecyclerView.this.removeCallbacks(this);
            this.f51541c.abortAnimation();
        }

        public void run() {
            int i;
            int i2;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            int i3;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f51422E0 == null) {
                mo59753f();
                return;
            }
            this.f51544f = false;
            this.f51543e = true;
            recyclerView.mo59474F();
            OverScroller overScroller = this.f51541c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i4 = currX - this.f51539a;
                int i5 = currY - this.f51540b;
                this.f51539a = currX;
                this.f51540b = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f51435K1;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.mo52995f(i4, i5, iArr, (int[]) null, 1)) {
                    int[] iArr2 = RecyclerView.this.f51435K1;
                    i4 -= iArr2[0];
                    i5 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.mo59471E(i4, i5);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f51493z != null) {
                    int[] iArr3 = recyclerView3.f51435K1;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.mo59476F1(i4, i5, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f51435K1;
                    i = iArr4[0];
                    i2 = iArr4[1];
                    i4 -= i;
                    i5 -= i2;
                    C20051a0 a0Var = recyclerView4.f51422E0.f51582g;
                    if (a0Var != null && !a0Var.mo59700h() && a0Var.mo59701i()) {
                        int d = RecyclerView.this.f51490x1.mo59729d();
                        if (d == 0) {
                            a0Var.mo59711s();
                        } else if (a0Var.mo59698f() >= d) {
                            a0Var.mo59709q(d - 1);
                            a0Var.mo59703k(i, i2);
                        } else {
                            a0Var.mo59703k(i, i2);
                        }
                    }
                } else {
                    i2 = 0;
                    i = 0;
                }
                if (!RecyclerView.this.f51428H0.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f51435K1;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.mo52998a(i, i2, i4, i5, (int[]) null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f51435K1;
                int i6 = i4 - iArr6[0];
                int i7 = i5 - iArr6[1];
                if (!(i == 0 && i2 == 0)) {
                    recyclerView6.mo59510R(i, i2);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                if (overScroller.getCurrX() == overScroller.getFinalX()) {
                    z = true;
                } else {
                    z = false;
                }
                if (overScroller.getCurrY() == overScroller.getFinalY()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (overScroller.isFinished() || ((z || i6 != 0) && (z2 || i7 != 0))) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                C20051a0 a0Var2 = RecyclerView.this.f51422E0.f51582g;
                if (a0Var2 == null || !a0Var2.mo59700h()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (z4 || !z3) {
                    mo59751d();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    C20186m mVar = recyclerView7.f51486v1;
                    if (mVar != null) {
                        mVar.mo60557g(recyclerView7, i, i2);
                    }
                } else {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i6 < 0) {
                            i3 = -currVelocity;
                        } else if (i6 > 0) {
                            i3 = currVelocity;
                        } else {
                            i3 = 0;
                        }
                        if (i7 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i7 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.mo59573h(i3, currVelocity);
                    }
                    if (RecyclerView.f51390Y1) {
                        RecyclerView.this.f51488w1.mo60565b();
                    }
                }
            }
            C20051a0 a0Var3 = RecyclerView.this.f51422E0.f51582g;
            if (a0Var3 != null && a0Var3.mo59700h()) {
                a0Var3.mo59703k(0, 0);
            }
            this.f51543e = false;
            if (this.f51544f) {
                mo59750c();
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.mo52996g(1);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$e */
    public class C20060e implements C20128g.C20130b {
        public C20060e() {
        }

        /* renamed from: a */
        public View mo59755a(int i) {
            return RecyclerView.this.getChildAt(i);
        }

        public void addView(View view, int i) {
            RecyclerView.this.addView(view, i);
            RecyclerView.this.mo59486J(view);
        }

        /* renamed from: b */
        public void mo59757b(View view) {
            C20061e0 u0 = RecyclerView.m93254u0(view);
            if (u0 != null) {
                u0.onEnteredHiddenState(RecyclerView.this);
            }
        }

        /* renamed from: c */
        public int mo59758c() {
            return RecyclerView.this.getChildCount();
        }

        /* renamed from: d */
        public C20061e0 mo59759d(View view) {
            return RecyclerView.m93254u0(view);
        }

        /* renamed from: e */
        public void mo59760e(int i) {
            C20061e0 u0;
            View a = mo59755a(i);
            if (!(a == null || (u0 = RecyclerView.m93254u0(a)) == null)) {
                if (!u0.isTmpDetached() || u0.shouldIgnore()) {
                    u0.addFlags(256);
                } else {
                    throw new IllegalArgumentException("called detach on an already detached child " + u0 + RecyclerView.this.mo59528Y());
                }
            }
            RecyclerView.this.detachViewFromParent(i);
        }

        /* renamed from: f */
        public int mo59761f(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        /* renamed from: g */
        public void mo59762g(View view) {
            C20061e0 u0 = RecyclerView.m93254u0(view);
            if (u0 != null) {
                u0.onLeftHiddenState(RecyclerView.this);
            }
        }

        /* renamed from: h */
        public void mo59763h(View view, int i, ViewGroup.LayoutParams layoutParams) {
            C20061e0 u0 = RecyclerView.m93254u0(view);
            if (u0 != null) {
                if (u0.isTmpDetached() || u0.shouldIgnore()) {
                    u0.clearTmpDetachFlag();
                } else {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + u0 + RecyclerView.this.mo59528Y());
                }
            }
            RecyclerView.this.attachViewToParent(view, i, layoutParams);
        }

        public void removeAllViews() {
            int c = mo59758c();
            for (int i = 0; i < c; i++) {
                View a = mo59755a(i);
                RecyclerView.this.mo59489K(a);
                a.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        public void removeViewAt(int i) {
            View childAt = RecyclerView.this.getChildAt(i);
            if (childAt != null) {
                RecyclerView.this.mo59489K(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$e0 */
    public static abstract class C20061e0 {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        @C0359n0
        public final View itemView;
        Adapter<? extends C20061e0> mBindingAdapter;
        int mFlags;
        boolean mInChangeScrap = false;
        private int mIsRecyclableCount = 0;
        long mItemId = -1;
        int mItemViewType = -1;
        WeakReference<RecyclerView> mNestedRecyclerView;
        int mOldPosition = -1;
        RecyclerView mOwnerRecyclerView;
        List<Object> mPayloads = null;
        @C0344h1
        int mPendingAccessibilityState = -1;
        int mPosition = -1;
        int mPreLayoutPosition = -1;
        C20089w mScrapContainer = null;
        C20061e0 mShadowedHolder = null;
        C20061e0 mShadowingHolder = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mWasImportantForAccessibilityBeforeHidden = 0;

        public C20061e0(@C0359n0 View view) {
            if (view != null) {
                this.itemView = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((1024 & this.mFlags) == 0) {
                mo59768b();
                this.mPayloads.add(obj);
            }
        }

        public void addFlags(int i) {
            this.mFlags = i | this.mFlags;
        }

        /* renamed from: b */
        public final void mo59768b() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        public void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        public boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && C18196h2.m82515M0(this.itemView);
        }

        public void flagRemovedAndOffsetPosition(int i, int i2, boolean z) {
            addFlags(8);
            offsetPosition(i2, z);
            this.mPosition = i;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.mo59590n0(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        @C0363p0
        public final Adapter<? extends C20061e0> getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            Adapter adapter;
            int n0;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (n0 = this.mOwnerRecyclerView.mo59590n0(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, n0);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            if (list == null || list.size() == 0) {
                return FULLUPDATE_PAYLOADS;
            }
            return this.mUnmodifiedPayloads;
        }

        public boolean hasAnyOfTheFlags(int i) {
            return (i & this.mFlags) != 0;
        }

        public boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        public boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            if ((this.mFlags & 16) != 0 || C18196h2.m82515M0(this.itemView)) {
                return false;
            }
            return true;
        }

        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        public boolean isScrap() {
            return this.mScrapContainer != null;
        }

        public boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        public boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        public boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        public void offsetPosition(int i, boolean z) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z) {
                this.mPreLayoutPosition += i;
            }
            this.mPosition += i;
            if (this.itemView.getLayoutParams() != null) {
                ((C20081p) this.itemView.getLayoutParams()).f51596c = true;
            }
        }

        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i = this.mPendingAccessibilityState;
            if (i != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = C18196h2.m82541V(this.itemView);
            }
            recyclerView.mo59485I1(this, 4);
        }

        public void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.mo59485I1(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        public void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.m93248A(this);
        }

        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        public void setFlags(int i, int i2) {
            this.mFlags = (i & i2) | (this.mFlags & (~i2));
        }

        public final void setIsRecyclable(boolean z) {
            int i;
            int i2 = this.mIsRecyclableCount;
            if (z) {
                i = i2 - 1;
            } else {
                i = i2 + 1;
            }
            this.mIsRecyclableCount = i;
            if (i < 0) {
                this.mIsRecyclableCount = 0;
                StringBuilder sb = new StringBuilder();
                sb.append("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
                sb.append(this);
            } else if (!z && i == 1) {
                this.mFlags |= 16;
            } else if (z && i == 0) {
                this.mFlags &= -17;
            }
        }

        public void setScrapContainer(C20089w wVar, boolean z) {
            this.mScrapContainer = wVar;
            this.mInChangeScrap = z;
        }

        public boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        public boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        public void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            String str;
            String str2;
            if (getClass().isAnonymousClass()) {
                str = "ViewHolder";
            } else {
                str = getClass().getSimpleName();
            }
            StringBuilder sb = new StringBuilder(str + C33093b.f80281i + Integer.toHexString(hashCode()) + " position=" + this.mPosition + " id=" + this.mItemId + ", oldPos=" + this.mOldPosition + ", pLpos:" + this.mPreLayoutPosition);
            if (isScrap()) {
                sb.append(" scrap ");
                if (this.mInChangeScrap) {
                    str2 = "[changeScrap]";
                } else {
                    str2 = "[attachedScrap]";
                }
                sb.append(str2);
            }
            if (isInvalid()) {
                sb.append(" invalid");
            }
            if (!isBound()) {
                sb.append(" unbound");
            }
            if (needsUpdate()) {
                sb.append(" update");
            }
            if (isRemoved()) {
                sb.append(" removed");
            }
            if (shouldIgnore()) {
                sb.append(" ignored");
            }
            if (isTmpDetached()) {
                sb.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public void unScrap() {
            this.mScrapContainer.mo60030K(this);
        }

        public boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$f */
    public class C20062f implements C20099a.C20100a {
        public C20062f() {
        }

        /* renamed from: a */
        public void mo59810a(int i, int i2) {
            RecyclerView.this.mo59529Y0(i, i2);
            RecyclerView.this.f51418A1 = true;
        }

        /* renamed from: b */
        public void mo59811b(C20099a.C20101b bVar) {
            mo59818i(bVar);
        }

        /* renamed from: c */
        public void mo59812c(C20099a.C20101b bVar) {
            mo59818i(bVar);
        }

        /* renamed from: d */
        public void mo59813d(int i, int i2) {
            RecyclerView.this.mo59531Z0(i, i2, false);
            RecyclerView.this.f51418A1 = true;
        }

        /* renamed from: e */
        public void mo59814e(int i, int i2, Object obj) {
            RecyclerView.this.mo59521U1(i, i2, obj);
            RecyclerView.this.f51419B1 = true;
        }

        /* renamed from: f */
        public C20061e0 mo59815f(int i) {
            C20061e0 l0 = RecyclerView.this.mo59584l0(i, true);
            if (l0 != null && !RecyclerView.this.f51465e.mo60370n(l0.itemView)) {
                return l0;
            }
            return null;
        }

        /* renamed from: g */
        public void mo59816g(int i, int i2) {
            RecyclerView.this.mo59527X0(i, i2);
            RecyclerView.this.f51418A1 = true;
        }

        /* renamed from: h */
        public void mo59817h(int i, int i2) {
            RecyclerView.this.mo59531Z0(i, i2, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f51418A1 = true;
            recyclerView.f51490x1.f51524d += i2;
        }

        /* renamed from: i */
        public void mo59818i(C20099a.C20101b bVar) {
            int i = bVar.f51701a;
            if (i == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f51422E0.mo59335k1(recyclerView, bVar.f51702b, bVar.f51704d);
            } else if (i == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f51422E0.mo59339n1(recyclerView2, bVar.f51702b, bVar.f51704d);
            } else if (i == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f51422E0.mo59340p1(recyclerView3, bVar.f51702b, bVar.f51704d, bVar.f51703c);
            } else if (i == 8) {
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f51422E0.mo59338m1(recyclerView4, bVar.f51702b, bVar.f51704d, 1);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$g */
    public static /* synthetic */ class C20063g {

        /* renamed from: a */
        public static final /* synthetic */ int[] f51548a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy[] r0 = androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f51548a = r0
                androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy r1 = androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.PREVENT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f51548a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy r1 = androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C20063g.<clinit>():void");
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$h */
    public static class C20064h extends Observable<C20065i> {
        /* renamed from: a */
        public boolean mo59819a() {
            return !this.mObservers.isEmpty();
        }

        /* renamed from: b */
        public void mo59820b() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C20065i) this.mObservers.get(size)).mo30655a();
            }
        }

        /* renamed from: c */
        public void mo59821c(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C20065i) this.mObservers.get(size)).mo30659e(i, i2, 1);
            }
        }

        /* renamed from: d */
        public void mo59822d(int i, int i2) {
            mo59823e(i, i2, (Object) null);
        }

        /* renamed from: e */
        public void mo59823e(int i, int i2, @C0363p0 Object obj) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C20065i) this.mObservers.get(size)).mo30657c(i, i2, obj);
            }
        }

        /* renamed from: f */
        public void mo59824f(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C20065i) this.mObservers.get(size)).mo30658d(i, i2);
            }
        }

        /* renamed from: g */
        public void mo59825g(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C20065i) this.mObservers.get(size)).mo30660f(i, i2);
            }
        }

        /* renamed from: h */
        public void mo59826h() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C20065i) this.mObservers.get(size)).mo59827g();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$i */
    public static abstract class C20065i {
        /* renamed from: a */
        public void mo30655a() {
        }

        /* renamed from: b */
        public void mo30656b(int i, int i2) {
        }

        /* renamed from: c */
        public void mo30657c(int i, int i2, @C0363p0 Object obj) {
            mo30656b(i, i2);
        }

        /* renamed from: d */
        public void mo30658d(int i, int i2) {
        }

        /* renamed from: e */
        public void mo30659e(int i, int i2, int i3) {
        }

        /* renamed from: f */
        public void mo30660f(int i, int i2) {
        }

        /* renamed from: g */
        public void mo59827g() {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$j */
    public interface C20066j {
        /* renamed from: a */
        int mo59828a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$k */
    public static class C20067k {

        /* renamed from: a */
        public static final int f51549a = 0;

        /* renamed from: b */
        public static final int f51550b = 1;

        /* renamed from: c */
        public static final int f51551c = 2;

        /* renamed from: d */
        public static final int f51552d = 3;

        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: androidx.recyclerview.widget.RecyclerView$k$a */
        public @interface C20068a {
        }

        @C0359n0
        /* renamed from: a */
        public EdgeEffect mo59829a(@C0359n0 RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$l */
    public static abstract class C20069l {

        /* renamed from: g */
        public static final int f51553g = 2;

        /* renamed from: h */
        public static final int f51554h = 8;

        /* renamed from: i */
        public static final int f51555i = 4;

        /* renamed from: j */
        public static final int f51556j = 2048;

        /* renamed from: k */
        public static final int f51557k = 4096;

        /* renamed from: a */
        public C20072c f51558a = null;

        /* renamed from: b */
        public ArrayList<C20071b> f51559b = new ArrayList<>();

        /* renamed from: c */
        public long f51560c = 120;

        /* renamed from: d */
        public long f51561d = 120;

        /* renamed from: e */
        public long f51562e = 250;

        /* renamed from: f */
        public long f51563f = 250;

        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$a */
        public @interface C20070a {
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$b */
        public interface C20071b {
            /* renamed from: a */
            void mo59858a();
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$c */
        public interface C20072c {
            /* renamed from: a */
            void mo59859a(@C0359n0 C20061e0 e0Var);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$d */
        public static class C20073d {

            /* renamed from: a */
            public int f51564a;

            /* renamed from: b */
            public int f51565b;

            /* renamed from: c */
            public int f51566c;

            /* renamed from: d */
            public int f51567d;

            /* renamed from: e */
            public int f51568e;

            @C0359n0
            /* renamed from: a */
            public C20073d mo59860a(@C0359n0 C20061e0 e0Var) {
                return mo59861b(e0Var, 0);
            }

            @C0359n0
            /* renamed from: b */
            public C20073d mo59861b(@C0359n0 C20061e0 e0Var, int i) {
                View view = e0Var.itemView;
                this.f51564a = view.getLeft();
                this.f51565b = view.getTop();
                this.f51566c = view.getRight();
                this.f51567d = view.getBottom();
                return this;
            }
        }

        /* renamed from: e */
        public static int m93496e(C20061e0 e0Var) {
            int i = e0Var.mFlags & 14;
            if (e0Var.isInvalid()) {
                return 4;
            }
            if ((i & 4) != 0) {
                return i;
            }
            int oldPosition = e0Var.getOldPosition();
            int absoluteAdapterPosition = e0Var.getAbsoluteAdapterPosition();
            if (oldPosition == -1 || absoluteAdapterPosition == -1 || oldPosition == absoluteAdapterPosition) {
                return i;
            }
            return i | 2048;
        }

        /* renamed from: A */
        public void mo59830A(C20072c cVar) {
            this.f51558a = cVar;
        }

        /* renamed from: B */
        public void mo59831B(long j) {
            this.f51562e = j;
        }

        /* renamed from: C */
        public void mo59832C(long j) {
            this.f51561d = j;
        }

        /* renamed from: a */
        public abstract boolean mo59833a(@C0359n0 C20061e0 e0Var, @C0363p0 C20073d dVar, @C0359n0 C20073d dVar2);

        /* renamed from: b */
        public abstract boolean mo59834b(@C0359n0 C20061e0 e0Var, @C0359n0 C20061e0 e0Var2, @C0359n0 C20073d dVar, @C0359n0 C20073d dVar2);

        /* renamed from: c */
        public abstract boolean mo59835c(@C0359n0 C20061e0 e0Var, @C0359n0 C20073d dVar, @C0363p0 C20073d dVar2);

        /* renamed from: d */
        public abstract boolean mo59836d(@C0359n0 C20061e0 e0Var, @C0359n0 C20073d dVar, @C0359n0 C20073d dVar2);

        /* renamed from: f */
        public boolean mo59837f(@C0359n0 C20061e0 e0Var) {
            return true;
        }

        /* renamed from: g */
        public boolean mo59838g(@C0359n0 C20061e0 e0Var, @C0359n0 List<Object> list) {
            return mo59837f(e0Var);
        }

        /* renamed from: h */
        public final void mo59839h(@C0359n0 C20061e0 e0Var) {
            mo59851t(e0Var);
            C20072c cVar = this.f51558a;
            if (cVar != null) {
                cVar.mo59859a(e0Var);
            }
        }

        /* renamed from: i */
        public final void mo59840i(@C0359n0 C20061e0 e0Var) {
            mo59852u(e0Var);
        }

        /* renamed from: j */
        public final void mo59841j() {
            int size = this.f51559b.size();
            for (int i = 0; i < size; i++) {
                this.f51559b.get(i).mo59858a();
            }
            this.f51559b.clear();
        }

        /* renamed from: k */
        public abstract void mo59842k(@C0359n0 C20061e0 e0Var);

        /* renamed from: l */
        public abstract void mo59843l();

        /* renamed from: m */
        public long mo59844m() {
            return this.f51560c;
        }

        /* renamed from: n */
        public long mo59845n() {
            return this.f51563f;
        }

        /* renamed from: o */
        public long mo59846o() {
            return this.f51562e;
        }

        /* renamed from: p */
        public long mo59847p() {
            return this.f51561d;
        }

        /* renamed from: q */
        public abstract boolean mo59848q();

        /* renamed from: r */
        public final boolean mo59849r(@C0363p0 C20071b bVar) {
            boolean q = mo59848q();
            if (bVar != null) {
                if (!q) {
                    bVar.mo59858a();
                } else {
                    this.f51559b.add(bVar);
                }
            }
            return q;
        }

        @C0359n0
        /* renamed from: s */
        public C20073d mo59850s() {
            return new C20073d();
        }

        /* renamed from: t */
        public void mo59851t(@C0359n0 C20061e0 e0Var) {
        }

        /* renamed from: u */
        public void mo59852u(@C0359n0 C20061e0 e0Var) {
        }

        @C0359n0
        /* renamed from: v */
        public C20073d mo59853v(@C0359n0 C20055b0 b0Var, @C0359n0 C20061e0 e0Var) {
            return mo59850s().mo59860a(e0Var);
        }

        @C0359n0
        /* renamed from: w */
        public C20073d mo59854w(@C0359n0 C20055b0 b0Var, @C0359n0 C20061e0 e0Var, int i, @C0359n0 List<Object> list) {
            return mo59850s().mo59860a(e0Var);
        }

        /* renamed from: x */
        public abstract void mo59855x();

        /* renamed from: y */
        public void mo59856y(long j) {
            this.f51560c = j;
        }

        /* renamed from: z */
        public void mo59857z(long j) {
            this.f51563f = j;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$m */
    public class C20074m implements C20069l.C20072c {
        public C20074m() {
        }

        /* renamed from: a */
        public void mo59859a(C20061e0 e0Var) {
            e0Var.setIsRecyclable(true);
            if (e0Var.mShadowedHolder != null && e0Var.mShadowingHolder == null) {
                e0Var.mShadowedHolder = null;
            }
            e0Var.mShadowingHolder = null;
            if (!e0Var.shouldBeKeptAsChild() && !RecyclerView.this.mo59615r1(e0Var.itemView) && e0Var.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(e0Var.itemView, false);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$n */
    public static abstract class C20075n {
        @Deprecated
        /* renamed from: f */
        public void mo59862f(@C0359n0 Rect rect, int i, @C0359n0 RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        /* renamed from: g */
        public void mo59102g(@C0359n0 Rect rect, @C0359n0 View view, @C0359n0 RecyclerView recyclerView, @C0359n0 C20055b0 b0Var) {
            mo59862f(rect, ((C20081p) view.getLayoutParams()).mo59995d(), recyclerView);
        }

        @Deprecated
        /* renamed from: h */
        public void mo59863h(@C0359n0 Canvas canvas, @C0359n0 RecyclerView recyclerView) {
        }

        /* renamed from: i */
        public void mo59864i(@C0359n0 Canvas canvas, @C0359n0 RecyclerView recyclerView, @C0359n0 C20055b0 b0Var) {
            mo59863h(canvas, recyclerView);
        }

        @Deprecated
        /* renamed from: j */
        public void mo59865j(@C0359n0 Canvas canvas, @C0359n0 RecyclerView recyclerView) {
        }

        /* renamed from: k */
        public void mo59103k(@C0359n0 Canvas canvas, @C0359n0 RecyclerView recyclerView, @C0359n0 C20055b0 b0Var) {
            mo59865j(canvas, recyclerView);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$o */
    public static abstract class C20076o {

        /* renamed from: E0 */
        public int f51570E0;

        /* renamed from: F0 */
        public int f51571F0;

        /* renamed from: G0 */
        public int f51572G0;

        /* renamed from: X */
        public int f51573X;

        /* renamed from: Y */
        public boolean f51574Y;

        /* renamed from: Z */
        public int f51575Z;

        /* renamed from: a */
        public C20128g f51576a;

        /* renamed from: b */
        public RecyclerView f51577b;

        /* renamed from: c */
        public final C20167j0.C20169b f51578c;

        /* renamed from: d */
        public final C20167j0.C20169b f51579d;

        /* renamed from: e */
        public C20167j0 f51580e;

        /* renamed from: f */
        public C20167j0 f51581f;
        @C0363p0

        /* renamed from: g */
        public C20051a0 f51582g;

        /* renamed from: v */
        public boolean f51583v = false;

        /* renamed from: w */
        public boolean f51584w = false;

        /* renamed from: x */
        public boolean f51585x = false;

        /* renamed from: y */
        public boolean f51586y = true;

        /* renamed from: z */
        public boolean f51587z = true;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$a */
        public class C20077a implements C20167j0.C20169b {
            public C20077a() {
            }

            /* renamed from: a */
            public View mo59986a(int i) {
                return C20076o.this.mo59919X(i);
            }

            /* renamed from: b */
            public int mo59987b(View view) {
                return C20076o.this.mo59939g0(view) - ((C20081p) view.getLayoutParams()).leftMargin;
            }

            /* renamed from: c */
            public int mo59988c() {
                return C20076o.this.getPaddingLeft();
            }

            /* renamed from: d */
            public int mo59989d() {
                return C20076o.this.mo59868B0() - C20076o.this.getPaddingRight();
            }

            /* renamed from: e */
            public int mo59990e(View view) {
                return C20076o.this.mo59953j0(view) + ((C20081p) view.getLayoutParams()).rightMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$b */
        public class C20078b implements C20167j0.C20169b {
            public C20078b() {
            }

            /* renamed from: a */
            public View mo59986a(int i) {
                return C20076o.this.mo59919X(i);
            }

            /* renamed from: b */
            public int mo59987b(View view) {
                return C20076o.this.mo59955k0(view) - ((C20081p) view.getLayoutParams()).topMargin;
            }

            /* renamed from: c */
            public int mo59988c() {
                return C20076o.this.getPaddingTop();
            }

            /* renamed from: d */
            public int mo59989d() {
                return C20076o.this.mo59958m0() - C20076o.this.getPaddingBottom();
            }

            /* renamed from: e */
            public int mo59990e(View view) {
                return C20076o.this.mo59934e0(view) + ((C20081p) view.getLayoutParams()).bottomMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$c */
        public interface C20079c {
            /* renamed from: a */
            void mo59991a(int i, int i2);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$d */
        public static class C20080d {

            /* renamed from: a */
            public int f51590a;

            /* renamed from: b */
            public int f51591b;

            /* renamed from: c */
            public boolean f51592c;

            /* renamed from: d */
            public boolean f51593d;
        }

        public C20076o() {
            C20077a aVar = new C20077a();
            this.f51578c = aVar;
            C20078b bVar = new C20078b();
            this.f51579d = bVar;
            this.f51580e = new C20167j0(aVar);
            this.f51581f = new C20167j0(bVar);
        }

        /* renamed from: N0 */
        public static boolean m93536N0(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    return true;
                }
                if (mode == 1073741824 && size == i) {
                    return true;
                }
                return false;
            } else if (size >= i) {
                return true;
            } else {
                return false;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            if (r5 == 1073741824) goto L_0x0020;
         */
        /* renamed from: Z */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int m93537Z(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L_0x001a
                if (r7 < 0) goto L_0x0011
                goto L_0x001c
            L_0x0011:
                if (r7 != r1) goto L_0x002f
                if (r5 == r2) goto L_0x0020
                if (r5 == 0) goto L_0x002f
                if (r5 == r3) goto L_0x0020
                goto L_0x002f
            L_0x001a:
                if (r7 < 0) goto L_0x001e
            L_0x001c:
                r5 = r3
                goto L_0x0031
            L_0x001e:
                if (r7 != r1) goto L_0x0022
            L_0x0020:
                r7 = r4
                goto L_0x0031
            L_0x0022:
                if (r7 != r0) goto L_0x002f
                if (r5 == r2) goto L_0x002c
                if (r5 != r3) goto L_0x0029
                goto L_0x002c
            L_0x0029:
                r7 = r4
                r5 = r6
                goto L_0x0031
            L_0x002c:
                r7 = r4
                r5 = r2
                goto L_0x0031
            L_0x002f:
                r5 = r6
                r7 = r5
            L_0x0031:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C20076o.m93537Z(int, int, int, int, boolean):int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
            if (r3 >= 0) goto L_0x0011;
         */
        @java.lang.Deprecated
        /* renamed from: a0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int m93538a0(int r1, int r2, int r3, boolean r4) {
            /*
                int r1 = r1 - r2
                r2 = 0
                int r1 = java.lang.Math.max(r2, r1)
                r0 = 1073741824(0x40000000, float:2.0)
                if (r4 == 0) goto L_0x000f
                if (r3 < 0) goto L_0x000d
                goto L_0x0011
            L_0x000d:
                r3 = r2
                goto L_0x001e
            L_0x000f:
                if (r3 < 0) goto L_0x0013
            L_0x0011:
                r2 = r0
                goto L_0x001e
            L_0x0013:
                r4 = -1
                if (r3 != r4) goto L_0x0018
                r3 = r1
                goto L_0x0011
            L_0x0018:
                r4 = -2
                if (r3 != r4) goto L_0x000d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1
            L_0x001e:
                int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C20076o.m93538a0(int, int, int, boolean):int");
        }

        /* renamed from: v0 */
        public static C20080d m93539v0(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i, int i2) {
            C20080d dVar = new C20080d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C20030a.C20040j.RecyclerView, i, i2);
            dVar.f51590a = obtainStyledAttributes.getInt(C20030a.C20040j.RecyclerView_android_orientation, 1);
            dVar.f51591b = obtainStyledAttributes.getInt(C20030a.C20040j.RecyclerView_spanCount, 1);
            dVar.f51592c = obtainStyledAttributes.getBoolean(C20030a.C20040j.RecyclerView_reverseLayout, false);
            dVar.f51593d = obtainStyledAttributes.getBoolean(C20030a.C20040j.RecyclerView_stackFromEnd, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        /* renamed from: y */
        public static int m93540y(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode == Integer.MIN_VALUE) {
                return Math.min(size, Math.max(i2, i3));
            }
            if (mode != 1073741824) {
                return Math.max(i2, i3);
            }
            return size;
        }

        /* renamed from: A */
        public void mo59364A(int i, C20079c cVar) {
        }

        /* renamed from: A0 */
        public void mo59866A0(@C0359n0 View view, boolean z, @C0359n0 Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((C20081p) view.getLayoutParams()).f51595b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (!(this.f51577b == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.f51577b.f51491y;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x0075 A[ADDED_TO_REGION] */
        /* renamed from: A1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo59867A1(@androidx.annotation.C0359n0 androidx.recyclerview.widget.RecyclerView.C20089w r8, @androidx.annotation.C0359n0 androidx.recyclerview.widget.RecyclerView.C20055b0 r9, int r10, @androidx.annotation.C0363p0 android.os.Bundle r11) {
            /*
                r7 = this;
                androidx.recyclerview.widget.RecyclerView r8 = r7.f51577b
                r9 = 0
                if (r8 != 0) goto L_0x0006
                return r9
            L_0x0006:
                r11 = 4096(0x1000, float:5.74E-42)
                r0 = 1
                if (r10 == r11) goto L_0x0042
                r11 = 8192(0x2000, float:1.14794E-41)
                if (r10 == r11) goto L_0x0012
                r2 = r9
                r3 = r2
                goto L_0x0073
            L_0x0012:
                r10 = -1
                boolean r8 = r8.canScrollVertically(r10)
                if (r8 == 0) goto L_0x0029
                int r8 = r7.mo59958m0()
                int r11 = r7.getPaddingTop()
                int r8 = r8 - r11
                int r11 = r7.getPaddingBottom()
                int r8 = r8 - r11
                int r8 = -r8
                goto L_0x002a
            L_0x0029:
                r8 = r9
            L_0x002a:
                androidx.recyclerview.widget.RecyclerView r11 = r7.f51577b
                boolean r10 = r11.canScrollHorizontally(r10)
                if (r10 == 0) goto L_0x0071
                int r10 = r7.mo59868B0()
                int r11 = r7.getPaddingLeft()
                int r10 = r10 - r11
                int r11 = r7.getPaddingRight()
                int r10 = r10 - r11
                int r10 = -r10
                goto L_0x006e
            L_0x0042:
                boolean r8 = r8.canScrollVertically(r0)
                if (r8 == 0) goto L_0x0057
                int r8 = r7.mo59958m0()
                int r10 = r7.getPaddingTop()
                int r8 = r8 - r10
                int r10 = r7.getPaddingBottom()
                int r8 = r8 - r10
                goto L_0x0058
            L_0x0057:
                r8 = r9
            L_0x0058:
                androidx.recyclerview.widget.RecyclerView r10 = r7.f51577b
                boolean r10 = r10.canScrollHorizontally(r0)
                if (r10 == 0) goto L_0x0071
                int r10 = r7.mo59868B0()
                int r11 = r7.getPaddingLeft()
                int r10 = r10 - r11
                int r11 = r7.getPaddingRight()
                int r10 = r10 - r11
            L_0x006e:
                r3 = r8
                r2 = r10
                goto L_0x0073
            L_0x0071:
                r3 = r8
                r2 = r9
            L_0x0073:
                if (r3 != 0) goto L_0x0078
                if (r2 != 0) goto L_0x0078
                return r9
            L_0x0078:
                androidx.recyclerview.widget.RecyclerView r1 = r7.f51577b
                r4 = 0
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                r6 = 1
                r1.mo59500N1(r2, r3, r4, r5, r6)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C20076o.mo59867A1(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$b0, int, android.os.Bundle):boolean");
        }

        /* renamed from: B */
        public int mo59366B(@C0359n0 C20055b0 b0Var) {
            return 0;
        }

        @C0372t0
        /* renamed from: B0 */
        public int mo59868B0() {
            return this.f51571F0;
        }

        /* renamed from: B1 */
        public boolean mo59869B1(@C0359n0 View view, int i, @C0363p0 Bundle bundle) {
            RecyclerView recyclerView = this.f51577b;
            return mo59871C1(recyclerView.f51459b, recyclerView.f51490x1, view, i, bundle);
        }

        /* renamed from: C */
        public int mo59303C(@C0359n0 C20055b0 b0Var) {
            return 0;
        }

        /* renamed from: C0 */
        public int mo59870C0() {
            return this.f51575Z;
        }

        /* renamed from: C1 */
        public boolean mo59871C1(@C0359n0 C20089w wVar, @C0359n0 C20055b0 b0Var, @C0359n0 View view, int i, @C0363p0 Bundle bundle) {
            return false;
        }

        /* renamed from: D */
        public int mo59305D(@C0359n0 C20055b0 b0Var) {
            return 0;
        }

        /* renamed from: D0 */
        public boolean mo59872D0() {
            int Y = mo59922Y();
            for (int i = 0; i < Y; i++) {
                ViewGroup.LayoutParams layoutParams = mo59919X(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: D1 */
        public void mo59873D1(Runnable runnable) {
            RecyclerView recyclerView = this.f51577b;
            if (recyclerView != null) {
                C18196h2.m82618p1(recyclerView, runnable);
            }
        }

        /* renamed from: E */
        public int mo59370E(@C0359n0 C20055b0 b0Var) {
            return 0;
        }

        /* renamed from: E0 */
        public boolean mo59874E0() {
            RecyclerView recyclerView = this.f51577b;
            return recyclerView != null && recyclerView.hasFocus();
        }

        /* renamed from: E1 */
        public void mo59875E1(@C0359n0 C20089w wVar) {
            for (int Y = mo59922Y() - 1; Y >= 0; Y--) {
                if (!RecyclerView.m93254u0(mo59919X(Y)).shouldIgnore()) {
                    mo59881H1(Y, wVar);
                }
            }
        }

        /* renamed from: F */
        public int mo59308F(@C0359n0 C20055b0 b0Var) {
            return 0;
        }

        /* renamed from: F0 */
        public void mo59876F0(@C0359n0 View view) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.f51577b;
            if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
                throw new IllegalArgumentException("View should be fully attached to be ignored" + this.f51577b.mo59528Y());
            }
            C20061e0 u0 = RecyclerView.m93254u0(view);
            u0.addFlags(128);
            this.f51577b.f51467f.mo60514q(u0);
        }

        /* renamed from: F1 */
        public void mo59877F1(C20089w wVar) {
            int k = wVar.mo60044k();
            for (int i = k - 1; i >= 0; i--) {
                View o = wVar.mo60048o(i);
                C20061e0 u0 = RecyclerView.m93254u0(o);
                if (!u0.shouldIgnore()) {
                    u0.setIsRecyclable(false);
                    if (u0.isTmpDetached()) {
                        this.f51577b.removeDetachedView(o, false);
                    }
                    C20069l lVar = this.f51577b.f51468f1;
                    if (lVar != null) {
                        lVar.mo59842k(u0);
                    }
                    u0.setIsRecyclable(true);
                    wVar.mo60059z(o);
                }
            }
            wVar.mo60039f();
            if (k > 0) {
                this.f51577b.invalidate();
            }
        }

        /* renamed from: G */
        public int mo59311G(@C0359n0 C20055b0 b0Var) {
            return 0;
        }

        /* renamed from: G0 */
        public boolean mo59878G0() {
            return this.f51584w;
        }

        /* renamed from: G1 */
        public void mo59879G1(@C0359n0 View view, @C0359n0 C20089w wVar) {
            mo59890K1(view);
            wVar.mo60022C(view);
        }

        /* renamed from: H */
        public void mo59880H(@C0359n0 C20089w wVar) {
            for (int Y = mo59922Y() - 1; Y >= 0; Y--) {
                mo59904P1(wVar, Y, mo59919X(Y));
            }
        }

        /* renamed from: H0 */
        public boolean mo59373H0() {
            return this.f51585x;
        }

        /* renamed from: H1 */
        public void mo59881H1(int i, @C0359n0 C20089w wVar) {
            View X = mo59919X(i);
            removeViewAt(i);
            wVar.mo60022C(X);
        }

        /* renamed from: I */
        public void mo59882I(@C0359n0 View view, @C0359n0 C20089w wVar) {
            mo59904P1(wVar, this.f51576a.mo60369m(view), view);
        }

        /* renamed from: I0 */
        public boolean mo59883I0() {
            RecyclerView recyclerView = this.f51577b;
            return recyclerView != null && recyclerView.isFocused();
        }

        /* renamed from: I1 */
        public boolean mo59884I1(Runnable runnable) {
            RecyclerView recyclerView = this.f51577b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        /* renamed from: J */
        public void mo59885J(int i, @C0359n0 C20089w wVar) {
            mo59904P1(wVar, i, mo59919X(i));
        }

        /* renamed from: J0 */
        public final boolean mo59886J0(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int B0 = mo59868B0() - getPaddingRight();
            int m0 = mo59958m0() - getPaddingBottom();
            Rect rect = this.f51577b.f51487w;
            mo59937f0(focusedChild, rect);
            if (rect.left - i >= B0 || rect.right - i <= paddingLeft || rect.top - i2 >= m0 || rect.bottom - i2 <= paddingTop) {
                return false;
            }
            return true;
        }

        /* renamed from: J1 */
        public void mo59887J1(@C0359n0 View view) {
            this.f51577b.removeDetachedView(view, false);
        }

        /* renamed from: K */
        public void mo59888K(@C0359n0 View view) {
            int m = this.f51576a.mo60369m(view);
            if (m >= 0) {
                mo59894M(m, view);
            }
        }

        /* renamed from: K0 */
        public final boolean mo59889K0() {
            return this.f51587z;
        }

        /* renamed from: K1 */
        public void mo59890K1(View view) {
            this.f51576a.mo60372p(view);
        }

        /* renamed from: L */
        public void mo59891L(int i) {
            mo59894M(i, mo59919X(i));
        }

        /* renamed from: L0 */
        public boolean mo59892L0(@C0359n0 C20089w wVar, @C0359n0 C20055b0 b0Var) {
            return false;
        }

        /* renamed from: L1 */
        public boolean mo59893L1(@C0359n0 RecyclerView recyclerView, @C0359n0 View view, @C0359n0 Rect rect, boolean z) {
            return mo59896M1(recyclerView, view, rect, z, false);
        }

        /* renamed from: M */
        public final void mo59894M(int i, @C0359n0 View view) {
            this.f51576a.mo60360d(i);
        }

        /* renamed from: M0 */
        public boolean mo59895M0() {
            return this.f51586y;
        }

        /* renamed from: M1 */
        public boolean mo59896M1(@C0359n0 RecyclerView recyclerView, @C0359n0 View view, @C0359n0 Rect rect, boolean z, boolean z2) {
            int[] b0 = mo59930b0(view, rect);
            int i = b0[0];
            int i2 = b0[1];
            if ((z2 && !mo59886J0(recyclerView, i, i2)) || (i == 0 && i2 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i, i2);
            } else {
                recyclerView.mo59491K1(i, i2);
            }
            return true;
        }

        /* renamed from: N */
        public void mo59897N(RecyclerView recyclerView) {
            this.f51584w = true;
            mo59924Z0(recyclerView);
        }

        /* renamed from: N1 */
        public void mo59898N1() {
            RecyclerView recyclerView = this.f51577b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        /* renamed from: O */
        public void mo59899O(RecyclerView recyclerView, C20089w wVar) {
            this.f51584w = false;
            mo59395b1(recyclerView, wVar);
        }

        /* renamed from: O0 */
        public boolean mo59900O0() {
            C20051a0 a0Var = this.f51582g;
            return a0Var != null && a0Var.mo59701i();
        }

        /* renamed from: O1 */
        public void mo59901O1() {
            this.f51583v = true;
        }

        /* renamed from: P */
        public void mo59902P(View view) {
            C20069l lVar = this.f51577b.f51468f1;
            if (lVar != null) {
                lVar.mo59842k(RecyclerView.m93254u0(view));
            }
        }

        /* renamed from: P0 */
        public boolean mo59903P0(@C0359n0 View view, boolean z, boolean z2) {
            boolean z3;
            if (!this.f51580e.mo60487b(view, 24579) || !this.f51581f.mo60487b(view, 24579)) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z) {
                return z3;
            }
            return !z3;
        }

        /* renamed from: P1 */
        public final void mo59904P1(C20089w wVar, int i, View view) {
            C20061e0 u0 = RecyclerView.m93254u0(view);
            if (!u0.shouldIgnore()) {
                if (!u0.isInvalid() || u0.isRemoved() || this.f51577b.f51493z.hasStableIds()) {
                    mo59891L(i);
                    wVar.mo60024E(view);
                    this.f51577b.f51467f.mo60508k(u0);
                    return;
                }
                removeViewAt(i);
                wVar.mo60023D(u0);
            }
        }

        @C0363p0
        /* renamed from: Q */
        public View mo59905Q(@C0359n0 View view) {
            View b0;
            RecyclerView recyclerView = this.f51577b;
            if (recyclerView == null || (b0 = recyclerView.mo59535b0(view)) == null || this.f51576a.mo60370n(b0)) {
                return null;
            }
            return b0;
        }

        /* renamed from: Q0 */
        public void mo59906Q0(@C0359n0 View view, int i, int i2, int i3, int i4) {
            Rect rect = ((C20081p) view.getLayoutParams()).f51595b;
            view.layout(i + rect.left, i2 + rect.top, i3 - rect.right, i4 - rect.bottom);
        }

        /* renamed from: Q1 */
        public int mo59322Q1(int i, C20089w wVar, C20055b0 b0Var) {
            return 0;
        }

        @C0363p0
        /* renamed from: R */
        public View mo59384R(int i) {
            int Y = mo59922Y();
            for (int i2 = 0; i2 < Y; i2++) {
                View X = mo59919X(i2);
                C20061e0 u0 = RecyclerView.m93254u0(X);
                if (u0 != null && u0.getLayoutPosition() == i && !u0.shouldIgnore() && (this.f51577b.f51490x1.mo59735j() || !u0.isRemoved())) {
                    return X;
                }
            }
            return null;
        }

        /* renamed from: R0 */
        public void mo59907R0(@C0359n0 View view, int i, int i2, int i3, int i4) {
            C20081p pVar = (C20081p) view.getLayoutParams();
            Rect rect = pVar.f51595b;
            view.layout(i + rect.left + pVar.leftMargin, i2 + rect.top + pVar.topMargin, (i3 - rect.right) - pVar.rightMargin, (i4 - rect.bottom) - pVar.bottomMargin);
        }

        /* renamed from: R1 */
        public void mo59385R1(int i) {
        }

        /* renamed from: S */
        public abstract C20081p mo59323S();

        /* renamed from: S0 */
        public void mo59908S0(@C0359n0 View view, int i, int i2) {
            C20081p pVar = (C20081p) view.getLayoutParams();
            Rect z0 = this.f51577b.mo59664z0(view);
            int i3 = i + z0.left + z0.right;
            int i4 = i2 + z0.top + z0.bottom;
            int Z = m93537Z(mo59868B0(), mo59870C0(), getPaddingLeft() + getPaddingRight() + i3, pVar.width, mo59428v());
            int Z2 = m93537Z(mo59958m0(), mo59960n0(), getPaddingTop() + getPaddingBottom() + i4, pVar.height, mo59431w());
            if (mo59933c2(view, Z, Z2, pVar)) {
                view.measure(Z, Z2);
            }
        }

        /* renamed from: S1 */
        public int mo59324S1(int i, C20089w wVar, C20055b0 b0Var) {
            return 0;
        }

        /* renamed from: T */
        public C20081p mo59326T(Context context, AttributeSet attributeSet) {
            return new C20081p(context, attributeSet);
        }

        /* renamed from: T0 */
        public void mo59909T0(@C0359n0 View view, int i, int i2) {
            C20081p pVar = (C20081p) view.getLayoutParams();
            Rect z0 = this.f51577b.mo59664z0(view);
            int i3 = i + z0.left + z0.right;
            int i4 = i2 + z0.top + z0.bottom;
            int Z = m93537Z(mo59868B0(), mo59870C0(), getPaddingLeft() + getPaddingRight() + pVar.leftMargin + pVar.rightMargin + i3, pVar.width, mo59428v());
            int Z2 = m93537Z(mo59958m0(), mo59960n0(), getPaddingTop() + getPaddingBottom() + pVar.topMargin + pVar.bottomMargin + i4, pVar.height, mo59431w());
            if (mo59933c2(view, Z, Z2, pVar)) {
                view.measure(Z, Z2);
            }
        }

        @Deprecated
        /* renamed from: T1 */
        public void mo59910T1(boolean z) {
            this.f51585x = z;
        }

        /* renamed from: U */
        public C20081p mo59327U(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof C20081p) {
                return new C20081p((C20081p) layoutParams);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new C20081p((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new C20081p(layoutParams);
        }

        /* renamed from: U0 */
        public void mo59911U0(int i, int i2) {
            View X = mo59919X(i);
            if (X != null) {
                mo59891L(i);
                mo59971s(X, i2);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.f51577b.toString());
        }

        /* renamed from: U1 */
        public void mo59912U1(RecyclerView recyclerView) {
            mo59918W1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        /* renamed from: V */
        public int mo59913V() {
            return -1;
        }

        /* renamed from: V0 */
        public void mo59914V0(@C0372t0 int i) {
            RecyclerView recyclerView = this.f51577b;
            if (recyclerView != null) {
                recyclerView.mo59523V0(i);
            }
        }

        /* renamed from: V1 */
        public final void mo59915V1(boolean z) {
            if (z != this.f51587z) {
                this.f51587z = z;
                this.f51573X = 0;
                RecyclerView recyclerView = this.f51577b;
                if (recyclerView != null) {
                    recyclerView.f51459b.mo60031L();
                }
            }
        }

        /* renamed from: W */
        public int mo59916W(@C0359n0 View view) {
            return ((C20081p) view.getLayoutParams()).f51595b.bottom;
        }

        /* renamed from: W0 */
        public void mo59917W0(@C0372t0 int i) {
            RecyclerView recyclerView = this.f51577b;
            if (recyclerView != null) {
                recyclerView.mo59525W0(i);
            }
        }

        /* renamed from: W1 */
        public void mo59918W1(int i, int i2) {
            this.f51571F0 = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.f51575Z = mode;
            if (mode == 0 && !RecyclerView.f51388W1) {
                this.f51571F0 = 0;
            }
            this.f51572G0 = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f51570E0 = mode2;
            if (mode2 == 0 && !RecyclerView.f51388W1) {
                this.f51572G0 = 0;
            }
        }

        @C0363p0
        /* renamed from: X */
        public View mo59919X(int i) {
            C20128g gVar = this.f51576a;
            if (gVar != null) {
                return gVar.mo60362f(i);
            }
            return null;
        }

        /* renamed from: X0 */
        public void mo59920X0(@C0363p0 Adapter adapter, @C0363p0 Adapter adapter2) {
        }

        /* renamed from: X1 */
        public void mo59921X1(int i, int i2) {
            this.f51577b.setMeasuredDimension(i, i2);
        }

        /* renamed from: Y */
        public int mo59922Y() {
            C20128g gVar = this.f51576a;
            if (gVar != null) {
                return gVar.mo60363g();
            }
            return 0;
        }

        /* renamed from: Y0 */
        public boolean mo59923Y0(@C0359n0 RecyclerView recyclerView, @C0359n0 ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        /* renamed from: Y1 */
        public void mo59329Y1(Rect rect, int i, int i2) {
            mo59921X1(m93540y(i, rect.width() + getPaddingLeft() + getPaddingRight(), mo59975t0()), m93540y(i2, rect.height() + getPaddingTop() + getPaddingBottom(), mo59972s0()));
        }

        @C0346i
        /* renamed from: Z0 */
        public void mo59924Z0(RecyclerView recyclerView) {
        }

        /* renamed from: Z1 */
        public void mo59925Z1(int i, int i2) {
            int Y = mo59922Y();
            if (Y == 0) {
                this.f51577b.mo59480H(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < Y; i7++) {
                View X = mo59919X(i7);
                Rect rect = this.f51577b.f51487w;
                mo59937f0(X, rect);
                int i8 = rect.left;
                if (i8 < i6) {
                    i6 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i4) {
                    i4 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i5) {
                    i5 = i11;
                }
            }
            this.f51577b.f51487w.set(i6, i4, i3, i5);
            mo59329Y1(this.f51577b.f51487w, i, i2);
        }

        @Deprecated
        /* renamed from: a1 */
        public void mo59926a1(RecyclerView recyclerView) {
        }

        /* renamed from: a2 */
        public void mo59927a2(boolean z) {
            this.f51586y = z;
        }

        public void addView(View view) {
            addView(view, -1);
        }

        /* renamed from: b0 */
        public final int[] mo59930b0(View view, Rect rect) {
            int[] iArr = new int[2];
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int B0 = mo59868B0() - getPaddingRight();
            int m0 = mo59958m0() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i = left - paddingLeft;
            int min = Math.min(0, i);
            int i2 = top - paddingTop;
            int min2 = Math.min(0, i2);
            int i3 = width - B0;
            int max = Math.max(0, i3);
            int max2 = Math.max(0, height - m0);
            if (mo59966q0() != 1) {
                if (min == 0) {
                    min = Math.min(i, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i3);
            }
            if (min2 == 0) {
                min2 = Math.min(i2, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        @C0346i
        /* renamed from: b1 */
        public void mo59395b1(RecyclerView recyclerView, C20089w wVar) {
            mo59926a1(recyclerView);
        }

        /* renamed from: b2 */
        public void mo59931b2(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f51577b = null;
                this.f51576a = null;
                this.f51571F0 = 0;
                this.f51572G0 = 0;
            } else {
                this.f51577b = recyclerView;
                this.f51576a = recyclerView.f51465e;
                this.f51571F0 = recyclerView.getWidth();
                this.f51572G0 = recyclerView.getHeight();
            }
            this.f51575Z = 1073741824;
            this.f51570E0 = 1073741824;
        }

        /* renamed from: c0 */
        public boolean mo59932c0() {
            RecyclerView recyclerView = this.f51577b;
            return recyclerView != null && recyclerView.f51469g;
        }

        @C0363p0
        /* renamed from: c1 */
        public View mo59330c1(@C0359n0 View view, int i, @C0359n0 C20089w wVar, @C0359n0 C20055b0 b0Var) {
            return null;
        }

        /* renamed from: c2 */
        public boolean mo59933c2(View view, int i, int i2, C20081p pVar) {
            if (view.isLayoutRequested() || !this.f51586y || !m93536N0(view.getWidth(), i, pVar.width) || !m93536N0(view.getHeight(), i2, pVar.height)) {
                return true;
            }
            return false;
        }

        /* renamed from: d0 */
        public int mo59331d0(@C0359n0 C20089w wVar, @C0359n0 C20055b0 b0Var) {
            return -1;
        }

        /* renamed from: d1 */
        public void mo59399d1(@C0359n0 AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f51577b;
            mo59935e1(recyclerView.f51459b, recyclerView.f51490x1, accessibilityEvent);
        }

        /* renamed from: d2 */
        public boolean mo59400d2() {
            return false;
        }

        /* renamed from: e0 */
        public int mo59934e0(@C0359n0 View view) {
            return view.getBottom() + mo59916W(view);
        }

        /* renamed from: e1 */
        public void mo59935e1(@C0359n0 C20089w wVar, @C0359n0 C20055b0 b0Var, @C0359n0 AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f51577b;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !this.f51577b.canScrollVertically(-1) && !this.f51577b.canScrollHorizontally(-1) && !this.f51577b.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                Adapter adapter = this.f51577b.f51493z;
                if (adapter != null) {
                    accessibilityEvent.setItemCount(adapter.getItemCount());
                }
            }
        }

        /* renamed from: e2 */
        public boolean mo59936e2(View view, int i, int i2, C20081p pVar) {
            if (!this.f51586y || !m93536N0(view.getMeasuredWidth(), i, pVar.width) || !m93536N0(view.getMeasuredHeight(), i2, pVar.height)) {
                return true;
            }
            return false;
        }

        /* renamed from: f0 */
        public void mo59937f0(@C0359n0 View view, @C0359n0 Rect rect) {
            RecyclerView.m93255w0(view, rect);
        }

        /* renamed from: f1 */
        public void mo59938f1(C18065l0 l0Var) {
            RecyclerView recyclerView = this.f51577b;
            mo59940g1(recyclerView.f51459b, recyclerView.f51490x1, l0Var);
        }

        /* renamed from: f2 */
        public void mo59403f2(RecyclerView recyclerView, C20055b0 b0Var, int i) {
        }

        /* renamed from: g0 */
        public int mo59939g0(@C0359n0 View view) {
            return view.getLeft() - mo59968r0(view);
        }

        /* renamed from: g1 */
        public void mo59940g1(@C0359n0 C20089w wVar, @C0359n0 C20055b0 b0Var, @C0359n0 C18065l0 l0Var) {
            if (this.f51577b.canScrollVertically(-1) || this.f51577b.canScrollHorizontally(-1)) {
                l0Var.mo52594a(8192);
                l0Var.mo52542I1(true);
            }
            if (this.f51577b.canScrollVertically(1) || this.f51577b.canScrollHorizontally(1)) {
                l0Var.mo52594a(4096);
                l0Var.mo52542I1(true);
            }
            l0Var.mo52600b1(C18065l0.C18068c.m82100f(mo59347x0(wVar, b0Var), mo59331d0(wVar, b0Var), mo59892L0(wVar, b0Var), mo59982y0(wVar, b0Var)));
        }

        /* renamed from: g2 */
        public void mo59941g2(C20051a0 a0Var) {
            C20051a0 a0Var2 = this.f51582g;
            if (!(a0Var2 == null || a0Var == a0Var2 || !a0Var2.mo59701i())) {
                this.f51582g.mo59711s();
            }
            this.f51582g = a0Var;
            a0Var.mo59710r(this.f51577b, this);
        }

        @C0372t0
        public int getPaddingBottom() {
            RecyclerView recyclerView = this.f51577b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        @C0372t0
        public int getPaddingEnd() {
            RecyclerView recyclerView = this.f51577b;
            if (recyclerView != null) {
                return C18196h2.m82593j0(recyclerView);
            }
            return 0;
        }

        @C0372t0
        public int getPaddingLeft() {
            RecyclerView recyclerView = this.f51577b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        @C0372t0
        public int getPaddingRight() {
            RecyclerView recyclerView = this.f51577b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        @C0372t0
        public int getPaddingStart() {
            RecyclerView recyclerView = this.f51577b;
            if (recyclerView != null) {
                return C18196h2.m82597k0(recyclerView);
            }
            return 0;
        }

        @C0372t0
        public int getPaddingTop() {
            RecyclerView recyclerView = this.f51577b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        /* renamed from: h0 */
        public int mo59948h0(@C0359n0 View view) {
            Rect rect = ((C20081p) view.getLayoutParams()).f51595b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        /* renamed from: h1 */
        public void mo59949h1(View view, C18065l0 l0Var) {
            C20061e0 u0 = RecyclerView.m93254u0(view);
            if (u0 != null && !u0.isRemoved() && !this.f51576a.mo60370n(u0.itemView)) {
                RecyclerView recyclerView = this.f51577b;
                mo59332i1(recyclerView.f51459b, recyclerView.f51490x1, view, l0Var);
            }
        }

        /* renamed from: h2 */
        public void mo59950h2(@C0359n0 View view) {
            C20061e0 u0 = RecyclerView.m93254u0(view);
            u0.stopIgnoring();
            u0.resetInternal();
            u0.addFlags(4);
        }

        /* renamed from: i0 */
        public int mo59951i0(@C0359n0 View view) {
            Rect rect = ((C20081p) view.getLayoutParams()).f51595b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        /* renamed from: i1 */
        public void mo59332i1(@C0359n0 C20089w wVar, @C0359n0 C20055b0 b0Var, @C0359n0 View view, @C0359n0 C18065l0 l0Var) {
        }

        /* renamed from: i2 */
        public void mo59952i2() {
            C20051a0 a0Var = this.f51582g;
            if (a0Var != null) {
                a0Var.mo59711s();
            }
        }

        /* renamed from: j0 */
        public int mo59953j0(@C0359n0 View view) {
            return view.getRight() + mo59980w0(view);
        }

        @C0363p0
        /* renamed from: j1 */
        public View mo59954j1(@C0359n0 View view, int i) {
            return null;
        }

        /* renamed from: j2 */
        public boolean mo59333j2() {
            return false;
        }

        /* renamed from: k0 */
        public int mo59955k0(@C0359n0 View view) {
            return view.getTop() - mo59984z0(view);
        }

        /* renamed from: k1 */
        public void mo59335k1(@C0359n0 RecyclerView recyclerView, int i, int i2) {
        }

        @C0363p0
        /* renamed from: l0 */
        public View mo59956l0() {
            View focusedChild;
            RecyclerView recyclerView = this.f51577b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f51576a.mo60370n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        /* renamed from: l1 */
        public void mo59336l1(@C0359n0 RecyclerView recyclerView) {
        }

        /* renamed from: m */
        public void mo59957m(View view) {
            mo59959n(view, -1);
        }

        @C0372t0
        /* renamed from: m0 */
        public int mo59958m0() {
            return this.f51572G0;
        }

        /* renamed from: m1 */
        public void mo59338m1(@C0359n0 RecyclerView recyclerView, int i, int i2, int i3) {
        }

        /* renamed from: n */
        public void mo59959n(View view, int i) {
            mo59961o(view, i, true);
        }

        /* renamed from: n0 */
        public int mo59960n0() {
            return this.f51570E0;
        }

        /* renamed from: n1 */
        public void mo59339n1(@C0359n0 RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: o */
        public final void mo59961o(View view, int i, boolean z) {
            C20061e0 u0 = RecyclerView.m93254u0(view);
            if (z || u0.isRemoved()) {
                this.f51577b.f51467f.mo60499b(u0);
            } else {
                this.f51577b.f51467f.mo60513p(u0);
            }
            C20081p pVar = (C20081p) view.getLayoutParams();
            if (u0.wasReturnedFromScrap() || u0.isScrap()) {
                if (u0.isScrap()) {
                    u0.unScrap();
                } else {
                    u0.clearReturnedFromScrapFlag();
                }
                this.f51576a.mo60359c(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f51577b) {
                int m = this.f51576a.mo60369m(view);
                if (i == -1) {
                    i = this.f51576a.mo60363g();
                }
                if (m == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f51577b.indexOfChild(view) + this.f51577b.mo59528Y());
                } else if (m != i) {
                    this.f51577b.f51422E0.mo59911U0(m, i);
                }
            } else {
                this.f51576a.mo60357a(view, i, false);
                pVar.f51596c = true;
                C20051a0 a0Var = this.f51582g;
                if (a0Var != null && a0Var.mo59701i()) {
                    this.f51582g.mo59704l(view);
                }
            }
            if (pVar.f51597d) {
                u0.itemView.invalidate();
                pVar.f51597d = false;
            }
        }

        /* renamed from: o0 */
        public int mo59962o0() {
            Adapter adapter;
            RecyclerView recyclerView = this.f51577b;
            if (recyclerView != null) {
                adapter = recyclerView.getAdapter();
            } else {
                adapter = null;
            }
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        /* renamed from: o1 */
        public void mo59963o1(@C0359n0 RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: p */
        public void mo59964p(String str) {
            RecyclerView recyclerView = this.f51577b;
            if (recyclerView != null) {
                recyclerView.mo59655w(str);
            }
        }

        /* renamed from: p0 */
        public int mo59965p0(@C0359n0 View view) {
            return RecyclerView.m93254u0(view).getItemViewType();
        }

        /* renamed from: p1 */
        public void mo59340p1(@C0359n0 RecyclerView recyclerView, int i, int i2, @C0363p0 Object obj) {
            mo59963o1(recyclerView, i, i2);
        }

        /* renamed from: q */
        public void mo59419q(String str) {
            RecyclerView recyclerView = this.f51577b;
            if (recyclerView != null) {
                recyclerView.mo59657x(str);
            }
        }

        /* renamed from: q0 */
        public int mo59966q0() {
            return C18196h2.m82553Z(this.f51577b);
        }

        /* renamed from: q1 */
        public void mo59341q1(C20089w wVar, C20055b0 b0Var) {
        }

        /* renamed from: r */
        public void mo59967r(@C0359n0 View view) {
            mo59971s(view, -1);
        }

        /* renamed from: r0 */
        public int mo59968r0(@C0359n0 View view) {
            return ((C20081p) view.getLayoutParams()).f51595b.left;
        }

        /* renamed from: r1 */
        public void mo59342r1(C20055b0 b0Var) {
        }

        public void removeAllViews() {
            for (int Y = mo59922Y() - 1; Y >= 0; Y--) {
                this.f51576a.mo60373q(Y);
            }
        }

        public void removeViewAt(int i) {
            if (mo59919X(i) != null) {
                this.f51576a.mo60373q(i);
            }
        }

        /* renamed from: s */
        public void mo59971s(@C0359n0 View view, int i) {
            mo59974t(view, i, (C20081p) view.getLayoutParams());
        }

        @C0372t0
        /* renamed from: s0 */
        public int mo59972s0() {
            return C18196h2.m82573e0(this.f51577b);
        }

        /* renamed from: s1 */
        public void mo59973s1(@C0359n0 C20089w wVar, @C0359n0 C20055b0 b0Var, int i, int i2) {
            this.f51577b.mo59480H(i, i2);
        }

        /* renamed from: t */
        public void mo59974t(@C0359n0 View view, int i, C20081p pVar) {
            C20061e0 u0 = RecyclerView.m93254u0(view);
            if (u0.isRemoved()) {
                this.f51577b.f51467f.mo60499b(u0);
            } else {
                this.f51577b.f51467f.mo60513p(u0);
            }
            this.f51576a.mo60359c(view, i, pVar, u0.isRemoved());
        }

        @C0372t0
        /* renamed from: t0 */
        public int mo59975t0() {
            return C18196h2.m82577f0(this.f51577b);
        }

        @Deprecated
        /* renamed from: t1 */
        public boolean mo59976t1(@C0359n0 RecyclerView recyclerView, @C0359n0 View view, @C0363p0 View view2) {
            return mo59900O0() || recyclerView.mo59499N0();
        }

        /* renamed from: u */
        public void mo59977u(@C0359n0 View view, @C0359n0 Rect rect) {
            RecyclerView recyclerView = this.f51577b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.mo59664z0(view));
            }
        }

        /* renamed from: u0 */
        public int mo59978u0(@C0359n0 View view) {
            return ((C20081p) view.getLayoutParams()).mo59995d();
        }

        /* renamed from: u1 */
        public boolean mo59979u1(@C0359n0 RecyclerView recyclerView, @C0359n0 C20055b0 b0Var, @C0359n0 View view, @C0363p0 View view2) {
            return mo59976t1(recyclerView, view, view2);
        }

        /* renamed from: v */
        public boolean mo59428v() {
            return false;
        }

        /* renamed from: v1 */
        public void mo59429v1(Parcelable parcelable) {
        }

        /* renamed from: w */
        public boolean mo59431w() {
            return false;
        }

        /* renamed from: w0 */
        public int mo59980w0(@C0359n0 View view) {
            return ((C20081p) view.getLayoutParams()).f51595b.right;
        }

        @C0363p0
        /* renamed from: w1 */
        public Parcelable mo59432w1() {
            return null;
        }

        /* renamed from: x */
        public boolean mo59346x(C20081p pVar) {
            return pVar != null;
        }

        /* renamed from: x0 */
        public int mo59347x0(@C0359n0 C20089w wVar, @C0359n0 C20055b0 b0Var) {
            return -1;
        }

        /* renamed from: x1 */
        public void mo59981x1(int i) {
        }

        /* renamed from: y0 */
        public int mo59982y0(@C0359n0 C20089w wVar, @C0359n0 C20055b0 b0Var) {
            return 0;
        }

        /* renamed from: y1 */
        public void mo59983y1(C20051a0 a0Var) {
            if (this.f51582g == a0Var) {
                this.f51582g = null;
            }
        }

        /* renamed from: z */
        public void mo59436z(int i, int i2, C20055b0 b0Var, C20079c cVar) {
        }

        /* renamed from: z0 */
        public int mo59984z0(@C0359n0 View view) {
            return ((C20081p) view.getLayoutParams()).f51595b.top;
        }

        /* renamed from: z1 */
        public boolean mo59985z1(int i, @C0363p0 Bundle bundle) {
            RecyclerView recyclerView = this.f51577b;
            return mo59867A1(recyclerView.f51459b, recyclerView.f51490x1, i, bundle);
        }

        public void addView(View view, int i) {
            mo59961o(view, i, false);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$q */
    public interface C20082q {
        /* renamed from: b */
        void mo32759b(@C0359n0 View view);

        /* renamed from: d */
        void mo32760d(@C0359n0 View view);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$r */
    public static abstract class C20083r {
        /* renamed from: a */
        public abstract boolean mo60001a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$s */
    public interface C20084s {
        /* renamed from: a */
        void mo60002a(@C0359n0 RecyclerView recyclerView, @C0359n0 MotionEvent motionEvent);

        /* renamed from: c */
        boolean mo60003c(@C0359n0 RecyclerView recyclerView, @C0359n0 MotionEvent motionEvent);

        /* renamed from: e */
        void mo60004e(boolean z);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$t */
    public static abstract class C20085t {
        /* renamed from: a */
        public void mo30661a(@C0359n0 RecyclerView recyclerView, int i) {
        }

        /* renamed from: b */
        public void mo30662b(@C0359n0 RecyclerView recyclerView, int i, int i2) {
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.recyclerview.widget.RecyclerView$u */
    public @interface C20086u {
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$v */
    public static class C20087v {

        /* renamed from: c */
        public static final int f51598c = 5;

        /* renamed from: a */
        public SparseArray<C20088a> f51599a = new SparseArray<>();

        /* renamed from: b */
        public int f51600b = 0;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$v$a */
        public static class C20088a {

            /* renamed from: a */
            public final ArrayList<C20061e0> f51601a = new ArrayList<>();

            /* renamed from: b */
            public int f51602b = 5;

            /* renamed from: c */
            public long f51603c = 0;

            /* renamed from: d */
            public long f51604d = 0;
        }

        /* renamed from: a */
        public void mo60005a() {
            this.f51600b++;
        }

        /* renamed from: b */
        public void mo60006b() {
            for (int i = 0; i < this.f51599a.size(); i++) {
                this.f51599a.valueAt(i).f51601a.clear();
            }
        }

        /* renamed from: c */
        public void mo60007c() {
            this.f51600b--;
        }

        /* renamed from: d */
        public void mo60008d(int i, long j) {
            C20088a h = mo60012h(i);
            h.f51604d = mo60015k(h.f51604d, j);
        }

        /* renamed from: e */
        public void mo60009e(int i, long j) {
            C20088a h = mo60012h(i);
            h.f51603c = mo60015k(h.f51603c, j);
        }

        @C0363p0
        /* renamed from: f */
        public C20061e0 mo60010f(int i) {
            C20088a aVar = this.f51599a.get(i);
            if (aVar == null || aVar.f51601a.isEmpty()) {
                return null;
            }
            ArrayList<C20061e0> arrayList = aVar.f51601a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).isAttachedToTransitionOverlay()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        /* renamed from: g */
        public int mo60011g(int i) {
            return mo60012h(i).f51601a.size();
        }

        /* renamed from: h */
        public final C20088a mo60012h(int i) {
            C20088a aVar = this.f51599a.get(i);
            if (aVar != null) {
                return aVar;
            }
            C20088a aVar2 = new C20088a();
            this.f51599a.put(i, aVar2);
            return aVar2;
        }

        /* renamed from: i */
        public void mo60013i(Adapter adapter, Adapter adapter2, boolean z) {
            if (adapter != null) {
                mo60007c();
            }
            if (!z && this.f51600b == 0) {
                mo60006b();
            }
            if (adapter2 != null) {
                mo60005a();
            }
        }

        /* renamed from: j */
        public void mo60014j(C20061e0 e0Var) {
            int itemViewType = e0Var.getItemViewType();
            ArrayList<C20061e0> arrayList = mo60012h(itemViewType).f51601a;
            if (this.f51599a.get(itemViewType).f51602b > arrayList.size()) {
                e0Var.resetInternal();
                arrayList.add(e0Var);
            }
        }

        /* renamed from: k */
        public long mo60015k(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        /* renamed from: l */
        public void mo60016l(int i, int i2) {
            C20088a h = mo60012h(i);
            h.f51602b = i2;
            ArrayList<C20061e0> arrayList = h.f51601a;
            while (arrayList.size() > i2) {
                arrayList.remove(arrayList.size() - 1);
            }
        }

        /* renamed from: m */
        public int mo60017m() {
            int i = 0;
            for (int i2 = 0; i2 < this.f51599a.size(); i2++) {
                ArrayList<C20061e0> arrayList = this.f51599a.valueAt(i2).f51601a;
                if (arrayList != null) {
                    i += arrayList.size();
                }
            }
            return i;
        }

        /* renamed from: n */
        public boolean mo60018n(int i, long j, long j2) {
            long j3 = mo60012h(i).f51604d;
            return j3 == 0 || j + j3 < j2;
        }

        /* renamed from: o */
        public boolean mo60019o(int i, long j, long j2) {
            long j3 = mo60012h(i).f51603c;
            return j3 == 0 || j + j3 < j2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$w */
    public final class C20089w {

        /* renamed from: j */
        public static final int f51605j = 2;

        /* renamed from: a */
        public final ArrayList<C20061e0> f51606a;

        /* renamed from: b */
        public ArrayList<C20061e0> f51607b = null;

        /* renamed from: c */
        public final ArrayList<C20061e0> f51608c = new ArrayList<>();

        /* renamed from: d */
        public final List<C20061e0> f51609d;

        /* renamed from: e */
        public int f51610e;

        /* renamed from: f */
        public int f51611f;

        /* renamed from: g */
        public C20087v f51612g;

        /* renamed from: h */
        public C20057c0 f51613h;

        public C20089w() {
            ArrayList<C20061e0> arrayList = new ArrayList<>();
            this.f51606a = arrayList;
            this.f51609d = Collections.unmodifiableList(arrayList);
            this.f51610e = 2;
            this.f51611f = 2;
        }

        /* renamed from: A */
        public void mo60020A() {
            for (int size = this.f51608c.size() - 1; size >= 0; size--) {
                mo60021B(size);
            }
            this.f51608c.clear();
            if (RecyclerView.f51390Y1) {
                RecyclerView.this.f51488w1.mo60565b();
            }
        }

        /* renamed from: B */
        public void mo60021B(int i) {
            mo60034a(this.f51608c.get(i), true);
            this.f51608c.remove(i);
        }

        /* renamed from: C */
        public void mo60022C(@C0359n0 View view) {
            C20061e0 u0 = RecyclerView.m93254u0(view);
            if (u0.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (u0.isScrap()) {
                u0.unScrap();
            } else if (u0.wasReturnedFromScrap()) {
                u0.clearReturnedFromScrapFlag();
            }
            mo60023D(u0);
            if (RecyclerView.this.f51468f1 != null && !u0.isRecyclable()) {
                RecyclerView.this.f51468f1.mo59842k(u0);
            }
        }

        /* renamed from: D */
        public void mo60023D(C20061e0 e0Var) {
            boolean z;
            boolean z2;
            boolean z3 = false;
            boolean z4 = true;
            if (e0Var.isScrap() || e0Var.itemView.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(e0Var.isScrap());
                sb.append(" isAttached:");
                if (e0Var.itemView.getParent() != null) {
                    z3 = true;
                }
                sb.append(z3);
                sb.append(RecyclerView.this.mo59528Y());
                throw new IllegalArgumentException(sb.toString());
            } else if (e0Var.isTmpDetached()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + e0Var + RecyclerView.this.mo59528Y());
            } else if (!e0Var.shouldIgnore()) {
                boolean doesTransientStatePreventRecycling = e0Var.doesTransientStatePreventRecycling();
                Adapter adapter = RecyclerView.this.f51493z;
                if (adapter == null || !doesTransientStatePreventRecycling || !adapter.onFailedToRecycleView(e0Var)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z || e0Var.isRecyclable()) {
                    if (this.f51611f <= 0 || e0Var.hasAnyOfTheFlags(526)) {
                        z2 = false;
                    } else {
                        int size = this.f51608c.size();
                        if (size >= this.f51611f && size > 0) {
                            mo60021B(0);
                            size--;
                        }
                        if (RecyclerView.f51390Y1 && size > 0 && !RecyclerView.this.f51488w1.mo60567d(e0Var.mPosition)) {
                            int i = size - 1;
                            while (i >= 0) {
                                if (!RecyclerView.this.f51488w1.mo60567d(this.f51608c.get(i).mPosition)) {
                                    break;
                                }
                                i--;
                            }
                            size = i + 1;
                        }
                        this.f51608c.add(size, e0Var);
                        z2 = true;
                    }
                    if (!z2) {
                        mo60034a(e0Var, true);
                    } else {
                        z4 = false;
                    }
                    z3 = z2;
                } else {
                    z4 = false;
                }
                RecyclerView.this.f51467f.mo60514q(e0Var);
                if (!z3 && !z4 && doesTransientStatePreventRecycling) {
                    e0Var.mBindingAdapter = null;
                    e0Var.mOwnerRecyclerView = null;
                }
            } else {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.mo59528Y());
            }
        }

        /* renamed from: E */
        public void mo60024E(View view) {
            C20061e0 u0 = RecyclerView.m93254u0(view);
            if (!u0.hasAnyOfTheFlags(12) && u0.isUpdated() && !RecyclerView.this.mo59660y(u0)) {
                if (this.f51607b == null) {
                    this.f51607b = new ArrayList<>();
                }
                u0.setScrapContainer(this, true);
                this.f51607b.add(u0);
            } else if (!u0.isInvalid() || u0.isRemoved() || RecyclerView.this.f51493z.hasStableIds()) {
                u0.setScrapContainer(this, false);
                this.f51606a.add(u0);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.mo59528Y());
            }
        }

        /* renamed from: F */
        public void mo60025F(C20087v vVar) {
            C20087v vVar2 = this.f51612g;
            if (vVar2 != null) {
                vVar2.mo60007c();
            }
            this.f51612g = vVar;
            if (vVar != null && RecyclerView.this.getAdapter() != null) {
                this.f51612g.mo60005a();
            }
        }

        /* renamed from: G */
        public void mo60026G(C20057c0 c0Var) {
            this.f51613h = c0Var;
        }

        /* renamed from: H */
        public void mo60027H(int i) {
            this.f51610e = i;
            mo60031L();
        }

        /* renamed from: I */
        public final boolean mo60028I(@C0359n0 C20061e0 e0Var, int i, int i2, long j) {
            e0Var.mBindingAdapter = null;
            e0Var.mOwnerRecyclerView = RecyclerView.this;
            int itemViewType = e0Var.getItemViewType();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j != Long.MAX_VALUE && !this.f51612g.mo60018n(itemViewType, nanoTime, j)) {
                return false;
            }
            RecyclerView.this.f51493z.bindViewHolder(e0Var, i);
            this.f51612g.mo60008d(e0Var.getItemViewType(), RecyclerView.this.getNanoTime() - nanoTime);
            mo60035b(e0Var);
            if (!RecyclerView.this.f51490x1.mo59735j()) {
                return true;
            }
            e0Var.mPreLayoutPosition = i2;
            return true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x01a2  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x01cb  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x01ce  */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x01fe  */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x020c  */
        @androidx.annotation.C0363p0
        /* renamed from: J */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.recyclerview.widget.RecyclerView.C20061e0 mo60029J(int r17, boolean r18, long r19) {
            /*
                r16 = this;
                r6 = r16
                r3 = r17
                r0 = r18
                if (r3 < 0) goto L_0x022f
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$b0 r1 = r1.f51490x1
                int r1 = r1.mo59729d()
                if (r3 >= r1) goto L_0x022f
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$b0 r1 = r1.f51490x1
                boolean r1 = r1.mo59735j()
                r2 = 0
                r7 = 1
                r8 = 0
                if (r1 == 0) goto L_0x0027
                androidx.recyclerview.widget.RecyclerView$e0 r1 = r16.mo60042i(r17)
                if (r1 == 0) goto L_0x0028
                r4 = r7
                goto L_0x0029
            L_0x0027:
                r1 = r2
            L_0x0028:
                r4 = r8
            L_0x0029:
                if (r1 != 0) goto L_0x005d
                androidx.recyclerview.widget.RecyclerView$e0 r1 = r16.mo60047n(r17, r18)
                if (r1 == 0) goto L_0x005d
                boolean r5 = r6.mo60032M(r1)
                if (r5 != 0) goto L_0x005c
                if (r0 != 0) goto L_0x005a
                r5 = 4
                r1.addFlags(r5)
                boolean r5 = r1.isScrap()
                if (r5 == 0) goto L_0x004e
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r9 = r1.itemView
                r5.removeDetachedView(r9, r8)
                r1.unScrap()
                goto L_0x0057
            L_0x004e:
                boolean r5 = r1.wasReturnedFromScrap()
                if (r5 == 0) goto L_0x0057
                r1.clearReturnedFromScrapFlag()
            L_0x0057:
                r6.mo60023D(r1)
            L_0x005a:
                r1 = r2
                goto L_0x005d
            L_0x005c:
                r4 = r7
            L_0x005d:
                if (r1 != 0) goto L_0x0181
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r5 = r5.f51463d
                int r5 = r5.mo60210n(r3)
                if (r5 < 0) goto L_0x0149
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r9 = r9.f51493z
                int r9 = r9.getItemCount()
                if (r5 >= r9) goto L_0x0149
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r9 = r9.f51493z
                int r9 = r9.getItemViewType(r5)
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r10 = r10.f51493z
                boolean r10 = r10.hasStableIds()
                if (r10 == 0) goto L_0x0096
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r1 = r1.f51493z
                long r10 = r1.getItemId(r5)
                androidx.recyclerview.widget.RecyclerView$e0 r1 = r6.mo60046m(r10, r9, r0)
                if (r1 == 0) goto L_0x0096
                r1.mPosition = r5
                r4 = r7
            L_0x0096:
                if (r1 != 0) goto L_0x00eb
                androidx.recyclerview.widget.RecyclerView$c0 r0 = r6.f51613h
                if (r0 == 0) goto L_0x00eb
                android.view.View r0 = r0.mo59743a(r6, r3, r9)
                if (r0 == 0) goto L_0x00eb
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$e0 r1 = r1.mo59648t0(r0)
                if (r1 == 0) goto L_0x00ce
                boolean r0 = r1.shouldIgnore()
                if (r0 != 0) goto L_0x00b1
                goto L_0x00eb
            L_0x00b1:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view."
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.mo59528Y()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00ce:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getViewForPositionAndType returned a view which does not have a ViewHolder"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.mo59528Y()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00eb:
                if (r1 != 0) goto L_0x0102
                androidx.recyclerview.widget.RecyclerView$v r0 = r16.mo60043j()
                androidx.recyclerview.widget.RecyclerView$e0 r0 = r0.mo60010f(r9)
                if (r0 == 0) goto L_0x0101
                r0.resetInternal()
                boolean r1 = androidx.recyclerview.widget.RecyclerView.f51387V1
                if (r1 == 0) goto L_0x0101
                r6.mo60052s(r0)
            L_0x0101:
                r1 = r0
            L_0x0102:
                if (r1 != 0) goto L_0x0181
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                long r0 = r0.getNanoTime()
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
                if (r5 == 0) goto L_0x0120
                androidx.recyclerview.widget.RecyclerView$v r10 = r6.f51612g
                r11 = r9
                r12 = r0
                r14 = r19
                boolean r5 = r10.mo60019o(r11, r12, r14)
                if (r5 != 0) goto L_0x0120
                return r2
            L_0x0120:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r5 = r2.f51493z
                androidx.recyclerview.widget.RecyclerView$e0 r2 = r5.createViewHolder(r2, r9)
                boolean r5 = androidx.recyclerview.widget.RecyclerView.f51390Y1
                if (r5 == 0) goto L_0x013b
                android.view.View r5 = r2.itemView
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.m93249f0(r5)
                if (r5 == 0) goto L_0x013b
                java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference
                r10.<init>(r5)
                r2.mNestedRecyclerView = r10
            L_0x013b:
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                long r10 = r5.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$v r5 = r6.f51612g
                long r10 = r10 - r0
                r5.mo60009e(r9, r10)
                r9 = r2
                goto L_0x0182
            L_0x0149:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Inconsistency detected. Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "(offset:"
                r1.append(r2)
                r1.append(r5)
                java.lang.String r2 = ").state:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$b0 r2 = r2.f51490x1
                int r2 = r2.mo59729d()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.mo59528Y()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0181:
                r9 = r1
            L_0x0182:
                r10 = r4
                if (r10 == 0) goto L_0x01bb
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$b0 r0 = r0.f51490x1
                boolean r0 = r0.mo59735j()
                if (r0 != 0) goto L_0x01bb
                r0 = 8192(0x2000, float:1.14794E-41)
                boolean r1 = r9.hasAnyOfTheFlags(r0)
                if (r1 == 0) goto L_0x01bb
                r9.setFlags(r8, r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$b0 r0 = r0.f51490x1
                boolean r0 = r0.f51531k
                if (r0 == 0) goto L_0x01bb
                int r0 = androidx.recyclerview.widget.RecyclerView.C20069l.m93496e(r9)
                r0 = r0 | 4096(0x1000, float:5.74E-42)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$l r2 = r1.f51468f1
                androidx.recyclerview.widget.RecyclerView$b0 r1 = r1.f51490x1
                java.util.List r4 = r9.getUnmodifiedPayloads()
                androidx.recyclerview.widget.RecyclerView$l$d r0 = r2.mo59854w(r1, r9, r0, r4)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                r1.mo59591n1(r9, r0)
            L_0x01bb:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$b0 r0 = r0.f51490x1
                boolean r0 = r0.mo59735j()
                if (r0 == 0) goto L_0x01ce
                boolean r0 = r9.isBound()
                if (r0 == 0) goto L_0x01ce
                r9.mPreLayoutPosition = r3
                goto L_0x01e1
            L_0x01ce:
                boolean r0 = r9.isBound()
                if (r0 == 0) goto L_0x01e3
                boolean r0 = r9.needsUpdate()
                if (r0 != 0) goto L_0x01e3
                boolean r0 = r9.isInvalid()
                if (r0 == 0) goto L_0x01e1
                goto L_0x01e3
            L_0x01e1:
                r0 = r8
                goto L_0x01f6
            L_0x01e3:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r0 = r0.f51463d
                int r2 = r0.mo60210n(r3)
                r0 = r16
                r1 = r9
                r3 = r17
                r4 = r19
                boolean r0 = r0.mo60028I(r1, r2, r3, r4)
            L_0x01f6:
                android.view.View r1 = r9.itemView
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                if (r1 != 0) goto L_0x020c
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r1.generateDefaultLayoutParams()
                androidx.recyclerview.widget.RecyclerView$p r1 = (androidx.recyclerview.widget.RecyclerView.C20081p) r1
                android.view.View r2 = r9.itemView
                r2.setLayoutParams(r1)
                goto L_0x0224
            L_0x020c:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                boolean r2 = r2.checkLayoutParams(r1)
                if (r2 != 0) goto L_0x0222
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r2.generateLayoutParams((android.view.ViewGroup.LayoutParams) r1)
                androidx.recyclerview.widget.RecyclerView$p r1 = (androidx.recyclerview.widget.RecyclerView.C20081p) r1
                android.view.View r2 = r9.itemView
                r2.setLayoutParams(r1)
                goto L_0x0224
            L_0x0222:
                androidx.recyclerview.widget.RecyclerView$p r1 = (androidx.recyclerview.widget.RecyclerView.C20081p) r1
            L_0x0224:
                r1.f51594a = r9
                if (r10 == 0) goto L_0x022b
                if (r0 == 0) goto L_0x022b
                goto L_0x022c
            L_0x022b:
                r7 = r8
            L_0x022c:
                r1.f51597d = r7
                return r9
            L_0x022f:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "("
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "). Item count:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$b0 r2 = r2.f51490x1
                int r2 = r2.mo59729d()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.mo59528Y()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C20089w.mo60029J(int, boolean, long):androidx.recyclerview.widget.RecyclerView$e0");
        }

        /* renamed from: K */
        public void mo60030K(C20061e0 e0Var) {
            if (e0Var.mInChangeScrap) {
                this.f51607b.remove(e0Var);
            } else {
                this.f51606a.remove(e0Var);
            }
            e0Var.mScrapContainer = null;
            e0Var.mInChangeScrap = false;
            e0Var.clearReturnedFromScrapFlag();
        }

        /* renamed from: L */
        public void mo60031L() {
            int i;
            C20076o oVar = RecyclerView.this.f51422E0;
            if (oVar != null) {
                i = oVar.f51573X;
            } else {
                i = 0;
            }
            this.f51611f = this.f51610e + i;
            for (int size = this.f51608c.size() - 1; size >= 0 && this.f51608c.size() > this.f51611f; size--) {
                mo60021B(size);
            }
        }

        /* renamed from: M */
        public boolean mo60032M(C20061e0 e0Var) {
            if (e0Var.isRemoved()) {
                return RecyclerView.this.f51490x1.mo59735j();
            }
            int i = e0Var.mPosition;
            if (i < 0 || i >= RecyclerView.this.f51493z.getItemCount()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + e0Var + RecyclerView.this.mo59528Y());
            } else if (!RecyclerView.this.f51490x1.mo59735j() && RecyclerView.this.f51493z.getItemViewType(e0Var.mPosition) != e0Var.getItemViewType()) {
                return false;
            } else {
                if (!RecyclerView.this.f51493z.hasStableIds()) {
                    return true;
                }
                if (e0Var.getItemId() == RecyclerView.this.f51493z.getItemId(e0Var.mPosition)) {
                    return true;
                }
                return false;
            }
        }

        /* renamed from: N */
        public void mo60033N(int i, int i2) {
            int i3;
            int i4 = i2 + i;
            for (int size = this.f51608c.size() - 1; size >= 0; size--) {
                C20061e0 e0Var = this.f51608c.get(size);
                if (e0Var != null && (i3 = e0Var.mPosition) >= i && i3 < i4) {
                    e0Var.addFlags(2);
                    mo60021B(size);
                }
            }
        }

        /* renamed from: a */
        public void mo60034a(@C0359n0 C20061e0 e0Var, boolean z) {
            C18019a aVar;
            RecyclerView.m93248A(e0Var);
            View view = e0Var.itemView;
            C20102a0 a0Var = RecyclerView.this.f51423E1;
            if (a0Var != null) {
                C18019a n = a0Var.mo59213n();
                if (n instanceof C20102a0.C20103a) {
                    aVar = ((C20102a0.C20103a) n).mo60228n(view);
                } else {
                    aVar = null;
                }
                C18196h2.m82474B1(view, aVar);
            }
            if (z) {
                mo60041h(e0Var);
            }
            e0Var.mBindingAdapter = null;
            e0Var.mOwnerRecyclerView = null;
            mo60043j().mo60014j(e0Var);
        }

        /* renamed from: b */
        public final void mo60035b(C20061e0 e0Var) {
            if (RecyclerView.this.mo59493L0()) {
                View view = e0Var.itemView;
                if (C18196h2.m82541V(view) == 0) {
                    C18196h2.m82531R1(view, 1);
                }
                C20102a0 a0Var = RecyclerView.this.f51423E1;
                if (a0Var != null) {
                    C18019a n = a0Var.mo59213n();
                    if (n instanceof C20102a0.C20103a) {
                        ((C20102a0.C20103a) n).mo60229o(view);
                    }
                    C18196h2.m82474B1(view, n);
                }
            }
        }

        /* renamed from: c */
        public void mo60036c(@C0359n0 View view, int i) {
            C20081p pVar;
            C20061e0 u0 = RecyclerView.m93254u0(view);
            if (u0 != null) {
                int n = RecyclerView.this.f51463d.mo60210n(i);
                if (n < 0 || n >= RecyclerView.this.f51493z.getItemCount()) {
                    throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + n + ").state:" + RecyclerView.this.f51490x1.mo59729d() + RecyclerView.this.mo59528Y());
                }
                mo60028I(u0, n, i, Long.MAX_VALUE);
                ViewGroup.LayoutParams layoutParams = u0.itemView.getLayoutParams();
                if (layoutParams == null) {
                    pVar = (C20081p) RecyclerView.this.generateDefaultLayoutParams();
                    u0.itemView.setLayoutParams(pVar);
                } else if (!RecyclerView.this.checkLayoutParams(layoutParams)) {
                    pVar = (C20081p) RecyclerView.this.generateLayoutParams(layoutParams);
                    u0.itemView.setLayoutParams(pVar);
                } else {
                    pVar = (C20081p) layoutParams;
                }
                boolean z = true;
                pVar.f51596c = true;
                pVar.f51594a = u0;
                if (u0.itemView.getParent() != null) {
                    z = false;
                }
                pVar.f51597d = z;
                return;
            }
            throw new IllegalArgumentException("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter" + RecyclerView.this.mo59528Y());
        }

        /* renamed from: d */
        public void mo60037d() {
            this.f51606a.clear();
            mo60020A();
        }

        /* renamed from: e */
        public void mo60038e() {
            int size = this.f51608c.size();
            for (int i = 0; i < size; i++) {
                this.f51608c.get(i).clearOldPosition();
            }
            int size2 = this.f51606a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.f51606a.get(i2).clearOldPosition();
            }
            ArrayList<C20061e0> arrayList = this.f51607b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    this.f51607b.get(i3).clearOldPosition();
                }
            }
        }

        /* renamed from: f */
        public void mo60039f() {
            this.f51606a.clear();
            ArrayList<C20061e0> arrayList = this.f51607b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        /* renamed from: g */
        public int mo60040g(int i) {
            if (i < 0 || i >= RecyclerView.this.f51490x1.mo59729d()) {
                throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + RecyclerView.this.f51490x1.mo59729d() + RecyclerView.this.mo59528Y());
            } else if (!RecyclerView.this.f51490x1.mo59735j()) {
                return i;
            } else {
                return RecyclerView.this.f51463d.mo60210n(i);
            }
        }

        /* renamed from: h */
        public void mo60041h(@C0359n0 C20061e0 e0Var) {
            C20090x xVar = RecyclerView.this.f51424F0;
            if (xVar != null) {
                xVar.mo60060a(e0Var);
            }
            int size = RecyclerView.this.f51426G0.size();
            for (int i = 0; i < size; i++) {
                RecyclerView.this.f51426G0.get(i).mo60060a(e0Var);
            }
            Adapter adapter = RecyclerView.this.f51493z;
            if (adapter != null) {
                adapter.onViewRecycled(e0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f51490x1 != null) {
                recyclerView.f51467f.mo60514q(e0Var);
            }
        }

        /* renamed from: i */
        public C20061e0 mo60042i(int i) {
            int size;
            int n;
            ArrayList<C20061e0> arrayList = this.f51607b;
            if (!(arrayList == null || (size = arrayList.size()) == 0)) {
                int i2 = 0;
                int i3 = 0;
                while (i3 < size) {
                    C20061e0 e0Var = this.f51607b.get(i3);
                    if (e0Var.wasReturnedFromScrap() || e0Var.getLayoutPosition() != i) {
                        i3++;
                    } else {
                        e0Var.addFlags(32);
                        return e0Var;
                    }
                }
                if (RecyclerView.this.f51493z.hasStableIds() && (n = RecyclerView.this.f51463d.mo60210n(i)) > 0 && n < RecyclerView.this.f51493z.getItemCount()) {
                    long itemId = RecyclerView.this.f51493z.getItemId(n);
                    while (i2 < size) {
                        C20061e0 e0Var2 = this.f51607b.get(i2);
                        if (e0Var2.wasReturnedFromScrap() || e0Var2.getItemId() != itemId) {
                            i2++;
                        } else {
                            e0Var2.addFlags(32);
                            return e0Var2;
                        }
                    }
                }
            }
            return null;
        }

        /* renamed from: j */
        public C20087v mo60043j() {
            if (this.f51612g == null) {
                this.f51612g = new C20087v();
            }
            return this.f51612g;
        }

        /* renamed from: k */
        public int mo60044k() {
            return this.f51606a.size();
        }

        @C0359n0
        /* renamed from: l */
        public List<C20061e0> mo60045l() {
            return this.f51609d;
        }

        /* renamed from: m */
        public C20061e0 mo60046m(long j, int i, boolean z) {
            for (int size = this.f51606a.size() - 1; size >= 0; size--) {
                C20061e0 e0Var = this.f51606a.get(size);
                if (e0Var.getItemId() == j && !e0Var.wasReturnedFromScrap()) {
                    if (i == e0Var.getItemViewType()) {
                        e0Var.addFlags(32);
                        if (e0Var.isRemoved() && !RecyclerView.this.f51490x1.mo59735j()) {
                            e0Var.setFlags(2, 14);
                        }
                        return e0Var;
                    } else if (!z) {
                        this.f51606a.remove(size);
                        RecyclerView.this.removeDetachedView(e0Var.itemView, false);
                        mo60059z(e0Var.itemView);
                    }
                }
            }
            int size2 = this.f51608c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                C20061e0 e0Var2 = this.f51608c.get(size2);
                if (e0Var2.getItemId() == j && !e0Var2.isAttachedToTransitionOverlay()) {
                    if (i == e0Var2.getItemViewType()) {
                        if (!z) {
                            this.f51608c.remove(size2);
                        }
                        return e0Var2;
                    } else if (!z) {
                        mo60021B(size2);
                        return null;
                    }
                }
            }
        }

        /* renamed from: n */
        public C20061e0 mo60047n(int i, boolean z) {
            View e;
            int size = this.f51606a.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                C20061e0 e0Var = this.f51606a.get(i3);
                if (e0Var.wasReturnedFromScrap() || e0Var.getLayoutPosition() != i || e0Var.isInvalid() || (!RecyclerView.this.f51490x1.f51528h && e0Var.isRemoved())) {
                    i3++;
                } else {
                    e0Var.addFlags(32);
                    return e0Var;
                }
            }
            if (z || (e = RecyclerView.this.f51465e.mo60361e(i)) == null) {
                int size2 = this.f51608c.size();
                while (i2 < size2) {
                    C20061e0 e0Var2 = this.f51608c.get(i2);
                    if (e0Var2.isInvalid() || e0Var2.getLayoutPosition() != i || e0Var2.isAttachedToTransitionOverlay()) {
                        i2++;
                    } else {
                        if (!z) {
                            this.f51608c.remove(i2);
                        }
                        return e0Var2;
                    }
                }
                return null;
            }
            C20061e0 u0 = RecyclerView.m93254u0(e);
            RecyclerView.this.f51465e.mo60375s(e);
            int m = RecyclerView.this.f51465e.mo60369m(e);
            if (m != -1) {
                RecyclerView.this.f51465e.mo60360d(m);
                mo60024E(e);
                u0.addFlags(8224);
                return u0;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + u0 + RecyclerView.this.mo59528Y());
        }

        /* renamed from: o */
        public View mo60048o(int i) {
            return this.f51606a.get(i).itemView;
        }

        @C0359n0
        /* renamed from: p */
        public View mo60049p(int i) {
            return mo60050q(i, false);
        }

        /* renamed from: q */
        public View mo60050q(int i, boolean z) {
            return mo60029J(i, z, Long.MAX_VALUE).itemView;
        }

        /* renamed from: r */
        public final void mo60051r(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    mo60051r((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        /* renamed from: s */
        public final void mo60052s(C20061e0 e0Var) {
            View view = e0Var.itemView;
            if (view instanceof ViewGroup) {
                mo60051r((ViewGroup) view, false);
            }
        }

        /* renamed from: t */
        public void mo60053t() {
            int size = this.f51608c.size();
            for (int i = 0; i < size; i++) {
                C20081p pVar = (C20081p) this.f51608c.get(i).itemView.getLayoutParams();
                if (pVar != null) {
                    pVar.f51596c = true;
                }
            }
        }

        /* renamed from: u */
        public void mo60054u() {
            int size = this.f51608c.size();
            for (int i = 0; i < size; i++) {
                C20061e0 e0Var = this.f51608c.get(i);
                if (e0Var != null) {
                    e0Var.addFlags(6);
                    e0Var.addChangePayload((Object) null);
                }
            }
            Adapter adapter = RecyclerView.this.f51493z;
            if (adapter == null || !adapter.hasStableIds()) {
                mo60020A();
            }
        }

        /* renamed from: v */
        public void mo60055v(int i, int i2) {
            int size = this.f51608c.size();
            for (int i3 = 0; i3 < size; i3++) {
                C20061e0 e0Var = this.f51608c.get(i3);
                if (e0Var != null && e0Var.mPosition >= i) {
                    e0Var.offsetPosition(i2, false);
                }
            }
        }

        /* renamed from: w */
        public void mo60056w(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            if (i < i2) {
                i5 = -1;
                i4 = i;
                i3 = i2;
            } else {
                i5 = 1;
                i3 = i;
                i4 = i2;
            }
            int size = this.f51608c.size();
            for (int i7 = 0; i7 < size; i7++) {
                C20061e0 e0Var = this.f51608c.get(i7);
                if (e0Var != null && (i6 = e0Var.mPosition) >= i4 && i6 <= i3) {
                    if (i6 == i) {
                        e0Var.offsetPosition(i2 - i, false);
                    } else {
                        e0Var.offsetPosition(i5, false);
                    }
                }
            }
        }

        /* renamed from: x */
        public void mo60057x(int i, int i2, boolean z) {
            int i3 = i + i2;
            for (int size = this.f51608c.size() - 1; size >= 0; size--) {
                C20061e0 e0Var = this.f51608c.get(size);
                if (e0Var != null) {
                    int i4 = e0Var.mPosition;
                    if (i4 >= i3) {
                        e0Var.offsetPosition(-i2, z);
                    } else if (i4 >= i) {
                        e0Var.addFlags(8);
                        mo60021B(size);
                    }
                }
            }
        }

        /* renamed from: y */
        public void mo60058y(Adapter adapter, Adapter adapter2, boolean z) {
            mo60037d();
            mo60043j().mo60013i(adapter, adapter2, z);
        }

        /* renamed from: z */
        public void mo60059z(View view) {
            C20061e0 u0 = RecyclerView.m93254u0(view);
            u0.mScrapContainer = null;
            u0.mInChangeScrap = false;
            u0.clearReturnedFromScrapFlag();
            mo60023D(u0);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$x */
    public interface C20090x {
        /* renamed from: a */
        void mo60060a(@C0359n0 C20061e0 e0Var);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$y */
    public class C20091y extends C20065i {
        public C20091y() {
        }

        /* renamed from: a */
        public void mo30655a() {
            RecyclerView.this.mo59657x((String) null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f51490x1.f51527g = true;
            recyclerView.mo59585l1(true);
            if (!RecyclerView.this.f51463d.mo60213q()) {
                RecyclerView.this.requestLayout();
            }
        }

        /* renamed from: c */
        public void mo30657c(int i, int i2, Object obj) {
            RecyclerView.this.mo59657x((String) null);
            if (RecyclerView.this.f51463d.mo60215s(i, i2, obj)) {
                mo60061h();
            }
        }

        /* renamed from: d */
        public void mo30658d(int i, int i2) {
            RecyclerView.this.mo59657x((String) null);
            if (RecyclerView.this.f51463d.mo60216t(i, i2)) {
                mo60061h();
            }
        }

        /* renamed from: e */
        public void mo30659e(int i, int i2, int i3) {
            RecyclerView.this.mo59657x((String) null);
            if (RecyclerView.this.f51463d.mo60217u(i, i2, i3)) {
                mo60061h();
            }
        }

        /* renamed from: f */
        public void mo30660f(int i, int i2) {
            RecyclerView.this.mo59657x((String) null);
            if (RecyclerView.this.f51463d.mo60218v(i, i2)) {
                mo60061h();
            }
        }

        /* renamed from: g */
        public void mo59827g() {
            Adapter adapter;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f51461c != null && (adapter = recyclerView.f51493z) != null && adapter.canRestoreState()) {
                RecyclerView.this.requestLayout();
            }
        }

        /* renamed from: h */
        public void mo60061h() {
            if (RecyclerView.f51389X1) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f51436L0 && recyclerView.f51434K0) {
                    C18196h2.m82618p1(recyclerView, recyclerView.f51485v);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.f51450T0 = true;
            recyclerView2.requestLayout();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$z */
    public static class C20092z implements C20084s {
        /* renamed from: a */
        public void mo60002a(@C0359n0 RecyclerView recyclerView, @C0359n0 MotionEvent motionEvent) {
        }

        /* renamed from: c */
        public boolean mo60003c(@C0359n0 RecyclerView recyclerView, @C0359n0 MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: e */
        public void mo60004e(boolean z) {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 16843830(0x1010436, float:2.369658E-38)
            r3 = 0
            r1[r3] = r2
            f51386U1 = r1
            f51387V1 = r3
            f51388W1 = r0
            f51389X1 = r0
            f51390Y1 = r0
            f51391Z1 = r3
            f51392a2 = r3
            r1 = 4
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r1[r3] = r2
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r1[r0] = r2
            java.lang.Class r0 = java.lang.Integer.TYPE
            r2 = 2
            r1[r2] = r0
            r2 = 3
            r1[r2] = r0
            f51412u2 = r1
            androidx.recyclerview.widget.RecyclerView$c r0 = new androidx.recyclerview.widget.RecyclerView$c
            r0.<init>()
            f51382A2 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<clinit>():void");
    }

    public RecyclerView(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: A */
    public static void m93248A(@C0359n0 C20061e0 e0Var) {
        WeakReference<RecyclerView> weakReference = e0Var.mNestedRecyclerView;
        if (weakReference != null) {
            View view = weakReference.get();
            while (view != null) {
                if (view != e0Var.itemView) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        view = null;
                    }
                } else {
                    return;
                }
            }
            e0Var.mNestedRecyclerView = null;
        }
    }

    @C0363p0
    /* renamed from: f0 */
    public static RecyclerView m93249f0(@C0359n0 View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView f0 = m93249f0(viewGroup.getChildAt(i));
            if (f0 != null) {
                return f0;
            }
        }
        return null;
    }

    private C18363s1 getScrollingChildHelper() {
        if (this.f51429H1 == null) {
            this.f51429H1 = new C18363s1(this);
        }
        return this.f51429H1;
    }

    /* renamed from: u0 */
    public static C20061e0 m93254u0(View view) {
        if (view == null) {
            return null;
        }
        return ((C20081p) view.getLayoutParams()).f51594a;
    }

    /* renamed from: w0 */
    public static void m93255w0(View view, Rect rect) {
        C20081p pVar = (C20081p) view.getLayoutParams();
        Rect rect2 = pVar.f51595b;
        rect.set((view.getLeft() - rect2.left) - pVar.leftMargin, (view.getTop() - rect2.top) - pVar.topMargin, view.getRight() + rect2.right + pVar.rightMargin, view.getBottom() + rect2.bottom + pVar.bottomMargin);
    }

    @C0359n0
    /* renamed from: A0 */
    public C20075n mo59460A0(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            return this.f51428H0.get(i);
        }
        throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
    }

    /* renamed from: A1 */
    public final void mo59461A1() {
        C20055b0 b0Var = this.f51490x1;
        b0Var.f51534n = -1;
        b0Var.f51533m = -1;
        b0Var.f51535o = -1;
    }

    /* renamed from: B */
    public void mo59462B() {
        int j = this.f51465e.mo60366j();
        for (int i = 0; i < j; i++) {
            C20061e0 u0 = m93254u0(this.f51465e.mo60365i(i));
            if (!u0.shouldIgnore()) {
                u0.clearOldPosition();
            }
        }
        this.f51459b.mo60038e();
    }

    /* renamed from: B0 */
    public final void mo59463B0(long j, C20061e0 e0Var, C20061e0 e0Var2) {
        int g = this.f51465e.mo60363g();
        for (int i = 0; i < g; i++) {
            C20061e0 u0 = m93254u0(this.f51465e.mo60362f(i));
            if (u0 != e0Var && mo59593o0(u0) == j) {
                Adapter adapter = this.f51493z;
                if (adapter == null || !adapter.hasStableIds()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + u0 + " \n View Holder 2:" + e0Var + mo59528Y());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + u0 + " \n View Holder 2:" + e0Var + mo59528Y());
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Problem while matching changed view holders with the newones. The pre-layout information for the change holder ");
        sb.append(e0Var2);
        sb.append(" cannot be found but it is necessary for ");
        sb.append(e0Var);
        sb.append(mo59528Y());
    }

    /* renamed from: B1 */
    public final void mo59464B1() {
        VelocityTracker velocityTracker = this.f51472i1;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        mo52996g(0);
        mo59609p1();
    }

    /* renamed from: C */
    public void mo59465C() {
        List<C20082q> list = this.f51452V0;
        if (list != null) {
            list.clear();
        }
    }

    /* renamed from: C0 */
    public boolean mo59466C0() {
        return this.f51436L0;
    }

    /* renamed from: C1 */
    public final void mo59467C1() {
        View view;
        long j;
        int i;
        C20061e0 e0Var = null;
        if (!this.f51483t1 || !hasFocus() || this.f51493z == null) {
            view = null;
        } else {
            view = getFocusedChild();
        }
        if (view != null) {
            e0Var = mo59537c0(view);
        }
        if (e0Var == null) {
            mo59461A1();
            return;
        }
        C20055b0 b0Var = this.f51490x1;
        if (this.f51493z.hasStableIds()) {
            j = e0Var.getItemId();
        } else {
            j = -1;
        }
        b0Var.f51534n = j;
        C20055b0 b0Var2 = this.f51490x1;
        if (this.f51453W0) {
            i = -1;
        } else if (e0Var.isRemoved()) {
            i = e0Var.mOldPosition;
        } else {
            i = e0Var.getAbsoluteAdapterPosition();
        }
        b0Var2.f51533m = i;
        this.f51490x1.f51535o = mo59658x0(e0Var.itemView);
    }

    /* renamed from: D */
    public void mo59468D() {
        List<C20085t> list = this.f51494z1;
        if (list != null) {
            list.clear();
        }
    }

    /* renamed from: D0 */
    public boolean mo59469D0() {
        if (!this.f51440N0 || this.f51453W0 || this.f51463d.mo60213q()) {
            return true;
        }
        return false;
    }

    /* renamed from: D1 */
    public void mo59470D1() {
        int j = this.f51465e.mo60366j();
        for (int i = 0; i < j; i++) {
            C20061e0 u0 = m93254u0(this.f51465e.mo60365i(i));
            if (!u0.shouldIgnore()) {
                u0.saveOldPosition();
            }
        }
    }

    /* renamed from: E */
    public void mo59471E(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.f51460b1;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.f51460b1.onRelease();
            z = this.f51460b1.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f51464d1;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f51464d1.onRelease();
            z |= this.f51464d1.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f51462c1;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f51462c1.onRelease();
            z |= this.f51462c1.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f51466e1;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f51466e1.onRelease();
            z |= this.f51466e1.isFinished();
        }
        if (z) {
            C18196h2.m82610n1(this);
        }
    }

    /* renamed from: E0 */
    public final boolean mo59472E0() {
        int g = this.f51465e.mo60363g();
        for (int i = 0; i < g; i++) {
            C20061e0 u0 = m93254u0(this.f51465e.mo60362f(i));
            if (u0 != null && !u0.shouldIgnore() && u0.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: E1 */
    public boolean mo59473E1(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        int i8 = i;
        int i9 = i2;
        MotionEvent motionEvent2 = motionEvent;
        mo59474F();
        if (this.f51493z != null) {
            int[] iArr = this.f51435K1;
            iArr[0] = 0;
            iArr[1] = 0;
            mo59476F1(i8, i9, iArr);
            int[] iArr2 = this.f51435K1;
            int i10 = iArr2[0];
            int i11 = iArr2[1];
            i7 = i11;
            i6 = i10;
            i5 = i8 - i10;
            i4 = i9 - i11;
        } else {
            i7 = 0;
            i6 = 0;
            i5 = 0;
            i4 = 0;
        }
        if (!this.f51428H0.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f51435K1;
        iArr3[0] = 0;
        iArr3[1] = 0;
        mo52998a(i6, i7, i5, i4, this.f51431I1, i3, iArr3);
        int[] iArr4 = this.f51435K1;
        int i12 = iArr4[0];
        int i13 = i5 - i12;
        int i14 = iArr4[1];
        int i15 = i4 - i14;
        if (i12 == 0 && i14 == 0) {
            z = false;
        } else {
            z = true;
        }
        int i16 = this.f51475l1;
        int[] iArr5 = this.f51431I1;
        int i17 = iArr5[0];
        this.f51475l1 = i16 - i17;
        int i18 = this.f51476m1;
        int i19 = iArr5[1];
        this.f51476m1 = i18 - i19;
        int[] iArr6 = this.f51433J1;
        iArr6[0] = iArr6[0] + i17;
        iArr6[1] = iArr6[1] + i19;
        if (getOverScrollMode() != 2) {
            if (motionEvent2 != null && !C18327o1.m83041l(motionEvent2, 8194)) {
                mo59588m1(motionEvent.getX(), (float) i13, motionEvent.getY(), (float) i15);
            }
            mo59471E(i, i2);
        }
        if (!(i6 == 0 && i7 == 0)) {
            mo59510R(i6, i7);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (!z && i6 == 0 && i7 == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: F */
    public void mo59474F() {
        if (!this.f51440N0 || this.f51453W0) {
            C17821p0.m81248b(f51406o2);
            mo59495M();
            C17821p0.m81250d();
        } else if (this.f51463d.mo60213q()) {
            if (this.f51463d.mo60212p(4) && !this.f51463d.mo60212p(11)) {
                C17821p0.m81248b(f51407p2);
                mo59506P1();
                mo59538c1();
                this.f51463d.mo60220x();
                if (!this.f51444P0) {
                    if (mo59472E0()) {
                        mo59495M();
                    } else {
                        this.f51463d.mo60206j();
                    }
                }
                mo59509Q1(true);
                mo59541d1();
                C17821p0.m81250d();
            } else if (this.f51463d.mo60213q()) {
                C17821p0.m81248b(f51406o2);
                mo59495M();
                C17821p0.m81250d();
            }
        }
    }

    /* renamed from: F0 */
    public void mo59475F0() {
        this.f51463d = new C20099a(new C20062f());
    }

    /* renamed from: F1 */
    public void mo59476F1(int i, int i2, @C0363p0 int[] iArr) {
        int i3;
        int i4;
        mo59506P1();
        mo59538c1();
        C17821p0.m81248b(f51404m2);
        mo59530Z(this.f51490x1);
        if (i != 0) {
            i3 = this.f51422E0.mo59322Q1(i, this.f51459b, this.f51490x1);
        } else {
            i3 = 0;
        }
        if (i2 != 0) {
            i4 = this.f51422E0.mo59324S1(i2, this.f51459b, this.f51490x1);
        } else {
            i4 = 0;
        }
        C17821p0.m81250d();
        mo59662y1();
        mo59541d1();
        mo59509Q1(false);
        if (iArr != null) {
            iArr[0] = i3;
            iArr[1] = i4;
        }
    }

    /* renamed from: G */
    public final void mo59477G(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        ClassLoader classLoader;
        Object[] objArr;
        Constructor<? extends U> constructor;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String y0 = mo59661y0(context, trim);
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(y0, false, classLoader).asSubclass(C20076o.class);
                    try {
                        constructor = asSubclass.getConstructor(f51412u2);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                    } catch (NoSuchMethodException e) {
                        constructor = asSubclass.getConstructor(new Class[0]);
                        objArr = null;
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((C20076o) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e2) {
                    e2.initCause(e);
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + y0, e2);
                } catch (ClassNotFoundException e3) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + y0, e3);
                } catch (InvocationTargetException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + y0, e4);
                } catch (InstantiationException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + y0, e5);
                } catch (IllegalAccessException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + y0, e6);
                } catch (ClassCastException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + y0, e7);
                }
            }
        }
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: G0 */
    public final void mo59478G0() {
        if (C18196h2.m82544W(this) == 0) {
            C18196h2.m82534S1(this, 8);
        }
    }

    /* renamed from: G1 */
    public void mo59479G1(int i) {
        if (!this.f51446Q0) {
            mo59512R1();
            C20076o oVar = this.f51422E0;
            if (oVar != null) {
                oVar.mo59385R1(i);
                awakenScrollBars();
            }
        }
    }

    /* renamed from: H */
    public void mo59480H(int i, int i2) {
        setMeasuredDimension(C20076o.m93540y(i, getPaddingLeft() + getPaddingRight(), C18196h2.m82577f0(this)), C20076o.m93540y(i2, getPaddingTop() + getPaddingBottom(), C18196h2.m82573e0(this)));
    }

    /* renamed from: H0 */
    public final void mo59481H0() {
        this.f51465e = new C20128g(new C20060e());
    }

    /* renamed from: H1 */
    public final void mo59482H1(@C0363p0 Adapter adapter, boolean z, boolean z2) {
        Adapter adapter2 = this.f51493z;
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(this.f51457a);
            this.f51493z.onDetachedFromRecyclerView(this);
        }
        if (!z || z2) {
            mo59612q1();
        }
        this.f51463d.mo60222z();
        Adapter adapter3 = this.f51493z;
        this.f51493z = adapter;
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.f51457a);
            adapter.onAttachedToRecyclerView(this);
        }
        C20076o oVar = this.f51422E0;
        if (oVar != null) {
            oVar.mo59920X0(adapter3, this.f51493z);
        }
        this.f51459b.mo60058y(adapter3, this.f51493z, z);
        this.f51490x1.f51527g = true;
    }

    /* renamed from: I */
    public final boolean mo59483I(int i, int i2) {
        mo59547e0(this.f51427G1);
        int[] iArr = this.f51427G1;
        if (iArr[0] == i && iArr[1] == i2) {
            return false;
        }
        return true;
    }

    @C0344h1
    /* renamed from: I0 */
    public void mo59484I0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + mo59528Y());
        }
        Resources resources = getContext().getResources();
        new C20175l(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C20030a.C20033c.fastscroll_default_thickness), resources.getDimensionPixelSize(C20030a.C20033c.fastscroll_minimum_range), resources.getDimensionPixelOffset(C20030a.C20033c.fastscroll_margin));
    }

    @C0344h1
    /* renamed from: I1 */
    public boolean mo59485I1(C20061e0 e0Var, int i) {
        if (mo59499N0()) {
            e0Var.mPendingAccessibilityState = i;
            this.f51437L1.add(e0Var);
            return false;
        }
        C18196h2.m82531R1(e0Var.itemView, i);
        return true;
    }

    /* renamed from: J */
    public void mo59486J(View view) {
        C20061e0 u0 = m93254u0(view);
        mo59533a1(view);
        Adapter adapter = this.f51493z;
        if (!(adapter == null || u0 == null)) {
            adapter.onViewAttachedToWindow(u0);
        }
        List<C20082q> list = this.f51452V0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f51452V0.get(size).mo32760d(view);
            }
        }
    }

    /* renamed from: J0 */
    public void mo59487J0() {
        this.f51466e1 = null;
        this.f51462c1 = null;
        this.f51464d1 = null;
        this.f51460b1 = null;
    }

    /* renamed from: J1 */
    public boolean mo59488J1(AccessibilityEvent accessibilityEvent) {
        int i;
        int i2 = 0;
        if (!mo59499N0()) {
            return false;
        }
        if (accessibilityEvent != null) {
            i = C18035b.m81891d(accessibilityEvent);
        } else {
            i = 0;
        }
        if (i != 0) {
            i2 = i;
        }
        this.f51449S0 |= i2;
        return true;
    }

    /* renamed from: K */
    public void mo59489K(View view) {
        C20061e0 u0 = m93254u0(view);
        mo59536b1(view);
        Adapter adapter = this.f51493z;
        if (!(adapter == null || u0 == null)) {
            adapter.onViewDetachedFromWindow(u0);
        }
        List<C20082q> list = this.f51452V0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f51452V0.get(size).mo32759b(view);
            }
        }
    }

    /* renamed from: K0 */
    public void mo59490K0() {
        if (this.f51428H0.size() != 0) {
            C20076o oVar = this.f51422E0;
            if (oVar != null) {
                oVar.mo59419q("Cannot invalidate item decorations during a scroll or layout");
            }
            mo59511R0();
            requestLayout();
        }
    }

    /* renamed from: K1 */
    public void mo59491K1(@C0372t0 int i, @C0372t0 int i2) {
        mo59494L1(i, i2, (Interpolator) null);
    }

    /* renamed from: L */
    public final void mo59492L() {
        int i = this.f51449S0;
        this.f51449S0 = 0;
        if (i != 0 && mo59493L0()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            C18035b.m81896i(obtain, i);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    /* renamed from: L0 */
    public boolean mo59493L0() {
        AccessibilityManager accessibilityManager = this.f51451U0;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    /* renamed from: L1 */
    public void mo59494L1(@C0372t0 int i, @C0372t0 int i2, @C0363p0 Interpolator interpolator) {
        mo59497M1(i, i2, interpolator, Integer.MIN_VALUE);
    }

    /* renamed from: M */
    public void mo59495M() {
        boolean z;
        if (this.f51493z != null && this.f51422E0 != null) {
            this.f51490x1.f51530j = false;
            if (!this.f51441N1 || (this.f51443O1 == getWidth() && this.f51445P1 == getHeight())) {
                z = false;
            } else {
                z = true;
            }
            this.f51443O1 = 0;
            this.f51445P1 = 0;
            this.f51441N1 = false;
            if (this.f51490x1.f51525e == 1) {
                mo59498N();
                this.f51422E0.mo59912U1(this);
                mo59501O();
            } else if (this.f51463d.mo60214r() || z || this.f51422E0.mo59868B0() != getWidth() || this.f51422E0.mo59958m0() != getHeight()) {
                this.f51422E0.mo59912U1(this);
                mo59501O();
            } else {
                this.f51422E0.mo59912U1(this);
            }
            mo59504P();
        }
    }

    /* renamed from: M0 */
    public boolean mo59496M0() {
        C20069l lVar = this.f51468f1;
        return lVar != null && lVar.mo59848q();
    }

    /* renamed from: M1 */
    public void mo59497M1(@C0372t0 int i, @C0372t0 int i2, @C0363p0 Interpolator interpolator, int i3) {
        mo59500N1(i, i2, interpolator, i3, false);
    }

    /* renamed from: N */
    public final void mo59498N() {
        boolean z = true;
        this.f51490x1.mo59726a(1);
        mo59530Z(this.f51490x1);
        this.f51490x1.f51530j = false;
        mo59506P1();
        this.f51467f.mo60503f();
        mo59538c1();
        mo59583k1();
        mo59467C1();
        C20055b0 b0Var = this.f51490x1;
        if (!b0Var.f51531k || !this.f51419B1) {
            z = false;
        }
        b0Var.f51529i = z;
        this.f51419B1 = false;
        this.f51418A1 = false;
        b0Var.f51528h = b0Var.f51532l;
        b0Var.f51526f = this.f51493z.getItemCount();
        mo59547e0(this.f51427G1);
        if (this.f51490x1.f51531k) {
            int g = this.f51465e.mo60363g();
            for (int i = 0; i < g; i++) {
                C20061e0 u0 = m93254u0(this.f51465e.mo60362f(i));
                if (!u0.shouldIgnore() && (!u0.isInvalid() || this.f51493z.hasStableIds())) {
                    this.f51467f.mo60502e(u0, this.f51468f1.mo59854w(this.f51490x1, u0, C20069l.m93496e(u0), u0.getUnmodifiedPayloads()));
                    if (this.f51490x1.f51529i && u0.isUpdated() && !u0.isRemoved() && !u0.shouldIgnore() && !u0.isInvalid()) {
                        this.f51467f.mo60500c(mo59593o0(u0), u0);
                    }
                }
            }
        }
        if (this.f51490x1.f51532l) {
            mo59470D1();
            C20055b0 b0Var2 = this.f51490x1;
            boolean z2 = b0Var2.f51527g;
            b0Var2.f51527g = false;
            this.f51422E0.mo59341q1(this.f51459b, b0Var2);
            this.f51490x1.f51527g = z2;
            for (int i2 = 0; i2 < this.f51465e.mo60363g(); i2++) {
                C20061e0 u02 = m93254u0(this.f51465e.mo60362f(i2));
                if (!u02.shouldIgnore() && !this.f51467f.mo60506i(u02)) {
                    int e = C20069l.m93496e(u02);
                    boolean hasAnyOfTheFlags = u02.hasAnyOfTheFlags(8192);
                    if (!hasAnyOfTheFlags) {
                        e |= 4096;
                    }
                    C20069l.C20073d w = this.f51468f1.mo59854w(this.f51490x1, u02, e, u02.getUnmodifiedPayloads());
                    if (hasAnyOfTheFlags) {
                        mo59591n1(u02, w);
                    } else {
                        this.f51467f.mo60498a(u02, w);
                    }
                }
            }
            mo59462B();
        } else {
            mo59462B();
        }
        mo59541d1();
        mo59509Q1(false);
        this.f51490x1.f51525e = 2;
    }

    /* renamed from: N0 */
    public boolean mo59499N0() {
        return this.f51455Y0 > 0;
    }

    /* renamed from: N1 */
    public void mo59500N1(@C0372t0 int i, @C0372t0 int i2, @C0363p0 Interpolator interpolator, int i3, boolean z) {
        boolean z2;
        C20076o oVar = this.f51422E0;
        if (oVar != null && !this.f51446Q0) {
            int i4 = 0;
            if (!oVar.mo59428v()) {
                i = 0;
            }
            if (!this.f51422E0.mo59431w()) {
                i2 = 0;
            }
            if (i != 0 || i2 != 0) {
                if (i3 == Integer.MIN_VALUE || i3 > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    if (z) {
                        if (i != 0) {
                            i4 = 1;
                        }
                        if (i2 != 0) {
                            i4 |= 2;
                        }
                        mo52993d(i4, 1);
                    }
                    this.f51484u1.mo59752e(i, i2, i3, interpolator);
                    return;
                }
                scrollBy(i, i2);
            }
        }
    }

    /* renamed from: O */
    public final void mo59501O() {
        boolean z;
        mo59506P1();
        mo59538c1();
        this.f51490x1.mo59726a(6);
        this.f51463d.mo60207k();
        this.f51490x1.f51526f = this.f51493z.getItemCount();
        this.f51490x1.f51524d = 0;
        if (this.f51461c != null && this.f51493z.canRestoreState()) {
            Parcelable parcelable = this.f51461c.f51499c;
            if (parcelable != null) {
                this.f51422E0.mo59429v1(parcelable);
            }
            this.f51461c = null;
        }
        C20055b0 b0Var = this.f51490x1;
        b0Var.f51528h = false;
        this.f51422E0.mo59341q1(this.f51459b, b0Var);
        C20055b0 b0Var2 = this.f51490x1;
        b0Var2.f51527g = false;
        if (!b0Var2.f51531k || this.f51468f1 == null) {
            z = false;
        } else {
            z = true;
        }
        b0Var2.f51531k = z;
        b0Var2.f51525e = 4;
        mo59541d1();
        mo59509Q1(false);
    }

    @Deprecated
    /* renamed from: O0 */
    public boolean mo59502O0() {
        return isLayoutSuppressed();
    }

    /* renamed from: O1 */
    public void mo59503O1(int i) {
        C20076o oVar;
        if (!this.f51446Q0 && (oVar = this.f51422E0) != null) {
            oVar.mo59403f2(this, this.f51490x1, i);
        }
    }

    /* renamed from: P */
    public final void mo59504P() {
        this.f51490x1.mo59726a(4);
        mo59506P1();
        mo59538c1();
        C20055b0 b0Var = this.f51490x1;
        b0Var.f51525e = 1;
        if (b0Var.f51531k) {
            for (int g = this.f51465e.mo60363g() - 1; g >= 0; g--) {
                C20061e0 u0 = m93254u0(this.f51465e.mo60362f(g));
                if (!u0.shouldIgnore()) {
                    long o0 = mo59593o0(u0);
                    C20069l.C20073d v = this.f51468f1.mo59853v(this.f51490x1, u0);
                    C20061e0 g2 = this.f51467f.mo60504g(o0);
                    if (g2 == null || g2.shouldIgnore()) {
                        this.f51467f.mo60501d(u0, v);
                    } else {
                        boolean h = this.f51467f.mo60505h(g2);
                        boolean h2 = this.f51467f.mo60505h(u0);
                        if (!h || g2 != u0) {
                            C20069l.C20073d n = this.f51467f.mo60511n(g2);
                            this.f51467f.mo60501d(u0, v);
                            C20069l.C20073d m = this.f51467f.mo60510m(u0);
                            if (n == null) {
                                mo59463B0(o0, u0, g2);
                            } else {
                                mo59650u(g2, u0, n, m, h, h2);
                            }
                        } else {
                            this.f51467f.mo60501d(u0, v);
                        }
                    }
                }
            }
            this.f51467f.mo60512o(this.f51447Q1);
        }
        this.f51422E0.mo59877F1(this.f51459b);
        C20055b0 b0Var2 = this.f51490x1;
        b0Var2.f51523c = b0Var2.f51526f;
        this.f51453W0 = false;
        this.f51454X0 = false;
        b0Var2.f51531k = false;
        b0Var2.f51532l = false;
        this.f51422E0.f51583v = false;
        ArrayList<C20061e0> arrayList = this.f51459b.f51607b;
        if (arrayList != null) {
            arrayList.clear();
        }
        C20076o oVar = this.f51422E0;
        if (oVar.f51574Y) {
            oVar.f51573X = 0;
            oVar.f51574Y = false;
            this.f51459b.mo60031L();
        }
        this.f51422E0.mo59342r1(this.f51490x1);
        mo59541d1();
        mo59509Q1(false);
        this.f51467f.mo60503f();
        int[] iArr = this.f51427G1;
        if (mo59483I(iArr[0], iArr[1])) {
            mo59510R(0, 0);
        }
        mo59594o1();
        mo59461A1();
    }

    /* renamed from: P0 */
    public final boolean mo59505P0(View view, View view2, int i) {
        int i2;
        int i3;
        if (view2 == null || view2 == this || view2 == view || mo59535b0(view2) == null) {
            return false;
        }
        if (view == null || mo59535b0(view) == null) {
            return true;
        }
        this.f51487w.set(0, 0, view.getWidth(), view.getHeight());
        this.f51489x.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f51487w);
        offsetDescendantRectToMyCoords(view2, this.f51489x);
        char c = 65535;
        if (this.f51422E0.mo59966q0() == 1) {
            i2 = -1;
        } else {
            i2 = 1;
        }
        Rect rect = this.f51487w;
        int i4 = rect.left;
        Rect rect2 = this.f51489x;
        int i5 = rect2.left;
        if ((i4 < i5 || rect.right <= i5) && rect.right < rect2.right) {
            i3 = 1;
        } else {
            int i6 = rect.right;
            int i7 = rect2.right;
            if ((i6 > i7 || i4 >= i7) && i4 > i5) {
                i3 = -1;
            } else {
                i3 = 0;
            }
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
            c = 1;
        } else {
            int i10 = rect.bottom;
            int i11 = rect2.bottom;
            if ((i10 <= i11 && i8 < i11) || i8 <= i9) {
                c = 0;
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i != 130) {
                                throw new IllegalArgumentException("Invalid direction: " + i + mo59528Y());
                            } else if (c > 0) {
                                return true;
                            } else {
                                return false;
                            }
                        } else if (i3 > 0) {
                            return true;
                        } else {
                            return false;
                        }
                    } else if (c < 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else if (i3 < 0) {
                    return true;
                } else {
                    return false;
                }
            } else if (c > 0 || (c == 0 && i3 * i2 > 0)) {
                return true;
            } else {
                return false;
            }
        } else if (c < 0 || (c == 0 && i3 * i2 < 0)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: P1 */
    public void mo59506P1() {
        int i = this.f51442O0 + 1;
        this.f51442O0 = i;
        if (i == 1 && !this.f51446Q0) {
            this.f51444P0 = false;
        }
    }

    /* renamed from: Q */
    public void mo59507Q(int i) {
        C20076o oVar = this.f51422E0;
        if (oVar != null) {
            oVar.mo59981x1(i);
        }
        mo59552g1(i);
        C20085t tVar = this.f51492y1;
        if (tVar != null) {
            tVar.mo30661a(this, i);
        }
        List<C20085t> list = this.f51494z1;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f51494z1.get(size).mo30661a(this, i);
            }
        }
    }

    /* renamed from: Q0 */
    public void mo59508Q0(int i) {
        if (this.f51422E0 != null) {
            setScrollState(2);
            this.f51422E0.mo59385R1(i);
            awakenScrollBars();
        }
    }

    /* renamed from: Q1 */
    public void mo59509Q1(boolean z) {
        if (this.f51442O0 < 1) {
            this.f51442O0 = 1;
        }
        if (!z && !this.f51446Q0) {
            this.f51444P0 = false;
        }
        if (this.f51442O0 == 1) {
            if (z && this.f51444P0 && !this.f51446Q0 && this.f51422E0 != null && this.f51493z != null) {
                mo59495M();
            }
            if (!this.f51446Q0) {
                this.f51444P0 = false;
            }
        }
        this.f51442O0--;
    }

    /* renamed from: R */
    public void mo59510R(int i, int i2) {
        this.f51456Z0++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        mo59575h1(i, i2);
        C20085t tVar = this.f51492y1;
        if (tVar != null) {
            tVar.mo30662b(this, i, i2);
        }
        List<C20085t> list = this.f51494z1;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f51494z1.get(size).mo30662b(this, i, i2);
            }
        }
        this.f51456Z0--;
    }

    /* renamed from: R0 */
    public void mo59511R0() {
        int j = this.f51465e.mo60366j();
        for (int i = 0; i < j; i++) {
            ((C20081p) this.f51465e.mo60365i(i).getLayoutParams()).f51596c = true;
        }
        this.f51459b.mo60053t();
    }

    /* renamed from: R1 */
    public void mo59512R1() {
        setScrollState(0);
        mo59515S1();
    }

    /* renamed from: S */
    public void mo59513S() {
        int i;
        for (int size = this.f51437L1.size() - 1; size >= 0; size--) {
            C20061e0 e0Var = this.f51437L1.get(size);
            if (e0Var.itemView.getParent() == this && !e0Var.shouldIgnore() && (i = e0Var.mPendingAccessibilityState) != -1) {
                C18196h2.m82531R1(e0Var.itemView, i);
                e0Var.mPendingAccessibilityState = -1;
            }
        }
        this.f51437L1.clear();
    }

    /* renamed from: S0 */
    public void mo59514S0() {
        int j = this.f51465e.mo60366j();
        for (int i = 0; i < j; i++) {
            C20061e0 u0 = m93254u0(this.f51465e.mo60365i(i));
            if (u0 != null && !u0.shouldIgnore()) {
                u0.addFlags(6);
            }
        }
        mo59511R0();
        this.f51459b.mo60054u();
    }

    /* renamed from: S1 */
    public final void mo59515S1() {
        this.f51484u1.mo59753f();
        C20076o oVar = this.f51422E0;
        if (oVar != null) {
            oVar.mo59952i2();
        }
    }

    /* renamed from: T */
    public final boolean mo59516T(MotionEvent motionEvent) {
        C20084s sVar = this.f51432J0;
        if (sVar != null) {
            sVar.mo60002a(this, motionEvent);
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.f51432J0 = null;
            }
            return true;
        } else if (motionEvent.getAction() == 0) {
            return false;
        } else {
            return mo59540d0(motionEvent);
        }
    }

    /* renamed from: T0 */
    public void mo59517T0(int i, int i2) {
        mo59520U0(i, i2, (MotionEvent) null, 1);
    }

    /* renamed from: T1 */
    public void mo59518T1(@C0363p0 Adapter adapter, boolean z) {
        setLayoutFrozen(false);
        mo59482H1(adapter, true, z);
        mo59585l1(true);
        requestLayout();
    }

    /* renamed from: U */
    public void mo59519U() {
        if (this.f51466e1 == null) {
            EdgeEffect a = this.f51458a1.mo59829a(this, 3);
            this.f51466e1 = a;
            if (this.f51469g) {
                a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* renamed from: U0 */
    public final void mo59520U0(int i, int i2, @C0363p0 MotionEvent motionEvent, int i3) {
        boolean z;
        int i4;
        int i5;
        int i6;
        C20076o oVar = this.f51422E0;
        if (oVar != null && !this.f51446Q0) {
            int[] iArr = this.f51435K1;
            int i7 = 0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean v = oVar.mo59428v();
            boolean w = this.f51422E0.mo59431w();
            if (w) {
                z = v | true;
            } else {
                z = v;
            }
            mo52993d(z ? 1 : 0, i3);
            if (v) {
                i4 = i;
            } else {
                i4 = 0;
            }
            if (w) {
                i5 = i2;
            } else {
                i5 = 0;
            }
            if (mo52995f(i4, i5, this.f51435K1, this.f51431I1, i3)) {
                int[] iArr2 = this.f51435K1;
                i -= iArr2[0];
                i2 -= iArr2[1];
            }
            if (v) {
                i6 = i;
            } else {
                i6 = 0;
            }
            if (w) {
                i7 = i2;
            }
            mo59473E1(i6, i7, motionEvent, i3);
            C20186m mVar = this.f51486v1;
            if (!(mVar == null || (i == 0 && i2 == 0))) {
                mVar.mo60557g(this, i, i2);
            }
            mo52996g(i3);
        }
    }

    /* renamed from: U1 */
    public void mo59521U1(int i, int i2, Object obj) {
        int i3;
        int j = this.f51465e.mo60366j();
        int i4 = i + i2;
        for (int i5 = 0; i5 < j; i5++) {
            View i6 = this.f51465e.mo60365i(i5);
            C20061e0 u0 = m93254u0(i6);
            if (u0 != null && !u0.shouldIgnore() && (i3 = u0.mPosition) >= i && i3 < i4) {
                u0.addFlags(2);
                u0.addChangePayload(obj);
                ((C20081p) i6.getLayoutParams()).f51596c = true;
            }
        }
        this.f51459b.mo60033N(i, i2);
    }

    /* renamed from: V */
    public void mo59522V() {
        if (this.f51460b1 == null) {
            EdgeEffect a = this.f51458a1.mo59829a(this, 0);
            this.f51460b1 = a;
            if (this.f51469g) {
                a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* renamed from: V0 */
    public void mo59523V0(@C0372t0 int i) {
        int g = this.f51465e.mo60363g();
        for (int i2 = 0; i2 < g; i2++) {
            this.f51465e.mo60362f(i2).offsetLeftAndRight(i);
        }
    }

    /* renamed from: W */
    public void mo59524W() {
        if (this.f51464d1 == null) {
            EdgeEffect a = this.f51458a1.mo59829a(this, 2);
            this.f51464d1 = a;
            if (this.f51469g) {
                a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* renamed from: W0 */
    public void mo59525W0(@C0372t0 int i) {
        int g = this.f51465e.mo60363g();
        for (int i2 = 0; i2 < g; i2++) {
            this.f51465e.mo60362f(i2).offsetTopAndBottom(i);
        }
    }

    /* renamed from: X */
    public void mo59526X() {
        if (this.f51462c1 == null) {
            EdgeEffect a = this.f51458a1.mo59829a(this, 1);
            this.f51462c1 = a;
            if (this.f51469g) {
                a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* renamed from: X0 */
    public void mo59527X0(int i, int i2) {
        int j = this.f51465e.mo60366j();
        for (int i3 = 0; i3 < j; i3++) {
            C20061e0 u0 = m93254u0(this.f51465e.mo60365i(i3));
            if (u0 != null && !u0.shouldIgnore() && u0.mPosition >= i) {
                u0.offsetPosition(i2, false);
                this.f51490x1.f51527g = true;
            }
        }
        this.f51459b.mo60055v(i, i2);
        requestLayout();
    }

    /* renamed from: Y */
    public String mo59528Y() {
        return " " + super.toString() + ", adapter:" + this.f51493z + ", layout:" + this.f51422E0 + ", context:" + getContext();
    }

    /* renamed from: Y0 */
    public void mo59529Y0(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int j = this.f51465e.mo60366j();
        if (i < i2) {
            i5 = -1;
            i4 = i;
            i3 = i2;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i7 = 0; i7 < j; i7++) {
            C20061e0 u0 = m93254u0(this.f51465e.mo60365i(i7));
            if (u0 != null && (i6 = u0.mPosition) >= i4 && i6 <= i3) {
                if (i6 == i) {
                    u0.offsetPosition(i2 - i, false);
                } else {
                    u0.offsetPosition(i5, false);
                }
                this.f51490x1.f51527g = true;
            }
        }
        this.f51459b.mo60056w(i, i2);
        requestLayout();
    }

    /* renamed from: Z */
    public final void mo59530Z(C20055b0 b0Var) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f51484u1.f51541c;
            b0Var.f51536p = overScroller.getFinalX() - overScroller.getCurrX();
            b0Var.f51537q = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        b0Var.f51536p = 0;
        b0Var.f51537q = 0;
    }

    /* renamed from: Z0 */
    public void mo59531Z0(int i, int i2, boolean z) {
        int i3 = i + i2;
        int j = this.f51465e.mo60366j();
        for (int i4 = 0; i4 < j; i4++) {
            C20061e0 u0 = m93254u0(this.f51465e.mo60365i(i4));
            if (u0 != null && !u0.shouldIgnore()) {
                int i5 = u0.mPosition;
                if (i5 >= i3) {
                    u0.offsetPosition(-i2, z);
                    this.f51490x1.f51527g = true;
                } else if (i5 >= i) {
                    u0.flagRemovedAndOffsetPosition(i - 1, -i2, z);
                    this.f51490x1.f51527g = true;
                }
            }
        }
        this.f51459b.mo60057x(i, i2, z);
        requestLayout();
    }

    /* renamed from: a */
    public final void mo52998a(int i, int i2, int i3, int i4, int[] iArr, int i5, @C0359n0 int[] iArr2) {
        getScrollingChildHelper().mo53013e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    @C0363p0
    /* renamed from: a0 */
    public View mo59532a0(float f, float f2) {
        for (int g = this.f51465e.mo60363g() - 1; g >= 0; g--) {
            View f3 = this.f51465e.mo60362f(g);
            float translationX = f3.getTranslationX();
            float translationY = f3.getTranslationY();
            if (f >= ((float) f3.getLeft()) + translationX && f <= ((float) f3.getRight()) + translationX && f2 >= ((float) f3.getTop()) + translationY && f2 <= ((float) f3.getBottom()) + translationY) {
                return f3;
            }
        }
        return null;
    }

    /* renamed from: a1 */
    public void mo59533a1(@C0359n0 View view) {
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C20076o oVar = this.f51422E0;
        if (oVar == null || !oVar.mo59923Y0(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    /* renamed from: b */
    public boolean mo52992b(int i) {
        return getScrollingChildHelper().mo53020l(i);
    }

    @C0363p0
    /* renamed from: b0 */
    public View mo59535b0(@C0359n0 View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    /* renamed from: b1 */
    public void mo59536b1(@C0359n0 View view) {
    }

    @C0363p0
    /* renamed from: c0 */
    public C20061e0 mo59537c0(@C0359n0 View view) {
        View b0 = mo59535b0(view);
        if (b0 == null) {
            return null;
        }
        return mo59648t0(b0);
    }

    /* renamed from: c1 */
    public void mo59538c1() {
        this.f51455Y0++;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C20081p) && this.f51422E0.mo59346x((C20081p) layoutParams);
    }

    public int computeHorizontalScrollExtent() {
        C20076o oVar = this.f51422E0;
        if (oVar != null && oVar.mo59428v()) {
            return this.f51422E0.mo59366B(this.f51490x1);
        }
        return 0;
    }

    public int computeHorizontalScrollOffset() {
        C20076o oVar = this.f51422E0;
        if (oVar != null && oVar.mo59428v()) {
            return this.f51422E0.mo59303C(this.f51490x1);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        C20076o oVar = this.f51422E0;
        if (oVar != null && oVar.mo59428v()) {
            return this.f51422E0.mo59305D(this.f51490x1);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        C20076o oVar = this.f51422E0;
        if (oVar != null && oVar.mo59431w()) {
            return this.f51422E0.mo59370E(this.f51490x1);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        C20076o oVar = this.f51422E0;
        if (oVar != null && oVar.mo59431w()) {
            return this.f51422E0.mo59308F(this.f51490x1);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        C20076o oVar = this.f51422E0;
        if (oVar != null && oVar.mo59431w()) {
            return this.f51422E0.mo59311G(this.f51490x1);
        }
        return 0;
    }

    /* renamed from: d */
    public boolean mo52993d(int i, int i2) {
        return getScrollingChildHelper().mo53027s(i, i2);
    }

    /* renamed from: d0 */
    public final boolean mo59540d0(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f51430I0.size();
        int i = 0;
        while (i < size) {
            C20084s sVar = this.f51430I0.get(i);
            if (!sVar.mo60003c(this, motionEvent) || action == 3) {
                i++;
            } else {
                this.f51432J0 = sVar;
                return true;
            }
        }
        return false;
    }

    /* renamed from: d1 */
    public void mo59541d1() {
        mo59548e1(true);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().mo53009a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().mo53010b(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().mo53011c(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().mo53014f(i, i2, i3, i4, iArr);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        int i2;
        super.draw(canvas);
        int size = this.f51428H0.size();
        boolean z4 = false;
        for (int i3 = 0; i3 < size; i3++) {
            this.f51428H0.get(i3).mo59103k(canvas, this, this.f51490x1);
        }
        EdgeEffect edgeEffect = this.f51460b1;
        boolean z5 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            if (this.f51469g) {
                i2 = getPaddingBottom();
            } else {
                i2 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + i2), 0.0f);
            EdgeEffect edgeEffect2 = this.f51460b1;
            if (edgeEffect2 == null || !edgeEffect2.draw(canvas)) {
                z = false;
            } else {
                z = true;
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f51462c1;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f51469g) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f51462c1;
            if (edgeEffect4 == null || !edgeEffect4.draw(canvas)) {
                z3 = false;
            } else {
                z3 = true;
            }
            z |= z3;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f51464d1;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.f51469g) {
                i = getPaddingTop();
            } else {
                i = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate((float) i, (float) (-width));
            EdgeEffect edgeEffect6 = this.f51464d1;
            if (edgeEffect6 == null || !edgeEffect6.draw(canvas)) {
                z2 = false;
            } else {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f51466e1;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f51469g) {
                canvas.translate((float) ((-getWidth()) + getPaddingRight()), (float) ((-getHeight()) + getPaddingBottom()));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect8 = this.f51466e1;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z4 = true;
            }
            z |= z4;
            canvas.restoreToCount(save4);
        }
        if (z || this.f51468f1 == null || this.f51428H0.size() <= 0 || !this.f51468f1.mo59848q()) {
            z5 = z;
        }
        if (z5) {
            C18196h2.m82610n1(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* renamed from: e */
    public boolean mo52994e(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getScrollingChildHelper().mo53015g(i, i2, i3, i4, iArr, i5);
    }

    /* renamed from: e0 */
    public final void mo59547e0(int[] iArr) {
        int g = this.f51465e.mo60363g();
        if (g == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < g; i3++) {
            C20061e0 u0 = m93254u0(this.f51465e.mo60362f(i3));
            if (!u0.shouldIgnore()) {
                int layoutPosition = u0.getLayoutPosition();
                if (layoutPosition < i) {
                    i = layoutPosition;
                }
                if (layoutPosition > i2) {
                    i2 = layoutPosition;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* renamed from: e1 */
    public void mo59548e1(boolean z) {
        int i = this.f51455Y0 - 1;
        this.f51455Y0 = i;
        if (i < 1) {
            this.f51455Y0 = 0;
            if (z) {
                mo59492L();
                mo59513S();
            }
        }
    }

    /* renamed from: f */
    public boolean mo52995f(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().mo53012d(i, i2, iArr, iArr2, i3);
    }

    /* renamed from: f1 */
    public final void mo59549f1(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f51471h1) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f51471h1 = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.f51475l1 = x;
            this.f51473j1 = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.f51476m1 = y;
            this.f51474k1 = y;
        }
    }

    public View focusSearch(View view, int i) {
        boolean z;
        View view2;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        int i3;
        View j1 = this.f51422E0.mo59954j1(view, i);
        if (j1 != null) {
            return j1;
        }
        boolean z5 = true;
        if (this.f51493z == null || this.f51422E0 == null || mo59499N0() || this.f51446Q0) {
            z = false;
        } else {
            z = true;
        }
        FocusFinder instance = FocusFinder.getInstance();
        if (!z || !(i == 2 || i == 1)) {
            View findNextFocus = instance.findNextFocus(this, view, i);
            if (findNextFocus != null || !z) {
                view2 = findNextFocus;
            } else {
                mo59474F();
                if (mo59535b0(view) == null) {
                    return null;
                }
                mo59506P1();
                view2 = this.f51422E0.mo59330c1(view, i, this.f51459b, this.f51490x1);
                mo59509Q1(false);
            }
        } else {
            if (this.f51422E0.mo59431w()) {
                if (i == 2) {
                    i3 = 130;
                } else {
                    i3 = 33;
                }
                if (instance.findNextFocus(this, view, i3) == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (f51391Z1) {
                    i = i3;
                }
            } else {
                z2 = false;
            }
            if (!z2 && this.f51422E0.mo59428v()) {
                if (this.f51422E0.mo59966q0() == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (i == 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z3 ^ z4) {
                    i2 = 66;
                } else {
                    i2 = 17;
                }
                if (instance.findNextFocus(this, view, i2) != null) {
                    z5 = false;
                }
                if (f51391Z1) {
                    i = i2;
                }
                z2 = z5;
            }
            if (z2) {
                mo59474F();
                if (mo59535b0(view) == null) {
                    return null;
                }
                mo59506P1();
                this.f51422E0.mo59330c1(view, i, this.f51459b, this.f51490x1);
                mo59509Q1(false);
            }
            view2 = instance.findNextFocus(this, view, i);
        }
        if (view2 == null || view2.hasFocusable()) {
            if (mo59505P0(view, view2, i)) {
                return view2;
            }
            return super.focusSearch(view, i);
        } else if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        } else {
            mo59665z1(view2, (View) null);
            return view;
        }
    }

    /* renamed from: g */
    public void mo52996g(int i) {
        getScrollingChildHelper().mo53029u(i);
    }

    @C0363p0
    /* renamed from: g0 */
    public final View mo59551g0() {
        C20061e0 h0;
        C20055b0 b0Var = this.f51490x1;
        int i = b0Var.f51533m;
        if (i == -1) {
            i = 0;
        }
        int d = b0Var.mo59729d();
        int i2 = i;
        while (i2 < d) {
            C20061e0 h02 = mo59574h0(i2);
            if (h02 == null) {
                break;
            } else if (h02.itemView.hasFocusable()) {
                return h02.itemView;
            } else {
                i2++;
            }
        }
        int min = Math.min(d, i);
        while (true) {
            min--;
            if (min < 0 || (h0 = mo59574h0(min)) == null) {
                return null;
            }
            if (h0.itemView.hasFocusable()) {
                return h0.itemView;
            }
        }
    }

    /* renamed from: g1 */
    public void mo59552g1(int i) {
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C20076o oVar = this.f51422E0;
        if (oVar != null) {
            return oVar.mo59323S();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + mo59528Y());
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        C20076o oVar = this.f51422E0;
        if (oVar != null) {
            return oVar.mo59326T(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + mo59528Y());
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    @C0363p0
    public Adapter getAdapter() {
        return this.f51493z;
    }

    public int getBaseline() {
        C20076o oVar = this.f51422E0;
        if (oVar != null) {
            return oVar.mo59913V();
        }
        return super.getBaseline();
    }

    public int getChildDrawingOrder(int i, int i2) {
        C20066j jVar = this.f51425F1;
        if (jVar == null) {
            return super.getChildDrawingOrder(i, i2);
        }
        return jVar.mo59828a(i, i2);
    }

    public boolean getClipToPadding() {
        return this.f51469g;
    }

    @C0363p0
    public C20102a0 getCompatAccessibilityDelegate() {
        return this.f51423E1;
    }

    @C0359n0
    public C20067k getEdgeEffectFactory() {
        return this.f51458a1;
    }

    @C0363p0
    public C20069l getItemAnimator() {
        return this.f51468f1;
    }

    public int getItemDecorationCount() {
        return this.f51428H0.size();
    }

    @C0363p0
    public C20076o getLayoutManager() {
        return this.f51422E0;
    }

    public int getMaxFlingVelocity() {
        return this.f51480q1;
    }

    public int getMinFlingVelocity() {
        return this.f51479p1;
    }

    /* access modifiers changed from: package-private */
    public long getNanoTime() {
        if (f51390Y1) {
            return System.nanoTime();
        }
        return 0;
    }

    @C0363p0
    public C20083r getOnFlingListener() {
        return this.f51478o1;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f51483t1;
    }

    @C0359n0
    public C20087v getRecycledViewPool() {
        return this.f51459b.mo60043j();
    }

    public int getScrollState() {
        return this.f51470g1;
    }

    /* renamed from: h */
    public void mo59573h(int i, int i2) {
        if (i < 0) {
            mo59522V();
            if (this.f51460b1.isFinished()) {
                this.f51460b1.onAbsorb(-i);
            }
        } else if (i > 0) {
            mo59524W();
            if (this.f51464d1.isFinished()) {
                this.f51464d1.onAbsorb(i);
            }
        }
        if (i2 < 0) {
            mo59526X();
            if (this.f51462c1.isFinished()) {
                this.f51462c1.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            mo59519U();
            if (this.f51466e1.isFinished()) {
                this.f51466e1.onAbsorb(i2);
            }
        }
        if (i != 0 || i2 != 0) {
            C18196h2.m82610n1(this);
        }
    }

    @C0363p0
    /* renamed from: h0 */
    public C20061e0 mo59574h0(int i) {
        C20061e0 e0Var = null;
        if (this.f51453W0) {
            return null;
        }
        int j = this.f51465e.mo60366j();
        for (int i2 = 0; i2 < j; i2++) {
            C20061e0 u0 = m93254u0(this.f51465e.mo60365i(i2));
            if (u0 != null && !u0.isRemoved() && mo59590n0(u0) == i) {
                if (!this.f51465e.mo60370n(u0.itemView)) {
                    return u0;
                }
                e0Var = u0;
            }
        }
        return e0Var;
    }

    /* renamed from: h1 */
    public void mo59575h1(@C0372t0 int i, @C0372t0 int i2) {
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().mo53019k();
    }

    /* renamed from: i0 */
    public C20061e0 mo59576i0(long j) {
        Adapter adapter = this.f51493z;
        C20061e0 e0Var = null;
        if (adapter != null && adapter.hasStableIds()) {
            int j2 = this.f51465e.mo60366j();
            for (int i = 0; i < j2; i++) {
                C20061e0 u0 = m93254u0(this.f51465e.mo60365i(i));
                if (u0 != null && !u0.isRemoved() && u0.getItemId() == j) {
                    if (!this.f51465e.mo60370n(u0.itemView)) {
                        return u0;
                    }
                    e0Var = u0;
                }
            }
        }
        return e0Var;
    }

    /* renamed from: i1 */
    public void mo59577i1() {
        if (!this.f51421D1 && this.f51434K0) {
            C18196h2.m82618p1(this, this.f51439M1);
            this.f51421D1 = true;
        }
    }

    public boolean isAttachedToWindow() {
        return this.f51434K0;
    }

    public final boolean isLayoutSuppressed() {
        return this.f51446Q0;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().mo53021m();
    }

    @C0363p0
    /* renamed from: j0 */
    public C20061e0 mo59580j0(int i) {
        return mo59584l0(i, false);
    }

    /* renamed from: j1 */
    public final boolean mo59581j1() {
        return this.f51468f1 != null && this.f51422E0.mo59333j2();
    }

    @C0363p0
    @Deprecated
    /* renamed from: k0 */
    public C20061e0 mo59582k0(int i) {
        return mo59584l0(i, false);
    }

    /* renamed from: k1 */
    public final void mo59583k1() {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.f51453W0) {
            this.f51463d.mo60222z();
            if (this.f51454X0) {
                this.f51422E0.mo59336l1(this);
            }
        }
        if (mo59581j1()) {
            this.f51463d.mo60220x();
        } else {
            this.f51463d.mo60207k();
        }
        boolean z4 = false;
        if (this.f51418A1 || this.f51419B1) {
            z = true;
        } else {
            z = false;
        }
        C20055b0 b0Var = this.f51490x1;
        if (!this.f51440N0 || this.f51468f1 == null || ((!(z3 = this.f51453W0) && !z && !this.f51422E0.f51583v) || (z3 && !this.f51493z.hasStableIds()))) {
            z2 = false;
        } else {
            z2 = true;
        }
        b0Var.f51531k = z2;
        C20055b0 b0Var2 = this.f51490x1;
        if (b0Var2.f51531k && z && !this.f51453W0 && mo59581j1()) {
            z4 = true;
        }
        b0Var2.f51532l = z4;
    }

    @C0363p0
    /* renamed from: l0 */
    public C20061e0 mo59584l0(int i, boolean z) {
        int j = this.f51465e.mo60366j();
        C20061e0 e0Var = null;
        for (int i2 = 0; i2 < j; i2++) {
            C20061e0 u0 = m93254u0(this.f51465e.mo60365i(i2));
            if (u0 != null && !u0.isRemoved()) {
                if (z) {
                    if (u0.mPosition != i) {
                        continue;
                    }
                } else if (u0.getLayoutPosition() != i) {
                    continue;
                }
                if (!this.f51465e.mo60370n(u0.itemView)) {
                    return u0;
                }
                e0Var = u0;
            }
        }
        return e0Var;
    }

    /* renamed from: l1 */
    public void mo59585l1(boolean z) {
        this.f51454X0 = z | this.f51454X0;
        this.f51453W0 = true;
        mo59514S0();
    }

    /* renamed from: m */
    public final void mo59586m(C20061e0 e0Var) {
        boolean z;
        View view = e0Var.itemView;
        if (view.getParent() == this) {
            z = true;
        } else {
            z = false;
        }
        this.f51459b.mo60030K(mo59648t0(view));
        if (e0Var.isTmpDetached()) {
            this.f51465e.mo60359c(view, -1, view.getLayoutParams(), true);
        } else if (!z) {
            this.f51465e.mo60358b(view, true);
        } else {
            this.f51465e.mo60367k(view);
        }
    }

    /* renamed from: m0 */
    public boolean mo59587m0(int i, int i2) {
        boolean z;
        C20076o oVar = this.f51422E0;
        if (oVar == null || this.f51446Q0) {
            return false;
        }
        boolean v = oVar.mo59428v();
        boolean w = this.f51422E0.mo59431w();
        if (!v || Math.abs(i) < this.f51479p1) {
            i = 0;
        }
        if (!w || Math.abs(i2) < this.f51479p1) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return false;
        }
        float f = (float) i;
        float f2 = (float) i2;
        if (!dispatchNestedPreFling(f, f2)) {
            if (v || w) {
                z = true;
            } else {
                z = false;
            }
            dispatchNestedFling(f, f2, z);
            C20083r rVar = this.f51478o1;
            if (rVar != null && rVar.mo60001a(i, i2)) {
                return true;
            }
            if (z) {
                if (w) {
                    v |= true;
                }
                mo52993d(v ? 1 : 0, 1);
                int i3 = this.f51480q1;
                int max = Math.max(-i3, Math.min(i, i3));
                int i4 = this.f51480q1;
                this.f51484u1.mo59749b(max, Math.max(-i4, Math.min(i2, i4)));
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: m1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo59588m1(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            if (r1 >= 0) goto L_0x0021
            r6.mo59522V()
            android.widget.EdgeEffect r1 = r6.f51460b1
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r2 - r9
            androidx.core.widget.C18480i.m83657g(r1, r4, r9)
        L_0x001f:
            r9 = r3
            goto L_0x003c
        L_0x0021:
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x003b
            r6.mo59524W()
            android.widget.EdgeEffect r1 = r6.f51464d1
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            androidx.core.widget.C18480i.m83657g(r1, r4, r9)
            goto L_0x001f
        L_0x003b:
            r9 = 0
        L_0x003c:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L_0x0056
            r6.mo59526X()
            android.widget.EdgeEffect r9 = r6.f51462c1
            float r1 = -r10
            int r2 = r6.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r6.getWidth()
            float r2 = (float) r2
            float r7 = r7 / r2
            androidx.core.widget.C18480i.m83657g(r9, r1, r7)
            goto L_0x0072
        L_0x0056:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x0071
            r6.mo59519U()
            android.widget.EdgeEffect r9 = r6.f51466e1
            int r1 = r6.getHeight()
            float r1 = (float) r1
            float r1 = r10 / r1
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r2 = r2 - r7
            androidx.core.widget.C18480i.m83657g(r9, r1, r2)
            goto L_0x0072
        L_0x0071:
            r3 = r9
        L_0x0072:
            if (r3 != 0) goto L_0x007c
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L_0x007c
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 == 0) goto L_0x007f
        L_0x007c:
            androidx.core.view.C18196h2.m82610n1(r6)
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.mo59588m1(float, float, float, float):void");
    }

    /* renamed from: n */
    public void mo59589n(@C0359n0 C20075n nVar) {
        mo59592o(nVar, -1);
    }

    /* renamed from: n0 */
    public int mo59590n0(C20061e0 e0Var) {
        if (e0Var.hasAnyOfTheFlags(C14092c.f34612i1) || !e0Var.isBound()) {
            return -1;
        }
        return this.f51463d.mo60202f(e0Var.mPosition);
    }

    /* renamed from: n1 */
    public void mo59591n1(C20061e0 e0Var, C20069l.C20073d dVar) {
        e0Var.setFlags(0, 8192);
        if (this.f51490x1.f51529i && e0Var.isUpdated() && !e0Var.isRemoved() && !e0Var.shouldIgnore()) {
            this.f51467f.mo60500c(mo59593o0(e0Var), e0Var);
        }
        this.f51467f.mo60502e(e0Var, dVar);
    }

    /* renamed from: o */
    public void mo59592o(@C0359n0 C20075n nVar, int i) {
        C20076o oVar = this.f51422E0;
        if (oVar != null) {
            oVar.mo59419q("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f51428H0.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.f51428H0.add(nVar);
        } else {
            this.f51428H0.add(i, nVar);
        }
        mo59511R0();
        requestLayout();
    }

    /* renamed from: o0 */
    public long mo59593o0(C20061e0 e0Var) {
        return this.f51493z.hasStableIds() ? e0Var.getItemId() : (long) e0Var.mPosition;
    }

    /* renamed from: o1 */
    public final void mo59594o1() {
        C20061e0 e0Var;
        View findViewById;
        if (this.f51483t1 && this.f51493z != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                if (!isFocused()) {
                    View focusedChild = getFocusedChild();
                    if (!f51392a2 || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                        if (!this.f51465e.mo60370n(focusedChild)) {
                            return;
                        }
                    } else if (this.f51465e.mo60363g() == 0) {
                        requestFocus();
                        return;
                    }
                }
                View view = null;
                if (this.f51490x1.f51534n == -1 || !this.f51493z.hasStableIds()) {
                    e0Var = null;
                } else {
                    e0Var = mo59576i0(this.f51490x1.f51534n);
                }
                if (e0Var != null && !this.f51465e.mo60370n(e0Var.itemView) && e0Var.itemView.hasFocusable()) {
                    view = e0Var.itemView;
                } else if (this.f51465e.mo60363g() > 0) {
                    view = mo59551g0();
                }
                if (view != null) {
                    int i = this.f51490x1.f51535o;
                    if (!(((long) i) == -1 || (findViewById = view.findViewById(i)) == null || !findViewById.isFocusable())) {
                        view = findViewById;
                    }
                    view.requestFocus();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        if (r1 >= 30.0f) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f51455Y0 = r0
            r1 = 1
            r5.f51434K0 = r1
            boolean r2 = r5.f51440N0
            if (r2 == 0) goto L_0x0014
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r1 = r0
        L_0x0015:
            r5.f51440N0 = r1
            androidx.recyclerview.widget.RecyclerView$o r1 = r5.f51422E0
            if (r1 == 0) goto L_0x001e
            r1.mo59897N(r5)
        L_0x001e:
            r5.f51421D1 = r0
            boolean r0 = f51390Y1
            if (r0 == 0) goto L_0x0061
            java.lang.ThreadLocal<androidx.recyclerview.widget.m> r0 = androidx.recyclerview.widget.C20186m.f52030e
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.m r1 = (androidx.recyclerview.widget.C20186m) r1
            r5.f51486v1 = r1
            if (r1 != 0) goto L_0x005c
            androidx.recyclerview.widget.m r1 = new androidx.recyclerview.widget.m
            r1.<init>()
            r5.f51486v1 = r1
            android.view.Display r1 = androidx.core.view.C18196h2.m82526Q(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L_0x004e
            if (r1 == 0) goto L_0x004e
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x004e
            goto L_0x0050
        L_0x004e:
            r1 = 1114636288(0x42700000, float:60.0)
        L_0x0050:
            androidx.recyclerview.widget.m r2 = r5.f51486v1
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f52034c = r3
            r0.set(r2)
        L_0x005c:
            androidx.recyclerview.widget.m r0 = r5.f51486v1
            r0.mo60553a(r5)
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    public void onDetachedFromWindow() {
        C20186m mVar;
        super.onDetachedFromWindow();
        C20069l lVar = this.f51468f1;
        if (lVar != null) {
            lVar.mo59843l();
        }
        mo59512R1();
        this.f51434K0 = false;
        C20076o oVar = this.f51422E0;
        if (oVar != null) {
            oVar.mo59899O(this, this.f51459b);
        }
        this.f51437L1.clear();
        removeCallbacks(this.f51439M1);
        this.f51467f.mo60507j();
        if (f51390Y1 && (mVar = this.f51486v1) != null) {
            mVar.mo60561k(this);
            this.f51486v1 = null;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f51428H0.size();
        for (int i = 0; i < size; i++) {
            this.f51428H0.get(i).mo59864i(canvas, this, this.f51490x1);
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        if (this.f51422E0 != null && !this.f51446Q0 && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                if (this.f51422E0.mo59431w()) {
                    f2 = -motionEvent.getAxisValue(9);
                } else {
                    f2 = 0.0f;
                }
                if (this.f51422E0.mo59428v()) {
                    f = motionEvent.getAxisValue(10);
                    if (!(f2 == 0.0f && f == 0.0f)) {
                        mo59520U0((int) (f * this.f51481r1), (int) (f2 * this.f51482s1), motionEvent, 1);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f51422E0.mo59431w()) {
                        f2 = -axisValue;
                    } else if (this.f51422E0.mo59428v()) {
                        f = axisValue;
                        f2 = 0.0f;
                        mo59520U0((int) (f * this.f51481r1), (int) (f2 * this.f51482s1), motionEvent, 1);
                    }
                }
                f2 = 0.0f;
                f = 0.0f;
                mo59520U0((int) (f * this.f51481r1), (int) (f2 * this.f51482s1), motionEvent, 1);
            }
            f = 0.0f;
            mo59520U0((int) (f * this.f51481r1), (int) (f2 * this.f51482s1), motionEvent, 1);
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.f51446Q0) {
            return false;
        }
        this.f51432J0 = null;
        if (mo59540d0(motionEvent)) {
            mo59663z();
            return true;
        }
        C20076o oVar = this.f51422E0;
        if (oVar == null) {
            return false;
        }
        boolean v = oVar.mo59428v();
        boolean w = this.f51422E0.mo59431w();
        if (this.f51472i1 == null) {
            this.f51472i1 = VelocityTracker.obtain();
        }
        this.f51472i1.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f51448R0) {
                this.f51448R0 = false;
            }
            this.f51471h1 = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.f51475l1 = x;
            this.f51473j1 = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.f51476m1 = y;
            this.f51474k1 = y;
            if (this.f51470g1 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                mo52996g(1);
            }
            int[] iArr = this.f51433J1;
            iArr[1] = 0;
            iArr[0] = 0;
            if (w) {
                v |= true;
            }
            mo52993d(v ? 1 : 0, 0);
        } else if (actionMasked == 1) {
            this.f51472i1.clear();
            mo52996g(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f51471h1);
            if (findPointerIndex < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error processing scroll; pointer index for id ");
                sb.append(this.f51471h1);
                sb.append(" not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f51470g1 != 1) {
                int i = x2 - this.f51473j1;
                int i2 = y2 - this.f51474k1;
                if (!v || Math.abs(i) <= this.f51477n1) {
                    z = false;
                } else {
                    this.f51475l1 = x2;
                    z = true;
                }
                if (w && Math.abs(i2) > this.f51477n1) {
                    this.f51476m1 = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            mo59663z();
        } else if (actionMasked == 5) {
            this.f51471h1 = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f51475l1 = x3;
            this.f51473j1 = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f51476m1 = y3;
            this.f51474k1 = y3;
        } else if (actionMasked == 6) {
            mo59549f1(motionEvent);
        }
        if (this.f51470g1 == 1) {
            return true;
        }
        return false;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C17821p0.m81248b(f51405n2);
        mo59495M();
        C17821p0.m81250d();
        this.f51440N0 = true;
    }

    public void onMeasure(int i, int i2) {
        C20076o oVar = this.f51422E0;
        if (oVar == null) {
            mo59480H(i, i2);
            return;
        }
        boolean z = false;
        if (oVar.mo59373H0()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f51422E0.mo59973s1(this.f51459b, this.f51490x1, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.f51441N1 = z;
            if (!z && this.f51493z != null) {
                if (this.f51490x1.f51525e == 1) {
                    mo59498N();
                }
                this.f51422E0.mo59918W1(i, i2);
                this.f51490x1.f51530j = true;
                mo59501O();
                this.f51422E0.mo59925Z1(i, i2);
                if (this.f51422E0.mo59400d2()) {
                    this.f51422E0.mo59918W1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.f51490x1.f51530j = true;
                    mo59501O();
                    this.f51422E0.mo59925Z1(i, i2);
                }
                this.f51443O1 = getMeasuredWidth();
                this.f51445P1 = getMeasuredHeight();
            }
        } else if (this.f51436L0) {
            this.f51422E0.mo59973s1(this.f51459b, this.f51490x1, i, i2);
        } else {
            if (this.f51450T0) {
                mo59506P1();
                mo59538c1();
                mo59583k1();
                mo59541d1();
                C20055b0 b0Var = this.f51490x1;
                if (b0Var.f51532l) {
                    b0Var.f51528h = true;
                } else {
                    this.f51463d.mo60207k();
                    this.f51490x1.f51528h = false;
                }
                this.f51450T0 = false;
                mo59509Q1(false);
            } else if (this.f51490x1.f51532l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            Adapter adapter = this.f51493z;
            if (adapter != null) {
                this.f51490x1.f51526f = adapter.getItemCount();
            } else {
                this.f51490x1.f51526f = 0;
            }
            mo59506P1();
            this.f51422E0.mo59973s1(this.f51459b, this.f51490x1, i, i2);
            mo59509Q1(false);
            this.f51490x1.f51528h = false;
        }
    }

    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (mo59499N0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f51461c = savedState;
        super.onRestoreInstanceState(savedState.mo53419a());
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.f51461c;
        if (savedState2 != null) {
            savedState.mo59685b(savedState2);
        } else {
            C20076o oVar = this.f51422E0;
            if (oVar != null) {
                savedState.f51499c = oVar.mo59432w1();
            } else {
                savedState.f51499c = null;
            }
        }
        return savedState;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            mo59487J0();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ef  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r6 = r17
            r7 = r18
            boolean r0 = r6.f51446Q0
            r8 = 0
            if (r0 != 0) goto L_0x01d6
            boolean r0 = r6.f51448R0
            if (r0 == 0) goto L_0x000f
            goto L_0x01d6
        L_0x000f:
            boolean r0 = r17.mo59516T(r18)
            r9 = 1
            if (r0 == 0) goto L_0x001a
            r17.mo59663z()
            return r9
        L_0x001a:
            androidx.recyclerview.widget.RecyclerView$o r0 = r6.f51422E0
            if (r0 != 0) goto L_0x001f
            return r8
        L_0x001f:
            boolean r10 = r0.mo59428v()
            androidx.recyclerview.widget.RecyclerView$o r0 = r6.f51422E0
            boolean r11 = r0.mo59431w()
            android.view.VelocityTracker r0 = r6.f51472i1
            if (r0 != 0) goto L_0x0033
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.f51472i1 = r0
        L_0x0033:
            int r0 = r18.getActionMasked()
            int r1 = r18.getActionIndex()
            if (r0 != 0) goto L_0x0043
            int[] r2 = r6.f51433J1
            r2[r9] = r8
            r2[r8] = r8
        L_0x0043:
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r18)
            int[] r2 = r6.f51433J1
            r3 = r2[r8]
            float r3 = (float) r3
            r2 = r2[r9]
            float r2 = (float) r2
            r12.offsetLocation(r3, r2)
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L_0x01aa
            if (r0 == r9) goto L_0x0168
            r3 = 2
            if (r0 == r3) goto L_0x008c
            r3 = 3
            if (r0 == r3) goto L_0x0087
            r3 = 5
            if (r0 == r3) goto L_0x006b
            r1 = 6
            if (r0 == r1) goto L_0x0066
            goto L_0x01cb
        L_0x0066:
            r17.mo59549f1(r18)
            goto L_0x01cb
        L_0x006b:
            int r0 = r7.getPointerId(r1)
            r6.f51471h1 = r0
            float r0 = r7.getX(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f51475l1 = r0
            r6.f51473j1 = r0
            float r0 = r7.getY(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f51476m1 = r0
            r6.f51474k1 = r0
            goto L_0x01cb
        L_0x0087:
            r17.mo59663z()
            goto L_0x01cb
        L_0x008c:
            int r0 = r6.f51471h1
            int r0 = r7.findPointerIndex(r0)
            if (r0 >= 0) goto L_0x00a9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Error processing scroll; pointer index for id "
            r0.append(r1)
            int r1 = r6.f51471h1
            r0.append(r1)
            java.lang.String r1 = " not found. Did any MotionEvents get skipped?"
            r0.append(r1)
            return r8
        L_0x00a9:
            float r1 = r7.getX(r0)
            float r1 = r1 + r2
            int r13 = (int) r1
            float r0 = r7.getY(r0)
            float r0 = r0 + r2
            int r14 = (int) r0
            int r0 = r6.f51475l1
            int r0 = r0 - r13
            int r1 = r6.f51476m1
            int r1 = r1 - r14
            int r2 = r6.f51470g1
            if (r2 == r9) goto L_0x00f2
            if (r10 == 0) goto L_0x00d6
            if (r0 <= 0) goto L_0x00cb
            int r2 = r6.f51477n1
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r8, r0)
            goto L_0x00d2
        L_0x00cb:
            int r2 = r6.f51477n1
            int r0 = r0 + r2
            int r0 = java.lang.Math.min(r8, r0)
        L_0x00d2:
            if (r0 == 0) goto L_0x00d6
            r2 = r9
            goto L_0x00d7
        L_0x00d6:
            r2 = r8
        L_0x00d7:
            if (r11 == 0) goto L_0x00ed
            if (r1 <= 0) goto L_0x00e3
            int r3 = r6.f51477n1
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r8, r1)
            goto L_0x00ea
        L_0x00e3:
            int r3 = r6.f51477n1
            int r1 = r1 + r3
            int r1 = java.lang.Math.min(r8, r1)
        L_0x00ea:
            if (r1 == 0) goto L_0x00ed
            r2 = r9
        L_0x00ed:
            if (r2 == 0) goto L_0x00f2
            r6.setScrollState(r9)
        L_0x00f2:
            r15 = r0
            r16 = r1
            int r0 = r6.f51470g1
            if (r0 != r9) goto L_0x01cb
            int[] r3 = r6.f51435K1
            r3[r8] = r8
            r3[r9] = r8
            if (r10 == 0) goto L_0x0103
            r1 = r15
            goto L_0x0104
        L_0x0103:
            r1 = r8
        L_0x0104:
            if (r11 == 0) goto L_0x0109
            r2 = r16
            goto L_0x010a
        L_0x0109:
            r2 = r8
        L_0x010a:
            int[] r4 = r6.f51431I1
            r5 = 0
            r0 = r17
            boolean r0 = r0.mo52995f(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0137
            int[] r0 = r6.f51435K1
            r1 = r0[r8]
            int r15 = r15 - r1
            r0 = r0[r9]
            int r16 = r16 - r0
            int[] r0 = r6.f51433J1
            r1 = r0[r8]
            int[] r2 = r6.f51431I1
            r3 = r2[r8]
            int r1 = r1 + r3
            r0[r8] = r1
            r1 = r0[r9]
            r2 = r2[r9]
            int r1 = r1 + r2
            r0[r9] = r1
            android.view.ViewParent r0 = r17.getParent()
            r0.requestDisallowInterceptTouchEvent(r9)
        L_0x0137:
            r0 = r16
            int[] r1 = r6.f51431I1
            r2 = r1[r8]
            int r13 = r13 - r2
            r6.f51475l1 = r13
            r1 = r1[r9]
            int r14 = r14 - r1
            r6.f51476m1 = r14
            if (r10 == 0) goto L_0x0149
            r1 = r15
            goto L_0x014a
        L_0x0149:
            r1 = r8
        L_0x014a:
            if (r11 == 0) goto L_0x014e
            r2 = r0
            goto L_0x014f
        L_0x014e:
            r2 = r8
        L_0x014f:
            boolean r1 = r6.mo59473E1(r1, r2, r7, r8)
            if (r1 == 0) goto L_0x015c
            android.view.ViewParent r1 = r17.getParent()
            r1.requestDisallowInterceptTouchEvent(r9)
        L_0x015c:
            androidx.recyclerview.widget.m r1 = r6.f51486v1
            if (r1 == 0) goto L_0x01cb
            if (r15 != 0) goto L_0x0164
            if (r0 == 0) goto L_0x01cb
        L_0x0164:
            r1.mo60557g(r6, r15, r0)
            goto L_0x01cb
        L_0x0168:
            android.view.VelocityTracker r0 = r6.f51472i1
            r0.addMovement(r12)
            android.view.VelocityTracker r0 = r6.f51472i1
            int r1 = r6.f51480q1
            float r1 = (float) r1
            r2 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r2, r1)
            r0 = 0
            if (r10 == 0) goto L_0x0184
            android.view.VelocityTracker r1 = r6.f51472i1
            int r2 = r6.f51471h1
            float r1 = r1.getXVelocity(r2)
            float r1 = -r1
            goto L_0x0185
        L_0x0184:
            r1 = r0
        L_0x0185:
            if (r11 == 0) goto L_0x0191
            android.view.VelocityTracker r2 = r6.f51472i1
            int r3 = r6.f51471h1
            float r2 = r2.getYVelocity(r3)
            float r2 = -r2
            goto L_0x0192
        L_0x0191:
            r2 = r0
        L_0x0192:
            int r3 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x019a
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x01a2
        L_0x019a:
            int r0 = (int) r1
            int r1 = (int) r2
            boolean r0 = r6.mo59587m0(r0, r1)
            if (r0 != 0) goto L_0x01a5
        L_0x01a2:
            r6.setScrollState(r8)
        L_0x01a5:
            r17.mo59464B1()
            r8 = r9
            goto L_0x01cb
        L_0x01aa:
            int r0 = r7.getPointerId(r8)
            r6.f51471h1 = r0
            float r0 = r18.getX()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f51475l1 = r0
            r6.f51473j1 = r0
            float r0 = r18.getY()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f51476m1 = r0
            r6.f51474k1 = r0
            if (r11 == 0) goto L_0x01c8
            r10 = r10 | 2
        L_0x01c8:
            r6.mo52993d(r10, r8)
        L_0x01cb:
            if (r8 != 0) goto L_0x01d2
            android.view.VelocityTracker r0 = r6.f51472i1
            r0.addMovement(r12)
        L_0x01d2:
            r12.recycle()
            return r9
        L_0x01d6:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public void mo59607p(@C0359n0 C20082q qVar) {
        if (this.f51452V0 == null) {
            this.f51452V0 = new ArrayList();
        }
        this.f51452V0.add(qVar);
    }

    /* renamed from: p0 */
    public int mo59608p0(@C0359n0 View view) {
        C20061e0 u0 = m93254u0(view);
        if (u0 != null) {
            return u0.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    /* renamed from: p1 */
    public final void mo59609p1() {
        boolean z;
        EdgeEffect edgeEffect = this.f51460b1;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.f51460b1.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.f51462c1;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.f51462c1.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f51464d1;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.f51464d1.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f51466e1;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.f51466e1.isFinished();
        }
        if (z) {
            C18196h2.m82610n1(this);
        }
    }

    /* renamed from: q */
    public void mo59610q(@C0359n0 C20084s sVar) {
        this.f51430I0.add(sVar);
    }

    /* renamed from: q0 */
    public long mo59611q0(@C0359n0 View view) {
        C20061e0 u0;
        Adapter adapter = this.f51493z;
        if (adapter == null || !adapter.hasStableIds() || (u0 = m93254u0(view)) == null) {
            return -1;
        }
        return u0.getItemId();
    }

    /* renamed from: q1 */
    public void mo59612q1() {
        C20069l lVar = this.f51468f1;
        if (lVar != null) {
            lVar.mo59843l();
        }
        C20076o oVar = this.f51422E0;
        if (oVar != null) {
            oVar.mo59875E1(this.f51459b);
            this.f51422E0.mo59877F1(this.f51459b);
        }
        this.f51459b.mo60037d();
    }

    /* renamed from: r */
    public void mo59613r(@C0359n0 C20085t tVar) {
        if (this.f51494z1 == null) {
            this.f51494z1 = new ArrayList();
        }
        this.f51494z1.add(tVar);
    }

    /* renamed from: r0 */
    public int mo59614r0(@C0359n0 View view) {
        C20061e0 u0 = m93254u0(view);
        if (u0 != null) {
            return u0.getLayoutPosition();
        }
        return -1;
    }

    /* renamed from: r1 */
    public boolean mo59615r1(View view) {
        mo59506P1();
        boolean r = this.f51465e.mo60374r(view);
        if (r) {
            C20061e0 u0 = m93254u0(view);
            this.f51459b.mo60030K(u0);
            this.f51459b.mo60023D(u0);
        }
        mo59509Q1(!r);
        return r;
    }

    public void removeDetachedView(View view, boolean z) {
        C20061e0 u0 = m93254u0(view);
        if (u0 != null) {
            if (u0.isTmpDetached()) {
                u0.clearTmpDetachFlag();
            } else if (!u0.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + u0 + mo59528Y());
            }
        }
        view.clearAnimation();
        mo59489K(view);
        super.removeDetachedView(view, z);
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f51422E0.mo59979u1(this, this.f51490x1, view, view2) && view2 != null) {
            mo59665z1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f51422E0.mo59893L1(this, view, rect, z);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.f51430I0.size();
        for (int i = 0; i < size; i++) {
            this.f51430I0.get(i).mo60004e(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        if (this.f51442O0 != 0 || this.f51446Q0) {
            this.f51444P0 = true;
        } else {
            super.requestLayout();
        }
    }

    /* renamed from: s */
    public void mo59621s(@C0359n0 C20090x xVar) {
        boolean z;
        if (xVar != null) {
            z = true;
        } else {
            z = false;
        }
        C18001r.m81765b(z, "'listener' arg cannot be null.");
        this.f51426G0.add(xVar);
    }

    @Deprecated
    /* renamed from: s0 */
    public int mo59622s0(@C0359n0 View view) {
        return mo59608p0(view);
    }

    /* renamed from: s1 */
    public void mo59623s1(@C0359n0 C20075n nVar) {
        boolean z;
        C20076o oVar = this.f51422E0;
        if (oVar != null) {
            oVar.mo59419q("Cannot remove item decoration during a scroll  or layout");
        }
        this.f51428H0.remove(nVar);
        if (this.f51428H0.isEmpty()) {
            if (getOverScrollMode() == 2) {
                z = true;
            } else {
                z = false;
            }
            setWillNotDraw(z);
        }
        mo59511R0();
        requestLayout();
    }

    public void scrollBy(int i, int i2) {
        C20076o oVar = this.f51422E0;
        if (oVar != null && !this.f51446Q0) {
            boolean v = oVar.mo59428v();
            boolean w = this.f51422E0.mo59431w();
            if (v || w) {
                if (!v) {
                    i = 0;
                }
                if (!w) {
                    i2 = 0;
                }
                mo59473E1(i, i2, (MotionEvent) null, 0);
            }
        }
    }

    public void scrollTo(int i, int i2) {
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!mo59488J1(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(@C0363p0 C20102a0 a0Var) {
        this.f51423E1 = a0Var;
        C18196h2.m82474B1(this, a0Var);
    }

    public void setAdapter(@C0363p0 Adapter adapter) {
        setLayoutFrozen(false);
        mo59482H1(adapter, false, true);
        mo59585l1(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(@C0363p0 C20066j jVar) {
        boolean z;
        if (jVar != this.f51425F1) {
            this.f51425F1 = jVar;
            if (jVar != null) {
                z = true;
            } else {
                z = false;
            }
            setChildrenDrawingOrderEnabled(z);
        }
    }

    public void setClipToPadding(boolean z) {
        if (z != this.f51469g) {
            mo59487J0();
        }
        this.f51469g = z;
        super.setClipToPadding(z);
        if (this.f51440N0) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(@C0359n0 C20067k kVar) {
        C18001r.m81775l(kVar);
        this.f51458a1 = kVar;
        mo59487J0();
    }

    public void setHasFixedSize(boolean z) {
        this.f51436L0 = z;
    }

    public void setItemAnimator(@C0363p0 C20069l lVar) {
        C20069l lVar2 = this.f51468f1;
        if (lVar2 != null) {
            lVar2.mo59843l();
            this.f51468f1.mo59830A((C20069l.C20072c) null);
        }
        this.f51468f1 = lVar;
        if (lVar != null) {
            lVar.mo59830A(this.f51420C1);
        }
    }

    public void setItemViewCacheSize(int i) {
        this.f51459b.mo60027H(i);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(@C0363p0 C20076o oVar) {
        if (oVar != this.f51422E0) {
            mo59512R1();
            if (this.f51422E0 != null) {
                C20069l lVar = this.f51468f1;
                if (lVar != null) {
                    lVar.mo59843l();
                }
                this.f51422E0.mo59875E1(this.f51459b);
                this.f51422E0.mo59877F1(this.f51459b);
                this.f51459b.mo60037d();
                if (this.f51434K0) {
                    this.f51422E0.mo59899O(this, this.f51459b);
                }
                this.f51422E0.mo59931b2((RecyclerView) null);
                this.f51422E0 = null;
            } else {
                this.f51459b.mo60037d();
            }
            this.f51465e.mo60371o();
            this.f51422E0 = oVar;
            if (oVar != null) {
                if (oVar.f51577b == null) {
                    oVar.mo59931b2(this);
                    if (this.f51434K0) {
                        this.f51422E0.mo59897N(this);
                    }
                } else {
                    throw new IllegalArgumentException("LayoutManager " + oVar + " is already attached to a RecyclerView:" + oVar.f51577b.mo59528Y());
                }
            }
            this.f51459b.mo60031L();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition) null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().mo53024p(z);
    }

    public void setOnFlingListener(@C0363p0 C20083r rVar) {
        this.f51478o1 = rVar;
    }

    @Deprecated
    public void setOnScrollListener(@C0363p0 C20085t tVar) {
        this.f51492y1 = tVar;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f51483t1 = z;
    }

    public void setRecycledViewPool(@C0363p0 C20087v vVar) {
        this.f51459b.mo60025F(vVar);
    }

    @Deprecated
    public void setRecyclerListener(@C0363p0 C20090x xVar) {
        this.f51424F0 = xVar;
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i) {
        if (i != this.f51470g1) {
            this.f51470g1 = i;
            if (i != 2) {
                mo59515S1();
            }
            mo59507Q(i);
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i != 1) {
                StringBuilder sb = new StringBuilder();
                sb.append("setScrollingTouchSlop(): bad argument constant ");
                sb.append(i);
                sb.append("; using default value");
            } else {
                this.f51477n1 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.f51477n1 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(@C0363p0 C20057c0 c0Var) {
        this.f51459b.mo60026G(c0Var);
    }

    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().mo53026r(i);
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().mo53028t();
    }

    public final void suppressLayout(boolean z) {
        if (z != this.f51446Q0) {
            mo59657x("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.f51446Q0 = false;
                if (!(!this.f51444P0 || this.f51422E0 == null || this.f51493z == null)) {
                    requestLayout();
                }
                this.f51444P0 = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f51446Q0 = true;
            this.f51448R0 = true;
            mo59512R1();
        }
    }

    /* renamed from: t */
    public void mo59647t(@C0359n0 C20061e0 e0Var, @C0363p0 C20069l.C20073d dVar, @C0359n0 C20069l.C20073d dVar2) {
        e0Var.setIsRecyclable(false);
        if (this.f51468f1.mo59833a(e0Var, dVar, dVar2)) {
            mo59577i1();
        }
    }

    /* renamed from: t0 */
    public C20061e0 mo59648t0(@C0359n0 View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m93254u0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* renamed from: t1 */
    public void mo59649t1(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i < 0 || i >= itemDecorationCount) {
            throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
        }
        mo59623s1(mo59460A0(i));
    }

    /* renamed from: u */
    public final void mo59650u(@C0359n0 C20061e0 e0Var, @C0359n0 C20061e0 e0Var2, @C0359n0 C20069l.C20073d dVar, @C0359n0 C20069l.C20073d dVar2, boolean z, boolean z2) {
        e0Var.setIsRecyclable(false);
        if (z) {
            mo59586m(e0Var);
        }
        if (e0Var != e0Var2) {
            if (z2) {
                mo59586m(e0Var2);
            }
            e0Var.mShadowedHolder = e0Var2;
            mo59586m(e0Var);
            this.f51459b.mo60030K(e0Var);
            e0Var2.setIsRecyclable(false);
            e0Var2.mShadowingHolder = e0Var;
        }
        if (this.f51468f1.mo59834b(e0Var, e0Var2, dVar, dVar2)) {
            mo59577i1();
        }
    }

    /* renamed from: u1 */
    public void mo59651u1(@C0359n0 C20082q qVar) {
        List<C20082q> list = this.f51452V0;
        if (list != null) {
            list.remove(qVar);
        }
    }

    /* renamed from: v */
    public void mo59652v(@C0359n0 C20061e0 e0Var, @C0359n0 C20069l.C20073d dVar, @C0363p0 C20069l.C20073d dVar2) {
        mo59586m(e0Var);
        e0Var.setIsRecyclable(false);
        if (this.f51468f1.mo59835c(e0Var, dVar, dVar2)) {
            mo59577i1();
        }
    }

    /* renamed from: v0 */
    public void mo59653v0(@C0359n0 View view, @C0359n0 Rect rect) {
        m93255w0(view, rect);
    }

    /* renamed from: v1 */
    public void mo59654v1(@C0359n0 C20084s sVar) {
        this.f51430I0.remove(sVar);
        if (this.f51432J0 == sVar) {
            this.f51432J0 = null;
        }
    }

    /* renamed from: w */
    public void mo59655w(String str) {
        if (mo59499N0()) {
            return;
        }
        if (str == null) {
            throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling" + mo59528Y());
        }
        throw new IllegalStateException(str + mo59528Y());
    }

    /* renamed from: w1 */
    public void mo59656w1(@C0359n0 C20085t tVar) {
        List<C20085t> list = this.f51494z1;
        if (list != null) {
            list.remove(tVar);
        }
    }

    /* renamed from: x */
    public void mo59657x(String str) {
        if (mo59499N0()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + mo59528Y());
            }
            throw new IllegalStateException(str);
        } else if (this.f51456Z0 > 0) {
            new IllegalStateException("" + mo59528Y());
        }
    }

    /* renamed from: x0 */
    public final int mo59658x0(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    /* renamed from: x1 */
    public void mo59659x1(@C0359n0 C20090x xVar) {
        this.f51426G0.remove(xVar);
    }

    /* renamed from: y */
    public boolean mo59660y(C20061e0 e0Var) {
        C20069l lVar = this.f51468f1;
        if (lVar == null || lVar.mo59838g(e0Var, e0Var.getUnmodifiedPayloads())) {
            return true;
        }
        return false;
    }

    /* renamed from: y0 */
    public final String mo59661y0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(".")) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + str;
        }
    }

    /* renamed from: y1 */
    public void mo59662y1() {
        C20061e0 e0Var;
        int g = this.f51465e.mo60363g();
        for (int i = 0; i < g; i++) {
            View f = this.f51465e.mo60362f(i);
            C20061e0 t0 = mo59648t0(f);
            if (!(t0 == null || (e0Var = t0.mShadowingHolder) == null)) {
                View view = e0Var.itemView;
                int left = f.getLeft();
                int top = f.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    /* renamed from: z */
    public final void mo59663z() {
        mo59464B1();
        setScrollState(0);
    }

    /* renamed from: z0 */
    public Rect mo59664z0(View view) {
        C20081p pVar = (C20081p) view.getLayoutParams();
        if (!pVar.f51596c) {
            return pVar.f51595b;
        }
        if (this.f51490x1.mo59735j() && (pVar.mo59997f() || pVar.mo59999h())) {
            return pVar.f51595b;
        }
        Rect rect = pVar.f51595b;
        rect.set(0, 0, 0, 0);
        int size = this.f51428H0.size();
        for (int i = 0; i < size; i++) {
            this.f51487w.set(0, 0, 0, 0);
            this.f51428H0.get(i).mo59102g(this.f51487w, view, this, this.f51490x1);
            int i2 = rect.left;
            Rect rect2 = this.f51487w;
            rect.left = i2 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        pVar.f51596c = false;
        return rect;
    }

    /* renamed from: z1 */
    public final void mo59665z1(@C0359n0 View view, @C0363p0 View view2) {
        View view3;
        boolean z;
        if (view2 != null) {
            view3 = view2;
        } else {
            view3 = view;
        }
        this.f51487w.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C20081p) {
            C20081p pVar = (C20081p) layoutParams;
            if (!pVar.f51596c) {
                Rect rect = pVar.f51595b;
                Rect rect2 = this.f51487w;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f51487w);
            offsetRectIntoDescendantCoords(view, this.f51487w);
        }
        C20076o oVar = this.f51422E0;
        Rect rect3 = this.f51487w;
        boolean z2 = !this.f51440N0;
        if (view2 == null) {
            z = true;
        } else {
            z = false;
        }
        oVar.mo59896M1(this, view, rect3, z2, z);
    }

    public RecyclerView(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C20030a.C20031a.recyclerViewStyle);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C20049a();

        /* renamed from: c */
        public Parcelable f51499c;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$SavedState$a */
        public class C20049a implements Parcelable.ClassLoaderCreator<SavedState> {
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
            this.f51499c = parcel.readParcelable(classLoader == null ? C20076o.class.getClassLoader() : classLoader);
        }

        /* renamed from: b */
        public void mo59685b(SavedState savedState) {
            this.f51499c = savedState.f51499c;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f51499c, 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecyclerView(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        int i2 = i;
        this.f51457a = new C20091y();
        this.f51459b = new C20089w();
        this.f51467f = new C20172k0();
        this.f51485v = new C20050a();
        this.f51487w = new Rect();
        this.f51489x = new Rect();
        this.f51491y = new RectF();
        this.f51426G0 = new ArrayList();
        this.f51428H0 = new ArrayList<>();
        this.f51430I0 = new ArrayList<>();
        this.f51442O0 = 0;
        this.f51453W0 = false;
        this.f51454X0 = false;
        this.f51455Y0 = 0;
        this.f51456Z0 = 0;
        this.f51458a1 = new C20067k();
        this.f51468f1 = new C20144i();
        this.f51470g1 = 0;
        this.f51471h1 = -1;
        this.f51481r1 = Float.MIN_VALUE;
        this.f51482s1 = Float.MIN_VALUE;
        this.f51483t1 = true;
        this.f51484u1 = new C20059d0();
        this.f51488w1 = f51390Y1 ? new C20186m.C20188b() : null;
        this.f51490x1 = new C20055b0();
        this.f51418A1 = false;
        this.f51419B1 = false;
        this.f51420C1 = new C20074m();
        this.f51421D1 = false;
        this.f51427G1 = new int[2];
        this.f51431I1 = new int[2];
        this.f51433J1 = new int[2];
        this.f51435K1 = new int[2];
        this.f51437L1 = new ArrayList();
        this.f51439M1 = new C20054b();
        this.f51443O1 = 0;
        this.f51445P1 = 0;
        this.f51447Q1 = new C20058d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f51477n1 = viewConfiguration.getScaledTouchSlop();
        this.f51481r1 = C18338p3.m83059b(viewConfiguration, context2);
        this.f51482s1 = C18338p3.m83062e(viewConfiguration, context2);
        this.f51479p1 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f51480q1 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f51468f1.mo59830A(this.f51420C1);
        mo59475F0();
        mo59481H0();
        mo59478G0();
        if (C18196h2.m82541V(this) == 0) {
            C18196h2.m82531R1(this, 1);
        }
        this.f51451U0 = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C20102a0(this));
        int[] iArr = C20030a.C20040j.RecyclerView;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, iArr, i2, 0);
        C18196h2.m82658z1(this, context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        String string = obtainStyledAttributes.getString(C20030a.C20040j.RecyclerView_layoutManager);
        if (obtainStyledAttributes.getInt(C20030a.C20040j.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f51469g = obtainStyledAttributes.getBoolean(C20030a.C20040j.RecyclerView_android_clipToPadding, true);
        boolean z = obtainStyledAttributes.getBoolean(C20030a.C20040j.RecyclerView_fastScrollEnabled, false);
        this.f51438M0 = z;
        if (z) {
            mo59484I0((StateListDrawable) obtainStyledAttributes.getDrawable(C20030a.C20040j.RecyclerView_fastScrollVerticalThumbDrawable), obtainStyledAttributes.getDrawable(C20030a.C20040j.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) obtainStyledAttributes.getDrawable(C20030a.C20040j.RecyclerView_fastScrollHorizontalThumbDrawable), obtainStyledAttributes.getDrawable(C20030a.C20040j.RecyclerView_fastScrollHorizontalTrackDrawable));
        }
        obtainStyledAttributes.recycle();
        mo59477G(context, string, attributeSet, i, 0);
        int[] iArr2 = f51386U1;
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet2, iArr2, i2, 0);
        C18196h2.m82658z1(this, context, iArr2, attributeSet, obtainStyledAttributes2, i, 0);
        boolean z2 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$p */
    public static class C20081p extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public C20061e0 f51594a;

        /* renamed from: b */
        public final Rect f51595b = new Rect();

        /* renamed from: c */
        public boolean f51596c = true;

        /* renamed from: d */
        public boolean f51597d = false;

        public C20081p(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: a */
        public int mo59992a() {
            return this.f51594a.getAbsoluteAdapterPosition();
        }

        /* renamed from: b */
        public int mo59993b() {
            return this.f51594a.getBindingAdapterPosition();
        }

        @Deprecated
        /* renamed from: c */
        public int mo59994c() {
            return this.f51594a.getBindingAdapterPosition();
        }

        /* renamed from: d */
        public int mo59995d() {
            return this.f51594a.getLayoutPosition();
        }

        @Deprecated
        /* renamed from: e */
        public int mo59996e() {
            return this.f51594a.getPosition();
        }

        /* renamed from: f */
        public boolean mo59997f() {
            return this.f51594a.isUpdated();
        }

        /* renamed from: g */
        public boolean mo59998g() {
            return this.f51594a.isRemoved();
        }

        /* renamed from: h */
        public boolean mo59999h() {
            return this.f51594a.isInvalid();
        }

        /* renamed from: i */
        public boolean mo60000i() {
            return this.f51594a.needsUpdate();
        }

        public C20081p(int i, int i2) {
            super(i, i2);
        }

        public C20081p(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C20081p(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C20081p(C20081p pVar) {
            super(pVar);
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C20076o oVar = this.f51422E0;
        if (oVar != null) {
            return oVar.mo59327U(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + mo59528Y());
    }
}

package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0387a;
import androidx.appcompat.view.menu.C0590q;
import androidx.appcompat.widget.C0696c;
import androidx.core.view.C18119b;
import androidx.core.view.C18196h2;
import androidx.core.view.accessibility.C18065l0;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ActivityChooserView extends ViewGroup implements C0696c.C0697a {

    /* renamed from: E0 */
    public C0765q0 f1855E0;

    /* renamed from: F0 */
    public PopupWindow.OnDismissListener f1856F0;

    /* renamed from: G0 */
    public boolean f1857G0;

    /* renamed from: H0 */
    public int f1858H0;

    /* renamed from: I0 */
    public boolean f1859I0;

    /* renamed from: J0 */
    public int f1860J0;

    /* renamed from: a */
    public final C0621f f1861a;

    /* renamed from: b */
    public final C0622g f1862b;

    /* renamed from: c */
    public final View f1863c;

    /* renamed from: d */
    public final Drawable f1864d;

    /* renamed from: e */
    public final FrameLayout f1865e;

    /* renamed from: f */
    public final ImageView f1866f;

    /* renamed from: g */
    public final FrameLayout f1867g;

    /* renamed from: v */
    public final ImageView f1868v;

    /* renamed from: w */
    public final int f1869w;

    /* renamed from: x */
    public C18119b f1870x;

    /* renamed from: y */
    public final DataSetObserver f1871y;

    /* renamed from: z */
    public final ViewTreeObserver.OnGlobalLayoutListener f1872z;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static class InnerLayout extends LinearLayout {

        /* renamed from: a */
        public static final int[] f1873a = {16842964};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            C0722h1 F = C0722h1.m3538F(context, attributeSet, f1873a);
            setBackgroundDrawable(F.mo3466h(0));
            F.mo3458I();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$a */
    public class C0616a extends DataSetObserver {
        public C0616a() {
        }

        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.f1861a.notifyDataSetChanged();
        }

        public void onInvalidated() {
            super.onInvalidated();
            ActivityChooserView.this.f1861a.notifyDataSetInvalidated();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$b */
    public class C0617b implements ViewTreeObserver.OnGlobalLayoutListener {
        public C0617b() {
        }

        public void onGlobalLayout() {
            if (!ActivityChooserView.this.mo2500b()) {
                return;
            }
            if (!ActivityChooserView.this.isShown()) {
                ActivityChooserView.this.getListPopupWindow().dismiss();
                return;
            }
            ActivityChooserView.this.getListPopupWindow().mo1966a();
            C18119b bVar = ActivityChooserView.this.f1870x;
            if (bVar != null) {
                bVar.mo52793m(true);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$c */
    public class C0618c extends View.AccessibilityDelegate {
        public C0618c() {
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            C18065l0.m81936c2(accessibilityNodeInfo).mo52583W0(true);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$d */
    public class C0619d extends C0760p0 {
        public C0619d(View view) {
            super(view);
        }

        /* renamed from: b */
        public C0590q mo1854b() {
            return ActivityChooserView.this.getListPopupWindow();
        }

        /* renamed from: c */
        public boolean mo1855c() {
            ActivityChooserView.this.mo2501c();
            return true;
        }

        /* renamed from: d */
        public boolean mo2462d() {
            ActivityChooserView.this.mo2499a();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$e */
    public class C0620e extends DataSetObserver {
        public C0620e() {
        }

        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.mo2503e();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$f */
    public class C0621f extends BaseAdapter {

        /* renamed from: g */
        public static final int f1879g = Integer.MAX_VALUE;

        /* renamed from: v */
        public static final int f1880v = 4;

        /* renamed from: w */
        public static final int f1881w = 0;

        /* renamed from: x */
        public static final int f1882x = 1;

        /* renamed from: y */
        public static final int f1883y = 3;

        /* renamed from: a */
        public C0696c f1884a;

        /* renamed from: b */
        public int f1885b = 4;

        /* renamed from: c */
        public boolean f1886c;

        /* renamed from: d */
        public boolean f1887d;

        /* renamed from: e */
        public boolean f1888e;

        public C0621f() {
        }

        /* renamed from: a */
        public int mo2522a() {
            return this.f1884a.mo3306f();
        }

        /* renamed from: b */
        public C0696c mo2523b() {
            return this.f1884a;
        }

        /* renamed from: c */
        public ResolveInfo mo2524c() {
            return this.f1884a.mo3308h();
        }

        /* renamed from: d */
        public int mo2525d() {
            return this.f1884a.mo3310j();
        }

        /* renamed from: e */
        public boolean mo2526e() {
            return this.f1886c;
        }

        /* renamed from: f */
        public int mo2527f() {
            int i = this.f1885b;
            this.f1885b = Integer.MAX_VALUE;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            int i2 = 0;
            View view = null;
            for (int i3 = 0; i3 < count; i3++) {
                view = getView(i3, view, (ViewGroup) null);
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                i2 = Math.max(i2, view.getMeasuredWidth());
            }
            this.f1885b = i;
            return i2;
        }

        /* renamed from: g */
        public void mo2528g(C0696c cVar) {
            C0696c b = ActivityChooserView.this.f1861a.mo2523b();
            if (b != null && ActivityChooserView.this.isShown()) {
                b.unregisterObserver(ActivityChooserView.this.f1871y);
            }
            this.f1884a = cVar;
            if (cVar != null && ActivityChooserView.this.isShown()) {
                cVar.registerObserver(ActivityChooserView.this.f1871y);
            }
            notifyDataSetChanged();
        }

        public int getCount() {
            int f = this.f1884a.mo3306f();
            if (!this.f1886c && this.f1884a.mo3308h() != null) {
                f--;
            }
            int min = Math.min(f, this.f1885b);
            if (this.f1888e) {
                return min + 1;
            }
            return min;
        }

        public Object getItem(int i) {
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                if (!this.f1886c && this.f1884a.mo3308h() != null) {
                    i++;
                }
                return this.f1884a.mo3305e(i);
            } else if (itemViewType == 1) {
                return null;
            } else {
                throw new IllegalArgumentException();
            }
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public int getItemViewType(int i) {
            return (!this.f1888e || i != getCount() - 1) ? 0 : 1;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                if (view == null || view.getId() != C0387a.C0394g.list_item) {
                    view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(C0387a.C0397j.abc_activity_chooser_view_list_item, viewGroup, false);
                }
                PackageManager packageManager = ActivityChooserView.this.getContext().getPackageManager();
                ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
                ((ImageView) view.findViewById(C0387a.C0394g.icon)).setImageDrawable(resolveInfo.loadIcon(packageManager));
                ((TextView) view.findViewById(C0387a.C0394g.title)).setText(resolveInfo.loadLabel(packageManager));
                if (!this.f1886c || i != 0 || !this.f1887d) {
                    view.setActivated(false);
                } else {
                    view.setActivated(true);
                }
                return view;
            } else if (itemViewType != 1) {
                throw new IllegalArgumentException();
            } else if (view != null && view.getId() == 1) {
                return view;
            } else {
                View inflate = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(C0387a.C0397j.abc_activity_chooser_view_list_item, viewGroup, false);
                inflate.setId(1);
                ((TextView) inflate.findViewById(C0387a.C0394g.title)).setText(ActivityChooserView.this.getContext().getString(C0387a.C0398k.abc_activity_chooser_view_see_all));
                return inflate;
            }
        }

        public int getViewTypeCount() {
            return 3;
        }

        /* renamed from: h */
        public void mo2535h(int i) {
            if (this.f1885b != i) {
                this.f1885b = i;
                notifyDataSetChanged();
            }
        }

        /* renamed from: i */
        public void mo2536i(boolean z, boolean z2) {
            if (this.f1886c != z || this.f1887d != z2) {
                this.f1886c = z;
                this.f1887d = z2;
                notifyDataSetChanged();
            }
        }

        /* renamed from: j */
        public void mo2537j(boolean z) {
            if (this.f1888e != z) {
                this.f1888e = z;
                notifyDataSetChanged();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$g */
    public class C0622g implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        public C0622g() {
        }

        /* renamed from: a */
        public final void mo2538a() {
            PopupWindow.OnDismissListener onDismissListener = ActivityChooserView.this.f1856F0;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
        }

        public void onClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.f1867g) {
                activityChooserView.mo2499a();
                Intent b = ActivityChooserView.this.f1861a.mo2523b().mo3303b(ActivityChooserView.this.f1861a.mo2523b().mo3307g(ActivityChooserView.this.f1861a.mo2524c()));
                if (b != null) {
                    b.addFlags(524288);
                    ActivityChooserView.this.getContext().startActivity(b);
                }
            } else if (view == activityChooserView.f1865e) {
                activityChooserView.f1857G0 = false;
                activityChooserView.mo2502d(activityChooserView.f1858H0);
            } else {
                throw new IllegalArgumentException();
            }
        }

        public void onDismiss() {
            mo2538a();
            C18119b bVar = ActivityChooserView.this.f1870x;
            if (bVar != null) {
                bVar.mo52793m(false);
            }
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            int itemViewType = ((C0621f) adapterView.getAdapter()).getItemViewType(i);
            if (itemViewType == 0) {
                ActivityChooserView.this.mo2499a();
                ActivityChooserView activityChooserView = ActivityChooserView.this;
                if (!activityChooserView.f1857G0) {
                    if (!activityChooserView.f1861a.mo2526e()) {
                        i++;
                    }
                    Intent b = ActivityChooserView.this.f1861a.mo2523b().mo3303b(i);
                    if (b != null) {
                        b.addFlags(524288);
                        ActivityChooserView.this.getContext().startActivity(b);
                    }
                } else if (i > 0) {
                    activityChooserView.f1861a.mo2523b().mo3318r(i);
                }
            } else if (itemViewType == 1) {
                ActivityChooserView.this.mo2502d(Integer.MAX_VALUE);
            } else {
                throw new IllegalArgumentException();
            }
        }

        public boolean onLongClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.f1867g) {
                if (activityChooserView.f1861a.getCount() > 0) {
                    ActivityChooserView activityChooserView2 = ActivityChooserView.this;
                    activityChooserView2.f1857G0 = true;
                    activityChooserView2.mo2502d(activityChooserView2.f1858H0);
                }
                return true;
            }
            throw new IllegalArgumentException();
        }
    }

    public ActivityChooserView(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public boolean mo2499a() {
        if (!mo2500b()) {
            return true;
        }
        getListPopupWindow().dismiss();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeGlobalOnLayoutListener(this.f1872z);
        return true;
    }

    /* renamed from: b */
    public boolean mo2500b() {
        return getListPopupWindow().mo1967c();
    }

    /* renamed from: c */
    public boolean mo2501c() {
        if (mo2500b() || !this.f1859I0) {
            return false;
        }
        this.f1857G0 = false;
        mo2502d(this.f1858H0);
        return true;
    }

    /* renamed from: d */
    public void mo2502d(int i) {
        boolean z;
        if (this.f1861a.mo2523b() != null) {
            getViewTreeObserver().addOnGlobalLayoutListener(this.f1872z);
            if (this.f1867g.getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            int a = this.f1861a.mo2522a();
            if (i == Integer.MAX_VALUE || a <= i + (z ? 1 : 0)) {
                this.f1861a.mo2537j(false);
                this.f1861a.mo2535h(i);
            } else {
                this.f1861a.mo2537j(true);
                this.f1861a.mo2535h(i - 1);
            }
            C0765q0 listPopupWindow = getListPopupWindow();
            if (!listPopupWindow.mo1967c()) {
                if (this.f1857G0 || !z) {
                    this.f1861a.mo2536i(true, z);
                } else {
                    this.f1861a.mo2536i(false, false);
                }
                listPopupWindow.mo3585U(Math.min(this.f1861a.mo2527f(), this.f1869w));
                listPopupWindow.mo1966a();
                C18119b bVar = this.f1870x;
                if (bVar != null) {
                    bVar.mo52793m(true);
                }
                listPopupWindow.mo1975q().setContentDescription(getContext().getString(C0387a.C0398k.abc_activitychooserview_choose_application));
                listPopupWindow.mo1975q().setSelector(new ColorDrawable(0));
                return;
            }
            return;
        }
        throw new IllegalStateException("No data model. Did you call #setDataModel?");
    }

    /* renamed from: e */
    public void mo2503e() {
        if (this.f1861a.getCount() > 0) {
            this.f1865e.setEnabled(true);
        } else {
            this.f1865e.setEnabled(false);
        }
        int a = this.f1861a.mo2522a();
        int d = this.f1861a.mo2525d();
        if (a == 1 || (a > 1 && d > 0)) {
            this.f1867g.setVisibility(0);
            ResolveInfo c = this.f1861a.mo2524c();
            PackageManager packageManager = getContext().getPackageManager();
            this.f1868v.setImageDrawable(c.loadIcon(packageManager));
            if (this.f1860J0 != 0) {
                CharSequence loadLabel = c.loadLabel(packageManager);
                this.f1867g.setContentDescription(getContext().getString(this.f1860J0, new Object[]{loadLabel}));
            }
        } else {
            this.f1867g.setVisibility(8);
        }
        if (this.f1867g.getVisibility() == 0) {
            this.f1863c.setBackgroundDrawable(this.f1864d);
        } else {
            this.f1863c.setBackgroundDrawable((Drawable) null);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public C0696c getDataModel() {
        return this.f1861a.mo2523b();
    }

    public C0765q0 getListPopupWindow() {
        if (this.f1855E0 == null) {
            C0765q0 q0Var = new C0765q0(getContext());
            this.f1855E0 = q0Var;
            q0Var.mo2728o(this.f1861a);
            this.f1855E0.mo3583S(this);
            this.f1855E0.mo3596d0(true);
            this.f1855E0.mo3599f0(this.f1862b);
            this.f1855E0.mo3597e0(this.f1862b);
        }
        return this.f1855E0;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0696c b = this.f1861a.mo2523b();
        if (b != null) {
            b.registerObserver(this.f1871y);
        }
        this.f1859I0 = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0696c b = this.f1861a.mo2523b();
        if (b != null) {
            b.unregisterObserver(this.f1871y);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f1872z);
        }
        if (mo2500b()) {
            mo2499a();
        }
        this.f1859I0 = false;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f1863c.layout(0, 0, i3 - i, i4 - i2);
        if (!mo2500b()) {
            mo2499a();
        }
    }

    public void onMeasure(int i, int i2) {
        View view = this.f1863c;
        if (this.f1867g.getVisibility() != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setActivityChooserModel(C0696c cVar) {
        this.f1861a.mo2528g(cVar);
        if (mo2500b()) {
            mo2499a();
            mo2501c();
        }
    }

    public void setDefaultActionButtonContentDescription(int i) {
        this.f1860J0 = i;
    }

    public void setExpandActivityOverflowButtonContentDescription(int i) {
        this.f1866f.setContentDescription(getContext().getString(i));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f1866f.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i) {
        this.f1858H0 = i;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f1856F0 = onDismissListener;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setProvider(C18119b bVar) {
        this.f1870x = bVar;
    }

    public ActivityChooserView(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1871y = new C0616a();
        this.f1872z = new C0617b();
        this.f1858H0 = 4;
        int[] iArr = C0387a.C0400m.ActivityChooserView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        C18196h2.m82658z1(this, context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        this.f1858H0 = obtainStyledAttributes.getInt(C0387a.C0400m.ActivityChooserView_initialActivityCount, 4);
        Drawable drawable = obtainStyledAttributes.getDrawable(C0387a.C0400m.ActivityChooserView_expandActivityOverflowButtonDrawable);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(C0387a.C0397j.abc_activity_chooser_view, this, true);
        C0622g gVar = new C0622g();
        this.f1862b = gVar;
        View findViewById = findViewById(C0387a.C0394g.activity_chooser_view_content);
        this.f1863c = findViewById;
        this.f1864d = findViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(C0387a.C0394g.default_activity_button);
        this.f1867g = frameLayout;
        frameLayout.setOnClickListener(gVar);
        frameLayout.setOnLongClickListener(gVar);
        int i2 = C0387a.C0394g.image;
        this.f1868v = (ImageView) frameLayout.findViewById(i2);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(C0387a.C0394g.expand_activities_button);
        frameLayout2.setOnClickListener(gVar);
        frameLayout2.setAccessibilityDelegate(new C0618c());
        frameLayout2.setOnTouchListener(new C0619d(frameLayout2));
        this.f1865e = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(i2);
        this.f1866f = imageView;
        imageView.setImageDrawable(drawable);
        C0621f fVar = new C0621f();
        this.f1861a = fVar;
        fVar.registerDataSetObserver(new C0620e());
        Resources resources = context.getResources();
        this.f1869w = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0387a.C0392e.abc_config_prefDialogWidth));
    }
}

package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import java.util.ArrayList;

@Deprecated
public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {

    /* renamed from: a */
    public final ArrayList<C19191b> f49321a = new ArrayList<>();

    /* renamed from: b */
    public FrameLayout f49322b;

    /* renamed from: c */
    public Context f49323c;

    /* renamed from: d */
    public FragmentManager f49324d;

    /* renamed from: e */
    public int f49325e;

    /* renamed from: f */
    public TabHost.OnTabChangeListener f49326f;

    /* renamed from: g */
    public C19191b f49327g;

    /* renamed from: v */
    public boolean f49328v;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C19189a();

        /* renamed from: a */
        public String f49329a;

        /* renamed from: androidx.fragment.app.FragmentTabHost$SavedState$a */
        public class C19189a implements Parcelable.Creator<SavedState> {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @C0359n0
        public String toString() {
            return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.f49329a + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f49329a);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f49329a = parcel.readString();
        }
    }

    /* renamed from: androidx.fragment.app.FragmentTabHost$a */
    public static class C19190a implements TabHost.TabContentFactory {

        /* renamed from: a */
        public final Context f49330a;

        public C19190a(Context context) {
            this.f49330a = context;
        }

        public View createTabContent(String str) {
            View view = new View(this.f49330a);
            view.setMinimumWidth(0);
            view.setMinimumHeight(0);
            return view;
        }
    }

    /* renamed from: androidx.fragment.app.FragmentTabHost$b */
    public static final class C19191b {
        @C0359n0

        /* renamed from: a */
        public final String f49331a;
        @C0359n0

        /* renamed from: b */
        public final Class<?> f49332b;
        @C0363p0

        /* renamed from: c */
        public final Bundle f49333c;

        /* renamed from: d */
        public Fragment f49334d;

        public C19191b(@C0359n0 String str, @C0359n0 Class<?> cls, @C0363p0 Bundle bundle) {
            this.f49331a = str;
            this.f49332b = cls;
            this.f49333c = bundle;
        }
    }

    @Deprecated
    public FragmentTabHost(@C0359n0 Context context) {
        super(context, (AttributeSet) null);
        mo56980f(context, (AttributeSet) null);
    }

    @Deprecated
    /* renamed from: a */
    public void mo56975a(@C0359n0 TabHost.TabSpec tabSpec, @C0359n0 Class<?> cls, @C0363p0 Bundle bundle) {
        tabSpec.setContent(new C19190a(this.f49323c));
        String tag = tabSpec.getTag();
        C19191b bVar = new C19191b(tag, cls, bundle);
        if (this.f49328v) {
            Fragment s0 = this.f49324d.mo56903s0(tag);
            bVar.f49334d = s0;
            if (s0 != null && !s0.isDetached()) {
                C19234h0 u = this.f49324d.mo56909u();
                u.mo57057v(bVar.f49334d);
                u.mo57052q();
            }
        }
        this.f49321a.add(bVar);
        addTab(tabSpec);
    }

    @C0363p0
    /* renamed from: b */
    public final C19234h0 mo56976b(@C0363p0 String str, @C0363p0 C19234h0 h0Var) {
        Fragment fragment;
        C19191b e = mo56979e(str);
        if (this.f49327g != e) {
            if (h0Var == null) {
                h0Var = this.f49324d.mo56909u();
            }
            C19191b bVar = this.f49327g;
            if (!(bVar == null || (fragment = bVar.f49334d) == null)) {
                h0Var.mo57057v(fragment);
            }
            if (e != null) {
                Fragment fragment2 = e.f49334d;
                if (fragment2 == null) {
                    Fragment a = this.f49324d.mo56801G0().mo56932a(this.f49323c.getClassLoader(), e.f49332b.getName());
                    e.f49334d = a;
                    a.setArguments(e.f49333c);
                    h0Var.mo57217g(this.f49325e, e.f49334d, e.f49331a);
                } else {
                    h0Var.mo57226p(fragment2);
                }
            }
            this.f49327g = e;
        }
        return h0Var;
    }

    /* renamed from: c */
    public final void mo56977c() {
        if (this.f49322b == null) {
            FrameLayout frameLayout = (FrameLayout) findViewById(this.f49325e);
            this.f49322b = frameLayout;
            if (frameLayout == null) {
                throw new IllegalStateException("No tab content FrameLayout found for id " + this.f49325e);
            }
        }
    }

    /* renamed from: d */
    public final void mo56978d(Context context) {
        if (findViewById(16908307) == null) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
            TabWidget tabWidget = new TabWidget(context);
            tabWidget.setId(16908307);
            tabWidget.setOrientation(0);
            linearLayout.addView(tabWidget, new LinearLayout.LayoutParams(-1, -2, 0.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(16908305);
            linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(0, 0, 0.0f));
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f49322b = frameLayout2;
            frameLayout2.setId(this.f49325e);
            linearLayout.addView(frameLayout2, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
    }

    @C0363p0
    /* renamed from: e */
    public final C19191b mo56979e(String str) {
        int size = this.f49321a.size();
        for (int i = 0; i < size; i++) {
            C19191b bVar = this.f49321a.get(i);
            if (bVar.f49331a.equals(str)) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: f */
    public final void mo56980f(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842995}, 0, 0);
        this.f49325e = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    @Deprecated
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        int size = this.f49321a.size();
        C19234h0 h0Var = null;
        for (int i = 0; i < size; i++) {
            C19191b bVar = this.f49321a.get(i);
            Fragment s0 = this.f49324d.mo56903s0(bVar.f49331a);
            bVar.f49334d = s0;
            if (s0 != null && !s0.isDetached()) {
                if (bVar.f49331a.equals(currentTabTag)) {
                    this.f49327g = bVar;
                } else {
                    if (h0Var == null) {
                        h0Var = this.f49324d.mo56909u();
                    }
                    h0Var.mo57057v(bVar.f49334d);
                }
            }
        }
        this.f49328v = true;
        C19234h0 b = mo56976b(currentTabTag, h0Var);
        if (b != null) {
            b.mo57052q();
            this.f49324d.mo56889n0();
        }
    }

    @Deprecated
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f49328v = false;
    }

    @Deprecated
    public void onRestoreInstanceState(@SuppressLint({"UnknownNullness"}) Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.f49329a);
    }

    @C0359n0
    @Deprecated
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f49329a = getCurrentTabTag();
        return savedState;
    }

    @Deprecated
    public void onTabChanged(@C0363p0 String str) {
        C19234h0 b;
        if (this.f49328v && (b = mo56976b(str, (C19234h0) null)) != null) {
            b.mo57052q();
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.f49326f;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    @Deprecated
    public void setOnTabChangedListener(@C0363p0 TabHost.OnTabChangeListener onTabChangeListener) {
        this.f49326f = onTabChangeListener;
    }

    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    @Deprecated
    public void setup(@C0359n0 Context context, @C0359n0 FragmentManager fragmentManager) {
        mo56978d(context);
        super.setup();
        this.f49323c = context;
        this.f49324d = fragmentManager;
        mo56977c();
    }

    @Deprecated
    public FragmentTabHost(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        mo56980f(context, attributeSet);
    }

    @Deprecated
    public void setup(@C0359n0 Context context, @C0359n0 FragmentManager fragmentManager, int i) {
        mo56978d(context);
        super.setup();
        this.f49323c = context;
        this.f49324d = fragmentManager;
        this.f49325e = i;
        mo56977c();
        this.f49322b.setId(i);
        if (getId() == -1) {
            setId(16908306);
        }
    }
}

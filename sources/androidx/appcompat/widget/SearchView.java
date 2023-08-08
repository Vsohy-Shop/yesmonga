package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0387a;
import androidx.appcompat.view.C0537c;
import androidx.core.view.C18196h2;
import androidx.cursoradapter.widget.C18517a;
import androidx.customview.view.AbsSavedState;
import com.contentsquare.android.api.C14092c;
import com.urbanairship.util.C9647e0;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class SearchView extends LinearLayoutCompat implements C0537c {

    /* renamed from: R1 */
    public static final boolean f2051R1 = false;

    /* renamed from: S1 */
    public static final String f2052S1 = "SearchView";

    /* renamed from: T1 */
    public static final String f2053T1 = "nm";

    /* renamed from: U1 */
    public static final C0668o f2054U1 = (Build.VERSION.SDK_INT < 29 ? new C0668o() : null);

    /* renamed from: A1 */
    public int f2055A1;

    /* renamed from: B1 */
    public boolean f2056B1;

    /* renamed from: C1 */
    public CharSequence f2057C1;

    /* renamed from: D1 */
    public CharSequence f2058D1;

    /* renamed from: E1 */
    public boolean f2059E1;

    /* renamed from: F1 */
    public int f2060F1;

    /* renamed from: G1 */
    public SearchableInfo f2061G1;

    /* renamed from: H1 */
    public Bundle f2062H1;

    /* renamed from: I1 */
    public final Runnable f2063I1;

    /* renamed from: J1 */
    public Runnable f2064J1;

    /* renamed from: K1 */
    public final WeakHashMap<String, Drawable.ConstantState> f2065K1;

    /* renamed from: L1 */
    public final View.OnClickListener f2066L1;

    /* renamed from: M1 */
    public View.OnKeyListener f2067M1;

    /* renamed from: N1 */
    public final TextView.OnEditorActionListener f2068N1;

    /* renamed from: O1 */
    public final AdapterView.OnItemClickListener f2069O1;

    /* renamed from: P1 */
    public final AdapterView.OnItemSelectedListener f2070P1;

    /* renamed from: Q1 */
    public TextWatcher f2071Q1;

    /* renamed from: T0 */
    public final SearchAutoComplete f2072T0;

    /* renamed from: U0 */
    public final View f2073U0;

    /* renamed from: V0 */
    public final View f2074V0;

    /* renamed from: W0 */
    public final View f2075W0;

    /* renamed from: X0 */
    public final ImageView f2076X0;

    /* renamed from: Y0 */
    public final ImageView f2077Y0;

    /* renamed from: Z0 */
    public final ImageView f2078Z0;

    /* renamed from: a1 */
    public final ImageView f2079a1;

    /* renamed from: b1 */
    public final View f2080b1;

    /* renamed from: c1 */
    public C0669p f2081c1;

    /* renamed from: d1 */
    public Rect f2082d1;

    /* renamed from: e1 */
    public Rect f2083e1;

    /* renamed from: f1 */
    public int[] f2084f1;

    /* renamed from: g1 */
    public int[] f2085g1;

    /* renamed from: h1 */
    public final ImageView f2086h1;

    /* renamed from: i1 */
    public final Drawable f2087i1;

    /* renamed from: j1 */
    public final int f2088j1;

    /* renamed from: k1 */
    public final int f2089k1;

    /* renamed from: l1 */
    public final Intent f2090l1;

    /* renamed from: m1 */
    public final Intent f2091m1;

    /* renamed from: n1 */
    public final CharSequence f2092n1;

    /* renamed from: o1 */
    public C0666m f2093o1;

    /* renamed from: p1 */
    public C0665l f2094p1;

    /* renamed from: q1 */
    public View.OnFocusChangeListener f2095q1;

    /* renamed from: r1 */
    public C0667n f2096r1;

    /* renamed from: s1 */
    public View.OnClickListener f2097s1;

    /* renamed from: t1 */
    public boolean f2098t1;

    /* renamed from: u1 */
    public boolean f2099u1;

    /* renamed from: v1 */
    public C18517a f2100v1;

    /* renamed from: w1 */
    public boolean f2101w1;

    /* renamed from: x1 */
    public CharSequence f2102x1;

    /* renamed from: y1 */
    public boolean f2103y1;

    /* renamed from: z1 */
    public boolean f2104z1;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0652a();

        /* renamed from: c */
        public boolean f2105c;

        /* renamed from: androidx.appcompat.widget.SearchView$SavedState$a */
        public class C0652a implements Parcelable.ClassLoaderCreator<SavedState> {
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

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f2105c + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f2105c));
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2105c = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {

        /* renamed from: e */
        public int f2106e;

        /* renamed from: f */
        public SearchView f2107f;

        /* renamed from: g */
        public boolean f2108g;

        /* renamed from: v */
        public final Runnable f2109v;

        /* renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete$a */
        public class C0653a implements Runnable {
            public C0653a() {
            }

            public void run() {
                SearchAutoComplete.this.mo3000e();
            }
        }

        public SearchAutoComplete(Context context) {
            this(context, (AttributeSet) null);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i >= 600) {
                return C14092c.f34560U;
            }
            if (i < 640 || i2 < 480) {
                return 160;
            }
            return C14092c.f34560U;
        }

        /* renamed from: c */
        public void mo2998c() {
            if (Build.VERSION.SDK_INT >= 29) {
                C0664k.m3226b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            SearchView.f2054U1.mo3032c(this);
        }

        /* renamed from: d */
        public boolean mo2999d() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        /* renamed from: e */
        public void mo3000e() {
            if (this.f2108g) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f2108g = false;
            }
        }

        public boolean enoughToFilter() {
            return this.f2106e <= 0 || super.enoughToFilter();
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f2108g) {
                removeCallbacks(this.f2109v);
                post(this.f2109v);
            }
            return onCreateInputConnection;
        }

        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f2107f.mo2948f0();
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f2107f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f2107f.hasFocus() && getVisibility() == 0) {
                this.f2108g = true;
                if (SearchView.m3178Q(getContext())) {
                    mo2998c();
                }
            }
        }

        public void performCompletion() {
        }

        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f2108g = false;
                removeCallbacks(this.f2109v);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f2108g = false;
                removeCallbacks(this.f2109v);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f2108g = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f2107f = searchView;
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f2106e = i;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C0387a.C0389b.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f2109v = new C0653a();
            this.f2106e = getThreshold();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$a */
    public class C0654a implements TextWatcher {
        public C0654a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView.this.mo2947e0(charSequence);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$b */
    public class C0655b implements Runnable {
        public C0655b() {
        }

        public void run() {
            SearchView.this.mo2961k0();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$c */
    public class C0656c implements Runnable {
        public C0656c() {
        }

        public void run() {
            C18517a aVar = SearchView.this.f2100v1;
            if (aVar instanceof C0694b1) {
                aVar.mo3282b((Cursor) null);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$d */
    public class C0657d implements View.OnFocusChangeListener {
        public C0657d() {
        }

        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f2095q1;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$e */
    public class C0658e implements View.OnLayoutChangeListener {
        public C0658e() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SearchView.this.mo2921E();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$f */
    public class C0659f implements View.OnClickListener {
        public C0659f() {
        }

        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f2076X0) {
                searchView.mo2943b0();
            } else if (view == searchView.f2078Z0) {
                searchView.mo2939X();
            } else if (view == searchView.f2077Y0) {
                searchView.mo2944c0();
            } else if (view == searchView.f2079a1) {
                searchView.mo2949g0();
            } else if (view == searchView.f2072T0) {
                searchView.mo2927K();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$g */
    public class C0660g implements View.OnKeyListener {
        public C0660g() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f2061G1 == null) {
                return false;
            }
            if (searchView.f2072T0.isPopupShowing() && SearchView.this.f2072T0.getListSelection() != -1) {
                return SearchView.this.mo2946d0(view, i, keyEvent);
            }
            if (SearchView.this.f2072T0.mo2999d() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.mo2937V(0, (String) null, searchView2.f2072T0.getText().toString());
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$h */
    public class C0661h implements TextView.OnEditorActionListener {
        public C0661h() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.mo2944c0();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$i */
    public class C0662i implements AdapterView.OnItemClickListener {
        public C0662i() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.mo2940Y(i, 0, (String) null);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$j */
    public class C0663j implements AdapterView.OnItemSelectedListener {
        public C0663j() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.mo2941Z(i);
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    @C0376v0(29)
    /* renamed from: androidx.appcompat.widget.SearchView$k */
    public static class C0664k {
        @C0373u
        /* renamed from: a */
        public static void m3225a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        @C0373u
        /* renamed from: b */
        public static void m3226b(SearchAutoComplete searchAutoComplete, int i) {
            searchAutoComplete.setInputMethodMode(i);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$l */
    public interface C0665l {
        /* renamed from: a */
        boolean mo3025a();
    }

    /* renamed from: androidx.appcompat.widget.SearchView$m */
    public interface C0666m {
        /* renamed from: a */
        boolean mo3026a(String str);

        /* renamed from: b */
        boolean mo3027b(String str);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$n */
    public interface C0667n {
        /* renamed from: a */
        boolean mo3028a(int i);

        /* renamed from: b */
        boolean mo3029b(int i);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$o */
    public static class C0668o {

        /* renamed from: a */
        public Method f2121a = null;

        /* renamed from: b */
        public Method f2122b = null;

        /* renamed from: c */
        public Method f2123c = null;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        public C0668o() {
            Class<AutoCompleteTextView> cls = AutoCompleteTextView.class;
            m3232d();
            try {
                Method declaredMethod = cls.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f2121a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = cls.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f2122b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = cls.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.f2123c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* renamed from: d */
        public static void m3232d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        /* renamed from: a */
        public void mo3030a(AutoCompleteTextView autoCompleteTextView) {
            m3232d();
            Method method = this.f2122b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: b */
        public void mo3031b(AutoCompleteTextView autoCompleteTextView) {
            m3232d();
            Method method = this.f2121a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: c */
        public void mo3032c(AutoCompleteTextView autoCompleteTextView) {
            m3232d();
            Method method = this.f2123c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[]{Boolean.TRUE});
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$p */
    public static class C0669p extends TouchDelegate {

        /* renamed from: a */
        public final View f2124a;

        /* renamed from: b */
        public final Rect f2125b = new Rect();

        /* renamed from: c */
        public final Rect f2126c = new Rect();

        /* renamed from: d */
        public final Rect f2127d = new Rect();

        /* renamed from: e */
        public final int f2128e;

        /* renamed from: f */
        public boolean f2129f;

        public C0669p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f2128e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            mo3033a(rect, rect2);
            this.f2124a = view;
        }

        /* renamed from: a */
        public void mo3033a(Rect rect, Rect rect2) {
            this.f2125b.set(rect);
            this.f2127d.set(rect);
            Rect rect3 = this.f2127d;
            int i = this.f2128e;
            rect3.inset(-i, -i);
            this.f2126c.set(rect2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r9) {
            /*
                r8 = this;
                float r0 = r9.getX()
                int r0 = (int) r0
                float r1 = r9.getY()
                int r1 = (int) r1
                int r2 = r9.getAction()
                r3 = 2
                r4 = 0
                r5 = 1
                if (r2 == 0) goto L_0x0033
                if (r2 == r5) goto L_0x0020
                if (r2 == r3) goto L_0x0020
                r6 = 3
                if (r2 == r6) goto L_0x001b
                goto L_0x003f
            L_0x001b:
                boolean r2 = r8.f2129f
                r8.f2129f = r4
                goto L_0x002f
            L_0x0020:
                boolean r2 = r8.f2129f
                if (r2 == 0) goto L_0x002f
                android.graphics.Rect r6 = r8.f2127d
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L_0x002f
                r5 = r2
                r2 = r4
                goto L_0x0041
            L_0x002f:
                r7 = r5
                r5 = r2
                r2 = r7
                goto L_0x0041
            L_0x0033:
                android.graphics.Rect r2 = r8.f2125b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x003f
                r8.f2129f = r5
                r2 = r5
                goto L_0x0041
            L_0x003f:
                r2 = r5
                r5 = r4
            L_0x0041:
                if (r5 == 0) goto L_0x0074
                if (r2 == 0) goto L_0x0061
                android.graphics.Rect r2 = r8.f2126c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x0061
                android.view.View r0 = r8.f2124a
                int r0 = r0.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                android.view.View r1 = r8.f2124a
                int r1 = r1.getHeight()
                int r1 = r1 / r3
                float r1 = (float) r1
                r9.setLocation(r0, r1)
                goto L_0x006e
            L_0x0061:
                android.graphics.Rect r2 = r8.f2126c
                int r3 = r2.left
                int r0 = r0 - r3
                float r0 = (float) r0
                int r2 = r2.top
                int r1 = r1 - r2
                float r1 = (float) r1
                r9.setLocation(r0, r1)
            L_0x006e:
                android.view.View r0 = r8.f2124a
                boolean r4 = r0.dispatchTouchEvent(r9)
            L_0x0074:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.C0669p.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public SearchView(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: Q */
    public static boolean m3178Q(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C0387a.C0392e.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C0387a.C0392e.abc_search_view_preferred_width);
    }

    /* renamed from: E */
    public void mo2921E() {
        int i;
        int i2;
        if (this.f2080b1.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f2074V0.getPaddingLeft();
            Rect rect = new Rect();
            boolean b = C0796u1.m3859b(this);
            if (this.f2098t1) {
                i = resources.getDimensionPixelSize(C0387a.C0392e.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(C0387a.C0392e.abc_dropdownitem_text_padding_left);
            } else {
                i = 0;
            }
            this.f2072T0.getDropDownBackground().getPadding(rect);
            if (b) {
                i2 = -rect.left;
            } else {
                i2 = paddingLeft - (rect.left + i);
            }
            this.f2072T0.setDropDownHorizontalOffset(i2);
            this.f2072T0.setDropDownWidth((((this.f2080b1.getWidth() + rect.left) + rect.right) + i) - paddingLeft);
        }
    }

    /* renamed from: F */
    public final Intent mo2922F(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f2058D1);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f2062H1;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f2061G1.getSearchActivity());
        return intent;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:19|20|23|24) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r10 = r10.getPosition();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0066, code lost:
        r10 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0067, code lost:
        r11 = new java.lang.StringBuilder();
        r11.append("Search suggestions cursor at row ");
        r11.append(r10);
        r11.append(" returned exception.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0079, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0061 */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.Intent mo2923G(android.database.Cursor r10, int r11, java.lang.String r12) {
        /*
            r9 = this;
            r0 = 0
            java.lang.String r1 = "suggest_intent_action"
            java.lang.String r1 = androidx.appcompat.widget.C0694b1.m3359u(r10, r1)     // Catch:{ RuntimeException -> 0x0061 }
            if (r1 != 0) goto L_0x000f
            android.app.SearchableInfo r1 = r9.f2061G1     // Catch:{ RuntimeException -> 0x0061 }
            java.lang.String r1 = r1.getSuggestIntentAction()     // Catch:{ RuntimeException -> 0x0061 }
        L_0x000f:
            if (r1 != 0) goto L_0x0013
            java.lang.String r1 = "android.intent.action.SEARCH"
        L_0x0013:
            r3 = r1
            java.lang.String r1 = "suggest_intent_data"
            java.lang.String r1 = androidx.appcompat.widget.C0694b1.m3359u(r10, r1)     // Catch:{ RuntimeException -> 0x0061 }
            if (r1 != 0) goto L_0x0022
            android.app.SearchableInfo r1 = r9.f2061G1     // Catch:{ RuntimeException -> 0x0061 }
            java.lang.String r1 = r1.getSuggestIntentData()     // Catch:{ RuntimeException -> 0x0061 }
        L_0x0022:
            if (r1 == 0) goto L_0x0044
            java.lang.String r2 = "suggest_intent_data_id"
            java.lang.String r2 = androidx.appcompat.widget.C0694b1.m3359u(r10, r2)     // Catch:{ RuntimeException -> 0x0061 }
            if (r2 == 0) goto L_0x0044
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x0061 }
            r4.<init>()     // Catch:{ RuntimeException -> 0x0061 }
            r4.append(r1)     // Catch:{ RuntimeException -> 0x0061 }
            java.lang.String r1 = "/"
            r4.append(r1)     // Catch:{ RuntimeException -> 0x0061 }
            java.lang.String r1 = android.net.Uri.encode(r2)     // Catch:{ RuntimeException -> 0x0061 }
            r4.append(r1)     // Catch:{ RuntimeException -> 0x0061 }
            java.lang.String r1 = r4.toString()     // Catch:{ RuntimeException -> 0x0061 }
        L_0x0044:
            if (r1 != 0) goto L_0x0048
            r4 = r0
            goto L_0x004d
        L_0x0048:
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ RuntimeException -> 0x0061 }
            r4 = r1
        L_0x004d:
            java.lang.String r1 = "suggest_intent_query"
            java.lang.String r6 = androidx.appcompat.widget.C0694b1.m3359u(r10, r1)     // Catch:{ RuntimeException -> 0x0061 }
            java.lang.String r1 = "suggest_intent_extra_data"
            java.lang.String r5 = androidx.appcompat.widget.C0694b1.m3359u(r10, r1)     // Catch:{ RuntimeException -> 0x0061 }
            r2 = r9
            r7 = r11
            r8 = r12
            android.content.Intent r10 = r2.mo2922F(r3, r4, r5, r6, r7, r8)     // Catch:{ RuntimeException -> 0x0061 }
            return r10
        L_0x0061:
            int r10 = r10.getPosition()     // Catch:{ RuntimeException -> 0x0066 }
            goto L_0x0067
        L_0x0066:
            r10 = -1
        L_0x0067:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Search suggestions cursor at row "
            r11.append(r12)
            r11.append(r10)
            java.lang.String r10 = " returned exception."
            r11.append(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.mo2923G(android.database.Cursor, int, java.lang.String):android.content.Intent");
    }

    /* renamed from: H */
    public final Intent mo2924H(Intent intent, SearchableInfo searchableInfo) {
        String str;
        String str2;
        String str3;
        int i;
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f2062H1;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        if (searchableInfo.getVoiceLanguageModeId() != 0) {
            str = resources.getString(searchableInfo.getVoiceLanguageModeId());
        } else {
            str = "free_form";
        }
        String str4 = null;
        if (searchableInfo.getVoicePromptTextId() != 0) {
            str2 = resources.getString(searchableInfo.getVoicePromptTextId());
        } else {
            str2 = null;
        }
        if (searchableInfo.getVoiceLanguageId() != 0) {
            str3 = resources.getString(searchableInfo.getVoiceLanguageId());
        } else {
            str3 = null;
        }
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i = searchableInfo.getVoiceMaxResults();
        } else {
            i = 1;
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", str);
        intent3.putExtra("android.speech.extra.PROMPT", str2);
        intent3.putExtra("android.speech.extra.LANGUAGE", str3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i);
        if (searchActivity != null) {
            str4 = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str4);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* renamed from: I */
    public final Intent mo2925I(Intent intent, SearchableInfo searchableInfo) {
        String str;
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        if (searchActivity == null) {
            str = null;
        } else {
            str = searchActivity.flattenToShortString();
        }
        intent2.putExtra("calling_package", str);
        return intent2;
    }

    /* renamed from: J */
    public final void mo2926J() {
        this.f2072T0.dismissDropDown();
    }

    /* renamed from: K */
    public void mo2927K() {
        if (Build.VERSION.SDK_INT >= 29) {
            C0664k.m3225a(this.f2072T0);
            return;
        }
        C0668o oVar = f2054U1;
        oVar.mo3031b(this.f2072T0);
        oVar.mo3030a(this.f2072T0);
    }

    /* renamed from: L */
    public final void mo2928L(View view, Rect rect) {
        view.getLocationInWindow(this.f2084f1);
        getLocationInWindow(this.f2085g1);
        int[] iArr = this.f2084f1;
        int i = iArr[1];
        int[] iArr2 = this.f2085g1;
        int i2 = i - iArr2[1];
        int i3 = iArr[0] - iArr2[0];
        rect.set(i3, i2, view.getWidth() + i3, view.getHeight() + i2);
    }

    /* renamed from: M */
    public final CharSequence mo2929M(CharSequence charSequence) {
        if (!this.f2098t1 || this.f2087i1 == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.f2072T0.getTextSize()) * 1.25d);
        this.f2087i1.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f2087i1), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    /* renamed from: N */
    public final boolean mo2930N() {
        Intent intent;
        SearchableInfo searchableInfo = this.f2061G1;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        if (this.f2061G1.getVoiceSearchLaunchWebSearch()) {
            intent = this.f2090l1;
        } else if (this.f2061G1.getVoiceSearchLaunchRecognizer()) {
            intent = this.f2091m1;
        } else {
            intent = null;
        }
        if (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: O */
    public boolean mo2931O() {
        return this.f2098t1;
    }

    /* renamed from: P */
    public boolean mo2932P() {
        return this.f2099u1;
    }

    /* renamed from: R */
    public boolean mo2933R() {
        return this.f2103y1;
    }

    /* renamed from: S */
    public final boolean mo2934S() {
        return (this.f2101w1 || this.f2056B1) && !mo2932P();
    }

    /* renamed from: T */
    public boolean mo2935T() {
        return this.f2101w1;
    }

    /* renamed from: U */
    public final void mo2936U(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (RuntimeException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed launch activity: ");
                sb.append(intent);
            }
        }
    }

    /* renamed from: V */
    public void mo2937V(int i, String str, String str2) {
        getContext().startActivity(mo2922F("android.intent.action.SEARCH", (Uri) null, (String) null, str2, i, str));
    }

    /* renamed from: W */
    public final boolean mo2938W(int i, int i2, String str) {
        Cursor d = this.f2100v1.mo53383d();
        if (d == null || !d.moveToPosition(i)) {
            return false;
        }
        mo2936U(mo2923G(d, i2, str));
        return true;
    }

    /* renamed from: X */
    public void mo2939X() {
        if (!TextUtils.isEmpty(this.f2072T0.getText())) {
            this.f2072T0.setText("");
            this.f2072T0.requestFocus();
            this.f2072T0.setImeVisibility(true);
        } else if (this.f2098t1) {
            C0665l lVar = this.f2094p1;
            if (lVar == null || !lVar.mo3025a()) {
                clearFocus();
                mo2970p0(true);
            }
        }
    }

    /* renamed from: Y */
    public boolean mo2940Y(int i, int i2, String str) {
        C0667n nVar = this.f2096r1;
        if (nVar != null && nVar.mo3029b(i)) {
            return false;
        }
        mo2938W(i, 0, (String) null);
        this.f2072T0.setImeVisibility(false);
        mo2926J();
        return true;
    }

    /* renamed from: Z */
    public boolean mo2941Z(int i) {
        C0667n nVar = this.f2096r1;
        if (nVar != null && nVar.mo3028a(i)) {
            return false;
        }
        mo2959i0(i);
        return true;
    }

    /* renamed from: a */
    public void mo1757a() {
        if (!this.f2059E1) {
            this.f2059E1 = true;
            int imeOptions = this.f2072T0.getImeOptions();
            this.f2060F1 = imeOptions;
            this.f2072T0.setImeOptions(imeOptions | C9647e0.f26435a);
            this.f2072T0.setText("");
            setIconified(false);
        }
    }

    /* renamed from: a0 */
    public void mo2942a0(@C0363p0 CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* renamed from: b0 */
    public void mo2943b0() {
        mo2970p0(false);
        this.f2072T0.requestFocus();
        this.f2072T0.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f2097s1;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* renamed from: c0 */
    public void mo2944c0() {
        Editable text = this.f2072T0.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            C0666m mVar = this.f2093o1;
            if (mVar == null || !mVar.mo3027b(text.toString())) {
                if (this.f2061G1 != null) {
                    mo2937V(0, (String) null, text.toString());
                }
                this.f2072T0.setImeVisibility(false);
                mo2926J();
            }
        }
    }

    public void clearFocus() {
        this.f2104z1 = true;
        super.clearFocus();
        this.f2072T0.clearFocus();
        this.f2072T0.setImeVisibility(false);
        this.f2104z1 = false;
    }

    /* renamed from: d0 */
    public boolean mo2946d0(View view, int i, KeyEvent keyEvent) {
        int i2;
        if (this.f2061G1 != null && this.f2100v1 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return mo2940Y(this.f2072T0.getListSelection(), 0, (String) null);
            }
            if (i == 21 || i == 22) {
                if (i == 21) {
                    i2 = 0;
                } else {
                    i2 = this.f2072T0.length();
                }
                this.f2072T0.setSelection(i2);
                this.f2072T0.setListSelection(0);
                this.f2072T0.clearListSelection();
                this.f2072T0.mo2998c();
                return true;
            } else if (i == 19) {
                this.f2072T0.getListSelection();
                return false;
            }
        }
        return false;
    }

    /* renamed from: e0 */
    public void mo2947e0(CharSequence charSequence) {
        Editable text = this.f2072T0.getText();
        this.f2058D1 = text;
        boolean z = !TextUtils.isEmpty(text);
        mo2965o0(z);
        mo2971q0(!z);
        mo2960j0();
        mo2964n0();
        if (this.f2093o1 != null && !TextUtils.equals(charSequence, this.f2057C1)) {
            this.f2093o1.mo3026a(charSequence.toString());
        }
        this.f2057C1 = charSequence.toString();
    }

    /* renamed from: f0 */
    public void mo2948f0() {
        mo2970p0(mo2932P());
        mo2958h0();
        if (this.f2072T0.hasFocus()) {
            mo2927K();
        }
    }

    /* renamed from: g */
    public void mo1758g() {
        setQuery("", false);
        clearFocus();
        mo2970p0(true);
        this.f2072T0.setImeOptions(this.f2060F1);
        this.f2059E1 = false;
    }

    /* renamed from: g0 */
    public void mo2949g0() {
        SearchableInfo searchableInfo = this.f2061G1;
        if (searchableInfo != null) {
            try {
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    getContext().startActivity(mo2925I(this.f2090l1, searchableInfo));
                } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    getContext().startActivity(mo2924H(this.f2091m1, searchableInfo));
                }
            } catch (ActivityNotFoundException unused) {
            }
        }
    }

    public int getImeOptions() {
        return this.f2072T0.getImeOptions();
    }

    public int getInputType() {
        return this.f2072T0.getInputType();
    }

    public int getMaxWidth() {
        return this.f2055A1;
    }

    public CharSequence getQuery() {
        return this.f2072T0.getText();
    }

    @C0363p0
    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f2102x1;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f2061G1;
        if (searchableInfo == null || searchableInfo.getHintId() == 0) {
            return this.f2092n1;
        }
        return getContext().getText(this.f2061G1.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f2089k1;
    }

    public int getSuggestionRowLayout() {
        return this.f2088j1;
    }

    public C18517a getSuggestionsAdapter() {
        return this.f2100v1;
    }

    /* renamed from: h0 */
    public final void mo2958h0() {
        post(this.f2063I1);
    }

    /* renamed from: i0 */
    public final void mo2959i0(int i) {
        Editable text = this.f2072T0.getText();
        Cursor d = this.f2100v1.mo53383d();
        if (d != null) {
            if (d.moveToPosition(i)) {
                CharSequence a = this.f2100v1.mo3281a(d);
                if (a != null) {
                    setQuery(a);
                } else {
                    setQuery(text);
                }
            } else {
                setQuery(text);
            }
        }
    }

    /* renamed from: j0 */
    public final void mo2960j0() {
        int[] iArr;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f2072T0.getText());
        int i = 0;
        if (!z2 && (!this.f2098t1 || this.f2059E1)) {
            z = false;
        }
        ImageView imageView = this.f2078Z0;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = this.f2078Z0.getDrawable();
        if (drawable != null) {
            if (z2) {
                iArr = ViewGroup.ENABLED_STATE_SET;
            } else {
                iArr = ViewGroup.EMPTY_STATE_SET;
            }
            drawable.setState(iArr);
        }
    }

    /* renamed from: k0 */
    public void mo2961k0() {
        int[] iArr;
        if (this.f2072T0.hasFocus()) {
            iArr = ViewGroup.FOCUSED_STATE_SET;
        } else {
            iArr = ViewGroup.EMPTY_STATE_SET;
        }
        Drawable background = this.f2074V0.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f2075W0.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* renamed from: l0 */
    public final void mo2962l0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f2072T0;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(mo2929M(queryHint));
    }

    /* renamed from: m0 */
    public final void mo2963m0() {
        this.f2072T0.setThreshold(this.f2061G1.getSuggestThreshold());
        this.f2072T0.setImeOptions(this.f2061G1.getImeOptions());
        int inputType = this.f2061G1.getInputType();
        int i = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f2061G1.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f2072T0.setInputType(inputType);
        C18517a aVar = this.f2100v1;
        if (aVar != null) {
            aVar.mo3282b((Cursor) null);
        }
        if (this.f2061G1.getSuggestAuthority() != null) {
            C0694b1 b1Var = new C0694b1(getContext(), this, this.f2061G1, this.f2065K1);
            this.f2100v1 = b1Var;
            this.f2072T0.setAdapter(b1Var);
            C0694b1 b1Var2 = (C0694b1) this.f2100v1;
            if (this.f2103y1) {
                i = 2;
            }
            b1Var2.mo3276E(i);
        }
    }

    /* renamed from: n0 */
    public final void mo2964n0() {
        int i;
        if (!mo2934S() || !(this.f2077Y0.getVisibility() == 0 || this.f2079a1.getVisibility() == 0)) {
            i = 8;
        } else {
            i = 0;
        }
        this.f2075W0.setVisibility(i);
    }

    /* renamed from: o0 */
    public final void mo2965o0(boolean z) {
        int i;
        if (!this.f2101w1 || !mo2934S() || !hasFocus() || (!z && this.f2056B1)) {
            i = 8;
        } else {
            i = 0;
        }
        this.f2077Y0.setVisibility(i);
    }

    public void onDetachedFromWindow() {
        removeCallbacks(this.f2063I1);
        post(this.f2064J1);
        super.onDetachedFromWindow();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            mo2928L(this.f2072T0, this.f2082d1);
            Rect rect = this.f2083e1;
            Rect rect2 = this.f2082d1;
            rect.set(rect2.left, 0, rect2.right, i4 - i2);
            C0669p pVar = this.f2081c1;
            if (pVar == null) {
                C0669p pVar2 = new C0669p(this.f2083e1, this.f2082d1, this.f2072T0);
                this.f2081c1 = pVar2;
                setTouchDelegate(pVar2);
                return;
            }
            pVar.mo3033a(this.f2083e1, this.f2082d1);
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        if (mo2932P()) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.f2055A1;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f2055A1;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i3 = this.f2055A1) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo53419a());
        mo2970p0(savedState.f2105c);
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f2105c = mo2932P();
        return savedState;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        mo2958h0();
    }

    /* renamed from: p0 */
    public final void mo2970p0(boolean z) {
        int i;
        int i2;
        this.f2099u1 = z;
        int i3 = 0;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        boolean z2 = !TextUtils.isEmpty(this.f2072T0.getText());
        this.f2076X0.setVisibility(i);
        mo2965o0(z2);
        View view = this.f2073U0;
        if (z) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        view.setVisibility(i2);
        if (this.f2086h1.getDrawable() == null || this.f2098t1) {
            i3 = 8;
        }
        this.f2086h1.setVisibility(i3);
        mo2960j0();
        mo2971q0(!z2);
        mo2964n0();
    }

    /* renamed from: q0 */
    public final void mo2971q0(boolean z) {
        int i = 8;
        if (this.f2056B1 && !mo2932P() && z) {
            this.f2077Y0.setVisibility(8);
            i = 0;
        }
        this.f2079a1.setVisibility(i);
    }

    public boolean requestFocus(int i, Rect rect) {
        if (this.f2104z1 || !isFocusable()) {
            return false;
        }
        if (mo2932P()) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.f2072T0.requestFocus(i, rect);
        if (requestFocus) {
            mo2970p0(false);
        }
        return requestFocus;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setAppSearchData(Bundle bundle) {
        this.f2062H1 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            mo2939X();
        } else {
            mo2943b0();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f2098t1 != z) {
            this.f2098t1 = z;
            mo2970p0(z);
            mo2962l0();
        }
    }

    public void setImeOptions(int i) {
        this.f2072T0.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f2072T0.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f2055A1 = i;
        requestLayout();
    }

    public void setOnCloseListener(C0665l lVar) {
        this.f2094p1 = lVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f2095q1 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(C0666m mVar) {
        this.f2093o1 = mVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f2097s1 = onClickListener;
    }

    public void setOnSuggestionListener(C0667n nVar) {
        this.f2096r1 = nVar;
    }

    public void setQuery(CharSequence charSequence, boolean z) {
        this.f2072T0.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f2072T0;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f2058D1 = charSequence;
        }
        if (z && !TextUtils.isEmpty(charSequence)) {
            mo2944c0();
        }
    }

    public void setQueryHint(@C0363p0 CharSequence charSequence) {
        this.f2102x1 = charSequence;
        mo2962l0();
    }

    public void setQueryRefinementEnabled(boolean z) {
        int i;
        this.f2103y1 = z;
        C18517a aVar = this.f2100v1;
        if (aVar instanceof C0694b1) {
            C0694b1 b1Var = (C0694b1) aVar;
            if (z) {
                i = 2;
            } else {
                i = 1;
            }
            b1Var.mo3276E(i);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f2061G1 = searchableInfo;
        if (searchableInfo != null) {
            mo2963m0();
            mo2962l0();
        }
        boolean N = mo2930N();
        this.f2056B1 = N;
        if (N) {
            this.f2072T0.setPrivateImeOptions(f2053T1);
        }
        mo2970p0(mo2932P());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f2101w1 = z;
        mo2970p0(mo2932P());
    }

    public void setSuggestionsAdapter(C18517a aVar) {
        this.f2100v1 = aVar;
        this.f2072T0.setAdapter(aVar);
    }

    public SearchView(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C0387a.C0389b.searchViewStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchView(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2082d1 = new Rect();
        this.f2083e1 = new Rect();
        this.f2084f1 = new int[2];
        this.f2085g1 = new int[2];
        this.f2063I1 = new C0655b();
        this.f2064J1 = new C0656c();
        this.f2065K1 = new WeakHashMap<>();
        C0659f fVar = new C0659f();
        this.f2066L1 = fVar;
        this.f2067M1 = new C0660g();
        C0661h hVar = new C0661h();
        this.f2068N1 = hVar;
        C0662i iVar = new C0662i();
        this.f2069O1 = iVar;
        C0663j jVar = new C0663j();
        this.f2070P1 = jVar;
        this.f2071Q1 = new C0654a();
        int[] iArr = C0387a.C0400m.SearchView;
        AttributeSet attributeSet2 = attributeSet;
        int i2 = i;
        C0722h1 G = C0722h1.m3539G(context, attributeSet2, iArr, i2, 0);
        C18196h2.m82658z1(this, context, iArr, attributeSet2, G.mo3454B(), i2, 0);
        LayoutInflater.from(context).inflate(G.mo3479u(C0387a.C0400m.SearchView_layout, C0387a.C0397j.abc_search_view), this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(C0387a.C0394g.search_src_text);
        this.f2072T0 = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f2073U0 = findViewById(C0387a.C0394g.search_edit_frame);
        View findViewById = findViewById(C0387a.C0394g.search_plate);
        this.f2074V0 = findViewById;
        View findViewById2 = findViewById(C0387a.C0394g.submit_area);
        this.f2075W0 = findViewById2;
        ImageView imageView = (ImageView) findViewById(C0387a.C0394g.search_button);
        this.f2076X0 = imageView;
        ImageView imageView2 = (ImageView) findViewById(C0387a.C0394g.search_go_btn);
        this.f2077Y0 = imageView2;
        ImageView imageView3 = (ImageView) findViewById(C0387a.C0394g.search_close_btn);
        this.f2078Z0 = imageView3;
        ImageView imageView4 = (ImageView) findViewById(C0387a.C0394g.search_voice_btn);
        this.f2079a1 = imageView4;
        ImageView imageView5 = (ImageView) findViewById(C0387a.C0394g.search_mag_icon);
        this.f2086h1 = imageView5;
        C18196h2.m82502I1(findViewById, G.mo3466h(C0387a.C0400m.SearchView_queryBackground));
        C18196h2.m82502I1(findViewById2, G.mo3466h(C0387a.C0400m.SearchView_submitBackground));
        int i3 = C0387a.C0400m.SearchView_searchIcon;
        imageView.setImageDrawable(G.mo3466h(i3));
        imageView2.setImageDrawable(G.mo3466h(C0387a.C0400m.SearchView_goIcon));
        imageView3.setImageDrawable(G.mo3466h(C0387a.C0400m.SearchView_closeIcon));
        imageView4.setImageDrawable(G.mo3466h(C0387a.C0400m.SearchView_voiceIcon));
        imageView5.setImageDrawable(G.mo3466h(i3));
        this.f2087i1 = G.mo3466h(C0387a.C0400m.SearchView_searchHintIcon);
        C0757o1.m3709a(imageView, getResources().getString(C0387a.C0398k.abc_searchview_description_search));
        this.f2088j1 = G.mo3479u(C0387a.C0400m.SearchView_suggestionRowLayout, C0387a.C0397j.abc_search_dropdown_item_icons_2line);
        this.f2089k1 = G.mo3479u(C0387a.C0400m.SearchView_commitIcon, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f2071Q1);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f2067M1);
        searchAutoComplete.setOnFocusChangeListener(new C0657d());
        setIconifiedByDefault(G.mo3459a(C0387a.C0400m.SearchView_iconifiedByDefault, true));
        int g = G.mo3465g(C0387a.C0400m.SearchView_android_maxWidth, -1);
        if (g != -1) {
            setMaxWidth(g);
        }
        this.f2092n1 = G.mo3482x(C0387a.C0400m.SearchView_defaultQueryHint);
        this.f2102x1 = G.mo3482x(C0387a.C0400m.SearchView_queryHint);
        int o = G.mo3473o(C0387a.C0400m.SearchView_android_imeOptions, -1);
        if (o != -1) {
            setImeOptions(o);
        }
        int o2 = G.mo3473o(C0387a.C0400m.SearchView_android_inputType, -1);
        if (o2 != -1) {
            setInputType(o2);
        }
        setFocusable(G.mo3459a(C0387a.C0400m.SearchView_android_focusable, true));
        G.mo3458I();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f2090l1 = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f2091m1 = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f2080b1 = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new C0658e());
        }
        mo2970p0(this.f2098t1);
        mo2962l0();
    }

    private void setQuery(CharSequence charSequence) {
        this.f2072T0.setText(charSequence);
        this.f2072T0.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }
}

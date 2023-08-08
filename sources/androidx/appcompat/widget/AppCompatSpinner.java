package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.annotation.C0330d1;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0375v;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0387a;
import androidx.appcompat.app.C0467d;
import androidx.appcompat.content.res.C0507a;
import androidx.appcompat.view.menu.C0590q;
import androidx.core.util.C17992m;
import androidx.core.view.C18164e2;
import androidx.core.view.C18196h2;

public class AppCompatSpinner extends Spinner implements C18164e2 {

    /* renamed from: E0 */
    public static final int f1929E0 = 1;

    /* renamed from: F0 */
    public static final int f1930F0 = -1;
    @C0330d1
    @SuppressLint({"ResourceType"})

    /* renamed from: w */
    public static final int[] f1931w = {16843505};

    /* renamed from: x */
    public static final int f1932x = 15;

    /* renamed from: y */
    public static final String f1933y = "AppCompatSpinner";

    /* renamed from: z */
    public static final int f1934z = 0;

    /* renamed from: a */
    public final C0706d f1935a;

    /* renamed from: b */
    public final Context f1936b;

    /* renamed from: c */
    public C0760p0 f1937c;

    /* renamed from: d */
    public SpinnerAdapter f1938d;

    /* renamed from: e */
    public final boolean f1939e;

    /* renamed from: f */
    public C0636i f1940f;

    /* renamed from: g */
    public int f1941g;

    /* renamed from: v */
    public final Rect f1942v;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0624a();

        /* renamed from: a */
        public boolean f1943a;

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$SavedState$a */
        public class C0624a implements Parcelable.Creator<SavedState> {
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

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f1943a ? (byte) 1 : 0);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f1943a = parcel.readByte() != 0;
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$a */
    public class C0625a extends C0760p0 {

        /* renamed from: x */
        public final /* synthetic */ C0632h f1944x;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0625a(View view, C0632h hVar) {
            super(view);
            this.f1944x = hVar;
        }

        /* renamed from: b */
        public C0590q mo1854b() {
            return this.f1944x;
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: c */
        public boolean mo1855c() {
            if (AppCompatSpinner.this.getInternalPopup().mo2716c()) {
                return true;
            }
            AppCompatSpinner.this.mo2684b();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$b */
    public class C0626b implements ViewTreeObserver.OnGlobalLayoutListener {
        public C0626b() {
        }

        public void onGlobalLayout() {
            if (!AppCompatSpinner.this.getInternalPopup().mo2716c()) {
                AppCompatSpinner.this.mo2684b();
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                C0627c.m3053a(viewTreeObserver, this);
            }
        }
    }

    @C0376v0(16)
    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$c */
    public static final class C0627c {
        @C0373u
        /* renamed from: a */
        public static void m3053a(@C0359n0 ViewTreeObserver viewTreeObserver, @C0363p0 ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    @C0376v0(17)
    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$d */
    public static final class C0628d {
        @C0373u
        /* renamed from: a */
        public static int m3054a(@C0359n0 View view) {
            return view.getTextAlignment();
        }

        @C0373u
        /* renamed from: b */
        public static int m3055b(@C0359n0 View view) {
            return view.getTextDirection();
        }

        @C0373u
        /* renamed from: c */
        public static void m3056c(@C0359n0 View view, int i) {
            view.setTextAlignment(i);
        }

        @C0373u
        /* renamed from: d */
        public static void m3057d(@C0359n0 View view, int i) {
            view.setTextDirection(i);
        }
    }

    @C0376v0(23)
    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$e */
    public static final class C0629e {
        @C0373u
        /* renamed from: a */
        public static void m3058a(@C0359n0 ThemedSpinnerAdapter themedSpinnerAdapter, @C0363p0 Resources.Theme theme) {
            if (!C17992m.m81740a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                themedSpinnerAdapter.setDropDownViewTheme(theme);
            }
        }
    }

    @C0344h1
    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$f */
    public class C0630f implements C0636i, DialogInterface.OnClickListener {
        @C0344h1

        /* renamed from: a */
        public C0467d f1947a;

        /* renamed from: b */
        public ListAdapter f1948b;

        /* renamed from: c */
        public CharSequence f1949c;

        public C0630f() {
        }

        /* renamed from: b */
        public void mo2715b(Drawable drawable) {
        }

        /* renamed from: c */
        public boolean mo2716c() {
            C0467d dVar = this.f1947a;
            if (dVar != null) {
                return dVar.isShowing();
            }
            return false;
        }

        /* renamed from: d */
        public int mo2717d() {
            return 0;
        }

        public void dismiss() {
            C0467d dVar = this.f1947a;
            if (dVar != null) {
                dVar.dismiss();
                this.f1947a = null;
            }
        }

        /* renamed from: f */
        public void mo2719f(int i) {
        }

        /* renamed from: g */
        public CharSequence mo2720g() {
            return this.f1949c;
        }

        /* renamed from: h */
        public Drawable mo2721h() {
            return null;
        }

        /* renamed from: i */
        public void mo2722i(CharSequence charSequence) {
            this.f1949c = charSequence;
        }

        /* renamed from: j */
        public void mo2723j(int i) {
        }

        /* renamed from: k */
        public void mo2724k(int i) {
        }

        /* renamed from: l */
        public void mo2725l(int i, int i2) {
            if (this.f1948b != null) {
                C0467d.C0468a aVar = new C0467d.C0468a(AppCompatSpinner.this.getPopupContext());
                CharSequence charSequence = this.f1949c;
                if (charSequence != null) {
                    aVar.mo1398K(charSequence);
                }
                C0467d a = aVar.mo1395H(this.f1948b, AppCompatSpinner.this.getSelectedItemPosition(), this).mo1403a();
                this.f1947a = a;
                ListView n = a.mo1375n();
                C0628d.m3057d(n, i);
                C0628d.m3056c(n, i2);
                this.f1947a.show();
            }
        }

        /* renamed from: m */
        public int mo2726m() {
            return 0;
        }

        /* renamed from: n */
        public int mo2727n() {
            return 0;
        }

        /* renamed from: o */
        public void mo2728o(ListAdapter listAdapter) {
            this.f1948b = listAdapter;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            AppCompatSpinner.this.setSelection(i);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick((View) null, i, this.f1948b.getItemId(i));
            }
            dismiss();
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$g */
    public static class C0631g implements ListAdapter, SpinnerAdapter {

        /* renamed from: a */
        public SpinnerAdapter f1951a;

        /* renamed from: b */
        public ListAdapter f1952b;

        public C0631g(@C0363p0 SpinnerAdapter spinnerAdapter, @C0363p0 Resources.Theme theme) {
            this.f1951a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1952b = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                C0629e.m3058a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            } else if (spinnerAdapter instanceof C0708d1) {
                C0708d1 d1Var = (C0708d1) spinnerAdapter;
                if (d1Var.getDropDownViewTheme() == null) {
                    d1Var.setDropDownViewTheme(theme);
                }
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1952b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1951a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1951a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f1951a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f1951a;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i);
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1951a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f1952b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1951a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1951a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    @C0344h1
    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$h */
    public class C0632h extends C0765q0 implements C0636i {

        /* renamed from: i1 */
        public CharSequence f1953i1;

        /* renamed from: j1 */
        public ListAdapter f1954j1;

        /* renamed from: k1 */
        public final Rect f1955k1 = new Rect();

        /* renamed from: l1 */
        public int f1956l1;

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$h$a */
        public class C0633a implements AdapterView.OnItemClickListener {

            /* renamed from: a */
            public final /* synthetic */ AppCompatSpinner f1958a;

            public C0633a(AppCompatSpinner appCompatSpinner) {
                this.f1958a = appCompatSpinner;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                AppCompatSpinner.this.setSelection(i);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    C0632h hVar = C0632h.this;
                    AppCompatSpinner.this.performItemClick(view, i, hVar.f1954j1.getItemId(i));
                }
                C0632h.this.dismiss();
            }
        }

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$h$b */
        public class C0634b implements ViewTreeObserver.OnGlobalLayoutListener {
            public C0634b() {
            }

            public void onGlobalLayout() {
                C0632h hVar = C0632h.this;
                if (!hVar.mo2744r0(AppCompatSpinner.this)) {
                    C0632h.this.dismiss();
                    return;
                }
                C0632h.this.mo2743q0();
                C0632h.super.mo1966a();
            }
        }

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$h$c */
        public class C0635c implements PopupWindow.OnDismissListener {

            /* renamed from: a */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1961a;

            public C0635c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f1961a = onGlobalLayoutListener;
            }

            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1961a);
                }
            }
        }

        public C0632h(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            mo3583S(AppCompatSpinner.this);
            mo3596d0(true);
            mo3605j0(0);
            mo3599f0(new C0633a(AppCompatSpinner.this));
        }

        /* renamed from: g */
        public CharSequence mo2720g() {
            return this.f1953i1;
        }

        /* renamed from: i */
        public void mo2722i(CharSequence charSequence) {
            this.f1953i1 = charSequence;
        }

        /* renamed from: k */
        public void mo2724k(int i) {
            this.f1956l1 = i;
        }

        /* renamed from: l */
        public void mo2725l(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean c = mo1967c();
            mo2743q0();
            mo3591a0(2);
            super.mo1966a();
            ListView q = mo1975q();
            q.setChoiceMode(1);
            C0628d.m3057d(q, i);
            C0628d.m3056c(q, i2);
            mo3607l0(AppCompatSpinner.this.getSelectedItemPosition());
            if (!c && (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) != null) {
                C0634b bVar = new C0634b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                mo3597e0(new C0635c(bVar));
            }
        }

        /* renamed from: n */
        public int mo2727n() {
            return this.f1956l1;
        }

        /* renamed from: o */
        public void mo2728o(ListAdapter listAdapter) {
            super.mo2728o(listAdapter);
            this.f1954j1 = listAdapter;
        }

        /* renamed from: q0 */
        public void mo2743q0() {
            int i;
            int i2;
            Drawable h = mo3601h();
            if (h != null) {
                h.getPadding(AppCompatSpinner.this.f1942v);
                if (C0796u1.m3859b(AppCompatSpinner.this)) {
                    i = AppCompatSpinner.this.f1942v.right;
                } else {
                    i = -AppCompatSpinner.this.f1942v.left;
                }
            } else {
                Rect rect = AppCompatSpinner.this.f1942v;
                rect.right = 0;
                rect.left = 0;
                i = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int i3 = appCompatSpinner.f1941g;
            if (i3 == -2) {
                int a = appCompatSpinner.mo2683a((SpinnerAdapter) this.f1954j1, mo3601h());
                int i4 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = AppCompatSpinner.this.f1942v;
                int i5 = (i4 - rect2.left) - rect2.right;
                if (a > i5) {
                    a = i5;
                }
                mo3585U(Math.max(a, (width - paddingLeft) - paddingRight));
            } else if (i3 == -1) {
                mo3585U((width - paddingLeft) - paddingRight);
            } else {
                mo3585U(i3);
            }
            if (C0796u1.m3859b(AppCompatSpinner.this)) {
                i2 = i + (((width - paddingRight) - mo3573H()) - mo2727n());
            } else {
                i2 = i + paddingLeft + mo2727n();
            }
            mo3598f(i2);
        }

        /* renamed from: r0 */
        public boolean mo2744r0(View view) {
            return C18196h2.m82521O0(view) && view.getGlobalVisibleRect(this.f1955k1);
        }
    }

    @C0344h1
    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$i */
    public interface C0636i {
        /* renamed from: b */
        void mo2715b(Drawable drawable);

        /* renamed from: c */
        boolean mo2716c();

        /* renamed from: d */
        int mo2717d();

        void dismiss();

        /* renamed from: f */
        void mo2719f(int i);

        /* renamed from: g */
        CharSequence mo2720g();

        /* renamed from: h */
        Drawable mo2721h();

        /* renamed from: i */
        void mo2722i(CharSequence charSequence);

        /* renamed from: j */
        void mo2723j(int i);

        /* renamed from: k */
        void mo2724k(int i);

        /* renamed from: l */
        void mo2725l(int i, int i2);

        /* renamed from: m */
        int mo2726m();

        /* renamed from: n */
        int mo2727n();

        /* renamed from: o */
        void mo2728o(ListAdapter listAdapter);
    }

    public AppCompatSpinner(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public int mo2683a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        drawable.getPadding(this.f1942v);
        Rect rect = this.f1942v;
        return i2 + rect.left + rect.right;
    }

    /* renamed from: b */
    public void mo2684b() {
        this.f1940f.mo2725l(C0628d.m3055b(this), C0628d.m3054a(this));
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0706d dVar = this.f1935a;
        if (dVar != null) {
            dVar.mo3335b();
        }
    }

    public int getDropDownHorizontalOffset() {
        C0636i iVar = this.f1940f;
        if (iVar != null) {
            return iVar.mo2717d();
        }
        return super.getDropDownHorizontalOffset();
    }

    public int getDropDownVerticalOffset() {
        C0636i iVar = this.f1940f;
        if (iVar != null) {
            return iVar.mo2726m();
        }
        return super.getDropDownVerticalOffset();
    }

    public int getDropDownWidth() {
        if (this.f1940f != null) {
            return this.f1941g;
        }
        return super.getDropDownWidth();
    }

    @C0344h1
    public final C0636i getInternalPopup() {
        return this.f1940f;
    }

    public Drawable getPopupBackground() {
        C0636i iVar = this.f1940f;
        if (iVar != null) {
            return iVar.mo2721h();
        }
        return super.getPopupBackground();
    }

    public Context getPopupContext() {
        return this.f1936b;
    }

    public CharSequence getPrompt() {
        C0636i iVar = this.f1940f;
        return iVar != null ? iVar.mo2720g() : super.getPrompt();
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        C0706d dVar = this.f1935a;
        if (dVar != null) {
            return dVar.mo3336c();
        }
        return null;
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0706d dVar = this.f1935a;
        if (dVar != null) {
            return dVar.mo3337d();
        }
        return null;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0636i iVar = this.f1940f;
        if (iVar != null && iVar.mo2716c()) {
            this.f1940f.dismiss();
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1940f != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), mo2683a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.f1943a && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new C0626b());
        }
    }

    public Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        C0636i iVar = this.f1940f;
        if (iVar == null || !iVar.mo2716c()) {
            z = false;
        } else {
            z = true;
        }
        savedState.f1943a = z;
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C0760p0 p0Var = this.f1937c;
        if (p0Var == null || !p0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        C0636i iVar = this.f1940f;
        if (iVar == null) {
            return super.performClick();
        }
        if (iVar.mo2716c()) {
            return true;
        }
        mo2684b();
        return true;
    }

    public void setBackgroundDrawable(@C0363p0 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0706d dVar = this.f1935a;
        if (dVar != null) {
            dVar.mo3339f(drawable);
        }
    }

    public void setBackgroundResource(@C0375v int i) {
        super.setBackgroundResource(i);
        C0706d dVar = this.f1935a;
        if (dVar != null) {
            dVar.mo3340g(i);
        }
    }

    public void setDropDownHorizontalOffset(int i) {
        C0636i iVar = this.f1940f;
        if (iVar != null) {
            iVar.mo2724k(i);
            this.f1940f.mo2719f(i);
            return;
        }
        super.setDropDownHorizontalOffset(i);
    }

    public void setDropDownVerticalOffset(int i) {
        C0636i iVar = this.f1940f;
        if (iVar != null) {
            iVar.mo2723j(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    public void setDropDownWidth(int i) {
        if (this.f1940f != null) {
            this.f1941g = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        C0636i iVar = this.f1940f;
        if (iVar != null) {
            iVar.mo2715b(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(@C0375v int i) {
        setPopupBackgroundDrawable(C0507a.m2346b(getPopupContext(), i));
    }

    public void setPrompt(CharSequence charSequence) {
        C0636i iVar = this.f1940f;
        if (iVar != null) {
            iVar.mo2722i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@C0363p0 ColorStateList colorStateList) {
        C0706d dVar = this.f1935a;
        if (dVar != null) {
            dVar.mo3342i(colorStateList);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@C0363p0 PorterDuff.Mode mode) {
        C0706d dVar = this.f1935a;
        if (dVar != null) {
            dVar.mo3343j(mode);
        }
    }

    public AppCompatSpinner(@C0359n0 Context context, int i) {
        this(context, (AttributeSet) null, C0387a.C0389b.spinnerStyle, i);
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1939e) {
            this.f1938d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1940f != null) {
            Context context = this.f1936b;
            if (context == null) {
                context = getContext();
            }
            this.f1940f.mo2728o(new C0631g(spinnerAdapter, context.getTheme()));
        }
    }

    public AppCompatSpinner(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C0387a.C0389b.spinnerStyle);
    }

    public AppCompatSpinner(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public AppCompatSpinner(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, (Resources.Theme) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005e, code lost:
        if (r10 != null) goto L_0x004f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0059  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppCompatSpinner(@androidx.annotation.C0359n0 android.content.Context r6, @androidx.annotation.C0363p0 android.util.AttributeSet r7, int r8, int r9, android.content.res.Resources.Theme r10) {
        /*
            r5 = this;
            r5.<init>(r6, r7, r8)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r5.f1942v = r0
            android.content.Context r0 = r5.getContext()
            androidx.appcompat.widget.C0705c1.m3421a(r5, r0)
            int[] r0 = androidx.appcompat.C0387a.C0400m.Spinner
            r1 = 0
            androidx.appcompat.widget.h1 r0 = androidx.appcompat.widget.C0722h1.m3539G(r6, r7, r0, r8, r1)
            androidx.appcompat.widget.d r2 = new androidx.appcompat.widget.d
            r2.<init>(r5)
            r5.f1935a = r2
            if (r10 == 0) goto L_0x0029
            androidx.appcompat.view.d r2 = new androidx.appcompat.view.d
            r2.<init>((android.content.Context) r6, (android.content.res.Resources.Theme) r10)
            r5.f1936b = r2
            goto L_0x003b
        L_0x0029:
            int r10 = androidx.appcompat.C0387a.C0400m.Spinner_popupTheme
            int r10 = r0.mo3479u(r10, r1)
            if (r10 == 0) goto L_0x0039
            androidx.appcompat.view.d r2 = new androidx.appcompat.view.d
            r2.<init>((android.content.Context) r6, (int) r10)
            r5.f1936b = r2
            goto L_0x003b
        L_0x0039:
            r5.f1936b = r6
        L_0x003b:
            r10 = -1
            r2 = 0
            if (r9 != r10) goto L_0x0061
            int[] r10 = f1931w     // Catch:{ Exception -> 0x005d, all -> 0x0056 }
            android.content.res.TypedArray r10 = r6.obtainStyledAttributes(r7, r10, r8, r1)     // Catch:{ Exception -> 0x005d, all -> 0x0056 }
            boolean r3 = r10.hasValue(r1)     // Catch:{ Exception -> 0x005e, all -> 0x0053 }
            if (r3 == 0) goto L_0x004f
            int r9 = r10.getInt(r1, r1)     // Catch:{ Exception -> 0x005e, all -> 0x0053 }
        L_0x004f:
            r10.recycle()
            goto L_0x0061
        L_0x0053:
            r6 = move-exception
            r2 = r10
            goto L_0x0057
        L_0x0056:
            r6 = move-exception
        L_0x0057:
            if (r2 == 0) goto L_0x005c
            r2.recycle()
        L_0x005c:
            throw r6
        L_0x005d:
            r10 = r2
        L_0x005e:
            if (r10 == 0) goto L_0x0061
            goto L_0x004f
        L_0x0061:
            r10 = 1
            if (r9 == 0) goto L_0x009e
            if (r9 == r10) goto L_0x0067
            goto L_0x00ae
        L_0x0067:
            androidx.appcompat.widget.AppCompatSpinner$h r9 = new androidx.appcompat.widget.AppCompatSpinner$h
            android.content.Context r3 = r5.f1936b
            r9.<init>(r3, r7, r8)
            android.content.Context r3 = r5.f1936b
            int[] r4 = androidx.appcompat.C0387a.C0400m.Spinner
            androidx.appcompat.widget.h1 r1 = androidx.appcompat.widget.C0722h1.m3539G(r3, r7, r4, r8, r1)
            int r3 = androidx.appcompat.C0387a.C0400m.Spinner_android_dropDownWidth
            r4 = -2
            int r3 = r1.mo3475q(r3, r4)
            r5.f1941g = r3
            int r3 = androidx.appcompat.C0387a.C0400m.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r3 = r1.mo3466h(r3)
            r9.mo3592b(r3)
            int r3 = androidx.appcompat.C0387a.C0400m.Spinner_android_prompt
            java.lang.String r3 = r0.mo3481w(r3)
            r9.mo2722i(r3)
            r1.mo3458I()
            r5.f1940f = r9
            androidx.appcompat.widget.AppCompatSpinner$a r1 = new androidx.appcompat.widget.AppCompatSpinner$a
            r1.<init>(r5, r9)
            r5.f1937c = r1
            goto L_0x00ae
        L_0x009e:
            androidx.appcompat.widget.AppCompatSpinner$f r9 = new androidx.appcompat.widget.AppCompatSpinner$f
            r9.<init>()
            r5.f1940f = r9
            int r1 = androidx.appcompat.C0387a.C0400m.Spinner_android_prompt
            java.lang.String r1 = r0.mo3481w(r1)
            r9.mo2722i(r1)
        L_0x00ae:
            int r9 = androidx.appcompat.C0387a.C0400m.Spinner_android_entries
            java.lang.CharSequence[] r9 = r0.mo3483y(r9)
            if (r9 == 0) goto L_0x00c6
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r6, r3, r9)
            int r6 = androidx.appcompat.C0387a.C0397j.support_simple_spinner_dropdown_item
            r1.setDropDownViewResource(r6)
            r5.setAdapter((android.widget.SpinnerAdapter) r1)
        L_0x00c6:
            r0.mo3458I()
            r5.f1939e = r10
            android.widget.SpinnerAdapter r6 = r5.f1938d
            if (r6 == 0) goto L_0x00d4
            r5.setAdapter((android.widget.SpinnerAdapter) r6)
            r5.f1938d = r2
        L_0x00d4:
            androidx.appcompat.widget.d r6 = r5.f1935a
            r6.mo3338e(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}

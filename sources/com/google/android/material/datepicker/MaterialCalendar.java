package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.annotation.C0327c1;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0372t0;
import androidx.annotation.RestrictTo;
import androidx.core.util.C17994n;
import androidx.core.view.C18019a;
import androidx.core.view.C18196h2;
import androidx.core.view.accessibility.C18065l0;
import androidx.recyclerview.widget.C20227z;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.C31076a;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class MaterialCalendar<S> extends C31320m<S> {

    /* renamed from: E0 */
    public static final int f75310E0 = 3;
    @C0344h1

    /* renamed from: F0 */
    public static final Object f75311F0 = "MONTHS_VIEW_GROUP_TAG";
    @C0344h1

    /* renamed from: G0 */
    public static final Object f75312G0 = "NAVIGATION_PREV_TAG";
    @C0344h1

    /* renamed from: H0 */
    public static final Object f75313H0 = "NAVIGATION_NEXT_TAG";
    @C0344h1

    /* renamed from: I0 */
    public static final Object f75314I0 = "SELECTOR_TOGGLE_TAG";

    /* renamed from: X */
    public static final String f75315X = "GRID_SELECTOR_KEY";

    /* renamed from: Y */
    public static final String f75316Y = "CALENDAR_CONSTRAINTS_KEY";

    /* renamed from: Z */
    public static final String f75317Z = "CURRENT_MONTH_KEY";

    /* renamed from: z */
    public static final String f75318z = "THEME_RES_ID_KEY";
    @C0327c1

    /* renamed from: b */
    public int f75319b;
    @C0363p0

    /* renamed from: c */
    public DateSelector<S> f75320c;
    @C0363p0

    /* renamed from: d */
    public CalendarConstraints f75321d;
    @C0363p0

    /* renamed from: e */
    public Month f75322e;

    /* renamed from: f */
    public CalendarSelector f75323f;

    /* renamed from: g */
    public C31297b f75324g;

    /* renamed from: v */
    public RecyclerView f75325v;

    /* renamed from: w */
    public RecyclerView f75326w;

    /* renamed from: x */
    public View f75327x;

    /* renamed from: y */
    public View f75328y;

    public enum CalendarSelector {
        DAY,
        YEAR
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$a */
    public class C31278a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f75332a;

        public C31278a(int i) {
            this.f75332a = i;
        }

        public void run() {
            MaterialCalendar.this.f75326w.mo59503O1(this.f75332a);
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$b */
    public class C31279b extends C18019a {
        public C31279b() {
        }

        /* renamed from: g */
        public void mo19938g(View view, @C0359n0 C18065l0 l0Var) {
            super.mo19938g(view, l0Var);
            l0Var.mo52600b1((Object) null);
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$c */
    public class C31280c extends C31321n {

        /* renamed from: e1 */
        public final /* synthetic */ int f75335e1;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31280c(Context context, int i, boolean z, int i2) {
            super(context, i, z);
            this.f75335e1 = i2;
        }

        /* renamed from: k2 */
        public void mo59408k2(@C0359n0 RecyclerView.C20055b0 b0Var, @C0359n0 int[] iArr) {
            if (this.f75335e1 == 0) {
                iArr[0] = MaterialCalendar.this.f75326w.getWidth();
                iArr[1] = MaterialCalendar.this.f75326w.getWidth();
                return;
            }
            iArr[0] = MaterialCalendar.this.f75326w.getHeight();
            iArr[1] = MaterialCalendar.this.f75326w.getHeight();
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$d */
    public class C31281d implements C31288k {
        public C31281d() {
        }

        /* renamed from: a */
        public void mo89323a(long j) {
            if (MaterialCalendar.this.f75321d.mo89254f().mo89264F1(j)) {
                MaterialCalendar.this.f75320c.mo89289S3(j);
                Iterator<C31319l<S>> it = MaterialCalendar.this.f75488a.iterator();
                while (it.hasNext()) {
                    it.next().mo89419b(MaterialCalendar.this.f75320c.mo89288H3());
                }
                MaterialCalendar.this.f75326w.getAdapter().notifyDataSetChanged();
                if (MaterialCalendar.this.f75325v != null) {
                    MaterialCalendar.this.f75325v.getAdapter().notifyDataSetChanged();
                }
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$e */
    public class C31282e extends RecyclerView.C20075n {

        /* renamed from: a */
        public final Calendar f75338a = C31324p.m126275v();

        /* renamed from: b */
        public final Calendar f75339b = C31324p.m126275v();

        public C31282e() {
        }

        /* renamed from: i */
        public void mo59864i(@C0359n0 Canvas canvas, @C0359n0 RecyclerView recyclerView, @C0359n0 RecyclerView.C20055b0 b0Var) {
            int i;
            int i2;
            if ((recyclerView.getAdapter() instanceof C31325q) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                C31325q qVar = (C31325q) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (C17994n next : MaterialCalendar.this.f75320c.mo89284A2()) {
                    F f = next.f46482a;
                    if (!(f == null || next.f46483b == null)) {
                        this.f75338a.setTimeInMillis(((Long) f).longValue());
                        this.f75339b.setTimeInMillis(((Long) next.f46483b).longValue());
                        int m = qVar.mo89465m(this.f75338a.get(1));
                        int m2 = qVar.mo89465m(this.f75339b.get(1));
                        View R = gridLayoutManager.mo59384R(m);
                        View R2 = gridLayoutManager.mo59384R(m2);
                        int D3 = m / gridLayoutManager.mo59306D3();
                        int D32 = m2 / gridLayoutManager.mo59306D3();
                        for (int i3 = D3; i3 <= D32; i3++) {
                            View R3 = gridLayoutManager.mo59384R(gridLayoutManager.mo59306D3() * i3);
                            if (R3 != null) {
                                int top = R3.getTop() + MaterialCalendar.this.f75324g.f75386d.mo89382e();
                                int bottom = R3.getBottom() - MaterialCalendar.this.f75324g.f75386d.mo89379b();
                                if (i3 == D3) {
                                    i = R.getLeft() + (R.getWidth() / 2);
                                } else {
                                    i = 0;
                                }
                                if (i3 == D32) {
                                    i2 = R2.getLeft() + (R2.getWidth() / 2);
                                } else {
                                    i2 = recyclerView.getWidth();
                                }
                                canvas.drawRect((float) i, (float) top, (float) i2, (float) bottom, MaterialCalendar.this.f75324g.f75390h);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$f */
    public class C31283f extends C18019a {
        public C31283f() {
        }

        /* renamed from: g */
        public void mo19938g(View view, @C0359n0 C18065l0 l0Var) {
            String str;
            super.mo19938g(view, l0Var);
            if (MaterialCalendar.this.f75328y.getVisibility() == 0) {
                str = MaterialCalendar.this.getString(C31076a.C31089m.mtrl_picker_toggle_to_year_selection);
            } else {
                str = MaterialCalendar.this.getString(C31076a.C31089m.mtrl_picker_toggle_to_day_selection);
            }
            l0Var.mo52641o1(str);
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$g */
    public class C31284g extends RecyclerView.C20085t {

        /* renamed from: a */
        public final /* synthetic */ C31316k f75342a;

        /* renamed from: b */
        public final /* synthetic */ MaterialButton f75343b;

        public C31284g(C31316k kVar, MaterialButton materialButton) {
            this.f75342a = kVar;
            this.f75343b = materialButton;
        }

        /* renamed from: a */
        public void mo30661a(@C0359n0 RecyclerView recyclerView, int i) {
            if (i == 0) {
                recyclerView.announceForAccessibility(this.f75343b.getText());
            }
        }

        /* renamed from: b */
        public void mo30662b(@C0359n0 RecyclerView recyclerView, int i, int i2) {
            int i3;
            if (i < 0) {
                i3 = MaterialCalendar.this.mo89317a1().mo59434x2();
            } else {
                i3 = MaterialCalendar.this.mo89317a1().mo59365A2();
            }
            Month unused = MaterialCalendar.this.f75322e = this.f75342a.mo89454l(i3);
            this.f75343b.setText(this.f75342a.mo89455m(i3));
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$h */
    public class C31285h implements View.OnClickListener {
        public C31285h() {
        }

        public void onClick(View view) {
            MaterialCalendar.this.mo89321f1();
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$i */
    public class C31286i implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ C31316k f75346a;

        public C31286i(C31316k kVar) {
            this.f75346a = kVar;
        }

        public void onClick(View view) {
            int x2 = MaterialCalendar.this.mo89317a1().mo59434x2() + 1;
            if (x2 < MaterialCalendar.this.f75326w.getAdapter().getItemCount()) {
                MaterialCalendar.this.mo89319d1(this.f75346a.mo89454l(x2));
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$j */
    public class C31287j implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ C31316k f75348a;

        public C31287j(C31316k kVar) {
            this.f75348a = kVar;
        }

        public void onClick(View view) {
            int A2 = MaterialCalendar.this.mo89317a1().mo59365A2() - 1;
            if (A2 >= 0) {
                MaterialCalendar.this.mo89319d1(this.f75348a.mo89454l(A2));
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$k */
    public interface C31288k {
        /* renamed from: a */
        void mo89323a(long j);
    }

    @C0372t0
    /* renamed from: Y0 */
    public static int m126043Y0(@C0359n0 Context context) {
        return context.getResources().getDimensionPixelSize(C31076a.C31082f.mtrl_calendar_day_height);
    }

    /* renamed from: Z0 */
    public static int m126044Z0(@C0359n0 Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C31076a.C31082f.mtrl_calendar_navigation_height) + resources.getDimensionPixelOffset(C31076a.C31082f.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelOffset(C31076a.C31082f.mtrl_calendar_navigation_bottom_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C31076a.C31082f.mtrl_calendar_days_of_week_height);
        int i = C31315j.f75474f;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(C31076a.C31082f.mtrl_calendar_day_height) * i) + ((i - 1) * resources.getDimensionPixelOffset(C31076a.C31082f.mtrl_calendar_month_vertical_padding)) + resources.getDimensionPixelOffset(C31076a.C31082f.mtrl_calendar_bottom_padding);
    }

    @C0359n0
    /* renamed from: b1 */
    public static <T> MaterialCalendar<T> m126045b1(@C0359n0 DateSelector<T> dateSelector, @C0327c1 int i, @C0359n0 CalendarConstraints calendarConstraints) {
        MaterialCalendar<T> materialCalendar = new MaterialCalendar<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable(f75315X, dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable(f75317Z, calendarConstraints.mo89258i());
        materialCalendar.setArguments(bundle);
        return materialCalendar;
    }

    /* renamed from: I0 */
    public boolean mo89310I0(@C0359n0 C31319l<S> lVar) {
        return super.mo89310I0(lVar);
    }

    @C0363p0
    /* renamed from: K0 */
    public DateSelector<S> mo89311K0() {
        return this.f75320c;
    }

    /* renamed from: T0 */
    public final void mo89312T0(@C0359n0 View view, @C0359n0 C31316k kVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(C31076a.C31084h.month_navigation_fragment_toggle);
        materialButton.setTag(f75314I0);
        C18196h2.m82474B1(materialButton, new C31283f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(C31076a.C31084h.month_navigation_previous);
        materialButton2.setTag(f75312G0);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(C31076a.C31084h.month_navigation_next);
        materialButton3.setTag(f75313H0);
        this.f75327x = view.findViewById(C31076a.C31084h.mtrl_calendar_year_selector_frame);
        this.f75328y = view.findViewById(C31076a.C31084h.mtrl_calendar_day_selector_frame);
        mo89320e1(CalendarSelector.DAY);
        materialButton.setText(this.f75322e.mo89339M());
        this.f75326w.mo59613r(new C31284g(kVar, materialButton));
        materialButton.setOnClickListener(new C31285h());
        materialButton3.setOnClickListener(new C31286i(kVar));
        materialButton2.setOnClickListener(new C31287j(kVar));
    }

    @C0359n0
    /* renamed from: U0 */
    public final RecyclerView.C20075n mo89313U0() {
        return new C31282e();
    }

    @C0363p0
    /* renamed from: V0 */
    public CalendarConstraints mo89314V0() {
        return this.f75321d;
    }

    /* renamed from: W0 */
    public C31297b mo89315W0() {
        return this.f75324g;
    }

    @C0363p0
    /* renamed from: X0 */
    public Month mo89316X0() {
        return this.f75322e;
    }

    @C0359n0
    /* renamed from: a1 */
    public LinearLayoutManager mo89317a1() {
        return (LinearLayoutManager) this.f75326w.getLayoutManager();
    }

    /* renamed from: c1 */
    public final void mo89318c1(int i) {
        this.f75326w.post(new C31278a(i));
    }

    /* renamed from: d1 */
    public void mo89319d1(Month month) {
        boolean z;
        C31316k kVar = (C31316k) this.f75326w.getAdapter();
        int n = kVar.mo89456n(month);
        int n2 = n - kVar.mo89456n(this.f75322e);
        boolean z2 = true;
        if (Math.abs(n2) > 3) {
            z = true;
        } else {
            z = false;
        }
        if (n2 <= 0) {
            z2 = false;
        }
        this.f75322e = month;
        if (z && z2) {
            this.f75326w.mo59479G1(n - 3);
            mo89318c1(n);
        } else if (z) {
            this.f75326w.mo59479G1(n + 3);
            mo89318c1(n);
        } else {
            mo89318c1(n);
        }
    }

    /* renamed from: e1 */
    public void mo89320e1(CalendarSelector calendarSelector) {
        this.f75323f = calendarSelector;
        if (calendarSelector == CalendarSelector.YEAR) {
            this.f75325v.getLayoutManager().mo59385R1(((C31325q) this.f75325v.getAdapter()).mo89465m(this.f75322e.f75355c));
            this.f75327x.setVisibility(0);
            this.f75328y.setVisibility(8);
        } else if (calendarSelector == CalendarSelector.DAY) {
            this.f75327x.setVisibility(8);
            this.f75328y.setVisibility(0);
            mo89319d1(this.f75322e);
        }
    }

    /* renamed from: f1 */
    public void mo89321f1() {
        CalendarSelector calendarSelector = this.f75323f;
        CalendarSelector calendarSelector2 = CalendarSelector.YEAR;
        if (calendarSelector == calendarSelector2) {
            mo89320e1(CalendarSelector.DAY);
        } else if (calendarSelector == CalendarSelector.DAY) {
            mo89320e1(calendarSelector2);
        }
    }

    public void onCreate(@C0363p0 Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f75319b = bundle.getInt("THEME_RES_ID_KEY");
        this.f75320c = (DateSelector) bundle.getParcelable(f75315X);
        this.f75321d = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f75322e = (Month) bundle.getParcelable(f75317Z);
    }

    @C0359n0
    public View onCreateView(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, @C0363p0 Bundle bundle) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f75319b);
        this.f75324g = new C31297b(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month j = this.f75321d.mo89259j();
        if (C31303f.m126169i1(contextThemeWrapper)) {
            i2 = C31076a.C31087k.mtrl_calendar_vertical;
            i = 1;
        } else {
            i2 = C31076a.C31087k.mtrl_calendar_horizontal;
            i = 0;
        }
        View inflate = cloneInContext.inflate(i2, viewGroup, false);
        inflate.setMinimumHeight(m126044Z0(requireContext()));
        GridView gridView = (GridView) inflate.findViewById(C31076a.C31084h.mtrl_calendar_days_of_week);
        C18196h2.m82474B1(gridView, new C31279b());
        gridView.setAdapter(new C31302e());
        gridView.setNumColumns(j.f75356d);
        gridView.setEnabled(false);
        this.f75326w = (RecyclerView) inflate.findViewById(C31076a.C31084h.mtrl_calendar_months);
        this.f75326w.setLayoutManager(new C31280c(getContext(), i, false, i));
        this.f75326w.setTag(f75311F0);
        C31316k kVar = new C31316k(contextThemeWrapper, this.f75320c, this.f75321d, new C31281d());
        this.f75326w.setAdapter(kVar);
        int integer = contextThemeWrapper.getResources().getInteger(C31076a.C31085i.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C31076a.C31084h.mtrl_calendar_year_selector_frame);
        this.f75325v = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f75325v.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f75325v.setAdapter(new C31325q(this));
            this.f75325v.mo59589n(mo89313U0());
        }
        if (inflate.findViewById(C31076a.C31084h.month_navigation_fragment_toggle) != null) {
            mo89312T0(inflate, kVar);
        }
        if (!C31303f.m126169i1(contextThemeWrapper)) {
            new C20227z().mo60274b(this.f75326w);
        }
        this.f75326w.mo59479G1(kVar.mo89456n(this.f75322e));
        return inflate;
    }

    public void onSaveInstanceState(@C0359n0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f75319b);
        bundle.putParcelable(f75315X, this.f75320c);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f75321d);
        bundle.putParcelable(f75317Z, this.f75322e);
    }
}

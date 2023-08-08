package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.C0324b1;
import androidx.annotation.C0327c1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.C0507a;
import androidx.core.util.C17994n;
import androidx.core.view.C18019a;
import androidx.core.view.C18196h2;
import androidx.core.view.C18414x1;
import androidx.core.view.C18436z4;
import androidx.fragment.app.C19215c;
import androidx.fragment.app.C19234h0;
import com.google.android.material.C31076a;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.dialog.C31328a;
import com.google.android.material.internal.C31393e;
import com.google.android.material.internal.C31432x;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.resources.C31499b;
import com.google.android.material.shape.C31525j;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: com.google.android.material.datepicker.f */
public final class C31303f<S> extends C19215c {

    /* renamed from: L0 */
    public static final String f75407L0 = "OVERRIDE_THEME_RES_ID";

    /* renamed from: M0 */
    public static final String f75408M0 = "DATE_SELECTOR_KEY";

    /* renamed from: N0 */
    public static final String f75409N0 = "CALENDAR_CONSTRAINTS_KEY";

    /* renamed from: O0 */
    public static final String f75410O0 = "TITLE_TEXT_RES_ID_KEY";

    /* renamed from: P0 */
    public static final String f75411P0 = "TITLE_TEXT_KEY";

    /* renamed from: Q0 */
    public static final String f75412Q0 = "POSITIVE_BUTTON_TEXT_RES_ID_KEY";

    /* renamed from: R0 */
    public static final String f75413R0 = "POSITIVE_BUTTON_TEXT_KEY";

    /* renamed from: S0 */
    public static final String f75414S0 = "NEGATIVE_BUTTON_TEXT_RES_ID_KEY";

    /* renamed from: T0 */
    public static final String f75415T0 = "NEGATIVE_BUTTON_TEXT_KEY";

    /* renamed from: U0 */
    public static final String f75416U0 = "INPUT_MODE_KEY";

    /* renamed from: V0 */
    public static final Object f75417V0 = "CONFIRM_BUTTON_TAG";

    /* renamed from: W0 */
    public static final Object f75418W0 = "CANCEL_BUTTON_TAG";

    /* renamed from: X0 */
    public static final Object f75419X0 = "TOGGLE_BUTTON_TAG";

    /* renamed from: Y0 */
    public static final int f75420Y0 = 0;

    /* renamed from: Z0 */
    public static final int f75421Z0 = 1;
    @C0324b1

    /* renamed from: E0 */
    public int f75422E0;

    /* renamed from: F0 */
    public CharSequence f75423F0;

    /* renamed from: G0 */
    public TextView f75424G0;

    /* renamed from: H0 */
    public CheckableImageButton f75425H0;
    @C0363p0

    /* renamed from: I0 */
    public C31525j f75426I0;

    /* renamed from: J0 */
    public Button f75427J0;

    /* renamed from: K0 */
    public boolean f75428K0;

    /* renamed from: X */
    public int f75429X;
    @C0324b1

    /* renamed from: Y */
    public int f75430Y;

    /* renamed from: Z */
    public CharSequence f75431Z;

    /* renamed from: a */
    public final LinkedHashSet<C31311g<? super S>> f75432a = new LinkedHashSet<>();

    /* renamed from: b */
    public final LinkedHashSet<View.OnClickListener> f75433b = new LinkedHashSet<>();

    /* renamed from: c */
    public final LinkedHashSet<DialogInterface.OnCancelListener> f75434c = new LinkedHashSet<>();

    /* renamed from: d */
    public final LinkedHashSet<DialogInterface.OnDismissListener> f75435d = new LinkedHashSet<>();
    @C0327c1

    /* renamed from: e */
    public int f75436e;
    @C0363p0

    /* renamed from: f */
    public DateSelector<S> f75437f;

    /* renamed from: g */
    public C31320m<S> f75438g;
    @C0363p0

    /* renamed from: v */
    public CalendarConstraints f75439v;

    /* renamed from: w */
    public MaterialCalendar<S> f75440w;
    @C0324b1

    /* renamed from: x */
    public int f75441x;

    /* renamed from: y */
    public CharSequence f75442y;

    /* renamed from: z */
    public boolean f75443z;

    /* renamed from: com.google.android.material.datepicker.f$a */
    public class C31304a implements View.OnClickListener {
        public C31304a() {
        }

        public void onClick(View view) {
            Iterator it = C31303f.this.f75432a.iterator();
            while (it.hasNext()) {
                ((C31311g) it.next()).mo89433a(C31303f.this.mo89406f1());
            }
            C31303f.this.dismiss();
        }
    }

    /* renamed from: com.google.android.material.datepicker.f$b */
    public class C31305b implements View.OnClickListener {
        public C31305b() {
        }

        public void onClick(View view) {
            Iterator it = C31303f.this.f75433b.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            C31303f.this.dismiss();
        }
    }

    /* renamed from: com.google.android.material.datepicker.f$c */
    public class C31306c implements C18414x1 {

        /* renamed from: a */
        public final /* synthetic */ int f75446a;

        /* renamed from: b */
        public final /* synthetic */ View f75447b;

        /* renamed from: c */
        public final /* synthetic */ int f75448c;

        public C31306c(int i, View view, int i2) {
            this.f75446a = i;
            this.f75447b = view;
            this.f75448c = i2;
        }

        /* renamed from: a */
        public C18436z4 mo1193a(View view, C18436z4 z4Var) {
            int i = z4Var.mo53136f(C18436z4.C18449m.m83510i()).f45996b;
            if (this.f75446a >= 0) {
                this.f75447b.getLayoutParams().height = this.f75446a + i;
                View view2 = this.f75447b;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.f75447b;
            view3.setPadding(view3.getPaddingLeft(), this.f75448c + i, this.f75447b.getPaddingRight(), this.f75447b.getPaddingBottom());
            return z4Var;
        }
    }

    /* renamed from: com.google.android.material.datepicker.f$d */
    public class C31307d extends C31319l<S> {
        public C31307d() {
        }

        /* renamed from: a */
        public void mo89418a() {
            C31303f.this.f75427J0.setEnabled(false);
        }

        /* renamed from: b */
        public void mo89419b(S s) {
            C31303f.this.mo89414t1();
            C31303f.this.f75427J0.setEnabled(C31303f.this.mo89404c1().mo89292v3());
        }
    }

    /* renamed from: com.google.android.material.datepicker.f$e */
    public class C31308e implements View.OnClickListener {
        public C31308e() {
        }

        public void onClick(View view) {
            C31303f.this.f75427J0.setEnabled(C31303f.this.mo89404c1().mo89292v3());
            C31303f.this.f75425H0.toggle();
            C31303f fVar = C31303f.this;
            fVar.mo89415u1(fVar.f75425H0);
            C31303f.this.mo89413q1();
        }
    }

    /* renamed from: com.google.android.material.datepicker.f$f */
    public static final class C31309f<S> {

        /* renamed from: a */
        public final DateSelector<S> f75452a;

        /* renamed from: b */
        public int f75453b = 0;

        /* renamed from: c */
        public CalendarConstraints f75454c;

        /* renamed from: d */
        public int f75455d = 0;

        /* renamed from: e */
        public CharSequence f75456e = null;

        /* renamed from: f */
        public int f75457f = 0;

        /* renamed from: g */
        public CharSequence f75458g = null;

        /* renamed from: h */
        public int f75459h = 0;

        /* renamed from: i */
        public CharSequence f75460i = null;
        @C0363p0

        /* renamed from: j */
        public S f75461j = null;

        /* renamed from: k */
        public int f75462k = 0;

        public C31309f(DateSelector<S> dateSelector) {
            this.f75452a = dateSelector;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: c */
        public static <S> C31309f<S> m126199c(@C0359n0 DateSelector<S> dateSelector) {
            return new C31309f<>(dateSelector);
        }

        @C0359n0
        /* renamed from: d */
        public static C31309f<Long> m126200d() {
            return new C31309f<>(new SingleDateSelector());
        }

        @C0359n0
        /* renamed from: e */
        public static C31309f<C17994n<Long, Long>> m126201e() {
            return new C31309f<>(new RangeDateSelector());
        }

        /* renamed from: f */
        public static boolean m126202f(Month month, CalendarConstraints calendarConstraints) {
            if (month.compareTo(calendarConstraints.mo89259j()) < 0 || month.compareTo(calendarConstraints.mo89255g()) > 0) {
                return false;
            }
            return true;
        }

        @C0359n0
        /* renamed from: a */
        public C31303f<S> mo89421a() {
            if (this.f75454c == null) {
                this.f75454c = new CalendarConstraints.C31271b().mo89269a();
            }
            if (this.f75455d == 0) {
                this.f75455d = this.f75452a.mo89291n1();
            }
            S s = this.f75461j;
            if (s != null) {
                this.f75452a.mo89287F2(s);
            }
            if (this.f75454c.mo89258i() == null) {
                this.f75454c.mo89262m(mo89422b());
            }
            return C31303f.m126171k1(this);
        }

        /* renamed from: b */
        public final Month mo89422b() {
            if (!this.f75452a.mo89286C3().isEmpty()) {
                Month q = Month.m126073q(this.f75452a.mo89286C3().iterator().next().longValue());
                if (m126202f(q, this.f75454c)) {
                    return q;
                }
            }
            Month r = Month.m126074r();
            if (m126202f(r, this.f75454c)) {
                return r;
            }
            return this.f75454c.mo89259j();
        }

        @C0359n0
        /* renamed from: g */
        public C31309f<S> mo89423g(CalendarConstraints calendarConstraints) {
            this.f75454c = calendarConstraints;
            return this;
        }

        @C0359n0
        /* renamed from: h */
        public C31309f<S> mo89424h(int i) {
            this.f75462k = i;
            return this;
        }

        @C0359n0
        /* renamed from: i */
        public C31309f<S> mo89425i(@C0324b1 int i) {
            this.f75459h = i;
            this.f75460i = null;
            return this;
        }

        @C0359n0
        /* renamed from: j */
        public C31309f<S> mo89426j(@C0363p0 CharSequence charSequence) {
            this.f75460i = charSequence;
            this.f75459h = 0;
            return this;
        }

        @C0359n0
        /* renamed from: k */
        public C31309f<S> mo89427k(@C0324b1 int i) {
            this.f75457f = i;
            this.f75458g = null;
            return this;
        }

        @C0359n0
        /* renamed from: l */
        public C31309f<S> mo89428l(@C0363p0 CharSequence charSequence) {
            this.f75458g = charSequence;
            this.f75457f = 0;
            return this;
        }

        @C0359n0
        /* renamed from: m */
        public C31309f<S> mo89429m(S s) {
            this.f75461j = s;
            return this;
        }

        @C0359n0
        /* renamed from: n */
        public C31309f<S> mo89430n(@C0327c1 int i) {
            this.f75453b = i;
            return this;
        }

        @C0359n0
        /* renamed from: o */
        public C31309f<S> mo89431o(@C0324b1 int i) {
            this.f75455d = i;
            this.f75456e = null;
            return this;
        }

        @C0359n0
        /* renamed from: p */
        public C31309f<S> mo89432p(@C0363p0 CharSequence charSequence) {
            this.f75456e = charSequence;
            this.f75455d = 0;
            return this;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.datepicker.f$g */
    public @interface C31310g {
    }

    @C0359n0
    /* renamed from: a1 */
    public static Drawable m126167a1(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, C0507a.m2346b(context, C31076a.C31083g.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], C0507a.m2346b(context, C31076a.C31083g.material_ic_edit_black_24dp));
        return stateListDrawable;
    }

    /* renamed from: e1 */
    public static int m126168e1(@C0359n0 Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C31076a.C31082f.mtrl_calendar_content_padding);
        int i = Month.m126074r().f75356d;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(C31076a.C31082f.mtrl_calendar_day_width) * i) + ((i - 1) * resources.getDimensionPixelOffset(C31076a.C31082f.mtrl_calendar_month_horizontal_padding));
    }

    /* renamed from: i1 */
    public static boolean m126169i1(@C0359n0 Context context) {
        return m126172l1(context, 16843277);
    }

    /* renamed from: j1 */
    public static boolean m126170j1(@C0359n0 Context context) {
        return m126172l1(context, C31076a.C31079c.nestedScrollable);
    }

    @C0359n0
    /* renamed from: k1 */
    public static <S> C31303f<S> m126171k1(@C0359n0 C31309f<S> fVar) {
        C31303f<S> fVar2 = new C31303f<>();
        Bundle bundle = new Bundle();
        bundle.putInt(f75407L0, fVar.f75453b);
        bundle.putParcelable("DATE_SELECTOR_KEY", fVar.f75452a);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", fVar.f75454c);
        bundle.putInt(f75410O0, fVar.f75455d);
        bundle.putCharSequence(f75411P0, fVar.f75456e);
        bundle.putInt(f75416U0, fVar.f75462k);
        bundle.putInt(f75412Q0, fVar.f75457f);
        bundle.putCharSequence(f75413R0, fVar.f75458g);
        bundle.putInt(f75414S0, fVar.f75459h);
        bundle.putCharSequence(f75415T0, fVar.f75460i);
        fVar2.setArguments(bundle);
        return fVar2;
    }

    /* renamed from: l1 */
    public static boolean m126172l1(@C0359n0 Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C31499b.m127361g(context, C31076a.C31079c.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()), new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    /* renamed from: r1 */
    public static long m126173r1() {
        return Month.m126074r().f75358f;
    }

    /* renamed from: s1 */
    public static long m126174s1() {
        return C31324p.m126273t().getTimeInMillis();
    }

    /* renamed from: S0 */
    public boolean mo89395S0(DialogInterface.OnCancelListener onCancelListener) {
        return this.f75434c.add(onCancelListener);
    }

    /* renamed from: T0 */
    public boolean mo89396T0(DialogInterface.OnDismissListener onDismissListener) {
        return this.f75435d.add(onDismissListener);
    }

    /* renamed from: U0 */
    public boolean mo89397U0(View.OnClickListener onClickListener) {
        return this.f75433b.add(onClickListener);
    }

    /* renamed from: V0 */
    public boolean mo89398V0(C31311g<? super S> gVar) {
        return this.f75432a.add(gVar);
    }

    /* renamed from: W0 */
    public void mo89399W0() {
        this.f75434c.clear();
    }

    /* renamed from: X0 */
    public void mo89400X0() {
        this.f75435d.clear();
    }

    /* renamed from: Y0 */
    public void mo89401Y0() {
        this.f75433b.clear();
    }

    /* renamed from: Z0 */
    public void mo89402Z0() {
        this.f75432a.clear();
    }

    /* renamed from: b1 */
    public final void mo89403b1(Window window) {
        if (!this.f75428K0) {
            View findViewById = requireView().findViewById(C31076a.C31084h.fullscreen_header);
            C31393e.m126859b(window, true, C31432x.m127011f(findViewById), (Integer) null);
            C18196h2.m82559a2(findViewById, new C31306c(findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop()));
            this.f75428K0 = true;
        }
    }

    /* renamed from: c1 */
    public final DateSelector<S> mo89404c1() {
        if (this.f75437f == null) {
            this.f75437f = (DateSelector) getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f75437f;
    }

    /* renamed from: d1 */
    public String mo89405d1() {
        return mo89404c1().mo89293w2(getContext());
    }

    @C0363p0
    /* renamed from: f1 */
    public final S mo89406f1() {
        return mo89404c1().mo89288H3();
    }

    /* renamed from: g1 */
    public final int mo89407g1(Context context) {
        int i = this.f75436e;
        if (i != 0) {
            return i;
        }
        return mo89404c1().mo89285B1(context);
    }

    /* renamed from: h1 */
    public final void mo89408h1(Context context) {
        boolean z;
        this.f75425H0.setTag(f75419X0);
        this.f75425H0.setImageDrawable(m126167a1(context));
        CheckableImageButton checkableImageButton = this.f75425H0;
        if (this.f75429X != 0) {
            z = true;
        } else {
            z = false;
        }
        checkableImageButton.setChecked(z);
        C18196h2.m82474B1(this.f75425H0, (C18019a) null);
        mo89415u1(this.f75425H0);
        this.f75425H0.setOnClickListener(new C31308e());
    }

    /* renamed from: m1 */
    public boolean mo89409m1(DialogInterface.OnCancelListener onCancelListener) {
        return this.f75434c.remove(onCancelListener);
    }

    /* renamed from: n1 */
    public boolean mo89410n1(DialogInterface.OnDismissListener onDismissListener) {
        return this.f75435d.remove(onDismissListener);
    }

    /* renamed from: o1 */
    public boolean mo89411o1(View.OnClickListener onClickListener) {
        return this.f75433b.remove(onClickListener);
    }

    public final void onCancel(@C0359n0 DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f75434c.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    public final void onCreate(@C0363p0 Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f75436e = bundle.getInt(f75407L0);
        this.f75437f = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f75439v = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f75441x = bundle.getInt(f75410O0);
        this.f75442y = bundle.getCharSequence(f75411P0);
        this.f75429X = bundle.getInt(f75416U0);
        this.f75430Y = bundle.getInt(f75412Q0);
        this.f75431Z = bundle.getCharSequence(f75413R0);
        this.f75422E0 = bundle.getInt(f75414S0);
        this.f75423F0 = bundle.getCharSequence(f75415T0);
    }

    @C0359n0
    public final Dialog onCreateDialog(@C0363p0 Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), mo89407g1(requireContext()));
        Context context = dialog.getContext();
        this.f75443z = m126169i1(context);
        int g = C31499b.m127361g(context, C31076a.C31079c.colorSurface, C31303f.class.getCanonicalName());
        C31525j jVar = new C31525j(context, (AttributeSet) null, C31076a.C31079c.materialCalendarStyle, C31076a.C31090n.Widget_MaterialComponents_MaterialCalendar);
        this.f75426I0 = jVar;
        jVar.mo90750Z(context);
        this.f75426I0.mo90777o0(ColorStateList.valueOf(g));
        this.f75426I0.mo90775n0(C18196h2.m82529R(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @C0359n0
    public final View onCreateView(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, @C0363p0 Bundle bundle) {
        int i;
        if (this.f75443z) {
            i = C31076a.C31087k.mtrl_picker_fullscreen;
        } else {
            i = C31076a.C31087k.mtrl_picker_dialog;
        }
        View inflate = layoutInflater.inflate(i, viewGroup);
        Context context = inflate.getContext();
        if (this.f75443z) {
            inflate.findViewById(C31076a.C31084h.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(m126168e1(context), -2));
        } else {
            inflate.findViewById(C31076a.C31084h.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(m126168e1(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(C31076a.C31084h.mtrl_picker_header_selection_text);
        this.f75424G0 = textView;
        C18196h2.m82482D1(textView, 1);
        this.f75425H0 = (CheckableImageButton) inflate.findViewById(C31076a.C31084h.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) inflate.findViewById(C31076a.C31084h.mtrl_picker_title_text);
        CharSequence charSequence = this.f75442y;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.f75441x);
        }
        mo89408h1(context);
        this.f75427J0 = (Button) inflate.findViewById(C31076a.C31084h.confirm_button);
        if (mo89404c1().mo89292v3()) {
            this.f75427J0.setEnabled(true);
        } else {
            this.f75427J0.setEnabled(false);
        }
        this.f75427J0.setTag(f75417V0);
        CharSequence charSequence2 = this.f75431Z;
        if (charSequence2 != null) {
            this.f75427J0.setText(charSequence2);
        } else {
            int i2 = this.f75430Y;
            if (i2 != 0) {
                this.f75427J0.setText(i2);
            }
        }
        this.f75427J0.setOnClickListener(new C31304a());
        Button button = (Button) inflate.findViewById(C31076a.C31084h.cancel_button);
        button.setTag(f75418W0);
        CharSequence charSequence3 = this.f75423F0;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i3 = this.f75422E0;
            if (i3 != 0) {
                button.setText(i3);
            }
        }
        button.setOnClickListener(new C31305b());
        return inflate;
    }

    public final void onDismiss(@C0359n0 DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f75435d.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    public final void onSaveInstanceState(@C0359n0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(f75407L0, this.f75436e);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f75437f);
        CalendarConstraints.C31271b bVar = new CalendarConstraints.C31271b(this.f75439v);
        if (this.f75440w.mo89316X0() != null) {
            bVar.mo89271c(this.f75440w.mo89316X0().f75358f);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.mo89269a());
        bundle.putInt(f75410O0, this.f75441x);
        bundle.putCharSequence(f75411P0, this.f75442y);
        bundle.putInt(f75412Q0, this.f75430Y);
        bundle.putCharSequence(f75413R0, this.f75431Z);
        bundle.putInt(f75414S0, this.f75422E0);
        bundle.putCharSequence(f75415T0, this.f75423F0);
    }

    public void onStart() {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f75443z) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f75426I0);
            mo89403b1(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(C31076a.C31082f.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable(this.f75426I0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new C31328a(requireDialog(), rect));
        }
        mo89413q1();
    }

    public void onStop() {
        this.f75438g.mo89460J0();
        super.onStop();
    }

    /* renamed from: p1 */
    public boolean mo89412p1(C31311g<? super S> gVar) {
        return this.f75432a.remove(gVar);
    }

    /* renamed from: q1 */
    public final void mo89413q1() {
        C31320m<S> mVar;
        int g1 = mo89407g1(requireContext());
        this.f75440w = MaterialCalendar.m126045b1(mo89404c1(), g1, this.f75439v);
        if (this.f75425H0.isChecked()) {
            mVar = C31313i.m126216M0(mo89404c1(), g1, this.f75439v);
        } else {
            mVar = this.f75440w;
        }
        this.f75438g = mVar;
        mo89414t1();
        C19234h0 u = getChildFragmentManager().mo56909u();
        u.mo57201C(C31076a.C31084h.mtrl_calendar_frame, this.f75438g);
        u.mo57054s();
        this.f75438g.mo89310I0(new C31307d());
    }

    /* renamed from: t1 */
    public final void mo89414t1() {
        String d1 = mo89405d1();
        this.f75424G0.setContentDescription(String.format(getString(C31076a.C31089m.mtrl_picker_announce_current_selection), new Object[]{d1}));
        this.f75424G0.setText(d1);
    }

    /* renamed from: u1 */
    public final void mo89415u1(@C0359n0 CheckableImageButton checkableImageButton) {
        String str;
        if (this.f75425H0.isChecked()) {
            str = checkableImageButton.getContext().getString(C31076a.C31089m.mtrl_picker_toggle_to_calendar_input_mode);
        } else {
            str = checkableImageButton.getContext().getString(C31076a.C31089m.mtrl_picker_toggle_to_text_input_mode);
        }
        this.f75425H0.setContentDescription(str);
    }
}

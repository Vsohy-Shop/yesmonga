package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0327c1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import java.util.Iterator;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.google.android.material.datepicker.i */
public final class C31313i<S> extends C31320m<S> {

    /* renamed from: e */
    public static final String f75467e = "THEME_RES_ID_KEY";

    /* renamed from: f */
    public static final String f75468f = "DATE_SELECTOR_KEY";

    /* renamed from: g */
    public static final String f75469g = "CALENDAR_CONSTRAINTS_KEY";
    @C0327c1

    /* renamed from: b */
    public int f75470b;
    @C0363p0

    /* renamed from: c */
    public DateSelector<S> f75471c;
    @C0363p0

    /* renamed from: d */
    public CalendarConstraints f75472d;

    /* renamed from: com.google.android.material.datepicker.i$a */
    public class C31314a extends C31319l<S> {
        public C31314a() {
        }

        /* renamed from: a */
        public void mo89418a() {
            Iterator<C31319l<S>> it = C31313i.this.f75488a.iterator();
            while (it.hasNext()) {
                it.next().mo89418a();
            }
        }

        /* renamed from: b */
        public void mo89419b(S s) {
            Iterator<C31319l<S>> it = C31313i.this.f75488a.iterator();
            while (it.hasNext()) {
                it.next().mo89419b(s);
            }
        }
    }

    @C0359n0
    /* renamed from: M0 */
    public static <T> C31313i<T> m126216M0(DateSelector<T> dateSelector, @C0327c1 int i, @C0359n0 CalendarConstraints calendarConstraints) {
        C31313i<T> iVar = new C31313i<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("DATE_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        iVar.setArguments(bundle);
        return iVar;
    }

    @C0359n0
    /* renamed from: K0 */
    public DateSelector<S> mo89311K0() {
        DateSelector<S> dateSelector = this.f75471c;
        if (dateSelector != null) {
            return dateSelector;
        }
        throw new IllegalStateException("dateSelector should not be null. Use MaterialTextInputPicker#newInstance() to create this fragment with a DateSelector, and call this method after the fragment has been created.");
    }

    public void onCreate(@C0363p0 Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f75470b = bundle.getInt("THEME_RES_ID_KEY");
        this.f75471c = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f75472d = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @C0359n0
    public View onCreateView(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, @C0363p0 Bundle bundle) {
        return this.f75471c.mo89290g3(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f75470b)), viewGroup, bundle, this.f75472d, new C31314a());
    }

    public void onSaveInstanceState(@C0359n0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f75470b);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f75471c);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f75472d);
    }
}

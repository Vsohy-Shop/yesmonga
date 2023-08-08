package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.core.util.C17994n;
import androidx.core.util.C18001r;
import com.google.android.material.C31076a;
import com.google.android.material.internal.C31395g;
import com.google.android.material.internal.C31432x;
import com.google.android.material.resources.C31499b;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class RangeDateSelector implements DateSelector<C17994n<Long, Long>> {
    public static final Parcelable.Creator<RangeDateSelector> CREATOR = new C31293c();

    /* renamed from: a */
    public String f75360a;

    /* renamed from: b */
    public final String f75361b = " ";
    @C0363p0

    /* renamed from: c */
    public Long f75362c = null;
    @C0363p0

    /* renamed from: d */
    public Long f75363d = null;
    @C0363p0

    /* renamed from: e */
    public Long f75364e = null;
    @C0363p0

    /* renamed from: f */
    public Long f75365f = null;

    /* renamed from: com.google.android.material.datepicker.RangeDateSelector$a */
    public class C31291a extends C31298c {

        /* renamed from: v */
        public final /* synthetic */ TextInputLayout f75366v;

        /* renamed from: w */
        public final /* synthetic */ TextInputLayout f75367w;

        /* renamed from: x */
        public final /* synthetic */ C31319l f75368x;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31291a(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, C31319l lVar) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.f75366v = textInputLayout2;
            this.f75367w = textInputLayout3;
            this.f75368x = lVar;
        }

        /* renamed from: e */
        public void mo89364e() {
            Long unused = RangeDateSelector.this.f75364e = null;
            RangeDateSelector.this.mo89362k(this.f75366v, this.f75367w, this.f75368x);
        }

        /* renamed from: f */
        public void mo89365f(@C0363p0 Long l) {
            Long unused = RangeDateSelector.this.f75364e = l;
            RangeDateSelector.this.mo89362k(this.f75366v, this.f75367w, this.f75368x);
        }
    }

    /* renamed from: com.google.android.material.datepicker.RangeDateSelector$b */
    public class C31292b extends C31298c {

        /* renamed from: v */
        public final /* synthetic */ TextInputLayout f75370v;

        /* renamed from: w */
        public final /* synthetic */ TextInputLayout f75371w;

        /* renamed from: x */
        public final /* synthetic */ C31319l f75372x;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31292b(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, C31319l lVar) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.f75370v = textInputLayout2;
            this.f75371w = textInputLayout3;
            this.f75372x = lVar;
        }

        /* renamed from: e */
        public void mo89364e() {
            Long unused = RangeDateSelector.this.f75365f = null;
            RangeDateSelector.this.mo89362k(this.f75370v, this.f75371w, this.f75372x);
        }

        /* renamed from: f */
        public void mo89365f(@C0363p0 Long l) {
            Long unused = RangeDateSelector.this.f75365f = l;
            RangeDateSelector.this.mo89362k(this.f75370v, this.f75371w, this.f75372x);
        }
    }

    /* renamed from: com.google.android.material.datepicker.RangeDateSelector$c */
    public class C31293c implements Parcelable.Creator<RangeDateSelector> {
        @C0359n0
        /* renamed from: a */
        public RangeDateSelector createFromParcel(@C0359n0 Parcel parcel) {
            RangeDateSelector rangeDateSelector = new RangeDateSelector();
            Class<Long> cls = Long.class;
            Long unused = rangeDateSelector.f75362c = (Long) parcel.readValue(cls.getClassLoader());
            Long unused2 = rangeDateSelector.f75363d = (Long) parcel.readValue(cls.getClassLoader());
            return rangeDateSelector;
        }

        @C0359n0
        /* renamed from: b */
        public RangeDateSelector[] newArray(int i) {
            return new RangeDateSelector[i];
        }
    }

    @C0359n0
    /* renamed from: A2 */
    public Collection<C17994n<Long, Long>> mo89284A2() {
        if (this.f75362c == null || this.f75363d == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C17994n(this.f75362c, this.f75363d));
        return arrayList;
    }

    /* renamed from: B1 */
    public int mo89285B1(@C0359n0 Context context) {
        int i;
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(C31076a.C31082f.mtrl_calendar_maximum_default_fullscreen_minor_axis)) {
            i = C31076a.C31079c.materialCalendarTheme;
        } else {
            i = C31076a.C31079c.materialCalendarFullscreenTheme;
        }
        return C31499b.m127361g(context, i, C31303f.class.getCanonicalName());
    }

    @C0359n0
    /* renamed from: C3 */
    public Collection<Long> mo89286C3() {
        ArrayList arrayList = new ArrayList();
        Long l = this.f75362c;
        if (l != null) {
            arrayList.add(l);
        }
        Long l2 = this.f75363d;
        if (l2 != null) {
            arrayList.add(l2);
        }
        return arrayList;
    }

    /* renamed from: S3 */
    public void mo89289S3(long j) {
        Long l = this.f75362c;
        if (l == null) {
            this.f75362c = Long.valueOf(j);
        } else if (this.f75363d != null || !mo89359h(l.longValue(), j)) {
            this.f75363d = null;
            this.f75362c = Long.valueOf(j);
        } else {
            this.f75363d = Long.valueOf(j);
        }
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: f */
    public final void mo89357f(@C0359n0 TextInputLayout textInputLayout, @C0359n0 TextInputLayout textInputLayout2) {
        if (textInputLayout.getError() != null && this.f75360a.contentEquals(textInputLayout.getError())) {
            textInputLayout.setError((CharSequence) null);
        }
        if (textInputLayout2.getError() != null && " ".contentEquals(textInputLayout2.getError())) {
            textInputLayout2.setError((CharSequence) null);
        }
    }

    @C0359n0
    /* renamed from: g */
    public C17994n<Long, Long> mo89288H3() {
        return new C17994n<>(this.f75362c, this.f75363d);
    }

    /* renamed from: g3 */
    public View mo89290g3(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, @C0363p0 Bundle bundle, CalendarConstraints calendarConstraints, @C0359n0 C31319l<C17994n<Long, Long>> lVar) {
        View inflate = layoutInflater.inflate(C31076a.C31087k.mtrl_picker_text_input_date_range, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(C31076a.C31084h.mtrl_picker_text_input_range_start);
        TextInputLayout textInputLayout2 = (TextInputLayout) inflate.findViewById(C31076a.C31084h.mtrl_picker_text_input_range_end);
        EditText editText = textInputLayout.getEditText();
        EditText editText2 = textInputLayout2.getEditText();
        if (C31395g.m126863a()) {
            editText.setInputType(17);
            editText2.setInputType(17);
        }
        this.f75360a = inflate.getResources().getString(C31076a.C31089m.mtrl_picker_invalid_range);
        SimpleDateFormat p = C31324p.m126269p();
        Long l = this.f75362c;
        if (l != null) {
            editText.setText(p.format(l));
            this.f75364e = this.f75362c;
        }
        Long l2 = this.f75363d;
        if (l2 != null) {
            editText2.setText(p.format(l2));
            this.f75365f = this.f75363d;
        }
        String q = C31324p.m126270q(inflate.getResources(), p);
        textInputLayout.setPlaceholderText(q);
        textInputLayout2.setPlaceholderText(q);
        SimpleDateFormat simpleDateFormat = p;
        CalendarConstraints calendarConstraints2 = calendarConstraints;
        TextInputLayout textInputLayout3 = textInputLayout;
        C31291a aVar = r0;
        TextInputLayout textInputLayout4 = textInputLayout2;
        String str = q;
        C31319l<C17994n<Long, Long>> lVar2 = lVar;
        C31291a aVar2 = new C31291a(q, simpleDateFormat, textInputLayout, calendarConstraints2, textInputLayout3, textInputLayout4, lVar2);
        editText.addTextChangedListener(aVar);
        editText2.addTextChangedListener(new C31292b(str, simpleDateFormat, textInputLayout2, calendarConstraints2, textInputLayout3, textInputLayout4, lVar2));
        C31432x.m127021p(editText);
        return inflate;
    }

    /* renamed from: h */
    public final boolean mo89359h(long j, long j2) {
        return j <= j2;
    }

    /* renamed from: i */
    public final void mo89360i(@C0359n0 TextInputLayout textInputLayout, @C0359n0 TextInputLayout textInputLayout2) {
        textInputLayout.setError(this.f75360a);
        textInputLayout2.setError(" ");
    }

    /* renamed from: j */
    public void mo89287F2(@C0359n0 C17994n<Long, Long> nVar) {
        Long l;
        F f = nVar.f46482a;
        if (!(f == null || nVar.f46483b == null)) {
            C18001r.m81764a(mo89359h(((Long) f).longValue(), ((Long) nVar.f46483b).longValue()));
        }
        F f2 = nVar.f46482a;
        Long l2 = null;
        if (f2 == null) {
            l = null;
        } else {
            l = Long.valueOf(C31324p.m126254a(((Long) f2).longValue()));
        }
        this.f75362c = l;
        S s = nVar.f46483b;
        if (s != null) {
            l2 = Long.valueOf(C31324p.m126254a(((Long) s).longValue()));
        }
        this.f75363d = l2;
    }

    /* renamed from: k */
    public final void mo89362k(@C0359n0 TextInputLayout textInputLayout, @C0359n0 TextInputLayout textInputLayout2, @C0359n0 C31319l<C17994n<Long, Long>> lVar) {
        Long l = this.f75364e;
        if (l == null || this.f75365f == null) {
            mo89357f(textInputLayout, textInputLayout2);
            lVar.mo89418a();
        } else if (mo89359h(l.longValue(), this.f75365f.longValue())) {
            this.f75362c = this.f75364e;
            this.f75363d = this.f75365f;
            lVar.mo89419b(mo89288H3());
        } else {
            mo89360i(textInputLayout, textInputLayout2);
            lVar.mo89418a();
        }
    }

    /* renamed from: n1 */
    public int mo89291n1() {
        return C31076a.C31089m.mtrl_picker_range_header_title;
    }

    /* renamed from: v3 */
    public boolean mo89292v3() {
        Long l = this.f75362c;
        if (l == null || this.f75363d == null || !mo89359h(l.longValue(), this.f75363d.longValue())) {
            return false;
        }
        return true;
    }

    @C0359n0
    /* renamed from: w2 */
    public String mo89293w2(@C0359n0 Context context) {
        Resources resources = context.getResources();
        Long l = this.f75362c;
        if (l == null && this.f75363d == null) {
            return resources.getString(C31076a.C31089m.mtrl_picker_range_header_unselected);
        }
        Long l2 = this.f75363d;
        if (l2 == null) {
            return resources.getString(C31076a.C31089m.mtrl_picker_range_header_only_start_selected, new Object[]{C31301d.m126146c(l.longValue())});
        } else if (l == null) {
            return resources.getString(C31076a.C31089m.mtrl_picker_range_header_only_end_selected, new Object[]{C31301d.m126146c(l2.longValue())});
        } else {
            C17994n<String, String> a = C31301d.m126144a(l, l2);
            return resources.getString(C31076a.C31089m.mtrl_picker_range_header_selected, new Object[]{a.f46482a, a.f46483b});
        }
    }

    public void writeToParcel(@C0359n0 Parcel parcel, int i) {
        parcel.writeValue(this.f75362c);
        parcel.writeValue(this.f75363d);
    }
}

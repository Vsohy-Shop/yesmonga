package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.core.util.C17994n;
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
public class SingleDateSelector implements DateSelector<Long> {
    public static final Parcelable.Creator<SingleDateSelector> CREATOR = new C31295b();
    @C0363p0

    /* renamed from: a */
    public Long f75374a;

    /* renamed from: com.google.android.material.datepicker.SingleDateSelector$a */
    public class C31294a extends C31298c {

        /* renamed from: v */
        public final /* synthetic */ C31319l f75375v;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31294a(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, C31319l lVar) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.f75375v = lVar;
        }

        /* renamed from: e */
        public void mo89364e() {
            this.f75375v.mo89418a();
        }

        /* renamed from: f */
        public void mo89365f(@C0363p0 Long l) {
            if (l == null) {
                SingleDateSelector.this.mo89370c();
            } else {
                SingleDateSelector.this.mo89289S3(l.longValue());
            }
            this.f75375v.mo89419b(SingleDateSelector.this.mo89288H3());
        }
    }

    /* renamed from: com.google.android.material.datepicker.SingleDateSelector$b */
    public class C31295b implements Parcelable.Creator<SingleDateSelector> {
        @C0359n0
        /* renamed from: a */
        public SingleDateSelector createFromParcel(@C0359n0 Parcel parcel) {
            SingleDateSelector singleDateSelector = new SingleDateSelector();
            Long unused = singleDateSelector.f75374a = (Long) parcel.readValue(Long.class.getClassLoader());
            return singleDateSelector;
        }

        @C0359n0
        /* renamed from: b */
        public SingleDateSelector[] newArray(int i) {
            return new SingleDateSelector[i];
        }
    }

    @C0359n0
    /* renamed from: A2 */
    public Collection<C17994n<Long, Long>> mo89284A2() {
        return new ArrayList();
    }

    /* renamed from: B1 */
    public int mo89285B1(Context context) {
        return C31499b.m127361g(context, C31076a.C31079c.materialCalendarTheme, C31303f.class.getCanonicalName());
    }

    @C0359n0
    /* renamed from: C3 */
    public Collection<Long> mo89286C3() {
        ArrayList arrayList = new ArrayList();
        Long l = this.f75374a;
        if (l != null) {
            arrayList.add(l);
        }
        return arrayList;
    }

    /* renamed from: S3 */
    public void mo89289S3(long j) {
        this.f75374a = Long.valueOf(j);
    }

    /* renamed from: c */
    public final void mo89370c() {
        this.f75374a = null;
    }

    @C0363p0
    /* renamed from: d */
    public Long mo89288H3() {
        return this.f75374a;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public void mo89287F2(@C0363p0 Long l) {
        this.f75374a = l == null ? null : Long.valueOf(C31324p.m126254a(l.longValue()));
    }

    /* renamed from: g3 */
    public View mo89290g3(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, @C0363p0 Bundle bundle, CalendarConstraints calendarConstraints, @C0359n0 C31319l<Long> lVar) {
        View inflate = layoutInflater.inflate(C31076a.C31087k.mtrl_picker_text_input_date, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(C31076a.C31084h.mtrl_picker_text_input_date);
        EditText editText = textInputLayout.getEditText();
        if (C31395g.m126863a()) {
            editText.setInputType(17);
        }
        SimpleDateFormat p = C31324p.m126269p();
        String q = C31324p.m126270q(inflate.getResources(), p);
        textInputLayout.setPlaceholderText(q);
        Long l = this.f75374a;
        if (l != null) {
            editText.setText(p.format(l));
        }
        editText.addTextChangedListener(new C31294a(q, p, textInputLayout, calendarConstraints, lVar));
        C31432x.m127021p(editText);
        return inflate;
    }

    /* renamed from: n1 */
    public int mo89291n1() {
        return C31076a.C31089m.mtrl_picker_date_header_title;
    }

    /* renamed from: v3 */
    public boolean mo89292v3() {
        return this.f75374a != null;
    }

    @C0359n0
    /* renamed from: w2 */
    public String mo89293w2(@C0359n0 Context context) {
        Resources resources = context.getResources();
        Long l = this.f75374a;
        if (l == null) {
            return resources.getString(C31076a.C31089m.mtrl_picker_date_header_unselected);
        }
        String j = C31301d.m126153j(l.longValue());
        return resources.getString(C31076a.C31089m.mtrl_picker_date_header_selected, new Object[]{j});
    }

    public void writeToParcel(@C0359n0 Parcel parcel, int i) {
        parcel.writeValue(this.f75374a);
    }
}

package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.core.view.C18196h2;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.C31076a;
import com.google.android.material.datepicker.MaterialCalendar;

/* renamed from: com.google.android.material.datepicker.k */
public class C31316k extends RecyclerView.Adapter<C31318b> {
    @C0359n0

    /* renamed from: a */
    public final CalendarConstraints f75480a;

    /* renamed from: b */
    public final DateSelector<?> f75481b;

    /* renamed from: c */
    public final MaterialCalendar.C31288k f75482c;

    /* renamed from: d */
    public final int f75483d;

    /* renamed from: com.google.android.material.datepicker.k$a */
    public class C31317a implements AdapterView.OnItemClickListener {

        /* renamed from: a */
        public final /* synthetic */ MaterialCalendarGridView f75484a;

        public C31317a(MaterialCalendarGridView materialCalendarGridView) {
            this.f75484a = materialCalendarGridView;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (this.f75484a.getAdapter().mo89453n(i)) {
                C31316k.this.f75482c.mo89323a(this.f75484a.getAdapter().getItem(i).longValue());
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.k$b */
    public static class C31318b extends RecyclerView.C20061e0 {

        /* renamed from: a */
        public final TextView f75486a;

        /* renamed from: b */
        public final MaterialCalendarGridView f75487b;

        public C31318b(@C0359n0 LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(C31076a.C31084h.month_title);
            this.f75486a = textView;
            C18196h2.m82478C1(textView, true);
            this.f75487b = (MaterialCalendarGridView) linearLayout.findViewById(C31076a.C31084h.month_grid);
            if (!z) {
                textView.setVisibility(8);
            }
        }
    }

    public C31316k(@C0359n0 Context context, DateSelector<?> dateSelector, @C0359n0 CalendarConstraints calendarConstraints, MaterialCalendar.C31288k kVar) {
        int i;
        Month j = calendarConstraints.mo89259j();
        Month g = calendarConstraints.mo89255g();
        Month i2 = calendarConstraints.mo89258i();
        if (j.compareTo(i2) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (i2.compareTo(g) <= 0) {
            int Y0 = C31315j.f75474f * MaterialCalendar.m126043Y0(context);
            if (C31303f.m126169i1(context)) {
                i = MaterialCalendar.m126043Y0(context);
            } else {
                i = 0;
            }
            this.f75483d = Y0 + i;
            this.f75480a = calendarConstraints;
            this.f75481b = dateSelector;
            this.f75482c = kVar;
            setHasStableIds(true);
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    public int getItemCount() {
        return this.f75480a.mo89256h();
    }

    public long getItemId(int i) {
        return this.f75480a.mo89259j().mo89341W(i).mo89340Q();
    }

    @C0359n0
    /* renamed from: l */
    public Month mo89454l(int i) {
        return this.f75480a.mo89259j().mo89341W(i);
    }

    @C0359n0
    /* renamed from: m */
    public CharSequence mo89455m(int i) {
        return mo89454l(i).mo89339M();
    }

    /* renamed from: n */
    public int mo89456n(@C0359n0 Month month) {
        return this.f75480a.mo89259j().mo89342X(month);
    }

    /* renamed from: o */
    public void onBindViewHolder(@C0359n0 C31318b bVar, int i) {
        Month W = this.f75480a.mo89259j().mo89341W(i);
        bVar.f75486a.setText(W.mo89339M());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f75487b.findViewById(C31076a.C31084h.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !W.equals(materialCalendarGridView.getAdapter().f75475a)) {
            C31315j jVar = new C31315j(W, this.f75481b, this.f75480a);
            materialCalendarGridView.setNumColumns(W.f75356d);
            materialCalendarGridView.setAdapter((ListAdapter) jVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().mo89452m(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new C31317a(materialCalendarGridView));
    }

    @C0359n0
    /* renamed from: p */
    public C31318b onCreateViewHolder(@C0359n0 ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C31076a.C31087k.mtrl_calendar_month_labeled, viewGroup, false);
        if (!C31303f.m126169i1(viewGroup.getContext())) {
            return new C31318b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.C20081p(-1, this.f75483d));
        return new C31318b(linearLayout, true);
    }
}

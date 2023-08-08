package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.C31076a;
import com.google.android.material.datepicker.MaterialCalendar;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: com.google.android.material.datepicker.q */
public class C31325q extends RecyclerView.Adapter<C31327b> {

    /* renamed from: a */
    public final MaterialCalendar<?> f75496a;

    /* renamed from: com.google.android.material.datepicker.q$a */
    public class C31326a implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ int f75497a;

        public C31326a(int i) {
            this.f75497a = i;
        }

        public void onClick(View view) {
            C31325q.this.f75496a.mo89319d1(C31325q.this.f75496a.mo89314V0().mo89252e(Month.m126072g(this.f75497a, C31325q.this.f75496a.mo89316X0().f75354b)));
            C31325q.this.f75496a.mo89320e1(MaterialCalendar.CalendarSelector.DAY);
        }
    }

    /* renamed from: com.google.android.material.datepicker.q$b */
    public static class C31327b extends RecyclerView.C20061e0 {

        /* renamed from: a */
        public final TextView f75499a;

        public C31327b(TextView textView) {
            super(textView);
            this.f75499a = textView;
        }
    }

    public C31325q(MaterialCalendar<?> materialCalendar) {
        this.f75496a = materialCalendar;
    }

    public int getItemCount() {
        return this.f75496a.mo89314V0().mo89260k();
    }

    @C0359n0
    /* renamed from: l */
    public final View.OnClickListener mo89464l(int i) {
        return new C31326a(i);
    }

    /* renamed from: m */
    public int mo89465m(int i) {
        return i - this.f75496a.mo89314V0().mo89259j().f75355c;
    }

    /* renamed from: n */
    public int mo89466n(int i) {
        return this.f75496a.mo89314V0().mo89259j().f75355c + i;
    }

    /* renamed from: o */
    public void onBindViewHolder(@C0359n0 C31327b bVar, int i) {
        C31296a aVar;
        int n = mo89466n(i);
        String string = bVar.f75499a.getContext().getString(C31076a.C31089m.mtrl_picker_navigate_to_year_description);
        bVar.f75499a.setText(String.format(Locale.getDefault(), TimeModel.f77117w, new Object[]{Integer.valueOf(n)}));
        bVar.f75499a.setContentDescription(String.format(string, new Object[]{Integer.valueOf(n)}));
        C31297b W0 = this.f75496a.mo89315W0();
        Calendar t = C31324p.m126273t();
        if (t.get(1) == n) {
            aVar = W0.f75388f;
        } else {
            aVar = W0.f75386d;
        }
        for (Long longValue : this.f75496a.mo89311K0().mo89286C3()) {
            t.setTimeInMillis(longValue.longValue());
            if (t.get(1) == n) {
                aVar = W0.f75387e;
            }
        }
        aVar.mo89383f(bVar.f75499a);
        bVar.f75499a.setOnClickListener(mo89464l(n));
    }

    @C0359n0
    /* renamed from: p */
    public C31327b onCreateViewHolder(@C0359n0 ViewGroup viewGroup, int i) {
        return new C31327b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C31076a.C31087k.mtrl_calendar_year, viewGroup, false));
    }
}

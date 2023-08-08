package androidx.cursoradapter.widget;

import android.database.Cursor;
import android.widget.Filter;

/* renamed from: androidx.cursoradapter.widget.b */
public class C18520b extends Filter {

    /* renamed from: a */
    public C18521a f47304a;

    /* renamed from: androidx.cursoradapter.widget.b$a */
    public interface C18521a {
        /* renamed from: a */
        CharSequence mo3281a(Cursor cursor);

        /* renamed from: b */
        void mo3282b(Cursor cursor);

        /* renamed from: c */
        Cursor mo3283c(CharSequence charSequence);

        /* renamed from: d */
        Cursor mo53383d();
    }

    public C18520b(C18521a aVar) {
        this.f47304a = aVar;
    }

    public CharSequence convertResultToString(Object obj) {
        return this.f47304a.mo3281a((Cursor) obj);
    }

    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor c = this.f47304a.mo3283c(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (c != null) {
            filterResults.count = c.getCount();
            filterResults.values = c;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor d = this.f47304a.mo53383d();
        Object obj = filterResults.values;
        if (obj != null && obj != d) {
            this.f47304a.mo3282b((Cursor) obj);
        }
    }
}

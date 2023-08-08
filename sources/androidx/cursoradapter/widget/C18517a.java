package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;
import androidx.annotation.RestrictTo;
import androidx.cursoradapter.widget.C18520b;

/* renamed from: androidx.cursoradapter.widget.a */
public abstract class C18517a extends BaseAdapter implements Filterable, C18520b.C18521a {
    @Deprecated

    /* renamed from: x */
    public static final int f47291x = 1;

    /* renamed from: y */
    public static final int f47292y = 2;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: a */
    public boolean f47293a;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: b */
    public boolean f47294b;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: c */
    public Cursor f47295c;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: d */
    public Context f47296d;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: e */
    public int f47297e;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: f */
    public C18518a f47298f;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: g */
    public DataSetObserver f47299g;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: v */
    public C18520b f47300v;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: w */
    public FilterQueryProvider f47301w;

    /* renamed from: androidx.cursoradapter.widget.a$a */
    public class C18518a extends ContentObserver {
        public C18518a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            C18517a.this.mo53392k();
        }
    }

    /* renamed from: androidx.cursoradapter.widget.a$b */
    public class C18519b extends DataSetObserver {
        public C18519b() {
        }

        public void onChanged() {
            C18517a aVar = C18517a.this;
            aVar.f47293a = true;
            aVar.notifyDataSetChanged();
        }

        public void onInvalidated() {
            C18517a aVar = C18517a.this;
            aVar.f47293a = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    @Deprecated
    public C18517a(Context context, Cursor cursor) {
        mo53385g(context, cursor, 1);
    }

    /* renamed from: a */
    public CharSequence mo3281a(Cursor cursor) {
        if (cursor == null) {
            return "";
        }
        return cursor.toString();
    }

    /* renamed from: b */
    public void mo3282b(Cursor cursor) {
        Cursor m = mo53394m(cursor);
        if (m != null) {
            m.close();
        }
    }

    /* renamed from: c */
    public Cursor mo3283c(CharSequence charSequence) {
        FilterQueryProvider filterQueryProvider = this.f47301w;
        if (filterQueryProvider != null) {
            return filterQueryProvider.runQuery(charSequence);
        }
        return this.f47295c;
    }

    /* renamed from: d */
    public Cursor mo53383d() {
        return this.f47295c;
    }

    /* renamed from: e */
    public abstract void mo3284e(View view, Context context, Cursor cursor);

    /* renamed from: f */
    public FilterQueryProvider mo53384f() {
        return this.f47301w;
    }

    /* renamed from: g */
    public void mo53385g(Context context, Cursor cursor, int i) {
        int i2;
        boolean z = false;
        if ((i & 1) == 1) {
            i |= 2;
            this.f47294b = true;
        } else {
            this.f47294b = false;
        }
        if (cursor != null) {
            z = true;
        }
        this.f47295c = cursor;
        this.f47293a = z;
        this.f47296d = context;
        if (z) {
            i2 = cursor.getColumnIndexOrThrow("_id");
        } else {
            i2 = -1;
        }
        this.f47297e = i2;
        if ((i & 2) == 2) {
            this.f47298f = new C18518a();
            this.f47299g = new C18519b();
        } else {
            this.f47298f = null;
            this.f47299g = null;
        }
        if (z) {
            C18518a aVar = this.f47298f;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f47299g;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public int getCount() {
        Cursor cursor;
        if (!this.f47293a || (cursor = this.f47295c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f47293a) {
            return null;
        }
        this.f47295c.moveToPosition(i);
        if (view == null) {
            view = mo53391i(this.f47296d, this.f47295c, viewGroup);
        }
        mo3284e(view, this.f47296d, this.f47295c);
        return view;
    }

    public Filter getFilter() {
        if (this.f47300v == null) {
            this.f47300v = new C18520b(this);
        }
        return this.f47300v;
    }

    public Object getItem(int i) {
        Cursor cursor;
        if (!this.f47293a || (cursor = this.f47295c) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f47295c;
    }

    public long getItemId(int i) {
        Cursor cursor;
        if (!this.f47293a || (cursor = this.f47295c) == null || !cursor.moveToPosition(i)) {
            return 0;
        }
        return this.f47295c.getLong(this.f47297e);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f47293a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f47295c.moveToPosition(i)) {
            if (view == null) {
                view = mo3288j(this.f47296d, this.f47295c, viewGroup);
            }
            mo3284e(view, this.f47296d, this.f47295c);
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
    }

    @Deprecated
    /* renamed from: h */
    public void mo53390h(Context context, Cursor cursor, boolean z) {
        mo53385g(context, cursor, z ? 1 : 2);
    }

    public boolean hasStableIds() {
        return true;
    }

    /* renamed from: i */
    public View mo53391i(Context context, Cursor cursor, ViewGroup viewGroup) {
        return mo3288j(context, cursor, viewGroup);
    }

    /* renamed from: j */
    public abstract View mo3288j(Context context, Cursor cursor, ViewGroup viewGroup);

    /* renamed from: k */
    public void mo53392k() {
        Cursor cursor;
        if (this.f47294b && (cursor = this.f47295c) != null && !cursor.isClosed()) {
            this.f47293a = this.f47295c.requery();
        }
    }

    /* renamed from: l */
    public void mo53393l(FilterQueryProvider filterQueryProvider) {
        this.f47301w = filterQueryProvider;
    }

    /* renamed from: m */
    public Cursor mo53394m(Cursor cursor) {
        Cursor cursor2 = this.f47295c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C18518a aVar = this.f47298f;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f47299g;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f47295c = cursor;
        if (cursor != null) {
            C18518a aVar2 = this.f47298f;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.f47299g;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f47297e = cursor.getColumnIndexOrThrow("_id");
            this.f47293a = true;
            notifyDataSetChanged();
        } else {
            this.f47297e = -1;
            this.f47293a = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }

    public C18517a(Context context, Cursor cursor, boolean z) {
        mo53385g(context, cursor, z ? 1 : 2);
    }

    public C18517a(Context context, Cursor cursor, int i) {
        mo53385g(context, cursor, i);
    }
}

package com.urbanairship.messagecenter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.urbanairship.messagecenter.x */
public abstract class C9400x extends BaseAdapter {

    /* renamed from: a */
    public final List<C9371g> f25712a = new ArrayList();

    /* renamed from: b */
    public final Context f25713b;

    /* renamed from: c */
    public final int f25714c;

    public C9400x(@C0359n0 Context context, int i) {
        this.f25713b = context;
        this.f25714c = i;
    }

    /* renamed from: a */
    public abstract void mo19074a(@C0359n0 View view, @C0359n0 C9371g gVar, int i);

    @C0359n0
    /* renamed from: b */
    public Context mo19080b() {
        return this.f25713b;
    }

    /* renamed from: c */
    public void mo19081c(@C0359n0 Collection<C9371g> collection) {
        synchronized (this.f25712a) {
            this.f25712a.clear();
            this.f25712a.addAll(collection);
        }
        notifyDataSetChanged();
    }

    public int getCount() {
        return this.f25712a.size();
    }

    @C0363p0
    public Object getItem(int i) {
        if (i >= this.f25712a.size() || i < 0) {
            return null;
        }
        return this.f25712a.get(i);
    }

    public long getItemId(int i) {
        if (i >= this.f25712a.size() || i < 0) {
            return -1;
        }
        return (long) this.f25712a.get(i).mo18977W().hashCode();
    }

    @C0359n0
    public View getView(int i, @C0363p0 View view, @C0363p0 ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.f25713b).inflate(this.f25714c, viewGroup, false);
        }
        if (i < this.f25712a.size() && i >= 0) {
            mo19074a(view, this.f25712a.get(i), i);
        }
        return view;
    }

    public boolean hasStableIds() {
        return true;
    }
}

package androidx.viewpager.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;

/* renamed from: androidx.viewpager.widget.a */
public abstract class C20784a {

    /* renamed from: c */
    public static final int f53774c = -1;

    /* renamed from: d */
    public static final int f53775d = -2;

    /* renamed from: a */
    public final DataSetObservable f53776a = new DataSetObservable();

    /* renamed from: b */
    public DataSetObserver f53777b;

    @Deprecated
    /* renamed from: a */
    public void mo62407a(@C0359n0 View view, int i, @C0359n0 Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    /* renamed from: b */
    public void mo21372b(@C0359n0 ViewGroup viewGroup, int i, @C0359n0 Object obj) {
        mo62407a(viewGroup, i, obj);
    }

    @Deprecated
    /* renamed from: c */
    public void mo62408c(@C0359n0 View view) {
    }

    /* renamed from: d */
    public void mo57088d(@C0359n0 ViewGroup viewGroup) {
        mo62408c(viewGroup);
    }

    /* renamed from: e */
    public abstract int mo21373e();

    /* renamed from: f */
    public int mo62409f(@C0359n0 Object obj) {
        return -1;
    }

    @C0363p0
    /* renamed from: g */
    public CharSequence mo62410g(int i) {
        return null;
    }

    /* renamed from: h */
    public float mo62411h(int i) {
        return 1.0f;
    }

    @C0359n0
    @Deprecated
    /* renamed from: i */
    public Object mo62412i(@C0359n0 View view, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    @C0359n0
    /* renamed from: j */
    public Object mo21374j(@C0359n0 ViewGroup viewGroup, int i) {
        return mo62412i(viewGroup, i);
    }

    /* renamed from: k */
    public abstract boolean mo21375k(@C0359n0 View view, @C0359n0 Object obj);

    /* renamed from: l */
    public void mo62413l() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.f53777b;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.f53776a.notifyChanged();
    }

    /* renamed from: m */
    public void mo62414m(@C0359n0 DataSetObserver dataSetObserver) {
        this.f53776a.registerObserver(dataSetObserver);
    }

    /* renamed from: n */
    public void mo57089n(@C0363p0 Parcelable parcelable, @C0363p0 ClassLoader classLoader) {
    }

    @C0363p0
    /* renamed from: o */
    public Parcelable mo57090o() {
        return null;
    }

    @Deprecated
    /* renamed from: p */
    public void mo62415p(@C0359n0 View view, int i, @C0359n0 Object obj) {
    }

    /* renamed from: q */
    public void mo57091q(@C0359n0 ViewGroup viewGroup, int i, @C0359n0 Object obj) {
        mo62415p(viewGroup, i, obj);
    }

    /* renamed from: r */
    public void mo62416r(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f53777b = dataSetObserver;
        }
    }

    @Deprecated
    /* renamed from: s */
    public void mo62417s(@C0359n0 View view) {
    }

    /* renamed from: t */
    public void mo57092t(@C0359n0 ViewGroup viewGroup) {
        mo62417s(viewGroup);
    }

    /* renamed from: u */
    public void mo62418u(@C0359n0 DataSetObserver dataSetObserver) {
        this.f53776a.unregisterObserver(dataSetObserver);
    }
}

package androidx.recyclerview.widget;

import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.annotation.C0359n0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.l0 */
public interface C20180l0 {

    /* renamed from: androidx.recyclerview.widget.l0$a */
    public static class C20181a implements C20180l0 {

        /* renamed from: a */
        public SparseArray<C20219w> f52021a = new SparseArray<>();

        /* renamed from: b */
        public int f52022b = 0;

        /* renamed from: androidx.recyclerview.widget.l0$a$a */
        public class C20182a implements C20185c {

            /* renamed from: a */
            public SparseIntArray f52023a = new SparseIntArray(1);

            /* renamed from: b */
            public SparseIntArray f52024b = new SparseIntArray(1);

            /* renamed from: c */
            public final C20219w f52025c;

            public C20182a(C20219w wVar) {
                this.f52025c = wVar;
            }

            /* renamed from: a */
            public int mo60549a(int i) {
                int indexOfKey = this.f52024b.indexOfKey(i);
                if (indexOfKey >= 0) {
                    return this.f52024b.valueAt(indexOfKey);
                }
                throw new IllegalStateException("requested global type " + i + " does not belong to the adapter:" + this.f52025c.f52200c);
            }

            /* renamed from: b */
            public int mo60550b(int i) {
                int indexOfKey = this.f52023a.indexOfKey(i);
                if (indexOfKey > -1) {
                    return this.f52023a.valueAt(indexOfKey);
                }
                int c = C20181a.this.mo60547c(this.f52025c);
                this.f52023a.put(i, c);
                this.f52024b.put(c, i);
                return c;
            }

            /* renamed from: g */
            public void mo60551g() {
                C20181a.this.mo60548d(this.f52025c);
            }
        }

        @C0359n0
        /* renamed from: a */
        public C20219w mo60545a(int i) {
            C20219w wVar = this.f52021a.get(i);
            if (wVar != null) {
                return wVar;
            }
            throw new IllegalArgumentException("Cannot find the wrapper for global view type " + i);
        }

        @C0359n0
        /* renamed from: b */
        public C20185c mo60546b(@C0359n0 C20219w wVar) {
            return new C20182a(wVar);
        }

        /* renamed from: c */
        public int mo60547c(C20219w wVar) {
            int i = this.f52022b;
            this.f52022b = i + 1;
            this.f52021a.put(i, wVar);
            return i;
        }

        /* renamed from: d */
        public void mo60548d(@C0359n0 C20219w wVar) {
            for (int size = this.f52021a.size() - 1; size >= 0; size--) {
                if (this.f52021a.valueAt(size) == wVar) {
                    this.f52021a.removeAt(size);
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.l0$b */
    public static class C20183b implements C20180l0 {

        /* renamed from: a */
        public SparseArray<List<C20219w>> f52027a = new SparseArray<>();

        /* renamed from: androidx.recyclerview.widget.l0$b$a */
        public class C20184a implements C20185c {

            /* renamed from: a */
            public final C20219w f52028a;

            public C20184a(C20219w wVar) {
                this.f52028a = wVar;
            }

            /* renamed from: a */
            public int mo60549a(int i) {
                return i;
            }

            /* renamed from: b */
            public int mo60550b(int i) {
                List list = C20183b.this.f52027a.get(i);
                if (list == null) {
                    list = new ArrayList();
                    C20183b.this.f52027a.put(i, list);
                }
                if (!list.contains(this.f52028a)) {
                    list.add(this.f52028a);
                }
                return i;
            }

            /* renamed from: g */
            public void mo60551g() {
                C20183b.this.mo60552c(this.f52028a);
            }
        }

        @C0359n0
        /* renamed from: a */
        public C20219w mo60545a(int i) {
            List list = this.f52027a.get(i);
            if (list != null && !list.isEmpty()) {
                return (C20219w) list.get(0);
            }
            throw new IllegalArgumentException("Cannot find the wrapper for global view type " + i);
        }

        @C0359n0
        /* renamed from: b */
        public C20185c mo60546b(@C0359n0 C20219w wVar) {
            return new C20184a(wVar);
        }

        /* renamed from: c */
        public void mo60552c(@C0359n0 C20219w wVar) {
            for (int size = this.f52027a.size() - 1; size >= 0; size--) {
                List valueAt = this.f52027a.valueAt(size);
                if (valueAt.remove(wVar) && valueAt.isEmpty()) {
                    this.f52027a.removeAt(size);
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.l0$c */
    public interface C20185c {
        /* renamed from: a */
        int mo60549a(int i);

        /* renamed from: b */
        int mo60550b(int i);

        /* renamed from: g */
        void mo60551g();
    }

    @C0359n0
    /* renamed from: a */
    C20219w mo60545a(int i);

    @C0359n0
    /* renamed from: b */
    C20185c mo60546b(@C0359n0 C20219w wVar);
}

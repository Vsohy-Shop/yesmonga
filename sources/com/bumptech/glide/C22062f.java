package com.bumptech.glide;

import android.graphics.drawable.Drawable;
import android.widget.AbsListView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.bumptech.glide.request.C22557e;
import com.bumptech.glide.request.target.C22583o;
import com.bumptech.glide.request.target.C22584p;
import com.bumptech.glide.request.transition.C22598f;
import com.bumptech.glide.util.C22635o;
import java.util.List;
import java.util.Queue;

/* renamed from: com.bumptech.glide.f */
public class C22062f<T> implements AbsListView.OnScrollListener {

    /* renamed from: a */
    public final int f56622a;

    /* renamed from: b */
    public final C22066d f56623b;

    /* renamed from: c */
    public final C22092j f56624c;

    /* renamed from: d */
    public final C22063a<T> f56625d;

    /* renamed from: e */
    public final C22064b<T> f56626e;

    /* renamed from: f */
    public int f56627f;

    /* renamed from: g */
    public int f56628g;

    /* renamed from: h */
    public int f56629h = -1;

    /* renamed from: i */
    public int f56630i;

    /* renamed from: j */
    public boolean f56631j = true;

    /* renamed from: com.bumptech.glide.f$a */
    public interface C22063a<U> {
        @C0359n0
        /* renamed from: a */
        List<U> mo65582a(int i);

        @C0363p0
        /* renamed from: b */
        C22090i<?> mo65583b(@C0359n0 U u);
    }

    /* renamed from: com.bumptech.glide.f$b */
    public interface C22064b<T> {
        @C0363p0
        /* renamed from: a */
        int[] mo65584a(@C0359n0 T t, int i, int i2);
    }

    /* renamed from: com.bumptech.glide.f$c */
    public static final class C22065c implements C22584p<Object> {

        /* renamed from: a */
        public int f56632a;

        /* renamed from: b */
        public int f56633b;
        @C0363p0

        /* renamed from: c */
        public C22557e f56634c;

        /* renamed from: a */
        public void mo65585a() {
        }

        /* renamed from: b */
        public void mo65586b() {
        }

        /* renamed from: c */
        public void mo65587c() {
        }

        /* renamed from: d */
        public void mo65588d(@C0359n0 C22583o oVar) {
        }

        /* renamed from: g */
        public void mo65589g(@C0363p0 Drawable drawable) {
        }

        @C0363p0
        public C22557e getRequest() {
            return this.f56634c;
        }

        /* renamed from: k */
        public void mo65591k(@C0363p0 Drawable drawable) {
        }

        /* renamed from: l */
        public void mo65592l(@C0359n0 Object obj, @C0363p0 C22598f<? super Object> fVar) {
        }

        /* renamed from: n */
        public void mo65593n(@C0363p0 C22557e eVar) {
            this.f56634c = eVar;
        }

        /* renamed from: o */
        public void mo65594o(@C0363p0 Drawable drawable) {
        }

        /* renamed from: p */
        public void mo65595p(@C0359n0 C22583o oVar) {
            oVar.mo66710e(this.f56633b, this.f56632a);
        }
    }

    /* renamed from: com.bumptech.glide.f$d */
    public static final class C22066d {

        /* renamed from: a */
        public final Queue<C22065c> f56635a;

        public C22066d(int i) {
            this.f56635a = C22635o.m102631f(i);
            for (int i2 = 0; i2 < i; i2++) {
                this.f56635a.offer(new C22065c());
            }
        }

        /* renamed from: a */
        public C22065c mo65596a(int i, int i2) {
            C22065c poll = this.f56635a.poll();
            this.f56635a.offer(poll);
            poll.f56633b = i;
            poll.f56632a = i2;
            return poll;
        }
    }

    public C22062f(@C0359n0 C22092j jVar, @C0359n0 C22063a<T> aVar, @C0359n0 C22064b<T> bVar, int i) {
        this.f56624c = jVar;
        this.f56625d = aVar;
        this.f56626e = bVar;
        this.f56622a = i;
        this.f56623b = new C22066d(i + 1);
    }

    /* renamed from: a */
    public final void mo65575a() {
        for (int i = 0; i < this.f56623b.f56635a.size(); i++) {
            this.f56624c.mo65712B(this.f56623b.mo65596a(0, 0));
        }
    }

    /* renamed from: b */
    public final void mo65576b(int i, int i2) {
        int i3;
        int i4;
        if (i < i2) {
            i3 = Math.max(this.f56627f, i);
            i4 = i2;
        } else {
            i4 = Math.min(this.f56628g, i);
            i3 = i2;
        }
        int min = Math.min(this.f56630i, i4);
        int min2 = Math.min(this.f56630i, Math.max(0, i3));
        if (i < i2) {
            for (int i5 = min2; i5 < min; i5++) {
                mo65578d(this.f56625d.mo65582a(i5), i5, true);
            }
        } else {
            for (int i6 = min - 1; i6 >= min2; i6--) {
                mo65578d(this.f56625d.mo65582a(i6), i6, false);
            }
        }
        this.f56628g = min2;
        this.f56627f = min;
    }

    /* renamed from: c */
    public final void mo65577c(int i, boolean z) {
        int i2;
        if (this.f56631j != z) {
            this.f56631j = z;
            mo65575a();
        }
        if (z) {
            i2 = this.f56622a;
        } else {
            i2 = -this.f56622a;
        }
        mo65576b(i, i2 + i);
    }

    /* renamed from: d */
    public final void mo65578d(List<T> list, int i, boolean z) {
        int size = list.size();
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                mo65579e(list.get(i2), i, i2);
            }
            return;
        }
        for (int i3 = size - 1; i3 >= 0; i3--) {
            mo65579e(list.get(i3), i, i3);
        }
    }

    /* renamed from: e */
    public final void mo65579e(@C0363p0 T t, int i, int i2) {
        int[] a;
        C22090i<?> b;
        if (t != null && (a = this.f56626e.mo65584a(t, i, i2)) != null && (b = this.f56625d.mo65583b(t)) != null) {
            b.mo65672H1(this.f56623b.mo65596a(a[0], a[1]));
        }
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        this.f56630i = i3;
        int i4 = this.f56629h;
        if (i > i4) {
            mo65577c(i2 + i, true);
        } else if (i < i4) {
            mo65577c(i, false);
        }
        this.f56629h = i;
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }
}

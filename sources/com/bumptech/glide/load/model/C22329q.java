package com.bumptech.glide.load.model;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.util.C17997q;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.C22108c;
import com.bumptech.glide.load.C22277f;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C22114d;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.model.C22323n;
import com.bumptech.glide.util.C22633m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: com.bumptech.glide.load.model.q */
public class C22329q<Model, Data> implements C22323n<Model, Data> {

    /* renamed from: a */
    public final List<C22323n<Model, Data>> f57347a;

    /* renamed from: b */
    public final C17997q.C17998a<List<Throwable>> f57348b;

    /* renamed from: com.bumptech.glide.load.model.q$a */
    public static class C22330a<Data> implements C22114d<Data>, C22114d.C22115a<Data> {

        /* renamed from: a */
        public final List<C22114d<Data>> f57349a;

        /* renamed from: b */
        public final C17997q.C17998a<List<Throwable>> f57350b;

        /* renamed from: c */
        public int f57351c = 0;

        /* renamed from: d */
        public Priority f57352d;

        /* renamed from: e */
        public C22114d.C22115a<? super Data> f57353e;
        @C0363p0

        /* renamed from: f */
        public List<Throwable> f57354f;

        /* renamed from: g */
        public boolean f57355g;

        public C22330a(@C0359n0 List<C22114d<Data>> list, @C0359n0 C17997q.C17998a<List<Throwable>> aVar) {
            this.f57350b = aVar;
            C22633m.m102623c(list);
            this.f57349a = list;
        }

        @C0359n0
        /* renamed from: a */
        public Class<Data> mo65784a() {
            return this.f57349a.get(0).mo65784a();
        }

        /* renamed from: b */
        public void mo65789b() {
            List<Throwable> list = this.f57354f;
            if (list != null) {
                this.f57350b.mo52468a(list);
            }
            this.f57354f = null;
            for (C22114d<Data> b : this.f57349a) {
                b.mo65789b();
            }
        }

        /* renamed from: c */
        public void mo65803c(@C0359n0 Exception exc) {
            ((List) C22633m.m102624d(this.f57354f)).add(exc);
            mo66319g();
        }

        public void cancel() {
            this.f57355g = true;
            for (C22114d<Data> cancel : this.f57349a) {
                cancel.cancel();
            }
        }

        @C0359n0
        /* renamed from: d */
        public DataSource mo65792d() {
            return this.f57349a.get(0).mo65792d();
        }

        /* renamed from: e */
        public void mo65793e(@C0359n0 Priority priority, @C0359n0 C22114d.C22115a<? super Data> aVar) {
            this.f57352d = priority;
            this.f57353e = aVar;
            this.f57354f = this.f57350b.mo52469b();
            this.f57349a.get(this.f57351c).mo65793e(priority, this);
            if (this.f57355g) {
                cancel();
            }
        }

        /* renamed from: f */
        public void mo65804f(@C0363p0 Data data) {
            if (data != null) {
                this.f57353e.mo65804f(data);
            } else {
                mo66319g();
            }
        }

        /* renamed from: g */
        public final void mo66319g() {
            if (!this.f57355g) {
                if (this.f57351c < this.f57349a.size() - 1) {
                    this.f57351c++;
                    mo65793e(this.f57352d, this.f57353e);
                    return;
                }
                C22633m.m102624d(this.f57354f);
                this.f57353e.mo65803c(new GlideException("Fetch failed", (List<Throwable>) new ArrayList(this.f57354f)));
            }
        }
    }

    public C22329q(@C0359n0 List<C22323n<Model, Data>> list, @C0359n0 C17997q.C17998a<List<Throwable>> aVar) {
        this.f57347a = list;
        this.f57348b = aVar;
    }

    /* renamed from: a */
    public boolean mo66239a(@C0359n0 Model model) {
        for (C22323n<Model, Data> a : this.f57347a) {
            if (a.mo66239a(model)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public C22323n.C22324a<Data> mo66240b(@C0359n0 Model model, int i, int i2, @C0359n0 C22277f fVar) {
        C22323n.C22324a b;
        int size = this.f57347a.size();
        ArrayList arrayList = new ArrayList(size);
        C22108c cVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            C22323n nVar = this.f57347a.get(i3);
            if (nVar.mo66239a(model) && (b = nVar.mo66240b(model, i, i2, fVar)) != null) {
                cVar = b.f57340a;
                arrayList.add(b.f57342c);
            }
        }
        if (arrayList.isEmpty() || cVar == null) {
            return null;
        }
        return new C22323n.C22324a<>(cVar, new C22330a(arrayList, this.f57348b));
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f57347a.toArray()) + C12361b.f30259j;
    }
}

package androidx.recyclerview.widget;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.recyclerview.widget.C20106c;
import androidx.recyclerview.widget.C20109d;
import androidx.recyclerview.widget.C20157j;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C20061e0;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.t */
public abstract class C20209t<T, VH extends RecyclerView.C20061e0> extends RecyclerView.Adapter<VH> {

    /* renamed from: a */
    public final C20109d<T> f52164a;

    /* renamed from: b */
    public final C20109d.C20113b<T> f52165b;

    /* renamed from: androidx.recyclerview.widget.t$a */
    public class C20210a implements C20109d.C20113b<T> {
        public C20210a() {
        }

        /* renamed from: a */
        public void mo60272a(@C0359n0 List<T> list, @C0359n0 List<T> list2) {
            C20209t.this.mo60669m(list, list2);
        }
    }

    public C20209t(@C0359n0 C20157j.C20163f<T> fVar) {
        C20210a aVar = new C20210a();
        this.f52165b = aVar;
        C20109d<T> dVar = new C20109d<>((C20211u) new C20104b(this), new C20106c.C20107a(fVar).mo60237a());
        this.f52164a = dVar;
        dVar.mo60262a(aVar);
    }

    public int getItemCount() {
        return this.f52164a.mo60263b().size();
    }

    @C0359n0
    /* renamed from: k */
    public List<T> mo60667k() {
        return this.f52164a.mo60263b();
    }

    /* renamed from: l */
    public T mo60668l(int i) {
        return this.f52164a.mo60263b().get(i);
    }

    /* renamed from: m */
    public void mo60669m(@C0359n0 List<T> list, @C0359n0 List<T> list2) {
    }

    /* renamed from: n */
    public void mo60670n(@C0363p0 List<T> list) {
        this.f52164a.mo60267f(list);
    }

    /* renamed from: o */
    public void mo60671o(@C0363p0 List<T> list, @C0363p0 Runnable runnable) {
        this.f52164a.mo60268g(list, runnable);
    }

    public C20209t(@C0359n0 C20106c<T> cVar) {
        C20210a aVar = new C20210a();
        this.f52165b = aVar;
        C20109d<T> dVar = new C20109d<>((C20211u) new C20104b(this), cVar);
        this.f52164a = dVar;
        dVar.mo60262a(aVar);
    }
}

package com.google.maps.android.quadtree;

import com.google.maps.android.geometry.C33871a;
import com.google.maps.android.geometry.C33872b;
import com.google.maps.android.quadtree.C33882a.C33883a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.maps.android.quadtree.a */
public class C33882a<T extends C33883a> {

    /* renamed from: e */
    public static final int f82215e = 50;

    /* renamed from: f */
    public static final int f82216f = 40;

    /* renamed from: a */
    public final C33871a f82217a;

    /* renamed from: b */
    public final int f82218b;

    /* renamed from: c */
    public Set<T> f82219c;

    /* renamed from: d */
    public List<C33882a<T>> f82220d;

    /* renamed from: com.google.maps.android.quadtree.a$a */
    public interface C33883a {
        /* renamed from: a */
        C33872b mo98050a();
    }

    public C33882a(double d, double d2, double d3, double d4) {
        this(new C33871a(d, d2, d3, d4));
    }

    /* renamed from: a */
    public void mo98585a(T t) {
        C33872b a = t.mo98050a();
        if (this.f82217a.mo98560a(a.f82172a, a.f82173b)) {
            mo98587c(a.f82172a, a.f82173b, t);
        }
    }

    /* renamed from: b */
    public void mo98586b() {
        this.f82220d = null;
        Set<T> set = this.f82219c;
        if (set != null) {
            set.clear();
        }
    }

    /* renamed from: c */
    public final void mo98587c(double d, double d2, T t) {
        List<C33882a<T>> list = this.f82220d;
        if (list != null) {
            C33871a aVar = this.f82217a;
            if (d2 < aVar.f82171f) {
                if (d < aVar.f82170e) {
                    list.get(0).mo98587c(d, d2, t);
                } else {
                    list.get(1).mo98587c(d, d2, t);
                }
            } else if (d < aVar.f82170e) {
                list.get(2).mo98587c(d, d2, t);
            } else {
                list.get(3).mo98587c(d, d2, t);
            }
        } else {
            if (this.f82219c == null) {
                this.f82219c = new LinkedHashSet();
            }
            this.f82219c.add(t);
            if (this.f82219c.size() > 50 && this.f82218b < 40) {
                mo98592h();
            }
        }
    }

    /* renamed from: d */
    public final boolean mo98588d(double d, double d2, T t) {
        List<C33882a<T>> list = this.f82220d;
        if (list != null) {
            C33871a aVar = this.f82217a;
            if (d2 < aVar.f82171f) {
                if (d < aVar.f82170e) {
                    return list.get(0).mo98588d(d, d2, t);
                }
                return list.get(1).mo98588d(d, d2, t);
            } else if (d < aVar.f82170e) {
                return list.get(2).mo98588d(d, d2, t);
            } else {
                return list.get(3).mo98588d(d, d2, t);
            }
        } else {
            Set<T> set = this.f82219c;
            if (set == null) {
                return false;
            }
            return set.remove(t);
        }
    }

    /* renamed from: e */
    public boolean mo98589e(T t) {
        C33872b a = t.mo98050a();
        if (!this.f82217a.mo98560a(a.f82172a, a.f82173b)) {
            return false;
        }
        return mo98588d(a.f82172a, a.f82173b, t);
    }

    /* renamed from: f */
    public Collection<T> mo98590f(C33871a aVar) {
        ArrayList arrayList = new ArrayList();
        mo98591g(aVar, arrayList);
        return arrayList;
    }

    /* renamed from: g */
    public final void mo98591g(C33871a aVar, Collection<T> collection) {
        if (this.f82217a.mo98564e(aVar)) {
            List<C33882a<T>> list = this.f82220d;
            if (list != null) {
                for (C33882a<T> g : list) {
                    g.mo98591g(aVar, collection);
                }
            } else if (this.f82219c == null) {
            } else {
                if (aVar.mo98561b(this.f82217a)) {
                    collection.addAll(this.f82219c);
                    return;
                }
                for (T t : this.f82219c) {
                    if (aVar.mo98562c(t.mo98050a())) {
                        collection.add(t);
                    }
                }
            }
        }
    }

    /* renamed from: h */
    public final void mo98592h() {
        ArrayList arrayList = new ArrayList(4);
        this.f82220d = arrayList;
        C33871a aVar = this.f82217a;
        arrayList.add(new C33882a(aVar.f82166a, aVar.f82170e, aVar.f82167b, aVar.f82171f, this.f82218b + 1));
        List<C33882a<T>> list = this.f82220d;
        C33871a aVar2 = this.f82217a;
        list.add(new C33882a(aVar2.f82170e, aVar2.f82168c, aVar2.f82167b, aVar2.f82171f, this.f82218b + 1));
        List<C33882a<T>> list2 = this.f82220d;
        C33871a aVar3 = this.f82217a;
        list2.add(new C33882a(aVar3.f82166a, aVar3.f82170e, aVar3.f82171f, aVar3.f82169d, this.f82218b + 1));
        List<C33882a<T>> list3 = this.f82220d;
        C33871a aVar4 = this.f82217a;
        list3.add(new C33882a(aVar4.f82170e, aVar4.f82168c, aVar4.f82171f, aVar4.f82169d, this.f82218b + 1));
        Set<T> set = this.f82219c;
        this.f82219c = null;
        for (T t : set) {
            mo98587c(t.mo98050a().f82172a, t.mo98050a().f82173b, t);
        }
    }

    public C33882a(C33871a aVar) {
        this(aVar, 0);
    }

    public C33882a(double d, double d2, double d3, double d4, int i) {
        this(new C33871a(d, d2, d3, d4), i);
    }

    public C33882a(C33871a aVar, int i) {
        this.f82220d = null;
        this.f82217a = aVar;
        this.f82218b = i;
    }
}

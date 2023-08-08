package com.contentsquare.android.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import com.contentsquare.android.sdk.C14918z4;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.contentsquare.android.sdk.a */
public abstract class C14162a<T extends C14918z4> implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    public final SharedPreferences f35022a;

    /* renamed from: b */
    public final T f35023b;

    /* renamed from: c */
    public final WeakHashMap<C14265d3<List<T>>, Object> f35024c = new WeakHashMap<>();

    /* renamed from: com.contentsquare.android.sdk.a$a */
    public class C14163a implements C14603p0<List<T>, List<T>> {

        /* renamed from: a */
        public final /* synthetic */ Set f35025a;

        public C14163a(Set set) {
            this.f35025a = set;
        }

        /* renamed from: a */
        public List<T> mo34472d(List<T> list) {
            ArrayList arrayList = new ArrayList(list.size());
            for (T t : list) {
                if (this.f35025a.contains(t.mo36943a())) {
                    arrayList.add(t);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: com.contentsquare.android.sdk.a$b */
    public class C14164b implements C14585o7<List<T>, C14210b5<List<T>>, List<T>> {

        /* renamed from: a */
        public final /* synthetic */ List f35027a;

        public C14164b(List list) {
            this.f35027a = list;
        }

        /* renamed from: a */
        public List<T> mo34474c(List<T> list, C14210b5<List<T>> b5Var) {
            return (list.size() == 1 && list.get(0) == C14162a.this.f35023b) ? this.f35027a : b5Var.mo34659j() ? b5Var.mo34655g() : Collections.singletonList(C14162a.this.f35023b);
        }
    }

    /* renamed from: com.contentsquare.android.sdk.a$c */
    public class C14165c implements C14441j4<List<T>> {

        /* renamed from: a */
        public final /* synthetic */ Set f35029a;

        public C14165c(Set set) {
            this.f35029a = set;
        }

        /* renamed from: a */
        public boolean mo34476d(List<T> list) {
            boolean z = false;
            int i = 0;
            while (!z && i < list.size()) {
                z = this.f35029a.contains(((C14918z4) list.get(i)).mo36943a());
                i++;
            }
            return z;
        }
    }

    public C14162a(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        this.f35022a = sharedPreferences;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
        this.f35023b = mo34465f();
    }

    /* renamed from: a */
    public final C14603p0<List<T>, List<T>> mo34460a(Set<String> set) {
        return new C14163a(set);
    }

    /* renamed from: b */
    public abstract T mo34461b(String str);

    /* renamed from: c */
    public Map<String, ?> mo34462c() {
        return this.f35022a.getAll();
    }

    /* renamed from: d */
    public final Set<String> mo34463d(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String h : strArr) {
            hashSet.add(mo34467h(h));
        }
        return hashSet;
    }

    /* renamed from: e */
    public final C14441j4<List<T>> mo34464e(Set<String> set) {
        return new C14165c(set);
    }

    /* renamed from: f */
    public abstract T mo34465f();

    /* renamed from: g */
    public final C14585o7<List<T>, C14210b5<List<T>>, List<T>> mo34466g(List<T> list) {
        return new C14164b(list);
    }

    /* renamed from: h */
    public String mo34467h(String str) {
        return str;
    }

    /* renamed from: i */
    public final List<T> mo34468i(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String h : strArr) {
            arrayList.add(mo34461b(mo34467h(h)));
        }
        return arrayList;
    }

    /* renamed from: j */
    public C14841we<List<T>> mo34469j(String... strArr) {
        C14169a3.m60808a(strArr);
        List i = mo34468i(strArr);
        Set<String> d = mo34463d(strArr);
        C14265d3 b = C14734t3.m63489b(new ArrayDeque());
        this.f35024c.put(b, (Object) null);
        return ((C14262d0) C14380ge.m61920b(Collections.singletonList(this.f35023b)).mo35882f(b).mo35929c().mo34898b(b, mo34466g(i)).mo35931g(mo34464e(d)).mo35888b()).mo35930d(mo34460a(d)).mo34981a();
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str != null) {
            for (C14265d3<List<T>> b : this.f35024c.keySet()) {
                b.mo34827b(Collections.singletonList(mo34461b(str)));
            }
        }
    }
}

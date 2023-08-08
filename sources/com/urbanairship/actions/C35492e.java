package com.urbanairship.actions;

import android.content.Context;
import android.util.SparseArray;
import androidx.annotation.C0351j1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.C36080x;
import com.urbanairship.util.C9669o0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.urbanairship.actions.e */
public class C35492e {

    /* renamed from: a */
    public final Map<String, C35493a> f87527a = new HashMap();

    /* renamed from: com.urbanairship.actions.e$b */
    public interface C35494b {
        /* renamed from: a */
        boolean mo106318a(@C0359n0 C35489b bVar);
    }

    @C0359n0
    /* renamed from: a */
    public Set<C35493a> mo106351a() {
        HashSet hashSet;
        synchronized (this.f87527a) {
            hashSet = new HashSet(this.f87527a.values());
        }
        return hashSet;
    }

    @C0363p0
    /* renamed from: b */
    public C35493a mo106352b(@C0359n0 String str) {
        C35493a aVar;
        if (C9669o0.m36224e(str)) {
            return null;
        }
        synchronized (this.f87527a) {
            aVar = this.f87527a.get(str);
        }
        return aVar;
    }

    @C0359n0
    /* renamed from: c */
    public C35493a mo106353c(@C0359n0 C35487a aVar, @C0359n0 String... strArr) {
        if (strArr.length != 0) {
            return mo106357g(new C35493a(aVar, (List<String>) new ArrayList(Arrays.asList(strArr))));
        }
        throw new IllegalArgumentException("Unable to register an action without a name.");
    }

    @C0359n0
    /* renamed from: d */
    public C35493a mo106354d(@C0359n0 Class<? extends C35487a> cls, @C0359n0 String... strArr) {
        if (strArr.length != 0) {
            return mo106357g(new C35493a((Class) cls, (List<String>) new ArrayList(Arrays.asList(strArr))));
        }
        throw new IllegalArgumentException("Unable to register an action without a name.");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: e */
    public void mo106355e(@C0359n0 Context context, @C0351j1 int i) {
        for (C35493a g : C35491d.m146433a(context, i)) {
            mo106357g(g);
        }
    }

    /* renamed from: f */
    public void mo106356f(@C0359n0 Context context) {
        mo106355e(context, C36080x.C36097q.ua_default_actions);
    }

    @C0359n0
    /* renamed from: g */
    public final C35493a mo106357g(@C0359n0 C35493a aVar) {
        List<String> e = aVar.mo106362e();
        for (String e2 : e) {
            if (C9669o0.m36224e(e2)) {
                throw new IllegalArgumentException("Unable to register action because one or more of the names was null or empty.");
            }
        }
        synchronized (this.f87527a) {
            for (String next : e) {
                if (!C9669o0.m36224e(next)) {
                    C35493a remove = this.f87527a.remove(next);
                    if (remove != null) {
                        remove.mo106364g(next);
                    }
                    this.f87527a.put(next, aVar);
                }
            }
        }
        return aVar;
    }

    /* renamed from: h */
    public void mo106358h(@C0359n0 String str) {
        if (!C9669o0.m36224e(str)) {
            synchronized (this.f87527a) {
                C35493a b = mo106352b(str);
                if (b != null) {
                    for (String remove : b.mo106362e()) {
                        this.f87527a.remove(remove);
                    }
                }
            }
        }
    }

    /* renamed from: com.urbanairship.actions.e$a */
    public static final class C35493a {

        /* renamed from: a */
        public final List<String> f87528a;

        /* renamed from: b */
        public C35487a f87529b;

        /* renamed from: c */
        public Class f87530c;

        /* renamed from: d */
        public C35494b f87531d;

        /* renamed from: e */
        public final SparseArray<C35487a> f87532e = new SparseArray<>();

        public C35493a(@C0359n0 C35487a aVar, @C0359n0 List<String> list) {
            this.f87529b = aVar;
            this.f87528a = list;
        }

        /* renamed from: b */
        public final void mo106359b(@C0359n0 String str) {
            synchronized (this.f87528a) {
                this.f87528a.add(str);
            }
        }

        @C0359n0
        /* renamed from: c */
        public C35487a mo106360c(int i) {
            C35487a aVar = this.f87532e.get(i);
            if (aVar != null) {
                return aVar;
            }
            return mo106361d();
        }

        @C0359n0
        /* renamed from: d */
        public C35487a mo106361d() {
            if (this.f87529b == null) {
                try {
                    this.f87529b = (C35487a) this.f87530c.newInstance();
                } catch (Exception unused) {
                    throw new IllegalArgumentException("Unable to instantiate action class.");
                }
            }
            return this.f87529b;
        }

        @C0359n0
        /* renamed from: e */
        public List<String> mo106362e() {
            ArrayList arrayList;
            synchronized (this.f87528a) {
                arrayList = new ArrayList(this.f87528a);
            }
            return arrayList;
        }

        @C0363p0
        /* renamed from: f */
        public C35494b mo106363f() {
            return this.f87531d;
        }

        /* renamed from: g */
        public final void mo106364g(@C0359n0 String str) {
            synchronized (this.f87528a) {
                this.f87528a.remove(str);
            }
        }

        /* renamed from: h */
        public void mo106365h(@C0359n0 C35487a aVar) {
            this.f87529b = aVar;
        }

        /* renamed from: i */
        public void mo106366i(@C0363p0 C35494b bVar) {
            this.f87531d = bVar;
        }

        /* renamed from: j */
        public void mo106367j(int i, @C0363p0 C35487a aVar) {
            if (aVar == null) {
                this.f87532e.remove(i);
            } else {
                this.f87532e.put(i, aVar);
            }
        }

        @C0359n0
        public String toString() {
            return "Action Entry: " + this.f87528a;
        }

        public C35493a(@C0359n0 Class cls, @C0359n0 List<String> list) {
            this.f87530c = cls;
            this.f87528a = list;
        }
    }
}

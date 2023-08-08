package com.urbanairship.util;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.arch.core.util.C0843a;
import com.urbanairship.C36071u;
import com.urbanairship.json.C9333e;
import com.urbanairship.json.JsonValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.util.a0 */
public class C9637a0<T> {

    /* renamed from: a */
    public final C36071u f26410a;

    /* renamed from: b */
    public final String f26411b;

    /* renamed from: c */
    public final C0843a<JsonValue, T> f26412c;

    /* renamed from: d */
    public final C0843a<T, ? extends C9333e> f26413d;

    public C9637a0(@C0359n0 C36071u uVar, @C0359n0 String str, @C0359n0 C0843a<T, ? extends C9333e> aVar, @C0359n0 C0843a<JsonValue, T> aVar2) {
        this.f26410a = uVar;
        this.f26411b = str;
        this.f26413d = aVar;
        this.f26412c = aVar2;
    }

    /* renamed from: a */
    public void mo19595a(@C0359n0 T t) {
        synchronized (this.f26411b) {
            List<JsonValue> i = this.f26410a.mo107845h(this.f26411b).mo18784z().mo18793i();
            i.add(((C9333e) this.f26413d.apply(t)).mo17264q());
            this.f26410a.mo107855t(this.f26411b, JsonValue.m34975U(i));
        }
    }

    /* renamed from: b */
    public void mo19596b(@C0359n0 List<T> list) {
        if (!list.isEmpty()) {
            synchronized (this.f26411b) {
                List<JsonValue> i = this.f26410a.mo107845h(this.f26411b).mo18784z().mo18793i();
                for (T apply : list) {
                    i.add(((C9333e) this.f26413d.apply(apply)).mo17264q());
                }
                this.f26410a.mo107855t(this.f26411b, JsonValue.m34975U(i));
            }
        }
    }

    /* renamed from: c */
    public void mo19597c(C0843a<List<T>, List<T>> aVar) {
        synchronized (this.f26411b) {
            List apply = aVar.apply(mo19598d());
            if (apply.isEmpty()) {
                this.f26410a.mo107859x(this.f26411b);
            } else {
                this.f26410a.mo107855t(this.f26411b, JsonValue.m34975U(apply));
            }
        }
    }

    @C0359n0
    /* renamed from: d */
    public List<T> mo19598d() {
        ArrayList arrayList;
        synchronized (this.f26411b) {
            arrayList = new ArrayList();
            Iterator<JsonValue> it = this.f26410a.mo107845h(this.f26411b).mo18784z().iterator();
            while (it.hasNext()) {
                arrayList.add(this.f26412c.apply(it.next()));
            }
        }
        return arrayList;
    }

    @C0363p0
    /* renamed from: e */
    public T mo19599e() {
        List<JsonValue> i = this.f26410a.mo107845h(this.f26411b).mo18784z().mo18793i();
        if (i.isEmpty()) {
            return null;
        }
        return this.f26412c.apply(i.get(0));
    }

    @C0363p0
    /* renamed from: f */
    public T mo19600f() {
        synchronized (this.f26411b) {
            List<JsonValue> i = this.f26410a.mo107845h(this.f26411b).mo18784z().mo18793i();
            if (i.isEmpty()) {
                return null;
            }
            JsonValue remove = i.remove(0);
            if (i.isEmpty()) {
                this.f26410a.mo107859x(this.f26411b);
            } else {
                this.f26410a.mo107855t(this.f26411b, JsonValue.m34975U(i));
            }
            T apply = this.f26412c.apply(remove);
            return apply;
        }
    }

    /* renamed from: g */
    public void mo19601g() {
        synchronized (this.f26411b) {
            this.f26410a.mo107859x(this.f26411b);
        }
    }
}

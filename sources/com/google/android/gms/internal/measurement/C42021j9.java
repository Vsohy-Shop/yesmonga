package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.j9 */
public final class C42021j9 {

    /* renamed from: d */
    public static final C42021j9 f106234d = new C42021j9(true);

    /* renamed from: a */
    public final C42230vb f106235a = new C42041kb(16);

    /* renamed from: b */
    public boolean f106236b;

    /* renamed from: c */
    public boolean f106237c;

    public C42021j9() {
    }

    /* renamed from: a */
    public static C42021j9 m170360a() {
        throw null;
    }

    /* renamed from: d */
    public static final void m170361d(C42003i9 i9Var, Object obj) {
        boolean z;
        zzoa zzb = i9Var.zzb();
        byte[] bArr = C41860aa.f105998d;
        obj.getClass();
        zzoa zzoa = zzoa.DOUBLE;
        zzob zzob = zzob.INT;
        switch (zzb.mo137619g().ordinal()) {
            case 0:
                z = obj instanceof Integer;
                break;
            case 1:
                z = obj instanceof Long;
                break;
            case 2:
                z = obj instanceof Float;
                break;
            case 3:
                z = obj instanceof Double;
                break;
            case 4:
                z = obj instanceof Boolean;
                break;
            case 5:
                z = obj instanceof String;
                break;
            case 6:
                if ((obj instanceof zzka) || (obj instanceof byte[])) {
                    return;
                }
            case 7:
                if ((obj instanceof Integer) || (obj instanceof C42211u9)) {
                    return;
                }
            case 8:
                if ((obj instanceof C42246wa) || (obj instanceof C41878ba)) {
                    return;
                }
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(i9Var.zza()), i9Var.zzb().mo137619g(), obj.getClass().getName()}));
    }

    /* renamed from: b */
    public final void mo137053b() {
        if (!this.f106236b) {
            for (int i = 0; i < this.f106235a.mo137373b(); i++) {
                Map.Entry h = this.f106235a.mo137381h(i);
                if (h.getValue() instanceof C42177s9) {
                    ((C42177s9) h.getValue()).mo137281u();
                }
            }
            this.f106235a.mo137087a();
            this.f106236b = true;
        }
    }

    /* renamed from: c */
    public final void mo137054c(C42003i9 i9Var, Object obj) {
        if (!i9Var.mo137033d()) {
            m170361d(i9Var, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                m170361d(i9Var, arrayList.get(i));
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof C41878ba) {
            this.f106237c = true;
        }
        this.f106235a.put(i9Var, obj);
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        C42021j9 j9Var = new C42021j9();
        for (int i = 0; i < this.f106235a.mo137373b(); i++) {
            Map.Entry h = this.f106235a.mo137381h(i);
            j9Var.mo137054c((C42003i9) h.getKey(), h.getValue());
        }
        for (Map.Entry entry : this.f106235a.mo137374c()) {
            j9Var.mo137054c((C42003i9) entry.getKey(), entry.getValue());
        }
        j9Var.f106237c = this.f106237c;
        return j9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42021j9)) {
            return false;
        }
        return this.f106235a.equals(((C42021j9) obj).f106235a);
    }

    public final int hashCode() {
        return this.f106235a.hashCode();
    }

    public C42021j9(boolean z) {
        mo137053b();
        mo137053b();
    }
}

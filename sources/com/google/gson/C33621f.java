package com.google.gson;

import com.google.gson.internal.C$Gson$Preconditions;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.reflect.C33707a;
import java.lang.reflect.Type;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.gson.f */
public final class C33621f {

    /* renamed from: a */
    public Excluder f81801a;

    /* renamed from: b */
    public LongSerializationPolicy f81802b;

    /* renamed from: c */
    public C33613d f81803c;

    /* renamed from: d */
    public final Map<Type, C33622g<?>> f81804d;

    /* renamed from: e */
    public final List<C33714t> f81805e;

    /* renamed from: f */
    public final List<C33714t> f81806f;

    /* renamed from: g */
    public boolean f81807g;

    /* renamed from: h */
    public String f81808h;

    /* renamed from: i */
    public int f81809i;

    /* renamed from: j */
    public int f81810j;

    /* renamed from: k */
    public boolean f81811k;

    /* renamed from: l */
    public boolean f81812l;

    /* renamed from: m */
    public boolean f81813m;

    /* renamed from: n */
    public boolean f81814n;

    /* renamed from: o */
    public boolean f81815o;

    /* renamed from: p */
    public boolean f81816p;

    public C33621f() {
        this.f81801a = Excluder.DEFAULT;
        this.f81802b = LongSerializationPolicy.DEFAULT;
        this.f81803c = FieldNamingPolicy.IDENTITY;
        this.f81804d = new HashMap();
        this.f81805e = new ArrayList();
        this.f81806f = new ArrayList();
        this.f81807g = false;
        this.f81809i = 2;
        this.f81810j = 2;
        this.f81811k = false;
        this.f81812l = false;
        this.f81813m = true;
        this.f81814n = false;
        this.f81815o = false;
        this.f81816p = false;
    }

    /* renamed from: a */
    public C33621f mo97502a(C33611b bVar) {
        this.f81801a = this.f81801a.withExclusionStrategy(bVar, false, true);
        return this;
    }

    /* renamed from: b */
    public C33621f mo97503b(C33611b bVar) {
        this.f81801a = this.f81801a.withExclusionStrategy(bVar, true, false);
        return this;
    }

    /* renamed from: c */
    public final void mo97504c(String str, int i, int i2, List<C33714t> list) {
        C33605a aVar;
        C33605a aVar2;
        C33605a aVar3;
        Class<Date> cls = Date.class;
        Class<Timestamp> cls2 = Timestamp.class;
        Class<java.util.Date> cls3 = java.util.Date.class;
        if (str != null && !"".equals(str.trim())) {
            aVar2 = new C33605a((Class<? extends java.util.Date>) cls3, str);
            aVar = new C33605a((Class<? extends java.util.Date>) cls2, str);
            aVar3 = new C33605a((Class<? extends java.util.Date>) cls, str);
        } else if (i != 2 && i2 != 2) {
            C33605a aVar4 = new C33605a(cls3, i, i2);
            C33605a aVar5 = new C33605a(cls2, i, i2);
            C33605a aVar6 = new C33605a(cls, i, i2);
            aVar2 = aVar4;
            aVar = aVar5;
            aVar3 = aVar6;
        } else {
            return;
        }
        list.add(TypeAdapters.newFactory(cls3, aVar2));
        list.add(TypeAdapters.newFactory(cls2, aVar));
        list.add(TypeAdapters.newFactory(cls, aVar3));
    }

    /* renamed from: d */
    public C33614e mo97505d() {
        ArrayList arrayList = r1;
        ArrayList arrayList2 = new ArrayList(this.f81805e.size() + this.f81806f.size() + 3);
        arrayList2.addAll(this.f81805e);
        Collections.reverse(arrayList2);
        ArrayList arrayList3 = new ArrayList(this.f81806f);
        Collections.reverse(arrayList3);
        arrayList2.addAll(arrayList3);
        mo97504c(this.f81808h, this.f81809i, this.f81810j, arrayList2);
        return new C33614e(this.f81801a, this.f81803c, this.f81804d, this.f81807g, this.f81811k, this.f81815o, this.f81813m, this.f81814n, this.f81816p, this.f81812l, this.f81802b, this.f81808h, this.f81809i, this.f81810j, this.f81805e, this.f81806f, arrayList);
    }

    /* renamed from: e */
    public C33621f mo97506e() {
        this.f81813m = false;
        return this;
    }

    /* renamed from: f */
    public C33621f mo97507f() {
        this.f81801a = this.f81801a.disableInnerClassSerialization();
        return this;
    }

    /* renamed from: g */
    public C33621f mo97508g() {
        this.f81811k = true;
        return this;
    }

    /* renamed from: h */
    public C33621f mo97509h(int... iArr) {
        this.f81801a = this.f81801a.withModifiers(iArr);
        return this;
    }

    /* renamed from: i */
    public C33621f mo97510i() {
        this.f81801a = this.f81801a.excludeFieldsWithoutExposeAnnotation();
        return this;
    }

    /* renamed from: j */
    public C33621f mo97511j() {
        this.f81815o = true;
        return this;
    }

    /* renamed from: k */
    public C33621f mo97512k(Type type, Object obj) {
        boolean z;
        boolean z2 = obj instanceof C33705q;
        if (z2 || (obj instanceof C33698j) || (obj instanceof C33622g) || (obj instanceof C33708s)) {
            z = true;
        } else {
            z = false;
        }
        C$Gson$Preconditions.checkArgument(z);
        if (obj instanceof C33622g) {
            this.f81804d.put(type, (C33622g) obj);
        }
        if (z2 || (obj instanceof C33698j)) {
            this.f81805e.add(TreeTypeAdapter.newFactoryWithMatchRawType(C33707a.get(type), obj));
        }
        if (obj instanceof C33708s) {
            this.f81805e.add(TypeAdapters.newFactory(C33707a.get(type), (C33708s) obj));
        }
        return this;
    }

    /* renamed from: l */
    public C33621f mo97513l(C33714t tVar) {
        this.f81805e.add(tVar);
        return this;
    }

    /* renamed from: m */
    public C33621f mo97514m(Class<?> cls, Object obj) {
        boolean z;
        boolean z2 = obj instanceof C33705q;
        if (z2 || (obj instanceof C33698j) || (obj instanceof C33708s)) {
            z = true;
        } else {
            z = false;
        }
        C$Gson$Preconditions.checkArgument(z);
        if ((obj instanceof C33698j) || z2) {
            this.f81806f.add(TreeTypeAdapter.newTypeHierarchyFactory(cls, obj));
        }
        if (obj instanceof C33708s) {
            this.f81805e.add(TypeAdapters.newTypeHierarchyFactory(cls, (C33708s) obj));
        }
        return this;
    }

    /* renamed from: n */
    public C33621f mo97515n() {
        this.f81807g = true;
        return this;
    }

    /* renamed from: o */
    public C33621f mo97516o() {
        this.f81812l = true;
        return this;
    }

    /* renamed from: p */
    public C33621f mo97517p(int i) {
        this.f81809i = i;
        this.f81808h = null;
        return this;
    }

    /* renamed from: q */
    public C33621f mo97518q(int i, int i2) {
        this.f81809i = i;
        this.f81810j = i2;
        this.f81808h = null;
        return this;
    }

    /* renamed from: r */
    public C33621f mo97519r(String str) {
        this.f81808h = str;
        return this;
    }

    /* renamed from: s */
    public C33621f mo97520s(C33611b... bVarArr) {
        for (C33611b withExclusionStrategy : bVarArr) {
            this.f81801a = this.f81801a.withExclusionStrategy(withExclusionStrategy, true, true);
        }
        return this;
    }

    /* renamed from: t */
    public C33621f mo97521t(FieldNamingPolicy fieldNamingPolicy) {
        this.f81803c = fieldNamingPolicy;
        return this;
    }

    /* renamed from: u */
    public C33621f mo97522u(C33613d dVar) {
        this.f81803c = dVar;
        return this;
    }

    /* renamed from: v */
    public C33621f mo97523v() {
        this.f81816p = true;
        return this;
    }

    /* renamed from: w */
    public C33621f mo97524w(LongSerializationPolicy longSerializationPolicy) {
        this.f81802b = longSerializationPolicy;
        return this;
    }

    /* renamed from: x */
    public C33621f mo97525x() {
        this.f81814n = true;
        return this;
    }

    /* renamed from: y */
    public C33621f mo97526y(double d) {
        this.f81801a = this.f81801a.withVersion(d);
        return this;
    }

    public C33621f(C33614e eVar) {
        this.f81801a = Excluder.DEFAULT;
        this.f81802b = LongSerializationPolicy.DEFAULT;
        this.f81803c = FieldNamingPolicy.IDENTITY;
        HashMap hashMap = new HashMap();
        this.f81804d = hashMap;
        ArrayList arrayList = new ArrayList();
        this.f81805e = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f81806f = arrayList2;
        this.f81807g = false;
        this.f81809i = 2;
        this.f81810j = 2;
        this.f81811k = false;
        this.f81812l = false;
        this.f81813m = true;
        this.f81814n = false;
        this.f81815o = false;
        this.f81816p = false;
        this.f81801a = eVar.f81780f;
        this.f81803c = eVar.f81781g;
        hashMap.putAll(eVar.f81782h);
        this.f81807g = eVar.f81783i;
        this.f81811k = eVar.f81784j;
        this.f81815o = eVar.f81785k;
        this.f81813m = eVar.f81786l;
        this.f81814n = eVar.f81787m;
        this.f81816p = eVar.f81788n;
        this.f81812l = eVar.f81789o;
        this.f81802b = eVar.f81793s;
        this.f81808h = eVar.f81790p;
        this.f81809i = eVar.f81791q;
        this.f81810j = eVar.f81792r;
        arrayList.addAll(eVar.f81794t);
        arrayList2.addAll(eVar.f81795u);
    }
}

package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.annotation.C0353k0;
import androidx.annotation.RestrictTo;
import androidx.core.p027os.C17779d;
import androidx.savedstate.C20431c;
import com.urbanairship.analytics.location.C35560b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.C11078d1;
import kotlin.collections.C10933e1;
import kotlin.collections.C10977s0;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11909g;
import kotlinx.coroutines.flow.C11940j;
import kotlinx.coroutines.flow.C11952u;
import kotlinx.coroutines.flow.C11953v;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSavedStateHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandle.kt\nandroidx/lifecycle/SavedStateHandle\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,450:1\n361#2,3:451\n364#2,4:455\n1#3:454\n*S KotlinDebug\n*F\n+ 1 SavedStateHandle.kt\nandroidx/lifecycle/SavedStateHandle\n*L\n198#1:451,3\n198#1:455,4\n*E\n"})
/* renamed from: androidx.lifecycle.p0 */
public final class C19456p0 {
    @C12579k

    /* renamed from: f */
    public static final C19457a f49832f = new C19457a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: g */
    public static final String f49833g = "values";
    @C12579k

    /* renamed from: h */
    public static final String f49834h = "keys";
    @C12579k

    /* renamed from: i */
    public static final Class<? extends Object>[] f49835i = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};
    @C12579k

    /* renamed from: a */
    public final Map<String, Object> f49836a;
    @C12579k

    /* renamed from: b */
    public final Map<String, C20431c.C20434c> f49837b;
    @C12579k

    /* renamed from: c */
    public final Map<String, C19458b<?>> f49838c;
    @C12579k

    /* renamed from: d */
    public final Map<String, C11940j<Object>> f49839d;
    @C12579k

    /* renamed from: e */
    public final C20431c.C20434c f49840e;

    /* renamed from: androidx.lifecycle.p0$a */
    public static final class C19457a {
        public /* synthetic */ C19457a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @C11384m
        /* renamed from: a */
        public final C19456p0 mo57658a(@C12580l Bundle bundle, @C12580l Bundle bundle2) {
            boolean z;
            if (bundle != null) {
                ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(C19456p0.f49833g);
                if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int size = parcelableArrayList.size();
                    for (int i = 0; i < size; i++) {
                        Object obj = parcelableArrayList.get(i);
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                        linkedHashMap.put((String) obj, parcelableArrayList2.get(i));
                    }
                    return new C19456p0(linkedHashMap);
                }
                throw new IllegalStateException("Invalid bundle passed as restored state".toString());
            } else if (bundle2 == null) {
                return new C19456p0();
            } else {
                HashMap hashMap = new HashMap();
                for (String next : bundle2.keySet()) {
                    Intrinsics.checkNotNullExpressionValue(next, "key");
                    hashMap.put(next, bundle2.get(next));
                }
                return new C19456p0(hashMap);
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: b */
        public final boolean mo57659b(@C12580l Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : C19456p0.f49835i) {
                Intrinsics.checkNotNull(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }

        public C19457a() {
        }
    }

    public C19456p0(@C12579k Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f49836a = linkedHashMap;
        this.f49837b = new LinkedHashMap();
        this.f49838c = new LinkedHashMap();
        this.f49839d = new LinkedHashMap();
        this.f49840e = new C19454o0(this);
        linkedHashMap.putAll(map);
    }

    @C12579k
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @C11384m
    /* renamed from: g */
    public static final C19456p0 m90761g(@C12580l Bundle bundle, @C12580l Bundle bundle2) {
        return f49832f.mo57658a(bundle, bundle2);
    }

    /* renamed from: p */
    public static final Bundle m90762p(C19456p0 p0Var) {
        Intrinsics.checkNotNullParameter(p0Var, "this$0");
        for (Map.Entry next : C10977s0.m41430D0(p0Var.f49837b).entrySet()) {
            p0Var.mo57656q((String) next.getKey(), ((C20431c.C20434c) next.getValue()).mo832c());
        }
        Set<String> keySet = p0Var.f49836a.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String next2 : keySet) {
            arrayList.add(next2);
            arrayList2.add(p0Var.f49836a.get(next2));
        }
        return C17779d.m81164b(C11078d1.m42659a("keys", arrayList), C11078d1.m42659a(f49833g, arrayList2));
    }

    @C0353k0
    /* renamed from: e */
    public final void mo57646e(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        this.f49837b.remove(str);
    }

    @C0353k0
    /* renamed from: f */
    public final boolean mo57647f(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        return this.f49836a.containsKey(str);
    }

    @C0353k0
    @C12580l
    /* renamed from: h */
    public final <T> T mo57648h(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        try {
            return this.f49836a.get(str);
        } catch (ClassCastException unused) {
            mo57654n(str);
            return null;
        }
    }

    @C0353k0
    @C12579k
    /* renamed from: i */
    public final <T> C19423g0<T> mo57649i(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        C19423g0<T> k = mo57651k(str, false, (Object) null);
        Intrinsics.checkNotNull(k, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<T of androidx.lifecycle.SavedStateHandle.getLiveData>");
        return k;
    }

    @C0353k0
    @C12579k
    /* renamed from: j */
    public final <T> C19423g0<T> mo57650j(@C12579k String str, T t) {
        Intrinsics.checkNotNullParameter(str, "key");
        return mo57651k(str, true, t);
    }

    /* renamed from: k */
    public final <T> C19423g0<T> mo57651k(String str, boolean z, T t) {
        C19423g0<T> g0Var;
        C19458b bVar;
        C19458b<?> bVar2 = this.f49838c.get(str);
        if (bVar2 instanceof C19423g0) {
            g0Var = bVar2;
        } else {
            g0Var = null;
        }
        if (g0Var != null) {
            return g0Var;
        }
        if (this.f49836a.containsKey(str)) {
            bVar = new C19458b(this, str, this.f49836a.get(str));
        } else if (z) {
            this.f49836a.put(str, t);
            bVar = new C19458b(this, str, t);
        } else {
            bVar = new C19458b(this, str);
        }
        this.f49838c.put(str, bVar);
        return bVar;
    }

    @C0353k0
    @C12579k
    /* renamed from: l */
    public final <T> C11952u<T> mo57652l(@C12579k String str, T t) {
        Intrinsics.checkNotNullParameter(str, "key");
        Map<String, C11940j<Object>> map = this.f49839d;
        C11940j<Object> jVar = map.get(str);
        if (jVar == null) {
            if (!this.f49836a.containsKey(str)) {
                this.f49836a.put(str, t);
            }
            jVar = C11953v.m47628a(this.f49836a.get(str));
            this.f49839d.put(str, jVar);
            map.put(str, jVar);
        }
        C11952u<T> m = C11909g.m47470m(jVar);
        Intrinsics.checkNotNull(m, "null cannot be cast to non-null type kotlinx.coroutines.flow.StateFlow<T of androidx.lifecycle.SavedStateHandle.getStateFlow>");
        return m;
    }

    @C0353k0
    @C12579k
    /* renamed from: m */
    public final Set<String> mo57653m() {
        return C10933e1.m40911C(C10933e1.m40911C(this.f49836a.keySet(), this.f49837b.keySet()), this.f49838c.keySet());
    }

    @C0353k0
    @C12580l
    /* renamed from: n */
    public final <T> T mo57654n(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        T remove = this.f49836a.remove(str);
        C19458b remove2 = this.f49838c.remove(str);
        if (remove2 != null) {
            remove2.mo57660s();
        }
        this.f49839d.remove(str);
        return remove;
    }

    @C12579k
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: o */
    public final C20431c.C20434c mo57655o() {
        return this.f49840e;
    }

    @C0353k0
    /* renamed from: q */
    public final <T> void mo57656q(@C12579k String str, @C12580l T t) {
        C19423g0 g0Var;
        Intrinsics.checkNotNullParameter(str, "key");
        if (f49832f.mo57659b(t)) {
            C19458b<?> bVar = this.f49838c.get(str);
            if (bVar instanceof C19423g0) {
                g0Var = bVar;
            } else {
                g0Var = null;
            }
            if (g0Var != null) {
                g0Var.mo57496r(t);
            } else {
                this.f49836a.put(str, t);
            }
            C11940j jVar = this.f49839d.get(str);
            if (jVar != null) {
                jVar.setValue(t);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't put value with type ");
        Intrinsics.checkNotNull(t);
        sb.append(t.getClass());
        sb.append(" into saved state");
        throw new IllegalArgumentException(sb.toString());
    }

    @C0353k0
    /* renamed from: r */
    public final void mo57657r(@C12579k String str, @C12579k C20431c.C20434c cVar) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(cVar, C35560b.f87807Z0);
        this.f49837b.put(str, cVar);
    }

    /* renamed from: androidx.lifecycle.p0$b */
    public static final class C19458b<T> extends C19423g0<T> {
        @C12579k

        /* renamed from: m */
        public String f49841m;
        @C12580l

        /* renamed from: n */
        public C19456p0 f49842n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19458b(@C12580l C19456p0 p0Var, @C12579k String str, T t) {
            super(t);
            Intrinsics.checkNotNullParameter(str, "key");
            this.f49841m = str;
            this.f49842n = p0Var;
        }

        /* renamed from: r */
        public void mo57496r(T t) {
            C19456p0 p0Var = this.f49842n;
            if (p0Var != null) {
                p0Var.f49836a.put(this.f49841m, t);
                C11940j jVar = (C11940j) p0Var.f49839d.get(this.f49841m);
                if (jVar != null) {
                    jVar.setValue(t);
                }
            }
            super.mo57496r(t);
        }

        /* renamed from: s */
        public final void mo57660s() {
            this.f49842n = null;
        }

        public C19458b(@C12580l C19456p0 p0Var, @C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "key");
            this.f49841m = str;
            this.f49842n = p0Var;
        }
    }

    public C19456p0() {
        this.f49836a = new LinkedHashMap();
        this.f49837b = new LinkedHashMap();
        this.f49838c = new LinkedHashMap();
        this.f49839d = new LinkedHashMap();
        this.f49840e = new C19454o0(this);
    }
}

package androidx.compose.p004ui.platform;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.p004ui.C8776o;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.saveable.C8624c;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.runtime.snapshots.C8665r;
import androidx.savedstate.C20431c;
import androidx.savedstate.C20437e;
import com.google.android.gms.analytics.ecommerce.C40383c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C11660u;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.C12361b;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nDisposableSaveableStateRegistry.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DisposableSaveableStateRegistry.android.kt\nandroidx/compose/ui/platform/DisposableSaveableStateRegistry_androidKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,190:1\n1855#2,2:191\n215#3,2:193\n*S KotlinDebug\n*F\n+ 1 DisposableSaveableStateRegistry.android.kt\nandroidx/compose/ui/platform/DisposableSaveableStateRegistry_androidKt\n*L\n172#1:191,2\n181#1:193,2\n*E\n"})
/* renamed from: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt */
public final class DisposableSaveableStateRegistry_androidKt {
    @C12579k

    /* renamed from: a */
    public static final Class<? extends Object>[] f39355a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* renamed from: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt$a */
    public static final class C15797a implements C20431c.C20434c {

        /* renamed from: a */
        public final /* synthetic */ C8624c f39356a;

        public C15797a(C8624c cVar) {
            this.f39356a = cVar;
        }

        @C12579k
        /* renamed from: c */
        public final Bundle mo832c() {
            return DisposableSaveableStateRegistry_androidKt.m71051f(this.f39356a.mo8712e());
        }
    }

    @C12579k
    /* renamed from: a */
    public static final C15951q0 m71046a(@C12579k View view, @C12579k C20437e eVar) {
        String str;
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        Intrinsics.checkNotNullParameter(eVar, "owner");
        ViewParent parent = view.getParent();
        Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.View");
        View view2 = (View) parent;
        Object tag = view2.getTag(C8776o.C8778b.compose_view_saveable_id_tag);
        if (tag instanceof String) {
            str = (String) tag;
        } else {
            str = null;
        }
        if (str == null) {
            str = String.valueOf(view2.getId());
        }
        return m71047b(str, eVar);
    }

    @C12579k
    /* renamed from: b */
    public static final C15951q0 m71047b(@C12579k String str, @C12579k C20437e eVar) {
        Map<String, List<Object>> map;
        boolean z;
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(eVar, "savedStateRegistryOwner");
        String str2 = C8624c.class.getSimpleName() + C12361b.f30257h + str;
        C20431c savedStateRegistry = eVar.getSavedStateRegistry();
        Bundle b = savedStateRegistry.mo61284b(str2);
        if (b != null) {
            map = m71052g(b);
        } else {
            map = null;
        }
        C8624c a = SaveableStateRegistryKt.m31372a(map, C15799xcceb09c3.f39357f);
        try {
            savedStateRegistry.mo61291j(str2, new C15797a(a));
            z = true;
        } catch (IllegalArgumentException unused) {
            z = false;
        }
        return new C15951q0(a, new C15798xec1ea390(z, savedStateRegistry, str2));
    }

    /* renamed from: e */
    public static final boolean m71050e(Object obj) {
        if (obj instanceof C8665r) {
            C8665r rVar = (C8665r) obj;
            if (rVar.mo15298a() != C8415c2.m30243l() && rVar.mo15298a() != C8415c2.m30254w() && rVar.mo15298a() != C8415c2.m30250s()) {
                return false;
            }
            Object value = rVar.getValue();
            if (value == null) {
                return true;
            }
            return m71050e(value);
        } else if ((obj instanceof C11660u) && (obj instanceof Serializable)) {
            return false;
        } else {
            for (Class<? extends Object> isInstance : f39355a) {
                if (isInstance.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: f */
    public static final Bundle m71051f(Map<String, ? extends List<? extends Object>> map) {
        ArrayList arrayList;
        Bundle bundle = new Bundle();
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            List list = (List) next.getValue();
            if (list instanceof ArrayList) {
                arrayList = (ArrayList) list;
            } else {
                arrayList = new ArrayList(list);
            }
            bundle.putParcelableArrayList(str, arrayList);
        }
        return bundle;
    }

    /* renamed from: g */
    public static final Map<String, List<Object>> m71052g(Bundle bundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<String> keySet = bundle.keySet();
        Intrinsics.checkNotNullExpressionValue(keySet, "this.keySet()");
        for (String str : keySet) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(str);
            Intrinsics.checkNotNull(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
            Intrinsics.checkNotNullExpressionValue(str, "key");
            linkedHashMap.put(str, parcelableArrayList);
        }
        return linkedHashMap;
    }
}

package androidx.datastore.preferences;

import androidx.datastore.migrations.C18587b;
import androidx.datastore.preferences.core.C18602a;
import androidx.datastore.preferences.core.C18606c;
import androidx.datastore.preferences.core.MutablePreferences;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.collections.C10978t;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11305q;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1", mo22502f = "SharedPreferencesMigration.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H@"}, mo22516d2 = {"Landroidx/datastore/migrations/b;", "sharedPrefs", "Landroidx/datastore/preferences/core/a;", "currentData", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class SharedPreferencesMigrationKt$getMigrationFunction$1 extends SuspendLambda implements C11305q<C18587b, C18602a, C11045c<? super C18602a>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public SharedPreferencesMigrationKt$getMigrationFunction$1(C11045c<? super SharedPreferencesMigrationKt$getMigrationFunction$1> cVar) {
        super(3, cVar);
    }

    @C12580l
    public final Object invoke(@C12579k C18587b bVar, @C12579k C18602a aVar, @C12580l C11045c<? super C18602a> cVar) {
        SharedPreferencesMigrationKt$getMigrationFunction$1 sharedPreferencesMigrationKt$getMigrationFunction$1 = new SharedPreferencesMigrationKt$getMigrationFunction$1(cVar);
        sharedPreferencesMigrationKt$getMigrationFunction$1.L$0 = bVar;
        sharedPreferencesMigrationKt$getMigrationFunction$1.L$1 = aVar;
        return sharedPreferencesMigrationKt$getMigrationFunction$1.invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            C18587b bVar = (C18587b) this.L$0;
            C18602a aVar = (C18602a) this.L$1;
            Iterable<C18602a.C18603a> keySet = aVar.mo53692a().keySet();
            ArrayList arrayList = new ArrayList(C10978t.m41495Y(keySet, 10));
            for (C18602a.C18603a a : keySet) {
                arrayList.add(a.mo53719a());
            }
            Map<String, Object> c = bVar.mo53597c();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry next : c.entrySet()) {
                if (C11064a.m42615a(!arrayList.contains((String) next.getKey())).booleanValue()) {
                    linkedHashMap.put(next.getKey(), next.getValue());
                }
            }
            MutablePreferences d = aVar.mo53717d();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Boolean) {
                    d.mo53706o(C18606c.m84359a(str), value);
                } else if (value instanceof Float) {
                    d.mo53706o(C18606c.m84361c(str), value);
                } else if (value instanceof Integer) {
                    d.mo53706o(C18606c.m84362d(str), value);
                } else if (value instanceof Long) {
                    d.mo53706o(C18606c.m84363e(str), value);
                } else if (value instanceof String) {
                    d.mo53706o(C18606c.m84364f(str), value);
                } else if (value instanceof Set) {
                    C18602a.C18603a<Set<String>> g = C18606c.m84365g(str);
                    if (value != null) {
                        d.mo53706o(g, (Set) value);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                    }
                } else {
                    continue;
                }
            }
            return d.mo53718e();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

package androidx.datastore.preferences;

import androidx.datastore.preferences.core.C18602a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
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
import kotlin.jvm.functions.C11304p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1", mo22502f = "SharedPreferencesMigration.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo22516d2 = {"Landroidx/datastore/preferences/core/a;", "prefs", "", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class SharedPreferencesMigrationKt$getShouldRunMigration$1 extends SuspendLambda implements C11304p<C18602a, C11045c<? super Boolean>, Object> {
    final /* synthetic */ Set<String> $keysToMigrate;
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigrationKt$getShouldRunMigration$1(Set<String> set, C11045c<? super SharedPreferencesMigrationKt$getShouldRunMigration$1> cVar) {
        super(2, cVar);
        this.$keysToMigrate = set;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        SharedPreferencesMigrationKt$getShouldRunMigration$1 sharedPreferencesMigrationKt$getShouldRunMigration$1 = new SharedPreferencesMigrationKt$getShouldRunMigration$1(this.$keysToMigrate, cVar);
        sharedPreferencesMigrationKt$getShouldRunMigration$1.L$0 = obj;
        return sharedPreferencesMigrationKt$getShouldRunMigration$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C18602a aVar, @C12580l C11045c<? super Boolean> cVar) {
        return ((SharedPreferencesMigrationKt$getShouldRunMigration$1) create(aVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            Iterable<C18602a.C18603a> keySet = ((C18602a) this.L$0).mo53692a().keySet();
            ArrayList arrayList = new ArrayList(C10978t.m41495Y(keySet, 10));
            for (C18602a.C18603a a : keySet) {
                arrayList.add(a.mo53719a());
            }
            boolean z = true;
            if (this.$keysToMigrate != SharedPreferencesMigrationKt.m84316g()) {
                Iterable iterable = this.$keysToMigrate;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it = iterable.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (C11064a.m42615a(!arrayList.contains((String) it.next())).booleanValue()) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                z = false;
            }
            return C11064a.m42615a(z);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

package androidx.datastore.preferences;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.datastore.migrations.C18587b;
import androidx.datastore.migrations.SharedPreferencesMigration;
import androidx.datastore.preferences.core.C18602a;
import com.urbanairship.iam.events.C9175a;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.coroutines.C11045c;
import kotlin.jvm.C11315i;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class SharedPreferencesMigrationKt {
    @C12579k

    /* renamed from: a */
    public static final Set<String> f47455a = new LinkedHashSet();

    @C12579k
    @C11315i
    /* renamed from: a */
    public static final SharedPreferencesMigration<C18602a> m84310a(@C12579k Context context, @C12579k String str) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(str, "sharedPreferencesName");
        return m84314e(context, str, (Set) null, 4, (Object) null);
    }

    @C12579k
    @C11315i
    /* renamed from: b */
    public static final SharedPreferencesMigration<C18602a> m84311b(@C12579k Context context, @C12579k String str, @C12579k Set<String> set) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(str, "sharedPreferencesName");
        Intrinsics.checkNotNullParameter(set, "keysToMigrate");
        if (set == f47455a) {
            return new SharedPreferencesMigration(context, str, (Set) null, m84318i(set), m84317h(), 4, (DefaultConstructorMarker) null);
        }
        return new SharedPreferencesMigration<>(context, str, set, m84318i(set), m84317h());
    }

    @C12579k
    @C11315i
    /* renamed from: c */
    public static final SharedPreferencesMigration<C18602a> m84312c(@C12579k C11289a<? extends SharedPreferences> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "produceSharedPreferences");
        return m84315f(aVar, (Set) null, 2, (Object) null);
    }

    @C12579k
    @C11315i
    /* renamed from: d */
    public static final SharedPreferencesMigration<C18602a> m84313d(@C12579k C11289a<? extends SharedPreferences> aVar, @C12579k Set<String> set) {
        Intrinsics.checkNotNullParameter(aVar, "produceSharedPreferences");
        Intrinsics.checkNotNullParameter(set, "keysToMigrate");
        if (set != f47455a) {
            return new SharedPreferencesMigration<>(aVar, set, m84318i(set), m84317h());
        }
        return new SharedPreferencesMigration((C11289a) aVar, (Set) null, (C11304p) m84318i(set), (C11305q) m84317h(), 2, (DefaultConstructorMarker) null);
    }

    /* renamed from: e */
    public static /* synthetic */ SharedPreferencesMigration m84314e(Context context, String str, Set<String> set, int i, Object obj) {
        if ((i & 4) != 0) {
            set = f47455a;
        }
        return m84311b(context, str, set);
    }

    /* renamed from: f */
    public static /* synthetic */ SharedPreferencesMigration m84315f(C11289a aVar, Set<String> set, int i, Object obj) {
        if ((i & 2) != 0) {
            set = f47455a;
        }
        return m84313d(aVar, set);
    }

    @C12579k
    /* renamed from: g */
    public static final Set<String> m84316g() {
        return f47455a;
    }

    /* renamed from: h */
    public static final C11305q<C18587b, C18602a, C11045c<? super C18602a>, Object> m84317h() {
        return new SharedPreferencesMigrationKt$getMigrationFunction$1((C11045c<? super SharedPreferencesMigrationKt$getMigrationFunction$1>) null);
    }

    /* renamed from: i */
    public static final C11304p<C18602a, C11045c<? super Boolean>, Object> m84318i(Set<String> set) {
        return new SharedPreferencesMigrationKt$getShouldRunMigration$1(set, (C11045c<? super SharedPreferencesMigrationKt$getShouldRunMigration$1>) null);
    }
}

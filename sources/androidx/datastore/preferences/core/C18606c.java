package androidx.datastore.preferences.core;

import androidx.datastore.preferences.core.C18602a;
import java.util.Set;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11314h(name = "PreferencesKeys")
/* renamed from: androidx.datastore.preferences.core.c */
public final class C18606c {
    @C11314h(name = "booleanKey")
    @C12579k
    /* renamed from: a */
    public static final C18602a.C18603a<Boolean> m84359a(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        return new C18602a.C18603a<>(str);
    }

    @C11314h(name = "doubleKey")
    @C12579k
    /* renamed from: b */
    public static final C18602a.C18603a<Double> m84360b(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        return new C18602a.C18603a<>(str);
    }

    @C11314h(name = "floatKey")
    @C12579k
    /* renamed from: c */
    public static final C18602a.C18603a<Float> m84361c(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        return new C18602a.C18603a<>(str);
    }

    @C11314h(name = "intKey")
    @C12579k
    /* renamed from: d */
    public static final C18602a.C18603a<Integer> m84362d(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        return new C18602a.C18603a<>(str);
    }

    @C11314h(name = "longKey")
    @C12579k
    /* renamed from: e */
    public static final C18602a.C18603a<Long> m84363e(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        return new C18602a.C18603a<>(str);
    }

    @C11314h(name = "stringKey")
    @C12579k
    /* renamed from: f */
    public static final C18602a.C18603a<String> m84364f(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        return new C18602a.C18603a<>(str);
    }

    @C11314h(name = "stringSetKey")
    @C12579k
    /* renamed from: g */
    public static final C18602a.C18603a<Set<String>> m84365g(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        return new C18602a.C18603a<>(str);
    }
}

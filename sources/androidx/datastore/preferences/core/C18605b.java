package androidx.datastore.preferences.core;

import androidx.datastore.preferences.core.C18602a;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11314h(name = "PreferencesFactory")
/* renamed from: androidx.datastore.preferences.core.b */
public final class C18605b {
    @C11314h(name = "create")
    @C12579k
    /* renamed from: a */
    public static final C18602a m84356a(@C12579k C18602a.C18604b<?>... bVarArr) {
        Intrinsics.checkNotNullParameter(bVarArr, "pairs");
        return m84358c((C18602a.C18604b[]) Arrays.copyOf(bVarArr, bVarArr.length));
    }

    @C11314h(name = "createEmpty")
    @C12579k
    /* renamed from: b */
    public static final C18602a m84357b() {
        return new MutablePreferences((Map) null, true, 1, (DefaultConstructorMarker) null);
    }

    @C11314h(name = "createMutable")
    @C12579k
    /* renamed from: c */
    public static final MutablePreferences m84358c(@C12579k C18602a.C18604b<?>... bVarArr) {
        Intrinsics.checkNotNullParameter(bVarArr, "pairs");
        MutablePreferences mutablePreferences = new MutablePreferences((Map) null, false, 1, (DefaultConstructorMarker) null);
        mutablePreferences.mo53704m((C18602a.C18604b[]) Arrays.copyOf(bVarArr, bVarArr.length));
        return mutablePreferences;
    }
}

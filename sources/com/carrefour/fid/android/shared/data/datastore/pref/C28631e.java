package com.carrefour.fid.android.shared.data.datastore.pref;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.shared.data.datastore.pref.e */
public final class C28631e {

    /* renamed from: b */
    public static final int f70210b = 0;
    @C12579k

    /* renamed from: a */
    public final String f70211a;

    public C28631e(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "uuid");
        this.f70211a = str;
    }

    /* renamed from: c */
    public static /* synthetic */ C28631e m118543c(C28631e eVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eVar.f70211a;
        }
        return eVar.mo83519b(str);
    }

    @C12579k
    /* renamed from: a */
    public final String mo83518a() {
        return this.f70211a;
    }

    @C12579k
    /* renamed from: b */
    public final C28631e mo83519b(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "uuid");
        return new C28631e(str);
    }

    @C12579k
    /* renamed from: d */
    public final String mo83520d() {
        return this.f70211a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28631e) && Intrinsics.areEqual((Object) this.f70211a, (Object) ((C28631e) obj).f70211a);
    }

    public int hashCode() {
        return this.f70211a.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.f70211a;
        return "BasePreferences(uuid=" + str + ")";
    }
}

package androidx.constraintlayout.compose;

import com.google.firebase.crashlytics.C32648f;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.constraintlayout.compose.p */
public final class C16620p {
    @C12579k

    /* renamed from: a */
    public String f41293a;
    @C12579k

    /* renamed from: b */
    public String f41294b;
    @C12579k

    /* renamed from: c */
    public HashMap<String, String> f41295c;

    public C16620p(@C12579k String str, @C12579k String str2, @C12579k HashMap<String, String> hashMap) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "type");
        Intrinsics.checkNotNullParameter(hashMap, C32648f.f79206e);
        this.f41293a = str;
        this.f41294b = str2;
        this.f41295c = hashMap;
    }

    /* renamed from: e */
    public static /* synthetic */ C16620p m75596e(C16620p pVar, String str, String str2, HashMap<String, String> hashMap, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pVar.f41293a;
        }
        if ((i & 2) != 0) {
            str2 = pVar.f41294b;
        }
        if ((i & 4) != 0) {
            hashMap = pVar.f41295c;
        }
        return pVar.mo48554d(str, str2, hashMap);
    }

    @C12579k
    /* renamed from: a */
    public final String mo48551a() {
        return this.f41293a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo48552b() {
        return this.f41294b;
    }

    @C12579k
    /* renamed from: c */
    public final HashMap<String, String> mo48553c() {
        return this.f41295c;
    }

    @C12579k
    /* renamed from: d */
    public final C16620p mo48554d(@C12579k String str, @C12579k String str2, @C12579k HashMap<String, String> hashMap) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "type");
        Intrinsics.checkNotNullParameter(hashMap, C32648f.f79206e);
        return new C16620p(str, str2, hashMap);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16620p)) {
            return false;
        }
        C16620p pVar = (C16620p) obj;
        return Intrinsics.areEqual((Object) this.f41293a, (Object) pVar.f41293a) && Intrinsics.areEqual((Object) this.f41294b, (Object) pVar.f41294b) && Intrinsics.areEqual((Object) this.f41295c, (Object) pVar.f41295c);
    }

    @C12579k
    /* renamed from: f */
    public final String mo48556f() {
        return this.f41293a;
    }

    @C12579k
    /* renamed from: g */
    public final HashMap<String, String> mo48557g() {
        return this.f41295c;
    }

    @C12579k
    /* renamed from: h */
    public final String mo48558h() {
        return this.f41294b;
    }

    public int hashCode() {
        return (((this.f41293a.hashCode() * 31) + this.f41294b.hashCode()) * 31) + this.f41295c.hashCode();
    }

    /* renamed from: i */
    public final void mo48560i(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f41293a = str;
    }

    /* renamed from: j */
    public final void mo48561j(@C12579k HashMap<String, String> hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "<set-?>");
        this.f41295c = hashMap;
    }

    /* renamed from: k */
    public final void mo48562k(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f41294b = str;
    }

    @C12579k
    public String toString() {
        return "DesignElement(id=" + this.f41293a + ", type=" + this.f41294b + ", params=" + this.f41295c + ')';
    }
}

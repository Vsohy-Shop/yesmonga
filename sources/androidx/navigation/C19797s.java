package androidx.navigation;

import androidx.lifecycle.C19392a1;
import androidx.lifecycle.C19476v0;
import androidx.lifecycle.C19502x0;
import androidx.lifecycle.viewmodel.C19477a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.navigation.s */
public final class C19797s extends C19476v0 implements C19789o0 {
    @C12579k

    /* renamed from: b */
    public static final C19799b f50648b = new C19799b((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: c */
    public static final C19502x0.C19506b f50649c = new C19798a();
    @C12579k

    /* renamed from: a */
    public final Map<String, C19392a1> f50650a = new LinkedHashMap();

    /* renamed from: androidx.navigation.s$a */
    public static final class C19798a implements C19502x0.C19506b {
        @C12579k
        /* renamed from: b */
        public <T extends C19476v0> T mo21645b(@C12579k Class<T> cls) {
            Intrinsics.checkNotNullParameter(cls, "modelClass");
            return new C19797s();
        }
    }

    /* renamed from: androidx.navigation.s$b */
    public static final class C19799b {
        public /* synthetic */ C19799b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C19797s mo58568a(@C12579k C19392a1 a1Var) {
            Intrinsics.checkNotNullParameter(a1Var, "viewModelStore");
            return (C19797s) new C19502x0(a1Var, C19797s.f50649c, (C19477a) null, 4, (DefaultConstructorMarker) null).mo57693a(C19797s.class);
        }

        public C19799b() {
        }
    }

    @C12579k
    @C11384m
    /* renamed from: e0 */
    public static final C19797s m92061e0(@C12579k C19392a1 a1Var) {
        return f50648b.mo58568a(a1Var);
    }

    /* renamed from: d0 */
    public final void mo58566d0(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "backStackEntryId");
        C19392a1 remove = this.f50650a.remove(str);
        if (remove != null) {
            remove.mo57550a();
        }
    }

    @C12579k
    /* renamed from: e */
    public C19392a1 mo58549e(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "backStackEntryId");
        C19392a1 a1Var = this.f50650a.get(str);
        if (a1Var != null) {
            return a1Var;
        }
        C19392a1 a1Var2 = new C19392a1();
        this.f50650a.put(str, a1Var2);
        return a1Var2;
    }

    public void onCleared() {
        for (C19392a1 a : this.f50650a.values()) {
            a.mo57550a();
        }
        this.f50650a.clear();
    }

    @C12579k
    public String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator<String> it = this.f50650a.keySet().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }
}

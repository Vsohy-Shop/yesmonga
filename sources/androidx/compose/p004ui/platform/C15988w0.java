package androidx.compose.p004ui.platform;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.constant.C28531e0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.C11559m;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.platform.w0 */
public abstract class C15988w0 implements C15977u0 {

    /* renamed from: c */
    public static final int f39684c = 8;
    @C12579k

    /* renamed from: a */
    public final C11300l<C15983v0, C11079d2> f39685a;
    @C12580l

    /* renamed from: b */
    public C15983v0 f39686b;

    public C15988w0(@C12579k C11300l<? super C15983v0, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, C28531e0.f69094x);
        this.f39685a = lVar;
    }

    @C12580l
    /* renamed from: b */
    public Object mo9174b() {
        return mo45975q().mo45972c();
    }

    @C12579k
    /* renamed from: n */
    public C11559m<C15846a4> mo45180n() {
        return mo45975q().mo45971b();
    }

    @C12580l
    /* renamed from: o */
    public String mo45181o() {
        return mo45975q().mo45970a();
    }

    /* renamed from: q */
    public final C15983v0 mo45975q() {
        C15983v0 v0Var = this.f39686b;
        if (v0Var == null) {
            v0Var = new C15983v0();
            this.f39685a.invoke(v0Var);
        }
        this.f39686b = v0Var;
        return v0Var;
    }
}

package androidx.compose.p004ui.platform;

import androidx.compose.p004ui.C8761g;
import androidx.compose.p004ui.input.pointer.C15479h0;
import androidx.compose.p004ui.input.pointer.C15495r;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8700z0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.platform.m4 */
public final class C15928m4 implements C15922l4 {
    @C12579k

    /* renamed from: b */
    public static final C15929a f39618b = new C15929a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: c */
    public static final C8700z0<C15479h0> f39619c = C8539f2.m30981g(C15479h0.m68604a(C15495r.m68719a()), (C8410b2) null, 2, (Object) null);
    @C12579k

    /* renamed from: a */
    public final C8700z0<Boolean> f39620a = C8539f2.m30981g(Boolean.FALSE, (C8410b2) null, 2, (Object) null);

    /* renamed from: androidx.compose.ui.platform.m4$a */
    public static final class C15929a {
        public /* synthetic */ C15929a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C8700z0<C15479h0> mo45846a() {
            return C15928m4.f39619c;
        }

        public C15929a() {
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m71547a() {
    }

    /* renamed from: b */
    public boolean mo45822b() {
        return this.f39620a.getValue().booleanValue();
    }

    @C8761g
    /* renamed from: c */
    public int mo45823c() {
        return f39619c.getValue().mo44065g();
    }

    /* renamed from: e */
    public void mo45844e(int i) {
        f39619c.setValue(C15479h0.m68604a(i));
    }

    /* renamed from: f */
    public void mo45845f(boolean z) {
        this.f39620a.setValue(Boolean.valueOf(z));
    }
}

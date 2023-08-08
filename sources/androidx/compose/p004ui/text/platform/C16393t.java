package androidx.compose.p004ui.text.platform;

import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8700z0;
import androidx.emoji2.text.C19019f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.text.platform.t */
public final class C16393t implements C16396v {
    @C12580l

    /* renamed from: a */
    public C8578k2<Boolean> f40649a;

    /* renamed from: androidx.compose.ui.text.platform.t$a */
    public static final class C16394a extends C19019f.C19027g {

        /* renamed from: a */
        public final /* synthetic */ C8700z0<Boolean> f40650a;

        /* renamed from: b */
        public final /* synthetic */ C16393t f40651b;

        public C16394a(C8700z0<Boolean> z0Var, C16393t tVar) {
            this.f40650a = z0Var;
            this.f40651b = tVar;
        }

        /* renamed from: a */
        public void mo3108a(@C12580l Throwable th) {
            this.f40651b.f40649a = C16397w.f40654a;
        }

        /* renamed from: b */
        public void mo3109b() {
            this.f40650a.setValue(Boolean.TRUE);
            this.f40651b.f40649a = new C16398x(true);
        }
    }

    public C16393t() {
        C8578k2<Boolean> k2Var;
        if (C19019f.m88870q()) {
            k2Var = mo47570c();
        } else {
            k2Var = null;
        }
        this.f40649a = k2Var;
    }

    @C12579k
    /* renamed from: a */
    public C8578k2<Boolean> mo47569a() {
        C8578k2<Boolean> k2Var = this.f40649a;
        if (k2Var != null) {
            Intrinsics.checkNotNull(k2Var);
            return k2Var;
        } else if (!C19019f.m88870q()) {
            return C16397w.f40654a;
        } else {
            C8578k2<Boolean> c = mo47570c();
            this.f40649a = c;
            Intrinsics.checkNotNull(c);
            return c;
        }
    }

    /* renamed from: c */
    public final C8578k2<Boolean> mo47570c() {
        C19019f c = C19019f.m88864c();
        Intrinsics.checkNotNullExpressionValue(c, "get()");
        if (c.mo55965i() == 1) {
            return new C16398x(true);
        }
        C8700z0 k = C8539f2.m30981g(Boolean.FALSE, (C8410b2) null, 2, (Object) null);
        c.mo55957B(new C16394a(k, this));
        return k;
    }
}

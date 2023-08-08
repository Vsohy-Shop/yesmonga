package okio;

import com.carrefour.fid.android.shared.constant.C28534f;
import java.io.Closeable;
import kotlin.C11414o;
import kotlin.jvm.C11314h;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: okio.e0 */
public final /* synthetic */ class C12469e0 {
    @C11314h(name = "blackhole")
    @C12579k
    /* renamed from: a */
    public static final C12506n0 m50524a() {
        return new C12497l();
    }

    @C12579k
    /* renamed from: b */
    public static final C12505n m50525b(@C12579k C12506n0 n0Var) {
        Intrinsics.checkNotNullParameter(n0Var, "$this$buffer");
        return new C12488j0(n0Var);
    }

    @C12579k
    /* renamed from: c */
    public static final C12507o m50526c(@C12579k C12510p0 p0Var) {
        Intrinsics.checkNotNullParameter(p0Var, "$this$buffer");
        return new C12495k0(p0Var);
    }

    /* renamed from: d */
    public static final <T extends Closeable, R> R m50527d(T t, @C12579k C11300l<? super T, ? extends R> lVar) {
        R r;
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        Throwable th = null;
        try {
            r = lVar.invoke(t);
        } catch (Throwable th2) {
            th = th2;
            r = null;
        }
        if (t != null) {
            try {
                t.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                } else {
                    C11414o.m43942a(th, th3);
                }
            }
        }
        if (th == null) {
            Intrinsics.checkNotNull(r);
            return r;
        }
        throw th;
    }
}

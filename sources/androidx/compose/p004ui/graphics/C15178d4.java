package androidx.compose.p004ui.graphics;

import android.graphics.Shader;
import com.urbanairship.iam.C9127a0;
import com.usabilla.sdk.ubform.net.parser.C9874a;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.graphics.d4 */
public final class C15178d4 {
    @C12579k
    /* renamed from: a */
    public static final Shader m65579a(@C12579k C15403w2 w2Var, int i, int i2) {
        Intrinsics.checkNotNullParameter(w2Var, C9127a0.f24709d);
        return C15401w0.m67259a(w2Var, i, i2);
    }

    /* renamed from: b */
    public static /* synthetic */ Shader m65580b(C15403w2 w2Var, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = C15268m4.f37596b.mo42908a();
        }
        if ((i3 & 4) != 0) {
            i2 = C15268m4.f37596b.mo42908a();
        }
        return m65579a(w2Var, i, i2);
    }

    @C12579k
    /* renamed from: c */
    public static final Shader m65581c(long j, long j2, @C12579k List<C15240j2> list, @C12580l List<Float> list2, int i) {
        Intrinsics.checkNotNullParameter(list, C9874a.f27063h);
        return C15401w0.m67260b(j, j2, list, list2, i);
    }

    /* renamed from: d */
    public static /* synthetic */ Shader m65582d(long j, long j2, List list, List list2, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            list2 = null;
        }
        List list3 = list2;
        if ((i2 & 16) != 0) {
            i = C15268m4.f37596b.mo42908a();
        }
        return m65581c(j, j2, list, list3, i);
    }

    @C12579k
    /* renamed from: e */
    public static final Shader m65583e(long j, float f, @C12579k List<C15240j2> list, @C12580l List<Float> list2, int i) {
        Intrinsics.checkNotNullParameter(list, C9874a.f27063h);
        return C15401w0.m67261c(j, f, list, list2, i);
    }

    /* renamed from: f */
    public static /* synthetic */ Shader m65584f(long j, float f, List list, List list2, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            list2 = null;
        }
        List list3 = list2;
        if ((i2 & 16) != 0) {
            i = C15268m4.f37596b.mo42908a();
        }
        return m65583e(j, f, list, list3, i);
    }

    @C12579k
    /* renamed from: g */
    public static final Shader m65585g(long j, @C12579k List<C15240j2> list, @C12580l List<Float> list2) {
        Intrinsics.checkNotNullParameter(list, C9874a.f27063h);
        return C15401w0.m67262d(j, list, list2);
    }

    /* renamed from: h */
    public static /* synthetic */ Shader m65586h(long j, List list, List list2, int i, Object obj) {
        if ((i & 4) != 0) {
            list2 = null;
        }
        return m65585g(j, list, list2);
    }
}

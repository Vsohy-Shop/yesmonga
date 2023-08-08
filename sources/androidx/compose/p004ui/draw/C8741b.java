package androidx.compose.p004ui.draw;

import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15321t3;
import androidx.compose.runtime.C8585m0;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11288f
@C8585m0
/* renamed from: androidx.compose.ui.draw.b */
public final class C8741b {
    @C12579k

    /* renamed from: b */
    public static final C8742a f23445b = new C8742a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: c */
    public static final C15218g4 f23446c = m32504d(C15321t3.m66567a());
    @C12579k

    /* renamed from: d */
    public static final C15218g4 f23447d = m32504d((C15218g4) null);
    @C12580l

    /* renamed from: a */
    public final C15218g4 f23448a;

    /* renamed from: androidx.compose.ui.draw.b$a */
    public static final class C8742a {
        public /* synthetic */ C8742a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C15218g4 mo17166a() {
            return C8741b.f23446c;
        }

        @C12579k
        /* renamed from: b */
        public final C15218g4 mo17167b() {
            return C8741b.f23447d;
        }

        public C8742a() {
        }
    }

    public /* synthetic */ C8741b(C15218g4 g4Var) {
        this.f23448a = g4Var;
    }

    /* renamed from: c */
    public static final /* synthetic */ C8741b m32503c(C15218g4 g4Var) {
        return new C8741b(g4Var);
    }

    @C12579k
    /* renamed from: d */
    public static C15218g4 m32504d(@C12580l C15218g4 g4Var) {
        return g4Var;
    }

    /* renamed from: e */
    public static boolean m32505e(C15218g4 g4Var, Object obj) {
        return (obj instanceof C8741b) && Intrinsics.areEqual((Object) g4Var, (Object) ((C8741b) obj).mo17164j());
    }

    /* renamed from: f */
    public static final boolean m32506f(C15218g4 g4Var, C15218g4 g4Var2) {
        return Intrinsics.areEqual((Object) g4Var, (Object) g4Var2);
    }

    /* renamed from: h */
    public static int m32507h(C15218g4 g4Var) {
        if (g4Var == null) {
            return 0;
        }
        return g4Var.hashCode();
    }

    /* renamed from: i */
    public static String m32508i(C15218g4 g4Var) {
        return "BlurredEdgeTreatment(shape=" + g4Var + ')';
    }

    public boolean equals(Object obj) {
        return m32505e(this.f23448a, obj);
    }

    @C12580l
    /* renamed from: g */
    public final C15218g4 mo17162g() {
        return this.f23448a;
    }

    public int hashCode() {
        return m32507h(this.f23448a);
    }

    /* renamed from: j */
    public final /* synthetic */ C15218g4 mo17164j() {
        return this.f23448a;
    }

    public String toString() {
        return m32508i(this.f23448a);
    }
}

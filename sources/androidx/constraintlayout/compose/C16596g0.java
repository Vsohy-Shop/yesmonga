package androidx.constraintlayout.compose;

import androidx.compose.foundation.layout.C2429z;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.C16506u;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11532s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C2429z
@C8567o(parameters = 0)
/* renamed from: androidx.constraintlayout.compose.g0 */
public final class C16596g0 {

    /* renamed from: b */
    public static final int f41241b = 8;
    @C12579k

    /* renamed from: a */
    public MotionMeasurer f41242a;

    @C8567o(parameters = 0)
    /* renamed from: androidx.constraintlayout.compose.g0$a */
    public static final class C16597a {

        /* renamed from: d */
        public static final int f41243d = 8;
        @C12579k

        /* renamed from: a */
        public String f41244a;
        @C12580l

        /* renamed from: b */
        public Void f41245b;
        @C12579k

        /* renamed from: c */
        public MotionMeasurer f41246c;

        public C16597a(@C12579k String str, @C12580l String str2, @C12579k MotionMeasurer motionMeasurer) {
            Intrinsics.checkNotNullParameter(str, "id");
            Intrinsics.checkNotNullParameter(motionMeasurer, "measurer");
            this.f41244a = str;
            this.f41246c = motionMeasurer;
        }

        /* renamed from: a */
        public final long mo48506a(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "name");
            return this.f41246c.mo48432O(this.f41244a, str);
        }

        /* renamed from: b */
        public final float mo48507b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "name");
            return C16483g.m74435M(this.f41246c.mo48433P(this.f41244a, str));
        }

        /* renamed from: c */
        public final float mo48508c(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "name");
            return this.f41246c.mo48433P(this.f41244a, str);
        }

        /* renamed from: d */
        public final long mo48509d(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "name");
            return C16506u.m74711l(this.f41246c.mo48433P(this.f41244a, str));
        }

        @C12579k
        /* renamed from: e */
        public final String mo48510e() {
            return this.f41244a;
        }

        /* renamed from: f */
        public final int mo48511f(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "name");
            return (int) this.f41246c.mo48433P(this.f41244a, str);
        }

        @C12580l
        /* renamed from: g */
        public final String mo48512g() {
            return (String) this.f41245b;
        }
    }

    @C11532s0
    public C16596g0(@C12579k MotionMeasurer motionMeasurer) {
        Intrinsics.checkNotNullParameter(motionMeasurer, "measurer");
        this.f41242a = motionMeasurer;
    }

    /* renamed from: a */
    public final long mo48499a(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "name");
        return this.f41242a.mo48432O(str, str2);
    }

    /* renamed from: b */
    public final float mo48500b(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "name");
        return C16483g.m74435M(this.f41242a.mo48433P(str, str2));
    }

    /* renamed from: c */
    public final float mo48501c(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "name");
        return this.f41242a.mo48433P(str, str2);
    }

    /* renamed from: d */
    public final long mo48502d(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "name");
        return C16506u.m74711l(this.f41242a.mo48433P(str, str2));
    }

    /* renamed from: e */
    public final int mo48503e(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "name");
        return (int) this.f41242a.mo48433P(str, str2);
    }

    @C8540g
    @C12579k
    /* renamed from: f */
    public final C8700z0<C16597a> mo48504f(@C12579k String str, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(str, "id");
        oVar.mo14918M(-1035552373);
        oVar.mo14918M(-3687241);
        Object N = oVar.mo14921N();
        if (N == C8592o.f23032a.mo16277a()) {
            N = C8539f2.m30981g(new C16597a(str, (String) null, this.f41242a), (C8410b2) null, 2, (Object) null);
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        C8700z0<C16597a> z0Var = (C8700z0) N;
        oVar.mo15002m0();
        return z0Var;
    }

    @C12579k
    /* renamed from: g */
    public final C16597a mo48505g(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "tag");
        return new C16597a(str, str2, this.f41242a);
    }
}

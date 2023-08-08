package androidx.camera.core;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.util.C18001r;
import java.util.ArrayList;
import java.util.List;

@C1631k0
/* renamed from: androidx.camera.core.p3 */
public final class C1667p3 {
    @C0363p0

    /* renamed from: a */
    public final C1394e4 f4643a;
    @C0359n0

    /* renamed from: b */
    public final List<UseCase> f4644b;

    @C1631k0
    /* renamed from: androidx.camera.core.p3$a */
    public static final class C1668a {

        /* renamed from: a */
        public C1394e4 f4645a;

        /* renamed from: b */
        public final List<UseCase> f4646b = new ArrayList();

        @C0359n0
        /* renamed from: a */
        public C1668a mo5660a(@C0359n0 UseCase useCase) {
            this.f4646b.add(useCase);
            return this;
        }

        @C0359n0
        /* renamed from: b */
        public C1667p3 mo5661b() {
            C18001r.m81765b(!this.f4646b.isEmpty(), "UseCase must not be empty.");
            return new C1667p3(this.f4645a, this.f4646b);
        }

        @C0359n0
        /* renamed from: c */
        public C1668a mo5662c(@C0359n0 C1394e4 e4Var) {
            this.f4645a = e4Var;
            return this;
        }
    }

    public C1667p3(@C0363p0 C1394e4 e4Var, @C0359n0 List<UseCase> list) {
        this.f4643a = e4Var;
        this.f4644b = list;
    }

    @C0359n0
    /* renamed from: a */
    public List<UseCase> mo5658a() {
        return this.f4644b;
    }

    @C0363p0
    /* renamed from: b */
    public C1394e4 mo5659b() {
        return this.f4643a;
    }
}

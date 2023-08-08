package androidx.work;

import android.annotation.SuppressLint;
import androidx.annotation.C0359n0;
import androidx.work.WorkInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/* renamed from: androidx.work.v */
public final class C21412v {

    /* renamed from: a */
    public final List<UUID> f55151a;

    /* renamed from: b */
    public final List<String> f55152b;

    /* renamed from: c */
    public final List<String> f55153c;

    /* renamed from: d */
    public final List<WorkInfo.State> f55154d;

    /* renamed from: androidx.work.v$a */
    public static final class C21413a {

        /* renamed from: a */
        public List<UUID> f55155a = new ArrayList();

        /* renamed from: b */
        public List<String> f55156b = new ArrayList();

        /* renamed from: c */
        public List<String> f55157c = new ArrayList();

        /* renamed from: d */
        public List<WorkInfo.State> f55158d = new ArrayList();

        @SuppressLint({"BuilderSetStyle"})
        @C0359n0
        /* renamed from: f */
        public static C21413a m98719f(@C0359n0 List<UUID> list) {
            C21413a aVar = new C21413a();
            aVar.mo63852a(list);
            return aVar;
        }

        @SuppressLint({"BuilderSetStyle"})
        @C0359n0
        /* renamed from: g */
        public static C21413a m98720g(@C0359n0 List<WorkInfo.State> list) {
            C21413a aVar = new C21413a();
            aVar.mo63853b(list);
            return aVar;
        }

        @SuppressLint({"BuilderSetStyle"})
        @C0359n0
        /* renamed from: h */
        public static C21413a m98721h(@C0359n0 List<String> list) {
            C21413a aVar = new C21413a();
            aVar.mo63854c(list);
            return aVar;
        }

        @SuppressLint({"BuilderSetStyle"})
        @C0359n0
        /* renamed from: i */
        public static C21413a m98722i(@C0359n0 List<String> list) {
            C21413a aVar = new C21413a();
            aVar.mo63855d(list);
            return aVar;
        }

        @C0359n0
        /* renamed from: a */
        public C21413a mo63852a(@C0359n0 List<UUID> list) {
            this.f55155a.addAll(list);
            return this;
        }

        @C0359n0
        /* renamed from: b */
        public C21413a mo63853b(@C0359n0 List<WorkInfo.State> list) {
            this.f55158d.addAll(list);
            return this;
        }

        @C0359n0
        /* renamed from: c */
        public C21413a mo63854c(@C0359n0 List<String> list) {
            this.f55157c.addAll(list);
            return this;
        }

        @C0359n0
        /* renamed from: d */
        public C21413a mo63855d(@C0359n0 List<String> list) {
            this.f55156b.addAll(list);
            return this;
        }

        @C0359n0
        /* renamed from: e */
        public C21412v mo63856e() {
            if (!this.f55155a.isEmpty() || !this.f55156b.isEmpty() || !this.f55157c.isEmpty() || !this.f55158d.isEmpty()) {
                return new C21412v(this);
            }
            throw new IllegalArgumentException("Must specify ids, uniqueNames, tags or states when building a WorkQuery");
        }
    }

    public C21412v(@C0359n0 C21413a aVar) {
        this.f55151a = aVar.f55155a;
        this.f55152b = aVar.f55156b;
        this.f55153c = aVar.f55157c;
        this.f55154d = aVar.f55158d;
    }

    @C0359n0
    /* renamed from: a */
    public static C21412v m98707a(@C0359n0 List<UUID> list) {
        return C21413a.m98719f(list).mo63856e();
    }

    @C0359n0
    /* renamed from: b */
    public static C21412v m98708b(@C0359n0 UUID... uuidArr) {
        return m98707a(Arrays.asList(uuidArr));
    }

    @C0359n0
    /* renamed from: c */
    public static C21412v m98709c(@C0359n0 List<WorkInfo.State> list) {
        return C21413a.m98720g(list).mo63856e();
    }

    @C0359n0
    /* renamed from: d */
    public static C21412v m98710d(@C0359n0 WorkInfo.State... stateArr) {
        return C21413a.m98720g(Arrays.asList(stateArr)).mo63856e();
    }

    @C0359n0
    /* renamed from: e */
    public static C21412v m98711e(@C0359n0 List<String> list) {
        return C21413a.m98721h(list).mo63856e();
    }

    @C0359n0
    /* renamed from: f */
    public static C21412v m98712f(@C0359n0 String... strArr) {
        return m98711e(Arrays.asList(strArr));
    }

    @C0359n0
    /* renamed from: g */
    public static C21412v m98713g(@C0359n0 List<String> list) {
        return C21413a.m98722i(list).mo63856e();
    }

    @C0359n0
    /* renamed from: h */
    public static C21412v m98714h(@C0359n0 String... strArr) {
        return C21413a.m98722i(Arrays.asList(strArr)).mo63856e();
    }

    @C0359n0
    /* renamed from: i */
    public List<UUID> mo63848i() {
        return this.f55151a;
    }

    @C0359n0
    /* renamed from: j */
    public List<WorkInfo.State> mo63849j() {
        return this.f55154d;
    }

    @C0359n0
    /* renamed from: k */
    public List<String> mo63850k() {
        return this.f55153c;
    }

    @C0359n0
    /* renamed from: l */
    public List<String> mo63851l() {
        return this.f55152b;
    }
}

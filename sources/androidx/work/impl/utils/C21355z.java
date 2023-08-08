package androidx.work.impl.utils;

import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.work.C21412v;
import androidx.work.WorkInfo;
import androidx.work.impl.C21191g0;
import androidx.work.impl.model.C21249u;
import androidx.work.impl.utils.futures.C21317a;
import com.google.common.util.concurrent.C32487a;
import java.util.List;
import java.util.UUID;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.utils.z */
public abstract class C21355z<T> implements Runnable {

    /* renamed from: a */
    public final C21317a<T> f55073a = C21317a.m98425v();

    /* renamed from: androidx.work.impl.utils.z$a */
    public class C21356a extends C21355z<List<WorkInfo>> {

        /* renamed from: b */
        public final /* synthetic */ C21191g0 f55074b;

        /* renamed from: c */
        public final /* synthetic */ List f55075c;

        public C21356a(C21191g0 g0Var, List list) {
            this.f55074b = g0Var;
            this.f55075c = list;
        }

        /* renamed from: h */
        public List<WorkInfo> mo63711g() {
            return C21249u.f54803x.apply(this.f55074b.mo63363P().mo63207X().mo63526I(this.f55075c));
        }
    }

    /* renamed from: androidx.work.impl.utils.z$b */
    public class C21357b extends C21355z<WorkInfo> {

        /* renamed from: b */
        public final /* synthetic */ C21191g0 f55076b;

        /* renamed from: c */
        public final /* synthetic */ UUID f55077c;

        public C21357b(C21191g0 g0Var, UUID uuid) {
            this.f55076b = g0Var;
            this.f55077c = uuid;
        }

        /* renamed from: h */
        public WorkInfo mo63711g() {
            C21249u.C21252c j = this.f55076b.mo63363P().mo63207X().mo63537j(this.f55077c.toString());
            if (j != null) {
                return j.mo63517w();
            }
            return null;
        }
    }

    /* renamed from: androidx.work.impl.utils.z$c */
    public class C21358c extends C21355z<List<WorkInfo>> {

        /* renamed from: b */
        public final /* synthetic */ C21191g0 f55078b;

        /* renamed from: c */
        public final /* synthetic */ String f55079c;

        public C21358c(C21191g0 g0Var, String str) {
            this.f55078b = g0Var;
            this.f55079c = str;
        }

        /* renamed from: h */
        public List<WorkInfo> mo63711g() {
            return C21249u.f54803x.apply(this.f55078b.mo63363P().mo63207X().mo63523F(this.f55079c));
        }
    }

    /* renamed from: androidx.work.impl.utils.z$d */
    public class C21359d extends C21355z<List<WorkInfo>> {

        /* renamed from: b */
        public final /* synthetic */ C21191g0 f55080b;

        /* renamed from: c */
        public final /* synthetic */ String f55081c;

        public C21359d(C21191g0 g0Var, String str) {
            this.f55080b = g0Var;
            this.f55081c = str;
        }

        /* renamed from: h */
        public List<WorkInfo> mo63711g() {
            return C21249u.f54803x.apply(this.f55080b.mo63363P().mo63207X().mo63544q(this.f55081c));
        }
    }

    /* renamed from: androidx.work.impl.utils.z$e */
    public class C21360e extends C21355z<List<WorkInfo>> {

        /* renamed from: b */
        public final /* synthetic */ C21191g0 f55082b;

        /* renamed from: c */
        public final /* synthetic */ C21412v f55083c;

        public C21360e(C21191g0 g0Var, C21412v vVar) {
            this.f55082b = g0Var;
            this.f55083c = vVar;
        }

        /* renamed from: h */
        public List<WorkInfo> mo63711g() {
            return C21249u.f54803x.apply(this.f55082b.mo63363P().mo63203T().mo63410a(C21351w.m98481b(this.f55083c)));
        }
    }

    @C0359n0
    /* renamed from: a */
    public static C21355z<List<WorkInfo>> m98485a(@C0359n0 C21191g0 g0Var, @C0359n0 List<String> list) {
        return new C21356a(g0Var, list);
    }

    @C0359n0
    /* renamed from: b */
    public static C21355z<List<WorkInfo>> m98486b(@C0359n0 C21191g0 g0Var, @C0359n0 String str) {
        return new C21358c(g0Var, str);
    }

    @C0359n0
    /* renamed from: c */
    public static C21355z<WorkInfo> m98487c(@C0359n0 C21191g0 g0Var, @C0359n0 UUID uuid) {
        return new C21357b(g0Var, uuid);
    }

    @C0359n0
    /* renamed from: d */
    public static C21355z<List<WorkInfo>> m98488d(@C0359n0 C21191g0 g0Var, @C0359n0 String str) {
        return new C21359d(g0Var, str);
    }

    @C0359n0
    /* renamed from: e */
    public static C21355z<List<WorkInfo>> m98489e(@C0359n0 C21191g0 g0Var, @C0359n0 C21412v vVar) {
        return new C21360e(g0Var, vVar);
    }

    @C0359n0
    /* renamed from: f */
    public C32487a<T> mo63710f() {
        return this.f55073a;
    }

    @C0348i1
    /* renamed from: g */
    public abstract T mo63711g();

    public void run() {
        try {
            this.f55073a.mo63659p(mo63711g());
        } catch (Throwable th) {
            this.f55073a.mo63660r(th);
        }
    }
}

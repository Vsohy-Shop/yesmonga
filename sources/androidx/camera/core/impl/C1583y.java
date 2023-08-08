package androidx.camera.core.impl;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.camera.core.impl.Config;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: androidx.camera.core.impl.y */
public final class C1583y {

    /* renamed from: g */
    public static final Config.C1421a<Integer> f4496g = Config.C1421a.m5980a("camerax.core.captureConfig.rotation", Integer.TYPE);

    /* renamed from: h */
    public static final Config.C1421a<Integer> f4497h = Config.C1421a.m5980a("camerax.core.captureConfig.jpegQuality", Integer.class);

    /* renamed from: a */
    public final List<DeferrableSurface> f4498a;

    /* renamed from: b */
    public final Config f4499b;

    /* renamed from: c */
    public final int f4500c;

    /* renamed from: d */
    public final List<C1448f> f4501d;

    /* renamed from: e */
    public final boolean f4502e;
    @C0359n0

    /* renamed from: f */
    public final C1472k1 f4503f;

    /* renamed from: androidx.camera.core.impl.y$b */
    public interface C1585b {
        /* renamed from: a */
        void mo4282a(@C0359n0 C1488o1<?> o1Var, @C0359n0 C1584a aVar);
    }

    public C1583y(List<DeferrableSurface> list, Config config, int i, List<C1448f> list2, boolean z, @C0359n0 C1472k1 k1Var) {
        this.f4498a = list;
        this.f4499b = config;
        this.f4500c = i;
        this.f4501d = Collections.unmodifiableList(list2);
        this.f4502e = z;
        this.f4503f = k1Var;
    }

    @C0359n0
    /* renamed from: a */
    public static C1583y m6545a() {
        return new C1584a().mo5560h();
    }

    @C0359n0
    /* renamed from: b */
    public List<C1448f> mo5547b() {
        return this.f4501d;
    }

    @C0359n0
    /* renamed from: c */
    public Config mo5548c() {
        return this.f4499b;
    }

    @C0359n0
    /* renamed from: d */
    public List<DeferrableSurface> mo5549d() {
        return Collections.unmodifiableList(this.f4498a);
    }

    @C0359n0
    /* renamed from: e */
    public C1472k1 mo5550e() {
        return this.f4503f;
    }

    /* renamed from: f */
    public int mo5551f() {
        return this.f4500c;
    }

    /* renamed from: g */
    public boolean mo5552g() {
        return this.f4502e;
    }

    /* renamed from: androidx.camera.core.impl.y$a */
    public static final class C1584a {

        /* renamed from: a */
        public final Set<DeferrableSurface> f4504a;

        /* renamed from: b */
        public C1582x0 f4505b;

        /* renamed from: c */
        public int f4506c;

        /* renamed from: d */
        public List<C1448f> f4507d;

        /* renamed from: e */
        public boolean f4508e;

        /* renamed from: f */
        public C1588z0 f4509f;

        public C1584a() {
            this.f4504a = new HashSet();
            this.f4505b = C1586y0.m6573d0();
            this.f4506c = -1;
            this.f4507d = new ArrayList();
            this.f4508e = false;
            this.f4509f = C1588z0.m6581g();
        }

        @C0359n0
        /* renamed from: j */
        public static C1584a m6552j(@C0359n0 C1488o1<?> o1Var) {
            C1585b r = o1Var.mo5288r((C1585b) null);
            if (r != null) {
                C1584a aVar = new C1584a();
                r.mo4282a(o1Var, aVar);
                return aVar;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + o1Var.mo5602v(o1Var.toString()));
        }

        @C0359n0
        /* renamed from: k */
        public static C1584a m6553k(@C0359n0 C1583y yVar) {
            return new C1584a(yVar);
        }

        /* renamed from: a */
        public void mo5553a(@C0359n0 Collection<C1448f> collection) {
            for (C1448f c : collection) {
                mo5555c(c);
            }
        }

        /* renamed from: b */
        public void mo5554b(@C0359n0 C1472k1 k1Var) {
            this.f4509f.mo5574f(k1Var);
        }

        /* renamed from: c */
        public void mo5555c(@C0359n0 C1448f fVar) {
            if (!this.f4507d.contains(fVar)) {
                this.f4507d.add(fVar);
                return;
            }
            throw new IllegalArgumentException("duplicate camera capture callback");
        }

        /* renamed from: d */
        public <T> void mo5556d(@C0359n0 Config.C1421a<T> aVar, @C0359n0 T t) {
            this.f4505b.mo5545t(aVar, t);
        }

        /* renamed from: e */
        public void mo5557e(@C0359n0 Config config) {
            for (Config.C1421a next : config.mo5129f()) {
                Object h = this.f4505b.mo5131h(next, null);
                Object b = config.mo5125b(next);
                if (h instanceof C1580w0) {
                    ((C1580w0) h).mo5542a(((C1580w0) b).mo5543c());
                } else {
                    if (b instanceof C1580w0) {
                        b = ((C1580w0) b).clone();
                    }
                    this.f4505b.mo5544q(next, config.mo5132i(next), b);
                }
            }
        }

        /* renamed from: f */
        public void mo5558f(@C0359n0 DeferrableSurface deferrableSurface) {
            this.f4504a.add(deferrableSurface);
        }

        /* renamed from: g */
        public void mo5559g(@C0359n0 String str, @C0359n0 Integer num) {
            this.f4509f.mo5575i(str, num);
        }

        @C0359n0
        /* renamed from: h */
        public C1583y mo5560h() {
            return new C1583y(new ArrayList(this.f4504a), C1441c1.m6059b0(this.f4505b), this.f4506c, this.f4507d, this.f4508e, C1472k1.m6169c(this.f4509f));
        }

        /* renamed from: i */
        public void mo5561i() {
            this.f4504a.clear();
        }

        @C0359n0
        /* renamed from: l */
        public Config mo5562l() {
            return this.f4505b;
        }

        @C0359n0
        /* renamed from: m */
        public Set<DeferrableSurface> mo5563m() {
            return this.f4504a;
        }

        @C0363p0
        /* renamed from: n */
        public Integer mo5564n(@C0359n0 String str) {
            return this.f4509f.mo5239d(str);
        }

        /* renamed from: o */
        public int mo5565o() {
            return this.f4506c;
        }

        /* renamed from: p */
        public boolean mo5566p() {
            return this.f4508e;
        }

        /* renamed from: q */
        public void mo5567q(@C0359n0 DeferrableSurface deferrableSurface) {
            this.f4504a.remove(deferrableSurface);
        }

        /* renamed from: r */
        public void mo5568r(@C0359n0 Config config) {
            this.f4505b = C1586y0.m6574e0(config);
        }

        /* renamed from: s */
        public void mo5569s(int i) {
            this.f4506c = i;
        }

        /* renamed from: t */
        public void mo5570t(boolean z) {
            this.f4508e = z;
        }

        public C1584a(C1583y yVar) {
            HashSet hashSet = new HashSet();
            this.f4504a = hashSet;
            this.f4505b = C1586y0.m6573d0();
            this.f4506c = -1;
            this.f4507d = new ArrayList();
            this.f4508e = false;
            this.f4509f = C1588z0.m6581g();
            hashSet.addAll(yVar.f4498a);
            this.f4505b = C1586y0.m6574e0(yVar.f4499b);
            this.f4506c = yVar.f4500c;
            this.f4507d.addAll(yVar.mo5547b());
            this.f4508e = yVar.mo5552g();
            this.f4509f = C1588z0.m6582h(yVar.mo5550e());
        }
    }
}

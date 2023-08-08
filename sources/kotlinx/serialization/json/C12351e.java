package kotlinx.serialization.json;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12200d;
import kotlinx.serialization.modules.C12434e;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.serialization.json.e */
public final class C12351e {

    /* renamed from: a */
    public boolean f30187a;

    /* renamed from: b */
    public boolean f30188b;

    /* renamed from: c */
    public boolean f30189c;

    /* renamed from: d */
    public boolean f30190d;

    /* renamed from: e */
    public boolean f30191e;

    /* renamed from: f */
    public boolean f30192f;
    @C12579k

    /* renamed from: g */
    public String f30193g;

    /* renamed from: h */
    public boolean f30194h;

    /* renamed from: i */
    public boolean f30195i;
    @C12579k

    /* renamed from: j */
    public String f30196j;

    /* renamed from: k */
    public boolean f30197k;

    /* renamed from: l */
    public boolean f30198l;
    @C12579k

    /* renamed from: m */
    public C12434e f30199m;

    public C12351e(@C12579k C12341a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "json");
        this.f30187a = aVar.mo25282h().mo25361e();
        this.f30188b = aVar.mo25282h().mo25362f();
        this.f30189c = aVar.mo25282h().mo25363h();
        this.f30190d = aVar.mo25282h().mo25368n();
        this.f30191e = aVar.mo25282h().mo25358b();
        this.f30192f = aVar.mo25282h().mo25364i();
        this.f30193g = aVar.mo25282h().mo25365j();
        this.f30194h = aVar.mo25282h().mo25360d();
        this.f30195i = aVar.mo25282h().mo25367m();
        this.f30196j = aVar.mo25282h().mo25359c();
        this.f30197k = aVar.mo25282h().mo25357a();
        this.f30198l = aVar.mo25282h().mo25366l();
        this.f30199m = aVar.mo25277a();
    }

    @C12200d
    /* renamed from: h */
    public static /* synthetic */ void m49724h() {
    }

    @C12200d
    /* renamed from: l */
    public static /* synthetic */ void m49725l() {
    }

    /* renamed from: A */
    public final void mo25329A(@C12579k C12434e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.f30199m = eVar;
    }

    /* renamed from: B */
    public final void mo25330B(boolean z) {
        this.f30198l = z;
    }

    /* renamed from: C */
    public final void mo25331C(boolean z) {
        this.f30195i = z;
    }

    @C12579k
    /* renamed from: a */
    public final C12354g mo25332a() {
        if (!this.f30195i || Intrinsics.areEqual((Object) this.f30196j, (Object) "type")) {
            if (!this.f30192f) {
                if (!Intrinsics.areEqual((Object) this.f30193g, (Object) C12412q.f30348a)) {
                    throw new IllegalArgumentException("Indent should not be specified when default printing mode is used".toString());
                }
            } else if (!Intrinsics.areEqual((Object) this.f30193g, (Object) C12412q.f30348a)) {
                String str = this.f30193g;
                boolean z = false;
                int i = 0;
                while (true) {
                    boolean z2 = true;
                    if (i >= str.length()) {
                        z = true;
                        break;
                    }
                    char charAt = str.charAt(i);
                    i++;
                    if (!(charAt == ' ' || charAt == 9 || charAt == 13 || charAt == 10)) {
                        z2 = false;
                        continue;
                    }
                    if (!z2) {
                        break;
                    }
                }
                if (!z) {
                    throw new IllegalArgumentException(Intrinsics.stringPlus("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had ", mo25341k()).toString());
                }
            }
            return new C12354g(this.f30187a, this.f30189c, this.f30190d, this.f30191e, this.f30192f, this.f30188b, this.f30193g, this.f30194h, this.f30195i, this.f30196j, this.f30197k, this.f30198l);
        }
        throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified".toString());
    }

    /* renamed from: b */
    public final boolean mo25333b() {
        return this.f30197k;
    }

    /* renamed from: c */
    public final boolean mo25334c() {
        return this.f30191e;
    }

    @C12579k
    /* renamed from: d */
    public final String mo25335d() {
        return this.f30196j;
    }

    /* renamed from: e */
    public final boolean mo25336e() {
        return this.f30194h;
    }

    /* renamed from: f */
    public final boolean mo25337f() {
        return this.f30187a;
    }

    /* renamed from: g */
    public final boolean mo25338g() {
        return this.f30188b;
    }

    /* renamed from: i */
    public final boolean mo25339i() {
        return this.f30189c;
    }

    /* renamed from: j */
    public final boolean mo25340j() {
        return this.f30192f;
    }

    @C12579k
    /* renamed from: k */
    public final String mo25341k() {
        return this.f30193g;
    }

    @C12579k
    /* renamed from: m */
    public final C12434e mo25342m() {
        return this.f30199m;
    }

    /* renamed from: n */
    public final boolean mo25343n() {
        return this.f30198l;
    }

    /* renamed from: o */
    public final boolean mo25344o() {
        return this.f30195i;
    }

    /* renamed from: p */
    public final boolean mo25345p() {
        return this.f30190d;
    }

    /* renamed from: q */
    public final void mo25346q(boolean z) {
        this.f30197k = z;
    }

    /* renamed from: r */
    public final void mo25347r(boolean z) {
        this.f30191e = z;
    }

    /* renamed from: s */
    public final void mo25348s(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f30196j = str;
    }

    /* renamed from: t */
    public final void mo25349t(boolean z) {
        this.f30194h = z;
    }

    /* renamed from: u */
    public final void mo25350u(boolean z) {
        this.f30187a = z;
    }

    /* renamed from: v */
    public final void mo25351v(boolean z) {
        this.f30188b = z;
    }

    /* renamed from: w */
    public final void mo25352w(boolean z) {
        this.f30189c = z;
    }

    /* renamed from: x */
    public final void mo25353x(boolean z) {
        this.f30190d = z;
    }

    /* renamed from: y */
    public final void mo25354y(boolean z) {
        this.f30192f = z;
    }

    /* renamed from: z */
    public final void mo25355z(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f30193g = str;
    }
}

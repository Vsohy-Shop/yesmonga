package androidx.compose.p004ui.graphics.vector;

import androidx.compose.p004ui.graphics.C15112a3;
import androidx.compose.p004ui.graphics.C15231i3;
import androidx.compose.p004ui.graphics.C15318t0;
import androidx.compose.p004ui.graphics.drawscope.C15186d;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.p004ui.graphics.drawscope.C15193i;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/GroupComponent\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,555:1\n33#2,6:556\n33#2,6:571\n33#2,6:580\n261#3,7:562\n268#3:570\n269#3,3:577\n1#4:569\n*S KotlinDebug\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/GroupComponent\n*L\n374#1:556,6\n536#1:571,6\n549#1:580,6\n529#1:562,7\n529#1:570\n529#1:577,3\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.vector.b */
public final class C15339b extends C15373i {
    @C12580l

    /* renamed from: c */
    public float[] f37811c;
    @C12579k

    /* renamed from: d */
    public final List<C15373i> f37812d = new ArrayList();
    @C12579k

    /* renamed from: e */
    public List<? extends C15349f> f37813e = C15380n.m67243h();

    /* renamed from: f */
    public boolean f37814f = true;
    @C12580l

    /* renamed from: g */
    public C15231i3 f37815g;
    @C12580l

    /* renamed from: h */
    public C15370h f37816h;
    @C12580l

    /* renamed from: i */
    public C11289a<C11079d2> f37817i;
    @C12579k

    /* renamed from: j */
    public String f37818j = "";

    /* renamed from: k */
    public float f37819k;

    /* renamed from: l */
    public float f37820l;

    /* renamed from: m */
    public float f37821m;

    /* renamed from: n */
    public float f37822n = 1.0f;

    /* renamed from: o */
    public float f37823o = 1.0f;

    /* renamed from: p */
    public float f37824p;

    /* renamed from: q */
    public float f37825q;

    /* renamed from: r */
    public boolean f37826r = true;

    public C15339b() {
        super((DefaultConstructorMarker) null);
    }

    /* renamed from: A */
    public final void mo43142A(float f) {
        this.f37825q = f;
        this.f37826r = true;
        mo43530c();
    }

    /* renamed from: B */
    public final void mo43143B() {
        if (mo43157o()) {
            C15370h hVar = this.f37816h;
            if (hVar == null) {
                hVar = new C15370h();
                this.f37816h = hVar;
            } else {
                hVar.mo43487e();
            }
            C15231i3 i3Var = this.f37815g;
            if (i3Var == null) {
                i3Var = C15318t0.m66550a();
                this.f37815g = i3Var;
            } else {
                i3Var.reset();
            }
            hVar.mo43484b(this.f37813e).mo43479D(i3Var);
        }
    }

    /* renamed from: C */
    public final void mo43144C() {
        float[] fArr = this.f37811c;
        if (fArr == null) {
            fArr = C15112a3.m65154c((float[]) null, 1, (DefaultConstructorMarker) null);
            this.f37811c = fArr;
        } else {
            C15112a3.m65163m(fArr);
        }
        C15112a3.m65174x(fArr, this.f37820l + this.f37824p, this.f37821m + this.f37825q, 0.0f, 4, (Object) null);
        C15112a3.m65166p(fArr, this.f37819k);
        C15112a3.m65167q(fArr, this.f37822n, this.f37823o, 1.0f);
        C15112a3.m65174x(fArr, -this.f37820l, -this.f37821m, 0.0f, 4, (Object) null);
    }

    /* renamed from: a */
    public void mo43054a(@C12579k C15187e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        if (this.f37826r) {
            mo43144C();
            this.f37826r = false;
        }
        if (this.f37814f) {
            mo43143B();
            this.f37814f = false;
        }
        C15186d q5 = eVar.mo42683q5();
        long b = q5.mo42704b();
        q5.mo42705c().mo42422E();
        C15193i a = q5.mo42703a();
        float[] fArr = this.f37811c;
        if (fArr != null) {
            a.mo42708a(C15112a3.m65152a(fArr).mo42417y());
        }
        C15231i3 i3Var = this.f37815g;
        if (mo43157o() && i3Var != null) {
            C15193i.m65806g(a, i3Var, 0, 2, (Object) null);
        }
        List<C15373i> list = this.f37812d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).mo43054a(eVar);
        }
        q5.mo42705c().mo42443q();
        q5.mo42706d(b);
    }

    @C12580l
    /* renamed from: b */
    public C11289a<C11079d2> mo43145b() {
        return this.f37817i;
    }

    /* renamed from: d */
    public void mo43146d(@C12580l C11289a<C11079d2> aVar) {
        this.f37817i = aVar;
        List<C15373i> list = this.f37812d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).mo43146d(aVar);
        }
    }

    @C12579k
    /* renamed from: e */
    public final List<C15349f> mo43147e() {
        return this.f37813e;
    }

    @C12579k
    /* renamed from: f */
    public final String mo43148f() {
        return this.f37818j;
    }

    /* renamed from: g */
    public final int mo43149g() {
        return this.f37812d.size();
    }

    /* renamed from: h */
    public final float mo43150h() {
        return this.f37820l;
    }

    /* renamed from: i */
    public final float mo43151i() {
        return this.f37821m;
    }

    /* renamed from: j */
    public final float mo43152j() {
        return this.f37819k;
    }

    /* renamed from: k */
    public final float mo43153k() {
        return this.f37822n;
    }

    /* renamed from: l */
    public final float mo43154l() {
        return this.f37823o;
    }

    /* renamed from: m */
    public final float mo43155m() {
        return this.f37824p;
    }

    /* renamed from: n */
    public final float mo43156n() {
        return this.f37825q;
    }

    /* renamed from: o */
    public final boolean mo43157o() {
        return !this.f37813e.isEmpty();
    }

    /* renamed from: p */
    public final void mo43158p(int i, @C12579k C15373i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "instance");
        if (i < mo43149g()) {
            this.f37812d.set(i, iVar);
        } else {
            this.f37812d.add(iVar);
        }
        iVar.mo43146d(mo43145b());
        mo43530c();
    }

    /* renamed from: q */
    public final void mo43159q(int i, int i2, int i3) {
        int i4 = 0;
        if (i > i2) {
            while (i4 < i3) {
                this.f37812d.remove(i);
                this.f37812d.add(i2, this.f37812d.get(i));
                i2++;
                i4++;
            }
        } else {
            while (i4 < i3) {
                this.f37812d.remove(i);
                this.f37812d.add(i2 - 1, this.f37812d.get(i));
                i4++;
            }
        }
        mo43530c();
    }

    /* renamed from: r */
    public final void mo43160r(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (i < this.f37812d.size()) {
                this.f37812d.get(i).mo43146d((C11289a<C11079d2>) null);
                this.f37812d.remove(i);
            }
        }
        mo43530c();
    }

    /* renamed from: s */
    public final void mo43161s(@C12579k List<? extends C15349f> list) {
        Intrinsics.checkNotNullParameter(list, "value");
        this.f37813e = list;
        this.f37814f = true;
        mo43530c();
    }

    /* renamed from: t */
    public final void mo43162t(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "value");
        this.f37818j = str;
        mo43530c();
    }

    @C12579k
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VGroup: ");
        sb.append(this.f37818j);
        List<C15373i> list = this.f37812d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append("\t");
            sb.append(list.get(i).toString());
            sb.append("\n");
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }

    /* renamed from: u */
    public final void mo43164u(float f) {
        this.f37820l = f;
        this.f37826r = true;
        mo43530c();
    }

    /* renamed from: v */
    public final void mo43165v(float f) {
        this.f37821m = f;
        this.f37826r = true;
        mo43530c();
    }

    /* renamed from: w */
    public final void mo43166w(float f) {
        this.f37819k = f;
        this.f37826r = true;
        mo43530c();
    }

    /* renamed from: x */
    public final void mo43167x(float f) {
        this.f37822n = f;
        this.f37826r = true;
        mo43530c();
    }

    /* renamed from: y */
    public final void mo43168y(float f) {
        this.f37823o = f;
        this.f37826r = true;
        mo43530c();
    }

    /* renamed from: z */
    public final void mo43169z(float f) {
        this.f37824p = f;
        this.f37826r = true;
        mo43530c();
    }
}

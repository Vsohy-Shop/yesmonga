package androidx.compose.p004ui.text;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.graphics.C15118b2;
import androidx.compose.p004ui.graphics.C15205e4;
import androidx.compose.p004ui.graphics.C15231i3;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15318t0;
import androidx.compose.p004ui.graphics.C15421z1;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.p004ui.graphics.drawscope.C15192h;
import androidx.compose.p004ui.text.C16156d;
import androidx.compose.p004ui.text.font.C16238t;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.platform.C16369e;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.text.style.ResolvedTextDirection;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.p004ui.unit.C16478c;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.runtime.internal.C8567o;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.collections.C10994x;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import kotlinx.serialization.json.internal.C12361b;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nMultiParagraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraph\n+ 2 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,980:1\n127#2,3:981\n130#2:988\n131#2,2:1000\n133#2:1003\n33#3,4:984\n151#3,3:989\n33#3,4:992\n154#3,2:996\n38#3:998\n156#3:999\n38#3:1002\n33#3,6:1005\n33#3,6:1011\n1#4:1004\n*S KotlinDebug\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraph\n*L\n371#1:981,3\n371#1:988\n371#1:1000,2\n371#1:1003\n371#1:984,4\n373#1:989,3\n373#1:992,4\n373#1:996,2\n373#1:998\n373#1:999\n371#1:1002\n395#1:1005,6\n413#1:1011,6\n*E\n"})
/* renamed from: androidx.compose.ui.text.k */
public final class C16349k {

    /* renamed from: i */
    public static final int f40577i = 8;
    @C12579k

    /* renamed from: a */
    public final MultiParagraphIntrinsics f40578a;

    /* renamed from: b */
    public final int f40579b;

    /* renamed from: c */
    public final boolean f40580c;

    /* renamed from: d */
    public final float f40581d;

    /* renamed from: e */
    public final float f40582e;

    /* renamed from: f */
    public final int f40583f;
    @C12579k

    /* renamed from: g */
    public final List<C15098i> f40584g;
    @C12579k

    /* renamed from: h */
    public final List<C16358o> f40585h;

    public /* synthetic */ C16349k(C16156d dVar, C16361p0 p0Var, long j, C16479d dVar2, C16242u.C16244b bVar, List list, int i, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, p0Var, j, dVar2, bVar, (List<C16156d.C16159b<C16454v>>) list, i, z);
    }

    /* renamed from: I */
    public static /* synthetic */ void m73635I(C16349k kVar, C15118b2 b2Var, long j, C15205e4 e4Var, C16434j jVar, C15192h hVar, int i, int i2, Object obj) {
        long j2;
        C15205e4 e4Var2;
        C16434j jVar2;
        int i3;
        if ((i2 & 2) != 0) {
            j2 = C15240j2.f37547b.mo42851u();
        } else {
            j2 = j;
        }
        C15192h hVar2 = null;
        if ((i2 & 4) != 0) {
            e4Var2 = null;
        } else {
            e4Var2 = e4Var;
        }
        if ((i2 & 8) != 0) {
            jVar2 = null;
        } else {
            jVar2 = jVar;
        }
        if ((i2 & 16) == 0) {
            hVar2 = hVar;
        }
        if ((i2 & 32) != 0) {
            i3 = C15187e.f37500l.mo42719a();
        } else {
            i3 = i;
        }
        kVar.mo47393H(b2Var, j2, e4Var2, jVar2, hVar2, i3);
    }

    /* renamed from: K */
    public static /* synthetic */ void m73636K(C16349k kVar, C15118b2 b2Var, long j, C15205e4 e4Var, C16434j jVar, int i, Object obj) {
        C15205e4 e4Var2;
        C16434j jVar2;
        if ((i & 2) != 0) {
            j = C15240j2.f37547b.mo42851u();
        }
        long j2 = j;
        if ((i & 4) != 0) {
            e4Var2 = null;
        } else {
            e4Var2 = e4Var;
        }
        if ((i & 8) != 0) {
            jVar2 = null;
        } else {
            jVar2 = jVar;
        }
        kVar.mo47394J(b2Var, j2, e4Var2, jVar2);
    }

    /* renamed from: M */
    public static /* synthetic */ void m73637M(C16349k kVar, C15118b2 b2Var, C15421z1 z1Var, float f, C15205e4 e4Var, C16434j jVar, C15192h hVar, int i, int i2, Object obj) {
        float f2;
        C15205e4 e4Var2;
        C16434j jVar2;
        C15192h hVar2;
        int i3;
        if ((i2 & 4) != 0) {
            f2 = Float.NaN;
        } else {
            f2 = f;
        }
        if ((i2 & 8) != 0) {
            e4Var2 = null;
        } else {
            e4Var2 = e4Var;
        }
        if ((i2 & 16) != 0) {
            jVar2 = null;
        } else {
            jVar2 = jVar;
        }
        if ((i2 & 32) != 0) {
            hVar2 = null;
        } else {
            hVar2 = hVar;
        }
        if ((i2 & 64) != 0) {
            i3 = C15187e.f37500l.mo42719a();
        } else {
            i3 = i;
        }
        kVar.mo47395L(b2Var, z1Var, f2, e4Var2, jVar2, hVar2, i3);
    }

    /* renamed from: n */
    public static /* synthetic */ int m73638n(C16349k kVar, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return kVar.mo47411m(i, z);
    }

    @C12579k
    /* renamed from: A */
    public final ResolvedTextDirection mo47386A(int i) {
        int i2;
        mo47397O(i);
        if (i == mo47399a().length()) {
            i2 = CollectionsKt__CollectionsKt.m40443G(this.f40585h);
        } else {
            i2 = C16353m.m73682b(this.f40585h, i);
        }
        C16358o oVar = this.f40585h.get(i2);
        return oVar.mo47449n().mo46197d(oVar.mo47432C(i));
    }

    @C12579k
    /* renamed from: B */
    public final List<C16358o> mo47387B() {
        return this.f40585h;
    }

    @C12579k
    /* renamed from: C */
    public final C15231i3 mo47388C(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i < 0 || i > i2) {
            z = false;
        } else {
            z = true;
        }
        if (!z || i2 > mo47399a().mo46683j().length()) {
            z2 = false;
        }
        if (!z2) {
            throw new IllegalArgumentException(("Start(" + i + ") or End(" + i2 + ") is out of range [0.." + mo47399a().mo46683j().length() + "), or start > end!").toString());
        } else if (i == i2) {
            return C15318t0.m66550a();
        } else {
            C15231i3 a = C15318t0.m66550a();
            int size = this.f40585h.size();
            for (int b = C16353m.m73682b(this.f40585h, i); b < size; b++) {
                C16358o oVar = this.f40585h.get(b);
                if (oVar.mo47450o() >= i2) {
                    break;
                }
                if (oVar.mo47450o() != oVar.mo47446k()) {
                    C15231i3.m66005m(a, oVar.mo47459w(oVar.mo47449n().mo46214s(oVar.mo47432C(i), oVar.mo47432C(i2))), 0, 2, (Object) null);
                }
            }
            return a;
        }
    }

    @C12579k
    /* renamed from: D */
    public final List<C15098i> mo47389D() {
        return this.f40584g;
    }

    /* renamed from: E */
    public final float mo47390E() {
        return this.f40581d;
    }

    /* renamed from: F */
    public final long mo47391F(int i) {
        int i2;
        mo47397O(i);
        if (i == mo47399a().length()) {
            i2 = CollectionsKt__CollectionsKt.m40443G(this.f40585h);
        } else {
            i2 = C16353m.m73682b(this.f40585h, i);
        }
        C16358o oVar = this.f40585h.get(i2);
        return oVar.mo47460x(oVar.mo47449n().mo46203h(oVar.mo47432C(i)));
    }

    /* renamed from: G */
    public final boolean mo47392G(int i) {
        mo47398P(i);
        return this.f40585h.get(C16353m.m73683c(this.f40585h, i)).mo47449n().mo46206k(i);
    }

    @C16259h
    /* renamed from: H */
    public final void mo47393H(@C12579k C15118b2 b2Var, long j, @C12580l C15205e4 e4Var, @C12580l C16434j jVar, @C12580l C15192h hVar, int i) {
        C15118b2 b2Var2 = b2Var;
        Intrinsics.checkNotNullParameter(b2Var, "canvas");
        b2Var.mo42422E();
        List<C16358o> list = this.f40585h;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            C16358o oVar = list.get(i2);
            oVar.mo47449n().mo46200g(b2Var, j, e4Var, jVar, hVar, i);
            b2Var.mo42433e(0.0f, oVar.mo47449n().getHeight());
        }
        b2Var.mo42443q();
    }

    /* renamed from: J */
    public final void mo47394J(@C12579k C15118b2 b2Var, long j, @C12580l C15205e4 e4Var, @C12580l C16434j jVar) {
        Intrinsics.checkNotNullParameter(b2Var, "canvas");
        b2Var.mo42422E();
        List<C16358o> list = this.f40585h;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C16358o oVar = list.get(i);
            oVar.mo47449n().mo46178F(b2Var, j, e4Var, jVar);
            b2Var.mo42433e(0.0f, oVar.mo47449n().getHeight());
        }
        b2Var.mo42443q();
    }

    @C16259h
    /* renamed from: L */
    public final void mo47395L(@C12579k C15118b2 b2Var, @C12579k C15421z1 z1Var, float f, @C12580l C15205e4 e4Var, @C12580l C16434j jVar, @C12580l C15192h hVar, int i) {
        Intrinsics.checkNotNullParameter(b2Var, "canvas");
        Intrinsics.checkNotNullParameter(z1Var, "brush");
        C16369e.m73880a(this, b2Var, z1Var, f, e4Var, jVar, hVar, i);
    }

    /* renamed from: N */
    public final void mo47396N(int i) {
        boolean z = false;
        if (i >= 0 && i < mo47399a().mo46683j().length()) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(("offset(" + i + ") is out of bounds [0, " + mo47399a().length() + ')').toString());
        }
    }

    /* renamed from: O */
    public final void mo47397O(int i) {
        boolean z = false;
        if (i >= 0 && i <= mo47399a().mo46683j().length()) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(("offset(" + i + ") is out of bounds [0, " + mo47399a().length() + C12361b.f30261l).toString());
        }
    }

    /* renamed from: P */
    public final void mo47398P(int i) {
        boolean z = false;
        if (i >= 0 && i < this.f40583f) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(("lineIndex(" + i + ") is out of bounds [0, " + this.f40583f + ')').toString());
        }
    }

    /* renamed from: a */
    public final C16156d mo47399a() {
        return this.f40578a.mo46230e();
    }

    @C12579k
    /* renamed from: b */
    public final ResolvedTextDirection mo47400b(int i) {
        int i2;
        mo47397O(i);
        if (i == mo47399a().length()) {
            i2 = CollectionsKt__CollectionsKt.m40443G(this.f40585h);
        } else {
            i2 = C16353m.m73682b(this.f40585h, i);
        }
        C16358o oVar = this.f40585h.get(i2);
        return oVar.mo47449n().mo46220z(oVar.mo47432C(i));
    }

    @C12579k
    /* renamed from: c */
    public final C15098i mo47401c(int i) {
        mo47396N(i);
        C16358o oVar = this.f40585h.get(C16353m.m73682b(this.f40585h, i));
        return oVar.mo47458v(oVar.mo47449n().mo46196c(oVar.mo47432C(i)));
    }

    @C12579k
    /* renamed from: d */
    public final C15098i mo47402d(int i) {
        int i2;
        mo47397O(i);
        if (i == mo47399a().length()) {
            i2 = CollectionsKt__CollectionsKt.m40443G(this.f40585h);
        } else {
            i2 = C16353m.m73682b(this.f40585h, i);
        }
        C16358o oVar = this.f40585h.get(i2);
        return oVar.mo47458v(oVar.mo47449n().mo46199f(oVar.mo47432C(i)));
    }

    /* renamed from: e */
    public final boolean mo47403e() {
        return this.f40580c;
    }

    /* renamed from: f */
    public final float mo47404f() {
        if (this.f40585h.isEmpty()) {
            return 0.0f;
        }
        return this.f40585h.get(0).mo47449n().mo46204i();
    }

    /* renamed from: g */
    public final float mo47405g() {
        return this.f40582e;
    }

    /* renamed from: h */
    public final float mo47406h(int i, boolean z) {
        int i2;
        mo47397O(i);
        if (i == mo47399a().length()) {
            i2 = CollectionsKt__CollectionsKt.m40443G(this.f40585h);
        } else {
            i2 = C16353m.m73682b(this.f40585h, i);
        }
        C16358o oVar = this.f40585h.get(i2);
        return oVar.mo47449n().mo46215t(oVar.mo47432C(i), z);
    }

    @C12579k
    /* renamed from: i */
    public final MultiParagraphIntrinsics mo47407i() {
        return this.f40578a;
    }

    /* renamed from: j */
    public final float mo47408j() {
        if (this.f40585h.isEmpty()) {
            return 0.0f;
        }
        C16358o oVar = (C16358o) CollectionsKt___CollectionsKt.m40653k3(this.f40585h);
        return oVar.mo47430A(oVar.mo47449n().mo46218x());
    }

    /* renamed from: k */
    public final float mo47409k(int i) {
        mo47398P(i);
        C16358o oVar = this.f40585h.get(C16353m.m73683c(this.f40585h, i));
        return oVar.mo47430A(oVar.mo47449n().mo46175A(oVar.mo47433D(i)));
    }

    /* renamed from: l */
    public final int mo47410l() {
        return this.f40583f;
    }

    /* renamed from: m */
    public final int mo47411m(int i, boolean z) {
        mo47398P(i);
        C16358o oVar = this.f40585h.get(C16353m.m73683c(this.f40585h, i));
        return oVar.mo47461y(oVar.mo47449n().mo46208m(oVar.mo47433D(i), z));
    }

    /* renamed from: o */
    public final int mo47412o(int i) {
        int i2;
        if (i >= mo47399a().length()) {
            i2 = CollectionsKt__CollectionsKt.m40443G(this.f40585h);
        } else if (i < 0) {
            i2 = 0;
        } else {
            i2 = C16353m.m73682b(this.f40585h, i);
        }
        C16358o oVar = this.f40585h.get(i2);
        return oVar.mo47462z(oVar.mo47449n().mo46219y(oVar.mo47432C(i)));
    }

    /* renamed from: p */
    public final int mo47413p(float f) {
        int i;
        if (f <= 0.0f) {
            i = 0;
        } else if (f >= this.f40582e) {
            i = CollectionsKt__CollectionsKt.m40443G(this.f40585h);
        } else {
            i = C16353m.m73684d(this.f40585h, f);
        }
        C16358o oVar = this.f40585h.get(i);
        if (oVar.mo47448m() == 0) {
            return Math.max(0, oVar.mo47450o() - 1);
        }
        return oVar.mo47462z(oVar.mo47449n().mo46213r(oVar.mo47434E(f)));
    }

    /* renamed from: q */
    public final float mo47414q(int i) {
        mo47398P(i);
        C16358o oVar = this.f40585h.get(C16353m.m73683c(this.f40585h, i));
        return oVar.mo47449n().mo46211p(oVar.mo47433D(i));
    }

    /* renamed from: r */
    public final float mo47415r(int i) {
        mo47398P(i);
        C16358o oVar = this.f40585h.get(C16353m.m73683c(this.f40585h, i));
        return oVar.mo47449n().mo46216u(oVar.mo47433D(i));
    }

    /* renamed from: s */
    public final float mo47416s(int i) {
        mo47398P(i);
        C16358o oVar = this.f40585h.get(C16353m.m73683c(this.f40585h, i));
        return oVar.mo47449n().mo46210o(oVar.mo47433D(i));
    }

    /* renamed from: t */
    public final int mo47417t(int i) {
        mo47398P(i);
        C16358o oVar = this.f40585h.get(C16353m.m73683c(this.f40585h, i));
        return oVar.mo47461y(oVar.mo47449n().mo46207l(oVar.mo47433D(i)));
    }

    /* renamed from: u */
    public final float mo47418u(int i) {
        mo47398P(i);
        C16358o oVar = this.f40585h.get(C16353m.m73683c(this.f40585h, i));
        return oVar.mo47430A(oVar.mo47449n().mo46198e(oVar.mo47433D(i)));
    }

    /* renamed from: v */
    public final float mo47419v(int i) {
        mo47398P(i);
        C16358o oVar = this.f40585h.get(C16353m.m73683c(this.f40585h, i));
        return oVar.mo47449n().mo46177E(oVar.mo47433D(i));
    }

    /* renamed from: w */
    public final float mo47420w() {
        return this.f40578a.mo46227a();
    }

    /* renamed from: x */
    public final int mo47421x() {
        return this.f40579b;
    }

    /* renamed from: y */
    public final float mo47422y() {
        return this.f40578a.mo46227a();
    }

    /* renamed from: z */
    public final int mo47423z(long j) {
        int i;
        if (C15094f.m64882r(j) <= 0.0f) {
            i = 0;
        } else if (C15094f.m64882r(j) >= this.f40582e) {
            i = CollectionsKt__CollectionsKt.m40443G(this.f40585h);
        } else {
            i = C16353m.m73684d(this.f40585h, C15094f.m64882r(j));
        }
        C16358o oVar = this.f40585h.get(i);
        if (oVar.mo47448m() == 0) {
            return Math.max(0, oVar.mo47450o() - 1);
        }
        return oVar.mo47461y(oVar.mo47449n().mo46205j(oVar.mo47431B(j)));
    }

    public /* synthetic */ C16349k(MultiParagraphIntrinsics multiParagraphIntrinsics, long j, int i, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(multiParagraphIntrinsics, j, i, z);
    }

    public C16349k(MultiParagraphIntrinsics multiParagraphIntrinsics, long j, int i, boolean z) {
        boolean z2;
        int i2;
        float height;
        int i3;
        this.f40578a = multiParagraphIntrinsics;
        this.f40579b = i;
        int i4 = 0;
        if (C16476b.m74364r(j) == 0 && C16476b.m74363q(j) == 0) {
            ArrayList arrayList = new ArrayList();
            List<C16360p> f = multiParagraphIntrinsics.mo46231f();
            int size = f.size();
            int i5 = 0;
            float f2 = 0.0f;
            int i6 = 0;
            while (true) {
                if (i6 >= size) {
                    z2 = false;
                    break;
                }
                C16360p pVar = f.get(i6);
                C16401q g = pVar.mo47469g();
                int p = C16476b.m74362p(j);
                if (C16476b.m74355i(j)) {
                    i2 = C11479u.m44447u(C16476b.m74361o(j) - C16406s.m74005k(f2), i4);
                } else {
                    i2 = C16476b.m74361o(j);
                }
                C16355n i7 = C16406s.m74003i(g, C16478c.m74377b(0, p, 0, i2, 5, (Object) null), this.f40579b - i5, z);
                height = f2 + i7.getHeight();
                int n = i5 + i7.mo46209n();
                C16358o oVar = r7;
                i3 = n;
                C16358o oVar2 = new C16358o(i7, pVar.mo47470h(), pVar.mo47468f(), i5, n, f2, height);
                arrayList.add(oVar);
                if (i7.mo46212q() || (i3 == this.f40579b && i6 != CollectionsKt__CollectionsKt.m40443G(this.f40578a.mo46231f()))) {
                    i5 = i3;
                    f2 = height;
                    z2 = true;
                } else {
                    i6++;
                    i5 = i3;
                    f2 = height;
                    i4 = 0;
                }
            }
            i5 = i3;
            f2 = height;
            z2 = true;
            this.f40582e = f2;
            this.f40583f = i5;
            this.f40580c = z2;
            this.f40585h = arrayList;
            this.f40581d = (float) C16476b.m74362p(j);
            List<C15098i> arrayList2 = new ArrayList<>(arrayList.size());
            int size2 = arrayList.size();
            for (int i8 = 0; i8 < size2; i8++) {
                C16358o oVar3 = (C16358o) arrayList.get(i8);
                List<C15098i> C = oVar3.mo47449n().mo46176C();
                ArrayList arrayList3 = new ArrayList(C.size());
                int size3 = C.size();
                for (int i9 = 0; i9 < size3; i9++) {
                    C15098i iVar = C.get(i9);
                    arrayList3.add(iVar != null ? oVar3.mo47458v(iVar) : null);
                }
                C10994x.m42360n0(arrayList2, arrayList3);
            }
            if (arrayList2.size() < this.f40578a.mo46232g().size()) {
                int size4 = this.f40578a.mo46232g().size() - arrayList2.size();
                ArrayList arrayList4 = new ArrayList(size4);
                for (int i10 = 0; i10 < size4; i10++) {
                    arrayList4.add((Object) null);
                }
                arrayList2 = CollectionsKt___CollectionsKt.m40718y4(arrayList2, arrayList4);
            }
            this.f40584g = arrayList2;
            return;
        }
        throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16349k(MultiParagraphIntrinsics multiParagraphIntrinsics, long j, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(multiParagraphIntrinsics, j, (i2 & 4) != 0 ? Integer.MAX_VALUE : i, (i2 & 8) != 0 ? false : z, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16349k(MultiParagraphIntrinsics multiParagraphIntrinsics, int i, boolean z, float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(multiParagraphIntrinsics, (i2 & 2) != 0 ? Integer.MAX_VALUE : i, (i2 & 4) != 0 ? false : z, f);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11395k(message = "MultiParagraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @C11587t0(expression = "MultiParagraph(intrinsics, Constraints(maxWidth = ceil(width).toInt()), maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    public C16349k(@C12579k MultiParagraphIntrinsics multiParagraphIntrinsics, int i, boolean z, float f) {
        this(multiParagraphIntrinsics, C16478c.m74377b(0, C16406s.m74005k(f), 0, 0, 13, (Object) null), i, z, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(multiParagraphIntrinsics, "intrinsics");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16349k(C16156d dVar, C16361p0 p0Var, List list, int i, boolean z, float f, C16479d dVar2, C16238t.C16240b bVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, p0Var, (List<C16156d.C16159b<C16454v>>) (i2 & 4) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list, (i2 & 8) != 0 ? Integer.MAX_VALUE : i, (i2 & 16) != 0 ? false : z, f, dVar2, bVar);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @kotlin.C11395k(message = "Font.ResourceLoader is deprecated, use fontFamilyResolver instead", replaceWith = @kotlin.C11587t0(expression = "MultiParagraph(annotatedString, style, placeholders, maxLines, ellipsis, width, density, fontFamilyResolver)", imports = {}))
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C16349k(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.text.C16156d r14, @org.jetbrains.annotations.C12579k androidx.compose.p004ui.text.C16361p0 r15, @org.jetbrains.annotations.C12579k java.util.List<androidx.compose.p004ui.text.C16156d.C16159b<androidx.compose.p004ui.text.C16454v>> r16, int r17, boolean r18, float r19, @org.jetbrains.annotations.C12579k androidx.compose.p004ui.unit.C16479d r20, @org.jetbrains.annotations.C12579k androidx.compose.p004ui.text.font.C16238t.C16240b r21) {
        /*
            r13 = this;
            java.lang.String r0 = "annotatedString"
            r2 = r14
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "style"
            r3 = r15
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "placeholders"
            r4 = r16
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "density"
            r5 = r20
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "resourceLoader"
            r1 = r21
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            androidx.compose.ui.text.MultiParagraphIntrinsics r0 = new androidx.compose.ui.text.MultiParagraphIntrinsics
            androidx.compose.ui.text.font.u$b r6 = androidx.compose.p004ui.text.font.C16226o.m73118a(r21)
            r1 = r0
            r1.<init>((androidx.compose.p004ui.text.C16156d) r2, (androidx.compose.p004ui.text.C16361p0) r3, (java.util.List<androidx.compose.p004ui.text.C16156d.C16159b<androidx.compose.p004ui.text.C16454v>>) r4, (androidx.compose.p004ui.unit.C16479d) r5, (androidx.compose.p004ui.text.font.C16242u.C16244b) r6)
            r7 = 0
            int r8 = androidx.compose.p004ui.text.C16406s.m74005k(r19)
            r9 = 0
            r10 = 0
            r11 = 13
            r12 = 0
            long r3 = androidx.compose.p004ui.unit.C16478c.m74377b(r7, r8, r9, r10, r11, r12)
            r7 = 0
            r1 = r13
            r2 = r0
            r5 = r17
            r6 = r18
            r1.<init>(r2, r3, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.text.C16349k.<init>(androidx.compose.ui.text.d, androidx.compose.ui.text.p0, java.util.List, int, boolean, float, androidx.compose.ui.unit.d, androidx.compose.ui.text.font.t$b):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C16349k(androidx.compose.p004ui.text.C16156d r12, androidx.compose.p004ui.text.C16361p0 r13, float r14, androidx.compose.p004ui.unit.C16479d r15, androidx.compose.p004ui.text.font.C16242u.C16244b r16, java.util.List r17, int r18, boolean r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
        /*
            r11 = this;
            r0 = r20
            r1 = r0 & 32
            if (r1 == 0) goto L_0x000c
            java.util.List r1 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            r8 = r1
            goto L_0x000e
        L_0x000c:
            r8 = r17
        L_0x000e:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0017
            r1 = 2147483647(0x7fffffff, float:NaN)
            r9 = r1
            goto L_0x0019
        L_0x0017:
            r9 = r18
        L_0x0019:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0020
            r0 = 0
            r10 = r0
            goto L_0x0022
        L_0x0020:
            r10 = r19
        L_0x0022:
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r2.<init>((androidx.compose.p004ui.text.C16156d) r3, (androidx.compose.p004ui.text.C16361p0) r4, (float) r5, (androidx.compose.p004ui.unit.C16479d) r6, (androidx.compose.p004ui.text.font.C16242u.C16244b) r7, (java.util.List<androidx.compose.p004ui.text.C16156d.C16159b<androidx.compose.p004ui.text.C16454v>>) r8, (int) r9, (boolean) r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.text.C16349k.<init>(androidx.compose.ui.text.d, androidx.compose.ui.text.p0, float, androidx.compose.ui.unit.d, androidx.compose.ui.text.font.u$b, java.util.List, int, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11395k(message = "MultiParagraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @C11587t0(expression = "MultiParagraph(annotatedString, style, Constraints(maxWidth = ceil(width).toInt()), density, fontFamilyResolver, placeholders, maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    public C16349k(@C12579k C16156d dVar, @C12579k C16361p0 p0Var, float f, @C12579k C16479d dVar2, @C12579k C16242u.C16244b bVar, @C12579k List<C16156d.C16159b<C16454v>> list, int i, boolean z) {
        this(new MultiParagraphIntrinsics(dVar, p0Var, list, dVar2, bVar), C16478c.m74377b(0, C16406s.m74005k(f), 0, 0, 13, (Object) null), i, z, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(dVar, "annotatedString");
        Intrinsics.checkNotNullParameter(p0Var, "style");
        Intrinsics.checkNotNullParameter(dVar2, "density");
        Intrinsics.checkNotNullParameter(bVar, "fontFamilyResolver");
        Intrinsics.checkNotNullParameter(list, "placeholders");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C16349k(androidx.compose.p004ui.text.C16156d r14, androidx.compose.p004ui.text.C16361p0 r15, long r16, androidx.compose.p004ui.unit.C16479d r18, androidx.compose.p004ui.text.font.C16242u.C16244b r19, java.util.List r20, int r21, boolean r22, int r23, kotlin.jvm.internal.DefaultConstructorMarker r24) {
        /*
            r13 = this;
            r0 = r23
            r1 = r0 & 32
            if (r1 == 0) goto L_0x000c
            java.util.List r1 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            r9 = r1
            goto L_0x000e
        L_0x000c:
            r9 = r20
        L_0x000e:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0017
            r1 = 2147483647(0x7fffffff, float:NaN)
            r10 = r1
            goto L_0x0019
        L_0x0017:
            r10 = r21
        L_0x0019:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0020
            r0 = 0
            r11 = r0
            goto L_0x0022
        L_0x0020:
            r11 = r22
        L_0x0022:
            r12 = 0
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r7 = r18
            r8 = r19
            r2.<init>(r3, r4, r5, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.text.C16349k.<init>(androidx.compose.ui.text.d, androidx.compose.ui.text.p0, long, androidx.compose.ui.unit.d, androidx.compose.ui.text.font.u$b, java.util.List, int, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public C16349k(C16156d dVar, C16361p0 p0Var, long j, C16479d dVar2, C16242u.C16244b bVar, List<C16156d.C16159b<C16454v>> list, int i, boolean z) {
        this(new MultiParagraphIntrinsics(dVar, p0Var, list, dVar2, bVar), j, i, z, (DefaultConstructorMarker) null);
    }
}

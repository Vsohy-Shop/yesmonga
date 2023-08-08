package androidx.compose.p004ui.text;

import androidx.compose.p004ui.text.C16156d;
import androidx.compose.p004ui.text.font.C16226o;
import androidx.compose.p004ui.text.font.C16238t;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16415e;
import androidx.compose.p004ui.text.style.C16417f;
import androidx.compose.p004ui.text.style.C16426h;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16436k;
import androidx.compose.p004ui.text.style.C16442o;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.runtime.internal.C8567o;
import java.util.ArrayList;
import java.util.List;
import kotlin.C10864b0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nMultiParagraphIntrinsics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsics\n+ 2 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,152:1\n803#2:153\n804#2,5:162\n151#3,3:154\n33#3,4:157\n154#3:161\n155#3:167\n38#3:168\n156#3:169\n101#3,2:170\n33#3,6:172\n103#3:178\n1#4:179\n*S KotlinDebug\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsics\n*L\n95#1:153\n95#1:162,5\n95#1:154,3\n95#1:157,4\n95#1:161\n95#1:167\n95#1:168\n95#1:169\n120#1:170,2\n120#1:172,6\n120#1:178\n*E\n"})
/* renamed from: androidx.compose.ui.text.MultiParagraphIntrinsics */
public final class MultiParagraphIntrinsics implements C16401q {

    /* renamed from: f */
    public static final int f39857f = 8;
    @C12579k

    /* renamed from: a */
    public final C16156d f39858a;
    @C12579k

    /* renamed from: b */
    public final List<C16156d.C16159b<C16454v>> f39859b;
    @C12579k

    /* renamed from: c */
    public final C11677z f39860c;
    @C12579k

    /* renamed from: d */
    public final C11677z f39861d;
    @C12579k

    /* renamed from: e */
    public final List<C16360p> f39862e;

    public MultiParagraphIntrinsics(@C12579k C16156d dVar, @C12579k C16361p0 p0Var, @C12579k List<C16156d.C16159b<C16454v>> list, @C12579k C16479d dVar2, @C12579k C16242u.C16244b bVar) {
        C16156d dVar3 = dVar;
        C16361p0 p0Var2 = p0Var;
        List<C16156d.C16159b<C16454v>> list2 = list;
        Intrinsics.checkNotNullParameter(dVar3, "annotatedString");
        Intrinsics.checkNotNullParameter(p0Var2, "style");
        Intrinsics.checkNotNullParameter(list2, "placeholders");
        Intrinsics.checkNotNullParameter(dVar2, "density");
        Intrinsics.checkNotNullParameter(bVar, "fontFamilyResolver");
        this.f39858a = dVar3;
        this.f39859b = list2;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f39860c = C10864b0.m38747b(lazyThreadSafetyMode, new MultiParagraphIntrinsics$minIntrinsicWidth$2(this));
        this.f39861d = C10864b0.m38747b(lazyThreadSafetyMode, new MultiParagraphIntrinsics$maxIntrinsicWidth$2(this));
        C16451t a0 = p0Var.mo47497a0();
        List<C16156d.C16159b<C16451t>> v = AnnotatedStringKt.m72263v(dVar3, a0);
        ArrayList arrayList = new ArrayList(v.size());
        int size = v.size();
        int i = 0;
        while (i < size) {
            C16156d.C16159b bVar2 = v.get(i);
            C16156d h = AnnotatedStringKt.m72264w(dVar3, bVar2.mo46740i(), bVar2.mo46737g());
            arrayList.add(new C16360p(C16404r.m73992b(h.mo46683j(), p0Var2.mo47491T(mo46233h((C16451t) bVar2.mo46738h(), a0)), h.mo46678f(), C16351l.m73679b(mo46232g(), bVar2.mo46740i(), bVar2.mo46737g()), dVar2, bVar), bVar2.mo46740i(), bVar2.mo46737g()));
            i++;
            dVar3 = dVar;
        }
        this.f39862e = arrayList;
    }

    /* renamed from: a */
    public float mo46227a() {
        return ((Number) this.f39861d.getValue()).floatValue();
    }

    /* renamed from: b */
    public float mo46228b() {
        return ((Number) this.f39860c.getValue()).floatValue();
    }

    /* renamed from: c */
    public boolean mo46229c() {
        List<C16360p> list = this.f39862e;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).mo47469g().mo46229c()) {
                return true;
            }
        }
        return false;
    }

    @C12579k
    /* renamed from: e */
    public final C16156d mo46230e() {
        return this.f39858a;
    }

    @C12579k
    /* renamed from: f */
    public final List<C16360p> mo46231f() {
        return this.f39862e;
    }

    @C12579k
    /* renamed from: g */
    public final List<C16156d.C16159b<C16454v>> mo46232g() {
        return this.f39859b;
    }

    /* renamed from: h */
    public final C16451t mo46233h(C16451t tVar, C16451t tVar2) {
        C16436k r = tVar.mo47744r();
        if (r != null) {
            r.mo47686l();
            return tVar;
        }
        return C16451t.m74275f(tVar, (C16432i) null, tVar2.mo47744r(), 0, (C16442o) null, (C16457x) null, (C16426h) null, (C16417f) null, (C16415e) null, 253, (Object) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11395k(message = "Font.ResourceLoader is deprecated, call with fontFamilyResolver", replaceWith = @C11587t0(expression = "MultiParagraphIntrinsics(annotatedString, style, placeholders, density, fontFamilyResolver)", imports = {}))
    public MultiParagraphIntrinsics(@C12579k C16156d dVar, @C12579k C16361p0 p0Var, @C12579k List<C16156d.C16159b<C16454v>> list, @C12579k C16479d dVar2, @C12579k C16238t.C16240b bVar) {
        this(dVar, p0Var, list, dVar2, C16226o.m73118a(bVar));
        Intrinsics.checkNotNullParameter(dVar, "annotatedString");
        Intrinsics.checkNotNullParameter(p0Var, "style");
        Intrinsics.checkNotNullParameter(list, "placeholders");
        Intrinsics.checkNotNullParameter(dVar2, "density");
        Intrinsics.checkNotNullParameter(bVar, "resourceLoader");
    }
}

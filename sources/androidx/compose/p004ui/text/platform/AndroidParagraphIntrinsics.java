package androidx.compose.p004ui.text.platform;

import androidx.compose.p004ui.text.C16151c0;
import androidx.compose.p004ui.text.C16156d;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.text.C16401q;
import androidx.compose.p004ui.text.C16454v;
import androidx.compose.p004ui.text.android.C16104p;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.platform.extensions.C16373d;
import androidx.compose.p004ui.unit.C16479d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.text.platform.AndroidParagraphIntrinsics */
public final class AndroidParagraphIntrinsics implements C16401q {
    @C12579k

    /* renamed from: a */
    public final String f40609a;
    @C12579k

    /* renamed from: b */
    public final C16361p0 f40610b;
    @C12579k

    /* renamed from: c */
    public final List<C16156d.C16159b<C16151c0>> f40611c;
    @C12579k

    /* renamed from: d */
    public final List<C16156d.C16159b<C16454v>> f40612d;
    @C12579k

    /* renamed from: e */
    public final C16242u.C16244b f40613e;
    @C12579k

    /* renamed from: f */
    public final C16479d f40614f;
    @C12579k

    /* renamed from: g */
    public final C16383l f40615g;
    @C12579k

    /* renamed from: h */
    public final CharSequence f40616h;
    @C12579k

    /* renamed from: i */
    public final C16104p f40617i;
    @C12580l

    /* renamed from: j */
    public C16364a0 f40618j;

    /* renamed from: k */
    public final boolean f40619k;

    /* renamed from: l */
    public final int f40620l;

    public AndroidParagraphIntrinsics(@C12579k String str, @C12579k C16361p0 p0Var, @C12579k List<C16156d.C16159b<C16151c0>> list, @C12579k List<C16156d.C16159b<C16454v>> list2, @C12579k C16242u.C16244b bVar, @C12579k C16479d dVar) {
        boolean z;
        C16156d.C16159b bVar2;
        Intrinsics.checkNotNullParameter(str, "text");
        Intrinsics.checkNotNullParameter(p0Var, "style");
        Intrinsics.checkNotNullParameter(list, "spanStyles");
        Intrinsics.checkNotNullParameter(list2, "placeholders");
        Intrinsics.checkNotNullParameter(bVar, "fontFamilyResolver");
        Intrinsics.checkNotNullParameter(dVar, "density");
        this.f40609a = str;
        this.f40610b = p0Var;
        this.f40611c = list;
        this.f40612d = list2;
        this.f40613e = bVar;
        this.f40614f = dVar;
        C16383l lVar = new C16383l(1, dVar.getDensity());
        this.f40615g = lVar;
        if (!C16378g.m73930c(p0Var)) {
            z = false;
        } else {
            z = C16395u.f40652a.mo47569a().getValue().booleanValue();
        }
        this.f40619k = z;
        this.f40620l = C16378g.m73931d(p0Var.mo47485M(), p0Var.mo47478F());
        AndroidParagraphIntrinsics$resolveTypeface$1 androidParagraphIntrinsics$resolveTypeface$1 = new AndroidParagraphIntrinsics$resolveTypeface$1(this);
        C16373d.m73922f(lVar, p0Var.mo47488P());
        C16151c0 a = C16373d.m73917a(lVar, p0Var.mo47499b0(), androidParagraphIntrinsics$resolveTypeface$1, dVar, !list.isEmpty());
        ArrayList arrayList = list;
        if (a != null) {
            int size = list.size() + 1;
            ArrayList arrayList2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                if (i == 0) {
                    bVar2 = new C16156d.C16159b(a, 0, this.f40609a.length());
                } else {
                    bVar2 = this.f40611c.get(i - 1);
                }
                arrayList2.add(bVar2);
            }
            arrayList = arrayList2;
        }
        CharSequence a2 = C16376f.m73926a(this.f40609a, this.f40615g.getTextSize(), this.f40610b, arrayList, this.f40612d, this.f40614f, androidParagraphIntrinsics$resolveTypeface$1, this.f40619k);
        this.f40616h = a2;
        this.f40617i = new C16104p(a2, this.f40615g, this.f40620l);
    }

    /* renamed from: a */
    public float mo46227a() {
        return this.f40617i.mo46524b();
    }

    /* renamed from: b */
    public float mo46228b() {
        return this.f40617i.mo46525c();
    }

    /* renamed from: c */
    public boolean mo46229c() {
        boolean z;
        C16364a0 a0Var = this.f40618j;
        if (a0Var != null) {
            z = a0Var.mo47533c();
        } else {
            z = false;
        }
        if (z || (!this.f40619k && C16378g.m73930c(this.f40610b) && C16395u.f40652a.mo47569a().getValue().booleanValue())) {
            return true;
        }
        return false;
    }

    @C12579k
    /* renamed from: f */
    public final CharSequence mo47520f() {
        return this.f40616h;
    }

    @C12579k
    /* renamed from: g */
    public final C16479d mo47521g() {
        return this.f40614f;
    }

    @C12579k
    /* renamed from: h */
    public final C16242u.C16244b mo47522h() {
        return this.f40613e;
    }

    @C12579k
    /* renamed from: i */
    public final C16104p mo47523i() {
        return this.f40617i;
    }

    @C12579k
    /* renamed from: j */
    public final List<C16156d.C16159b<C16454v>> mo47524j() {
        return this.f40612d;
    }

    @C12579k
    /* renamed from: k */
    public final List<C16156d.C16159b<C16151c0>> mo47525k() {
        return this.f40611c;
    }

    @C12579k
    /* renamed from: l */
    public final C16361p0 mo47526l() {
        return this.f40610b;
    }

    @C12579k
    /* renamed from: m */
    public final String mo47527m() {
        return this.f40609a;
    }

    /* renamed from: n */
    public final int mo47528n() {
        return this.f40620l;
    }

    @C12579k
    /* renamed from: o */
    public final C16383l mo47529o() {
        return this.f40615g;
    }
}

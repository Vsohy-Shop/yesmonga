package androidx.constraintlayout.compose;

import androidx.appcompat.graphics.drawable.C0508a;
import androidx.compose.p004ui.layout.C15557e0;
import androidx.constraintlayout.compose.C16616o;
import androidx.constraintlayout.core.parser.C16735c;
import androidx.constraintlayout.core.parser.C16736d;
import androidx.constraintlayout.core.parser.C16738f;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.state.C16769n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.intellij.lang.annotations.C12553d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.constraintlayout.compose.c0 */
public final class C16588c0 extends C16629u implements C16616o {

    /* renamed from: X */
    public boolean f41218X;
    @C12580l

    /* renamed from: x */
    public final C16602j f41219x;
    @C12579k

    /* renamed from: y */
    public final HashMap<String, Float> f41220y;
    @C12580l

    /* renamed from: z */
    public final String f41221z;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16588c0(String str, String str2, C16602j jVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : jVar);
    }

    /* renamed from: D */
    public void mo48461D(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "content");
        super.mo48461D(str);
        this.f41218X = true;
    }

    /* renamed from: I */
    public final void mo48462I(C16594f0 f0Var) {
        String str = this.f41221z;
        if (str != null) {
            try {
                C16738f d = CLParser.m76375d(str);
                int size = d.size();
                if (size > 0) {
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        C16735c l0 = d.mo49153l0(i);
                        if (l0 != null) {
                            C16736d dVar = (C16736d) l0;
                            float r = dVar.mo49186O0().mo49182r();
                            String h = dVar.mo49178h();
                            Intrinsics.checkNotNullExpressionValue(h, "key.content()");
                            f0Var.mo48494g(h, r);
                            if (i2 >= size) {
                                break;
                            }
                            i = i2;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.core.parser.CLKey");
                        }
                    }
                }
            } catch (CLParsingException e) {
                System.err.println(Intrinsics.stringPlus("exception: ", e));
            }
        }
        for (String next : this.f41220y.keySet()) {
            Intrinsics.checkNotNullExpressionValue(next, "name");
            Float f = this.f41220y.get(next);
            Intrinsics.checkNotNull(f);
            f0Var.mo48494g(next, f.floatValue());
        }
    }

    /* renamed from: J */
    public final void mo48463J(@C12579k ArrayList<C16620p> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "designElements");
        try {
            arrayList.clear();
            C16610l.m75539i(mo48598x(), arrayList);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public void mo48354a(@C12579k C16611l0 l0Var, @C12579k List<? extends C15557e0> list) {
        C16616o.C16617a.m75590a(this, l0Var, list);
    }

    /* renamed from: b */
    public void mo48355b(@C12579k C16769n nVar, int i) {
        Intrinsics.checkNotNullParameter(nVar, C0508a.f1295O0);
        mo48462I(new C16594f0());
        C16610l.m75548r(mo48598x(), nVar, i);
    }

    /* renamed from: c */
    public boolean mo48356c(@C12579k List<? extends C15557e0> list) {
        Intrinsics.checkNotNullParameter(list, "measurables");
        return this.f41218X;
    }

    public boolean equals(@C12580l Object obj) {
        if (obj instanceof C16588c0) {
            return Intrinsics.areEqual((Object) mo48598x(), (Object) ((C16588c0) obj).mo48598x());
        }
        return false;
    }

    @C12580l
    /* renamed from: f */
    public C16602j mo48465f() {
        return this.f41219x;
    }

    @C12579k
    /* renamed from: i */
    public C16602j mo48357i(@C12579k String str, float f) {
        Intrinsics.checkNotNullParameter(str, "name");
        this.f41220y.put(str, Float.valueOf(f));
        return this;
    }

    /* renamed from: k */
    public void mo48466k(@C12579k C16611l0 l0Var) {
        Intrinsics.checkNotNullParameter(l0Var, "state");
        C16594f0 f0Var = new C16594f0();
        mo48462I(f0Var);
        try {
            C16610l.m75547q(mo48598x(), l0Var, f0Var);
            this.f41218X = false;
        } catch (Exception unused) {
            this.f41218X = true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16588c0(@C12579k @C12553d("json5") String str, @C12580l @C12553d("json5") String str2, @C12580l C16602j jVar) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "content");
        this.f41219x = jVar;
        this.f41220y = new HashMap<>();
        this.f41221z = str2;
        this.f41218X = true;
        mo48589A();
    }
}

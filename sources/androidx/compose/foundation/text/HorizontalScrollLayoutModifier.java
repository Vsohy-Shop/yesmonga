package androidx.compose.foundation.text;

import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15603u;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.text.input.C16334z0;
import androidx.compose.p004ui.unit.C16476b;
import java.util.Map;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class HorizontalScrollLayoutModifier implements C15603u {
    @C12579k

    /* renamed from: a */
    public final TextFieldScrollerPosition f7112a;

    /* renamed from: b */
    public final int f7113b;
    @C12579k

    /* renamed from: c */
    public final C16334z0 f7114c;
    @C12579k

    /* renamed from: d */
    public final C11289a<C2851y> f7115d;

    public HorizontalScrollLayoutModifier(@C12579k TextFieldScrollerPosition textFieldScrollerPosition, int i, @C12579k C16334z0 z0Var, @C12579k C11289a<C2851y> aVar) {
        Intrinsics.checkNotNullParameter(textFieldScrollerPosition, "scrollerPosition");
        Intrinsics.checkNotNullParameter(z0Var, "transformedText");
        Intrinsics.checkNotNullParameter(aVar, "textLayoutResultProvider");
        this.f7112a = textFieldScrollerPosition;
        this.f7113b = i;
        this.f7114c = z0Var;
        this.f7115d = aVar;
    }

    /* renamed from: m */
    public static /* synthetic */ HorizontalScrollLayoutModifier m12299m(HorizontalScrollLayoutModifier horizontalScrollLayoutModifier, TextFieldScrollerPosition textFieldScrollerPosition, int i, C16334z0 z0Var, C11289a<C2851y> aVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            textFieldScrollerPosition = horizontalScrollLayoutModifier.f7112a;
        }
        if ((i2 & 2) != 0) {
            i = horizontalScrollLayoutModifier.f7113b;
        }
        if ((i2 & 4) != 0) {
            z0Var = horizontalScrollLayoutModifier.f7114c;
        }
        if ((i2 & 8) != 0) {
            aVar = horizontalScrollLayoutModifier.f7115d;
        }
        return horizontalScrollLayoutModifier.mo9305l(textFieldScrollerPosition, i, z0Var, aVar);
    }

    @C12579k
    /* renamed from: a */
    public final TextFieldScrollerPosition mo9299a() {
        return this.f7112a;
    }

    /* renamed from: b */
    public final int mo9300b() {
        return this.f7113b;
    }

    @C12579k
    /* renamed from: e */
    public final C16334z0 mo9301e() {
        return this.f7114c;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HorizontalScrollLayoutModifier)) {
            return false;
        }
        HorizontalScrollLayoutModifier horizontalScrollLayoutModifier = (HorizontalScrollLayoutModifier) obj;
        return Intrinsics.areEqual((Object) this.f7112a, (Object) horizontalScrollLayoutModifier.f7112a) && this.f7113b == horizontalScrollLayoutModifier.f7113b && Intrinsics.areEqual((Object) this.f7114c, (Object) horizontalScrollLayoutModifier.f7114c) && Intrinsics.areEqual((Object) this.f7115d, (Object) horizontalScrollLayoutModifier.f7115d);
    }

    @C12579k
    /* renamed from: g */
    public final C11289a<C2851y> mo9303g() {
        return this.f7115d;
    }

    public int hashCode() {
        return (((((this.f7112a.hashCode() * 31) + Integer.hashCode(this.f7113b)) * 31) + this.f7114c.hashCode()) * 31) + this.f7115d.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public C15564g0 mo6430i(@C12579k C15568h0 h0Var, @C12579k C15557e0 e0Var, long j) {
        long j2;
        Intrinsics.checkNotNullParameter(h0Var, "$this$measure");
        Intrinsics.checkNotNullParameter(e0Var, "measurable");
        if (e0Var.mo44323p0(C16476b.m74361o(j)) < C16476b.m74362p(j)) {
            j2 = j;
        } else {
            j2 = C16476b.m74351e(j, 0, Integer.MAX_VALUE, 0, 0, 13, (Object) null);
        }
        C15611w0 t0 = e0Var.mo44324t0(j2);
        int min = Math.min(t0.mo44471K0(), C16476b.m74362p(j));
        return C15568h0.m69206r2(h0Var, min, t0.mo44468G0(), (Map) null, new HorizontalScrollLayoutModifier$measure$1(h0Var, this, t0, min), 4, (Object) null);
    }

    @C12579k
    /* renamed from: l */
    public final HorizontalScrollLayoutModifier mo9305l(@C12579k TextFieldScrollerPosition textFieldScrollerPosition, int i, @C12579k C16334z0 z0Var, @C12579k C11289a<C2851y> aVar) {
        Intrinsics.checkNotNullParameter(textFieldScrollerPosition, "scrollerPosition");
        Intrinsics.checkNotNullParameter(z0Var, "transformedText");
        Intrinsics.checkNotNullParameter(aVar, "textLayoutResultProvider");
        return new HorizontalScrollLayoutModifier(textFieldScrollerPosition, i, z0Var, aVar);
    }

    /* renamed from: n */
    public final int mo9306n() {
        return this.f7113b;
    }

    @C12579k
    /* renamed from: o */
    public final TextFieldScrollerPosition mo9307o() {
        return this.f7112a;
    }

    @C12579k
    /* renamed from: q */
    public final C11289a<C2851y> mo9308q() {
        return this.f7115d;
    }

    @C12579k
    /* renamed from: r */
    public final C16334z0 mo9309r() {
        return this.f7114c;
    }

    @C12579k
    public String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.f7112a + ", cursorOffset=" + this.f7113b + ", transformedText=" + this.f7114c + ", textLayoutResultProvider=" + this.f7115d + ')';
    }
}

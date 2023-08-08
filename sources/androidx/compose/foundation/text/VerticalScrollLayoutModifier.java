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

public final class VerticalScrollLayoutModifier implements C15603u {
    @C12579k

    /* renamed from: a */
    public final TextFieldScrollerPosition f7255a;

    /* renamed from: b */
    public final int f7256b;
    @C12579k

    /* renamed from: c */
    public final C16334z0 f7257c;
    @C12579k

    /* renamed from: d */
    public final C11289a<C2851y> f7258d;

    public VerticalScrollLayoutModifier(@C12579k TextFieldScrollerPosition textFieldScrollerPosition, int i, @C12579k C16334z0 z0Var, @C12579k C11289a<C2851y> aVar) {
        Intrinsics.checkNotNullParameter(textFieldScrollerPosition, "scrollerPosition");
        Intrinsics.checkNotNullParameter(z0Var, "transformedText");
        Intrinsics.checkNotNullParameter(aVar, "textLayoutResultProvider");
        this.f7255a = textFieldScrollerPosition;
        this.f7256b = i;
        this.f7257c = z0Var;
        this.f7258d = aVar;
    }

    /* renamed from: m */
    public static /* synthetic */ VerticalScrollLayoutModifier m12535m(VerticalScrollLayoutModifier verticalScrollLayoutModifier, TextFieldScrollerPosition textFieldScrollerPosition, int i, C16334z0 z0Var, C11289a<C2851y> aVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            textFieldScrollerPosition = verticalScrollLayoutModifier.f7255a;
        }
        if ((i2 & 2) != 0) {
            i = verticalScrollLayoutModifier.f7256b;
        }
        if ((i2 & 4) != 0) {
            z0Var = verticalScrollLayoutModifier.f7257c;
        }
        if ((i2 & 8) != 0) {
            aVar = verticalScrollLayoutModifier.f7258d;
        }
        return verticalScrollLayoutModifier.mo9492l(textFieldScrollerPosition, i, z0Var, aVar);
    }

    @C12579k
    /* renamed from: a */
    public final TextFieldScrollerPosition mo9486a() {
        return this.f7255a;
    }

    /* renamed from: b */
    public final int mo9487b() {
        return this.f7256b;
    }

    @C12579k
    /* renamed from: e */
    public final C16334z0 mo9488e() {
        return this.f7257c;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerticalScrollLayoutModifier)) {
            return false;
        }
        VerticalScrollLayoutModifier verticalScrollLayoutModifier = (VerticalScrollLayoutModifier) obj;
        return Intrinsics.areEqual((Object) this.f7255a, (Object) verticalScrollLayoutModifier.f7255a) && this.f7256b == verticalScrollLayoutModifier.f7256b && Intrinsics.areEqual((Object) this.f7257c, (Object) verticalScrollLayoutModifier.f7257c) && Intrinsics.areEqual((Object) this.f7258d, (Object) verticalScrollLayoutModifier.f7258d);
    }

    @C12579k
    /* renamed from: g */
    public final C11289a<C2851y> mo9490g() {
        return this.f7258d;
    }

    public int hashCode() {
        return (((((this.f7255a.hashCode() * 31) + Integer.hashCode(this.f7256b)) * 31) + this.f7257c.hashCode()) * 31) + this.f7258d.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public C15564g0 mo6430i(@C12579k C15568h0 h0Var, @C12579k C15557e0 e0Var, long j) {
        Intrinsics.checkNotNullParameter(h0Var, "$this$measure");
        Intrinsics.checkNotNullParameter(e0Var, "measurable");
        C15611w0 t0 = e0Var.mo44324t0(C16476b.m74351e(j, 0, 0, 0, Integer.MAX_VALUE, 7, (Object) null));
        int min = Math.min(t0.mo44468G0(), C16476b.m74361o(j));
        return C15568h0.m69206r2(h0Var, t0.mo44471K0(), min, (Map) null, new VerticalScrollLayoutModifier$measure$1(h0Var, this, t0, min), 4, (Object) null);
    }

    @C12579k
    /* renamed from: l */
    public final VerticalScrollLayoutModifier mo9492l(@C12579k TextFieldScrollerPosition textFieldScrollerPosition, int i, @C12579k C16334z0 z0Var, @C12579k C11289a<C2851y> aVar) {
        Intrinsics.checkNotNullParameter(textFieldScrollerPosition, "scrollerPosition");
        Intrinsics.checkNotNullParameter(z0Var, "transformedText");
        Intrinsics.checkNotNullParameter(aVar, "textLayoutResultProvider");
        return new VerticalScrollLayoutModifier(textFieldScrollerPosition, i, z0Var, aVar);
    }

    /* renamed from: n */
    public final int mo9493n() {
        return this.f7256b;
    }

    @C12579k
    /* renamed from: o */
    public final TextFieldScrollerPosition mo9494o() {
        return this.f7255a;
    }

    @C12579k
    /* renamed from: q */
    public final C11289a<C2851y> mo9495q() {
        return this.f7258d;
    }

    @C12579k
    /* renamed from: r */
    public final C16334z0 mo9496r() {
        return this.f7257c;
    }

    @C12579k
    public String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.f7255a + ", cursorOffset=" + this.f7256b + ", transformedText=" + this.f7257c + ", textLayoutResultProvider=" + this.f7258d + ')';
    }
}

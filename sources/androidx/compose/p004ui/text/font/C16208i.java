package androidx.compose.p004ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.p004ui.text.font.C16201h0;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.text.font.i */
public abstract class C16208i extends C16185d {
    @C12579k

    /* renamed from: g */
    public final C16209i0 f40278g;

    /* renamed from: h */
    public final int f40279h;

    /* renamed from: i */
    public boolean f40280i;
    @C12580l

    /* renamed from: j */
    public Typeface f40281j;

    public /* synthetic */ C16208i(C16209i0 i0Var, int i, C16201h0.C16206e eVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(i0Var, i, eVar);
    }

    /* renamed from: b */
    public final int mo46930b() {
        return this.f40279h;
    }

    @C12580l
    /* renamed from: e */
    public abstract Typeface mo46811e(@C12580l Context context);

    @C12580l
    /* renamed from: f */
    public abstract String mo46813f();

    @C12580l
    /* renamed from: g */
    public final Typeface mo46931g() {
        return this.f40281j;
    }

    @C12579k
    public final C16209i0 getWeight() {
        return this.f40278g;
    }

    @C12580l
    /* renamed from: h */
    public final Typeface mo46933h(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        if (!this.f40280i && this.f40281j == null) {
            this.f40281j = mo46811e(context);
        }
        this.f40280i = true;
        return this.f40281j;
    }

    /* renamed from: i */
    public final void mo46934i(@C12580l Typeface typeface) {
        this.f40281j = typeface;
    }

    public C16208i(C16209i0 i0Var, int i, C16201h0.C16206e eVar) {
        super(C16182c0.f40243b.mo46866b(), C16212j.f40305a, eVar, (DefaultConstructorMarker) null);
        this.f40278g = i0Var;
        this.f40279h = i;
    }
}

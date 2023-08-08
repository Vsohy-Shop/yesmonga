package androidx.compose.p004ui.text.font;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.p004ui.text.font.C16201h0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.text.font.a */
public final class C16175a extends C16208i {
    @C12579k

    /* renamed from: k */
    public final AssetManager f40233k;
    @C12579k

    /* renamed from: l */
    public final String f40234l;
    @C12579k

    /* renamed from: m */
    public final String f40235m;

    public /* synthetic */ C16175a(AssetManager assetManager, String str, C16209i0 i0Var, int i, C16201h0.C16206e eVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(assetManager, str, i0Var, i, eVar);
    }

    @C12580l
    /* renamed from: e */
    public Typeface mo46811e(@C12580l Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C16199g1.f40263a.mo46899a(this.f40233k, this.f40234l, context, mo46870d());
        }
        return Typeface.createFromAsset(this.f40233k, this.f40234l);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16175a)) {
            return false;
        }
        C16175a aVar = (C16175a) obj;
        if (Intrinsics.areEqual((Object) this.f40234l, (Object) aVar.f40234l) && Intrinsics.areEqual((Object) mo46870d(), (Object) aVar.mo46870d())) {
            return true;
        }
        return false;
    }

    @C12579k
    /* renamed from: f */
    public String mo46813f() {
        return this.f40235m;
    }

    public int hashCode() {
        return (this.f40234l.hashCode() * 31) + mo46870d().hashCode();
    }

    @C12579k
    /* renamed from: j */
    public final AssetManager mo46815j() {
        return this.f40233k;
    }

    @C12579k
    /* renamed from: k */
    public final String mo46816k() {
        return this.f40234l;
    }

    @C12579k
    public String toString() {
        return "Font(assetManager, path=" + this.f40234l + ", weight=" + getWeight() + ", style=" + C16190e0.m72953i(mo46930b()) + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16175a(AssetManager assetManager, String str, C16209i0 i0Var, int i, C16201h0.C16206e eVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(assetManager, str, (i2 & 4) != 0 ? C16209i0.f40292b.mo46952m() : i0Var, (i2 & 8) != 0 ? C16190e0.f40252b.mo46883b() : i, eVar, (DefaultConstructorMarker) null);
    }

    public C16175a(AssetManager assetManager, String str, C16209i0 i0Var, int i, C16201h0.C16206e eVar) {
        super(i0Var, i, eVar, (DefaultConstructorMarker) null);
        this.f40233k = assetManager;
        this.f40234l = str;
        mo46934i(mo46811e((Context) null));
        this.f40235m = "asset:" + str;
    }
}

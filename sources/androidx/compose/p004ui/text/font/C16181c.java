package androidx.compose.p004ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.p004ui.text.font.C16201h0;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.text.font.c */
public final class C16181c extends C16208i {
    @C12579k

    /* renamed from: k */
    public final File f40241k;
    @C12580l

    /* renamed from: l */
    public final String f40242l;

    public /* synthetic */ C16181c(File file, C16209i0 i0Var, int i, C16201h0.C16206e eVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, i0Var, i, eVar);
    }

    @C12580l
    /* renamed from: e */
    public Typeface mo46811e(@C12580l Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C16199g1.f40263a.mo46900b(this.f40241k, context, mo46870d());
        }
        return Typeface.createFromFile(this.f40241k);
    }

    @C12580l
    /* renamed from: f */
    public String mo46813f() {
        return this.f40242l;
    }

    @C12579k
    /* renamed from: j */
    public final File mo46858j() {
        return this.f40241k;
    }

    @C12579k
    public String toString() {
        return "Font(file=" + this.f40241k + ", weight=" + getWeight() + ", style=" + C16190e0.m72953i(mo46930b()) + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16181c(File file, C16209i0 i0Var, int i, C16201h0.C16206e eVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i2 & 2) != 0 ? C16209i0.f40292b.mo46952m() : i0Var, (i2 & 4) != 0 ? C16190e0.f40252b.mo46883b() : i, eVar, (DefaultConstructorMarker) null);
    }

    public C16181c(File file, C16209i0 i0Var, int i, C16201h0.C16206e eVar) {
        super(i0Var, i, eVar, (DefaultConstructorMarker) null);
        this.f40241k = file;
        mo46934i(mo46811e((Context) null));
    }
}

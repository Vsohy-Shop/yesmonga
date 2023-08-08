package androidx.compose.p004ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.annotation.C0376v0;
import androidx.compose.p004ui.text.font.C16201h0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C0376v0(26)
/* renamed from: androidx.compose.ui.text.font.b */
public final class C16178b extends C16208i {
    @C12579k

    /* renamed from: k */
    public final ParcelFileDescriptor f40239k;
    @C12580l

    /* renamed from: l */
    public final String f40240l;

    public /* synthetic */ C16178b(ParcelFileDescriptor parcelFileDescriptor, C16209i0 i0Var, int i, C16201h0.C16206e eVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcelFileDescriptor, i0Var, i, eVar);
    }

    @C12580l
    /* renamed from: e */
    public Typeface mo46811e(@C12580l Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C16199g1.f40263a.mo46901c(this.f40239k, context, mo46870d());
        }
        throw new IllegalArgumentException("Cannot create font from file descriptor for SDK < 26");
    }

    @C12580l
    /* renamed from: f */
    public String mo46813f() {
        return this.f40240l;
    }

    @C12579k
    /* renamed from: j */
    public final ParcelFileDescriptor mo46856j() {
        return this.f40239k;
    }

    @C12579k
    public String toString() {
        return "Font(fileDescriptor=" + this.f40239k + ", weight=" + getWeight() + ", style=" + C16190e0.m72953i(mo46930b()) + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16178b(ParcelFileDescriptor parcelFileDescriptor, C16209i0 i0Var, int i, C16201h0.C16206e eVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcelFileDescriptor, (i2 & 2) != 0 ? C16209i0.f40292b.mo46952m() : i0Var, (i2 & 4) != 0 ? C16190e0.f40252b.mo46883b() : i, eVar, (DefaultConstructorMarker) null);
    }

    public C16178b(ParcelFileDescriptor parcelFileDescriptor, C16209i0 i0Var, int i, C16201h0.C16206e eVar) {
        super(i0Var, i, eVar, (DefaultConstructorMarker) null);
        this.f40239k = parcelFileDescriptor;
        mo46934i(mo46811e((Context) null));
    }
}

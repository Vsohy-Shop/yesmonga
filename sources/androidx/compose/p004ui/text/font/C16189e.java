package androidx.compose.p004ui.text.font;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import androidx.annotation.C0376v0;
import androidx.compose.p004ui.text.font.C16201h0;
import androidx.compose.runtime.C8547h2;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.text.font.e */
public final class C16189e {
    @C8547h2
    @C0376v0(26)
    @C12579k
    /* renamed from: a */
    public static final C16238t m72939a(@C12579k ParcelFileDescriptor parcelFileDescriptor, @C12579k C16209i0 i0Var, int i, @C12579k C16201h0.C16206e eVar) {
        Intrinsics.checkNotNullParameter(parcelFileDescriptor, "fileDescriptor");
        Intrinsics.checkNotNullParameter(i0Var, "weight");
        Intrinsics.checkNotNullParameter(eVar, "variationSettings");
        return new C16178b(parcelFileDescriptor, i0Var, i, eVar, (DefaultConstructorMarker) null);
    }

    @C8547h2
    @C12579k
    /* renamed from: b */
    public static final C16238t m72940b(@C12579k File file, @C12579k C16209i0 i0Var, int i, @C12579k C16201h0.C16206e eVar) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(i0Var, "weight");
        Intrinsics.checkNotNullParameter(eVar, "variationSettings");
        return new C16181c(file, i0Var, i, eVar, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public static /* synthetic */ C16238t m72941c(ParcelFileDescriptor parcelFileDescriptor, C16209i0 i0Var, int i, C16201h0.C16206e eVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i0Var = C16209i0.f40292b.mo46952m();
        }
        if ((i2 & 4) != 0) {
            i = C16190e0.f40252b.mo46883b();
        }
        if ((i2 & 8) != 0) {
            eVar = C16201h0.f40264a.mo46904b(i0Var, i, new C16201h0.C16202a[0]);
        }
        return m72939a(parcelFileDescriptor, i0Var, i, eVar);
    }

    /* renamed from: d */
    public static /* synthetic */ C16238t m72942d(File file, C16209i0 i0Var, int i, C16201h0.C16206e eVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i0Var = C16209i0.f40292b.mo46952m();
        }
        if ((i2 & 4) != 0) {
            i = C16190e0.f40252b.mo46883b();
        }
        if ((i2 & 8) != 0) {
            eVar = C16201h0.f40264a.mo46904b(i0Var, i, new C16201h0.C16202a[0]);
        }
        return m72940b(file, i0Var, i, eVar);
    }

    @C8547h2
    @C12579k
    /* renamed from: e */
    public static final C16238t m72943e(@C12579k String str, @C12579k AssetManager assetManager, @C12579k C16209i0 i0Var, int i, @C12579k C16201h0.C16206e eVar) {
        Intrinsics.checkNotNullParameter(str, "path");
        Intrinsics.checkNotNullParameter(assetManager, "assetManager");
        Intrinsics.checkNotNullParameter(i0Var, "weight");
        Intrinsics.checkNotNullParameter(eVar, "variationSettings");
        return new C16175a(assetManager, str, i0Var, i, eVar, (DefaultConstructorMarker) null);
    }

    /* renamed from: f */
    public static /* synthetic */ C16238t m72944f(String str, AssetManager assetManager, C16209i0 i0Var, int i, C16201h0.C16206e eVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i0Var = C16209i0.f40292b.mo46952m();
        }
        if ((i2 & 8) != 0) {
            i = C16190e0.f40252b.mo46883b();
        }
        if ((i2 & 16) != 0) {
            eVar = C16201h0.f40264a.mo46904b(i0Var, i, new C16201h0.C16202a[0]);
        }
        return m72943e(str, assetManager, i0Var, i, eVar);
    }

    /* renamed from: g */
    public static final void m72945g() {
    }
}

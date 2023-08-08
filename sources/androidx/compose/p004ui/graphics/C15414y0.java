package androidx.compose.p004ui.graphics;

import android.graphics.Shader;
import android.os.Build;
import androidx.compose.p004ui.graphics.C15268m4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.graphics.y0 */
public final class C15414y0 {

    /* renamed from: androidx.compose.ui.graphics.y0$a */
    public /* synthetic */ class C15415a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                android.graphics.Shader$TileMode[] r0 = android.graphics.Shader.TileMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.CLAMP     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.MIRROR     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.REPEAT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.graphics.C15414y0.C15415a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static final boolean m67299a(int i) {
        return Build.VERSION.SDK_INT >= 31 || !C15268m4.m66277h(i, C15268m4.f37596b.mo42909b());
    }

    @C12579k
    /* renamed from: b */
    public static final Shader.TileMode m67300b(int i) {
        C15268m4.C15269a aVar = C15268m4.f37596b;
        if (C15268m4.m66277h(i, aVar.mo42908a())) {
            return Shader.TileMode.CLAMP;
        }
        if (C15268m4.m66277h(i, aVar.mo42911d())) {
            return Shader.TileMode.REPEAT;
        }
        if (C15268m4.m66277h(i, aVar.mo42910c())) {
            return Shader.TileMode.MIRROR;
        }
        if (!C15268m4.m66277h(i, aVar.mo42909b())) {
            return Shader.TileMode.CLAMP;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return C15277n4.f37607a.mo42920b();
        }
        return Shader.TileMode.CLAMP;
    }

    /* renamed from: c */
    public static final int m67301c(@C12579k Shader.TileMode tileMode) {
        Intrinsics.checkNotNullParameter(tileMode, "<this>");
        int i = C15415a.$EnumSwitchMapping$0[tileMode.ordinal()];
        if (i == 1) {
            return C15268m4.f37596b.mo42908a();
        }
        if (i == 2) {
            return C15268m4.f37596b.mo42910c();
        }
        if (i == 3) {
            return C15268m4.f37596b.mo42911d();
        }
        if (Build.VERSION.SDK_INT < 31 || tileMode != Shader.TileMode.DECAL) {
            return C15268m4.f37596b.mo42908a();
        }
        return C15277n4.f37607a.mo42919a();
    }
}

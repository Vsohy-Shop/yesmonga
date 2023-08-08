package androidx.compose.p004ui.graphics;

import androidx.compose.p004ui.graphics.colorspace.C15138c;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.graphics.w2 */
public interface C15403w2 {
    @C12579k

    /* renamed from: a */
    public static final C15404a f38094a = C15404a.f38095a;

    /* renamed from: androidx.compose.ui.graphics.w2$a */
    public static final class C15404a {

        /* renamed from: a */
        public static final /* synthetic */ C15404a f38095a = new C15404a();
    }

    /* renamed from: androidx.compose.ui.graphics.w2$b */
    public static final class C15405b {
    }

    /* renamed from: a */
    static /* synthetic */ void m67268a(C15403w2 w2Var, int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, Object obj) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        if (obj == null) {
            int i13 = 0;
            if ((i7 & 2) != 0) {
                i8 = 0;
            } else {
                i8 = i;
            }
            if ((i7 & 4) != 0) {
                i9 = 0;
            } else {
                i9 = i2;
            }
            if ((i7 & 8) != 0) {
                i10 = w2Var.getWidth();
            } else {
                i10 = i3;
            }
            if ((i7 & 16) != 0) {
                i11 = w2Var.getHeight();
            } else {
                i11 = i4;
            }
            if ((i7 & 32) == 0) {
                i13 = i5;
            }
            if ((i7 & 64) != 0) {
                i12 = i10;
            } else {
                i12 = i6;
            }
            w2Var.mo42785b(iArr, i8, i9, i10, i11, i13, i12);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readPixels");
    }

    /* renamed from: b */
    void mo42785b(@C12579k int[] iArr, int i, int i2, int i3, int i4, int i5, int i6);

    /* renamed from: c */
    void mo42786c();

    /* renamed from: d */
    boolean mo42787d();

    @C12579k
    /* renamed from: e */
    C15138c mo42788e();

    /* renamed from: f */
    int mo42789f();

    int getHeight();

    int getWidth();
}

package androidx.compose.p004ui.autofill;

import android.view.ViewStructure;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import com.usabilla.sdk.ubform.net.parser.C9874a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C0376v0(23)
/* renamed from: androidx.compose.ui.autofill.j */
public final class C8714j {
    @C12579k

    /* renamed from: a */
    public static final C8714j f23394a = new C8714j();

    @C0376v0(23)
    @C0373u
    /* renamed from: a */
    public final int mo17031a(@C12579k ViewStructure viewStructure, int i) {
        Intrinsics.checkNotNullParameter(viewStructure, C9874a.f27053J);
        return viewStructure.addChildCount(i);
    }

    @C12580l
    @C0376v0(23)
    @C0373u
    /* renamed from: b */
    public final ViewStructure mo17032b(@C12579k ViewStructure viewStructure, int i) {
        Intrinsics.checkNotNullParameter(viewStructure, C9874a.f27053J);
        return viewStructure.newChild(i);
    }

    @C0376v0(23)
    @C0373u
    /* renamed from: c */
    public final void mo17033c(@C12579k ViewStructure viewStructure, int i, int i2, int i3, int i4, int i5, int i6) {
        Intrinsics.checkNotNullParameter(viewStructure, C9874a.f27053J);
        viewStructure.setDimens(i, i2, i3, i4, i5, i6);
    }

    @C0376v0(23)
    @C0373u
    /* renamed from: d */
    public final void mo17034d(@C12579k ViewStructure viewStructure, int i, @C12580l String str, @C12580l String str2, @C12580l String str3) {
        Intrinsics.checkNotNullParameter(viewStructure, C9874a.f27053J);
        viewStructure.setId(i, str, str2, str3);
    }
}

package androidx.compose.p004ui.platform;

import android.view.View;
import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.p004ui.semantics.C16040m;
import androidx.core.view.C18019a;
import androidx.core.view.accessibility.C18065l0;
import com.carrefour.fid.android.shared.constant.C28531e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1 */
public final class AndroidComposeView$addAndroidView$1 extends C18019a {

    /* renamed from: d */
    public final /* synthetic */ LayoutNode f39186d;

    /* renamed from: e */
    public final /* synthetic */ AndroidComposeView f39187e;

    /* renamed from: f */
    public final /* synthetic */ AndroidComposeView f39188f;

    public AndroidComposeView$addAndroidView$1(LayoutNode layoutNode, AndroidComposeView androidComposeView, AndroidComposeView androidComposeView2) {
        this.f39186d = layoutNode;
        this.f39187e = androidComposeView;
        this.f39188f = androidComposeView2;
    }

    /* renamed from: g */
    public void mo19938g(@C12579k View view, @C12579k C18065l0 l0Var) {
        Integer num;
        Intrinsics.checkNotNullParameter(view, "host");
        Intrinsics.checkNotNullParameter(l0Var, C28531e0.f69094x);
        super.mo19938g(view, l0Var);
        LayoutNode e = C16040m.m72163e(this.f39186d, C15756x60998eaf.f39189f);
        if (e != null) {
            num = Integer.valueOf(e.mo44457q());
        } else {
            num = null;
        }
        if (num == null || num.intValue() == this.f39187e.getSemanticsOwner().mo46174b().mo46024l()) {
            num = -1;
        }
        l0Var.mo52531D1(this.f39188f, num.intValue());
    }
}

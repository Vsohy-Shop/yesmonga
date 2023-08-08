package androidx.compose.p004ui.platform;

import android.view.ActionMode;
import android.view.View;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.platform.actionmodecallback.C15848a;
import androidx.compose.p004ui.platform.actionmodecallback.C15850c;
import com.google.android.gms.analytics.ecommerce.C40383c;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.platform.AndroidTextToolbar */
public final class AndroidTextToolbar implements C15996x3 {
    @C12579k

    /* renamed from: a */
    public final View f39286a;
    @C12580l

    /* renamed from: b */
    public ActionMode f39287b;
    @C12579k

    /* renamed from: c */
    public final C15850c f39288c = new C15850c(new AndroidTextToolbar$textActionModeCallback$1(this), (C15098i) null, (C11289a) null, (C11289a) null, (C11289a) null, (C11289a) null, 62, (DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: d */
    public TextToolbarStatus f39289d = TextToolbarStatus.Hidden;

    public AndroidTextToolbar(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        this.f39286a = view;
    }

    /* renamed from: a */
    public void mo45484a(@C12579k C15098i iVar, @C12580l C11289a<C11079d2> aVar, @C12580l C11289a<C11079d2> aVar2, @C12580l C11289a<C11079d2> aVar3, @C12580l C11289a<C11079d2> aVar4) {
        Intrinsics.checkNotNullParameter(iVar, "rect");
        this.f39288c.mo45675q(iVar);
        this.f39288c.mo45671m(aVar);
        this.f39288c.mo45672n(aVar3);
        this.f39288c.mo45673o(aVar2);
        this.f39288c.mo45674p(aVar4);
        ActionMode actionMode = this.f39287b;
        if (actionMode == null) {
            this.f39289d = TextToolbarStatus.Shown;
            this.f39287b = C16002y3.f39689a.mo45982b(this.f39286a, new C15848a(this.f39288c), 1);
        } else if (actionMode != null) {
            actionMode.invalidate();
        }
    }

    /* renamed from: c */
    public void mo45485c() {
        this.f39289d = TextToolbarStatus.Hidden;
        ActionMode actionMode = this.f39287b;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.f39287b = null;
    }

    @C12579k
    public TextToolbarStatus getStatus() {
        return this.f39289d;
    }
}

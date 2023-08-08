package androidx.compose.p004ui.hapticfeedback;

import android.view.View;
import androidx.compose.p004ui.hapticfeedback.C15426b;
import com.google.android.gms.analytics.ecommerce.C40383c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.hapticfeedback.c */
public final class C15428c implements C15425a {
    @C12579k

    /* renamed from: a */
    public final View f38117a;

    public C15428c(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        this.f38117a = view;
    }

    /* renamed from: a */
    public void mo43597a(int i) {
        C15426b.C15427a aVar = C15426b.f38115b;
        if (C15426b.m67339d(i, aVar.mo43602a())) {
            this.f38117a.performHapticFeedback(0);
        } else if (C15426b.m67339d(i, aVar.mo43603b())) {
            this.f38117a.performHapticFeedback(9);
        }
    }
}

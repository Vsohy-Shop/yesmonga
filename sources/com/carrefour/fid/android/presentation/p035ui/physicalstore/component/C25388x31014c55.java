package com.carrefour.fid.android.presentation.p035ui.physicalstore.component;

import android.content.Context;
import android.view.ContextThemeWrapper;
import androidx.appcompat.widget.AppCompatRatingBar;
import com.carrefour.fid.android.R;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreRatingComponentKt$PhysicalStoreNoRatingComponent$2$1 */
public final class C25388x31014c55 extends Lambda implements C11300l<Context, AppCompatRatingBar> {

    /* renamed from: f */
    public static final C25388x31014c55 f62524f = new C25388x31014c55();

    public C25388x31014c55() {
        super(1);
    }

    @C12579k
    /* renamed from: a */
    public final AppCompatRatingBar invoke(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        AppCompatRatingBar appCompatRatingBar = new AppCompatRatingBar(new ContextThemeWrapper(context, R.style.RatingBarStore));
        appCompatRatingBar.setRating(0.0f);
        appCompatRatingBar.setNumStars(5);
        appCompatRatingBar.setStepSize(0.1f);
        return appCompatRatingBar;
    }
}

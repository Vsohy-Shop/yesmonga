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
/* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreRatingComponentKt$PhysicalStoreRatingComponent$2$1$1$1 */
public final class C25391x73accd70 extends Lambda implements C11300l<Context, AppCompatRatingBar> {
    final /* synthetic */ double $score;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25391x73accd70(double d) {
        super(1);
        this.$score = d;
    }

    @C12579k
    /* renamed from: a */
    public final AppCompatRatingBar invoke(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        AppCompatRatingBar appCompatRatingBar = new AppCompatRatingBar(new ContextThemeWrapper(context, R.style.RatingBarStore));
        appCompatRatingBar.setRating((float) this.$score);
        appCompatRatingBar.setScaleX(0.8f);
        appCompatRatingBar.setScaleY(0.8f);
        appCompatRatingBar.setNumStars(5);
        appCompatRatingBar.setStepSize(0.1f);
        return appCompatRatingBar;
    }
}
